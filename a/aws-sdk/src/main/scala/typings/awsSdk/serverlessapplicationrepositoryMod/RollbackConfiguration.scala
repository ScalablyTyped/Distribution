package typings.awsSdk.serverlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RollbackConfiguration extends js.Object {
  /**
    * This property corresponds to the content of the same name for the AWS CloudFormation RollbackConfiguration
    Data Type.
    */
  var MonitoringTimeInMinutes: js.UndefOr[integer] = js.native
  /**
    * This property corresponds to the content of the same name for the AWS CloudFormation RollbackConfiguration
    Data Type.
    */
  var RollbackTriggers: js.UndefOr[listOfRollbackTrigger] = js.native
}

object RollbackConfiguration {
  @scala.inline
  def apply(
    MonitoringTimeInMinutes: js.UndefOr[integer] = js.undefined,
    RollbackTriggers: listOfRollbackTrigger = null
  ): RollbackConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MonitoringTimeInMinutes)) __obj.updateDynamic("MonitoringTimeInMinutes")(MonitoringTimeInMinutes.get.asInstanceOf[js.Any])
    if (RollbackTriggers != null) __obj.updateDynamic("RollbackTriggers")(RollbackTriggers.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollbackConfiguration]
  }
}

