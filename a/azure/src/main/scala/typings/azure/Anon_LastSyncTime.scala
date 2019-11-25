package typings.azure

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LastSyncTime extends js.Object {
  var LastSyncTime: Date
  var Status: String
}

object Anon_LastSyncTime {
  @scala.inline
  def apply(LastSyncTime: Date, Status: String): Anon_LastSyncTime = {
    val __obj = js.Dynamic.literal(LastSyncTime = LastSyncTime.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_LastSyncTime]
  }
}

