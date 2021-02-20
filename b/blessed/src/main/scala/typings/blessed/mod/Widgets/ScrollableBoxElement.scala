package typings.blessed.mod.Widgets

import typings.blessed.blessedStrings.scroll
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * DEPRECATED - Use Box with the scrollable option instead. A box with scrollable content.
  */
@JSImport("blessed", "Widgets.ScrollableBoxElement")
@js.native
class ScrollableBoxElement protected () extends BlessedElement {
  def this(opts: ElementOptions) = this()
  
  /**
    * The offset of the top of the scroll content.
    */
  var childBase: Double = js.native
  
  /**
    * The offset of the chosen item/line.
    */
  var childOffset: Double = js.native
  
  /**
    * Get the current scroll index in lines.
    */
  def getScroll(): Double = js.native
  
  /**
    * Get the actual height of the scrolling area.
    */
  def getScrollHeight(): Double = js.native
  
  /**
    * Get the current scroll index in percentage.
    */
  def getScrollPerc(): Double = js.native
  
  /**
    * Received when the element is scrolled.
    */
  @JSName("on")
  def on_scroll(event: scroll, callback: js.Function0[Unit]): this.type = js.native
  
  /**
    * Reset the scroll index to its initial state.
    */
  def resetScroll(): Unit = js.native
  
  /**
    * Scroll the content by a relative offset.
    */
  def scroll(offset: Double): Unit = js.native
  def scroll(offset: Double, always: Boolean): Unit = js.native
  
  /**
    * Scroll the content to an absolute index.
    */
  def scrollTo(index: Double): Unit = js.native
  
  /**
    * Same as scrollTo.
    */
  def setScroll(index: Double): Unit = js.native
  
  /**
    * Set the current scroll index in percentage (0-100).
    */
  def setScrollPerc(perc: Double): Unit = js.native
}
