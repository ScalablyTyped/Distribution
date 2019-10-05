package typings.blessed.blessedMod.Widgets

import typings.blessed.blessedMod.BlessedProgram
import typings.blessed.blessedMod.Widgets.Types.TCursor
import typings.blessed.blessedMod.Widgets.Types.TPosition
import typings.blessed.blessedMod.Widgets.Types.TTopLeft
import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import typings.node.childUnderscoreProcessMod.ChildProcess
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blessed", "Widgets.Screen")
@js.native
class Screen protected () extends NodeWithEvents {
  def this(opts: IScreenOptions) = this()
  /**
    * Absolute bottom offset, always zero.
    */
  var abottom: TPosition = js.native
  /**
    * Absolute left offset, always zero.
    */
  var aleft: TTopLeft = js.native
  /**
    * Absolute right offset, always zero.
    */
  var aright: TPosition = js.native
  /**
    * Absolute top offset, always zero.
    */
  var atop: TTopLeft = js.native
  /**
    * Automatically position child elements with border and padding in mind (NOTE: this is a recommended
    * option. It may become default in the future).
    */
  var autoPadding: Boolean = js.native
  /**
    * Relative bottom offset, always zero.
    */
  var bottom: TPosition = js.native
  var cleanSides: js.Any = js.native
  /**
    * Same as screen.width.
    */
  var cols: Double = js.native
  var cursor: TCursor = js.native
  /**
    * Automatically "dock" borders with other elements instead of overlapping, depending on position
    * (experimental). For example: These border-overlapped elements:
    */
  var dockBorders: Boolean = js.native
  /**
    * Dump all output and input to desired file. Can be used together with log option if set as a boolean.
    */
  var dump: String = js.native
  /**
    * Do CSR on any element within 20 cols of the screen edge on either side. Faster than smartCSR,
    * but may cause flickering depending on what is on each side of the element.
    */
  var fastCSR: Boolean = js.native
  /**
    * Top of the focus history stack.
    */
  var focused: BlessedElement = js.native
  /**
    * Force blessed to use unicode even if it is not detected via terminfo, env variables, or windows code page.
    * If value is true unicode is forced. If value is false non-unicode is forced (default: null).
    */
  var forceUnicode: Boolean = js.native
  /**
    * Allow for rendering of East Asian double-width characters, utf-16 surrogate pairs, and unicode
    * combining characters. This allows you to display text above the basic multilingual plane. This
    * is behind an option because it may affect performance slightly negatively. Without this option
    * enabled, all double-width, surrogate pair, and combining characters will be replaced by '??',
    * '?', '' respectively. (NOTE: iTerm2 cannot display combining characters properly. Blessed simply
    * removes them from an element's content if iTerm2 is detected).
    */
  var fullUnicode: Boolean = js.native
  /**
    * Whether the focused element grabs all keypresses.
    */
  var grabKeys: js.Any = js.native
  /**
    * Height of the screen (same as program.rows).
    */
  var height: TPosition = js.native
  /**
    * The currently hovered element. Only set if mouse events are bound.
    */
  var hover: js.Any = js.native
  /**
    * Normally, dockable borders will not dock if the colors or attributes are different. This option
    * will allow them to dock regardless. It may produce some odd looking multi-colored borders though.
    */
  var ignoreDockContrast: Boolean = js.native
  /**
    * Array of keys in their full format (e.g. C-c) to ignore when keys are locked or grabbed. Useful
    * for creating a key that will always exit no matter whether the keys are locked.
    */
  var ignoreLocked: Boolean = js.native
  /**
    * Input and output streams. process.stdin/process.stdout by default, however, it could be a
    * net.Socket if you want to make a program that runs over telnet or something of that nature.
    */
  var input: Writable = js.native
  /**
    * Relative left offset, always zero.
    */
  var left: TTopLeft = js.native
  /**
    * Prevent keypresses from being received by any element.
    */
  var lockKeys: Boolean = js.native
  /**
    * Original options object.
    */
  @JSName("options")
  var options_Screen: IScreenOptions = js.native
  /**
    * Input and output streams. process.stdin/process.stdout by default, however, it could be a
    * net.Socket if you want to make a program that runs over telnet or something of that nature.
    */
  var output: Readable = js.native
  /**
    * The blessed Program to be associated with. Will be automatically instantiated if none is provided.
    */
  var program: BlessedProgram = js.native
  /**
    * Amount of time (in ms) to redraw the screen after the terminal is resized (Default: 300).
    */
  var resizeTimeout: Double = js.native
  /**
    * Relative right offset, always zero.
    */
  var right: TPosition = js.native
  /**
    * Same as screen.height.
    */
  var rows: Double = js.native
  /**
    * Send focus events after mouse is enabled.
    */
  var sendFocus: Boolean = js.native
  /**
    * Attempt to perform CSR optimization on all possible elements (not just full-width ones, elements with
    * uniform cells to their sides). This is known to cause flickering with elements that are not full-width,
    * however, it is more optimal for terminal rendering.
    */
  var smartCSR: Boolean = js.native
  /**
    * The width of tabs within an element's content.
    */
  var tabSize: Double = js.native
  /**
    * Set or get terminal name. Set calls screen.setTerminal() internally.
    */
  var terminal: String = js.native
  /**
    * Set or get window title.
    */
  var title: String = js.native
  /**
    * Relative top offset, always zero.
    */
  var top: TTopLeft = js.native
  /**
    * The blessed Tput object (only available if you passed tput: true to the Program constructor.)
    */
  var tput: Tput = js.native
  /**
    * Attempt to perform back_color_erase optimizations for terminals that support it. It will also work
    * with terminals that don't support it, but only on lines with the default background color. As it
    * stands with the current implementation, it's uncertain how much terminal performance this adds at
    * the cost of overhead within node.
    */
  var useBCE: Boolean = js.native
  /**
    * Display warnings (such as the output not being a TTY, similar to ncurses).
    */
  var warnings: Boolean = js.native
  /**
    * Width of the screen (same as program.cols).
    */
  var width: TPosition = js.native
  /**
    * Allocate a new pending screen buffer and a new output screen buffer.
    */
  def alloc(): Unit = js.native
  /**
    * Clear any region on the screen.
    */
  def clearRegion(x1: Double, x2: Double, y1: Double, y2: Double): Unit = js.native
  /**
    * Attempt to copy text to clipboard using iTerm2's proprietary sequence. Returns true if successful.
    */
  def copyToClipboard(text: String): Unit = js.native
  /**
    * Attempt to change cursor color. Returns true if successful.
    */
  def cursorColor(color: String): Unit = js.native
  /**
    * Attempt to reset cursor. Returns true if successful.
    */
  def cursorReset(): Unit = js.native
  /**
    * Attempt to change cursor shape. Will not work in all terminals (see artificial cursors for a solution
    * to this). Returns true if successful.
    */
  def cursorShape(shape: Boolean, blink: Boolean): js.Any = js.native
  /**
    * Same as the log method, but only gets called if the debug option was set.
    */
  def debug(msg: String*): Unit = js.native
  /**
    * Delete a line at the bottom of the screen.
    */
  def deleteBottom(top: Double, bottom: Double): Unit = js.native
  /**
    * Delete a line from the screen (using csr: this bypasses the output buffer).
    */
  def deleteLine(n: Double, y: Double, top: Double, bottom: Double): Unit = js.native
  /**
    * Delete a line at the top of the screen.
    */
  def deleteTop(top: Double, bottom: Double): Unit = js.native
  /**
    * Draw the screen based on the contents of the screen buffer.
    */
  def draw(start: Double, end: Double): Unit = js.native
  /**
    * Enable key and mouse events. Calls bot enableMouse and enableKeys.
    */
  def enableInput(): Unit = js.native
  def enableInput(el: BlessedElement): Unit = js.native
  /**
    * Enable keypress events for the screen and optionally an element (automatically called when a form of
    * on('keypress') is bound).
    */
  def enableKeys(): Unit = js.native
  def enableKeys(el: BlessedElement): Unit = js.native
  /**
    * Enable mouse events for the screen and optionally an element (automatically called when a form of
    * on('mouse') is bound).
    */
  def enableMouse(): Unit = js.native
  def enableMouse(el: BlessedElement): Unit = js.native
  /**
    * Spawn a process in the foreground, return to blessed app after exit. Executes callback on error or exit.
    */
  def exec(
    file: String,
    args: js.Array[String],
    options: NodeChildProcessExecOptions,
    callback: js.Function1[/* repeated */ js.Any, Unit]
  ): ChildProcess = js.native
  /**
    * Fill any region with a character of a certain attribute.
    */
  def fillRegion(attr: String, ch: String, x1: Double, x2: Double, y1: Double, y2: Double): Unit = js.native
  /**
    * Focus next element in the index.
    */
  def focusNext(): Unit = js.native
  /**
    * Focus element by offset of focusable elements.
    */
  def focusOffset(offset: Double): js.Any = js.native
  /**
    * Pop element off the focus stack.
    */
  def focusPop(): BlessedElement = js.native
  /**
    * Focus previous element in the index.
    */
  def focusPrevious(): Unit = js.native
  /**
    * Push element on the focus stack (equivalent to screen.focused = el).
    */
  def focusPush(element: BlessedElement): Unit = js.native
  /**
    * Insert a line at the bottom of the screen.
    */
  def insertBottom(top: Double, bottom: Double): Unit = js.native
  /**
    * Insert a line into the screen (using csr: this bypasses the output buffer).
    */
  def insertLine(n: Double, y: Double, top: Double, bottom: Double): Unit = js.native
  /**
    * Insert a line at the top of the screen.
    */
  def insertTop(top: Double, bottom: Double): Unit = js.native
  /**
    * Write string to the log file if one was created.
    */
  def log(msg: js.Any*): Unit = js.native
  def readEditor(callback: js.Function2[/* err */ ErrnoException, /* data */ Buffer, Unit]): Unit = js.native
  /**
    * Read data from text editor.
    */
  def readEditor(options: js.Any, callback: js.Function2[/* err */ ErrnoException, /* data */ Buffer, Unit]): Unit = js.native
  /**
    * Reallocate the screen buffers and clear the screen.
    */
  def realloc(): Unit = js.native
  /**
    * Render all child elements, writing all data to the screen buffer and drawing the screen.
    */
  def render(): Unit = js.native
  /**
    * Restore the saved focused element.
    */
  def restoreFocus(): BlessedElement = js.native
  /**
    * "Rewind" focus to the last visible and attached element.
    */
  def rewindFocus(): BlessedElement = js.native
  /**
    * Save the focused element.
    */
  def saveFocus(): BlessedElement = js.native
  def screenshot(): Unit = js.native
  /**
    * Take an SGR screenshot of the screen within the region. Returns a string containing only
    * characters and SGR codes. Can be displayed by simply echoing it in a terminal.
    */
  def screenshot(xi: Double, xl: Double, yi: Double, yl: Double): String = js.native
  /**
    * Set effects based on two events and attributes.
    */
  def setEffects(el: BlessedElement, fel: BlessedElement, over: js.Any, out: js.Any, effects: js.Any, temp: js.Any): Unit = js.native
  /**
    * Reset the terminal to term. Reloads terminfo.
    */
  def setTerminal(term: String): Unit = js.native
  /**
    * Spawn a process in the foreground, return to blessed app after exit.
    */
  def spawn(file: String): ChildProcess = js.native
  def spawn(file: String, args: js.Array[String]): ChildProcess = js.native
  def spawn(file: String, args: js.Array[String], options: NodeChildProcessExecOptions): ChildProcess = js.native
}

