package typings.cordovaPluginCamera

import typings.cordovaPluginCamera.anon.ALLMEDIA
import typings.cordovaPluginCamera.anon.ARROWANY
import typings.cordovaPluginCamera.anon.BACK
import typings.cordovaPluginCamera.anon.CAMERA
import typings.cordovaPluginCamera.anon.DATAURL
import typings.cordovaPluginCamera.anon.JPEG
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  /**
    * iOS-only parameters that specify the anchor element location and arrow direction
    * of the popover when selecting images from an iPad's library or album.
    */
  @js.native
  class CameraPopoverOptions ()
    extends typings.cordovaPluginCamera.CameraPopoverOptions {
    def this(x: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], width: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, width: Double) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], width: Double) = this()
    def this(x: Double, y: Double, width: Double) = this()
    def this(
      x: js.UndefOr[scala.Nothing],
      y: js.UndefOr[scala.Nothing],
      width: js.UndefOr[scala.Nothing],
      height: Double
    ) = this()
    def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], width: Double, height: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, width: js.UndefOr[scala.Nothing], height: Double) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, width: Double, height: Double) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], width: js.UndefOr[scala.Nothing], height: Double) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], width: Double, height: Double) = this()
    def this(x: Double, y: Double, width: js.UndefOr[scala.Nothing], height: Double) = this()
    def this(x: Double, y: Double, width: Double, height: Double) = this()
    def this(
      x: js.UndefOr[scala.Nothing],
      y: js.UndefOr[scala.Nothing],
      width: js.UndefOr[scala.Nothing],
      height: js.UndefOr[scala.Nothing],
      arrowDir: Double
    ) = this()
    def this(
      x: js.UndefOr[scala.Nothing],
      y: js.UndefOr[scala.Nothing],
      width: js.UndefOr[scala.Nothing],
      height: Double,
      arrowDir: Double
    ) = this()
    def this(
      x: js.UndefOr[scala.Nothing],
      y: js.UndefOr[scala.Nothing],
      width: Double,
      height: js.UndefOr[scala.Nothing],
      arrowDir: Double
    ) = this()
    def this(
      x: js.UndefOr[scala.Nothing],
      y: js.UndefOr[scala.Nothing],
      width: Double,
      height: Double,
      arrowDir: Double
    ) = this()
    def this(
      x: js.UndefOr[scala.Nothing],
      y: Double,
      width: js.UndefOr[scala.Nothing],
      height: js.UndefOr[scala.Nothing],
      arrowDir: Double
    ) = this()
    def this(
      x: js.UndefOr[scala.Nothing],
      y: Double,
      width: js.UndefOr[scala.Nothing],
      height: Double,
      arrowDir: Double
    ) = this()
    def this(
      x: js.UndefOr[scala.Nothing],
      y: Double,
      width: Double,
      height: js.UndefOr[scala.Nothing],
      arrowDir: Double
    ) = this()
    def this(x: js.UndefOr[scala.Nothing], y: Double, width: Double, height: Double, arrowDir: Double) = this()
    def this(
      x: Double,
      y: js.UndefOr[scala.Nothing],
      width: js.UndefOr[scala.Nothing],
      height: js.UndefOr[scala.Nothing],
      arrowDir: Double
    ) = this()
    def this(
      x: Double,
      y: js.UndefOr[scala.Nothing],
      width: js.UndefOr[scala.Nothing],
      height: Double,
      arrowDir: Double
    ) = this()
    def this(
      x: Double,
      y: js.UndefOr[scala.Nothing],
      width: Double,
      height: js.UndefOr[scala.Nothing],
      arrowDir: Double
    ) = this()
    def this(x: Double, y: js.UndefOr[scala.Nothing], width: Double, height: Double, arrowDir: Double) = this()
    def this(
      x: Double,
      y: Double,
      width: js.UndefOr[scala.Nothing],
      height: js.UndefOr[scala.Nothing],
      arrowDir: Double
    ) = this()
    def this(x: Double, y: Double, width: js.UndefOr[scala.Nothing], height: Double, arrowDir: Double) = this()
    def this(x: Double, y: Double, width: Double, height: js.UndefOr[scala.Nothing], arrowDir: Double) = this()
    def this(x: Double, y: Double, width: Double, height: Double, arrowDir: Double) = this()
  }
  
  @js.native
  object Camera extends js.Object {
    // Camera constants, defined in Camera plugin
    var DestinationType: DATAURL = js.native
    var Direction: BACK = js.native
    var EncodingType: JPEG = js.native
    var MediaType: ALLMEDIA = js.native
    var PictureSourceType: CAMERA = js.native
    // Used only on iOS
    var PopoverArrowDirection: ARROWANY = js.native
  }
  
}

