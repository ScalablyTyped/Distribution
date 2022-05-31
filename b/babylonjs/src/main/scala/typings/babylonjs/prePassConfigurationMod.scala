package typings.babylonjs

import org.scalablytyped.runtime.NumberDictionary
import typings.babylonjs.effectMod.Effect
import typings.babylonjs.mathVectorMod.Matrix
import typings.babylonjs.meshMod.Mesh
import typings.babylonjs.sceneMod.Scene
import typings.std.Float32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object prePassConfigurationMod {
  
  @JSImport("babylonjs/Materials/prePassConfiguration", "PrePassConfiguration")
  @js.native
  class PrePassConfiguration () extends StObject {
    
    /**
      * Binds the material data.
      * @param effect defines the effect to update
      * @param scene defines the scene the material belongs to.
      * @param mesh The mesh
      * @param world World matrix of this mesh
      * @param isFrozen Is the material frozen
      */
    def bindForSubMesh(effect: Effect, scene: Scene, mesh: Mesh, world: Matrix, isFrozen: Boolean): Unit = js.native
    
    /**
      * Previous bones of meshes carrying this material
      * Used for computing velocity
      */
    var previousBones: NumberDictionary[Float32Array] = js.native
    
    /**
      * Previous view project matrix
      * Used for computing velocity
      */
    var previousViewProjection: Matrix = js.native
    
    /**
      * Previous world matrices of meshes carrying this material
      * Used for computing velocity
      */
    var previousWorldMatrices: NumberDictionary[Matrix] = js.native
  }
  /* static members */
  object PrePassConfiguration {
    
    @JSImport("babylonjs/Materials/prePassConfiguration", "PrePassConfiguration")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Add the required samplers to the current list.
      * @param samplers defines the current sampler list.
      */
    inline def AddSamplers(samplers: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("AddSamplers")(samplers.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Add the required uniforms to the current list.
      * @param uniforms defines the current uniform list.
      */
    inline def AddUniforms(uniforms: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("AddUniforms")(uniforms.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
}
