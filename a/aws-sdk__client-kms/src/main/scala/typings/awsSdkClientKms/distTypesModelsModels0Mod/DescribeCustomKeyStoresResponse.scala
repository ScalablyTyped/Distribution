package typings.awsSdkClientKms.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCustomKeyStoresResponse extends StObject {
  
  /**
    * <p>Contains metadata about each custom key store.</p>
    */
  var CustomKeyStores: js.UndefOr[js.Array[CustomKeyStoresListEntry]] = js.undefined
  
  /**
    * <p>When <code>Truncated</code> is true, this element is present and contains the
    *     value to use for the <code>Marker</code> parameter in a subsequent request.</p>
    */
  var NextMarker: js.UndefOr[String] = js.undefined
  
  /**
    * <p>A flag that indicates whether there are more items in the list. When this
    *     value is true, the list in this response is truncated. To get more items, pass the value of
    *     the <code>NextMarker</code> element in thisresponse to the <code>Marker</code> parameter in a
    *     subsequent request.</p>
    */
  var Truncated: js.UndefOr[Boolean] = js.undefined
}
object DescribeCustomKeyStoresResponse {
  
  inline def apply(): DescribeCustomKeyStoresResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCustomKeyStoresResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeCustomKeyStoresResponse] (val x: Self) extends AnyVal {
    
    inline def setCustomKeyStores(value: js.Array[CustomKeyStoresListEntry]): Self = StObject.set(x, "CustomKeyStores", value.asInstanceOf[js.Any])
    
    inline def setCustomKeyStoresUndefined: Self = StObject.set(x, "CustomKeyStores", js.undefined)
    
    inline def setCustomKeyStoresVarargs(value: CustomKeyStoresListEntry*): Self = StObject.set(x, "CustomKeyStores", js.Array(value*))
    
    inline def setNextMarker(value: String): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    inline def setTruncated(value: Boolean): Self = StObject.set(x, "Truncated", value.asInstanceOf[js.Any])
    
    inline def setTruncatedUndefined: Self = StObject.set(x, "Truncated", js.undefined)
  }
}
