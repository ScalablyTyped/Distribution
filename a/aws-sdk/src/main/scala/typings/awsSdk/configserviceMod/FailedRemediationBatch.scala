package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailedRemediationBatch extends StObject {
  
  /**
    * Returns remediation configurations of the failed items.
    */
  var FailedItems: js.UndefOr[RemediationConfigurations] = js.undefined
  
  /**
    * Returns a failure message. For example, the resource is already compliant.
    */
  var FailureMessage: js.UndefOr[String] = js.undefined
}
object FailedRemediationBatch {
  
  inline def apply(): FailedRemediationBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailedRemediationBatch]
  }
  
  extension [Self <: FailedRemediationBatch](x: Self) {
    
    inline def setFailedItems(value: RemediationConfigurations): Self = StObject.set(x, "FailedItems", value.asInstanceOf[js.Any])
    
    inline def setFailedItemsUndefined: Self = StObject.set(x, "FailedItems", js.undefined)
    
    inline def setFailedItemsVarargs(value: RemediationConfiguration*): Self = StObject.set(x, "FailedItems", js.Array(value*))
    
    inline def setFailureMessage(value: String): Self = StObject.set(x, "FailureMessage", value.asInstanceOf[js.Any])
    
    inline def setFailureMessageUndefined: Self = StObject.set(x, "FailureMessage", js.undefined)
  }
}
