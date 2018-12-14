package typings
package atCkeditorCkeditor5DashCoreLib.ckeditor5DashCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ckeditor/ckeditor5-core", "CommandCollection")
@js.native
class CommandCollection () extends js.Object {
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  var iterator: js.Function0[stdLib.Iterator[js.Tuple2[java.lang.String, Command[js.UndefOr[scala.Nothing]]]]] = js.native
  def add(commandName: java.lang.String, command: Command[js.UndefOr[scala.Nothing]]): scala.Unit = js.native
  def commands(): stdLib.IterableIterator[Command[js.UndefOr[scala.Nothing]]] = js.native
  def destroy(): scala.Unit = js.native
  def execute(commandName: java.lang.String, commandParams: js.Any*): scala.Unit = js.native
  def get(commandName: java.lang.String): Command[js.UndefOr[scala.Nothing]] = js.native
  def names(): stdLib.IterableIterator[java.lang.String] = js.native
}

