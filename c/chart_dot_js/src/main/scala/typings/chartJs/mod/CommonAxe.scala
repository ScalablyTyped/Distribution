package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonAxe extends StObject {
  
  var afterBuildTicks: js.UndefOr[js.Function2[/* scale */ js.Any, /* ticks */ js.Array[Double], js.Array[Double]]] = js.undefined
  
  var afterCalculateTickRotation: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  var afterDataLimits: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  var afterFit: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  var afterSetDimension: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  var afterTickToLabelConversion: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  var afterUpdate: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  var beforeBuildTicks: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  var beforeCalculateTickRotation: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  var beforeDataLimits: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  var beforeFit: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  var beforeSetDimension: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  var beforeTickToLabelConversion: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  var beforeUpdate: js.UndefOr[js.Function1[/* scale */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  var bounds: js.UndefOr[String] = js.undefined
  
  var display: js.UndefOr[Boolean | String] = js.undefined
  
  var gridLines: js.UndefOr[GridLineOptions] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var labels: js.UndefOr[js.Array[String]] = js.undefined
  
  var offset: js.UndefOr[Boolean] = js.undefined
  
  var position: js.UndefOr[String] = js.undefined
  
  var scaleLabel: js.UndefOr[ScaleTitleOptions] = js.undefined
  
  var stacked: js.UndefOr[Boolean] = js.undefined
  
  var ticks: js.UndefOr[TickOptions] = js.undefined
  
  var time: js.UndefOr[TimeScale] = js.undefined
  
  var `type`: js.UndefOr[ScaleType | String] = js.undefined
}
object CommonAxe {
  
  inline def apply(): CommonAxe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonAxe]
  }
  
  extension [Self <: CommonAxe](x: Self) {
    
    inline def setAfterBuildTicks(value: (/* scale */ js.Any, /* ticks */ js.Array[Double]) => js.Array[Double]): Self = StObject.set(x, "afterBuildTicks", js.Any.fromFunction2(value))
    
    inline def setAfterBuildTicksUndefined: Self = StObject.set(x, "afterBuildTicks", js.undefined)
    
    inline def setAfterCalculateTickRotation(value: /* scale */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "afterCalculateTickRotation", js.Any.fromFunction1(value))
    
    inline def setAfterCalculateTickRotationUndefined: Self = StObject.set(x, "afterCalculateTickRotation", js.undefined)
    
    inline def setAfterDataLimits(value: /* scale */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "afterDataLimits", js.Any.fromFunction1(value))
    
    inline def setAfterDataLimitsUndefined: Self = StObject.set(x, "afterDataLimits", js.undefined)
    
    inline def setAfterFit(value: /* scale */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "afterFit", js.Any.fromFunction1(value))
    
    inline def setAfterFitUndefined: Self = StObject.set(x, "afterFit", js.undefined)
    
    inline def setAfterSetDimension(value: /* scale */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "afterSetDimension", js.Any.fromFunction1(value))
    
    inline def setAfterSetDimensionUndefined: Self = StObject.set(x, "afterSetDimension", js.undefined)
    
    inline def setAfterTickToLabelConversion(value: /* scale */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "afterTickToLabelConversion", js.Any.fromFunction1(value))
    
    inline def setAfterTickToLabelConversionUndefined: Self = StObject.set(x, "afterTickToLabelConversion", js.undefined)
    
    inline def setAfterUpdate(value: /* scale */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "afterUpdate", js.Any.fromFunction1(value))
    
    inline def setAfterUpdateUndefined: Self = StObject.set(x, "afterUpdate", js.undefined)
    
    inline def setBeforeBuildTicks(value: /* scale */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "beforeBuildTicks", js.Any.fromFunction1(value))
    
    inline def setBeforeBuildTicksUndefined: Self = StObject.set(x, "beforeBuildTicks", js.undefined)
    
    inline def setBeforeCalculateTickRotation(value: /* scale */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "beforeCalculateTickRotation", js.Any.fromFunction1(value))
    
    inline def setBeforeCalculateTickRotationUndefined: Self = StObject.set(x, "beforeCalculateTickRotation", js.undefined)
    
    inline def setBeforeDataLimits(value: /* scale */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "beforeDataLimits", js.Any.fromFunction1(value))
    
    inline def setBeforeDataLimitsUndefined: Self = StObject.set(x, "beforeDataLimits", js.undefined)
    
    inline def setBeforeFit(value: /* scale */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "beforeFit", js.Any.fromFunction1(value))
    
    inline def setBeforeFitUndefined: Self = StObject.set(x, "beforeFit", js.undefined)
    
    inline def setBeforeSetDimension(value: /* scale */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "beforeSetDimension", js.Any.fromFunction1(value))
    
    inline def setBeforeSetDimensionUndefined: Self = StObject.set(x, "beforeSetDimension", js.undefined)
    
    inline def setBeforeTickToLabelConversion(value: /* scale */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "beforeTickToLabelConversion", js.Any.fromFunction1(value))
    
    inline def setBeforeTickToLabelConversionUndefined: Self = StObject.set(x, "beforeTickToLabelConversion", js.undefined)
    
    inline def setBeforeUpdate(value: /* scale */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "beforeUpdate", js.Any.fromFunction1(value))
    
    inline def setBeforeUpdateUndefined: Self = StObject.set(x, "beforeUpdate", js.undefined)
    
    inline def setBounds(value: String): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    inline def setDisplay(value: Boolean | String): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
    
    inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
    
    inline def setGridLines(value: GridLineOptions): Self = StObject.set(x, "gridLines", value.asInstanceOf[js.Any])
    
    inline def setGridLinesUndefined: Self = StObject.set(x, "gridLines", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLabels(value: js.Array[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value :_*))
    
    inline def setOffset(value: Boolean): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setScaleLabel(value: ScaleTitleOptions): Self = StObject.set(x, "scaleLabel", value.asInstanceOf[js.Any])
    
    inline def setScaleLabelUndefined: Self = StObject.set(x, "scaleLabel", js.undefined)
    
    inline def setStacked(value: Boolean): Self = StObject.set(x, "stacked", value.asInstanceOf[js.Any])
    
    inline def setStackedUndefined: Self = StObject.set(x, "stacked", js.undefined)
    
    inline def setTicks(value: TickOptions): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    inline def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
    
    inline def setTime(value: TimeScale): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def setType(value: ScaleType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
