package typings.awsSdk.cloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoveTagsFromResourceRequest extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the AWS CloudHSM resource.
    */
  var ResourceArn: String = js.native
  
  /**
    * The tag key or keys to remove. Specify only the tag key to remove (not the value). To overwrite the value for an existing tag, use AddTagsToResource.
    */
  var TagKeyList: typings.awsSdk.cloudhsmMod.TagKeyList = js.native
}
object RemoveTagsFromResourceRequest {
  
  @scala.inline
  def apply(ResourceArn: String, TagKeyList: TagKeyList): RemoveTagsFromResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], TagKeyList = TagKeyList.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveTagsFromResourceRequest]
  }
  
  @scala.inline
  implicit class RemoveTagsFromResourceRequestOps[Self <: RemoveTagsFromResourceRequest] (val x: Self) extends AnyVal {
    
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
    def setResourceArn(value: String): Self = this.set("ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeyListVarargs(value: TagKey*): Self = this.set("TagKeyList", js.Array(value :_*))
    
    @scala.inline
    def setTagKeyList(value: TagKeyList): Self = this.set("TagKeyList", value.asInstanceOf[js.Any])
  }
}
