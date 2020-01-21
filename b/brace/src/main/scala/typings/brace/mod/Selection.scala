package typings.brace.mod

import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Selection extends js.Object {
  def addEventListener(ev: String, callback: js.Function): Unit = js.native
  def addRange(range: Range): Unit = js.native
  /**
    * [Empties the selection (by de-selecting it). This function also emits the `'changeSelection'` event.]{: #Selection.clearSelection}
    **/
  def clearSelection(): Unit = js.native
  def fromOrientedRange(range: Range): Unit = js.native
  def getAllRanges(): js.Array[Range] = js.native
  /**
    * Gets the current position of the cursor.
    **/
  def getCursor(): Position = js.native
  /**
    * [Returns the [[Range]] for the selected text.]{: #Selection.getRange}
    **/
  def getRange(): Range = js.native
  /**
    * Returns an object containing the `row` and `column` of the calling selection anchor.
    **/
  def getSelectionAnchor(): js.Any = js.native
  /**
    * Returns an object containing the `row` and `column` of the calling selection lead.
    **/
  def getSelectionLead(): js.Any = js.native
  /**
    * Moves the selection to highlight the entire word.
    **/
  def getWordRange(): Unit = js.native
  /**
    * Returns `true` if the selection is going backwards in the document.
    **/
  def isBackwards(): Boolean = js.native
  /**
    * Returns `true` if the selection is empty.
    **/
  def isEmpty(): Boolean = js.native
  /**
    * Returns `true` if the selection is a multi-line.
    **/
  def isMultiLine(): Boolean = js.native
  /**
    * Moves the cursor to position indicated by the parameters. Negative numbers move the cursor backwards in the document.
    * @param rows The number of rows to move by
    * @param chars The number of characters to move by
    **/
  def moveCursorBy(rows: Double, chars: Double): Unit = js.native
  /**
    * Moves the cursor down one row.
    **/
  def moveCursorDown(): Unit = js.native
  /**
    * Moves the cursor to the end of the file.
    **/
  def moveCursorFileEnd(): Unit = js.native
  /**
    * Moves the cursor to the start of the file.
    **/
  def moveCursorFileStart(): Unit = js.native
  /**
    * Moves the cursor left one column.
    **/
  def moveCursorLeft(): Unit = js.native
  /**
    * Moves the cursor to the end of the line.
    **/
  def moveCursorLineEnd(): Unit = js.native
  /**
    * Moves the cursor to the start of the line.
    **/
  def moveCursorLineStart(): Unit = js.native
  /**
    * Moves the cursor to the word on the left.
    **/
  def moveCursorLongWordLeft(): Unit = js.native
  /**
    * Moves the cursor to the word on the right.
    **/
  def moveCursorLongWordRight(): Unit = js.native
  /**
    * Moves the cursor right one column.
    **/
  def moveCursorRight(): Unit = js.native
  /**
    * Moves the cursor to the row and column provided. [If `preventUpdateDesiredColumn` is `true`, then the cursor stays in the same column position as its original point.]{: #preventUpdateBoolDesc}
    * @param row The row to move to
    * @param column The column to move to
    * @param keepDesiredColumn [If `true`, the cursor move does not respect the previous column]{: #preventUpdateBool}
    **/
  def moveCursorTo(row: Double, column: Double): Unit = js.native
  def moveCursorTo(row: Double, column: Double, keepDesiredColumn: Boolean): Unit = js.native
  /**
    * Moves the selection to the position indicated by its `row` and `column`.
    * @param position The position to move to
    **/
  def moveCursorToPosition(position: js.Any): Unit = js.native
  /**
    * Moves the cursor to the screen position indicated by row and column. {:preventUpdateBoolDesc}
    * @param row The row to move to
    * @param column The column to move to
    * @param keepDesiredColumn {:preventUpdateBool}
    **/
  def moveCursorToScreen(row: Double, column: Double, keepDesiredColumn: Boolean): Unit = js.native
  /**
    * Moves the cursor up one row.
    **/
  def moveCursorUp(): Unit = js.native
  def moveCursorWordLeft(): Unit = js.native
  def moveCursorWordRight(): Unit = js.native
  def off(ev: String, callback: js.Function): Unit = js.native
  def on(event: String, fn: js.Function1[/* e */ js.Any, _]): Unit = js.native
  def on(ev: String, callback: js.Function): Unit = js.native
  def removeEventListener(ev: String, callback: js.Function): Unit = js.native
  def removeListener(ev: String, callback: js.Function): Unit = js.native
  /**
    * Selects a word, including its right whitespace.
    **/
  def selectAWord(): Unit = js.native
  /**
    * Selects all the text in the document.
    **/
  def selectAll(): Unit = js.native
  /**
    * Moves the selection down one row.
    **/
  def selectDown(): Unit = js.native
  /**
    * Moves the selection to the end of the file.
    **/
  def selectFileEnd(): Unit = js.native
  /**
    * Moves the selection to the start of the file.
    **/
  def selectFileStart(): Unit = js.native
  /**
    * Moves the selection left one column.
    **/
  def selectLeft(): Unit = js.native
  /**
    * Selects the entire line.
    **/
  def selectLine(): Unit = js.native
  /**
    * Moves the selection to the end of the current line.
    **/
  def selectLineEnd(): Unit = js.native
  /**
    * Moves the selection to the beginning of the current line.
    **/
  def selectLineStart(): Unit = js.native
  /**
    * Moves the selection right one column.
    **/
  def selectRight(): Unit = js.native
  /**
    * Moves the selection cursor to the indicated row and column.
    * @param row The row to select to
    * @param column The column to select to
    **/
  def selectTo(row: Double, column: Double): Unit = js.native
  /**
    * Moves the selection cursor to the row and column indicated by `pos`.
    * @param pos An object containing the row and column
    **/
  def selectToPosition(pos: js.Any): Unit = js.native
  /**
    * Moves the selection up one row.
    **/
  def selectUp(): Unit = js.native
  /**
    * Selects an entire word boundary.
    **/
  def selectWord(): Unit = js.native
  /**
    * Moves the selection to the first word on the left.
    **/
  def selectWordLeft(): Unit = js.native
  /**
    * Moves the selection to the first word on the right.
    **/
  def selectWordRight(): Unit = js.native
  /**
    * Sets the selection to the provided range.
    * @param range The range of text to select
    * @param reverse Indicates if the range should go backwards (`true`) or not
    **/
  def setRange(range: Range, reverse: Boolean): Unit = js.native
  /**
    * Sets the row and column position of the anchor. This function also emits the `'changeSelection'` event.
    * @param row The new row
    * @param column The new column
    **/
  def setSelectionAnchor(row: Double, column: Double): Unit = js.native
  def setSelectionRange(`match`: js.Any): Unit = js.native
  /**
    * Shifts the selection up (or down, if [[Selection.isBackwards `isBackwards()`]] is true) the given number of columns.
    * @param columns The number of columns to shift by
    **/
  def shiftSelection(columns: Double): Unit = js.native
}

@JSImport("brace", "Selection")
@js.native
object Selection
  extends /**
  * Creates a new `Selection` object.
  * @param session The session to use
  **/
Instantiable1[/* session */ IEditSession, Selection]

