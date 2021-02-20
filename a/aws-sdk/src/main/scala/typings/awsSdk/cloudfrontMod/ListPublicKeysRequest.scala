package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPublicKeysRequest extends StObject {
  
  /**
    * Use this when paginating results to indicate where to begin in your list of public keys. The results include public keys in the list that occur after the marker. To get the next page of results, set the Marker to the value of the NextMarker from the current page's response (which is also the ID of the last public key on that page). 
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of public keys you want in the response body. 
    */
  var MaxItems: js.UndefOr[String] = js.native
}
object ListPublicKeysRequest {
  
  @scala.inline
  def apply(): ListPublicKeysRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPublicKeysRequest]
  }
  
  @scala.inline
  implicit class ListPublicKeysRequestMutableBuilder[Self <: ListPublicKeysRequest] (val x: Self) extends AnyVal {
    
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
