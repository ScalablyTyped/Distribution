package typings.codemirror

import typings.codemirror.codemirrorStrings.CodeMirrorDotPASS
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
import typings.codemirror.mod.CommandActions
import typings.codemirror.mod.Doc
import typings.codemirror.mod.DocConstructor
import typings.codemirror.mod.Editor
import typings.codemirror.mod.EditorChange
import typings.codemirror.mod.EditorChangeCancellable
import typings.codemirror.mod.EditorConfiguration
import typings.codemirror.mod.EditorFromTextArea
import typings.codemirror.mod.EditorSelectionChange
import typings.codemirror.mod.KeyMap
import typings.codemirror.mod.LineHandle
import typings.codemirror.mod.LineWidget
import typings.codemirror.mod.MergeView.MergeViewEditor
import typings.codemirror.mod.MergeView.MergeViewEditorConfiguration
import typings.codemirror.mod.MimeModeMap
import typings.codemirror.mod.Mode
import typings.codemirror.mod.ModeFactory
import typings.codemirror.mod.ModeMap
import typings.codemirror.mod.Position
import typings.codemirror.mod.PositionConstructor
import typings.codemirror.mod.StringStream
import typings.codemirror.mod.StringStreamConstructor
import typings.codemirror.mod.TernConstructor
import typings.codemirror.mod.TernOptions
import typings.codemirror.mod.TextMarker
import typings.std.HTMLElement
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object CodeMirror {
    
    inline def apply(callback: js.Function1[/* host */ HTMLElement, Unit]): Editor = ^.asInstanceOf[js.Dynamic].apply(callback.asInstanceOf[js.Any]).asInstanceOf[Editor]
    inline def apply(callback: js.Function1[/* host */ HTMLElement, Unit], options: EditorConfiguration): Editor = (^.asInstanceOf[js.Dynamic].apply(callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Editor]
    inline def apply(host: HTMLElement): Editor = ^.asInstanceOf[js.Dynamic].apply(host.asInstanceOf[js.Any]).asInstanceOf[Editor]
    inline def apply(host: HTMLElement, options: EditorConfiguration): Editor = (^.asInstanceOf[js.Dynamic].apply(host.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Editor]
    
    @JSGlobal("CodeMirror")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("CodeMirror.Doc")
    @js.native
    def Doc: DocConstructor = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("CodeMirror.Doc")
    @js.native
    class DocCls protected ()
      extends StObject
         with Doc {
      def this(text: String) = this()
      def this(text: String, mode: js.Any) = this()
      def this(text: String, mode: js.Any, firstLineNumber: Double) = this()
      def this(text: String, mode: Unit, firstLineNumber: Double) = this()
      def this(text: String, mode: js.Any, firstLineNumber: Double, lineSep: String) = this()
      def this(text: String, mode: js.Any, firstLineNumber: Unit, lineSep: String) = this()
      def this(text: String, mode: Unit, firstLineNumber: Double, lineSep: String) = this()
      def this(text: String, mode: Unit, firstLineNumber: Unit, lineSep: String) = this()
    }
    
    inline def Doc_=(x: DocConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Doc")(x.asInstanceOf[js.Any])
    
    /**
      * A function that calculates either a two-way or three-way merge between different sets of content.
      */
    inline def MergeView(element: HTMLElement): MergeViewEditor = ^.asInstanceOf[js.Dynamic].applyDynamic("MergeView")(element.asInstanceOf[js.Any]).asInstanceOf[MergeViewEditor]
    inline def MergeView(element: HTMLElement, options: MergeViewEditorConfiguration): MergeViewEditor = (^.asInstanceOf[js.Dynamic].applyDynamic("MergeView")(element.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[MergeViewEditor]
    
    object Pass {
      
      @JSGlobal("CodeMirror.Pass")
      @js.native
      val ^ : js.Any = js.native
      
      inline def toString_(): CodeMirrorDotPASS = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")().asInstanceOf[CodeMirrorDotPASS]
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("CodeMirror.Pos")
    @js.native
    class Pos protected ()
      extends StObject
         with Position {
      def this(line: Double) = this()
      def this(line: Double, ch: Double) = this()
      def this(line: Double, ch: Double, sticky: String) = this()
      def this(line: Double, ch: Unit, sticky: String) = this()
      
      /* CompleteClass */
      var ch: Double = js.native
      
      /* CompleteClass */
      var line: Double = js.native
    }
    @JSGlobal("CodeMirror.Pos")
    @js.native
    def Pos: PositionConstructor = js.native
    inline def Pos_=(x: PositionConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Pos")(x.asInstanceOf[js.Any])
    
    @JSGlobal("CodeMirror.StringStream")
    @js.native
    def StringStream: StringStreamConstructor = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("CodeMirror.StringStream")
    @js.native
    class StringStreamCls protected ()
      extends StObject
         with StringStream {
      def this(text: String) = this()
    }
    
    inline def StringStream_=(x: StringStreamConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("StringStream")(x.asInstanceOf[js.Any])
    
    @JSGlobal("CodeMirror.TernServer")
    @js.native
    val TernServer: TernConstructor = js.native
    
    /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
    @JSGlobal("CodeMirror.TernServer")
    @js.native
    class TernServerCls ()
      extends StObject
         with typings.codemirror.mod.TernServer {
      def this(options: TernOptions) = this()
    }
    
    /** Utility function that computes an end position from a change (an object with from, to, and text properties, as passed to various event handlers).
      The returned position will be the end of the changed range, after the change is applied. */
    inline def changeEnd(change: EditorChange): Position = ^.asInstanceOf[js.Dynamic].applyDynamic("changeEnd")(change.asInstanceOf[js.Any]).asInstanceOf[Position]
    
    /** Compare two positions, return 0 if they are the same, a negative number when a is less, and a positive number otherwise. */
    inline def cmpPos(a: Position, b: Position): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("cmpPos")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /**
      * Commands are parameter-less actions that can be performed on an editor.
      * Their main use is for key bindings.
      * Commands are defined by adding properties to the CodeMirror.commands object.
      */
    @JSGlobal("CodeMirror.commands")
    @js.native
    def commands: CommandActions = js.native
    inline def commands_=(x: CommandActions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("commands")(x.asInstanceOf[js.Any])
    
    /** Find the column position at a given string index using a given tabsize. */
    inline def countColumn(line: String, index: Double, tabSize: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("countColumn")(line.asInstanceOf[js.Any], index.asInstanceOf[js.Any], tabSize.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def countColumn(line: String, index: Null, tabSize: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("countColumn")(line.asInstanceOf[js.Any], index.asInstanceOf[js.Any], tabSize.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    /** An object containing default values for all options.
      You can assign to its properties to modify defaults (though this won't affect editors that have already been created). */
    @JSGlobal("CodeMirror.defaults")
    @js.native
    def defaults: js.Any = js.native
    inline def defaults_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
    
    /** Like defineExtension, but the method will be added to the interface for Doc objects instead. */
    inline def defineDocExtension(name: String, value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineDocExtension")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** If you want to define extra methods in terms of the CodeMirror API, it is possible to use defineExtension.
      This will cause the given value(usually a method) to be added to all CodeMirror instances created from then on. */
    inline def defineExtension(name: String, value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineExtension")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** If your extention just needs to run some code whenever a CodeMirror instance is initialized, use CodeMirror.defineInitHook.
      Give it a function as its only argument, and from then on, that function will be called (with the instance as argument)
      whenever a new CodeMirror instance is initialized. */
    inline def defineInitHook(func: js.Function): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("defineInitHook")(func.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def defineMIME(mime: String, modeSpec: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineMIME")(mime.asInstanceOf[js.Any], modeSpec.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * id will be the id for the defined mode. Typically, you should use this second argument to defineMode as your module scope function
      * (modes should not leak anything into the global scope!), i.e. write your whole mode inside this function.
      */
    inline def defineMode(id: String, modefactory: ModeFactory[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineMode")(id.asInstanceOf[js.Any], modefactory.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * id will be the id for the defined mode. Typically, you should use this second argument to defineMode as your module scope function
      * (modes should not leak anything into the global scope!), i.e. write your whole mode inside this function.
      */
    inline def defineMode_T[T](id: String, modefactory: ModeFactory[T]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineMode")(id.asInstanceOf[js.Any], modefactory.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Similarly, defineOption can be used to define new options for CodeMirror.
      The updateFunc will be called with the editor instance and the new value when an editor is initialized,
      and whenever the option is modified through setOption. */
    inline def defineOption(name: String, default_ : js.Any, updateFunc: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("defineOption")(name.asInstanceOf[js.Any], default_.asInstanceOf[js.Any], updateFunc.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Sometimes, it is useful to add or override mode object properties from external code.
      The CodeMirror.extendMode function can be used to add properties to mode objects produced for a specific mode.
      Its first argument is the name of the mode, its second an object that specifies the properties that should be added.
      This is mostly useful to add utilities that can later be looked up through getMode. */
    inline def extendMode(name: String, properties: Mode[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("extendMode")(name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def fromTextArea(host: HTMLTextAreaElement): EditorFromTextArea = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTextArea")(host.asInstanceOf[js.Any]).asInstanceOf[EditorFromTextArea]
    inline def fromTextArea(host: HTMLTextAreaElement, options: EditorConfiguration): EditorFromTextArea = (^.asInstanceOf[js.Dynamic].applyDynamic("fromTextArea")(host.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[EditorFromTextArea]
    
    /**
      * The first argument is a configuration object as passed to the mode constructor function, and the second argument
      * is a mode specification as in the EditorConfiguration mode option.
      */
    inline def getMode[T](config: EditorConfiguration, mode: js.Any): Mode[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("getMode")(config.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Mode[T]]
    
    /** Given a state object, returns a {state, mode} object with the inner mode and its state for the current position. */
    inline def innerMode(mode: Mode[js.Any], state: js.Any): typings.codemirror.anon.Mode = (^.asInstanceOf[js.Dynamic].applyDynamic("innerMode")(mode.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[typings.codemirror.anon.Mode]
    
    /** Check if a char is part of an alphabet. */
    inline def isWordChar(ch: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isWordChar")(ch.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Maps MIME types to mode specs.
      */
    @JSGlobal("CodeMirror.mimeModes")
    @js.native
    def mimeModes: MimeModeMap = js.native
    inline def mimeModes_=(x: MimeModeMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mimeModes")(x.asInstanceOf[js.Any])
    
    /**
      * Maps mode names to their constructors
      */
    @JSGlobal("CodeMirror.modes")
    @js.native
    def modes: ModeMap = js.native
    inline def modes_=(x: ModeMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("modes")(x.asInstanceOf[js.Any])
    
    /** Modify a keymap to normalize modifier order and properly recognize multi-stroke bindings. */
    inline def normalizeKeyMap(km: KeyMap): KeyMap = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeKeyMap")(km.asInstanceOf[js.Any]).asInstanceOf[KeyMap]
    
    inline def off(element: js.Any, eventName: String, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def off_beforeChange(
      doc: Doc,
      eventName: beforeChange,
      handler: js.Function2[/* instance */ Doc, /* change */ EditorChangeCancellable, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(doc.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def off_beforeCursorEnter(marker: TextMarker, eventName: beforeCursorEnter, handler: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(marker.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def off_beforeSelectionChange(
      doc: Doc,
      eventName: beforeSelectionChange,
      handler: js.Function2[/* instance */ Editor, /* obj */ EditorSelectionChange, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(doc.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def off_change(
      doc: Doc,
      eventName: change,
      handler: js.Function2[/* instance */ Doc, /* changeObj */ EditorChange, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(doc.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def off_change(
      line: LineHandle,
      eventName: change,
      handler: js.Function2[/* line */ LineHandle, /* changeObj */ EditorChange, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(line.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def off_clear(marker: TextMarker, eventName: clear, handler: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(marker.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def off_cursorActivity(doc: Doc, eventName: cursorActivity, handler: js.Function1[/* instance */ Editor, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(doc.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def off_delete(line: LineHandle, eventName: delete, handler: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(line.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def off_hide(marker: TextMarker, eventName: hide, handler: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(marker.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def off_redraw(line: LineWidget, eventName: redraw, handler: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(line.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def off_unhide(marker: TextMarker, eventName: unhide, handler: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(marker.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def on(element: js.Any, eventName: String, handler: js.Function): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** See the description of the same event on editor instances. */
    inline def on_beforeChange(
      doc: Doc,
      eventName: beforeChange,
      handler: js.Function2[/* instance */ Doc, /* change */ EditorChangeCancellable, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(doc.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Fired when the cursor enters the marked range. From this event handler, the editor state may be inspected but not modified,
      with the exception that the range on which the event fires may be cleared. */
    inline def on_beforeCursorEnter(marker: TextMarker, eventName: beforeCursorEnter, handler: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(marker.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Equivalent to the event by the same name as fired on editor instances. */
    inline def on_beforeSelectionChange(
      doc: Doc,
      eventName: beforeSelectionChange,
      handler: js.Function2[/* instance */ Editor, /* obj */ EditorSelectionChange, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(doc.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Fired whenever a change occurs to the document. changeObj has a similar type as the object passed to the editor's "change" event,
      but it never has a next property, because document change events are not batched (whereas editor change events are). */
    inline def on_change(
      doc: Doc,
      eventName: change,
      handler: js.Function2[/* instance */ Doc, /* changeObj */ EditorChange, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(doc.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /** Fires when the line's text content is changed in any way (but the line is not deleted outright).
      The change object is similar to the one passed to change event on the editor object. */
    inline def on_change(
      line: LineHandle,
      eventName: change,
      handler: js.Function2[/* line */ LineHandle, /* changeObj */ EditorChange, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(line.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Fired when the range is cleared, either through cursor movement in combination with clearOnEnter or through a call to its clear() method.
      Will only be fired once per handle. Note that deleting the range through text editing does not fire this event,
      because an undo action might bring the range back into existence. */
    inline def on_clear(marker: TextMarker, eventName: clear, handler: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(marker.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Fired whenever the cursor or selection in this document changes. */
    inline def on_cursorActivity(doc: Doc, eventName: cursorActivity, handler: js.Function1[/* instance */ Editor, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(doc.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Will be fired when the line object is deleted. A line object is associated with the start of the line.
      Mostly useful when you need to find out when your gutter markers on a given line are removed. */
    inline def on_delete(line: LineHandle, eventName: delete, handler: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(line.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Fired when the last part of the marker is removed from the document by editing operations. */
    inline def on_hide(marker: TextMarker, eventName: hide, handler: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(marker.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Fired whenever the editor re-adds the widget to the DOM. This will happen once right after the widget is added (if it is scrolled into view),
      and then again whenever it is scrolled out of view and back in again, or when changes to the editor options
      or the line the widget is on require the widget to be redrawn. */
    inline def on_redraw(line: LineWidget, eventName: redraw, handler: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(line.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Fired when, after the marker was removed by editing, a undo operation brought the marker back. */
    inline def on_unhide(marker: TextMarker, eventName: unhide, handler: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(marker.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * Utility function from the overlay.js addon that allows modes to be combined. The mode given as the base argument takes care of
      * most of the normal mode functionality, but a second (typically simple) mode is used, which can override the style of text.
      * Both modes get to parse all of the text, but when both assign a non-null style to a piece of code, the overlay wins, unless
      * the combine argument was true and not overridden, or state.overlay.combineTokens was true, in which case the styles are combined.
      */
    inline def overlayMode[T, S](base: Mode[T], overlay: Mode[S]): Mode[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("overlayMode")(base.asInstanceOf[js.Any], overlay.asInstanceOf[js.Any])).asInstanceOf[Mode[js.Any]]
    inline def overlayMode[T, S](base: Mode[T], overlay: Mode[S], combine: Boolean): Mode[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("overlayMode")(base.asInstanceOf[js.Any], overlay.asInstanceOf[js.Any], combine.asInstanceOf[js.Any])).asInstanceOf[Mode[js.Any]]
    
    /** Registers a helper value with the given name in the given namespace (type). This is used to define functionality
      that may be looked up by mode. Will create (if it doesn't already exist) a property on the CodeMirror object for
      the given type, pointing to an object that maps names to values. I.e. after doing
      CodeMirror.registerHelper("hint", "foo", myFoo), the value CodeMirror.hint.foo will point to myFoo. */
    inline def registerHelper(namespace: String, name: String, helper: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerHelper")(namespace.asInstanceOf[js.Any], name.asInstanceOf[js.Any], helper.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Various CodeMirror-related objects emit events, which allow client code to react to various situations.
      Handlers for such events can be registered with the on and off methods on the objects that the event fires on.
      To fire your own events, use CodeMirror.signal(target, name, args...), where target is a non-DOM-node object. */
    inline def signal(target: js.Any, name: String, args: js.Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("signal")(target.asInstanceOf[js.Any], name.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /** Split a string by new line. */
    inline def splitLines(text: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitLines")(text.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    
    /** Call startState of the mode if available, otherwise return true */
    inline def startState(mode: Mode[js.Any]): js.Any | Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("startState")(mode.asInstanceOf[js.Any]).asInstanceOf[js.Any | Boolean]
    inline def startState(mode: Mode[js.Any], a1: js.Any): js.Any | Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("startState")(mode.asInstanceOf[js.Any], a1.asInstanceOf[js.Any])).asInstanceOf[js.Any | Boolean]
    inline def startState(mode: Mode[js.Any], a1: js.Any, a2: js.Any): js.Any | Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("startState")(mode.asInstanceOf[js.Any], a1.asInstanceOf[js.Any], a2.asInstanceOf[js.Any])).asInstanceOf[js.Any | Boolean]
    inline def startState(mode: Mode[js.Any], a1: Unit, a2: js.Any): js.Any | Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("startState")(mode.asInstanceOf[js.Any], a1.asInstanceOf[js.Any], a2.asInstanceOf[js.Any])).asInstanceOf[js.Any | Boolean]
    
    /** It contains a string that indicates the version of the library. This is a triple of integers "major.minor.patch",
      where patch is zero for releases, and something else (usually one) for dev snapshots. */
    @JSGlobal("CodeMirror.version")
    @js.native
    def version: String = js.native
    inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  }
}
