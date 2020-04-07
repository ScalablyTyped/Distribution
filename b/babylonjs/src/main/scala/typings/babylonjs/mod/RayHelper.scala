package typings.babylonjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs", "RayHelper")
@js.native
class RayHelper protected ()
  extends typings.babylonjs.legacyMod.RayHelper {
  /**
    * Instantiate a new ray helper.
    * As raycast might be hard to debug, the RayHelper can help rendering the different rays
    * in order to better appreciate the issue one might have.
    * @see http://doc.babylonjs.com/babylon101/raycasts#debugging
    * @param ray Defines the ray we are currently tryin to visualize
    */
  def this(ray: typings.babylonjs.rayMod.Ray) = this()
}

/* static members */
@JSImport("babylonjs", "RayHelper")
@js.native
object RayHelper extends js.Object {
  /**
    * Helper function to create a colored helper in a scene in one line.
    * @param ray Defines the ray we are currently tryin to visualize
    * @param scene Defines the scene the ray is used in
    * @param color Defines the color we want to see the ray in
    * @returns The newly created ray helper.
    */
  def CreateAndShow(
    ray: typings.babylonjs.rayMod.Ray,
    scene: typings.babylonjs.sceneMod.Scene,
    color: typings.babylonjs.mathColorMod.Color3
  ): typings.babylonjs.rayHelperMod.RayHelper = js.native
}

