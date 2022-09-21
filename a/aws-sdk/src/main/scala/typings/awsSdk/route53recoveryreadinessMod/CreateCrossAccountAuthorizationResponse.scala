package typings.awsSdk.route53recoveryreadinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCrossAccountAuthorizationResponse extends StObject {
  
  /**
    * The cross-account authorization.
    */
  var CrossAccountAuthorization: js.UndefOr[typings.awsSdk.route53recoveryreadinessMod.CrossAccountAuthorization] = js.undefined
}
object CreateCrossAccountAuthorizationResponse {
  
  inline def apply(): CreateCrossAccountAuthorizationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCrossAccountAuthorizationResponse]
  }
  
  extension [Self <: CreateCrossAccountAuthorizationResponse](x: Self) {
    
    inline def setCrossAccountAuthorization(value: CrossAccountAuthorization): Self = StObject.set(x, "CrossAccountAuthorization", value.asInstanceOf[js.Any])
    
    inline def setCrossAccountAuthorizationUndefined: Self = StObject.set(x, "CrossAccountAuthorization", js.undefined)
  }
}
