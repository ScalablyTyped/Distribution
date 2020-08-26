package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeregisterEcsClusterRequest extends js.Object {
  /**
    * The cluster's Amazon Resource Number (ARN).
    */
  var EcsClusterArn: String = js.native
}

object DeregisterEcsClusterRequest {
  @scala.inline
  def apply(EcsClusterArn: String): DeregisterEcsClusterRequest = {
    val __obj = js.Dynamic.literal(EcsClusterArn = EcsClusterArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeregisterEcsClusterRequest]
  }
  @scala.inline
  implicit class DeregisterEcsClusterRequestOps[Self <: DeregisterEcsClusterRequest] (val x: Self) extends AnyVal {
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
  }
  
}

