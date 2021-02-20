package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailedRemediationBatch extends StObject {
  
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
  implicit class FailedRemediationBatchMutableBuilder[Self <: FailedRemediationBatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailedItems(value: RemediationConfigurations): Self = StObject.set(x, "FailedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedItemsUndefined: Self = StObject.set(x, "FailedItems", js.undefined)
    
    @scala.inline
    def setFailedItemsVarargs(value: RemediationConfiguration*): Self = StObject.set(x, "FailedItems", js.Array(value :_*))
    
    @scala.inline
    def setFailureMessage(value: String): Self = StObject.set(x, "FailureMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureMessageUndefined: Self = StObject.set(x, "FailureMessage", js.undefined)
  }
}
