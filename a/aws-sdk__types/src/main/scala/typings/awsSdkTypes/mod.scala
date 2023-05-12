package typings.awsSdkTypes

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/types", "EndpointURLScheme")
  @js.native
  object EndpointURLScheme extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.awsSdkTypes.distTypesEndpointMod.EndpointURLScheme & String] = js.native
    
    /* "http" */ val HTTP: typings.awsSdkTypes.distTypesEndpointMod.EndpointURLScheme.HTTP & String = js.native
    
    /* "https" */ val HTTPS: typings.awsSdkTypes.distTypesEndpointMod.EndpointURLScheme.HTTPS & String = js.native
  }
  
  @JSImport("@aws-sdk/types", "HostAddressType")
  @js.native
  object HostAddressType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.awsSdkTypes.distTypesDnsMod.HostAddressType & String] = js.native
    
    /* "A" */ val A: typings.awsSdkTypes.distTypesDnsMod.HostAddressType.A & String = js.native
    
    /* "AAAA" */ val AAAA: typings.awsSdkTypes.distTypesDnsMod.HostAddressType.AAAA & String = js.native
  }
  
  @JSImport("@aws-sdk/types", "HttpAuthLocation")
  @js.native
  object HttpAuthLocation extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.awsSdkTypes.distTypesAuthMod.HttpAuthLocation & String] = js.native
    
    /* "header" */ val HEADER: typings.awsSdkTypes.distTypesAuthMod.HttpAuthLocation.HEADER & String = js.native
    
    /* "query" */ val QUERY: typings.awsSdkTypes.distTypesAuthMod.HttpAuthLocation.QUERY & String = js.native
  }
  
  @JSImport("@aws-sdk/types", "RequestHandlerProtocol")
  @js.native
  object RequestHandlerProtocol extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.awsSdkTypes.distTypesTransferMod.RequestHandlerProtocol & String] = js.native
    
    /* "http/0.9" */ val HTTP_0_9: typings.awsSdkTypes.distTypesTransferMod.RequestHandlerProtocol.HTTP_0_9 & String = js.native
    
    /* "http/1.0" */ val HTTP_1_0: typings.awsSdkTypes.distTypesTransferMod.RequestHandlerProtocol.HTTP_1_0 & String = js.native
    
    /* "tds/8.0" */ val TDS_8_0: typings.awsSdkTypes.distTypesTransferMod.RequestHandlerProtocol.TDS_8_0 & String = js.native
  }
}
