package typings.awsSdk.route53recoveryreadinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCrossAccountAuthorizationRequest extends StObject {
  
  /**
    * The cross-account authorization.
    */
  var CrossAccountAuthorization: string
}
object DeleteCrossAccountAuthorizationRequest {
  
  inline def apply(CrossAccountAuthorization: string): DeleteCrossAccountAuthorizationRequest = {
    val __obj = js.Dynamic.literal(CrossAccountAuthorization = CrossAccountAuthorization.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCrossAccountAuthorizationRequest]
  }
  
  extension [Self <: DeleteCrossAccountAuthorizationRequest](x: Self) {
    
    inline def setCrossAccountAuthorization(value: string): Self = StObject.set(x, "CrossAccountAuthorization", value.asInstanceOf[js.Any])
  }
}
