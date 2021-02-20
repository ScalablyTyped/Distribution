package typings.cssMediaquery

import typings.cssMediaquery.anon.PartialMediaValues
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("css-mediaquery", "parse")
  @js.native
  def parse(query: String): AST = js.native
  
  type AST = js.Array[QueryNode]
  
  @js.native
  trait Expression extends StObject {
    
    var feature: String = js.native
    
    var modifier: String = js.native
    
    var value: String = js.native
  }
  object Expression {
    
    @scala.inline
    def apply(feature: String, modifier: String, value: String): Expression = {
      val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], modifier = modifier.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Expression]
    }
    
    @scala.inline
    implicit class ExpressionMutableBuilder[Self <: Expression] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFeature(value: String): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifier(value: String): Self = StObject.set(x, "modifier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Record<'orientation' | 'scan' | 'width' | 'height' | 'device-width' | 'device-height' | 'resolution' | 'aspect-ratio' | 'device-aspect-ratio' | 'grid' | 'color' | 'color-index' | 'monochrome', unknown> */
  @js.native
  trait MediaValues extends StObject {
    
    var `aspect-ratio`: js.Any = js.native
    
    var color: js.Any = js.native
    
    var `color-index`: js.Any = js.native
    
    var `device-aspect-ratio`: js.Any = js.native
    
    var `device-height`: js.Any = js.native
    
    var `device-width`: js.Any = js.native
    
    var grid: js.Any = js.native
    
    var height: js.Any = js.native
    
    var monochrome: js.Any = js.native
    
    var orientation: js.Any = js.native
    
    var resolution: js.Any = js.native
    
    var scan: js.Any = js.native
    
    var width: js.Any = js.native
  }
  object MediaValues {
    
    @scala.inline
    def apply(
      `aspect-ratio`: js.Any,
      color: js.Any,
      `color-index`: js.Any,
      `device-aspect-ratio`: js.Any,
      `device-height`: js.Any,
      `device-width`: js.Any,
      grid: js.Any,
      height: js.Any,
      monochrome: js.Any,
      orientation: js.Any,
      resolution: js.Any,
      scan: js.Any,
      width: js.Any
    ): MediaValues = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], monochrome = monochrome.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], scan = scan.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("aspect-ratio")(`aspect-ratio`.asInstanceOf[js.Any])
      __obj.updateDynamic("color-index")(`color-index`.asInstanceOf[js.Any])
      __obj.updateDynamic("device-aspect-ratio")(`device-aspect-ratio`.asInstanceOf[js.Any])
      __obj.updateDynamic("device-height")(`device-height`.asInstanceOf[js.Any])
      __obj.updateDynamic("device-width")(`device-width`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MediaValues]
    }
    
    @scala.inline
    implicit class MediaValuesMutableBuilder[Self <: MediaValues] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setAspect-ratio`(value: js.Any): Self = StObject.set(x, "aspect-ratio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor(value: js.Any): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setColor-index`(value: js.Any): Self = StObject.set(x, "color-index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setDevice-aspect-ratio`(value: js.Any): Self = StObject.set(x, "device-aspect-ratio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setDevice-height`(value: js.Any): Self = StObject.set(x, "device-height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setDevice-width`(value: js.Any): Self = StObject.set(x, "device-width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrid(value: js.Any): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: js.Any): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMonochrome(value: js.Any): Self = StObject.set(x, "monochrome", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientation(value: js.Any): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolution(value: js.Any): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScan(value: js.Any): Self = StObject.set(x, "scan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: js.Any): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait QueryNode extends StObject {
    
    var expressions: js.Array[Expression] = js.native
    
    var inverse: Boolean = js.native
    
    var `type`: String = js.native
  }
  object QueryNode {
    
    @scala.inline
    def apply(expressions: js.Array[Expression], inverse: Boolean, `type`: String): QueryNode = {
      val __obj = js.Dynamic.literal(expressions = expressions.asInstanceOf[js.Any], inverse = inverse.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryNode]
    }
    
    @scala.inline
    implicit class QueryNodeMutableBuilder[Self <: QueryNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpressions(value: js.Array[Expression]): Self = StObject.set(x, "expressions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpressionsVarargs(value: Expression*): Self = StObject.set(x, "expressions", js.Array(value :_*))
      
      @scala.inline
      def setInverse(value: Boolean): Self = StObject.set(x, "inverse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("css-mediaquery", "match")
  @js.native
  def `match`(query: String, values: PartialMediaValues): Boolean = js.native
}
