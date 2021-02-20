package typings.backboneRadio

import org.scalablytyped.runtime.StringDictionary
import typings.backbone.mod.EventsMixin
import typings.backboneRadio.mod.backboneAugmentingMod.Radio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("backbone.radio", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("backbone.radio", "Channel")
  @js.native
  class Channel_ ()
    extends typings.backboneRadio.mod.backboneAugmentingMod.Radio.Channel_
  
  @JSImport("backbone.radio", "Commands")
  @js.native
  class Commands ()
    extends typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands
  
  @JSImport("backbone.radio", "DEBUG")
  @js.native
  def DEBUG: Boolean = js.native
  @scala.inline
  def DEBUG_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
  
  @JSImport("backbone.radio", "Requests")
  @js.native
  class Requests ()
    extends typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests
  
  @JSImport("backbone.radio", "VERSION")
  @js.native
  def VERSION: String = js.native
  @scala.inline
  def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
  
  /* augmented module */
  object backboneAugmentingMod {
    
    @js.native
    trait Radio extends StObject {
      
      def channel(channelName: String): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Channel_ = js.native
      
      def log(channelName: String, eventName: String, args: js.Any*): Unit = js.native
      
      def tuneIn(channelName: String): Radio = js.native
      
      def tuneOut(channelName: String): Radio = js.native
    }
    object Radio {
      
      @scala.inline
      def apply(
        channel: String => typings.backboneRadio.mod.backboneAugmentingMod.Radio.Channel_,
        log: (String, String, /* repeated */ js.Any) => Unit,
        tuneIn: String => Radio,
        tuneOut: String => Radio
      ): Radio = {
        val __obj = js.Dynamic.literal(channel = js.Any.fromFunction1(channel), log = js.Any.fromFunction3(log), tuneIn = js.Any.fromFunction1(tuneIn), tuneOut = js.Any.fromFunction1(tuneOut))
        __obj.asInstanceOf[Radio]
      }
      
      @JSImport("backbone", "Radio")
      @js.native
      val ^ : js.Any = js.native
      
      /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
      - typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests because Inheritance from two classes. Inlined request, reply, reply, reply, reply, replyOnce, replyOnce, replyOnce, replyOnce, stopReplying, stopReplying, stopReplying, stopReplying, stopReplying, stopReplying, stopReplying, stopReplying
      - typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands because Inheritance from two classes. Inlined command, comply, comply, comply, comply, complyOnce, complyOnce, complyOnce, complyOnce, stopComplying, stopComplying, stopComplying, stopComplying, stopComplying, stopComplying, stopComplying, stopComplying */ @JSImport("backbone", "Radio.Channel")
      @js.native
      class Channel_ () extends EventsMixin {
        
        var channelName: String = js.native
        
        // Radio.Commands
        def command(commandName: String, args: js.Any*): Unit = js.native
        
        def comply(commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        def comply(commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        def comply(commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        def comply(commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        
        def complyOnce(commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        def complyOnce(commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        def complyOnce(commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        def complyOnce(commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        
        /**
          * Faulty overgeneralization of Backbone.Events.on, for historical
          * reasons.
          */
        def on(eventName: js.Any): js.Any = js.native
        def on(eventName: js.Any, callback: js.UndefOr[scala.Nothing], context: js.Any): js.Any = js.native
        def on(eventName: js.Any, callback: js.Any): js.Any = js.native
        def on(eventName: js.Any, callback: js.Any, context: js.Any): js.Any = js.native
        
        def reply(commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        def reply(commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        def reply(requestName: String, callback: js.Function1[/* repeated */ js.Any, _]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        def reply(requestName: String, callback: js.Function1[/* repeated */ js.Any, _], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        
        def replyOnce(commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        def replyOnce(commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        def replyOnce(requestName: String, callback: js.Function1[/* repeated */ js.Any, _]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        def replyOnce(requestName: String, callback: js.Function1[/* repeated */ js.Any, _], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        
        // Radio.Requests
        def request(requestName: String, args: js.Any*): js.Any = js.native
        
        def reset(): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Channel_ = js.native
        
        def stopComplying(): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        def stopComplying(commandName: js.UndefOr[scala.Nothing], callback: js.UndefOr[scala.Nothing], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        def stopComplying(commandName: js.UndefOr[scala.Nothing], callback: js.Function1[/* repeated */ js.Any, Unit]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        def stopComplying(
          commandName: js.UndefOr[scala.Nothing],
          callback: js.Function1[/* repeated */ js.Any, Unit],
          context: js.Any
        ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        def stopComplying(commandName: String): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        def stopComplying(commandName: String, callback: js.UndefOr[scala.Nothing], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        def stopComplying(commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        def stopComplying(commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        
        def stopReplying(): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        def stopReplying(commandName: js.UndefOr[scala.Nothing], callback: js.UndefOr[scala.Nothing], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        def stopReplying(commandName: js.UndefOr[scala.Nothing], callback: js.Function1[/* repeated */ js.Any, _]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        def stopReplying(
          commandName: js.UndefOr[scala.Nothing],
          callback: js.Function1[/* repeated */ js.Any, _],
          context: js.Any
        ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        def stopReplying(commandName: String): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        def stopReplying(commandName: String, callback: js.UndefOr[scala.Nothing], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        def stopReplying(commandName: String, callback: js.Function1[/* repeated */ js.Any, _]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        def stopReplying(commandName: String, callback: js.Function1[/* repeated */ js.Any, _], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
      }
      
      @JSImport("backbone", "Radio.Commands")
      @js.native
      class Commands () extends StObject {
        
        def command(commandName: String, args: js.Any*): Unit = js.native
        
        def comply(commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        def comply(commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        def comply(commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        def comply(commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        
        def complyOnce(commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        def complyOnce(commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        def complyOnce(commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        def complyOnce(commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        
        def stopComplying(): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        def stopComplying(commandName: js.UndefOr[scala.Nothing], callback: js.UndefOr[scala.Nothing], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        def stopComplying(commandName: js.UndefOr[scala.Nothing], callback: js.Function1[/* repeated */ js.Any, Unit]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        def stopComplying(
          commandName: js.UndefOr[scala.Nothing],
          callback: js.Function1[/* repeated */ js.Any, Unit],
          context: js.Any
        ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        def stopComplying(commandName: String): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        def stopComplying(commandName: String, callback: js.UndefOr[scala.Nothing], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        def stopComplying(commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        def stopComplying(commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
      }
      
      @JSImport("backbone", "Radio.DEBUG")
      @js.native
      def DEBUG: Boolean = js.native
      @scala.inline
      def DEBUG_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
      
      @JSImport("backbone", "Radio.Requests")
      @js.native
      class Requests () extends StObject {
        
        def reply(commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        def reply(commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        def reply(requestName: String, callback: js.Function1[/* repeated */ js.Any, _]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        def reply(requestName: String, callback: js.Function1[/* repeated */ js.Any, _], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        
        def replyOnce(commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        def replyOnce(commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        def replyOnce(requestName: String, callback: js.Function1[/* repeated */ js.Any, _]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        def replyOnce(requestName: String, callback: js.Function1[/* repeated */ js.Any, _], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        
        def request(requestName: String, args: js.Any*): js.Any = js.native
        
        def stopReplying(): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        def stopReplying(commandName: js.UndefOr[scala.Nothing], callback: js.UndefOr[scala.Nothing], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        def stopReplying(commandName: js.UndefOr[scala.Nothing], callback: js.Function1[/* repeated */ js.Any, _]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        def stopReplying(
          commandName: js.UndefOr[scala.Nothing],
          callback: js.Function1[/* repeated */ js.Any, _],
          context: js.Any
        ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        def stopReplying(commandName: String): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        def stopReplying(commandName: String, callback: js.UndefOr[scala.Nothing], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        def stopReplying(commandName: String, callback: js.Function1[/* repeated */ js.Any, _]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        def stopReplying(commandName: String, callback: js.Function1[/* repeated */ js.Any, _], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
      }
      
      @JSImport("backbone", "Radio.VERSION")
      @js.native
      def VERSION: String = js.native
      @scala.inline
      def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
      
      @JSImport("backbone", "Radio.bind")
      @js.native
      def bind(channelName: String, eventName: String, callback: js.Function): js.Any = js.native
      @JSImport("backbone", "Radio.bind")
      @js.native
      def bind(channelName: String, eventName: String, callback: js.Function, context: js.Any): js.Any = js.native
      
      @JSImport("backbone", "Radio.channel")
      @js.native
      def channel(channelName: String): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Channel_ = js.native
      
      // Proxy functions for Commands
      @JSImport("backbone", "Radio.command")
      @js.native
      def command(channelName: String, commandName: String, args: js.Any*): Unit = js.native
      
      @JSImport("backbone", "Radio.comply")
      @js.native
      def comply(channelName: String, commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
      @JSImport("backbone", "Radio.comply")
      @js.native
      def comply(
        channelName: String,
        commandName: String,
        callback: js.Function1[/* repeated */ js.Any, Unit],
        context: js.Any
      ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
      @JSImport("backbone", "Radio.comply")
      @js.native
      def comply(channelName: String, commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
      @JSImport("backbone", "Radio.comply")
      @js.native
      def comply(
        channelName: String,
        commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]],
        context: js.Any
      ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
      
      @JSImport("backbone", "Radio.complyOnce")
      @js.native
      def complyOnce(channelName: String, commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
      @JSImport("backbone", "Radio.complyOnce")
      @js.native
      def complyOnce(
        channelName: String,
        commandName: String,
        callback: js.Function1[/* repeated */ js.Any, Unit],
        context: js.Any
      ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
      @JSImport("backbone", "Radio.complyOnce")
      @js.native
      def complyOnce(channelName: String, commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
      @JSImport("backbone", "Radio.complyOnce")
      @js.native
      def complyOnce(
        channelName: String,
        commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]],
        context: js.Any
      ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
      
      @JSImport("backbone", "Radio.listenTo")
      @js.native
      def listenTo(channelName: String, `object`: js.Any, events: String, callback: js.Function): js.Any = js.native
      
      @JSImport("backbone", "Radio.listenToOnce")
      @js.native
      def listenToOnce(channelName: String, `object`: js.Any, events: String, callback: js.Function): js.Any = js.native
      
      @JSImport("backbone", "Radio.log")
      @js.native
      def log(channelName: String, eventName: String, args: js.Any*): Unit = js.native
      
      @JSImport("backbone", "Radio.off")
      @js.native
      def off(channelName: String): js.Any = js.native
      @JSImport("backbone", "Radio.off")
      @js.native
      def off(
        channelName: String,
        eventName: js.UndefOr[scala.Nothing],
        callback: js.UndefOr[scala.Nothing],
        context: js.Any
      ): js.Any = js.native
      @JSImport("backbone", "Radio.off")
      @js.native
      def off(channelName: String, eventName: js.UndefOr[scala.Nothing], callback: js.Function): js.Any = js.native
      @JSImport("backbone", "Radio.off")
      @js.native
      def off(channelName: String, eventName: js.UndefOr[scala.Nothing], callback: js.Function, context: js.Any): js.Any = js.native
      @JSImport("backbone", "Radio.off")
      @js.native
      def off(channelName: String, eventName: String): js.Any = js.native
      @JSImport("backbone", "Radio.off")
      @js.native
      def off(channelName: String, eventName: String, callback: js.UndefOr[scala.Nothing], context: js.Any): js.Any = js.native
      @JSImport("backbone", "Radio.off")
      @js.native
      def off(channelName: String, eventName: String, callback: js.Function): js.Any = js.native
      @JSImport("backbone", "Radio.off")
      @js.native
      def off(channelName: String, eventName: String, callback: js.Function, context: js.Any): js.Any = js.native
      
      // Proxy functions for Backbone.Events
      @JSImport("backbone", "Radio.on")
      @js.native
      def on(channelName: String, eventName: String): js.Any = js.native
      @JSImport("backbone", "Radio.on")
      @js.native
      def on(channelName: String, eventName: String, callback: js.UndefOr[scala.Nothing], context: js.Any): js.Any = js.native
      @JSImport("backbone", "Radio.on")
      @js.native
      def on(channelName: String, eventName: String, callback: js.Function): js.Any = js.native
      @JSImport("backbone", "Radio.on")
      @js.native
      def on(channelName: String, eventName: String, callback: js.Function, context: js.Any): js.Any = js.native
      
      @JSImport("backbone", "Radio.once")
      @js.native
      def once(channelName: String, events: String, callback: js.Function): js.Any = js.native
      @JSImport("backbone", "Radio.once")
      @js.native
      def once(channelName: String, events: String, callback: js.Function, context: js.Any): js.Any = js.native
      
      @JSImport("backbone", "Radio.reply")
      @js.native
      def reply(channelName: String, commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
      @JSImport("backbone", "Radio.reply")
      @js.native
      def reply(
        channelName: String,
        commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]],
        context: js.Any
      ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
      @JSImport("backbone", "Radio.reply")
      @js.native
      def reply(channelName: String, requestName: String, callback: js.Function1[/* repeated */ js.Any, _]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
      @JSImport("backbone", "Radio.reply")
      @js.native
      def reply(
        channelName: String,
        requestName: String,
        callback: js.Function1[/* repeated */ js.Any, _],
        context: js.Any
      ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
      
      @JSImport("backbone", "Radio.replyOnce")
      @js.native
      def replyOnce(channelName: String, commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
      @JSImport("backbone", "Radio.replyOnce")
      @js.native
      def replyOnce(
        channelName: String,
        commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]],
        context: js.Any
      ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
      @JSImport("backbone", "Radio.replyOnce")
      @js.native
      def replyOnce(channelName: String, requestName: String, callback: js.Function1[/* repeated */ js.Any, _]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
      @JSImport("backbone", "Radio.replyOnce")
      @js.native
      def replyOnce(
        channelName: String,
        requestName: String,
        callback: js.Function1[/* repeated */ js.Any, _],
        context: js.Any
      ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
      
      // Proxy functions for Requests
      @JSImport("backbone", "Radio.request")
      @js.native
      def request(channelName: String, requestName: String, args: js.Any*): js.Any = js.native
      
      @JSImport("backbone", "Radio.stopComplying")
      @js.native
      def stopComplying(channelName: String): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
      @JSImport("backbone", "Radio.stopComplying")
      @js.native
      def stopComplying(
        channelName: String,
        commandName: js.UndefOr[scala.Nothing],
        callback: js.UndefOr[scala.Nothing],
        context: js.Any
      ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
      @JSImport("backbone", "Radio.stopComplying")
      @js.native
      def stopComplying(
        channelName: String,
        commandName: js.UndefOr[scala.Nothing],
        callback: js.Function1[/* repeated */ js.Any, Unit]
      ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
      @JSImport("backbone", "Radio.stopComplying")
      @js.native
      def stopComplying(
        channelName: String,
        commandName: js.UndefOr[scala.Nothing],
        callback: js.Function1[/* repeated */ js.Any, Unit],
        context: js.Any
      ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
      @JSImport("backbone", "Radio.stopComplying")
      @js.native
      def stopComplying(channelName: String, commandName: String): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
      @JSImport("backbone", "Radio.stopComplying")
      @js.native
      def stopComplying(channelName: String, commandName: String, callback: js.UndefOr[scala.Nothing], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
      @JSImport("backbone", "Radio.stopComplying")
      @js.native
      def stopComplying(channelName: String, commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
      @JSImport("backbone", "Radio.stopComplying")
      @js.native
      def stopComplying(
        channelName: String,
        commandName: String,
        callback: js.Function1[/* repeated */ js.Any, Unit],
        context: js.Any
      ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
      
      @JSImport("backbone", "Radio.stopListening")
      @js.native
      def stopListening(channelName: String): js.Any = js.native
      @JSImport("backbone", "Radio.stopListening")
      @js.native
      def stopListening(
        channelName: String,
        `object`: js.UndefOr[scala.Nothing],
        events: js.UndefOr[scala.Nothing],
        callback: js.Function
      ): js.Any = js.native
      @JSImport("backbone", "Radio.stopListening")
      @js.native
      def stopListening(channelName: String, `object`: js.UndefOr[scala.Nothing], events: String): js.Any = js.native
      @JSImport("backbone", "Radio.stopListening")
      @js.native
      def stopListening(channelName: String, `object`: js.UndefOr[scala.Nothing], events: String, callback: js.Function): js.Any = js.native
      @JSImport("backbone", "Radio.stopListening")
      @js.native
      def stopListening(channelName: String, `object`: js.Any): js.Any = js.native
      @JSImport("backbone", "Radio.stopListening")
      @js.native
      def stopListening(channelName: String, `object`: js.Any, events: js.UndefOr[scala.Nothing], callback: js.Function): js.Any = js.native
      @JSImport("backbone", "Radio.stopListening")
      @js.native
      def stopListening(channelName: String, `object`: js.Any, events: String): js.Any = js.native
      @JSImport("backbone", "Radio.stopListening")
      @js.native
      def stopListening(channelName: String, `object`: js.Any, events: String, callback: js.Function): js.Any = js.native
      
      @JSImport("backbone", "Radio.stopReplying")
      @js.native
      def stopReplying(channelName: String): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
      @JSImport("backbone", "Radio.stopReplying")
      @js.native
      def stopReplying(
        channelName: String,
        commandName: js.UndefOr[scala.Nothing],
        callback: js.UndefOr[scala.Nothing],
        context: js.Any
      ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
      @JSImport("backbone", "Radio.stopReplying")
      @js.native
      def stopReplying(
        channelName: String,
        commandName: js.UndefOr[scala.Nothing],
        callback: js.Function1[/* repeated */ js.Any, _]
      ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
      @JSImport("backbone", "Radio.stopReplying")
      @js.native
      def stopReplying(
        channelName: String,
        commandName: js.UndefOr[scala.Nothing],
        callback: js.Function1[/* repeated */ js.Any, _],
        context: js.Any
      ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
      @JSImport("backbone", "Radio.stopReplying")
      @js.native
      def stopReplying(channelName: String, commandName: String): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
      @JSImport("backbone", "Radio.stopReplying")
      @js.native
      def stopReplying(channelName: String, commandName: String, callback: js.UndefOr[scala.Nothing], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
      @JSImport("backbone", "Radio.stopReplying")
      @js.native
      def stopReplying(channelName: String, commandName: String, callback: js.Function1[/* repeated */ js.Any, _]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
      @JSImport("backbone", "Radio.stopReplying")
      @js.native
      def stopReplying(
        channelName: String,
        commandName: String,
        callback: js.Function1[/* repeated */ js.Any, _],
        context: js.Any
      ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
      
      @JSImport("backbone", "Radio.trigger")
      @js.native
      def trigger(channelName: String, eventName: String, args: js.Any*): js.Any = js.native
      
      @JSImport("backbone", "Radio.tuneIn")
      @js.native
      def tuneIn(channelName: String): Radio = js.native
      
      @JSImport("backbone", "Radio.tuneOut")
      @js.native
      def tuneOut(channelName: String): Radio = js.native
      
      @JSImport("backbone", "Radio.unbind")
      @js.native
      def unbind(channelName: String): js.Any = js.native
      @JSImport("backbone", "Radio.unbind")
      @js.native
      def unbind(
        channelName: String,
        eventName: js.UndefOr[scala.Nothing],
        callback: js.UndefOr[scala.Nothing],
        context: js.Any
      ): js.Any = js.native
      @JSImport("backbone", "Radio.unbind")
      @js.native
      def unbind(channelName: String, eventName: js.UndefOr[scala.Nothing], callback: js.Function): js.Any = js.native
      @JSImport("backbone", "Radio.unbind")
      @js.native
      def unbind(channelName: String, eventName: js.UndefOr[scala.Nothing], callback: js.Function, context: js.Any): js.Any = js.native
      @JSImport("backbone", "Radio.unbind")
      @js.native
      def unbind(channelName: String, eventName: String): js.Any = js.native
      @JSImport("backbone", "Radio.unbind")
      @js.native
      def unbind(channelName: String, eventName: String, callback: js.UndefOr[scala.Nothing], context: js.Any): js.Any = js.native
      @JSImport("backbone", "Radio.unbind")
      @js.native
      def unbind(channelName: String, eventName: String, callback: js.Function): js.Any = js.native
      @JSImport("backbone", "Radio.unbind")
      @js.native
      def unbind(channelName: String, eventName: String, callback: js.Function, context: js.Any): js.Any = js.native
      
      @scala.inline
      implicit class RadioMutableBuilder[Self <: Radio] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setChannel(value: String => typings.backboneRadio.mod.backboneAugmentingMod.Radio.Channel_): Self = StObject.set(x, "channel", js.Any.fromFunction1(value))
        
        @scala.inline
        def setLog(value: (String, String, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "log", js.Any.fromFunction3(value))
        
        @scala.inline
        def setTuneIn(value: String => Radio): Self = StObject.set(x, "tuneIn", js.Any.fromFunction1(value))
        
        @scala.inline
        def setTuneOut(value: String => Radio): Self = StObject.set(x, "tuneOut", js.Any.fromFunction1(value))
      }
    }
  }
  
  @JSImport("backbone.radio", "bind")
  @js.native
  def bind(channelName: String, eventName: String, callback: js.Function): js.Any = js.native
  @JSImport("backbone.radio", "bind")
  @js.native
  def bind(channelName: String, eventName: String, callback: js.Function, context: js.Any): js.Any = js.native
  
  @JSImport("backbone.radio", "channel")
  @js.native
  def channel(channelName: String): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Channel_ = js.native
  
  // Proxy functions for Commands
  @JSImport("backbone.radio", "command")
  @js.native
  def command(channelName: String, commandName: String, args: js.Any*): Unit = js.native
  
  @JSImport("backbone.radio", "comply")
  @js.native
  def comply(channelName: String, commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
  @JSImport("backbone.radio", "comply")
  @js.native
  def comply(
    channelName: String,
    commandName: String,
    callback: js.Function1[/* repeated */ js.Any, Unit],
    context: js.Any
  ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
  @JSImport("backbone.radio", "comply")
  @js.native
  def comply(channelName: String, commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
  @JSImport("backbone.radio", "comply")
  @js.native
  def comply(
    channelName: String,
    commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]],
    context: js.Any
  ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
  
  @JSImport("backbone.radio", "complyOnce")
  @js.native
  def complyOnce(channelName: String, commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
  @JSImport("backbone.radio", "complyOnce")
  @js.native
  def complyOnce(
    channelName: String,
    commandName: String,
    callback: js.Function1[/* repeated */ js.Any, Unit],
    context: js.Any
  ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
  @JSImport("backbone.radio", "complyOnce")
  @js.native
  def complyOnce(channelName: String, commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
  @JSImport("backbone.radio", "complyOnce")
  @js.native
  def complyOnce(
    channelName: String,
    commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]],
    context: js.Any
  ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
  
  @JSImport("backbone.radio", "listenTo")
  @js.native
  def listenTo(channelName: String, `object`: js.Any, events: String, callback: js.Function): js.Any = js.native
  
  @JSImport("backbone.radio", "listenToOnce")
  @js.native
  def listenToOnce(channelName: String, `object`: js.Any, events: String, callback: js.Function): js.Any = js.native
  
  @JSImport("backbone.radio", "log")
  @js.native
  def log(channelName: String, eventName: String, args: js.Any*): Unit = js.native
  
  @JSImport("backbone.radio", "off")
  @js.native
  def off(channelName: String): js.Any = js.native
  @JSImport("backbone.radio", "off")
  @js.native
  def off(
    channelName: String,
    eventName: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): js.Any = js.native
  @JSImport("backbone.radio", "off")
  @js.native
  def off(channelName: String, eventName: js.UndefOr[scala.Nothing], callback: js.Function): js.Any = js.native
  @JSImport("backbone.radio", "off")
  @js.native
  def off(channelName: String, eventName: js.UndefOr[scala.Nothing], callback: js.Function, context: js.Any): js.Any = js.native
  @JSImport("backbone.radio", "off")
  @js.native
  def off(channelName: String, eventName: String): js.Any = js.native
  @JSImport("backbone.radio", "off")
  @js.native
  def off(channelName: String, eventName: String, callback: js.UndefOr[scala.Nothing], context: js.Any): js.Any = js.native
  @JSImport("backbone.radio", "off")
  @js.native
  def off(channelName: String, eventName: String, callback: js.Function): js.Any = js.native
  @JSImport("backbone.radio", "off")
  @js.native
  def off(channelName: String, eventName: String, callback: js.Function, context: js.Any): js.Any = js.native
  
  // Proxy functions for Backbone.Events
  @JSImport("backbone.radio", "on")
  @js.native
  def on(channelName: String, eventName: String): js.Any = js.native
  @JSImport("backbone.radio", "on")
  @js.native
  def on(channelName: String, eventName: String, callback: js.UndefOr[scala.Nothing], context: js.Any): js.Any = js.native
  @JSImport("backbone.radio", "on")
  @js.native
  def on(channelName: String, eventName: String, callback: js.Function): js.Any = js.native
  @JSImport("backbone.radio", "on")
  @js.native
  def on(channelName: String, eventName: String, callback: js.Function, context: js.Any): js.Any = js.native
  
  @JSImport("backbone.radio", "once")
  @js.native
  def once(channelName: String, events: String, callback: js.Function): js.Any = js.native
  @JSImport("backbone.radio", "once")
  @js.native
  def once(channelName: String, events: String, callback: js.Function, context: js.Any): js.Any = js.native
  
  @JSImport("backbone.radio", "reply")
  @js.native
  def reply(channelName: String, commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
  @JSImport("backbone.radio", "reply")
  @js.native
  def reply(
    channelName: String,
    commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]],
    context: js.Any
  ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
  @JSImport("backbone.radio", "reply")
  @js.native
  def reply(channelName: String, requestName: String, callback: js.Function1[/* repeated */ js.Any, _]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
  @JSImport("backbone.radio", "reply")
  @js.native
  def reply(
    channelName: String,
    requestName: String,
    callback: js.Function1[/* repeated */ js.Any, _],
    context: js.Any
  ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
  
  @JSImport("backbone.radio", "replyOnce")
  @js.native
  def replyOnce(channelName: String, commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
  @JSImport("backbone.radio", "replyOnce")
  @js.native
  def replyOnce(
    channelName: String,
    commands: StringDictionary[js.Function1[/* repeated */ js.Any, _]],
    context: js.Any
  ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
  @JSImport("backbone.radio", "replyOnce")
  @js.native
  def replyOnce(channelName: String, requestName: String, callback: js.Function1[/* repeated */ js.Any, _]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
  @JSImport("backbone.radio", "replyOnce")
  @js.native
  def replyOnce(
    channelName: String,
    requestName: String,
    callback: js.Function1[/* repeated */ js.Any, _],
    context: js.Any
  ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
  
  // Proxy functions for Requests
  @JSImport("backbone.radio", "request")
  @js.native
  def request(channelName: String, requestName: String, args: js.Any*): js.Any = js.native
  
  @JSImport("backbone.radio", "stopComplying")
  @js.native
  def stopComplying(channelName: String): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
  @JSImport("backbone.radio", "stopComplying")
  @js.native
  def stopComplying(
    channelName: String,
    commandName: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
  @JSImport("backbone.radio", "stopComplying")
  @js.native
  def stopComplying(
    channelName: String,
    commandName: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* repeated */ js.Any, Unit]
  ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
  @JSImport("backbone.radio", "stopComplying")
  @js.native
  def stopComplying(
    channelName: String,
    commandName: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* repeated */ js.Any, Unit],
    context: js.Any
  ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
  @JSImport("backbone.radio", "stopComplying")
  @js.native
  def stopComplying(channelName: String, commandName: String): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
  @JSImport("backbone.radio", "stopComplying")
  @js.native
  def stopComplying(channelName: String, commandName: String, callback: js.UndefOr[scala.Nothing], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
  @JSImport("backbone.radio", "stopComplying")
  @js.native
  def stopComplying(channelName: String, commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
  @JSImport("backbone.radio", "stopComplying")
  @js.native
  def stopComplying(
    channelName: String,
    commandName: String,
    callback: js.Function1[/* repeated */ js.Any, Unit],
    context: js.Any
  ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
  
  @JSImport("backbone.radio", "stopListening")
  @js.native
  def stopListening(channelName: String): js.Any = js.native
  @JSImport("backbone.radio", "stopListening")
  @js.native
  def stopListening(
    channelName: String,
    `object`: js.UndefOr[scala.Nothing],
    events: js.UndefOr[scala.Nothing],
    callback: js.Function
  ): js.Any = js.native
  @JSImport("backbone.radio", "stopListening")
  @js.native
  def stopListening(channelName: String, `object`: js.UndefOr[scala.Nothing], events: String): js.Any = js.native
  @JSImport("backbone.radio", "stopListening")
  @js.native
  def stopListening(channelName: String, `object`: js.UndefOr[scala.Nothing], events: String, callback: js.Function): js.Any = js.native
  @JSImport("backbone.radio", "stopListening")
  @js.native
  def stopListening(channelName: String, `object`: js.Any): js.Any = js.native
  @JSImport("backbone.radio", "stopListening")
  @js.native
  def stopListening(channelName: String, `object`: js.Any, events: js.UndefOr[scala.Nothing], callback: js.Function): js.Any = js.native
  @JSImport("backbone.radio", "stopListening")
  @js.native
  def stopListening(channelName: String, `object`: js.Any, events: String): js.Any = js.native
  @JSImport("backbone.radio", "stopListening")
  @js.native
  def stopListening(channelName: String, `object`: js.Any, events: String, callback: js.Function): js.Any = js.native
  
  @JSImport("backbone.radio", "stopReplying")
  @js.native
  def stopReplying(channelName: String): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
  @JSImport("backbone.radio", "stopReplying")
  @js.native
  def stopReplying(
    channelName: String,
    commandName: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
  @JSImport("backbone.radio", "stopReplying")
  @js.native
  def stopReplying(
    channelName: String,
    commandName: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* repeated */ js.Any, _]
  ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
  @JSImport("backbone.radio", "stopReplying")
  @js.native
  def stopReplying(
    channelName: String,
    commandName: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* repeated */ js.Any, _],
    context: js.Any
  ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
  @JSImport("backbone.radio", "stopReplying")
  @js.native
  def stopReplying(channelName: String, commandName: String): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
  @JSImport("backbone.radio", "stopReplying")
  @js.native
  def stopReplying(channelName: String, commandName: String, callback: js.UndefOr[scala.Nothing], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
  @JSImport("backbone.radio", "stopReplying")
  @js.native
  def stopReplying(channelName: String, commandName: String, callback: js.Function1[/* repeated */ js.Any, _]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
  @JSImport("backbone.radio", "stopReplying")
  @js.native
  def stopReplying(
    channelName: String,
    commandName: String,
    callback: js.Function1[/* repeated */ js.Any, _],
    context: js.Any
  ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
  
  @JSImport("backbone.radio", "trigger")
  @js.native
  def trigger(channelName: String, eventName: String, args: js.Any*): js.Any = js.native
  
  @JSImport("backbone.radio", "tuneIn")
  @js.native
  def tuneIn(channelName: String): Radio = js.native
  
  @JSImport("backbone.radio", "tuneOut")
  @js.native
  def tuneOut(channelName: String): Radio = js.native
  
  @JSImport("backbone.radio", "unbind")
  @js.native
  def unbind(channelName: String): js.Any = js.native
  @JSImport("backbone.radio", "unbind")
  @js.native
  def unbind(
    channelName: String,
    eventName: js.UndefOr[scala.Nothing],
    callback: js.UndefOr[scala.Nothing],
    context: js.Any
  ): js.Any = js.native
  @JSImport("backbone.radio", "unbind")
  @js.native
  def unbind(channelName: String, eventName: js.UndefOr[scala.Nothing], callback: js.Function): js.Any = js.native
  @JSImport("backbone.radio", "unbind")
  @js.native
  def unbind(channelName: String, eventName: js.UndefOr[scala.Nothing], callback: js.Function, context: js.Any): js.Any = js.native
  @JSImport("backbone.radio", "unbind")
  @js.native
  def unbind(channelName: String, eventName: String): js.Any = js.native
  @JSImport("backbone.radio", "unbind")
  @js.native
  def unbind(channelName: String, eventName: String, callback: js.UndefOr[scala.Nothing], context: js.Any): js.Any = js.native
  @JSImport("backbone.radio", "unbind")
  @js.native
  def unbind(channelName: String, eventName: String, callback: js.Function): js.Any = js.native
  @JSImport("backbone.radio", "unbind")
  @js.native
  def unbind(channelName: String, eventName: String, callback: js.Function, context: js.Any): js.Any = js.native
}
