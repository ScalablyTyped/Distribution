package typings
package blessedLib.blessedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("blessed", "Widgets")
@js.native
object WidgetsNs extends js.Object {
  /**
    * Convert any .png file (or .gif, see below) to an ANSI image and display it as an element.
    */
  @js.native
  class ANSIImageElement () extends BoxElement {
    def this(options: ANSIImageOptions) = this()
    /**
      * Image object from the png reader.
      */
    var img: blessedLib.blessedMod.WidgetsNs.TypesNs.TImage = js.native
    @JSName("options")
    var options_ANSIImageElement: ANSIImageOptions = js.native
    /**
      * clear the current image.
      */
    def clearImage(callback: js.Function0[scala.Unit]): scala.Unit = js.native
    /**
      * Pause animation.
      */
    def pause(): scala.Unit = js.native
    /**
      * Play animation if it has been paused or stopped.
      */
    def play(): scala.Unit = js.native
    /**
      * set the image in the box to a new path.
      */
    def setImage(img: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
    /**
      * Stop animation.
      */
    def stop(): scala.Unit = js.native
  }
  
  trait ANSIImageOptions extends BoxOptions {
    /**
      * Whether to animate if the image is an APNG/animating GIF. If false, only
      * display the first frame or IDAT (Default: true).
      */
    var animate: scala.Boolean
    /**
      * Add various "density" ASCII characters over the rendering to give the
      * image more detail, similar to libcaca/libcucul (the library mplayer uses
      * to display videos in the terminal).
      */
    var ascii: java.lang.String
    /**
      * URL or path to PNG/GIF file. Can also be a buffer.
      */
    var file: java.lang.String
    @JSName("height")
    var height_ANSIImageOptions: scala.Double | java.lang.String
    /**
      * mem or cpu. If optimizing for memory, animation frames will be rendered to
      * bitmaps as the animation plays, using less memory. Optimizing for cpu will
      * precompile all bitmaps beforehand, which may be faster, but might also OOM
      * the process on large images. (Default: mem).
      */
    var optimization: blessedLib.blessedLibStrings.mem | blessedLib.blessedLibStrings.cpu
    /**
      * Scale cellmap down (0-1.0) from its original pixel width/height (Default: 1.0).
      */
    var scale: scala.Double
    /**
      * Set the speed of animation. Slower: 0.0-1.0. Faster: 1-1000. It cannot go
      * faster than 1 frame per millisecond, so 1000 is the fastest. (Default: 1.0)
      */
    var speed: scala.Double
    /**
      * This differs from other element's width or height in that only one
      * of them is needed: blessed will maintain the aspect ratio of the image
      * as it scales down to the proper number of cells. NOTE: PNG/GIF's are
      * always automatically shrunken to size (based on scale) if a width or
      * height is not given.
      */
    @JSName("width")
    var width_ANSIImageOptions: scala.Double | java.lang.String
  }
  
  /**
    * A box which can render content drawn as 8x14 cell characters using the terminus font.
    */
  @js.native
  class BigTextElement protected () extends BoxElement {
    def this(opts: BigTextOptions) = this()
    /**
      * Original options object.
      */
    @JSName("options")
    var options_BigTextElement: BigTextOptions = js.native
  }
  
  trait BigTextOptions extends BoxOptions {
    /**
      * foreground character. (default: ' ')
      */
    var fch: js.UndefOr[java.lang.String] = js.undefined
    /**
      * bdf->json font file to use (see ttystudio for instructions on compiling BDFs to JSON).
      */
    var font: js.UndefOr[java.lang.String] = js.undefined
    /**
      * bdf->json bold font file to use (see ttystudio for instructions on compiling BDFs to JSON).
      */
    var fontBold: js.UndefOr[java.lang.String] = js.undefined
  }
  
  // TODO: scrollable - Note: If the scrollable option is enabled, Element inherits all methods from ScrollableBox.
  @js.native
  abstract class BlessedElement protected () extends NodeWithEvents {
    def this(opts: ElementOptions) = this()
    /**
      * Calculated absolute bottom offset.
      */
    var abottom: blessedLib.blessedMod.WidgetsNs.TypesNs.TPosition = js.native
    /**
      * Calculated absolute left offset.
      */
    var aleft: blessedLib.blessedMod.WidgetsNs.TypesNs.TTopLeft = js.native
    /**
      * Calculated absolute right offset.
      */
    var aright: blessedLib.blessedMod.WidgetsNs.TypesNs.TPosition = js.native
    /**
      * Calculated absolute top offset.
      */
    var atop: blessedLib.blessedMod.WidgetsNs.TypesNs.TTopLeft = js.native
    /**
      * Border foreground and background, must be numbers (-1 for default).
      */
    var bg: scala.Double = js.native
    /**
      * Border attributes.
      */
    var bold: java.lang.String = js.native
    /**
      * Border object.
      */
    var border: Border = js.native
    /**
      * Calculated relative bottom offset.
      */
    var bottom: blessedLib.blessedMod.WidgetsNs.TypesNs.TPosition = js.native
    var content: java.lang.String = js.native
    var detached: scala.Boolean = js.native
    /**
      * Whether the element is draggable. Set to true to allow dragging.
      */
    var draggable: scala.Boolean = js.native
    var fg: scala.Double = js.native
    /**
      * Calculated height.
      */
    var height: scala.Double | java.lang.String = js.native
    var hidden: scala.Boolean = js.native
    var iheight: blessedLib.blessedMod.WidgetsNs.TypesNs.TPosition = js.native
    var ileft: blessedLib.blessedMod.WidgetsNs.TypesNs.TTopLeft = js.native
    var itop: blessedLib.blessedMod.WidgetsNs.TypesNs.TTopLeft = js.native
    var iwidth: blessedLib.blessedMod.WidgetsNs.TypesNs.TPosition = js.native
    /**
      * Calculated relative left offset.
      */
    var left: blessedLib.blessedMod.WidgetsNs.TypesNs.TTopLeft = js.native
    var lpos: PositionCoords = js.native
    /**
      * Name of the element. Useful for form submission.
      */
    var name: java.lang.String = js.native
    /**
      * Original options object.
      */
    @JSName("options")
    var options_BlessedElement: ElementOptions = js.native
    var position: Position = js.native
    /**
      * Calculated relative bottom offset.
      */
    var rbottom: blessedLib.blessedMod.WidgetsNs.TypesNs.TPosition = js.native
    /**
      * Calculated relative right offset.
      */
    var right: blessedLib.blessedMod.WidgetsNs.TypesNs.TPosition = js.native
    /**
      * Calculated relative left offset.
      */
    var rleft: blessedLib.blessedMod.WidgetsNs.TypesNs.TTopLeft = js.native
    /**
      * Calculated relative right offset.
      */
    var rright: blessedLib.blessedMod.WidgetsNs.TypesNs.TPosition = js.native
    /**
      * Calculated relative top offset.
      */
    var rtop: blessedLib.blessedMod.WidgetsNs.TypesNs.TTopLeft = js.native
    var style: js.Any = js.native
    /**
      * Calculated relative top offset.
      */
    var top: blessedLib.blessedMod.WidgetsNs.TypesNs.TTopLeft = js.native
    var underline: java.lang.String = js.native
    var visible: scala.Boolean = js.native
    /**
      * Calculated width.
      */
    var width: scala.Double | java.lang.String = js.native
    /**
      * Clear a line from the box's content from the visible top.
      */
    def clearBaseLine(i: scala.Double): scala.Unit = js.native
    /**
      * Clear a line from the box's content.
      */
    def clearLine(i: scala.Double): scala.Unit = js.native
    /**
      * Delete a line at the bottom of the box.
      */
    def deleteBottom(): scala.Unit = js.native
    /**
      * Delete a line from the box's content.
      */
    def deleteLine(i: scala.Double): scala.Unit = js.native
    /**
      * Delete a line at the top of the box.
      */
    def deleteTop(): scala.Unit = js.native
    /**
      * Disable dragging of the element.
      */
    def disableDrag(): scala.Unit = js.native
    /**
      * Enable dragging of the element.
      */
    def enableDrag(): scala.Unit = js.native
    /**
      * Enable key and mouse events. Calls bot enableMouse and enableKeys.
      */
    def enableInput(): scala.Unit = js.native
    /**
      * Enable keypress events for the element (automatically called when a form of on('keypress') is bound).
      */
    def enableKeys(): scala.Unit = js.native
    /**
      * Enable mouse events for the element (automatically called when a form of on('mouse') is bound).
      */
    def enableMouse(): scala.Unit = js.native
    /**
      * Focus element.
      */
    def focus(): scala.Unit = js.native
    /**
      * Get a line from the box's content from the visible top.
      */
    def getBaseLine(i: scala.Double): java.lang.String = js.native
    /**
      * Return content, slightly different from el.content. Assume the above formatting.
      */
    def getContent(): java.lang.String = js.native
    /**
      * Get a line from the box's content.
      */
    def getLine(i: scala.Double): java.lang.String = js.native
    /**
      * An array containing the content lines.
      */
    def getLines(): js.Array[java.lang.String] = js.native
    /**
      * An array containing the lines as they are displayed on the screen.
      */
    def getScreenLines(): js.Array[java.lang.String] = js.native
    /**
      * Similar to getContent, but return content with tags and escape codes removed.
      */
    def getText(): java.lang.String = js.native
    /**
      * Hide element.
      */
    def hide(): scala.Unit = js.native
    /**
      * Insert a line at the bottom of the box.
      */
    def insertBottom(lines: java.lang.String): scala.Unit = js.native
    def insertBottom(lines: js.Array[java.lang.String]): scala.Unit = js.native
    /**
      * Insert a line into the box's content.
      */
    def insertLine(i: scala.Double, lines: java.lang.String): scala.Unit = js.native
    def insertLine(i: scala.Double, lines: js.Array[java.lang.String]): scala.Unit = js.native
    /**
      * Insert a line at the top of the box.
      */
    def insertTop(lines: java.lang.String): scala.Unit = js.native
    def insertTop(lines: js.Array[java.lang.String]): scala.Unit = js.native
    /**
      * Same asel.on('screen', ...) except this will automatically keep track of which listeners
      * are bound to the screen object. For use with removeScreenEvent(), free(), and destroy().
      */
    def onScreenEvent(`type`: java.lang.String, handler: js.Function1[/* repeated */ js.Any, scala.Unit]): scala.Unit = js.native
    /**
      * Pop a line off the bottom of the content.
      */
    def popLine(i: scala.Double): java.lang.String = js.native
    /**
      * Push a line onto the bottom of the content.
      */
    def pushLine(lines: java.lang.String): scala.Unit = js.native
    def pushLine(lines: js.Array[java.lang.String]): scala.Unit = js.native
    /**
      * Remove the hover label completely.
      */
    def removeHover(): scala.Unit = js.native
    /**
      * Remove the label completely.
      */
    def removeLabel(): js.Any = js.native
    /**
      * Same asel.removeListener('screen', ...) except this will automatically keep track of which
      * listeners are bound to the screen object. For use with onScreenEvent(), free(), and destroy().
      */
    def removeScreenEvent(`type`: java.lang.String, handler: js.Function1[/* repeated */ js.Any, scala.Unit]): scala.Unit = js.native
    /**
      * Write content and children to the screen buffer.
      */
    def render(): Coords = js.native
    def screenshot(): scala.Unit = js.native
    /**
      * Take an SGR screenshot of the screen within the region. Returns a string containing only
      * characters and SGR codes. Can be displayed by simply echoing it in a terminal.
      */
    def screenshot(xi: scala.Double, xl: scala.Double, yi: scala.Double, yl: scala.Double): java.lang.String = js.native
    /**
      * Put the element in back of its siblings.
      */
    def setBack(): scala.Unit = js.native
    /**
      * Set a line in the box's content from the visible top.
      */
    def setBaseLine(i: scala.Double, line: java.lang.String): scala.Unit = js.native
    def setBaseLine(i: scala.Double, line: js.Array[java.lang.String]): scala.Unit = js.native
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
    def setContent(text: java.lang.String): scala.Unit = js.native
    /**
      * Put the element in front of its siblings.
      */
    def setFront(): scala.Unit = js.native
    def setHover(arg: LabelOptions): scala.Unit = js.native
    /**
      * text/options - Set a hover text box to follow the cursor. Similar to the "title" DOM attribute
      * in the browser. Example options: {text:'foo'}
      */
    def setHover(arg: java.lang.String): scala.Unit = js.native
    /**
      * Set the z-index of the element (changes rendering order).
      */
    def setIndex(z: scala.Double): scala.Unit = js.native
    def setLabel(arg: LabelOptions): scala.Unit = js.native
    /**
      * text/options - Set the label text for the top-left corner. Example options: {text:'foo',side:'left'}
      */
    def setLabel(arg: java.lang.String): scala.Unit = js.native
    /**
      * Set a line in the box's content.
      */
    def setLine(i: scala.Double, line: java.lang.String): scala.Unit = js.native
    def setLine(i: scala.Double, line: js.Array[java.lang.String]): scala.Unit = js.native
    /**
      * Similar to setContent, but ignore tags and remove escape codes.
      */
    def setText(text: java.lang.String): scala.Unit = js.native
    /**
      * Shift a line off the top of the content.
      */
    def shiftLine(i: scala.Double): scala.Unit = js.native
    /**
      * Show element.
      */
    def show(): scala.Unit = js.native
    /**
      * Get a string's displayed width, taking into account double-width, surrogate pairs,
      * combining characters, tags, and SGR escape codes.
      */
    def strWidth(text: java.lang.String): java.lang.String = js.native
    /**
      * Toggle hidden/shown.
      */
    def toggle(): scala.Unit = js.native
    /**
      * Unshift a line onto the top of the content.
      */
    def unshiftLine(lines: java.lang.String): scala.Unit = js.native
    def unshiftLine(lines: js.Array[java.lang.String]): scala.Unit = js.native
  }
  
  trait Border extends js.Object {
    /**
      * Border foreground and background, must be numbers (-1 for default).
      */
    var bg: js.UndefOr[scala.Double] = js.undefined
    /**
      * Border attributes.
      */
    var bold: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Character to use if bg type, default is space.
      */
    var ch: js.UndefOr[java.lang.String] = js.undefined
    var fg: js.UndefOr[scala.Double] = js.undefined
    /**
      * Type of border (line or bg). bg by default.
      */
    var `type`: js.UndefOr[blessedLib.blessedLibStrings.line | blessedLib.blessedLibStrings.bg] = js.undefined
    var underline: js.UndefOr[java.lang.String] = js.undefined
  }
  
  /**
    * A box element which draws a simple box containing content or other elements.
    */
  @js.native
  class BoxElement protected () extends ScrollableTextElement {
    def this(opts: BoxOptions) = this()
    /**
      * Original options object.
      */
    @JSName("options")
    var options_BoxElement: BoxOptions = js.native
  }
  
  trait BoxOptions extends ScrollableTextOptions {
    var bindings: js.UndefOr[js.Any] = js.undefined
  }
  
  @js.native
  class ButtonElement protected () extends InputElement {
    def this(opts: ButtonOptions) = this()
    /**
      * Original options object.
      */
    @JSName("options")
    var options_ButtonElement: ButtonOptions = js.native
    @JSName("on")
    def on_press(event: blessedLib.blessedLibStrings.press, callback: js.Function0[scala.Unit]): this.type = js.native
    /**
      * Press button. Emits press.
      */
    def press(): scala.Unit = js.native
  }
  
  /**
    * A checkbox which can be used in a form element.
    */
  @js.native
  class CheckboxElement () extends InputElement {
    def this(options: CheckboxOptions) = this()
    /**
      * whether the element is checked or not.
      */
    var checked: scala.Boolean = js.native
    /**
      * Original options object.
      */
    @JSName("options")
    var options_CheckboxElement: CheckboxOptions = js.native
    /**
      * the text next to the checkbox (do not use setcontent, use `check.text = ''`).
      */
    var text: java.lang.String = js.native
    /**
      * same as `checked`.
      */
    var value: scala.Boolean = js.native
    /**
      * check the element.
      */
    def check(): scala.Unit = js.native
    /**
      * uncheck the element.
      */
    def uncheck(): scala.Unit = js.native
  }
  
  trait CheckboxOptions extends BoxOptions {
    /**
      * whether the element is checked or not.
      */
    var checked: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * enable mouse support.
      */
    @JSName("mouse")
    var mouse_CheckboxOptions: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  trait Coords extends js.Object {
    var _contentEnd: blessedLib.Anon_X
    var base: scala.Double
    var nobot: blessedLib.blessedMod.WidgetsNs.TypesNs.TPosition
    var noleft: blessedLib.blessedMod.WidgetsNs.TypesNs.TTopLeft
    var noright: blessedLib.blessedMod.WidgetsNs.TypesNs.TPosition
    var notop: blessedLib.blessedMod.WidgetsNs.TypesNs.TTopLeft
    var xi: scala.Double
    var xl: scala.Double
    var yi: scala.Double
    var yl: scala.Double
  }
  
  trait ElementOptions extends INodeOptions {
    /**
      * Text alignment: left, center, or right.
      */
    var align: js.UndefOr[
        blessedLib.blessedLibStrings.left | blessedLib.blessedLibStrings.center | blessedLib.blessedLibStrings.right
      ] = js.undefined
    var bg: js.UndefOr[java.lang.String] = js.undefined
    var bold: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Border object, see below.
      */
    var border: js.UndefOr[Border | blessedLib.blessedLibStrings.line | blessedLib.blessedLibStrings.bg] = js.undefined
    var bottom: js.UndefOr[blessedLib.blessedMod.WidgetsNs.TypesNs.TPosition] = js.undefined
    /**
      * Background character (default is whitespace ).
      */
    var ch: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Element is clickable.
      */
    var clickable: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Element's text content.
      */
    var content: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Allow the element to be dragged with the mouse.
      */
    var draggable: js.UndefOr[scala.Boolean] = js.undefined
    var fg: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Element is focused.
      */
    var focused: js.UndefOr[BlessedElement] = js.undefined
    /**
      * Offsets of the element relative to its parent. Can be a number, percentage (0-100%), or
      * keyword (center). right and bottom do not accept keywords. Percentages can also have
      * offsets (50%+1, 50%-1).
      */
    var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
    /**
      * Whether the element is hidden.
      */
    var hidden: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * A floating text label for the element which appears on mouseover.
      */
    var hoverText: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Element is focusable and can receive key input.
      */
    var input: js.UndefOr[scala.Boolean] = js.undefined
    var keyable: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * A simple text label for the element.
      */
    var label: js.UndefOr[java.lang.String] = js.undefined
    var left: js.UndefOr[blessedLib.blessedMod.WidgetsNs.TypesNs.TTopLeft] = js.undefined
    /**
      * Amount of padding on the inside of the element. Can be a number or an object containing
      * the properties: left, right, top, and bottom.
      */
    var padding: js.UndefOr[scala.Double | Padding] = js.undefined
    /**
      * Can contain the above options.
      */
    var position: js.UndefOr[Position] = js.undefined
    var right: js.UndefOr[blessedLib.blessedMod.WidgetsNs.TypesNs.TPosition] = js.undefined
    /**
      * Whether the element is scrollable or not.
      */
    var scrollable: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Draw a translucent offset shadow behind the element.
      */
    var shadow: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Shrink/flex/grow to content and child elements. Width/height during render.
      */
    var shrink: js.UndefOr[scala.Boolean] = js.undefined
    var style: js.UndefOr[js.Any] = js.undefined
    var tags: js.UndefOr[scala.Boolean] = js.undefined
    var top: js.UndefOr[blessedLib.blessedMod.WidgetsNs.TypesNs.TTopLeft] = js.undefined
    var underline: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Vertical text alignment: top, middle, or bottom.
      */
    var valign: js.UndefOr[
        blessedLib.blessedLibStrings.top | blessedLib.blessedLibStrings.middle | blessedLib.blessedLibStrings.bottom
      ] = js.undefined
    /**
      * Width/height of the element, can be a number, percentage (0-100%), or keyword (half or shrink).
      * Percentages can also have offsets (50%+1, 50%-1).
      */
    var width: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  }
  
  @js.native
  class FileManagerElement protected () extends ListElement {
    def this(opts: FileManagerOptions) = this()
    /**
      * Current working directory.
      */
    var cwd: java.lang.String = js.native
    /**
      * Original options object.
      */
    @JSName("options")
    var options_FileManagerElement: FileManagerOptions = js.native
    /** Received when an item is selected. */
    @JSName("on")
    def on_cd(
      event: blessedLib.blessedLibStrings.cd,
      callback: js.Function2[/* file */ java.lang.String, /* cwd */ java.lang.String, scala.Unit]
    ): this.type = js.native
    @JSName("on")
    def on_error(
      event: blessedLib.blessedLibStrings.error,
      callback: js.Function2[/* err */ js.Any, /* file */ java.lang.String, scala.Unit]
    ): this.type = js.native
    /** Received when an item is selected. */
    @JSName("on")
    def on_file(
      event: blessedLib.blessedLibStrings.file,
      callback: js.Function1[/* file */ java.lang.String, scala.Unit]
    ): this.type = js.native
    @JSName("on")
    def on_refresh(event: blessedLib.blessedLibStrings.refresh, callback: js.Function0[scala.Unit]): this.type = js.native
    /**
      * Pick a single file and return the path in the callback.
      */
    def pick(cwd: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
    def refresh(): scala.Unit = js.native
    def refresh(callback: js.Function0[scala.Unit]): scala.Unit = js.native
    /**
      * Refresh the file list (perform a readdir on cwd and update the list items).
      */
    def refresh(cwd: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
    def reset(): scala.Unit = js.native
    def reset(callback: js.Function0[scala.Unit]): scala.Unit = js.native
    /**
      * Reset back to original cwd.
      */
    def reset(cwd: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
  }
  
  trait FileManagerOptions extends ListOptions[ListElementStyle] {
    /**
      * Current working directory.
      */
    var cwd: js.UndefOr[java.lang.String] = js.undefined
  }
  
  @js.native
  class FormElement[TFormData] protected () extends BoxElement {
    def this(opts: FormOptions) = this()
    /**
      * Original options object.
      */
    @JSName("options")
    var options_FormElement: FormOptions = js.native
    /**
      * Last submitted data.
      */
    var submission: TFormData = js.native
    /**
      * Discard the form.
      */
    def cancel(): scala.Unit = js.native
    /**
      * Focus next form element.
      */
    def focusNext(): scala.Unit = js.native
    /**
      * Focus previous form element.
      */
    def focusPrevious(): scala.Unit = js.native
    @JSName("on")
    def on_cancel(event: blessedLib.blessedLibStrings.cancel, callback: js.Function0[scala.Unit]): this.type = js.native
    @JSName("on")
    def on_reset(event: blessedLib.blessedLibStrings.reset, callback: js.Function0[scala.Unit]): this.type = js.native
    /** Form is submitted. Receives a data object. */
    @JSName("on")
    def on_submit(
      event: blessedLib.blessedLibStrings.submit,
      callback: js.Function1[/* out */ TFormData, scala.Unit]
    ): this.type = js.native
    /**
      * Clear the form.
      */
    def reset(): scala.Unit = js.native
    /**
      * Submit the form.
      */
    def submit(): scala.Unit = js.native
  }
  
  trait FormOptions extends BoxOptions {
    /**
      * Allow default keys (tab, vi keys, enter).
      */
    @JSName("keys")
    var keys_FormOptions: js.UndefOr[js.Any] = js.undefined
  }
  
  trait IDestroyable extends js.Object {
    def destroy(): scala.Unit
  }
  
  trait IHasOptions[T /* <: IOptions */] extends js.Object {
    var options: T
  }
  
  trait INodeOptions extends IOptions {
    var children: js.UndefOr[js.Array[Node]] = js.undefined
    var focusable: js.UndefOr[scala.Boolean] = js.undefined
    var name: js.UndefOr[java.lang.String] = js.undefined
    var parent: js.UndefOr[Node] = js.undefined
    var screen: js.UndefOr[Screen] = js.undefined
  }
  
  trait IOptions extends js.Object
  
  trait IScreenOptions extends INodeOptions {
    /**
      * Absolute bottom offset, always zero.
      */
    var abottom: js.UndefOr[blessedLib.blessedMod.WidgetsNs.TypesNs.TPosition] = js.undefined
    /**
      * Absolute left offset, always zero.
      */
    var aleft: js.UndefOr[blessedLib.blessedMod.WidgetsNs.TypesNs.TTopLeft] = js.undefined
    /**
      * Absolute right offset, always zero.
      */
    var aright: js.UndefOr[blessedLib.blessedMod.WidgetsNs.TypesNs.TPosition] = js.undefined
    /**
      * Absolute top offset, always zero.
      */
    var atop: js.UndefOr[blessedLib.blessedMod.WidgetsNs.TypesNs.TTopLeft] = js.undefined
    /**
      * Automatically position child elements with border and padding in mind (NOTE: this is a recommended
      * option. It may become default in the future).
      */
    var autoPadding: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Relative bottom offset, always zero.
      */
    var bottom: js.UndefOr[blessedLib.blessedMod.WidgetsNs.TypesNs.TPosition] = js.undefined
    /**
      * Same as screen.width.
      */
    var cols: js.UndefOr[scala.Double] = js.undefined
    var cursor: js.UndefOr[blessedLib.blessedMod.WidgetsNs.TypesNs.TCursor] = js.undefined
    /**
      * Debug mode. Enables usage of the debug method. Also creates a debug console which will display when
      * pressing F12. It will display all log and debug messages.
      */
    var debug: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Automatically "dock" borders with other elements instead of overlapping, depending on position
      * (experimental). For example: These border-overlapped elements:
      */
    var dockBorders: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Dump all output and input to desired file. Can be used together with log option if set as a boolean.
      */
    var dump: js.UndefOr[java.lang.String | scala.Boolean] = js.undefined
    /**
      * Do CSR on any element within 20 cols of the screen edge on either side. Faster than smartCSR,
      * but may cause flickering depending on what is on each side of the element.
      */
    var fastCSR: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Top of the focus history stack.
      */
    var focused: js.UndefOr[BlessedElement] = js.undefined
    /**
      * Force blessed to use unicode even if it is not detected via terminfo, env variables, or windows code page.
      * If value is true unicode is forced. If value is false non-unicode is forced (default: null).
      */
    var forceUnicode: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Allow for rendering of East Asian double-width characters, utf-16 surrogate pairs, and unicode
      * combining characters. This allows you to display text above the basic multilingual plane. This
      * is behind an option because it may affect performance slightly negatively. Without this option
      * enabled, all double-width, surrogate pair, and combining characters will be replaced by '??',
      * '?', '' respectively. (NOTE: iTerm2 cannot display combining characters properly. Blessed simply
      * removes them from an element's content if iTerm2 is detected).
      */
    var fullUnicode: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Whether the focused element grabs all keypresses.
      */
    var grabKeys: js.UndefOr[js.Any] = js.undefined
    /**
      * Height of the screen (same as program.rows).
      */
    var height: js.UndefOr[blessedLib.blessedMod.WidgetsNs.TypesNs.TPosition] = js.undefined
    /**
      * The currently hovered element. Only set if mouse events are bound.
      */
    var hover: js.UndefOr[js.Any] = js.undefined
    /**
      * Normally, dockable borders will not dock if the colors or attributes are different. This option
      * will allow them to dock regardless. It may produce some odd looking multi-colored borders though.
      */
    var ignoreDockContrast: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Array of keys in their full format (e.g. C-c) to ignore when keys are locked or grabbed. Useful
      * for creating a key that will always exit no matter whether the keys are locked.
      */
    var ignoreLocked: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Input and output streams. process.stdin/process.stdout by default, however, it could be a
      * net.Socket if you want to make a program that runs over telnet or something of that nature.
      */
    var input: js.UndefOr[nodeLib.streamMod.Writable] = js.undefined
    /**
      * Relative left offset, always zero.
      */
    var left: js.UndefOr[blessedLib.blessedMod.WidgetsNs.TypesNs.TTopLeft] = js.undefined
    /**
      * Prevent keypresses from being received by any element.
      */
    var lockKeys: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Create a log file. See log method.
      */
    var log: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Input and output streams. process.stdin/process.stdout by default, however, it could be a
      * net.Socket if you want to make a program that runs over telnet or something of that nature.
      */
    var output: js.UndefOr[nodeLib.streamMod.Readable] = js.undefined
    /**
      * The blessed Program to be associated with. Will be automatically instantiated if none is provided.
      */
    var program: js.UndefOr[blessedLib.blessedMod.BlessedProgram] = js.undefined
    /**
      * Amount of time (in ms) to redraw the screen after the terminal is resized (Default: 300).
      */
    var resizeTimeout: js.UndefOr[scala.Double] = js.undefined
    /**
      * Relative right offset, always zero.
      */
    var right: js.UndefOr[blessedLib.blessedMod.WidgetsNs.TypesNs.TPosition] = js.undefined
    /**
      * Same as screen.height.
      */
    var rows: js.UndefOr[scala.Double] = js.undefined
    /**
      * Send focus events after mouse is enabled.
      */
    var sendFocus: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Attempt to perform CSR optimization on all possible elements (not just full-width ones, elements with
      * uniform cells to their sides). This is known to cause flickering with elements that are not full-width,
      * however, it is more optimal for terminal rendering.
      */
    var smartCSR: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * The width of tabs within an element's content.
      */
    var tabSize: js.UndefOr[scala.Double] = js.undefined
    /**
      * Set or get terminal name. Set calls screen.setTerminal() internally.
      */
    var terminal: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Set or get window title.
      */
    var title: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Relative top offset, always zero.
      */
    var top: js.UndefOr[blessedLib.blessedMod.WidgetsNs.TypesNs.TTopLeft] = js.undefined
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
    var useBCE: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Display warnings (such as the output not being a TTY, similar to ncurses).
      */
    var warnings: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Width of the screen (same as program.cols).
      */
    var width: js.UndefOr[blessedLib.blessedMod.WidgetsNs.TypesNs.TPosition] = js.undefined
  }
  
  /**
    * Display an image in the terminal (jpeg, png, gif) using w3mimgdisplay. Requires w3m to be installed.
    * X11 required: works in xterm, urxvt, and possibly other terminals.
    */
  @js.native
  class ImageElement () extends BoxElement {
    def this(options: ImageOptions) = this()
    @JSName("options")
    var options_ImageElement: ImageOptions = js.native
  }
  
  trait ImageOptions extends BoxOptions {
    /**
      * path to image.
      */
    var file: java.lang.String
    /**
      * path to w3mimgdisplay. if a proper w3mimgdisplay path is not given, blessed will search the
      * entire disk for the binary.
      */
    var `type`: blessedLib.blessedLibStrings.ansi | blessedLib.blessedLibStrings.overlay | blessedLib.blessedLibStrings.w3m
  }
  
  @js.native
  abstract class InputElement protected () extends BoxElement {
    def this(opts: InputOptions) = this()
  }
  
  trait LabelOptions extends js.Object {
    var side: blessedLib.blessedMod.WidgetsNs.TypesNs.TAlign
    var text: java.lang.String
  }
  
  @js.native
  class LayoutElement () extends BlessedElement {
    def this(options: LayoutOptions) = this()
    @JSName("options")
    var options_LayoutElement: LayoutOptions = js.native
    /**
      * Get the last rendered and visible child element based on an index. This is useful for basing the position
      * of the current child element on the position of the last child element.
      */
    def getLast(i: scala.Double): BlessedElement = js.native
    /**
      * Get the last rendered and visible child element coords based on an index. This is useful for basing the position
      * of the current child element on the position of the last child element. See the example below.
      */
    def getLastCoords(i: scala.Double): PositionCoords = js.native
    /**
      * Check to see if a previous child element has been rendered and is visible on screen. This is only useful
      * for checking child elements that have already been attempted to be rendered! see the example below.
      */
    def isRendered(el: BlessedElement): scala.Boolean = js.native
    /**
      * A callback which is called right before the children are iterated over to be rendered. Should return an
      * iterator callback which is called on each child element: iterator(el, i).
      */
    def renderer(coords: PositionCoords): scala.Unit = js.native
  }
  
  trait LayoutOptions extends ElementOptions {
    /**
      * Using the default renderer, it provides two layouts: inline, and grid. inline is the default and will render
      * akin to inline-block. grid will create an automatic grid based on element dimensions. The grid cells'
      * width and height are always determined by the largest children in the layout.
      */
    var layout: blessedLib.blessedLibStrings.`inline` | blessedLib.blessedLibStrings.`inline-block` | blessedLib.blessedLibStrings.grid
    /**
      * A callback which is called right before the children are iterated over to be rendered. Should return an
      * iterator callback which is called on each child element: iterator(el, i).
      */
    var renderer: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  }
  
  /**
    * A simple line which can be line or bg styled.
    */
  @js.native
  class LineElement protected () extends BoxElement {
    def this(opts: LineOptions) = this()
    /**
      * Original options object.
      */
    @JSName("options")
    var options_LineElement: LineOptions = js.native
  }
  
  /**
    * A simple line which can be line or bg styled.
    */
  trait LineOptions extends BoxOptions {
    /**
      * Can be vertical or horizontal.
      */
    var orientation: js.UndefOr[blessedLib.blessedLibStrings.vertical | blessedLib.blessedLibStrings.horizontal] = js.undefined
    /**
      * Treated the same as a border object. (attributes can be contained in style).
      */
    var `type`: js.UndefOr[java.lang.String] = js.undefined
  }
  
  @js.native
  class ListElement protected () extends BoxElement {
    def this(opts: ListOptions[ListElementStyle]) = this()
    /**
      * Original options object.
      */
    @JSName("options")
    var options_ListElement: ListOptions[ListElementStyle] = js.native
    /**
      * Add an item based on a string.
      */
    def add(text: java.lang.String): scala.Unit = js.native
    /**
      * Add an item based on a string.
      */
    def addItem(text: java.lang.String): scala.Unit = js.native
    /**
      * Clears all items from the list.
      */
    def clearItems(): scala.Unit = js.native
    /**
      * Select item below selected.
      */
    def down(amount: scala.Double): scala.Unit = js.native
    /**
      * Find an item based on its text content.
      */
    def fuzzyFind(arg: java.lang.String): scala.Unit = js.native
    def fuzzyFind(arg: js.Function0[scala.Unit]): scala.Unit = js.native
    def fuzzyFind(arg: stdLib.RegExp): scala.Unit = js.native
    /**
      * Returns the item element. Child can be an element, index, or string.
      */
    def getItem(child: BlessedElement): BlessedElement = js.native
    /**
      * Returns the item index from the list. Child can be an element, index, or string.
      */
    def getItemIndex(child: BlessedElement): scala.Double = js.native
    /**
      * Inserts an item to the list. Child can be an element, index, or string.
      */
    def insertItem(i: scala.Double, child: BlessedElement): scala.Unit = js.native
    /**
      * Select item based on current offset.
      */
    def move(offset: scala.Double): scala.Unit = js.native
    def on(event: ListElementEventType, callback: js.Function0[scala.Unit]): this.type = js.native
    /** Received when an item is selected. */
    @JSName("on")
    def on_select(
      event: blessedLib.blessedLibStrings.select,
      callback: js.Function2[/* item */ BoxElement, /* index */ scala.Double, scala.Unit]
    ): this.type = js.native
    @JSName("on")
    def `on_select item`(
      event: blessedLib.blessedLibStrings.`select item`,
      callback: js.Function2[/* item */ BlessedElement, /* index */ scala.Double, scala.Unit]
    ): this.type = js.native
    /**
      * Show/focus list and pick an item. The callback is executed with the result.
      */
    def pick(callback: js.Function0[scala.Unit]): scala.Unit = js.native
    /**
      * Pop an item off the list.
      */
    def popItem(): BlessedElement = js.native
    /**
      * Push an item onto the list.
      */
    def pushItem(child: BlessedElement): scala.Double = js.native
    /**
      * Removes an item from the list. Child can be an element, index, or string.
      */
    def removeItem(child: BlessedElement): BlessedElement = js.native
    /**
      * Select an index of an item.
      */
    def select(index: scala.Double): scala.Unit = js.native
    /**
      * Set item to content.
      */
    def setItem(child: BlessedElement, content: BlessedElement): scala.Unit = js.native
    def setItem(child: BlessedElement, content: java.lang.String): scala.Unit = js.native
    /**
      * Sets the list items to multiple strings.
      */
    def setItems(items: js.Array[BlessedElement]): scala.Unit = js.native
    /**
      * Shift an item off the list.
      */
    def shiftItem(): BlessedElement = js.native
    /**
      * Remove and insert items to the list.
      */
    def spliceItem(i: scala.Double, n: scala.Double, items: BlessedElement*): scala.Unit = js.native
    /**
      * Unshift an item onto the list.
      */
    def unshiftItem(child: BlessedElement): scala.Double = js.native
    /**
      * Select item above selected.
      */
    def up(amount: scala.Double): scala.Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - blessedLib.blessedLibStrings.cancel
    - blessedLib.blessedLibStrings.action
    - blessedLib.blessedLibStrings.`create item`
    - blessedLib.blessedLibStrings.`add item`
    - blessedLib.blessedLibStrings.`remove item`
    - blessedLib.blessedLibStrings.`insert item`
    - blessedLib.blessedLibStrings.`set items`
  */
  trait ListElementEventType extends js.Object
  
  trait ListElementStyle extends js.Object {
    var item: js.UndefOr[js.Any] = js.undefined
    var selected: js.UndefOr[js.Any] = js.undefined
  }
  
  trait ListOptions[TStyle /* <: ListElementStyle */] extends BoxOptions {
    /**
      * Whether the list is interactive and can have items selected (Default: true).
      */
    var interactive: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Whether to automatically override tags and invert fg of item when selected (Default: true).
      */
    var invertSelected: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * An array of strings which become the list's items.
      */
    var items: js.UndefOr[js.Array[java.lang.String]] = js.undefined
    /**
      * A function that is called when vi mode is enabled and the key / is pressed. This function accepts a
      * callback function which should be called with the search string. The search string is then used to
      * jump to an item that is found in items.
      */
    var search: js.UndefOr[
        js.Function2[/* err */ js.Any, /* value */ js.UndefOr[java.lang.String], scala.Unit]
      ] = js.undefined
    /**
      * Style for a selected item. Style for an unselected item.
      */
    @JSName("style")
    var style_ListOptions: js.UndefOr[TStyle] = js.undefined
  }
  
  @js.native
  class ListTableElement protected () extends ListElement {
    def this(opts: ListTableOptions) = this()
    /**
      * Original options object.
      */
    @JSName("options")
    var options_ListTableElement: ListTableOptions = js.native
    /**
      * Set rows in table. Array of arrays of strings.
      * @example:
      *
      * table.setData([
      *      [ 'Animals',  'Foods'  ],
      *      [ 'Elephant', 'Apple'  ],
      *      [ 'Bird',     'Orange' ]
      *  ]);
      */
    def setData(rows: js.Array[js.Array[java.lang.String]]): scala.Unit = js.native
    /**
      * Set rows in table. Array of arrays of strings.
      * @example:
      *
      * table.setData([
      *      [ 'Animals',  'Foods'  ],
      *      [ 'Elephant', 'Apple'  ],
      *      [ 'Bird',     'Orange' ]
      *  ]);
      */
    def setRows(rows: js.Array[js.Array[java.lang.String]]): scala.Unit = js.native
  }
  
  trait ListTableOptions extends ListOptions[StyleListTable] {
    var data: js.UndefOr[js.Array[js.Array[java.lang.String]]] = js.undefined
    /**
      * Do not draw inner cells.
      */
    var noCellBorders: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Spaces to attempt to pad on the sides of each cell. 2 by default: one space on each side
      * (only useful if the width is shrunken).
      */
    var pad: js.UndefOr[scala.Double] = js.undefined
    /**
      * Array of array of strings representing rows.
      */
    var rows: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  }
  
  @js.native
  class ListbarElement protected () extends BoxElement {
    def this(opts: ListbarOptions) = this()
    /**
      * Original options object.
      */
    @JSName("options")
    var options_ListbarElement: ListbarOptions = js.native
    /**
      * Append an item to the bar.
      */
    def add(item: blessedLib.blessedMod.WidgetsNs.TypesNs.ListbarCommand, callback: js.Function0[scala.Unit]): scala.Unit = js.native
    /**
      * Append an item to the bar.
      */
    def addItem(item: blessedLib.blessedMod.WidgetsNs.TypesNs.ListbarCommand, callback: js.Function0[scala.Unit]): scala.Unit = js.native
    /**
      * Append an item to the bar.
      */
    def appendItem(item: blessedLib.blessedMod.WidgetsNs.TypesNs.ListbarCommand, callback: js.Function0[scala.Unit]): scala.Unit = js.native
    /**
      * Move relatively across the bar.
      */
    def move(offset: scala.Double): scala.Unit = js.native
    /**
      * Move left relatively across the bar.
      */
    def moveLeft(offset: scala.Double): scala.Unit = js.native
    /**
      * Move right relatively across the bar.
      */
    def moveRight(offset: scala.Double): scala.Unit = js.native
    @JSName("on")
    def `on_remove item`(event: blessedLib.blessedLibStrings.`remove item`, callback: js.Function0[scala.Unit]): this.type = js.native
    @JSName("on")
    def `on_select tab`(event: blessedLib.blessedLibStrings.`select tab`, callback: js.Function0[scala.Unit]): this.type = js.native
    @JSName("on")
    def `on_set items`(event: blessedLib.blessedLibStrings.`set items`, callback: js.Function0[scala.Unit]): this.type = js.native
    /**
      * Remove item from the bar.
      */
    def removeItem(child: BlessedElement): scala.Unit = js.native
    /**
      * Select an item on the bar.
      */
    def select(offset: scala.Double): scala.Unit = js.native
    /**
      * Select button and execute its callback.
      */
    def selectTab(index: scala.Double): scala.Unit = js.native
    /**
      * Set commands (see commands option above).
      */
    def setItems(commands: js.Array[blessedLib.blessedMod.WidgetsNs.TypesNs.ListbarCommand]): scala.Unit = js.native
  }
  
  trait ListbarOptions extends BoxOptions {
    /**
      * Automatically bind list buttons to keys 0-9.
      */
    var autoCommandKeys: scala.Boolean
    /**
      * Set buttons using an object with keys as titles of buttons, containing of objects
      * containing keys of keys and callback.
      */
    var commands: js.Array[blessedLib.blessedMod.WidgetsNs.TypesNs.ListbarCommand]
    var items: js.Array[blessedLib.blessedMod.WidgetsNs.TypesNs.ListbarCommand]
    @JSName("style")
    var style_ListbarOptions: js.UndefOr[ListElementStyle] = js.undefined
  }
  
  /**
    * A box with a spinning line to denote loading (automatically hidden).
    */
  @js.native
  class LoadingElement protected () extends BoxElement {
    def this(opts: LoadingOptions) = this()
    @JSName("options")
    var options_LoadingElement: LoadingOptions = js.native
    /**
      * Display the loading box with a message. Will lock keys until stop is called.
      */
    def load(text: java.lang.String): scala.Unit = js.native
    /**
      * Hide loading box. Unlock keys.
      */
    def stop(): scala.Unit = js.native
  }
  
  /**
    * A log permanently scrolled to the bottom.
    */
  @js.native
  class Log () extends ScrollableTextElement {
    def this(options: LogOptions) = this()
    @JSName("options")
    var options_Log: LogOptions = js.native
    /**
      * scroll to bottom on input even if the user has scrolled up. default: false.
      */
    var scrollOnInput: scala.Boolean = js.native
    /**
      * amount of scrollback allowed. default: Infinity.
      */
    var scrollback: scala.Double = js.native
    /**
      * add a log line.
      */
    def add(text: java.lang.String): scala.Unit = js.native
    /**
      * add a log line.
      */
    def log(text: java.lang.String): scala.Unit = js.native
  }
  
  trait LogOptions extends ScrollableTextOptions {
    /**
      * scroll to bottom on input even if the user has scrolled up. default: false.
      */
    var scrollOnInput: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * amount of scrollback allowed. default: Infinity.
      */
    var scrollback: js.UndefOr[scala.Double] = js.undefined
  }
  
  /**
    * A box containing a message to be displayed (automatically hidden).
    */
  @js.native
  class MessageElement protected () extends BoxElement {
    def this(opts: MessageOptions) = this()
    @JSName("options")
    var options_MessageElement: MessageOptions = js.native
    def display(text: java.lang.String, callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit = js.native
    def display(text: java.lang.String, time: scala.Double, callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit = js.native
    def error(text: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
    /**
      * Display an error in the same way.
      */
    def error(text: java.lang.String, time: scala.Double, callback: js.Function0[scala.Unit]): scala.Unit = js.native
    def log(text: java.lang.String, callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit = js.native
    /**
      * Display a message for a time (default is 3 seconds). Set time to 0 for a
      * perpetual message that is dismissed on keypress.
      */
    def log(text: java.lang.String, time: scala.Double, callback: js.Function1[/* err */ js.Any, scala.Unit]): scala.Unit = js.native
  }
  
  @js.native
  abstract class Node protected ()
    extends nodeLib.eventsMod.EventEmitter
       with IHasOptions[INodeOptions]
       with IDestroyable {
    def this(options: INodeOptions) = this()
    /**
      * An object for any miscellanous user data.
      */
    @JSName("$")
    var $: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    /**
      * An object for any miscellanous user data.
      */
    var `_`: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    /**
      * Array of node's children.
      */
    var children: js.Array[Node] = js.native
    /**
      * An object for any miscellanous user data.
      */
    var data: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
    var focusable: scala.Boolean = js.native
    /**
      * Render index (document order index) of the last render call.
      */
    var index: scala.Double = js.native
    /* CompleteClass */
    override var options: INodeOptions = js.native
    /**
      * Parent node.
      */
    var parent: Node = js.native
    /**
      * Parent screen.
      */
    var screen: Screen = js.native
    /**
      * Type of the node (e.g. box).
      */
    var `type`: java.lang.String = js.native
    /* InferMemberOverrides */
    override def addListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def addListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
    /**
      * Append a node to this node's children.
      */
    def append(node: Node): scala.Unit = js.native
    def collectAncestors(s: js.Any): scala.Unit = js.native
    def collectDescendants(s: js.Any): scala.Unit = js.native
    /* CompleteClass */
    override def destroy(): scala.Unit = js.native
    /**
      * Remove node from its parent.
      */
    def detach(): scala.Unit = js.native
    /* InferMemberOverrides */
    override def emit(event: java.lang.String, args: js.Any*): scala.Boolean = js.native
    /* InferMemberOverrides */
    override def emit(event: js.Symbol, args: js.Any*): scala.Boolean = js.native
    def emitAncestors(): scala.Unit = js.native
    /**
      * Emit event for element, and recursively emit same event for all descendants.
      */
    def emitDescendants(): scala.Unit = js.native
    def emitDescendants(`type`: java.lang.String, args: js.Any*): scala.Unit = js.native
    /* InferMemberOverrides */
    override def eventNames(): js.Array[java.lang.String | js.Symbol] = js.native
    def forAncestors(iter: js.Function1[/* node */ this.type, scala.Unit], s: js.Any): scala.Unit = js.native
    def forDescendants(iter: js.Function1[/* node */ this.type, scala.Unit], s: js.Any): scala.Unit = js.native
    def free(): scala.Unit = js.native
    /**
      * Get user property with a potential default value.
      */
    def get[T](name: java.lang.String, `def`: T): T = js.native
    /* InferMemberOverrides */
    override def getMaxListeners(): scala.Double = js.native
    def hasAncestor(target: Node): scala.Boolean = js.native
    def hasDescendant(target: Node): scala.Unit = js.native
    /**
      * Insert a node to this node's children at index i.
      */
    def insert(node: Node, index: scala.Double): scala.Unit = js.native
    /**
      * Insert a node from node after the reference node.
      */
    def insertAfter(node: Node, refNode: Node): scala.Unit = js.native
    /**
      * Insert a node to this node's children before the reference node.
      */
    def insertBefore(node: Node, refNode: Node): scala.Unit = js.native
    /* InferMemberOverrides */
    override def listenerCount(`type`: java.lang.String): scala.Double = js.native
    /* InferMemberOverrides */
    override def listenerCount(`type`: js.Symbol): scala.Double = js.native
    /* InferMemberOverrides */
    override def listeners(event: java.lang.String): js.Array[js.Function] = js.native
    /* InferMemberOverrides */
    override def listeners(event: js.Symbol): js.Array[js.Function] = js.native
    /* InferMemberOverrides */
    override def off(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def off(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
    def on(event: NodeEventType, callback: js.Function1[/* arg */ this.type, scala.Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def on(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def once(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def once(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
    /**
      * Prepend a node to this node's children.
      */
    def prepend(node: Node): scala.Unit = js.native
    // Added in Node 6...
    /* InferMemberOverrides */
    override def prependListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def prependListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def prependOnceListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def prependOnceListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def rawListeners(event: java.lang.String): js.Array[js.Function] = js.native
    /* InferMemberOverrides */
    override def rawListeners(event: js.Symbol): js.Array[js.Function] = js.native
    /**
      * Remove child node from node.
      */
    def remove(node: Node): scala.Unit = js.native
    /* InferMemberOverrides */
    override def removeAllListeners(): this.type = js.native
    /* InferMemberOverrides */
    override def removeAllListeners(event: java.lang.String): this.type = js.native
    /* InferMemberOverrides */
    override def removeAllListeners(event: js.Symbol): this.type = js.native
    /* InferMemberOverrides */
    override def removeListener(event: java.lang.String, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
    /* InferMemberOverrides */
    override def removeListener(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, scala.Unit]): this.type = js.native
    /**
      * Set user property to value.
      */
    def set(name: java.lang.String, value: js.Any): scala.Unit = js.native
    /* InferMemberOverrides */
    override def setMaxListeners(n: scala.Double): this.type = js.native
  }
  
  trait NodeChildProcessExecOptions extends js.Object {
    var customFds: js.UndefOr[js.Any] = js.undefined
    var cwd: js.UndefOr[java.lang.String] = js.undefined
    var encoding: js.UndefOr[java.lang.String] = js.undefined
    var env: js.UndefOr[js.Any] = js.undefined
    var killSignal: js.UndefOr[java.lang.String] = js.undefined
    var maxBuffer: js.UndefOr[scala.Double] = js.undefined
    var stdio: js.UndefOr[js.Any] = js.undefined
    var timeout: js.UndefOr[scala.Double] = js.undefined
  }
  
  /* Rewritten from type alias, can be one of: 
    - blessedLib.blessedLibStrings.adopt
    - blessedLib.blessedLibStrings.remove
    - blessedLib.blessedLibStrings.reparent
    - blessedLib.blessedLibStrings.attach
    - blessedLib.blessedLibStrings.detach
  */
  trait NodeEventType extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - blessedLib.blessedLibStrings.resize
    - blessedLib.blessedLibStrings.prerender
    - blessedLib.blessedLibStrings.render
    - blessedLib.blessedLibStrings.destroy
    - blessedLib.blessedLibStrings.move
    - blessedLib.blessedLibStrings.show
    - blessedLib.blessedLibStrings.hide
    - blessedLib.blessedLibStrings.`set content`
    - blessedLib.blessedLibStrings.`parsed content`
  */
  trait NodeGenericEventType extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - blessedLib.blessedLibStrings.mouse
    - blessedLib.blessedLibStrings.mouseout
    - blessedLib.blessedLibStrings.mouseover
    - blessedLib.blessedLibStrings.mousedown
    - blessedLib.blessedLibStrings.mouseup
    - blessedLib.blessedLibStrings.mousewheel
    - blessedLib.blessedLibStrings.wheeldown
    - blessedLib.blessedLibStrings.wheelup
    - blessedLib.blessedLibStrings.mousemove
  */
  trait NodeMouseEventType extends js.Object
  
  /* Rewritten from type alias, can be one of: 
    - blessedLib.blessedLibStrings.focus
    - blessedLib.blessedLibStrings.blur
    - blessedLib.blessedLibStrings.click
    - blessedLib.blessedLibStrings.`element click`
    - blessedLib.blessedLibStrings.`element mouseover`
    - blessedLib.blessedLibStrings.`element mouseout`
    - blessedLib.blessedLibStrings.`element mouseup`
  */
  trait NodeScreenEventType extends js.Object
  
  @js.native
  class NodeWithEvents () extends Node {
    /**
      * Bind a keypress listener for a specific key.
      */
    def key(
      name: java.lang.String,
      listener: js.Function2[
          /* ch */ js.Any, 
          /* key */ blessedLib.blessedMod.WidgetsNs.EventsNs.IKeyEventArg, 
          scala.Unit
        ]
    ): scala.Unit = js.native
    def key(
      name: js.Array[java.lang.String],
      listener: js.Function2[
          /* ch */ js.Any, 
          /* key */ blessedLib.blessedMod.WidgetsNs.EventsNs.IKeyEventArg, 
          scala.Unit
        ]
    ): scala.Unit = js.native
    def on(event: NodeGenericEventType, callback: js.Function0[scala.Unit]): this.type = js.native
    /** Received on mouse events. */
    def on(
      event: NodeMouseEventType,
      callback: js.Function1[/* arg */ blessedLib.blessedMod.WidgetsNs.EventsNs.IMouseEventArg, scala.Unit]
    ): this.type = js.native
    def on(event: NodeScreenEventType, callback: js.Function1[/* arg */ Screen, scala.Unit]): this.type = js.native
    def on(
      event: java.lang.String,
      listener: js.Function2[
          /* ch */ js.Any, 
          /* key */ blessedLib.blessedMod.WidgetsNs.EventsNs.IKeyEventArg, 
          scala.Unit
        ]
    ): this.type = js.native
    /** Received on key events. */
    @JSName("on")
    def on_keypress(
      event: blessedLib.blessedLibStrings.keypress,
      callback: js.Function2[
          /* ch */ java.lang.String, 
          /* key */ blessedLib.blessedMod.WidgetsNs.EventsNs.IKeyEventArg, 
          scala.Unit
        ]
    ): this.type = js.native
    /** Received when blessed notices something untoward (output is not a tty, terminfo not found, etc). */
    @JSName("on")
    def on_warning(
      event: blessedLib.blessedLibStrings.warning,
      callback: js.Function1[/* text */ java.lang.String, scala.Unit]
    ): this.type = js.native
    /**
      * Bind a keypress listener for a specific key once.
      */
    def onceKey(
      name: java.lang.String,
      listener: js.Function2[
          /* ch */ js.Any, 
          /* key */ blessedLib.blessedMod.WidgetsNs.EventsNs.IKeyEventArg, 
          scala.Unit
        ]
    ): scala.Unit = js.native
    def removeKey(
      name: java.lang.String,
      listener: js.Function2[
          /* ch */ js.Any, 
          /* key */ blessedLib.blessedMod.WidgetsNs.EventsNs.IKeyEventArg, 
          scala.Unit
        ]
    ): scala.Unit = js.native
    /**
      * Remove a keypress listener for a specific key.
      */
    def unkey(
      name: java.lang.String,
      listener: js.Function2[
          /* ch */ js.Any, 
          /* key */ blessedLib.blessedMod.WidgetsNs.EventsNs.IKeyEventArg, 
          scala.Unit
        ]
    ): scala.Unit = js.native
  }
  
  /**
    * Convert any .png file (or .gif, see below) to an ANSI image and display it as an element.
    */
  @js.native
  class OverlayImageElement () extends BoxElement {
    def this(options: OverlayImageOptions) = this()
    @JSName("options")
    var options_OverlayImageElement: OverlayImageOptions = js.native
    /**
      * clear the current image.
      */
    def clearImage(callback: js.Function0[scala.Unit]): scala.Unit = js.native
    /**
      * get the pixel to cell ratio for the terminal.
      */
    def getPixelRatio(callback: js.Function0[scala.Unit]): scala.Unit = js.native
    /**
      * get the size of an image file in pixels.
      */
    def imageSize(img: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
    /**
      * set the image in the box to a new path.
      */
    def setImage(img: java.lang.String, callback: js.Function0[scala.Unit]): scala.Unit = js.native
    /**
      * get the size of the terminal in pixels.
      */
    def termSize(callback: js.Function0[scala.Unit]): scala.Unit = js.native
  }
  
  trait OverlayImageOptions extends BoxOptions {
    /**
      * Render the file as ANSI art instead of using w3m to overlay Internally uses the
      * ANSIImage element. See the ANSIImage element for more information/options. (Default: true).
      */
    var ansi: scala.Boolean
    /**
      * Path to image.
      */
    var file: java.lang.String
    /**
      * Whether to search /usr, /bin, and /lib for w3mimgdisplay (Default: true).
      */
    var search: java.lang.String
    /**
      * Path to w3mimgdisplay. If a proper w3mimgdisplay path is not given, blessed will
      * search the entire disk for the binary.
      */
    var w3m: java.lang.String
  }
  
  trait Padding extends js.Object {
    var bottom: js.UndefOr[scala.Double] = js.undefined
    var left: js.UndefOr[scala.Double] = js.undefined
    var right: js.UndefOr[scala.Double] = js.undefined
    var top: js.UndefOr[scala.Double] = js.undefined
  }
  
  trait Position extends js.Object {
    var bottom: scala.Double | java.lang.String
    var left: scala.Double | java.lang.String
    var right: scala.Double | java.lang.String
    var top: scala.Double | java.lang.String
  }
  
  @js.native
  class PositionCoords () extends js.Object {
    var xi: scala.Double = js.native
    var xl: scala.Double = js.native
    var yi: scala.Double = js.native
    var yl: scala.Double = js.native
  }
  
  @js.native
  class Program () extends js.Object {
    /**
      * Wrap the given text in terminal formatting codes corresponding to the given attribute
      * name. The `attr` string can be of the form `red fg` or `52 bg` where `52` is a 0-255
      * integer color number.
      */
    def text(text: java.lang.String, attr: java.lang.String): java.lang.String = js.native
  }
  
  /**
    * A progress bar allowing various styles. This can also be used as a form input.
    */
  @js.native
  class ProgressBarElement () extends InputElement {
    def this(options: ProgressBarOptions) = this()
    @JSName("options")
    var options_ProgressBarElement: ProgressBarOptions = js.native
    @JSName("on")
    def on_complete(event: blessedLib.blessedLibStrings.complete, callback: js.Function0[scala.Unit]): this.type = js.native
    @JSName("on")
    def on_reset(event: blessedLib.blessedLibStrings.reset, callback: js.Function0[scala.Unit]): this.type = js.native
    /**
      * progress the bar by a fill amount.
      */
    def progress(amount: scala.Double): scala.Unit = js.native
    /**
      * reset the bar.
      */
    def reset(): scala.Unit = js.native
    /**
      * set progress to specific amount.
      */
    def setProgress(amount: scala.Double): scala.Unit = js.native
  }
  
  trait ProgressBarOptions extends BoxOptions {
    /**
      * the amount filled (0 - 100).
      */
    var filled: scala.Double
    /**
      * enable key support.
      */
    @JSName("keys")
    var keys_ProgressBarOptions: scala.Boolean
    /**
      * enable mouse support.
      */
    @JSName("mouse")
    var mouse_ProgressBarOptions: scala.Boolean
    /**
      * can be `horizontal` or `vertical`.
      */
    var orientation: java.lang.String
    /**
      * the character to fill the bar with (default is space).
      */
    var pch: java.lang.String
    /**
      * same as `filled`.
      */
    var value: scala.Double
  }
  
  /**
    * A prompt box containing a text input, okay, and cancel buttons (automatically hidden).
    */
  @js.native
  class PromptElement protected () extends BoxElement {
    def this(opts: PromptOptions) = this()
    @JSName("options")
    var options_PromptElement: PromptOptions = js.native
    /**
      * Show the prompt and wait for the result of the textbox. Set text and initial value.
      */
    def input(
      text: java.lang.String,
      value: java.lang.String,
      callback: js.Function2[/* err */ js.Any, /* value */ java.lang.String, scala.Unit]
    ): scala.Unit = js.native
    def readInput(
      text: java.lang.String,
      value: java.lang.String,
      callback: js.Function2[/* err */ js.Any, /* value */ java.lang.String, scala.Unit]
    ): scala.Unit = js.native
    def setInput(
      text: java.lang.String,
      value: java.lang.String,
      callback: js.Function2[/* err */ js.Any, /* value */ java.lang.String, scala.Unit]
    ): scala.Unit = js.native
  }
  
  /**
    * A question box containing okay and cancel buttons (automatically hidden).
    */
  @js.native
  class QuestionElement protected () extends BoxElement {
    def this(opts: QuestionOptions) = this()
    @JSName("options")
    var options_QuestionElement: QuestionOptions = js.native
    /**
      * Ask a question. callback will yield the result.
      */
    def ask(
      question: java.lang.String,
      callback: js.Function2[/* err */ js.Any, /* value */ java.lang.String, scala.Unit]
    ): scala.Unit = js.native
  }
  
  /**
    * A radio button which can be used in a form element.
    */
  @js.native
  abstract class RadioButtonElement protected () extends CheckboxElement {
    def this(opts: RadioButtonOptions) = this()
  }
  
  /**
    * An element wrapping RadioButtons. RadioButtons within this element will be mutually exclusive
    * with each other.
    */
  @js.native
  abstract class RadioSetElement protected () extends BoxElement {
    def this(opts: RadioSetOptions) = this()
  }
  
  @js.native
  class Screen protected () extends NodeWithEvents {
    def this(opts: IScreenOptions) = this()
    /**
      * Absolute bottom offset, always zero.
      */
    var abottom: blessedLib.blessedMod.WidgetsNs.TypesNs.TPosition = js.native
    /**
      * Absolute left offset, always zero.
      */
    var aleft: blessedLib.blessedMod.WidgetsNs.TypesNs.TTopLeft = js.native
    /**
      * Absolute right offset, always zero.
      */
    var aright: blessedLib.blessedMod.WidgetsNs.TypesNs.TPosition = js.native
    /**
      * Absolute top offset, always zero.
      */
    var atop: blessedLib.blessedMod.WidgetsNs.TypesNs.TTopLeft = js.native
    /**
      * Automatically position child elements with border and padding in mind (NOTE: this is a recommended
      * option. It may become default in the future).
      */
    var autoPadding: scala.Boolean = js.native
    /**
      * Relative bottom offset, always zero.
      */
    var bottom: blessedLib.blessedMod.WidgetsNs.TypesNs.TPosition = js.native
    var cleanSides: js.Any = js.native
    /**
      * Same as screen.width.
      */
    var cols: scala.Double = js.native
    var cursor: blessedLib.blessedMod.WidgetsNs.TypesNs.TCursor = js.native
    /**
      * Automatically "dock" borders with other elements instead of overlapping, depending on position
      * (experimental). For example: These border-overlapped elements:
      */
    var dockBorders: scala.Boolean = js.native
    /**
      * Dump all output and input to desired file. Can be used together with log option if set as a boolean.
      */
    var dump: java.lang.String = js.native
    /**
      * Do CSR on any element within 20 cols of the screen edge on either side. Faster than smartCSR,
      * but may cause flickering depending on what is on each side of the element.
      */
    var fastCSR: scala.Boolean = js.native
    /**
      * Top of the focus history stack.
      */
    var focused: BlessedElement = js.native
    /**
      * Force blessed to use unicode even if it is not detected via terminfo, env variables, or windows code page.
      * If value is true unicode is forced. If value is false non-unicode is forced (default: null).
      */
    var forceUnicode: scala.Boolean = js.native
    /**
      * Allow for rendering of East Asian double-width characters, utf-16 surrogate pairs, and unicode
      * combining characters. This allows you to display text above the basic multilingual plane. This
      * is behind an option because it may affect performance slightly negatively. Without this option
      * enabled, all double-width, surrogate pair, and combining characters will be replaced by '??',
      * '?', '' respectively. (NOTE: iTerm2 cannot display combining characters properly. Blessed simply
      * removes them from an element's content if iTerm2 is detected).
      */
    var fullUnicode: scala.Boolean = js.native
    /**
      * Whether the focused element grabs all keypresses.
      */
    var grabKeys: js.Any = js.native
    /**
      * Height of the screen (same as program.rows).
      */
    var height: blessedLib.blessedMod.WidgetsNs.TypesNs.TPosition = js.native
    /**
      * The currently hovered element. Only set if mouse events are bound.
      */
    var hover: js.Any = js.native
    /**
      * Normally, dockable borders will not dock if the colors or attributes are different. This option
      * will allow them to dock regardless. It may produce some odd looking multi-colored borders though.
      */
    var ignoreDockContrast: scala.Boolean = js.native
    /**
      * Array of keys in their full format (e.g. C-c) to ignore when keys are locked or grabbed. Useful
      * for creating a key that will always exit no matter whether the keys are locked.
      */
    var ignoreLocked: scala.Boolean = js.native
    /**
      * Input and output streams. process.stdin/process.stdout by default, however, it could be a
      * net.Socket if you want to make a program that runs over telnet or something of that nature.
      */
    var input: nodeLib.streamMod.Writable = js.native
    /**
      * Relative left offset, always zero.
      */
    var left: blessedLib.blessedMod.WidgetsNs.TypesNs.TTopLeft = js.native
    /**
      * Prevent keypresses from being received by any element.
      */
    var lockKeys: scala.Boolean = js.native
    /**
      * Original options object.
      */
    @JSName("options")
    var options_Screen: IScreenOptions = js.native
    /**
      * Input and output streams. process.stdin/process.stdout by default, however, it could be a
      * net.Socket if you want to make a program that runs over telnet or something of that nature.
      */
    var output: nodeLib.streamMod.Readable = js.native
    /**
      * The blessed Program to be associated with. Will be automatically instantiated if none is provided.
      */
    var program: blessedLib.blessedMod.BlessedProgram = js.native
    /**
      * Amount of time (in ms) to redraw the screen after the terminal is resized (Default: 300).
      */
    var resizeTimeout: scala.Double = js.native
    /**
      * Relative right offset, always zero.
      */
    var right: blessedLib.blessedMod.WidgetsNs.TypesNs.TPosition = js.native
    /**
      * Same as screen.height.
      */
    var rows: scala.Double = js.native
    /**
      * Send focus events after mouse is enabled.
      */
    var sendFocus: scala.Boolean = js.native
    /**
      * Attempt to perform CSR optimization on all possible elements (not just full-width ones, elements with
      * uniform cells to their sides). This is known to cause flickering with elements that are not full-width,
      * however, it is more optimal for terminal rendering.
      */
    var smartCSR: scala.Boolean = js.native
    /**
      * The width of tabs within an element's content.
      */
    var tabSize: scala.Double = js.native
    /**
      * Set or get terminal name. Set calls screen.setTerminal() internally.
      */
    var terminal: java.lang.String = js.native
    /**
      * Set or get window title.
      */
    var title: java.lang.String = js.native
    /**
      * Relative top offset, always zero.
      */
    var top: blessedLib.blessedMod.WidgetsNs.TypesNs.TTopLeft = js.native
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
    var useBCE: scala.Boolean = js.native
    /**
      * Display warnings (such as the output not being a TTY, similar to ncurses).
      */
    var warnings: scala.Boolean = js.native
    /**
      * Width of the screen (same as program.cols).
      */
    var width: blessedLib.blessedMod.WidgetsNs.TypesNs.TPosition = js.native
    /**
      * Allocate a new pending screen buffer and a new output screen buffer.
      */
    def alloc(): scala.Unit = js.native
    /**
      * Clear any region on the screen.
      */
    def clearRegion(x1: scala.Double, x2: scala.Double, y1: scala.Double, y2: scala.Double): scala.Unit = js.native
    /**
      * Attempt to copy text to clipboard using iTerm2's proprietary sequence. Returns true if successful.
      */
    def copyToClipboard(text: java.lang.String): scala.Unit = js.native
    /**
      * Attempt to change cursor color. Returns true if successful.
      */
    def cursorColor(color: java.lang.String): scala.Unit = js.native
    /**
      * Attempt to reset cursor. Returns true if successful.
      */
    def cursorReset(): scala.Unit = js.native
    /**
      * Attempt to change cursor shape. Will not work in all terminals (see artificial cursors for a solution
      * to this). Returns true if successful.
      */
    def cursorShape(shape: scala.Boolean, blink: scala.Boolean): js.Any = js.native
    /**
      * Same as the log method, but only gets called if the debug option was set.
      */
    def debug(msg: java.lang.String*): scala.Unit = js.native
    /**
      * Delete a line at the bottom of the screen.
      */
    def deleteBottom(top: scala.Double, bottom: scala.Double): scala.Unit = js.native
    /**
      * Delete a line from the screen (using csr: this bypasses the output buffer).
      */
    def deleteLine(n: scala.Double, y: scala.Double, top: scala.Double, bottom: scala.Double): scala.Unit = js.native
    /**
      * Delete a line at the top of the screen.
      */
    def deleteTop(top: scala.Double, bottom: scala.Double): scala.Unit = js.native
    /**
      * Draw the screen based on the contents of the screen buffer.
      */
    def draw(start: scala.Double, end: scala.Double): scala.Unit = js.native
    /**
      * Enable key and mouse events. Calls bot enableMouse and enableKeys.
      */
    def enableInput(): scala.Unit = js.native
    def enableInput(el: BlessedElement): scala.Unit = js.native
    /**
      * Enable keypress events for the screen and optionally an element (automatically called when a form of
      * on('keypress') is bound).
      */
    def enableKeys(): scala.Unit = js.native
    def enableKeys(el: BlessedElement): scala.Unit = js.native
    /**
      * Enable mouse events for the screen and optionally an element (automatically called when a form of
      * on('mouse') is bound).
      */
    def enableMouse(): scala.Unit = js.native
    def enableMouse(el: BlessedElement): scala.Unit = js.native
    /**
      * Spawn a process in the foreground, return to blessed app after exit. Executes callback on error or exit.
      */
    def exec(
      file: java.lang.String,
      args: js.Array[java.lang.String],
      options: NodeChildProcessExecOptions,
      callback: js.Function1[/* repeated */ js.Any, scala.Unit]
    ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
    /**
      * Fill any region with a character of a certain attribute.
      */
    def fillRegion(
      attr: java.lang.String,
      ch: java.lang.String,
      x1: scala.Double,
      x2: scala.Double,
      y1: scala.Double,
      y2: scala.Double
    ): scala.Unit = js.native
    /**
      * Focus next element in the index.
      */
    def focusNext(): scala.Unit = js.native
    /**
      * Focus element by offset of focusable elements.
      */
    def focusOffset(offset: scala.Double): js.Any = js.native
    /**
      * Pop element off the focus stack.
      */
    def focusPop(): BlessedElement = js.native
    /**
      * Focus previous element in the index.
      */
    def focusPrevious(): scala.Unit = js.native
    /**
      * Push element on the focus stack (equivalent to screen.focused = el).
      */
    def focusPush(element: BlessedElement): scala.Unit = js.native
    /**
      * Insert a line at the bottom of the screen.
      */
    def insertBottom(top: scala.Double, bottom: scala.Double): scala.Unit = js.native
    /**
      * Insert a line into the screen (using csr: this bypasses the output buffer).
      */
    def insertLine(n: scala.Double, y: scala.Double, top: scala.Double, bottom: scala.Double): scala.Unit = js.native
    /**
      * Insert a line at the top of the screen.
      */
    def insertTop(top: scala.Double, bottom: scala.Double): scala.Unit = js.native
    /**
      * Write string to the log file if one was created.
      */
    def log(msg: js.Any*): scala.Unit = js.native
    def readEditor(
      callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* data */ nodeLib.Buffer, scala.Unit]
    ): scala.Unit = js.native
    /**
      * Read data from text editor.
      */
    def readEditor(
      options: js.Any,
      callback: js.Function2[/* err */ nodeLib.NodeJSNs.ErrnoException, /* data */ nodeLib.Buffer, scala.Unit]
    ): scala.Unit = js.native
    /**
      * Reallocate the screen buffers and clear the screen.
      */
    def realloc(): scala.Unit = js.native
    /**
      * Render all child elements, writing all data to the screen buffer and drawing the screen.
      */
    def render(): scala.Unit = js.native
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
    def screenshot(): scala.Unit = js.native
    /**
      * Take an SGR screenshot of the screen within the region. Returns a string containing only
      * characters and SGR codes. Can be displayed by simply echoing it in a terminal.
      */
    def screenshot(xi: scala.Double, xl: scala.Double, yi: scala.Double, yl: scala.Double): java.lang.String = js.native
    /**
      * Set effects based on two events and attributes.
      */
    def setEffects(el: BlessedElement, fel: BlessedElement, over: js.Any, out: js.Any, effects: js.Any, temp: js.Any): scala.Unit = js.native
    /**
      * Reset the terminal to term. Reloads terminfo.
      */
    def setTerminal(term: java.lang.String): scala.Unit = js.native
    /**
      * Spawn a process in the foreground, return to blessed app after exit.
      */
    def spawn(file: java.lang.String): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
    def spawn(file: java.lang.String, args: js.Array[java.lang.String]): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
    def spawn(file: java.lang.String, args: js.Array[java.lang.String], options: NodeChildProcessExecOptions): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  }
  
  /**
    * DEPRECATED - Use Box with the scrollable option instead. A box with scrollable content.
    */
  @js.native
  class ScrollableBoxElement () extends BlessedElement {
    /**
      * The offset of the top of the scroll content.
      */
    var childBase: scala.Double = js.native
    /**
      * The offset of the chosen item/line.
      */
    var childOffset: scala.Double = js.native
    /**
      * Get the current scroll index in lines.
      */
    def getScroll(): scala.Double = js.native
    /**
      * Get the actual height of the scrolling area.
      */
    def getScrollHeight(): scala.Double = js.native
    /**
      * Get the current scroll index in percentage.
      */
    def getScrollPerc(): scala.Double = js.native
    /**
      * Received when the element is scrolled.
      */
    @JSName("on")
    def on_scroll(event: blessedLib.blessedLibStrings.scroll, callback: js.Function0[scala.Unit]): this.type = js.native
    /**
      * Reset the scroll index to its initial state.
      */
    def resetScroll(): scala.Unit = js.native
    /**
      * Scroll the content by a relative offset.
      */
    def scroll(offset: scala.Double): scala.Unit = js.native
    def scroll(offset: scala.Double, always: scala.Boolean): scala.Unit = js.native
    /**
      * Scroll the content to an absolute index.
      */
    def scrollTo(index: scala.Double): scala.Unit = js.native
    /**
      * Same as scrollTo.
      */
    def setScroll(index: scala.Double): scala.Unit = js.native
    /**
      * Set the current scroll index in percentage (0-100).
      */
    def setScrollPerc(perc: scala.Double): scala.Unit = js.native
  }
  
  trait ScrollableBoxOptions extends ElementOptions {
    /**
      * A option which causes the ignoring of childOffset. This in turn causes the
      * childBase to change every time the element is scrolled.
      */
    var alwaysScroll: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * A limit to the childBase. Default is Infinity.
      */
    var baseLimit: js.UndefOr[scala.Double] = js.undefined
    /**
      * Object enabling a scrollbar.
      * Style of the scrollbar track if present (takes regular style options).
      */
    var scrollbar: js.UndefOr[blessedLib.Anon_Ch] = js.undefined
  }
  
  /**
    * DEPRECATED - Use Box with the scrollable and alwaysScroll options instead.
    * A scrollable text box which can display and scroll text, as well as handle
    * pre-existing newlines and escape codes.
    */
  @js.native
  class ScrollableTextElement () extends ScrollableBoxElement
  
  trait ScrollableTextOptions extends ScrollableBoxOptions {
    /**
      * Use pre-defined keys (i or enter for insert, e for editor, C-e for editor while inserting).
      */
    var keys: js.UndefOr[java.lang.String | js.Array[java.lang.String] | scala.Boolean] = js.undefined
    /**
      * Whether to enable automatic mouse support for this element.
      * Use pre-defined mouse events (right-click for editor).
      */
    var mouse: js.UndefOr[scala.Boolean | js.Function0[scala.Unit]] = js.undefined
    /**
      * Use vi keys with the keys option.
      */
    var vi: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  trait StyleListTable extends ListElementStyle {
    /**
      * Cell style.
      */
    var cell: js.UndefOr[js.Any] = js.undefined
    /**
      * Header style.
      */
    var header: js.UndefOr[js.Any] = js.undefined
  }
  
  /**
    * A stylized table of text elements.
    */
  @js.native
  class TableElement protected () extends BoxElement {
    def this(opts: TableOptions) = this()
    @JSName("options")
    var options_TableElement: TableOptions = js.native
    /**
      * set rows in table. array of arrays of strings.
      */
    def setData(rows: js.Array[js.Array[java.lang.String]]): scala.Unit = js.native
    /**
      * set rows in table. array of arrays of strings.
      */
    def setRows(rows: js.Array[js.Array[java.lang.String]]): scala.Unit = js.native
  }
  
  trait TableOptions extends BoxOptions {
    /**
      * array of array of strings representing rows (same as `rows`).
      */
    var data: js.UndefOr[js.Array[js.Array[java.lang.String]]] = js.undefined
    /**
      * fill cell borders with the adjacent background color.
      */
    var fillCellBorders: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * do not draw inner cells.
      */
    var noCellBorders: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * spaces to attempt to pad on the sides of each cell. `2` by default: one space on each side (only useful if the width is shrunken).
      */
    var pad: js.UndefOr[scala.Double] = js.undefined
    /**
      * array of array of strings representing rows (same as `data`).
      */
    var rows: js.UndefOr[js.Array[js.Array[java.lang.String]]] = js.undefined
  }
  
  @js.native
  class TerminalElement protected () extends BoxElement {
    def this(opts: TerminalOptions) = this()
    @JSName("options")
    var options_TerminalElement: TerminalOptions = js.native
    /**
      * reference to the pty.js pseudo terminal.
      */
    var pty: js.Any = js.native
    /**
      * reference to the headless term.js terminal.
      */
    var term: js.Any = js.native
    def screenshot(xi: scala.Double): java.lang.String = js.native
    def screenshot(xi: scala.Double, xl: scala.Double): java.lang.String = js.native
    def screenshot(xi: scala.Double, xl: scala.Double, yi: scala.Double): java.lang.String = js.native
    /**
      * write data to the terminal.
      */
    def write(data: java.lang.String): scala.Unit = js.native
  }
  
  trait TerminalOptions extends BoxOptions {
    /**
      * args for shell.
      */
    var args: js.UndefOr[js.Any] = js.undefined
    /**
      * can be line, underline, and block.
      */
    var cursor: js.UndefOr[
        blessedLib.blessedLibStrings.line | blessedLib.blessedLibStrings.underline | blessedLib.blessedLibStrings.block
      ] = js.undefined
    /**
      * Object for process env.
      */
    var env: js.UndefOr[js.Any] = js.undefined
    /**
      * handler for input data.
      */
    var handler: js.UndefOr[js.Function1[/* userInput */ nodeLib.Buffer, scala.Unit]] = js.undefined
    /**
      * name of shell. $SHELL by default.
      */
    var shell: js.UndefOr[java.lang.String] = js.undefined
    var terminal: js.UndefOr[java.lang.String] = js.undefined
  }
  
  /**
    * An element similar to Box, but geared towards rendering simple text elements.
    */
  @js.native
  class TextElement protected () extends BlessedElement {
    def this(opts: TextOptions) = this()
    /**
      * Original options object.
      */
    @JSName("options")
    var options_TextElement: TextOptions = js.native
  }
  
  trait TextOptions extends ElementOptions {
    /**
      * Text alignment: left, center, or right.
      */
    @JSName("align")
    var align_TextOptions: js.UndefOr[blessedLib.blessedMod.WidgetsNs.TypesNs.TAlign] = js.undefined
    /**
      * Fill the entire line with chosen bg until parent bg ends, even if there
      * is not enough text to fill the entire width.
      */
    var fill: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  @js.native
  class TextareaElement protected () extends InputElement {
    def this(opts: TextareaOptions) = this()
    /**
      * Original options object.
      */
    @JSName("options")
    var options_TextareaElement: TextareaOptions = js.native
    /**
      * The input text. read-only.
      */
    var value: java.lang.String = js.native
    /**
      * Cancel the textarea (emits cancel).
      */
    def cancel(): scala.Unit = js.native
    /**
      * Clear input.
      */
    def clearValue(): scala.Unit = js.native
    /**
      * Open text editor in $EDITOR, read the output from the resulting file. Takes a callback which
      * receives the final value.
      */
    def editor(callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[java.lang.String], scala.Unit]): scala.Unit = js.native
    /**
      * The same as this.value, for now.
      */
    def getValue(): java.lang.String = js.native
    /**
      * Grab key events and start reading text from the keyboard. Takes a callback which receives
      * the final value.
      */
    def input(callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[java.lang.String], scala.Unit]): scala.Unit = js.native
    def on(event: TextareaElementEventType, callback: js.Function1[/* err */ js.Any, scala.Unit]): this.type = js.native
    /**
      * Open text editor in $EDITOR, read the output from the resulting file. Takes a callback which
      * receives the final value.
      */
    def readEditor(callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[java.lang.String], scala.Unit]): scala.Unit = js.native
    /**
      * Grab key events and start reading text from the keyboard. Takes a callback which receives
      * the final value.
      */
    def readInput(): scala.Unit = js.native
    def readInput(callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[java.lang.String], scala.Unit]): scala.Unit = js.native
    /**
      * Open text editor in $EDITOR, read the output from the resulting file. Takes a callback which
      * receives the final value.
      */
    def setEditor(callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[java.lang.String], scala.Unit]): scala.Unit = js.native
    /**
      * Grab key events and start reading text from the keyboard. Takes a callback which receives
      * the final value.
      */
    def setInput(callback: js.Function2[/* err */ js.Any, /* value */ js.UndefOr[java.lang.String], scala.Unit]): scala.Unit = js.native
    /**
      * Set value.
      */
    def setValue(text: java.lang.String): scala.Unit = js.native
    /**
      * Submit the textarea (emits submit).
      */
    def submit(): scala.Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - blessedLib.blessedLibStrings.error
    - blessedLib.blessedLibStrings.submit
    - blessedLib.blessedLibStrings.cancel
    - blessedLib.blessedLibStrings.action
  */
  trait TextareaElementEventType extends js.Object
  
  /**
    * A box which allows multiline text input.
    */
  trait TextareaOptions extends BoxOptions {
    /**
      * Call readInput() when the element is focused. Automatically unfocus.
      */
    var inputOnFocus: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  @js.native
  class TextboxElement protected () extends TextareaElement {
    def this(opts: TextboxOptions) = this()
    /**
      * Replace text with asterisks (*).
      */
    var censor: scala.Boolean = js.native
    /**
      * Original options object.
      */
    @JSName("options")
    var options_TextboxElement: TextboxOptions = js.native
    /**
      * Completely hide text.
      */
    var secret: scala.Boolean = js.native
  }
  
  trait TextboxOptions extends TextareaOptions {
    /**
      * Replace text with asterisks (*).
      */
    var censor: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * Completely hide text.
      */
    var secret: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  @js.native
  class Tput protected () extends IHasOptions[TputsOptions] {
    def this(opts: TputsOptions) = this()
    var debug: scala.Boolean = js.native
    var error: stdLib.Error = js.native
    var extended: scala.Boolean = js.native
    /* CompleteClass */
    override var options: TputsOptions = js.native
    var padding: scala.Boolean = js.native
    var printf: scala.Boolean = js.native
    var termcap: java.lang.String = js.native
    var termcapFile: java.lang.String = js.native
    var terminal: java.lang.String = js.native
    var terminfoFile: java.lang.String = js.native
    var terminfoPrefix: java.lang.String = js.native
    def parseTerminfo(data: js.Any, file: java.lang.String): blessedLib.Anon_Bools = js.native
    def readTerminfo(term: java.lang.String): java.lang.String = js.native
    def setup(): scala.Unit = js.native
    def term(is: js.Any): scala.Boolean = js.native
  }
  
  trait TputsOptions extends IOptions {
    var debug: js.UndefOr[scala.Boolean] = js.undefined
    var extended: js.UndefOr[scala.Boolean] = js.undefined
    var termcap: js.UndefOr[java.lang.String] = js.undefined
    var termcapFile: js.UndefOr[java.lang.String] = js.undefined
    var terminal: js.UndefOr[java.lang.String] = js.undefined
    var terminfoFile: js.UndefOr[java.lang.String] = js.undefined
    var terminfoPrefix: js.UndefOr[java.lang.String] = js.undefined
  }
  
  @js.native
  class VideoElement () extends BoxElement {
    def this(options: VideoOptions) = this()
    @JSName("options")
    var options_VideoElement: VideoOptions = js.native
    /**
      * The terminal element running mplayer or mpv.
      */
    var tty: js.Any = js.native
  }
  
  trait VideoOptions extends BoxOptions {
    /**
      * Video to play.
      */
    var file: java.lang.String
    /**
      * Start time in seconds.
      */
    var start: scala.Double
  }
  
  @JSName("Events")
  @js.native
  object EventsNs extends js.Object {
    trait IKeyEventArg extends js.Object {
      var ctrl: scala.Boolean
      var full: java.lang.String
      var meta: scala.Boolean
      var name: java.lang.String
      var sequence: java.lang.String
      var shift: scala.Boolean
    }
    
    trait IMouseEventArg extends js.Object {
      var action: blessedLib.blessedMod.WidgetsNs.TypesNs.TMouseAction
      var x: scala.Double
      var y: scala.Double
    }
    
  }
  
  @JSName("Types")
  @js.native
  object TypesNs extends js.Object {
    trait Cursor extends js.Object {
      /**
        * Have blessed draw a custom cursor and hide the terminal cursor (experimental).
        */
      var artificial: scala.Boolean
      /**
        * Whether the cursor blinks.
        */
      var blink: scala.Boolean
      /**
        * Color of the color. Accepts any valid color value (null is default).
        */
      var color: java.lang.String
      /**
        * Shape of the cursor. Can be: block, underline, or line.
        */
      var shape: scala.Boolean
    }
    
    trait ListbarCommand extends js.Object {
      var key: java.lang.String
      def callback(): scala.Unit
    }
    
    /* Rewritten from type alias, can be one of: 
      - blessedLib.blessedLibStrings.left
      - blessedLib.blessedLibStrings.center
      - blessedLib.blessedLibStrings.right
    */
    trait TAlign extends js.Object
    
    trait TBorder extends js.Object {
      /**
        * Border foreground and background, must be numbers (-1 for default).
        */
      var bg: js.UndefOr[scala.Double] = js.undefined
      /**
        * Border attributes.
        */
      var bold: js.UndefOr[java.lang.String] = js.undefined
      /**
        * Character to use if bg type, default is space.
        */
      var ch: js.UndefOr[java.lang.String] = js.undefined
      var fg: js.UndefOr[scala.Double] = js.undefined
      /**
        * Type of border (line or bg). bg by default.
        */
      var `type`: js.UndefOr[blessedLib.blessedLibStrings.line | blessedLib.blessedLibStrings.bg] = js.undefined
      var underline: js.UndefOr[java.lang.String] = js.undefined
    }
    
    trait TCursor extends js.Object {
      /**
        * Have blessed draw a custom cursor and hide the terminal cursor (experimental).
        */
      var artificial: scala.Boolean
      /**
        * Whether the cursor blinks.
        */
      var blink: scala.Boolean
      /**
        * Color of the color. Accepts any valid color value (null is default).
        */
      var color: java.lang.String
      /**
        * Shape of the cursor. Can be: block, underline, or line.
        */
      var shape: blessedLib.blessedLibStrings.block | blessedLib.blessedLibStrings.underline | blessedLib.blessedLibStrings.line
    }
    
    trait TImage extends js.Object {
      /**
        * Image bitmap.
        */
      var bmp: js.Any
      /**
        * Image cellmap (bitmap scaled down to cell size).
        */
      var cellmap: js.Any
      /**
        * Pixel height.
        */
      var height: scala.Double
      /**
        * Pixel width.
        */
      var width: scala.Double
    }
    
    /* Rewritten from type alias, can be one of: 
      - blessedLib.blessedLibStrings.mousedown
      - blessedLib.blessedLibStrings.mouseup
      - blessedLib.blessedLibStrings.mousemove
    */
    trait TMouseAction extends js.Object
    
    trait TStyle extends js.Object {
      var bg: js.UndefOr[java.lang.String] = js.undefined
      var blink: js.UndefOr[scala.Boolean] = js.undefined
      var bold: js.UndefOr[scala.Boolean] = js.undefined
      var border: js.UndefOr[blessedLib.blessedLibStrings.line | blessedLib.blessedLibStrings.bg | TBorder] = js.undefined
      var ch: js.UndefOr[java.lang.String] = js.undefined
      var fg: js.UndefOr[java.lang.String] = js.undefined
      var focus: js.UndefOr[scala.Boolean] = js.undefined
      var hover: js.UndefOr[scala.Boolean] = js.undefined
      var inverse: js.UndefOr[scala.Boolean] = js.undefined
      var invisible: js.UndefOr[scala.Boolean] = js.undefined
      var label: js.UndefOr[java.lang.String] = js.undefined
      var scrollbar: js.UndefOr[blessedLib.Anon_Bg] = js.undefined
      var track: js.UndefOr[blessedLib.Anon_Bg] = js.undefined
      var transparent: js.UndefOr[scala.Boolean] = js.undefined
      var `type`: js.UndefOr[java.lang.String] = js.undefined
      var underline: js.UndefOr[scala.Boolean] = js.undefined
    }
    
    type TPosition = java.lang.String | scala.Double
    type TTopLeft = java.lang.String | scala.Double | blessedLib.blessedLibStrings.center
  }
  
  type ButtonOptions = BoxOptions
  type InputOptions = BoxOptions
  type LoadingOptions = BoxOptions
  type MessageOptions = BoxOptions
  type PromptOptions = BoxOptions
  type QuestionOptions = BoxOptions
  type RadioButtonOptions = BoxOptions
  type RadioSetOptions = BoxOptions
}

