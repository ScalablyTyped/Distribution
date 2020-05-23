package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.PositionNormalVertex")
@js.native
/**
  * Creates a PositionNormalVertex
  * @param position the position of the vertex (defaut: 0,0,0)
  * @param normal the normal of the vertex (defaut: 0,1,0)
  */
class PositionNormalVertex ()
  extends typings.babylonjs.BABYLON.PositionNormalVertex {
  def this(/** the position of the vertex (defaut: 0,0,0) */
  position: typings.babylonjs.BABYLON.Vector3) = this()
  def this(
    /** the position of the vertex (defaut: 0,0,0) */
  position: typings.babylonjs.BABYLON.Vector3,
    /** the normal of the vertex (defaut: 0,1,0) */
  normal: typings.babylonjs.BABYLON.Vector3
  ) = this()
  /** the normal of the vertex (defaut: 0,1,0) */
  /* CompleteClass */
  override var normal: typings.babylonjs.BABYLON.Vector3 = js.native
  /** the position of the vertex (defaut: 0,0,0) */
  /* CompleteClass */
  override var position: typings.babylonjs.BABYLON.Vector3 = js.native
}

