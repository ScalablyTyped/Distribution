package typings.ckeditorCkeditor5Utils.mod

import typings.ckeditorCkeditor5Utils.AnonCalled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ckeditor/ckeditor5-utils", "EventInfo")
@js.native
class EventInfo[T] protected () extends js.Object {
  def this(source: T, name: String) = this()
  val name: String = js.native
  @JSName("off")
  var off_Original: AnonCalled = js.native
  val path: js.Array[js.Object] = js.native
  var `return`: js.Any = js.native
  val source: T = js.native
  @JSName("stop")
  var stop_Original: AnonCalled = js.native
  def off(): Unit = js.native
  def stop(): Unit = js.native
}

