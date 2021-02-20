package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.iparticlesystemMod.IParticleSystem
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.particleSystemSetMod.ParticleSystemSet
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object particleHelperMod {
  
  @JSImport("babylonjs/Particles/particleHelper", "ParticleHelper")
  @js.native
  class ParticleHelper () extends StObject
  /* static members */
  object ParticleHelper {
    
    @JSImport("babylonjs/Particles/particleHelper", "ParticleHelper")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets or sets base Assets URL
      */
    @JSImport("babylonjs/Particles/particleHelper", "ParticleHelper.BaseAssetsUrl")
    @js.native
    def BaseAssetsUrl: String = js.native
    @scala.inline
    def BaseAssetsUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BaseAssetsUrl")(x.asInstanceOf[js.Any])
    
    /**
      * This is the main static method (one-liner) of this helper to create different particle systems
      * @param type This string represents the type to the particle system to create
      * @param scene The scene where the particle system should live
      * @param gpu If the system will use gpu
      * @returns the ParticleSystemSet created
      */
    @JSImport("babylonjs/Particles/particleHelper", "ParticleHelper.CreateAsync")
    @js.native
    def CreateAsync(`type`: String, scene: Nullable[Scene]): js.Promise[ParticleSystemSet] = js.native
    @JSImport("babylonjs/Particles/particleHelper", "ParticleHelper.CreateAsync")
    @js.native
    def CreateAsync(`type`: String, scene: Nullable[Scene], gpu: Boolean): js.Promise[ParticleSystemSet] = js.native
    
    /**
      * Create a default particle system that you can tweak
      * @param emitter defines the emitter to use
      * @param capacity defines the system capacity (default is 500 particles)
      * @param scene defines the hosting scene
      * @param useGPU defines if a GPUParticleSystem must be created (default is false)
      * @returns the new Particle system
      */
    @JSImport("babylonjs/Particles/particleHelper", "ParticleHelper.CreateDefault")
    @js.native
    def CreateDefault(emitter: Nullable[AbstractMesh | Vector3]): IParticleSystem = js.native
    @JSImport("babylonjs/Particles/particleHelper", "ParticleHelper.CreateDefault")
    @js.native
    def CreateDefault(
      emitter: Nullable[AbstractMesh | Vector3],
      capacity: js.UndefOr[scala.Nothing],
      scene: js.UndefOr[scala.Nothing],
      useGPU: Boolean
    ): IParticleSystem = js.native
    @JSImport("babylonjs/Particles/particleHelper", "ParticleHelper.CreateDefault")
    @js.native
    def CreateDefault(emitter: Nullable[AbstractMesh | Vector3], capacity: js.UndefOr[scala.Nothing], scene: Scene): IParticleSystem = js.native
    @JSImport("babylonjs/Particles/particleHelper", "ParticleHelper.CreateDefault")
    @js.native
    def CreateDefault(
      emitter: Nullable[AbstractMesh | Vector3],
      capacity: js.UndefOr[scala.Nothing],
      scene: Scene,
      useGPU: Boolean
    ): IParticleSystem = js.native
    @JSImport("babylonjs/Particles/particleHelper", "ParticleHelper.CreateDefault")
    @js.native
    def CreateDefault(emitter: Nullable[AbstractMesh | Vector3], capacity: Double): IParticleSystem = js.native
    @JSImport("babylonjs/Particles/particleHelper", "ParticleHelper.CreateDefault")
    @js.native
    def CreateDefault(
      emitter: Nullable[AbstractMesh | Vector3],
      capacity: Double,
      scene: js.UndefOr[scala.Nothing],
      useGPU: Boolean
    ): IParticleSystem = js.native
    @JSImport("babylonjs/Particles/particleHelper", "ParticleHelper.CreateDefault")
    @js.native
    def CreateDefault(emitter: Nullable[AbstractMesh | Vector3], capacity: Double, scene: Scene): IParticleSystem = js.native
    @JSImport("babylonjs/Particles/particleHelper", "ParticleHelper.CreateDefault")
    @js.native
    def CreateDefault(emitter: Nullable[AbstractMesh | Vector3], capacity: Double, scene: Scene, useGPU: Boolean): IParticleSystem = js.native
    
    /**
      * Creates a particle system from a snippet saved by the particle system editor
      * @param snippetId defines the snippet to load (can be set to _BLANK to create a default one)
      * @param scene defines the hosting scene
      * @param gpu If the system will use gpu
      * @param rootUrl defines the root URL to use to load textures and relative dependencies
      * @returns a promise that will resolve to the new particle system
      */
    @JSImport("babylonjs/Particles/particleHelper", "ParticleHelper.CreateFromSnippetAsync")
    @js.native
    def CreateFromSnippetAsync(snippetId: String, scene: Scene): js.Promise[IParticleSystem] = js.native
    @JSImport("babylonjs/Particles/particleHelper", "ParticleHelper.CreateFromSnippetAsync")
    @js.native
    def CreateFromSnippetAsync(snippetId: String, scene: Scene, gpu: js.UndefOr[scala.Nothing], rootUrl: String): js.Promise[IParticleSystem] = js.native
    @JSImport("babylonjs/Particles/particleHelper", "ParticleHelper.CreateFromSnippetAsync")
    @js.native
    def CreateFromSnippetAsync(snippetId: String, scene: Scene, gpu: Boolean): js.Promise[IParticleSystem] = js.native
    @JSImport("babylonjs/Particles/particleHelper", "ParticleHelper.CreateFromSnippetAsync")
    @js.native
    def CreateFromSnippetAsync(snippetId: String, scene: Scene, gpu: Boolean, rootUrl: String): js.Promise[IParticleSystem] = js.native
    
    /**
      * Static function used to export a particle system to a ParticleSystemSet variable.
      * Please note that the emitter shape is not exported
      * @param systems defines the particle systems to export
      * @returns the created particle system set
      */
    @JSImport("babylonjs/Particles/particleHelper", "ParticleHelper.ExportSet")
    @js.native
    def ExportSet(systems: js.Array[IParticleSystem]): ParticleSystemSet = js.native
    
    /**
      * Creates a particle system from a snippet saved in a remote file
      * @param name defines the name of the particle system to create (can be null or empty to use the one from the json data)
      * @param url defines the url to load from
      * @param scene defines the hosting scene
      * @param gpu If the system will use gpu
      * @param rootUrl defines the root URL to use to load textures and relative dependencies
      * @returns a promise that will resolve to the new particle system
      */
    @JSImport("babylonjs/Particles/particleHelper", "ParticleHelper.ParseFromFileAsync")
    @js.native
    def ParseFromFileAsync(name: Nullable[String], url: String, scene: Scene): js.Promise[IParticleSystem] = js.native
    @JSImport("babylonjs/Particles/particleHelper", "ParticleHelper.ParseFromFileAsync")
    @js.native
    def ParseFromFileAsync(name: Nullable[String], url: String, scene: Scene, gpu: js.UndefOr[scala.Nothing], rootUrl: String): js.Promise[IParticleSystem] = js.native
    @JSImport("babylonjs/Particles/particleHelper", "ParticleHelper.ParseFromFileAsync")
    @js.native
    def ParseFromFileAsync(name: Nullable[String], url: String, scene: Scene, gpu: Boolean): js.Promise[IParticleSystem] = js.native
    @JSImport("babylonjs/Particles/particleHelper", "ParticleHelper.ParseFromFileAsync")
    @js.native
    def ParseFromFileAsync(name: Nullable[String], url: String, scene: Scene, gpu: Boolean, rootUrl: String): js.Promise[IParticleSystem] = js.native
    
    /** Define the Url to load snippets */
    @JSImport("babylonjs/Particles/particleHelper", "ParticleHelper.SnippetUrl")
    @js.native
    def SnippetUrl: String = js.native
    @scala.inline
    def SnippetUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SnippetUrl")(x.asInstanceOf[js.Any])
  }
}
