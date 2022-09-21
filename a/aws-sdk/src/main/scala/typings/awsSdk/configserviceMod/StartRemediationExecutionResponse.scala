package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartRemediationExecutionResponse extends StObject {
  
  /**
    * For resources that have failed to start execution, the API returns a resource key object.
    */
  var FailedItems: js.UndefOr[ResourceKeys] = js.undefined
  
  /**
    * Returns a failure message. For example, the resource is already compliant.
    */
  var FailureMessage: js.UndefOr[String] = js.undefined
}
object StartRemediationExecutionResponse {
  
  inline def apply(): StartRemediationExecutionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartRemediationExecutionResponse]
  }
  
  extension [Self <: StartRemediationExecutionResponse](x: Self) {
    
    inline def setFailedItems(value: ResourceKeys): Self = StObject.set(x, "FailedItems", value.asInstanceOf[js.Any])
    
    inline def setFailedItemsUndefined: Self = StObject.set(x, "FailedItems", js.undefined)
    
    inline def setFailedItemsVarargs(value: ResourceKey*): Self = StObject.set(x, "FailedItems", js.Array(value*))
    
    inline def setFailureMessage(value: String): Self = StObject.set(x, "FailureMessage", value.asInstanceOf[js.Any])
    
    inline def setFailureMessageUndefined: Self = StObject.set(x, "FailureMessage", js.undefined)
  }
}
