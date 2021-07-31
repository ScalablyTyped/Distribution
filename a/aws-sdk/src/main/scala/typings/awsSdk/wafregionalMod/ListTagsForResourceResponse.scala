package typings.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceResponse extends StObject {
  
  /**
    * 
    */
  var NextMarker: js.UndefOr[typings.awsSdk.wafregionalMod.NextMarker] = js.undefined
  
  /**
    * 
    */
  var TagInfoForResource: js.UndefOr[typings.awsSdk.wafregionalMod.TagInfoForResource] = js.undefined
}
object ListTagsForResourceResponse {
  
  @scala.inline
  def apply(): ListTagsForResourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagsForResourceResponse]
  }
  
  @scala.inline
  implicit class ListTagsForResourceResponseMutableBuilder[Self <: ListTagsForResourceResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextMarker(value: NextMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    @scala.inline
    def setTagInfoForResource(value: TagInfoForResource): Self = StObject.set(x, "TagInfoForResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagInfoForResourceUndefined: Self = StObject.set(x, "TagInfoForResource", js.undefined)
  }
}
