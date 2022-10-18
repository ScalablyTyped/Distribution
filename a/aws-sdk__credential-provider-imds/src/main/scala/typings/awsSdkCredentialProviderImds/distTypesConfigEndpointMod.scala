package typings.awsSdkCredentialProviderImds

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesConfigEndpointMod {
  
  @js.native
  sealed trait Endpoint extends StObject
  @JSImport("@aws-sdk/credential-provider-imds/dist-types/config/Endpoint", "Endpoint")
  @js.native
  object Endpoint extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Endpoint & String] = js.native
    
    @js.native
    sealed trait IPv4
      extends StObject
         with Endpoint
    /* "http://169.254.169.254" */ val IPv4: typings.awsSdkCredentialProviderImds.distTypesConfigEndpointMod.Endpoint.IPv4 & String = js.native
    
    @js.native
    sealed trait IPv6
      extends StObject
         with Endpoint
    /* "http://[fd00:ec2::254]" */ val IPv6: typings.awsSdkCredentialProviderImds.distTypesConfigEndpointMod.Endpoint.IPv6 & String = js.native
  }
}
