package typings.blessed.mod.Widgets

import typings.blessed.mod.BlessedProgram
import typings.blessed.mod.Widgets.Types.TCursor
import typings.blessed.mod.Widgets.Types.TPosition
import typings.blessed.mod.Widgets.Types.TTopLeft
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IScreenOptions
  extends StObject
     with INodeOptions {
  
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
  var hover: js.UndefOr[Any] = js.undefined
  
  /**
    * Normally, dockable borders will not dock if the colors or attributes are different. This option
    * will allow them to dock regardless. It may produce some odd looking multi-colored borders though.
    */
  var ignoreDockContrast: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Array of keys in their full format (e.g. C-c) to ignore when keys are locked or grabbed. Useful
    * for creating a key that will always exit no matter whether the keys are locked.
    */
  var ignoreLocked: js.UndefOr[js.Array[String]] = js.undefined
  
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
  
  inline def apply(): IScreenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IScreenOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IScreenOptions] (val x: Self) extends AnyVal {
    
    inline def setAbottom(value: TPosition): Self = StObject.set(x, "abottom", value.asInstanceOf[js.Any])
    
    inline def setAbottomUndefined: Self = StObject.set(x, "abottom", js.undefined)
    
    inline def setAleft(value: TTopLeft): Self = StObject.set(x, "aleft", value.asInstanceOf[js.Any])
    
    inline def setAleftUndefined: Self = StObject.set(x, "aleft", js.undefined)
    
    inline def setAright(value: TPosition): Self = StObject.set(x, "aright", value.asInstanceOf[js.Any])
    
    inline def setArightUndefined: Self = StObject.set(x, "aright", js.undefined)
    
    inline def setAtop(value: TTopLeft): Self = StObject.set(x, "atop", value.asInstanceOf[js.Any])
    
    inline def setAtopUndefined: Self = StObject.set(x, "atop", js.undefined)
    
    inline def setAutoPadding(value: Boolean): Self = StObject.set(x, "autoPadding", value.asInstanceOf[js.Any])
    
    inline def setAutoPaddingUndefined: Self = StObject.set(x, "autoPadding", js.undefined)
    
    inline def setBottom(value: TPosition): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
    
    inline def setCursor(value: TCursor): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setDockBorders(value: Boolean): Self = StObject.set(x, "dockBorders", value.asInstanceOf[js.Any])
    
    inline def setDockBordersUndefined: Self = StObject.set(x, "dockBorders", js.undefined)
    
    inline def setDump(value: String | Boolean): Self = StObject.set(x, "dump", value.asInstanceOf[js.Any])
    
    inline def setDumpUndefined: Self = StObject.set(x, "dump", js.undefined)
    
    inline def setFastCSR(value: Boolean): Self = StObject.set(x, "fastCSR", value.asInstanceOf[js.Any])
    
    inline def setFastCSRUndefined: Self = StObject.set(x, "fastCSR", js.undefined)
    
    inline def setFocused(value: BlessedElement): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
    
    inline def setFocusedUndefined: Self = StObject.set(x, "focused", js.undefined)
    
    inline def setForceUnicode(value: Boolean): Self = StObject.set(x, "forceUnicode", value.asInstanceOf[js.Any])
    
    inline def setForceUnicodeUndefined: Self = StObject.set(x, "forceUnicode", js.undefined)
    
    inline def setFullUnicode(value: Boolean): Self = StObject.set(x, "fullUnicode", value.asInstanceOf[js.Any])
    
    inline def setFullUnicodeUndefined: Self = StObject.set(x, "fullUnicode", js.undefined)
    
    inline def setGrabKeys(value: Boolean): Self = StObject.set(x, "grabKeys", value.asInstanceOf[js.Any])
    
    inline def setGrabKeysUndefined: Self = StObject.set(x, "grabKeys", js.undefined)
    
    inline def setHeight(value: TPosition): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHover(value: Any): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    inline def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    inline def setIgnoreDockContrast(value: Boolean): Self = StObject.set(x, "ignoreDockContrast", value.asInstanceOf[js.Any])
    
    inline def setIgnoreDockContrastUndefined: Self = StObject.set(x, "ignoreDockContrast", js.undefined)
    
    inline def setIgnoreLocked(value: js.Array[String]): Self = StObject.set(x, "ignoreLocked", value.asInstanceOf[js.Any])
    
    inline def setIgnoreLockedUndefined: Self = StObject.set(x, "ignoreLocked", js.undefined)
    
    inline def setIgnoreLockedVarargs(value: String*): Self = StObject.set(x, "ignoreLocked", js.Array(value*))
    
    inline def setInput(value: Writable): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setLeft(value: TTopLeft): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setLockKeys(value: Boolean): Self = StObject.set(x, "lockKeys", value.asInstanceOf[js.Any])
    
    inline def setLockKeysUndefined: Self = StObject.set(x, "lockKeys", js.undefined)
    
    inline def setLog(value: String): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    inline def setOutput(value: Readable): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    
    inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
    
    inline def setProgram(value: BlessedProgram): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
    
    inline def setProgramUndefined: Self = StObject.set(x, "program", js.undefined)
    
    inline def setResizeTimeout(value: Double): Self = StObject.set(x, "resizeTimeout", value.asInstanceOf[js.Any])
    
    inline def setResizeTimeoutUndefined: Self = StObject.set(x, "resizeTimeout", js.undefined)
    
    inline def setRight(value: TPosition): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setSendFocus(value: Boolean): Self = StObject.set(x, "sendFocus", value.asInstanceOf[js.Any])
    
    inline def setSendFocusUndefined: Self = StObject.set(x, "sendFocus", js.undefined)
    
    inline def setSmartCSR(value: Boolean): Self = StObject.set(x, "smartCSR", value.asInstanceOf[js.Any])
    
    inline def setSmartCSRUndefined: Self = StObject.set(x, "smartCSR", js.undefined)
    
    inline def setTabSize(value: Double): Self = StObject.set(x, "tabSize", value.asInstanceOf[js.Any])
    
    inline def setTabSizeUndefined: Self = StObject.set(x, "tabSize", js.undefined)
    
    inline def setTerminal(value: String): Self = StObject.set(x, "terminal", value.asInstanceOf[js.Any])
    
    inline def setTerminalUndefined: Self = StObject.set(x, "terminal", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTop(value: TTopLeft): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setTput(value: Tput): Self = StObject.set(x, "tput", value.asInstanceOf[js.Any])
    
    inline def setTputUndefined: Self = StObject.set(x, "tput", js.undefined)
    
    inline def setUseBCE(value: Boolean): Self = StObject.set(x, "useBCE", value.asInstanceOf[js.Any])
    
    inline def setUseBCEUndefined: Self = StObject.set(x, "useBCE", js.undefined)
    
    inline def setWarnings(value: Boolean): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWidth(value: TPosition): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
