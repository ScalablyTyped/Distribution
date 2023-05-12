package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "RayHelper")
@js.native
open class RayHelper protected ()
  extends typings.babylonjs.legacyLegacyMod.RayHelper {
  /**
    * Instantiate a new ray helper.
    * As raycast might be hard to debug, the RayHelper can help rendering the different rays
    * in order to better appreciate the issue one might have.
    * @see https://doc.babylonjs.com/features/featuresDeepDive/mesh/interactions/picking_collisions#debugging
    * @param ray Defines the ray we are currently tryin to visualize
    */
  def this(ray: typings.babylonjs.cullingRayMod.Ray) = this()
}
/* static members */
object RayHelper {
  
  @JSImport("babylonjs", "RayHelper")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Helper function to create a colored helper in a scene in one line.
    * @param ray Defines the ray we are currently tryin to visualize
    * @param scene Defines the scene the ray is used in
    * @param color Defines the color we want to see the ray in
    * @returns The newly created ray helper.
    */
  inline def CreateAndShow(
    ray: typings.babylonjs.cullingRayMod.Ray,
    scene: typings.babylonjs.sceneMod.Scene,
    color: typings.babylonjs.mathsMathDotcolorMod.Color3
  ): typings.babylonjs.debugRayHelperMod.RayHelper = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAndShow")(ray.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], color.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.debugRayHelperMod.RayHelper]
}
