package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFederationTokenResponse extends StObject {
  
  /**
    * The credentials to use for federation.
    */
  var Credentials: js.UndefOr[typings.awsSdk.connectMod.Credentials] = js.undefined
}
object GetFederationTokenResponse {
  
  inline def apply(): GetFederationTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFederationTokenResponse]
  }
  
  extension [Self <: GetFederationTokenResponse](x: Self) {
    
    inline def setCredentials(value: Credentials): Self = StObject.set(x, "Credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "Credentials", js.undefined)
  }
}
