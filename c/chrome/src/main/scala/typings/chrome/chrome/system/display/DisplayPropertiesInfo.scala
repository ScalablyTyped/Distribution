package typings.chrome.chrome.system.display

import typings.chrome.chromeNumbers.`0`
import typings.chrome.chromeNumbers.`180`
import typings.chrome.chromeNumbers.`270`
import typings.chrome.chromeNumbers.`90`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
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
  var boundsOriginX: js.UndefOr[Double] = js.native
  /**
    * If set, updates the display's logical bounds origin along y-axis.
    * @see[See documentation for boundsOriginX parameter.]
    */
  var boundsOriginY: js.UndefOr[Double] = js.native
  /**
    * If set, updates the display mode to the mode matching this value.
    * @since Chrome 52
    */
  var displayMode: js.UndefOr[DisplayMode] = js.native
  /**
    * @since Chrome 65.
    * @description
    * If set, updates the zoom associated with the display.
    * This zoom performs re-layout and repaint thus resulting
    * in a better quality zoom than just performing
    * a pixel by pixel stretch enlargement.
    */
  var displayZoomFactor: js.UndefOr[Double] = js.native
  /**
    * If set to true, makes the display primary.
    * No-op if set to false.
    */
  var isPrimary: js.UndefOr[Boolean] = js.native
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
  var isUnified: js.UndefOr[Boolean] = js.native
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
  var mirroringSourceId: js.UndefOr[String] = js.native
  /**
    * If set, sets the display's overscan insets to the provided values.
    * Note that overscan values may not be negative or larger than a half of the screen's size.
    * Overscan cannot be changed on the internal monitor. It's applied after isPrimary parameter.
    */
  var overscan: js.UndefOr[Insets] = js.native
  /**
    * If set, updates the display's rotation.
    * Legal values are [0, 90, 180, 270].
    * The rotation is set clockwise, relative to the display's vertical position.
    * It's applied after overscan parameter.
    */
  var rotation: js.UndefOr[`0` | `90` | `180` | `270`] = js.native
}

object DisplayPropertiesInfo {
  @scala.inline
  def apply(): DisplayPropertiesInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisplayPropertiesInfo]
  }
  @scala.inline
  implicit class DisplayPropertiesInfoOps[Self <: DisplayPropertiesInfo] (val x: Self) extends AnyVal {
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
    def setBoundsOriginX(value: Double): Self = this.set("boundsOriginX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoundsOriginX: Self = this.set("boundsOriginX", js.undefined)
    @scala.inline
    def setBoundsOriginY(value: Double): Self = this.set("boundsOriginY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoundsOriginY: Self = this.set("boundsOriginY", js.undefined)
    @scala.inline
    def setDisplayMode(value: DisplayMode): Self = this.set("displayMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayMode: Self = this.set("displayMode", js.undefined)
    @scala.inline
    def setDisplayZoomFactor(value: Double): Self = this.set("displayZoomFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayZoomFactor: Self = this.set("displayZoomFactor", js.undefined)
    @scala.inline
    def setIsPrimary(value: Boolean): Self = this.set("isPrimary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPrimary: Self = this.set("isPrimary", js.undefined)
    @scala.inline
    def setIsUnified(value: Boolean): Self = this.set("isUnified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsUnified: Self = this.set("isUnified", js.undefined)
    @scala.inline
    def setMirroringSourceId(value: String): Self = this.set("mirroringSourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMirroringSourceId: Self = this.set("mirroringSourceId", js.undefined)
    @scala.inline
    def setOverscan(value: Insets): Self = this.set("overscan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverscan: Self = this.set("overscan", js.undefined)
    @scala.inline
    def setRotation(value: `0` | `90` | `180` | `270`): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRotation: Self = this.set("rotation", js.undefined)
  }
  
}

