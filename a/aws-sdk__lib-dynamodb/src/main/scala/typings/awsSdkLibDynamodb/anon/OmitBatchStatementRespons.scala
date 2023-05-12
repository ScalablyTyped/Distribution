package typings.awsSdkLibDynamodb.anon

import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.BatchStatementError
import typings.awsSdkUtilDynamodb.distTypesModelsMod.NativeAttributeValue
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.BatchStatementResponse, 'Item'> & {  Item :std.Record<string, @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue> | undefined} */
trait OmitBatchStatementRespons extends StObject {
  
  var Error: js.UndefOr[BatchStatementError] = js.undefined
  
  var Item: js.UndefOr[Record[String, NativeAttributeValue]] = js.undefined
  
  var TableName: js.UndefOr[String] = js.undefined
}
object OmitBatchStatementRespons {
  
  inline def apply(): OmitBatchStatementRespons = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitBatchStatementRespons]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitBatchStatementRespons] (val x: Self) extends AnyVal {
    
    inline def setError(value: BatchStatementError): Self = StObject.set(x, "Error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "Error", js.undefined)
    
    inline def setItem(value: Record[String, NativeAttributeValue]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
    
    inline def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
  }
}
