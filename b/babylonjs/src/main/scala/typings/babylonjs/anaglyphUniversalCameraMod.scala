package typings.babylonjs

import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.universalCameraMod.UniversalCamera
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Cameras/Stereoscopic/anaglyphUniversalCamera", JSImport.Namespace)
@js.native
object anaglyphUniversalCameraMod extends js.Object {
  @js.native
  class AnaglyphUniversalCamera protected () extends UniversalCamera {
    /**
      * Creates a new AnaglyphUniversalCamera
      * @param name defines camera name
      * @param position defines initial position
      * @param interaxialDistance defines distance between each color axis
      * @param scene defines the hosting scene
      */
    def this(name: String, position: Vector3, interaxialDistance: Double, scene: Scene) = this()
  }
  
}

