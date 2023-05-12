package typings.awsSdkClientDynamodb.distTypesModelsModels0Mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchStatementResponse extends StObject {
  
  /**
    * <p> The error associated with a failed PartiQL batch statement. </p>
    */
  var Error: js.UndefOr[BatchStatementError] = js.undefined
  
  /**
    * <p> A DynamoDB item associated with a BatchStatementResponse </p>
    */
  var Item: js.UndefOr[Record[String, AttributeValue]] = js.undefined
  
  /**
    * <p> The table name associated with a failed PartiQL batch statement. </p>
    */
  var TableName: js.UndefOr[String] = js.undefined
}
object BatchStatementResponse {
  
  inline def apply(): BatchStatementResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchStatementResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchStatementResponse] (val x: Self) extends AnyVal {
    
    inline def setError(value: BatchStatementError): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
    
    inline def setItem(value: Record[String, AttributeValue]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
    
    inline def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
  }
}
