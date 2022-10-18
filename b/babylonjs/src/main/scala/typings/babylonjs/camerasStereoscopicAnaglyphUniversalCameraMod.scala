package typings.babylonjs

import typings.babylonjs.camerasUniversalCameraMod.UniversalCamera
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object camerasStereoscopicAnaglyphUniversalCameraMod {
  
  @JSImport("babylonjs/Cameras/Stereoscopic/anaglyphUniversalCamera", "AnaglyphUniversalCamera")
  @js.native
  open class AnaglyphUniversalCamera protected () extends UniversalCamera {
    /**
      * Creates a new AnaglyphUniversalCamera
      * @param name defines camera name
      * @param position defines initial position
      * @param interaxialDistance defines distance between each color axis
      * @param scene defines the hosting scene
      */
    def this(name: String, position: Vector3, interaxialDistance: Double) = this()
    def this(name: String, position: Vector3, interaxialDistance: Double, scene: Scene) = this()
    
    /* protected */ var _setRigMode: Any = js.native
  }
}
