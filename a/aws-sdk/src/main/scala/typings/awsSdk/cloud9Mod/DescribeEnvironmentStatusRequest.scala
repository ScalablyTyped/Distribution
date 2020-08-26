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
  @scala.inline
  implicit class DescribeEnvironmentStatusRequestOps[Self <: DescribeEnvironmentStatusRequest] (val x: Self) extends AnyVal {
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
    def setEnvironmentId(value: EnvironmentId): Self = this.set("environmentId", value.asInstanceOf[js.Any])
  }
  
}

