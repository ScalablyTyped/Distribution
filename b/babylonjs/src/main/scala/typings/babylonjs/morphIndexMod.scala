package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    def this(/** defines the name of the target */
    name: String, influence: Double, scene: Nullable[Scene]) = this()
    def this(/** defines the name of the target */
    name: String, influence: Unit, scene: Nullable[Scene]) = this()
  }
  /* static members */
  object MorphTarget {
    
    @JSImport("babylonjs/Morph/index", "MorphTarget")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a MorphTarget from mesh data
      * @param mesh defines the source mesh
      * @param name defines the name to use for the new target
      * @param influence defines the influence to attach to the target
      * @returns a new MorphTarget
      */
    inline def FromMesh(mesh: AbstractMesh): typings.babylonjs.morphTargetMod.MorphTarget = ^.asInstanceOf[js.Dynamic].applyDynamic("FromMesh")(mesh.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.morphTargetMod.MorphTarget]
    inline def FromMesh(mesh: AbstractMesh, name: String): typings.babylonjs.morphTargetMod.MorphTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("FromMesh")(mesh.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.morphTargetMod.MorphTarget]
    inline def FromMesh(mesh: AbstractMesh, name: String, influence: Double): typings.babylonjs.morphTargetMod.MorphTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("FromMesh")(mesh.asInstanceOf[js.Any], name.asInstanceOf[js.Any], influence.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.morphTargetMod.MorphTarget]
    inline def FromMesh(mesh: AbstractMesh, name: Unit, influence: Double): typings.babylonjs.morphTargetMod.MorphTarget = (^.asInstanceOf[js.Dynamic].applyDynamic("FromMesh")(mesh.asInstanceOf[js.Any], name.asInstanceOf[js.Any], influence.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.morphTargetMod.MorphTarget]
    
    /**
      * Creates a new target from serialized data
      * @param serializationObject defines the serialized data to use
      * @returns a new MorphTarget
      */
    inline def Parse(serializationObject: js.Any): typings.babylonjs.morphTargetMod.MorphTarget = ^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(serializationObject.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.morphTargetMod.MorphTarget]
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
    
    @JSImport("babylonjs/Morph/index", "MorphTargetManager")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new MorphTargetManager from serialized data
      * @param serializationObject defines the serialized data
      * @param scene defines the hosting scene
      * @returns the new MorphTargetManager
      */
    inline def Parse(serializationObject: js.Any, scene: Scene): typings.babylonjs.morphTargetManagerMod.MorphTargetManager = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(serializationObject.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.morphTargetManagerMod.MorphTargetManager]
  }
}
