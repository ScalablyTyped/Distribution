package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Morph/index", JSImport.Namespace)
@js.native
object morphIndexMod extends js.Object {
  @js.native
  class MorphTarget protected ()
    extends typings.babylonjs.morphTargetMod.MorphTarget {
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
    def this(/** defines the name of the target */
    name: String, influence: Double, scene: Nullable[Scene]) = this()
  }
  
  @js.native
  /**
    * Creates a new MorphTargetManager
    * @param scene defines the current scene
    */
  class MorphTargetManager ()
    extends typings.babylonjs.morphTargetManagerMod.MorphTargetManager {
    def this(scene: Nullable[Scene]) = this()
  }
  
  /* static members */
  @js.native
  object MorphTarget extends js.Object {
    /**
      * Creates a MorphTarget from mesh data
      * @param mesh defines the source mesh
      * @param name defines the name to use for the new target
      * @param influence defines the influence to attach to the target
      * @returns a new MorphTarget
      */
    def FromMesh(mesh: AbstractMesh): typings.babylonjs.morphTargetMod.MorphTarget = js.native
    def FromMesh(mesh: AbstractMesh, name: String): typings.babylonjs.morphTargetMod.MorphTarget = js.native
    def FromMesh(mesh: AbstractMesh, name: String, influence: Double): typings.babylonjs.morphTargetMod.MorphTarget = js.native
    /**
      * Creates a new target from serialized data
      * @param serializationObject defines the serialized data to use
      * @returns a new MorphTarget
      */
    def Parse(serializationObject: js.Any): typings.babylonjs.morphTargetMod.MorphTarget = js.native
  }
  
  /* static members */
  @js.native
  object MorphTargetManager extends js.Object {
    /**
      * Creates a new MorphTargetManager from serialized data
      * @param serializationObject defines the serialized data
      * @param scene defines the hosting scene
      * @returns the new MorphTargetManager
      */
    def Parse(serializationObject: js.Any, scene: Scene): typings.babylonjs.morphTargetManagerMod.MorphTargetManager = js.native
  }
  
}

