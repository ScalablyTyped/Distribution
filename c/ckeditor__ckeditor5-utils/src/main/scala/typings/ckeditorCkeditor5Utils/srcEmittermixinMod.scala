package typings.ckeditorCkeditor5Utils

import typings.ckeditorCkeditor5Utils.anon.InstantiableEmitter
import typings.ckeditorCkeditor5Utils.srcEventinfoMod.default
import typings.ckeditorCkeditor5Utils.srcMixMod.Constructor
import typings.ckeditorCkeditor5Utils.srcMixMod.Mixed
import typings.ckeditorCkeditor5Utils.srcPrioritiesMod.PriorityString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcEmittermixinMod {
  
  @JSImport("@ckeditor/ckeditor5-utils/src/emittermixin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): InstantiableEmitter = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[InstantiableEmitter]
  inline def default[Base /* <: Constructor[js.Object] */](base: Base): Mixed[Base, Emitter] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(base.asInstanceOf[js.Any]).asInstanceOf[Mixed[Base, Emitter]]
  
  inline def getEmitterId(emitter: Emitter): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("_getEmitterId")(emitter.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def getEmitterListenedTo(listeningEmitter: Emitter, listenedToEmitterId: String): Emitter | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("_getEmitterListenedTo")(listeningEmitter.asInstanceOf[js.Any], listenedToEmitterId.asInstanceOf[js.Any])).asInstanceOf[Emitter | Null]
  
  inline def setEmitterId(emitter: Emitter): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_setEmitterId")(emitter.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setEmitterId(emitter: Emitter, id: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_setEmitterId")(emitter.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait BaseEvent extends StObject {
    
    var args: js.Array[Any]
    
    var name: String
  }
  object BaseEvent {
    
    inline def apply(args: js.Array[Any], name: String): BaseEvent = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BaseEvent] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait CallbackOptions extends StObject {
    
    /**
      * The priority of this event callback. The higher
      * the priority value the sooner the callback will be fired. Events having the same priority are called in the
      * order they were added.
      *
      * @defaultValue `'normal'`
      */
    val priority: js.UndefOr[PriorityString] = js.undefined
  }
  object CallbackOptions {
    
    inline def apply(): CallbackOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CallbackOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CallbackOptions] (val x: Self) extends AnyVal {
      
      inline def setPriority(value: PriorityString): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    }
  }
  
  @js.native
  trait Emitter extends StObject {
    
    /**
      * Delegates selected events to another {@link module:utils/emittermixin~Emitter}. For instance:
      *
      * ```ts
      * emitterA.delegate( 'eventX' ).to( emitterB );
      * emitterA.delegate( 'eventX', 'eventY' ).to( emitterC );
      * ```
      *
      * then `eventX` is delegated (fired by) `emitterB` and `emitterC` along with `data`:
      *
      * ```ts
      * emitterA.fire( 'eventX', data );
      * ```
      *
      * and `eventY` is delegated (fired by) `emitterC` along with `data`:
      *
      * ```ts
      * emitterA.fire( 'eventY', data );
      * ```
      *
      * @param events Event names that will be delegated to another emitter.
      */
    def delegate(events: String*): EmitterMixinDelegateChain = js.native
    
    /**
      * Fires an event, executing all callbacks registered for it.
      *
      * The first parameter passed to callbacks is an {@link module:utils/eventinfo~EventInfo} object,
      * followed by the optional `args` provided in the `fire()` method call.
      *
      * @typeParam TEvent The type describing the event. See {@link module:utils/emittermixin~BaseEvent}.
      * @param eventOrInfo The name of the event or `EventInfo` object if event is delegated.
      * @param args Additional arguments to be passed to the callbacks.
      * @returns By default the method returns `undefined`. However, the return value can be changed by listeners
      * through modification of the {@link module:utils/eventinfo~EventInfo#return `evt.return`}'s property (the event info
      * is the first param of every callback).
      */
    @JSName("fire")
    def fire_args[TEvent /* <: BaseEvent */](
      eventOrInfo: GetNameOrEventInfo[TEvent],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TEvent['args'] is not an array type */ args: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['args'] */ js.Any
    ): /* import warning: importer.ImportType#apply Failed type conversion: @ckeditor/ckeditor5-utils.@ckeditor/ckeditor5-utils/src/emittermixin.GetEventInfo<TEvent>['return'] */ js.Any = js.native
    
    /**
      * Registers a callback function to be executed when an event is fired in a specific (emitter) object.
      *
      * Events can be grouped in namespaces using `:`.
      * When namespaced event is fired, it additionally fires all callbacks for that namespace.
      *
      * ```ts
      * // myEmitter.on( ... ) is a shorthand for myEmitter.listenTo( myEmitter, ... ).
      * myEmitter.on( 'myGroup', genericCallback );
      * myEmitter.on( 'myGroup:myEvent', specificCallback );
      *
      * // genericCallback is fired.
      * myEmitter.fire( 'myGroup' );
      * // both genericCallback and specificCallback are fired.
      * myEmitter.fire( 'myGroup:myEvent' );
      * // genericCallback is fired even though there are no callbacks for "foo".
      * myEmitter.fire( 'myGroup:foo' );
      * ```
      *
      * An event callback can {@link module:utils/eventinfo~EventInfo#stop stop the event} and
      * set the {@link module:utils/eventinfo~EventInfo#return return value} of the {@link #fire} method.
      *
      * @label BASE_EMITTER
      * @typeParam TEvent The type describing the event. See {@link module:utils/emittermixin~BaseEvent}.
      * @param emitter The object that fires the event.
      * @param event The name of the event.
      * @param callback The function to be called on event.
      * @param options Additional options.
      */
    @JSName("listenTo")
    def listenTo_name[TEvent /* <: BaseEvent */](
      emitter: Emitter,
      event: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['name'] */ js.Any,
      callback: GetCallback[TEvent]
    ): Unit = js.native
    @JSName("listenTo")
    def listenTo_name[TEvent /* <: BaseEvent */](
      emitter: Emitter,
      event: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['name'] */ js.Any,
      callback: GetCallback[TEvent],
      options: GetCallbackOptions[TEvent]
    ): Unit = js.native
    
    /**
      * Stops executing the callback on the given event.
      * Shorthand for {@link #stopListening `this.stopListening( this, event, callback )`}.
      *
      * @param event The name of the event.
      * @param callback The function to stop being called.
      */
    def off(event: String, callback: js.Function): Unit = js.native
    
    /**
      * Registers a callback function to be executed when an event is fired.
      *
      * Shorthand for {@link #listenTo `this.listenTo( this, event, callback, options )`} (it makes the emitter
      * listen on itself).
      *
      * @typeParam TEvent The type descibing the event. See {@link module:utils/emittermixin~BaseEvent}.
      * @param event The name of the event.
      * @param callback The function to be called on event.
      * @param options Additional options.
      */
    @JSName("on")
    def on_name[TEvent /* <: BaseEvent */](
      event: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['name'] */ js.Any,
      callback: GetCallback[TEvent]
    ): Unit = js.native
    @JSName("on")
    def on_name[TEvent /* <: BaseEvent */](
      event: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['name'] */ js.Any,
      callback: GetCallback[TEvent],
      options: GetCallbackOptions[TEvent]
    ): Unit = js.native
    
    /**
      * Registers a callback function to be executed on the next time the event is fired only. This is similar to
      * calling {@link #on} followed by {@link #off} in the callback.
      *
      * @typeParam TEvent The type descibing the event. See {@link module:utils/emittermixin~BaseEvent}.
      * @param event The name of the event.
      * @param callback The function to be called on event.
      * @param options Additional options.
      */
    @JSName("once")
    def once_name[TEvent /* <: BaseEvent */](
      event: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['name'] */ js.Any,
      callback: GetCallback[TEvent]
    ): Unit = js.native
    @JSName("once")
    def once_name[TEvent /* <: BaseEvent */](
      event: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['name'] */ js.Any,
      callback: GetCallback[TEvent],
      options: GetCallbackOptions[TEvent]
    ): Unit = js.native
    
    /**
      * Stops delegating events. It can be used at different levels:
      *
      * * To stop delegating all events.
      * * To stop delegating a specific event to all emitters.
      * * To stop delegating a specific event to a specific emitter.
      *
      * @param event The name of the event to stop delegating. If omitted, stops it all delegations.
      * @param emitter (requires `event`) The object to stop delegating a particular event to.
      * If omitted, stops delegation of `event` to all emitters.
      */
    def stopDelegating(): Unit = js.native
    def stopDelegating(event: String): Unit = js.native
    def stopDelegating(event: String, emitter: Emitter): Unit = js.native
    def stopDelegating(event: Unit, emitter: Emitter): Unit = js.native
    
    /**
      * Stops listening for events. It can be used at different levels:
      *
      * * To stop listening to a specific callback.
      * * To stop listening to a specific event.
      * * To stop listening to all events fired by a specific object.
      * * To stop listening to all events fired by all objects.
      *
      * @label BASE_STOP
      * @param emitter The object to stop listening to. If omitted, stops it for all objects.
      * @param event (Requires the `emitter`) The name of the event to stop listening to. If omitted, stops it
      * for all events from `emitter`.
      * @param callback (Requires the `event`) The function to be removed from the call list for the given
      * `event`.
      */
    def stopListening(): Unit = js.native
    def stopListening(emitter: Unit, event: String): Unit = js.native
    def stopListening(emitter: Unit, event: String, callback: js.Function): Unit = js.native
    def stopListening(emitter: Unit, event: Unit, callback: js.Function): Unit = js.native
    def stopListening(emitter: Emitter): Unit = js.native
    def stopListening(emitter: Emitter, event: String): Unit = js.native
    def stopListening(emitter: Emitter, event: String, callback: js.Function): Unit = js.native
    def stopListening(emitter: Emitter, event: Unit, callback: js.Function): Unit = js.native
  }
  
  @js.native
  trait EmitterMixinDelegateChain extends StObject {
    
    /**
      * Selects destination for {@link module:utils/emittermixin~Emitter#delegate} events.
      *
      * @param emitter An `EmitterMixin` instance which is the destination for delegated events.
      * @param nameOrFunction A custom event name or function which converts the original name string.
      */
    def to(emitter: Emitter): Unit = js.native
    def to(emitter: Emitter, nameOrFunction: String): Unit = js.native
    def to(emitter: Emitter, nameOrFunction: js.Function1[/* name */ String, String]): Unit = js.native
  }
  
  type GetCallback[TEvent /* <: BaseEvent */] = js.ThisFunction2[
    /* this */ Emitter, 
    /* ev */ GetEventInfo[TEvent], 
    /* import warning: importer.ImportType#apply Failed type conversion: TEvent['args'] */ /* args */ js.Any, 
    Unit
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    TEvent extends {  callbackOptions :infer TOptions} ? TOptions & @ckeditor/ckeditor5-utils.@ckeditor/ckeditor5-utils/src/emittermixin.CallbackOptions : @ckeditor/ckeditor5-utils.@ckeditor/ckeditor5-utils/src/emittermixin.CallbackOptions
    }}}
    */
  type GetCallbackOptions[TEvent /* <: BaseEvent */] = CallbackOptions
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    TEvent extends {  eventInfo :@ckeditor/ckeditor5-utils.@ckeditor/ckeditor5-utils/src/eventinfo.default<string, unknown>} ? TEvent['eventInfo'] : @ckeditor/ckeditor5-utils.@ckeditor/ckeditor5-utils/src/eventinfo.default<TEvent['name'], TEvent extends {  return :infer TReturn} ? TReturn : unknown>
    }}}
    */
  type GetEventInfo[TEvent /* <: BaseEvent */] = default[
    /* import warning: importer.ImportType#apply Failed type conversion: TEvent['name'] */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: TEvent extends {  return :infer TReturn} ? TReturn : unknown */ js.Any
  ]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    TEvent extends {  eventInfo :@ckeditor/ckeditor5-utils.@ckeditor/ckeditor5-utils/src/eventinfo.default<string, unknown>} ? TEvent['eventInfo'] : TEvent['name'] | @ckeditor/ckeditor5-utils.@ckeditor/ckeditor5-utils/src/eventinfo.default<TEvent['name'], TEvent extends {  return :infer TReturn} ? TReturn : unknown>
    }}}
    */
  type GetNameOrEventInfo[TEvent /* <: BaseEvent */] = (/* import warning: importer.ImportType#apply Failed type conversion: TEvent['name'] */ js.Any) | (default[
    /* import warning: importer.ImportType#apply Failed type conversion: TEvent['name'] */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: TEvent extends {  return :infer TReturn} ? TReturn : unknown */ js.Any
  ])
}
