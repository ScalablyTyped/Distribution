package typings.awsSdk.sesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSendStatisticsResponse extends StObject {
  
  /**
    * A list of data points, each of which represents 15 minutes of activity.
    */
  var SendDataPoints: js.UndefOr[SendDataPointList] = js.undefined
}
object GetSendStatisticsResponse {
  
  @scala.inline
  def apply(): GetSendStatisticsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSendStatisticsResponse]
  }
  
  @scala.inline
  implicit class GetSendStatisticsResponseMutableBuilder[Self <: GetSendStatisticsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSendDataPoints(value: SendDataPointList): Self = StObject.set(x, "SendDataPoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSendDataPointsUndefined: Self = StObject.set(x, "SendDataPoints", js.undefined)
    
    @scala.inline
    def setSendDataPointsVarargs(value: SendDataPoint*): Self = StObject.set(x, "SendDataPoints", js.Array(value :_*))
  }
}
