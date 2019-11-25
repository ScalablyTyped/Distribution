package typings.chrome.chrome.system.display

import typings.chrome.chromeNumbers.`0`
import typings.chrome.chromeNumbers.`180`
import typings.chrome.chromeNumbers.`270`
import typings.chrome.chromeNumbers.`90`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplayPropertiesInfo extends js.Object {
  /**
    * If set, updates the display's logical bounds origin along x-axis.
    * Applied together with boundsOriginY, if boundsOriginY is set.
    * Note that, when updating the display origin, some constraints will be applied,
    * so the final bounds origin may be different than the one set.
    * The final bounds can be retrieved using getInfo. The bounds origin is applied
    * after rotation. The bounds origin cannot be changed on the primary display.
    * Note that is also invalid to set bounds origin values if isPrimary is also set
    * (as isPrimary parameter is applied first).
    */
  var boundsOriginX: js.UndefOr[Double] = js.undefined
  /**
    * If set, updates the display's logical bounds origin along y-axis.
    * @see[See documentation for boundsOriginX parameter.]
    */
  var boundsOriginY: Double
  /**
    * If set, updates the display mode to the mode matching this value.
    * @since Chrome 52
    */
  var displayMode: js.UndefOr[DisplayMode] = js.undefined
  /**
    * @since Chrome 65.
    * @description
    * If set, updates the zoom associated with the display.
    * This zoom performs re-layout and repaint thus resulting
    * in a better quality zoom than just performing
    * a pixel by pixel stretch enlargement.
    */
  var displayZoomFactor: js.UndefOr[Double] = js.undefined
  /**
    * If set to true, makes the display primary.
    * No-op if set to false.
    */
  var isPrimary: js.UndefOr[Boolean] = js.undefined
  /**
    * @requires(CrOS) Chrome OS only.
    * @description
    * If set to true, changes the display mode to unified desktop.
    * If set to false, unified desktop mode will be disabled.
    * This is only valid for the primary display.
    * If provided, mirroringSourceId must not be provided and other properties may not apply.
    * This is has no effect if not provided.
    * @see(See `enableUnifiedDesktop` for details).
    * @since Chrome 59
    * */
  var isUnified: js.UndefOr[Boolean] = js.undefined
  /**
    * @requires(CrOS) Chrome OS only.
    * @deprecated Deprecated since Chrome 68. Use ´setMirrorMode´
    * @see setMirrorMode
    * @description
    * If set and not empty, enables mirroring for this display.
    * Otherwise disables mirroring for this display.
    * This value should indicate the id of the source display to mirror,
    * which must not be the same as the id passed to setDisplayProperties.
    * If set, no other property may be set.
    */
  var mirroringSourceId: js.UndefOr[String] = js.undefined
  /**
    * If set, sets the display's overscan insets to the provided values.
    * Note that overscan values may not be negative or larger than a half of the screen's size.
    * Overscan cannot be changed on the internal monitor. It's applied after isPrimary parameter.
    */
  var overscan: js.UndefOr[Insets] = js.undefined
  /**
    * If set, updates the display's rotation.
    * Legal values are [0, 90, 180, 270].
    * The rotation is set clockwise, relative to the display's vertical position.
    * It's applied after overscan parameter.
    */
  var rotation: js.UndefOr[`0` | `90` | `180` | `270`] = js.undefined
}

object DisplayPropertiesInfo {
  @scala.inline
  def apply(
    boundsOriginY: Double,
    boundsOriginX: Int | Double = null,
    displayMode: DisplayMode = null,
    displayZoomFactor: Int | Double = null,
    isPrimary: js.UndefOr[Boolean] = js.undefined,
    isUnified: js.UndefOr[Boolean] = js.undefined,
    mirroringSourceId: String = null,
    overscan: Insets = null,
    rotation: `0` | `90` | `180` | `270` = null
  ): DisplayPropertiesInfo = {
    val __obj = js.Dynamic.literal(boundsOriginY = boundsOriginY.asInstanceOf[js.Any])
    if (boundsOriginX != null) __obj.updateDynamic("boundsOriginX")(boundsOriginX.asInstanceOf[js.Any])
    if (displayMode != null) __obj.updateDynamic("displayMode")(displayMode.asInstanceOf[js.Any])
    if (displayZoomFactor != null) __obj.updateDynamic("displayZoomFactor")(displayZoomFactor.asInstanceOf[js.Any])
    if (!js.isUndefined(isPrimary)) __obj.updateDynamic("isPrimary")(isPrimary.asInstanceOf[js.Any])
    if (!js.isUndefined(isUnified)) __obj.updateDynamic("isUnified")(isUnified.asInstanceOf[js.Any])
    if (mirroringSourceId != null) __obj.updateDynamic("mirroringSourceId")(mirroringSourceId.asInstanceOf[js.Any])
    if (overscan != null) __obj.updateDynamic("overscan")(overscan.asInstanceOf[js.Any])
    if (rotation != null) __obj.updateDynamic("rotation")(rotation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayPropertiesInfo]
  }
}

