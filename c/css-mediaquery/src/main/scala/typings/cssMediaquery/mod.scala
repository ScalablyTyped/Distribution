package typings.cssMediaquery

import typings.cssMediaquery.anon.PartialMediaValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("css-mediaquery", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def `match`(query: String, values: PartialMediaValues): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(query.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def parse(query: String): AST = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(query.asInstanceOf[js.Any]).asInstanceOf[AST]
  
  type AST = js.Array[QueryNode]
  
  trait Expression extends StObject {
    
    var feature: String
    
    var modifier: String
    
    var value: String
  }
  object Expression {
    
    inline def apply(feature: String, modifier: String, value: String): Expression = {
      val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], modifier = modifier.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Expression]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Expression] (val x: Self) extends AnyVal {
      
      inline def setFeature(value: String): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
      
      inline def setModifier(value: String): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Record<'orientation' | 'scan' | 'width' | 'height' | 'device-width' | 'device-height' | 'resolution' | 'aspect-ratio' | 'device-aspect-ratio' | 'grid' | 'color' | 'color-index' | 'monochrome' | 'prefers-color-scheme', unknown> */
  trait MediaValues extends StObject {
    
    var `aspect-ratio`: Any
    
    var color: Any
    
    var `color-index`: Any
    
    var `device-aspect-ratio`: Any
    
    var `device-height`: Any
    
    var `device-width`: Any
    
    var grid: Any
    
    var height: Any
    
    var monochrome: Any
    
    var orientation: Any
    
    var `prefers-color-scheme`: Any
    
    var resolution: Any
    
    var scan: Any
    
    var width: Any
  }
  object MediaValues {
    
    inline def apply(
      `aspect-ratio`: Any,
      color: Any,
      `color-index`: Any,
      `device-aspect-ratio`: Any,
      `device-height`: Any,
      `device-width`: Any,
      grid: Any,
      height: Any,
      monochrome: Any,
      orientation: Any,
      `prefers-color-scheme`: Any,
      resolution: Any,
      scan: Any,
      width: Any
    ): MediaValues = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], monochrome = monochrome.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], scan = scan.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("aspect-ratio")(`aspect-ratio`.asInstanceOf[js.Any])
      __obj.updateDynamic("color-index")(`color-index`.asInstanceOf[js.Any])
      __obj.updateDynamic("device-aspect-ratio")(`device-aspect-ratio`.asInstanceOf[js.Any])
      __obj.updateDynamic("device-height")(`device-height`.asInstanceOf[js.Any])
      __obj.updateDynamic("device-width")(`device-width`.asInstanceOf[js.Any])
      __obj.updateDynamic("prefers-color-scheme")(`prefers-color-scheme`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaValues]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MediaValues] (val x: Self) extends AnyVal {
      
      inline def `setAspect-ratio`(value: Any): Self = StObject.set(x, "aspect-ratio", value.asInstanceOf[js.Any])
      
      inline def setColor(value: Any): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def `setColor-index`(value: Any): Self = StObject.set(x, "color-index", value.asInstanceOf[js.Any])
      
      inline def `setDevice-aspect-ratio`(value: Any): Self = StObject.set(x, "device-aspect-ratio", value.asInstanceOf[js.Any])
      
      inline def `setDevice-height`(value: Any): Self = StObject.set(x, "device-height", value.asInstanceOf[js.Any])
      
      inline def `setDevice-width`(value: Any): Self = StObject.set(x, "device-width", value.asInstanceOf[js.Any])
      
      inline def setGrid(value: Any): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Any): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setMonochrome(value: Any): Self = StObject.set(x, "monochrome", value.asInstanceOf[js.Any])
      
      inline def setOrientation(value: Any): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def `setPrefers-color-scheme`(value: Any): Self = StObject.set(x, "prefers-color-scheme", value.asInstanceOf[js.Any])
      
      inline def setResolution(value: Any): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      inline def setScan(value: Any): Self = StObject.set(x, "scan", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Any): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait QueryNode extends StObject {
    
    var expressions: js.Array[Expression]
    
    var inverse: Boolean
    
    var `type`: String
  }
  object QueryNode {
    
    inline def apply(expressions: js.Array[Expression], inverse: Boolean, `type`: String): QueryNode = {
      val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], inverse = inverse.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryNode]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QueryNode] (val x: Self) extends AnyVal {
      
      inline def setExpressions(value: js.Array[Expression]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
      
      inline def setExpressionsVarargs(value: Expression*): Self = StObject.set(x, "expressions", js.Array(value*))
      
      inline def setInverse(value: Boolean): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
