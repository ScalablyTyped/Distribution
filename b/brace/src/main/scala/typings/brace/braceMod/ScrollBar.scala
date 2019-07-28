package typings.brace.braceMod

import org.scalablytyped.runtime.Instantiable1
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollBar extends js.Object {
  /**
    * Returns the width of the scroll bar.
    **/
  def getWidth(): Double
  /**
    * Emitted when the scroll bar, well, scrolls.
    * @param e Contains one property, `"data"`, which indicates the current scroll top position
    **/
  def onScroll(e: js.Any): Unit
  /**
    * Sets the height of the scroll bar, in pixels.
    * @param height The new height
    **/
  def setHeight(height: Double): Unit
  /**
    * Sets the inner height of the scroll bar, in pixels.
    * @param height The new inner height
    **/
  def setInnerHeight(height: Double): Unit
  /**
    * Sets the scroll top of the scroll bar.
    * @param scrollTop The new scroll top
    **/
  def setScrollTop(scrollTop: Double): Unit
}

@JSImport("brace", "ScrollBar")
@js.native
class ScrollBarCls protected () extends ScrollBar {
  /**
    * Creates a new `ScrollBar`. `parent` is the owner of the scroll bar.
    * @param parent A DOM element
    **/
  def this(parent: HTMLElement) = this()
  /**
    * Returns the width of the scroll bar.
    **/
  /* CompleteClass */
  override def getWidth(): Double = js.native
  /**
    * Emitted when the scroll bar, well, scrolls.
    * @param e Contains one property, `"data"`, which indicates the current scroll top position
    **/
  /* CompleteClass */
  override def onScroll(e: js.Any): Unit = js.native
  /**
    * Sets the height of the scroll bar, in pixels.
    * @param height The new height
    **/
  /* CompleteClass */
  override def setHeight(height: Double): Unit = js.native
  /**
    * Sets the inner height of the scroll bar, in pixels.
    * @param height The new inner height
    **/
  /* CompleteClass */
  override def setInnerHeight(height: Double): Unit = js.native
  /**
    * Sets the scroll top of the scroll bar.
    * @param scrollTop The new scroll top
    **/
  /* CompleteClass */
  override def setScrollTop(scrollTop: Double): Unit = js.native
}

@JSImport("brace", "ScrollBar")
@js.native
object ScrollBar
  extends /**
  * Creates a new `ScrollBar`. `parent` is the owner of the scroll bar.
  * @param parent A DOM element
  **/
Instantiable1[/* parent */ HTMLElement, ScrollBar]

