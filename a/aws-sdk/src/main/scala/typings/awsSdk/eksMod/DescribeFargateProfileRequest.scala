package typings.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeFargateProfileRequest extends js.Object {
  /**
    * The name of the Amazon EKS cluster associated with the Fargate profile.
    */
  var clusterName: String = js.native
  /**
    * The name of the Fargate profile to describe.
    */
  var fargateProfileName: String = js.native
}

object DescribeFargateProfileRequest {
  @scala.inline
  def apply(clusterName: String, fargateProfileName: String): DescribeFargateProfileRequest = {
    val __obj = js.Dynamic.literal(clusterName = clusterName.asInstanceOf[js.Any], fargateProfileName = fargateProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFargateProfileRequest]
  }
}

