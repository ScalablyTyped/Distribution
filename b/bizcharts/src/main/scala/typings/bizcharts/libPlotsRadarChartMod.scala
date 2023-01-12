package typings.bizcharts

import org.scalablytyped.runtime.Shortcut
import typings.antvG2plot.libAdaptorGeometriesBaseMod.MappingOptions
import typings.antvG2plot.libTypesAttrMod.ShapeStyle
import typings.bizcharts.libCreatePlotMod.BasePlotOptions
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsRadarChartMod extends Shortcut {
  
  @JSImport("bizcharts/lib/plots/RadarChart", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[RadarOptions & RefAttributes[Any]] = js.native
  
  trait AreaAPIOptions
    extends StObject
       with MappingOptions {
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object AreaAPIOptions {
    
    inline def apply(): AreaAPIOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AreaAPIOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AreaAPIOptions] (val x: Self) extends AnyVal {
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait LineAPIOptions extends StObject {
    
    var size: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[
        ShapeStyle | (js.Function3[/* x */ Any, /* y */ Any, /* series */ js.UndefOr[Any], ShapeStyle])
      ] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object LineAPIOptions {
    
    inline def apply(): LineAPIOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LineAPIOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LineAPIOptions] (val x: Self) extends AnyVal {
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStyle(
        value: ShapeStyle | (js.Function3[/* x */ Any, /* y */ Any, /* series */ js.UndefOr[Any], ShapeStyle])
      ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleFunction3(value: (/* x */ Any, /* y */ Any, /* series */ js.UndefOr[Any]) => ShapeStyle): Self = StObject.set(x, "style", js.Any.fromFunction3(value))
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait PointAPIOptions
    extends StObject
       with MappingOptions {
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object PointAPIOptions {
    
    inline def apply(): PointAPIOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PointAPIOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PointAPIOptions] (val x: Self) extends AnyVal {
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait RadarOptions
    extends StObject
       with typings.antvG2plot.libPlotsRadarTypesMod.RadarOptions
       with BasePlotOptions {
    
    /** 请使用xAxis替代 */
    var angleAxis: js.UndefOr[Any] = js.undefined
    
    /** 请使用xField替代 */
    var angleField: js.UndefOr[String] = js.undefined
    
    var line: js.UndefOr[LineAPIOptions] = js.undefined
    
    /** 请使用YAxis替代 */
    var radiusAxis: js.UndefOr[Any] = js.undefined
    
    /** 请使用yFeild替代 */
    var radiusField: js.UndefOr[String] = js.undefined
  }
  object RadarOptions {
    
    inline def apply(data: js.Array[Record[String, Any]], xField: String, yField: String): RadarOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], xField = xField.asInstanceOf[js.Any], yField = yField.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadarOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RadarOptions] (val x: Self) extends AnyVal {
      
      inline def setAngleAxis(value: Any): Self = StObject.set(x, "angleAxis", value.asInstanceOf[js.Any])
      
      inline def setAngleAxisUndefined: Self = StObject.set(x, "angleAxis", js.undefined)
      
      inline def setAngleField(value: String): Self = StObject.set(x, "angleField", value.asInstanceOf[js.Any])
      
      inline def setAngleFieldUndefined: Self = StObject.set(x, "angleField", js.undefined)
      
      inline def setLine(value: LineAPIOptions): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
      
      inline def setRadiusAxis(value: Any): Self = StObject.set(x, "radiusAxis", value.asInstanceOf[js.Any])
      
      inline def setRadiusAxisUndefined: Self = StObject.set(x, "radiusAxis", js.undefined)
      
      inline def setRadiusField(value: String): Self = StObject.set(x, "radiusField", value.asInstanceOf[js.Any])
      
      inline def setRadiusFieldUndefined: Self = StObject.set(x, "radiusField", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[RadarOptions & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libPlotsRadarChartMod.foo` */
  override def _to: ForwardRefExoticComponent[RadarOptions & RefAttributes[Any]] = default
}
