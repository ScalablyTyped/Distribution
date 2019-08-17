package typings.atAwsDashSdkClientDashS3DashNode.typesUnderscoreInventoryScheduleMod

import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.Daily
import typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.Weekly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _InventorySchedule extends js.Object {
  /**
    * <p>Specifies how frequently inventory results are produced.</p>
    */
  var Frequency: Daily | Weekly | String
}

object _InventorySchedule {
  @scala.inline
  def apply(Frequency: Daily | Weekly | String): _InventorySchedule = {
    val __obj = js.Dynamic.literal(Frequency = Frequency.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_InventorySchedule]
  }
}

