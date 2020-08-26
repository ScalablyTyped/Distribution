package typings.awsSdk.managedblockchainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InviteAction extends js.Object {
  /**
    * The AWS account ID to invite.
    */
  var Principal: PrincipalString = js.native
}

object InviteAction {
  @scala.inline
  def apply(Principal: PrincipalString): InviteAction = {
    val __obj = js.Dynamic.literal(Principal = Principal.asInstanceOf[js.Any])
    __obj.asInstanceOf[InviteAction]
  }
  @scala.inline
  implicit class InviteActionOps[Self <: InviteAction] (val x: Self) extends AnyVal {
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
    def setPrincipal(value: PrincipalString): Self = this.set("Principal", value.asInstanceOf[js.Any])
  }
  
}

