package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailedDeleteRemediationExceptionsBatch extends js.Object {
  
  /**
    * Returns remediation exception resource key object of the failed items.
    */
  var FailedItems: js.UndefOr[RemediationExceptionResourceKeys] = js.native
  
  /**
    * Returns a failure message for delete remediation exception. For example, AWS Config creates an exception due to an internal error.
    */
  var FailureMessage: js.UndefOr[String] = js.native
}
object FailedDeleteRemediationExceptionsBatch {
  
  @scala.inline
  def apply(): FailedDeleteRemediationExceptionsBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailedDeleteRemediationExceptionsBatch]
  }
  
  @scala.inline
  implicit class FailedDeleteRemediationExceptionsBatchOps[Self <: FailedDeleteRemediationExceptionsBatch] (val x: Self) extends AnyVal {
    
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
    def setFailedItemsVarargs(value: RemediationExceptionResourceKey*): Self = this.set("FailedItems", js.Array(value :_*))
    
    @scala.inline
    def setFailedItems(value: RemediationExceptionResourceKeys): Self = this.set("FailedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailedItems: Self = this.set("FailedItems", js.undefined)
    
    @scala.inline
    def setFailureMessage(value: String): Self = this.set("FailureMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureMessage: Self = this.set("FailureMessage", js.undefined)
  }
}
