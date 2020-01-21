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
  def apply(Code: Int | scala.Double = null, Type: Int | scala.Double = null): IcmpTypeCode = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[IcmpTypeCode]
  }
}

