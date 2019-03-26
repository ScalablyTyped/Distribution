package typings
package braceLib.braceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("brace", "ScrollBar")
@js.native
class ScrollBarCls protected ()
  extends braceLib.braceMod.AceAjaxNs.ScrollBar {
  /**
    * Creates a new `ScrollBar`. `parent` is the owner of the scroll bar.
    * @param parent A DOM element
    **/
  def this(parent: stdLib.HTMLElement) = this()
  /**
    * Returns the width of the scroll bar.
    **/
  /* CompleteClass */
  override def getWidth(): scala.Double = js.native
  /**
    * Emitted when the scroll bar, well, scrolls.
    * @param e Contains one property, `"data"`, which indicates the current scroll top position
    **/
  /* CompleteClass */
  override def onScroll(e: js.Any): scala.Unit = js.native
  /**
    * Sets the height of the scroll bar, in pixels.
    * @param height The new height
    **/
  /* CompleteClass */
  override def setHeight(height: scala.Double): scala.Unit = js.native
  /**
    * Sets the inner height of the scroll bar, in pixels.
    * @param height The new inner height
    **/
  /* CompleteClass */
  override def setInnerHeight(height: scala.Double): scala.Unit = js.native
  /**
    * Sets the scroll top of the scroll bar.
    * @param scrollTop The new scroll top
    **/
  /* CompleteClass */
  override def setScrollTop(scrollTop: scala.Double): scala.Unit = js.native
}

