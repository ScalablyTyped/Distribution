package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.PositionNormalTextureVertex")
@js.native
/**
  * Creates a PositionNormalTextureVertex
  * @param position the position of the vertex (defaut: 0,0,0)
  * @param normal the normal of the vertex (defaut: 0,1,0)
  * @param uv the uv of the vertex (default: 0,0)
  */
class PositionNormalTextureVertex ()
  extends typings.babylonjs.BABYLON.PositionNormalTextureVertex {
  def this(/** the position of the vertex (defaut: 0,0,0) */
  position: typings.babylonjs.BABYLON.Vector3) = this()
  def this(
    /** the position of the vertex (defaut: 0,0,0) */
  position: typings.babylonjs.BABYLON.Vector3,
    /** the normal of the vertex (defaut: 0,1,0) */
  normal: typings.babylonjs.BABYLON.Vector3
  ) = this()
  def this(
    /** the position of the vertex (defaut: 0,0,0) */
  position: typings.babylonjs.BABYLON.Vector3,
    /** the normal of the vertex (defaut: 0,1,0) */
  normal: typings.babylonjs.BABYLON.Vector3,
    /** the uv of the vertex (default: 0,0) */
  uv: typings.babylonjs.BABYLON.Vector2
  ) = this()
  /** the normal of the vertex (defaut: 0,1,0) */
  /* CompleteClass */
  override var normal: typings.babylonjs.BABYLON.Vector3 = js.native
  /** the position of the vertex (defaut: 0,0,0) */
  /* CompleteClass */
  override var position: typings.babylonjs.BABYLON.Vector3 = js.native
  /** the uv of the vertex (default: 0,0) */
  /* CompleteClass */
  override var uv: typings.babylonjs.BABYLON.Vector2 = js.native
}

