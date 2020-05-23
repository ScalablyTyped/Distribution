package typings.azure.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LastSyncTime extends js.Object {
  var LastSyncTime: Date
  var Status: String
}

object LastSyncTime {
  @scala.inline
  def apply(LastSyncTime: Date, Status: String): LastSyncTime = {
    val __obj = js.Dynamic.literal(LastSyncTime = LastSyncTime.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LastSyncTime]
  }
}

