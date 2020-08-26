package typings.awsSdk.workmailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Member extends js.Object {
  /**
    * The date indicating when the member was disabled from Amazon WorkMail use.
    */
  var DisabledDate: js.UndefOr[Timestamp] = js.native
  /**
    * The date indicating when the member was enabled for Amazon WorkMail use.
    */
  var EnabledDate: js.UndefOr[Timestamp] = js.native
  /**
    * The identifier of the member.
    */
  var Id: js.UndefOr[String] = js.native
  /**
    * The name of the member.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The state of the member, which can be ENABLED, DISABLED, or DELETED.
    */
  var State: js.UndefOr[EntityState] = js.native
  /**
    * A member can be a user or group.
    */
  var Type: js.UndefOr[MemberType] = js.native
}

object Member {
  @scala.inline
  def apply(): Member = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Member]
  }
  @scala.inline
  implicit class MemberOps[Self <: Member] (val x: Self) extends AnyVal {
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
    def setDisabledDate(value: Timestamp): Self = this.set("DisabledDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledDate: Self = this.set("DisabledDate", js.undefined)
    @scala.inline
    def setEnabledDate(value: Timestamp): Self = this.set("EnabledDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabledDate: Self = this.set("EnabledDate", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setState(value: EntityState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    @scala.inline
    def setType(value: MemberType): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
  
}

