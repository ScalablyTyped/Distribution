package typings.blessed.blessedMod.Widgets

import typings.blessed.blessedMod.BlessedProgram
import typings.blessed.blessedMod.Widgets.Types.TCursor
import typings.blessed.blessedMod.Widgets.Types.TPosition
import typings.blessed.blessedMod.Widgets.Types.TTopLeft
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScreenOptions extends INodeOptions {
  /**
    * Absolute bottom offset, always zero.
    */
  var abottom: js.UndefOr[TPosition] = js.undefined
  /**
    * Absolute left offset, always zero.
    */
  var aleft: js.UndefOr[TTopLeft] = js.undefined
  /**
    * Absolute right offset, always zero.
    */
  var aright: js.UndefOr[TPosition] = js.undefined
  /**
    * Absolute top offset, always zero.
    */
  var atop: js.UndefOr[TTopLeft] = js.undefined
  /**
    * Automatically position child elements with border and padding in mind (NOTE: this is a recommended
    * option. It may become default in the future).
    */
  var autoPadding: js.UndefOr[Boolean] = js.undefined
  /**
    * Relative bottom offset, always zero.
    */
  var bottom: js.UndefOr[TPosition] = js.undefined
  /**
    * Same as screen.width.
    */
  var cols: js.UndefOr[Double] = js.undefined
  var cursor: js.UndefOr[TCursor] = js.undefined
  /**
    * Debug mode. Enables usage of the debug method. Also creates a debug console which will display when
    * pressing F12. It will display all log and debug messages.
    */
  var debug: js.UndefOr[Boolean] = js.undefined
  /**
    * Automatically "dock" borders with other elements instead of overlapping, depending on position
    * (experimental). For example: These border-overlapped elements:
    */
  var dockBorders: js.UndefOr[Boolean] = js.undefined
  /**
    * Dump all output and input to desired file. Can be used together with log option if set as a boolean.
    */
  var dump: js.UndefOr[String | Boolean] = js.undefined
  /**
    * Do CSR on any element within 20 cols of the screen edge on either side. Faster than smartCSR,
    * but may cause flickering depending on what is on each side of the element.
    */
  var fastCSR: js.UndefOr[Boolean] = js.undefined
  /**
    * Top of the focus history stack.
    */
  var focused: js.UndefOr[BlessedElement] = js.undefined
  /**
    * Force blessed to use unicode even if it is not detected via terminfo, env variables, or windows code page.
    * If value is true unicode is forced. If value is false non-unicode is forced (default: null).
    */
  var forceUnicode: js.UndefOr[Boolean] = js.undefined
  /**
    * Allow for rendering of East Asian double-width characters, utf-16 surrogate pairs, and unicode
    * combining characters. This allows you to display text above the basic multilingual plane. This
    * is behind an option because it may affect performance slightly negatively. Without this option
    * enabled, all double-width, surrogate pair, and combining characters will be replaced by '??',
    * '?', '' respectively. (NOTE: iTerm2 cannot display combining characters properly. Blessed simply
    * removes them from an element's content if iTerm2 is detected).
    */
  var fullUnicode: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the focused element grabs all keypresses.
    */
  var grabKeys: js.UndefOr[Boolean] = js.undefined
  /**
    * Height of the screen (same as program.rows).
    */
  var height: js.UndefOr[TPosition] = js.undefined
  /**
    * The currently hovered element. Only set if mouse events are bound.
    */
  var hover: js.UndefOr[js.Any] = js.undefined
  /**
    * Normally, dockable borders will not dock if the colors or attributes are different. This option
    * will allow them to dock regardless. It may produce some odd looking multi-colored borders though.
    */
  var ignoreDockContrast: js.UndefOr[Boolean] = js.undefined
  /**
    * Array of keys in their full format (e.g. C-c) to ignore when keys are locked or grabbed. Useful
    * for creating a key that will always exit no matter whether the keys are locked.
    */
  var ignoreLocked: js.UndefOr[Boolean] = js.undefined
  /**
    * Input and output streams. process.stdin/process.stdout by default, however, it could be a
    * net.Socket if you want to make a program that runs over telnet or something of that nature.
    */
  var input: js.UndefOr[Writable] = js.undefined
  /**
    * Relative left offset, always zero.
    */
  var left: js.UndefOr[TTopLeft] = js.undefined
  /**
    * Prevent keypresses from being received by any element.
    */
  var lockKeys: js.UndefOr[Boolean] = js.undefined
  /**
    * Create a log file. See log method.
    */
  var log: js.UndefOr[String] = js.undefined
  /**
    * Input and output streams. process.stdin/process.stdout by default, however, it could be a
    * net.Socket if you want to make a program that runs over telnet or something of that nature.
    */
  var output: js.UndefOr[Readable] = js.undefined
  /**
    * The blessed Program to be associated with. Will be automatically instantiated if none is provided.
    */
  var program: js.UndefOr[BlessedProgram] = js.undefined
  /**
    * Amount of time (in ms) to redraw the screen after the terminal is resized (Default: 300).
    */
  var resizeTimeout: js.UndefOr[Double] = js.undefined
  /**
    * Relative right offset, always zero.
    */
  var right: js.UndefOr[TPosition] = js.undefined
  /**
    * Same as screen.height.
    */
  var rows: js.UndefOr[Double] = js.undefined
  /**
    * Send focus events after mouse is enabled.
    */
  var sendFocus: js.UndefOr[Boolean] = js.undefined
  /**
    * Attempt to perform CSR optimization on all possible elements (not just full-width ones, elements with
    * uniform cells to their sides). This is known to cause flickering with elements that are not full-width,
    * however, it is more optimal for terminal rendering.
    */
  var smartCSR: js.UndefOr[Boolean] = js.undefined
  /**
    * The width of tabs within an element's content.
    */
  var tabSize: js.UndefOr[Double] = js.undefined
  /**
    * Set or get terminal name. Set calls screen.setTerminal() internally.
    */
  var terminal: js.UndefOr[String] = js.undefined
  /**
    * Set or get window title.
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * Relative top offset, always zero.
    */
  var top: js.UndefOr[TTopLeft] = js.undefined
  /**
    * The blessed Tput object (only available if you passed tput: true to the Program constructor.)
    */
  var tput: js.UndefOr[Tput] = js.undefined
  /**
    * Attempt to perform back_color_erase optimizations for terminals that support it. It will also work
    * with terminals that don't support it, but only on lines with the default background color. As it
    * stands with the current implementation, it's uncertain how much terminal performance this adds at
    * the cost of overhead within node.
    */
  var useBCE: js.UndefOr[Boolean] = js.undefined
  /**
    * Display warnings (such as the output not being a TTY, similar to ncurses).
    */
  var warnings: js.UndefOr[Boolean] = js.undefined
  /**
    * Width of the screen (same as program.cols).
    */
  var width: js.UndefOr[TPosition] = js.undefined
}

object IScreenOptions {
  @scala.inline
  def apply(
    abottom: TPosition = null,
    aleft: TTopLeft = null,
    aright: TPosition = null,
    atop: TTopLeft = null,
    autoPadding: js.UndefOr[Boolean] = js.undefined,
    bottom: TPosition = null,
    children: js.Array[Node] = null,
    cols: Int | Double = null,
    cursor: TCursor = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    dockBorders: js.UndefOr[Boolean] = js.undefined,
    dump: String | Boolean = null,
    fastCSR: js.UndefOr[Boolean] = js.undefined,
    focusable: js.UndefOr[Boolean] = js.undefined,
    focused: BlessedElement = null,
    forceUnicode: js.UndefOr[Boolean] = js.undefined,
    fullUnicode: js.UndefOr[Boolean] = js.undefined,
    grabKeys: js.UndefOr[Boolean] = js.undefined,
    height: TPosition = null,
    hover: js.Any = null,
    ignoreDockContrast: js.UndefOr[Boolean] = js.undefined,
    ignoreLocked: js.UndefOr[Boolean] = js.undefined,
    input: Writable = null,
    left: TTopLeft = null,
    lockKeys: js.UndefOr[Boolean] = js.undefined,
    log: String = null,
    name: String = null,
    output: Readable = null,
    parent: Node = null,
    program: BlessedProgram = null,
    resizeTimeout: Int | Double = null,
    right: TPosition = null,
    rows: Int | Double = null,
    screen: Screen = null,
    sendFocus: js.UndefOr[Boolean] = js.undefined,
    smartCSR: js.UndefOr[Boolean] = js.undefined,
    tabSize: Int | Double = null,
    terminal: String = null,
    title: String = null,
    top: TTopLeft = null,
    tput: Tput = null,
    useBCE: js.UndefOr[Boolean] = js.undefined,
    warnings: js.UndefOr[Boolean] = js.undefined,
    width: TPosition = null
  ): IScreenOptions = {
    val __obj = js.Dynamic.literal()
    if (abottom != null) __obj.updateDynamic("abottom")(abottom.asInstanceOf[js.Any])
    if (aleft != null) __obj.updateDynamic("aleft")(aleft.asInstanceOf[js.Any])
    if (aright != null) __obj.updateDynamic("aright")(aright.asInstanceOf[js.Any])
    if (atop != null) __obj.updateDynamic("atop")(atop.asInstanceOf[js.Any])
    if (!js.isUndefined(autoPadding)) __obj.updateDynamic("autoPadding")(autoPadding.asInstanceOf[js.Any])
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (cols != null) __obj.updateDynamic("cols")(cols.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (!js.isUndefined(dockBorders)) __obj.updateDynamic("dockBorders")(dockBorders.asInstanceOf[js.Any])
    if (dump != null) __obj.updateDynamic("dump")(dump.asInstanceOf[js.Any])
    if (!js.isUndefined(fastCSR)) __obj.updateDynamic("fastCSR")(fastCSR.asInstanceOf[js.Any])
    if (!js.isUndefined(focusable)) __obj.updateDynamic("focusable")(focusable.asInstanceOf[js.Any])
    if (focused != null) __obj.updateDynamic("focused")(focused.asInstanceOf[js.Any])
    if (!js.isUndefined(forceUnicode)) __obj.updateDynamic("forceUnicode")(forceUnicode.asInstanceOf[js.Any])
    if (!js.isUndefined(fullUnicode)) __obj.updateDynamic("fullUnicode")(fullUnicode.asInstanceOf[js.Any])
    if (!js.isUndefined(grabKeys)) __obj.updateDynamic("grabKeys")(grabKeys.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hover != null) __obj.updateDynamic("hover")(hover.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreDockContrast)) __obj.updateDynamic("ignoreDockContrast")(ignoreDockContrast.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreLocked)) __obj.updateDynamic("ignoreLocked")(ignoreLocked.asInstanceOf[js.Any])
    if (input != null) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (!js.isUndefined(lockKeys)) __obj.updateDynamic("lockKeys")(lockKeys.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (output != null) __obj.updateDynamic("output")(output.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (program != null) __obj.updateDynamic("program")(program.asInstanceOf[js.Any])
    if (resizeTimeout != null) __obj.updateDynamic("resizeTimeout")(resizeTimeout.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (screen != null) __obj.updateDynamic("screen")(screen.asInstanceOf[js.Any])
    if (!js.isUndefined(sendFocus)) __obj.updateDynamic("sendFocus")(sendFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(smartCSR)) __obj.updateDynamic("smartCSR")(smartCSR.asInstanceOf[js.Any])
    if (tabSize != null) __obj.updateDynamic("tabSize")(tabSize.asInstanceOf[js.Any])
    if (terminal != null) __obj.updateDynamic("terminal")(terminal.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (tput != null) __obj.updateDynamic("tput")(tput.asInstanceOf[js.Any])
    if (!js.isUndefined(useBCE)) __obj.updateDynamic("useBCE")(useBCE.asInstanceOf[js.Any])
    if (!js.isUndefined(warnings)) __obj.updateDynamic("warnings")(warnings.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScreenOptions]
  }
}

