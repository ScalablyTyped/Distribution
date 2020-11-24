package typings.awsSdkClientS3Node.typesTaggingMod

import typings.awsSdkClientS3Node.typesTagMod.UnmarshalledTag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnmarshalledTagging extends Tagging {
  
  /**
    * _TagSet shape
    */
  @JSName("TagSet")
  var TagSet_UnmarshalledTagging: js.Array[UnmarshalledTag] = js.native
}
object UnmarshalledTagging {
  
  @scala.inline
  def apply(TagSet: js.Array[UnmarshalledTag]): UnmarshalledTagging = {
    val __obj = js.Dynamic.literal(TagSet = TagSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnmarshalledTagging]
  }
  
  @scala.inline
  implicit class UnmarshalledTaggingOps[Self <: UnmarshalledTagging] (val x: Self) extends AnyVal {
    
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
    def setTagSetVarargs(value: UnmarshalledTag*): Self = this.set("TagSet", js.Array(value :_*))
    
    @scala.inline
    def setTagSet(value: js.Array[UnmarshalledTag]): Self = this.set("TagSet", value.asInstanceOf[js.Any])
  }
}
