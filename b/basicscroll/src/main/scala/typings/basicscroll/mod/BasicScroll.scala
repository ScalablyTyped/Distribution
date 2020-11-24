package typings.basicscroll.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasicScroll extends js.Object {
  
  /**
    * Converts the start and stop position of the instance to absolute values. basicScroll relies on those values to start and stop the animation at the right position.
    * It runs the calculation once during the instance creation. .calculate() should be called when elements have altered their position or when the size of the site/viewport has changed.
    */
  def calculate(): Unit = js.native
  
  /**
    * Destroys the instance.
    * Should be called when the instance is no longer needed. All props of the instance will keep their last value
    */
  def destroy(): Unit = js.native
  
  /**
    * Returns calculated data.
    * More or less a parsed version of the data used for the instance creation. The data might change when calling the calculate function.
    */
  def getData(): Data = js.native
  
  /**
    * Returns true when the instance is started and false when the instance is stopped.
    */
  def isActive(): Boolean = js.native
  
  /**
    * Starts to animate the instance. basicScroll will track the scroll position and adjust the props of the instance accordingly.
    * An update will be performed only when the scroll position has changed.
    */
  def start(): Unit = js.native
  
  /**
    * Stops to animate the instance. All props of the instance will keep their last value.
    */
  def stop(): Unit = js.native
  
  /**
    * Triggers an update of an instance, even when the instance is currently stopped.
    */
  def update(): Props = js.native
}
object BasicScroll {
  
  @scala.inline
  def apply(
    calculate: () => Unit,
    destroy: () => Unit,
    getData: () => Data,
    isActive: () => Boolean,
    start: () => Unit,
    stop: () => Unit,
    update: () => Props
  ): BasicScroll = {
    val __obj = js.Dynamic.literal(calculate = js.Any.fromFunction0(calculate), destroy = js.Any.fromFunction0(destroy), getData = js.Any.fromFunction0(getData), isActive = js.Any.fromFunction0(isActive), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop), update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[BasicScroll]
  }
  
  @scala.inline
  implicit class BasicScrollOps[Self <: BasicScroll] (val x: Self) extends AnyVal {
    
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
    def setCalculate(value: () => Unit): Self = this.set("calculate", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetData(value: () => Data): Self = this.set("getData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsActive(value: () => Boolean): Self = this.set("isActive", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStart(value: () => Unit): Self = this.set("start", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStop(value: () => Unit): Self = this.set("stop", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUpdate(value: () => Props): Self = this.set("update", js.Any.fromFunction0(value))
  }
}
