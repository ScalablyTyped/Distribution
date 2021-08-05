package typings.boxen

import typings.boxen.boxenStrings.black
import typings.boxen.boxenStrings.blackBright
import typings.boxen.boxenStrings.blue
import typings.boxen.boxenStrings.blueBright
import typings.boxen.boxenStrings.bold
import typings.boxen.boxenStrings.center
import typings.boxen.boxenStrings.classic
import typings.boxen.boxenStrings.cyan
import typings.boxen.boxenStrings.cyanBright
import typings.boxen.boxenStrings.double
import typings.boxen.boxenStrings.doubleSingle
import typings.boxen.boxenStrings.gray
import typings.boxen.boxenStrings.green
import typings.boxen.boxenStrings.greenBright
import typings.boxen.boxenStrings.grey
import typings.boxen.boxenStrings.left
import typings.boxen.boxenStrings.magenta
import typings.boxen.boxenStrings.magentaBright
import typings.boxen.boxenStrings.red
import typings.boxen.boxenStrings.redBright
import typings.boxen.boxenStrings.right
import typings.boxen.boxenStrings.round
import typings.boxen.boxenStrings.single
import typings.boxen.boxenStrings.singleDouble
import typings.boxen.boxenStrings.white
import typings.boxen.boxenStrings.whiteBright
import typings.boxen.boxenStrings.yellow
import typings.boxen.boxenStrings.yellowBright
import typings.cliBoxes.mod.BoxStyle
import typings.typeFest.literalUnionMod.LiteralUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Creates a box in the terminal.
  	@param text - The text inside the box.
  	@returns The box.
  	@example
  	```
  	import boxen = require('boxen');
  	console.log(boxen('unicorn', {padding: 1}));
  	// ┌─────────────┐
  	// │             │
  	// │   unicorn   │
  	// │             │
  	// └─────────────┘
  	console.log(boxen('unicorn', {padding: 1, margin: 1, borderStyle: 'double'}));
  	//
  	// ╔═════════════╗
  	// ║             ║
  	// ║   unicorn   ║
  	// ║             ║
  	// ╚═════════════╝
  	//
  	```
  	*/
  inline def apply(text: String): String = ^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(text: String, options: Options): String = (^.asInstanceOf[js.Dynamic].apply(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("boxen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.boxen.boxenStrings.single
    - typings.boxen.boxenStrings.double
    - typings.boxen.boxenStrings.round
    - typings.boxen.boxenStrings.bold
    - typings.boxen.boxenStrings.singleDouble
    - typings.boxen.boxenStrings.doubleSingle
    - typings.boxen.boxenStrings.classic
  */
  trait BorderStyle extends StObject
  object BorderStyle {
    
    /**
    	Border styles from [`cli-boxes`](https://github.com/sindresorhus/cli-boxes).
    	*/
    @JSImport("boxen", "BorderStyle")
    @js.native
    val ^ : /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof BorderStyle */ js.Any = js.native
    
    inline def Bold: bold = "bold".asInstanceOf[bold]
    
    inline def Classic: classic = "classic".asInstanceOf[classic]
    
    inline def Double: double = "double".asInstanceOf[double]
    
    inline def DoubleSingle: doubleSingle = "doubleSingle".asInstanceOf[doubleSingle]
    
    inline def Round: round = "round".asInstanceOf[round]
    
    inline def Single: single = "single".asInstanceOf[single]
    
    inline def SingleDouble: singleDouble = "singleDouble".asInstanceOf[singleDouble]
  }
  
  /**
  	Characters used for custom border.
  	@example
  	```
  	// affffb
  	// e    e
  	// dffffc
  	const border: CustomBorderStyle = {
  		topLeft: 'a',
  		topRight: 'b',
  		bottomRight: 'c',
  		bottomLeft: 'd',
  		vertical: 'e',
  		horizontal: 'f'
  	};
  	```
  	*/
  type CustomBorderStyle = BoxStyle
  
  trait Options extends StObject {
    
    /**
    		Align the text in the box based on the widest line.
    		@default 'left'
    		*/
    val align: js.UndefOr[left | right | center] = js.undefined
    
    /**
    		Color of the background.
    		*/
    val backgroundColor: js.UndefOr[
        LiteralUnion[
          black | red | green | yellow | blue | magenta | cyan | white | blackBright | redBright | greenBright | yellowBright | blueBright | magentaBright | cyanBright | whiteBright, 
          String
        ]
      ] = js.undefined
    
    /**
    		Color of the box border.
    		*/
    val borderColor: js.UndefOr[
        LiteralUnion[
          black | red | green | yellow | blue | magenta | cyan | white | gray | grey | blackBright | redBright | greenBright | yellowBright | blueBright | magentaBright | cyanBright | whiteBright, 
          String
        ]
      ] = js.undefined
    
    /**
    		Style of the box border.
    		@default BorderStyle.Single
    		*/
    val borderStyle: js.UndefOr[BorderStyle | CustomBorderStyle] = js.undefined
    
    /**
    		Reduce opacity of the border.
    		@default false
    		*/
    val dimBorder: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Float the box on the available terminal screen space.
    		@default 'left'
    		*/
    val float: js.UndefOr[left | right | center] = js.undefined
    
    /**
    		Space around the box.
    		@default 0
    		*/
    val margin: js.UndefOr[Double | Spacing] = js.undefined
    
    /**
    		Space between the text and box border.
    		@default 0
    		*/
    val padding: js.UndefOr[Double | Spacing] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAlign(value: left | right | center): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setBackgroundColor(
        value: LiteralUnion[
              black | red | green | yellow | blue | magenta | cyan | white | blackBright | redBright | greenBright | yellowBright | blueBright | magentaBright | cyanBright | whiteBright, 
              String
            ]
      ): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBorderColor(
        value: LiteralUnion[
              black | red | green | yellow | blue | magenta | cyan | white | gray | grey | blackBright | redBright | greenBright | yellowBright | blueBright | magentaBright | cyanBright | whiteBright, 
              String
            ]
      ): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      inline def setBorderStyle(value: BorderStyle | CustomBorderStyle): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
      
      inline def setDimBorder(value: Boolean): Self = StObject.set(x, "dimBorder", value.asInstanceOf[js.Any])
      
      inline def setDimBorderUndefined: Self = StObject.set(x, "dimBorder", js.undefined)
      
      inline def setFloat(value: left | right | center): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
      
      inline def setFloatUndefined: Self = StObject.set(x, "float", js.undefined)
      
      inline def setMargin(value: Double | Spacing): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setPadding(value: Double | Spacing): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    }
  }
  
  /**
  	Spacing used for `padding` and `margin`.
  	*/
  trait Spacing extends StObject {
    
    val bottom: Double
    
    val left: Double
    
    val right: Double
    
    val top: Double
  }
  object Spacing {
    
    inline def apply(bottom: Double, left: Double, right: Double, top: Double): Spacing = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Spacing]
    }
    
    extension [Self <: Spacing](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
}
