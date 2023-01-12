package typings.bizcharts

import org.scalablytyped.runtime.Shortcut
import typings.bizcharts.libCreatePlotMod.BasePlotOptions
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsBulletChartMod extends Shortcut {
  
  @JSImport("bizcharts/lib/plots/BulletChart", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[BulletOptions & RefAttributes[Any]] = js.native
  
  trait BulletOptions
    extends StObject
       with typings.antvG2plot.libPlotsBulletTypesMod.BulletOptions
       with BasePlotOptions {
    
    /**
      * 该属性已废弃，请使用color.target替代
      * @example
      * color={{
      *   target: ['#d62728', '#2ca02c', '#000000'],
      * }}
      */
    var markerColors: js.UndefOr[Any] = js.undefined
    
    /**
      * 该属性已废弃，请使用size.target替代
      * @example
      * size={{
      *   target: 40,
      * }}
      */
    var markerSize: js.UndefOr[Double | (js.Tuple2[Double, Double]) | (js.Function1[/* datum */ Any, Double])] = js.undefined
    
    /**
      * 该属性已废弃，请使用bulletStyle.target替代
      * @example
      * bulletStyle={{
      *   target: {
      *     fill: 'red'
      *   },
      *   range: {}
      * }}
      */
    var markerStyle: js.UndefOr[Any] = js.undefined
    
    /**
      * 该属性已废弃，请使用color.measure替代
      * @example
      * color={{
      *   measure: ['#d62728', '#2ca02c', '#000000'],
      * }}
      */
    var measureColors: js.UndefOr[Any] = js.undefined
    
    /**
      * 该属性已废弃，请使用size.measure替代
      * @example
      * size={{
      *   measure: 20,
      * }}
      */
    var measureSize: js.UndefOr[Double | (js.Tuple2[Double, Double]) | (js.Function1[/* datum */ Any, Double])] = js.undefined
    
    /**
      * 该属性已废弃，请使用color.range替代
      * @example
      * color={{
      *   range: ['#d62728', '#2ca02c', '#000000'],
      * }}
      */
    var rangeColors: js.UndefOr[Any] = js.undefined
    
    /**
      * 该属性已废弃，请在数据中配置range，并配置rangeField
      *
      * @type {number}
      * @memberof BulletOptions
      */
    var rangeMax: js.UndefOr[Double] = js.undefined
    
    /**
      * 该属性已废弃，请使用size.range替代
      * @example
      * size={{
      *   range: 50,
      * }}
      */
    var rangeSize: js.UndefOr[Double | (js.Tuple2[Double, Double]) | (js.Function1[/* datum */ Any, Double])] = js.undefined
  }
  object BulletOptions {
    
    inline def apply(data: js.Array[Record[String, Any]], measureField: String, rangeField: String, targetField: String): BulletOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], measureField = measureField.asInstanceOf[js.Any], rangeField = rangeField.asInstanceOf[js.Any], targetField = targetField.asInstanceOf[js.Any])
      __obj.asInstanceOf[BulletOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BulletOptions] (val x: Self) extends AnyVal {
      
      inline def setMarkerColors(value: Any): Self = StObject.set(x, "markerColors", value.asInstanceOf[js.Any])
      
      inline def setMarkerColorsUndefined: Self = StObject.set(x, "markerColors", js.undefined)
      
      inline def setMarkerSize(value: Double | (js.Tuple2[Double, Double]) | (js.Function1[/* datum */ Any, Double])): Self = StObject.set(x, "markerSize", value.asInstanceOf[js.Any])
      
      inline def setMarkerSizeFunction1(value: /* datum */ Any => Double): Self = StObject.set(x, "markerSize", js.Any.fromFunction1(value))
      
      inline def setMarkerSizeUndefined: Self = StObject.set(x, "markerSize", js.undefined)
      
      inline def setMarkerStyle(value: Any): Self = StObject.set(x, "markerStyle", value.asInstanceOf[js.Any])
      
      inline def setMarkerStyleUndefined: Self = StObject.set(x, "markerStyle", js.undefined)
      
      inline def setMeasureColors(value: Any): Self = StObject.set(x, "measureColors", value.asInstanceOf[js.Any])
      
      inline def setMeasureColorsUndefined: Self = StObject.set(x, "measureColors", js.undefined)
      
      inline def setMeasureSize(value: Double | (js.Tuple2[Double, Double]) | (js.Function1[/* datum */ Any, Double])): Self = StObject.set(x, "measureSize", value.asInstanceOf[js.Any])
      
      inline def setMeasureSizeFunction1(value: /* datum */ Any => Double): Self = StObject.set(x, "measureSize", js.Any.fromFunction1(value))
      
      inline def setMeasureSizeUndefined: Self = StObject.set(x, "measureSize", js.undefined)
      
      inline def setRangeColors(value: Any): Self = StObject.set(x, "rangeColors", value.asInstanceOf[js.Any])
      
      inline def setRangeColorsUndefined: Self = StObject.set(x, "rangeColors", js.undefined)
      
      inline def setRangeMax(value: Double): Self = StObject.set(x, "rangeMax", value.asInstanceOf[js.Any])
      
      inline def setRangeMaxUndefined: Self = StObject.set(x, "rangeMax", js.undefined)
      
      inline def setRangeSize(value: Double | (js.Tuple2[Double, Double]) | (js.Function1[/* datum */ Any, Double])): Self = StObject.set(x, "rangeSize", value.asInstanceOf[js.Any])
      
      inline def setRangeSizeFunction1(value: /* datum */ Any => Double): Self = StObject.set(x, "rangeSize", js.Any.fromFunction1(value))
      
      inline def setRangeSizeUndefined: Self = StObject.set(x, "rangeSize", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[BulletOptions & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libPlotsBulletChartMod.foo` */
  override def _to: ForwardRefExoticComponent[BulletOptions & RefAttributes[Any]] = default
}
