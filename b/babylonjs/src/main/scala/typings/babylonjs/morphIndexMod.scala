package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object morphIndexMod {
  
  @JSImport("babylonjs/Morph/index", "MorphTarget")
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
    def this(
      /** defines the name of the target */
    name: String,
      influence: js.UndefOr[scala.Nothing],
      scene: Nullable[Scene]
    ) = this()
    def this(/** defines the name of the target */
    name: String, influence: Double, scene: Nullable[Scene]) = this()
  }
  /* static members */
  object MorphTarget {
    
    /**
      * Creates a MorphTarget from mesh data
      * @param mesh defines the source mesh
      * @param name defines the name to use for the new target
      * @param influence defines the influence to attach to the target
      * @returns a new MorphTarget
      */
    @JSImport("babylonjs/Morph/index", "MorphTarget.FromMesh")
    @js.native
    def FromMesh(mesh: AbstractMesh): typings.babylonjs.morphTargetMod.MorphTarget = js.native
    @JSImport("babylonjs/Morph/index", "MorphTarget.FromMesh")
    @js.native
    def FromMesh(mesh: AbstractMesh, name: js.UndefOr[scala.Nothing], influence: Double): typings.babylonjs.morphTargetMod.MorphTarget = js.native
    @JSImport("babylonjs/Morph/index", "MorphTarget.FromMesh")
    @js.native
    def FromMesh(mesh: AbstractMesh, name: String): typings.babylonjs.morphTargetMod.MorphTarget = js.native
    @JSImport("babylonjs/Morph/index", "MorphTarget.FromMesh")
    @js.native
    def FromMesh(mesh: AbstractMesh, name: String, influence: Double): typings.babylonjs.morphTargetMod.MorphTarget = js.native
    
    /**
      * Creates a new target from serialized data
      * @param serializationObject defines the serialized data to use
      * @returns a new MorphTarget
      */
    @JSImport("babylonjs/Morph/index", "MorphTarget.Parse")
    @js.native
    def Parse(serializationObject: js.Any): typings.babylonjs.morphTargetMod.MorphTarget = js.native
  }
  
  @JSImport("babylonjs/Morph/index", "MorphTargetManager")
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
  object MorphTargetManager {
    
    /**
      * Creates a new MorphTargetManager from serialized data
      * @param serializationObject defines the serialized data
      * @param scene defines the hosting scene
      * @returns the new MorphTargetManager
      */
    @JSImport("babylonjs/Morph/index", "MorphTargetManager.Parse")
    @js.native
    def Parse(serializationObject: js.Any, scene: Scene): typings.babylonjs.morphTargetManagerMod.MorphTargetManager = js.native
  }
}
