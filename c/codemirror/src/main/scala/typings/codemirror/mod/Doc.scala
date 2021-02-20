package typings.codemirror.mod

import typings.codemirror.anon.Anchor
import typings.codemirror.anon.Bias
import typings.codemirror.anon.InsertLeft
import typings.codemirror.anon.Redo
import typings.codemirror.anon.SharedHist
import typings.std.HTMLElement
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Doc extends StObject {
  
  /** Adds a line widget, an element shown below a line, spanning the whole of the editor's width, and moving the lines below it downwards.
    line should be either an integer or a line handle, and node should be a DOM node, which will be displayed below the given line.
    options, when given, should be an object that configures the behavior of the widget.
    Note that the widget node will become a descendant of nodes with CodeMirror-specific CSS classes, and those classes might in some cases affect it. */
  def addLineWidget(line: js.Any, node: HTMLElement): LineWidget = js.native
  def addLineWidget(line: js.Any, node: HTMLElement, options: LineWidgetOptions): LineWidget = js.native
  
  /** Returns a number that can later be passed to isClean to test whether any edits were made (and not undone) in the
    meantime. If closeEvent is true, the current history event will be ‘closed’, meaning it can't be combined with further
    changes (rapid typing or deleting events are typically combined).*/
  def changeGeneration(): Double = js.native
  def changeGeneration(closeEvent: Boolean): Double = js.native
  
  /** Clears the editor's undo history. */
  def clearHistory(): Unit = js.native
  
  /** Create an identical copy of the given doc. When copyHistory is true , the history will also be copied.Can not be called directly on an editor. */
  def copy(copyHistory: Boolean): typings.codemirror.mod.Doc = js.native
  
  /** Iterate over the whole document, and call f for each line, passing the line handle.
    This is a faster way to visit a range of line handlers than calling getLineHandle for each of them.
    Note that line handles have a text property containing the line's content (as a string). */
  def eachLine(f: js.Function1[/* line */ LineHandle, Unit]): Unit = js.native
  /** Iterate over the range from start up to (not including) end, and call f for each line, passing the line handle.
    This is a faster way to visit a range of line handlers than calling getLineHandle for each of them.
    Note that line handles have a text property containing the line's content (as a string). */
  def eachLine(start: Double, end: Double, f: js.Function1[/* line */ LineHandle, Unit]): Unit = js.native
  
  /** Similar to setSelection , but will, if shift is held or the extending flag is set,
    move the head of the selection while leaving the anchor at its current place.
    pos2 is optional , and can be passed to ensure a region (for example a word or paragraph) will end up selected
    (in addition to whatever lies between that region and the current anchor). */
  def extendSelection(from: Position): Unit = js.native
  def extendSelection(from: Position, to: Position): Unit = js.native
  
  /** Returns an array of all the bookmarks and marked ranges found between the given positions. */
  def findMarks(from: Position, to: Position): js.Array[TextMarker] = js.native
  
  /** Returns an array of all the bookmarks and marked ranges present at the given position. */
  def findMarksAt(pos: Position): js.Array[TextMarker] = js.native
  
  /** Get the first line of the editor. This will usually be zero but for linked sub-views,
    or documents instantiated with a non-zero first line, it might return other values. */
  def firstLine(): Double = js.native
  
  /** Returns an array containing all marked ranges in the document. */
  def getAllMarks(): js.Array[TextMarker] = js.native
  
  /** start is a an optional string indicating which end of the selection to return.
    It may be "from", "to", "head" (the side of the selection that moves when you press shift+arrow),
    or "anchor" (the fixed side of the selection).Omitting the argument is the same as passing "head". A {line, ch} object will be returned. **/
  def getCursor(): Position = js.native
  def getCursor(start: String): Position = js.native
  
  /** Retrieve the editor associated with a document. May return null. */
  def getEditor(): Editor | Null = js.native
  
  /** Get a(JSON - serializeable) representation of the undo history. */
  def getHistory(): js.Any = js.native
  
  /** Get the content of line n. */
  def getLine(n: Double): String = js.native
  
  /** Fetches the line handle for the given line number. */
  def getLineHandle(num: Double): LineHandle = js.native
  
  /** Given a line handle, returns the current position of that line (or null when it is no longer in the document). */
  def getLineNumber(handle: LineHandle): Double | Null = js.native
  
  /** Gets the mode object for the editor. Note that this is distinct from getOption("mode"), which gives you the mode specification,
    rather than the resolved, instantiated mode object. */
  def getMode(): js.Any = js.native
  
  /** Get the text between the given points in the editor, which should be {line, ch} objects.
    An optional third argument can be given to indicate the line separator string to use (defaults to "\n"). */
  def getRange(from: Position, to: Position): String = js.native
  def getRange(from: Position, to: Position, seperator: String): String = js.native
  
  /** This method can be used to implement search/replace functionality.
    *  `query`: This can be a regular * expression or a string (only strings will match across lines -
    *          if they contain newlines).
    *  `start`: This provides the starting position of the search. It can be a `{line, ch} object,
    *          or can be left off to default to the start of the document
    *  `caseFold`: This is only relevant when matching a string. IT will cause the search to be case-insenstive */
  def getSearchCursor(query: String): SearchCursor = js.native
  def getSearchCursor(query: String, start: js.UndefOr[scala.Nothing], caseFold: Boolean): SearchCursor = js.native
  def getSearchCursor(query: String, start: Position): SearchCursor = js.native
  def getSearchCursor(query: String, start: Position, caseFold: Boolean): SearchCursor = js.native
  def getSearchCursor(query: RegExp): SearchCursor = js.native
  def getSearchCursor(query: RegExp, start: js.UndefOr[scala.Nothing], caseFold: Boolean): SearchCursor = js.native
  def getSearchCursor(query: RegExp, start: Position): SearchCursor = js.native
  def getSearchCursor(query: RegExp, start: Position, caseFold: Boolean): SearchCursor = js.native
  
  /** Get the currently selected code. */
  def getSelection(): String = js.native
  
  /** Returns an array containing a string for each selection, representing the content of the selections. */
  def getSelections(): js.Array[String] = js.native
  def getSelections(lineSep: String): js.Array[String] = js.native
  
  /** Get the current editor content. You can pass it an optional argument to specify the string to be used to separate lines (defaults to "\n"). */
  def getValue(): String = js.native
  def getValue(seperator: String): String = js.native
  
  /** Returns an object with {undo, redo } properties , both of which hold integers , indicating the amount of stored undo and redo operations. */
  def historySize(): Redo = js.native
  
  /** The reverse of posFromIndex. */
  def indexFromPos(`object`: Position): Double = js.native
  
  /** Returns whether the document is currently clean — not modified since initialization or the last call to markClean if
    no argument is passed, or since the matching call to changeGeneration if a generation value is given. */
  def isClean(): Boolean = js.native
  def isClean(generation: Double): Boolean = js.native
  
  /** Will call the given function for all documents linked to the target document. It will be passed two arguments,
    the linked document and a boolean indicating whether that document shares history with the target. */
  def iterLinkedDocs(fn: js.Function2[/* doc */ this.type, /* sharedHist */ Boolean, Unit]): Unit = js.native
  
  /** Get the last line of the editor. This will usually be lineCount() - 1, but for linked sub-views, it might return other values. */
  def lastLine(): Double = js.native
  
  /** Get the number of lines in the editor. */
  def lineCount(): Double = js.native
  
  /** Returns the preferred line separator string for this document, as per the option by the same name. When that option is null, the string "\n" is returned. */
  def lineSeparator(): String = js.native
  
  /** Create a new document that's linked to the target document. Linked documents will stay in sync (changes to one are also applied to the other) until unlinked. */
  def linkedDoc(options: SharedHist): typings.codemirror.mod.Doc = js.native
  
  /** Retrieves a list of all current selections. These will always be sorted, and never overlap (overlapping selections are merged).
    Each object in the array contains anchor and head properties referring to {line, ch} objects. */
  def listSelections(): js.Array[Range] = js.native
  
  /** Set the editor content as 'clean', a flag that it will retain until it is edited, and which will be set again
    when such an edit is undone again. Useful to track whether the content needs to be saved. This function is deprecated
    in favor of changeGeneration, which allows multiple subsystems to track different notions of cleanness without interfering.*/
  def markClean(): Unit = js.native
  
  /** Can be used to mark a range of text with a specific CSS class name. from and to should be { line , ch } objects. */
  def markText(from: Position, to: Position): TextMarker = js.native
  def markText(from: Position, to: Position, options: TextMarkerOptions): TextMarker = js.native
  
  /** Get the mode option **/
  var modeOption: js.Any = js.native
  
  /** Calculates and returns a { line , ch } object for a zero-based index whose value is relative to the start of the editor's text.
    If the index is out of range of the text then the returned object is clipped to start or end of the text respectively. */
  def posFromIndex(index: Double): Position = js.native
  
  /** Redo one undone edit. */
  def redo(): Unit = js.native
  
  /** Remove the given line from the document. */
  def removeLine(n: Double): Unit = js.native
  
  /** Remove the line widget */
  def removeLineWidget(widget: LineWidget): Unit = js.native
  
  /** Replace the part of the document between from and to with the given string.
    from and to must be {line, ch} objects. to can be left off to simply insert the string at position from. */
  def replaceRange(replacement: String, from: Position): Unit = js.native
  def replaceRange(replacement: String, from: Position, to: js.UndefOr[scala.Nothing], origin: String): Unit = js.native
  def replaceRange(replacement: String, from: Position, to: Position): Unit = js.native
  def replaceRange(replacement: String, from: Position, to: Position, origin: String): Unit = js.native
  def replaceRange(replacement: js.Array[String], from: Position): Unit = js.native
  def replaceRange(replacement: js.Array[String], from: Position, to: js.UndefOr[scala.Nothing], origin: String): Unit = js.native
  def replaceRange(replacement: js.Array[String], from: Position, to: Position): Unit = js.native
  def replaceRange(replacement: js.Array[String], from: Position, to: Position, origin: String): Unit = js.native
  
  /** Replace the selection with the given string. By default, the new selection will span the inserted text.
    The optional collapse argument can be used to change this -- passing "start" or "end" will collapse the selection to the start or end of the inserted text. */
  def replaceSelection(replacement: String): Unit = js.native
  def replaceSelection(replacement: String, collapse: String): Unit = js.native
  
  /** Inserts a bookmark, a handle that follows the text around it as it is being edited, at the given position.
    A bookmark has two methods find() and clear(). The first returns the current position of the bookmark, if it is still in the document,
    and the second explicitly removes the bookmark. */
  def setBookmark(pos: Position): TextMarker = js.native
  def setBookmark(pos: Position, options: InsertLeft): TextMarker = js.native
  
  def setCursor(pos: Double): Unit = js.native
  def setCursor(pos: Double, ch: js.UndefOr[scala.Nothing], options: Bias): Unit = js.native
  def setCursor(pos: Double, ch: Double): Unit = js.native
  def setCursor(pos: Double, ch: Double, options: Bias): Unit = js.native
  /** Set the cursor position. You can either pass a single {line, ch} object, or the line and the character as two separate parameters.
    Will replace all selections with a single, empty selection at the given position.
    The supported options are the same as for setSelection */
  def setCursor(pos: Position): Unit = js.native
  def setCursor(pos: Position, ch: js.UndefOr[scala.Nothing], options: Bias): Unit = js.native
  def setCursor(pos: Position, ch: Double): Unit = js.native
  def setCursor(pos: Position, ch: Double, options: Bias): Unit = js.native
  
  /** Sets or clears the 'extending' flag , which acts similar to the shift key,
    in that it will cause cursor movement and calls to extendSelection to leave the selection anchor in place. */
  def setExtending(value: Boolean): Unit = js.native
  
  /** Replace the editor's undo history with the one provided, which must be a value as returned by getHistory.
    Note that this will have entirely undefined results if the editor content isn't also the same as it was when getHistory was called. */
  def setHistory(history: js.Any): Unit = js.native
  
  /** Set the content of line n. */
  def setLine(n: Double, text: String): Unit = js.native
  
  /** Set a single selection range. anchor and head should be {line, ch} objects. head defaults to anchor when not given. */
  def setSelection(anchor: Position): Unit = js.native
  def setSelection(anchor: Position, head: js.UndefOr[scala.Nothing], options: Bias): Unit = js.native
  def setSelection(anchor: Position, head: Position): Unit = js.native
  def setSelection(anchor: Position, head: Position, options: Bias): Unit = js.native
  
  /** Sets a new set of selections. There must be at least one selection in the given array. When primary is a
    number, it determines which selection is the primary one. When it is not given, the primary index is taken from
    the previous selection, or set to the last range if the previous selection had less ranges than the new one.
    Supports the same options as setSelection. */
  def setSelections(ranges: js.Array[Anchor]): Unit = js.native
  def setSelections(ranges: js.Array[Anchor], primary: js.UndefOr[scala.Nothing], options: Bias): Unit = js.native
  def setSelections(ranges: js.Array[Anchor], primary: Double): Unit = js.native
  def setSelections(ranges: js.Array[Anchor], primary: Double, options: Bias): Unit = js.native
  
  /** Set the editor content. */
  def setValue(content: String): Unit = js.native
  
  /** Return true if any text is selected. */
  def somethingSelected(): Boolean = js.native
  
  /** Expose the state object, so that the Doc.state.completionActive property is reachable*/
  var state: js.Any = js.native
  
  /** Undo one edit (if any undo events are stored). */
  def undo(): Unit = js.native
  
  /** Break the link between two documents. After calling this , changes will no longer propagate between the documents,
    and, if they had a shared history, the history will become separate. */
  def unlinkDoc(doc: typings.codemirror.mod.Doc): Unit = js.native
}
