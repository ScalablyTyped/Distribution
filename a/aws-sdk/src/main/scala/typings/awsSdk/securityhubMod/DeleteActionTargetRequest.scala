package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteActionTargetRequest extends StObject {
  
  /**
    * The ARN of the custom action target to delete.
    */
  var ActionTargetArn: NonEmptyString
}
object DeleteActionTargetRequest {
  
  inline def apply(ActionTargetArn: NonEmptyString): DeleteActionTargetRequest = {
    val __obj = js.Dynamic.literal(ActionTargetArn = ActionTargetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteActionTargetRequest]
  }
  
  extension [Self <: DeleteActionTargetRequest](x: Self) {
    
    inline def setActionTargetArn(value: NonEmptyString): Self = StObject.set(x, "ActionTargetArn", value.asInstanceOf[js.Any])
  }
}
