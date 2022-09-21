package typings.blessed.mod.Widgets

import typings.blessed.mod.Widgets.Types.TPosition
import typings.blessed.mod.Widgets.Types.TTopLeft
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// TODO: scrollable - Note: If the scrollable option is enabled, Element inherits all methods from ScrollableBox.
@JSImport("blessed", "Widgets.BlessedElement")
@js.native
abstract class BlessedElement protected () extends NodeWithEvents {
  def this(opts: ElementOptions) = this()
  
  /**
    * Calculated absolute bottom offset.
    */
  var abottom: TPosition = js.native
  
  /**
    * Calculated absolute left offset.
    */
  var aleft: TTopLeft = js.native
  
  /**
    * Calculated absolute right offset.
    */
  var aright: TPosition = js.native
  
  /**
    * Calculated absolute top offset.
    */
  var atop: TTopLeft = js.native
  
  /**
    * Border foreground and background, must be numbers (-1 for default).
    */
  var bg: Double = js.native
  
  /**
    * Border attributes.
    */
  var bold: String = js.native
  
  /**
    * Border object.
    */
  var border: Border = js.native
  
  /**
    * Calculated relative bottom offset.
    */
  var bottom: TPosition = js.native
  
  /**
    * Clear a line from the box's content from the visible top.
    */
  def clearBaseLine(i: Double): Unit = js.native
  
  /**
    * Clear a line from the box's content.
    */
  def clearLine(i: Double): Unit = js.native
  
  var content: String = js.native
  
  /**
    * Delete a line at the bottom of the box.
    */
  def deleteBottom(): Unit = js.native
  
  /**
    * Delete a line from the box's content.
    */
  def deleteLine(i: Double): Unit = js.native
  
  /**
    * Delete a line at the top of the box.
    */
  def deleteTop(): Unit = js.native
  
  var detached: Boolean = js.native
  
  /**
    * Disable dragging of the element.
    */
  def disableDrag(): Unit = js.native
  
  /**
    * Whether the element is draggable. Set to true to allow dragging.
    */
  var draggable: Boolean = js.native
  
  /**
    * Enable dragging of the element.
    */
  def enableDrag(): Unit = js.native
  
  /**
    * Enable key and mouse events. Calls both `enableMouse()` and `enableKeys()`.
    */
  def enableInput(): Unit = js.native
  
  /**
    * Enable keypress events for the element (automatically called when a form of on('keypress') is bound).
    */
  def enableKeys(): Unit = js.native
  
  /**
    * Enable mouse events for the element (automatically called when a form of on('mouse') is bound).
    */
  def enableMouse(): Unit = js.native
  
  var fg: Double = js.native
  
  /**
    * Focus element.
    */
  def focus(): Unit = js.native
  
  /**
    * Get a line from the box's content from the visible top.
    */
  def getBaseLine(i: Double): String = js.native
  
  /**
    * Return content, slightly different from el.content. Assume the above formatting.
    */
  def getContent(): String = js.native
  
  /**
    * Get a line from the box's content.
    */
  def getLine(i: Double): String = js.native
  
  /**
    * An array containing the content lines.
    */
  def getLines(): js.Array[String] = js.native
  
  /**
    * An array containing the lines as they are displayed on the screen.
    */
  def getScreenLines(): js.Array[String] = js.native
  
  /**
    * Similar to getContent, but return content with tags and escape codes removed.
    */
  def getText(): String = js.native
  
  /**
    * Calculated height.
    */
  var height: Double | String = js.native
  
  var hidden: Boolean = js.native
  
  /**
    * Hide element.
    */
  def hide(): Unit = js.native
  
  var iheight: TPosition = js.native
  
  var ileft: TTopLeft = js.native
  
  /**
    * Insert a line at the bottom of the box.
    */
  def insertBottom(lines: String): Unit = js.native
  def insertBottom(lines: js.Array[String]): Unit = js.native
  
  /**
    * Insert a line into the box's content.
    */
  def insertLine(i: Double, lines: String): Unit = js.native
  def insertLine(i: Double, lines: js.Array[String]): Unit = js.native
  
  /**
    * Insert a line at the top of the box.
    */
  def insertTop(lines: String): Unit = js.native
  def insertTop(lines: js.Array[String]): Unit = js.native
  
  var itop: TTopLeft = js.native
  
  var iwidth: TPosition = js.native
  
  /**
    * Calculated relative left offset.
    */
  var left: TTopLeft = js.native
  
  var lpos: PositionCoords = js.native
  
  /**
    * Name of the element. Useful for form submission.
    */
  var name: String = js.native
  
  /**
    * Same asel.on('screen', ...) except this will automatically keep track of which listeners
    * are bound to the screen object. For use with removeScreenEvent(), free(), and destroy().
    */
  def onScreenEvent(`type`: String, handler: js.Function1[/* repeated */ Any, Unit]): Unit = js.native
  
  /**
    * Original options object.
    */
  @JSName("options")
  var options_BlessedElement: ElementOptions = js.native
  
  /**
    * Pop a line off the bottom of the content.
    */
  def popLine(i: Double): String = js.native
  
  var position: Position = js.native
  
  /**
    * Push a line onto the bottom of the content.
    */
  def pushLine(lines: String): Unit = js.native
  def pushLine(lines: js.Array[String]): Unit = js.native
  
  /**
    * Calculated relative bottom offset.
    */
  var rbottom: TPosition = js.native
  
  /**
    * Remove the hover label completely.
    */
  def removeHover(): Unit = js.native
  
  /**
    * Remove the label completely.
    */
  def removeLabel(): Any = js.native
  
  /**
    * Same asel.removeListener('screen', ...) except this will automatically keep track of which
    * listeners are bound to the screen object. For use with onScreenEvent(), free(), and destroy().
    */
  def removeScreenEvent(`type`: String, handler: js.Function1[/* repeated */ Any, Unit]): Unit = js.native
  
  /**
    * Write content and children to the screen buffer.
    */
  def render(): Coords = js.native
  
  /**
    * Calculated relative right offset.
    */
  var right: TPosition = js.native
  
  /**
    * Calculated relative left offset.
    */
  var rleft: TTopLeft = js.native
  
  /**
    * Calculated relative right offset.
    */
  var rright: TPosition = js.native
  
  /**
    * Calculated relative top offset.
    */
  var rtop: TTopLeft = js.native
  
  def screenshot(): Unit = js.native
  /**
    * Take an SGR screenshot of the screen within the region. Returns a string containing only
    * characters and SGR codes. Can be displayed by simply echoing it in a terminal.
    */
  def screenshot(xi: Double, xl: Double, yi: Double, yl: Double): String = js.native
  
  /**
    * Put the element in back of its siblings.
    */
  def setBack(): Unit = js.native
  
  /**
    * Set a line in the box's content from the visible top.
    */
  def setBaseLine(i: Double, line: String): Unit = js.native
  def setBaseLine(i: Double, line: js.Array[String]): Unit = js.native
  
  /*
    Content Methods
    Methods for dealing with text content, line by line. Useful for writing a text editor,
    irc client, etc.
    Note: All of these methods deal with pre-aligned, pre-wrapped text. If you use deleteTop()
    on a box with a wrapped line at the top, it may remove 3-4 "real" lines (rows) depending
    on how long the original line was.
    The lines parameter can be a string or an array of strings. The line parameter must
    be a string.
    */
  /**
    * Set the content. Note: When text is input, it will be stripped of all non-SGR
    * escape codes, tabs will be replaced with 8 spaces, and tags will be replaced
    * with SGR codes (if enabled).
    */
  def setContent(text: String): Unit = js.native
  
  /**
    * Put the element in front of its siblings.
    */
  def setFront(): Unit = js.native
  
  /**
    * text/options - Set a hover text box to follow the cursor. Similar to the "title" DOM attribute
    * in the browser. Example options: {text:'foo'}
    */
  def setHover(arg: String): Unit = js.native
  def setHover(arg: LabelOptions): Unit = js.native
  
  /**
    * Set the z-index of the element (changes rendering order).
    */
  def setIndex(z: Double): Unit = js.native
  
  /**
    * text/options - Set the label text for the top-left corner. Example options: {text:'foo',side:'left'}
    */
  def setLabel(arg: String): Unit = js.native
  def setLabel(arg: LabelOptions): Unit = js.native
  
  /**
    * Set a line in the box's content.
    */
  def setLine(i: Double, line: String): Unit = js.native
  def setLine(i: Double, line: js.Array[String]): Unit = js.native
  
  /**
    * Similar to setContent, but ignore tags and remove escape codes.
    */
  def setText(text: String): Unit = js.native
  
  /**
    * Shift a line off the top of the content.
    */
  def shiftLine(i: Double): Unit = js.native
  
  /**
    * Show element.
    */
  def show(): Unit = js.native
  
  /**
    * Get a string's displayed width, taking into account double-width, surrogate pairs,
    * combining characters, tags, and SGR escape codes.
    */
  def strWidth(text: String): String = js.native
  
  var style: Any = js.native
  
  /**
    * Toggle hidden/shown.
    */
  def toggle(): Unit = js.native
  
  /**
    * Calculated relative top offset.
    */
  var top: TTopLeft = js.native
  
  var underline: String = js.native
  
  /**
    * Unshift a line onto the top of the content.
    */
  def unshiftLine(lines: String): Unit = js.native
  def unshiftLine(lines: js.Array[String]): Unit = js.native
  
  var visible: Boolean = js.native
  
  /**
    * Calculated width.
    */
  var width: Double | String = js.native
}
