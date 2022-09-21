package typings.babylonjs

import typings.babylonjs.anon.WheelDeltaX
import typings.babylonjs.cameraInputsManagerMod.ICameraInput
import typings.babylonjs.cameraMod.Camera
import typings.babylonjs.observableMod.Observable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseCameraMouseWheelInputMod {
  
  @JSImport("babylonjs/Cameras/Inputs/BaseCameraMouseWheelInput", "BaseCameraMouseWheelInput")
  @js.native
  abstract class BaseCameraMouseWheelInput ()
    extends StObject
       with ICameraInput[Camera] {
    
    /**
      * Firefox uses a different scheme to report scroll distances to other
      * browsers. Rather than use complicated methods to calculate the exact
      * multiple we need to apply, let's just cheat and use a constant.
      * https://developer.mozilla.org/en-US/docs/Web/API/WheelEvent/deltaMode
      * https://stackoverflow.com/questions/20110224/what-is-the-height-of-a-line-in-a-wheel-event-deltamode-dom-delta-line
      */
    /* private */ val _ffMultiplier: Any = js.native
    
    /**
      * Different event attributes for wheel data fall into a few set ranges.
      * Some relevant but dated date here:
      * https://stackoverflow.com/questions/5527601/normalizing-mousewheel-speed-across-browsers
      */
    /* private */ val _normalize: Any = js.native
    
    /* private */ var _observer: Any = js.native
    
    /* private */ var _wheel: Any = js.native
    
    /**
      * Incremental value of multiple mouse wheel movements of the X axis.
      * Should be zero-ed when read.
      */
    /* protected */ var _wheelDeltaX: Double = js.native
    
    /**
      * Incremental value of multiple mouse wheel movements of the Y axis.
      * Should be zero-ed when read.
      */
    /* protected */ var _wheelDeltaY: Double = js.native
    
    /**
      * Incremental value of multiple mouse wheel movements of the Z axis.
      * Should be zero-ed when read.
      */
    /* protected */ var _wheelDeltaZ: Double = js.native
    
    /**
      * Defines the camera the input is attached to.
      */
    @JSName("camera")
    var camera_BaseCameraMouseWheelInput: Camera = js.native
    
    /**
      * Called for each rendered frame.
      */
    @JSName("checkInputs")
    def checkInputs_MBaseCameraMouseWheelInput(): Unit = js.native
    
    /**
      * Observable for when a mouse wheel move event occurs.
      */
    var onChangedObservable: Observable[WheelDeltaX] = js.native
    
    /**
      * How fast is the camera moves in relation to X axis mouseWheel events.
      * Use negative value to reverse direction.
      */
    var wheelPrecisionX: Double = js.native
    
    /**
      * How fast is the camera moves in relation to Y axis mouseWheel events.
      * Use negative value to reverse direction.
      */
    var wheelPrecisionY: Double = js.native
    
    /**
      * How fast is the camera moves in relation to Z axis mouseWheel events.
      * Use negative value to reverse direction.
      */
    var wheelPrecisionZ: Double = js.native
  }
}
