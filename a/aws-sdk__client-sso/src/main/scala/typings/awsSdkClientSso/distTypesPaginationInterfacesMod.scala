package typings.awsSdkClientSso

import typings.awsSdkClientSso.distTypesSsoclientMod.SSOClient
import typings.awsSdkTypes.distTypesPaginationMod.PaginationConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPaginationInterfacesMod {
  
  trait SSOPaginationConfiguration
    extends StObject
       with PaginationConfiguration {
    
    @JSName("client")
    var client_SSOPaginationConfiguration: SSOClient
  }
  object SSOPaginationConfiguration {
    
    inline def apply(client: SSOClient): SSOPaginationConfiguration = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
      __obj.asInstanceOf[SSOPaginationConfiguration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SSOPaginationConfiguration] (val x: Self) extends AnyVal {
      
      inline def setClient(value: SSOClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    }
  }
}
