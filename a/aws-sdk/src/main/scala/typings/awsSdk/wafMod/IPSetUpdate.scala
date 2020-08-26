package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPSetUpdate extends js.Object {
  /**
    * Specifies whether to insert or delete an IP address with UpdateIPSet.
    */
  var Action: ChangeAction = js.native
  /**
    * The IP address type (IPV4 or IPV6) and the IP address range (in CIDR notation) that web requests originate from.
    */
  var IPSetDescriptor: typings.awsSdk.wafMod.IPSetDescriptor = js.native
}

object IPSetUpdate {
  @scala.inline
  def apply(Action: ChangeAction, IPSetDescriptor: IPSetDescriptor): IPSetUpdate = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], IPSetDescriptor = IPSetDescriptor.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPSetUpdate]
  }
  @scala.inline
  implicit class IPSetUpdateOps[Self <: IPSetUpdate] (val x: Self) extends AnyVal {
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
    def setAction(value: ChangeAction): Self = this.set("Action", value.asInstanceOf[js.Any])
    @scala.inline
    def setIPSetDescriptor(value: IPSetDescriptor): Self = this.set("IPSetDescriptor", value.asInstanceOf[js.Any])
  }
  
}

