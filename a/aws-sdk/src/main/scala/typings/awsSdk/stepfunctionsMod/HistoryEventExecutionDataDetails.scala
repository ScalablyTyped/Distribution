package typings.awsSdk.stepfunctionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HistoryEventExecutionDataDetails extends js.Object {
  
  /**
    * Indicates whether input or output was truncated in the response. Always false for API calls.
    */
  var truncated: js.UndefOr[typings.awsSdk.stepfunctionsMod.truncated] = js.native
}
object HistoryEventExecutionDataDetails {
  
  @scala.inline
  def apply(): HistoryEventExecutionDataDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoryEventExecutionDataDetails]
  }
  
  @scala.inline
  implicit class HistoryEventExecutionDataDetailsOps[Self <: HistoryEventExecutionDataDetails] (val x: Self) extends AnyVal {
    
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
    def setTruncated(value: truncated): Self = this.set("truncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTruncated: Self = this.set("truncated", js.undefined)
  }
}
