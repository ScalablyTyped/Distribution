package typings.baidumapWebSdk.BMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrafficLayerOptions extends StObject {
  
  var predictDate: js.UndefOr[PredictDate] = js.undefined
}
object TrafficLayerOptions {
  
  inline def apply(): TrafficLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficLayerOptions]
  }
  
  extension [Self <: TrafficLayerOptions](x: Self) {
    
    inline def setPredictDate(value: PredictDate): Self = StObject.set(x, "predictDate", value.asInstanceOf[js.Any])
    
    inline def setPredictDateUndefined: Self = StObject.set(x, "predictDate", js.undefined)
  }
}
