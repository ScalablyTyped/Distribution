package typings
package codemirrorLib.codemirrorMod.CodeMirrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorConfiguration extends js.Object {
  /** Can be used to make CodeMirror focus itself on initialization. Defaults to off.
    When fromTextArea is used, and no explicit value is given for this option, it will be set to true when either the source textarea is focused,
    or it has an autofocus attribute and no other element is focused. */
  var autofocus: js.UndefOr[scala.Boolean] = js.undefined
  /** Half - period in milliseconds used for cursor blinking. The default blink rate is 530ms. */
  var cursorBlinkRate: js.UndefOr[scala.Double] = js.undefined
  /** Determines the height of the cursor. Default is 1 , meaning it spans the whole height of the line.
    For some fonts (and by some tastes) a smaller height (for example 0.85),
    which causes the cursor to not reach all the way to the bottom of the line, looks better */
  var cursorHeight: js.UndefOr[scala.Double] = js.undefined
  /** Controls whether drag-and - drop is enabled. On by default. */
  var dragDrop: js.UndefOr[scala.Boolean] = js.undefined
  /** Configures whether the editor should re-indent the current line when a character is typed
    that might change its proper indentation (only works if the mode supports indentation). Default is true. */
  var electricChars: js.UndefOr[scala.Boolean] = js.undefined
  /** Can be used to specify extra keybindings for the editor, alongside the ones defined by keyMap. Should be either null, or a valid keymap value. */
  var extraKeys: js.UndefOr[java.lang.String | KeyMap] = js.undefined
  /** At which number to start counting lines. Default is 1. */
  var firstLineNumber: js.UndefOr[scala.Double] = js.undefined
  /** Determines whether the gutter scrolls along with the content horizontally (false)
    or whether it stays fixed during horizontal scrolling (true, the default). */
  var fixedGutter: js.UndefOr[scala.Boolean] = js.undefined
  /** By default, CodeMirror will combine adjacent tokens into a single span if they have the same class.
    This will result in a simpler DOM tree, and thus perform better. With some kinds of styling(such as rounded corners),
    this will change the way the document looks. You can set this option to false to disable this behavior. */
  var flattenSpans: js.UndefOr[scala.Boolean] = js.undefined
  /** Provides an option foldGutter, which can be used to create a gutter with markers indicating the blocks that can be folded. */
  var foldGutter: js.UndefOr[scala.Boolean] = js.undefined
  /** Can be used to add extra gutters (beyond or instead of the line number gutter).
    Should be an array of CSS class names, each of which defines a width (and optionally a background),
    and which will be used to draw the background of the gutters.
    May include the CodeMirror-linenumbers class, in order to explicitly set the position of the line number gutter
    (it will default to be to the right of all other gutters). These class names are the keys passed to setGutterMarker. */
  var gutters: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var hintOptions: js.UndefOr[ShowHintOptions] = js.undefined
  /** The period of inactivity (in milliseconds) that will cause a new history event to be started when typing or deleting. Defaults to 500. */
  var historyEventDelay: js.UndefOr[scala.Double] = js.undefined
  /** How many spaces a block (whatever that means in the edited language) should be indented. The default is 2. */
  var indentUnit: js.UndefOr[scala.Double] = js.undefined
  /** Whether, when indenting, the first N*tabSize spaces should be replaced by N tabs. Default is false. */
  var indentWithTabs: js.UndefOr[scala.Boolean] = js.undefined
  /** Configures the keymap to use. The default is "default", which is the only keymap defined in codemirror.js itself.
    Extra keymaps are found in the keymap directory. See the section on keymaps for more information. */
  var keyMap: js.UndefOr[java.lang.String] = js.undefined
  /** A function used to format line numbers. The function is passed the line number, and should return a string that will be shown in the gutter. */
  var lineNumberFormatter: js.UndefOr[js.Function1[/* line */ scala.Double, java.lang.String]] = js.undefined
  /** Whether to show line numbers to the left of the editor. */
  var lineNumbers: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether CodeMirror should scroll or wrap for long lines. Defaults to false (scroll). */
  var lineWrapping: js.UndefOr[scala.Boolean] = js.undefined
  /** Optional lint configuration to be used in conjunction with CodeMirror's linter addon. */
  var lint: js.UndefOr[scala.Boolean | LintOptions] = js.undefined
  //  when set to true, causes matching brackets to be highlighted whenever the cursor is next to them
  var matchBrackets: js.UndefOr[scala.Boolean] = js.undefined
  /** When highlighting long lines, in order to stay responsive, the editor will give up and simply style
    the rest of the line as plain text when it reaches a certain position. The default is 10000.
    You can set this to Infinity to turn off this behavior. */
  var maxHighlightLength: js.UndefOr[scala.Double] = js.undefined
  /** string|object. The mode to use. When not given, this will default to the first mode that was loaded.
    It may be a string, which either simply names the mode or is a MIME type associated with the mode.
    Alternatively, it may be an object containing configuration options for the mode,
    with a name property that names the mode (for example {name: "javascript", json: true}). */
  var mode: js.UndefOr[js.Any] = js.undefined
  /** When given , this will be called when the editor is handling a dragenter , dragover , or drop event.
    It will be passed the editor instance and the event object as arguments.
    The callback can choose to handle the event itself , in which case it should return true to indicate that CodeMirror should not do anything further. */
  var onDragEvent: js.UndefOr[js.Function2[/* instance */ Editor, /* event */ stdLib.Event, scala.Boolean]] = js.undefined
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
  var onKeyEvent: js.UndefOr[js.Function2[/* instance */ Editor, /* event */ stdLib.Event, scala.Boolean]] = js.undefined
  /** Optional value to be used in conjunction with CodeMirror’s placeholder add-on. */
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  /** Indicates how quickly CodeMirror should poll its input textarea for changes(when focused).
    Most input is captured by events, but some things, like IME input on some browsers, don't generate events that allow CodeMirror to properly detect it.
    Thus, it polls. Default is 100 milliseconds. */
  var pollInterval: js.UndefOr[scala.Double] = js.undefined
  /** boolean|string. This disables editing of the editor content by the user. If the special value "nocursor" is given (instead of simply true), focusing of the editor is also disallowed. */
  var readOnly: js.UndefOr[js.Any] = js.undefined
  /** Determines whether horizontal cursor movement through right-to-left (Arabic, Hebrew) text
    is visual (pressing the left arrow moves the cursor left)
    or logical (pressing the left arrow moves to the next lower index in the string, which is visually right in right-to-left text).
    The default is false on Windows, and true on other platforms. */
  var rtlMoveVisually: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Chooses a scrollbar implementation. The default is "native", showing native scrollbars. The core library also
    * provides the "null" style, which completely hides the scrollbars. Addons can implement additional scrollbar models.
    */
  var scrollbarStyle: js.UndefOr[java.lang.String] = js.undefined
  /**Whether the cursor should be drawn when a selection is active. Defaults to false. */
  var showCursorWhenSelecting: js.UndefOr[scala.Boolean] = js.undefined
  var showHint: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether to use the context-sensitive indentation that the mode provides (or just indent the same as the line before). Defaults to true. */
  var smartIndent: js.UndefOr[scala.Boolean] = js.undefined
  /** The width of a tab character. Defaults to 4. */
  var tabSize: js.UndefOr[scala.Double] = js.undefined
  /** The tab index to assign to the editor. If not given, no tab index will be assigned. */
  var tabindex: js.UndefOr[scala.Double] = js.undefined
  /** The theme to style the editor with. You must make sure the CSS file defining the corresponding .cm-s-[name] styles is loaded.
    The default is "default". */
  var theme: js.UndefOr[java.lang.String] = js.undefined
  /** The maximum number of undo levels that the editor stores. Defaults to 40. */
  var undoDepth: js.UndefOr[scala.Double] = js.undefined
  /** string| The starting value of the editor. Can be a string, or a document object. */
  var value: js.UndefOr[js.Any] = js.undefined
  /** Specifies the amount of lines that are rendered above and below the part of the document that's currently scrolled into view.
    This affects the amount of updates needed when scrolling, and the amount of work that such an update does.
    You should usually leave it at its default, 10. Can be set to Infinity to make sure the whole document is always rendered,
    and thus the browser's text search works on it. This will have bad effects on performance of big documents. */
  var viewportMargin: js.UndefOr[scala.Double] = js.undefined
  /** See workTime. */
  var workDelay: js.UndefOr[scala.Double] = js.undefined
  /** Highlighting is done by a pseudo background - thread that will work for workTime milliseconds,
    and then use timeout to sleep for workDelay milliseconds.
    The defaults are 200 and 300, you can change these options to make the highlighting more or less aggressive. */
  var workTime: js.UndefOr[scala.Double] = js.undefined
}

object EditorConfiguration {
  @scala.inline
  def apply(
    autofocus: js.UndefOr[scala.Boolean] = js.undefined,
    cursorBlinkRate: scala.Int | scala.Double = null,
    cursorHeight: scala.Int | scala.Double = null,
    dragDrop: js.UndefOr[scala.Boolean] = js.undefined,
    electricChars: js.UndefOr[scala.Boolean] = js.undefined,
    extraKeys: java.lang.String | KeyMap = null,
    firstLineNumber: scala.Int | scala.Double = null,
    fixedGutter: js.UndefOr[scala.Boolean] = js.undefined,
    flattenSpans: js.UndefOr[scala.Boolean] = js.undefined,
    foldGutter: js.UndefOr[scala.Boolean] = js.undefined,
    gutters: js.Array[java.lang.String] = null,
    hintOptions: ShowHintOptions = null,
    historyEventDelay: scala.Int | scala.Double = null,
    indentUnit: scala.Int | scala.Double = null,
    indentWithTabs: js.UndefOr[scala.Boolean] = js.undefined,
    keyMap: java.lang.String = null,
    lineNumberFormatter: js.Function1[/* line */ scala.Double, java.lang.String] = null,
    lineNumbers: js.UndefOr[scala.Boolean] = js.undefined,
    lineWrapping: js.UndefOr[scala.Boolean] = js.undefined,
    lint: scala.Boolean | LintOptions = null,
    matchBrackets: js.UndefOr[scala.Boolean] = js.undefined,
    maxHighlightLength: scala.Int | scala.Double = null,
    mode: js.Any = null,
    onDragEvent: js.Function2[/* instance */ Editor, /* event */ stdLib.Event, scala.Boolean] = null,
    onKeyEvent: js.Function2[/* instance */ Editor, /* event */ stdLib.Event, scala.Boolean] = null,
    placeholder: java.lang.String = null,
    pollInterval: scala.Int | scala.Double = null,
    readOnly: js.Any = null,
    rtlMoveVisually: js.UndefOr[scala.Boolean] = js.undefined,
    scrollbarStyle: java.lang.String = null,
    showCursorWhenSelecting: js.UndefOr[scala.Boolean] = js.undefined,
    showHint: js.UndefOr[scala.Boolean] = js.undefined,
    smartIndent: js.UndefOr[scala.Boolean] = js.undefined,
    tabSize: scala.Int | scala.Double = null,
    tabindex: scala.Int | scala.Double = null,
    theme: java.lang.String = null,
    undoDepth: scala.Int | scala.Double = null,
    value: js.Any = null,
    viewportMargin: scala.Int | scala.Double = null,
    workDelay: scala.Int | scala.Double = null,
    workTime: scala.Int | scala.Double = null
  ): EditorConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autofocus)) __obj.updateDynamic("autofocus")(autofocus)
    if (cursorBlinkRate != null) __obj.updateDynamic("cursorBlinkRate")(cursorBlinkRate.asInstanceOf[js.Any])
    if (cursorHeight != null) __obj.updateDynamic("cursorHeight")(cursorHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(dragDrop)) __obj.updateDynamic("dragDrop")(dragDrop)
    if (!js.isUndefined(electricChars)) __obj.updateDynamic("electricChars")(electricChars)
    if (extraKeys != null) __obj.updateDynamic("extraKeys")(extraKeys.asInstanceOf[js.Any])
    if (firstLineNumber != null) __obj.updateDynamic("firstLineNumber")(firstLineNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedGutter)) __obj.updateDynamic("fixedGutter")(fixedGutter)
    if (!js.isUndefined(flattenSpans)) __obj.updateDynamic("flattenSpans")(flattenSpans)
    if (!js.isUndefined(foldGutter)) __obj.updateDynamic("foldGutter")(foldGutter)
    if (gutters != null) __obj.updateDynamic("gutters")(gutters)
    if (hintOptions != null) __obj.updateDynamic("hintOptions")(hintOptions)
    if (historyEventDelay != null) __obj.updateDynamic("historyEventDelay")(historyEventDelay.asInstanceOf[js.Any])
    if (indentUnit != null) __obj.updateDynamic("indentUnit")(indentUnit.asInstanceOf[js.Any])
    if (!js.isUndefined(indentWithTabs)) __obj.updateDynamic("indentWithTabs")(indentWithTabs)
    if (keyMap != null) __obj.updateDynamic("keyMap")(keyMap)
    if (lineNumberFormatter != null) __obj.updateDynamic("lineNumberFormatter")(lineNumberFormatter)
    if (!js.isUndefined(lineNumbers)) __obj.updateDynamic("lineNumbers")(lineNumbers)
    if (!js.isUndefined(lineWrapping)) __obj.updateDynamic("lineWrapping")(lineWrapping)
    if (lint != null) __obj.updateDynamic("lint")(lint.asInstanceOf[js.Any])
    if (!js.isUndefined(matchBrackets)) __obj.updateDynamic("matchBrackets")(matchBrackets)
    if (maxHighlightLength != null) __obj.updateDynamic("maxHighlightLength")(maxHighlightLength.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (onDragEvent != null) __obj.updateDynamic("onDragEvent")(onDragEvent)
    if (onKeyEvent != null) __obj.updateDynamic("onKeyEvent")(onKeyEvent)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (pollInterval != null) __obj.updateDynamic("pollInterval")(pollInterval.asInstanceOf[js.Any])
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly)
    if (!js.isUndefined(rtlMoveVisually)) __obj.updateDynamic("rtlMoveVisually")(rtlMoveVisually)
    if (scrollbarStyle != null) __obj.updateDynamic("scrollbarStyle")(scrollbarStyle)
    if (!js.isUndefined(showCursorWhenSelecting)) __obj.updateDynamic("showCursorWhenSelecting")(showCursorWhenSelecting)
    if (!js.isUndefined(showHint)) __obj.updateDynamic("showHint")(showHint)
    if (!js.isUndefined(smartIndent)) __obj.updateDynamic("smartIndent")(smartIndent)
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

