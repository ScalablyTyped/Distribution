package typings.awsSdkCredentialProviderImds

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object endpointModeMod {
  
  @js.native
  sealed trait EndpointMode extends StObject
  @JSImport("@aws-sdk/credential-provider-imds/dist-types/config/EndpointMode", "EndpointMode")
  @js.native
  object EndpointMode extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[EndpointMode & String] = js.native
    
    @js.native
    sealed trait IPv4
      extends StObject
         with EndpointMode
    /* "IPv4" */ val IPv4: typings.awsSdkCredentialProviderImds.endpointModeMod.EndpointMode.IPv4 & String = js.native
    
    @js.native
    sealed trait IPv6
      extends StObject
         with EndpointMode
    /* "IPv6" */ val IPv6: typings.awsSdkCredentialProviderImds.endpointModeMod.EndpointMode.IPv6 & String = js.native
  }
}
