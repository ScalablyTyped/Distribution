package typings.babylonjs

import typings.babylonjs.freeCameraMod.FreeCamera
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Cameras/Stereoscopic/anaglyphFreeCamera", JSImport.Namespace)
@js.native
object anaglyphFreeCameraMod extends js.Object {
  @js.native
  class AnaglyphFreeCamera protected () extends FreeCamera {
    /**
      * Creates a new AnaglyphFreeCamera
      * @param name defines camera name
      * @param position defines initial position
      * @param interaxialDistance defines distance between each color axis
      * @param scene defines the hosting scene
      */
    def this(name: String, position: Vector3, interaxialDistance: Double, scene: Scene) = this()
  }
  
}

