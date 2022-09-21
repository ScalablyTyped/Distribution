package typings.babylonjs.mod

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs", "MorphTarget")
@js.native
open class MorphTarget protected ()
  extends typings.babylonjs.legacyMod.MorphTarget {
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
    scene: Nullable[typings.babylonjs.sceneMod.Scene]
  ) = this()
  def this(
    /** defines the name of the target */
  name: String,
    influence: Unit,
    scene: Nullable[typings.babylonjs.sceneMod.Scene]
  ) = this()
}
/* static members */
object MorphTarget {
  
  @JSImport("babylonjs", "MorphTarget")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a MorphTarget from mesh data
    * @param mesh defines the source mesh
    * @param name defines the name to use for the new target
    * @param influence defines the influence to attach to the target
    * @returns a new MorphTarget
    */
  inline def FromMesh(mesh: typings.babylonjs.abstractMeshMod.AbstractMesh): typings.babylonjs.morphTargetMod.MorphTarget = ^.asInstanceOf[js.Dynamic].applyDynamic("FromMesh")(mesh.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.morphTargetMod.MorphTarget]
  inline def FromMesh(mesh: typings.babylonjs.abstractMeshMod.AbstractMesh, name: String): typings.babylonjs.morphTargetMod.MorphTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("FromMesh")(mesh.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.morphTargetMod.MorphTarget]
  inline def FromMesh(mesh: typings.babylonjs.abstractMeshMod.AbstractMesh, name: String, influence: Double): typings.babylonjs.morphTargetMod.MorphTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("FromMesh")(mesh.asInstanceOf[js.Any], name.asInstanceOf[js.Any], influence.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.morphTargetMod.MorphTarget]
  inline def FromMesh(mesh: typings.babylonjs.abstractMeshMod.AbstractMesh, name: Unit, influence: Double): typings.babylonjs.morphTargetMod.MorphTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("FromMesh")(mesh.asInstanceOf[js.Any], name.asInstanceOf[js.Any], influence.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.morphTargetMod.MorphTarget]
  
  /**
    * Creates a new target from serialized data
    * @param serializationObject defines the serialized data to use
    * @param scene defines the hosting scene
    * @returns a new MorphTarget
    */
  inline def Parse(serializationObject: Any): typings.babylonjs.morphTargetMod.MorphTarget = ^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(serializationObject.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.morphTargetMod.MorphTarget]
  inline def Parse(serializationObject: Any, scene: typings.babylonjs.sceneMod.Scene): typings.babylonjs.morphTargetMod.MorphTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(serializationObject.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.morphTargetMod.MorphTarget]
}
