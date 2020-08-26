package typings.backboneRadio.mod.backboneAugmentingMod.Radio

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backbone", "Radio.Requests")
@js.native
class Requests () extends js.Object {
  def reply(commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]]): Requests = js.native
  def reply(commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]], context: js.Any): Requests = js.native
  def reply(requestName: String, callback: js.Function1[/* repeated */ js.Any, _]): Requests = js.native
  def reply(requestName: String, callback: js.Function1[/* repeated */ js.Any, _], context: js.Any): Requests = js.native
  def replyOnce(commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]]): Requests = js.native
  def replyOnce(commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]], context: js.Any): Requests = js.native
  def replyOnce(requestName: String, callback: js.Function1[/* repeated */ js.Any, _]): Requests = js.native
  def replyOnce(requestName: String, callback: js.Function1[/* repeated */ js.Any, _], context: js.Any): Requests = js.native
  def request(requestName: String, args: js.Any*): js.Any = js.native
  def stopReplying(): Requests = js.native
  def stopReplying(commandName: js.UndefOr[scala.Nothing], callback: js.UndefOr[scala.Nothing], context: js.Any): Requests = js.native
  def stopReplying(commandName: js.UndefOr[scala.Nothing], callback: js.Function1[/* repeated */ js.Any, _]): Requests = js.native
  def stopReplying(
    commandName: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* repeated */ js.Any, _],
    context: js.Any
  ): Requests = js.native
  def stopReplying(commandName: String): Requests = js.native
  def stopReplying(commandName: String, callback: js.UndefOr[scala.Nothing], context: js.Any): Requests = js.native
  def stopReplying(commandName: String, callback: js.Function1[/* repeated */ js.Any, _]): Requests = js.native
  def stopReplying(commandName: String, callback: js.Function1[/* repeated */ js.Any, _], context: js.Any): Requests = js.native
}

