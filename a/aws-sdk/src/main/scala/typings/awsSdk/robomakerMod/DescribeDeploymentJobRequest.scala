package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDeploymentJobRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the deployment job.
    */
  var job: Arn = js.native
}

object DescribeDeploymentJobRequest {
  @scala.inline
  def apply(job: Arn): DescribeDeploymentJobRequest = {
    val __obj = js.Dynamic.literal(job = job.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeDeploymentJobRequest]
  }
}

