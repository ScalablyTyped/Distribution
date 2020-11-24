package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivitySucceededEventDetails extends js.Object {
  
  /**
    * The JSON data output by the activity task. Length constraints apply to the payload size, and are expressed as bytes in UTF-8 encoding.
    */
  var output: js.UndefOr[SensitiveData] = js.native
  
  /**
    * Contains details about the output of an execution history event.
    */
  var outputDetails: js.UndefOr[HistoryEventExecutionDataDetails] = js.native
}
object ActivitySucceededEventDetails {
  
  @scala.inline
  def apply(): ActivitySucceededEventDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivitySucceededEventDetails]
  }
  
  @scala.inline
  implicit class ActivitySucceededEventDetailsOps[Self <: ActivitySucceededEventDetails] (val x: Self) extends AnyVal {
    
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
    def setOutput(value: SensitiveData): Self = this.set("output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
    
    @scala.inline
    def setOutputDetails(value: HistoryEventExecutionDataDetails): Self = this.set("outputDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputDetails: Self = this.set("outputDetails", js.undefined)
  }
}
