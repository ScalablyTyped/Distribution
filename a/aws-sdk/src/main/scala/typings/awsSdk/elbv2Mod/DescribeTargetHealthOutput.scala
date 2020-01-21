package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeTargetHealthOutput extends js.Object {
  /**
    * Information about the health of the targets.
    */
  var TargetHealthDescriptions: js.UndefOr[typings.awsSdk.elbv2Mod.TargetHealthDescriptions] = js.native
}

object DescribeTargetHealthOutput {
  @scala.inline
  def apply(TargetHealthDescriptions: TargetHealthDescriptions = null): DescribeTargetHealthOutput = {
    val __obj = js.Dynamic.literal()
    if (TargetHealthDescriptions != null) __obj.updateDynamic("TargetHealthDescriptions")(TargetHealthDescriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTargetHealthOutput]
  }
}

