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
  
  @scala.inline
  def apply(): GetFederationTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetFederationTokenResponse]
  }
  
  @scala.inline
  implicit class GetFederationTokenResponseMutableBuilder[Self <: GetFederationTokenResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCredentials(value: Credentials): Self = StObject.set(x, "Credentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCredentialsUndefined: Self = StObject.set(x, "Credentials", js.undefined)
  }
}
