package typings.codemirrorView.mod

import typings.codemirrorState.mod.EditorState
import typings.codemirrorState.mod.Line
import typings.codemirrorState.mod.SelectionRange
import typings.codemirrorState.mod.Transaction
import typings.codemirrorState.mod.TransactionSpec
import typings.codemirrorView.anon.Bottom
import typings.codemirrorView.anon.From
import typings.codemirrorView.anon.Node
import typings.codemirrorView.anon.X
import typings.codemirrorView.codemirrorViewBooleans.`false`
import typings.codemirrorView.codemirrorViewInts.`-1`
import typings.codemirrorView.codemirrorViewInts.`1`
import typings.std.Document
import typings.std.DocumentOrShadowRoot
import typings.std.HTMLElement
import typings.std.ShadowRoot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
An editor view represents the editor's user interface. It holds
the editable DOM surface, and possibly other elements such as the
line number gutter. It handles events and dispatches state
transactions for editing actions.
*/
@js.native
trait EditorView extends StObject {
  
  /* private */ var _dispatch: Any = js.native
  
  /* private */ var _root: Any = js.native
  
  /* private */ var announceDOM: Any = js.native
  
  /* private */ var bidiCache: Any = js.native
  
  /**
    Returns the bidirectional text structure of the given line
    (which should be in the current document) as an array of span
    objects. The order of these spans matches the [text
    direction](https://codemirror.net/6/docs/ref/#view.EditorView.textDirection)—if that is
    left-to-right, the leftmost spans come first, otherwise the
    rightmost spans come first.
    */
  def bidiSpans(line: Line): js.Array[BidiSpan] = js.native
  
  /**
    Indicates whether the user is currently composing text via
    [IME](https://en.wikipedia.org/wiki/Input_method), and at least
    one change has been made in the current composition.
    */
  def composing: Boolean = js.native
  
  /**
    Indicates whether the user is currently in composing state. Note
    that on some platforms, like Android, this will be the case a
    lot, since just putting the cursor on a word starts a
    composition there.
    */
  def compositionStarted: Boolean = js.native
  
  /* private */ var contentAttrs: Any = js.native
  
  /**
    The editable DOM element holding the editor content. You should
    not, usually, interact with this content directly though the
    DOM, since the editor will immediately undo most of the changes
    you make. Instead, [dispatch](https://codemirror.net/6/docs/ref/#view.EditorView.dispatch)
    [transactions](https://codemirror.net/6/docs/ref/#state.Transaction) to modify content, and
    [decorations](https://codemirror.net/6/docs/ref/#view.Decoration) to style it.
    */
  val contentDOM: HTMLElement = js.native
  
  /**
    The editor's total content height.
    */
  def contentHeight: Double = js.native
  
  /**
    Get the screen coordinates at the given document position.
    `side` determines whether the coordinates are based on the
    element before (-1) or after (1) the position (if no element is
    available on the given side, the method will transparently use
    another strategy to get reasonable coordinates).
    */
  def coordsAtPos(pos: Double): Rect | Null = js.native
  def coordsAtPos(pos: Double, side: `-1` | `1`): Rect | Null = js.native
  
  /**
    The default width of a character in the editor. May not
    accurately reflect the width of all characters (given variable
    width fonts or styling of invididual ranges).
    */
  def defaultCharacterWidth: Double = js.native
  
  /**
    The default height of a line in the editor. May not be accurate
    for all lines.
    */
  def defaultLineHeight: Double = js.native
  
  /**
    Clean up this editor view, removing its element from the
    document, unregistering event handlers, and notifying
    plugins. The view instance can no longer be used after
    calling this.
    */
  def destroy(): Unit = js.native
  
  /* private */ var destroyed: Any = js.native
  
  def dispatch(specs: TransactionSpec*): Unit = js.native
  /**
    All regular editor state updates should go through this. It
    takes a transaction or transaction spec and updates the view to
    show the new state produced by that transaction. Its
    implementation can be overridden with an
    [option](https://codemirror.net/6/docs/ref/#view.EditorView.constructor^config.dispatch). This
    function is bound to the view instance, so it does not have to
    be called as a method.
    */
  def dispatch(tr: Transaction): Unit = js.native
  
  /**
    Reports the padding above and below the document.
    */
  def documentPadding: Bottom = js.native
  
  /**
    The top position of the document, in screen coordinates. This
    may be negative when the editor is scrolled down. Points
    directly to the top of the first line, not above the padding.
    */
  def documentTop: Double = js.native
  
  /**
    The DOM element that wraps the entire editor view.
    */
  val dom: HTMLElement = js.native
  
  /**
    Find the DOM parent node and offset (child offset if `node` is
    an element, character offset when it is a text node) at the
    given document position.
    
    Note that for positions that aren't currently in
    `visibleRanges`, the resulting DOM position isn't necessarily
    meaningful (it may just point before or after a placeholder
    element).
    */
  def domAtPos(pos: Double): Node = js.native
  
  /* private */ var editorAttrs: Any = js.native
  
  /**
    Find the text line or block widget at the given vertical
    position (which is interpreted as relative to the [top of the
    document](https://codemirror.net/6/docs/ref/#view.EditorView.documentTop)).
    */
  def elementAtHeight(height: Double): BlockInfo = js.native
  
  /**
    Put focus on the editor.
    */
  def focus(): Unit = js.native
  
  /**
    Check whether the editor has focus.
    */
  def hasFocus: Boolean = js.native
  
  /**
    Returns false when the editor is entirely scrolled out of view
    or otherwise hidden.
    */
  def inView: Boolean = js.native
  
  /**
    Find the line block around the given document position. A line
    block is a range delimited on both sides by either a
    non-[hidden](https://codemirror.net/6/docs/ref/#view.Decoration^replace) line breaks, or the
    start/end of the document. It will usually just hold a line of
    text, but may be broken into multiple textblocks by block
    widgets.
    */
  def lineBlockAt(pos: Double): BlockInfo = js.native
  
  /**
    Find the line block (see
    [`lineBlockAt`](https://codemirror.net/6/docs/ref/#view.EditorView.lineBlockAt) at the given
    height, again interpreted relative to the [top of the
    document](https://codemirror.net/6/docs/ref/#view.EditorView.documentTop).
    */
  def lineBlockAtHeight(height: Double): BlockInfo = js.native
  
  /**
    Whether this editor [wraps lines](https://codemirror.net/6/docs/ref/#view.EditorView.lineWrapping)
    (as determined by the
    [`white-space`](https://developer.mozilla.org/en-US/docs/Web/CSS/white-space)
    CSS property of its content element).
    */
  def lineWrapping: Boolean = js.native
  
  /* private */ var mountStyles: Any = js.native
  
  /**
    Move a cursor position by [grapheme
    cluster](https://codemirror.net/6/docs/ref/#state.findClusterBreak). `forward` determines whether
    the motion is away from the line start, or towards it. In
    bidirectional text, the line is traversed in visual order, using
    the editor's [text direction](https://codemirror.net/6/docs/ref/#view.EditorView.textDirection).
    When the start position was the last one on the line, the
    returned position will be across the line break. If there is no
    further line, the original position is returned.
    
    By default, this method moves over a single cluster. The
    optional `by` argument can be used to move across more. It will
    be called with the first cluster as argument, and should return
    a predicate that determines, for each subsequent cluster,
    whether it should also be moved over.
    */
  def moveByChar(start: SelectionRange, forward: Boolean): SelectionRange = js.native
  def moveByChar(
    start: SelectionRange,
    forward: Boolean,
    by: js.Function1[/* initial */ String, js.Function1[/* next */ String, Boolean]]
  ): SelectionRange = js.native
  
  /**
    Move a cursor position across the next group of either
    [letters](https://codemirror.net/6/docs/ref/#state.EditorState.charCategorizer) or non-letter
    non-whitespace characters.
    */
  def moveByGroup(start: SelectionRange, forward: Boolean): SelectionRange = js.native
  
  /**
    Move to the next line boundary in the given direction. If
    `includeWrap` is true, line wrapping is on, and there is a
    further wrap point on the current line, the wrap point will be
    returned. Otherwise this function will return the start or end
    of the line.
    */
  def moveToLineBoundary(start: SelectionRange, forward: Boolean): SelectionRange = js.native
  def moveToLineBoundary(start: SelectionRange, forward: Boolean, includeWrap: Boolean): SelectionRange = js.native
  
  /**
    Move a cursor position vertically. When `distance` isn't given,
    it defaults to moving to the next line (including wrapped
    lines). Otherwise, `distance` should provide a positive distance
    in pixels.
    
    When `start` has a
    [`goalColumn`](https://codemirror.net/6/docs/ref/#state.SelectionRange.goalColumn), the vertical
    motion will use that as a target horizontal position. Otherwise,
    the cursor's own horizontal position is used. The returned
    cursor will have its goal column set to whichever column was
    used.
    */
  def moveVertically(start: SelectionRange, forward: Boolean): SelectionRange = js.native
  def moveVertically(start: SelectionRange, forward: Boolean, distance: Double): SelectionRange = js.native
  
  /**
    Get the value of a specific plugin, if present. Note that
    plugins that crash can be dropped from a view, so even when you
    know you registered a given plugin, it is recommended to check
    the return value of this method.
    */
  def plugin[T /* <: PluginValue */](plugin: ViewPlugin[T]): T | Null = js.native
  
  /* private */ var pluginMap: Any = js.native
  
  /* private */ var plugins: Any = js.native
  
  def posAtCoords(coords: X): Double | Null = js.native
  /**
    Get the document position at the given screen coordinates. For
    positions not covered by the visible viewport's DOM structure,
    this will return null, unless `false` is passed as second
    argument, in which case it'll return an estimated position that
    would be near the coordinates if it were rendered.
    */
  @JSName("posAtCoords")
  def posAtCoords_false(coords: X, precise: `false`): Double = js.native
  
  /**
    Find the document position at the given DOM node. Can be useful
    for associating positions with DOM events. Will raise an error
    when `node` isn't part of the editor content.
    */
  def posAtDOM(node: typings.std.Node): Double = js.native
  def posAtDOM(node: typings.std.Node, offset: Double): Double = js.native
  
  /* private */ var readMeasured: Any = js.native
  
  /**
    Schedule a layout measurement, optionally providing callbacks to
    do custom DOM measuring followed by a DOM write phase. Using
    this is preferable reading DOM layout directly from, for
    example, an event handler, because it'll make sure measuring and
    drawing done by other components is synchronized, avoiding
    unnecessary DOM layout computations.
    */
  def requestMeasure[T](): Unit = js.native
  def requestMeasure[T](request: MeasureRequest[T]): Unit = js.native
  
  /**
    The document or shadow root that the view lives in.
    */
  def root: DocumentOrShadowRoot = js.native
  
  /**
    The DOM element that can be styled to scroll. (Note that it may
    not have been, so you can't assume this is scrollable.)
    */
  val scrollDOM: HTMLElement = js.native
  
  /**
    Update the [root](https://codemirror.net/6/docs/ref/##view.EditorViewConfig.root) in which the editor lives. This is only
    necessary when moving the editor's existing DOM to a new window or shadow root.
    */
  def setRoot(root: Document): Unit = js.native
  def setRoot(root: ShadowRoot): Unit = js.native
  
  /**
    Reset the view to the given state. (This will cause the entire
    document to be redrawn and all view plugins to be reinitialized,
    so you should probably only use it when the new state isn't
    derived from the old state. Otherwise, use
    [`dispatch`](https://codemirror.net/6/docs/ref/#view.EditorView.dispatch) instead.)
    */
  def setState(newState: EditorState): Unit = js.native
  
  /* private */ var showAnnouncements: Any = js.native
  
  /**
    The current editor state.
    */
  def state: EditorState = js.native
  
  /* private */ var styleModules: Any = js.native
  
  /**
    The text direction
    ([`direction`](https://developer.mozilla.org/en-US/docs/Web/CSS/direction)
    CSS property) of the editor's content element.
    */
  def textDirection: Direction = js.native
  
  /**
    Find the text direction of the block at the given position, as
    assigned by CSS. If
    [`perLineTextDirection`](https://codemirror.net/6/docs/ref/#view.EditorView^perLineTextDirection)
    isn't enabled, or the given position is outside of the viewport,
    this will always return the same as
    [`textDirection`](https://codemirror.net/6/docs/ref/#view.EditorView.textDirection). Note that
    this may trigger a DOM layout.
    */
  def textDirectionAt(pos: Double): Direction = js.native
  
  /**
    Get the CSS classes for the currently active editor themes.
    */
  def themeClasses: String = js.native
  
  /**
    Update the view for the given array of transactions. This will
    update the visible document and selection to match the state
    produced by the transactions, and notify view plugins of the
    change. You should usually call
    [`dispatch`](https://codemirror.net/6/docs/ref/#view.EditorView.dispatch) instead, which uses this
    as a primitive.
    */
  def update(transactions: js.Array[Transaction]): Unit = js.native
  
  /* private */ var updateAttrs: Any = js.native
  
  /* private */ var updatePlugins: Any = js.native
  
  /**
    To be able to display large documents without consuming too much
    memory or overloading the browser, CodeMirror only draws the
    code that is visible (plus a margin around it) to the DOM. This
    property tells you the extent of the current drawn viewport, in
    document positions.
    */
  def viewport: From = js.native
  
  /**
    Get the extent and vertical position of all [line
    blocks](https://codemirror.net/6/docs/ref/#view.EditorView.lineBlockAt) in the viewport. Positions
    are relative to the [top of the
    document](https://codemirror.net/6/docs/ref/#view.EditorView.documentTop);
    */
  def viewportLineBlocks: js.Array[BlockInfo] = js.native
  
  /**
    When there are, for example, large collapsed ranges in the
    viewport, its size can be a lot bigger than the actual visible
    content. Thus, if you are doing something like styling the
    content in the viewport, it is preferable to only do so for
    these ranges, which are the subset of the viewport that is
    actually drawn.
    */
  def visibleRanges: js.Array[From] = js.native
}
