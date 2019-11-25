package typings.backboneDotRadio.backboneDotRadioMod.backboneMod

import org.scalablytyped.runtime.StringDictionary
import typings.backbone.backboneMod.EventHandler
import typings.backbone.backboneMod.EventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Radio extends js.Object {
  def channel(channelName: String): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Channel
  def log(channelName: String, eventName: String, args: js.Any*): Unit
  def tuneIn(channelName: String): Radio
  def tuneOut(channelName: String): Radio
}

@JSImport("backbone", "Radio")
@js.native
object Radio extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.backbone.backboneMod.EventsMixin because Inheritance from two classes. Inlined bind, bind, bind, bind, listenTo, listenTo, listenToOnce, listenToOnce, off, off, off, off, on, on, on, on, once, once, once, once, stopListening, stopListening, stopListening, stopListening, trigger, unbind, unbind, unbind, unbind
  - typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Requests because Inheritance from two classes. Inlined request, reply, reply, reply, reply, replyOnce, replyOnce, replyOnce, replyOnce, stopReplying, stopReplying, stopReplying, stopReplying */ @js.native
  class Channel ()
    extends typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Commands {
    var channelName: String = js.native
    def bind(eventMap: EventMap): this.type = js.native
    def bind(eventMap: EventMap, context: js.Any): this.type = js.native
    def bind(eventName: String, callback: EventHandler): this.type = js.native
    def bind(eventName: String, callback: EventHandler, context: js.Any): this.type = js.native
    def listenTo(`object`: js.Any, eventMap: EventMap): this.type = js.native
    def listenTo(`object`: js.Any, events: String, callback: EventHandler): this.type = js.native
    def listenToOnce(`object`: js.Any, eventMap: EventMap): this.type = js.native
    def listenToOnce(`object`: js.Any, events: String, callback: EventHandler): this.type = js.native
    def off(): this.type = js.native
    def off(eventName: String): this.type = js.native
    def off(eventName: String, callback: EventHandler): this.type = js.native
    def off(eventName: String, callback: EventHandler, context: js.Any): this.type = js.native
    def on(eventMap: EventMap): this.type = js.native
    def on(eventMap: EventMap, context: js.Any): this.type = js.native
    def on(eventName: String, callback: EventHandler): this.type = js.native
    def on(eventName: String, callback: EventHandler, context: js.Any): this.type = js.native
    /**
      * Faulty overgeneralization of Backbone.Events.on, for historical
      * reasons.
      */
    def on(eventName: js.Any): js.Any = js.native
    def on(eventName: js.Any, callback: js.Any): js.Any = js.native
    def on(eventName: js.Any, callback: js.Any, context: js.Any): js.Any = js.native
    def once(eventMap: EventMap): this.type = js.native
    def once(eventMap: EventMap, context: js.Any): this.type = js.native
    def once(events: String, callback: EventHandler): this.type = js.native
    def once(events: String, callback: EventHandler, context: js.Any): this.type = js.native
    def reply(commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]]): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Requests = js.native
    def reply(commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]], context: js.Any): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Requests = js.native
    def reply(requestName: String, callback: js.Function1[/* repeated */ js.Any, _]): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Requests = js.native
    def reply(requestName: String, callback: js.Function1[/* repeated */ js.Any, _], context: js.Any): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Requests = js.native
    def replyOnce(commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]]): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Requests = js.native
    def replyOnce(commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]], context: js.Any): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Requests = js.native
    def replyOnce(requestName: String, callback: js.Function1[/* repeated */ js.Any, _]): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Requests = js.native
    def replyOnce(requestName: String, callback: js.Function1[/* repeated */ js.Any, _], context: js.Any): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Requests = js.native
    // Radio.Requests
    def request(requestName: String, args: js.Any*): js.Any = js.native
    def reset(): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Channel = js.native
    def stopListening(): this.type = js.native
    def stopListening(`object`: js.Any): this.type = js.native
    def stopListening(`object`: js.Any, events: String): this.type = js.native
    def stopListening(`object`: js.Any, events: String, callback: EventHandler): this.type = js.native
    def stopReplying(): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Requests = js.native
    def stopReplying(commandName: String): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Requests = js.native
    def stopReplying(commandName: String, callback: js.Function1[/* repeated */ js.Any, _]): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Requests = js.native
    def stopReplying(commandName: String, callback: js.Function1[/* repeated */ js.Any, _], context: js.Any): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Requests = js.native
    def trigger(eventName: String, args: js.Any*): this.type = js.native
    def unbind(): this.type = js.native
    def unbind(eventName: String): this.type = js.native
    def unbind(eventName: String, callback: EventHandler): this.type = js.native
    def unbind(eventName: String, callback: EventHandler, context: js.Any): this.type = js.native
  }
  
  @js.native
  class Commands () extends js.Object {
    def command(commandName: String, args: js.Any*): Unit = js.native
    def comply(commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Commands = js.native
    def comply(commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit], context: js.Any): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Commands = js.native
    def comply(commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]]): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Commands = js.native
    def comply(commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]], context: js.Any): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Commands = js.native
    def complyOnce(commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Commands = js.native
    def complyOnce(commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit], context: js.Any): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Commands = js.native
    def complyOnce(commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]]): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Commands = js.native
    def complyOnce(commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]], context: js.Any): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Commands = js.native
    def stopComplying(): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Commands = js.native
    def stopComplying(commandName: String): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Commands = js.native
    def stopComplying(commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Commands = js.native
    def stopComplying(commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit], context: js.Any): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Commands = js.native
  }
  
  @js.native
  class Requests () extends js.Object {
    def reply(commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]]): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Requests = js.native
    def reply(commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]], context: js.Any): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Requests = js.native
    def reply(requestName: String, callback: js.Function1[/* repeated */ js.Any, _]): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Requests = js.native
    def reply(requestName: String, callback: js.Function1[/* repeated */ js.Any, _], context: js.Any): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Requests = js.native
    def replyOnce(commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]]): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Requests = js.native
    def replyOnce(commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]], context: js.Any): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Requests = js.native
    def replyOnce(requestName: String, callback: js.Function1[/* repeated */ js.Any, _]): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Requests = js.native
    def replyOnce(requestName: String, callback: js.Function1[/* repeated */ js.Any, _], context: js.Any): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Requests = js.native
    def request(requestName: String, args: js.Any*): js.Any = js.native
    def stopReplying(): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Requests = js.native
    def stopReplying(commandName: String): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Requests = js.native
    def stopReplying(commandName: String, callback: js.Function1[/* repeated */ js.Any, _]): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Requests = js.native
    def stopReplying(commandName: String, callback: js.Function1[/* repeated */ js.Any, _], context: js.Any): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Requests = js.native
  }
  
  var DEBUG: Boolean = js.native
  var VERSION: String = js.native
  def bind(channelName: String, eventName: String, callback: js.Function): js.Any = js.native
  def bind(channelName: String, eventName: String, callback: js.Function, context: js.Any): js.Any = js.native
  def channel(channelName: String): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Channel = js.native
  // Proxy functions for Commands
  def command(channelName: String, commandName: String, args: js.Any*): Unit = js.native
  def comply(channelName: String, commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Commands = js.native
  def comply(
    channelName: String,
    commandName: String,
    callback: js.Function1[/* repeated */ js.Any, Unit],
    context: js.Any
  ): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Commands = js.native
  def comply(channelName: String, commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]]): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Commands = js.native
  def comply(
    channelName: String,
    commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]],
    context: js.Any
  ): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Commands = js.native
  def complyOnce(channelName: String, commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Commands = js.native
  def complyOnce(
    channelName: String,
    commandName: String,
    callback: js.Function1[/* repeated */ js.Any, Unit],
    context: js.Any
  ): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Commands = js.native
  def complyOnce(channelName: String, commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]]): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Commands = js.native
  def complyOnce(
    channelName: String,
    commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]],
    context: js.Any
  ): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Commands = js.native
  def listenTo(channelName: String, `object`: js.Any, events: String, callback: js.Function): js.Any = js.native
  def listenToOnce(channelName: String, `object`: js.Any, events: String, callback: js.Function): js.Any = js.native
  def log(channelName: String, eventName: String, args: js.Any*): Unit = js.native
  def off(channelName: String): js.Any = js.native
  def off(channelName: String, eventName: String): js.Any = js.native
  def off(channelName: String, eventName: String, callback: js.Function): js.Any = js.native
  def off(channelName: String, eventName: String, callback: js.Function, context: js.Any): js.Any = js.native
  // Proxy functions for Backbone.Events
  def on(channelName: String, eventName: String): js.Any = js.native
  def on(channelName: String, eventName: String, callback: js.Function): js.Any = js.native
  def on(channelName: String, eventName: String, callback: js.Function, context: js.Any): js.Any = js.native
  def once(channelName: String, events: String, callback: js.Function): js.Any = js.native
  def once(channelName: String, events: String, callback: js.Function, context: js.Any): js.Any = js.native
  def reply(channelName: String, commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]]): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Requests = js.native
  def reply(
    channelName: String,
    commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]],
    context: js.Any
  ): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Requests = js.native
  def reply(channelName: String, requestName: String, callback: js.Function1[/* repeated */ js.Any, _]): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Requests = js.native
  def reply(
    channelName: String,
    requestName: String,
    callback: js.Function1[/* repeated */ js.Any, _],
    context: js.Any
  ): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Requests = js.native
  def replyOnce(channelName: String, commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]]): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Requests = js.native
  def replyOnce(
    channelName: String,
    commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]],
    context: js.Any
  ): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Requests = js.native
  def replyOnce(channelName: String, requestName: String, callback: js.Function1[/* repeated */ js.Any, _]): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Requests = js.native
  def replyOnce(
    channelName: String,
    requestName: String,
    callback: js.Function1[/* repeated */ js.Any, _],
    context: js.Any
  ): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Requests = js.native
  // Proxy functions for Requests
  def request(channelName: String, requestName: String, args: js.Any*): js.Any = js.native
  def stopComplying(channelName: String): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Commands = js.native
  def stopComplying(channelName: String, commandName: String): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Commands = js.native
  def stopComplying(channelName: String, commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Commands = js.native
  def stopComplying(
    channelName: String,
    commandName: String,
    callback: js.Function1[/* repeated */ js.Any, Unit],
    context: js.Any
  ): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Commands = js.native
  def stopListening(channelName: String): js.Any = js.native
  def stopListening(channelName: String, `object`: js.Any): js.Any = js.native
  def stopListening(channelName: String, `object`: js.Any, events: String): js.Any = js.native
  def stopListening(channelName: String, `object`: js.Any, events: String, callback: js.Function): js.Any = js.native
  def stopReplying(channelName: String): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Requests = js.native
  def stopReplying(channelName: String, commandName: String): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Requests = js.native
  def stopReplying(channelName: String, commandName: String, callback: js.Function1[/* repeated */ js.Any, _]): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Requests = js.native
  def stopReplying(
    channelName: String,
    commandName: String,
    callback: js.Function1[/* repeated */ js.Any, _],
    context: js.Any
  ): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio.Requests = js.native
  def trigger(channelName: String, eventName: String, args: js.Any*): js.Any = js.native
  def tuneIn(channelName: String): Radio = js.native
  def tuneOut(channelName: String): Radio = js.native
  def unbind(channelName: String): js.Any = js.native
  def unbind(channelName: String, eventName: String): js.Any = js.native
  def unbind(channelName: String, eventName: String, callback: js.Function): js.Any = js.native
  def unbind(channelName: String, eventName: String, callback: js.Function, context: js.Any): js.Any = js.native
}

