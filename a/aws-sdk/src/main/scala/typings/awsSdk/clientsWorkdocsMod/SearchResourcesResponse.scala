package typings.awsSdk.clientsWorkdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchResourcesResponse extends StObject {
  
  /**
    * List of Documents, Folders, Comments, and Document Versions matching the query.
    */
  var Items: js.UndefOr[ResponseItemsList] = js.undefined
  
  /**
    * The marker to use when requesting the next set of results. If there are no additional results, the string is empty.
    */
  var Marker: js.UndefOr[NextMarkerType] = js.undefined
}
object SearchResourcesResponse {
  
  inline def apply(): SearchResourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchResourcesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchResourcesResponse] (val x: Self) extends AnyVal {
    
    inline def setItems(value: ResponseItemsList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: ResponseItem*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setMarker(value: NextMarkerType): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
