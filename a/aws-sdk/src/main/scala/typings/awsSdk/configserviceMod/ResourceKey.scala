package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceKey extends js.Object {
  /**
    * The ID of the resource (for example., sg-xxxxxx). 
    */
  var resourceId: ResourceId = js.native
  /**
    * The resource type.
    */
  var resourceType: ResourceType = js.native
}

object ResourceKey {
  @scala.inline
  def apply(resourceId: ResourceId, resourceType: ResourceType): ResourceKey = {
    val __obj = js.Dynamic.literal(resourceId = resourceId.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceKey]
  }
  @scala.inline
  implicit class ResourceKeyOps[Self <: ResourceKey] (val x: Self) extends AnyVal {
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
    def setResourceId(value: ResourceId): Self = this.set("resourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("resourceType", value.asInstanceOf[js.Any])
  }
  
}

