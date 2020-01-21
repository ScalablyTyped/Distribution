package typings.awsSdk.robomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeRobotApplicationRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the robot application.
    */
  var application: Arn = js.native
  /**
    * The version of the robot application to describe.
    */
  var applicationVersion: js.UndefOr[Version] = js.native
}

object DescribeRobotApplicationRequest {
  @scala.inline
  def apply(application: Arn, applicationVersion: Version = null): DescribeRobotApplicationRequest = {
    val __obj = js.Dynamic.literal(application = application.asInstanceOf[js.Any])
    if (applicationVersion != null) __obj.updateDynamic("applicationVersion")(applicationVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRobotApplicationRequest]
  }
}

