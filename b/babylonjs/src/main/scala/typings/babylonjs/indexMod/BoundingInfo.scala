package typings.babylonjs.indexMod

import typings.babylonjs.typesMod.DeepImmutable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "BoundingInfo")
@js.native
open class BoundingInfo protected ()
  extends typings.babylonjs.cullingIndexMod.BoundingInfo {
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
object BoundingInfo {
  
  @JSImport("babylonjs/index", "BoundingInfo._TmpVector3")
  @js.native
  val _TmpVector3: Any = js.native
}
