package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMemberOutput extends js.Object {
  /**
    * The properties of a member.
    */
  var Member: js.UndefOr[typings.awsSdk.managedblockchainMod.Member] = js.native
}

object GetMemberOutput {
  @scala.inline
  def apply(): GetMemberOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetMemberOutput]
  }
  @scala.inline
  implicit class GetMemberOutputOps[Self <: GetMemberOutput] (val x: Self) extends AnyVal {
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
    def setMember(value: Member): Self = this.set("Member", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMember: Self = this.set("Member", js.undefined)
  }
  
}

