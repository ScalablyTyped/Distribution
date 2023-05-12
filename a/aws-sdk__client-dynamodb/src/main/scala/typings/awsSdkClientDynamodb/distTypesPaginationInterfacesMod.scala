package typings.awsSdkClientDynamodb

import typings.awsSdkClientDynamodb.distTypesDynamoDBClientMod.DynamoDBClient
import typings.awsSdkTypes.distTypesPaginationMod.PaginationConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPaginationInterfacesMod {
  
  trait DynamoDBPaginationConfiguration
    extends StObject
       with PaginationConfiguration {
    
    @JSName("client")
    var client_DynamoDBPaginationConfiguration: DynamoDBClient
  }
  object DynamoDBPaginationConfiguration {
    
    inline def apply(client: DynamoDBClient): DynamoDBPaginationConfiguration = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
      __obj.asInstanceOf[DynamoDBPaginationConfiguration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DynamoDBPaginationConfiguration] (val x: Self) extends AnyVal {
      
      inline def setClient(value: DynamoDBClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    }
  }
}
