package typings.blessed.mod.Widgets

import typings.blessed.mod.BlessedProgram
import typings.blessed.mod.Widgets.Types.TCursor
import typings.blessed.mod.Widgets.Types.TPosition
import typings.blessed.mod.Widgets.Types.TTopLeft
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IScreenOptions extends INodeOptions {
  
  /**
    * Absolute bottom offset, always zero.
    */
  var abottom: js.UndefOr[TPosition] = js.native
  
  /**
    * Absolute left offset, always zero.
    */
  var aleft: js.UndefOr[TTopLeft] = js.native
  
  /**
    * Absolute right offset, always zero.
    */
  var aright: js.UndefOr[TPosition] = js.native
  
  /**
    * Absolute top offset, always zero.
    */
  var atop: js.UndefOr[TTopLeft] = js.native
  
  /**
    * Automatically position child elements with border and padding in mind (NOTE: this is a recommended
    * option. It may become default in the future).
    */
  var autoPadding: js.UndefOr[Boolean] = js.native
  
  /**
    * Relative bottom offset, always zero.
    */
  var bottom: js.UndefOr[TPosition] = js.native
  
  /**
    * Same as screen.width.
    */
  var cols: js.UndefOr[Double] = js.native
  
  var cursor: js.UndefOr[TCursor] = js.native
  
  /**
    * Debug mode. Enables usage of the debug method. Also creates a debug console which will display when
    * pressing F12. It will display all log and debug messages.
    */
  var debug: js.UndefOr[Boolean] = js.native
  
  /**
    * Automatically "dock" borders with other elements instead of overlapping, depending on position
    * (experimental). For example: These border-overlapped elements:
    */
  var dockBorders: js.UndefOr[Boolean] = js.native
  
  /**
    * Dump all output and input to desired file. Can be used together with log option if set as a boolean.
    */
  var dump: js.UndefOr[String | Boolean] = js.native
  
  /**
    * Do CSR on any element within 20 cols of the screen edge on either side. Faster than smartCSR,
    * but may cause flickering depending on what is on each side of the element.
    */
  var fastCSR: js.UndefOr[Boolean] = js.native
  
  /**
    * Top of the focus history stack.
    */
  var focused: js.UndefOr[BlessedElement] = js.native
  
  /**
    * Force blessed to use unicode even if it is not detected via terminfo, env variables, or windows code page.
    * If value is true unicode is forced. If value is false non-unicode is forced (default: null).
    */
  var forceUnicode: js.UndefOr[Boolean] = js.native
  
  /**
    * Allow for rendering of East Asian double-width characters, utf-16 surrogate pairs, and unicode
    * combining characters. This allows you to display text above the basic multilingual plane. This
    * is behind an option because it may affect performance slightly negatively. Without this option
    * enabled, all double-width, surrogate pair, and combining characters will be replaced by '??',
    * '?', '' respectively. (NOTE: iTerm2 cannot display combining characters properly. Blessed simply
    * removes them from an element's content if iTerm2 is detected).
    */
  var fullUnicode: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether the focused element grabs all keypresses.
    */
  var grabKeys: js.UndefOr[Boolean] = js.native
  
  /**
    * Height of the screen (same as program.rows).
    */
  var height: js.UndefOr[TPosition] = js.native
  
  /**
    * The currently hovered element. Only set if mouse events are bound.
    */
  var hover: js.UndefOr[js.Any] = js.native
  
  /**
    * Normally, dockable borders will not dock if the colors or attributes are different. This option
    * will allow them to dock regardless. It may produce some odd looking multi-colored borders though.
    */
  var ignoreDockContrast: js.UndefOr[Boolean] = js.native
  
  /**
    * Array of keys in their full format (e.g. C-c) to ignore when keys are locked or grabbed. Useful
    * for creating a key that will always exit no matter whether the keys are locked.
    */
  var ignoreLocked: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Input and output streams. process.stdin/process.stdout by default, however, it could be a
    * net.Socket if you want to make a program that runs over telnet or something of that nature.
    */
  var input: js.UndefOr[Writable] = js.native
  
  /**
    * Relative left offset, always zero.
    */
  var left: js.UndefOr[TTopLeft] = js.native
  
  /**
    * Prevent keypresses from being received by any element.
    */
  var lockKeys: js.UndefOr[Boolean] = js.native
  
  /**
    * Create a log file. See log method.
    */
  var log: js.UndefOr[String] = js.native
  
  /**
    * Input and output streams. process.stdin/process.stdout by default, however, it could be a
    * net.Socket if you want to make a program that runs over telnet or something of that nature.
    */
  var output: js.UndefOr[Readable] = js.native
  
  /**
    * The blessed Program to be associated with. Will be automatically instantiated if none is provided.
    */
  var program: js.UndefOr[BlessedProgram] = js.native
  
  /**
    * Amount of time (in ms) to redraw the screen after the terminal is resized (Default: 300).
    */
  var resizeTimeout: js.UndefOr[Double] = js.native
  
  /**
    * Relative right offset, always zero.
    */
  var right: js.UndefOr[TPosition] = js.native
  
  /**
    * Same as screen.height.
    */
  var rows: js.UndefOr[Double] = js.native
  
  /**
    * Send focus events after mouse is enabled.
    */
  var sendFocus: js.UndefOr[Boolean] = js.native
  
  /**
    * Attempt to perform CSR optimization on all possible elements (not just full-width ones, elements with
    * uniform cells to their sides). This is known to cause flickering with elements that are not full-width,
    * however, it is more optimal for terminal rendering.
    */
  var smartCSR: js.UndefOr[Boolean] = js.native
  
  /**
    * The width of tabs within an element's content.
    */
  var tabSize: js.UndefOr[Double] = js.native
  
  /**
    * Set or get terminal name. Set calls screen.setTerminal() internally.
    */
  var terminal: js.UndefOr[String] = js.native
  
  /**
    * Set or get window title.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * Relative top offset, always zero.
    */
  var top: js.UndefOr[TTopLeft] = js.native
  
  /**
    * The blessed Tput object (only available if you passed tput: true to the Program constructor.)
    */
  var tput: js.UndefOr[Tput] = js.native
  
  /**
    * Attempt to perform back_color_erase optimizations for terminals that support it. It will also work
    * with terminals that don't support it, but only on lines with the default background color. As it
    * stands with the current implementation, it's uncertain how much terminal performance this adds at
    * the cost of overhead within node.
    */
  var useBCE: js.UndefOr[Boolean] = js.native
  
  /**
    * Display warnings (such as the output not being a TTY, similar to ncurses).
    */
  var warnings: js.UndefOr[Boolean] = js.native
  
  /**
    * Width of the screen (same as program.cols).
    */
  var width: js.UndefOr[TPosition] = js.native
}
object IScreenOptions {
  
  @scala.inline
  def apply(): IScreenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IScreenOptions]
  }
  
  @scala.inline
  implicit class IScreenOptionsOps[Self <: IScreenOptions] (val x: Self) extends AnyVal {
    
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
    def setAbottom(value: TPosition): Self = this.set("abottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbottom: Self = this.set("abottom", js.undefined)
    
    @scala.inline
    def setAleft(value: TTopLeft): Self = this.set("aleft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAleft: Self = this.set("aleft", js.undefined)
    
    @scala.inline
    def setAright(value: TPosition): Self = this.set("aright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAright: Self = this.set("aright", js.undefined)
    
    @scala.inline
    def setAtop(value: TTopLeft): Self = this.set("atop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAtop: Self = this.set("atop", js.undefined)
    
    @scala.inline
    def setAutoPadding(value: Boolean): Self = this.set("autoPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoPadding: Self = this.set("autoPadding", js.undefined)
    
    @scala.inline
    def setBottom(value: TPosition): Self = this.set("bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottom: Self = this.set("bottom", js.undefined)
    
    @scala.inline
    def setCols(value: Double): Self = this.set("cols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCols: Self = this.set("cols", js.undefined)
    
    @scala.inline
    def setCursor(value: TCursor): Self = this.set("cursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCursor: Self = this.set("cursor", js.undefined)
    
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    
    @scala.inline
    def setDockBorders(value: Boolean): Self = this.set("dockBorders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDockBorders: Self = this.set("dockBorders", js.undefined)
    
    @scala.inline
    def setDump(value: String | Boolean): Self = this.set("dump", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDump: Self = this.set("dump", js.undefined)
    
    @scala.inline
    def setFastCSR(value: Boolean): Self = this.set("fastCSR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFastCSR: Self = this.set("fastCSR", js.undefined)
    
    @scala.inline
    def setFocused(value: BlessedElement): Self = this.set("focused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocused: Self = this.set("focused", js.undefined)
    
    @scala.inline
    def setForceUnicode(value: Boolean): Self = this.set("forceUnicode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceUnicode: Self = this.set("forceUnicode", js.undefined)
    
    @scala.inline
    def setFullUnicode(value: Boolean): Self = this.set("fullUnicode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullUnicode: Self = this.set("fullUnicode", js.undefined)
    
    @scala.inline
    def setGrabKeys(value: Boolean): Self = this.set("grabKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrabKeys: Self = this.set("grabKeys", js.undefined)
    
    @scala.inline
    def setHeight(value: TPosition): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHover(value: js.Any): Self = this.set("hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHover: Self = this.set("hover", js.undefined)
    
    @scala.inline
    def setIgnoreDockContrast(value: Boolean): Self = this.set("ignoreDockContrast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreDockContrast: Self = this.set("ignoreDockContrast", js.undefined)
    
    @scala.inline
    def setIgnoreLockedVarargs(value: String*): Self = this.set("ignoreLocked", js.Array(value :_*))
    
    @scala.inline
    def setIgnoreLocked(value: js.Array[String]): Self = this.set("ignoreLocked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreLocked: Self = this.set("ignoreLocked", js.undefined)
    
    @scala.inline
    def setInput(value: Writable): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    
    @scala.inline
    def setLeft(value: TTopLeft): Self = this.set("left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    
    @scala.inline
    def setLockKeys(value: Boolean): Self = this.set("lockKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockKeys: Self = this.set("lockKeys", js.undefined)
    
    @scala.inline
    def setLog(value: String): Self = this.set("log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    
    @scala.inline
    def setOutput(value: Readable): Self = this.set("output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutput: Self = this.set("output", js.undefined)
    
    @scala.inline
    def setProgram(value: BlessedProgram): Self = this.set("program", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProgram: Self = this.set("program", js.undefined)
    
    @scala.inline
    def setResizeTimeout(value: Double): Self = this.set("resizeTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizeTimeout: Self = this.set("resizeTimeout", js.undefined)
    
    @scala.inline
    def setRight(value: TPosition): Self = this.set("right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
    
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    
    @scala.inline
    def setSendFocus(value: Boolean): Self = this.set("sendFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSendFocus: Self = this.set("sendFocus", js.undefined)
    
    @scala.inline
    def setSmartCSR(value: Boolean): Self = this.set("smartCSR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmartCSR: Self = this.set("smartCSR", js.undefined)
    
    @scala.inline
    def setTabSize(value: Double): Self = this.set("tabSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabSize: Self = this.set("tabSize", js.undefined)
    
    @scala.inline
    def setTerminal(value: String): Self = this.set("terminal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerminal: Self = this.set("terminal", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTop(value: TTopLeft): Self = this.set("top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    
    @scala.inline
    def setTput(value: Tput): Self = this.set("tput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTput: Self = this.set("tput", js.undefined)
    
    @scala.inline
    def setUseBCE(value: Boolean): Self = this.set("useBCE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseBCE: Self = this.set("useBCE", js.undefined)
    
    @scala.inline
    def setWarnings(value: Boolean): Self = this.set("warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWarnings: Self = this.set("warnings", js.undefined)
    
    @scala.inline
    def setWidth(value: TPosition): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
