package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceTagsDescriptionMessage extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) of the resource for which a tag list was requested.
    */
  var ResourceArn: js.UndefOr[typings.awsSdk.elasticbeanstalkMod.ResourceArn] = js.native
  
  /**
    * A list of tag key-value pairs.
    */
  var ResourceTags: js.UndefOr[TagList] = js.native
}
object ResourceTagsDescriptionMessage {
  
  @scala.inline
  def apply(): ResourceTagsDescriptionMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceTagsDescriptionMessage]
  }
  
  @scala.inline
  implicit class ResourceTagsDescriptionMessageOps[Self <: ResourceTagsDescriptionMessage] (val x: Self) extends AnyVal {
    
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
    def setResourceArn(value: ResourceArn): Self = this.set("ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceArn: Self = this.set("ResourceArn", js.undefined)
    
    @scala.inline
    def setResourceTagsVarargs(value: Tag*): Self = this.set("ResourceTags", js.Array(value :_*))
    
    @scala.inline
    def setResourceTags(value: TagList): Self = this.set("ResourceTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceTags: Self = this.set("ResourceTags", js.undefined)
  }
}
