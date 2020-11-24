package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailedRemediationBatch extends js.Object {
  
  /**
    * Returns remediation configurations of the failed items.
    */
  var FailedItems: js.UndefOr[RemediationConfigurations] = js.native
  
  /**
    * Returns a failure message. For example, the resource is already compliant.
    */
  var FailureMessage: js.UndefOr[String] = js.native
}
object FailedRemediationBatch {
  
  @scala.inline
  def apply(): FailedRemediationBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailedRemediationBatch]
  }
  
  @scala.inline
  implicit class FailedRemediationBatchOps[Self <: FailedRemediationBatch] (val x: Self) extends AnyVal {
    
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
    def setFailedItemsVarargs(value: RemediationConfiguration*): Self = this.set("FailedItems", js.Array(value :_*))
    
    @scala.inline
    def setFailedItems(value: RemediationConfigurations): Self = this.set("FailedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailedItems: Self = this.set("FailedItems", js.undefined)
    
    @scala.inline
    def setFailureMessage(value: String): Self = this.set("FailureMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureMessage: Self = this.set("FailureMessage", js.undefined)
  }
}
