package typings.awsSdk.marketplacecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntitySummary extends js.Object {
  /**
    * The ARN associated with the unique identifier for the entity.
    */
  var EntityArn: js.UndefOr[ARN] = js.native
  /**
    * The unique identifier for the entity.
    */
  var EntityId: js.UndefOr[ResourceId] = js.native
  /**
    * The type of the entity.
    */
  var EntityType: js.UndefOr[typings.awsSdk.marketplacecatalogMod.EntityType] = js.native
  /**
    * The last time the entity was published, using ISO 8601 format (2018-02-27T13:45:22Z).
    */
  var LastModifiedDate: js.UndefOr[StringValue] = js.native
  /**
    * The name for the entity. This value is not unique. It is defined by the seller.
    */
  var Name: js.UndefOr[StringValue] = js.native
  /**
    * The visibility status of the entity to buyers. This value can be Public (everyone can view the entity), Limited (the entity is visible to limited accounts only), or Restricted (the entity was published and then unpublished and only existing buyers can view it). 
    */
  var Visibility: js.UndefOr[StringValue] = js.native
}

object EntitySummary {
  @scala.inline
  def apply(): EntitySummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntitySummary]
  }
  @scala.inline
  implicit class EntitySummaryOps[Self <: EntitySummary] (val x: Self) extends AnyVal {
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
    def setEntityArn(value: ARN): Self = this.set("EntityArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntityArn: Self = this.set("EntityArn", js.undefined)
    @scala.inline
    def setEntityId(value: ResourceId): Self = this.set("EntityId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntityId: Self = this.set("EntityId", js.undefined)
    @scala.inline
    def setEntityType(value: EntityType): Self = this.set("EntityType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntityType: Self = this.set("EntityType", js.undefined)
    @scala.inline
    def setLastModifiedDate(value: StringValue): Self = this.set("LastModifiedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedDate: Self = this.set("LastModifiedDate", js.undefined)
    @scala.inline
    def setName(value: StringValue): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setVisibility(value: StringValue): Self = this.set("Visibility", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibility: Self = this.set("Visibility", js.undefined)
  }
  
}

