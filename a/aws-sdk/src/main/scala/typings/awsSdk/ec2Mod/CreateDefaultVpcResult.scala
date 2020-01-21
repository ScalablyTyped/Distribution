package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDefaultVpcResult extends js.Object {
  /**
    * Information about the VPC.
    */
  var Vpc: js.UndefOr[typings.awsSdk.ec2Mod.Vpc] = js.native
}

object CreateDefaultVpcResult {
  @scala.inline
  def apply(Vpc: Vpc = null): CreateDefaultVpcResult = {
    val __obj = js.Dynamic.literal()
    if (Vpc != null) __obj.updateDynamic("Vpc")(Vpc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDefaultVpcResult]
  }
}

