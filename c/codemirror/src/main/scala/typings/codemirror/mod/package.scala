package typings.codemirror.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def apply(callback: js.Function1[/* host */ typings.std.HTMLElement, scala.Unit]): typings.codemirror.mod.Editor = typings.codemirror.mod.^.asInstanceOf[js.Dynamic].apply(callback.asInstanceOf[js.Any]).asInstanceOf[typings.codemirror.mod.Editor]
inline def apply(
  callback: js.Function1[/* host */ typings.std.HTMLElement, scala.Unit],
  options: typings.codemirror.mod.EditorConfiguration
): typings.codemirror.mod.Editor = (typings.codemirror.mod.^.asInstanceOf[js.Dynamic].apply(callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.codemirror.mod.Editor]
inline def apply(host: typings.std.HTMLElement): typings.codemirror.mod.Editor = typings.codemirror.mod.^.asInstanceOf[js.Dynamic].apply(host.asInstanceOf[js.Any]).asInstanceOf[typings.codemirror.mod.Editor]
inline def apply(host: typings.std.HTMLElement, options: typings.codemirror.mod.EditorConfiguration): typings.codemirror.mod.Editor = (typings.codemirror.mod.^.asInstanceOf[js.Dynamic].apply(host.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.codemirror.mod.Editor]

inline def Doc_=(x: typings.codemirror.mod.DocConstructor): scala.Unit = typings.codemirror.mod.^.asInstanceOf[js.Dynamic].updateDynamic("Doc")(x.asInstanceOf[js.Any])

inline def Pos_=(x: typings.codemirror.mod.PositionConstructor): scala.Unit = typings.codemirror.mod.^.asInstanceOf[js.Dynamic].updateDynamic("Pos")(x.asInstanceOf[js.Any])

inline def StringStream_=(x: typings.codemirror.mod.StringStreamConstructor): scala.Unit = typings.codemirror.mod.^.asInstanceOf[js.Dynamic].updateDynamic("StringStream")(x.asInstanceOf[js.Any])

/** Utility function that computes an end position from a change (an object with from, to, and text properties, as passed to various event handlers).
  The returned position will be the end of the changed range, after the change is applied. */
inline def changeEnd(change: typings.codemirror.mod.EditorChange): typings.codemirror.mod.Position = typings.codemirror.mod.^.asInstanceOf[js.Dynamic].applyDynamic("changeEnd")(change.asInstanceOf[js.Any]).asInstanceOf[typings.codemirror.mod.Position]

/** Compare two positions, return 0 if they are the same, a negative number when a is less, and a positive number otherwise. */
inline def cmpPos(a: typings.codemirror.mod.Position, b: typings.codemirror.mod.Position): scala.Double = (typings.codemirror.mod.^.asInstanceOf[js.Dynamic].applyDynamic("cmpPos")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[scala.Double]

/**
  * Commands are parameter-less actions that can be performed on an editor.
  * Their main use is for key bindings.
  * Commands are defined by adding properties to the CodeMirror.commands object.
  */
inline def commands: typings.codemirror.mod.CommandActions = typings.codemirror.mod.^.asInstanceOf[js.Dynamic].selectDynamic("commands").asInstanceOf[typings.codemirror.mod.CommandActions]
inline def commands_=(x: typings.codemirror.mod.CommandActions): scala.Unit = typings.codemirror.mod.^.asInstanceOf[js.Dynamic].updateDynamic("commands")(x.asInstanceOf[js.Any])

/** Find the column position at a given string index using a given tabsize. */
inline def countColumn(line: java.lang.String, index: scala.Double, tabSize: scala.Double): scala.Double = (typings.codemirror.mod.^.asInstanceOf[js.Dynamic].applyDynamic("countColumn")(line.asInstanceOf[js.Any], index.asInstanceOf[js.Any], tabSize.asInstanceOf[js.Any])).asInstanceOf[scala.Double]
inline def countColumn(line: java.lang.String, index: scala.Null, tabSize: scala.Double): scala.Double = (typings.codemirror.mod.^.asInstanceOf[js.Dynamic].applyDynamic("countColumn")(line.asInstanceOf[js.Any], index.asInstanceOf[js.Any], tabSize.asInstanceOf[js.Any])).asInstanceOf[scala.Double]

/** An object containing default values for all options.
  You can assign to its properties to modify defaults (though this won't affect editors that have already been created). */
inline def defaults: js.Any = typings.codemirror.mod.^.asInstanceOf[js.Dynamic].selectDynamic("defaults").asInstanceOf[js.Any]
inline def defaults_=(x: js.Any): scala.Unit = typings.codemirror.mod.^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])

/** Like defineExtension, but the method will be added to the interface for Doc objects instead. */
inline def defineDocExtension(name: java.lang.String, value: js.Any): scala.Unit = (typings.codemirror.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defineDocExtension")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

/** If you want to define extra methods in terms of the CodeMirror API, it is possible to use defineExtension.
  This will cause the given value(usually a method) to be added to all CodeMirror instances created from then on. */
inline def defineExtension(name: java.lang.String, value: js.Any): scala.Unit = (typings.codemirror.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defineExtension")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

/** If your extention just needs to run some code whenever a CodeMirror instance is initialized, use CodeMirror.defineInitHook.
  Give it a function as its only argument, and from then on, that function will be called (with the instance as argument)
  whenever a new CodeMirror instance is initialized. */
inline def defineInitHook(func: js.Function): scala.Unit = typings.codemirror.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defineInitHook")(func.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]

inline def defineMIME(mime: java.lang.String, modeSpec: js.Any): scala.Unit = (typings.codemirror.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defineMIME")(mime.asInstanceOf[js.Any], modeSpec.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

/**
  * id will be the id for the defined mode. Typically, you should use this second argument to defineMode as your module scope function
  * (modes should not leak anything into the global scope!), i.e. write your whole mode inside this function.
  */
inline def defineMode(id: java.lang.String, modefactory: typings.codemirror.mod.ModeFactory[js.Any]): scala.Unit = (typings.codemirror.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defineMode")(id.asInstanceOf[js.Any], modefactory.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

/**
  * id will be the id for the defined mode. Typically, you should use this second argument to defineMode as your module scope function
  * (modes should not leak anything into the global scope!), i.e. write your whole mode inside this function.
  */
inline def defineMode_T[T](id: java.lang.String, modefactory: typings.codemirror.mod.ModeFactory[T]): scala.Unit = (typings.codemirror.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defineMode")(id.asInstanceOf[js.Any], modefactory.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

/** Similarly, defineOption can be used to define new options for CodeMirror.
  The updateFunc will be called with the editor instance and the new value when an editor is initialized,
  and whenever the option is modified through setOption. */
inline def defineOption(name: java.lang.String, default_ : js.Any, updateFunc: js.Function): scala.Unit = (typings.codemirror.mod.^.asInstanceOf[js.Dynamic].applyDynamic("defineOption")(name.asInstanceOf[js.Any], default_.asInstanceOf[js.Any], updateFunc.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

/** Sometimes, it is useful to add or override mode object properties from external code.
  The CodeMirror.extendMode function can be used to add properties to mode objects produced for a specific mode.
  Its first argument is the name of the mode, its second an object that specifies the properties that should be added.
  This is mostly useful to add utilities that can later be looked up through getMode. */
inline def extendMode(name: java.lang.String, properties: typings.codemirror.mod.Mode[js.Any]): scala.Unit = (typings.codemirror.mod.^.asInstanceOf[js.Dynamic].applyDynamic("extendMode")(name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def fromTextArea(host: typings.std.HTMLTextAreaElement): typings.codemirror.mod.EditorFromTextArea = typings.codemirror.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fromTextArea")(host.asInstanceOf[js.Any]).asInstanceOf[typings.codemirror.mod.EditorFromTextArea]
inline def fromTextArea(host: typings.std.HTMLTextAreaElement, options: typings.codemirror.mod.EditorConfiguration): typings.codemirror.mod.EditorFromTextArea = (typings.codemirror.mod.^.asInstanceOf[js.Dynamic].applyDynamic("fromTextArea")(host.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.codemirror.mod.EditorFromTextArea]

/**
  * The first argument is a configuration object as passed to the mode constructor function, and the second argument
  * is a mode specification as in the EditorConfiguration mode option.
  */
inline def getMode[T](config: typings.codemirror.mod.EditorConfiguration, mode: js.Any): typings.codemirror.mod.Mode[T] = (typings.codemirror.mod.^.asInstanceOf[js.Dynamic].applyDynamic("getMode")(config.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[typings.codemirror.mod.Mode[T]]

/** Given a state object, returns a {state, mode} object with the inner mode and its state for the current position. */
inline def innerMode(mode: typings.codemirror.mod.Mode[js.Any], state: js.Any): typings.codemirror.anon.Mode = (typings.codemirror.mod.^.asInstanceOf[js.Dynamic].applyDynamic("innerMode")(mode.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.codemirror.anon.Mode]

/** Check if a char is part of an alphabet. */
inline def isWordChar(ch: java.lang.String): scala.Boolean = typings.codemirror.mod.^.asInstanceOf[js.Dynamic].applyDynamic("isWordChar")(ch.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]

/**
  * Maps MIME types to mode specs.
  */
inline def mimeModes: typings.codemirror.mod.MimeModeMap = typings.codemirror.mod.^.asInstanceOf[js.Dynamic].selectDynamic("mimeModes").asInstanceOf[typings.codemirror.mod.MimeModeMap]
inline def mimeModes_=(x: typings.codemirror.mod.MimeModeMap): scala.Unit = typings.codemirror.mod.^.asInstanceOf[js.Dynamic].updateDynamic("mimeModes")(x.asInstanceOf[js.Any])

/**
  * Maps mode names to their constructors
  */
inline def modes: typings.codemirror.mod.ModeMap = typings.codemirror.mod.^.asInstanceOf[js.Dynamic].selectDynamic("modes").asInstanceOf[typings.codemirror.mod.ModeMap]
inline def modes_=(x: typings.codemirror.mod.ModeMap): scala.Unit = typings.codemirror.mod.^.asInstanceOf[js.Dynamic].updateDynamic("modes")(x.asInstanceOf[js.Any])

/** Modify a keymap to normalize modifier order and properly recognize multi-stroke bindings. */
inline def normalizeKeyMap(km: typings.codemirror.mod.KeyMap): typings.codemirror.mod.KeyMap = typings.codemirror.mod.^.asInstanceOf[js.Dynamic].applyDynamic("normalizeKeyMap")(km.asInstanceOf[js.Any]).asInstanceOf[typings.codemirror.mod.KeyMap]

inline def off(element: js.Any, eventName: java.lang.String, handler: js.Function): scala.Unit = (typings.codemirror.mod.^.asInstanceOf[js.Dynamic].applyDynamic("off")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def off_beforeChange(
  doc: typings.codemirror.mod.Doc,
  eventName: typings.codemirror.codemirrorStrings.beforeChange,
  handler: js.Function2[
  /* instance */ typings.codemirror.mod.Doc, 
  /* change */ typings.codemirror.mod.EditorChangeCancellable, 
  scala.Unit
]
): scala.Unit = (typings.codemirror.mod.^.asInstanceOf[js.Dynamic].applyDynamic("off")(doc.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def off_beforeCursorEnter(
  marker: typings.codemirror.mod.TextMarker,
  eventName: typings.codemirror.codemirrorStrings.beforeCursorEnter,
  handler: js.Function0[scala.Unit]
): scala.Unit = (typings.codemirror.mod.^.asInstanceOf[js.Dynamic].applyDynamic("off")(marker.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def off_beforeSelectionChange(
  doc: typings.codemirror.mod.Doc,
  eventName: typings.codemirror.codemirrorStrings.beforeSelectionChange,
  handler: js.Function2[
  /* instance */ typings.codemirror.mod.Editor, 
  /* obj */ typings.codemirror.mod.EditorSelectionChange, 
  scala.Unit
]
): scala.Unit = (typings.codemirror.mod.^.asInstanceOf[js.Dynamic].applyDynamic("off")(doc.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def off_change(
  doc: typings.codemirror.mod.Doc,
  eventName: typings.codemirror.codemirrorStrings.change,
  handler: js.Function2[
  /* instance */ typings.codemirror.mod.Doc, 
  /* changeObj */ typings.codemirror.mod.EditorChange, 
  scala.Unit
]
): scala.Unit = (typings.codemirror.mod.^.asInstanceOf[js.Dynamic].applyDynamic("off")(doc.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def off_change(
  line: typings.codemirror.mod.LineHandle,
  eventName: typings.codemirror.codemirrorStrings.change,
  handler: js.Function2[
  /* line */ typings.codemirror.mod.LineHandle, 
  /* changeObj */ typings.codemirror.mod.EditorChange, 
  scala.Unit
]
): scala.Unit = (typings.codemirror.mod.^.asInstanceOf[js.Dynamic].applyDynamic("off")(line.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def off_clear(
  marker: typings.codemirror.mod.TextMarker,
  eventName: typings.codemirror.codemirrorStrings.clear,
  handler: js.Function0[scala.Unit]
): scala.Unit = (typings.codemirror.mod.^.asInstanceOf[js.Dynamic].applyDynamic("off")(marker.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def off_cursorActivity(
  doc: typings.codemirror.mod.Doc,
  eventName: typings.codemirror.codemirrorStrings.cursorActivity,
  handler: js.Function1[/* instance */ typings.codemirror.mod.Editor, scala.Unit]
): scala.Unit = (typings.codemirror.mod.^.asInstanceOf[js.Dynamic].applyDynamic("off")(doc.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def off_delete(
  line: typings.codemirror.mod.LineHandle,
  eventName: typings.codemirror.codemirrorStrings.delete,
  handler: js.Function0[scala.Unit]
): scala.Unit = (typings.codemirror.mod.^.asInstanceOf[js.Dynamic].applyDynamic("off")(line.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def off_hide(
  marker: typings.codemirror.mod.TextMarker,
  eventName: typings.codemirror.codemirrorStrings.hide,
  handler: js.Function0[scala.Unit]
): scala.Unit = (typings.codemirror.mod.^.asInstanceOf[js.Dynamic].applyDynamic("off")(marker.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def off_redraw(
  line: typings.codemirror.mod.LineWidget,
  eventName: typings.codemirror.codemirrorStrings.redraw,
  handler: js.Function0[scala.Unit]
): scala.Unit = (typings.codemirror.mod.^.asInstanceOf[js.Dynamic].applyDynamic("off")(line.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def off_unhide(
  marker: typings.codemirror.mod.TextMarker,
  eventName: typings.codemirror.codemirrorStrings.unhide,
  handler: js.Function0[scala.Unit]
): scala.Unit = (typings.codemirror.mod.^.asInstanceOf[js.Dynamic].applyDynamic("off")(marker.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

inline def on(element: js.Any, eventName: java.lang.String, handler: js.Function): scala.Unit = (typings.codemirror.mod.^.asInstanceOf[js.Dynamic].applyDynamic("on")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

/** See the description of the same event on editor instances. */
inline def on_beforeChange(
  doc: typings.codemirror.mod.Doc,
  eventName: typings.codemirror.codemirrorStrings.beforeChange,
  handler: js.Function2[
  /* instance */ typings.codemirror.mod.Doc, 
  /* change */ typings.codemirror.mod.EditorChangeCancellable, 
  scala.Unit
]
): scala.Unit = (typings.codemirror.mod.^.asInstanceOf[js.Dynamic].applyDynamic("on")(doc.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

/** Fired when the cursor enters the marked range. From this event handler, the editor state may be inspected but not modified,
  with the exception that the range on which the event fires may be cleared. */
inline def on_beforeCursorEnter(
  marker: typings.codemirror.mod.TextMarker,
  eventName: typings.codemirror.codemirrorStrings.beforeCursorEnter,
  handler: js.Function0[scala.Unit]
): scala.Unit = (typings.codemirror.mod.^.asInstanceOf[js.Dynamic].applyDynamic("on")(marker.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

/** Equivalent to the event by the same name as fired on editor instances. */
inline def on_beforeSelectionChange(
  doc: typings.codemirror.mod.Doc,
  eventName: typings.codemirror.codemirrorStrings.beforeSelectionChange,
  handler: js.Function2[
  /* instance */ typings.codemirror.mod.Editor, 
  /* obj */ typings.codemirror.mod.EditorSelectionChange, 
  scala.Unit
]
): scala.Unit = (typings.codemirror.mod.^.asInstanceOf[js.Dynamic].applyDynamic("on")(doc.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

/** Fired whenever a change occurs to the document. changeObj has a similar type as the object passed to the editor's "change" event,
  but it never has a next property, because document change events are not batched (whereas editor change events are). */
inline def on_change(
  doc: typings.codemirror.mod.Doc,
  eventName: typings.codemirror.codemirrorStrings.change,
  handler: js.Function2[
  /* instance */ typings.codemirror.mod.Doc, 
  /* changeObj */ typings.codemirror.mod.EditorChange, 
  scala.Unit
]
): scala.Unit = (typings.codemirror.mod.^.asInstanceOf[js.Dynamic].applyDynamic("on")(doc.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
/** Fires when the line's text content is changed in any way (but the line is not deleted outright).
  The change object is similar to the one passed to change event on the editor object. */
inline def on_change(
  line: typings.codemirror.mod.LineHandle,
  eventName: typings.codemirror.codemirrorStrings.change,
  handler: js.Function2[
  /* line */ typings.codemirror.mod.LineHandle, 
  /* changeObj */ typings.codemirror.mod.EditorChange, 
  scala.Unit
]
): scala.Unit = (typings.codemirror.mod.^.asInstanceOf[js.Dynamic].applyDynamic("on")(line.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

/** Fired when the range is cleared, either through cursor movement in combination with clearOnEnter or through a call to its clear() method.
  Will only be fired once per handle. Note that deleting the range through text editing does not fire this event,
  because an undo action might bring the range back into existence. */
inline def on_clear(
  marker: typings.codemirror.mod.TextMarker,
  eventName: typings.codemirror.codemirrorStrings.clear,
  handler: js.Function0[scala.Unit]
): scala.Unit = (typings.codemirror.mod.^.asInstanceOf[js.Dynamic].applyDynamic("on")(marker.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

/** Fired whenever the cursor or selection in this document changes. */
inline def on_cursorActivity(
  doc: typings.codemirror.mod.Doc,
  eventName: typings.codemirror.codemirrorStrings.cursorActivity,
  handler: js.Function1[/* instance */ typings.codemirror.mod.Editor, scala.Unit]
): scala.Unit = (typings.codemirror.mod.^.asInstanceOf[js.Dynamic].applyDynamic("on")(doc.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

/** Will be fired when the line object is deleted. A line object is associated with the start of the line.
  Mostly useful when you need to find out when your gutter markers on a given line are removed. */
inline def on_delete(
  line: typings.codemirror.mod.LineHandle,
  eventName: typings.codemirror.codemirrorStrings.delete,
  handler: js.Function0[scala.Unit]
): scala.Unit = (typings.codemirror.mod.^.asInstanceOf[js.Dynamic].applyDynamic("on")(line.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

/** Fired when the last part of the marker is removed from the document by editing operations. */
inline def on_hide(
  marker: typings.codemirror.mod.TextMarker,
  eventName: typings.codemirror.codemirrorStrings.hide,
  handler: js.Function0[scala.Unit]
): scala.Unit = (typings.codemirror.mod.^.asInstanceOf[js.Dynamic].applyDynamic("on")(marker.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

/** Fired whenever the editor re-adds the widget to the DOM. This will happen once right after the widget is added (if it is scrolled into view),
  and then again whenever it is scrolled out of view and back in again, or when changes to the editor options
  or the line the widget is on require the widget to be redrawn. */
inline def on_redraw(
  line: typings.codemirror.mod.LineWidget,
  eventName: typings.codemirror.codemirrorStrings.redraw,
  handler: js.Function0[scala.Unit]
): scala.Unit = (typings.codemirror.mod.^.asInstanceOf[js.Dynamic].applyDynamic("on")(line.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

/** Fired when, after the marker was removed by editing, a undo operation brought the marker back. */
inline def on_unhide(
  marker: typings.codemirror.mod.TextMarker,
  eventName: typings.codemirror.codemirrorStrings.unhide,
  handler: js.Function0[scala.Unit]
): scala.Unit = (typings.codemirror.mod.^.asInstanceOf[js.Dynamic].applyDynamic("on")(marker.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

/**
  * Utility function from the overlay.js addon that allows modes to be combined. The mode given as the base argument takes care of
  * most of the normal mode functionality, but a second (typically simple) mode is used, which can override the style of text.
  * Both modes get to parse all of the text, but when both assign a non-null style to a piece of code, the overlay wins, unless
  * the combine argument was true and not overridden, or state.overlay.combineTokens was true, in which case the styles are combined.
  */
inline def overlayMode[T, S](base: typings.codemirror.mod.Mode[T], overlay: typings.codemirror.mod.Mode[S]): typings.codemirror.mod.Mode[js.Any] = (typings.codemirror.mod.^.asInstanceOf[js.Dynamic].applyDynamic("overlayMode")(base.asInstanceOf[js.Any], overlay.asInstanceOf[js.Any])).asInstanceOf[typings.codemirror.mod.Mode[js.Any]]
inline def overlayMode[T, S](
  base: typings.codemirror.mod.Mode[T],
  overlay: typings.codemirror.mod.Mode[S],
  combine: scala.Boolean
): typings.codemirror.mod.Mode[js.Any] = (typings.codemirror.mod.^.asInstanceOf[js.Dynamic].applyDynamic("overlayMode")(base.asInstanceOf[js.Any], overlay.asInstanceOf[js.Any], combine.asInstanceOf[js.Any])).asInstanceOf[typings.codemirror.mod.Mode[js.Any]]

/** Registers a helper value with the given name in the given namespace (type). This is used to define functionality
  that may be looked up by mode. Will create (if it doesn't already exist) a property on the CodeMirror object for
  the given type, pointing to an object that maps names to values. I.e. after doing
  CodeMirror.registerHelper("hint", "foo", myFoo), the value CodeMirror.hint.foo will point to myFoo. */
inline def registerHelper(namespace: java.lang.String, name: java.lang.String, helper: js.Any): scala.Unit = (typings.codemirror.mod.^.asInstanceOf[js.Dynamic].applyDynamic("registerHelper")(namespace.asInstanceOf[js.Any], name.asInstanceOf[js.Any], helper.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

/** Various CodeMirror-related objects emit events, which allow client code to react to various situations.
  Handlers for such events can be registered with the on and off methods on the objects that the event fires on.
  To fire your own events, use CodeMirror.signal(target, name, args...), where target is a non-DOM-node object. */
inline def signal(target: js.Any, name: java.lang.String, args: js.Any*): scala.Unit = (typings.codemirror.mod.^.asInstanceOf[js.Dynamic].applyDynamic("signal")(target.asInstanceOf[js.Any], name.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

/** Split a string by new line. */
inline def splitLines(text: java.lang.String): js.Array[java.lang.String] = typings.codemirror.mod.^.asInstanceOf[js.Dynamic].applyDynamic("splitLines")(text.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]

/** Call startState of the mode if available, otherwise return true */
inline def startState(mode: typings.codemirror.mod.Mode[js.Any]): js.Any | scala.Boolean = typings.codemirror.mod.^.asInstanceOf[js.Dynamic].applyDynamic("startState")(mode.asInstanceOf[js.Any]).asInstanceOf[js.Any | scala.Boolean]
inline def startState(mode: typings.codemirror.mod.Mode[js.Any], a1: js.Any): js.Any | scala.Boolean = (typings.codemirror.mod.^.asInstanceOf[js.Dynamic].applyDynamic("startState")(mode.asInstanceOf[js.Any], a1.asInstanceOf[js.Any])).asInstanceOf[js.Any | scala.Boolean]
inline def startState(mode: typings.codemirror.mod.Mode[js.Any], a1: js.Any, a2: js.Any): js.Any | scala.Boolean = (typings.codemirror.mod.^.asInstanceOf[js.Dynamic].applyDynamic("startState")(mode.asInstanceOf[js.Any], a1.asInstanceOf[js.Any], a2.asInstanceOf[js.Any])).asInstanceOf[js.Any | scala.Boolean]
inline def startState(mode: typings.codemirror.mod.Mode[js.Any], a1: scala.Unit, a2: js.Any): js.Any | scala.Boolean = (typings.codemirror.mod.^.asInstanceOf[js.Dynamic].applyDynamic("startState")(mode.asInstanceOf[js.Any], a1.asInstanceOf[js.Any], a2.asInstanceOf[js.Any])).asInstanceOf[js.Any | scala.Boolean]

/** It contains a string that indicates the version of the library. This is a triple of integers "major.minor.patch",
  where patch is zero for releases, and something else (usually one) for dev snapshots. */
inline def version: java.lang.String = typings.codemirror.mod.^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[java.lang.String]
inline def version_=(x: java.lang.String): scala.Unit = typings.codemirror.mod.^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])

/**
  * A function that calls the updateLintingCallback with any errors found during the linting process.
  */
type AsyncLinter = js.Function4[
/* content */ java.lang.String, 
/* updateLintingCallback */ typings.codemirror.mod.UpdateLintingCallback, 
/* options */ typings.codemirror.mod.LintStateOptions | js.Any, 
/* codeMirror */ typings.codemirror.mod.Editor, 
scala.Unit]

type HintFunction = js.Function1[/* cm */ typings.codemirror.mod.Editor, typings.codemirror.mod.Hints]

type KeyMap = org.scalablytyped.runtime.StringDictionary[
typings.codemirror.codemirrorBooleans.`false` | java.lang.String | (js.Function1[
  /* instance */ typings.codemirror.mod.Editor, 
  scala.Unit | typings.codemirror.anon.ToString
])]

/**
  * A function that return errors found during the linting process.
  */
type Linter = js.Function3[
/* content */ java.lang.String, 
/* options */ typings.codemirror.mod.LintStateOptions | js.Any, 
/* codeMirror */ typings.codemirror.mod.Editor, 
js.Array[typings.codemirror.mod.Annotation] | js.Thenable[js.Array[typings.codemirror.mod.Annotation]]]

type MimeModeMap = org.scalablytyped.runtime.StringDictionary[js.Any]

/**
  * A function that, given a CodeMirror configuration object and an optional mode configuration object, returns a mode object.
  */
type ModeFactory[T] = js.Function2[
/* config */ typings.codemirror.mod.EditorConfiguration, 
/* modeOptions */ js.UndefOr[js.Any], 
typings.codemirror.mod.Mode[T]]

type ModeMap = org.scalablytyped.runtime.StringDictionary[typings.codemirror.mod.ModeFactory[js.Any]]

/**
  * A function that, given an array of annotations, updates the CodeMirror linting GUI with those annotations
  */
type UpdateLintingCallback = js.Function2[
/* codeMirror */ typings.codemirror.mod.Editor, 
/* annotations */ js.Array[typings.codemirror.mod.Annotation], 
scala.Unit]
