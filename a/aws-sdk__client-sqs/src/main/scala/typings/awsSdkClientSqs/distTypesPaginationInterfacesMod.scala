package typings.awsSdkClientSqs

import typings.awsSdkClientSqs.distTypesSqsclientMod.SQSClient
import typings.awsSdkTypes.distTypesPaginationMod.PaginationConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPaginationInterfacesMod {
  
  trait SQSPaginationConfiguration
    extends StObject
       with PaginationConfiguration {
    
    @JSName("client")
    var client_SQSPaginationConfiguration: SQSClient
  }
  object SQSPaginationConfiguration {
    
    inline def apply(client: SQSClient): SQSPaginationConfiguration = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
      __obj.asInstanceOf[SQSPaginationConfiguration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SQSPaginationConfiguration] (val x: Self) extends AnyVal {
      
      inline def setClient(value: SQSClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    }
  }
}
