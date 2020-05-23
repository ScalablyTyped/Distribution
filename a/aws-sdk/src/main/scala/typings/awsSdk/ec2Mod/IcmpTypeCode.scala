package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IcmpTypeCode extends js.Object {
  /**
    * The ICMP code. A value of -1 means all codes for the specified ICMP type.
    */
  var Code: js.UndefOr[Integer] = js.native
  /**
    * The ICMP type. A value of -1 means all types.
    */
  var Type: js.UndefOr[Integer] = js.native
}

object IcmpTypeCode {
  @scala.inline
  def apply(Code: js.UndefOr[Integer] = js.undefined, Type: js.UndefOr[Integer] = js.undefined): IcmpTypeCode = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Code)) __obj.updateDynamic("Code")(Code.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Type)) __obj.updateDynamic("Type")(Type.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IcmpTypeCode]
  }
}

