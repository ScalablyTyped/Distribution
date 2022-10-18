package typings.babylonjs

import typings.babylonjs.camerasArcRotateCameraMod.ArcRotateCamera
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object camerasStereoscopicAnaglyphArcRotateCameraMod {
  
  @JSImport("babylonjs/Cameras/Stereoscopic/anaglyphArcRotateCamera", "AnaglyphArcRotateCamera")
  @js.native
  open class AnaglyphArcRotateCamera protected () extends ArcRotateCamera {
    /**
      * Creates a new AnaglyphArcRotateCamera
      * @param name defines camera name
      * @param alpha defines alpha angle (in radians)
      * @param beta defines beta angle (in radians)
      * @param radius defines radius
      * @param target defines camera target
      * @param interaxialDistance defines distance between each color axis
      * @param scene defines the hosting scene
      */
    def this(
      name: String,
      alpha: Double,
      beta: Double,
      radius: Double,
      target: Vector3,
      interaxialDistance: Double
    ) = this()
    def this(
      name: String,
      alpha: Double,
      beta: Double,
      radius: Double,
      target: Vector3,
      interaxialDistance: Double,
      scene: Scene
    ) = this()
    
    /* protected */ var _setRigMode: Any = js.native
  }
}
