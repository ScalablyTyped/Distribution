package typings.awsSdk.kmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCustomKeyStoresResponse extends StObject {
  
  /**
    * Contains metadata about each custom key store.
    */
  var CustomKeyStores: js.UndefOr[CustomKeyStoresList] = js.undefined
  
  /**
    * When Truncated is true, this element is present and contains the value to use for the Marker parameter in a subsequent request.
    */
  var NextMarker: js.UndefOr[MarkerType] = js.undefined
  
  /**
    * A flag that indicates whether there are more items in the list. When this value is true, the list in this response is truncated. To get more items, pass the value of the NextMarker element in thisresponse to the Marker parameter in a subsequent request.
    */
  var Truncated: js.UndefOr[BooleanType] = js.undefined
}
object DescribeCustomKeyStoresResponse {
  
  inline def apply(): DescribeCustomKeyStoresResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCustomKeyStoresResponse]
  }
  
  extension [Self <: DescribeCustomKeyStoresResponse](x: Self) {
    
    inline def setCustomKeyStores(value: CustomKeyStoresList): Self = StObject.set(x, "CustomKeyStores", value.asInstanceOf[js.Any])
    
    inline def setCustomKeyStoresUndefined: Self = StObject.set(x, "CustomKeyStores", js.undefined)
    
    inline def setCustomKeyStoresVarargs(value: CustomKeyStoresListEntry*): Self = StObject.set(x, "CustomKeyStores", js.Array(value :_*))
    
    inline def setNextMarker(value: MarkerType): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    inline def setTruncated(value: BooleanType): Self = StObject.set(x, "Truncated", value.asInstanceOf[js.Any])
    
    inline def setTruncatedUndefined: Self = StObject.set(x, "Truncated", js.undefined)
  }
}
