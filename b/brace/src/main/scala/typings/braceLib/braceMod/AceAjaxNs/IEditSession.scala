package typings
package braceLib.braceMod.AceAjaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IEditSession extends js.Object {
  var bgTokenizer: BackgroundTokenizer = js.native
  var doc: Document = js.native
  var selection: Selection = js.native
  /**
    * If `text` contains either the newline (`\n`) or carriage-return ('\r') characters, `$autoNewLine` stores that value.
    * @param text A block of text
    **/
  @JSName("$detectNewLine")
  def $detectNewLine(text: java.lang.String): scala.Unit = js.native
  /**
    * Given a string, returns an array of the display characters, including tabs and spaces.
    * @param str The string to check
    * @param offset The value to start at
    **/
  @JSName("$getDisplayTokens")
  def $getDisplayTokens(str: java.lang.String, offset: scala.Double): scala.Unit = js.native
  /**
    * Calculates the width of the string `str` on the screen while assuming that the string starts at the first column on the screen.
    * @param str The string to calculate the screen width of
    * @param maxScreenColumn
    * @param screenColumn
    **/
  @JSName("$getStringScreenWidth")
  def $getStringScreenWidth(str: java.lang.String, maxScreenColumn: scala.Double, screenColumn: scala.Double): js.Array[scala.Double] = js.native
  /**
    * Sets a new text mode for the `EditSession`. This method also emits the `'changeMode'` event. If a [[BackgroundTokenizer `BackgroundTokenizer`]] is set, the `'tokenizerUpdate'` event is also emitted.
    * @param mode Set a new text mode
    **/
  @JSName("$mode")
  def $mode(mode: TextMode): scala.Unit = js.native
  /**
    * undefined
    * @param row The row to work with
    **/
  @JSName("$resetRowCache")
  def $resetRowCache(row: scala.Double): scala.Unit = js.native
  /**
    * Adds a dynamic marker to the session.
    * @param marker object with update method
    * @param inFront Set to `true` to establish a front marker
    **/
  def addDynamicMarker(marker: js.Any, inFront: scala.Boolean): scala.Unit = js.native
  def addFold(text: java.lang.String, range: Range): scala.Unit = js.native
  /**
    * Adds `className` to the `row`, to be used for CSS stylings and whatnot.
    * @param row The row number
    * @param className The class to add
    **/
  def addGutterDecoration(row: scala.Double, className: java.lang.String): scala.Unit = js.native
  /**
    * Adds a new marker to the given `Range`. If `inFront` is `true`, a front marker is defined, and the `'changeFrontMarker'` event fires; otherwise, the `'changeBackMarker'` event fires.
    * @param range Define the range of the marker
    * @param clazz Set the CSS class for the marker
    * @param type Identify the type of the marker
    * @param inFront Set to `true` to establish a front marker
    **/
  def addMarker(range: Range, clazz: java.lang.String, `type`: java.lang.String, inFront: scala.Boolean): scala.Double = js.native
  /**
    * Adds a new marker to the given `Range`. If `inFront` is `true`, a front marker is defined, and the `'changeFrontMarker'` event fires; otherwise, the `'changeBackMarker'` event fires.
    * @param range Define the range of the marker
    * @param clazz Set the CSS class for the marker
    * @param type Identify the type of the marker
    * @param inFront Set to `true` to establish a front marker
    **/
  def addMarker(range: Range, clazz: java.lang.String, `type`: js.Function, inFront: scala.Boolean): scala.Double = js.native
  /**
    * This should generally only be called by the renderer when a resize is detected.
    * @param desiredLimit The new wrap limit
    **/
  def adjustWrapLimit(desiredLimit: scala.Double): scala.Boolean = js.native
  /**
    * Clears all the annotations for this session. This function also triggers the `'changeAnnotation'` event.
    **/
  def clearAnnotations(): scala.Unit = js.native
  /**
    * Removes a breakpoint on the row number given by `rows`. This function also emites the `'changeBreakpoint'` event.
    * @param row A row index
    **/
  def clearBreakpoint(row: scala.Double): scala.Unit = js.native
  /**
    * Removes all breakpoints on the rows. This function also emites the `'changeBreakpoint'` event.
    **/
  def clearBreakpoints(): scala.Unit = js.native
  /**
    * For the given document row and column, returns the screen column.
    * @param row
    * @param docColumn
    **/
  def documentToScreenColumn(row: scala.Double, docColumn: scala.Double): scala.Double = js.native
  /**
    * Converts document coordinates to screen coordinates. {:conversionConsiderations}
    * @param docRow The document row to check
    * @param docColumn The document column to check
    **/
  def documentToScreenPosition(docRow: scala.Double, docColumn: scala.Double): js.Any = js.native
  /**
    * For the given document row and column, returns the screen row.
    * @param docRow
    * @param docColumn
    **/
  def documentToScreenRow(docRow: scala.Double, docColumn: scala.Double): scala.Unit = js.native
  /**
    * Duplicates all the text between `firstRow` and `lastRow`.
    * @param firstRow The starting row to duplicate
    * @param lastRow The final row to duplicate
    **/
  def duplicateLines(firstRow: scala.Double, lastRow: scala.Double): scala.Double = js.native
  def expandFold(arg: js.Any): scala.Unit = js.native
  def findMatchingBracket(position: Position): scala.Unit = js.native
  def foldAll(): scala.Unit = js.native
  def foldAll(startRow: scala.Double): scala.Unit = js.native
  def foldAll(startRow: scala.Double, endRow: scala.Double): scala.Unit = js.native
  def foldAll(startRow: scala.Double, endRow: scala.Double, depth: scala.Double): scala.Unit = js.native
  /**
    * Gets the range of a word, including its right whitespace.
    * @param row The row number to start from
    * @param column The column number to start from
    **/
  def getAWordRange(row: scala.Double, column: scala.Double): js.Any = js.native
  /**
    * Returns the annotations for the `EditSession`.
    **/
  def getAnnotations(): js.Any = js.native
  /**
    * Returns an array of numbers, indicating which rows have breakpoints.
    **/
  def getBreakpoints(): js.Array[scala.Double] = js.native
  /**
    * Returns the `Document` associated with this session.
    **/
  def getDocument(): Document = js.native
  /**
    * For the given document row and column, this returns the column position of the last screen row.
    * @param docRow
    * @param docColumn
    **/
  def getDocumentLastRowColumn(docRow: scala.Double, docColumn: scala.Double): scala.Double = js.native
  /**
    * For the given document row and column, this returns the document position of the last row.
    * @param docRow
    * @param docColumn
    **/
  def getDocumentLastRowColumnPosition(docRow: scala.Double, docColumn: scala.Double): scala.Double = js.native
  def getFoldAt(row: scala.Double, column: scala.Double): js.Any = js.native
  def getFoldDisplayLine(foldLine: js.Any, docRow: scala.Double, docColumn: scala.Double): js.Any = js.native
  def getFoldsInRange(range: Range): js.Any = js.native
  /**
    * Returns the number of rows in the document.
    **/
  def getLength(): scala.Double = js.native
  /**
    * Returns a verbatim copy of the given line as it is in the document
    * @param row The row to retrieve from
    **/
  def getLine(row: scala.Double): java.lang.String = js.native
  /**
    * Returns an array of strings of the rows between `firstRow` and `lastRow`. This function is inclusive of `lastRow`.
    * @param firstRow The first row index to retrieve
    * @param lastRow The final row index to retrieve
    **/
  def getLines(firstRow: scala.Double, lastRow: scala.Double): js.Array[java.lang.String] = js.native
  /**
    * Returns an array containing the IDs of all the markers, either front or back.
    * @param inFront If `true`, indicates you only want front markers; `false` indicates only back markers
    **/
  def getMarkers(inFront: scala.Boolean): js.Array[_] = js.native
  /**
    * Returns the current text mode.
    **/
  def getMode(): TextMode = js.native
  /**
    * Returns the current new line mode.
    **/
  def getNewLineMode(): java.lang.String = js.native
  /**
    * Returns `true` if overwrites are enabled; `false` otherwise.
    **/
  def getOverwrite(): scala.Boolean = js.native
  /**
    * Returns number of screenrows in a wrapped line.
    * @param row The row number to check
    **/
  def getRowLength(row: scala.Double): scala.Double = js.native
  /**
    * For the given row, this returns the split data.
    **/
  def getRowSplitData(): java.lang.String = js.native
  /**
    * Returns the position (on screen) for the last character in the provided screen row.
    * @param screenRow The screen row to check
    **/
  def getScreenLastRowColumn(screenRow: scala.Double): scala.Double = js.native
  /**
    * Returns the length of the screen.
    **/
  def getScreenLength(): scala.Double = js.native
  /**
    * The distance to the next tab stop at the specified screen column.
    * @param screenColumn The screen column to check
    **/
  def getScreenTabSize(screenColumn: scala.Double): scala.Double = js.native
  /**
    * Returns the width of the screen.
    **/
  def getScreenWidth(): scala.Double = js.native
  /**
    * [Returns the value of the distance between the left of the editor and the leftmost part of the visible content.]{: #EditSession.getScrollLeft}
    **/
  def getScrollLeft(): scala.Double = js.native
  /**
    * [Returns the value of the distance between the top of the editor and the topmost part of the visible content.]{: #EditSession.getScrollTop}
    **/
  def getScrollTop(): scala.Double = js.native
  /**
    * Returns the string of the current selection.
    **/
  def getSelection(): Selection = js.native
  /**
    * {:BackgroundTokenizer.getState}
    * @param row The row to start at
    **/
  def getState(row: scala.Double): java.lang.String = js.native
  /**
    * Returns the current tab size.
    **/
  def getTabSize(): scala.Double = js.native
  /**
    * Returns the current value for tabs. If the user is using soft tabs, this will be a series of spaces (defined by [[EditSession.getTabSize `getTabSize()`]]): void; otherwise it's simply `'\t'`.
    **/
  def getTabString(): java.lang.String = js.native
  /**
    * {:Document.getTextRange.desc}
    * @param range The range to work with
    **/
  def getTextRange(range: Range): java.lang.String = js.native
  /**
    * Returns an object indicating the token at the current row. The object has two properties: `index` and `start`.
    * @param row The row number to retrieve from
    * @param column The column number to retrieve from
    **/
  def getTokenAt(row: scala.Double, column: scala.Double): TokenInfo = js.native
  /**
    * Starts tokenizing at the row indicated. Returns a list of objects of the tokenized rows.
    * @param row The row to start at
    **/
  def getTokens(row: scala.Double): js.Array[TokenInfo] = js.native
  /**
    * Returns the current undo manager.
    **/
  def getUndoManager(): UndoManager = js.native
  /**
    * Returns `true` if soft tabs are being used, `false` otherwise.
    **/
  def getUseSoftTabs(): scala.Boolean = js.native
  /**
    * Returns `true` if workers are being used.
    **/
  def getUseWorker(): scala.Boolean = js.native
  /**
    * Returns `true` if wrap mode is being used; `false` otherwise.
    **/
  def getUseWrapMode(): scala.Boolean = js.native
  /**
    * Returns the current [[Document `Document`]] as a string.
    **/
  def getValue(): java.lang.String = js.native
  /**
    * Given a starting row and column, this method returns the `Range` of the first word boundary it finds.
    * @param row The row to start at
    * @param column The column to start at
    **/
  def getWordRange(row: scala.Double, column: scala.Double): Range = js.native
  /**
    * Returns the value of wrap limit.
    **/
  def getWrapLimit(): scala.Double = js.native
  /**
    * Returns an object that defines the minimum and maximum of the wrap limit; it looks something like this:
    * { min: wrapLimitRange_min, max: wrapLimitRange_max }
    **/
  def getWrapLimitRange(): js.Any = js.native
  def highlight(text: java.lang.String): scala.Unit = js.native
  /**
    * Indents all the rows, from `startRow` to `endRow` (inclusive), by prefixing each row with the token in `indentString`.
    * If `indentString` contains the `'\t'` character, it's replaced by whatever is defined by [[EditSession.getTabString `getTabString()`]].
    * @param startRow Starting row
    * @param endRow Ending row
    * @param indentString The indent token
    **/
  def indentRows(startRow: scala.Double, endRow: scala.Double, indentString: java.lang.String): scala.Unit = js.native
  /**
    * Inserts a block of `text` and the indicated `position`.
    * @param position The position {row, column} to start inserting at
    * @param text A chunk of text to insert
    **/
  def insert(position: Position, text: java.lang.String): js.Any = js.native
  /**
    * Returns `true` if the character at the position is a soft tab.
    * @param position The position to check
    **/
  def isTabStop(position: js.Any): scala.Boolean = js.native
  /**
    * Shifts all the lines in the document down one, starting from `firstRow` and ending at `lastRow`.
    * @param firstRow The starting row to move down
    * @param lastRow The final row to move down
    **/
  def moveLinesDown(firstRow: scala.Double, lastRow: scala.Double): scala.Double = js.native
  /**
    * Shifts all the lines in the document up one, starting from `firstRow` and ending at `lastRow`.
    * @param firstRow The starting row to move up
    * @param lastRow The final row to move up
    **/
  def moveLinesUp(firstRow: scala.Double, lastRow: scala.Double): scala.Double = js.native
  /**
    * Moves a range of text from the given range to the given position. `toPosition` is an object that looks like this:
    * ```json
    * { row: newRowLocation, column: newColumnLocation }
    * ```
    * @param fromRange The range of text you want moved within the document
    * @param toPosition The location (row and column) where you want to move the text to
    **/
  def moveText(fromRange: Range, toPosition: js.Any): Range = js.native
  def on(event: java.lang.String, fn: js.Function1[/* e */ js.Any, _]): scala.Unit = js.native
  /**
    * Reloads all the tokens on the current session. This function calls [[BackgroundTokenizer.start `BackgroundTokenizer.start ()`]] to all the rows; it also emits the `'tokenizerUpdate'` event.
    **/
  def onReloadTokenizer(): scala.Unit = js.native
  /**
    * Outdents all the rows defined by the `start` and `end` properties of `range`.
    * @param range A range of rows
    **/
  def outdentRows(range: Range): scala.Unit = js.native
  /**
    * Re-implements a previously undone change to your document.
    * @param deltas An array of previous changes
    * @param dontSelect {:dontSelect}
    **/
  def redoChanges(deltas: js.Array[_], dontSelect: scala.Boolean): Range = js.native
  /**
    * Removes the `range` from the document.
    * @param range A specified Range to remove
    **/
  def remove(range: Range): js.Any = js.native
  def removeFold(arg: js.Any): scala.Unit = js.native
  /**
    * Removes `className` from the `row`.
    * @param row The row number
    * @param className The class to add
    **/
  def removeGutterDecoration(row: scala.Double, className: java.lang.String): scala.Unit = js.native
  /**
    * Removes the marker with the specified ID. If this marker was in front, the `'changeFrontMarker'` event is emitted. If the marker was in the back, the `'changeBackMarker'` event is emitted.
    * @param markerId A number representing a marker
    **/
  def removeMarker(markerId: scala.Double): scala.Unit = js.native
  /**
    * Replaces a range in the document with the new `text`.
    * @param range A specified Range to replace
    * @param text The new text to use as a replacement
    **/
  def replace(range: Range, text: java.lang.String): js.Any = js.native
  def screenToDocumentColumn(row: scala.Double, column: scala.Double): scala.Unit = js.native
  /**
    * Converts characters coordinates on the screen to characters coordinates within the document. [This takes into account code folding, word wrap, tab size, and any other visual modifications.]{: #conversionConsiderations}
    * @param screenRow The screen row to check
    * @param screenColumn The screen column to check
    **/
  def screenToDocumentPosition(screenRow: scala.Double, screenColumn: scala.Double): js.Any = js.native
  /**
    * Sets annotations for the `EditSession`. This functions emits the `'changeAnnotation'` event.
    * @param annotations A list of annotations
    **/
  def setAnnotations(annotations: js.Array[Annotation]): scala.Unit = js.native
  /**
    * Sets a breakpoint on the row number given by `rows`. This function also emites the `'changeBreakpoint'` event.
    * @param row A row index
    * @param className Class of the breakpoint
    **/
  def setBreakpoint(row: scala.Double, className: java.lang.String): scala.Unit = js.native
  /**
    * Sets a breakpoint on every row number given by `rows`. This function also emites the `'changeBreakpoint'` event.
    * @param rows An array of row indices
    **/
  def setBreakpoints(rows: js.Array[_]): scala.Unit = js.native
  /**
    * Sets the `EditSession` to point to a new `Document`. If a `BackgroundTokenizer` exists, it also points to `doc`.
    * @param doc The new `Document` to use
    **/
  def setDocument(doc: Document): scala.Unit = js.native
  def setMode(mode: java.lang.String): scala.Unit = js.native
  /**
    * {:Document.setNewLineMode.desc}
    * @param newLineMode {:Document.setNewLineMode.param}
    **/
  def setNewLineMode(newLineMode: java.lang.String): scala.Unit = js.native
  /**
    * Pass in `true` to enable overwrites in your session, or `false` to disable.
    * If overwrites is enabled, any text you enter will type over any text after it. If the value of `overwrite` changes, this function also emites the `changeOverwrite` event.
    * @param overwrite Defines wheter or not to set overwrites
    **/
  def setOverwrite(overwrite: scala.Boolean): scala.Unit = js.native
  /**
    * [Sets the value of the distance between the left of the editor and the leftmost part of the visible content.]{: #EditSession.setScrollLeft}
    **/
  def setScrollLeft(): scala.Unit = js.native
  /**
    * This function sets the scroll top value. It also emits the `'changeScrollTop'` event.
    * @param scrollTop The new scroll top value
    **/
  def setScrollTop(scrollTop: scala.Double): scala.Unit = js.native
  /**
    * Set the number of spaces that define a soft tab; for example, passing in `4` transforms the soft tabs to be equivalent to four spaces. This function also emits the `changeTabSize` event.
    * @param tabSize The new tab size
    **/
  def setTabSize(tabSize: scala.Double): scala.Unit = js.native
  /**
    * Sets the undo manager.
    * @param undoManager The new undo manager
    **/
  def setUndoManager(undoManager: UndoManager): scala.Unit = js.native
  /**
    * Enables or disables highlighting of the range where an undo occured.
    * @param enable If `true`, selects the range of the reinserted change
    **/
  def setUndoSelect(enable: scala.Boolean): scala.Unit = js.native
  /**
    * Pass `true` to enable the use of soft tabs. Soft tabs means you're using spaces instead of the tab character (`'\t'`).
    * @param useSoftTabs Value indicating whether or not to use soft tabs
    **/
  def setUseSoftTabs(useSoftTabs: scala.Boolean): scala.Unit = js.native
  /**
    * Identifies if you want to use a worker for the `EditSession`.
    * @param useWorker Set to `true` to use a worker
    **/
  def setUseWorker(useWorker: scala.Boolean): scala.Unit = js.native
  /**
    * Sets whether or not line wrapping is enabled. If `useWrapMode` is different than the current value, the `'changeWrapMode'` event is emitted.
    * @param useWrapMode Enable (or disable) wrap mode
    **/
  def setUseWrapMode(useWrapMode: scala.Boolean): scala.Unit = js.native
  /**
    * Sets the session text.
    * @param text The new text to place
    **/
  def setValue(text: java.lang.String): scala.Unit = js.native
  /**
    * Sets the boundaries of wrap. Either value can be `null` to have an unconstrained wrap, or, they can be the same number to pin the limit. If the wrap limits for `min` or `max` are different, this method also emits the `'changeWrapMode'` event.
    * @param min The minimum wrap value (the left side wrap)
    * @param max The maximum wrap value (the right side wrap)
    **/
  def setWrapLimitRange(min: scala.Double, max: scala.Double): scala.Unit = js.native
  /**
    * Sets the value of overwrite to the opposite of whatever it currently is.
    **/
  def toggleOverwrite(): scala.Unit = js.native
  /**
    * Reverts previous changes to your document.
    * @param deltas An array of previous changes
    * @param dontSelect [If `true`, doesn't select the range of where the change occured]{: #dontSelect}
    **/
  def undoChanges(deltas: js.Array[_], dontSelect: scala.Boolean): Range = js.native
  def unfold(arg1: js.Any, arg2: scala.Boolean): scala.Unit = js.native
}

