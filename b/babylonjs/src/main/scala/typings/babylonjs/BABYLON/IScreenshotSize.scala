package typings.babylonjs.BABYLON

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
  def apply(height: Int | Double = null, precision: Int | Double = null, width: Int | Double = null): IScreenshotSize = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IScreenshotSize]
  }
}

