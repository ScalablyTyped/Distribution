package typings.bizcharts

import typings.antvG2.mod.Shape
import typings.antvG2.mod.Styles.background
import typings.antvG2.mod.Styles.line
import typings.antvG2.mod.Styles.text
import typings.bizcharts.mod.CrosshairsType
import typings.bizcharts.mod.GeomAdjustType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AutoRotate extends StObject {
    
    var autoRotate: js.UndefOr[Boolean] = js.undefined
    
    var content: js.UndefOr[String] = js.undefined
    
    var offsetX: js.UndefOr[Double] = js.undefined
    
    var offsetY: js.UndefOr[Double] = js.undefined
    
    var position: js.UndefOr[String | Double] = js.undefined
    
    var style: js.UndefOr[text] = js.undefined
  }
  object AutoRotate {
    
    inline def apply(): AutoRotate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoRotate]
    }
    
    extension [Self <: AutoRotate](x: Self) {
      
      inline def setAutoRotate(value: Boolean): Self = StObject.set(x, "autoRotate", value.asInstanceOf[js.Any])
      
      inline def setAutoRotateUndefined: Self = StObject.set(x, "autoRotate", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
      
      inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
      
      inline def setPosition(value: String | Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setStyle(value: text): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait Bottom extends StObject {
    
    var bottom: Double
    
    var left: Double
    
    var right: Double
    
    var top: Double
  }
  object Bottom {
    
    inline def apply(bottom: Double, left: Double, right: Double, top: Double): Bottom = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bottom]
    }
    
    extension [Self <: Bottom](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var data: js.Any
    
    var geom: js.Any
    
    var preData: js.Any
    
    var preShape: Shape
    
    var shape: Shape
  }
  object Data {
    
    inline def apply(data: js.Any, geom: js.Any, preData: js.Any, preShape: Shape, shape: Shape): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], geom = geom.asInstanceOf[js.Any], preData = preData.asInstanceOf[js.Any], preShape = preShape.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setGeom(value: js.Any): Self = StObject.set(x, "geom", value.asInstanceOf[js.Any])
      
      inline def setPreData(value: js.Any): Self = StObject.set(x, "preData", value.asInstanceOf[js.Any])
      
      inline def setPreShape(value: Shape): Self = StObject.set(x, "preShape", value.asInstanceOf[js.Any])
      
      inline def setShape(value: Shape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    }
  }
  
  trait DodgeBy extends StObject {
    
    var dodgeBy: js.UndefOr[String] = js.undefined
    
    var marginRatio: js.UndefOr[Double] = js.undefined
    
    var `type`: js.UndefOr[GeomAdjustType] = js.undefined
  }
  object DodgeBy {
    
    inline def apply(): DodgeBy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DodgeBy]
    }
    
    extension [Self <: DodgeBy](x: Self) {
      
      inline def setDodgeBy(value: String): Self = StObject.set(x, "dodgeBy", value.asInstanceOf[js.Any])
      
      inline def setDodgeByUndefined: Self = StObject.set(x, "dodgeBy", js.undefined)
      
      inline def setMarginRatio(value: Double): Self = StObject.set(x, "marginRatio", value.asInstanceOf[js.Any])
      
      inline def setMarginRatioUndefined: Self = StObject.set(x, "marginRatio", js.undefined)
      
      inline def setType(value: GeomAdjustType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Id extends StObject {
    
    var id: Double | String
    
    var name: String
  }
  object Id {
    
    inline def apply(id: Double | String, name: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    extension [Self <: Id](x: Self) {
      
      inline def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Items extends StObject {
    
    var items: js.Any
    
    var tooltip: js.Any
    
    var x: Double
    
    var y: Double
  }
  object Items {
    
    inline def apply(items: js.Any, tooltip: js.Any, x: Double, y: Double): Items = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Items]
    }
    
    extension [Self <: Items](x: Self) {
      
      inline def setItems(value: js.Any): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setTooltip(value: js.Any): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var name: js.UndefOr[String] = js.undefined
    
    var value: String
  }
  object Name {
    
    inline def apply(value: String): Name = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait OffsetX extends StObject {
    
    var offsetX: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[text] = js.undefined
  }
  object OffsetX {
    
    inline def apply(): OffsetX = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OffsetX]
    }
    
    extension [Self <: OffsetX](x: Self) {
      
      inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
      
      inline def setStyle(value: text): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait OffsetY extends StObject {
    
    var offsetY: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[text] = js.undefined
  }
  object OffsetY {
    
    inline def apply(): OffsetY = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OffsetY]
    }
    
    extension [Self <: OffsetY](x: Self) {
      
      inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
      
      inline def setStyle(value: text): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait Style extends StObject {
    
    var style: js.UndefOr[background | line] = js.undefined
    
    var `type`: js.UndefOr[CrosshairsType] = js.undefined
  }
  object Style {
    
    inline def apply(): Style = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Style]
    }
    
    extension [Self <: Style](x: Self) {
      
      inline def setStyle(value: background | line): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setType(value: CrosshairsType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Tooltip extends StObject {
    
    var tooltip: js.Any
    
    var x: Double
    
    var y: Double
  }
  object Tooltip {
    
    inline def apply(tooltip: js.Any, x: Double, y: Double): Tooltip = {
      val __obj = js.Dynamic.literal(tooltip = tooltip.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tooltip]
    }
    
    extension [Self <: Tooltip](x: Self) {
      
      inline def setTooltip(value: js.Any): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait TooltipAny extends StObject {
    
    var tooltip: js.Any
  }
  object TooltipAny {
    
    inline def apply(tooltip: js.Any): TooltipAny = {
      val __obj = js.Dynamic.literal(tooltip = tooltip.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipAny]
    }
    
    extension [Self <: TooltipAny](x: Self) {
      
      inline def setTooltip(value: js.Any): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    }
  }
  
  trait X extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object X {
    
    inline def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    extension [Self <: X](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
