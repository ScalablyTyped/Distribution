package typings.ccap.mod

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
    fontsize: js.UndefOr[Double] = js.undefined,
    generate: () => String = null,
    height: js.UndefOr[Double] = js.undefined,
    offset: js.UndefOr[Double] = js.undefined,
    quality: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fontsize)) __obj.updateDynamic("fontsize")(fontsize.get.asInstanceOf[js.Any])
    if (generate != null) __obj.updateDynamic("generate")(js.Any.fromFunction0(generate))
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(quality)) __obj.updateDynamic("quality")(quality.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

