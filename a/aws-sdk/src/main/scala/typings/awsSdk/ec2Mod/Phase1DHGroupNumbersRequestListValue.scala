package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Phase1DHGroupNumbersRequestListValue extends js.Object {
  /**
    * The Diffie-Hellmann group number.
    */
  var Value: js.UndefOr[Integer] = js.native
}

object Phase1DHGroupNumbersRequestListValue {
  @scala.inline
  def apply(Value: js.UndefOr[Integer] = js.undefined): Phase1DHGroupNumbersRequestListValue = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Value)) __obj.updateDynamic("Value")(Value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Phase1DHGroupNumbersRequestListValue]
  }
}

