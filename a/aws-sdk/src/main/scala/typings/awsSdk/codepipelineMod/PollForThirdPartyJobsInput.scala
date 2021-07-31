package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PollForThirdPartyJobsInput extends StObject {
  
  /**
    * Represents information about an action type.
    */
  var actionTypeId: ActionTypeId
  
  /**
    * The maximum number of jobs to return in a poll for jobs call.
    */
  var maxBatchSize: js.UndefOr[MaxBatchSize] = js.undefined
}
object PollForThirdPartyJobsInput {
  
  @scala.inline
  def apply(actionTypeId: ActionTypeId): PollForThirdPartyJobsInput = {
    val __obj = js.Dynamic.literal(actionTypeId = actionTypeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PollForThirdPartyJobsInput]
  }
  
  @scala.inline
  implicit class PollForThirdPartyJobsInputMutableBuilder[Self <: PollForThirdPartyJobsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionTypeId(value: ActionTypeId): Self = StObject.set(x, "actionTypeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxBatchSize(value: MaxBatchSize): Self = StObject.set(x, "maxBatchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxBatchSizeUndefined: Self = StObject.set(x, "maxBatchSize", js.undefined)
  }
}
