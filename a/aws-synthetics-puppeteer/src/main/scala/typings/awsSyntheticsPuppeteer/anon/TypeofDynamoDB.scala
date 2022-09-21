package typings.awsSyntheticsPuppeteer.anon

import org.scalablytyped.runtime.Instantiable0
import typings.awsSdk.mod.DynamoDB.DocumentClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofDynamoDB extends StObject {
  
  val Converter: TypeofConverter
  
  val DocumentClient: Instantiable0[typings.awsSdk.mod.DynamoDB.DocumentClient]
  
  val Types: this.type
}
object TypeofDynamoDB {
  
  inline def apply(Converter: TypeofConverter, DocumentClient: Instantiable0[DocumentClient], Types: TypeofDynamoDB): TypeofDynamoDB = {
    val __obj = js.Dynamic.literal(Converter = Converter.asInstanceOf[js.Any], DocumentClient = DocumentClient.asInstanceOf[js.Any], Types = Types.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofDynamoDB]
  }
  
  extension [Self <: TypeofDynamoDB](x: Self) {
    
    inline def setConverter(value: TypeofConverter): Self = StObject.set(x, "Converter", value.asInstanceOf[js.Any])
    
    inline def setDocumentClient(value: Instantiable0[DocumentClient]): Self = StObject.set(x, "DocumentClient", value.asInstanceOf[js.Any])
    
    inline def setTypes(value: TypeofDynamoDB): Self = StObject.set(x, "Types", value.asInstanceOf[js.Any])
  }
}
