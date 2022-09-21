package typings.babylonjs

import typings.babylonjs.arcRotateCameraMod.ArcRotateCamera
import typings.babylonjs.baseCameraPointersInputMod.BaseCameraPointersInput
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object arcRotateCameraPointersInputMod {
  
  @JSImport("babylonjs/Cameras/Inputs/arcRotateCameraPointersInput", "ArcRotateCameraPointersInput")
  @js.native
  open class ArcRotateCameraPointersInput () extends BaseCameraPointersInput {
    
    /**
      * Move camera from multi touch panning positions.
      * @param previousMultiTouchPanPosition
      * @param multiTouchPanPosition
      */
    /* private */ var _computeMultiTouchPanning: Any = js.native
    
    /**
      * Move camera from pinch zoom distances.
      * @param previousPinchSquaredDistance
      * @param pinchSquaredDistance
      */
    /* private */ var _computePinchZoom: Any = js.native
    
    /* private */ var _isPanClick: Any = js.native
    
    /* private */ var _isPinching: Any = js.native
    
    /* private */ var _twoFingerActivityCount: Any = js.native
    
    /**
      * Defines the pointer angular sensibility  along the X axis or how fast is
      * the camera rotating.
      */
    var angularSensibilityX: Double = js.native
    
    /**
      * Defines the pointer angular sensibility along the Y axis or how fast is
      * the camera rotating.
      */
    var angularSensibilityY: Double = js.native
    
    /**
      * Defines the camera the input is attached to.
      */
    @JSName("camera")
    var camera_ArcRotateCameraPointersInput: ArcRotateCamera = js.native
    
    /**
      * Defines whether panning is enabled for both pan (2 fingers swipe) and
      * zoom (pinch) through multitouch.
      */
    var multiTouchPanAndZoom: Boolean = js.native
    
    /**
      * Defines whether panning (2 fingers swipe) is enabled through multitouch.
      */
    var multiTouchPanning: Boolean = js.native
    
    /**
      * Called each time a new POINTERUP event occurs. Ie, for each button
      * release.
      */
    def onButtonUp(): Unit = js.native
    
    /**
      * Called on pointer POINTERDOUBLETAP event.
      */
    def onDoubleTap(): Unit = js.native
    
    /**
      * Defines the pointer panning sensibility or how fast is the camera moving.
      */
    var panningSensibility: Double = js.native
    
    /**
      * pinchDeltaPercentage will be used instead of pinchPrecision if different
      * from 0.
      * It defines the percentage of current camera.radius to use as delta when
      * pinch zoom is used.
      */
    var pinchDeltaPercentage: Double = js.native
    
    /**
      * Revers pinch action direction.
      */
    var pinchInwards: Boolean = js.native
    
    /**
      * Defines the pointer pinch precision or how fast is the camera zooming.
      */
    var pinchPrecision: Double = js.native
    
    /**
      * Defines whether zoom (2 fingers pinch) is enabled through multitouch
      */
    var pinchZoom: Boolean = js.native
    
    /**
      * When useNaturalPinchZoom is true, multi touch zoom will zoom in such
      * that any object in the plane at the camera's target point will scale
      * perfectly with finger motion.
      * Overrides pinchDeltaPercentage and pinchPrecision.
      */
    var useNaturalPinchZoom: Boolean = js.native
  }
  /* static members */
  object ArcRotateCameraPointersInput {
    
    @JSImport("babylonjs/Cameras/Inputs/arcRotateCameraPointersInput", "ArcRotateCameraPointersInput")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The minimum radius used for pinch, to avoid radius lock at 0
      */
    @JSImport("babylonjs/Cameras/Inputs/arcRotateCameraPointersInput", "ArcRotateCameraPointersInput.MinimumRadiusForPinch")
    @js.native
    def MinimumRadiusForPinch: Double = js.native
    inline def MinimumRadiusForPinch_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MinimumRadiusForPinch")(x.asInstanceOf[js.Any])
  }
}
