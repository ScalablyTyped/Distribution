package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parent extends js.Object {
  /**
    * The unique identifier (ID) of the parent entity. The regex pattern for a parent ID string requires one of the following:   Root: A string that begins with "r-" followed by from 4 to 32 lower-case letters or digits.   Organizational unit (OU): A string that begins with "ou-" followed by from 4 to 32 lower-case letters or digits (the ID of the root that the OU is in). This string is followed by a second "-" dash and from 8 to 32 additional lower-case letters or digits.  
    */
  var Id: js.UndefOr[ParentId] = js.native
  /**
    * The type of the parent entity.
    */
  var Type: js.UndefOr[ParentType] = js.native
}

object Parent {
  @scala.inline
  def apply(): Parent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Parent]
  }
  @scala.inline
  implicit class ParentOps[Self <: Parent] (val x: Self) extends AnyVal {
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
    def setId(value: ParentId): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setType(value: ParentType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
  
}

