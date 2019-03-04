package typings
package codemirrorLib.codemirrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("codemirror", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var Doc: codemirrorLib.codemirrorMod.CodeMirrorNs.DocConstructor = js.native
  var Pass: codemirrorLib.Anon_CodeMirrorPASS = js.native
  var Pos: codemirrorLib.codemirrorMod.CodeMirrorNs.PositionConstructor = js.native
  val TernServer: codemirrorLib.codemirrorMod.CodeMirrorNs.TernConstructor = js.native
  var commands: js.Any = js.native
  /** An object containing default values for all options.
    You can assign to its properties to modify defaults (though this won't affect editors that have already been created). */
  var defaults: js.Any = js.native
  /** It contains a string that indicates the version of the library. This is a triple of integers "major.minor.patch",
    where patch is zero for releases, and something else (usually one) for dev snapshots. */
  var version: java.lang.String = js.native
  def apply(callback: js.Function1[/* host */ stdLib.HTMLElement, scala.Unit]): codemirrorLib.codemirrorMod.CodeMirrorNs.Editor = js.native
  def apply(
    callback: js.Function1[/* host */ stdLib.HTMLElement, scala.Unit],
    options: codemirrorLib.codemirrorMod.CodeMirrorNs.EditorConfiguration
  ): codemirrorLib.codemirrorMod.CodeMirrorNs.Editor = js.native
  def apply(host: stdLib.HTMLElement): codemirrorLib.codemirrorMod.CodeMirrorNs.Editor = js.native
  def apply(host: stdLib.HTMLElement, options: codemirrorLib.codemirrorMod.CodeMirrorNs.EditorConfiguration): codemirrorLib.codemirrorMod.CodeMirrorNs.Editor = js.native
  /**
    * A function that calculates either a two-way or three-way merge between different sets of content.
    */
  def MergeView(element: stdLib.HTMLElement): codemirrorLib.codemirrorMod.CodeMirrorNs.MergeViewNs.MergeViewEditor = js.native
  def MergeView(
    element: stdLib.HTMLElement,
    options: codemirrorLib.codemirrorMod.CodeMirrorNs.MergeViewNs.MergeViewEditorConfiguration
  ): codemirrorLib.codemirrorMod.CodeMirrorNs.MergeViewNs.MergeViewEditor = js.native
  /** Utility function that computes an end position from a change (an object with from, to, and text properties, as passed to various event handlers).
    The returned position will be the end of the changed range, after the change is applied. */
  def changeEnd(change: codemirrorLib.codemirrorMod.CodeMirrorNs.EditorChange): codemirrorLib.codemirrorMod.CodeMirrorNs.Position = js.native
  /** Compare two positions, return 0 if they are the same, a negative number when a is less, and a positive number otherwise. */
  def cmpPos(
    a: codemirrorLib.codemirrorMod.CodeMirrorNs.Position,
    b: codemirrorLib.codemirrorMod.CodeMirrorNs.Position
  ): scala.Double = js.native
  /** Find the column position at a given string index using a given tabsize. */
  def countColumn(line: java.lang.String, index: scala.Double, tabSize: scala.Double): scala.Double = js.native
  def countColumn(line: java.lang.String, index: scala.Null, tabSize: scala.Double): scala.Double = js.native
  /** Like defineExtension, but the method will be added to the interface for Doc objects instead. */
  def defineDocExtension(name: java.lang.String, value: js.Any): scala.Unit = js.native
  /** If you want to define extra methods in terms of the CodeMirror API, it is possible to use defineExtension.
    This will cause the given value(usually a method) to be added to all CodeMirror instances created from then on. */
  def defineExtension(name: java.lang.String, value: js.Any): scala.Unit = js.native
  /** If your extention just needs to run some code whenever a CodeMirror instance is initialized, use CodeMirror.defineInitHook.
    Give it a function as its only argument, and from then on, that function will be called (with the instance as argument)
    whenever a new CodeMirror instance is initialized. */
  def defineInitHook(func: js.Function): scala.Unit = js.native
  /**
    * id will be the id for the defined mode. Typically, you should use this second argument to defineMode as your module scope function
    * (modes should not leak anything into the global scope!), i.e. write your whole mode inside this function.
    */
  def defineMode(id: java.lang.String, modefactory: codemirrorLib.codemirrorMod.CodeMirrorNs.ModeFactory[_]): scala.Unit = js.native
  /**
    * id will be the id for the defined mode. Typically, you should use this second argument to defineMode as your module scope function
    * (modes should not leak anything into the global scope!), i.e. write your whole mode inside this function.
    */
  @JSName("defineMode")
  def defineMode_T[T](id: java.lang.String, modefactory: codemirrorLib.codemirrorMod.CodeMirrorNs.ModeFactory[T]): scala.Unit = js.native
  /** Similarly, defineOption can be used to define new options for CodeMirror.
    The updateFunc will be called with the editor instance and the new value when an editor is initialized,
    and whenever the option is modified through setOption. */
  def defineOption(name: java.lang.String, default_ : js.Any, updateFunc: js.Function): scala.Unit = js.native
  /** Sometimes, it is useful to add or override mode object properties from external code.
    The CodeMirror.extendMode function can be used to add properties to mode objects produced for a specific mode.
    Its first argument is the name of the mode, its second an object that specifies the properties that should be added.
    This is mostly useful to add utilities that can later be looked up through getMode. */
  def extendMode(name: java.lang.String, properties: codemirrorLib.codemirrorMod.CodeMirrorNs.Mode[_]): scala.Unit = js.native
  def fromTextArea(host: stdLib.HTMLTextAreaElement): codemirrorLib.codemirrorMod.CodeMirrorNs.EditorFromTextArea = js.native
  def fromTextArea(
    host: stdLib.HTMLTextAreaElement,
    options: codemirrorLib.codemirrorMod.CodeMirrorNs.EditorConfiguration
  ): codemirrorLib.codemirrorMod.CodeMirrorNs.EditorFromTextArea = js.native
  /**
    * The first argument is a configuration object as passed to the mode constructor function, and the second argument
    * is a mode specification as in the EditorConfiguration mode option.
    */
  def getMode[T](config: codemirrorLib.codemirrorMod.CodeMirrorNs.EditorConfiguration, mode: js.Any): codemirrorLib.codemirrorMod.CodeMirrorNs.Mode[T] = js.native
  /** Given a state object, returns a {state, mode} object with the inner mode and its state for the current position. */
  def innerMode(mode: codemirrorLib.codemirrorMod.CodeMirrorNs.Mode[_], state: js.Any): codemirrorLib.Anon_Mode = js.native
  def off(element: js.Any, eventName: java.lang.String, handler: js.Function): scala.Unit = js.native
  @JSName("off")
  def off_beforeChange(
    doc: codemirrorLib.codemirrorMod.CodeMirrorNs.Doc,
    eventName: codemirrorLib.codemirrorLibStrings.beforeChange,
    handler: js.Function2[
      /* instance */ codemirrorLib.codemirrorMod.CodeMirrorNs.Doc, 
      /* change */ codemirrorLib.codemirrorMod.CodeMirrorNs.EditorChangeCancellable, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("off")
  def off_beforeCursorEnter(
    marker: codemirrorLib.codemirrorMod.CodeMirrorNs.TextMarker,
    eventName: codemirrorLib.codemirrorLibStrings.beforeCursorEnter,
    handler: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  @JSName("off")
  def off_beforeSelectionChange(
    doc: codemirrorLib.codemirrorMod.CodeMirrorNs.Doc,
    eventName: codemirrorLib.codemirrorLibStrings.beforeSelectionChange,
    handler: js.Function2[
      /* instance */ codemirrorLib.codemirrorMod.CodeMirrorNs.Editor, 
      /* selection */ codemirrorLib.Anon_Anchor, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("off")
  def off_change(
    doc: codemirrorLib.codemirrorMod.CodeMirrorNs.Doc,
    eventName: codemirrorLib.codemirrorLibStrings.change,
    handler: js.Function2[
      /* instance */ codemirrorLib.codemirrorMod.CodeMirrorNs.Doc, 
      /* change */ codemirrorLib.codemirrorMod.CodeMirrorNs.EditorChange, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("off")
  def off_change(
    line: codemirrorLib.codemirrorMod.CodeMirrorNs.LineHandle,
    eventName: codemirrorLib.codemirrorLibStrings.change,
    handler: js.Function2[
      /* line */ codemirrorLib.codemirrorMod.CodeMirrorNs.LineHandle, 
      /* change */ codemirrorLib.codemirrorMod.CodeMirrorNs.EditorChange, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("off")
  def off_clear(
    marker: codemirrorLib.codemirrorMod.CodeMirrorNs.TextMarker,
    eventName: codemirrorLib.codemirrorLibStrings.clear,
    handler: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  @JSName("off")
  def off_cursorActivity(
    doc: codemirrorLib.codemirrorMod.CodeMirrorNs.Doc,
    eventName: codemirrorLib.codemirrorLibStrings.cursorActivity,
    handler: js.Function1[/* instance */ codemirrorLib.codemirrorMod.CodeMirrorNs.Editor, scala.Unit]
  ): scala.Unit = js.native
  @JSName("off")
  def off_delete(
    line: codemirrorLib.codemirrorMod.CodeMirrorNs.LineHandle,
    eventName: codemirrorLib.codemirrorLibStrings.delete,
    handler: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  @JSName("off")
  def off_hide(
    marker: codemirrorLib.codemirrorMod.CodeMirrorNs.TextMarker,
    eventName: codemirrorLib.codemirrorLibStrings.hide,
    handler: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  @JSName("off")
  def off_redraw(
    line: codemirrorLib.codemirrorMod.CodeMirrorNs.LineWidget,
    eventName: codemirrorLib.codemirrorLibStrings.redraw,
    handler: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  @JSName("off")
  def off_unhide(
    marker: codemirrorLib.codemirrorMod.CodeMirrorNs.TextMarker,
    eventName: codemirrorLib.codemirrorLibStrings.unhide,
    handler: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def on(element: js.Any, eventName: java.lang.String, handler: js.Function): scala.Unit = js.native
  /** See the description of the same event on editor instances. */
  @JSName("on")
  def on_beforeChange(
    doc: codemirrorLib.codemirrorMod.CodeMirrorNs.Doc,
    eventName: codemirrorLib.codemirrorLibStrings.beforeChange,
    handler: js.Function2[
      /* instance */ codemirrorLib.codemirrorMod.CodeMirrorNs.Doc, 
      /* change */ codemirrorLib.codemirrorMod.CodeMirrorNs.EditorChangeCancellable, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /** Fired when the cursor enters the marked range. From this event handler, the editor state may be inspected but not modified,
    with the exception that the range on which the event fires may be cleared. */
  @JSName("on")
  def on_beforeCursorEnter(
    marker: codemirrorLib.codemirrorMod.CodeMirrorNs.TextMarker,
    eventName: codemirrorLib.codemirrorLibStrings.beforeCursorEnter,
    handler: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /** Equivalent to the event by the same name as fired on editor instances. */
  @JSName("on")
  def on_beforeSelectionChange(
    doc: codemirrorLib.codemirrorMod.CodeMirrorNs.Doc,
    eventName: codemirrorLib.codemirrorLibStrings.beforeSelectionChange,
    handler: js.Function2[
      /* instance */ codemirrorLib.codemirrorMod.CodeMirrorNs.Editor, 
      /* selection */ codemirrorLib.Anon_Anchor, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /** Fired whenever a change occurs to the document. changeObj has a similar type as the object passed to the editor's "change" event,
    but it never has a next property, because document change events are not batched (whereas editor change events are). */
  @JSName("on")
  def on_change(
    doc: codemirrorLib.codemirrorMod.CodeMirrorNs.Doc,
    eventName: codemirrorLib.codemirrorLibStrings.change,
    handler: js.Function2[
      /* instance */ codemirrorLib.codemirrorMod.CodeMirrorNs.Doc, 
      /* change */ codemirrorLib.codemirrorMod.CodeMirrorNs.EditorChange, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /** Fires when the line's text content is changed in any way (but the line is not deleted outright).
    The change object is similar to the one passed to change event on the editor object. */
  @JSName("on")
  def on_change(
    line: codemirrorLib.codemirrorMod.CodeMirrorNs.LineHandle,
    eventName: codemirrorLib.codemirrorLibStrings.change,
    handler: js.Function2[
      /* line */ codemirrorLib.codemirrorMod.CodeMirrorNs.LineHandle, 
      /* change */ codemirrorLib.codemirrorMod.CodeMirrorNs.EditorChange, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  /** Fired when the range is cleared, either through cursor movement in combination with clearOnEnter or through a call to its clear() method.
    Will only be fired once per handle. Note that deleting the range through text editing does not fire this event,
    because an undo action might bring the range back into existence. */
  @JSName("on")
  def on_clear(
    marker: codemirrorLib.codemirrorMod.CodeMirrorNs.TextMarker,
    eventName: codemirrorLib.codemirrorLibStrings.clear,
    handler: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /** Fired whenever the cursor or selection in this document changes. */
  @JSName("on")
  def on_cursorActivity(
    doc: codemirrorLib.codemirrorMod.CodeMirrorNs.Doc,
    eventName: codemirrorLib.codemirrorLibStrings.cursorActivity,
    handler: js.Function1[/* instance */ codemirrorLib.codemirrorMod.CodeMirrorNs.Editor, scala.Unit]
  ): scala.Unit = js.native
  /** Will be fired when the line object is deleted. A line object is associated with the start of the line.
    Mostly useful when you need to find out when your gutter markers on a given line are removed. */
  @JSName("on")
  def on_delete(
    line: codemirrorLib.codemirrorMod.CodeMirrorNs.LineHandle,
    eventName: codemirrorLib.codemirrorLibStrings.delete,
    handler: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /** Fired when the last part of the marker is removed from the document by editing operations. */
  @JSName("on")
  def on_hide(
    marker: codemirrorLib.codemirrorMod.CodeMirrorNs.TextMarker,
    eventName: codemirrorLib.codemirrorLibStrings.hide,
    handler: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /** Fired whenever the editor re-adds the widget to the DOM. This will happen once right after the widget is added (if it is scrolled into view),
    and then again whenever it is scrolled out of view and back in again, or when changes to the editor options
    or the line the widget is on require the widget to be redrawn. */
  @JSName("on")
  def on_redraw(
    line: codemirrorLib.codemirrorMod.CodeMirrorNs.LineWidget,
    eventName: codemirrorLib.codemirrorLibStrings.redraw,
    handler: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /** Fired when, after the marker was removed by editing, a undo operation brought the marker back. */
  @JSName("on")
  def on_unhide(
    marker: codemirrorLib.codemirrorMod.CodeMirrorNs.TextMarker,
    eventName: codemirrorLib.codemirrorLibStrings.unhide,
    handler: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  /**
    * Utility function from the overlay.js addon that allows modes to be combined. The mode given as the base argument takes care of
    * most of the normal mode functionality, but a second (typically simple) mode is used, which can override the style of text.
    * Both modes get to parse all of the text, but when both assign a non-null style to a piece of code, the overlay wins, unless
    * the combine argument was true and not overridden, or state.overlay.combineTokens was true, in which case the styles are combined.
    */
  def overlayMode[T, S](
    base: codemirrorLib.codemirrorMod.CodeMirrorNs.Mode[T],
    overlay: codemirrorLib.codemirrorMod.CodeMirrorNs.Mode[S]
  ): codemirrorLib.codemirrorMod.CodeMirrorNs.Mode[_] = js.native
  def overlayMode[T, S](
    base: codemirrorLib.codemirrorMod.CodeMirrorNs.Mode[T],
    overlay: codemirrorLib.codemirrorMod.CodeMirrorNs.Mode[S],
    combine: scala.Boolean
  ): codemirrorLib.codemirrorMod.CodeMirrorNs.Mode[_] = js.native
  /** Registers a helper value with the given name in the given namespace (type). This is used to define functionality
    that may be looked up by mode. Will create (if it doesn't already exist) a property on the CodeMirror object for
    the given type, pointing to an object that maps names to values. I.e. after doing
    CodeMirror.registerHelper("hint", "foo", myFoo), the value CodeMirror.hint.foo will point to myFoo. */
  def registerHelper(namespace: java.lang.String, name: java.lang.String, helper: js.Any): scala.Unit = js.native
  def runMode(
    text: java.lang.String,
    modespec: js.Any,
    callback: js.Function2[/* text */ java.lang.String, /* style */ java.lang.String | scala.Null, scala.Unit]
  ): scala.Unit = js.native
  def runMode(
    text: java.lang.String,
    modespec: js.Any,
    callback: js.Function2[/* text */ java.lang.String, /* style */ java.lang.String | scala.Null, scala.Unit],
    options: codemirrorLib.Anon_State
  ): scala.Unit = js.native
  /**
    * Runs a CodeMirror mode over text without opening an editor instance.
    *
    * @param text The document to run through the highlighter.
    * @param mode The mode to use (must be loaded as normal).
    * @param output If this is a function, it will be called for each token with
    *               two arguments, the token's text and the token's style class
    *               (may be null for unstyled tokens). If it is a DOM node, the
    *               tokens will be converted to span elements as in an editor,
    *               and inserted into the node (through innerHTML).
    */
  def runMode(text: java.lang.String, modespec: js.Any, callback: stdLib.HTMLElement): scala.Unit = js.native
  def runMode(
    text: java.lang.String,
    modespec: js.Any,
    callback: stdLib.HTMLElement,
    options: codemirrorLib.Anon_State
  ): scala.Unit = js.native
  /** Provides a framework for showing autocompletion hints. Defines editor.showHint, which takes an optional
    options object, and pops up a widget that allows the user to select a completion. Finding hints is done with
    a hinting functions (the hint option), which is a function that take an editor instance and options object,
    and return a {list, from, to} object, where list is an array of strings or objects (the completions), and
    from and to give the start and end of the token that is being completed as {line, ch} objects. An optional
    selectedHint property (an integer) can be added to the completion object to control the initially selected hint. */
  def showHint(cm: codemirrorLib.codemirrorMod.CodeMirrorNs.Editor): scala.Unit = js.native
  def showHint(
    cm: codemirrorLib.codemirrorMod.CodeMirrorNs.Editor,
    hinter: codemirrorLib.codemirrorMod.CodeMirrorNs.HintFunction
  ): scala.Unit = js.native
  def showHint(
    cm: codemirrorLib.codemirrorMod.CodeMirrorNs.Editor,
    hinter: codemirrorLib.codemirrorMod.CodeMirrorNs.HintFunction,
    options: codemirrorLib.codemirrorMod.CodeMirrorNs.ShowHintOptions
  ): scala.Unit = js.native
  /** Various CodeMirror-related objects emit events, which allow client code to react to various situations.
    Handlers for such events can be registered with the on and off methods on the objects that the event fires on.
    To fire your own events, use CodeMirror.signal(target, name, args...), where target is a non-DOM-node object. */
  def signal(target: js.Any, name: java.lang.String, args: js.Any*): scala.Unit = js.native
}

