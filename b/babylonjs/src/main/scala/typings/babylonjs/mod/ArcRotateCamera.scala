package typings.babylonjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "ArcRotateCamera")
@js.native
open class ArcRotateCamera protected ()
  extends typings.babylonjs.legacyLegacyMod.ArcRotateCamera {
  /**
    * Instantiates a new ArcRotateCamera in a given scene
    * @param name Defines the name of the camera
    * @param alpha Defines the camera rotation along the longitudinal axis
    * @param beta Defines the camera rotation along the latitudinal axis
    * @param radius Defines the camera distance from its target
    * @param target Defines the camera target
    * @param scene Defines the scene the camera belongs to
    * @param setActiveOnSceneIfNoneActive Defines whether the camera should be marked as active if not other active cameras have been defined
    */
  def this(
    name: String,
    alpha: Double,
    beta: Double,
    radius: Double,
    target: typings.babylonjs.mathsMathDotvectorMod.Vector3
  ) = this()
  def this(
    name: String,
    alpha: Double,
    beta: Double,
    radius: Double,
    target: typings.babylonjs.mathsMathDotvectorMod.Vector3,
    scene: typings.babylonjs.sceneMod.Scene
  ) = this()
  def this(
    name: String,
    alpha: Double,
    beta: Double,
    radius: Double,
    target: typings.babylonjs.mathsMathDotvectorMod.Vector3,
    scene: Unit,
    setActiveOnSceneIfNoneActive: Boolean
  ) = this()
  def this(
    name: String,
    alpha: Double,
    beta: Double,
    radius: Double,
    target: typings.babylonjs.mathsMathDotvectorMod.Vector3,
    scene: typings.babylonjs.sceneMod.Scene,
    setActiveOnSceneIfNoneActive: Boolean
  ) = this()
}
