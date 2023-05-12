package typings.chartJs.distTypesIndexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScriptableScalePointLabelContext extends StObject {
  
  var chart: Chart[ChartType, DefaultDataPoint[ChartType], Any]
  
  var index: Double
  
  var label: String
  
  var scale: Scale[CoreScaleOptions]
  
  var `type`: String
}
object ScriptableScalePointLabelContext {
  
  inline def apply(
    chart: Chart[ChartType, DefaultDataPoint[ChartType], Any],
    index: Double,
    label: String,
    scale: Scale[CoreScaleOptions],
    `type`: String
  ): ScriptableScalePointLabelContext = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptableScalePointLabelContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScriptableScalePointLabelContext] (val x: Self) extends AnyVal {
    
    inline def setChart(value: Chart[ChartType, DefaultDataPoint[ChartType], Any]): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setScale(value: Scale[CoreScaleOptions]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
