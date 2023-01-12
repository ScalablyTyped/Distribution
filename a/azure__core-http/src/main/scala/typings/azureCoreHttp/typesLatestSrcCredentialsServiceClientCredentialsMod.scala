package typings.azureCoreHttp

import typings.azureCoreHttp.typesLatestSrcWebResourceMod.WebResourceLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLatestSrcCredentialsServiceClientCredentialsMod {
  
  trait ServiceClientCredentials extends StObject {
    
    /**
      * Signs a request with the Authentication header.
      *
      * @param webResource - The WebResourceLike/request to be signed.
      * @returns The signed request object;
      */
    def signRequest(webResource: WebResourceLike): js.Promise[WebResourceLike]
  }
  object ServiceClientCredentials {
    
    inline def apply(signRequest: WebResourceLike => js.Promise[WebResourceLike]): ServiceClientCredentials = {
      val __obj = js.Dynamic.literal(signRequest = js.Any.fromFunction1(signRequest))
      __obj.asInstanceOf[ServiceClientCredentials]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServiceClientCredentials] (val x: Self) extends AnyVal {
      
      inline def setSignRequest(value: WebResourceLike => js.Promise[WebResourceLike]): Self = StObject.set(x, "signRequest", js.Any.fromFunction1(value))
    }
  }
}
