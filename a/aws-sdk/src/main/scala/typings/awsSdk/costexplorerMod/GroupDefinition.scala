package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupDefinition extends js.Object {
  /**
    * The string that represents a key for a specified group.
    */
  var Key: js.UndefOr[GroupDefinitionKey] = js.native
  /**
    * The string that represents the type of group.
    */
  var Type: js.UndefOr[GroupDefinitionType] = js.native
}

object GroupDefinition {
  @scala.inline
  def apply(): GroupDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupDefinition]
  }
  @scala.inline
  implicit class GroupDefinitionOps[Self <: GroupDefinition] (val x: Self) extends AnyVal {
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
    def setKey(value: GroupDefinitionKey): Self = this.set("Key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("Key", js.undefined)
    @scala.inline
    def setType(value: GroupDefinitionType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
  
}

