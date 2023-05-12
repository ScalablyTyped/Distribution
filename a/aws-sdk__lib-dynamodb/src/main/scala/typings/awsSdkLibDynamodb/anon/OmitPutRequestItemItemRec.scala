package typings.awsSdkLibDynamodb.anon

import typings.awsSdkUtilDynamodb.distTypesModelsMod.NativeAttributeValue
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.PutRequest, 'Item'> & {  Item :std.Record<string, @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue> | undefined} */
trait OmitPutRequestItemItemRec extends StObject {
  
  var Item: js.UndefOr[Record[String, NativeAttributeValue]] = js.undefined
}
object OmitPutRequestItemItemRec {
  
  inline def apply(): OmitPutRequestItemItemRec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitPutRequestItemItemRec]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitPutRequestItemItemRec] (val x: Self) extends AnyVal {
    
    inline def setItem(value: Record[String, NativeAttributeValue]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    
    inline def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
  }
}
