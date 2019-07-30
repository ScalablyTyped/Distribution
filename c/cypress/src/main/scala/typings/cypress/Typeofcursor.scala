package typings.cypress

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofcursor extends js.Object {
  /**
    * Clears the line and moves to the beginning of the line.
    */
  def CR(): Unit
  /**
    * Moves to the beginning of the line
    */
  def beginningOfLine(): Unit
  /**
    * Deletes the current line
    */
  def deleteLine(): Unit
  /**
    * Hides the cursor
    */
  def hide(): Unit
  /**
    * Shows the cursor
    */
  def show(): Unit
}

object Typeofcursor {
  @scala.inline
  def apply(
    CR: () => Unit,
    beginningOfLine: () => Unit,
    deleteLine: () => Unit,
    hide: () => Unit,
    show: () => Unit
  ): Typeofcursor = {
    val __obj = js.Dynamic.literal(CR = js.Any.fromFunction0(CR), beginningOfLine = js.Any.fromFunction0(beginningOfLine), deleteLine = js.Any.fromFunction0(deleteLine), hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show))
  
    __obj.asInstanceOf[Typeofcursor]
  }
}

