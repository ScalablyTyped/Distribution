package typings.babylonjs.mathsIndexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Maths/index", "PositionNormalTextureVertex")
@js.native
/**
  * Creates a PositionNormalTextureVertex
  * @param position the position of the vertex (defaut: 0,0,0)
  * @param normal the normal of the vertex (defaut: 0,1,0)
  * @param uv the uv of the vertex (default: 0,0)
  */
class PositionNormalTextureVertex ()
  extends typings.babylonjs.mathMod.PositionNormalTextureVertex {
  def this(/** the position of the vertex (defaut: 0,0,0) */
  position: typings.babylonjs.mathVectorMod.Vector3) = this()
  def this(
    /** the position of the vertex (defaut: 0,0,0) */
  position: typings.babylonjs.mathVectorMod.Vector3,
    /** the normal of the vertex (defaut: 0,1,0) */
  normal: typings.babylonjs.mathVectorMod.Vector3
  ) = this()
  def this(
    /** the position of the vertex (defaut: 0,0,0) */
  position: typings.babylonjs.mathVectorMod.Vector3,
    /** the normal of the vertex (defaut: 0,1,0) */
  normal: typings.babylonjs.mathVectorMod.Vector3,
    /** the uv of the vertex (default: 0,0) */
  uv: typings.babylonjs.mathVectorMod.Vector2
  ) = this()
}

