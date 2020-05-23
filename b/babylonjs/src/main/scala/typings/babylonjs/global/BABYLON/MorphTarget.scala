package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.MorphTarget")
@js.native
class MorphTarget protected ()
  extends typings.babylonjs.BABYLON.MorphTarget {
  /**
    * Creates a new MorphTarget
    * @param name defines the name of the target
    * @param influence defines the influence to use
    * @param scene defines the scene the morphtarget belongs to
    */
  def this(/** defines the name of the target */
  name: String) = this()
  def this(/** defines the name of the target */
  name: String, influence: Double) = this()
  def this(
    /** defines the name of the target */
  name: String,
    influence: Double,
    scene: Nullable[typings.babylonjs.BABYLON.Scene]
  ) = this()
  /**
    * Array of animations
    */
  /* CompleteClass */
  override var animations: Nullable[js.Array[typings.babylonjs.BABYLON.Animation]] = js.native
}

/* static members */
@JSGlobal("BABYLON.MorphTarget")
@js.native
object MorphTarget extends js.Object {
  /**
    * Creates a MorphTarget from mesh data
    * @param mesh defines the source mesh
    * @param name defines the name to use for the new target
    * @param influence defines the influence to attach to the target
    * @returns a new MorphTarget
    */
  def FromMesh(mesh: typings.babylonjs.BABYLON.AbstractMesh): typings.babylonjs.BABYLON.MorphTarget = js.native
  def FromMesh(mesh: typings.babylonjs.BABYLON.AbstractMesh, name: String): typings.babylonjs.BABYLON.MorphTarget = js.native
  def FromMesh(mesh: typings.babylonjs.BABYLON.AbstractMesh, name: String, influence: Double): typings.babylonjs.BABYLON.MorphTarget = js.native
  /**
    * Creates a new target from serialized data
    * @param serializationObject defines the serialized data to use
    * @returns a new MorphTarget
    */
  def Parse(serializationObject: js.Any): typings.babylonjs.BABYLON.MorphTarget = js.native
}

