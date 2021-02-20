package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaggedResourceListMessage extends StObject {
  
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
    */
  var Marker: js.UndefOr[String] = js.native
  
  /**
    * A list of tags with their associated resources.
    */
  var TaggedResources: js.UndefOr[TaggedResourceList] = js.native
}
object TaggedResourceListMessage {
  
  @scala.inline
  def apply(): TaggedResourceListMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaggedResourceListMessage]
  }
  
  @scala.inline
  implicit class TaggedResourceListMessageMutableBuilder[Self <: TaggedResourceListMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setTaggedResources(value: TaggedResourceList): Self = StObject.set(x, "TaggedResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaggedResourcesUndefined: Self = StObject.set(x, "TaggedResources", js.undefined)
    
    @scala.inline
    def setTaggedResourcesVarargs(value: TaggedResource*): Self = StObject.set(x, "TaggedResources", js.Array(value :_*))
  }
}
