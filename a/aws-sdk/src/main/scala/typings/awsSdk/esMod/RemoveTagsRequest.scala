package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveTagsRequest extends js.Object {
  
  /**
    * Specifies the ARN for the Elasticsearch domain from which you want to delete the specified tags.
    */
  var ARN: typings.awsSdk.esMod.ARN = js.native
  
  /**
    * Specifies the TagKey list which you want to remove from the Elasticsearch domain.
    */
  var TagKeys: StringList = js.native
}
object RemoveTagsRequest {
  
  @scala.inline
  def apply(ARN: ARN, TagKeys: StringList): RemoveTagsRequest = {
    val __obj = js.Dynamic.literal(ARN = ARN.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveTagsRequest]
  }
  
  @scala.inline
  implicit class RemoveTagsRequestOps[Self <: RemoveTagsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setARN(value: ARN): Self = this.set("ARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeysVarargs(value: String*): Self = this.set("TagKeys", js.Array(value :_*))
    
    @scala.inline
    def setTagKeys(value: StringList): Self = this.set("TagKeys", value.asInstanceOf[js.Any])
  }
}
