package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateActionTargetRequest extends StObject {
  
  /**
    * The ARN of the custom action target to update.
    */
  var ActionTargetArn: NonEmptyString
  
  /**
    * The updated description for the custom action target.
    */
  var Description: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The updated name of the custom action target.
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
}
object UpdateActionTargetRequest {
  
  inline def apply(ActionTargetArn: NonEmptyString): UpdateActionTargetRequest = {
    val __obj = js.Dynamic.literal(ActionTargetArn = ActionTargetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateActionTargetRequest]
  }
  
  extension [Self <: UpdateActionTargetRequest](x: Self) {
    
    inline def setActionTargetArn(value: NonEmptyString): Self = StObject.set(x, "ActionTargetArn", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: NonEmptyString): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: NonEmptyString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
