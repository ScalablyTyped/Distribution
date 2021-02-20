package typings.awsSdk.cloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListFieldLevelEncryptionProfilesRequest extends StObject {
  
  /**
    * Use this when paginating results to indicate where to begin in your list of profiles. The results include profiles in the list that occur after the marker. To get the next page of results, set the Marker to the value of the NextMarker from the current page's response (which is also the ID of the last profile on that page). 
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    * The maximum number of field-level encryption profiles you want in the response body. 
    */
  var MaxItems: js.UndefOr[String] = js.native
}
object ListFieldLevelEncryptionProfilesRequest {
  
  @scala.inline
  def apply(): ListFieldLevelEncryptionProfilesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListFieldLevelEncryptionProfilesRequest]
  }
  
  @scala.inline
  implicit class ListFieldLevelEncryptionProfilesRequestMutableBuilder[Self <: ListFieldLevelEncryptionProfilesRequest] (val x: Self) extends AnyVal {
    
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
