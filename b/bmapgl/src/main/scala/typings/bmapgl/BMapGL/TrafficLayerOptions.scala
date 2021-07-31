package typings.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrafficLayerOptions extends StObject {
  
  var predictDate: js.UndefOr[PredictDate] = js.undefined
}
object TrafficLayerOptions {
  
  @scala.inline
  def apply(): TrafficLayerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrafficLayerOptions]
  }
  
  @scala.inline
  implicit class TrafficLayerOptionsMutableBuilder[Self <: TrafficLayerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPredictDate(value: PredictDate): Self = StObject.set(x, "predictDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredictDateUndefined: Self = StObject.set(x, "predictDate", js.undefined)
  }
}
