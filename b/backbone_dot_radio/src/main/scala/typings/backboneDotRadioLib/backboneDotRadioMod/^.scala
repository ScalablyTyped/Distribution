package typings
package backboneDotRadioLib.backboneDotRadioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backbone.radio", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var DEBUG: scala.Boolean = js.native
  var VERSION: java.lang.String = js.native
  def bind(channelName: java.lang.String, eventName: java.lang.String, callback: js.Function): js.Any = js.native
  def bind(channelName: java.lang.String, eventName: java.lang.String, callback: js.Function, context: js.Any): js.Any = js.native
  def channel(channelName: java.lang.String): backboneDotRadioLib.backboneDotRadioMod.backboneMod.RadioNs.Channel = js.native
  // Proxy functions for Commands
  def command(channelName: java.lang.String, commandName: java.lang.String, args: js.Any*): scala.Unit = js.native
  def comply(
    channelName: java.lang.String,
    commandName: java.lang.String,
    callback: js.Function1[/* repeated */ js.Any, scala.Unit]
  ): backboneDotRadioLib.backboneDotRadioMod.backboneMod.RadioNs.Commands = js.native
  def comply(
    channelName: java.lang.String,
    commandName: java.lang.String,
    callback: js.Function1[/* repeated */ js.Any, scala.Unit],
    context: js.Any
  ): backboneDotRadioLib.backboneDotRadioMod.backboneMod.RadioNs.Commands = js.native
  def comply(
    channelName: java.lang.String,
    commands: org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, _]]
  ): backboneDotRadioLib.backboneDotRadioMod.backboneMod.RadioNs.Commands = js.native
  def comply(
    channelName: java.lang.String,
    commands: org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, _]],
    context: js.Any
  ): backboneDotRadioLib.backboneDotRadioMod.backboneMod.RadioNs.Commands = js.native
  def complyOnce(
    channelName: java.lang.String,
    commandName: java.lang.String,
    callback: js.Function1[/* repeated */ js.Any, scala.Unit]
  ): backboneDotRadioLib.backboneDotRadioMod.backboneMod.RadioNs.Commands = js.native
  def complyOnce(
    channelName: java.lang.String,
    commandName: java.lang.String,
    callback: js.Function1[/* repeated */ js.Any, scala.Unit],
    context: js.Any
  ): backboneDotRadioLib.backboneDotRadioMod.backboneMod.RadioNs.Commands = js.native
  def complyOnce(
    channelName: java.lang.String,
    commands: org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, _]]
  ): backboneDotRadioLib.backboneDotRadioMod.backboneMod.RadioNs.Commands = js.native
  def complyOnce(
    channelName: java.lang.String,
    commands: org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, _]],
    context: js.Any
  ): backboneDotRadioLib.backboneDotRadioMod.backboneMod.RadioNs.Commands = js.native
  def listenTo(channelName: java.lang.String, `object`: js.Any, events: java.lang.String, callback: js.Function): js.Any = js.native
  def listenToOnce(channelName: java.lang.String, `object`: js.Any, events: java.lang.String, callback: js.Function): js.Any = js.native
  def log(channelName: java.lang.String, eventName: java.lang.String, args: js.Any*): scala.Unit = js.native
  def off(channelName: java.lang.String): js.Any = js.native
  def off(channelName: java.lang.String, eventName: java.lang.String): js.Any = js.native
  def off(channelName: java.lang.String, eventName: java.lang.String, callback: js.Function): js.Any = js.native
  def off(channelName: java.lang.String, eventName: java.lang.String, callback: js.Function, context: js.Any): js.Any = js.native
  // Proxy functions for Backbone.Events
  def on(channelName: java.lang.String, eventName: java.lang.String): js.Any = js.native
  def on(channelName: java.lang.String, eventName: java.lang.String, callback: js.Function): js.Any = js.native
  def on(channelName: java.lang.String, eventName: java.lang.String, callback: js.Function, context: js.Any): js.Any = js.native
  def once(channelName: java.lang.String, events: java.lang.String, callback: js.Function): js.Any = js.native
  def once(channelName: java.lang.String, events: java.lang.String, callback: js.Function, context: js.Any): js.Any = js.native
  def reply(
    channelName: java.lang.String,
    commands: org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, _]]
  ): backboneDotRadioLib.backboneDotRadioMod.backboneMod.RadioNs.Requests = js.native
  def reply(
    channelName: java.lang.String,
    commands: org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, _]],
    context: js.Any
  ): backboneDotRadioLib.backboneDotRadioMod.backboneMod.RadioNs.Requests = js.native
  def reply(
    channelName: java.lang.String,
    requestName: java.lang.String,
    callback: js.Function1[/* repeated */ js.Any, _]
  ): backboneDotRadioLib.backboneDotRadioMod.backboneMod.RadioNs.Requests = js.native
  def reply(
    channelName: java.lang.String,
    requestName: java.lang.String,
    callback: js.Function1[/* repeated */ js.Any, _],
    context: js.Any
  ): backboneDotRadioLib.backboneDotRadioMod.backboneMod.RadioNs.Requests = js.native
  def replyOnce(
    channelName: java.lang.String,
    commands: org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, _]]
  ): backboneDotRadioLib.backboneDotRadioMod.backboneMod.RadioNs.Requests = js.native
  def replyOnce(
    channelName: java.lang.String,
    commands: org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, _]],
    context: js.Any
  ): backboneDotRadioLib.backboneDotRadioMod.backboneMod.RadioNs.Requests = js.native
  def replyOnce(
    channelName: java.lang.String,
    requestName: java.lang.String,
    callback: js.Function1[/* repeated */ js.Any, _]
  ): backboneDotRadioLib.backboneDotRadioMod.backboneMod.RadioNs.Requests = js.native
  def replyOnce(
    channelName: java.lang.String,
    requestName: java.lang.String,
    callback: js.Function1[/* repeated */ js.Any, _],
    context: js.Any
  ): backboneDotRadioLib.backboneDotRadioMod.backboneMod.RadioNs.Requests = js.native
  // Proxy functions for Requests
  def request(channelName: java.lang.String, requestName: java.lang.String, args: js.Any*): js.Any = js.native
  def stopComplying(channelName: java.lang.String): backboneDotRadioLib.backboneDotRadioMod.backboneMod.RadioNs.Commands = js.native
  def stopComplying(channelName: java.lang.String, commandName: java.lang.String): backboneDotRadioLib.backboneDotRadioMod.backboneMod.RadioNs.Commands = js.native
  def stopComplying(
    channelName: java.lang.String,
    commandName: java.lang.String,
    callback: js.Function1[/* repeated */ js.Any, scala.Unit]
  ): backboneDotRadioLib.backboneDotRadioMod.backboneMod.RadioNs.Commands = js.native
  def stopComplying(
    channelName: java.lang.String,
    commandName: java.lang.String,
    callback: js.Function1[/* repeated */ js.Any, scala.Unit],
    context: js.Any
  ): backboneDotRadioLib.backboneDotRadioMod.backboneMod.RadioNs.Commands = js.native
  def stopListening(channelName: java.lang.String): js.Any = js.native
  def stopListening(channelName: java.lang.String, `object`: js.Any): js.Any = js.native
  def stopListening(channelName: java.lang.String, `object`: js.Any, events: java.lang.String): js.Any = js.native
  def stopListening(channelName: java.lang.String, `object`: js.Any, events: java.lang.String, callback: js.Function): js.Any = js.native
  def stopReplying(channelName: java.lang.String): backboneDotRadioLib.backboneDotRadioMod.backboneMod.RadioNs.Requests = js.native
  def stopReplying(channelName: java.lang.String, commandName: java.lang.String): backboneDotRadioLib.backboneDotRadioMod.backboneMod.RadioNs.Requests = js.native
  def stopReplying(
    channelName: java.lang.String,
    commandName: java.lang.String,
    callback: js.Function1[/* repeated */ js.Any, _]
  ): backboneDotRadioLib.backboneDotRadioMod.backboneMod.RadioNs.Requests = js.native
  def stopReplying(
    channelName: java.lang.String,
    commandName: java.lang.String,
    callback: js.Function1[/* repeated */ js.Any, _],
    context: js.Any
  ): backboneDotRadioLib.backboneDotRadioMod.backboneMod.RadioNs.Requests = js.native
  def trigger(channelName: java.lang.String, eventName: java.lang.String, args: js.Any*): js.Any = js.native
  def tuneIn(channelName: java.lang.String): backboneDotRadioLib.backboneDotRadioMod.backboneMod.Radio = js.native
  def tuneOut(channelName: java.lang.String): backboneDotRadioLib.backboneDotRadioMod.backboneMod.Radio = js.native
  def unbind(channelName: java.lang.String): js.Any = js.native
  def unbind(channelName: java.lang.String, eventName: java.lang.String): js.Any = js.native
  def unbind(channelName: java.lang.String, eventName: java.lang.String, callback: js.Function): js.Any = js.native
  def unbind(channelName: java.lang.String, eventName: java.lang.String, callback: js.Function, context: js.Any): js.Any = js.native
}

