package typings.basicscroll.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicScroll extends js.Object {
  /**
    * Converts the start and stop position of the instance to absolute values. basicScroll relies on those values to start and stop the animation at the right position.
    * It runs the calculation once during the instance creation. .calculate() should be called when elements have altered their position or when the size of the site/viewport has changed.
    */
  def calculate(): Unit
  /**
    * Destroys the instance.
    * Should be called when the instance is no longer needed. All props of the instance will keep their last value
    */
  def destroy(): Unit
  /**
    * Returns calculated data.
    * More or less a parsed version of the data used for the instance creation. The data might change when calling the calculate function.
    */
  def getData(): Data
  /**
    * Returns true when the instance is started and false when the instance is stopped.
    */
  def isActive(): Boolean
  /**
    * Starts to animate the instance. basicScroll will track the scroll position and adjust the props of the instance accordingly.
    * An update will be performed only when the scroll position has changed.
    */
  def start(): Unit
  /**
    * Stops to animate the instance. All props of the instance will keep their last value.
    */
  def stop(): Unit
  /**
    * Triggers an update of an instance, even when the instance is currently stopped.
    */
  def update(): Props
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
}

