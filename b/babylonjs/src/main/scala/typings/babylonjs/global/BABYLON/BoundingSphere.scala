package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.DeepImmutable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.BoundingSphere")
@js.native
class BoundingSphere protected ()
  extends typings.babylonjs.BABYLON.BoundingSphere {
  /**
    * Creates a new bounding sphere
    * @param min defines the minimum vector (in local space)
    * @param max defines the maximum vector (in local space)
    * @param worldMatrix defines the new world matrix
    */
  def this(
    min: DeepImmutable[typings.babylonjs.BABYLON.Vector3],
    max: DeepImmutable[typings.babylonjs.BABYLON.Vector3]
  ) = this()
  def this(
    min: DeepImmutable[typings.babylonjs.BABYLON.Vector3],
    max: DeepImmutable[typings.babylonjs.BABYLON.Vector3],
    worldMatrix: DeepImmutable[typings.babylonjs.BABYLON.Matrix]
  ) = this()
}
/* static members */
object BoundingSphere {
  
  /**
    * Checks if two sphere intersct
    * @param sphere0 sphere 0
    * @param sphere1 sphere 1
    * @returns true if the speres intersect
    */
  @JSGlobal("BABYLON.BoundingSphere.Intersects")
  @js.native
  def Intersects(
    sphere0: DeepImmutable[typings.babylonjs.BABYLON.BoundingSphere],
    sphere1: DeepImmutable[typings.babylonjs.BABYLON.BoundingSphere]
  ): Boolean = js.native
  
  @JSGlobal("BABYLON.BoundingSphere.TmpVector3")
  @js.native
  val TmpVector3: js.Any = js.native
}
