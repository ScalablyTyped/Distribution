package typings
package babylonjsLib.babylonjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * As raycast might be hard to debug, the RayHelper can help rendering the different rays
     * in order to better appreciate the issue one might have.
     * @see http://doc.babylonjs.com/babylon101/raycasts#debugging
     */
@JSImport("babylonjs", "RayHelper")
@js.native
class RayHelper protected ()
  extends babylonjsLib.BABYLONNs.RayHelper {
  /**
           * Instantiate a new ray helper.
           * As raycast might be hard to debug, the RayHelper can help rendering the different rays
           * in order to better appreciate the issue one might have.
           * @see http://doc.babylonjs.com/babylon101/raycasts#debugging
           * @param ray Defines the ray we are currently tryin to visualize
           */
  def this(ray: babylonjsLib.BABYLONNs.Ray) = this()
}

/**
     * As raycast might be hard to debug, the RayHelper can help rendering the different rays
     * in order to better appreciate the issue one might have.
     * @see http://doc.babylonjs.com/babylon101/raycasts#debugging
     */
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
    ray: babylonjsLib.BABYLONNs.Ray,
    scene: babylonjsLib.BABYLONNs.Scene,
    color: babylonjsLib.BABYLONNs.Color3
  ): babylonjsLib.BABYLONNs.RayHelper = js.native
}

