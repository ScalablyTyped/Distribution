package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EntityTypesListItem extends js.Object {
  /**
    * Entity type of an item on an entity type list.
    */
  var Type: EntityTypeName = js.native
}

object EntityTypesListItem {
  @scala.inline
  def apply(Type: EntityTypeName): EntityTypesListItem = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityTypesListItem]
  }
  @scala.inline
  implicit class EntityTypesListItemOps[Self <: EntityTypesListItem] (val x: Self) extends AnyVal {
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
    def setType(value: EntityTypeName): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
  
}

