package typings.codemirror.codemirrorMod

import typings.codemirror.Anon_Anchor
import typings.codemirror.Anon_BgClass
import typings.codemirror.Anon_Bottom
import typings.codemirror.Anon_BottomLeft
import typings.codemirror.Anon_BottomLeftRight
import typings.codemirror.Anon_Ch
import typings.codemirror.Anon_ChLine
import typings.codemirror.Anon_From
import typings.codemirror.Anon_FromTo
import typings.codemirror.Anon_Left
import typings.codemirror.codemirrorStrings.autoCloseBrackets
import typings.codemirror.codemirrorStrings.autoCloseTags
import typings.codemirror.codemirrorStrings.autofocus
import typings.codemirror.codemirrorStrings.beforeChange
import typings.codemirror.codemirrorStrings.beforeSelectionChange
import typings.codemirror.codemirrorStrings.blur
import typings.codemirror.codemirrorStrings.change
import typings.codemirror.codemirrorStrings.changes
import typings.codemirror.codemirrorStrings.coverGutterNextToScrollbar
import typings.codemirror.codemirrorStrings.cursorActivity
import typings.codemirror.codemirrorStrings.cursorBlinkRate
import typings.codemirror.codemirrorStrings.cursorHeight
import typings.codemirror.codemirrorStrings.cursorScrollMargin
import typings.codemirror.codemirrorStrings.dragDrop
import typings.codemirror.codemirrorStrings.electricChars
import typings.codemirror.codemirrorStrings.electricInput
import typings.codemirror.codemirrorStrings.extraKeys
import typings.codemirror.codemirrorStrings.firstLineNumber
import typings.codemirror.codemirrorStrings.fixedGutter
import typings.codemirror.codemirrorStrings.flattenSpans
import typings.codemirror.codemirrorStrings.focus
import typings.codemirror.codemirrorStrings.foldGutter
import typings.codemirror.codemirrorStrings.gutterClick
import typings.codemirror.codemirrorStrings.gutterContextMenu
import typings.codemirror.codemirrorStrings.gutters
import typings.codemirror.codemirrorStrings.highlightSelectionMatches
import typings.codemirror.codemirrorStrings.hintOptions
import typings.codemirror.codemirrorStrings.historyEventDelay
import typings.codemirror.codemirrorStrings.indentUnit
import typings.codemirror.codemirrorStrings.indentWithTabs
import typings.codemirror.codemirrorStrings.inputRead
import typings.codemirror.codemirrorStrings.inputStyle
import typings.codemirror.codemirrorStrings.keyHandled
import typings.codemirror.codemirrorStrings.keyMap
import typings.codemirror.codemirrorStrings.lineNumbers
import typings.codemirror.codemirrorStrings.lineWiseCopyCut
import typings.codemirror.codemirrorStrings.lineWrapping
import typings.codemirror.codemirrorStrings.lint
import typings.codemirror.codemirrorStrings.matchBrackets
import typings.codemirror.codemirrorStrings.matchTags
import typings.codemirror.codemirrorStrings.maxHighlightLength
import typings.codemirror.codemirrorStrings.mode
import typings.codemirror.codemirrorStrings.optionChange
import typings.codemirror.codemirrorStrings.overwriteToggle
import typings.codemirror.codemirrorStrings.placeholder
import typings.codemirror.codemirrorStrings.pollInterval
import typings.codemirror.codemirrorStrings.readOnly
import typings.codemirror.codemirrorStrings.refresh
import typings.codemirror.codemirrorStrings.renderLine
import typings.codemirror.codemirrorStrings.rtlMoveVisually
import typings.codemirror.codemirrorStrings.scroll
import typings.codemirror.codemirrorStrings.scrollCursorIntoView
import typings.codemirror.codemirrorStrings.scrollPastEnd
import typings.codemirror.codemirrorStrings.scrollbarStyle
import typings.codemirror.codemirrorStrings.showCursorWhenSelecting
import typings.codemirror.codemirrorStrings.showHint
import typings.codemirror.codemirrorStrings.smartIndent
import typings.codemirror.codemirrorStrings.styleActiveLine
import typings.codemirror.codemirrorStrings.swapDoc
import typings.codemirror.codemirrorStrings.tabSize
import typings.codemirror.codemirrorStrings.tabindex
import typings.codemirror.codemirrorStrings.theme
import typings.codemirror.codemirrorStrings.undoDepth
import typings.codemirror.codemirrorStrings.update
import typings.codemirror.codemirrorStrings.value
import typings.codemirror.codemirrorStrings.viewportChange
import typings.codemirror.codemirrorStrings.viewportMargin
import typings.codemirror.codemirrorStrings.workDelay
import typings.codemirror.codemirrorStrings.workTime
import typings.std.Event
import typings.std.FocusEvent
import typings.std.HTMLElement
import typings.std.HTMLTextAreaElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Methods prefixed with doc. can, unless otherwise specified, be called both on CodeMirror (editor) instances and
  CodeMirror.Doc instances. Thus, the Editor interface extends Doc. **/
@js.native
trait Editor extends Doc {
  /** Attach an additional keymap to the editor.
    This is mostly useful for add - ons that need to register some key handlers without trampling on the extraKeys option.
    Maps added in this way have a higher precedence than the extraKeys and keyMap options, and between them,
    the maps added earlier have a lower precedence than those added later, unless the bottom argument was passed,
    in which case they end up below other keymaps added with this method. */
  def addKeyMap(map: String): Unit = js.native
  def addKeyMap(map: String, bottom: Boolean): Unit = js.native
  def addKeyMap(map: KeyMap): Unit = js.native
  def addKeyMap(map: KeyMap, bottom: Boolean): Unit = js.native
  /** Set a CSS class name for the given line.line can be a number or a line handle.
    where determines to which element this class should be applied, can can be one of "text" (the text element, which lies in front of the selection),
    "background"(a background element that will be behind the selection),
    or "wrap" (the wrapper node that wraps all of the line's elements, including gutter elements).
    class should be the name of the class to apply. */
  def addLineClass(line: js.Any, where: String, _class_ : String): LineHandle = js.native
  /** Enable a highlighting overlay.This is a stateless mini - mode that can be used to add extra highlighting.
    For example, the search add - on uses it to highlight the term that's currently being searched.
    mode can be a mode spec or a mode object (an object with a token method). The options parameter is optional. If given, it should be an object.
    Currently, only the opaque option is recognized. This defaults to off, but can be given to allow the overlay styling, when not null,
    to override the styling of the base mode entirely, instead of the two being applied together. */
  def addOverlay(mode: js.Any): Unit = js.native
  def addOverlay(mode: js.Any, options: js.Any): Unit = js.native
  /**
    * Places a DOM node above or below an editor and shrinks the editor to make room for the node.
    * When using the `after`, `before` or `replace` options, if the panel doesn't exists or has been removed, the value of the `position` option will be used as a fallback.
    * @param node the DOM node
    * @param options optional options object
    */
  def addPanel(node: HTMLElement): Panel = js.native
  def addPanel(node: HTMLElement, options: ShowPanelOptions): Panel = js.native
  /** Puts node, which should be an absolutely positioned DOM node, into the editor, positioned right below the given { line , ch } position.
    When scrollIntoView is true, the editor will ensure that the entire node is visible (if possible).
    To remove the widget again, simply use DOM methods (move it somewhere else, or call removeChild on its parent). */
  def addWidget(pos: Position, node: HTMLElement, scrollIntoView: Boolean): Unit = js.native
  /** Wrap the code in the given range in a block comment. Will fall back to `lineComment` when no block comment style is defined for the mode. */
  def blockComment(from: Position, to: Position): Unit = js.native
  def blockComment(from: Position, to: Position, options: CommentOptions): Unit = js.native
  /** Returns the position and dimensions of an arbitrary character. pos should be a { line , ch } object.
    If mode is "local", they will be relative to the top-left corner of the editable document.
    If it is "page" or not given, they are relative to the top-left corner of the page.
    This differs from cursorCoords in that it'll give the size of the whole character,
    rather than just the position that the cursor would have when it would sit at that position. */
  def charCoords(pos: Position): Anon_BottomLeftRight = js.native
  def charCoords(pos: Position, mode: CoordsMode): Anon_BottomLeftRight = js.native
  /** Remove all gutter markers in the gutter with the given ID. */
  def clearGutter(gutterID: String): Unit = js.native
  /** Given an { left , top } object , returns the { line , ch } position that corresponds to it.
    The optional mode parameter determines relative to what the coordinates are interpreted.
    It may be "window", "page" (the default), or "local". */
  def coordsChar(`object`: Anon_Left): Position = js.native
  def coordsChar(`object`: Anon_Left, mode: CoordsMode): Position = js.native
  /** Returns an { left , top , bottom } object containing the coordinates of the cursor position.
    If mode is "local", they will be relative to the top-left corner of the editable document.
    If it is "page" or not given, they are relative to the top-left corner of the page.
    where is a boolean indicating whether you want the start(true) or the end(false) of the selection. */
  def cursorCoords(): Anon_BottomLeft = js.native
  def cursorCoords(where: Boolean): Anon_BottomLeft = js.native
  def cursorCoords(where: Boolean, mode: CoordsMode): Anon_BottomLeft = js.native
  def cursorCoords(where: Null, mode: CoordsMode): Anon_BottomLeft = js.native
  def cursorCoords(where: Position): Anon_BottomLeft = js.native
  def cursorCoords(where: Position, mode: CoordsMode): Anon_BottomLeft = js.native
  /** Returns the pixel width of an 'x' in the default font for the editor.
    (Note that for non - monospace fonts , this is mostly useless, and even for monospace fonts, non - ascii characters might have a different width). */
  def defaultCharWidth(): Double = js.native
  /** Returns the line height of the default font for the editor. */
  def defaultTextHeight(): Double = js.native
  def endOperation(): Unit = js.native
  /** Runs the command with the given name on the editor. */
  def execCommand(name: String): Unit = js.native
  /** Used to find the target position for horizontal cursor motion.start is a { line , ch } object,
    amount an integer(may be negative), and unit one of the string "char", "column", or "word".
    Will return a position that is produced by moving amount times the distance specified by unit.
    When visually is true , motion in right - to - left text will be visual rather than logical.
    When the motion was clipped by hitting the end or start of the document, the returned value will have a hitSide property set to true. */
  def findPosH(start: Position, amount: Double, unit: String, visually: Boolean): Anon_Ch = js.native
  /** Similar to findPosH , but used for vertical motion.unit may be "line" or "page".
    The other arguments and the returned value have the same interpretation as they have in findPosH. */
  def findPosV(start: Position, amount: Double, unit: String): Anon_Ch = js.native
  /** Returns the start and end of the 'word' (the stretch of letters, whitespace, or punctuation) at the given position. */
  def findWordAt(pos: Position): Range = js.native
  /** Give the editor focus. */
  def focus(): Unit = js.native
  /** Retrieve the currently active document from an editor. */
  def getDoc(): Doc = js.native
  /** Fetches the DOM node that contains the editor gutters. */
  def getGutterElement(): HTMLElement = js.native
  /** Returns the hidden textarea used to read input. */
  def getInputField(): HTMLTextAreaElement = js.native
  /** This is similar to getTokenAt, but collects all tokens for a given line into an array. */
  def getLineTokens(line: Double): js.Array[Token] = js.native
  def getLineTokens(line: Double, precise: Boolean): js.Array[Token] = js.native
  /** Gets the inner mode at a given position. This will return the same as getMode for simple modes, but will return an inner mode for nesting modes (such as htmlmixed). */
  def getModeAt(pos: Position): js.Any = js.native
  @JSName("getOption")
  def getOption_autoCloseBrackets(option: autoCloseBrackets): AutoCloseBrackets | Boolean | String = js.native
  @JSName("getOption")
  def getOption_autoCloseTags(option: autoCloseTags): AutoCloseTags | Boolean = js.native
  @JSName("getOption")
  def getOption_autofocus(option: autofocus): Boolean = js.native
  @JSName("getOption")
  def getOption_coverGutterNextToScrollbar(option: coverGutterNextToScrollbar): Boolean = js.native
  @JSName("getOption")
  def getOption_cursorBlinkRate(option: cursorBlinkRate): Double = js.native
  @JSName("getOption")
  def getOption_cursorHeight(option: cursorHeight): Double = js.native
  @JSName("getOption")
  def getOption_cursorScrollMargin(option: cursorScrollMargin): Double = js.native
  @JSName("getOption")
  def getOption_dragDrop(option: dragDrop): Boolean = js.native
  @JSName("getOption")
  def getOption_electricChars(option: electricChars): Boolean = js.native
  @JSName("getOption")
  def getOption_extraKeys(option: extraKeys): String | KeyMap = js.native
  @JSName("getOption")
  def getOption_firstLineNumber(option: firstLineNumber): Double = js.native
  @JSName("getOption")
  def getOption_fixedGutter(option: fixedGutter): Boolean = js.native
  @JSName("getOption")
  def getOption_flattenSpans(option: flattenSpans): Boolean = js.native
  @JSName("getOption")
  def getOption_foldGutter(option: foldGutter): Boolean = js.native
  @JSName("getOption")
  def getOption_gutters(option: gutters): js.Array[String] = js.native
  @JSName("getOption")
  def getOption_highlightSelectionMatches(option: highlightSelectionMatches): HighlightSelectionMatches | Boolean = js.native
  @JSName("getOption")
  def getOption_hintOptions(option: hintOptions): ShowHintOptions = js.native
  @JSName("getOption")
  def getOption_historyEventDelay(option: historyEventDelay): Double = js.native
  @JSName("getOption")
  def getOption_indentUnit(option: indentUnit): Double = js.native
  @JSName("getOption")
  def getOption_indentWithTabs(option: indentWithTabs): Boolean = js.native
  @JSName("getOption")
  def getOption_inputStyle(option: inputStyle): InputStyle = js.native
  @JSName("getOption")
  def getOption_keyMap(option: keyMap): String = js.native
  @JSName("getOption")
  def getOption_lineNumbers(option: lineNumbers): Boolean = js.native
  @JSName("getOption")
  def getOption_lineWiseCopyCut(option: lineWiseCopyCut): Boolean = js.native
  @JSName("getOption")
  def getOption_lineWrapping(option: lineWrapping): Boolean = js.native
  @JSName("getOption")
  def getOption_lint(option: lint): Boolean | LintOptions = js.native
  @JSName("getOption")
  def getOption_matchBrackets(option: matchBrackets): MatchBrackets | Boolean = js.native
  @JSName("getOption")
  def getOption_matchTags(option: matchTags): MatchTags | Boolean = js.native
  @JSName("getOption")
  def getOption_maxHighlightLength(option: maxHighlightLength): Double = js.native
  @JSName("getOption")
  def getOption_mode(option: mode): js.Any = js.native
  @JSName("getOption")
  def getOption_placeholder(option: placeholder): String = js.native
  @JSName("getOption")
  def getOption_pollInterval(option: pollInterval): Double = js.native
  @JSName("getOption")
  def getOption_readOnly(option: readOnly): js.Any = js.native
  @JSName("getOption")
  def getOption_rtlMoveVisually(option: rtlMoveVisually): Boolean = js.native
  @JSName("getOption")
  def getOption_scrollPastEnd(option: scrollPastEnd): Boolean = js.native
  @JSName("getOption")
  def getOption_scrollbarStyle(option: scrollbarStyle): String = js.native
  @JSName("getOption")
  def getOption_showCursorWhenSelecting(option: showCursorWhenSelecting): Boolean = js.native
  @JSName("getOption")
  def getOption_showHint(option: showHint): Boolean = js.native
  @JSName("getOption")
  def getOption_smartIndent(option: smartIndent): Boolean = js.native
  @JSName("getOption")
  def getOption_styleActiveLine(option: styleActiveLine): StyleActiveLine | Boolean = js.native
  @JSName("getOption")
  def getOption_tabSize(option: tabSize): Double = js.native
  @JSName("getOption")
  def getOption_tabindex(option: tabindex): Double = js.native
  @JSName("getOption")
  def getOption_theme(option: theme): String = js.native
  @JSName("getOption")
  def getOption_undoDepth(option: undoDepth): Double = js.native
  /** Retrieves the current value of the given option for this editor instance. */
  @JSName("getOption")
  def getOption_value(option: value): js.Any = js.native
  @JSName("getOption")
  def getOption_viewportMargin(option: viewportMargin): Double = js.native
  @JSName("getOption")
  def getOption_workDelay(option: workDelay): Double = js.native
  @JSName("getOption")
  def getOption_workTime(option: workTime): Double = js.native
  /** Get an { left , top , width , height , clientWidth , clientHeight } object that represents the current scroll position, the size of the scrollable area,
    and the size of the visible area(minus scrollbars). */
  def getScrollInfo(): ScrollInfo = js.native
  /** Returns the DOM node that is responsible for the scrolling of the editor. */
  def getScrollerElement(): HTMLElement = js.native
  /** Returns the mode's parser state, if any, at the end of the given line number.
    If no line number is given, the state at the end of the document is returned.
    This can be useful for storing parsing errors in the state, or getting other kinds of contextual information for a line. */
  def getStateAfter(): js.Any = js.native
  def getStateAfter(line: Double): js.Any = js.native
  /** Retrieves information about the token the current mode found before the given position (a {line, ch} object). */
  def getTokenAt(pos: Position): Token = js.native
  def getTokenAt(pos: Position, precise: Boolean): Token = js.native
  /** This is a (much) cheaper version of getTokenAt useful for when you just need the type of the token at a given position,
    and no other information. Will return null for unstyled tokens, and a string, potentially containing multiple
    space-separated style names, otherwise. */
  def getTokenTypeAt(pos: Position): String = js.native
  /** Returns a { from , to } object indicating the start (inclusive) and end (exclusive) of the currently rendered part of the document.
    In big documents, when most content is scrolled out of view, CodeMirror will only render the visible part, and a margin around it.
    See also the viewportChange event. */
  def getViewport(): Anon_FromTo = js.native
  /** Returns the DOM node that represents the editor, and controls its size. Remove this from your tree to delete an editor instance. */
  def getWrapperElement(): HTMLElement = js.native
  /** Tells you whether the editor currently has focus. */
  def hasFocus(): Boolean = js.native
  /** Computes the height of the top of a line, in the coordinate system specified by mode, it may be "window",
    "page" (the default), or "local". When a line below the bottom of the document is specified, the returned value
    is the bottom of the last line in the document. By default, the position of the actual text is returned.
    If includeWidgets is true and the line has line widgets, the position above the first line widget is returned. */
  def heightAtLine(line: js.Any): Double = js.native
  def heightAtLine(line: js.Any, mode: CoordsMode): Double = js.native
  def heightAtLine(line: js.Any, mode: CoordsMode, includeWidgets: Boolean): Double = js.native
  /** Adjust the indentation of the given line.
    The second argument (which defaults to "smart") may be one of:
    "prev" Base indentation on the indentation of the previous line.
    "smart" Use the mode's smart indentation if available, behave like "prev" otherwise.
    "add" Increase the indentation of the line by one indent unit.
    "subtract" Reduce the indentation of the line. */
  def indentLine(line: Double): Unit = js.native
  def indentLine(line: Double, dir: String): Unit = js.native
  /** Tells you whether the editor's content can be edited by the user. */
  def isReadOnly(): Boolean = js.native
  /** Compute the line at the given pixel height. mode is the relative element
    to use to compute this line, it may be "window", "page" (the default), or "local" */
  def lineAtHeight(height: Double): Double = js.native
  def lineAtHeight(height: Double, mode: CoordsMode): Double = js.native
  /** Set the lines in the given range to be line comments. Will fall back to `blockComment` when no line comment style is defined for the mode. */
  def lineComment(from: Position, to: Position): Unit = js.native
  def lineComment(from: Position, to: Position, options: CommentOptions): Unit = js.native
  /** Returns the line number, text content, and marker status of the given line, which can be either a number or a line handle. */
  def lineInfo(line: js.Any): Anon_BgClass = js.native
  def off(eventName: String, handler: js.Function1[/* instance */ this.type, Unit]): Unit = js.native
  def off(eventName: String, handler: js.Function2[/* doc */ Doc, /* event */ js.Any, Unit]): Unit = js.native
  def off[K /* <: DOMEvent with (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 88 */ js.Any) */](
    eventName: K,
    handler: js.Function2[
      /* instance */ this.type, 
      /* import warning: ImportType.apply Failed type conversion: std.GlobalEventHandlersEventMap[K] */ /* event */ js.Any, 
      Unit
    ]
  ): Unit = js.native
  @JSName("off")
  def off_beforeChange(
    eventName: beforeChange,
    handler: js.Function2[/* instance */ this.type, /* changeObj */ EditorChangeCancellable, Unit]
  ): Unit = js.native
  @JSName("off")
  def off_beforeSelectionChange(
    eventName: beforeSelectionChange,
    handler: js.Function2[/* instance */ this.type, /* selection */ Anon_Anchor, Unit]
  ): Unit = js.native
  @JSName("off")
  def off_blur(eventName: blur, handler: js.Function2[/* instance */ this.type, /* event */ FocusEvent, Unit]): Unit = js.native
  @JSName("off")
  def off_change(
    eventName: change,
    handler: js.Function2[/* instance */ this.type, /* changeObj */ EditorChangeLinkedList, Unit]
  ): Unit = js.native
  @JSName("off")
  def off_changes(
    eventName: changes,
    handler: js.Function2[/* instance */ this.type, /* changes */ js.Array[EditorChangeLinkedList], Unit]
  ): Unit = js.native
  @JSName("off")
  def off_cursorActivity(eventName: cursorActivity, handler: js.Function1[/* instance */ this.type, Unit]): Unit = js.native
  @JSName("off")
  def off_electricInput(eventName: electricInput, handler: js.Function2[/* instance */ this.type, /* line */ Double, Unit]): Unit = js.native
  @JSName("off")
  def off_focus(eventName: focus, handler: js.Function2[/* instance */ this.type, /* event */ FocusEvent, Unit]): Unit = js.native
  @JSName("off")
  def off_gutterClick(
    eventName: gutterClick,
    handler: js.Function4[
      /* instance */ this.type, 
      /* line */ Double, 
      /* gutter */ String, 
      /* clickEvent */ MouseEvent, 
      Unit
    ]
  ): Unit = js.native
  @JSName("off")
  def off_gutterContextMenu(
    eventName: gutterContextMenu,
    handler: js.Function4[
      /* instance */ this.type, 
      /* line */ Double, 
      /* gutter */ String, 
      /* contextMenu */ MouseEvent, 
      Unit
    ]
  ): Unit = js.native
  @JSName("off")
  def off_inputRead(
    eventName: inputRead,
    handler: js.Function2[/* instance */ this.type, /* changeObj */ EditorChange, Unit]
  ): Unit = js.native
  @JSName("off")
  def off_keyHandled(
    eventName: keyHandled,
    handler: js.Function3[/* instance */ this.type, /* name */ String, /* event */ KeyboardEvent, Unit]
  ): Unit = js.native
  @JSName("off")
  def off_optionChange(
    eventName: optionChange,
    handler: js.Function2[/* instance */ this.type, /* option */ String, Unit]
  ): Unit = js.native
  @JSName("off")
  def off_refresh(eventName: refresh, handler: js.Function1[/* instance */ this.type, Unit]): Unit = js.native
  @JSName("off")
  def off_renderLine(
    eventName: renderLine,
    handler: js.Function3[/* instance */ this.type, /* line */ LineHandle, /* element */ HTMLElement, Unit]
  ): Unit = js.native
  @JSName("off")
  def off_scroll(eventName: scroll, handler: js.Function1[/* instance */ this.type, Unit]): Unit = js.native
  @JSName("off")
  def off_scrollCursorIntoView(
    eventName: scrollCursorIntoView,
    handler: js.Function2[/* instance */ this.type, /* event */ Event, Unit]
  ): Unit = js.native
  @JSName("off")
  def off_swapDoc(eventName: swapDoc, handler: js.Function2[/* instance */ this.type, /* oldDoc */ Doc, Unit]): Unit = js.native
  @JSName("off")
  def off_update(eventName: update, handler: js.Function1[/* instance */ this.type, Unit]): Unit = js.native
  @JSName("off")
  def off_viewportChange(
    eventName: viewportChange,
    handler: js.Function3[/* instance */ this.type, /* from */ Double, /* to */ Double, Unit]
  ): Unit = js.native
  /** Events are registered with the on method (and removed with the off method).
    These are the events that fire on the instance object. The name of the event is followed by the arguments that will be passed to the handler.
    The instance argument always refers to the editor instance. */
  def on(eventName: String, handler: js.Function1[/* instance */ this.type, Unit]): Unit = js.native
  /** An extension of the existing CodeMirror typings for the Editor.on("keyup", func) syntax */
  def on(eventName: String, handler: js.Function2[/* doc */ Doc, /* event */ js.Any, Unit]): Unit = js.native
  /** Fires when one of the DOM events fires. */
  def on[K /* <: DOMEvent with (/* import warning: LimitUnionLength.leaveTypeRef Was union type with length 88 */ js.Any) */](
    eventName: K,
    handler: js.Function2[
      /* instance */ this.type, 
      /* import warning: ImportType.apply Failed type conversion: std.GlobalEventHandlersEventMap[K] */ /* event */ js.Any, 
      Unit
    ]
  ): Unit = js.native
  /** This event is fired before a change is applied, and its handler may choose to modify or cancel the change.
    The changeObj never has a next property, since this is fired for each individual change, and not batched per operation.
    Note: you may not do anything from a "beforeChange" handler that would cause changes to the document or its visualization.
    Doing so will, since this handler is called directly from the bowels of the CodeMirror implementation,
    probably cause the editor to become corrupted. */
  @JSName("on")
  def on_beforeChange(
    eventName: beforeChange,
    handler: js.Function2[/* instance */ this.type, /* changeObj */ EditorChangeCancellable, Unit]
  ): Unit = js.native
  /** This event is fired before the selection is moved. Its handler may modify the resulting selection head and anchor.
    Handlers for this event have the same restriction as "beforeChange" handlers they should not do anything to directly update the state of the editor. */
  @JSName("on")
  def on_beforeSelectionChange(
    eventName: beforeSelectionChange,
    handler: js.Function2[/* instance */ this.type, /* selection */ Anon_Anchor, Unit]
  ): Unit = js.native
  /** Fires whenever the editor is unfocused. */
  @JSName("on")
  def on_blur(eventName: blur, handler: js.Function2[/* instance */ this.type, /* event */ FocusEvent, Unit]): Unit = js.native
  /** Fires every time the content of the editor is changed. */
  @JSName("on")
  def on_change(
    eventName: change,
    handler: js.Function2[/* instance */ this.type, /* changeObj */ EditorChangeLinkedList, Unit]
  ): Unit = js.native
  /** Like the "change" event, but batched per operation, passing an
    * array containing all the changes that happened in the operation.
    * This event is fired after the operation finished, and display
    * changes it makes will trigger a new operation. */
  @JSName("on")
  def on_changes(
    eventName: changes,
    handler: js.Function2[/* instance */ this.type, /* changes */ js.Array[EditorChangeLinkedList], Unit]
  ): Unit = js.native
  /** Will be fired when the cursor or selection moves, or any change is made to the editor content. */
  @JSName("on")
  def on_cursorActivity(eventName: cursorActivity, handler: js.Function1[/* instance */ this.type, Unit]): Unit = js.native
  /** Fired if text input matched the mode's electric patterns, and this caused the line's indentation to change. */
  @JSName("on")
  def on_electricInput(eventName: electricInput, handler: js.Function2[/* instance */ this.type, /* line */ Double, Unit]): Unit = js.native
  /** Fires whenever the editor is focused. */
  @JSName("on")
  def on_focus(eventName: focus, handler: js.Function2[/* instance */ this.type, /* event */ FocusEvent, Unit]): Unit = js.native
  /** Fires when the editor gutter (the line-number area) is clicked. Will pass the editor instance as first argument,
    the (zero-based) number of the line that was clicked as second argument, the CSS class of the gutter that was clicked as third argument,
    and the raw mousedown event object as fourth argument. */
  @JSName("on")
  def on_gutterClick(
    eventName: gutterClick,
    handler: js.Function4[
      /* instance */ this.type, 
      /* line */ Double, 
      /* gutter */ String, 
      /* clickEvent */ MouseEvent, 
      Unit
    ]
  ): Unit = js.native
  /** Fires when the editor gutter (the line-number area) receives a contextmenu event. Will pass the editor instance as first argument,
    the (zero-based) number of the line that was clicked as second argument, the CSS class of the gutter that was clicked as third argument,
    and the raw contextmenu mouse event object as fourth argument. You can preventDefault the event, to signal that CodeMirror should do no
    further handling. */
  @JSName("on")
  def on_gutterContextMenu(
    eventName: gutterContextMenu,
    handler: js.Function4[
      /* instance */ this.type, 
      /* line */ Double, 
      /* gutter */ String, 
      /* contextMenu */ MouseEvent, 
      Unit
    ]
  ): Unit = js.native
  /** Fired whenever new input is read from the hidden textarea (typed or pasted by the user). */
  @JSName("on")
  def on_inputRead(
    eventName: inputRead,
    handler: js.Function2[/* instance */ this.type, /* changeObj */ EditorChange, Unit]
  ): Unit = js.native
  /** Fired after a key is handled through a key map. name is the name of the handled key (for example "Ctrl-X" or "'q'"), and event is the DOM keydown or keypress event. */
  @JSName("on")
  def on_keyHandled(
    eventName: keyHandled,
    handler: js.Function3[/* instance */ this.type, /* name */ String, /* event */ KeyboardEvent, Unit]
  ): Unit = js.native
  /** Dispatched every time an option is changed with setOption. */
  @JSName("on")
  def on_optionChange(
    eventName: optionChange,
    handler: js.Function2[/* instance */ this.type, /* option */ String, Unit]
  ): Unit = js.native
  /** Fires when the overwrite flag is flipped. */
  @JSName("on")
  def on_overwriteToggle(
    eventName: overwriteToggle,
    handler: js.Function2[/* instance */ this.type, /* overwrite */ Boolean, Unit]
  ): Unit = js.native
  /** Fires when the editor is refreshed or resized. Mostly useful to invalidate cached values that depend on the editor or character size. */
  @JSName("on")
  def on_refresh(eventName: refresh, handler: js.Function1[/* instance */ this.type, Unit]): Unit = js.native
  /** Fired whenever a line is (re-)rendered to the DOM. Fired right after the DOM element is built, before it is added to the document.
    The handler may mess with the style of the resulting element, or add event handlers, but should not try to change the state of the editor. */
  @JSName("on")
  def on_renderLine(
    eventName: renderLine,
    handler: js.Function3[/* instance */ this.type, /* line */ LineHandle, /* element */ HTMLElement, Unit]
  ): Unit = js.native
  /** Fires when the editor is scrolled. */
  @JSName("on")
  def on_scroll(eventName: scroll, handler: js.Function1[/* instance */ this.type, Unit]): Unit = js.native
  /** Fires when the editor tries to scroll its cursor into view. Can be hooked into to take care of additional scrollable containers around the editor. When the event object has its preventDefault method called, CodeMirror will not itself try to scroll the window. */
  @JSName("on")
  def on_scrollCursorIntoView(
    eventName: scrollCursorIntoView,
    handler: js.Function2[/* instance */ this.type, /* event */ Event, Unit]
  ): Unit = js.native
  /** This is signalled when the editor's document is replaced using the swapDoc method. */
  @JSName("on")
  def on_swapDoc(eventName: swapDoc, handler: js.Function2[/* instance */ this.type, /* oldDoc */ Doc, Unit]): Unit = js.native
  /** Will be fired whenever CodeMirror updates its DOM display. */
  @JSName("on")
  def on_update(eventName: update, handler: js.Function1[/* instance */ this.type, Unit]): Unit = js.native
  /** Fires whenever the view port of the editor changes (due to scrolling, editing, or any other factor).
    The from and to arguments give the new start and end of the viewport. */
  @JSName("on")
  def on_viewportChange(
    eventName: viewportChange,
    handler: js.Function3[/* instance */ this.type, /* from */ Double, /* to */ Double, Unit]
  ): Unit = js.native
  /** CodeMirror internally buffers changes and only updates its DOM structure after it has finished performing some operation.
    If you need to perform a lot of operations on a CodeMirror instance, you can call this method with a function argument.
    It will call the function, buffering up all changes, and only doing the expensive update after the function returns.
    This can be a lot faster. The return value from this method will be the return value of your function. */
  def operation[T](fn: js.Function0[T]): T = js.native
  /** If your code does something to change the size of the editor element (window resizes are already listened for), or unhides it,
    you should probably follow up by calling this method to ensure CodeMirror is still looking as intended. */
  def refresh(): Unit = js.native
  /** Disable a keymap added with addKeyMap.Either pass in the keymap object itself , or a string,
    which will be compared against the name property of the active keymaps. */
  def removeKeyMap(map: String): Unit = js.native
  def removeKeyMap(map: KeyMap): Unit = js.native
  /** Remove a CSS class from a line.line can be a line handle or number.
    where should be one of "text", "background", or "wrap"(see addLineClass).
    class can be left off to remove all classes for the specified node, or be a string to remove only a specific class. */
  def removeLineClass(line: js.Any, where: String): LineHandle = js.native
  def removeLineClass(line: js.Any, where: String, class_ : String): LineHandle = js.native
  /** Pass this the exact argument passed for the mode parameter to addOverlay to remove an overlay again. */
  def removeOverlay(mode: js.Any): Unit = js.native
  def scrollIntoView(): Unit = js.native
  def scrollIntoView(pos: Null, margin: Double): Unit = js.native
  /** Scrolls the given element into view. pos is a { left , top , right , bottom } object, in editor-local coordinates.
    The margin parameter is optional. When given, it indicates the amount of pixels around the given area that should be made visible as well. */
  def scrollIntoView(pos: Anon_Bottom): Unit = js.native
  def scrollIntoView(pos: Anon_Bottom, margin: Double): Unit = js.native
  /** Scrolls the given element into view. pos is a { line, ch } object, in editor-local coordinates.
    The margin parameter is optional. When given, it indicates the amount of pixels around the given area that should be made visible as well. */
  def scrollIntoView(pos: Anon_ChLine): Unit = js.native
  def scrollIntoView(pos: Anon_ChLine, margin: Double): Unit = js.native
  /** Scrolls the given element into view. pos is a { from, to } object, in editor-local coordinates.
    The margin parameter is optional. When given, it indicates the amount of pixels around the given area that should be made visible as well. */
  def scrollIntoView(pos: Anon_From): Unit = js.native
  def scrollIntoView(pos: Anon_From, margin: Double): Unit = js.native
  /** Scrolls the given element into view. pos is a { line , ch } position, referring to a given character, null, to refer to the cursor.
    The margin parameter is optional. When given, it indicates the amount of pixels around the given area that should be made visible as well. */
  def scrollIntoView(pos: Position): Unit = js.native
  def scrollIntoView(pos: Position, margin: Double): Unit = js.native
  /** Scroll the editor to a given(pixel) position.Both arguments may be left as null or undefined to have no effect. */
  def scrollTo(): Unit = js.native
  def scrollTo(x: Double): Unit = js.native
  def scrollTo(x: Double, y: Double): Unit = js.native
  def scrollTo(x: Null, y: Double): Unit = js.native
  def setGutterMarker(line: js.Any, gutterID: String): LineHandle = js.native
  /** Sets the gutter marker for the given gutter (identified by its CSS class, see the gutters option) to the given value.
    Value can be either null, to clear the marker, or a DOM element, to set it. The DOM element will be shown in the specified gutter next to the specified line. */
  def setGutterMarker(line: js.Any, gutterID: String, value: HTMLElement): LineHandle = js.native
  @JSName("setOption")
  def setOption_autoCloseBrackets(option: autoCloseBrackets, value: String): Unit = js.native
  @JSName("setOption")
  def setOption_autoCloseBrackets(option: autoCloseBrackets, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_autoCloseBrackets(option: autoCloseBrackets, value: AutoCloseBrackets): Unit = js.native
  @JSName("setOption")
  def setOption_autoCloseTags(option: autoCloseTags, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_autoCloseTags(option: autoCloseTags, value: AutoCloseTags): Unit = js.native
  @JSName("setOption")
  def setOption_autofocus(option: autofocus, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_coverGutterNextToScrollbar(option: coverGutterNextToScrollbar, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_cursorBlinkRate(option: cursorBlinkRate, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_cursorHeight(option: cursorHeight, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_cursorScrollMargin(option: cursorScrollMargin, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_dragDrop(option: dragDrop, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_electricChars(option: electricChars, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_extraKeys(option: extraKeys, value: String): Unit = js.native
  @JSName("setOption")
  def setOption_extraKeys(option: extraKeys, value: KeyMap): Unit = js.native
  @JSName("setOption")
  def setOption_firstLineNumber(option: firstLineNumber, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_fixedGutter(option: fixedGutter, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_flattenSpans(option: flattenSpans, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_foldGutter(option: foldGutter, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_gutters(option: gutters, value: js.Array[String]): Unit = js.native
  @JSName("setOption")
  def setOption_highlightSelectionMatches(option: highlightSelectionMatches, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_highlightSelectionMatches(option: highlightSelectionMatches, value: HighlightSelectionMatches): Unit = js.native
  @JSName("setOption")
  def setOption_hintOptions(option: hintOptions, value: ShowHintOptions): Unit = js.native
  @JSName("setOption")
  def setOption_historyEventDelay(option: historyEventDelay, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_indentUnit(option: indentUnit, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_indentWithTabs(option: indentWithTabs, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_inputStyle(option: inputStyle, value: InputStyle): Unit = js.native
  @JSName("setOption")
  def setOption_keyMap(option: keyMap, value: String): Unit = js.native
  @JSName("setOption")
  def setOption_lineNumbers(option: lineNumbers, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_lineWiseCopyCut(option: lineWiseCopyCut, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_lineWrapping(option: lineWrapping, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_lint(option: lint, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_lint(option: lint, value: LintOptions): Unit = js.native
  @JSName("setOption")
  def setOption_matchBrackets(option: matchBrackets, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_matchBrackets(option: matchBrackets, value: MatchBrackets): Unit = js.native
  @JSName("setOption")
  def setOption_matchTags(option: matchTags, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_matchTags(option: matchTags, value: MatchTags): Unit = js.native
  @JSName("setOption")
  def setOption_maxHighlightLength(option: maxHighlightLength, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_mode(option: mode, value: js.Any): Unit = js.native
  @JSName("setOption")
  def setOption_placeholder(option: placeholder, value: String): Unit = js.native
  @JSName("setOption")
  def setOption_pollInterval(option: pollInterval, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_readOnly(option: readOnly, value: js.Any): Unit = js.native
  @JSName("setOption")
  def setOption_rtlMoveVisually(option: rtlMoveVisually, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_scrollPastEnd(option: scrollPastEnd, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_scrollbarStyle(option: scrollbarStyle, value: String): Unit = js.native
  @JSName("setOption")
  def setOption_showCursorWhenSelecting(option: showCursorWhenSelecting, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_showHint(option: showHint, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_smartIndent(option: smartIndent, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_styleActiveLine(option: styleActiveLine, value: Boolean): Unit = js.native
  @JSName("setOption")
  def setOption_styleActiveLine(option: styleActiveLine, value: StyleActiveLine): Unit = js.native
  @JSName("setOption")
  def setOption_tabSize(option: tabSize, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_tabindex(option: tabindex, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_theme(option: theme, value: String): Unit = js.native
  @JSName("setOption")
  def setOption_undoDepth(option: undoDepth, value: Double): Unit = js.native
  /** Change the configuration of the editor. option should the name of an option, and value should be a valid value for that option. */
  @JSName("setOption")
  def setOption_value(option: value, value: js.Any): Unit = js.native
  @JSName("setOption")
  def setOption_viewportMargin(option: viewportMargin, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_workDelay(option: workDelay, value: Double): Unit = js.native
  @JSName("setOption")
  def setOption_workTime(option: workTime, value: Double): Unit = js.native
  /** Programatically set the size of the editor (overriding the applicable CSS rules).
    width and height height can be either numbers(interpreted as pixels) or CSS units ("100%", for example).
    You can pass null for either of them to indicate that that dimension should not be changed. */
  def setSize(width: js.Any, height: js.Any): Unit = js.native
  def showHint(options: ShowHintOptions): Unit = js.native
  /** In normal circumstances, use the above operation method. But if you want to buffer operations happening asynchronously, or that can't all be wrapped in a callback
    function, you can call startOperation to tell CodeMirror to start buffering changes, and endOperation to actually render all the updates. Be careful: if you use this
    API and forget to call endOperation, the editor will just never update. */
  def startOperation(): Unit = js.native
  /** Attach a new document to the editor. Returns the old document, which is now no longer associated with an editor. */
  def swapDoc(doc: Doc): Doc = js.native
  /** Tries to uncomment the current selection, and if that fails, line-comments it. */
  def toggleComment(): Unit = js.native
  def toggleComment(options: CommentOptions): Unit = js.native
  /** Switches between overwrite and normal insert mode (when not given an argument),
    or sets the overwrite mode to a specific state (when given an argument). */
  def toggleOverwrite(): Unit = js.native
  def toggleOverwrite(value: Boolean): Unit = js.native
  /** Try to uncomment the given range. Returns `true` if a comment range was found and removed, `false` otherwise. */
  def uncomment(from: Position, to: Position): Boolean = js.native
  def uncomment(from: Position, to: Position, options: CommentOptions): Boolean = js.native
}

