package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterEndPointsOutput extends js.Object {
  /**
    * The remaining instances registered with the load balancer.
    */
  var Instances: js.UndefOr[typings.awsSdk.elbMod.Instances] = js.native
}

object DeregisterEndPointsOutput {
  @scala.inline
  def apply(Instances: Instances = null): DeregisterEndPointsOutput = {
    val __obj = js.Dynamic.literal()
    if (Instances != null) __obj.updateDynamic("Instances")(Instances.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterEndPointsOutput]
  }
}

