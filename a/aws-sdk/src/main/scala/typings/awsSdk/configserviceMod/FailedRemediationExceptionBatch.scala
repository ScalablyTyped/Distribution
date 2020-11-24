package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailedRemediationExceptionBatch extends js.Object {
  
  /**
    * Returns remediation exception resource key object of the failed items.
    */
  var FailedItems: js.UndefOr[RemediationExceptions] = js.native
  
  /**
    * Returns a failure message. For example, the auto-remediation has failed.
    */
  var FailureMessage: js.UndefOr[String] = js.native
}
object FailedRemediationExceptionBatch {
  
  @scala.inline
  def apply(): FailedRemediationExceptionBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailedRemediationExceptionBatch]
  }
  
  @scala.inline
  implicit class FailedRemediationExceptionBatchOps[Self <: FailedRemediationExceptionBatch] (val x: Self) extends AnyVal {
    
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
    def setFailedItemsVarargs(value: RemediationException*): Self = this.set("FailedItems", js.Array(value :_*))
    
    @scala.inline
    def setFailedItems(value: RemediationExceptions): Self = this.set("FailedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailedItems: Self = this.set("FailedItems", js.undefined)
    
    @scala.inline
    def setFailureMessage(value: String): Self = this.set("FailureMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureMessage: Self = this.set("FailureMessage", js.undefined)
  }
}
