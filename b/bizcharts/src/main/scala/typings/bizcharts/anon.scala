package typings.bizcharts

import typings.antvG2.mod.Shape
import typings.antvG2.mod.Styles.background
import typings.antvG2.mod.Styles.line
import typings.antvG2.mod.Styles.text
import typings.bizcharts.mod.CrosshairsType
import typings.bizcharts.mod.GeomAdjustType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AutoRotate extends StObject {
    
    var autoRotate: js.UndefOr[Boolean] = js.native
    
    var content: js.UndefOr[String] = js.native
    
    var offsetX: js.UndefOr[Double] = js.native
    
    var offsetY: js.UndefOr[Double] = js.native
    
    var position: js.UndefOr[String | Double] = js.native
    
    var style: js.UndefOr[text] = js.native
  }
  object AutoRotate {
    
    @scala.inline
    def apply(): AutoRotate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoRotate]
    }
    
    @scala.inline
    implicit class AutoRotateMutableBuilder[Self <: AutoRotate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoRotate(value: Boolean): Self = StObject.set(x, "autoRotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoRotateUndefined: Self = StObject.set(x, "autoRotate", js.undefined)
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
      
      @scala.inline
      def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
      
      @scala.inline
      def setPosition(value: String | Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setStyle(value: text): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait Bottom extends StObject {
    
    var bottom: Double = js.native
    
    var left: Double = js.native
    
    var right: Double = js.native
    
    var top: Double = js.native
  }
  object Bottom {
    
    @scala.inline
    def apply(bottom: Double, left: Double, right: Double, top: Double): Bottom = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bottom]
    }
    
    @scala.inline
    implicit class BottomMutableBuilder[Self <: Bottom] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Data extends StObject {
    
    var data: js.Any = js.native
    
    var geom: js.Any = js.native
    
    var preData: js.Any = js.native
    
    var preShape: Shape = js.native
    
    var shape: Shape = js.native
  }
  object Data {
    
    @scala.inline
    def apply(data: js.Any, geom: js.Any, preData: js.Any, preShape: Shape, shape: Shape): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], geom = geom.asInstanceOf[js.Any], preData = preData.asInstanceOf[js.Any], preShape = preShape.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGeom(value: js.Any): Self = StObject.set(x, "geom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreData(value: js.Any): Self = StObject.set(x, "preData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreShape(value: Shape): Self = StObject.set(x, "preShape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShape(value: Shape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DodgeBy extends StObject {
    
    var dodgeBy: js.UndefOr[String] = js.native
    
    var marginRatio: js.UndefOr[Double] = js.native
    
    var `type`: js.UndefOr[GeomAdjustType] = js.native
  }
  object DodgeBy {
    
    @scala.inline
    def apply(): DodgeBy = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DodgeBy]
    }
    
    @scala.inline
    implicit class DodgeByMutableBuilder[Self <: DodgeBy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDodgeBy(value: String): Self = StObject.set(x, "dodgeBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDodgeByUndefined: Self = StObject.set(x, "dodgeBy", js.undefined)
      
      @scala.inline
      def setMarginRatio(value: Double): Self = StObject.set(x, "marginRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginRatioUndefined: Self = StObject.set(x, "marginRatio", js.undefined)
      
      @scala.inline
      def setType(value: GeomAdjustType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Id extends StObject {
    
    var id: Double | String = js.native
    
    var name: String = js.native
  }
  object Id {
    
    @scala.inline
    def apply(id: Double | String, name: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit class IdMutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Items extends StObject {
    
    var items: js.Any = js.native
    
    var tooltip: js.Any = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object Items {
    
    @scala.inline
    def apply(items: js.Any, tooltip: js.Any, x: Double, y: Double): Items = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Items]
    }
    
    @scala.inline
    implicit class ItemsMutableBuilder[Self <: Items] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItems(value: js.Any): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltip(value: js.Any): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Name extends StObject {
    
    var name: js.UndefOr[String] = js.native
    
    var value: String = js.native
  }
  object Name {
    
    @scala.inline
    def apply(value: String): Name = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OffsetX extends StObject {
    
    var offsetX: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[text] = js.native
  }
  object OffsetX {
    
    @scala.inline
    def apply(): OffsetX = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OffsetX]
    }
    
    @scala.inline
    implicit class OffsetXMutableBuilder[Self <: OffsetX] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
      
      @scala.inline
      def setStyle(value: text): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait OffsetY extends StObject {
    
    var offsetY: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[text] = js.native
  }
  object OffsetY {
    
    @scala.inline
    def apply(): OffsetY = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OffsetY]
    }
    
    @scala.inline
    implicit class OffsetYMutableBuilder[Self <: OffsetY] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
      
      @scala.inline
      def setStyle(value: text): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait Style extends StObject {
    
    var style: js.UndefOr[background | line] = js.native
    
    var `type`: js.UndefOr[CrosshairsType] = js.native
  }
  object Style {
    
    @scala.inline
    def apply(): Style = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Style]
    }
    
    @scala.inline
    implicit class StyleMutableBuilder[Self <: Style] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyle(value: background | line): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setType(value: CrosshairsType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Tooltip extends StObject {
    
    var tooltip: js.Any = js.native
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object Tooltip {
    
    @scala.inline
    def apply(tooltip: js.Any, x: Double, y: Double): Tooltip = {
      val __obj = js.Dynamic.literal(tooltip = tooltip.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tooltip]
    }
    
    @scala.inline
    implicit class TooltipMutableBuilder[Self <: Tooltip] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTooltip(value: js.Any): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TooltipAny extends StObject {
    
    var tooltip: js.Any = js.native
  }
  object TooltipAny {
    
    @scala.inline
    def apply(tooltip: js.Any): TooltipAny = {
      val __obj = js.Dynamic.literal(tooltip = tooltip.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipAny]
    }
    
    @scala.inline
    implicit class TooltipAnyMutableBuilder[Self <: TooltipAny] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTooltip(value: js.Any): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait X extends StObject {
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object X {
    
    @scala.inline
    def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit class XMutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
