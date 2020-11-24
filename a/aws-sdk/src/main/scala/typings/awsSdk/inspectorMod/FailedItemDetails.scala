package typings.awsSdk.inspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailedItemDetails extends js.Object {
  
  /**
    * The status code of a failed item.
    */
  var failureCode: FailedItemErrorCode = js.native
  
  /**
    * Indicates whether you can immediately retry a request for this item for a specified resource.
    */
  var retryable: Bool = js.native
}
object FailedItemDetails {
  
  @scala.inline
  def apply(failureCode: FailedItemErrorCode, retryable: Bool): FailedItemDetails = {
    val __obj = js.Dynamic.literal(failureCode = failureCode.asInstanceOf[js.Any], retryable = retryable.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailedItemDetails]
  }
  
  @scala.inline
  implicit class FailedItemDetailsOps[Self <: FailedItemDetails] (val x: Self) extends AnyVal {
    
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
    def setFailureCode(value: FailedItemErrorCode): Self = this.set("failureCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryable(value: Bool): Self = this.set("retryable", value.asInstanceOf[js.Any])
  }
}
