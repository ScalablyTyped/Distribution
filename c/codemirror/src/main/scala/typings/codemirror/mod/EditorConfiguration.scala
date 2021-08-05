package typings.codemirror.mod

import typings.codemirror.anon.Delay
import typings.std.DragEvent
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditorConfiguration extends StObject {
  
  /** When enabled (off by default), an extra CSS class will be added to each token, indicating the (inner) mode that produced it, prefixed with "cm-m-".
    For example, tokens from the XML mode will get the cm-m-xml class. */
  var addModeClass: js.UndefOr[Boolean] = js.undefined
  
  /** When set (default is null) only files whose type is in the array can be dropped into the editor.
    The strings should be MIME types, and will be checked against the type of the File object as reported by the browser. */
  var allowDropFileTypes: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Will auto-close brackets and quotes when typed.
    * By default, it'll auto-close ()[]{}''"", but you can pass it a string similar to that (containing pairs of matching characters),
    * or an object with pairs and optionally explode properties to customize it.
    */
  var autoCloseBrackets: js.UndefOr[AutoCloseBrackets | Boolean | String] = js.undefined
  
  /**
    * Will auto-close XML tags when '>' or '/' is typed.
    * Depends on the fold/xml-fold.js addon.
    */
  var autoCloseTags: js.UndefOr[AutoCloseTags | Boolean] = js.undefined
  
  // if true, it will be refreshed the first time the editor becomes visible.
  // you can pass delay (msec) time as polling duration
  var autoRefresh: js.UndefOr[Boolean | Delay] = js.undefined
  
  /** Specifies whether or not autocapitalization will be enabled on the input. */
  var autocapitalize: js.UndefOr[Boolean] = js.undefined
  
  /** Specifies whether or not autocorrect will be enabled on the input. */
  var autocorrect: js.UndefOr[Boolean] = js.undefined
  
  /** Can be used to make CodeMirror focus itself on initialization. Defaults to off.
    When fromTextArea is used, and no explicit value is given for this option, it will be set to true when either the source textarea is focused,
    or it has an autofocus attribute and no other element is focused. */
  var autofocus: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When fixedGutter is on, and there is a horizontal scrollbar, by default the gutter will be visible to the left of this scrollbar.
    * If this option is set to true, it will be covered by an element with class CodeMirror-gutter-filler.
    */
  var coverGutterNextToScrollbar: js.UndefOr[Boolean] = js.undefined
  
  /** Half - period in milliseconds used for cursor blinking. The default blink rate is 530ms. */
  var cursorBlinkRate: js.UndefOr[Double] = js.undefined
  
  /** Determines the height of the cursor. Default is 1 , meaning it spans the whole height of the line.
    For some fonts (and by some tastes) a smaller height (for example 0.85),
    which causes the cursor to not reach all the way to the bottom of the line, looks better */
  var cursorHeight: js.UndefOr[Double] = js.undefined
  
  /**
    * How much extra space to always keep above and below the cursor when
    * approaching the top or bottom of the visible view in a scrollable document. Default is 0.
    */
  var cursorScrollMargin: js.UndefOr[Double] = js.undefined
  
  /** Controls whether drag-and - drop is enabled. On by default. */
  var dragDrop: js.UndefOr[Boolean] = js.undefined
  
  /** Configures whether the editor should re-indent the current line when a character is typed
    that might change its proper indentation (only works if the mode supports indentation). Default is true. */
  var electricChars: js.UndefOr[Boolean] = js.undefined
  
  /** Can be used to specify extra keybindings for the editor, alongside the ones defined by keyMap. Should be either null, or a valid keymap value. */
  var extraKeys: js.UndefOr[String | KeyMap] = js.undefined
  
  /** At which number to start counting lines. Default is 1. */
  var firstLineNumber: js.UndefOr[Double] = js.undefined
  
  /** Determines whether the gutter scrolls along with the content horizontally (false)
    or whether it stays fixed during horizontal scrolling (true, the default). */
  var fixedGutter: js.UndefOr[Boolean] = js.undefined
  
  /** By default, CodeMirror will combine adjacent tokens into a single span if they have the same class.
    This will result in a simpler DOM tree, and thus perform better. With some kinds of styling(such as rounded corners),
    this will change the way the document looks. You can set this option to false to disable this behavior. */
  var flattenSpans: js.UndefOr[Boolean] = js.undefined
  
  /** Provides an option foldGutter, which can be used to create a gutter with markers indicating the blocks that can be folded. */
  var foldGutter: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When set to true, will make the editor full-screen (as in, taking up the whole browser window).
    * Depends on fullscreen.css
    * @see {@link https://codemirror.net/doc/manual.html#addon_fullscreen}
    * @default false
    */
  var fullScreen: js.UndefOr[Boolean] = js.undefined
  
  /** Can be used to add extra gutters (beyond or instead of the line number gutter).
    Should be an array of CSS class names, each of which defines a width (and optionally a background),
    and which will be used to draw the background of the gutters.
    May include the CodeMirror-linenumbers class, in order to explicitly set the position of the line number gutter
    (it will default to be to the right of all other gutters). These class names are the keys passed to setGutterMarker. */
  var gutters: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Adds a highlightSelectionMatches option that can be enabled to highlight all instances of a currently selected word.
    * When enabled, it causes the current word to be highlighted when nothing is selected (defaults to off).
    */
  var highlightSelectionMatches: js.UndefOr[HighlightSelectionMatches | Boolean] = js.undefined
  
  var hintOptions: js.UndefOr[ShowHintOptions] = js.undefined
  
  /** The period of inactivity (in milliseconds) that will cause a new history event to be started when typing or deleting. Defaults to 500. */
  var historyEventDelay: js.UndefOr[Double] = js.undefined
  
  /** How many spaces a block (whatever that means in the edited language) should be indented. The default is 2. */
  var indentUnit: js.UndefOr[Double] = js.undefined
  
  /** Whether, when indenting, the first N*tabSize spaces should be replaced by N tabs. Default is false. */
  var indentWithTabs: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Selects the way CodeMirror handles input and focus.
    * The core library defines the "textarea" and "contenteditable" input models.
    * On mobile browsers, the default is "contenteditable". On desktop browsers, the default is "textarea".
    * Support for IME and screen readers is better in the "contenteditable" model.
    */
  var inputStyle: js.UndefOr[InputStyle] = js.undefined
  
  /** Configures the keymap to use. The default is "default", which is the only keymap defined in codemirror.js itself.
    Extra keymaps are found in the keymap directory. See the section on keymaps for more information. */
  var keyMap: js.UndefOr[String] = js.undefined
  
  /** A function used to format line numbers. The function is passed the line number, and should return a string that will be shown in the gutter. */
  var lineNumberFormatter: js.UndefOr[js.Function1[/* line */ Double, String]] = js.undefined
  
  /** Whether to show line numbers to the left of the editor. */
  var lineNumbers: js.UndefOr[Boolean] = js.undefined
  
  /** When enabled, which is the default, doing copy or cut when there is no selection will copy or cut the whole lines that have cursors on them. */
  var lineWiseCopyCut: js.UndefOr[Boolean] = js.undefined
  
  /** Whether CodeMirror should scroll or wrap for long lines. Defaults to false (scroll). */
  var lineWrapping: js.UndefOr[Boolean] = js.undefined
  
  /** Optional lint configuration to be used in conjunction with CodeMirror's linter addon. */
  var lint: js.UndefOr[Boolean | LintStateOptions | Linter | AsyncLinter] = js.undefined
  
  //  When set to true or an options object, causes matching brackets to be highlighted whenever the cursor is next to them.
  var matchBrackets: js.UndefOr[MatchBrackets | Boolean] = js.undefined
  
  /**
    * When enabled will cause the tags around the cursor to be highlighted (using the CodeMirror-matchingtag class).
    * Depends on the addon/fold/xml-fold.js addon.
    */
  var matchTags: js.UndefOr[MatchTags | Boolean] = js.undefined
  
  /** When highlighting long lines, in order to stay responsive, the editor will give up and simply style
    the rest of the line as plain text when it reaches a certain position. The default is 10000.
    You can set this to Infinity to turn off this behavior. */
  var maxHighlightLength: js.UndefOr[Double] = js.undefined
  
  /** string|object. The mode to use. When not given, this will default to the first mode that was loaded.
    It may be a string, which either simply names the mode or is a MIME type associated with the mode.
    Alternatively, it may be an object containing configuration options for the mode,
    with a name property that names the mode (for example {name: "javascript", json: true}). */
  var mode: js.UndefOr[js.Any] = js.undefined
  
  /** When given , this will be called when the editor is handling a dragenter , dragover , or drop event.
    It will be passed the editor instance and the event object as arguments.
    The callback can choose to handle the event itself , in which case it should return true to indicate that CodeMirror should not do anything further. */
  var onDragEvent: js.UndefOr[js.Function2[/* instance */ Editor, /* event */ DragEvent, Boolean]] = js.undefined
  
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
  var onKeyEvent: js.UndefOr[js.Function2[/* instance */ Editor, /* event */ KeyboardEvent, Boolean]] = js.undefined
  
  /** When pasting something from an external source (not from the editor itself), if the number of lines matches the number of selection, CodeMirror will by default insert one line per selection. You can set this to false to disable that behavior. */
  var pasteLinesPerSelection: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Adds a placeholder option that can be used to make content appear in the editor when it is empty and not focused.
    * It can hold either a string or a DOM node. Also gives the editor a CodeMirror-empty CSS class whenever it doesn't contain any text.
    */
  var placeholder: js.UndefOr[String] = js.undefined
  
  /** Indicates how quickly CodeMirror should poll its input textarea for changes(when focused).
    Most input is captured by events, but some things, like IME input on some browsers, don't generate events that allow CodeMirror to properly detect it.
    Thus, it polls. Default is 100 milliseconds. */
  var pollInterval: js.UndefOr[Double] = js.undefined
  
  /** boolean|string. This disables editing of the editor content by the user. If the special value "nocursor" is given (instead of simply true), focusing of the editor is also disallowed. */
  var readOnly: js.UndefOr[js.Any] = js.undefined
  
  /** Controls whether, when the context menu is opened with a click outside of the current selection,
    the cursor is moved to the point of the click. Defaults to true. */
  var resetSelectionOnContextMenu: js.UndefOr[Boolean] = js.undefined
  
  /** Determines whether horizontal cursor movement through right-to-left (Arabic, Hebrew) text
    is visual (pressing the left arrow moves the cursor left)
    or logical (pressing the left arrow moves to the next lower index in the string, which is visually right in right-to-left text).
    The default is false on Windows, and true on other platforms. */
  var rtlMoveVisually: js.UndefOr[Boolean] = js.undefined
  
  /** This label is read by the screenreaders when CodeMirror text area is focused. This is helpful for accessibility. */
  var screenReaderLabel: js.UndefOr[String] = js.undefined
  
  /**
    * When the end of the file is reached it allows you to keep scrolling so that your last few lines of code are not stuck at the bottom of the editor.
    */
  var scrollPastEnd: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Chooses a scrollbar implementation. The default is "native", showing native scrollbars. The core library also
    * provides the "null" style, which completely hides the scrollbars. Addons can implement additional scrollbar models.
    */
  var scrollbarStyle: js.UndefOr[String] = js.undefined
  
  /** Determines whether multiple selections are joined as soon as they touch (the default) or only when they overlap (true). */
  var selectionsMayTouch: js.UndefOr[Boolean] = js.undefined
  
  /**Whether the cursor should be drawn when a selection is active. Defaults to false. */
  var showCursorWhenSelecting: js.UndefOr[Boolean] = js.undefined
  
  var showHint: js.UndefOr[Boolean] = js.undefined
  
  /** Whether to use the context-sensitive indentation that the mode provides (or just indent the same as the line before). Defaults to true. */
  var smartIndent: js.UndefOr[Boolean] = js.undefined
  
  /** Specifies whether or not spellcheck will be enabled on the input. */
  var spellcheck: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When enabled gives the wrapper of the line that contains the cursor the class CodeMirror-activeline,
    * adds a background with the class CodeMirror-activeline-background, and adds the class CodeMirror-activeline-gutter to the line's gutter space is enabled.
    */
  var styleActiveLine: js.UndefOr[StyleActiveLine | Boolean] = js.undefined
  
  /** The width of a tab character. Defaults to 4. */
  var tabSize: js.UndefOr[Double] = js.undefined
  
  /** The tab index to assign to the editor. If not given, no tab index will be assigned. */
  var tabindex: js.UndefOr[Double] = js.undefined
  
  /** The theme to style the editor with. You must make sure the CSS file defining the corresponding .cm-s-[name] styles is loaded.
    The default is "default". */
  var theme: js.UndefOr[String] = js.undefined
  
  /** The maximum number of undo levels that the editor stores. Defaults to 40. */
  var undoDepth: js.UndefOr[Double] = js.undefined
  
  /** string| The starting value of the editor. Can be a string, or a document object. */
  var value: js.UndefOr[js.Any] = js.undefined
  
  /** Specifies the amount of lines that are rendered above and below the part of the document that's currently scrolled into view.
    This affects the amount of updates needed when scrolling, and the amount of work that such an update does.
    You should usually leave it at its default, 10. Can be set to Infinity to make sure the whole document is always rendered,
    and thus the browser's text search works on it. This will have bad effects on performance of big documents. */
  var viewportMargin: js.UndefOr[Double] = js.undefined
  
  /** See workTime. */
  var workDelay: js.UndefOr[Double] = js.undefined
  
  /** Highlighting is done by a pseudo background - thread that will work for workTime milliseconds,
    and then use timeout to sleep for workDelay milliseconds.
    The defaults are 200 and 300, you can change these options to make the highlighting more or less aggressive. */
  var workTime: js.UndefOr[Double] = js.undefined
}
object EditorConfiguration {
  
  inline def apply(): EditorConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EditorConfiguration]
  }
  
  extension [Self <: EditorConfiguration](x: Self) {
    
    inline def setAddModeClass(value: Boolean): Self = StObject.set(x, "addModeClass", value.asInstanceOf[js.Any])
    
    inline def setAddModeClassUndefined: Self = StObject.set(x, "addModeClass", js.undefined)
    
    inline def setAllowDropFileTypes(value: js.Array[String]): Self = StObject.set(x, "allowDropFileTypes", value.asInstanceOf[js.Any])
    
    inline def setAllowDropFileTypesUndefined: Self = StObject.set(x, "allowDropFileTypes", js.undefined)
    
    inline def setAllowDropFileTypesVarargs(value: String*): Self = StObject.set(x, "allowDropFileTypes", js.Array(value :_*))
    
    inline def setAutoCloseBrackets(value: AutoCloseBrackets | Boolean | String): Self = StObject.set(x, "autoCloseBrackets", value.asInstanceOf[js.Any])
    
    inline def setAutoCloseBracketsUndefined: Self = StObject.set(x, "autoCloseBrackets", js.undefined)
    
    inline def setAutoCloseTags(value: AutoCloseTags | Boolean): Self = StObject.set(x, "autoCloseTags", value.asInstanceOf[js.Any])
    
    inline def setAutoCloseTagsUndefined: Self = StObject.set(x, "autoCloseTags", js.undefined)
    
    inline def setAutoRefresh(value: Boolean | Delay): Self = StObject.set(x, "autoRefresh", value.asInstanceOf[js.Any])
    
    inline def setAutoRefreshUndefined: Self = StObject.set(x, "autoRefresh", js.undefined)
    
    inline def setAutocapitalize(value: Boolean): Self = StObject.set(x, "autocapitalize", value.asInstanceOf[js.Any])
    
    inline def setAutocapitalizeUndefined: Self = StObject.set(x, "autocapitalize", js.undefined)
    
    inline def setAutocorrect(value: Boolean): Self = StObject.set(x, "autocorrect", value.asInstanceOf[js.Any])
    
    inline def setAutocorrectUndefined: Self = StObject.set(x, "autocorrect", js.undefined)
    
    inline def setAutofocus(value: Boolean): Self = StObject.set(x, "autofocus", value.asInstanceOf[js.Any])
    
    inline def setAutofocusUndefined: Self = StObject.set(x, "autofocus", js.undefined)
    
    inline def setCoverGutterNextToScrollbar(value: Boolean): Self = StObject.set(x, "coverGutterNextToScrollbar", value.asInstanceOf[js.Any])
    
    inline def setCoverGutterNextToScrollbarUndefined: Self = StObject.set(x, "coverGutterNextToScrollbar", js.undefined)
    
    inline def setCursorBlinkRate(value: Double): Self = StObject.set(x, "cursorBlinkRate", value.asInstanceOf[js.Any])
    
    inline def setCursorBlinkRateUndefined: Self = StObject.set(x, "cursorBlinkRate", js.undefined)
    
    inline def setCursorHeight(value: Double): Self = StObject.set(x, "cursorHeight", value.asInstanceOf[js.Any])
    
    inline def setCursorHeightUndefined: Self = StObject.set(x, "cursorHeight", js.undefined)
    
    inline def setCursorScrollMargin(value: Double): Self = StObject.set(x, "cursorScrollMargin", value.asInstanceOf[js.Any])
    
    inline def setCursorScrollMarginUndefined: Self = StObject.set(x, "cursorScrollMargin", js.undefined)
    
    inline def setDragDrop(value: Boolean): Self = StObject.set(x, "dragDrop", value.asInstanceOf[js.Any])
    
    inline def setDragDropUndefined: Self = StObject.set(x, "dragDrop", js.undefined)
    
    inline def setElectricChars(value: Boolean): Self = StObject.set(x, "electricChars", value.asInstanceOf[js.Any])
    
    inline def setElectricCharsUndefined: Self = StObject.set(x, "electricChars", js.undefined)
    
    inline def setExtraKeys(value: String | KeyMap): Self = StObject.set(x, "extraKeys", value.asInstanceOf[js.Any])
    
    inline def setExtraKeysUndefined: Self = StObject.set(x, "extraKeys", js.undefined)
    
    inline def setFirstLineNumber(value: Double): Self = StObject.set(x, "firstLineNumber", value.asInstanceOf[js.Any])
    
    inline def setFirstLineNumberUndefined: Self = StObject.set(x, "firstLineNumber", js.undefined)
    
    inline def setFixedGutter(value: Boolean): Self = StObject.set(x, "fixedGutter", value.asInstanceOf[js.Any])
    
    inline def setFixedGutterUndefined: Self = StObject.set(x, "fixedGutter", js.undefined)
    
    inline def setFlattenSpans(value: Boolean): Self = StObject.set(x, "flattenSpans", value.asInstanceOf[js.Any])
    
    inline def setFlattenSpansUndefined: Self = StObject.set(x, "flattenSpans", js.undefined)
    
    inline def setFoldGutter(value: Boolean): Self = StObject.set(x, "foldGutter", value.asInstanceOf[js.Any])
    
    inline def setFoldGutterUndefined: Self = StObject.set(x, "foldGutter", js.undefined)
    
    inline def setFullScreen(value: Boolean): Self = StObject.set(x, "fullScreen", value.asInstanceOf[js.Any])
    
    inline def setFullScreenUndefined: Self = StObject.set(x, "fullScreen", js.undefined)
    
    inline def setGutters(value: js.Array[String]): Self = StObject.set(x, "gutters", value.asInstanceOf[js.Any])
    
    inline def setGuttersUndefined: Self = StObject.set(x, "gutters", js.undefined)
    
    inline def setGuttersVarargs(value: String*): Self = StObject.set(x, "gutters", js.Array(value :_*))
    
    inline def setHighlightSelectionMatches(value: HighlightSelectionMatches | Boolean): Self = StObject.set(x, "highlightSelectionMatches", value.asInstanceOf[js.Any])
    
    inline def setHighlightSelectionMatchesUndefined: Self = StObject.set(x, "highlightSelectionMatches", js.undefined)
    
    inline def setHintOptions(value: ShowHintOptions): Self = StObject.set(x, "hintOptions", value.asInstanceOf[js.Any])
    
    inline def setHintOptionsUndefined: Self = StObject.set(x, "hintOptions", js.undefined)
    
    inline def setHistoryEventDelay(value: Double): Self = StObject.set(x, "historyEventDelay", value.asInstanceOf[js.Any])
    
    inline def setHistoryEventDelayUndefined: Self = StObject.set(x, "historyEventDelay", js.undefined)
    
    inline def setIndentUnit(value: Double): Self = StObject.set(x, "indentUnit", value.asInstanceOf[js.Any])
    
    inline def setIndentUnitUndefined: Self = StObject.set(x, "indentUnit", js.undefined)
    
    inline def setIndentWithTabs(value: Boolean): Self = StObject.set(x, "indentWithTabs", value.asInstanceOf[js.Any])
    
    inline def setIndentWithTabsUndefined: Self = StObject.set(x, "indentWithTabs", js.undefined)
    
    inline def setInputStyle(value: InputStyle): Self = StObject.set(x, "inputStyle", value.asInstanceOf[js.Any])
    
    inline def setInputStyleUndefined: Self = StObject.set(x, "inputStyle", js.undefined)
    
    inline def setKeyMap(value: String): Self = StObject.set(x, "keyMap", value.asInstanceOf[js.Any])
    
    inline def setKeyMapUndefined: Self = StObject.set(x, "keyMap", js.undefined)
    
    inline def setLineNumberFormatter(value: /* line */ Double => String): Self = StObject.set(x, "lineNumberFormatter", js.Any.fromFunction1(value))
    
    inline def setLineNumberFormatterUndefined: Self = StObject.set(x, "lineNumberFormatter", js.undefined)
    
    inline def setLineNumbers(value: Boolean): Self = StObject.set(x, "lineNumbers", value.asInstanceOf[js.Any])
    
    inline def setLineNumbersUndefined: Self = StObject.set(x, "lineNumbers", js.undefined)
    
    inline def setLineWiseCopyCut(value: Boolean): Self = StObject.set(x, "lineWiseCopyCut", value.asInstanceOf[js.Any])
    
    inline def setLineWiseCopyCutUndefined: Self = StObject.set(x, "lineWiseCopyCut", js.undefined)
    
    inline def setLineWrapping(value: Boolean): Self = StObject.set(x, "lineWrapping", value.asInstanceOf[js.Any])
    
    inline def setLineWrappingUndefined: Self = StObject.set(x, "lineWrapping", js.undefined)
    
    inline def setLint(value: Boolean | LintStateOptions | Linter | AsyncLinter): Self = StObject.set(x, "lint", value.asInstanceOf[js.Any])
    
    inline def setLintFunction3(
      value: (/* content */ String, /* options */ LintStateOptions | js.Any, /* codeMirror */ Editor) => js.Array[Annotation] | js.Thenable[js.Array[Annotation]]
    ): Self = StObject.set(x, "lint", js.Any.fromFunction3(value))
    
    inline def setLintFunction4(
      value: (/* content */ String, /* updateLintingCallback */ UpdateLintingCallback, /* options */ LintStateOptions | js.Any, /* codeMirror */ Editor) => Unit
    ): Self = StObject.set(x, "lint", js.Any.fromFunction4(value))
    
    inline def setLintUndefined: Self = StObject.set(x, "lint", js.undefined)
    
    inline def setMatchBrackets(value: MatchBrackets | Boolean): Self = StObject.set(x, "matchBrackets", value.asInstanceOf[js.Any])
    
    inline def setMatchBracketsUndefined: Self = StObject.set(x, "matchBrackets", js.undefined)
    
    inline def setMatchTags(value: MatchTags | Boolean): Self = StObject.set(x, "matchTags", value.asInstanceOf[js.Any])
    
    inline def setMatchTagsUndefined: Self = StObject.set(x, "matchTags", js.undefined)
    
    inline def setMaxHighlightLength(value: Double): Self = StObject.set(x, "maxHighlightLength", value.asInstanceOf[js.Any])
    
    inline def setMaxHighlightLengthUndefined: Self = StObject.set(x, "maxHighlightLength", js.undefined)
    
    inline def setMode(value: js.Any): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setOnDragEvent(value: (/* instance */ Editor, /* event */ DragEvent) => Boolean): Self = StObject.set(x, "onDragEvent", js.Any.fromFunction2(value))
    
    inline def setOnDragEventUndefined: Self = StObject.set(x, "onDragEvent", js.undefined)
    
    inline def setOnKeyEvent(value: (/* instance */ Editor, /* event */ KeyboardEvent) => Boolean): Self = StObject.set(x, "onKeyEvent", js.Any.fromFunction2(value))
    
    inline def setOnKeyEventUndefined: Self = StObject.set(x, "onKeyEvent", js.undefined)
    
    inline def setPasteLinesPerSelection(value: Boolean): Self = StObject.set(x, "pasteLinesPerSelection", value.asInstanceOf[js.Any])
    
    inline def setPasteLinesPerSelectionUndefined: Self = StObject.set(x, "pasteLinesPerSelection", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setPollInterval(value: Double): Self = StObject.set(x, "pollInterval", value.asInstanceOf[js.Any])
    
    inline def setPollIntervalUndefined: Self = StObject.set(x, "pollInterval", js.undefined)
    
    inline def setReadOnly(value: js.Any): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
    
    inline def setResetSelectionOnContextMenu(value: Boolean): Self = StObject.set(x, "resetSelectionOnContextMenu", value.asInstanceOf[js.Any])
    
    inline def setResetSelectionOnContextMenuUndefined: Self = StObject.set(x, "resetSelectionOnContextMenu", js.undefined)
    
    inline def setRtlMoveVisually(value: Boolean): Self = StObject.set(x, "rtlMoveVisually", value.asInstanceOf[js.Any])
    
    inline def setRtlMoveVisuallyUndefined: Self = StObject.set(x, "rtlMoveVisually", js.undefined)
    
    inline def setScreenReaderLabel(value: String): Self = StObject.set(x, "screenReaderLabel", value.asInstanceOf[js.Any])
    
    inline def setScreenReaderLabelUndefined: Self = StObject.set(x, "screenReaderLabel", js.undefined)
    
    inline def setScrollPastEnd(value: Boolean): Self = StObject.set(x, "scrollPastEnd", value.asInstanceOf[js.Any])
    
    inline def setScrollPastEndUndefined: Self = StObject.set(x, "scrollPastEnd", js.undefined)
    
    inline def setScrollbarStyle(value: String): Self = StObject.set(x, "scrollbarStyle", value.asInstanceOf[js.Any])
    
    inline def setScrollbarStyleUndefined: Self = StObject.set(x, "scrollbarStyle", js.undefined)
    
    inline def setSelectionsMayTouch(value: Boolean): Self = StObject.set(x, "selectionsMayTouch", value.asInstanceOf[js.Any])
    
    inline def setSelectionsMayTouchUndefined: Self = StObject.set(x, "selectionsMayTouch", js.undefined)
    
    inline def setShowCursorWhenSelecting(value: Boolean): Self = StObject.set(x, "showCursorWhenSelecting", value.asInstanceOf[js.Any])
    
    inline def setShowCursorWhenSelectingUndefined: Self = StObject.set(x, "showCursorWhenSelecting", js.undefined)
    
    inline def setShowHint(value: Boolean): Self = StObject.set(x, "showHint", value.asInstanceOf[js.Any])
    
    inline def setShowHintUndefined: Self = StObject.set(x, "showHint", js.undefined)
    
    inline def setSmartIndent(value: Boolean): Self = StObject.set(x, "smartIndent", value.asInstanceOf[js.Any])
    
    inline def setSmartIndentUndefined: Self = StObject.set(x, "smartIndent", js.undefined)
    
    inline def setSpellcheck(value: Boolean): Self = StObject.set(x, "spellcheck", value.asInstanceOf[js.Any])
    
    inline def setSpellcheckUndefined: Self = StObject.set(x, "spellcheck", js.undefined)
    
    inline def setStyleActiveLine(value: StyleActiveLine | Boolean): Self = StObject.set(x, "styleActiveLine", value.asInstanceOf[js.Any])
    
    inline def setStyleActiveLineUndefined: Self = StObject.set(x, "styleActiveLine", js.undefined)
    
    inline def setTabSize(value: Double): Self = StObject.set(x, "tabSize", value.asInstanceOf[js.Any])
    
    inline def setTabSizeUndefined: Self = StObject.set(x, "tabSize", js.undefined)
    
    inline def setTabindex(value: Double): Self = StObject.set(x, "tabindex", value.asInstanceOf[js.Any])
    
    inline def setTabindexUndefined: Self = StObject.set(x, "tabindex", js.undefined)
    
    inline def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    
    inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    
    inline def setUndoDepth(value: Double): Self = StObject.set(x, "undoDepth", value.asInstanceOf[js.Any])
    
    inline def setUndoDepthUndefined: Self = StObject.set(x, "undoDepth", js.undefined)
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setViewportMargin(value: Double): Self = StObject.set(x, "viewportMargin", value.asInstanceOf[js.Any])
    
    inline def setViewportMarginUndefined: Self = StObject.set(x, "viewportMargin", js.undefined)
    
    inline def setWorkDelay(value: Double): Self = StObject.set(x, "workDelay", value.asInstanceOf[js.Any])
    
    inline def setWorkDelayUndefined: Self = StObject.set(x, "workDelay", js.undefined)
    
    inline def setWorkTime(value: Double): Self = StObject.set(x, "workTime", value.asInstanceOf[js.Any])
    
    inline def setWorkTimeUndefined: Self = StObject.set(x, "workTime", js.undefined)
  }
}
