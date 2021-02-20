package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FailedRemediationExceptionBatch extends StObject {
  
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
  implicit class FailedRemediationExceptionBatchMutableBuilder[Self <: FailedRemediationExceptionBatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailedItems(value: RemediationExceptions): Self = StObject.set(x, "FailedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedItemsUndefined: Self = StObject.set(x, "FailedItems", js.undefined)
    
    @scala.inline
    def setFailedItemsVarargs(value: RemediationException*): Self = StObject.set(x, "FailedItems", js.Array(value :_*))
    
    @scala.inline
    def setFailureMessage(value: String): Self = StObject.set(x, "FailureMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureMessageUndefined: Self = StObject.set(x, "FailureMessage", js.undefined)
  }
}
