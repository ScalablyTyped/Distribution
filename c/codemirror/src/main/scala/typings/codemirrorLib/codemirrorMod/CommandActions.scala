package typings
package codemirrorLib.codemirrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandActions extends js.Object {
  def closeTag(cm: Editor): scala.Unit
  /** If something is selected, indent it by one indent unit. If nothing is selected, insert a tab character. */
  def defaultTabTab(cm: Editor): scala.Unit
  /** Delete the character after the cursor. */
  def delCharAfter(cm: Editor): scala.Unit
  /** Delete the character before the cursor. */
  def delCharBefore(cm: Editor): scala.Unit
  /** Delete to the start of the group after the cursor. */
  def delGroupAfter(cm: Editor): scala.Unit
  /** Delete to the left of the group before the cursor. */
  def delGroupBefore(cm: Editor): scala.Unit
  /** Delete the part of the line before the cursor. */
  def delLineLeft(cm: Editor): scala.Unit
  /** Delete up to the end of the word after the cursor. */
  def delWordAfter(cm: Editor): scala.Unit
  /** Delete up to the start of the word before the cursor. */
  def delWordBefore(cm: Editor): scala.Unit
  /** Delete the part of the line from the left side of the visual line the cursor is on to the cursor. */
  def delWrappedLineLeft(cm: Editor): scala.Unit
  /** Delete the part of the line from the cursor to the right side of the visual line the cursor is on. */
  def delWrappedLineRight(cm: Editor): scala.Unit
  /** Deletes the whole line under the cursor, including newline at the end. */
  def deleteLine(cm: Editor): scala.Unit
  /** Move the cursor one character left, going to the previous line when hitting the start of line. */
  def goCharLeft(cm: Editor): scala.Unit
  /** Move the cursor one character right, going to the next line when hitting the end of line. */
  def goCharRight(cm: Editor): scala.Unit
  /** Move the cursor one character left, but don't cross line boundaries. */
  def goColumnLeft(cm: Editor): scala.Unit
  /** Move the cursor one character right, don't cross line boundaries. */
  def goColumnRight(cm: Editor): scala.Unit
  /** Move the cursor to the end of the document. */
  def goDocEnd(cm: Editor): scala.Unit
  /** Move the cursor to the start of the document. */
  def goDocStart(cm: Editor): scala.Unit
  /** Move to the left of the group before the cursor. A group is a stretch of word characters, a stretch of punctuation characters, a newline, or a stretch of more than one whitespace character. */
  def goGroupLeft(cm: Editor): scala.Unit
  /** Move to the right of the group after the cursor (see above). */
  def goGroupRight(cm: Editor): scala.Unit
  /** Move down one line. */
  def goLineDown(cm: Editor): scala.Unit
  /** Move the cursor to the end of the line. */
  def goLineEnd(cm: Editor): scala.Unit
  /** Move the cursor to the left side of the visual line it is on. If this line is wrapped, that may not be the start of the line. */
  def goLineLeft(cm: Editor): scala.Unit
  /** Move the cursor to the left side of the visual line it is on. If that takes it to the start of the line, behave like goLineStartSmart. */
  def goLineLeftSmart(cm: Editor): scala.Unit
  /** Move the cursor to the right side of the visual line it is on. */
  def goLineRight(cm: Editor): scala.Unit
  /** Move the cursor to the start of the line. */
  def goLineStart(cm: Editor): scala.Unit
  /** Move to the start of the text on the line, or if we are already there, to the actual start of the line (including whitespace). */
  def goLineStartSmart(cm: Editor): scala.Unit
  /** Move the cursor up one line. */
  def goLineUp(cm: Editor): scala.Unit
  /** Move the cursor down one screen, and scroll down by the same distance. */
  def goPageDown(cm: Editor): scala.Unit
  /** Move the cursor up one screen, and scroll up by the same distance. */
  def goPageUp(cm: Editor): scala.Unit
  /** Move the cursor to the start of the previous word. */
  def goWordLeft(cm: Editor): scala.Unit
  /** Move the cursor to the end of the next word. */
  def goWordRight(cm: Editor): scala.Unit
  /** Auto-indent the current line or selection. */
  def indentAuto(cm: Editor): scala.Unit
  /** Dedent the current line or selection by one indent unit. */
  def indentLess(cm: Editor): scala.Unit
  /** Indent the current line or selection by one indent unit. */
  def indentMore(cm: Editor): scala.Unit
  /** Insert the amount of spaces that match the width a tab at the cursor position would have. */
  def insertSoftTab(cm: Editor): scala.Unit
  /** Insert a tab character at the cursor. */
  def insertTab(cm: Editor): scala.Unit
  /** Emacs-style line killing. Deletes the part of the line after the cursor. If that consists only of whitespace, the newline at the end of the line is also deleted. */
  def killLine(cm: Editor): scala.Unit
  /** Insert a newline and auto-indent the new line. */
  def newlineAndIndent(cm: Editor): scala.Unit
  /** Redo the last undone change. */
  def redo(cm: Editor): scala.Unit
  /** Redo the last change to the selection, or the last text change if no selection changes remain. */
  def redoSelection(cm: Editor): scala.Unit
  /** Select the whole content of the editor. */
  def selectAll(cm: Editor): scala.Unit
  /** When multiple selections are present, this deselects all but the primary selection. */
  def singleSelection(cm: Editor): scala.Unit
  /**
    * You can bind a key to in order to jump to the tag matching the one under the cursor.
    */
  def toMatchingTag(cm: Editor): scala.Unit
  /** Flip the overwrite flag. */
  def toggleOverwrite(cm: Editor): scala.Unit
  /** Swap the characters before and after the cursor. */
  def transposeChars(cm: Editor): scala.Unit
  /** Undo the last change. Note that, because browsers still don't make it possible for scripts to react to or customize the context menu, selecting undo (or redo) from the context menu in a CodeMirror instance does not work. */
  def undo(cm: Editor): scala.Unit
  /** Undo the last change to the selection, or if there are no selection-only changes at the top of the history, undo the last change. */
  def undoSelection(cm: Editor): scala.Unit
}

object CommandActions {
  @scala.inline
  def apply(
    closeTag: Editor => scala.Unit,
    defaultTabTab: Editor => scala.Unit,
    delCharAfter: Editor => scala.Unit,
    delCharBefore: Editor => scala.Unit,
    delGroupAfter: Editor => scala.Unit,
    delGroupBefore: Editor => scala.Unit,
    delLineLeft: Editor => scala.Unit,
    delWordAfter: Editor => scala.Unit,
    delWordBefore: Editor => scala.Unit,
    delWrappedLineLeft: Editor => scala.Unit,
    delWrappedLineRight: Editor => scala.Unit,
    deleteLine: Editor => scala.Unit,
    goCharLeft: Editor => scala.Unit,
    goCharRight: Editor => scala.Unit,
    goColumnLeft: Editor => scala.Unit,
    goColumnRight: Editor => scala.Unit,
    goDocEnd: Editor => scala.Unit,
    goDocStart: Editor => scala.Unit,
    goGroupLeft: Editor => scala.Unit,
    goGroupRight: Editor => scala.Unit,
    goLineDown: Editor => scala.Unit,
    goLineEnd: Editor => scala.Unit,
    goLineLeft: Editor => scala.Unit,
    goLineLeftSmart: Editor => scala.Unit,
    goLineRight: Editor => scala.Unit,
    goLineStart: Editor => scala.Unit,
    goLineStartSmart: Editor => scala.Unit,
    goLineUp: Editor => scala.Unit,
    goPageDown: Editor => scala.Unit,
    goPageUp: Editor => scala.Unit,
    goWordLeft: Editor => scala.Unit,
    goWordRight: Editor => scala.Unit,
    indentAuto: Editor => scala.Unit,
    indentLess: Editor => scala.Unit,
    indentMore: Editor => scala.Unit,
    insertSoftTab: Editor => scala.Unit,
    insertTab: Editor => scala.Unit,
    killLine: Editor => scala.Unit,
    newlineAndIndent: Editor => scala.Unit,
    redo: Editor => scala.Unit,
    redoSelection: Editor => scala.Unit,
    selectAll: Editor => scala.Unit,
    singleSelection: Editor => scala.Unit,
    toMatchingTag: Editor => scala.Unit,
    toggleOverwrite: Editor => scala.Unit,
    transposeChars: Editor => scala.Unit,
    undo: Editor => scala.Unit,
    undoSelection: Editor => scala.Unit
  ): CommandActions = {
    val __obj = js.Dynamic.literal(closeTag = js.Any.fromFunction1(closeTag), defaultTabTab = js.Any.fromFunction1(defaultTabTab), delCharAfter = js.Any.fromFunction1(delCharAfter), delCharBefore = js.Any.fromFunction1(delCharBefore), delGroupAfter = js.Any.fromFunction1(delGroupAfter), delGroupBefore = js.Any.fromFunction1(delGroupBefore), delLineLeft = js.Any.fromFunction1(delLineLeft), delWordAfter = js.Any.fromFunction1(delWordAfter), delWordBefore = js.Any.fromFunction1(delWordBefore), delWrappedLineLeft = js.Any.fromFunction1(delWrappedLineLeft), delWrappedLineRight = js.Any.fromFunction1(delWrappedLineRight), deleteLine = js.Any.fromFunction1(deleteLine), goCharLeft = js.Any.fromFunction1(goCharLeft), goCharRight = js.Any.fromFunction1(goCharRight), goColumnLeft = js.Any.fromFunction1(goColumnLeft), goColumnRight = js.Any.fromFunction1(goColumnRight), goDocEnd = js.Any.fromFunction1(goDocEnd), goDocStart = js.Any.fromFunction1(goDocStart), goGroupLeft = js.Any.fromFunction1(goGroupLeft), goGroupRight = js.Any.fromFunction1(goGroupRight), goLineDown = js.Any.fromFunction1(goLineDown), goLineEnd = js.Any.fromFunction1(goLineEnd), goLineLeft = js.Any.fromFunction1(goLineLeft), goLineLeftSmart = js.Any.fromFunction1(goLineLeftSmart), goLineRight = js.Any.fromFunction1(goLineRight), goLineStart = js.Any.fromFunction1(goLineStart), goLineStartSmart = js.Any.fromFunction1(goLineStartSmart), goLineUp = js.Any.fromFunction1(goLineUp), goPageDown = js.Any.fromFunction1(goPageDown), goPageUp = js.Any.fromFunction1(goPageUp), goWordLeft = js.Any.fromFunction1(goWordLeft), goWordRight = js.Any.fromFunction1(goWordRight), indentAuto = js.Any.fromFunction1(indentAuto), indentLess = js.Any.fromFunction1(indentLess), indentMore = js.Any.fromFunction1(indentMore), insertSoftTab = js.Any.fromFunction1(insertSoftTab), insertTab = js.Any.fromFunction1(insertTab), killLine = js.Any.fromFunction1(killLine), newlineAndIndent = js.Any.fromFunction1(newlineAndIndent), redo = js.Any.fromFunction1(redo), redoSelection = js.Any.fromFunction1(redoSelection), selectAll = js.Any.fromFunction1(selectAll), singleSelection = js.Any.fromFunction1(singleSelection), toMatchingTag = js.Any.fromFunction1(toMatchingTag), toggleOverwrite = js.Any.fromFunction1(toggleOverwrite), transposeChars = js.Any.fromFunction1(transposeChars), undo = js.Any.fromFunction1(undo), undoSelection = js.Any.fromFunction1(undoSelection))
  
    __obj.asInstanceOf[CommandActions]
  }
}

