package typings
package braceLib.braceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("brace", "Document")
@js.native
/**
  * Creates a new `Document`. If `text` is included, the `Document` contains those strings; otherwise, it's empty.
  * @param text The starting text
  **/
class DocumentCls ()
  extends braceLib.braceMod.AceAjaxNs.Document {
  def this(text: java.lang.String) = this()
  def this(text: js.Array[java.lang.String]) = this()
  /**
    * Applies all the changes previously accumulated. These can be either `'includeText'`, `'insertLines'`, `'removeText'`, and `'removeLines'`.
    **/
  /* CompleteClass */
  override def applyDeltas(deltas: js.Array[braceLib.braceMod.AceAjaxNs.Delta]): scala.Unit = js.native
  /**
    * Creates a new `Anchor` to define a floating point in the document.
    * @param row The row number to use
    * @param column The column number to use
    **/
  /* CompleteClass */
  override def createAnchor(row: scala.Double, column: scala.Double): scala.Unit = js.native
  /**
    * Returns all lines in the document as string array. Warning: The caller should not modify this array!
    **/
  /* CompleteClass */
  override def getAllLines(): js.Array[java.lang.String] = js.native
  /**
    * Returns the number of rows in the document.
    **/
  /* CompleteClass */
  override def getLength(): scala.Double = js.native
  /**
    * Returns a verbatim copy of the given line as it is in the document
    * @param row The row index to retrieve
    **/
  /* CompleteClass */
  override def getLine(row: scala.Double): java.lang.String = js.native
  /**
    * Returns an array of strings of the rows between `firstRow` and `lastRow`. This function is inclusive of `lastRow`.
    * @param firstRow The first row index to retrieve
    * @param lastRow The final row index to retrieve
    **/
  /* CompleteClass */
  override def getLines(firstRow: scala.Double, lastRow: scala.Double): js.Array[java.lang.String] = js.native
  /**
    * Returns the newline character that's being used, depending on the value of `newLineMode`.
    **/
  /* CompleteClass */
  override def getNewLineCharacter(): java.lang.String = js.native
  /**
    * [Returns the type of newlines being used; either `windows`, `unix`, or `auto`]{: #Document.getNewLineMode}
    **/
  /* CompleteClass */
  override def getNewLineMode(): java.lang.String = js.native
  /**
    * [Given a range within the document, this function returns all the text within that range as a single string.]{: #Document.getTextRange.desc}
    * @param range The range to work with
    **/
  /* CompleteClass */
  override def getTextRange(range: braceLib.braceMod.AceAjaxNs.Range): java.lang.String = js.native
  /**
    * Returns all the lines in the document as a single string, split by the new line character.
    **/
  /* CompleteClass */
  override def getValue(): java.lang.String = js.native
  /**
    * Converts an index position in a document to a `{row, column}` object.
    * Index refers to the "absolute position" of a character in the document. For example:
    * ```javascript
    * var x = 0; // 10 characters, plus one for newline
    * var y = -1;
    * ```
    * Here, `y` is an index 15: 11 characters for the first row, and 5 characters until `y` in the second.
    * @param index An index to convert
    * @param startRow=0 The row from which to start the conversion
    **/
  /* CompleteClass */
  override def indexToPosition(index: scala.Double, startRow: scala.Double): braceLib.braceMod.AceAjaxNs.Position = js.native
  /**
    * Inserts a block of `text` and the indicated `position`.
    * @param position The position to start inserting at
    * @param text A chunk of text to insert
    **/
  /* CompleteClass */
  override def insert(position: braceLib.braceMod.AceAjaxNs.Position, text: java.lang.String): js.Any = js.native
  /**
    * Inserts `text` into the `position` at the current row. This method also triggers the `'change'` event.
    * @param position The position to insert at
    * @param text A chunk of text
    **/
  /* CompleteClass */
  override def insertInLine(position: js.Any, text: java.lang.String): js.Any = js.native
  /**
    * Inserts the elements in `lines` into the document, starting at the row index given by `row`. This method also triggers the `'change'` event.
    * @param row The index of the row to insert at
    * @param lines An array of strings
    **/
  /* CompleteClass */
  override def insertLines(row: scala.Double, lines: js.Array[java.lang.String]): js.Any = js.native
  /**
    * Inserts a new line into the document at the current row's `position`. This method also triggers the `'change'` event.
    * @param position The position to insert at
    **/
  /* CompleteClass */
  override def insertNewLine(position: braceLib.braceMod.AceAjaxNs.Position): js.Any = js.native
  /**
    * Returns `true` if `text` is a newline character (either `\r\n`, `\r`, or `\n`).
    * @param text The text to check
    **/
  /* CompleteClass */
  override def isNewLine(text: java.lang.String): scala.Boolean = js.native
  /* CompleteClass */
  override def on(event: java.lang.String, fn: js.Function1[/* e */ js.Any, _]): scala.Unit = js.native
  /**
    * Converts the `{row, column}` position in a document to the character's index.
    * Index refers to the "absolute position" of a character in the document. For example:
    * ```javascript
    * var x = 0; // 10 characters, plus one for newline
    * var y = -1;
    * ```
    * Here, `y` is an index 15: 11 characters for the first row, and 5 characters until `y` in the second.
    * @param pos The `{row, column}` to convert
    * @param startRow=0 The row from which to start the conversion
    **/
  /* CompleteClass */
  override def positionToIndex(pos: braceLib.braceMod.AceAjaxNs.Position, startRow: scala.Double): scala.Double = js.native
  /**
    * Removes the `range` from the document.
    * @param range A specified Range to remove
    **/
  /* CompleteClass */
  override def remove(range: braceLib.braceMod.AceAjaxNs.Range): js.Any = js.native
  /**
    * Removes the specified columns from the `row`. This method also triggers the `'change'` event.
    * @param row The row to remove from
    * @param startColumn The column to start removing at
    * @param endColumn The column to stop removing at
    **/
  /* CompleteClass */
  override def removeInLine(row: scala.Double, startColumn: scala.Double, endColumn: scala.Double): js.Any = js.native
  /**
    * Removes a range of full lines. This method also triggers the `'change'` event.
    * @param firstRow The first row to be removed
    * @param lastRow The last row to be removed
    **/
  /* CompleteClass */
  override def removeLines(firstRow: scala.Double, lastRow: scala.Double): js.Array[java.lang.String] = js.native
  /**
    * Removes the new line between `row` and the row immediately following it. This method also triggers the `'change'` event.
    * @param row The row to check
    **/
  /* CompleteClass */
  override def removeNewLine(row: scala.Double): scala.Unit = js.native
  /**
    * Replaces a range in the document with the new `text`.
    * @param range A specified Range to replace
    * @param text The new text to use as a replacement
    **/
  /* CompleteClass */
  override def replace(range: braceLib.braceMod.AceAjaxNs.Range, text: java.lang.String): js.Any = js.native
  /**
    * Reverts any changes previously applied. These can be either `'includeText'`, `'insertLines'`, `'removeText'`, and `'removeLines'`.
    **/
  /* CompleteClass */
  override def revertDeltas(deltas: js.Array[braceLib.braceMod.AceAjaxNs.Delta]): scala.Unit = js.native
  /**
    * [Sets the new line mode.]{: #Document.setNewLineMode.desc}
    * @param newLineMode [The newline mode to use; can be either `windows`, `unix`, or `auto`]{: #Document.setNewLineMode.param}
    **/
  /* CompleteClass */
  override def setNewLineMode(newLineMode: java.lang.String): scala.Unit = js.native
  /**
    * Replaces all the lines in the current `Document` with the value of `text`.
    * @param text The text to use
    **/
  /* CompleteClass */
  override def setValue(text: java.lang.String): scala.Unit = js.native
}

