package typings.cordovaPluginCamera

import typings.cordovaPluginCamera.anon.ALLMEDIA
import typings.cordovaPluginCamera.anon.ARROWANY
import typings.cordovaPluginCamera.anon.BACK
import typings.cordovaPluginCamera.anon.CAMERA
import typings.cordovaPluginCamera.anon.DATAURL
import typings.cordovaPluginCamera.anon.JPEG
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object Camera {
    
    @JSGlobal("Camera")
    @js.native
    val ^ : js.Any = js.native
    
    // Camera constants, defined in Camera plugin
    @JSGlobal("Camera.DestinationType")
    @js.native
    def DestinationType: DATAURL = js.native
    @scala.inline
    def DestinationType_=(x: DATAURL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DestinationType")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Camera.Direction")
    @js.native
    def Direction: BACK = js.native
    @scala.inline
    def Direction_=(x: BACK): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Direction")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Camera.EncodingType")
    @js.native
    def EncodingType: JPEG = js.native
    @scala.inline
    def EncodingType_=(x: JPEG): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EncodingType")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Camera.MediaType")
    @js.native
    def MediaType: ALLMEDIA = js.native
    @scala.inline
    def MediaType_=(x: ALLMEDIA): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MediaType")(x.asInstanceOf[js.Any])
    
    @JSGlobal("Camera.PictureSourceType")
    @js.native
    def PictureSourceType: CAMERA = js.native
    @scala.inline
    def PictureSourceType_=(x: CAMERA): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PictureSourceType")(x.asInstanceOf[js.Any])
    
    // Used only on iOS
    @JSGlobal("Camera.PopoverArrowDirection")
    @js.native
    def PopoverArrowDirection: ARROWANY = js.native
    @scala.inline
    def PopoverArrowDirection_=(x: ARROWANY): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PopoverArrowDirection")(x.asInstanceOf[js.Any])
  }
  
  /**
    * iOS-only parameters that specify the anchor element location and arrow direction
    * of the popover when selecting images from an iPad's library or album.
    */
  @JSGlobal("CameraPopoverOptions")
  @js.native
  class CameraPopoverOptions ()
    extends StObject
       with typings.cordovaPluginCamera.CameraPopoverOptions {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    def this(x: Unit, y: Double) = this()
    def this(x: Double, y: Double, width: Double) = this()
    def this(x: Double, y: Unit, width: Double) = this()
    def this(x: Unit, y: Double, width: Double) = this()
    def this(x: Unit, y: Unit, width: Double) = this()
    def this(x: Double, y: Double, width: Double, height: Double) = this()
    def this(x: Double, y: Double, width: Unit, height: Double) = this()
    def this(x: Double, y: Unit, width: Double, height: Double) = this()
    def this(x: Double, y: Unit, width: Unit, height: Double) = this()
    def this(x: Unit, y: Double, width: Double, height: Double) = this()
    def this(x: Unit, y: Double, width: Unit, height: Double) = this()
    def this(x: Unit, y: Unit, width: Double, height: Double) = this()
    def this(x: Unit, y: Unit, width: Unit, height: Double) = this()
    def this(x: Double, y: Double, width: Double, height: Double, arrowDir: Double) = this()
    def this(x: Double, y: Double, width: Double, height: Unit, arrowDir: Double) = this()
    def this(x: Double, y: Double, width: Unit, height: Double, arrowDir: Double) = this()
    def this(x: Double, y: Double, width: Unit, height: Unit, arrowDir: Double) = this()
    def this(x: Double, y: Unit, width: Double, height: Double, arrowDir: Double) = this()
    def this(x: Double, y: Unit, width: Double, height: Unit, arrowDir: Double) = this()
    def this(x: Double, y: Unit, width: Unit, height: Double, arrowDir: Double) = this()
    def this(x: Double, y: Unit, width: Unit, height: Unit, arrowDir: Double) = this()
    def this(x: Unit, y: Double, width: Double, height: Double, arrowDir: Double) = this()
    def this(x: Unit, y: Double, width: Double, height: Unit, arrowDir: Double) = this()
    def this(x: Unit, y: Double, width: Unit, height: Double, arrowDir: Double) = this()
    def this(x: Unit, y: Double, width: Unit, height: Unit, arrowDir: Double) = this()
    def this(x: Unit, y: Unit, width: Double, height: Double, arrowDir: Double) = this()
    def this(x: Unit, y: Unit, width: Double, height: Unit, arrowDir: Double) = this()
    def this(x: Unit, y: Unit, width: Unit, height: Double, arrowDir: Double) = this()
    def this(x: Unit, y: Unit, width: Unit, height: Unit, arrowDir: Double) = this()
    
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
    var arrowDir: Double = js.native
    
    /* CompleteClass */
    var height: Double = js.native
    
    /* CompleteClass */
    var popoverHeight: Double = js.native
    
    /* CompleteClass */
    var popoverWidth: Double = js.native
    
    /* CompleteClass */
    var width: Double = js.native
    
    /* CompleteClass */
    var x: Double = js.native
    
    /* CompleteClass */
    var y: Double = js.native
  }
}
