package typings.awsSdk.daxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagResourceResponse extends StObject {
  
  /**
    * The tag keys that have been removed from the cluster.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object UntagResourceResponse {
  
  inline def apply(): UntagResourceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UntagResourceResponse]
  }
  
  extension [Self <: UntagResourceResponse](x: Self) {
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
