package typings.awsSdkLibDynamodb.anon

import typings.awsSdkUtilDynamodb.distTypesModelsMod.NativeAttributeValue
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<@aws-sdk/client-dynamodb.@aws-sdk/client-dynamodb.ItemCollectionMetrics, 'ItemCollectionKey'> & {  ItemCollectionKey :std.Record<string, @aws-sdk/util-dynamodb.@aws-sdk/util-dynamodb.NativeAttributeValue> | undefined} */
trait OmitItemCollectionMetrics extends StObject {
  
  var ItemCollectionKey: js.UndefOr[Record[String, NativeAttributeValue]] = js.undefined
  
  var SizeEstimateRangeGB: js.UndefOr[js.Array[Double]] = js.undefined
}
object OmitItemCollectionMetrics {
  
  inline def apply(): OmitItemCollectionMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitItemCollectionMetrics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OmitItemCollectionMetrics] (val x: Self) extends AnyVal {
    
    inline def setItemCollectionKey(value: Record[String, NativeAttributeValue]): Self = StObject.set(x, "ItemCollectionKey", value.asInstanceOf[js.Any])
    
    inline def setItemCollectionKeyUndefined: Self = StObject.set(x, "ItemCollectionKey", js.undefined)
    
    inline def setSizeEstimateRangeGB(value: js.Array[Double]): Self = StObject.set(x, "SizeEstimateRangeGB", value.asInstanceOf[js.Any])
    
    inline def setSizeEstimateRangeGBUndefined: Self = StObject.set(x, "SizeEstimateRangeGB", js.undefined)
    
    inline def setSizeEstimateRangeGBVarargs(value: Double*): Self = StObject.set(x, "SizeEstimateRangeGB", js.Array(value*))
  }
}
