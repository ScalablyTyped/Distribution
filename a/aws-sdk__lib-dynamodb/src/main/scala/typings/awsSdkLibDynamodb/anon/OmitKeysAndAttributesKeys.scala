package typings.awsSdkLibDynamodb.anon

import typings.awsSdkUtilDynamodb.distTypesModelsMod.NativeAttributeValue
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.KeysAndAttributes, 'Keys'> & {  Keys :std.Array<std.Record<string, @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue>> | undefined} */
trait OmitKeysAndAttributesKeys extends StObject {
  
  var AttributesToGet: js.UndefOr[js.Array[String]] = js.undefined
  
  var ConsistentRead: js.UndefOr[Boolean] = js.undefined
  
  var ExpressionAttributeNames: js.UndefOr[Record[String, String]] = js.undefined
  
  var Keys: js.UndefOr[js.Array[Record[String, NativeAttributeValue]]] = js.undefined
  
  var ProjectionExpression: js.UndefOr[String] = js.undefined
}
object OmitKeysAndAttributesKeys {
  
  inline def apply(): OmitKeysAndAttributesKeys = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitKeysAndAttributesKeys]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitKeysAndAttributesKeys] (val x: Self) extends AnyVal {
    
    inline def setAttributesToGet(value: js.Array[String]): Self = StObject.set(x, "AttributesToGet", value.asInstanceOf[js.Any])
    
    inline def setAttributesToGetUndefined: Self = StObject.set(x, "AttributesToGet", js.undefined)
    
    inline def setAttributesToGetVarargs(value: String*): Self = StObject.set(x, "AttributesToGet", js.Array(value*))
    
    inline def setConsistentRead(value: Boolean): Self = StObject.set(x, "ConsistentRead", value.asInstanceOf[js.Any])
    
    inline def setConsistentReadUndefined: Self = StObject.set(x, "ConsistentRead", js.undefined)
    
    inline def setExpressionAttributeNames(value: Record[String, String]): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
    
    inline def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
    
    inline def setKeys(value: js.Array[Record[String, NativeAttributeValue]]): Self = StObject.set(x, "Keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "Keys", js.undefined)
    
    inline def setKeysVarargs(value: (Record[String, NativeAttributeValue])*): Self = StObject.set(x, "Keys", js.Array(value*))
    
    inline def setProjectionExpression(value: String): Self = StObject.set(x, "ProjectionExpression", value.asInstanceOf[js.Any])
    
    inline def setProjectionExpressionUndefined: Self = StObject.set(x, "ProjectionExpression", js.undefined)
  }
}
