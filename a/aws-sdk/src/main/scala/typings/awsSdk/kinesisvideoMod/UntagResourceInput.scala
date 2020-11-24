package typings.awsSdk.kinesisvideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UntagResourceInput extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the signaling channel from which you want to remove tags.
    */
  var ResourceARN: typings.awsSdk.kinesisvideoMod.ResourceARN = js.native
  
  /**
    * A list of the keys of the tags that you want to remove.
    */
  var TagKeyList: typings.awsSdk.kinesisvideoMod.TagKeyList = js.native
}
object UntagResourceInput {
  
  @scala.inline
  def apply(ResourceARN: ResourceARN, TagKeyList: TagKeyList): UntagResourceInput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN.asInstanceOf[js.Any], TagKeyList = TagKeyList.asInstanceOf[js.Any])
    __obj.asInstanceOf[UntagResourceInput]
  }
  
  @scala.inline
  implicit class UntagResourceInputOps[Self <: UntagResourceInput] (val x: Self) extends AnyVal {
    
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
    def setResourceARN(value: ResourceARN): Self = this.set("ResourceARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagKeyListVarargs(value: TagKey*): Self = this.set("TagKeyList", js.Array(value :_*))
    
    @scala.inline
    def setTagKeyList(value: TagKeyList): Self = this.set("TagKeyList", value.asInstanceOf[js.Any])
  }
}
