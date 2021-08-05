package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateActionTargetResponse extends StObject {
  
  /**
    * The ARN for the custom action target.
    */
  var ActionTargetArn: NonEmptyString
}
object CreateActionTargetResponse {
  
  inline def apply(ActionTargetArn: NonEmptyString): CreateActionTargetResponse = {
    val __obj = js.Dynamic.literal(ActionTargetArn = ActionTargetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateActionTargetResponse]
  }
  
  extension [Self <: CreateActionTargetResponse](x: Self) {
    
    inline def setActionTargetArn(value: NonEmptyString): Self = StObject.set(x, "ActionTargetArn", value.asInstanceOf[js.Any])
  }
}
