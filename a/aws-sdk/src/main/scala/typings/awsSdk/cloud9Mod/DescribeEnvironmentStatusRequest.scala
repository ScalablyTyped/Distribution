package typings.awsSdk.cloud9Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEnvironmentStatusRequest extends js.Object {
  /**
    * The ID of the environment to get status information about.
    */
  var environmentId: EnvironmentId = js.native
}

object DescribeEnvironmentStatusRequest {
  @scala.inline
  def apply(environmentId: EnvironmentId): DescribeEnvironmentStatusRequest = {
    val __obj = js.Dynamic.literal(environmentId = environmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEnvironmentStatusRequest]
  }
}

