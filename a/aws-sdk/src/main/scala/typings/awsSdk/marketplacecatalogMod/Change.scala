package typings.awsSdk.marketplacecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Change extends js.Object {
  /**
    * Change types are single string values that describe your intention for the change. Each change type is unique for each EntityType provided in the change's scope.
    */
  var ChangeType: typings.awsSdk.marketplacecatalogMod.ChangeType = js.native
  /**
    * This object contains details specific to the change type of the requested change.
    */
  var Details: Json = js.native
  /**
    * The entity to be changed.
    */
  var Entity: typings.awsSdk.marketplacecatalogMod.Entity = js.native
}

object Change {
  @scala.inline
  def apply(ChangeType: ChangeType, Details: Json, Entity: Entity): Change = {
    val __obj = js.Dynamic.literal(ChangeType = ChangeType.asInstanceOf[js.Any], Details = Details.asInstanceOf[js.Any], Entity = Entity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Change]
  }
  @scala.inline
  implicit class ChangeOps[Self <: Change] (val x: Self) extends AnyVal {
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
    def setChangeType(value: ChangeType): Self = this.set("ChangeType", value.asInstanceOf[js.Any])
    @scala.inline
    def setDetails(value: Json): Self = this.set("Details", value.asInstanceOf[js.Any])
    @scala.inline
    def setEntity(value: Entity): Self = this.set("Entity", value.asInstanceOf[js.Any])
  }
  
}

