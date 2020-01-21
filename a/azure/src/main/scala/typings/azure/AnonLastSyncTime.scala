package typings.azure

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLastSyncTime extends js.Object {
  var LastSyncTime: Date
  var Status: String
}

object AnonLastSyncTime {
  @scala.inline
  def apply(LastSyncTime: Date, Status: String): AnonLastSyncTime = {
    val __obj = js.Dynamic.literal(LastSyncTime = LastSyncTime.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLastSyncTime]
  }
}

