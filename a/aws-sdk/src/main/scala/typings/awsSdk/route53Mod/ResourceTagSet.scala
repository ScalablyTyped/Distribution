package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResourceTagSet extends js.Object {
  
  /**
    * The ID for the specified resource.
    */
  var ResourceId: js.UndefOr[TagResourceId] = js.native
  
  /**
    * The type of the resource.   The resource type for health checks is healthcheck.   The resource type for hosted zones is hostedzone.  
    */
  var ResourceType: js.UndefOr[TagResourceType] = js.native
  
  /**
    * The tags associated with the specified resource.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object ResourceTagSet {
  
  @scala.inline
  def apply(): ResourceTagSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceTagSet]
  }
  
  @scala.inline
  implicit class ResourceTagSetOps[Self <: ResourceTagSet] (val x: Self) extends AnyVal {
    
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
    def setResourceId(value: TagResourceId): Self = this.set("ResourceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceId: Self = this.set("ResourceId", js.undefined)
    
    @scala.inline
    def setResourceType(value: TagResourceType): Self = this.set("ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourceType: Self = this.set("ResourceType", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
}
