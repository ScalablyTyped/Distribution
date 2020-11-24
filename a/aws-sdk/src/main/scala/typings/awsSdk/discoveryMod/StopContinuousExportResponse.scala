package typings.awsSdk.discoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopContinuousExportResponse extends js.Object {
  
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
  implicit class StopContinuousExportResponseOps[Self <: StopContinuousExportResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setStartTime(value: TimeStamp): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setStopTime(value: TimeStamp): Self = this.set("stopTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopTime: Self = this.set("stopTime", js.undefined)
  }
}
