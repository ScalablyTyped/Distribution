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
  def apply(): EcsCluster = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EcsCluster]
  }
  @scala.inline
  implicit class EcsClusterOps[Self <: EcsCluster] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEcsClusterArn(value: String): Self = this.set("EcsClusterArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEcsClusterArn: Self = this.set("EcsClusterArn", js.undefined)
    @scala.inline
    def setEcsClusterName(value: String): Self = this.set("EcsClusterName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEcsClusterName: Self = this.set("EcsClusterName", js.undefined)
    @scala.inline
    def setRegisteredAt(value: DateTime): Self = this.set("RegisteredAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegisteredAt: Self = this.set("RegisteredAt", js.undefined)
    @scala.inline
    def setStackId(value: String): Self = this.set("StackId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackId: Self = this.set("StackId", js.undefined)
  }
  
}

