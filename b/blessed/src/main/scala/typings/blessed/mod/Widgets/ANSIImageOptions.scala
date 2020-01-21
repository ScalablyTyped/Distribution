package typings.blessed.mod.Widgets

import typings.blessed.AnonCh
import typings.blessed.blessedStrings.bg
import typings.blessed.blessedStrings.bottom
import typings.blessed.blessedStrings.center
import typings.blessed.blessedStrings.cpu
import typings.blessed.blessedStrings.left
import typings.blessed.blessedStrings.line
import typings.blessed.blessedStrings.mem
import typings.blessed.blessedStrings.middle
import typings.blessed.blessedStrings.right
import typings.blessed.blessedStrings.top
import typings.blessed.mod.Widgets.Types.TPosition
import typings.blessed.mod.Widgets.Types.TTopLeft
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ANSIImageOptions extends BoxOptions {
  /**
    * Whether to animate if the image is an APNG/animating GIF. If false, only
    * display the first frame or IDAT (Default: true).
    */
  var animate: Boolean
  /**
    * Add various "density" ASCII characters over the rendering to give the
    * image more detail, similar to libcaca/libcucul (the library mplayer uses
    * to display videos in the terminal).
    */
  var ascii: String
  /**
    * URL or path to PNG/GIF file. Can also be a buffer.
    */
  var file: String
  @JSName("height")
  var height_ANSIImageOptions: Double | String
  /**
    * mem or cpu. If optimizing for memory, animation frames will be rendered to
    * bitmaps as the animation plays, using less memory. Optimizing for cpu will
    * precompile all bitmaps beforehand, which may be faster, but might also OOM
    * the process on large images. (Default: mem).
    */
  var optimization: mem | cpu
  /**
    * Scale cellmap down (0-1.0) from its original pixel width/height (Default: 1.0).
    */
  var scale: Double
  /**
    * Set the speed of animation. Slower: 0.0-1.0. Faster: 1-1000. It cannot go
    * faster than 1 frame per millisecond, so 1000 is the fastest. (Default: 1.0)
    */
  var speed: Double
  /**
    * This differs from other element's width or height in that only one
    * of them is needed: blessed will maintain the aspect ratio of the image
    * as it scales down to the proper number of cells. NOTE: PNG/GIF's are
    * always automatically shrunken to size (based on scale) if a width or
    * height is not given.
    */
  @JSName("width")
  var width_ANSIImageOptions: Double | String
}

object ANSIImageOptions {
  @scala.inline
  def apply(
    animate: Boolean,
    ascii: String,
    file: String,
    height: Double | String,
    optimization: mem | cpu,
    scale: Double,
    speed: Double,
    width: Double | String,
    align: left | center | right = null,
    alwaysScroll: js.UndefOr[Boolean] = js.undefined,
    baseLimit: Int | Double = null,
    bg: String = null,
    bindings: js.Any = null,
    bold: String = null,
    border: Border | line | bg = null,
    bottom: TPosition = null,
    ch: String = null,
    children: js.Array[Node] = null,
    clickable: js.UndefOr[Boolean] = js.undefined,
    content: String = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    fg: String = null,
    focusable: js.UndefOr[Boolean] = js.undefined,
    focused: BlessedElement = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    hoverText: String = null,
    input: js.UndefOr[Boolean] = js.undefined,
    keyable: js.UndefOr[Boolean] = js.undefined,
    keys: String | js.Array[String] | Boolean = null,
    label: String = null,
    left: TTopLeft = null,
    mouse: Boolean | js.Function0[Unit] = null,
    name: String = null,
    padding: Double | Padding = null,
    parent: Node = null,
    position: Position = null,
    right: TPosition = null,
    screen: Screen = null,
    scrollable: js.UndefOr[Boolean] = js.undefined,
    scrollbar: AnonCh = null,
    shadow: js.UndefOr[Boolean] = js.undefined,
    shrink: js.UndefOr[Boolean] = js.undefined,
    style: js.Any = null,
    tags: js.UndefOr[Boolean] = js.undefined,
    top: TTopLeft = null,
    underline: String = null,
    valign: top | middle | bottom = null,
    vi: js.UndefOr[Boolean] = js.undefined
  ): ANSIImageOptions = {
    val __obj = js.Dynamic.literal(animate = animate.asInstanceOf[js.Any], ascii = ascii.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], optimization = optimization.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(alwaysScroll)) __obj.updateDynamic("alwaysScroll")(alwaysScroll.asInstanceOf[js.Any])
    if (baseLimit != null) __obj.updateDynamic("baseLimit")(baseLimit.asInstanceOf[js.Any])
    if (bg != null) __obj.updateDynamic("bg")(bg.asInstanceOf[js.Any])
    if (bindings != null) __obj.updateDynamic("bindings")(bindings.asInstanceOf[js.Any])
    if (bold != null) __obj.updateDynamic("bold")(bold.asInstanceOf[js.Any])
    if (border != null) __obj.updateDynamic("border")(border.asInstanceOf[js.Any])
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (ch != null) __obj.updateDynamic("ch")(ch.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(clickable)) __obj.updateDynamic("clickable")(clickable.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable.asInstanceOf[js.Any])
    if (fg != null) __obj.updateDynamic("fg")(fg.asInstanceOf[js.Any])
    if (!js.isUndefined(focusable)) __obj.updateDynamic("focusable")(focusable.asInstanceOf[js.Any])
    if (focused != null) __obj.updateDynamic("focused")(focused.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (hoverText != null) __obj.updateDynamic("hoverText")(hoverText.asInstanceOf[js.Any])
    if (!js.isUndefined(input)) __obj.updateDynamic("input")(input.asInstanceOf[js.Any])
    if (!js.isUndefined(keyable)) __obj.updateDynamic("keyable")(keyable.asInstanceOf[js.Any])
    if (keys != null) __obj.updateDynamic("keys")(keys.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (mouse != null) __obj.updateDynamic("mouse")(mouse.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (screen != null) __obj.updateDynamic("screen")(screen.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollable)) __obj.updateDynamic("scrollable")(scrollable.asInstanceOf[js.Any])
    if (scrollbar != null) __obj.updateDynamic("scrollbar")(scrollbar.asInstanceOf[js.Any])
    if (!js.isUndefined(shadow)) __obj.updateDynamic("shadow")(shadow.asInstanceOf[js.Any])
    if (!js.isUndefined(shrink)) __obj.updateDynamic("shrink")(shrink.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(tags)) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    if (underline != null) __obj.updateDynamic("underline")(underline.asInstanceOf[js.Any])
    if (valign != null) __obj.updateDynamic("valign")(valign.asInstanceOf[js.Any])
    if (!js.isUndefined(vi)) __obj.updateDynamic("vi")(vi.asInstanceOf[js.Any])
    __obj.asInstanceOf[ANSIImageOptions]
  }
}

