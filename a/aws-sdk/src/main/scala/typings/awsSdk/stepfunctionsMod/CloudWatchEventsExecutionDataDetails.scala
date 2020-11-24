package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CloudWatchEventsExecutionDataDetails extends js.Object {
  
  /**
    * Indicates whether input or output was included in the response. Always true for API calls. 
    */
  var included: js.UndefOr[typings.awsSdk.stepfunctionsMod.included] = js.native
}
object CloudWatchEventsExecutionDataDetails {
  
  @scala.inline
  def apply(): CloudWatchEventsExecutionDataDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CloudWatchEventsExecutionDataDetails]
  }
  
  @scala.inline
  implicit class CloudWatchEventsExecutionDataDetailsOps[Self <: CloudWatchEventsExecutionDataDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIncluded(value: included): Self = this.set("included", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncluded: Self = this.set("included", js.undefined)
  }
}
