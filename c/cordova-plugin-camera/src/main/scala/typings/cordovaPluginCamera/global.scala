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
    def this(x: Double, y: Double) = this()
    def this(x: Double, y: Double, width: Double) = this()
    def this(x: Double, y: Double, width: Double, height: Double) = this()
    def this(x: Double, y: Double, width: Double, height: Double, arrowDir: Double) = this()
    /**
      * Direction the arrow on the popover should point. Defined in Camera.PopoverArrowDirection
      * Matches iOS UIPopoverArrowDirection constants.
      *      ARROW_UP : 1,        
      *      ARROW_DOWN : 2,
      *      ARROW_LEFT : 4,
      *      ARROW_RIGHT : 8,
      *      ARROW_ANY : 15
      */
    /* CompleteClass */
    override var arrowDir: Double = js.native
    /* CompleteClass */
    override var height: Double = js.native
    /* CompleteClass */
    override var popoverHeight: Double = js.native
    /* CompleteClass */
    override var popoverWidth: Double = js.native
    /* CompleteClass */
    override var width: Double = js.native
    /* CompleteClass */
    override var x: Double = js.native
    /* CompleteClass */
    override var y: Double = js.native
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

