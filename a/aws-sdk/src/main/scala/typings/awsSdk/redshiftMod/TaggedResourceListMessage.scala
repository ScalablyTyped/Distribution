package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaggedResourceListMessage extends StObject {
  
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * A list of tags with their associated resources.
    */
  var TaggedResources: js.UndefOr[TaggedResourceList] = js.undefined
}
object TaggedResourceListMessage {
  
  inline def apply(): TaggedResourceListMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaggedResourceListMessage]
  }
  
  extension [Self <: TaggedResourceListMessage](x: Self) {
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setTaggedResources(value: TaggedResourceList): Self = StObject.set(x, "TaggedResources", value.asInstanceOf[js.Any])
    
    inline def setTaggedResourcesUndefined: Self = StObject.set(x, "TaggedResources", js.undefined)
    
    inline def setTaggedResourcesVarargs(value: TaggedResource*): Self = StObject.set(x, "TaggedResources", js.Array(value :_*))
  }
}
