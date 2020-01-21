package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterEcsClusterResult extends js.Object {
  /**
    * The cluster's ARN.
    */
  var EcsClusterArn: js.UndefOr[String] = js.native
}

object RegisterEcsClusterResult {
  @scala.inline
  def apply(EcsClusterArn: String = null): RegisterEcsClusterResult = {
    val __obj = js.Dynamic.literal()
    if (EcsClusterArn != null) __obj.updateDynamic("EcsClusterArn")(EcsClusterArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterEcsClusterResult]
  }
}

