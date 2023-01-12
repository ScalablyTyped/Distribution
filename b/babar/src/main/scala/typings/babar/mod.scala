package typings.babar

import typings.babar.babarStrings.ascii
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(points: js.Array[js.Tuple2[Double, Double]]): String = ^.asInstanceOf[js.Dynamic].apply(points.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(points: js.Array[js.Tuple2[Double, Double]], options: Options): String = (^.asInstanceOf[js.Dynamic].apply(points.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("babar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    var caption: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[typings.babar.mod.color | ascii] = js.undefined
    
    var grid: js.UndefOr[color] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var maxX: js.UndefOr[Double] = js.undefined
    
    var maxY: js.UndefOr[Double] = js.undefined
    
    var minX: js.UndefOr[Double] = js.undefined
    
    var minY: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[Double] = js.undefined
    
    var xFractions: js.UndefOr[Double] = js.undefined
    
    var yFractions: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      inline def setColor(value: color | ascii): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setGrid(value: color): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setMaxX(value: Double): Self = StObject.set(x, "maxX", value.asInstanceOf[js.Any])
      
      inline def setMaxXUndefined: Self = StObject.set(x, "maxX", js.undefined)
      
      inline def setMaxY(value: Double): Self = StObject.set(x, "maxY", value.asInstanceOf[js.Any])
      
      inline def setMaxYUndefined: Self = StObject.set(x, "maxY", js.undefined)
      
      inline def setMinX(value: Double): Self = StObject.set(x, "minX", value.asInstanceOf[js.Any])
      
      inline def setMinXUndefined: Self = StObject.set(x, "minX", js.undefined)
      
      inline def setMinY(value: Double): Self = StObject.set(x, "minY", value.asInstanceOf[js.Any])
      
      inline def setMinYUndefined: Self = StObject.set(x, "minY", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setXFractions(value: Double): Self = StObject.set(x, "xFractions", value.asInstanceOf[js.Any])
      
      inline def setXFractionsUndefined: Self = StObject.set(x, "xFractions", js.undefined)
      
      inline def setYFractions(value: Double): Self = StObject.set(x, "yFractions", value.asInstanceOf[js.Any])
      
      inline def setYFractionsUndefined: Self = StObject.set(x, "yFractions", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.babar.babarStrings.yellow
    - typings.babar.babarStrings.cyan
    - typings.babar.babarStrings.white
    - typings.babar.babarStrings.magenta
    - typings.babar.babarStrings.green
    - typings.babar.babarStrings.red
    - typings.babar.babarStrings.grey
    - typings.babar.babarStrings.blue
  */
  trait color extends StObject
  object color {
    
    inline def blue: typings.babar.babarStrings.blue = "blue".asInstanceOf[typings.babar.babarStrings.blue]
    
    inline def cyan: typings.babar.babarStrings.cyan = "cyan".asInstanceOf[typings.babar.babarStrings.cyan]
    
    inline def green: typings.babar.babarStrings.green = "green".asInstanceOf[typings.babar.babarStrings.green]
    
    inline def grey: typings.babar.babarStrings.grey = "grey".asInstanceOf[typings.babar.babarStrings.grey]
    
    inline def magenta: typings.babar.babarStrings.magenta = "magenta".asInstanceOf[typings.babar.babarStrings.magenta]
    
    inline def red: typings.babar.babarStrings.red = "red".asInstanceOf[typings.babar.babarStrings.red]
    
    inline def white: typings.babar.babarStrings.white = "white".asInstanceOf[typings.babar.babarStrings.white]
    
    inline def yellow: typings.babar.babarStrings.yellow = "yellow".asInstanceOf[typings.babar.babarStrings.yellow]
  }
}
