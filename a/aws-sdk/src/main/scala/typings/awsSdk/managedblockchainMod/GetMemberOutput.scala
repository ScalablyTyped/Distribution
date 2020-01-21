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
  def apply(Member: Member = null): GetMemberOutput = {
    val __obj = js.Dynamic.literal()
    if (Member != null) __obj.updateDynamic("Member")(Member.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMemberOutput]
  }
}

