package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRWindowsMotionController
  extends StObject
     with WindowsMotionController {
  
  /**
    * Fired when the thumbstick on this controller is clicked
    */
  var onThumbstickStateChangedObservable: Observable[ExtendedGamepadButton] = js.native
  
  /**
    * Fired when the thumbstick on this controller is modified
    */
  var onThumbstickValuesChangedObservable: Observable[StickValues] = js.native
  
  /**
    * holds the thumbstick values (X,Y)
    */
  var thumbstickValues: StickValues = js.native
}
