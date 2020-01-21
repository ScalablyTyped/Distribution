package typings.awsSdk.shieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeProtectionResponse extends js.Object {
  /**
    * The Protection object that is described.
    */
  var Protection: js.UndefOr[typings.awsSdk.shieldMod.Protection] = js.native
}

object DescribeProtectionResponse {
  @scala.inline
  def apply(Protection: Protection = null): DescribeProtectionResponse = {
    val __obj = js.Dynamic.literal()
    if (Protection != null) __obj.updateDynamic("Protection")(Protection.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeProtectionResponse]
  }
}

