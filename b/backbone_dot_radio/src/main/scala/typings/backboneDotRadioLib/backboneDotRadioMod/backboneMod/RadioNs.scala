package typings
package backboneDotRadioLib.backboneDotRadioMod.backboneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("backbone.radio/backbone", "Radio")
@js.native
object RadioNs extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - backboneDotRadioLib.backboneDotRadioMod.backboneMod.RadioNs.Requests because Inheritance from two classes. Inlined request, reply, reply, reply, reply, replyOnce, replyOnce, replyOnce, replyOnce, stopReplying, stopReplying, stopReplying, stopReplying- backboneDotRadioLib.backboneDotRadioMod.backboneMod.RadioNs.Commands because Inheritance from two classes. Inlined command, comply, comply, comply, comply, complyOnce, complyOnce, complyOnce, complyOnce, stopComplying, stopComplying, stopComplying, stopComplying */ @js.native
  class Channel ()
    extends backboneLib.backboneMod.EventsMixin
       with backboneLib.backboneMod.Events {
    var channelName: java.lang.String = js.native
    // Radio.Commands
    def command(commandName: java.lang.String, args: js.Any*): scala.Unit = js.native
    def comply(commandName: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit]): Commands = js.native
    def comply(
      commandName: java.lang.String,
      callback: js.Function1[/* repeated */ js.Any, scala.Unit],
      context: js.Any
    ): Commands = js.native
    def comply(commands: org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, _]]): Commands = js.native
    def comply(
      commands: org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, _]],
      context: js.Any
    ): Commands = js.native
    def complyOnce(commandName: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit]): Commands = js.native
    def complyOnce(
      commandName: java.lang.String,
      callback: js.Function1[/* repeated */ js.Any, scala.Unit],
      context: js.Any
    ): Commands = js.native
    def complyOnce(commands: org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, _]]): Commands = js.native
    def complyOnce(
      commands: org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, _]],
      context: js.Any
    ): Commands = js.native
    /**
      * Faulty overgeneralization of Backbone.Events.on, for historical
      * reasons.
      */
    def on(eventName: js.Any): js.Any = js.native
    def on(eventName: js.Any, callback: js.Any): js.Any = js.native
    def on(eventName: js.Any, callback: js.Any, context: js.Any): js.Any = js.native
    def reply(commands: org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, _]]): Requests = js.native
    def reply(
      commands: org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, _]],
      context: js.Any
    ): Requests = js.native
    def reply(requestName: java.lang.String, callback: js.Function1[/* repeated */ js.Any, _]): Requests = js.native
    def reply(requestName: java.lang.String, callback: js.Function1[/* repeated */ js.Any, _], context: js.Any): Requests = js.native
    def replyOnce(commands: org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, _]]): Requests = js.native
    def replyOnce(
      commands: org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, _]],
      context: js.Any
    ): Requests = js.native
    def replyOnce(requestName: java.lang.String, callback: js.Function1[/* repeated */ js.Any, _]): Requests = js.native
    def replyOnce(requestName: java.lang.String, callback: js.Function1[/* repeated */ js.Any, _], context: js.Any): Requests = js.native
    // Radio.Requests
    def request(requestName: java.lang.String, args: js.Any*): js.Any = js.native
    def reset(): Channel = js.native
    def stopComplying(): Commands = js.native
    def stopComplying(commandName: java.lang.String): Commands = js.native
    def stopComplying(commandName: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit]): Commands = js.native
    def stopComplying(
      commandName: java.lang.String,
      callback: js.Function1[/* repeated */ js.Any, scala.Unit],
      context: js.Any
    ): Commands = js.native
    def stopReplying(): Requests = js.native
    def stopReplying(commandName: java.lang.String): Requests = js.native
    def stopReplying(commandName: java.lang.String, callback: js.Function1[/* repeated */ js.Any, _]): Requests = js.native
    def stopReplying(commandName: java.lang.String, callback: js.Function1[/* repeated */ js.Any, _], context: js.Any): Requests = js.native
  }
  
  @js.native
  class Commands () extends js.Object {
    def command(commandName: java.lang.String, args: js.Any*): scala.Unit = js.native
    def comply(commandName: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit]): Commands = js.native
    def comply(
      commandName: java.lang.String,
      callback: js.Function1[/* repeated */ js.Any, scala.Unit],
      context: js.Any
    ): Commands = js.native
    def comply(commands: org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, _]]): Commands = js.native
    def comply(
      commands: org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, _]],
      context: js.Any
    ): Commands = js.native
    def complyOnce(commandName: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit]): Commands = js.native
    def complyOnce(
      commandName: java.lang.String,
      callback: js.Function1[/* repeated */ js.Any, scala.Unit],
      context: js.Any
    ): Commands = js.native
    def complyOnce(commands: org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, _]]): Commands = js.native
    def complyOnce(
      commands: org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, _]],
      context: js.Any
    ): Commands = js.native
    def stopComplying(): Commands = js.native
    def stopComplying(commandName: java.lang.String): Commands = js.native
    def stopComplying(commandName: java.lang.String, callback: js.Function1[/* repeated */ js.Any, scala.Unit]): Commands = js.native
    def stopComplying(
      commandName: java.lang.String,
      callback: js.Function1[/* repeated */ js.Any, scala.Unit],
      context: js.Any
    ): Commands = js.native
  }
  
  @js.native
  class Requests () extends js.Object {
    def reply(commands: org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, _]]): Requests = js.native
    def reply(
      commands: org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, _]],
      context: js.Any
    ): Requests = js.native
    def reply(requestName: java.lang.String, callback: js.Function1[/* repeated */ js.Any, _]): Requests = js.native
    def reply(requestName: java.lang.String, callback: js.Function1[/* repeated */ js.Any, _], context: js.Any): Requests = js.native
    def replyOnce(commands: org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, _]]): Requests = js.native
    def replyOnce(
      commands: org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, _]],
      context: js.Any
    ): Requests = js.native
    def replyOnce(requestName: java.lang.String, callback: js.Function1[/* repeated */ js.Any, _]): Requests = js.native
    def replyOnce(requestName: java.lang.String, callback: js.Function1[/* repeated */ js.Any, _], context: js.Any): Requests = js.native
    def request(requestName: java.lang.String, args: js.Any*): js.Any = js.native
    def stopReplying(): Requests = js.native
    def stopReplying(commandName: java.lang.String): Requests = js.native
    def stopReplying(commandName: java.lang.String, callback: js.Function1[/* repeated */ js.Any, _]): Requests = js.native
    def stopReplying(commandName: java.lang.String, callback: js.Function1[/* repeated */ js.Any, _], context: js.Any): Requests = js.native
  }
  
  var DEBUG: scala.Boolean = js.native
  var VERSION: java.lang.String = js.native
  def bind(channelName: java.lang.String, eventName: java.lang.String, callback: js.Function): js.Any = js.native
  def bind(channelName: java.lang.String, eventName: java.lang.String, callback: js.Function, context: js.Any): js.Any = js.native
  def channel(channelName: java.lang.String): Channel = js.native
  // Proxy functions for Commands
  def command(channelName: java.lang.String, commandName: java.lang.String, args: js.Any*): scala.Unit = js.native
  def comply(
    channelName: java.lang.String,
    commandName: java.lang.String,
    callback: js.Function1[/* repeated */ js.Any, scala.Unit]
  ): Commands = js.native
  def comply(
    channelName: java.lang.String,
    commandName: java.lang.String,
    callback: js.Function1[/* repeated */ js.Any, scala.Unit],
    context: js.Any
  ): Commands = js.native
  def comply(
    channelName: java.lang.String,
    commands: org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, _]]
  ): Commands = js.native
  def comply(
    channelName: java.lang.String,
    commands: org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, _]],
    context: js.Any
  ): Commands = js.native
  def complyOnce(
    channelName: java.lang.String,
    commandName: java.lang.String,
    callback: js.Function1[/* repeated */ js.Any, scala.Unit]
  ): Commands = js.native
  def complyOnce(
    channelName: java.lang.String,
    commandName: java.lang.String,
    callback: js.Function1[/* repeated */ js.Any, scala.Unit],
    context: js.Any
  ): Commands = js.native
  def complyOnce(
    channelName: java.lang.String,
    commands: org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, _]]
  ): Commands = js.native
  def complyOnce(
    channelName: java.lang.String,
    commands: org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, _]],
    context: js.Any
  ): Commands = js.native
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
  ): Requests = js.native
  def reply(
    channelName: java.lang.String,
    commands: org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, _]],
    context: js.Any
  ): Requests = js.native
  def reply(
    channelName: java.lang.String,
    requestName: java.lang.String,
    callback: js.Function1[/* repeated */ js.Any, _]
  ): Requests = js.native
  def reply(
    channelName: java.lang.String,
    requestName: java.lang.String,
    callback: js.Function1[/* repeated */ js.Any, _],
    context: js.Any
  ): Requests = js.native
  def replyOnce(
    channelName: java.lang.String,
    commands: org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, _]]
  ): Requests = js.native
  def replyOnce(
    channelName: java.lang.String,
    commands: org.scalablytyped.runtime.StringDictionary[js.Function1[/* repeated */ js.Any, _]],
    context: js.Any
  ): Requests = js.native
  def replyOnce(
    channelName: java.lang.String,
    requestName: java.lang.String,
    callback: js.Function1[/* repeated */ js.Any, _]
  ): Requests = js.native
  def replyOnce(
    channelName: java.lang.String,
    requestName: java.lang.String,
    callback: js.Function1[/* repeated */ js.Any, _],
    context: js.Any
  ): Requests = js.native
  // Proxy functions for Requests
  def request(channelName: java.lang.String, requestName: java.lang.String, args: js.Any*): js.Any = js.native
  def stopComplying(channelName: java.lang.String): Commands = js.native
  def stopComplying(channelName: java.lang.String, commandName: java.lang.String): Commands = js.native
  def stopComplying(
    channelName: java.lang.String,
    commandName: java.lang.String,
    callback: js.Function1[/* repeated */ js.Any, scala.Unit]
  ): Commands = js.native
  def stopComplying(
    channelName: java.lang.String,
    commandName: java.lang.String,
    callback: js.Function1[/* repeated */ js.Any, scala.Unit],
    context: js.Any
  ): Commands = js.native
  def stopListening(channelName: java.lang.String): js.Any = js.native
  def stopListening(channelName: java.lang.String, `object`: js.Any): js.Any = js.native
  def stopListening(channelName: java.lang.String, `object`: js.Any, events: java.lang.String): js.Any = js.native
  def stopListening(channelName: java.lang.String, `object`: js.Any, events: java.lang.String, callback: js.Function): js.Any = js.native
  def stopReplying(channelName: java.lang.String): Requests = js.native
  def stopReplying(channelName: java.lang.String, commandName: java.lang.String): Requests = js.native
  def stopReplying(
    channelName: java.lang.String,
    commandName: java.lang.String,
    callback: js.Function1[/* repeated */ js.Any, _]
  ): Requests = js.native
  def stopReplying(
    channelName: java.lang.String,
    commandName: java.lang.String,
    callback: js.Function1[/* repeated */ js.Any, _],
    context: js.Any
  ): Requests = js.native
  def trigger(channelName: java.lang.String, eventName: java.lang.String, args: js.Any*): js.Any = js.native
  def tuneIn(channelName: java.lang.String): backboneDotRadioLib.backboneDotRadioMod.backboneMod.Radio = js.native
  def tuneOut(channelName: java.lang.String): backboneDotRadioLib.backboneDotRadioMod.backboneMod.Radio = js.native
  def unbind(channelName: java.lang.String): js.Any = js.native
  def unbind(channelName: java.lang.String, eventName: java.lang.String): js.Any = js.native
  def unbind(channelName: java.lang.String, eventName: java.lang.String, callback: js.Function): js.Any = js.native
  def unbind(channelName: java.lang.String, eventName: java.lang.String, callback: js.Function, context: js.Any): js.Any = js.native
}

