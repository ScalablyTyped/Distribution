package typings.codemirrorView.mod

import org.scalablytyped.runtime.StringDictionary
import typings.codemirrorState.mod.EditorState
import typings.codemirrorState.mod.Extension
import typings.codemirrorState.mod.Facet
import typings.codemirrorState.mod.RangeSet
import typings.codemirrorState.mod.StateEffect
import typings.codemirrorView.anon.EventFilter
import typings.codemirrorView.anon.Fixed
import typings.codemirrorView.anon.HideOn
import typings.codemirrorView.anon.Key
import typings.codemirrorView.anon.Parent
import typings.codemirrorView.codemirrorViewNumbers.`-1`
import typings.codemirrorView.codemirrorViewNumbers.`1`
import typings.codemirrorView.mod.^
import typings.std.Event
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
Transaction effect that closes all hover tooltips.
*/
inline def closeHoverTooltips: StateEffect[Null] = ^.asInstanceOf[js.Dynamic].selectDynamic("closeHoverTooltips").asInstanceOf[StateEffect[Null]]

/**
Returns an extension that turns the pointer cursor into a
crosshair when a given modifier key, defaulting to Alt, is held
down. Can serve as a visual hint that rectangular selection is
going to happen when paired with
[`rectangularSelection`](https://codemirror.net/6/docs/ref/#view.rectangularSelection).
*/
inline def crosshairCursor(): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("crosshairCursor")().asInstanceOf[Extension]
inline def crosshairCursor(options: Key): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("crosshairCursor")(options.asInstanceOf[js.Any]).asInstanceOf[Extension]

/**
Returns an extension that hides the browser's native selection and
cursor, replacing the selection with a background behind the text
(with the `cm-selectionBackground` class), and the
cursors with elements overlaid over the code (using
`cm-cursor-primary` and `cm-cursor-secondary`).
This allows the editor to display secondary selection ranges, and
tends to produce a type of selection more in line with that users
expect in a text editor (the native selection styling will often
leave gaps between lines and won't fill the horizontal space after
a line when the selection continues past it).
It does have a performance cost, in that it requires an extra DOM
layout cycle for many updates (the selection is drawn based on DOM
layout information that's only available after laying out the
content).
*/
inline def drawSelection(): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("drawSelection")().asInstanceOf[Extension]
inline def drawSelection(config: SelectionConfig): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("drawSelection")(config.asInstanceOf[js.Any]).asInstanceOf[Extension]

/**
Draws a cursor at the current drop position when something is
dragged over the editor.
*/
inline def dropCursor(): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("dropCursor")().asInstanceOf[Extension]

/**
Get the active panel created by the given constructor, if any.
This can be useful when you need access to your panels' DOM
structure.
*/
inline def getPanel(view: EditorView, panel: PanelConstructor): Panel | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getPanel")(view.asInstanceOf[js.Any], panel.asInstanceOf[js.Any])).asInstanceOf[Panel | Null]

/**
Get the active tooltip view for a given tooltip, if available.
*/
inline def getTooltip(view: EditorView, tooltip: Tooltip): TooltipView | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getTooltip")(view.asInstanceOf[js.Any], tooltip.asInstanceOf[js.Any])).asInstanceOf[TooltipView | Null]

/**
Define an editor gutter. The order in which the gutters appear is
determined by their extension priority.
*/
inline def gutter(config: GutterConfig): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("gutter")(config.asInstanceOf[js.Any]).asInstanceOf[Extension]

/**
Facet used to add a class to all gutter elements for a given line.
Markers given to this facet should _only_ define an
[`elementclass`](https://codemirror.net/6/docs/ref/#view.GutterMarker.elementClass), not a
[`toDOM`](https://codemirror.net/6/docs/ref/#view.GutterMarker.toDOM) (or the marker will appear
in all gutters for the line).
*/
inline def gutterLineClass: Facet[RangeSet[GutterMarker], js.Array[RangeSet[GutterMarker]]] = ^.asInstanceOf[js.Dynamic].selectDynamic("gutterLineClass").asInstanceOf[Facet[RangeSet[GutterMarker], js.Array[RangeSet[GutterMarker]]]]

/**
The gutter-drawing plugin is automatically enabled when you add a
gutter, but you can use this function to explicitly configure it.
Unless `fixed` is explicitly set to `false`, the gutters are
fixed, meaning they don't scroll along with the content
horizontally (except on Internet Explorer, which doesn't support
CSS [`position:
sticky`](https://developer.mozilla.org/en-US/docs/Web/CSS/position#sticky)).
*/
inline def gutters(): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("gutters")().asInstanceOf[Extension]
inline def gutters(config: Fixed): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("gutters")(config.asInstanceOf[js.Any]).asInstanceOf[Extension]

/**
Returns true if any hover tooltips are currently active.
*/
inline def hasHoverTooltips(state: EditorState): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasHoverTooltips")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]

/**
Mark lines that have a cursor on them with the `"cm-activeLine"`
DOM class.
*/
inline def highlightActiveLine(): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("highlightActiveLine")().asInstanceOf[Extension]

/**
Returns an extension that adds a `cm-activeLineGutter` class to
all gutter elements on the [active
line](https://codemirror.net/6/docs/ref/#view.highlightActiveLine).
*/
inline def highlightActiveLineGutter(): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("highlightActiveLineGutter")().asInstanceOf[Extension]

/**
Returns an extension that installs highlighting of special
characters.
*/
inline def highlightSpecialChars(): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("highlightSpecialChars")().asInstanceOf[Extension]
inline def highlightSpecialChars(/**
Configuration options.
*/
config: SpecialCharConfig): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("highlightSpecialChars")(config.asInstanceOf[js.Any]).asInstanceOf[Extension]

/**
Set up a hover tooltip, which shows up when the pointer hovers
over ranges of text. The callback is called when the mouse hovers
over the document text. It should, if there is a tooltip
associated with position `pos`, return the tooltip description
(either directly or in a promise). The `side` argument indicates
on which side of the position the pointer is—it will be -1 if the
pointer is before the position, 1 if after the position.
Note that all hover tooltips are hosted within a single tooltip
container element. This allows multiple tooltips over the same
range to be "merged" together without overlapping.
*/
inline def hoverTooltip(
  source: js.Function3[
  /* view */ EditorView, 
  /* pos */ Double, 
  /* side */ `-1` | `1`, 
  Tooltip | Null | (js.Promise[Tooltip | Null])
]
): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("hoverTooltip")(source.asInstanceOf[js.Any]).asInstanceOf[Extension]
inline def hoverTooltip(
  source: js.Function3[
  /* view */ EditorView, 
  /* pos */ Double, 
  /* side */ `-1` | `1`, 
  Tooltip | Null | (js.Promise[Tooltip | Null])
],
  options: HideOn
): Extension = (^.asInstanceOf[js.Dynamic].applyDynamic("hoverTooltip")(source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Extension]

/**
Facet used for registering keymaps.
You can add multiple keymaps to an editor. Their priorities
determine their precedence (the ones specified early or with high
priority get checked first). When a handler has returned `true`
for a given key, no further handlers are called.
*/
inline def keymap: Facet[js.Array[KeyBinding], js.Array[js.Array[KeyBinding]]] = ^.asInstanceOf[js.Dynamic].selectDynamic("keymap").asInstanceOf[Facet[js.Array[KeyBinding], js.Array[js.Array[KeyBinding]]]]

/**
Facet used to provide markers to the line number gutter.
*/
inline def lineNumberMarkers: Facet[RangeSet[GutterMarker], js.Array[RangeSet[GutterMarker]]] = ^.asInstanceOf[js.Dynamic].selectDynamic("lineNumberMarkers").asInstanceOf[Facet[RangeSet[GutterMarker], js.Array[RangeSet[GutterMarker]]]]

/**
Create a line number gutter extension.
*/
inline def lineNumbers(): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("lineNumbers")().asInstanceOf[Extension]
inline def lineNumbers(config: LineNumberConfig): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("lineNumbers")(config.asInstanceOf[js.Any]).asInstanceOf[Extension]

/**
Log or report an unhandled exception in client code. Should
probably only be used by extension code that allows client code to
provide functions, and calls those functions in a context where an
exception can't be propagated to calling code in a reasonable way
(for example when in an event handler).
Either calls a handler registered with
[`EditorView.exceptionSink`](https://codemirror.net/6/docs/ref/#view.EditorView^exceptionSink),
`window.onerror`, if defined, or `console.error` (in which case
it'll pass `context`, when given, as first argument).
*/
inline def logException(state: EditorState, exception: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logException")(state.asInstanceOf[js.Any], exception.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def logException(state: EditorState, exception: Any, context: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("logException")(state.asInstanceOf[js.Any], exception.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
Configures the panel-managing extension.
*/
inline def panels(): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("panels")().asInstanceOf[Extension]
inline def panels(config: PanelConfig): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("panels")(config.asInstanceOf[js.Any]).asInstanceOf[Extension]

/**
Extension that enables a placeholder—a piece of example content
to show when the editor is empty.
*/
inline def placeholder(content: String): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("placeholder")(content.asInstanceOf[js.Any]).asInstanceOf[Extension]
inline def placeholder(content: HTMLElement): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("placeholder")(content.asInstanceOf[js.Any]).asInstanceOf[Extension]

/**
Create an extension that enables rectangular selections. By
default, it will react to left mouse drag with the Alt key held
down. When such a selection occurs, the text within the rectangle
that was dragged over will be selected, as one selection
[range](https://codemirror.net/6/docs/ref/#state.SelectionRange) per line.
*/
inline def rectangularSelection(): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("rectangularSelection")().asInstanceOf[Extension]
inline def rectangularSelection(options: EventFilter): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("rectangularSelection")(options.asInstanceOf[js.Any]).asInstanceOf[Extension]

/**
Tell the tooltip extension to recompute the position of the active
tooltips. This can be useful when something happens (such as a
re-positioning or CSS change affecting the editor) that could
invalidate the existing tooltip positions.
*/
inline def repositionTooltips(view: EditorView): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("repositionTooltips")(view.asInstanceOf[js.Any]).asInstanceOf[Unit]

/**
Run the key handlers registered for a given scope. The event
object should be a `"keydown"` event. Returns true if any of the
handlers handled it.
*/
inline def runScopeHandlers(view: EditorView, event: KeyboardEvent, scope: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("runScopeHandlers")(view.asInstanceOf[js.Any], event.asInstanceOf[js.Any], scope.asInstanceOf[js.Any])).asInstanceOf[Boolean]

/**
Returns an extension that makes sure the content has a bottom
margin equivalent to the height of the editor, minus one line
height, so that every line in the document can be scrolled to the
top of the editor.
This is only meaningful when the editor is scrollable, and should
not be enabled in editors that take the size of their content.
*/
inline def scrollPastEnd(): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("scrollPastEnd")().asInstanceOf[Extension]

/**
Opening a panel is done by providing a constructor function for
the panel through this facet. (The panel is closed again when its
constructor is no longer provided.) Values of `null` are ignored.
*/
inline def showPanel: Facet[PanelConstructor | Null, js.Array[PanelConstructor | Null]] = ^.asInstanceOf[js.Dynamic].selectDynamic("showPanel").asInstanceOf[Facet[PanelConstructor | Null, js.Array[PanelConstructor | Null]]]

/**
Facet to which an extension can add a value to show a tooltip.
*/
inline def showTooltip: Facet[Tooltip | Null, js.Array[Tooltip | Null]] = ^.asInstanceOf[js.Dynamic].selectDynamic("showTooltip").asInstanceOf[Facet[Tooltip | Null, js.Array[Tooltip | Null]]]

/**
Creates an extension that configures tooltip behavior.
*/
inline def tooltips(): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("tooltips")().asInstanceOf[Extension]
inline def tooltips(config: Parent): Extension = ^.asInstanceOf[js.Dynamic].applyDynamic("tooltips")(config.asInstanceOf[js.Any]).asInstanceOf[Extension]

type AttrSource = Attrs | (js.Function1[/* view */ EditorView, Attrs | Null])

type Attrs = StringDictionary[String]

/**
Command functions are used in key bindings and other types of user
actions. Given an editor view, they check whether their effect can
apply to the editor, and if it can, perform it as a side effect
(which usually means [dispatching](https://codemirror.net/6/docs/ref/#view.EditorView.dispatch) a
transaction) and return `true`.
*/
type Command = js.Function1[/* target */ EditorView, Boolean]

/**
A decoration set represents a collection of decorated ranges,
organized for efficient access and mapping. See
[`RangeSet`](https://codemirror.net/6/docs/ref/#state.RangeSet) for its methods.
*/
type DecorationSet = RangeSet[Decoration]

type Handlers = StringDictionary[
js.Function3[/* view */ EditorView, /* line */ BlockInfo, /* event */ Event, Boolean]]

type MakeSelectionStyle = js.Function2[/* view */ EditorView, /* event */ MouseEvent, MouseSelectionStyle | Null]

/**
A function that initializes a panel. Used in
[`showPanel`](https://codemirror.net/6/docs/ref/#view.showPanel).
*/
type PanelConstructor = js.Function1[/* view */ EditorView, Panel]
