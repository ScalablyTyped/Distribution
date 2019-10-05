package typings.cypress.Mocha.reporters.Base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * ANSI TTY control sequences common among reporters.
  *
  * @see https://mochajs.org/api/module-base#.cursor
  */
@JSGlobal("Mocha.reporters.Base.cursor")
@js.native
object cursor extends js.Object {
  /**
    * Clears the line and moves to the beginning of the line.
    */
  def CR(): Unit = js.native
  /**
    * Moves to the beginning of the line
    */
  def beginningOfLine(): Unit = js.native
  /**
    * Deletes the current line
    */
  def deleteLine(): Unit = js.native
  /**
    * Hides the cursor
    */
  def hide(): Unit = js.native
  /**
    * Shows the cursor
    */
  def show(): Unit = js.native
}

