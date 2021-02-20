package typings.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopContinuousExportResponse extends StObject {
  
  /**
    * Timestamp that represents when this continuous export started collecting data.
    */
  var startTime: js.UndefOr[TimeStamp] = js.native
  
  /**
    * Timestamp that represents when this continuous export was stopped.
    */
  var stopTime: js.UndefOr[TimeStamp] = js.native
}
object StopContinuousExportResponse {
  
  @scala.inline
  def apply(): StopContinuousExportResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopContinuousExportResponse]
  }
  
  @scala.inline
  implicit class StopContinuousExportResponseMutableBuilder[Self <: StopContinuousExportResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStartTime(value: TimeStamp): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setStopTime(value: TimeStamp): Self = StObject.set(x, "stopTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopTimeUndefined: Self = StObject.set(x, "stopTime", js.undefined)
  }
}
