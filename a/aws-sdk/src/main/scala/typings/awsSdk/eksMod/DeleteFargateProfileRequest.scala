package typings.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFargateProfileRequest extends js.Object {
  /**
    * The name of the Amazon EKS cluster associated with the Fargate profile to delete.
    */
  var clusterName: String = js.native
  /**
    * The name of the Fargate profile to delete.
    */
  var fargateProfileName: String = js.native
}

object DeleteFargateProfileRequest {
  @scala.inline
  def apply(clusterName: String, fargateProfileName: String): DeleteFargateProfileRequest = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any], fargateProfileName = fargateProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFargateProfileRequest]
  }
  @scala.inline
  implicit class DeleteFargateProfileRequestOps[Self <: DeleteFargateProfileRequest] (val x: Self) extends AnyVal {
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
    def setClusterName(value: String): Self = this.set("clusterName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFargateProfileName(value: String): Self = this.set("fargateProfileName", value.asInstanceOf[js.Any])
  }
  
}

