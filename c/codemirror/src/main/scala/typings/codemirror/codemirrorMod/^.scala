package typings.codemirror.codemirrorMod

import typings.codemirror.Anon_Anchor
import typings.codemirror.Anon_Mode
import typings.codemirror.codemirrorMod.MergeViewNs.MergeViewEditor
import typings.codemirror.codemirrorMod.MergeViewNs.MergeViewEditorConfiguration
import typings.codemirror.codemirrorStrings.beforeChange
import typings.codemirror.codemirrorStrings.beforeCursorEnter
import typings.codemirror.codemirrorStrings.beforeSelectionChange
import typings.codemirror.codemirrorStrings.change
import typings.codemirror.codemirrorStrings.clear
import typings.codemirror.codemirrorStrings.cursorActivity
import typings.codemirror.codemirrorStrings.delete
import typings.codemirror.codemirrorStrings.hide
import typings.codemirror.codemirrorStrings.redraw
import typings.codemirror.codemirrorStrings.unhide
import typings.std.HTMLElement
import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("codemirror", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var Doc: DocConstructor = js.native
  var Pos: PositionConstructor = js.native
  var StringStream: StringStreamConstructor = js.native
  val TernServer: TernConstructor = js.native
  /**
    * Commands are parameter-less actions that can be performed on an editor.
    * Their main use is for key bindings.
    * Commands are defined by adding properties to the CodeMirror.commands object.
    */
  var commands: CommandActions = js.native
  /** An object containing default values for all options.
    You can assign to its properties to modify defaults (though this won't affect editors that have already been created). */
  var defaults: js.Any = js.native
  /**
    * Maps MIME types to mode specs.
    */
  var mimeModes: MimeModeMap = js.native
  /**
    * Maps mode names to their constructors
    */
  var modes: ModeMap = js.native
  /** It contains a string that indicates the version of the library. This is a triple of integers "major.minor.patch",
    where patch is zero for releases, and something else (usually one) for dev snapshots. */
  var version: String = js.native
  def apply(callback: js.Function1[/* host */ HTMLElement, Unit]): Editor = js.native
  def apply(callback: js.Function1[/* host */ HTMLElement, Unit], options: EditorConfiguration): Editor = js.native
  def apply(host: HTMLElement): Editor = js.native
  def apply(host: HTMLElement, options: EditorConfiguration): Editor = js.native
  /**
    * A function that calculates either a two-way or three-way merge between different sets of content.
    */
  def MergeView(element: HTMLElement): MergeViewEditor = js.native
  def MergeView(element: HTMLElement, options: MergeViewEditorConfiguration): MergeViewEditor = js.native
  /** Utility function that computes an end position from a change (an object with from, to, and text properties, as passed to various event handlers).
    The returned position will be the end of the changed range, after the change is applied. */
  def changeEnd(change: EditorChange): Position = js.native
  /** Compare two positions, return 0 if they are the same, a negative number when a is less, and a positive number otherwise. */
  def cmpPos(a: Position, b: Position): Double = js.native
  /** Find the column position at a given string index using a given tabsize. */
  def countColumn(line: String, index: Double, tabSize: Double): Double = js.native
  def countColumn(line: String, index: Null, tabSize: Double): Double = js.native
  /** Like defineExtension, but the method will be added to the interface for Doc objects instead. */
  def defineDocExtension(name: String, value: js.Any): Unit = js.native
  /** If you want to define extra methods in terms of the CodeMirror API, it is possible to use defineExtension.
    This will cause the given value(usually a method) to be added to all CodeMirror instances created from then on. */
  def defineExtension(name: String, value: js.Any): Unit = js.native
  /** If your extention just needs to run some code whenever a CodeMirror instance is initialized, use CodeMirror.defineInitHook.
    Give it a function as its only argument, and from then on, that function will be called (with the instance as argument)
    whenever a new CodeMirror instance is initialized. */
  def defineInitHook(func: js.Function): Unit = js.native
  def defineMIME(mime: String, modeSpec: js.Any): Unit = js.native
  /**
    * id will be the id for the defined mode. Typically, you should use this second argument to defineMode as your module scope function
    * (modes should not leak anything into the global scope!), i.e. write your whole mode inside this function.
    */
  def defineMode(id: String, modefactory: ModeFactory[_]): Unit = js.native
  /**
    * id will be the id for the defined mode. Typically, you should use this second argument to defineMode as your module scope function
    * (modes should not leak anything into the global scope!), i.e. write your whole mode inside this function.
    */
  @JSName("defineMode")
  def defineMode_T[T](id: String, modefactory: ModeFactory[T]): Unit = js.native
  /** Similarly, defineOption can be used to define new options for CodeMirror.
    The updateFunc will be called with the editor instance and the new value when an editor is initialized,
    and whenever the option is modified through setOption. */
  def defineOption(name: String, default_ : js.Any, updateFunc: js.Function): Unit = js.native
  /** Sometimes, it is useful to add or override mode object properties from external code.
    The CodeMirror.extendMode function can be used to add properties to mode objects produced for a specific mode.
    Its first argument is the name of the mode, its second an object that specifies the properties that should be added.
    This is mostly useful to add utilities that can later be looked up through getMode. */
  def extendMode(name: String, properties: Mode[_]): Unit = js.native
  def fromTextArea(host: HTMLTextAreaElement): EditorFromTextArea = js.native
  def fromTextArea(host: HTMLTextAreaElement, options: EditorConfiguration): EditorFromTextArea = js.native
  /**
    * The first argument is a configuration object as passed to the mode constructor function, and the second argument
    * is a mode specification as in the EditorConfiguration mode option.
    */
  def getMode[T](config: EditorConfiguration, mode: js.Any): Mode[T] = js.native
  /** Given a state object, returns a {state, mode} object with the inner mode and its state for the current position. */
  def innerMode(mode: Mode[_], state: js.Any): Anon_Mode = js.native
  /** Check if a char is part of an alphabet. */
  def isWordChar(ch: String): Boolean = js.native
  def off(element: js.Any, eventName: String, handler: js.Function): Unit = js.native
  @JSName("off")
  def off_beforeChange(
    doc: Doc,
    eventName: beforeChange,
    handler: js.Function2[/* instance */ Doc, /* change */ EditorChangeCancellable, Unit]
  ): Unit = js.native
  @JSName("off")
  def off_beforeCursorEnter(marker: TextMarker, eventName: beforeCursorEnter, handler: js.Function0[Unit]): Unit = js.native
  @JSName("off")
  def off_beforeSelectionChange(
    doc: Doc,
    eventName: beforeSelectionChange,
    handler: js.Function2[/* instance */ Editor, /* selection */ Anon_Anchor, Unit]
  ): Unit = js.native
  @JSName("off")
  def off_change(
    doc: Doc,
    eventName: change,
    handler: js.Function2[/* instance */ Doc, /* change */ EditorChange, Unit]
  ): Unit = js.native
  @JSName("off")
  def off_change(
    line: LineHandle,
    eventName: change,
    handler: js.Function2[/* line */ LineHandle, /* change */ EditorChange, Unit]
  ): Unit = js.native
  @JSName("off")
  def off_clear(marker: TextMarker, eventName: clear, handler: js.Function0[Unit]): Unit = js.native
  @JSName("off")
  def off_cursorActivity(doc: Doc, eventName: cursorActivity, handler: js.Function1[/* instance */ Editor, Unit]): Unit = js.native
  @JSName("off")
  def off_delete(line: LineHandle, eventName: delete, handler: js.Function0[Unit]): Unit = js.native
  @JSName("off")
  def off_hide(marker: TextMarker, eventName: hide, handler: js.Function0[Unit]): Unit = js.native
  @JSName("off")
  def off_redraw(line: LineWidget, eventName: redraw, handler: js.Function0[Unit]): Unit = js.native
  @JSName("off")
  def off_unhide(marker: TextMarker, eventName: unhide, handler: js.Function0[Unit]): Unit = js.native
  def on(element: js.Any, eventName: String, handler: js.Function): Unit = js.native
  /** See the description of the same event on editor instances. */
  @JSName("on")
  def on_beforeChange(
    doc: Doc,
    eventName: beforeChange,
    handler: js.Function2[/* instance */ Doc, /* change */ EditorChangeCancellable, Unit]
  ): Unit = js.native
  /** Fired when the cursor enters the marked range. From this event handler, the editor state may be inspected but not modified,
    with the exception that the range on which the event fires may be cleared. */
  @JSName("on")
  def on_beforeCursorEnter(marker: TextMarker, eventName: beforeCursorEnter, handler: js.Function0[Unit]): Unit = js.native
  /** Equivalent to the event by the same name as fired on editor instances. */
  @JSName("on")
  def on_beforeSelectionChange(
    doc: Doc,
    eventName: beforeSelectionChange,
    handler: js.Function2[/* instance */ Editor, /* selection */ Anon_Anchor, Unit]
  ): Unit = js.native
  /** Fired whenever a change occurs to the document. changeObj has a similar type as the object passed to the editor's "change" event,
    but it never has a next property, because document change events are not batched (whereas editor change events are). */
  @JSName("on")
  def on_change(
    doc: Doc,
    eventName: change,
    handler: js.Function2[/* instance */ Doc, /* change */ EditorChange, Unit]
  ): Unit = js.native
  /** Fires when the line's text content is changed in any way (but the line is not deleted outright).
    The change object is similar to the one passed to change event on the editor object. */
  @JSName("on")
  def on_change(
    line: LineHandle,
    eventName: change,
    handler: js.Function2[/* line */ LineHandle, /* change */ EditorChange, Unit]
  ): Unit = js.native
  /** Fired when the range is cleared, either through cursor movement in combination with clearOnEnter or through a call to its clear() method.
    Will only be fired once per handle. Note that deleting the range through text editing does not fire this event,
    because an undo action might bring the range back into existence. */
  @JSName("on")
  def on_clear(marker: TextMarker, eventName: clear, handler: js.Function0[Unit]): Unit = js.native
  /** Fired whenever the cursor or selection in this document changes. */
  @JSName("on")
  def on_cursorActivity(doc: Doc, eventName: cursorActivity, handler: js.Function1[/* instance */ Editor, Unit]): Unit = js.native
  /** Will be fired when the line object is deleted. A line object is associated with the start of the line.
    Mostly useful when you need to find out when your gutter markers on a given line are removed. */
  @JSName("on")
  def on_delete(line: LineHandle, eventName: delete, handler: js.Function0[Unit]): Unit = js.native
  /** Fired when the last part of the marker is removed from the document by editing operations. */
  @JSName("on")
  def on_hide(marker: TextMarker, eventName: hide, handler: js.Function0[Unit]): Unit = js.native
  /** Fired whenever the editor re-adds the widget to the DOM. This will happen once right after the widget is added (if it is scrolled into view),
    and then again whenever it is scrolled out of view and back in again, or when changes to the editor options
    or the line the widget is on require the widget to be redrawn. */
  @JSName("on")
  def on_redraw(line: LineWidget, eventName: redraw, handler: js.Function0[Unit]): Unit = js.native
  /** Fired when, after the marker was removed by editing, a undo operation brought the marker back. */
  @JSName("on")
  def on_unhide(marker: TextMarker, eventName: unhide, handler: js.Function0[Unit]): Unit = js.native
  /**
    * Utility function from the overlay.js addon that allows modes to be combined. The mode given as the base argument takes care of
    * most of the normal mode functionality, but a second (typically simple) mode is used, which can override the style of text.
    * Both modes get to parse all of the text, but when both assign a non-null style to a piece of code, the overlay wins, unless
    * the combine argument was true and not overridden, or state.overlay.combineTokens was true, in which case the styles are combined.
    */
  def overlayMode[T, S](base: Mode[T], overlay: Mode[S]): Mode[_] = js.native
  def overlayMode[T, S](base: Mode[T], overlay: Mode[S], combine: Boolean): Mode[_] = js.native
  /** Registers a helper value with the given name in the given namespace (type). This is used to define functionality
    that may be looked up by mode. Will create (if it doesn't already exist) a property on the CodeMirror object for
    the given type, pointing to an object that maps names to values. I.e. after doing
    CodeMirror.registerHelper("hint", "foo", myFoo), the value CodeMirror.hint.foo will point to myFoo. */
  def registerHelper(namespace: String, name: String, helper: js.Any): Unit = js.native
  /** Various CodeMirror-related objects emit events, which allow client code to react to various situations.
    Handlers for such events can be registered with the on and off methods on the objects that the event fires on.
    To fire your own events, use CodeMirror.signal(target, name, args...), where target is a non-DOM-node object. */
  def signal(target: js.Any, name: String, args: js.Any*): Unit = js.native
  /** Split a string by new line. */
  def splitLines(text: String): js.Array[String] = js.native
  /** Call startState of the mode if available, otherwise return true */
  def startState(mode: Mode[_]): js.Any | Boolean = js.native
  def startState(mode: Mode[_], a1: js.Any): js.Any | Boolean = js.native
  def startState(mode: Mode[_], a1: js.Any, a2: js.Any): js.Any | Boolean = js.native
}

