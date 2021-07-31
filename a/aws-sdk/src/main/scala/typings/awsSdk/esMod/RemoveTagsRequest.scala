package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveTagsRequest extends StObject {
  
  /**
    * Specifies the ARN for the Elasticsearch domain from which you want to delete the specified tags.
    */
  var ARN: typings.awsSdk.esMod.ARN
  
  /**
    * Specifies the TagKey list which you want to remove from the Elasticsearch domain.
    */
  var TagKeys: StringList
}
object RemoveTagsRequest {
  
  @scala.inline
  def apply(ARN: ARN, TagKeys: StringList): RemoveTagsRequest = {
    val __obj = js.Dynamic.literal(ARN = ARN.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveTagsRequest]
  }
  
  @scala.inline
  implicit class RemoveTagsRequestMutableBuilder[Self <: RemoveTagsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setARN(value: ARN): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeys(value: StringList): Self = StObject.set(x, "TagKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeysVarargs(value: String*): Self = StObject.set(x, "TagKeys", js.Array(value :_*))
  }
}
