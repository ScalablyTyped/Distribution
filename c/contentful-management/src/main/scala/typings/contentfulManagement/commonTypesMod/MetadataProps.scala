package typings.contentfulManagement.commonTypesMod

import typings.contentfulManagement.tagMod.TagProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MetadataProps extends js.Object {
  
  var tags: js.Array[TagProps] = js.native
}
object MetadataProps {
  
  @scala.inline
  def apply(tags: js.Array[TagProps]): MetadataProps = {
    val __obj = js.Dynamic.literal(tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetadataProps]
  }
  
  @scala.inline
  implicit class MetadataPropsOps[Self <: MetadataProps] (val x: Self) extends AnyVal {
    
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
    def setTagsVarargs(value: TagProps*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[TagProps]): Self = this.set("tags", value.asInstanceOf[js.Any])
  }
}
