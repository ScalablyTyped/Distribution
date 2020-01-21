package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeConditionalForwardersResult extends js.Object {
  /**
    * The list of conditional forwarders that have been created.
    */
  var ConditionalForwarders: js.UndefOr[typings.awsSdk.directoryserviceMod.ConditionalForwarders] = js.native
}

object DescribeConditionalForwardersResult {
  @scala.inline
  def apply(ConditionalForwarders: ConditionalForwarders = null): DescribeConditionalForwardersResult = {
    val __obj = js.Dynamic.literal()
    if (ConditionalForwarders != null) __obj.updateDynamic("ConditionalForwarders")(ConditionalForwarders.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeConditionalForwardersResult]
  }
}

