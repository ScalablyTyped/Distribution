package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailedRemediationExceptionBatch extends StObject {
  
  /**
    * Returns remediation exception resource key object of the failed items.
    */
  var FailedItems: js.UndefOr[RemediationExceptions] = js.undefined
  
  /**
    * Returns a failure message. For example, the auto-remediation has failed.
    */
  var FailureMessage: js.UndefOr[String] = js.undefined
}
object FailedRemediationExceptionBatch {
  
  inline def apply(): FailedRemediationExceptionBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailedRemediationExceptionBatch]
  }
  
  extension [Self <: FailedRemediationExceptionBatch](x: Self) {
    
    inline def setFailedItems(value: RemediationExceptions): Self = StObject.set(x, "FailedItems", value.asInstanceOf[js.Any])
    
    inline def setFailedItemsUndefined: Self = StObject.set(x, "FailedItems", js.undefined)
    
    inline def setFailedItemsVarargs(value: RemediationException*): Self = StObject.set(x, "FailedItems", js.Array(value*))
    
    inline def setFailureMessage(value: String): Self = StObject.set(x, "FailureMessage", value.asInstanceOf[js.Any])
    
    inline def setFailureMessageUndefined: Self = StObject.set(x, "FailureMessage", js.undefined)
  }
}
