package typings
package azureLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LastSyncTime extends js.Object {
  var LastSyncTime: stdLib.Date
  var Status: java.lang.String
}

object Anon_LastSyncTime {
  @scala.inline
  def apply(LastSyncTime: stdLib.Date, Status: java.lang.String): Anon_LastSyncTime = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("LastSyncTime")(LastSyncTime)
    __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[Anon_LastSyncTime]
  }
}

