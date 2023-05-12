package typings.awsSdkLibDynamodb.anon

import typings.awsSdkUtilDynamodb.distTypesModelsMod.NativeAttributeValue
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.Get, 'Key'> & {  Key :std.Record<string, @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue> | undefined} */
trait OmitGetKeyKeyRecordstring extends StObject {
  
  var ExpressionAttributeNames: js.UndefOr[Record[String, String]] = js.undefined
  
  var Key: js.UndefOr[Record[String, NativeAttributeValue]] = js.undefined
  
  var ProjectionExpression: js.UndefOr[String] = js.undefined
  
  var TableName: js.UndefOr[String] = js.undefined
}
object OmitGetKeyKeyRecordstring {
  
  inline def apply(): OmitGetKeyKeyRecordstring = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitGetKeyKeyRecordstring]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitGetKeyKeyRecordstring] (val x: Self) extends AnyVal {
    
    inline def setExpressionAttributeNames(value: Record[String, String]): Self = StObject.set(x, "ExpressionAttributeNames", value.asInstanceOf[js.Any])
    
    inline def setExpressionAttributeNamesUndefined: Self = StObject.set(x, "ExpressionAttributeNames", js.undefined)
    
    inline def setKey(value: Record[String, NativeAttributeValue]): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setProjectionExpression(value: String): Self = StObject.set(x, "ProjectionExpression", value.asInstanceOf[js.Any])
    
    inline def setProjectionExpressionUndefined: Self = StObject.set(x, "ProjectionExpression", js.undefined)
    
    inline def setTableName(value: String): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
  }
}
