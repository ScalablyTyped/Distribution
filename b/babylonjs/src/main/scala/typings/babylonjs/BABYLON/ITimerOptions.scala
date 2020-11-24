package typings.babylonjs.BABYLON

import typings.babylonjs.anon.InsertFirst
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITimerOptions[T] extends js.Object {
  
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
  implicit class ITimerOptionsOps[Self <: ITimerOptions[_], T] (val x: Self with ITimerOptions[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContextObservable(value: Observable[T]): Self = this.set("contextObservable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreakCondition(value: /* data */ js.UndefOr[ITimerData[T]] => Boolean): Self = this.set("breakCondition", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBreakCondition: Self = this.set("breakCondition", js.undefined)
    
    @scala.inline
    def setObservableParameters(value: InsertFirst): Self = this.set("observableParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObservableParameters: Self = this.set("observableParameters", js.undefined)
    
    @scala.inline
    def setOnAborted(value: /* data */ ITimerData[_] => Unit): Self = this.set("onAborted", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAborted: Self = this.set("onAborted", js.undefined)
    
    @scala.inline
    def setOnEnded(value: /* data */ ITimerData[_] => Unit): Self = this.set("onEnded", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEnded: Self = this.set("onEnded", js.undefined)
    
    @scala.inline
    def setOnTick(value: /* data */ ITimerData[_] => Unit): Self = this.set("onTick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnTick: Self = this.set("onTick", js.undefined)
  }
}
