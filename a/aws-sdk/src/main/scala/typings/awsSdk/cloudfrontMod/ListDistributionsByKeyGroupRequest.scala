package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDistributionsByKeyGroupRequest extends StObject {
  
  /**
    * The ID of the key group whose associated distribution IDs you are listing.
    */
  var KeyGroupId: String = js.native
  
  /**
    * Use this field when paginating results to indicate where to begin in your list of distribution IDs. The response includes distribution IDs in the list that occur after the marker. To get the next page of the list, set this field’s value to the value of NextMarker from the current page’s response.
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of distribution IDs that you want in the response.
    */
  var MaxItems: js.UndefOr[String] = js.native
}
object ListDistributionsByKeyGroupRequest {
  
  @scala.inline
  def apply(KeyGroupId: String): ListDistributionsByKeyGroupRequest = {
    val __obj = js.Dynamic.literal(KeyGroupId = KeyGroupId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDistributionsByKeyGroupRequest]
  }
  
  @scala.inline
  implicit class ListDistributionsByKeyGroupRequestMutableBuilder[Self <: ListDistributionsByKeyGroupRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyGroupId(value: String): Self = StObject.set(x, "KeyGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setMaxItems(value: String): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
  }
}
