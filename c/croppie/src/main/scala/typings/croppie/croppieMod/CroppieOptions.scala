package typings.croppie.croppieMod

import typings.croppie.Anon_Height
import typings.croppie.Anon_HeightType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CroppieOptions extends js.Object {
  var boundary: js.UndefOr[Anon_Height] = js.undefined
  var customClass: js.UndefOr[String] = js.undefined
  var enableExif: js.UndefOr[Boolean] = js.undefined
  var enableOrientation: js.UndefOr[Boolean] = js.undefined
  var enableZoom: js.UndefOr[Boolean] = js.undefined
  var enforceBoundary: js.UndefOr[Boolean] = js.undefined
  var mouseWheelZoom: js.UndefOr[Boolean] = js.undefined
  var showZoomer: js.UndefOr[Boolean] = js.undefined
  var viewport: js.UndefOr[Anon_HeightType] = js.undefined
}

object CroppieOptions {
  @scala.inline
  def apply(
    boundary: Anon_Height = null,
    customClass: String = null,
    enableExif: js.UndefOr[Boolean] = js.undefined,
    enableOrientation: js.UndefOr[Boolean] = js.undefined,
    enableZoom: js.UndefOr[Boolean] = js.undefined,
    enforceBoundary: js.UndefOr[Boolean] = js.undefined,
    mouseWheelZoom: js.UndefOr[Boolean] = js.undefined,
    showZoomer: js.UndefOr[Boolean] = js.undefined,
    viewport: Anon_HeightType = null
  ): CroppieOptions = {
    val __obj = js.Dynamic.literal()
    if (boundary != null) __obj.updateDynamic("boundary")(boundary)
    if (customClass != null) __obj.updateDynamic("customClass")(customClass)
    if (!js.isUndefined(enableExif)) __obj.updateDynamic("enableExif")(enableExif)
    if (!js.isUndefined(enableOrientation)) __obj.updateDynamic("enableOrientation")(enableOrientation)
    if (!js.isUndefined(enableZoom)) __obj.updateDynamic("enableZoom")(enableZoom)
    if (!js.isUndefined(enforceBoundary)) __obj.updateDynamic("enforceBoundary")(enforceBoundary)
    if (!js.isUndefined(mouseWheelZoom)) __obj.updateDynamic("mouseWheelZoom")(mouseWheelZoom)
    if (!js.isUndefined(showZoomer)) __obj.updateDynamic("showZoomer")(showZoomer)
    if (viewport != null) __obj.updateDynamic("viewport")(viewport)
    __obj.asInstanceOf[CroppieOptions]
  }
}

