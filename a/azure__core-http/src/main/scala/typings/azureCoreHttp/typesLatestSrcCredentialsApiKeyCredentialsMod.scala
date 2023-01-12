package typings.azureCoreHttp

import org.scalablytyped.runtime.StringDictionary
import typings.azureCoreHttp.typesLatestSrcCredentialsServiceClientCredentialsMod.ServiceClientCredentials
import typings.azureCoreHttp.typesLatestSrcWebResourceMod.WebResourceLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesLatestSrcCredentialsApiKeyCredentialsMod {
  
  @JSImport("@azure/core-http/types/latest/src/credentials/apiKeyCredentials", "ApiKeyCredentials")
  @js.native
  open class ApiKeyCredentials protected ()
    extends StObject
       with ServiceClientCredentials {
    /**
      * @param options - Specifies the options to be provided for auth. Either header or query needs to be provided.
      */
    def this(options: ApiKeyCredentialOptions) = this()
    
    /**
      * A key value pair of the header parameters that need to be applied to the request.
      */
    /* private */ val inHeader: Any = js.native
    
    /**
      * A key value pair of the query parameters that need to be applied to the request.
      */
    /* private */ val inQuery: Any = js.native
    
    /**
      * Signs a request with the Authentication header.
      *
      * @param webResource - The WebResourceLike/request to be signed.
      * @returns The signed request object;
      */
    /* CompleteClass */
    override def signRequest(webResource: WebResourceLike): js.Promise[WebResourceLike] = js.native
  }
  
  trait ApiKeyCredentialOptions extends StObject {
    
    /**
      * A key value pair of the header parameters that need to be applied to the request.
      */
    var inHeader: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    /**
      * A key value pair of the query parameters that need to be applied to the request.
      */
    var inQuery: js.UndefOr[StringDictionary[Any]] = js.undefined
  }
  object ApiKeyCredentialOptions {
    
    inline def apply(): ApiKeyCredentialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ApiKeyCredentialOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ApiKeyCredentialOptions] (val x: Self) extends AnyVal {
      
      inline def setInHeader(value: StringDictionary[Any]): Self = StObject.set(x, "inHeader", value.asInstanceOf[js.Any])
      
      inline def setInHeaderUndefined: Self = StObject.set(x, "inHeader", js.undefined)
      
      inline def setInQuery(value: StringDictionary[Any]): Self = StObject.set(x, "inQuery", value.asInstanceOf[js.Any])
      
      inline def setInQueryUndefined: Self = StObject.set(x, "inQuery", js.undefined)
    }
  }
}
