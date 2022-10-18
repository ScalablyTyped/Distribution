package typings.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "StereoscopicArcRotateCamera")
@js.native
open class StereoscopicArcRotateCamera protected ()
  extends typings.babylonjs.camerasIndexMod.StereoscopicArcRotateCamera {
  /**
    * Creates a new StereoscopicArcRotateCamera
    * @param name defines camera name
    * @param alpha defines alpha angle (in radians)
    * @param beta defines beta angle (in radians)
    * @param radius defines radius
    * @param target defines camera target
    * @param interaxialDistance defines distance between each color axis
    * @param isStereoscopicSideBySide defines is stereoscopic is done side by side or over under
    * @param scene defines the hosting scene
    */
  def this(
    name: String,
    alpha: Double,
    beta: Double,
    radius: Double,
    target: typings.babylonjs.mathsMathDotvectorMod.Vector3,
    interaxialDistance: Double,
    isStereoscopicSideBySide: Boolean
  ) = this()
  def this(
    name: String,
    alpha: Double,
    beta: Double,
    radius: Double,
    target: typings.babylonjs.mathsMathDotvectorMod.Vector3,
    interaxialDistance: Double,
    isStereoscopicSideBySide: Boolean,
    scene: typings.babylonjs.sceneMod.Scene
  ) = this()
}
