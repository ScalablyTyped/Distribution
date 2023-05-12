package typings.awsSdkMiddlewareEndpointDiscovery

import typings.awsSdkTypes.distTypesHttpMod.HttpHandlerOptions
import typings.awsSdkTypes.distTypesIdentityAwsCredentialIdentityMod.AwsCredentialIdentity
import typings.awsSdkTypes.distTypesMiddlewareMod.MiddlewareStack
import typings.awsSdkTypes.distTypesUtilMod.Provider
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Credentials extends StObject {
    
    def credentials(): js.Promise[AwsCredentialIdentity]
    @JSName("credentials")
    var credentials_Original: Provider[AwsCredentialIdentity]
  }
  object Credentials {
    
    inline def apply(credentials: () => js.Promise[AwsCredentialIdentity]): Credentials = {
      val __obj = js.Dynamic.literal(credentials = js.Any.fromFunction0(credentials))
      __obj.asInstanceOf[Credentials]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Credentials] (val x: Self) extends AnyVal {
      
      inline def setCredentials(value: () => js.Promise[AwsCredentialIdentity]): Self = StObject.set(x, "credentials", js.Any.fromFunction0(value))
    }
  }
  
  trait Identifiers extends StObject {
    
    var identifiers: js.UndefOr[Record[String, String]] = js.undefined
  }
  object Identifiers {
    
    inline def apply(): Identifiers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Identifiers]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Identifiers] (val x: Self) extends AnyVal {
      
      inline def setIdentifiers(value: Record[String, String]): Self = StObject.set(x, "identifiers", value.asInstanceOf[js.Any])
      
      inline def setIdentifiersUndefined: Self = StObject.set(x, "identifiers", js.undefined)
    }
  }
  
  /* Inlined std.Omit<@aws-sdk/middleware-endpoint-discovery.@aws-sdk/middleware-endpoint-discovery/dist-types/getEndpointDiscoveryPlugin.EndpointDiscoveryMiddlewareConfig, 'isDiscoveredEndpointRequired'> */
  trait OmitEndpointDiscoveryMidd extends StObject {
    
    var clientStack: MiddlewareStack[Any, Any]
    
    var identifiers: js.UndefOr[Record[String, String]] = js.undefined
    
    var options: js.UndefOr[HttpHandlerOptions] = js.undefined
  }
  object OmitEndpointDiscoveryMidd {
    
    inline def apply(clientStack: MiddlewareStack[Any, Any]): OmitEndpointDiscoveryMidd = {
      val __obj = js.Dynamic.literal(clientStack = clientStack.asInstanceOf[js.Any])
      __obj.asInstanceOf[OmitEndpointDiscoveryMidd]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OmitEndpointDiscoveryMidd] (val x: Self) extends AnyVal {
      
      inline def setClientStack(value: MiddlewareStack[Any, Any]): Self = StObject.set(x, "clientStack", value.asInstanceOf[js.Any])
      
      inline def setIdentifiers(value: Record[String, String]): Self = StObject.set(x, "identifiers", value.asInstanceOf[js.Any])
      
      inline def setIdentifiersUndefined: Self = StObject.set(x, "identifiers", js.undefined)
      
      inline def setOptions(value: HttpHandlerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    }
  }
}
