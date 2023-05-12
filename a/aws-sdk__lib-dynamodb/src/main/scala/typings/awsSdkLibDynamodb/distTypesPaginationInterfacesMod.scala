package typings.awsSdkLibDynamodb

import typings.awsSdkLibDynamodb.distTypesDynamoDBDocumentClientMod.DynamoDBDocumentClient
import typings.awsSdkLibDynamodb.distTypesDynamoDBDocumentMod.DynamoDBDocument
import typings.awsSdkTypes.distTypesPaginationMod.PaginationConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPaginationInterfacesMod {
  
  trait DynamoDBDocumentPaginationConfiguration
    extends StObject
       with PaginationConfiguration {
    
    @JSName("client")
    var client_DynamoDBDocumentPaginationConfiguration: DynamoDBDocument | DynamoDBDocumentClient
  }
  object DynamoDBDocumentPaginationConfiguration {
    
    inline def apply(client: DynamoDBDocument | DynamoDBDocumentClient): DynamoDBDocumentPaginationConfiguration = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
      __obj.asInstanceOf[DynamoDBDocumentPaginationConfiguration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DynamoDBDocumentPaginationConfiguration] (val x: Self) extends AnyVal {
      
      inline def setClient(value: DynamoDBDocument | DynamoDBDocumentClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    }
  }
}
