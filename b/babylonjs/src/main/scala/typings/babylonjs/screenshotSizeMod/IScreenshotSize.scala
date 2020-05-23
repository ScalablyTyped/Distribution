package typings.babylonjs.screenshotSizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IScreenshotSize extends js.Object {
  /**
    * number in pixels for canvas height
    */
  var height: js.UndefOr[Double] = js.undefined
  /**
    * multiplier allowing render at a higher or lower resolution
    * If value is defined then height and width will be ignored and taken from camera
    */
  var precision: js.UndefOr[Double] = js.undefined
  /**
    * number in pixels for canvas width
    */
  var width: js.UndefOr[Double] = js.undefined
}

object IScreenshotSize {
  @scala.inline
  def apply(
    height: js.UndefOr[Double] = js.undefined,
    precision: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined
  ): IScreenshotSize = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(precision)) __obj.updateDynamic("precision")(precision.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScreenshotSize]
  }
}

