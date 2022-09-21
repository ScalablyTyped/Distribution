package typings.awsSdkClientSso

import typings.awsSdkClientSso.ssoMod.SSO
import typings.awsSdkClientSso.ssoclientMod.SSOClient
import typings.awsSdkTypes.paginationMod.PaginationConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesMod {
  
  trait SSOPaginationConfiguration
    extends StObject
       with PaginationConfiguration {
    
    @JSName("client")
    var client_SSOPaginationConfiguration: SSO | SSOClient
  }
  object SSOPaginationConfiguration {
    
    inline def apply(client: SSO | SSOClient): SSOPaginationConfiguration = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
      __obj.asInstanceOf[SSOPaginationConfiguration]
    }
    
    extension [Self <: SSOPaginationConfiguration](x: Self) {
      
      inline def setClient(value: SSO | SSOClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    }
  }
}
