package typings.awsSdk.elasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEnvironmentManagedActionsRequest extends js.Object {
  /**
    * The environment ID of the target environment.
    */
  var EnvironmentId: js.UndefOr[String] = js.native
  /**
    * The name of the target environment.
    */
  var EnvironmentName: js.UndefOr[String] = js.native
  /**
    * To show only actions with a particular status, specify a status.
    */
  var Status: js.UndefOr[ActionStatus] = js.native
}

object DescribeEnvironmentManagedActionsRequest {
  @scala.inline
  def apply(EnvironmentId: String = null, EnvironmentName: String = null, Status: ActionStatus = null): DescribeEnvironmentManagedActionsRequest = {
    val __obj = js.Dynamic.literal()
    if (EnvironmentId != null) __obj.updateDynamic("EnvironmentId")(EnvironmentId.asInstanceOf[js.Any])
    if (EnvironmentName != null) __obj.updateDynamic("EnvironmentName")(EnvironmentName.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEnvironmentManagedActionsRequest]
  }
}

