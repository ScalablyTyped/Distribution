package typings.awsSdk.opsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterEcsClusterRequest extends js.Object {
  /**
    * The cluster's ARN.
    */
  var EcsClusterArn: String = js.native
  /**
    * The stack ID.
    */
  var StackId: String = js.native
}

object RegisterEcsClusterRequest {
  @scala.inline
  def apply(EcsClusterArn: String, StackId: String): RegisterEcsClusterRequest = {
    val __obj = js.Dynamic.literal(EcsClusterArn = EcsClusterArn.asInstanceOf[js.Any], StackId = StackId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterEcsClusterRequest]
  }
  @scala.inline
  implicit class RegisterEcsClusterRequestOps[Self <: RegisterEcsClusterRequest] (val x: Self) extends AnyVal {
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
    def setStackId(value: String): Self = this.set("StackId", value.asInstanceOf[js.Any])
  }
  
}

