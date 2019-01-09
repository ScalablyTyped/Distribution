package typings
package codemirrorLib.codemirrorMod.CodeMirrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Editor extends js.Object {
  /** Expose the state object, so that the Editor.state.completionActive property is reachable*/
  var state: js.Any = js.native
  def addKeyMap(map: KeyMap): scala.Unit = js.native
  def addKeyMap(map: KeyMap, bottom: scala.Boolean): scala.Unit = js.native
  /** Attach an additional keymap to the editor.
    This is mostly useful for add - ons that need to register some key handlers without trampling on the extraKeys option.
    Maps added in this way have a higher precedence than the extraKeys and keyMap options, and between them,
    the maps added earlier have a lower precedence than those added later, unless the bottom argument was passed,
    in which case they end up below other keymaps added with this method. */
  def addKeyMap(map: java.lang.String): scala.Unit = js.native
  def addKeyMap(map: java.lang.String, bottom: scala.Boolean): scala.Unit = js.native
  /** Set a CSS class name for the given line.line can be a number or a line handle.
    where determines to which element this class should be applied, can can be one of "text" (the text element, which lies in front of the selection),
    "background"(a background element that will be behind the selection),
    or "wrap" (the wrapper node that wraps all of the line's elements, including gutter elements).
    class should be the name of the class to apply. */
  def addLineClass(line: js.Any, where: java.lang.String, `_class_`: java.lang.String): LineHandle = js.native
  /** Adds a line widget, an element shown below a line, spanning the whole of the editor's width, and moving the lines below it downwards.
    line should be either an integer or a line handle, and node should be a DOM node, which will be displayed below the given line.
    options, when given, should be an object that configures the behavior of the widget.
    Note that the widget node will become a descendant of nodes with CodeMirror-specific CSS classes, and those classes might in some cases affect it. */
  def addLineWidget(line: js.Any, node: stdLib.HTMLElement): LineWidget = js.native
  def addLineWidget(line: js.Any, node: stdLib.HTMLElement, options: LineWidgetOptions): LineWidget = js.native
  /** Enable a highlighting overlay.This is a stateless mini - mode that can be used to add extra highlighting.
    For example, the search add - on uses it to highlight the term that's currently being searched.
    mode can be a mode spec or a mode object (an object with a token method). The options parameter is optional. If given, it should be an object.
    Currently, only the opaque option is recognized. This defaults to off, but can be given to allow the overlay styling, when not null,
    to override the styling of the base mode entirely, instead of the two being applied together. */
  def addOverlay(mode: js.Any): scala.Unit = js.native
  def addOverlay(mode: js.Any, options: js.Any): scala.Unit = js.native
  /**
    * Places a DOM node above or below an editor and shrinks the editor to make room for the node.
    * When using the `after`, `before` or `replace` options, if the panel doesn't exists or has been removed, the value of the `position` option will be used as a fallback.
    * @param node the DOM node
    * @param options optional options object
    */
  def addPanel(node: stdLib.HTMLElement): Panel = js.native
  def addPanel(node: stdLib.HTMLElement, options: ShowPanelOptions): Panel = js.native
  /** Puts node, which should be an absolutely positioned DOM node, into the editor, positioned right below the given { line , ch } position.
    When scrollIntoView is true, the editor will ensure that the entire node is visible (if possible).
    To remove the widget again, simply use DOM methods (move it somewhere else, or call removeChild on its parent). */
  def addWidget(pos: Position, node: stdLib.HTMLElement, scrollIntoView: scala.Boolean): scala.Unit = js.native
  /** Wrap the code in the given range in a block comment. Will fall back to `lineComment` when no block comment style is defined for the mode. */
  def blockComment(from: Position, to: Position): scala.Unit = js.native
  def blockComment(from: Position, to: Position, options: CommentOptions): scala.Unit = js.native
  /** Returns the position and dimensions of an arbitrary character. pos should be a { line , ch } object.
    If mode is "local", they will be relative to the top-left corner of the editable document.
    If it is "page" or not given, they are relative to the top-left corner of the page.
    This differs from cursorCoords in that it'll give the size of the whole character,
    rather than just the position that the cursor would have when it would sit at that position. */
  def charCoords(pos: Position): codemirrorLib.Anon_BottomLeftRight = js.native
  def charCoords(pos: Position, mode: CoordsMode): codemirrorLib.Anon_BottomLeftRight = js.native
  /** Remove all gutter markers in the gutter with the given ID. */
  def clearGutter(gutterID: java.lang.String): scala.Unit = js.native
  /** Given an { left , top } object , returns the { line , ch } position that corresponds to it.
    The optional mode parameter determines relative to what the coordinates are interpreted.
    It may be "window", "page" (the default), or "local". */
  def coordsChar(`object`: codemirrorLib.Anon_Left): Position = js.native
  def coordsChar(`object`: codemirrorLib.Anon_Left, mode: CoordsMode): Position = js.native
  /** Returns an { left , top , bottom } object containing the coordinates of the cursor position.
    If mode is "local", they will be relative to the top-left corner of the editable document.
    If it is "page" or not given, they are relative to the top-left corner of the page.
    where specifies the precise position at which you want to measure. */
  def cursorCoords(where: Position): codemirrorLib.Anon_BottomLeft = js.native
  def cursorCoords(where: Position, mode: CoordsMode): codemirrorLib.Anon_BottomLeft = js.native
  /** Returns an { left , top , bottom } object containing the coordinates of the cursor position.
    If mode is "local", they will be relative to the top-left corner of the editable document.
    If it is "page" or not given, they are relative to the top-left corner of the page.
    where is a boolean indicating whether you want the start(true) or the end(false) of the selection. */
  def cursorCoords(where: scala.Boolean): codemirrorLib.Anon_BottomLeft = js.native
  def cursorCoords(where: scala.Boolean, mode: CoordsMode): codemirrorLib.Anon_BottomLeft = js.native
  /** Returns the pixel width of an 'x' in the default font for the editor.
    (Note that for non - monospace fonts , this is mostly useless, and even for monospace fonts, non - ascii characters might have a different width). */
  def defaultCharWidth(): scala.Double = js.native
  /** Returns the line height of the default font for the editor. */
  def defaultTextHeight(): scala.Double = js.native
  def endOperation(): scala.Unit = js.native
  /** Runs the command with the given name on the editor. */
  def execCommand(name: java.lang.String): scala.Unit = js.native
  /** Used to find the target position for horizontal cursor motion.start is a { line , ch } object,
    amount an integer(may be negative), and unit one of the string "char", "column", or "word".
    Will return a position that is produced by moving amount times the distance specified by unit.
    When visually is true , motion in right - to - left text will be visual rather than logical.
    When the motion was clipped by hitting the end or start of the document, the returned value will have a hitSide property set to true. */
  def findPosH(start: Position, amount: scala.Double, unit: java.lang.String, visually: scala.Boolean): codemirrorLib.Anon_Ch = js.native
  /** Similar to findPosH , but used for vertical motion.unit may be "line" or "page".
    The other arguments and the returned value have the same interpretation as they have in findPosH. */
  def findPosV(start: Position, amount: scala.Double, unit: java.lang.String): codemirrorLib.Anon_Ch = js.native
  /** Returns the start and end of the 'word' (the stretch of letters, whitespace, or punctuation) at the given position. */
  def findWordAt(pos: Position): Range = js.native
  /** Give the editor focus. */
  def focus(): scala.Unit = js.native
  /** Retrieve the currently active document from an editor. */
  def getDoc(): Doc = js.native
  /** Fetches the DOM node that contains the editor gutters. */
  def getGutterElement(): stdLib.HTMLElement = js.native
  /** Returns the hidden textarea used to read input. */
  def getInputField(): stdLib.HTMLTextAreaElement = js.native
  /** This is similar to getTokenAt, but collects all tokens for a given line into an array. */
  def getLineTokens(line: scala.Double): js.Array[Token] = js.native
  def getLineTokens(line: scala.Double, precise: scala.Boolean): js.Array[Token] = js.native
  /** Gets the inner mode at a given position. This will return the same as getMode for simple modes, but will return an inner mode for nesting modes (such as htmlmixed). */
  def getModeAt(pos: Position): js.Any = js.native
  /** Retrieves the current value of the given option for this editor instance. */
  def getOption(option: java.lang.String): js.Any = js.native
  /** Get an { left , top , width , height , clientWidth , clientHeight } object that represents the current scroll position, the size of the scrollable area,
    and the size of the visible area(minus scrollbars). */
  def getScrollInfo(): ScrollInfo = js.native
  /** Returns the DOM node that is responsible for the scrolling of the editor. */
  def getScrollerElement(): stdLib.HTMLElement = js.native
  /** Returns the mode's parser state, if any, at the end of the given line number.
    If no line number is given, the state at the end of the document is returned.
    This can be useful for storing parsing errors in the state, or getting other kinds of contextual information for a line. */
  def getStateAfter(): js.Any = js.native
  def getStateAfter(line: scala.Double): js.Any = js.native
  /** Retrieves information about the token the current mode found before the given position (a {line, ch} object). */
  def getTokenAt(pos: Position): Token = js.native
  def getTokenAt(pos: Position, precise: scala.Boolean): Token = js.native
  /** This is a (much) cheaper version of getTokenAt useful for when you just need the type of the token at a given position,
    and no other information. Will return null for unstyled tokens, and a string, potentially containing multiple
    space-separated style names, otherwise. */
  def getTokenTypeAt(pos: Position): java.lang.String = js.native
  /** Get the content of the current editor document. You can pass it an optional argument to specify the string to be used to separate lines (defaults to "\n"). */
  def getValue(): java.lang.String = js.native
  def getValue(seperator: java.lang.String): java.lang.String = js.native
  /** Returns a { from , to } object indicating the start (inclusive) and end (exclusive) of the currently rendered part of the document.
    In big documents, when most content is scrolled out of view, CodeMirror will only render the visible part, and a margin around it.
    See also the viewportChange event. */
  def getViewport(): codemirrorLib.Anon_FromTo = js.native
  /** Returns the DOM node that represents the editor, and controls its size. Remove this from your tree to delete an editor instance. */
  def getWrapperElement(): stdLib.HTMLElement = js.native
  /** Tells you whether the editor currently has focus. */
  def hasFocus(): scala.Boolean = js.native
  /** Computes the height of the top of a line, in the coordinate system specified by mode, it may be "window",
    "page" (the default), or "local". When a line below the bottom of the document is specified, the returned value
    is the bottom of the last line in the document. By default, the position of the actual text is returned.
    If includeWidgets is true and the line has line widgets, the position above the first line widget is returned. */
  def heightAtLine(line: js.Any): scala.Double = js.native
  def heightAtLine(line: js.Any, mode: CoordsMode): scala.Double = js.native
  def heightAtLine(line: js.Any, mode: CoordsMode, includeWidgets: scala.Boolean): scala.Double = js.native
  /** Adjust the indentation of the given line.
    The second argument (which defaults to "smart") may be one of:
    "prev" Base indentation on the indentation of the previous line.
    "smart" Use the mode's smart indentation if available, behave like "prev" otherwise.
    "add" Increase the indentation of the line by one indent unit.
    "subtract" Reduce the indentation of the line. */
  def indentLine(line: scala.Double): scala.Unit = js.native
  def indentLine(line: scala.Double, dir: java.lang.String): scala.Unit = js.native
  /** Tells you whether the editor's content can be edited by the user. */
  def isReadOnly(): scala.Boolean = js.native
  /** Compute the line at the given pixel height. mode is the relative element
    to use to compute this line, it may be "window", "page" (the default), or "local" */
  def lineAtHeight(height: scala.Double): scala.Double = js.native
  def lineAtHeight(height: scala.Double, mode: CoordsMode): scala.Double = js.native
  /** Set the lines in the given range to be line comments. Will fall back to `blockComment` when no line comment style is defined for the mode. */
  def lineComment(from: Position, to: Position): scala.Unit = js.native
  def lineComment(from: Position, to: Position, options: CommentOptions): scala.Unit = js.native
  /** Returns the line number, text content, and marker status of the given line, which can be either a number or a line handle. */
  def lineInfo(line: js.Any): codemirrorLib.Anon_BgClass = js.native
  def off(
    eventName: DOMEvent,
    handler: js.Function2[/* instance */ this.type, /* event */ stdLib.Event, scala.Unit]
  ): scala.Unit = js.native
  def off(eventName: java.lang.String, handler: js.Function1[/* instance */ this.type, scala.Unit]): scala.Unit = js.native
  def off(eventName: java.lang.String, handler: js.Function2[/* doc */ Doc, /* event */ js.Any, scala.Unit]): scala.Unit = js.native
  @JSName("off")
  def off_beforeChange(
    eventName: codemirrorLib.codemirrorLibStrings.beforeChange,
    handler: js.Function2[/* instance */ this.type, /* change */ EditorChangeCancellable, scala.Unit]
  ): scala.Unit = js.native
  @JSName("off")
  def off_beforeSelectionChange(
    eventName: codemirrorLib.codemirrorLibStrings.beforeSelectionChange,
    handler: js.Function2[/* instance */ this.type, /* selection */ codemirrorLib.Anon_Anchor, scala.Unit]
  ): scala.Unit = js.native
  @JSName("off")
  def off_blur(
    eventName: codemirrorLib.codemirrorLibStrings.blur,
    handler: js.Function1[/* instance */ this.type, scala.Unit]
  ): scala.Unit = js.native
  @JSName("off")
  def off_change(
    eventName: codemirrorLib.codemirrorLibStrings.change,
    handler: js.Function2[/* instance */ this.type, /* change */ EditorChangeLinkedList, scala.Unit]
  ): scala.Unit = js.native
  @JSName("off")
  def off_changes(
    eventName: codemirrorLib.codemirrorLibStrings.changes,
    handler: js.Function2[/* instance */ this.type, /* change */ js.Array[EditorChangeLinkedList], scala.Unit]
  ): scala.Unit = js.native
  @JSName("off")
  def off_cursorActivity(
    eventName: codemirrorLib.codemirrorLibStrings.cursorActivity,
    handler: js.Function1[/* instance */ this.type, scala.Unit]
  ): scala.Unit = js.native
  @JSName("off")
  def off_focus(
    eventName: codemirrorLib.codemirrorLibStrings.focus,
    handler: js.Function1[/* instance */ this.type, scala.Unit]
  ): scala.Unit = js.native
  @JSName("off")
  def off_gutterClick(
    eventName: codemirrorLib.codemirrorLibStrings.gutterClick,
    handler: js.Function4[
      /* instance */ this.type, 
      /* line */ scala.Double, 
      /* gutter */ java.lang.String, 
      /* clickEvent */ stdLib.Event, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("off")
  def off_renderLine(
    eventName: codemirrorLib.codemirrorLibStrings.renderLine,
    handler: js.Function3[
      /* instance */ this.type, 
      /* line */ LineHandle, 
      /* element */ stdLib.HTMLElement, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("off")
  def off_scroll(
    eventName: codemirrorLib.codemirrorLibStrings.scroll,
    handler: js.Function1[/* instance */ this.type, scala.Unit]
  ): scala.Unit = js.native
  @JSName("off")
  def off_update(
    eventName: codemirrorLib.codemirrorLibStrings.update,
    handler: js.Function1[/* instance */ this.type, scala.Unit]
  ): scala.Unit = js.native
  @JSName("off")
  def off_viewportChange(
    eventName: codemirrorLib.codemirrorLibStrings.viewportChange,
    handler: js.Function3[/* instance */ this.type, /* from */ scala.Double, /* to */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  /** Fires when one of the DOM events fires. */
  def on(
    eventName: DOMEvent,
    handler: js.Function2[/* instance */ this.type, /* event */ stdLib.Event, scala.Unit]
  ): scala.Unit = js.native
  /** Events are registered with the on method (and removed with the off method).
    These are the events that fire on the instance object. The name of the event is followed by the arguments that will be passed to the handler.
    The instance argument always refers to the editor instance. */
  def on(eventName: java.lang.String, handler: js.Function1[/* instance */ this.type, scala.Unit]): scala.Unit = js.native
  /** An extension of the existing CodeMirror typings for the Editor.on("keyup", func) syntax */
  def on(eventName: java.lang.String, handler: js.Function2[/* doc */ Doc, /* event */ js.Any, scala.Unit]): scala.Unit = js.native
  /** This event is fired before a change is applied, and its handler may choose to modify or cancel the change.
    The changeObj never has a next property, since this is fired for each individual change, and not batched per operation.
    Note: you may not do anything from a "beforeChange" handler that would cause changes to the document or its visualization.
    Doing so will, since this handler is called directly from the bowels of the CodeMirror implementation,
    probably cause the editor to become corrupted. */
  @JSName("on")
  def on_beforeChange(
    eventName: codemirrorLib.codemirrorLibStrings.beforeChange,
    handler: js.Function2[/* instance */ this.type, /* change */ EditorChangeCancellable, scala.Unit]
  ): scala.Unit = js.native
  /** This event is fired before the selection is moved. Its handler may modify the resulting selection head and anchor.
    Handlers for this event have the same restriction as "beforeChange" handlers they should not do anything to directly update the state of the editor. */
  @JSName("on")
  def on_beforeSelectionChange(
    eventName: codemirrorLib.codemirrorLibStrings.beforeSelectionChange,
    handler: js.Function2[/* instance */ this.type, /* selection */ codemirrorLib.Anon_Anchor, scala.Unit]
  ): scala.Unit = js.native
  /** Fires whenever the editor is unfocused. */
  @JSName("on")
  def on_blur(
    eventName: codemirrorLib.codemirrorLibStrings.blur,
    handler: js.Function1[/* instance */ this.type, scala.Unit]
  ): scala.Unit = js.native
  /** Fires every time the content of the editor is changed. */
  @JSName("on")
  def on_change(
    eventName: codemirrorLib.codemirrorLibStrings.change,
    handler: js.Function2[/* instance */ this.type, /* change */ EditorChangeLinkedList, scala.Unit]
  ): scala.Unit = js.native
  /** Like the "change" event, but batched per operation, passing an
    * array containing all the changes that happened in the operation.
    * This event is fired after the operation finished, and display
    * changes it makes will trigger a new operation. */
  @JSName("on")
  def on_changes(
    eventName: codemirrorLib.codemirrorLibStrings.changes,
    handler: js.Function2[/* instance */ this.type, /* change */ js.Array[EditorChangeLinkedList], scala.Unit]
  ): scala.Unit = js.native
  /** Will be fired when the cursor or selection moves, or any change is made to the editor content. */
  @JSName("on")
  def on_cursorActivity(
    eventName: codemirrorLib.codemirrorLibStrings.cursorActivity,
    handler: js.Function1[/* instance */ this.type, scala.Unit]
  ): scala.Unit = js.native
  /** Fires whenever the editor is focused. */
  @JSName("on")
  def on_focus(
    eventName: codemirrorLib.codemirrorLibStrings.focus,
    handler: js.Function1[/* instance */ this.type, scala.Unit]
  ): scala.Unit = js.native
  /** Fires when the editor gutter (the line-number area) is clicked. Will pass the editor instance as first argument,
    the (zero-based) number of the line that was clicked as second argument, the CSS class of the gutter that was clicked as third argument,
    and the raw mousedown event object as fourth argument. */
  @JSName("on")
  def on_gutterClick(
    eventName: codemirrorLib.codemirrorLibStrings.gutterClick,
    handler: js.Function4[
      /* instance */ this.type, 
      /* line */ scala.Double, 
      /* gutter */ java.lang.String, 
      /* clickEvent */ stdLib.Event, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /** Fired whenever a line is (re-)rendered to the DOM. Fired right after the DOM element is built, before it is added to the document.
    The handler may mess with the style of the resulting element, or add event handlers, but should not try to change the state of the editor. */
  @JSName("on")
  def on_renderLine(
    eventName: codemirrorLib.codemirrorLibStrings.renderLine,
    handler: js.Function3[
      /* instance */ this.type, 
      /* line */ LineHandle, 
      /* element */ stdLib.HTMLElement, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /** Fires when the editor is scrolled. */
  @JSName("on")
  def on_scroll(
    eventName: codemirrorLib.codemirrorLibStrings.scroll,
    handler: js.Function1[/* instance */ this.type, scala.Unit]
  ): scala.Unit = js.native
  /** Will be fired whenever CodeMirror updates its DOM display. */
  @JSName("on")
  def on_update(
    eventName: codemirrorLib.codemirrorLibStrings.update,
    handler: js.Function1[/* instance */ this.type, scala.Unit]
  ): scala.Unit = js.native
  /** Fires whenever the view port of the editor changes (due to scrolling, editing, or any other factor).
    The from and to arguments give the new start and end of the viewport. */
  @JSName("on")
  def on_viewportChange(
    eventName: codemirrorLib.codemirrorLibStrings.viewportChange,
    handler: js.Function3[/* instance */ this.type, /* from */ scala.Double, /* to */ scala.Double, scala.Unit]
  ): scala.Unit = js.native
  /** CodeMirror internally buffers changes and only updates its DOM structure after it has finished performing some operation.
    If you need to perform a lot of operations on a CodeMirror instance, you can call this method with a function argument.
    It will call the function, buffering up all changes, and only doing the expensive update after the function returns.
    This can be a lot faster. The return value from this method will be the return value of your function. */
  def operation[T](fn: js.Function0[T]): T = js.native
  /** If your code does something to change the size of the editor element (window resizes are already listened for), or unhides it,
    you should probably follow up by calling this method to ensure CodeMirror is still looking as intended. */
  def refresh(): scala.Unit = js.native
  def removeKeyMap(map: KeyMap): scala.Unit = js.native
  /** Disable a keymap added with addKeyMap.Either pass in the keymap object itself , or a string,
    which will be compared against the name property of the active keymaps. */
  def removeKeyMap(map: java.lang.String): scala.Unit = js.native
  /** Remove a CSS class from a line.line can be a line handle or number.
    where should be one of "text", "background", or "wrap"(see addLineClass).
    class can be left off to remove all classes for the specified node, or be a string to remove only a specific class. */
  def removeLineClass(line: js.Any, where: java.lang.String): LineHandle = js.native
  def removeLineClass(line: js.Any, where: java.lang.String, `class_`: java.lang.String): LineHandle = js.native
  /** Pass this the exact argument passed for the mode parameter to addOverlay to remove an overlay again. */
  def removeOverlay(mode: js.Any): scala.Unit = js.native
  def scrollIntoView(): scala.Unit = js.native
  /** Scrolls the given element into view. pos is a { left , top , right , bottom } object, in editor-local coordinates.
    The margin parameter is optional. When given, it indicates the amount of pixels around the given area that should be made visible as well. */
  def scrollIntoView(pos: codemirrorLib.Anon_Bottom, margin: scala.Double): scala.Unit = js.native
  /** Scrolls the given element into view. pos is a { line, ch } object, in editor-local coordinates.
    The margin parameter is optional. When given, it indicates the amount of pixels around the given area that should be made visible as well. */
  def scrollIntoView(pos: codemirrorLib.Anon_ChLine): scala.Unit = js.native
  def scrollIntoView(pos: codemirrorLib.Anon_ChLine, margin: scala.Double): scala.Unit = js.native
  /** Scrolls the given element into view. pos is a { from, to } object, in editor-local coordinates.
    The margin parameter is optional. When given, it indicates the amount of pixels around the given area that should be made visible as well. */
  def scrollIntoView(pos: codemirrorLib.Anon_From, margin: scala.Double): scala.Unit = js.native
  /** Scrolls the given element into view. pos is a { line , ch } position, referring to a given character, null, to refer to the cursor.
    The margin parameter is optional. When given, it indicates the amount of pixels around the given area that should be made visible as well. */
  def scrollIntoView(pos: Position): scala.Unit = js.native
  def scrollIntoView(pos: Position, margin: scala.Double): scala.Unit = js.native
  def scrollIntoView(pos: scala.Null, margin: scala.Double): scala.Unit = js.native
  /** Scroll the editor to a given(pixel) position.Both arguments may be left as null or undefined to have no effect. */
  def scrollTo(): scala.Unit = js.native
  def scrollTo(x: scala.Double): scala.Unit = js.native
  def scrollTo(x: scala.Double, y: scala.Double): scala.Unit = js.native
  def scrollTo(x: scala.Null, y: scala.Double): scala.Unit = js.native
  def setGutterMarker(line: js.Any, gutterID: java.lang.String): LineHandle = js.native
  /** Sets the gutter marker for the given gutter (identified by its CSS class, see the gutters option) to the given value.
    Value can be either null, to clear the marker, or a DOM element, to set it. The DOM element will be shown in the specified gutter next to the specified line. */
  def setGutterMarker(line: js.Any, gutterID: java.lang.String, value: stdLib.HTMLElement): LineHandle = js.native
  /** Change the configuration of the editor. option should the name of an option, and value should be a valid value for that option. */
  def setOption(option: java.lang.String, value: js.Any): scala.Unit = js.native
  /** Programatically set the size of the editor (overriding the applicable CSS rules).
    width and height height can be either numbers(interpreted as pixels) or CSS units ("100%", for example).
    You can pass null for either of them to indicate that that dimension should not be changed. */
  def setSize(width: js.Any, height: js.Any): scala.Unit = js.native
  /** Set the content of the current editor document. */
  def setValue(content: java.lang.String): scala.Unit = js.native
  def showHint(options: ShowHintOptions): scala.Unit = js.native
  /** In normal circumstances, use the above operation method. But if you want to buffer operations happening asynchronously, or that can't all be wrapped in a callback
    function, you can call startOperation to tell CodeMirror to start buffering changes, and endOperation to actually render all the updates. Be careful: if you use this
    API and forget to call endOperation, the editor will just never update. */
  def startOperation(): scala.Unit = js.native
  /** Attach a new document to the editor. Returns the old document, which is now no longer associated with an editor. */
  def swapDoc(doc: Doc): Doc = js.native
  /** Tries to uncomment the current selection, and if that fails, line-comments it. */
  def toggleComment(): scala.Unit = js.native
  def toggleComment(options: CommentOptions): scala.Unit = js.native
  /** Try to uncomment the given range. Returns `true` if a comment range was found and removed, `false` otherwise. */
  def uncomment(from: Position, to: Position): scala.Boolean = js.native
  def uncomment(from: Position, to: Position, options: CommentOptions): scala.Boolean = js.native
}

