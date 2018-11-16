package typings
package chromeLib.chromeNs.alarmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("chrome.alarms")
@js.native
object alarmsNsMembers extends js.Object {
  var onAlarm: AlarmEvent = js.native
  def clear(): scala.Unit = js.native
  def clear(callback: js.Function1[/* wasCleared */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  def clear(name: java.lang.String): scala.Unit = js.native
  def clear(name: java.lang.String, callback: js.Function1[/* wasCleared */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  def clearAll(): scala.Unit = js.native
  def clearAll(callback: js.Function1[/* wasCleared */ scala.Boolean, scala.Unit]): scala.Unit = js.native
  def create(alarmInfo: AlarmCreateInfo): scala.Unit = js.native
  def create(name: java.lang.String, alarmInfo: AlarmCreateInfo): scala.Unit = js.native
  def get(callback: js.Function1[/* alarm */ Alarm, scala.Unit]): scala.Unit = js.native
  def get(name: java.lang.String, callback: js.Function1[/* alarm */ Alarm, scala.Unit]): scala.Unit = js.native
  def getAll(callback: js.Function1[/* alarms */ js.Array[Alarm], scala.Unit]): scala.Unit = js.native
}

