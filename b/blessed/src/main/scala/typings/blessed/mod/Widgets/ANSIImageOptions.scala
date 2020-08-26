package typings.blessed.mod.Widgets

import typings.blessed.blessedStrings.cpu
import typings.blessed.blessedStrings.mem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ANSIImageOptions extends BoxOptions {
  /**
    * Whether to animate if the image is an APNG/animating GIF. If false, only
    * display the first frame or IDAT (Default: true).
    */
  var animate: Boolean = js.native
  /**
    * Add various "density" ASCII characters over the rendering to give the
    * image more detail, similar to libcaca/libcucul (the library mplayer uses
    * to display videos in the terminal).
    */
  var ascii: String = js.native
  /**
    * URL or path to PNG/GIF file. Can also be a buffer.
    */
  var file: String = js.native
  @JSName("height")
  var height_ANSIImageOptions: Double | String = js.native
  /**
    * mem or cpu. If optimizing for memory, animation frames will be rendered to
    * bitmaps as the animation plays, using less memory. Optimizing for cpu will
    * precompile all bitmaps beforehand, which may be faster, but might also OOM
    * the process on large images. (Default: mem).
    */
  var optimization: mem | cpu = js.native
  /**
    * Scale cellmap down (0-1.0) from its original pixel width/height (Default: 1.0).
    */
  var scale: Double = js.native
  /**
    * Set the speed of animation. Slower: 0.0-1.0. Faster: 1-1000. It cannot go
    * faster than 1 frame per millisecond, so 1000 is the fastest. (Default: 1.0)
    */
  var speed: Double = js.native
  /**
    * This differs from other element's width or height in that only one
    * of them is needed: blessed will maintain the aspect ratio of the image
    * as it scales down to the proper number of cells. NOTE: PNG/GIF's are
    * always automatically shrunken to size (based on scale) if a width or
    * height is not given.
    */
  @JSName("width")
  var width_ANSIImageOptions: Double | String = js.native
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
    width: Double | String
  ): ANSIImageOptions = {
    val __obj = js.Dynamic.literal(animate = animate.asInstanceOf[js.Any], ascii = ascii.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], optimization = optimization.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ANSIImageOptions]
  }
  @scala.inline
  implicit class ANSIImageOptionsOps[Self <: ANSIImageOptions] (val x: Self) extends AnyVal {
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
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def setAscii(value: String): Self = this.set("ascii", value.asInstanceOf[js.Any])
    @scala.inline
    def setFile(value: String): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptimization(value: mem | cpu): Self = this.set("optimization", value.asInstanceOf[js.Any])
    @scala.inline
    def setScale(value: Double): Self = this.set("scale", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

