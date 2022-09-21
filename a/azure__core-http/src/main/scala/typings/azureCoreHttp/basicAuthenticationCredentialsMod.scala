package typings.azureCoreHttp

import typings.azureCoreHttp.serviceClientCredentialsMod.ServiceClientCredentials
import typings.azureCoreHttp.webResourceMod.WebResourceLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basicAuthenticationCredentialsMod {
  
  @JSImport("@azure/core-http/types/latest/src/credentials/basicAuthenticationCredentials", "BasicAuthenticationCredentials")
  @js.native
  open class BasicAuthenticationCredentials protected ()
    extends StObject
       with ServiceClientCredentials {
    /**
      * Creates a new BasicAuthenticationCredentials object.
      *
      * @param userName - User name.
      * @param password - Password.
      * @param authorizationScheme - The authorization scheme.
      */
    def this(userName: String, password: String) = this()
    def this(userName: String, password: String, authorizationScheme: String) = this()
    
    /**
      * Authorization scheme. Defaults to "Basic".
      * More information about authorization schemes is available here: https://developer.mozilla.org/docs/Web/HTTP/Authentication#authentication_schemes
      */
    var authorizationScheme: String = js.native
    
    /**
      * Password
      */
    var password: String = js.native
    
    /**
      * Signs a request with the Authentication header.
      *
      * @param webResource - The WebResourceLike/request to be signed.
      * @returns The signed request object;
      */
    /* CompleteClass */
    override def signRequest(webResource: WebResourceLike): js.Promise[WebResourceLike] = js.native
    
    /**
      * Username
      */
    var userName: String = js.native
  }
}
