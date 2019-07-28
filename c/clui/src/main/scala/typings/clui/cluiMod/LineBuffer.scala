package typings.clui.cluiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("clui", "LineBuffer")
@js.native
class LineBuffer protected () extends js.Object {
  /**
    * Creates an object for buffering a group of text lines and then outputting them
    * @param options Values to build the buffer
    */
  def this(options: LineBufferOptions) = this()
  /**
    * Put a `Line` object into the `LineBuffer`
    * @param line The line object to put into the buffer
    */
  def addLine(line: Line): Unit = js.native
  /**
    * If you don't have enough lines in the buffer, this will fill the reset of
    * the lines with empty spaces
    */
  def fill(): Unit = js.native
  /**
    * Return the height of the `LineBuffer`, when specified as `console`
    */
  def height(): Double = js.native
  /**
    * Draw the `LineBuffer` to screen
    */
  def output(): Unit = js.native
  /**
    * Return the width of the `LineBuffer`, when specified as `console`
    */
  def width(): Double = js.native
}

