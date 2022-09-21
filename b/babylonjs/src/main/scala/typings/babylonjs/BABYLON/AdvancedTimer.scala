package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdvancedTimer[T]
  extends StObject
     with IDisposable {
  
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
