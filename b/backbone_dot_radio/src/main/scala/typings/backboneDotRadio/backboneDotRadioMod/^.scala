package typings.backboneDotRadio.backboneDotRadioMod

import org.scalablytyped.runtime.StringDictionary
import typings.backboneDotRadio.backboneDotRadioMod.backboneMod.Radio
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backbone.radio", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var DEBUG: Boolean = js.native
  var VERSION: String = js.native
  def bind(channelName: String, eventName: String, callback: js.Function): js.Any = js.native
  def bind(channelName: String, eventName: String, callback: js.Function, context: js.Any): js.Any = js.native
  def channel(channelName: String): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.RadioNs.Channel = js.native
  // Proxy functions for Commands
  def command(channelName: String, commandName: String, args: js.Any*): Unit = js.native
  def comply(channelName: String, commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.RadioNs.Commands = js.native
  def comply(
    channelName: String,
    commandName: String,
    callback: js.Function1[/* repeated */ js.Any, Unit],
    context: js.Any
  ): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.RadioNs.Commands = js.native
  def comply(channelName: String, commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]]): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.RadioNs.Commands = js.native
  def comply(
    channelName: String,
    commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]],
    context: js.Any
  ): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.RadioNs.Commands = js.native
  def complyOnce(channelName: String, commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.RadioNs.Commands = js.native
  def complyOnce(
    channelName: String,
    commandName: String,
    callback: js.Function1[/* repeated */ js.Any, Unit],
    context: js.Any
  ): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.RadioNs.Commands = js.native
  def complyOnce(channelName: String, commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]]): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.RadioNs.Commands = js.native
  def complyOnce(
    channelName: String,
    commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]],
    context: js.Any
  ): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.RadioNs.Commands = js.native
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
  def reply(channelName: String, commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]]): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.RadioNs.Requests = js.native
  def reply(
    channelName: String,
    commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]],
    context: js.Any
  ): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.RadioNs.Requests = js.native
  def reply(channelName: String, requestName: String, callback: js.Function1[/* repeated */ js.Any, _]): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.RadioNs.Requests = js.native
  def reply(
    channelName: String,
    requestName: String,
    callback: js.Function1[/* repeated */ js.Any, _],
    context: js.Any
  ): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.RadioNs.Requests = js.native
  def replyOnce(channelName: String, commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]]): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.RadioNs.Requests = js.native
  def replyOnce(
    channelName: String,
    commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]],
    context: js.Any
  ): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.RadioNs.Requests = js.native
  def replyOnce(channelName: String, requestName: String, callback: js.Function1[/* repeated */ js.Any, _]): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.RadioNs.Requests = js.native
  def replyOnce(
    channelName: String,
    requestName: String,
    callback: js.Function1[/* repeated */ js.Any, _],
    context: js.Any
  ): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.RadioNs.Requests = js.native
  // Proxy functions for Requests
  def request(channelName: String, requestName: String, args: js.Any*): js.Any = js.native
  def stopComplying(channelName: String): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.RadioNs.Commands = js.native
  def stopComplying(channelName: String, commandName: String): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.RadioNs.Commands = js.native
  def stopComplying(channelName: String, commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.RadioNs.Commands = js.native
  def stopComplying(
    channelName: String,
    commandName: String,
    callback: js.Function1[/* repeated */ js.Any, Unit],
    context: js.Any
  ): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.RadioNs.Commands = js.native
  def stopListening(channelName: String): js.Any = js.native
  def stopListening(channelName: String, `object`: js.Any): js.Any = js.native
  def stopListening(channelName: String, `object`: js.Any, events: String): js.Any = js.native
  def stopListening(channelName: String, `object`: js.Any, events: String, callback: js.Function): js.Any = js.native
  def stopReplying(channelName: String): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.RadioNs.Requests = js.native
  def stopReplying(channelName: String, commandName: String): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.RadioNs.Requests = js.native
  def stopReplying(channelName: String, commandName: String, callback: js.Function1[/* repeated */ js.Any, _]): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.RadioNs.Requests = js.native
  def stopReplying(
    channelName: String,
    commandName: String,
    callback: js.Function1[/* repeated */ js.Any, _],
    context: js.Any
  ): typings.backboneDotRadio.backboneDotRadioMod.backboneMod.RadioNs.Requests = js.native
  def trigger(channelName: String, eventName: String, args: js.Any*): js.Any = js.native
  def tuneIn(channelName: String): Radio = js.native
  def tuneOut(channelName: String): Radio = js.native
  def unbind(channelName: String): js.Any = js.native
  def unbind(channelName: String, eventName: String): js.Any = js.native
  def unbind(channelName: String, eventName: String, callback: js.Function): js.Any = js.native
  def unbind(channelName: String, eventName: String, callback: js.Function, context: js.Any): js.Any = js.native
}

