package typings.cliBoxes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
Boxes for use in the terminal.
@example
```
import cliBoxes = require('cli-boxes');
console.log(cliBoxes.single);
// {
// 	topLeft: '┌',
// 	top: '─',
// 	topRight: '┐',
// 	right: '│',
// 	bottomRight: '┘',
// 	bottom: '─',
// 	bottomLeft: '└',
// 	left: '│'
// }
```
*/
/* Inlined cli-boxes.cli-boxes.Boxes & {  default :/ * import warning: ResolveTypeQueries.resolve Couldn't resolve typeof cliBoxes * / any} */
object mod {
  
  @JSImport("cli-boxes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: Remove this for the next major release
  @JSImport("cli-boxes", "default")
  @js.native
  def default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof cliBoxes */ Any = js.native
  
  /**
  		@example
  		```
  		↘↓↓↓↓↙
  		→    ←
  		↗↑↑↑↑↖
  		```
  		*/
  @JSImport("cli-boxes", "arrow")
  @js.native
  val arrow: BoxStyle = js.native
  
  /**
  		@example
  		```
  		┏━━━━┓
  		┃    ┃
  		┗━━━━┛
  		```
  		*/
  @JSImport("cli-boxes", "bold")
  @js.native
  val bold: BoxStyle = js.native
  
  /**
  		@example
  		```
  		+----+
  		|    |
  		+----+
  		```
  		*/
  @JSImport("cli-boxes", "classic")
  @js.native
  val classic: BoxStyle = js.native
  
  inline def default_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof cliBoxes */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  /**
  		@example
  		```
  		╔════╗
  		║    ║
  		╚════╝
  		```
  		*/
  @JSImport("cli-boxes", "double")
  @js.native
  val double: BoxStyle = js.native
  
  /**
  		@example
  		```
  		╒════╕
  		│    │
  		╘════╛
  		```
  		*/
  @JSImport("cli-boxes", "doubleSingle")
  @js.native
  val doubleSingle: BoxStyle = js.native
  
  /**
  		@example
  		```
  		╭────╮
  		│    │
  		╰────╯
  		```
  		*/
  @JSImport("cli-boxes", "round")
  @js.native
  val round: BoxStyle = js.native
  
  /**
  		@example
  		```
  		┌────┐
  		│    │
  		└────┘
  		```
  		*/
  @JSImport("cli-boxes", "single")
  @js.native
  val single: BoxStyle = js.native
  
  /**
  		@example
  		```
  		╓────╖
  		║    ║
  		╙────╜
  		```
  		*/
  @JSImport("cli-boxes", "singleDouble")
  @js.native
  val singleDouble: BoxStyle = js.native
  
  /**
  	Style of the box border.
  	*/
  trait BoxStyle extends StObject {
    
    val bottom: String
    
    val bottomLeft: String
    
    val bottomRight: String
    
    val left: String
    
    val right: String
    
    val top: String
    
    val topLeft: String
    
    val topRight: String
  }
  object BoxStyle {
    
    inline def apply(
      bottom: String,
      bottomLeft: String,
      bottomRight: String,
      left: String,
      right: String,
      top: String,
      topLeft: String,
      topRight: String
    ): BoxStyle = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], bottomLeft = bottomLeft.asInstanceOf[js.Any], bottomRight = bottomRight.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], topLeft = topLeft.asInstanceOf[js.Any], topRight = topRight.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoxStyle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BoxStyle] (val x: Self) extends AnyVal {
      
      inline def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setBottomLeft(value: String): Self = StObject.set(x, "bottomLeft", value.asInstanceOf[js.Any])
      
      inline def setBottomRight(value: String): Self = StObject.set(x, "bottomRight", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopLeft(value: String): Self = StObject.set(x, "topLeft", value.asInstanceOf[js.Any])
      
      inline def setTopRight(value: String): Self = StObject.set(x, "topRight", value.asInstanceOf[js.Any])
    }
  }
  
  /**
  	All box styles.
  	*/
  trait Boxes extends StObject {
    
    /**
    		@example
    		```
    		↘↓↓↓↓↙
    		→    ←
    		↗↑↑↑↑↖
    		```
    		*/
    val arrow: BoxStyle
    
    /**
    		@example
    		```
    		┏━━━━┓
    		┃    ┃
    		┗━━━━┛
    		```
    		*/
    val bold: BoxStyle
    
    /**
    		@example
    		```
    		+----+
    		|    |
    		+----+
    		```
    		*/
    val classic: BoxStyle
    
    /**
    		@example
    		```
    		╔════╗
    		║    ║
    		╚════╝
    		```
    		*/
    val double: BoxStyle
    
    /**
    		@example
    		```
    		╒════╕
    		│    │
    		╘════╛
    		```
    		*/
    val doubleSingle: BoxStyle
    
    /**
    		@example
    		```
    		╭────╮
    		│    │
    		╰────╯
    		```
    		*/
    val round: BoxStyle
    
    /**
    		@example
    		```
    		┌────┐
    		│    │
    		└────┘
    		```
    		*/
    val single: BoxStyle
    
    /**
    		@example
    		```
    		╓────╖
    		║    ║
    		╙────╜
    		```
    		*/
    val singleDouble: BoxStyle
  }
  object Boxes {
    
    inline def apply(
      arrow: BoxStyle,
      bold: BoxStyle,
      classic: BoxStyle,
      double: BoxStyle,
      doubleSingle: BoxStyle,
      round: BoxStyle,
      single: BoxStyle,
      singleDouble: BoxStyle
    ): Boxes = {
      val __obj = js.Dynamic.literal(arrow = arrow.asInstanceOf[js.Any], bold = bold.asInstanceOf[js.Any], classic = classic.asInstanceOf[js.Any], double = double.asInstanceOf[js.Any], doubleSingle = doubleSingle.asInstanceOf[js.Any], round = round.asInstanceOf[js.Any], single = single.asInstanceOf[js.Any], singleDouble = singleDouble.asInstanceOf[js.Any])
      __obj.asInstanceOf[Boxes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Boxes] (val x: Self) extends AnyVal {
      
      inline def setArrow(value: BoxStyle): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
      
      inline def setBold(value: BoxStyle): Self = StObject.set(x, "bold", value.asInstanceOf[js.Any])
      
      inline def setClassic(value: BoxStyle): Self = StObject.set(x, "classic", value.asInstanceOf[js.Any])
      
      inline def setDouble(value: BoxStyle): Self = StObject.set(x, "double", value.asInstanceOf[js.Any])
      
      inline def setDoubleSingle(value: BoxStyle): Self = StObject.set(x, "doubleSingle", value.asInstanceOf[js.Any])
      
      inline def setRound(value: BoxStyle): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      inline def setSingle(value: BoxStyle): Self = StObject.set(x, "single", value.asInstanceOf[js.Any])
      
      inline def setSingleDouble(value: BoxStyle): Self = StObject.set(x, "singleDouble", value.asInstanceOf[js.Any])
    }
  }
}
