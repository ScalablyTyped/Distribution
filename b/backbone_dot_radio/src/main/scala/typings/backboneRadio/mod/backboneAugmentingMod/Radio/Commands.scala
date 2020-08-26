package typings.backboneRadio.mod.backboneAugmentingMod.Radio

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backbone", "Radio.Commands")
@js.native
class Commands () extends js.Object {
  def command(commandName: String, args: js.Any*): Unit = js.native
  def comply(commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Commands = js.native
  def comply(commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit], context: js.Any): Commands = js.native
  def comply(commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]]): Commands = js.native
  def comply(commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]], context: js.Any): Commands = js.native
  def complyOnce(commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Commands = js.native
  def complyOnce(commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit], context: js.Any): Commands = js.native
  def complyOnce(commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]]): Commands = js.native
  def complyOnce(commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]], context: js.Any): Commands = js.native
  def stopComplying(): Commands = js.native
  def stopComplying(commandName: js.UndefOr[scala.Nothing], callback: js.UndefOr[scala.Nothing], context: js.Any): Commands = js.native
  def stopComplying(commandName: js.UndefOr[scala.Nothing], callback: js.Function1[/* repeated */ js.Any, Unit]): Commands = js.native
  def stopComplying(
    commandName: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* repeated */ js.Any, Unit],
    context: js.Any
  ): Commands = js.native
  def stopComplying(commandName: String): Commands = js.native
  def stopComplying(commandName: String, callback: js.UndefOr[scala.Nothing], context: js.Any): Commands = js.native
  def stopComplying(commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Commands = js.native
  def stopComplying(commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit], context: js.Any): Commands = js.native
}

