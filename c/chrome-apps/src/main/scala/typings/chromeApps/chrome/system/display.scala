package typings.chromeApps.chrome.system

import typings.chromeApps.anon.BOTTOM
import typings.chromeApps.anon.ManufacturerId
import typings.chromeApps.chrome.ToStringLiteral
import typings.chromeApps.chrome.double
import typings.chromeApps.chrome.integer
import typings.chromeApps.chromeAppsNumbers.`0`
import typings.chromeApps.chromeAppsNumbers.`180`
import typings.chromeApps.chromeAppsNumbers.`270`
import typings.chromeApps.chromeAppsNumbers.`90`
import typings.chromeApps.chromeAppsStrings.LEFT
import typings.chromeApps.chromeAppsStrings.RIGHT
import typings.chromeApps.chromeAppsStrings.TOP
import typings.chromeApps.chromeAppsStrings.bottom_
import typings.chromeApps.chromeAppsStrings.left_
import typings.chromeApps.chromeAppsStrings.mixed
import typings.chromeApps.chromeAppsStrings.normal_
import typings.chromeApps.chromeAppsStrings.off
import typings.chromeApps.chromeAppsStrings.right_
import typings.chromeApps.chromeAppsStrings.top_
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// System Display //
////////////////////
/**
  * Use the system.display API to query display metadata.
  * Permissions: 'system.display'
  * @since Chrome 30.
  */
object display {
  
  trait Bounds extends StObject {
    
    /** The height of the display in pixels. */
    var height: integer
    
    /**  The x-coordinate of the upper-left corner. */
    var left: integer
    
    /**  The y-coordinate of the upper-left corner. */
    var top: integer
    
    /** The width of the display in pixels. */
    var width: integer
  }
  object Bounds {
    
    inline def apply(height: integer, left: integer, top: integer, width: integer): Bounds = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bounds]
    }
    
    extension [Self <: Bounds](x: Self) {
      
      inline def setHeight(value: integer): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: integer): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setTop(value: integer): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: integer): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /** Information about display properties. */
  trait DisplayInfo extends StObject {
    
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
    var edid: js.UndefOr[ManufacturerId] = js.undefined
    
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
    
    inline def apply(
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
    
    extension [Self <: DisplayInfo](x: Self) {
      
      inline def setAvailableDisplayZoomFactors(value: js.Array[double]): Self = StObject.set(x, "availableDisplayZoomFactors", value.asInstanceOf[js.Any])
      
      inline def setAvailableDisplayZoomFactorsVarargs(value: double*): Self = StObject.set(x, "availableDisplayZoomFactors", js.Array(value :_*))
      
      inline def setBounds(value: Bounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setDisplayZoomFactor(value: double): Self = StObject.set(x, "displayZoomFactor", value.asInstanceOf[js.Any])
      
      inline def setDpiX(value: integer): Self = StObject.set(x, "dpiX", value.asInstanceOf[js.Any])
      
      inline def setDpiY(value: integer): Self = StObject.set(x, "dpiY", value.asInstanceOf[js.Any])
      
      inline def setEdid(value: ManufacturerId): Self = StObject.set(x, "edid", value.asInstanceOf[js.Any])
      
      inline def setEdidUndefined: Self = StObject.set(x, "edid", js.undefined)
      
      inline def setHasTouchSupport(value: Boolean): Self = StObject.set(x, "hasTouchSupport", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
      
      inline def setIsInternal(value: Boolean): Self = StObject.set(x, "isInternal", value.asInstanceOf[js.Any])
      
      inline def setIsPrimary(value: Boolean): Self = StObject.set(x, "isPrimary", value.asInstanceOf[js.Any])
      
      inline def setMirroringDestinationIds(value: js.Array[String]): Self = StObject.set(x, "mirroringDestinationIds", value.asInstanceOf[js.Any])
      
      inline def setMirroringDestinationIdsVarargs(value: String*): Self = StObject.set(x, "mirroringDestinationIds", js.Array(value :_*))
      
      inline def setMirroringSourceId(value: String): Self = StObject.set(x, "mirroringSourceId", value.asInstanceOf[js.Any])
      
      inline def setModes(value: js.Array[DisplayMode]): Self = StObject.set(x, "modes", value.asInstanceOf[js.Any])
      
      inline def setModesVarargs(value: DisplayMode*): Self = StObject.set(x, "modes", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOverscan(value: Insets): Self = StObject.set(x, "overscan", value.asInstanceOf[js.Any])
      
      inline def setRotation(value: integer): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setWorkArea(value: Bounds): Self = StObject.set(x, "workArea", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Options affecting how the information is returned.
    * @since Chrome 59
    */
  trait DisplayInfoFlags extends StObject {
    
    /**
      * If set to true, only a single DisplayUnitInfo will be returned by getInfo when in unified desktop mode.
      * @see[enableUnifiedDesktop]
      * @default false
      */
    var singleUnified: js.UndefOr[Boolean] = js.undefined
  }
  object DisplayInfoFlags {
    
    inline def apply(): DisplayInfoFlags = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisplayInfoFlags]
    }
    
    extension [Self <: DisplayInfoFlags](x: Self) {
      
      inline def setSingleUnified(value: Boolean): Self = StObject.set(x, "singleUnified", value.asInstanceOf[js.Any])
      
      inline def setSingleUnifiedUndefined: Self = StObject.set(x, "singleUnified", js.undefined)
    }
  }
  
  /**
    * @since Chrome 53
    */
  trait DisplayLayout extends StObject {
    
    /** The unique identifier of the display. */
    var id: String
    
    /** The offset of the display along the connected edge. 0 indicates that the topmost or leftmost corners are aligned. */
    var offset: integer
    
    /** The unique identifier of the parent display. Empty if this is the root. */
    var parentId: String
    
    /**
      * The layout position of this display relative to the parent.
      * This will be ignored for the root.
      * @see enum DisplayPosition
      */
    var position: ToStringLiteral[
        BOTTOM, 
        /* keyof chrome-apps.anon.BOTTOM */ TOP | RIGHT | typings.chromeApps.chromeAppsStrings.BOTTOM | LEFT, 
        Exclude[
          /* keyof chrome-apps.anon.BOTTOM */ TOP | RIGHT | typings.chromeApps.chromeAppsStrings.BOTTOM | LEFT, 
          top_ | right_ | bottom_ | left_
        ]
      ]
  }
  object DisplayLayout {
    
    inline def apply(
      id: String,
      offset: integer,
      parentId: String,
      position: ToStringLiteral[
          BOTTOM, 
          /* keyof chrome-apps.anon.BOTTOM */ TOP | RIGHT | typings.chromeApps.chromeAppsStrings.BOTTOM | LEFT, 
          Exclude[
            /* keyof chrome-apps.anon.BOTTOM */ TOP | RIGHT | typings.chromeApps.chromeAppsStrings.BOTTOM | LEFT, 
            top_ | right_ | bottom_ | left_
          ]
        ]
    ): DisplayLayout = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], parentId = parentId.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisplayLayout]
    }
    
    extension [Self <: DisplayLayout](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: integer): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      inline def setPosition(
        value: ToStringLiteral[
              BOTTOM, 
              /* keyof chrome-apps.anon.BOTTOM */ TOP | RIGHT | typings.chromeApps.chromeAppsStrings.BOTTOM | LEFT, 
              Exclude[
                /* keyof chrome-apps.anon.BOTTOM */ TOP | RIGHT | typings.chromeApps.chromeAppsStrings.BOTTOM | LEFT, 
                top_ | right_ | bottom_ | left_
              ]
            ]
      ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @since Chrome 52
    */
  trait DisplayMode extends StObject {
    
    /** The display mode device scale factor. */
    var deviceScaleFactor: integer
    
    /** The display mode height in device independent (user visible) pixels. */
    var height: integer
    
    /** The display mode height in native pixels. */
    var heightInNativePixels: integer
    
    /** True if the mode is the display's native mode. */
    var isNative: Boolean
    
    /** True if the display mode is currently selected. */
    var isSelected: Boolean
    
    /**
      * The display mode refresh rate in hertz.
      * @since Chrome 67
      */
    var refreshRate: double
    
    /**
      * @deprecated Deprecated since Chrome 70. Use `displayZoomFactor`
      * @description The display mode UI scale factor.
      **/
    var uiScale: integer
    
    /** The display mode width in device independent (user visible) pixels. */
    var width: integer
    
    /** The display mode width in native pixels. */
    var widthInNativePixels: integer
  }
  object DisplayMode {
    
    inline def apply(
      deviceScaleFactor: integer,
      height: integer,
      heightInNativePixels: integer,
      isNative: Boolean,
      isSelected: Boolean,
      refreshRate: double,
      uiScale: integer,
      width: integer,
      widthInNativePixels: integer
    ): DisplayMode = {
      val __obj = js.Dynamic.literal(deviceScaleFactor = deviceScaleFactor.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], heightInNativePixels = heightInNativePixels.asInstanceOf[js.Any], isNative = isNative.asInstanceOf[js.Any], isSelected = isSelected.asInstanceOf[js.Any], refreshRate = refreshRate.asInstanceOf[js.Any], uiScale = uiScale.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], widthInNativePixels = widthInNativePixels.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisplayMode]
    }
    
    extension [Self <: DisplayMode](x: Self) {
      
      inline def setDeviceScaleFactor(value: integer): Self = StObject.set(x, "deviceScaleFactor", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: integer): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightInNativePixels(value: integer): Self = StObject.set(x, "heightInNativePixels", value.asInstanceOf[js.Any])
      
      inline def setIsNative(value: Boolean): Self = StObject.set(x, "isNative", value.asInstanceOf[js.Any])
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setRefreshRate(value: double): Self = StObject.set(x, "refreshRate", value.asInstanceOf[js.Any])
      
      inline def setUiScale(value: integer): Self = StObject.set(x, "uiScale", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: integer): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthInNativePixels(value: integer): Self = StObject.set(x, "widthInNativePixels", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Representation of info data to be used in chrome.system.display.setDisplayProperties()
    */
  trait DisplayPropertiesInfo extends StObject {
    
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
    var boundsOriginX: js.UndefOr[integer] = js.undefined
    
    /**
      * If set, updates the display's logical bounds origin along y-axis.
      * @see[See documentation for boundsOriginX parameter.]
      */
    var boundsOriginY: js.UndefOr[integer] = js.undefined
    
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
    var displayZoomFactor: js.UndefOr[double] = js.undefined
    
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
    
    inline def apply(): DisplayPropertiesInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DisplayPropertiesInfo]
    }
    
    extension [Self <: DisplayPropertiesInfo](x: Self) {
      
      inline def setBoundsOriginX(value: integer): Self = StObject.set(x, "boundsOriginX", value.asInstanceOf[js.Any])
      
      inline def setBoundsOriginXUndefined: Self = StObject.set(x, "boundsOriginX", js.undefined)
      
      inline def setBoundsOriginY(value: integer): Self = StObject.set(x, "boundsOriginY", value.asInstanceOf[js.Any])
      
      inline def setBoundsOriginYUndefined: Self = StObject.set(x, "boundsOriginY", js.undefined)
      
      inline def setDisplayMode(value: DisplayMode): Self = StObject.set(x, "displayMode", value.asInstanceOf[js.Any])
      
      inline def setDisplayModeUndefined: Self = StObject.set(x, "displayMode", js.undefined)
      
      inline def setDisplayZoomFactor(value: double): Self = StObject.set(x, "displayZoomFactor", value.asInstanceOf[js.Any])
      
      inline def setDisplayZoomFactorUndefined: Self = StObject.set(x, "displayZoomFactor", js.undefined)
      
      inline def setIsPrimary(value: Boolean): Self = StObject.set(x, "isPrimary", value.asInstanceOf[js.Any])
      
      inline def setIsPrimaryUndefined: Self = StObject.set(x, "isPrimary", js.undefined)
      
      inline def setIsUnified(value: Boolean): Self = StObject.set(x, "isUnified", value.asInstanceOf[js.Any])
      
      inline def setIsUnifiedUndefined: Self = StObject.set(x, "isUnified", js.undefined)
      
      inline def setMirroringSourceId(value: String): Self = StObject.set(x, "mirroringSourceId", value.asInstanceOf[js.Any])
      
      inline def setMirroringSourceIdUndefined: Self = StObject.set(x, "mirroringSourceId", js.undefined)
      
      inline def setOverscan(value: Insets): Self = StObject.set(x, "overscan", value.asInstanceOf[js.Any])
      
      inline def setOverscanUndefined: Self = StObject.set(x, "overscan", js.undefined)
      
      inline def setRotation(value: `0` | `90` | `180` | `270`): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
    }
  }
  
  trait Insets extends StObject {
    
    /** The y-axis distance from the bottom bound. */
    var bottom: integer
    
    /** The x-axis distance from the left bound. */
    var left: integer
    
    /** The x-axis distance from the right bound. */
    var right: integer
    
    /** The y-axis distance from the top bound. */
    var top: integer
  }
  object Insets {
    
    inline def apply(bottom: integer, left: integer, right: integer, top: integer): Insets = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Insets]
    }
    
    extension [Self <: Insets](x: Self) {
      
      inline def setBottom(value: integer): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: integer): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: integer): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: integer): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait MirrorModeInfo extends StObject {
    
    /**
      * The mirror mode that should be set.
      * **off**
      * Use the default mode (extended or unified desktop).
      * **normal**
      * The default source display will be mirrored to all other displays.
      * **mixed**
      * The specified source display will be mirrored to the provided destination displays. All other connected displays will be extended.
      */
    var mode: js.UndefOr[off | normal_ | mixed] = js.undefined
  }
  object MirrorModeInfo {
    
    inline def apply(): MirrorModeInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MirrorModeInfo]
    }
    
    extension [Self <: MirrorModeInfo](x: Self) {
      
      inline def setMode(value: off | normal_ | mixed): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
  
  trait MirrorModeInfoMixed
    extends StObject
       with MirrorModeInfo {
    
    /** The ids of the mirroring destination displays. */
    var mirroringDestinationIds: js.UndefOr[js.Array[String]] = js.undefined
    
    var mirroringSourceId: js.UndefOr[String] = js.undefined
    
    @JSName("mode")
    var mode_MirrorModeInfoMixed: mixed
  }
  object MirrorModeInfoMixed {
    
    inline def apply(): MirrorModeInfoMixed = {
      val __obj = js.Dynamic.literal(mode = "mixed")
      __obj.asInstanceOf[MirrorModeInfoMixed]
    }
    
    extension [Self <: MirrorModeInfoMixed](x: Self) {
      
      inline def setMirroringDestinationIds(value: js.Array[String]): Self = StObject.set(x, "mirroringDestinationIds", value.asInstanceOf[js.Any])
      
      inline def setMirroringDestinationIdsUndefined: Self = StObject.set(x, "mirroringDestinationIds", js.undefined)
      
      inline def setMirroringDestinationIdsVarargs(value: String*): Self = StObject.set(x, "mirroringDestinationIds", js.Array(value :_*))
      
      inline def setMirroringSourceId(value: String): Self = StObject.set(x, "mirroringSourceId", value.asInstanceOf[js.Any])
      
      inline def setMirroringSourceIdUndefined: Self = StObject.set(x, "mirroringSourceId", js.undefined)
      
      inline def setMode(value: mixed): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @since Chrome 57
    */
  trait Point extends StObject {
    
    /** The x-coordinate of the point. */
    var x: integer
    
    /** The y-coordinate of the point. */
    var y: integer
  }
  object Point {
    
    inline def apply(x: integer, y: integer): Point = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[Point]
    }
    
    extension [Self <: Point](x: Self) {
      
      inline def setX(value: integer): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: integer): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @since Chrome 57
    */
  trait TouchCalibrationPair extends StObject {
    
    /** The coordinates of the display point. */
    var displayPoint: Point
    
    /** The coordinates of the touch point corresponding to the display point. */
    var touchPoint: Point
  }
  object TouchCalibrationPair {
    
    inline def apply(displayPoint: Point, touchPoint: Point): TouchCalibrationPair = {
      val __obj = js.Dynamic.literal(displayPoint = displayPoint.asInstanceOf[js.Any], touchPoint = touchPoint.asInstanceOf[js.Any])
      __obj.asInstanceOf[TouchCalibrationPair]
    }
    
    extension [Self <: TouchCalibrationPair](x: Self) {
      
      inline def setDisplayPoint(value: Point): Self = StObject.set(x, "displayPoint", value.asInstanceOf[js.Any])
      
      inline def setTouchPoint(value: Point): Self = StObject.set(x, "touchPoint", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * The pairs of point used to calibrate the display.
    */
  trait TouchCalibrationPairs extends StObject {
    
    /** First pair of touch and display point required for touch calibration. */
    var pair1: TouchCalibrationPair
    
    /** Second pair of touch and display point required for touch calibration. */
    var pair2: TouchCalibrationPair
    
    /** Third pair of touch and display point required for touch calibration. */
    var pair3: TouchCalibrationPair
    
    /** Fourth pair of touch and display point required for touch calibration. */
    var pair4: TouchCalibrationPair
  }
  object TouchCalibrationPairs {
    
    inline def apply(
      pair1: TouchCalibrationPair,
      pair2: TouchCalibrationPair,
      pair3: TouchCalibrationPair,
      pair4: TouchCalibrationPair
    ): TouchCalibrationPairs = {
      val __obj = js.Dynamic.literal(pair1 = pair1.asInstanceOf[js.Any], pair2 = pair2.asInstanceOf[js.Any], pair3 = pair3.asInstanceOf[js.Any], pair4 = pair4.asInstanceOf[js.Any])
      __obj.asInstanceOf[TouchCalibrationPairs]
    }
    
    extension [Self <: TouchCalibrationPairs](x: Self) {
      
      inline def setPair1(value: TouchCalibrationPair): Self = StObject.set(x, "pair1", value.asInstanceOf[js.Any])
      
      inline def setPair2(value: TouchCalibrationPair): Self = StObject.set(x, "pair2", value.asInstanceOf[js.Any])
      
      inline def setPair3(value: TouchCalibrationPair): Self = StObject.set(x, "pair3", value.asInstanceOf[js.Any])
      
      inline def setPair4(value: TouchCalibrationPair): Self = StObject.set(x, "pair4", value.asInstanceOf[js.Any])
    }
  }
}
