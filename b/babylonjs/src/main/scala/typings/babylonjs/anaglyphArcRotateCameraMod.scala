package typings.babylonjs

import typings.babylonjs.arcRotateCameraMod.ArcRotateCamera
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anaglyphArcRotateCameraMod {
  
  @JSImport("babylonjs/Cameras/Stereoscopic/anaglyphArcRotateCamera", "AnaglyphArcRotateCamera")
  @js.native
  class AnaglyphArcRotateCamera protected () extends ArcRotateCamera {
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
      interaxialDistance: Double,
      scene: Scene
    ) = this()
  }
}
