package typings.ckeditorCkeditor5Watchdog

import typings.ckeditorCkeditor5Watchdog.anon.Colno
import typings.ckeditorCkeditor5Watchdog.ckeditorCkeditor5WatchdogStrings.error
import typings.ckeditorCkeditor5Watchdog.ckeditorCkeditor5WatchdogStrings.itemError
import typings.ckeditorCkeditor5Watchdog.ckeditorCkeditor5WatchdogStrings.itemRestart
import typings.ckeditorCkeditor5Watchdog.ckeditorCkeditor5WatchdogStrings.restart
import typings.ckeditorCkeditor5Watchdog.ckeditorCkeditor5WatchdogStrings.stateChange
import typings.ckeditorCkeditor5Watchdog.srcContextwatchdogMod.ContextWatchdogItemErrorEvent
import typings.ckeditorCkeditor5Watchdog.srcContextwatchdogMod.ContextWatchdogItemRestartEvent
import typings.ckeditorCkeditor5Watchdog.srcEditorwatchdogMod.EditorWatchdogRestartEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcWatchdogMod {
  
  /* note: abstract class */ @JSImport("@ckeditor/ckeditor5-watchdog/src/watchdog", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Watchdog {
    /**
      * @param {module:watchdog/watchdog~WatchdogConfig} config The watchdog plugin configuration.
      */
    def this(config: WatchdogConfig) = this()
  }
  
  type EventArgs[K /* <: stateChange | error | restart | itemError | itemRestart */] = /* import warning: importer.ImportType#apply Failed type conversion: @ckeditor/ckeditor5-watchdog.@ckeditor/ckeditor5-watchdog/src/watchdog.EventMap[K]['args'] */ js.Any
  
  type EventCallback[K /* <: stateChange | error | restart | itemError | itemRestart */] = js.Function2[/* evt */ Null, /* args */ EventArgs[K], Unit]
  
  trait EventMap extends StObject {
    
    var error: WatchdogErrorEvent
    
    var itemError: ContextWatchdogItemErrorEvent
    
    var itemRestart: ContextWatchdogItemRestartEvent
    
    var restart: EditorWatchdogRestartEvent
    
    var stateChange: WatchdogStateChangeEvent
  }
  object EventMap {
    
    inline def apply(
      error: WatchdogErrorEvent,
      itemError: ContextWatchdogItemErrorEvent,
      itemRestart: ContextWatchdogItemRestartEvent,
      restart: EditorWatchdogRestartEvent,
      stateChange: WatchdogStateChangeEvent
    ): EventMap = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], itemError = itemError.asInstanceOf[js.Any], itemRestart = itemRestart.asInstanceOf[js.Any], restart = restart.asInstanceOf[js.Any], stateChange = stateChange.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EventMap] (val x: Self) extends AnyVal {
      
      inline def setError(value: WatchdogErrorEvent): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setItemError(value: ContextWatchdogItemErrorEvent): Self = StObject.set(x, "itemError", value.asInstanceOf[js.Any])
      
      inline def setItemRestart(value: ContextWatchdogItemRestartEvent): Self = StObject.set(x, "itemRestart", value.asInstanceOf[js.Any])
      
      inline def setRestart(value: EditorWatchdogRestartEvent): Self = StObject.set(x, "restart", value.asInstanceOf[js.Any])
      
      inline def setStateChange(value: WatchdogStateChangeEvent): Self = StObject.set(x, "stateChange", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Watchdog extends StObject {
    
    /**
      * Checks if the event error comes from the underlying item and restarts the item.
      */
    /* private */ var _boundErrorHandler: Any = js.native
    
    /**
      * @see module:watchdog/watchdog~WatchdogConfig
      */
    /* private */ var _crashNumberLimit: Any = js.native
    
    /* protected */ @JSName("_fire")
    def _fire_error(
      eventName: error,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventArgs<K> is not an array type */ args: EventArgs[error]
    ): Unit = js.native
    /* protected */ @JSName("_fire")
    def _fire_itemError(
      eventName: itemError,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventArgs<K> is not an array type */ args: EventArgs[itemError]
    ): Unit = js.native
    /* protected */ @JSName("_fire")
    def _fire_itemRestart(
      eventName: itemRestart,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventArgs<K> is not an array type */ args: EventArgs[itemRestart]
    ): Unit = js.native
    /* protected */ @JSName("_fire")
    def _fire_restart(
      eventName: restart,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventArgs<K> is not an array type */ args: EventArgs[restart]
    ): Unit = js.native
    /**
      * Fires an event with a given event name and arguments.
      *
      * Note that this method differs from the CKEditor 5's default `EventEmitterMixin` implementation.
      */
    /* protected */ @JSName("_fire")
    def _fire_stateChange(
      eventName: stateChange,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type EventArgs<K> is not an array type */ args: EventArgs[stateChange]
    ): Unit = js.native
    
    /**
      * Checks if an error comes from the watched item and restarts it.
      * It reacts to {@link module:utils/ckeditorerror~CKEditorError `CKEditorError` errors} only.
      *
      * @fires error
      * @param error Error.
      * @param evt An error event.
      */
    /* private */ var _handleError: Any = js.native
    
    /**
      * Traverses the error context and the watched item to find out whether the error should
      * be handled by the given item.
      *
      * @internal
      */
    def _isErrorComingFromThisItem(
      error: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CKEditorError */ Any
    ): Boolean = js.native
    
    /**
      * The watched item.
      *
      * @internal
      */
    def _item: Any = js.native
    
    /**
      * A dictionary of event emitter listeners.
      */
    /* private */ var _listeners: Any = js.native
    
    /**
      * @see module:watchdog/watchdog~WatchdogConfig
      */
    /* private */ var _minimumNonErrorTimePeriod: Any = js.native
    
    /**
      * Returns the result of the `Date.now()` call. It can be overridden in tests to mock time as some popular
      * approaches like `sinon.useFakeTimers()` do not work well with error handling.
      */
    /* private */ var _now: Any = js.native
    
    /**
      * The method responsible for restarting the watched item.
      */
    /* protected */ def _restart(): js.Promise[Any] = js.native
    
    /**
      * Checks whether an error should be handled by the watchdog.
      *
      * @param error An error that was caught by the error handling process.
      */
    /* private */ var _shouldReactToError: Any = js.native
    
    /**
      * Checks if the watchdog should restart the underlying item.
      */
    /* private */ var _shouldRestart: Any = js.native
    
    /**
      * Starts error handling by attaching global error handlers.
      */
    /* protected */ def _startErrorHandling(): Unit = js.native
    
    /**
      * Stops error handling by detaching global error handlers.
      */
    /* protected */ def _stopErrorHandling(): Unit = js.native
    
    /**
      * An array of crashes saved as an object with the following properties:
      *
      * * `message`: `String`,
      * * `stack`: `String`,
      * * `date`: `Number`,
      * * `filename`: `String | undefined`,
      * * `lineno`: `Number | undefined`,
      * * `colno`: `Number | undefined`,
      */
    val crashes: js.Array[Colno] = js.native
    
    /**
      * Destroys the watchdog and releases the resources.
      */
    def destroy(): Unit = js.native
    
    /**
      * Stops listening to the specified event name by removing the callback from event listeners.
      *
      * Note that this method differs from the CKEditor 5's default `EventEmitterMixin` implementation.
      *
      * @param eventName The event name.
      * @param callback A callback which will be removed from event listeners.
      */
    def off(eventName: stateChange | error | restart | itemError | itemRestart, callback: Any): Unit = js.native
    
    @JSName("on")
    def on_error(eventName: error, callback: EventCallback[error]): Unit = js.native
    @JSName("on")
    def on_itemError(eventName: itemError, callback: EventCallback[itemError]): Unit = js.native
    @JSName("on")
    def on_itemRestart(eventName: itemRestart, callback: EventCallback[itemRestart]): Unit = js.native
    @JSName("on")
    def on_restart(eventName: restart, callback: EventCallback[restart]): Unit = js.native
    /**
      * Starts listening to a specific event name by registering a callback that will be executed
      * whenever an event with a given name fires.
      *
      * Note that this method differs from the CKEditor 5's default `EventEmitterMixin` implementation.
      *
      * @param eventName The event name.
      * @param callback A callback which will be added to event listeners.
      */
    @JSName("on")
    def on_stateChange(eventName: stateChange, callback: EventCallback[stateChange]): Unit = js.native
    
    /**
      * Specifies the state of the item watched by the watchdog. The state can be one of the following values:
      *
      * * `initializing` &ndash; Before the first initialization, and after crashes, before the item is ready.
      * * `ready` &ndash; A state when the user can interact with the item.
      * * `crashed` &ndash; A state when an error occurs. It quickly changes to `initializing` or `crashedPermanently`
      * depending on how many and how frequent errors have been caught recently.
      * * `crashedPermanently` &ndash; A state when the watchdog stops reacting to errors and keeps the item it is watching crashed,
      * * `destroyed` &ndash; A state when the item is manually destroyed by the user after calling `watchdog.destroy()`.
      */
    var state: WatchdogState = js.native
  }
  
  trait WatchdogConfig extends StObject {
    
    /**
      * A threshold specifying the number of watched item crashes
      * when the watchdog stops restarting the item in case of errors.
      * After this limit is reached and the time between the last errors is shorter than `minimumNonErrorTimePeriod`,
      * the watchdog changes its state to `crashedPermanently` and it stops restarting the item. This prevents an infinite restart loop.
      *
      * @default 3
      */
    var crashNumberLimit: js.UndefOr[Double] = js.undefined
    
    /**
      * An average number of milliseconds between the last watched item errors
      * (defaults to 5000). When the period of time between errors is lower than that and the `crashNumberLimit` is also reached,
      * the watchdog changes its state to `crashedPermanently` and it stops restarting the item. This prevents an infinite restart loop.
      *
      * @default 5000
      */
    var minimumNonErrorTimePeriod: js.UndefOr[Double] = js.undefined
    
    /**
      * A minimum number of milliseconds between saving the editor data internally (defaults to 5000).
      * Note that for large documents this might impact the editor performance.
      *
      * @default 5000
      */
    var saveInterval: js.UndefOr[Double] = js.undefined
  }
  object WatchdogConfig {
    
    inline def apply(): WatchdogConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WatchdogConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WatchdogConfig] (val x: Self) extends AnyVal {
      
      inline def setCrashNumberLimit(value: Double): Self = StObject.set(x, "crashNumberLimit", value.asInstanceOf[js.Any])
      
      inline def setCrashNumberLimitUndefined: Self = StObject.set(x, "crashNumberLimit", js.undefined)
      
      inline def setMinimumNonErrorTimePeriod(value: Double): Self = StObject.set(x, "minimumNonErrorTimePeriod", value.asInstanceOf[js.Any])
      
      inline def setMinimumNonErrorTimePeriodUndefined: Self = StObject.set(x, "minimumNonErrorTimePeriod", js.undefined)
      
      inline def setSaveInterval(value: Double): Self = StObject.set(x, "saveInterval", value.asInstanceOf[js.Any])
      
      inline def setSaveIntervalUndefined: Self = StObject.set(x, "saveInterval", js.undefined)
    }
  }
  
  trait WatchdogErrorEvent extends StObject {
    
    var args: js.Array[WatchdogErrorEventData]
    
    var name: error
  }
  object WatchdogErrorEvent {
    
    inline def apply(args: js.Array[WatchdogErrorEventData]): WatchdogErrorEvent = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = "error")
      __obj.asInstanceOf[WatchdogErrorEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WatchdogErrorEvent] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: js.Array[WatchdogErrorEventData]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: WatchdogErrorEventData*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setName(value: error): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait WatchdogErrorEventData extends StObject {
    
    var causesRestart: Boolean
    
    var error: js.Error
  }
  object WatchdogErrorEventData {
    
    inline def apply(causesRestart: Boolean, error: js.Error): WatchdogErrorEventData = {
      val __obj = js.Dynamic.literal(causesRestart = causesRestart.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[WatchdogErrorEventData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WatchdogErrorEventData] (val x: Self) extends AnyVal {
      
      inline def setCausesRestart(value: Boolean): Self = StObject.set(x, "causesRestart", value.asInstanceOf[js.Any])
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ckeditorCkeditor5Watchdog.ckeditorCkeditor5WatchdogStrings.initializing
    - typings.ckeditorCkeditor5Watchdog.ckeditorCkeditor5WatchdogStrings.ready
    - typings.ckeditorCkeditor5Watchdog.ckeditorCkeditor5WatchdogStrings.crashed
    - typings.ckeditorCkeditor5Watchdog.ckeditorCkeditor5WatchdogStrings.crashedPermanently
    - typings.ckeditorCkeditor5Watchdog.ckeditorCkeditor5WatchdogStrings.destroyed
  */
  trait WatchdogState extends StObject
  object WatchdogState {
    
    inline def crashed: typings.ckeditorCkeditor5Watchdog.ckeditorCkeditor5WatchdogStrings.crashed = "crashed".asInstanceOf[typings.ckeditorCkeditor5Watchdog.ckeditorCkeditor5WatchdogStrings.crashed]
    
    inline def crashedPermanently: typings.ckeditorCkeditor5Watchdog.ckeditorCkeditor5WatchdogStrings.crashedPermanently = "crashedPermanently".asInstanceOf[typings.ckeditorCkeditor5Watchdog.ckeditorCkeditor5WatchdogStrings.crashedPermanently]
    
    inline def destroyed: typings.ckeditorCkeditor5Watchdog.ckeditorCkeditor5WatchdogStrings.destroyed = "destroyed".asInstanceOf[typings.ckeditorCkeditor5Watchdog.ckeditorCkeditor5WatchdogStrings.destroyed]
    
    inline def initializing: typings.ckeditorCkeditor5Watchdog.ckeditorCkeditor5WatchdogStrings.initializing = "initializing".asInstanceOf[typings.ckeditorCkeditor5Watchdog.ckeditorCkeditor5WatchdogStrings.initializing]
    
    inline def ready: typings.ckeditorCkeditor5Watchdog.ckeditorCkeditor5WatchdogStrings.ready = "ready".asInstanceOf[typings.ckeditorCkeditor5Watchdog.ckeditorCkeditor5WatchdogStrings.ready]
  }
  
  trait WatchdogStateChangeEvent extends StObject {
    
    var args: js.Array[Any]
    
    var name: stateChange
  }
  object WatchdogStateChangeEvent {
    
    inline def apply(args: js.Array[Any]): WatchdogStateChangeEvent = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = "stateChange")
      __obj.asInstanceOf[WatchdogStateChangeEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WatchdogStateChangeEvent] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setName(value: stateChange): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
