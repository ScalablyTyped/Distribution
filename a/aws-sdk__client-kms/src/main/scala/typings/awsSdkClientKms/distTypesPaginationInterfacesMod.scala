package typings.awsSdkClientKms

import typings.awsSdkClientKms.distTypesKmsclientMod.KMSClient
import typings.awsSdkTypes.distTypesPaginationMod.PaginationConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPaginationInterfacesMod {
  
  trait KMSPaginationConfiguration
    extends StObject
       with PaginationConfiguration {
    
    @JSName("client")
    var client_KMSPaginationConfiguration: KMSClient
  }
  object KMSPaginationConfiguration {
    
    inline def apply(client: KMSClient): KMSPaginationConfiguration = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
      __obj.asInstanceOf[KMSPaginationConfiguration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KMSPaginationConfiguration] (val x: Self) extends AnyVal {
      
      inline def setClient(value: KMSClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    }
  }
}
