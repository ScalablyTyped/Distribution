package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateMemberOutput extends js.Object {
  /**
    * The unique identifier of the member.
    */
  var MemberId: js.UndefOr[ResourceIdString] = js.native
}

object CreateMemberOutput {
  @scala.inline
  def apply(): CreateMemberOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMemberOutput]
  }
  @scala.inline
  implicit class CreateMemberOutputOps[Self <: CreateMemberOutput] (val x: Self) extends AnyVal {
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
    def setMemberId(value: ResourceIdString): Self = this.set("MemberId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMemberId: Self = this.set("MemberId", js.undefined)
  }
  
}

