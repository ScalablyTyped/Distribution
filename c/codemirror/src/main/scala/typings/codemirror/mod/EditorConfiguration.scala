package typings.codemirror.mod

import typings.codemirror.anon.Delay
import typings.std.DragEvent
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditorConfiguration extends js.Object {
  
  /** When enabled (off by default), an extra CSS class will be added to each token, indicating the (inner) mode that produced it, prefixed with "cm-m-".
    For example, tokens from the XML mode will get the cm-m-xml class. */
  var addModeClass: js.UndefOr[Boolean] = js.native
  
  /** When set (default is null) only files whose type is in the array can be dropped into the editor.
    The strings should be MIME types, and will be checked against the type of the File object as reported by the browser. */
  var allowDropFileTypes: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Will auto-close brackets and quotes when typed.
    * By default, it'll auto-close ()[]{}''"", but you can pass it a string similar to that (containing pairs of matching characters),
    * or an object with pairs and optionally explode properties to customize it.
    */
  var autoCloseBrackets: js.UndefOr[AutoCloseBrackets | Boolean | String] = js.native
  
  /**
    * Will auto-close XML tags when '>' or '/' is typed.
    * Depends on the fold/xml-fold.js addon.
    */
  var autoCloseTags: js.UndefOr[AutoCloseTags | Boolean] = js.native
  
  // if true, it will be refreshed the first time the editor becomes visible.
  // you can pass delay (msec) time as polling duration
  var autoRefresh: js.UndefOr[Boolean | Delay] = js.native
  
  /** Specifies whether or not autocapitalization will be enabled on the input. */
  var autocapitalize: js.UndefOr[Boolean] = js.native
  
  /** Specifies whether or not autocorrect will be enabled on the input. */
  var autocorrect: js.UndefOr[Boolean] = js.native
  
  /** Can be used to make CodeMirror focus itself on initialization. Defaults to off.
    When fromTextArea is used, and no explicit value is given for this option, it will be set to true when either the source textarea is focused,
    or it has an autofocus attribute and no other element is focused. */
  var autofocus: js.UndefOr[Boolean] = js.native
  
  /**
    * When fixedGutter is on, and there is a horizontal scrollbar, by default the gutter will be visible to the left of this scrollbar.
    * If this option is set to true, it will be covered by an element with class CodeMirror-gutter-filler.
    */
  var coverGutterNextToScrollbar: js.UndefOr[Boolean] = js.native
  
  /** Half - period in milliseconds used for cursor blinking. The default blink rate is 530ms. */
  var cursorBlinkRate: js.UndefOr[Double] = js.native
  
  /** Determines the height of the cursor. Default is 1 , meaning it spans the whole height of the line.
    For some fonts (and by some tastes) a smaller height (for example 0.85),
    which causes the cursor to not reach all the way to the bottom of the line, looks better */
  var cursorHeight: js.UndefOr[Double] = js.native
  
  /**
    * How much extra space to always keep above and below the cursor when
    * approaching the top or bottom of the visible view in a scrollable document. Default is 0.
    */
  var cursorScrollMargin: js.UndefOr[Double] = js.native
  
  /** Controls whether drag-and - drop is enabled. On by default. */
  var dragDrop: js.UndefOr[Boolean] = js.native
  
  /** Configures whether the editor should re-indent the current line when a character is typed
    that might change its proper indentation (only works if the mode supports indentation). Default is true. */
  var electricChars: js.UndefOr[Boolean] = js.native
  
  /** Can be used to specify extra keybindings for the editor, alongside the ones defined by keyMap. Should be either null, or a valid keymap value. */
  var extraKeys: js.UndefOr[String | KeyMap] = js.native
  
  /** At which number to start counting lines. Default is 1. */
  var firstLineNumber: js.UndefOr[Double] = js.native
  
  /** Determines whether the gutter scrolls along with the content horizontally (false)
    or whether it stays fixed during horizontal scrolling (true, the default). */
  var fixedGutter: js.UndefOr[Boolean] = js.native
  
  /** By default, CodeMirror will combine adjacent tokens into a single span if they have the same class.
    This will result in a simpler DOM tree, and thus perform better. With some kinds of styling(such as rounded corners),
    this will change the way the document looks. You can set this option to false to disable this behavior. */
  var flattenSpans: js.UndefOr[Boolean] = js.native
  
  /** Provides an option foldGutter, which can be used to create a gutter with markers indicating the blocks that can be folded. */
  var foldGutter: js.UndefOr[Boolean] = js.native
  
  /**
    * When set to true, will make the editor full-screen (as in, taking up the whole browser window).
    * Depends on fullscreen.css
    * @see {@link https://codemirror.net/doc/manual.html#addon_fullscreen}
    * @default false
    */
  var fullScreen: js.UndefOr[Boolean] = js.native
  
  /** Can be used to add extra gutters (beyond or instead of the line number gutter).
    Should be an array of CSS class names, each of which defines a width (and optionally a background),
    and which will be used to draw the background of the gutters.
    May include the CodeMirror-linenumbers class, in order to explicitly set the position of the line number gutter
    (it will default to be to the right of all other gutters). These class names are the keys passed to setGutterMarker. */
  var gutters: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Adds a highlightSelectionMatches option that can be enabled to highlight all instances of a currently selected word.
    * When enabled, it causes the current word to be highlighted when nothing is selected (defaults to off).
    */
  var highlightSelectionMatches: js.UndefOr[HighlightSelectionMatches | Boolean] = js.native
  
  var hintOptions: js.UndefOr[ShowHintOptions] = js.native
  
  /** The period of inactivity (in milliseconds) that will cause a new history event to be started when typing or deleting. Defaults to 500. */
  var historyEventDelay: js.UndefOr[Double] = js.native
  
  /** How many spaces a block (whatever that means in the edited language) should be indented. The default is 2. */
  var indentUnit: js.UndefOr[Double] = js.native
  
  /** Whether, when indenting, the first N*tabSize spaces should be replaced by N tabs. Default is false. */
  var indentWithTabs: js.UndefOr[Boolean] = js.native
  
  /**
    * Selects the way CodeMirror handles input and focus.
    * The core library defines the "textarea" and "contenteditable" input models.
    * On mobile browsers, the default is "contenteditable". On desktop browsers, the default is "textarea".
    * Support for IME and screen readers is better in the "contenteditable" model.
    */
  var inputStyle: js.UndefOr[InputStyle] = js.native
  
  /** Configures the keymap to use. The default is "default", which is the only keymap defined in codemirror.js itself.
    Extra keymaps are found in the keymap directory. See the section on keymaps for more information. */
  var keyMap: js.UndefOr[String] = js.native
  
  /** A function used to format line numbers. The function is passed the line number, and should return a string that will be shown in the gutter. */
  var lineNumberFormatter: js.UndefOr[js.Function1[/* line */ Double, String]] = js.native
  
  /** Whether to show line numbers to the left of the editor. */
  var lineNumbers: js.UndefOr[Boolean] = js.native
  
  /** When enabled, which is the default, doing copy or cut when there is no selection will copy or cut the whole lines that have cursors on them. */
  var lineWiseCopyCut: js.UndefOr[Boolean] = js.native
  
  /** Whether CodeMirror should scroll or wrap for long lines. Defaults to false (scroll). */
  var lineWrapping: js.UndefOr[Boolean] = js.native
  
  /** Optional lint configuration to be used in conjunction with CodeMirror's linter addon. */
  var lint: js.UndefOr[Boolean | LintStateOptions | Linter | AsyncLinter] = js.native
  
  //  When set to true or an options object, causes matching brackets to be highlighted whenever the cursor is next to them.
  var matchBrackets: js.UndefOr[MatchBrackets | Boolean] = js.native
  
  /**
    * When enabled will cause the tags around the cursor to be highlighted (using the CodeMirror-matchingtag class).
    * Depends on the addon/fold/xml-fold.js addon.
    */
  var matchTags: js.UndefOr[MatchTags | Boolean] = js.native
  
  /** When highlighting long lines, in order to stay responsive, the editor will give up and simply style
    the rest of the line as plain text when it reaches a certain position. The default is 10000.
    You can set this to Infinity to turn off this behavior. */
  var maxHighlightLength: js.UndefOr[Double] = js.native
  
  /** string|object. The mode to use. When not given, this will default to the first mode that was loaded.
    It may be a string, which either simply names the mode or is a MIME type associated with the mode.
    Alternatively, it may be an object containing configuration options for the mode,
    with a name property that names the mode (for example {name: "javascript", json: true}). */
  var mode: js.UndefOr[js.Any] = js.native
  
  /** When given , this will be called when the editor is handling a dragenter , dragover , or drop event.
    It will be passed the editor instance and the event object as arguments.
    The callback can choose to handle the event itself , in which case it should return true to indicate that CodeMirror should not do anything further. */
  var onDragEvent: js.UndefOr[js.Function2[/* instance */ Editor, /* event */ DragEvent, Boolean]] = js.native
  
  /** This provides a rather low - level hook into CodeMirror's key handling.
    If provided, this function will be called on every keydown, keyup, and keypress event that CodeMirror captures.
    It will be passed two arguments, the editor instance and the key event.
    This key event is pretty much the raw key event, except that a stop() method is always added to it.
    You could feed it to, for example, jQuery.Event to further normalize it.
    This function can inspect the key event, and handle it if it wants to.
    It may return true to tell CodeMirror to ignore the event.
    Be wary that, on some browsers, stopping a keydown does not stop the keypress from firing, whereas on others it does.
    If you respond to an event, you should probably inspect its type property and only do something when it is keydown
    (or keypress for actions that need character data). */
  var onKeyEvent: js.UndefOr[js.Function2[/* instance */ Editor, /* event */ KeyboardEvent, Boolean]] = js.native
  
  /** When pasting something from an external source (not from the editor itself), if the number of lines matches the number of selection, CodeMirror will by default insert one line per selection. You can set this to false to disable that behavior. */
  var pasteLinesPerSelection: js.UndefOr[Boolean] = js.native
  
  /**
    * Adds a placeholder option that can be used to make content appear in the editor when it is empty and not focused.
    * It can hold either a string or a DOM node. Also gives the editor a CodeMirror-empty CSS class whenever it doesn't contain any text.
    */
  var placeholder: js.UndefOr[String] = js.native
  
  /** Indicates how quickly CodeMirror should poll its input textarea for changes(when focused).
    Most input is captured by events, but some things, like IME input on some browsers, don't generate events that allow CodeMirror to properly detect it.
    Thus, it polls. Default is 100 milliseconds. */
  var pollInterval: js.UndefOr[Double] = js.native
  
  /** boolean|string. This disables editing of the editor content by the user. If the special value "nocursor" is given (instead of simply true), focusing of the editor is also disallowed. */
  var readOnly: js.UndefOr[js.Any] = js.native
  
  /** Controls whether, when the context menu is opened with a click outside of the current selection,
    the cursor is moved to the point of the click. Defaults to true. */
  var resetSelectionOnContextMenu: js.UndefOr[Boolean] = js.native
  
  /** Determines whether horizontal cursor movement through right-to-left (Arabic, Hebrew) text
    is visual (pressing the left arrow moves the cursor left)
    or logical (pressing the left arrow moves to the next lower index in the string, which is visually right in right-to-left text).
    The default is false on Windows, and true on other platforms. */
  var rtlMoveVisually: js.UndefOr[Boolean] = js.native
  
  /** This label is read by the screenreaders when CodeMirror text area is focused. This is helpful for accessibility. */
  var screenReaderLabel: js.UndefOr[String] = js.native
  
  /**
    * When the end of the file is reached it allows you to keep scrolling so that your last few lines of code are not stuck at the bottom of the editor.
    */
  var scrollPastEnd: js.UndefOr[Boolean] = js.native
  
  /**
    * Chooses a scrollbar implementation. The default is "native", showing native scrollbars. The core library also
    * provides the "null" style, which completely hides the scrollbars. Addons can implement additional scrollbar models.
    */
  var scrollbarStyle: js.UndefOr[String] = js.native
  
  /** Determines whether multiple selections are joined as soon as they touch (the default) or only when they overlap (true). */
  var selectionsMayTouch: js.UndefOr[Boolean] = js.native
  
  /**Whether the cursor should be drawn when a selection is active. Defaults to false. */
  var showCursorWhenSelecting: js.UndefOr[Boolean] = js.native
  
  var showHint: js.UndefOr[Boolean] = js.native
  
  /** Whether to use the context-sensitive indentation that the mode provides (or just indent the same as the line before). Defaults to true. */
  var smartIndent: js.UndefOr[Boolean] = js.native
  
  /** Specifies whether or not spellcheck will be enabled on the input. */
  var spellcheck: js.UndefOr[Boolean] = js.native
  
  /**
    * When enabled gives the wrapper of the line that contains the cursor the class CodeMirror-activeline,
    * adds a background with the class CodeMirror-activeline-background, and adds the class CodeMirror-activeline-gutter to the line's gutter space is enabled.
    */
  var styleActiveLine: js.UndefOr[StyleActiveLine | Boolean] = js.native
  
  /** The width of a tab character. Defaults to 4. */
  var tabSize: js.UndefOr[Double] = js.native
  
  /** The tab index to assign to the editor. If not given, no tab index will be assigned. */
  var tabindex: js.UndefOr[Double] = js.native
  
  /** The theme to style the editor with. You must make sure the CSS file defining the corresponding .cm-s-[name] styles is loaded.
    The default is "default". */
  var theme: js.UndefOr[String] = js.native
  
  /** The maximum number of undo levels that the editor stores. Defaults to 40. */
  var undoDepth: js.UndefOr[Double] = js.native
  
  /** string| The starting value of the editor. Can be a string, or a document object. */
  var value: js.UndefOr[js.Any] = js.native
  
  /** Specifies the amount of lines that are rendered above and below the part of the document that's currently scrolled into view.
    This affects the amount of updates needed when scrolling, and the amount of work that such an update does.
    You should usually leave it at its default, 10. Can be set to Infinity to make sure the whole document is always rendered,
    and thus the browser's text search works on it. This will have bad effects on performance of big documents. */
  var viewportMargin: js.UndefOr[Double] = js.native
  
  /** See workTime. */
  var workDelay: js.UndefOr[Double] = js.native
  
  /** Highlighting is done by a pseudo background - thread that will work for workTime milliseconds,
    and then use timeout to sleep for workDelay milliseconds.
    The defaults are 200 and 300, you can change these options to make the highlighting more or less aggressive. */
  var workTime: js.UndefOr[Double] = js.native
}
object EditorConfiguration {
  
  @scala.inline
  def apply(): EditorConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorConfiguration]
  }
  
  @scala.inline
  implicit class EditorConfigurationOps[Self <: EditorConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAddModeClass(value: Boolean): Self = this.set("addModeClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddModeClass: Self = this.set("addModeClass", js.undefined)
    
    @scala.inline
    def setAllowDropFileTypesVarargs(value: String*): Self = this.set("allowDropFileTypes", js.Array(value :_*))
    
    @scala.inline
    def setAllowDropFileTypes(value: js.Array[String]): Self = this.set("allowDropFileTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDropFileTypes: Self = this.set("allowDropFileTypes", js.undefined)
    
    @scala.inline
    def setAutoCloseBrackets(value: AutoCloseBrackets | Boolean | String): Self = this.set("autoCloseBrackets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCloseBrackets: Self = this.set("autoCloseBrackets", js.undefined)
    
    @scala.inline
    def setAutoCloseTags(value: AutoCloseTags | Boolean): Self = this.set("autoCloseTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCloseTags: Self = this.set("autoCloseTags", js.undefined)
    
    @scala.inline
    def setAutoRefresh(value: Boolean | Delay): Self = this.set("autoRefresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoRefresh: Self = this.set("autoRefresh", js.undefined)
    
    @scala.inline
    def setAutocapitalize(value: Boolean): Self = this.set("autocapitalize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutocapitalize: Self = this.set("autocapitalize", js.undefined)
    
    @scala.inline
    def setAutocorrect(value: Boolean): Self = this.set("autocorrect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutocorrect: Self = this.set("autocorrect", js.undefined)
    
    @scala.inline
    def setAutofocus(value: Boolean): Self = this.set("autofocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutofocus: Self = this.set("autofocus", js.undefined)
    
    @scala.inline
    def setCoverGutterNextToScrollbar(value: Boolean): Self = this.set("coverGutterNextToScrollbar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCoverGutterNextToScrollbar: Self = this.set("coverGutterNextToScrollbar", js.undefined)
    
    @scala.inline
    def setCursorBlinkRate(value: Double): Self = this.set("cursorBlinkRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursorBlinkRate: Self = this.set("cursorBlinkRate", js.undefined)
    
    @scala.inline
    def setCursorHeight(value: Double): Self = this.set("cursorHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursorHeight: Self = this.set("cursorHeight", js.undefined)
    
    @scala.inline
    def setCursorScrollMargin(value: Double): Self = this.set("cursorScrollMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursorScrollMargin: Self = this.set("cursorScrollMargin", js.undefined)
    
    @scala.inline
    def setDragDrop(value: Boolean): Self = this.set("dragDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragDrop: Self = this.set("dragDrop", js.undefined)
    
    @scala.inline
    def setElectricChars(value: Boolean): Self = this.set("electricChars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElectricChars: Self = this.set("electricChars", js.undefined)
    
    @scala.inline
    def setExtraKeys(value: String | KeyMap): Self = this.set("extraKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtraKeys: Self = this.set("extraKeys", js.undefined)
    
    @scala.inline
    def setFirstLineNumber(value: Double): Self = this.set("firstLineNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstLineNumber: Self = this.set("firstLineNumber", js.undefined)
    
    @scala.inline
    def setFixedGutter(value: Boolean): Self = this.set("fixedGutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixedGutter: Self = this.set("fixedGutter", js.undefined)
    
    @scala.inline
    def setFlattenSpans(value: Boolean): Self = this.set("flattenSpans", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlattenSpans: Self = this.set("flattenSpans", js.undefined)
    
    @scala.inline
    def setFoldGutter(value: Boolean): Self = this.set("foldGutter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFoldGutter: Self = this.set("foldGutter", js.undefined)
    
    @scala.inline
    def setFullScreen(value: Boolean): Self = this.set("fullScreen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullScreen: Self = this.set("fullScreen", js.undefined)
    
    @scala.inline
    def setGuttersVarargs(value: String*): Self = this.set("gutters", js.Array(value :_*))
    
    @scala.inline
    def setGutters(value: js.Array[String]): Self = this.set("gutters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGutters: Self = this.set("gutters", js.undefined)
    
    @scala.inline
    def setHighlightSelectionMatches(value: HighlightSelectionMatches | Boolean): Self = this.set("highlightSelectionMatches", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightSelectionMatches: Self = this.set("highlightSelectionMatches", js.undefined)
    
    @scala.inline
    def setHintOptions(value: ShowHintOptions): Self = this.set("hintOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHintOptions: Self = this.set("hintOptions", js.undefined)
    
    @scala.inline
    def setHistoryEventDelay(value: Double): Self = this.set("historyEventDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHistoryEventDelay: Self = this.set("historyEventDelay", js.undefined)
    
    @scala.inline
    def setIndentUnit(value: Double): Self = this.set("indentUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndentUnit: Self = this.set("indentUnit", js.undefined)
    
    @scala.inline
    def setIndentWithTabs(value: Boolean): Self = this.set("indentWithTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndentWithTabs: Self = this.set("indentWithTabs", js.undefined)
    
    @scala.inline
    def setInputStyle(value: InputStyle): Self = this.set("inputStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputStyle: Self = this.set("inputStyle", js.undefined)
    
    @scala.inline
    def setKeyMap(value: String): Self = this.set("keyMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyMap: Self = this.set("keyMap", js.undefined)
    
    @scala.inline
    def setLineNumberFormatter(value: /* line */ Double => String): Self = this.set("lineNumberFormatter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLineNumberFormatter: Self = this.set("lineNumberFormatter", js.undefined)
    
    @scala.inline
    def setLineNumbers(value: Boolean): Self = this.set("lineNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineNumbers: Self = this.set("lineNumbers", js.undefined)
    
    @scala.inline
    def setLineWiseCopyCut(value: Boolean): Self = this.set("lineWiseCopyCut", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineWiseCopyCut: Self = this.set("lineWiseCopyCut", js.undefined)
    
    @scala.inline
    def setLineWrapping(value: Boolean): Self = this.set("lineWrapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLineWrapping: Self = this.set("lineWrapping", js.undefined)
    
    @scala.inline
    def setLintFunction4(
      value: (/* content */ String, /* updateLintingCallback */ UpdateLintingCallback, /* options */ LintStateOptions | js.Any, /* codeMirror */ Editor) => Unit
    ): Self = this.set("lint", js.Any.fromFunction4(value))
    
    @scala.inline
    def setLintFunction3(
      value: (/* content */ String, /* options */ LintStateOptions | js.Any, /* codeMirror */ Editor) => js.Array[Annotation] | js.Thenable[js.Array[Annotation]]
    ): Self = this.set("lint", js.Any.fromFunction3(value))
    
    @scala.inline
    def setLint(value: Boolean | LintStateOptions | Linter | AsyncLinter): Self = this.set("lint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLint: Self = this.set("lint", js.undefined)
    
    @scala.inline
    def setMatchBrackets(value: MatchBrackets | Boolean): Self = this.set("matchBrackets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchBrackets: Self = this.set("matchBrackets", js.undefined)
    
    @scala.inline
    def setMatchTags(value: MatchTags | Boolean): Self = this.set("matchTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchTags: Self = this.set("matchTags", js.undefined)
    
    @scala.inline
    def setMaxHighlightLength(value: Double): Self = this.set("maxHighlightLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHighlightLength: Self = this.set("maxHighlightLength", js.undefined)
    
    @scala.inline
    def setMode(value: js.Any): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setOnDragEvent(value: (/* instance */ Editor, /* event */ DragEvent) => Boolean): Self = this.set("onDragEvent", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnDragEvent: Self = this.set("onDragEvent", js.undefined)
    
    @scala.inline
    def setOnKeyEvent(value: (/* instance */ Editor, /* event */ KeyboardEvent) => Boolean): Self = this.set("onKeyEvent", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnKeyEvent: Self = this.set("onKeyEvent", js.undefined)
    
    @scala.inline
    def setPasteLinesPerSelection(value: Boolean): Self = this.set("pasteLinesPerSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePasteLinesPerSelection: Self = this.set("pasteLinesPerSelection", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setPollInterval(value: Double): Self = this.set("pollInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePollInterval: Self = this.set("pollInterval", js.undefined)
    
    @scala.inline
    def setReadOnly(value: js.Any): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    
    @scala.inline
    def setResetSelectionOnContextMenu(value: Boolean): Self = this.set("resetSelectionOnContextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResetSelectionOnContextMenu: Self = this.set("resetSelectionOnContextMenu", js.undefined)
    
    @scala.inline
    def setRtlMoveVisually(value: Boolean): Self = this.set("rtlMoveVisually", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRtlMoveVisually: Self = this.set("rtlMoveVisually", js.undefined)
    
    @scala.inline
    def setScreenReaderLabel(value: String): Self = this.set("screenReaderLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenReaderLabel: Self = this.set("screenReaderLabel", js.undefined)
    
    @scala.inline
    def setScrollPastEnd(value: Boolean): Self = this.set("scrollPastEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollPastEnd: Self = this.set("scrollPastEnd", js.undefined)
    
    @scala.inline
    def setScrollbarStyle(value: String): Self = this.set("scrollbarStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollbarStyle: Self = this.set("scrollbarStyle", js.undefined)
    
    @scala.inline
    def setSelectionsMayTouch(value: Boolean): Self = this.set("selectionsMayTouch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionsMayTouch: Self = this.set("selectionsMayTouch", js.undefined)
    
    @scala.inline
    def setShowCursorWhenSelecting(value: Boolean): Self = this.set("showCursorWhenSelecting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCursorWhenSelecting: Self = this.set("showCursorWhenSelecting", js.undefined)
    
    @scala.inline
    def setShowHint(value: Boolean): Self = this.set("showHint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowHint: Self = this.set("showHint", js.undefined)
    
    @scala.inline
    def setSmartIndent(value: Boolean): Self = this.set("smartIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmartIndent: Self = this.set("smartIndent", js.undefined)
    
    @scala.inline
    def setSpellcheck(value: Boolean): Self = this.set("spellcheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpellcheck: Self = this.set("spellcheck", js.undefined)
    
    @scala.inline
    def setStyleActiveLine(value: StyleActiveLine | Boolean): Self = this.set("styleActiveLine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyleActiveLine: Self = this.set("styleActiveLine", js.undefined)
    
    @scala.inline
    def setTabSize(value: Double): Self = this.set("tabSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabSize: Self = this.set("tabSize", js.undefined)
    
    @scala.inline
    def setTabindex(value: Double): Self = this.set("tabindex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabindex: Self = this.set("tabindex", js.undefined)
    
    @scala.inline
    def setTheme(value: String): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setUndoDepth(value: Double): Self = this.set("undoDepth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUndoDepth: Self = this.set("undoDepth", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setViewportMargin(value: Double): Self = this.set("viewportMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViewportMargin: Self = this.set("viewportMargin", js.undefined)
    
    @scala.inline
    def setWorkDelay(value: Double): Self = this.set("workDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkDelay: Self = this.set("workDelay", js.undefined)
    
    @scala.inline
    def setWorkTime(value: Double): Self = this.set("workTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkTime: Self = this.set("workTime", js.undefined)
  }
}
