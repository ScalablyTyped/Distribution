package typings.awsSdkLibDynamodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.TransactWriteItem, 'ConditionCheck' | 'Put' | 'Delete' | 'Update'> & {  ConditionCheck :std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.ConditionCheck, 'Key' | 'ExpressionAttributeValues'> & {  Key :std.Record<string, @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue> | undefined,   ExpressionAttributeValues :std.Record<string, @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue> | undefined} | undefined,   Put :std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.Put, 'Item' | 'ExpressionAttributeValues'> & {  Item :std.Record<string, @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue> | undefined,   ExpressionAttributeValues :std.Record<string, @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue> | undefined} | undefined,   Delete :std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.Delete, 'Key' | 'ExpressionAttributeValues'> & {  Key :std.Record<string, @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue> | undefined,   ExpressionAttributeValues :std.Record<string, @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue> | undefined} | undefined,   Update :std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.Update, 'Key' | 'ExpressionAttributeValues'> & {  Key :std.Record<string, @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue> | undefined,   ExpressionAttributeValues :std.Record<string, @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue> | undefined} | undefined} */
trait OmitTransactWriteItemCond extends StObject {
  
  var ConditionCheck: js.UndefOr[OmitConditionCheckKeyExpr] = js.undefined
  
  var Delete: js.UndefOr[OmitDeleteKeyExpressionAt] = js.undefined
  
  var Put: js.UndefOr[OmitPutItemExpressionAttr] = js.undefined
  
  var Update: js.UndefOr[OmitUpdateKeyExpressionAt] = js.undefined
}
object OmitTransactWriteItemCond {
  
  inline def apply(): OmitTransactWriteItemCond = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitTransactWriteItemCond]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitTransactWriteItemCond] (val x: Self) extends AnyVal {
    
    inline def setConditionCheck(value: OmitConditionCheckKeyExpr): Self = StObject.set(x, "ConditionCheck", value.asInstanceOf[js.Any])
    
    inline def setConditionCheckUndefined: Self = StObject.set(x, "ConditionCheck", js.undefined)
    
    inline def setDelete(value: OmitDeleteKeyExpressionAt): Self = StObject.set(x, "Delete", value.asInstanceOf[js.Any])
    
    inline def setDeleteUndefined: Self = StObject.set(x, "Delete", js.undefined)
    
    inline def setPut(value: OmitPutItemExpressionAttr): Self = StObject.set(x, "Put", value.asInstanceOf[js.Any])
    
    inline def setPutUndefined: Self = StObject.set(x, "Put", js.undefined)
    
    inline def setUpdate(value: OmitUpdateKeyExpressionAt): Self = StObject.set(x, "Update", value.asInstanceOf[js.Any])
    
    inline def setUpdateUndefined: Self = StObject.set(x, "Update", js.undefined)
  }
}
