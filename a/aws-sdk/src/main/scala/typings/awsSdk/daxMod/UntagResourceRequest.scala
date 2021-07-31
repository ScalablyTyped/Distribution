package typings.awsSdk.daxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UntagResourceRequest extends StObject {
  
  /**
    * The name of the DAX resource from which the tags should be removed.
    */
  var ResourceName: String
  
  /**
    * A list of tag keys. If the DAX cluster has any tags with these keys, then the tags are removed from the cluster.
    */
  var TagKeys: KeyList
}
object UntagResourceRequest {
  
  @scala.inline
  def apply(ResourceName: String, TagKeys: KeyList): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceName = ResourceName.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceRequest]
  }
  
  @scala.inline
  implicit class UntagResourceRequestMutableBuilder[Self <: UntagResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResourceName(value: String): Self = StObject.set(x, "ResourceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeys(value: KeyList): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeysVarargs(value: String*): Self = StObject.set(x, "TagKeys", js.Array(value :_*))
  }
}
