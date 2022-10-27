package typings.awsSdkClientCognitoIdentity

import typings.awsSdkClientCognitoIdentity.anon.DefaultSigningName
import typings.awsSdkTypes.distTypesEndpointMod.EndpointV2
import typings.awsSdkTypes.distTypesHttpMod.Endpoint
import typings.awsSdkTypes.distTypesUtilMod.Provider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEndpointEndpointParametersMod {
  
  @JSImport("@aws-sdk/client-cognito-identity/dist-types/endpoint/EndpointParameters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveClientEndpointParameters[T](options: T & ClientInputEndpointParameters): T & ClientInputEndpointParameters & DefaultSigningName = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveClientEndpointParameters")(options.asInstanceOf[js.Any]).asInstanceOf[T & ClientInputEndpointParameters & DefaultSigningName]
  
  trait ClientInputEndpointParameters extends StObject {
    
    var endpoint: js.UndefOr[String | (Provider[Endpoint | EndpointV2 | String]) | Endpoint | EndpointV2] = js.undefined
    
    var region: js.UndefOr[String | Provider[String]] = js.undefined
    
    var useDualstackEndpoint: js.UndefOr[Boolean | Provider[Boolean]] = js.undefined
    
    var useFipsEndpoint: js.UndefOr[Boolean | Provider[Boolean]] = js.undefined
  }
  object ClientInputEndpointParameters {
    
    inline def apply(): ClientInputEndpointParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClientInputEndpointParameters]
    }
    
    extension [Self <: ClientInputEndpointParameters](x: Self) {
      
      inline def setEndpoint(value: String | (Provider[Endpoint | EndpointV2 | String]) | Endpoint | EndpointV2): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setEndpointFunction0(value: () => js.Promise[Endpoint | EndpointV2 | String]): Self = StObject.set(x, "endpoint", js.Any.fromFunction0(value))
      
      inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      inline def setRegion(value: String | Provider[String]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionFunction0(value: () => js.Promise[String]): Self = StObject.set(x, "region", js.Any.fromFunction0(value))
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setUseDualstackEndpoint(value: Boolean | Provider[Boolean]): Self = StObject.set(x, "useDualstackEndpoint", value.asInstanceOf[js.Any])
      
      inline def setUseDualstackEndpointFunction0(value: () => js.Promise[Boolean]): Self = StObject.set(x, "useDualstackEndpoint", js.Any.fromFunction0(value))
      
      inline def setUseDualstackEndpointUndefined: Self = StObject.set(x, "useDualstackEndpoint", js.undefined)
      
      inline def setUseFipsEndpoint(value: Boolean | Provider[Boolean]): Self = StObject.set(x, "useFipsEndpoint", value.asInstanceOf[js.Any])
      
      inline def setUseFipsEndpointFunction0(value: () => js.Promise[Boolean]): Self = StObject.set(x, "useFipsEndpoint", js.Any.fromFunction0(value))
      
      inline def setUseFipsEndpointUndefined: Self = StObject.set(x, "useFipsEndpoint", js.undefined)
    }
  }
  
  trait ClientResolvedEndpointParameters
    extends StObject
       with ClientInputEndpointParameters {
    
    var defaultSigningName: String
  }
  object ClientResolvedEndpointParameters {
    
    inline def apply(defaultSigningName: String): ClientResolvedEndpointParameters = {
      val __obj = js.Dynamic.literal(defaultSigningName = defaultSigningName.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientResolvedEndpointParameters]
    }
    
    extension [Self <: ClientResolvedEndpointParameters](x: Self) {
      
      inline def setDefaultSigningName(value: String): Self = StObject.set(x, "defaultSigningName", value.asInstanceOf[js.Any])
    }
  }
  
  trait EndpointParameters
    extends StObject
       with typings.awsSdkTypes.distTypesEndpointMod.EndpointParameters {
    
    var Endpoint: js.UndefOr[String] = js.undefined
    
    var Region: js.UndefOr[String] = js.undefined
    
    var UseDualStack: js.UndefOr[Boolean] = js.undefined
    
    var UseFIPS: js.UndefOr[Boolean] = js.undefined
  }
  object EndpointParameters {
    
    inline def apply(): EndpointParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndpointParameters]
    }
    
    extension [Self <: EndpointParameters](x: Self) {
      
      inline def setEndpoint(value: String): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
      
      inline def setEndpointUndefined: Self = StObject.set(x, "Endpoint", js.undefined)
      
      inline def setRegion(value: String): Self = StObject.set(x, "Region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "Region", js.undefined)
      
      inline def setUseDualStack(value: Boolean): Self = StObject.set(x, "UseDualStack", value.asInstanceOf[js.Any])
      
      inline def setUseDualStackUndefined: Self = StObject.set(x, "UseDualStack", js.undefined)
      
      inline def setUseFIPS(value: Boolean): Self = StObject.set(x, "UseFIPS", value.asInstanceOf[js.Any])
      
      inline def setUseFIPSUndefined: Self = StObject.set(x, "UseFIPS", js.undefined)
    }
  }
}
