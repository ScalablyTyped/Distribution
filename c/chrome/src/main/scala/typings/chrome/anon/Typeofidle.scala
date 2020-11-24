package typings.chrome.anon

import typings.chrome.chrome.idle.IdleState
import typings.chrome.chrome.idle.IdleStateChangedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofidle extends js.Object {
  
  def getAutoLockDelay(callback: js.Function1[/* delay */ Double, Unit]): Unit = js.native
  
  var onStateChanged: IdleStateChangedEvent = js.native
  
  def queryState(detectionIntervalInSeconds: Double, callback: js.Function1[/* newState */ IdleState, Unit]): Unit = js.native
  
  def setDetectionInterval(intervalInSeconds: Double): Unit = js.native
}
object Typeofidle {
  
  @scala.inline
  def apply(
    getAutoLockDelay: js.Function1[/* delay */ Double, Unit] => Unit,
    onStateChanged: IdleStateChangedEvent,
    queryState: (Double, js.Function1[/* newState */ IdleState, Unit]) => Unit,
    setDetectionInterval: Double => Unit
  ): Typeofidle = {
    val __obj = js.Dynamic.literal(getAutoLockDelay = js.Any.fromFunction1(getAutoLockDelay), onStateChanged = onStateChanged.asInstanceOf[js.Any], queryState = js.Any.fromFunction2(queryState), setDetectionInterval = js.Any.fromFunction1(setDetectionInterval))
    __obj.asInstanceOf[Typeofidle]
  }
  
  @scala.inline
  implicit class TypeofidleOps[Self <: Typeofidle] (val x: Self) extends AnyVal {
    
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
    def setGetAutoLockDelay(value: js.Function1[/* delay */ Double, Unit] => Unit): Self = this.set("getAutoLockDelay", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnStateChanged(value: IdleStateChangedEvent): Self = this.set("onStateChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryState(value: (Double, js.Function1[/* newState */ IdleState, Unit]) => Unit): Self = this.set("queryState", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetDetectionInterval(value: Double => Unit): Self = this.set("setDetectionInterval", js.Any.fromFunction1(value))
  }
}
