package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EcsCluster extends js.Object {
  /**
    * The cluster's ARN.
    */
  var EcsClusterArn: js.UndefOr[String] = js.native
  /**
    * The cluster name.
    */
  var EcsClusterName: js.UndefOr[String] = js.native
  /**
    * The time and date that the cluster was registered with the stack.
    */
  var RegisteredAt: js.UndefOr[DateTime] = js.native
  /**
    * The stack ID.
    */
  var StackId: js.UndefOr[String] = js.native
}

object EcsCluster {
  @scala.inline
  def apply(
    EcsClusterArn: String = null,
    EcsClusterName: String = null,
    RegisteredAt: DateTime = null,
    StackId: String = null
  ): EcsCluster = {
    val __obj = js.Dynamic.literal()
    if (EcsClusterArn != null) __obj.updateDynamic("EcsClusterArn")(EcsClusterArn.asInstanceOf[js.Any])
    if (EcsClusterName != null) __obj.updateDynamic("EcsClusterName")(EcsClusterName.asInstanceOf[js.Any])
    if (RegisteredAt != null) __obj.updateDynamic("RegisteredAt")(RegisteredAt.asInstanceOf[js.Any])
    if (StackId != null) __obj.updateDynamic("StackId")(StackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EcsCluster]
  }
}

