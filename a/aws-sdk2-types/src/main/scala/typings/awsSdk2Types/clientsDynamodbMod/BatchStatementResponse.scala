package typings.awsSdk2Types.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchStatementResponse extends StObject {
  
  /**
    *  The error associated with a failed PartiQL batch statement. 
    */
  var Error: js.UndefOr[BatchStatementError] = js.undefined
  
  /**
    *  A DynamoDB item associated with a BatchStatementResponse 
    */
  var Item: js.UndefOr[AttributeMap] = js.undefined
  
  /**
    *  The table name associated with a failed PartiQL batch statement. 
    */
  var TableName: js.UndefOr[typings.awsSdk2Types.clientsDynamodbMod.TableName] = js.undefined
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
    
    inline def setItem(value: AttributeMap): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
    
    inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
  }
}
