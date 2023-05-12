package typings.awsSdkLibDynamodb.anon

import typings.awsSdkUtilDynamodb.distTypesModelsMod.NativeAttributeValue
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.DeleteRequest, 'Key'> & {  Key :std.Record<string, @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue> | undefined} */
trait OmitDeleteRequestKeyKeyRe extends StObject {
  
  var Key: js.UndefOr[Record[String, NativeAttributeValue]] = js.undefined
}
object OmitDeleteRequestKeyKeyRe {
  
  inline def apply(): OmitDeleteRequestKeyKeyRe = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitDeleteRequestKeyKeyRe]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitDeleteRequestKeyKeyRe] (val x: Self) extends AnyVal {
    
    inline def setKey(value: Record[String, NativeAttributeValue]): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
  }
}
