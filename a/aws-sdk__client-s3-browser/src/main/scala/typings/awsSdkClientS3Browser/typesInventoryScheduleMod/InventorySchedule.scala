package typings.awsSdkClientS3Browser.typesInventoryScheduleMod

import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Daily
import typings.awsSdkClientS3Browser.awsSdkClientS3BrowserStrings.Weekly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventorySchedule extends js.Object {
  /**
    * <p>Specifies how frequently inventory results are produced.</p>
    */
  var Frequency: Daily | Weekly | String
}

object InventorySchedule {
  @scala.inline
  def apply(Frequency: Daily | Weekly | String): InventorySchedule = {
    val __obj = js.Dynamic.literal(Frequency = Frequency.asInstanceOf[js.Any])
    __obj.asInstanceOf[InventorySchedule]
  }
}

