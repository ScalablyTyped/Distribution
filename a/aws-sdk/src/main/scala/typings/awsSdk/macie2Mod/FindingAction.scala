package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FindingAction extends StObject {
  
  /**
    * The type of action that occurred for the affected resource. This value is typically AWS_API_CALL, which indicates that an entity invoked an API operation for the resource.
    */
  var actionType: js.UndefOr[FindingActionType] = js.undefined
  
  /**
    * The invocation details of the API operation that an entity invoked for the affected resource, if the value for the actionType property is AWS_API_CALL.
    */
  var apiCallDetails: js.UndefOr[ApiCallDetails] = js.undefined
}
object FindingAction {
  
  inline def apply(): FindingAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindingAction]
  }
  
  extension [Self <: FindingAction](x: Self) {
    
    inline def setActionType(value: FindingActionType): Self = StObject.set(x, "actionType", value.asInstanceOf[js.Any])
    
    inline def setActionTypeUndefined: Self = StObject.set(x, "actionType", js.undefined)
    
    inline def setApiCallDetails(value: ApiCallDetails): Self = StObject.set(x, "apiCallDetails", value.asInstanceOf[js.Any])
    
    inline def setApiCallDetailsUndefined: Self = StObject.set(x, "apiCallDetails", js.undefined)
  }
}
