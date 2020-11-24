package typings.ckeditorCkeditor5Core.mod

import typings.std.IterableIterator
import typings.std.Iterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ckeditor/ckeditor5-core", "CommandCollection")
@js.native
class CommandCollection () extends js.Object {
  
  def add(commandName: String, command: Command[js.UndefOr[scala.Nothing]]): Unit = js.native
  
  def commands(): IterableIterator[Command[js.UndefOr[scala.Nothing]]] = js.native
  
  def destroy(): Unit = js.native
  
  def execute(commandName: String, commandParams: js.Any*): Unit = js.native
  
  def get(commandName: String): Command[js.UndefOr[scala.Nothing]] = js.native
  
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[
    Iterator[js.Tuple2[String, Command[js.UndefOr[scala.Nothing]]], _, js.UndefOr[scala.Nothing]]
  ] = js.native
  
  def names(): IterableIterator[String] = js.native
}
