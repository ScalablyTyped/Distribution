package typings.croppie.mod

import typings.croppie.AnonHeight
import typings.croppie.AnonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CroppieOptions extends js.Object {
  var boundary: js.UndefOr[AnonHeight] = js.undefined
  var customClass: js.UndefOr[String] = js.undefined
  var enableExif: js.UndefOr[Boolean] = js.undefined
  var enableOrientation: js.UndefOr[Boolean] = js.undefined
  var enableZoom: js.UndefOr[Boolean] = js.undefined
  var enforceBoundary: js.UndefOr[Boolean] = js.undefined
  var mouseWheelZoom: js.UndefOr[Boolean] = js.undefined
  var showZoomer: js.UndefOr[Boolean] = js.undefined
  var viewport: js.UndefOr[AnonType] = js.undefined
}

object CroppieOptions {
  @scala.inline
  def apply(
    boundary: AnonHeight = null,
    customClass: String = null,
    enableExif: js.UndefOr[Boolean] = js.undefined,
    enableOrientation: js.UndefOr[Boolean] = js.undefined,
    enableZoom: js.UndefOr[Boolean] = js.undefined,
    enforceBoundary: js.UndefOr[Boolean] = js.undefined,
    mouseWheelZoom: js.UndefOr[Boolean] = js.undefined,
    showZoomer: js.UndefOr[Boolean] = js.undefined,
    viewport: AnonType = null
  ): CroppieOptions = {
    val __obj = js.Dynamic.literal()
    if (boundary != null) __obj.updateDynamic("boundary")(boundary.asInstanceOf[js.Any])
    if (customClass != null) __obj.updateDynamic("customClass")(customClass.asInstanceOf[js.Any])
    if (!js.isUndefined(enableExif)) __obj.updateDynamic("enableExif")(enableExif.asInstanceOf[js.Any])
    if (!js.isUndefined(enableOrientation)) __obj.updateDynamic("enableOrientation")(enableOrientation.asInstanceOf[js.Any])
    if (!js.isUndefined(enableZoom)) __obj.updateDynamic("enableZoom")(enableZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(enforceBoundary)) __obj.updateDynamic("enforceBoundary")(enforceBoundary.asInstanceOf[js.Any])
    if (!js.isUndefined(mouseWheelZoom)) __obj.updateDynamic("mouseWheelZoom")(mouseWheelZoom.asInstanceOf[js.Any])
    if (!js.isUndefined(showZoomer)) __obj.updateDynamic("showZoomer")(showZoomer.asInstanceOf[js.Any])
    if (viewport != null) __obj.updateDynamic("viewport")(viewport.asInstanceOf[js.Any])
    __obj.asInstanceOf[CroppieOptions]
  }
}

