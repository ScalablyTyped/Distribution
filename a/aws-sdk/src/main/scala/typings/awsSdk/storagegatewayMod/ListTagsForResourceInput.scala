package typings.awsSdk.storagegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceInput extends StObject {
  
  /**
    * Specifies that the list of tags returned be limited to the specified number of items.
    */
  var Limit: js.UndefOr[PositiveIntObject] = js.undefined
  
  /**
    * An opaque string that indicates the position at which to begin returning the list of tags.
    */
  var Marker: js.UndefOr[typings.awsSdk.storagegatewayMod.Marker] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the resource for which you want to list tags.
    */
  var ResourceARN: typings.awsSdk.storagegatewayMod.ResourceARN
}
object ListTagsForResourceInput {
  
  @scala.inline
  def apply(ResourceARN: ResourceARN): ListTagsForResourceInput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForResourceInput]
  }
  
  @scala.inline
  implicit class ListTagsForResourceInputMutableBuilder[Self <: ListTagsForResourceInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: PositiveIntObject): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setMarker(value: Marker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setResourceARN(value: ResourceARN): Self = StObject.set(x, "ResourceARN", value.asInstanceOf[js.Any])
  }
}
