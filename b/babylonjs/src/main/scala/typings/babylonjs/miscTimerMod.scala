package typings.babylonjs

import typings.babylonjs.anon.InsertFirst
import typings.babylonjs.miscObservableMod.Observable
import typings.babylonjs.miscObservableMod.Observer
import typings.babylonjs.sceneMod.IDisposable
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object miscTimerMod {
  
  @JSImport("babylonjs/Misc/timer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("babylonjs/Misc/timer", "AdvancedTimer")
  @js.native
  open class AdvancedTimer[T] protected ()
    extends StObject
       with IDisposable {
    /**
      * Will construct a new advanced timer based on the options provided. Timer will not start until start() is called.
      * @param options construction options for this advanced timer
      */
    def this(options: ITimerOptions[T]) = this()
    
    /* private */ var _breakCondition: Any = js.native
    
    /* private */ var _breakOnNextTick: Any = js.native
    
    /* private */ var _contextObservable: Any = js.native
    
    /* private */ var _observableParameters: Any = js.native
    
    /* private */ var _observer: Any = js.native
    
    /* private */ var _setState: Any = js.native
    
    /* private */ var _startTime: Any = js.native
    
    /* private */ var _state: Any = js.native
    
    /* private */ var _stop: Any = js.native
    
    /* private */ var _tick: Any = js.native
    
    /* private */ var _timeToEnd: Any = js.native
    
    /* private */ var _timer: Any = js.native
    
    /**
      * set a breaking condition for this timer. Default is to never break during count
      * @param predicate the new break condition. Returns true to break, false otherwise
      */
    def breakCondition_=(predicate: js.Function1[/* data */ ITimerData[T], Boolean]): Unit = js.native
    
    /**
      * Reset ALL associated observables in this advanced timer
      */
    def clearObservables(): Unit = js.native
    
    /**
      * Releases all held resources
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * Will notify each time the timer calculates the remaining time
      */
    var onEachCountObservable: Observable[ITimerData[T]] = js.native
    
    /**
      * Will trigger when the timer state has changed
      */
    var onStateChangedObservable: Observable[TimerState] = js.native
    
    /**
      * Will trigger when the timer was aborted due to the break condition
      */
    var onTimerAbortedObservable: Observable[ITimerData[T]] = js.native
    
    /**
      * Will trigger when the timer ended successfully
      */
    var onTimerEndedObservable: Observable[ITimerData[T]] = js.native
    
    /**
      * Will start a new iteration of this timer. Only one instance of this timer can run at a time.
      *
      * @param timeToEnd how much time to measure until timer ended
      */
    def start(): Unit = js.native
    def start(timeToEnd: Double): Unit = js.native
    
    /**
      * Will force a stop on the next tick.
      */
    def stop(): Unit = js.native
  }
  
  @js.native
  sealed trait TimerState extends StObject
  @JSImport("babylonjs/Misc/timer", "TimerState")
  @js.native
  object TimerState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TimerState & Double] = js.native
    
    /**
      * Timer ended (whether aborted or time reached)
      */
    @js.native
    sealed trait ENDED
      extends StObject
         with TimerState
    /* 2 */ val ENDED: typings.babylonjs.miscTimerMod.TimerState.ENDED & Double = js.native
    
    /**
      * Timer initialized, not yet started
      */
    @js.native
    sealed trait INIT
      extends StObject
         with TimerState
    /* 0 */ val INIT: typings.babylonjs.miscTimerMod.TimerState.INIT & Double = js.native
    
    /**
      * Timer started and counting
      */
    @js.native
    sealed trait STARTED
      extends StObject
         with TimerState
    /* 1 */ val STARTED: typings.babylonjs.miscTimerMod.TimerState.STARTED & Double = js.native
  }
  
  inline def setAndStartTimer(options: ITimerOptions[Any]): Nullable[Observer[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("setAndStartTimer")(options.asInstanceOf[js.Any]).asInstanceOf[Nullable[Observer[Any]]]
  
  trait ITimerData[T] extends StObject {
    
    /**
      * How much is completed, in [0.0...1.0].
      * Note that this CAN be higher than 1 due to the fact that we don't actually measure time but delta between observable calls
      */
    var completeRate: Double
    
    /**
      * Time now
      */
    var currentTime: Double
    
    /**
      * Time passed since started
      */
    var deltaTime: Double
    
    /**
      * What the registered observable sent in the last count
      */
    var payload: T
    
    /**
      * When did it start
      */
    var startTime: Double
  }
  object ITimerData {
    
    inline def apply[T](completeRate: Double, currentTime: Double, deltaTime: Double, payload: T, startTime: Double): ITimerData[T] = {
      val __obj = js.Dynamic.literal(completeRate = completeRate.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any], deltaTime = deltaTime.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITimerData[T]]
    }
    
    extension [Self <: ITimerData[?], T](x: Self & ITimerData[T]) {
      
      inline def setCompleteRate(value: Double): Self = StObject.set(x, "completeRate", value.asInstanceOf[js.Any])
      
      inline def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
      
      inline def setDeltaTime(value: Double): Self = StObject.set(x, "deltaTime", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: T): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    }
  }
  
  trait ITimerOptions[T] extends StObject {
    
    /**
      * An optional break condition that will stop the times prematurely. In this case onEnded will not be triggered!
      */
    var breakCondition: js.UndefOr[js.Function1[/* data */ js.UndefOr[ITimerData[T]], Boolean]] = js.undefined
    
    /**
      * The context observable is used to calculate time deltas and provides the context of the timer's callbacks. Will usually be OnBeforeRenderObservable.
      * Countdown calculation is done ONLY when the observable is notifying its observers, meaning that if
      * you choose an observable that doesn't trigger too often, the wait time might extend further than the requested max time
      */
    var contextObservable: Observable[T]
    
    /**
      * Optional parameters when adding an observer to the observable
      */
    var observableParameters: js.UndefOr[InsertFirst] = js.undefined
    
    /**
      * Will be triggered when the break condition has met (prematurely ended)
      */
    var onAborted: js.UndefOr[js.Function1[/* data */ ITimerData[Any], Unit]] = js.undefined
    
    /**
      * Will be triggered when the time condition has met
      */
    var onEnded: js.UndefOr[js.Function1[/* data */ ITimerData[Any], Unit]] = js.undefined
    
    /**
      * Optional function to execute on each tick (or count)
      */
    var onTick: js.UndefOr[js.Function1[/* data */ ITimerData[Any], Unit]] = js.undefined
    
    /**
      * Time-to-end
      */
    var timeout: Double
  }
  object ITimerOptions {
    
    inline def apply[T](contextObservable: Observable[T], timeout: Double): ITimerOptions[T] = {
      val __obj = js.Dynamic.literal(contextObservable = contextObservable.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITimerOptions[T]]
    }
    
    extension [Self <: ITimerOptions[?], T](x: Self & ITimerOptions[T]) {
      
      inline def setBreakCondition(value: /* data */ js.UndefOr[ITimerData[T]] => Boolean): Self = StObject.set(x, "breakCondition", js.Any.fromFunction1(value))
      
      inline def setBreakConditionUndefined: Self = StObject.set(x, "breakCondition", js.undefined)
      
      inline def setContextObservable(value: Observable[T]): Self = StObject.set(x, "contextObservable", value.asInstanceOf[js.Any])
      
      inline def setObservableParameters(value: InsertFirst): Self = StObject.set(x, "observableParameters", value.asInstanceOf[js.Any])
      
      inline def setObservableParametersUndefined: Self = StObject.set(x, "observableParameters", js.undefined)
      
      inline def setOnAborted(value: /* data */ ITimerData[Any] => Unit): Self = StObject.set(x, "onAborted", js.Any.fromFunction1(value))
      
      inline def setOnAbortedUndefined: Self = StObject.set(x, "onAborted", js.undefined)
      
      inline def setOnEnded(value: /* data */ ITimerData[Any] => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
      
      inline def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      inline def setOnTick(value: /* data */ ITimerData[Any] => Unit): Self = StObject.set(x, "onTick", js.Any.fromFunction1(value))
      
      inline def setOnTickUndefined: Self = StObject.set(x, "onTick", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
}
