package typings.awsSdk.clientsWafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForResourceResponse extends StObject {
  
  /**
    * 
    */
  var NextMarker: js.UndefOr[typings.awsSdk.clientsWafregionalMod.NextMarker] = js.undefined
  
  /**
    * 
    */
  var TagInfoForResource: js.UndefOr[typings.awsSdk.clientsWafregionalMod.TagInfoForResource] = js.undefined
}
object ListTagsForResourceResponse {
  
  inline def apply(): ListTagsForResourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTagsForResourceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListTagsForResourceResponse] (val x: Self) extends AnyVal {
    
    inline def setNextMarker(value: NextMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    inline def setTagInfoForResource(value: TagInfoForResource): Self = StObject.set(x, "TagInfoForResource", value.asInstanceOf[js.Any])
    
    inline def setTagInfoForResourceUndefined: Self = StObject.set(x, "TagInfoForResource", js.undefined)
  }
}
