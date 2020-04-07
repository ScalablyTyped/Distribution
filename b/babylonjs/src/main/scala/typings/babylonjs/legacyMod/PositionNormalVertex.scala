package typings.babylonjs.legacyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Legacy/legacy", "PositionNormalVertex")
@js.native
/**
  * Creates a PositionNormalVertex
  * @param position the position of the vertex (defaut: 0,0,0)
  * @param normal the normal of the vertex (defaut: 0,1,0)
  */
class PositionNormalVertex ()
  extends typings.babylonjs.indexMod.PositionNormalVertex {
  def this(/** the position of the vertex (defaut: 0,0,0) */
  position: typings.babylonjs.mathVectorMod.Vector3) = this()
  def this(
    /** the position of the vertex (defaut: 0,0,0) */
  position: typings.babylonjs.mathVectorMod.Vector3,
    /** the normal of the vertex (defaut: 0,1,0) */
  normal: typings.babylonjs.mathVectorMod.Vector3
  ) = this()
}

