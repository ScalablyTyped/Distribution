package typings.bootstrap.carouselMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Carousel_ extends js.Object {
  
  /**
    * Cycles through the carousel items from left to right.
    */
  def cycle(): Unit = js.native
  
  /**
    * Destroys an element's carousel.
    */
  def dispose(): Unit = js.native
  
  /**
    * Cycles to the next item. Returns to the caller before the next item has
    * been shown (e.g., before the slid.bs.carousel event occurs).
    */
  def next(): Unit = js.native
  
  /**
    * Cycles the carousel to a particular frame (0 based, similar to an array).
    * Returns to the caller before the target item has been shown (e.g., before
    * the slid.bs.carousel event occurs).
    */
  def nextWhenVisible(): Unit = js.native
  
  /**
    * Stops the carousel from cycling through items.
    */
  def pause(): Unit = js.native
  
  /**
    * Cycles to the previous item. Returns to the caller before the previous
    * item has been shown (e.g., before the slid.bs.carousel event occurs).
    */
  def prev(): Unit = js.native
}
object Carousel_ {
  
  @scala.inline
  def apply(
    cycle: () => Unit,
    dispose: () => Unit,
    next: () => Unit,
    nextWhenVisible: () => Unit,
    pause: () => Unit,
    prev: () => Unit
  ): Carousel_ = {
    val __obj = js.Dynamic.literal(cycle = js.Any.fromFunction0(cycle), dispose = js.Any.fromFunction0(dispose), next = js.Any.fromFunction0(next), nextWhenVisible = js.Any.fromFunction0(nextWhenVisible), pause = js.Any.fromFunction0(pause), prev = js.Any.fromFunction0(prev))
    __obj.asInstanceOf[Carousel_]
  }
  
  @scala.inline
  implicit class Carousel_Ops[Self <: Carousel_] (val x: Self) extends AnyVal {
    
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
    def setCycle(value: () => Unit): Self = this.set("cycle", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNext(value: () => Unit): Self = this.set("next", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNextWhenVisible(value: () => Unit): Self = this.set("nextWhenVisible", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPause(value: () => Unit): Self = this.set("pause", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrev(value: () => Unit): Self = this.set("prev", js.Any.fromFunction0(value))
  }
}
