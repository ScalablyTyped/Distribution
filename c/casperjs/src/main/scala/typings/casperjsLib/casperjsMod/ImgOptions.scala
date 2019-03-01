package typings
package casperjsLib.casperjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImgOptions extends js.Object {
  // format to set the image format manually, avoiding relying on the filename
  var format: js.UndefOr[java.lang.String] = js.undefined
  // quality to set the image quality, from 1 to 100
  var quality: js.UndefOr[scala.Double] = js.undefined
}

object ImgOptions {
  @scala.inline
  def apply(format: java.lang.String = null, quality: scala.Int | scala.Double = null): ImgOptions = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (quality != null) __obj.updateDynamic("quality")(quality.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImgOptions]
  }
}

