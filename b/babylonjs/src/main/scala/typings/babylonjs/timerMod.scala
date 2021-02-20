package typings.babylonjs

import typings.babylonjs.anon.InsertFirst
import typings.babylonjs.observableMod.Observable
import typings.babylonjs.observableMod.Observer
import typings.babylonjs.sceneMod.IDisposable
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timerMod {
  
  @JSImport("babylonjs/Misc/timer", "AdvancedTimer")
  @js.native
  class AdvancedTimer[T] protected () extends IDisposable {
    /**
      * Will construct a new advanced timer based on the options provided. Timer will not start until start() is called.
      * @param options construction options for this advanced timer
      */
    def this(options: ITimerOptions[T]) = this()
    
    var _breakCondition: js.Any = js.native
    
    var _breakOnNextTick: js.Any = js.native
    
    var _contextObservable: js.Any = js.native
    
    var _observableParameters: js.Any = js.native
    
    var _observer: js.Any = js.native
    
    var _setState: js.Any = js.native
    
    var _startTime: js.Any = js.native
    
    var _state: js.Any = js.native
    
    var _stop: js.Any = js.native
    
    var _tick: js.Any = js.native
    
    var _timeToEnd: js.Any = js.native
    
    var _timer: js.Any = js.native
    
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
    def apply(value: Double): js.UndefOr[TimerState with Double] = js.native
    
    /**
      * Timer ended (whether aborted or time reached)
      */
    @js.native
    sealed trait ENDED extends TimerState
    /* 2 */ val ENDED: typings.babylonjs.timerMod.TimerState.ENDED with Double = js.native
    
    /**
      * Timer initialized, not yet started
      */
    @js.native
    sealed trait INIT extends TimerState
    /* 0 */ val INIT: typings.babylonjs.timerMod.TimerState.INIT with Double = js.native
    
    /**
      * Timer started and counting
      */
    @js.native
    sealed trait STARTED extends TimerState
    /* 1 */ val STARTED: typings.babylonjs.timerMod.TimerState.STARTED with Double = js.native
  }
  
  @JSImport("babylonjs/Misc/timer", "setAndStartTimer")
  @js.native
  def setAndStartTimer(options: ITimerOptions[_]): Nullable[Observer[_]] = js.native
  
  @js.native
  trait ITimerData[T] extends StObject {
    
    /**
      * How much is completed, in [0.0...1.0].
      * Note that this CAN be higher than 1 due to the fact that we don't actually measure time but delta between observable calls
      */
    var completeRate: Double = js.native
    
    /**
      * Time now
      */
    var currentTime: Double = js.native
    
    /**
      * Time passed since started
      */
    var deltaTime: Double = js.native
    
    /**
      * What the registered observable sent in the last count
      */
    var payload: T = js.native
    
    /**
      * When did it start
      */
    var startTime: Double = js.native
  }
  object ITimerData {
    
    @scala.inline
    def apply[T](completeRate: Double, currentTime: Double, deltaTime: Double, payload: T, startTime: Double): ITimerData[T] = {
      val __obj = js.Dynamic.literal(completeRate = completeRate.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any], deltaTime = deltaTime.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITimerData[T]]
    }
    
    @scala.inline
    implicit class ITimerDataMutableBuilder[Self <: ITimerData[_], T] (val x: Self with ITimerData[T]) extends AnyVal {
      
      @scala.inline
      def setCompleteRate(value: Double): Self = StObject.set(x, "completeRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeltaTime(value: Double): Self = StObject.set(x, "deltaTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayload(value: T): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ITimerOptions[T] extends StObject {
    
    /**
      * An optional break condition that will stop the times prematurely. In this case onEnded will not be triggered!
      */
    var breakCondition: js.UndefOr[js.Function1[/* data */ js.UndefOr[ITimerData[T]], Boolean]] = js.native
    
    /**
      * The context observable is used to calculate time deltas and provides the context of the timer's callbacks. Will usually be OnBeforeRenderObservable.
      * Countdown calculation is done ONLY when the observable is notifying its observers, meaning that if
      * you choose an observable that doesn't trigger too often, the wait time might extend further than the requested max time
      */
    var contextObservable: Observable[T] = js.native
    
    /**
      * Optional parameters when adding an observer to the observable
      */
    var observableParameters: js.UndefOr[InsertFirst] = js.native
    
    /**
      * Will be triggered when the break condition has met (prematurely ended)
      */
    var onAborted: js.UndefOr[js.Function1[/* data */ ITimerData[_], Unit]] = js.native
    
    /**
      * Will be triggered when the time condition has met
      */
    var onEnded: js.UndefOr[js.Function1[/* data */ ITimerData[_], Unit]] = js.native
    
    /**
      * Optional function to execute on each tick (or count)
      */
    var onTick: js.UndefOr[js.Function1[/* data */ ITimerData[_], Unit]] = js.native
    
    /**
      * Time-to-end
      */
    var timeout: Double = js.native
  }
  object ITimerOptions {
    
    @scala.inline
    def apply[T](contextObservable: Observable[T], timeout: Double): ITimerOptions[T] = {
      val __obj = js.Dynamic.literal(contextObservable = contextObservable.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[ITimerOptions[T]]
    }
    
    @scala.inline
    implicit class ITimerOptionsMutableBuilder[Self <: ITimerOptions[_], T] (val x: Self with ITimerOptions[T]) extends AnyVal {
      
      @scala.inline
      def setBreakCondition(value: /* data */ js.UndefOr[ITimerData[T]] => Boolean): Self = StObject.set(x, "breakCondition", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBreakConditionUndefined: Self = StObject.set(x, "breakCondition", js.undefined)
      
      @scala.inline
      def setContextObservable(value: Observable[T]): Self = StObject.set(x, "contextObservable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObservableParameters(value: InsertFirst): Self = StObject.set(x, "observableParameters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setObservableParametersUndefined: Self = StObject.set(x, "observableParameters", js.undefined)
      
      @scala.inline
      def setOnAborted(value: /* data */ ITimerData[_] => Unit): Self = StObject.set(x, "onAborted", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAbortedUndefined: Self = StObject.set(x, "onAborted", js.undefined)
      
      @scala.inline
      def setOnEnded(value: /* data */ ITimerData[_] => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      @scala.inline
      def setOnTick(value: /* data */ ITimerData[_] => Unit): Self = StObject.set(x, "onTick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTickUndefined: Self = StObject.set(x, "onTick", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
}
