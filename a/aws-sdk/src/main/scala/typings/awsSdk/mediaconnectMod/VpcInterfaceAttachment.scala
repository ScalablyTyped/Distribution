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
  def apply(VpcInterfaceName: string = null): VpcInterfaceAttachment = {
    val __obj = js.Dynamic.literal()
    if (VpcInterfaceName != null) __obj.updateDynamic("VpcInterfaceName")(VpcInterfaceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcInterfaceAttachment]
  }
}

