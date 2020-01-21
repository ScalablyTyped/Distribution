package typings.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEventBusResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the account permitted to write events to the current account.
    */
  var Arn: js.UndefOr[String] = js.native
  /**
    * The name of the event bus. Currently, this is always default.
    */
  var Name: js.UndefOr[String] = js.native
  /**
    * The policy that enables the external account to send events to your account.
    */
  var Policy: js.UndefOr[String] = js.native
}

object DescribeEventBusResponse {
  @scala.inline
  def apply(Arn: String = null, Name: String = null, Policy: String = null): DescribeEventBusResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Policy != null) __obj.updateDynamic("Policy")(Policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEventBusResponse]
  }
}

