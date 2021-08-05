package typings.backboneRadio

import org.scalablytyped.runtime.StringDictionary
import typings.backbone.mod.EventsMixin
import typings.backboneRadio.mod.backboneAugmentingMod.Radio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  inline def DEBUG_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
  
  @JSImport("backbone.radio", "Requests")
  @js.native
  class Requests ()
    extends typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests
  
  @JSImport("backbone.radio", "VERSION")
  @js.native
  def VERSION: String = js.native
  inline def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
  
  /* augmented module */
  object backboneAugmentingMod {
    
    trait Radio extends StObject {
      
      def channel(channelName: String): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Channel_
      
      def log(channelName: String, eventName: String, args: js.Any*): Unit
      
      def tuneIn(channelName: String): Radio
      
      def tuneOut(channelName: String): Radio
    }
    object Radio {
      
      inline def apply(
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
        def comply(commands: StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        def comply(commands: StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        
        def complyOnce(commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        def complyOnce(commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        def complyOnce(commands: StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        def complyOnce(commands: StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        
        /**
          * Faulty overgeneralization of Backbone.Events.on, for historical
          * reasons.
          */
        def on(eventName: js.Any): js.Any = js.native
        def on(eventName: js.Any, callback: js.Any): js.Any = js.native
        def on(eventName: js.Any, callback: js.Any, context: js.Any): js.Any = js.native
        def on(eventName: js.Any, callback: Unit, context: js.Any): js.Any = js.native
        
        def reply(commands: StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        def reply(commands: StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        def reply(requestName: String, callback: js.Function1[/* repeated */ js.Any, js.Any]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        def reply(requestName: String, callback: js.Function1[/* repeated */ js.Any, js.Any], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        
        def replyOnce(commands: StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        def replyOnce(commands: StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        def replyOnce(requestName: String, callback: js.Function1[/* repeated */ js.Any, js.Any]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        def replyOnce(requestName: String, callback: js.Function1[/* repeated */ js.Any, js.Any], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        
        // Radio.Requests
        def request(requestName: String, args: js.Any*): js.Any = js.native
        
        def reset(): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Channel_ = js.native
        
        def stopComplying(): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        def stopComplying(commandName: String): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        def stopComplying(commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        def stopComplying(commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        def stopComplying(commandName: String, callback: Unit, context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        def stopComplying(commandName: Unit, callback: js.Function1[/* repeated */ js.Any, Unit]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        def stopComplying(commandName: Unit, callback: js.Function1[/* repeated */ js.Any, Unit], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        def stopComplying(commandName: Unit, callback: Unit, context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        
        def stopReplying(): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        def stopReplying(commandName: String): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        def stopReplying(commandName: String, callback: js.Function1[/* repeated */ js.Any, js.Any]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        def stopReplying(commandName: String, callback: js.Function1[/* repeated */ js.Any, js.Any], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        def stopReplying(commandName: String, callback: Unit, context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        def stopReplying(commandName: Unit, callback: js.Function1[/* repeated */ js.Any, js.Any]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        def stopReplying(commandName: Unit, callback: js.Function1[/* repeated */ js.Any, js.Any], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        def stopReplying(commandName: Unit, callback: Unit, context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
      }
      
      @JSImport("backbone", "Radio.Commands")
      @js.native
      class Commands () extends StObject {
        
        def command(commandName: String, args: js.Any*): Unit = js.native
        
        def comply(commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        def comply(commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        def comply(commands: StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        def comply(commands: StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        
        def complyOnce(commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        def complyOnce(commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        def complyOnce(commands: StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        def complyOnce(commands: StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        
        def stopComplying(): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        def stopComplying(commandName: String): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        def stopComplying(commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        def stopComplying(commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        def stopComplying(commandName: String, callback: Unit, context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        def stopComplying(commandName: Unit, callback: js.Function1[/* repeated */ js.Any, Unit]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        def stopComplying(commandName: Unit, callback: js.Function1[/* repeated */ js.Any, Unit], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
        def stopComplying(commandName: Unit, callback: Unit, context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = js.native
      }
      
      @JSImport("backbone", "Radio.DEBUG")
      @js.native
      def DEBUG: Boolean = js.native
      inline def DEBUG_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEBUG")(x.asInstanceOf[js.Any])
      
      @JSImport("backbone", "Radio.Requests")
      @js.native
      class Requests () extends StObject {
        
        def reply(commands: StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        def reply(commands: StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        def reply(requestName: String, callback: js.Function1[/* repeated */ js.Any, js.Any]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        def reply(requestName: String, callback: js.Function1[/* repeated */ js.Any, js.Any], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        
        def replyOnce(commands: StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        def replyOnce(commands: StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        def replyOnce(requestName: String, callback: js.Function1[/* repeated */ js.Any, js.Any]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        def replyOnce(requestName: String, callback: js.Function1[/* repeated */ js.Any, js.Any], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        
        def request(requestName: String, args: js.Any*): js.Any = js.native
        
        def stopReplying(): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        def stopReplying(commandName: String): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        def stopReplying(commandName: String, callback: js.Function1[/* repeated */ js.Any, js.Any]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        def stopReplying(commandName: String, callback: js.Function1[/* repeated */ js.Any, js.Any], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        def stopReplying(commandName: String, callback: Unit, context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        def stopReplying(commandName: Unit, callback: js.Function1[/* repeated */ js.Any, js.Any]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        def stopReplying(commandName: Unit, callback: js.Function1[/* repeated */ js.Any, js.Any], context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
        def stopReplying(commandName: Unit, callback: Unit, context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = js.native
      }
      
      @JSImport("backbone", "Radio.VERSION")
      @js.native
      def VERSION: String = js.native
      inline def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
      
      inline def bind(channelName: String, eventName: String, callback: js.Function): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(channelName.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      inline def bind(channelName: String, eventName: String, callback: js.Function, context: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(channelName.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      
      inline def channel(channelName: String): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Channel_ = ^.asInstanceOf[js.Dynamic].applyDynamic("channel")(channelName.asInstanceOf[js.Any]).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Channel_]
      
      // Proxy functions for Commands
      inline def command(channelName: String, commandName: String, args: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("command")(channelName.asInstanceOf[js.Any], commandName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def comply(channelName: String, commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = (^.asInstanceOf[js.Dynamic].applyDynamic("comply")(channelName.asInstanceOf[js.Any], commandName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands]
      inline def comply(
        channelName: String,
        commandName: String,
        callback: js.Function1[/* repeated */ js.Any, Unit],
        context: js.Any
      ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = (^.asInstanceOf[js.Dynamic].applyDynamic("comply")(channelName.asInstanceOf[js.Any], commandName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands]
      inline def comply(channelName: String, commands: StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = (^.asInstanceOf[js.Dynamic].applyDynamic("comply")(channelName.asInstanceOf[js.Any], commands.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands]
      inline def comply(
        channelName: String,
        commands: StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]],
        context: js.Any
      ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = (^.asInstanceOf[js.Dynamic].applyDynamic("comply")(channelName.asInstanceOf[js.Any], commands.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands]
      
      inline def complyOnce(channelName: String, commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = (^.asInstanceOf[js.Dynamic].applyDynamic("complyOnce")(channelName.asInstanceOf[js.Any], commandName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands]
      inline def complyOnce(
        channelName: String,
        commandName: String,
        callback: js.Function1[/* repeated */ js.Any, Unit],
        context: js.Any
      ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = (^.asInstanceOf[js.Dynamic].applyDynamic("complyOnce")(channelName.asInstanceOf[js.Any], commandName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands]
      inline def complyOnce(channelName: String, commands: StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = (^.asInstanceOf[js.Dynamic].applyDynamic("complyOnce")(channelName.asInstanceOf[js.Any], commands.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands]
      inline def complyOnce(
        channelName: String,
        commands: StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]],
        context: js.Any
      ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = (^.asInstanceOf[js.Dynamic].applyDynamic("complyOnce")(channelName.asInstanceOf[js.Any], commands.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands]
      
      inline def listenTo(channelName: String, `object`: js.Any, events: String, callback: js.Function): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("listenTo")(channelName.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], events.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      
      inline def listenToOnce(channelName: String, `object`: js.Any, events: String, callback: js.Function): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("listenToOnce")(channelName.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], events.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      
      inline def log(channelName: String, eventName: String, args: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(channelName.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      inline def off(channelName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(channelName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      inline def off(channelName: String, eventName: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(channelName.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      inline def off(channelName: String, eventName: String, callback: js.Function): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(channelName.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      inline def off(channelName: String, eventName: String, callback: js.Function, context: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(channelName.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      inline def off(channelName: String, eventName: String, callback: Unit, context: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(channelName.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      inline def off(channelName: String, eventName: Unit, callback: js.Function): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(channelName.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      inline def off(channelName: String, eventName: Unit, callback: js.Function, context: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(channelName.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      inline def off(channelName: String, eventName: Unit, callback: Unit, context: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(channelName.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      
      // Proxy functions for Backbone.Events
      inline def on(channelName: String, eventName: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(channelName.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      inline def on(channelName: String, eventName: String, callback: js.Function): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(channelName.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      inline def on(channelName: String, eventName: String, callback: js.Function, context: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(channelName.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      inline def on(channelName: String, eventName: String, callback: Unit, context: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(channelName.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      
      inline def once(channelName: String, events: String, callback: js.Function): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(channelName.asInstanceOf[js.Any], events.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      inline def once(channelName: String, events: String, callback: js.Function, context: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(channelName.asInstanceOf[js.Any], events.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      
      inline def reply(channelName: String, commands: StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = (^.asInstanceOf[js.Dynamic].applyDynamic("reply")(channelName.asInstanceOf[js.Any], commands.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests]
      inline def reply(
        channelName: String,
        commands: StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]],
        context: js.Any
      ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = (^.asInstanceOf[js.Dynamic].applyDynamic("reply")(channelName.asInstanceOf[js.Any], commands.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests]
      inline def reply(channelName: String, requestName: String, callback: js.Function1[/* repeated */ js.Any, js.Any]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = (^.asInstanceOf[js.Dynamic].applyDynamic("reply")(channelName.asInstanceOf[js.Any], requestName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests]
      inline def reply(
        channelName: String,
        requestName: String,
        callback: js.Function1[/* repeated */ js.Any, js.Any],
        context: js.Any
      ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = (^.asInstanceOf[js.Dynamic].applyDynamic("reply")(channelName.asInstanceOf[js.Any], requestName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests]
      
      inline def replyOnce(channelName: String, commands: StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = (^.asInstanceOf[js.Dynamic].applyDynamic("replyOnce")(channelName.asInstanceOf[js.Any], commands.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests]
      inline def replyOnce(
        channelName: String,
        commands: StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]],
        context: js.Any
      ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = (^.asInstanceOf[js.Dynamic].applyDynamic("replyOnce")(channelName.asInstanceOf[js.Any], commands.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests]
      inline def replyOnce(channelName: String, requestName: String, callback: js.Function1[/* repeated */ js.Any, js.Any]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = (^.asInstanceOf[js.Dynamic].applyDynamic("replyOnce")(channelName.asInstanceOf[js.Any], requestName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests]
      inline def replyOnce(
        channelName: String,
        requestName: String,
        callback: js.Function1[/* repeated */ js.Any, js.Any],
        context: js.Any
      ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = (^.asInstanceOf[js.Dynamic].applyDynamic("replyOnce")(channelName.asInstanceOf[js.Any], requestName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests]
      
      // Proxy functions for Requests
      inline def request(channelName: String, requestName: String, args: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(channelName.asInstanceOf[js.Any], requestName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      
      inline def stopComplying(channelName: String): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = ^.asInstanceOf[js.Dynamic].applyDynamic("stopComplying")(channelName.asInstanceOf[js.Any]).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands]
      inline def stopComplying(channelName: String, commandName: String): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = (^.asInstanceOf[js.Dynamic].applyDynamic("stopComplying")(channelName.asInstanceOf[js.Any], commandName.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands]
      inline def stopComplying(channelName: String, commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = (^.asInstanceOf[js.Dynamic].applyDynamic("stopComplying")(channelName.asInstanceOf[js.Any], commandName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands]
      inline def stopComplying(
        channelName: String,
        commandName: String,
        callback: js.Function1[/* repeated */ js.Any, Unit],
        context: js.Any
      ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = (^.asInstanceOf[js.Dynamic].applyDynamic("stopComplying")(channelName.asInstanceOf[js.Any], commandName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands]
      inline def stopComplying(channelName: String, commandName: String, callback: Unit, context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = (^.asInstanceOf[js.Dynamic].applyDynamic("stopComplying")(channelName.asInstanceOf[js.Any], commandName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands]
      inline def stopComplying(channelName: String, commandName: Unit, callback: js.Function1[/* repeated */ js.Any, Unit]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = (^.asInstanceOf[js.Dynamic].applyDynamic("stopComplying")(channelName.asInstanceOf[js.Any], commandName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands]
      inline def stopComplying(
        channelName: String,
        commandName: Unit,
        callback: js.Function1[/* repeated */ js.Any, Unit],
        context: js.Any
      ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = (^.asInstanceOf[js.Dynamic].applyDynamic("stopComplying")(channelName.asInstanceOf[js.Any], commandName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands]
      inline def stopComplying(channelName: String, commandName: Unit, callback: Unit, context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = (^.asInstanceOf[js.Dynamic].applyDynamic("stopComplying")(channelName.asInstanceOf[js.Any], commandName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands]
      
      inline def stopListening(channelName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("stopListening")(channelName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      inline def stopListening(channelName: String, `object`: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("stopListening")(channelName.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      inline def stopListening(channelName: String, `object`: js.Any, events: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("stopListening")(channelName.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], events.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      inline def stopListening(channelName: String, `object`: js.Any, events: String, callback: js.Function): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("stopListening")(channelName.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], events.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      inline def stopListening(channelName: String, `object`: js.Any, events: Unit, callback: js.Function): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("stopListening")(channelName.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], events.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      inline def stopListening(channelName: String, `object`: Unit, events: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("stopListening")(channelName.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], events.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      inline def stopListening(channelName: String, `object`: Unit, events: String, callback: js.Function): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("stopListening")(channelName.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], events.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      inline def stopListening(channelName: String, `object`: Unit, events: Unit, callback: js.Function): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("stopListening")(channelName.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], events.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      
      inline def stopReplying(channelName: String): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = ^.asInstanceOf[js.Dynamic].applyDynamic("stopReplying")(channelName.asInstanceOf[js.Any]).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests]
      inline def stopReplying(channelName: String, commandName: String): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = (^.asInstanceOf[js.Dynamic].applyDynamic("stopReplying")(channelName.asInstanceOf[js.Any], commandName.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests]
      inline def stopReplying(channelName: String, commandName: String, callback: js.Function1[/* repeated */ js.Any, js.Any]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = (^.asInstanceOf[js.Dynamic].applyDynamic("stopReplying")(channelName.asInstanceOf[js.Any], commandName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests]
      inline def stopReplying(
        channelName: String,
        commandName: String,
        callback: js.Function1[/* repeated */ js.Any, js.Any],
        context: js.Any
      ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = (^.asInstanceOf[js.Dynamic].applyDynamic("stopReplying")(channelName.asInstanceOf[js.Any], commandName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests]
      inline def stopReplying(channelName: String, commandName: String, callback: Unit, context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = (^.asInstanceOf[js.Dynamic].applyDynamic("stopReplying")(channelName.asInstanceOf[js.Any], commandName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests]
      inline def stopReplying(channelName: String, commandName: Unit, callback: js.Function1[/* repeated */ js.Any, js.Any]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = (^.asInstanceOf[js.Dynamic].applyDynamic("stopReplying")(channelName.asInstanceOf[js.Any], commandName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests]
      inline def stopReplying(
        channelName: String,
        commandName: Unit,
        callback: js.Function1[/* repeated */ js.Any, js.Any],
        context: js.Any
      ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = (^.asInstanceOf[js.Dynamic].applyDynamic("stopReplying")(channelName.asInstanceOf[js.Any], commandName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests]
      inline def stopReplying(channelName: String, commandName: Unit, callback: Unit, context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = (^.asInstanceOf[js.Dynamic].applyDynamic("stopReplying")(channelName.asInstanceOf[js.Any], commandName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests]
      
      inline def trigger(channelName: String, eventName: String, args: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(channelName.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      
      inline def tuneIn(channelName: String): Radio = ^.asInstanceOf[js.Dynamic].applyDynamic("tuneIn")(channelName.asInstanceOf[js.Any]).asInstanceOf[Radio]
      
      inline def tuneOut(channelName: String): Radio = ^.asInstanceOf[js.Dynamic].applyDynamic("tuneOut")(channelName.asInstanceOf[js.Any]).asInstanceOf[Radio]
      
      inline def unbind(channelName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("unbind")(channelName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
      inline def unbind(channelName: String, eventName: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unbind")(channelName.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      inline def unbind(channelName: String, eventName: String, callback: js.Function): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unbind")(channelName.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      inline def unbind(channelName: String, eventName: String, callback: js.Function, context: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unbind")(channelName.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      inline def unbind(channelName: String, eventName: String, callback: Unit, context: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unbind")(channelName.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      inline def unbind(channelName: String, eventName: Unit, callback: js.Function): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unbind")(channelName.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      inline def unbind(channelName: String, eventName: Unit, callback: js.Function, context: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unbind")(channelName.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      inline def unbind(channelName: String, eventName: Unit, callback: Unit, context: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unbind")(channelName.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Any]
      
      extension [Self <: Radio](x: Self) {
        
        inline def setChannel(value: String => typings.backboneRadio.mod.backboneAugmentingMod.Radio.Channel_): Self = StObject.set(x, "channel", js.Any.fromFunction1(value))
        
        inline def setLog(value: (String, String, /* repeated */ js.Any) => Unit): Self = StObject.set(x, "log", js.Any.fromFunction3(value))
        
        inline def setTuneIn(value: String => Radio): Self = StObject.set(x, "tuneIn", js.Any.fromFunction1(value))
        
        inline def setTuneOut(value: String => Radio): Self = StObject.set(x, "tuneOut", js.Any.fromFunction1(value))
      }
    }
  }
  
  inline def bind(channelName: String, eventName: String, callback: js.Function): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(channelName.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def bind(channelName: String, eventName: String, callback: js.Function, context: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(channelName.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def channel(channelName: String): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Channel_ = ^.asInstanceOf[js.Dynamic].applyDynamic("channel")(channelName.asInstanceOf[js.Any]).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Channel_]
  
  // Proxy functions for Commands
  inline def command(channelName: String, commandName: String, args: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("command")(channelName.asInstanceOf[js.Any], commandName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def comply(channelName: String, commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = (^.asInstanceOf[js.Dynamic].applyDynamic("comply")(channelName.asInstanceOf[js.Any], commandName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands]
  inline def comply(
    channelName: String,
    commandName: String,
    callback: js.Function1[/* repeated */ js.Any, Unit],
    context: js.Any
  ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = (^.asInstanceOf[js.Dynamic].applyDynamic("comply")(channelName.asInstanceOf[js.Any], commandName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands]
  inline def comply(channelName: String, commands: StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = (^.asInstanceOf[js.Dynamic].applyDynamic("comply")(channelName.asInstanceOf[js.Any], commands.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands]
  inline def comply(
    channelName: String,
    commands: StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]],
    context: js.Any
  ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = (^.asInstanceOf[js.Dynamic].applyDynamic("comply")(channelName.asInstanceOf[js.Any], commands.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands]
  
  inline def complyOnce(channelName: String, commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = (^.asInstanceOf[js.Dynamic].applyDynamic("complyOnce")(channelName.asInstanceOf[js.Any], commandName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands]
  inline def complyOnce(
    channelName: String,
    commandName: String,
    callback: js.Function1[/* repeated */ js.Any, Unit],
    context: js.Any
  ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = (^.asInstanceOf[js.Dynamic].applyDynamic("complyOnce")(channelName.asInstanceOf[js.Any], commandName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands]
  inline def complyOnce(channelName: String, commands: StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = (^.asInstanceOf[js.Dynamic].applyDynamic("complyOnce")(channelName.asInstanceOf[js.Any], commands.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands]
  inline def complyOnce(
    channelName: String,
    commands: StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]],
    context: js.Any
  ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = (^.asInstanceOf[js.Dynamic].applyDynamic("complyOnce")(channelName.asInstanceOf[js.Any], commands.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands]
  
  inline def listenTo(channelName: String, `object`: js.Any, events: String, callback: js.Function): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("listenTo")(channelName.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], events.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def listenToOnce(channelName: String, `object`: js.Any, events: String, callback: js.Function): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("listenToOnce")(channelName.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], events.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def log(channelName: String, eventName: String, args: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("log")(channelName.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def off(channelName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(channelName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def off(channelName: String, eventName: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(channelName.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def off(channelName: String, eventName: String, callback: js.Function): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(channelName.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def off(channelName: String, eventName: String, callback: js.Function, context: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(channelName.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def off(channelName: String, eventName: String, callback: Unit, context: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(channelName.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def off(channelName: String, eventName: Unit, callback: js.Function): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(channelName.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def off(channelName: String, eventName: Unit, callback: js.Function, context: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(channelName.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def off(channelName: String, eventName: Unit, callback: Unit, context: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(channelName.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  // Proxy functions for Backbone.Events
  inline def on(channelName: String, eventName: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(channelName.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def on(channelName: String, eventName: String, callback: js.Function): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(channelName.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def on(channelName: String, eventName: String, callback: js.Function, context: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(channelName.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def on(channelName: String, eventName: String, callback: Unit, context: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(channelName.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def once(channelName: String, events: String, callback: js.Function): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(channelName.asInstanceOf[js.Any], events.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def once(channelName: String, events: String, callback: js.Function, context: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(channelName.asInstanceOf[js.Any], events.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def reply(channelName: String, commands: StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = (^.asInstanceOf[js.Dynamic].applyDynamic("reply")(channelName.asInstanceOf[js.Any], commands.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests]
  inline def reply(
    channelName: String,
    commands: StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]],
    context: js.Any
  ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = (^.asInstanceOf[js.Dynamic].applyDynamic("reply")(channelName.asInstanceOf[js.Any], commands.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests]
  inline def reply(channelName: String, requestName: String, callback: js.Function1[/* repeated */ js.Any, js.Any]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = (^.asInstanceOf[js.Dynamic].applyDynamic("reply")(channelName.asInstanceOf[js.Any], requestName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests]
  inline def reply(
    channelName: String,
    requestName: String,
    callback: js.Function1[/* repeated */ js.Any, js.Any],
    context: js.Any
  ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = (^.asInstanceOf[js.Dynamic].applyDynamic("reply")(channelName.asInstanceOf[js.Any], requestName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests]
  
  inline def replyOnce(channelName: String, commands: StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = (^.asInstanceOf[js.Dynamic].applyDynamic("replyOnce")(channelName.asInstanceOf[js.Any], commands.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests]
  inline def replyOnce(
    channelName: String,
    commands: StringDictionary[js.Function1[/* repeated */ js.Any, js.Any]],
    context: js.Any
  ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = (^.asInstanceOf[js.Dynamic].applyDynamic("replyOnce")(channelName.asInstanceOf[js.Any], commands.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests]
  inline def replyOnce(channelName: String, requestName: String, callback: js.Function1[/* repeated */ js.Any, js.Any]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = (^.asInstanceOf[js.Dynamic].applyDynamic("replyOnce")(channelName.asInstanceOf[js.Any], requestName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests]
  inline def replyOnce(
    channelName: String,
    requestName: String,
    callback: js.Function1[/* repeated */ js.Any, js.Any],
    context: js.Any
  ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = (^.asInstanceOf[js.Dynamic].applyDynamic("replyOnce")(channelName.asInstanceOf[js.Any], requestName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests]
  
  // Proxy functions for Requests
  inline def request(channelName: String, requestName: String, args: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(channelName.asInstanceOf[js.Any], requestName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def stopComplying(channelName: String): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = ^.asInstanceOf[js.Dynamic].applyDynamic("stopComplying")(channelName.asInstanceOf[js.Any]).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands]
  inline def stopComplying(channelName: String, commandName: String): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = (^.asInstanceOf[js.Dynamic].applyDynamic("stopComplying")(channelName.asInstanceOf[js.Any], commandName.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands]
  inline def stopComplying(channelName: String, commandName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = (^.asInstanceOf[js.Dynamic].applyDynamic("stopComplying")(channelName.asInstanceOf[js.Any], commandName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands]
  inline def stopComplying(
    channelName: String,
    commandName: String,
    callback: js.Function1[/* repeated */ js.Any, Unit],
    context: js.Any
  ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = (^.asInstanceOf[js.Dynamic].applyDynamic("stopComplying")(channelName.asInstanceOf[js.Any], commandName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands]
  inline def stopComplying(channelName: String, commandName: String, callback: Unit, context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = (^.asInstanceOf[js.Dynamic].applyDynamic("stopComplying")(channelName.asInstanceOf[js.Any], commandName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands]
  inline def stopComplying(channelName: String, commandName: Unit, callback: js.Function1[/* repeated */ js.Any, Unit]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = (^.asInstanceOf[js.Dynamic].applyDynamic("stopComplying")(channelName.asInstanceOf[js.Any], commandName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands]
  inline def stopComplying(
    channelName: String,
    commandName: Unit,
    callback: js.Function1[/* repeated */ js.Any, Unit],
    context: js.Any
  ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = (^.asInstanceOf[js.Dynamic].applyDynamic("stopComplying")(channelName.asInstanceOf[js.Any], commandName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands]
  inline def stopComplying(channelName: String, commandName: Unit, callback: Unit, context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands = (^.asInstanceOf[js.Dynamic].applyDynamic("stopComplying")(channelName.asInstanceOf[js.Any], commandName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Commands]
  
  inline def stopListening(channelName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("stopListening")(channelName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def stopListening(channelName: String, `object`: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("stopListening")(channelName.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def stopListening(channelName: String, `object`: js.Any, events: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("stopListening")(channelName.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], events.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def stopListening(channelName: String, `object`: js.Any, events: String, callback: js.Function): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("stopListening")(channelName.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], events.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def stopListening(channelName: String, `object`: js.Any, events: Unit, callback: js.Function): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("stopListening")(channelName.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], events.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def stopListening(channelName: String, `object`: Unit, events: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("stopListening")(channelName.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], events.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def stopListening(channelName: String, `object`: Unit, events: String, callback: js.Function): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("stopListening")(channelName.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], events.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def stopListening(channelName: String, `object`: Unit, events: Unit, callback: js.Function): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("stopListening")(channelName.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], events.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def stopReplying(channelName: String): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = ^.asInstanceOf[js.Dynamic].applyDynamic("stopReplying")(channelName.asInstanceOf[js.Any]).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests]
  inline def stopReplying(channelName: String, commandName: String): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = (^.asInstanceOf[js.Dynamic].applyDynamic("stopReplying")(channelName.asInstanceOf[js.Any], commandName.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests]
  inline def stopReplying(channelName: String, commandName: String, callback: js.Function1[/* repeated */ js.Any, js.Any]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = (^.asInstanceOf[js.Dynamic].applyDynamic("stopReplying")(channelName.asInstanceOf[js.Any], commandName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests]
  inline def stopReplying(
    channelName: String,
    commandName: String,
    callback: js.Function1[/* repeated */ js.Any, js.Any],
    context: js.Any
  ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = (^.asInstanceOf[js.Dynamic].applyDynamic("stopReplying")(channelName.asInstanceOf[js.Any], commandName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests]
  inline def stopReplying(channelName: String, commandName: String, callback: Unit, context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = (^.asInstanceOf[js.Dynamic].applyDynamic("stopReplying")(channelName.asInstanceOf[js.Any], commandName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests]
  inline def stopReplying(channelName: String, commandName: Unit, callback: js.Function1[/* repeated */ js.Any, js.Any]): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = (^.asInstanceOf[js.Dynamic].applyDynamic("stopReplying")(channelName.asInstanceOf[js.Any], commandName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests]
  inline def stopReplying(
    channelName: String,
    commandName: Unit,
    callback: js.Function1[/* repeated */ js.Any, js.Any],
    context: js.Any
  ): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = (^.asInstanceOf[js.Dynamic].applyDynamic("stopReplying")(channelName.asInstanceOf[js.Any], commandName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests]
  inline def stopReplying(channelName: String, commandName: Unit, callback: Unit, context: js.Any): typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests = (^.asInstanceOf[js.Dynamic].applyDynamic("stopReplying")(channelName.asInstanceOf[js.Any], commandName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[typings.backboneRadio.mod.backboneAugmentingMod.Radio.Requests]
  
  inline def trigger(channelName: String, eventName: String, args: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(channelName.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def tuneIn(channelName: String): Radio = ^.asInstanceOf[js.Dynamic].applyDynamic("tuneIn")(channelName.asInstanceOf[js.Any]).asInstanceOf[Radio]
  
  inline def tuneOut(channelName: String): Radio = ^.asInstanceOf[js.Dynamic].applyDynamic("tuneOut")(channelName.asInstanceOf[js.Any]).asInstanceOf[Radio]
  
  inline def unbind(channelName: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("unbind")(channelName.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def unbind(channelName: String, eventName: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unbind")(channelName.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def unbind(channelName: String, eventName: String, callback: js.Function): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unbind")(channelName.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def unbind(channelName: String, eventName: String, callback: js.Function, context: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unbind")(channelName.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def unbind(channelName: String, eventName: String, callback: Unit, context: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unbind")(channelName.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def unbind(channelName: String, eventName: Unit, callback: js.Function): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unbind")(channelName.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def unbind(channelName: String, eventName: Unit, callback: js.Function, context: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unbind")(channelName.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def unbind(channelName: String, eventName: Unit, callback: Unit, context: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("unbind")(channelName.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
