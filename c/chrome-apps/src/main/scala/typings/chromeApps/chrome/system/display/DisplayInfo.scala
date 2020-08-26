package typings.chromeApps.chrome.system.display

import typings.chromeApps.anon.ManufacturerId
import typings.chromeApps.chrome.double
import typings.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information about display properties. */
@js.native
trait DisplayInfo extends js.Object {
  /** A list of zoom factor values that can be set for the display. */
  var availableDisplayZoomFactors: js.Array[double] = js.native
  /** The display's logical bounds. */
  var bounds: Bounds = js.native
  /**
    * The ratio between the display's current and default zoom.
    * For example, value 1 is equivalent to 100% zoom, and value 1.5 is equivalent to 150% zoom.
    * */
  var displayZoomFactor: double = js.native
  /** The number of pixels per inch along the x-axis. */
  var dpiX: integer = js.native
  /** The number of pixels per inch along the y-axis. */
  var dpiY: integer = js.native
  /**
    * @requires(CrOS Kiosk app) Only available in Chrome OS Kiosk apps
    */
  var edid: js.UndefOr[ManufacturerId] = js.native
  /** True if this display has a touch input device associated with it. */
  var hasTouchSupport: Boolean = js.native
  /** The unique identifier of the display. */
  var id: String = js.native
  /** True if this display is enabled. */
  var isEnabled: Boolean = js.native
  /** True if this is an internal display. */
  var isInternal: Boolean = js.native
  /** True if this is the primary display. */
  var isPrimary: Boolean = js.native
  /**
    * @requires(CrOS) Only available on Chrome OS.
    * Identifiers of the displays to which the source display is being mirrored.
    * Empty if no displays are being mirrored. This will be set to the same value
    * for all displays.
    * ❗ This must not include *mirroringSourceId*. ❗
    */
  var mirroringDestinationIds: js.Array[String] = js.native
  /**
    * @requires(CrOS) Only working properly on Chrome OS.
    * Identifier of the display that is being mirrored on the display unit.
    * If mirroring is not in progress, set to an empty string
    * Currently exposed only on ChromeOS.
    * Will be empty string on other platforms.
    */
  var mirroringSourceId: String = js.native
  /**
    * @requires(CrOS) Only available on Chrome OS.
    * The list of available display modes.
    * The current mode will have isSelected=true.
    * Only available on Chrome OS.
    * Will be set to an empty array on other platforms.
    */
  var modes: js.Array[DisplayMode] = js.native
  /** The user-friendly name (e.g. 'HP LCD monitor'). */
  var name: String = js.native
  /** The display's insets within its screen's bounds. Currently exposed only on ChromeOS. Will be set to empty insets on other platforms. */
  var overscan: Insets = js.native
  /** The display's clockwise rotation in degrees relative to the vertical position. Currently exposed only on ChromeOS. Will be set to 0 on other platforms. */
  var rotation: integer = js.native
  /** The usable work area of the display within the display bounds. The work area excludes areas of the display reserved for OS, for example taskbar and launcher. */
  var workArea: Bounds = js.native
}

object DisplayInfo {
  @scala.inline
  def apply(
    availableDisplayZoomFactors: js.Array[double],
    bounds: Bounds,
    displayZoomFactor: double,
    dpiX: integer,
    dpiY: integer,
    hasTouchSupport: Boolean,
    id: String,
    isEnabled: Boolean,
    isInternal: Boolean,
    isPrimary: Boolean,
    mirroringDestinationIds: js.Array[String],
    mirroringSourceId: String,
    modes: js.Array[DisplayMode],
    name: String,
    overscan: Insets,
    rotation: integer,
    workArea: Bounds
  ): DisplayInfo = {
    val __obj = js.Dynamic.literal(availableDisplayZoomFactors = availableDisplayZoomFactors.asInstanceOf[js.Any], bounds = bounds.asInstanceOf[js.Any], displayZoomFactor = displayZoomFactor.asInstanceOf[js.Any], dpiX = dpiX.asInstanceOf[js.Any], dpiY = dpiY.asInstanceOf[js.Any], hasTouchSupport = hasTouchSupport.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], isInternal = isInternal.asInstanceOf[js.Any], isPrimary = isPrimary.asInstanceOf[js.Any], mirroringDestinationIds = mirroringDestinationIds.asInstanceOf[js.Any], mirroringSourceId = mirroringSourceId.asInstanceOf[js.Any], modes = modes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], overscan = overscan.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any], workArea = workArea.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayInfo]
  }
  @scala.inline
  implicit class DisplayInfoOps[Self <: DisplayInfo] (val x: Self) extends AnyVal {
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
    def setAvailableDisplayZoomFactorsVarargs(value: double*): Self = this.set("availableDisplayZoomFactors", js.Array(value :_*))
    @scala.inline
    def setAvailableDisplayZoomFactors(value: js.Array[double]): Self = this.set("availableDisplayZoomFactors", value.asInstanceOf[js.Any])
    @scala.inline
    def setBounds(value: Bounds): Self = this.set("bounds", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisplayZoomFactor(value: double): Self = this.set("displayZoomFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def setDpiX(value: integer): Self = this.set("dpiX", value.asInstanceOf[js.Any])
    @scala.inline
    def setDpiY(value: integer): Self = this.set("dpiY", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasTouchSupport(value: Boolean): Self = this.set("hasTouchSupport", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsEnabled(value: Boolean): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsInternal(value: Boolean): Self = this.set("isInternal", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsPrimary(value: Boolean): Self = this.set("isPrimary", value.asInstanceOf[js.Any])
    @scala.inline
    def setMirroringDestinationIdsVarargs(value: String*): Self = this.set("mirroringDestinationIds", js.Array(value :_*))
    @scala.inline
    def setMirroringDestinationIds(value: js.Array[String]): Self = this.set("mirroringDestinationIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setMirroringSourceId(value: String): Self = this.set("mirroringSourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setModesVarargs(value: DisplayMode*): Self = this.set("modes", js.Array(value :_*))
    @scala.inline
    def setModes(value: js.Array[DisplayMode]): Self = this.set("modes", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverscan(value: Insets): Self = this.set("overscan", value.asInstanceOf[js.Any])
    @scala.inline
    def setRotation(value: integer): Self = this.set("rotation", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkArea(value: Bounds): Self = this.set("workArea", value.asInstanceOf[js.Any])
    @scala.inline
    def setEdid(value: ManufacturerId): Self = this.set("edid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEdid: Self = this.set("edid", js.undefined)
  }
  
}

