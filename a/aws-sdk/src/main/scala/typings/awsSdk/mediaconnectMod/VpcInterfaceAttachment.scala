package typings.awsSdk.mediaconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcInterfaceAttachment extends js.Object {
  /**
    * The name of the VPC interface to use for this output.
    */
  var VpcInterfaceName: js.UndefOr[string] = js.native
}

object VpcInterfaceAttachment {
  @scala.inline
  def apply(): VpcInterfaceAttachment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcInterfaceAttachment]
  }
  @scala.inline
  implicit class VpcInterfaceAttachmentOps[Self <: VpcInterfaceAttachment] (val x: Self) extends AnyVal {
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
    def setVpcInterfaceName(value: string): Self = this.set("VpcInterfaceName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcInterfaceName: Self = this.set("VpcInterfaceName", js.undefined)
  }
  
}

