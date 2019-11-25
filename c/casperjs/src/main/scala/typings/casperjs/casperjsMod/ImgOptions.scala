package typings.casperjs.casperjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImgOptions extends js.Object {
  // format to set the image format manually, avoiding relying on the filename
  var format: js.UndefOr[String] = js.undefined
  // quality to set the image quality, from 1 to 100
  var quality: js.UndefOr[Double] = js.undefined
}

object ImgOptions {
  @scala.inline
  def apply(format: String = null, quality: Int | Double = null): ImgOptions = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImgOptions]
  }
}

