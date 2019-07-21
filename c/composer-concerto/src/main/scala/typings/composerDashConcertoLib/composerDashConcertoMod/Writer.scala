package typings
package composerDashConcertoLib.composerDashConcertoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("composer-concerto", "Writer")
@js.native
/**
  * Create a Writer.
  */
class Writer () extends js.Object {
  /**
    * Empties the underyling buffer and resets the line count.
    */
  def clearBuffer(): scala.Unit = js.native
  /**
    * Returns the text that has been buffered in this Writer.
    */
  def getBuffer(): java.lang.String = js.native
  /**
    * Returns the number of lines that have been written to the buffer.
    */
  def getLineCount(): scala.Double = js.native
  /**
    * Append text to the buffer (no automatic newline). The
    * text may contain newline, and these will increment the linesWritten
    * counter.
    */
  def write(msg: java.lang.String): scala.Unit = js.native
  /**
    * Writes text to the start of the buffer.
    */
  def writeBeforeLine(tabs: scala.Double, text: java.lang.String): scala.Unit = js.native
  /**
    * Append text to the buffer, prepending tabs.
    */
  def writeIndented(tabs: scala.Double, text: java.lang.String): scala.Unit = js.native
  /**
    * Append text to the buffer.
    */
  def writeLine(tabs: scala.Double, text: java.lang.String): scala.Unit = js.native
}

