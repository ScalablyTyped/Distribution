package typings.breeze.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityType extends js.Object {
  var entityType: js.UndefOr[typings.breeze.breeze.EntityType] = js.native
  var ignore: js.UndefOr[Boolean] = js.native
  var nodeId: js.UndefOr[js.Any] = js.native
  var nodeRefId: js.UndefOr[js.Any] = js.native
}

object EntityType {
  @scala.inline
  def apply(): EntityType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EntityType]
  }
  @scala.inline
  implicit class EntityTypeOps[Self <: EntityType] (val x: Self) extends AnyVal {
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
    def setEntityType(value: typings.breeze.breeze.EntityType): Self = this.set("entityType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntityType: Self = this.set("entityType", js.undefined)
    @scala.inline
    def setIgnore(value: Boolean): Self = this.set("ignore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnore: Self = this.set("ignore", js.undefined)
    @scala.inline
    def setNodeId(value: js.Any): Self = this.set("nodeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeId: Self = this.set("nodeId", js.undefined)
    @scala.inline
    def setNodeRefId(value: js.Any): Self = this.set("nodeRefId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeRefId: Self = this.set("nodeRefId", js.undefined)
  }
  
}

