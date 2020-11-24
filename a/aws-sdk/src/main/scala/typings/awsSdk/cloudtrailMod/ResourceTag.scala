package typings.awsSdk.cloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceTag extends js.Object {
  
  /**
    * Specifies the ARN of the resource.
    */
  var ResourceId: js.UndefOr[String] = js.native
  
  /**
    * A list of tags.
    */
  var TagsList: js.UndefOr[typings.awsSdk.cloudtrailMod.TagsList] = js.native
}
object ResourceTag {
  
  @scala.inline
  def apply(): ResourceTag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceTag]
  }
  
  @scala.inline
  implicit class ResourceTagOps[Self <: ResourceTag] (val x: Self) extends AnyVal {
    
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
    def setResourceId(value: String): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceId: Self = this.set("ResourceId", js.undefined)
    
    @scala.inline
    def setTagsListVarargs(value: Tag*): Self = this.set("TagsList", js.Array(value :_*))
    
    @scala.inline
    def setTagsList(value: TagsList): Self = this.set("TagsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagsList: Self = this.set("TagsList", js.undefined)
  }
}
