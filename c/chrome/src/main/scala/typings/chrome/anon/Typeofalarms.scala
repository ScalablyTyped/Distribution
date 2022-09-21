package typings.chrome.anon

import typings.chrome.chrome.alarms.Alarm
import typings.chrome.chrome.alarms.AlarmCreateInfo
import typings.chrome.chrome.alarms.AlarmEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofalarms extends StObject {
  
  def clear(): Unit = js.native
  def clear(callback: js.Function1[/* wasCleared */ Boolean, Unit]): Unit = js.native
  def clear(name: String): Unit = js.native
  def clear(name: String, callback: js.Function1[/* wasCleared */ Boolean, Unit]): Unit = js.native
  def clear(name: Unit, callback: js.Function1[/* wasCleared */ Boolean, Unit]): Unit = js.native
  
  def clearAll(): Unit = js.native
  def clearAll(callback: js.Function1[/* wasCleared */ Boolean, Unit]): Unit = js.native
  @JSName("clearAll")
  def clearAll_Promise(): js.Promise[Boolean] = js.native
  
  @JSName("clear")
  def clear_Promise(): js.Promise[Boolean] = js.native
  @JSName("clear")
  def clear_Promise(name: String): js.Promise[Boolean] = js.native
  
  def create(alarmInfo: AlarmCreateInfo): Unit = js.native
  def create(name: String, alarmInfo: AlarmCreateInfo): Unit = js.native
  
  def get(): js.Promise[Alarm] = js.native
  def get(callback: js.Function1[/* alarm */ Alarm, Unit]): Unit = js.native
  def get(name: String): js.Promise[Alarm] = js.native
  def get(name: String, callback: js.Function1[/* alarm */ Alarm, Unit]): Unit = js.native
  
  def getAll(): js.Promise[js.Array[Alarm]] = js.native
  def getAll(callback: js.Function1[/* alarms */ js.Array[Alarm], Unit]): Unit = js.native
  
  var onAlarm: AlarmEvent = js.native
}
