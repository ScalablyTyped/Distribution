package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailedDeleteRemediationExceptionsBatch extends StObject {
  
  /**
    * Returns remediation exception resource key object of the failed items.
    */
  var FailedItems: js.UndefOr[RemediationExceptionResourceKeys] = js.undefined
  
  /**
    * Returns a failure message for delete remediation exception. For example, AWS Config creates an exception due to an internal error.
    */
  var FailureMessage: js.UndefOr[String] = js.undefined
}
object FailedDeleteRemediationExceptionsBatch {
  
  @scala.inline
  def apply(): FailedDeleteRemediationExceptionsBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailedDeleteRemediationExceptionsBatch]
  }
  
  @scala.inline
  implicit class FailedDeleteRemediationExceptionsBatchMutableBuilder[Self <: FailedDeleteRemediationExceptionsBatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFailedItems(value: RemediationExceptionResourceKeys): Self = StObject.set(x, "FailedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailedItemsUndefined: Self = StObject.set(x, "FailedItems", js.undefined)
    
    @scala.inline
    def setFailedItemsVarargs(value: RemediationExceptionResourceKey*): Self = StObject.set(x, "FailedItems", js.Array(value :_*))
    
    @scala.inline
    def setFailureMessage(value: String): Self = StObject.set(x, "FailureMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureMessageUndefined: Self = StObject.set(x, "FailureMessage", js.undefined)
  }
}
