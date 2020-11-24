package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UntagResourceRequest extends js.Object {
  
  /**
    * The ID of the resource to remove a tag from. You can specify any of the following taggable resources.   AWS account – specify the account ID number.   Organizational unit – specify the OU ID that begins with ou- and looks similar to: ou-1a2b-34uvwxyz     Root – specify the root ID that begins with r- and looks similar to: r-1a2b     Policy – specify the policy ID that begins with p- andlooks similar to: p-12abcdefg3    
    */
  var ResourceId: TaggableResourceId = js.native
  
  /**
    * The list of keys for tags to remove from the specified resource.
    */
  var TagKeys: typings.awsSdk.organizationsMod.TagKeys = js.native
}
object UntagResourceRequest {
  
  @scala.inline
  def apply(ResourceId: TaggableResourceId, TagKeys: TagKeys): UntagResourceRequest = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any], TagKeys = TagKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceRequest]
  }
  
  @scala.inline
  implicit class UntagResourceRequestOps[Self <: UntagResourceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setResourceId(value: TaggableResourceId): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeysVarargs(value: TagKey*): Self = this.set("TagKeys", js.Array(value :_*))
    
    @scala.inline
    def setTagKeys(value: TagKeys): Self = this.set("TagKeys", value.asInstanceOf[js.Any])
  }
}
