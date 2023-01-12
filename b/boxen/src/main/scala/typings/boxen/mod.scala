package typings.boxen

import typings.boxen.boxenStrings.arrow
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
import typings.typeFest.sourceLiteralUnionMod.LiteralUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("boxen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(text: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(text.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(text: String, options: Options): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait CustomBorderStyle
    extends StObject
       with BoxStyle {
    
    /**
    	@deprecated Use `top` and `bottom` instead.
    	*/
    var horizontal: js.UndefOr[String] = js.undefined
    
    /**
    	@deprecated Use `left` and `right` instead.
    	*/
    var vertical: js.UndefOr[String] = js.undefined
  }
  object CustomBorderStyle {
    
    inline def apply(
      bottom: String,
      bottomLeft: String,
      bottomRight: String,
      left: String,
      right: String,
      top: String,
      topLeft: String,
      topRight: String
    ): CustomBorderStyle = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], bottomLeft = bottomLeft.asInstanceOf[js.Any], bottomRight = bottomRight.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], topLeft = topLeft.asInstanceOf[js.Any], topRight = topRight.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomBorderStyle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomBorderStyle] (val x: Self) extends AnyVal {
      
      inline def setHorizontal(value: String): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setVertical(value: String): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    /**
    	Align the text in the box based on the widest line.
    	@default 'left'
    	@deprecated Use `textAlignment` instead.
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
    	@default 'single'
    	*/
    val borderStyle: js.UndefOr[
        single | double | round | bold | singleDouble | doubleSingle | classic | arrow | CustomBorderStyle
      ] = js.undefined
    
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
    	__boolean__: Wether or not to fit all available space within the terminal.
    	__function__: Pass a callback function to control box dimensions.
    	@example
    	```
    	import boxen from 'boxen';
    	console.log(boxen('foo bar', {
    		fullscreen: (width, height) => [width, height - 1];
    	}));
    	```
    	*/
    val fullscreen: js.UndefOr[
        Boolean | (js.Function2[
          /* width */ Double, 
          /* height */ Double, 
          js.Tuple2[/* width */ Double, /* height */ Double]
        ])
      ] = js.undefined
    
    /**
    	Set a fixed height for the box.
    	__Note__: This option will crop overflowing content.
    	@example
    	```
    	import boxen from 'boxen';
    	console.log(boxen('foo bar', {height: 5}));
    	// ┌───────┐
    	// │foo bar│
    	// │       │
    	// │       │
    	// └───────┘
    	```
    	*/
    val height: js.UndefOr[Double] = js.undefined
    
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
    
    /**
    	Align the text in the box based on the widest line.
    	@default 'left'
    	*/
    val textAlignment: js.UndefOr[left | right | center] = js.undefined
    
    /**
    	Display a title at the top of the box.
    	If needed, the box will horizontally expand to fit the title.
    	@example
    	```
    	console.log(boxen('foo bar', {title: 'example'}));
    	// ┌ example ┐
    	// │foo bar  │
    	// └─────────┘
    	```
    	*/
    val title: js.UndefOr[String] = js.undefined
    
    /**
    	Align the title in the top bar.
    	@default 'left'
    	@example
    	```
    	console.log(boxen('foo bar foo bar', {title: 'example', titleAlignment: 'center'}));
    	// ┌─── example ───┐
    	// │foo bar foo bar│
    	// └───────────────┘
    	console.log(boxen('foo bar foo bar', {title: 'example', titleAlignment: 'right'}));
    	// ┌────── example ┐
    	// │foo bar foo bar│
    	// └───────────────┘
    	```
    	*/
    val titleAlignment: js.UndefOr[left | right | center] = js.undefined
    
    /**
    	Set a fixed width for the box.
    	__Note__: This disables terminal overflow handling and may cause the box to look broken if the user's terminal is not wide enough.
    	@example
    	```
    	import boxen from 'boxen';
    	console.log(boxen('foo bar', {width: 15}));
    	// ┌─────────────┐
    	// │foo bar      │
    	// └─────────────┘
    	```
    	*/
    val width: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
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
      
      inline def setBorderStyle(
        value: single | double | round | bold | singleDouble | doubleSingle | classic | arrow | CustomBorderStyle
      ): Self = StObject.set(x, "borderStyle", value.asInstanceOf[js.Any])
      
      inline def setBorderStyleUndefined: Self = StObject.set(x, "borderStyle", js.undefined)
      
      inline def setDimBorder(value: Boolean): Self = StObject.set(x, "dimBorder", value.asInstanceOf[js.Any])
      
      inline def setDimBorderUndefined: Self = StObject.set(x, "dimBorder", js.undefined)
      
      inline def setFloat(value: left | right | center): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
      
      inline def setFloatUndefined: Self = StObject.set(x, "float", js.undefined)
      
      inline def setFullscreen(
        value: Boolean | (js.Function2[
              /* width */ Double, 
              /* height */ Double, 
              js.Tuple2[/* width */ Double, /* height */ Double]
            ])
      ): Self = StObject.set(x, "fullscreen", value.asInstanceOf[js.Any])
      
      inline def setFullscreenFunction2(
        value: (/* width */ Double, /* height */ Double) => js.Tuple2[/* width */ Double, /* height */ Double]
      ): Self = StObject.set(x, "fullscreen", js.Any.fromFunction2(value))
      
      inline def setFullscreenUndefined: Self = StObject.set(x, "fullscreen", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setMargin(value: Double | Spacing): Self = StObject.set(x, "margin", value.asInstanceOf[js.Any])
      
      inline def setMarginUndefined: Self = StObject.set(x, "margin", js.undefined)
      
      inline def setPadding(value: Double | Spacing): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setTextAlignment(value: left | right | center): Self = StObject.set(x, "textAlignment", value.asInstanceOf[js.Any])
      
      inline def setTextAlignmentUndefined: Self = StObject.set(x, "textAlignment", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleAlignment(value: left | right | center): Self = StObject.set(x, "titleAlignment", value.asInstanceOf[js.Any])
      
      inline def setTitleAlignmentUndefined: Self = StObject.set(x, "titleAlignment", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Spacing] (val x: Self) extends AnyVal {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
}
