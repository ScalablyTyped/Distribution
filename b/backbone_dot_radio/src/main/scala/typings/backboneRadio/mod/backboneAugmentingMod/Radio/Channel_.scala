package typings.backboneRadio.mod.backboneAugmentingMod.Radio

import org.scalablytyped.runtime.StringDictionary
import typings.backbone.mod.EventsMixin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests because Inheritance from two classes. Inlined request, reply, reply, reply, reply, replyOnce, replyOnce, replyOnce, replyOnce, stopReplying, stopReplying, stopReplying, stopReplying, stopReplying, stopReplying, stopReplying, stopReplying
- typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands because Inheritance from two classes. Inlined command, comply, comply, comply, comply, complyOnce, complyOnce, complyOnce, complyOnce, stopComplying, stopComplying, stopComplying, stopComplying, stopComplying, stopComplying, stopComplying, stopComplying */ @JSImport("backbone", "Radio.Channel")
@js.native
class Channel_ () extends EventsMixin {
  
  var channelName: String = js.native
  
  // Radio.Commands
  def command(commandName: String, args: js.Any*): Unit = js.native
  
  def comply(commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Commands = js.native
  def comply(commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit], context: js.Any): Commands = js.native
  def comply(commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]]): Commands = js.native
  def comply(commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]], context: js.Any): Commands = js.native
  
  def complyOnce(commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Commands = js.native
  def complyOnce(commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit], context: js.Any): Commands = js.native
  def complyOnce(commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]]): Commands = js.native
  def complyOnce(commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]], context: js.Any): Commands = js.native
  
  /**
    * Faulty overgeneralization of Backbone.Events.on, for historical
    * reasons.
    */
  def on(eventName: js.Any): js.Any = js.native
  def on(eventName: js.Any, callback: js.UndefOr[scala.Nothing], context: js.Any): js.Any = js.native
  def on(eventName: js.Any, callback: js.Any): js.Any = js.native
  def on(eventName: js.Any, callback: js.Any, context: js.Any): js.Any = js.native
  
  def reply(commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]]): Requests = js.native
  def reply(commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]], context: js.Any): Requests = js.native
  def reply(requestName: String, callback: js.Function1[/* repeated */ js.Any, _]): Requests = js.native
  def reply(requestName: String, callback: js.Function1[/* repeated */ js.Any, _], context: js.Any): Requests = js.native
  
  def replyOnce(commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]]): Requests = js.native
  def replyOnce(commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]], context: js.Any): Requests = js.native
  def replyOnce(requestName: String, callback: js.Function1[/* repeated */ js.Any, _]): Requests = js.native
  def replyOnce(requestName: String, callback: js.Function1[/* repeated */ js.Any, _], context: js.Any): Requests = js.native
  
  // Radio.Requests
  def request(requestName: String, args: js.Any*): js.Any = js.native
  
  def reset(): Channel_ = js.native
  
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
