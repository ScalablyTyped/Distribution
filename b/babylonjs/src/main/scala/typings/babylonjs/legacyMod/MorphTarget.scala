package typings.babylonjs.legacyMod

import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "MorphTarget")
@js.native
class MorphTarget protected ()
  extends typings.babylonjs.indexMod.MorphTarget {
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
    influence: js.UndefOr[scala.Nothing],
    scene: Nullable[typings.babylonjs.sceneMod.Scene]
  ) = this()
  def this(
    /** defines the name of the target */
  name: String,
    influence: Double,
    scene: Nullable[typings.babylonjs.sceneMod.Scene]
  ) = this()
}
/* static members */
@JSImport("babylonjs/Legacy/legacy", "MorphTarget")
@js.native
object MorphTarget extends js.Object {
  
  /**
    * Creates a MorphTarget from mesh data
    * @param mesh defines the source mesh
    * @param name defines the name to use for the new target
    * @param influence defines the influence to attach to the target
    * @returns a new MorphTarget
    */
  def FromMesh(mesh: typings.babylonjs.abstractMeshMod.AbstractMesh): typings.babylonjs.morphTargetMod.MorphTarget = js.native
  def FromMesh(
    mesh: typings.babylonjs.abstractMeshMod.AbstractMesh,
    name: js.UndefOr[scala.Nothing],
    influence: Double
  ): typings.babylonjs.morphTargetMod.MorphTarget = js.native
  def FromMesh(mesh: typings.babylonjs.abstractMeshMod.AbstractMesh, name: String): typings.babylonjs.morphTargetMod.MorphTarget = js.native
  def FromMesh(mesh: typings.babylonjs.abstractMeshMod.AbstractMesh, name: String, influence: Double): typings.babylonjs.morphTargetMod.MorphTarget = js.native
  
  /**
    * Creates a new target from serialized data
    * @param serializationObject defines the serialized data to use
    * @returns a new MorphTarget
    */
  def Parse(serializationObject: js.Any): typings.babylonjs.morphTargetMod.MorphTarget = js.native
}
