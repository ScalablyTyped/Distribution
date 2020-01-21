package typings.brace.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.brace.braceStrings.change
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Editor extends js.Object {
  /**
    * Get rid of console warning by setting this to Infinity
    **/
  @JSName("$blockScrolling")
  var $blockScrolling: Double = js.native
  var commands: CommandManager = js.native
  var container: HTMLElement = js.native
  var inMultiSelectMode: Boolean = js.native
  var keyBinding: KeyBinding = js.native
  var renderer: VirtualRenderer = js.native
  var selection: Selection = js.native
  var session: IEditSession = js.native
  def addEventListener(ev: String, callback: js.Function): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_change(ev: change, callback: js.Function1[/* ev */ EditorChangeEvent, _]): Unit = js.native
  /**
    * Indents the current line.
    **/
  def blockIndent(): Unit = js.native
  /**
    * Outdents the current line.
    **/
  def blockOutdent(): Unit = js.native
  def blockOutdent(arg: String): Unit = js.native
  /**
    * Blurs the current `textInput`.
    **/
  def blur(): Unit = js.native
  /**
    * Attempts to center the current selection on the screen.
    **/
  def centerSelection(): Unit = js.native
  /**
    * {:Selection.clearSelection}
    **/
  def clearSelection(): Unit = js.native
  /**
    * Copies all the selected lines down one row.
    **/
  def copyLinesDown(): Double = js.native
  /**
    * Copies all the selected lines up one row.
    **/
  def copyLinesUp(): Double = js.native
  /**
    * Cleans up the entire editor.
    **/
  def destroy(): Unit = js.native
  def execCommand(command: String): Unit = js.native
  def execCommand(command: String, args: js.Any): Unit = js.native
  /**
    * Attempts to find `needle` within the document. For more information on `options`, see [[Search `Search`]].
    * @param needle The text to search for (optional)
    * @param options An object defining various search properties
    * @param animate If `true` animate scrolling
    **/
  def find(needle: String): Unit = js.native
  def find(needle: String, options: js.Any): Unit = js.native
  def find(needle: String, options: js.Any, animate: Boolean): Unit = js.native
  /**
    * Performs another search for `needle` in the document. For more information on `options`, see [[Search `Search`]].
    * @param options search options
    * @param animate If `true` animate scrolling
    **/
  def findNext(): Unit = js.native
  def findNext(options: js.Any): Unit = js.native
  def findNext(options: js.Any, animate: Boolean): Unit = js.native
  /**
    * Performs a search for `needle` backwards. For more information on `options`, see [[Search `Search`]].
    * @param options search options
    * @param animate If `true` animate scrolling
    **/
  def findPrevious(): Unit = js.native
  def findPrevious(options: js.Any): Unit = js.native
  def findPrevious(options: js.Any, animate: Boolean): Unit = js.native
  /**
    * Brings the current `textInput` into focus.
    **/
  def focus(): Unit = js.native
  /**
    * Returns `true` if the behaviors are currently enabled. {:BehaviorsDef}
    **/
  def getBehavioursEnabled(): Boolean = js.native
  /**
    * Returns the string of text currently highlighted.
    **/
  def getCopyText(): String = js.native
  /**
    * Gets the current position of the cursor.
    **/
  def getCursorPosition(): Position = js.native
  /**
    * Returns the screen position of the cursor.
    **/
  def getCursorPositionScreen(): Double = js.native
  /**
    * Returns the current mouse drag delay.
    **/
  def getDragDelay(): Double = js.native
  /**
    * {:VirtualRenderer.getFirstVisibleRow}
    **/
  def getFirstVisibleRow(): Double = js.native
  /**
    * Returns `true` if current lines are always highlighted.
    **/
  def getHighlightActiveLine(): Unit = js.native
  /**
    * Returns `true` if currently highlighted words are to be highlighted.
    **/
  def getHighlightSelectedWord(): Boolean = js.native
  /**
    * Returns the keyboard handler, such as "vim" or "windows".
    **/
  def getKeyboardHandler(): String = js.native
  /**
    * {:Search.getOptions} For more information on `options`, see [[Search `Search`]].
    **/
  def getLastSearchOptions(): js.Any = js.native
  /**
    * {:VirtualRenderer.getLastVisibleRow}
    **/
  def getLastVisibleRow(): Double = js.native
  /**
    * Works like [[EditSession.getTokenAt]], except it returns a number.
    **/
  def getNumberAt(): Double = js.native
  /**
    * Get a Configuration Option
    **/
  def getOption(name: js.Any): js.Any = js.native
  /**
    * Get Configuration Options
    **/
  def getOptions(): js.Any = js.native
  /**
    * Returns `true` if overwrites are enabled; `false` otherwise.
    **/
  def getOverwrite(): Boolean = js.native
  /**
    * Returns the column number of where the print margin is.
    **/
  def getPrintMarginColumn(): Double = js.native
  /**
    * Returns `true` if the editor is set to read-only mode.
    **/
  def getReadOnly(): Boolean = js.native
  /**
    * Returns the value indicating how fast the mouse scroll speed is (in milliseconds).
    **/
  def getScrollSpeed(): Double = js.native
  /**
    * Returns the currently highlighted selection.
    **/
  def getSelection(): Selection = js.native
  /**
    * {:Selection.getRange}
    **/
  def getSelectionRange(): Range = js.native
  /**
    * Returns the current selection style.
    **/
  def getSelectionStyle(): String = js.native
  /**
    * Returns the current session being used.
    **/
  def getSession(): IEditSession = js.native
  /**
    * Returns `true` if the fold widgets are shown.
    **/
  def getShowFoldWidgets(): Unit = js.native
  /**
    * Returns `true` if invisible characters are being shown.
    **/
  def getShowInvisibles(): Boolean = js.native
  /**
    * Returns `true` if the print margin is being shown.
    **/
  def getShowPrintMargin(): Boolean = js.native
  /**
    * {:VirtualRenderer.getTheme}
    **/
  def getTheme(): String = js.native
  /**
    * Returns the current session's content.
    **/
  def getValue(): String = js.native
  /**
    * Returns `true` if the wrapping behaviors are currently enabled.
    **/
  def getWrapBehavioursEnabled(): Unit = js.native
  /**
    * Moves the cursor to the specified line number, and also into the indiciated column.
    * @param lineNumber The line number to go to
    * @param column A column number to go to
    * @param animate If `true` animates scolling
    **/
  def gotoLine(lineNumber: Double): Unit = js.native
  def gotoLine(lineNumber: Double, column: Double): Unit = js.native
  def gotoLine(lineNumber: Double, column: Double, animate: Boolean): Unit = js.native
  /**
    * Shifts the document to wherever "page down" is, as well as moving the cursor position.
    **/
  def gotoPageDown(): Unit = js.native
  /**
    * Shifts the document to wherever "page up" is, as well as moving the cursor position.
    **/
  def gotoPageUp(): Unit = js.native
  /**
    * Inserts an indentation into the current cursor position or indents the selected lines.
    **/
  def indent(): Unit = js.native
  /**
    * Inserts `text` into wherever the cursor is pointing.
    * @param text The new text to add
    **/
  def insert(text: String): Unit = js.native
  /**
    * Returns `true` if the current `textInput` is in focus.
    **/
  def isFocused(): Unit = js.native
  /**
    * Indicates if the entire row is currently visible on the screen.
    * @param row The row to check
    **/
  def isRowFullyVisible(row: Double): Boolean = js.native
  /**
    * Indicates if the row is currently visible on the screen.
    * @param row The row to check
    **/
  def isRowVisible(row: Double): Boolean = js.native
  /**
    * Moves the cursor's row and column to the next matching bracket.
    **/
  def jumpToMatching(): Unit = js.native
  /**
    * If the character before the cursor is a number, this functions changes its value by `amount`.
    * @param amount The value to change the numeral by (can be negative to decrease value)
    **/
  def modifyNumber(amount: Double): Unit = js.native
  /**
    * Moves the cursor to the specified row and column. Note that this does not de-select the current selection.
    * @param row The new row number
    * @param column The new column number
    **/
  def moveCursorTo(row: Double): Unit = js.native
  def moveCursorTo(row: Double, column: Double): Unit = js.native
  def moveCursorTo(row: Double, column: Double, animate: Boolean): Unit = js.native
  /**
    * Moves the cursor to the position indicated by `pos.row` and `pos.column`.
    * @param position An object with two properties, row and column
    **/
  def moveCursorToPosition(position: Position): Unit = js.native
  /**
    * Shifts all the selected lines down one row.
    **/
  def moveLinesDown(): Double = js.native
  /**
    * Shifts all the selected lines up one row.
    **/
  def moveLinesUp(): Double = js.native
  /**
    * Moves a range of text from the given range to the given position. `toPosition` is an object that looks like this:
    * ```json
    * { row: newRowLocation, column: newColumnLocation }
    * ```
    * @param fromRange The range of text you want moved within the document
    * @param toPosition The location (row and column) where you want to move the text to
    **/
  def moveText(fromRange: Range, toPosition: js.Any): Range = js.native
  /**
    * Moves the cursor down in the document the specified number of times. Note that this does de-select the current selection.
    * @param times The number of times to change navigation
    **/
  def navigateDown(): Unit = js.native
  def navigateDown(times: Double): Unit = js.native
  /**
    * Moves the cursor to the end of the current file. Note that this does de-select the current selection.
    **/
  def navigateFileEnd(): Unit = js.native
  /**
    * Moves the cursor to the start of the current file. Note that this does de-select the current selection.
    **/
  def navigateFileStart(): Unit = js.native
  /**
    * Moves the cursor left in the document the specified number of times. Note that this does de-select the current selection.
    * @param times The number of times to change navigation
    **/
  def navigateLeft(): Unit = js.native
  def navigateLeft(times: Double): Unit = js.native
  /**
    * Moves the cursor to the end of the current line. Note that this does de-select the current selection.
    **/
  def navigateLineEnd(): Unit = js.native
  /**
    * Moves the cursor to the start of the current line. Note that this does de-select the current selection.
    **/
  def navigateLineStart(): Unit = js.native
  /**
    * Moves the cursor right in the document the specified number of times. Note that this does de-select the current selection.
    * @param times The number of times to change navigation
    **/
  def navigateRight(times: Double): Unit = js.native
  /**
    * Moves the cursor to the specified row and column. Note that this does de-select the current selection.
    * @param row The new row number
    * @param column The new column number
    **/
  def navigateTo(row: Double, column: Double): Unit = js.native
  /**
    * Moves the cursor up in the document the specified number of times. Note that this does de-select the current selection.
    * @param times The number of times to change navigation
    **/
  def navigateUp(): Unit = js.native
  def navigateUp(times: Double): Unit = js.native
  /**
    * Moves the cursor to the word immediately to the left of the current position. Note that this does de-select the current selection.
    **/
  def navigateWordLeft(): Unit = js.native
  /**
    * Moves the cursor to the word immediately to the right of the current position. Note that this does de-select the current selection.
    **/
  def navigateWordRight(): Unit = js.native
  def off(ev: String, callback: js.Function): Unit = js.native
  def on(ev: String, callback: js.Function1[/* e */ js.Any, _]): Unit = js.native
  /**
    * Emitted once the editor has been blurred.
    **/
  def onBlur(): Unit = js.native
  def onChangeMode(): Unit = js.native
  def onChangeMode(e: js.Any): Unit = js.native
  def onCommandKey(e: js.Any, hashId: js.Any, keyCode: js.Any): Unit = js.native
  /**
    * Called whenever a text "copy" happens.
    **/
  def onCopy(): Unit = js.native
  /**
    * Emitted when the selection changes.
    **/
  def onCursorChange(): Unit = js.native
  /**
    * Called whenever a text "cut" happens.
    **/
  def onCut(): Unit = js.native
  /**
    * Emitted whenever the document is changed.
    * @param e Contains a single property, `data`, which has the delta of changes
    **/
  def onDocumentChange(e: js.Any): Unit = js.native
  /**
    * Emitted once the editor comes into focus.
    **/
  def onFocus(): Unit = js.native
  /**
    * Called whenever a text "paste" happens.
    * @param text The pasted text
    **/
  def onPaste(text: String): Unit = js.native
  def onSelectionChange(e: js.Any): Unit = js.native
  def onTextInput(text: String): Unit = js.native
  /**
    * {:UndoManager.redo}
    **/
  def redo(): Unit = js.native
  /**
    * Removes words of text from the editor. A "word" is defined as a string of characters bookended by whitespace.
    * @param dir The direction of the deletion to occur, either "left" or "right"
    **/
  def remove(dir: String): Unit = js.native
  def removeEventListener(ev: String, callback: js.Function): Unit = js.native
  /**
    * Removes all the lines in the current selection
    **/
  def removeLines(): Unit = js.native
  def removeListener(ev: String, callback: js.Function): Unit = js.native
  /**
    * Removes all the words to the right of the current selection, until the end of the line.
    **/
  def removeToLineEnd(): Unit = js.native
  /**
    * Removes all the words to the left of the current selection, until the start of the line.
    **/
  def removeToLineStart(): Unit = js.native
  /**
    * Removes the word directly to the left of the current selection.
    **/
  def removeWordLeft(): Unit = js.native
  /**
    * Removes the word directly to the right of the current selection.
    **/
  def removeWordRight(): Unit = js.native
  /**
    * Replaces the first occurance of `options.needle` with the value in `replacement`.
    * @param replacement The text to replace with
    * @param options The [[Search `Search`]] options to use
    **/
  def replace(replacement: String): Unit = js.native
  def replace(replacement: String, options: js.Any): Unit = js.native
  /**
    * Replaces all occurances of `options.needle` with the value in `replacement`.
    * @param replacement The text to replace with
    * @param options The [[Search `Search`]] options to use
    **/
  def replaceAll(replacement: String): Unit = js.native
  def replaceAll(replacement: String, options: js.Any): Unit = js.native
  /**
    * {:VirtualRenderer.onResize}
    * @param force If `true`, recomputes the size, even if the height and width haven't changed
    **/
  def resize(): Unit = js.native
  def resize(force: Boolean): Unit = js.native
  /**
    * Scrolls the document to wherever "page down" is, without changing the cursor position.
    **/
  def scrollPageDown(): Unit = js.native
  /**
    * Scrolls the document to wherever "page up" is, without changing the cursor position.
    **/
  def scrollPageUp(): Unit = js.native
  /**
    * Scrolls to a line. If `center` is `true`, it puts the line in middle of screen (or attempts to).
    * @param line The line to scroll to
    * @param center If `true`
    * @param animate If `true` animates scrolling
    * @param callback Function to be called when the animation has finished
    **/
  def scrollToLine(line: Double, center: Boolean, animate: Boolean, callback: js.Function): Unit = js.native
  /**
    * Moves the editor to the specified row.
    **/
  def scrollToRow(): Unit = js.native
  /**
    * Selects all the text in editor.
    **/
  def selectAll(): Unit = js.native
  def selectMoreLines(n: Double): Unit = js.native
  /**
    * Selects the text from the current position of the document until where a "page down" finishes.
    **/
  def selectPageDown(): Unit = js.native
  /**
    * Selects the text from the current position of the document until where a "page up" finishes.
    **/
  def selectPageUp(): Unit = js.native
  /**
    * Specifies whether to use behaviors or not. ["Behaviors" in this case is the auto-pairing of special characters, like quotation marks, parenthesis, or brackets.]{: #BehaviorsDef}
    * @param enabled Enables or disables behaviors
    **/
  def setBehavioursEnabled(enabled: Boolean): Unit = js.native
  /**
    * Sets the delay (in milliseconds) of the mouse drag.
    * @param dragDelay A value indicating the new delay
    **/
  def setDragDelay(dragDelay: Double): Unit = js.native
  /**
    * Set a new font size (in pixels) for the editor text.
    * @param size A font size ( _e.g._ "12px")
    **/
  def setFontSize(size: String): Unit = js.native
  /**
    * Determines whether or not the current line should be highlighted.
    * @param shouldHighlight Set to `true` to highlight the current line
    **/
  def setHighlightActiveLine(shouldHighlight: Boolean): Unit = js.native
  /**
    * Determines if the currently selected word should be highlighted.
    * @param shouldHighlight Set to `true` to highlight the currently selected word
    **/
  def setHighlightSelectedWord(shouldHighlight: Boolean): Unit = js.native
  /**
    * Sets a new key handler, such as "vim" or "windows".
    * @param keyboardHandler The new key handler
    **/
  def setKeyboardHandler(keyboardHandler: String): Unit = js.native
  /**
    * Sets a Configuration Option
    **/
  def setOption(optionName: js.Any, optionValue: js.Any): Unit = js.native
  /**
    * Sets Configuration Options
    **/
  def setOptions(keyValueTuples: js.Any): Unit = js.native
  /**
    * Pass in `true` to enable overwrites in your session, or `false` to disable. If overwrites is enabled, any text you enter will type over any text after it. If the value of `overwrite` changes, this function also emites the `changeOverwrite` event.
    * @param overwrite Defines wheter or not to set overwrites
    **/
  def setOverwrite(overwrite: Boolean): Unit = js.native
  /**
    * Sets the column defining where the print margin should be.
    * @param showPrintMargin Specifies the new print margin
    **/
  def setPrintMarginColumn(showPrintMargin: Double): Unit = js.native
  /**
    * If `readOnly` is true, then the editor is set to read-only mode, and none of the content can change.
    * @param readOnly Specifies whether the editor can be modified or not
    **/
  def setReadOnly(readOnly: Boolean): Unit = js.native
  /**
    * Sets how fast the mouse scrolling should do.
    * @param speed A value indicating the new speed (in milliseconds)
    **/
  def setScrollSpeed(speed: Double): Unit = js.native
  /**
    * Indicates how selections should occur.
    * By default, selections are set to "line". There are no other styles at the moment,
    * although this code change in the future.
    * This function also emits the `'changeSelectionStyle'` event.
    * @param style The new selection style
    **/
  def setSelectionStyle(style: String): Unit = js.native
  /**
    * Sets a new editsession to use. This method also emits the `'changeSession'` event.
    * @param session The new session to use
    **/
  def setSession(session: IEditSession): Unit = js.native
  /**
    * Indicates whether the fold widgets are shown or not.
    * @param show Specifies whether the fold widgets are shown
    **/
  def setShowFoldWidgets(show: Boolean): Unit = js.native
  /**
    * If `showInvisibiles` is set to `true`, invisible characters&mdash;like spaces or new lines&mdash;are show in the editor.
    * @param showInvisibles Specifies whether or not to show invisible characters
    **/
  def setShowInvisibles(showInvisibles: Boolean): Unit = js.native
  /**
    * If `showPrintMargin` is set to `true`, the print margin is shown in the editor.
    * @param showPrintMargin Specifies whether or not to show the print margin
    **/
  def setShowPrintMargin(showPrintMargin: Boolean): Unit = js.native
  /**
    * {:VirtualRenderer.setStyle}
    * @param style A class name
    **/
  def setStyle(style: String): Unit = js.native
  /**
    * {:VirtualRenderer.setTheme}
    * @param theme The path to a theme
    **/
  def setTheme(theme: String): Unit = js.native
  /**
    * Sets the current document to `val`.
    * @param val The new value to set for the document
    * @param cursorPos Where to set the new value. `undefined` or 0 is selectAll, -1 is at the document start, and 1 is at the end
    **/
  def setValue(`val`: String): String = js.native
  def setValue(`val`: String, cursorPos: Double): String = js.native
  /**
    * Specifies whether to use wrapping behaviors or not, i.e. automatically wrapping the selection with characters such as brackets
    * when such a character is typed in.
    * @param enabled Enables or disables wrapping behaviors
    **/
  def setWrapBehavioursEnabled(enabled: Boolean): Unit = js.native
  /**
    * Splits the line at the current selection (by inserting an `'\n'`).
    **/
  def splitLine(): Unit = js.native
  /**
    * Converts the current selection entirely into lowercase.
    **/
  def toLowerCase(): Unit = js.native
  /**
    * Converts the current selection entirely into uppercase.
    **/
  def toUpperCase(): Unit = js.native
  /**
    * Given the currently selected range, this function either comments all the lines, or uncomments all of them.
    **/
  def toggleCommentLines(): Unit = js.native
  /**
    * Sets the value of overwrite to the opposite of whatever it currently is.
    **/
  def toggleOverwrite(): Unit = js.native
  /**
    * Transposes current line.
    **/
  def transposeLetters(): Unit = js.native
  /**
    * {:UndoManager.undo}
    **/
  def undo(): Unit = js.native
  /**
    * {:VirtualRenderer.unsetStyle}
    **/
  def unsetStyle(): Unit = js.native
}

@JSImport("brace", "Editor")
@js.native
object Editor
  extends /**
  * Creates a new `Editor` object.
  * @param renderer Associated `VirtualRenderer` that draws everything
  * @param session The `EditSession` to refer to
  **/
Instantiable1[/* renderer */ VirtualRenderer, Editor]
     with Instantiable2[/* renderer */ VirtualRenderer, /* session */ IEditSession, Editor]

