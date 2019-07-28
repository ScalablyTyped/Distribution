package typings.ccap.ccapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  	// set pic quality,default is 50
  var fontsize: js.UndefOr[Double] = js.undefined
  	// set font size,default is 57
  // Custom the function to generate captcha text
  var generate: js.UndefOr[js.Function0[String]] = js.undefined
  	// set width,default is 256
  var height: js.UndefOr[Double] = js.undefined
  	// set height,default is 60
  var offset: js.UndefOr[Double] = js.undefined
  	// set text spacing,default is 40
  var quality: js.UndefOr[Double] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    fontsize: Int | Double = null,
    generate: () => String = null,
    height: Int | Double = null,
    offset: Int | Double = null,
    quality: Int | Double = null,
    width: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (fontsize != null) __obj.updateDynamic("fontsize")(fontsize.asInstanceOf[js.Any])
    if (generate != null) __obj.updateDynamic("generate")(js.Any.fromFunction0(generate))
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

