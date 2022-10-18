package typings.awsSdk.clientsWorkmailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssumeImpersonationRoleResponse extends StObject {
  
  /**
    * The authentication token's validity, in seconds.
    */
  var ExpiresIn: js.UndefOr[typings.awsSdk.clientsWorkmailMod.ExpiresIn] = js.undefined
  
  /**
    * The authentication token for the impersonation role.
    */
  var Token: js.UndefOr[ImpersonationToken] = js.undefined
}
object AssumeImpersonationRoleResponse {
  
  inline def apply(): AssumeImpersonationRoleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssumeImpersonationRoleResponse]
  }
  
  extension [Self <: AssumeImpersonationRoleResponse](x: Self) {
    
    inline def setExpiresIn(value: ExpiresIn): Self = StObject.set(x, "ExpiresIn", value.asInstanceOf[js.Any])
    
    inline def setExpiresInUndefined: Self = StObject.set(x, "ExpiresIn", js.undefined)
    
    inline def setToken(value: ImpersonationToken): Self = StObject.set(x, "Token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "Token", js.undefined)
  }
}
