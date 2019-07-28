package typings.codemirror.codemirrorMod

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorConfiguration extends js.Object {
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
  var lint: js.UndefOr[Boolean | LintOptions] = js.undefined
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
  var onDragEvent: js.UndefOr[js.Function2[/* instance */ Editor, /* event */ Event, Boolean]] = js.undefined
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
  var onKeyEvent: js.UndefOr[js.Function2[/* instance */ Editor, /* event */ Event, Boolean]] = js.undefined
  /** Optional value to be used in conjunction with CodeMirror’s placeholder add-on. */
  var placeholder: js.UndefOr[String] = js.undefined
  /** Indicates how quickly CodeMirror should poll its input textarea for changes(when focused).
    Most input is captured by events, but some things, like IME input on some browsers, don't generate events that allow CodeMirror to properly detect it.
    Thus, it polls. Default is 100 milliseconds. */
  var pollInterval: js.UndefOr[Double] = js.undefined
  /** boolean|string. This disables editing of the editor content by the user. If the special value "nocursor" is given (instead of simply true), focusing of the editor is also disallowed. */
  var readOnly: js.UndefOr[js.Any] = js.undefined
  /** Determines whether horizontal cursor movement through right-to-left (Arabic, Hebrew) text
    is visual (pressing the left arrow moves the cursor left)
    or logical (pressing the left arrow moves to the next lower index in the string, which is visually right in right-to-left text).
    The default is false on Windows, and true on other platforms. */
  var rtlMoveVisually: js.UndefOr[Boolean] = js.undefined
  /**
    * When the end of the file is reached it allows you to keep scrolling so that your last few lines of code are not stuck at the bottom of the editor.
    */
  var scrollPastEnd: js.UndefOr[Boolean] = js.undefined
  /**
    * Chooses a scrollbar implementation. The default is "native", showing native scrollbars. The core library also
    * provides the "null" style, which completely hides the scrollbars. Addons can implement additional scrollbar models.
    */
  var scrollbarStyle: js.UndefOr[String] = js.undefined
  /**Whether the cursor should be drawn when a selection is active. Defaults to false. */
  var showCursorWhenSelecting: js.UndefOr[Boolean] = js.undefined
  var showHint: js.UndefOr[Boolean] = js.undefined
  /** Whether to use the context-sensitive indentation that the mode provides (or just indent the same as the line before). Defaults to true. */
  var smartIndent: js.UndefOr[Boolean] = js.undefined
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
  @scala.inline
  def apply(
    autoCloseBrackets: AutoCloseBrackets | Boolean | String = null,
    autoCloseTags: AutoCloseTags | Boolean = null,
    autofocus: js.UndefOr[Boolean] = js.undefined,
    coverGutterNextToScrollbar: js.UndefOr[Boolean] = js.undefined,
    cursorBlinkRate: Int | Double = null,
    cursorHeight: Int | Double = null,
    cursorScrollMargin: Int | Double = null,
    dragDrop: js.UndefOr[Boolean] = js.undefined,
    electricChars: js.UndefOr[Boolean] = js.undefined,
    extraKeys: String | KeyMap = null,
    firstLineNumber: Int | Double = null,
    fixedGutter: js.UndefOr[Boolean] = js.undefined,
    flattenSpans: js.UndefOr[Boolean] = js.undefined,
    foldGutter: js.UndefOr[Boolean] = js.undefined,
    gutters: js.Array[String] = null,
    highlightSelectionMatches: HighlightSelectionMatches | Boolean = null,
    hintOptions: ShowHintOptions = null,
    historyEventDelay: Int | Double = null,
    indentUnit: Int | Double = null,
    indentWithTabs: js.UndefOr[Boolean] = js.undefined,
    inputStyle: InputStyle = null,
    keyMap: String = null,
    lineNumberFormatter: /* line */ Double => String = null,
    lineNumbers: js.UndefOr[Boolean] = js.undefined,
    lineWiseCopyCut: js.UndefOr[Boolean] = js.undefined,
    lineWrapping: js.UndefOr[Boolean] = js.undefined,
    lint: Boolean | LintOptions = null,
    matchBrackets: MatchBrackets | Boolean = null,
    matchTags: MatchTags | Boolean = null,
    maxHighlightLength: Int | Double = null,
    mode: js.Any = null,
    onDragEvent: (/* instance */ Editor, /* event */ Event) => Boolean = null,
    onKeyEvent: (/* instance */ Editor, /* event */ Event) => Boolean = null,
    placeholder: String = null,
    pollInterval: Int | Double = null,
    readOnly: js.Any = null,
    rtlMoveVisually: js.UndefOr[Boolean] = js.undefined,
    scrollPastEnd: js.UndefOr[Boolean] = js.undefined,
    scrollbarStyle: String = null,
    showCursorWhenSelecting: js.UndefOr[Boolean] = js.undefined,
    showHint: js.UndefOr[Boolean] = js.undefined,
    smartIndent: js.UndefOr[Boolean] = js.undefined,
    styleActiveLine: StyleActiveLine | Boolean = null,
    tabSize: Int | Double = null,
    tabindex: Int | Double = null,
    theme: String = null,
    undoDepth: Int | Double = null,
    value: js.Any = null,
    viewportMargin: Int | Double = null,
    workDelay: Int | Double = null,
    workTime: Int | Double = null
  ): EditorConfiguration = {
    val __obj = js.Dynamic.literal()
    if (autoCloseBrackets != null) __obj.updateDynamic("autoCloseBrackets")(autoCloseBrackets.asInstanceOf[js.Any])
    if (autoCloseTags != null) __obj.updateDynamic("autoCloseTags")(autoCloseTags.asInstanceOf[js.Any])
    if (!js.isUndefined(autofocus)) __obj.updateDynamic("autofocus")(autofocus)
    if (!js.isUndefined(coverGutterNextToScrollbar)) __obj.updateDynamic("coverGutterNextToScrollbar")(coverGutterNextToScrollbar)
    if (cursorBlinkRate != null) __obj.updateDynamic("cursorBlinkRate")(cursorBlinkRate.asInstanceOf[js.Any])
    if (cursorHeight != null) __obj.updateDynamic("cursorHeight")(cursorHeight.asInstanceOf[js.Any])
    if (cursorScrollMargin != null) __obj.updateDynamic("cursorScrollMargin")(cursorScrollMargin.asInstanceOf[js.Any])
    if (!js.isUndefined(dragDrop)) __obj.updateDynamic("dragDrop")(dragDrop)
    if (!js.isUndefined(electricChars)) __obj.updateDynamic("electricChars")(electricChars)
    if (extraKeys != null) __obj.updateDynamic("extraKeys")(extraKeys.asInstanceOf[js.Any])
    if (firstLineNumber != null) __obj.updateDynamic("firstLineNumber")(firstLineNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedGutter)) __obj.updateDynamic("fixedGutter")(fixedGutter)
    if (!js.isUndefined(flattenSpans)) __obj.updateDynamic("flattenSpans")(flattenSpans)
    if (!js.isUndefined(foldGutter)) __obj.updateDynamic("foldGutter")(foldGutter)
    if (gutters != null) __obj.updateDynamic("gutters")(gutters)
    if (highlightSelectionMatches != null) __obj.updateDynamic("highlightSelectionMatches")(highlightSelectionMatches.asInstanceOf[js.Any])
    if (hintOptions != null) __obj.updateDynamic("hintOptions")(hintOptions)
    if (historyEventDelay != null) __obj.updateDynamic("historyEventDelay")(historyEventDelay.asInstanceOf[js.Any])
    if (indentUnit != null) __obj.updateDynamic("indentUnit")(indentUnit.asInstanceOf[js.Any])
    if (!js.isUndefined(indentWithTabs)) __obj.updateDynamic("indentWithTabs")(indentWithTabs)
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle)
    if (keyMap != null) __obj.updateDynamic("keyMap")(keyMap)
    if (lineNumberFormatter != null) __obj.updateDynamic("lineNumberFormatter")(js.Any.fromFunction1(lineNumberFormatter))
    if (!js.isUndefined(lineNumbers)) __obj.updateDynamic("lineNumbers")(lineNumbers)
    if (!js.isUndefined(lineWiseCopyCut)) __obj.updateDynamic("lineWiseCopyCut")(lineWiseCopyCut)
    if (!js.isUndefined(lineWrapping)) __obj.updateDynamic("lineWrapping")(lineWrapping)
    if (lint != null) __obj.updateDynamic("lint")(lint.asInstanceOf[js.Any])
    if (matchBrackets != null) __obj.updateDynamic("matchBrackets")(matchBrackets.asInstanceOf[js.Any])
    if (matchTags != null) __obj.updateDynamic("matchTags")(matchTags.asInstanceOf[js.Any])
    if (maxHighlightLength != null) __obj.updateDynamic("maxHighlightLength")(maxHighlightLength.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (onDragEvent != null) __obj.updateDynamic("onDragEvent")(js.Any.fromFunction2(onDragEvent))
    if (onKeyEvent != null) __obj.updateDynamic("onKeyEvent")(js.Any.fromFunction2(onKeyEvent))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (pollInterval != null) __obj.updateDynamic("pollInterval")(pollInterval.asInstanceOf[js.Any])
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly)
    if (!js.isUndefined(rtlMoveVisually)) __obj.updateDynamic("rtlMoveVisually")(rtlMoveVisually)
    if (!js.isUndefined(scrollPastEnd)) __obj.updateDynamic("scrollPastEnd")(scrollPastEnd)
    if (scrollbarStyle != null) __obj.updateDynamic("scrollbarStyle")(scrollbarStyle)
    if (!js.isUndefined(showCursorWhenSelecting)) __obj.updateDynamic("showCursorWhenSelecting")(showCursorWhenSelecting)
    if (!js.isUndefined(showHint)) __obj.updateDynamic("showHint")(showHint)
    if (!js.isUndefined(smartIndent)) __obj.updateDynamic("smartIndent")(smartIndent)
    if (styleActiveLine != null) __obj.updateDynamic("styleActiveLine")(styleActiveLine.asInstanceOf[js.Any])
    if (tabSize != null) __obj.updateDynamic("tabSize")(tabSize.asInstanceOf[js.Any])
    if (tabindex != null) __obj.updateDynamic("tabindex")(tabindex.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (undoDepth != null) __obj.updateDynamic("undoDepth")(undoDepth.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    if (viewportMargin != null) __obj.updateDynamic("viewportMargin")(viewportMargin.asInstanceOf[js.Any])
    if (workDelay != null) __obj.updateDynamic("workDelay")(workDelay.asInstanceOf[js.Any])
    if (workTime != null) __obj.updateDynamic("workTime")(workTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorConfiguration]
  }
}

