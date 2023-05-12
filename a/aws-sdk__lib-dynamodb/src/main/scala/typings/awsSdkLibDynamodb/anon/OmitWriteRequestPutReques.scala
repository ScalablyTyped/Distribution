package typings.awsSdkLibDynamodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.WriteRequest, 'PutRequest' | 'DeleteRequest'> & {  PutRequest :std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.PutRequest, 'Item'> & {  Item :std.Record<string, @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue> | undefined} | undefined,   DeleteRequest :std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.DeleteRequest, 'Key'> & {  Key :std.Record<string, @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue> | undefined} | undefined} */
trait OmitWriteRequestPutReques extends StObject {
  
  var DeleteRequest: js.UndefOr[OmitDeleteRequestKeyKeyRe] = js.undefined
  
  var PutRequest: js.UndefOr[OmitPutRequestItemItemRec] = js.undefined
}
object OmitWriteRequestPutReques {
  
  inline def apply(): OmitWriteRequestPutReques = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitWriteRequestPutReques]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitWriteRequestPutReques] (val x: Self) extends AnyVal {
    
    inline def setDeleteRequest(value: OmitDeleteRequestKeyKeyRe): Self = StObject.set(x, "DeleteRequest", value.asInstanceOf[js.Any])
    
    inline def setDeleteRequestUndefined: Self = StObject.set(x, "DeleteRequest", js.undefined)
    
    inline def setPutRequest(value: OmitPutRequestItemItemRec): Self = StObject.set(x, "PutRequest", value.asInstanceOf[js.Any])
    
    inline def setPutRequestUndefined: Self = StObject.set(x, "PutRequest", js.undefined)
  }
}
