package typings.babylonjs.legacyMod

import typings.babylonjs.typesMod.DeepImmutable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "BoundingInfo")
@js.native
class BoundingInfo protected ()
  extends typings.babylonjs.indexMod.BoundingInfo {
  /**
    * Constructs bounding info
    * @param minimum min vector of the bounding box/sphere
    * @param maximum max vector of the bounding box/sphere
    * @param worldMatrix defines the new world matrix
    */
  def this(
    minimum: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    maximum: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3]
  ) = this()
  def this(
    minimum: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    maximum: DeepImmutable[typings.babylonjs.mathVectorMod.Vector3],
    worldMatrix: DeepImmutable[typings.babylonjs.mathVectorMod.Matrix]
  ) = this()
}
/* static members */
@JSImport("babylonjs/Legacy/legacy", "BoundingInfo")
@js.native
object BoundingInfo extends js.Object {
  
  val TmpVector3: js.Any = js.native
}
