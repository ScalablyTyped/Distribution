package typings.awsSdkLibDynamodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.TransactGetItem, 'Get'> & {  Get :std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.Get, 'Key'> & {  Key :std.Record<string, @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue> | undefined} | undefined} */
trait OmitTransactGetItemGetGet extends StObject {
  
  var Get: js.UndefOr[OmitGetKeyKeyRecordstring] = js.undefined
}
object OmitTransactGetItemGetGet {
  
  inline def apply(): OmitTransactGetItemGetGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitTransactGetItemGetGet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitTransactGetItemGetGet] (val x: Self) extends AnyVal {
    
    inline def setGet(value: OmitGetKeyKeyRecordstring): Self = StObject.set(x, "Get", value.asInstanceOf[js.Any])
    
    inline def setGetUndefined: Self = StObject.set(x, "Get", js.undefined)
  }
}
