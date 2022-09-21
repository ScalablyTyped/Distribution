package typings.awsSdk.mwaaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWebLoginTokenResponse extends StObject {
  
  /**
    * The Airflow web server hostname for the environment.
    */
  var WebServerHostname: js.UndefOr[Hostname] = js.undefined
  
  /**
    * An Airflow web server login token.
    */
  var WebToken: js.UndefOr[Token] = js.undefined
}
object CreateWebLoginTokenResponse {
  
  inline def apply(): CreateWebLoginTokenResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateWebLoginTokenResponse]
  }
  
  extension [Self <: CreateWebLoginTokenResponse](x: Self) {
    
    inline def setWebServerHostname(value: Hostname): Self = StObject.set(x, "WebServerHostname", value.asInstanceOf[js.Any])
    
    inline def setWebServerHostnameUndefined: Self = StObject.set(x, "WebServerHostname", js.undefined)
    
    inline def setWebToken(value: Token): Self = StObject.set(x, "WebToken", value.asInstanceOf[js.Any])
    
    inline def setWebTokenUndefined: Self = StObject.set(x, "WebToken", js.undefined)
  }
}
