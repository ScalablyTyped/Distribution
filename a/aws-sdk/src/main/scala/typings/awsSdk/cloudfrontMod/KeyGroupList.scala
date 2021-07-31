package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyGroupList extends StObject {
  
  /**
    * A list of key groups.
    */
  var Items: js.UndefOr[KeyGroupSummaryList] = js.undefined
  
  /**
    * The maximum number of key groups requested.
    */
  var MaxItems: integer
  
  /**
    * If there are more items in the list than are in this response, this element is present. It contains the value that you should use in the Marker field of a subsequent request to continue listing key groups.
    */
  var NextMarker: js.UndefOr[String] = js.undefined
  
  /**
    * The number of key groups returned in the response.
    */
  var Quantity: integer
}
object KeyGroupList {
  
  @scala.inline
  def apply(MaxItems: integer, Quantity: integer): KeyGroupList = {
    val __obj = js.Dynamic.literal(MaxItems = MaxItems.asInstanceOf[js.Any], Quantity = Quantity.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyGroupList]
  }
  
  @scala.inline
  implicit class KeyGroupListMutableBuilder[Self <: KeyGroupList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: KeyGroupSummaryList): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: KeyGroupSummary*): Self = StObject.set(x, "Items", js.Array(value :_*))
    
    @scala.inline
    def setMaxItems(value: integer): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarker(value: String): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    @scala.inline
    def setQuantity(value: integer): Self = StObject.set(x, "Quantity", value.asInstanceOf[js.Any])
  }
}
