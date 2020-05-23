package typings.ckeditorCkeditor5Core.mod

import typings.ckeditorCkeditor5Core.anon.Observablemessagestring
import typings.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ckeditor/ckeditor5-core", "PendingActions")
@js.native
class PendingActions () extends Plugin[Unit] {
  var first: Null | Observablemessagestring = js.native
  val hasAny: Boolean = js.native
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[Iterator[Observablemessagestring, _, js.UndefOr[scala.Nothing]]] = js.native
  def add(message: String): Observablemessagestring = js.native
  def remove(action: Observablemessagestring): Unit = js.native
}

/* static members */
@JSImport("@ckeditor/ckeditor5-core", "PendingActions")
@js.native
object PendingActions extends js.Object {
  val pluginName: typings.ckeditorCkeditor5Core.ckeditorCkeditor5CoreStrings.PendingActions = js.native
}

