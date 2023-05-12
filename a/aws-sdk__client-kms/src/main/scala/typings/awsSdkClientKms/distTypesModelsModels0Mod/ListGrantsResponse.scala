package typings.awsSdkClientKms.distTypesModelsModels0Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGrantsResponse extends StObject {
  
  /**
    * <p>A list of grants.</p>
    */
  var Grants: js.UndefOr[js.Array[GrantListEntry]] = js.undefined
  
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
object ListGrantsResponse {
  
  inline def apply(): ListGrantsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGrantsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListGrantsResponse] (val x: Self) extends AnyVal {
    
    inline def setGrants(value: js.Array[GrantListEntry]): Self = StObject.set(x, "Grants", value.asInstanceOf[js.Any])
    
    inline def setGrantsUndefined: Self = StObject.set(x, "Grants", js.undefined)
    
    inline def setGrantsVarargs(value: GrantListEntry*): Self = StObject.set(x, "Grants", js.Array(value*))
    
    inline def setNextMarker(value: String): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    inline def setTruncated(value: Boolean): Self = StObject.set(x, "Truncated", value.asInstanceOf[js.Any])
    
    inline def setTruncatedUndefined: Self = StObject.set(x, "Truncated", js.undefined)
  }
}
