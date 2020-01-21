package typings.awsSdk.codestarnotificationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the SNS topic.
    */
  var TargetAddress: js.UndefOr[typings.awsSdk.codestarnotificationsMod.TargetAddress] = js.native
  /**
    * The status of the target.
    */
  var TargetStatus: js.UndefOr[typings.awsSdk.codestarnotificationsMod.TargetStatus] = js.native
  /**
    * The type of the target (for example, SNS).
    */
  var TargetType: js.UndefOr[typings.awsSdk.codestarnotificationsMod.TargetType] = js.native
}

object TargetSummary {
  @scala.inline
  def apply(
    TargetAddress: TargetAddress = null,
    TargetStatus: TargetStatus = null,
    TargetType: TargetType = null
  ): TargetSummary = {
    val __obj = js.Dynamic.literal()
    if (TargetAddress != null) __obj.updateDynamic("TargetAddress")(TargetAddress.asInstanceOf[js.Any])
    if (TargetStatus != null) __obj.updateDynamic("TargetStatus")(TargetStatus.asInstanceOf[js.Any])
    if (TargetType != null) __obj.updateDynamic("TargetType")(TargetType.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetSummary]
  }
}

