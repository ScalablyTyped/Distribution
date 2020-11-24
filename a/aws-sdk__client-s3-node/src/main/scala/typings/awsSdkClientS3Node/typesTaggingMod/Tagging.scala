package typings.awsSdkClientS3Node.typesTaggingMod

import typings.awsSdkClientS3Node.typesTagMod.Tag
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tagging extends js.Object {
  
  /**
    * _TagSet shape
    */
  var TagSet: js.Array[Tag] | Iterable[Tag] = js.native
}
object Tagging {
  
  @scala.inline
  def apply(TagSet: js.Array[Tag] | Iterable[Tag]): Tagging = {
    val __obj = js.Dynamic.literal(TagSet = TagSet.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tagging]
  }
  
  @scala.inline
  implicit class TaggingOps[Self <: Tagging] (val x: Self) extends AnyVal {
    
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
    def setTagSetVarargs(value: Tag*): Self = this.set("TagSet", js.Array(value :_*))
    
    @scala.inline
    def setTagSet(value: js.Array[Tag] | Iterable[Tag]): Self = this.set("TagSet", value.asInstanceOf[js.Any])
  }
}
