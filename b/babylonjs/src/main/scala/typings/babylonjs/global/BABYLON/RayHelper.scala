package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.RayHelper")
@js.native
class RayHelper protected ()
  extends typings.babylonjs.BABYLON.RayHelper {
  /**
    * Instantiate a new ray helper.
    * As raycast might be hard to debug, the RayHelper can help rendering the different rays
    * in order to better appreciate the issue one might have.
    * @see https://doc.babylonjs.com/babylon101/raycasts#debugging
    * @param ray Defines the ray we are currently tryin to visualize
    */
  def this(ray: typings.babylonjs.BABYLON.Ray) = this()
}
/* static members */
object RayHelper {
  
  /**
    * Helper function to create a colored helper in a scene in one line.
    * @param ray Defines the ray we are currently tryin to visualize
    * @param scene Defines the scene the ray is used in
    * @param color Defines the color we want to see the ray in
    * @returns The newly created ray helper.
    */
  @JSGlobal("BABYLON.RayHelper.CreateAndShow")
  @js.native
  def CreateAndShow(
    ray: typings.babylonjs.BABYLON.Ray,
    scene: typings.babylonjs.BABYLON.Scene,
    color: typings.babylonjs.BABYLON.Color3
  ): typings.babylonjs.BABYLON.RayHelper = js.native
}
