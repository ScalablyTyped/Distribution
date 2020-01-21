package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElasticGpuHealth extends js.Object {
  /**
    * The health status.
    */
  var Status: js.UndefOr[ElasticGpuStatus] = js.native
}

object ElasticGpuHealth {
  @scala.inline
  def apply(Status: ElasticGpuStatus = null): ElasticGpuHealth = {
    val __obj = js.Dynamic.literal()
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElasticGpuHealth]
  }
}

