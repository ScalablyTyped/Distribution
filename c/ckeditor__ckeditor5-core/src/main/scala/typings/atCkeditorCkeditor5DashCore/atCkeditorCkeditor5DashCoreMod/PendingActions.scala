package typings.atCkeditorCkeditor5DashCore.atCkeditorCkeditor5DashCoreMod

import typings.atCkeditorCkeditor5DashCore.Anon_Message
import typings.atCkeditorCkeditor5DashUtils.atCkeditorCkeditor5DashUtilsMod.Observable
import typings.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ckeditor/ckeditor5-core", "PendingActions")
@js.native
class PendingActions () extends Plugin[Unit] {
  var first: Null | (Observable with Anon_Message) = js.native
  val hasAny: Boolean = js.native
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[Iterator[Observable with Anon_Message, _, js.UndefOr[scala.Nothing]]] = js.native
  def add(message: String): Observable with Anon_Message = js.native
  def remove(action: Observable with Anon_Message): Unit = js.native
}

/* static members */
@JSImport("@ckeditor/ckeditor5-core", "PendingActions")
@js.native
object PendingActions extends js.Object {
  val pluginName: typings.atCkeditorCkeditor5DashCore.atCkeditorCkeditor5DashCoreStrings.PendingActions = js.native
}

