package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PollForThirdPartyJobsInput extends js.Object {
  
  /**
    * Represents information about an action type.
    */
  var actionTypeId: ActionTypeId = js.native
  
  /**
    * The maximum number of jobs to return in a poll for jobs call.
    */
  var maxBatchSize: js.UndefOr[MaxBatchSize] = js.native
}
object PollForThirdPartyJobsInput {
  
  @scala.inline
  def apply(actionTypeId: ActionTypeId): PollForThirdPartyJobsInput = {
    val __obj = js.Dynamic.literal(actionTypeId = actionTypeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PollForThirdPartyJobsInput]
  }
  
  @scala.inline
  implicit class PollForThirdPartyJobsInputOps[Self <: PollForThirdPartyJobsInput] (val x: Self) extends AnyVal {
    
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
    def setActionTypeId(value: ActionTypeId): Self = this.set("actionTypeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxBatchSize(value: MaxBatchSize): Self = this.set("maxBatchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxBatchSize: Self = this.set("maxBatchSize", js.undefined)
  }
}
