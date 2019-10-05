package typings.chromeDashApps.chrome.system.display

import typings.chromeDashApps.Anon_ManufacturerId
import typings.chromeDashApps.chrome.double
import typings.chromeDashApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information about display properties. */
trait DisplayInfo extends js.Object {
  /** A list of zoom factor values that can be set for the display. */
  var availableDisplayZoomFactors: js.Array[double]
  /** The display's logical bounds. */
  var bounds: Bounds
  /**
    * The ratio between the display's current and default zoom.
    * For example, value 1 is equivalent to 100% zoom, and value 1.5 is equivalent to 150% zoom.
    * */
  var displayZoomFactor: double
  /** The number of pixels per inch along the x-axis. */
  var dpiX: integer
  /** The number of pixels per inch along the y-axis. */
  var dpiY: integer
  /**
    * @requires(CrOS Kiosk app) Only available in Chrome OS Kiosk apps
    */
  var edid: js.UndefOr[Anon_ManufacturerId] = js.undefined
  /** True if this display has a touch input device associated with it. */
  var hasTouchSupport: Boolean
  /** The unique identifier of the display. */
  var id: String
  /** True if this display is enabled. */
  var isEnabled: Boolean
  /** True if this is an internal display. */
  var isInternal: Boolean
  /** True if this is the primary display. */
  var isPrimary: Boolean
  /**
    * @requires(CrOS) Only available on Chrome OS.
    * Identifiers of the displays to which the source display is being mirrored.
    * Empty if no displays are being mirrored. This will be set to the same value
    * for all displays.
    * ❗ This must not include *mirroringSourceId*. ❗
    */
  var mirroringDestinationIds: js.Array[String]
  /**
    * @requires(CrOS) Only working properly on Chrome OS.
    * Identifier of the display that is being mirrored on the display unit.
    * If mirroring is not in progress, set to an empty string
    * Currently exposed only on ChromeOS.
    * Will be empty string on other platforms.
    */
  var mirroringSourceId: String
  /**
    * @requires(CrOS) Only available on Chrome OS.
    * The list of available display modes.
    * The current mode will have isSelected=true.
    * Only available on Chrome OS.
    * Will be set to an empty array on other platforms.
    */
  var modes: js.Array[DisplayMode]
  /** The user-friendly name (e.g. 'HP LCD monitor'). */
  var name: String
  /** The display's insets within its screen's bounds. Currently exposed only on ChromeOS. Will be set to empty insets on other platforms. */
  var overscan: Insets
  /** The display's clockwise rotation in degrees relative to the vertical position. Currently exposed only on ChromeOS. Will be set to 0 on other platforms. */
  var rotation: integer
  /** The usable work area of the display within the display bounds. The work area excludes areas of the display reserved for OS, for example taskbar and launcher. */
  var workArea: Bounds
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
    workArea: Bounds,
    edid: Anon_ManufacturerId = null
  ): DisplayInfo = {
    val __obj = js.Dynamic.literal(availableDisplayZoomFactors = availableDisplayZoomFactors, bounds = bounds, displayZoomFactor = displayZoomFactor, dpiX = dpiX, dpiY = dpiY, hasTouchSupport = hasTouchSupport, id = id, isEnabled = isEnabled, isInternal = isInternal, isPrimary = isPrimary, mirroringDestinationIds = mirroringDestinationIds, mirroringSourceId = mirroringSourceId, modes = modes, name = name, overscan = overscan, rotation = rotation, workArea = workArea)
    if (edid != null) __obj.updateDynamic("edid")(edid)
    __obj.asInstanceOf[DisplayInfo]
  }
}

