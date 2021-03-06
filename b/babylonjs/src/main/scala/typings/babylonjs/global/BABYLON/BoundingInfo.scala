package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.DeepImmutable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.BoundingInfo")
@js.native
class BoundingInfo protected ()
  extends typings.babylonjs.BABYLON.BoundingInfo {
  /**
    * Constructs bounding info
    * @param minimum min vector of the bounding box/sphere
    * @param maximum max vector of the bounding box/sphere
    * @param worldMatrix defines the new world matrix
    */
  def this(
    minimum: DeepImmutable[typings.babylonjs.BABYLON.Vector3],
    maximum: DeepImmutable[typings.babylonjs.BABYLON.Vector3]
  ) = this()
  def this(
    minimum: DeepImmutable[typings.babylonjs.BABYLON.Vector3],
    maximum: DeepImmutable[typings.babylonjs.BABYLON.Vector3],
    worldMatrix: DeepImmutable[typings.babylonjs.BABYLON.Matrix]
  ) = this()
}
/* static members */
object BoundingInfo {
  
  @JSGlobal("BABYLON.BoundingInfo.TmpVector3")
  @js.native
  val TmpVector3: js.Any = js.native
}
