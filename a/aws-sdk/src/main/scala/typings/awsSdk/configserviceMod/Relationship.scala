package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Relationship extends js.Object {
  /**
    * The type of relationship with the related resource.
    */
  var relationshipName: js.UndefOr[RelationshipName] = js.native
  /**
    * The ID of the related resource (for example, sg-xxxxxx).
    */
  var resourceId: js.UndefOr[ResourceId] = js.native
  /**
    * The custom name of the related resource, if available.
    */
  var resourceName: js.UndefOr[ResourceName] = js.native
  /**
    * The resource type of the related resource.
    */
  var resourceType: js.UndefOr[ResourceType] = js.native
}

object Relationship {
  @scala.inline
  def apply(): Relationship = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Relationship]
  }
  @scala.inline
  implicit class RelationshipOps[Self <: Relationship] (val x: Self) extends AnyVal {
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
    def setRelationshipName(value: RelationshipName): Self = this.set("relationshipName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRelationshipName: Self = this.set("relationshipName", js.undefined)
    @scala.inline
    def setResourceId(value: ResourceId): Self = this.set("resourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceId: Self = this.set("resourceId", js.undefined)
    @scala.inline
    def setResourceName(value: ResourceName): Self = this.set("resourceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceName: Self = this.set("resourceName", js.undefined)
    @scala.inline
    def setResourceType(value: ResourceType): Self = this.set("resourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResourceType: Self = this.set("resourceType", js.undefined)
  }
  
}

