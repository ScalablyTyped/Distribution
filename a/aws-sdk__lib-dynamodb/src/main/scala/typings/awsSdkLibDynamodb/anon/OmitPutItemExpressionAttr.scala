package typings.awsSdkLibDynamodb.anon

import typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ReturnValuesOnConditionCheckFailure
import typings.awsSdkUtilDynamodb.distTypesModelsMod.NativeAttributeValue
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.Put, 'Item' | 'ExpressionAttributeValues'> & {  Item :std.Record<string, @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue> | undefined,   ExpressionAttributeValues :std.Record<string, @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue> | undefined} */
trait OmitPutItemExpressionAttr extends StObject {
  
  var ConditionExpression: js.UndefOr[String] = js.undefined
  
  var ExpressionAttributeNames: js.UndefOr[Record[String, String]] = js.undefined
  
  var ExpressionAttributeValues: js.UndefOr[Record[String, NativeAttributeValue]] = js.undefined
  
  var Item: js.UndefOr[Record[String, NativeAttributeValue]] = js.undefined
  
  var ReturnValuesOnConditionCheckFailure: js.UndefOr[
    typings.awsSdkClientDynamodb.distTypesModelsModels0Mod.ReturnValuesOnConditionCheckFailure | String
  ] = js.undefined
  
  var TableName: js.UndefOr[String] = js.undefined
}
object OmitPutItemExpressionAttr {
  
  inline def apply(): OmitPutItemExpressionAttr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitPutItemExpressionAttr]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitPutItemExpressionAttr] (val x: Self) extends AnyVal {
    
    inline def setConditionExpression(value: String): Self = StObject.set(x, "ConditionExpression", value.asInstanceOf[js.Any])
    
    inline def setConditionExpressionUndefined: Self = StObject.set(x, "ConditionExpression", js.undefined)
    
    inline def setExpressionAttributeNames(value: Record[String, String]): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
    
    inline def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
    
    inline def setExpressionAttributeValues(value: Record[String, NativeAttributeValue]): Self = StObject.set(x, "ExpressionAttributeValues", value.asInstanceOf[js.Any])
    
    inline def setExpressionAttributeValuesUndefined: Self = StObject.set(x, "ExpressionAttributeValues", js.undefined)
    
    inline def setItem(value: Record[String, NativeAttributeValue]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
    
    inline def setReturnValuesOnConditionCheckFailure(value: ReturnValuesOnConditionCheckFailure | String): Self = StObject.set(x, "ReturnValuesOnConditionCheckFailure", value.asInstanceOf[js.Any])
    
    inline def setReturnValuesOnConditionCheckFailureUndefined: Self = StObject.set(x, "ReturnValuesOnConditionCheckFailure", js.undefined)
    
    inline def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
  }
}
