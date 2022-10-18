package typings.babylonjs.legacyLegacyMod

import typings.babylonjs.particlesIparticlesystemMod.IParticleSystem
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Legacy/legacy", "ParticleHelper")
@js.native
open class ParticleHelper ()
  extends typings.babylonjs.indexMod.ParticleHelper
/* static members */
object ParticleHelper {
  
  @JSImport("babylonjs/Legacy/legacy", "ParticleHelper")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets or sets base Assets URL
    */
  @JSImport("babylonjs/Legacy/legacy", "ParticleHelper.BaseAssetsUrl")
  @js.native
  def BaseAssetsUrl: String = js.native
  inline def BaseAssetsUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BaseAssetsUrl")(x.asInstanceOf[js.Any])
  
  /**
    * This is the main static method (one-liner) of this helper to create different particle systems
    * @param type This string represents the type to the particle system to create
    * @param scene The scene where the particle system should live
    * @param gpu If the system will use gpu
    * @param capacity defines the system capacity (if null or undefined the sotred capacity will be used)
    * @returns the ParticleSystemSet created
    */
  inline def CreateAsync(`type`: String, scene: Nullable[typings.babylonjs.sceneMod.Scene]): js.Promise[typings.babylonjs.particlesParticleSystemSetMod.ParticleSystemSet] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAsync")(`type`.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.particlesParticleSystemSetMod.ParticleSystemSet]]
  inline def CreateAsync(`type`: String, scene: Nullable[typings.babylonjs.sceneMod.Scene], gpu: Boolean): js.Promise[typings.babylonjs.particlesParticleSystemSetMod.ParticleSystemSet] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAsync")(`type`.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], gpu.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.particlesParticleSystemSetMod.ParticleSystemSet]]
  inline def CreateAsync(`type`: String, scene: Nullable[typings.babylonjs.sceneMod.Scene], gpu: Boolean, capacity: Double): js.Promise[typings.babylonjs.particlesParticleSystemSetMod.ParticleSystemSet] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAsync")(`type`.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], gpu.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.particlesParticleSystemSetMod.ParticleSystemSet]]
  inline def CreateAsync(`type`: String, scene: Nullable[typings.babylonjs.sceneMod.Scene], gpu: Unit, capacity: Double): js.Promise[typings.babylonjs.particlesParticleSystemSetMod.ParticleSystemSet] = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateAsync")(`type`.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], gpu.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.babylonjs.particlesParticleSystemSetMod.ParticleSystemSet]]
  
  /**
    * Create a default particle system that you can tweak
    * @param emitter defines the emitter to use
    * @param capacity defines the system capacity (default is 500 particles)
    * @param scene defines the hosting scene
    * @param useGPU defines if a GPUParticleSystem must be created (default is false)
    * @returns the new Particle system
    */
  inline def CreateDefault(
    emitter: Nullable[
      typings.babylonjs.meshesAbstractMeshMod.AbstractMesh | typings.babylonjs.mathsMathDotvectorMod.Vector3
    ]
  ): IParticleSystem = ^.asInstanceOf[js.Dynamic].applyDynamic("CreateDefault")(emitter.asInstanceOf[js.Any]).asInstanceOf[IParticleSystem]
  inline def CreateDefault(
    emitter: Nullable[
      typings.babylonjs.meshesAbstractMeshMod.AbstractMesh | typings.babylonjs.mathsMathDotvectorMod.Vector3
    ],
    capacity: Double
  ): IParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDefault")(emitter.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[IParticleSystem]
  inline def CreateDefault(
    emitter: Nullable[
      typings.babylonjs.meshesAbstractMeshMod.AbstractMesh | typings.babylonjs.mathsMathDotvectorMod.Vector3
    ],
    capacity: Double,
    scene: Unit,
    useGPU: Boolean
  ): IParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDefault")(emitter.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], useGPU.asInstanceOf[js.Any])).asInstanceOf[IParticleSystem]
  inline def CreateDefault(
    emitter: Nullable[
      typings.babylonjs.meshesAbstractMeshMod.AbstractMesh | typings.babylonjs.mathsMathDotvectorMod.Vector3
    ],
    capacity: Double,
    scene: typings.babylonjs.sceneMod.Scene
  ): IParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDefault")(emitter.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[IParticleSystem]
  inline def CreateDefault(
    emitter: Nullable[
      typings.babylonjs.meshesAbstractMeshMod.AbstractMesh | typings.babylonjs.mathsMathDotvectorMod.Vector3
    ],
    capacity: Double,
    scene: typings.babylonjs.sceneMod.Scene,
    useGPU: Boolean
  ): IParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDefault")(emitter.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], useGPU.asInstanceOf[js.Any])).asInstanceOf[IParticleSystem]
  inline def CreateDefault(
    emitter: Nullable[
      typings.babylonjs.meshesAbstractMeshMod.AbstractMesh | typings.babylonjs.mathsMathDotvectorMod.Vector3
    ],
    capacity: Unit,
    scene: Unit,
    useGPU: Boolean
  ): IParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDefault")(emitter.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], useGPU.asInstanceOf[js.Any])).asInstanceOf[IParticleSystem]
  inline def CreateDefault(
    emitter: Nullable[
      typings.babylonjs.meshesAbstractMeshMod.AbstractMesh | typings.babylonjs.mathsMathDotvectorMod.Vector3
    ],
    capacity: Unit,
    scene: typings.babylonjs.sceneMod.Scene
  ): IParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDefault")(emitter.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[IParticleSystem]
  inline def CreateDefault(
    emitter: Nullable[
      typings.babylonjs.meshesAbstractMeshMod.AbstractMesh | typings.babylonjs.mathsMathDotvectorMod.Vector3
    ],
    capacity: Unit,
    scene: typings.babylonjs.sceneMod.Scene,
    useGPU: Boolean
  ): IParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("CreateDefault")(emitter.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], useGPU.asInstanceOf[js.Any])).asInstanceOf[IParticleSystem]
  
  /**
    * Creates a particle system from a snippet saved by the particle system editor
    * @deprecated Please use ParseFromSnippetAsync instead
    * @param snippetId defines the snippet to load (can be set to _BLANK to create a default one)
    * @param scene defines the hosting scene
    * @param gpu If the system will use gpu
    * @param rootUrl defines the root URL to use to load textures and relative dependencies
    * @param capacity defines the system capacity (if null or undefined the sotred capacity will be used)
    * @returns a promise that will resolve to the new particle system
    */
  @JSImport("babylonjs/Legacy/legacy", "ParticleHelper.CreateFromSnippetAsync")
  @js.native
  def CreateFromSnippetAsync: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ParticleHelper.ParseFromSnippetAsync */ Any = js.native
  inline def CreateFromSnippetAsync_=(
    x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ParticleHelper.ParseFromSnippetAsync */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CreateFromSnippetAsync")(x.asInstanceOf[js.Any])
  
  /**
    * Static function used to export a particle system to a ParticleSystemSet variable.
    * Please note that the emitter shape is not exported
    * @param systems defines the particle systems to export
    * @returns the created particle system set
    */
  inline def ExportSet(systems: js.Array[IParticleSystem]): typings.babylonjs.particlesParticleSystemSetMod.ParticleSystemSet = ^.asInstanceOf[js.Dynamic].applyDynamic("ExportSet")(systems.asInstanceOf[js.Any]).asInstanceOf[typings.babylonjs.particlesParticleSystemSetMod.ParticleSystemSet]
  
  /**
    * Creates a particle system from a snippet saved in a remote file
    * @param name defines the name of the particle system to create (can be null or empty to use the one from the json data)
    * @param url defines the url to load from
    * @param scene defines the hosting scene
    * @param gpu If the system will use gpu
    * @param rootUrl defines the root URL to use to load textures and relative dependencies
    * @param capacity defines the system capacity (if null or undefined the sotred capacity will be used)
    * @returns a promise that will resolve to the new particle system
    */
  inline def ParseFromFileAsync(name: Nullable[String], url: String, scene: typings.babylonjs.sceneMod.Scene): js.Promise[IParticleSystem] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromFileAsync")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IParticleSystem]]
  inline def ParseFromFileAsync(name: Nullable[String], url: String, scene: typings.babylonjs.sceneMod.Scene, gpu: Boolean): js.Promise[IParticleSystem] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromFileAsync")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], gpu.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IParticleSystem]]
  inline def ParseFromFileAsync(
    name: Nullable[String],
    url: String,
    scene: typings.babylonjs.sceneMod.Scene,
    gpu: Boolean,
    rootUrl: String
  ): js.Promise[IParticleSystem] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromFileAsync")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], gpu.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IParticleSystem]]
  inline def ParseFromFileAsync(
    name: Nullable[String],
    url: String,
    scene: typings.babylonjs.sceneMod.Scene,
    gpu: Boolean,
    rootUrl: String,
    capacity: Double
  ): js.Promise[IParticleSystem] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromFileAsync")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], gpu.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IParticleSystem]]
  inline def ParseFromFileAsync(
    name: Nullable[String],
    url: String,
    scene: typings.babylonjs.sceneMod.Scene,
    gpu: Boolean,
    rootUrl: Unit,
    capacity: Double
  ): js.Promise[IParticleSystem] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromFileAsync")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], gpu.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IParticleSystem]]
  inline def ParseFromFileAsync(
    name: Nullable[String],
    url: String,
    scene: typings.babylonjs.sceneMod.Scene,
    gpu: Unit,
    rootUrl: String
  ): js.Promise[IParticleSystem] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromFileAsync")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], gpu.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IParticleSystem]]
  inline def ParseFromFileAsync(
    name: Nullable[String],
    url: String,
    scene: typings.babylonjs.sceneMod.Scene,
    gpu: Unit,
    rootUrl: String,
    capacity: Double
  ): js.Promise[IParticleSystem] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromFileAsync")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], gpu.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IParticleSystem]]
  inline def ParseFromFileAsync(
    name: Nullable[String],
    url: String,
    scene: typings.babylonjs.sceneMod.Scene,
    gpu: Unit,
    rootUrl: Unit,
    capacity: Double
  ): js.Promise[IParticleSystem] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromFileAsync")(name.asInstanceOf[js.Any], url.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], gpu.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IParticleSystem]]
  
  /**
    * Creates a particle system from a snippet saved by the particle system editor
    * @param snippetId defines the snippet to load (can be set to _BLANK to create a default one)
    * @param scene defines the hosting scene
    * @param gpu If the system will use gpu
    * @param rootUrl defines the root URL to use to load textures and relative dependencies
    * @param capacity defines the system capacity (if null or undefined the sotred capacity will be used)
    * @returns a promise that will resolve to the new particle system
    */
  inline def ParseFromSnippetAsync(snippetId: String, scene: typings.babylonjs.sceneMod.Scene): js.Promise[IParticleSystem] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromSnippetAsync")(snippetId.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IParticleSystem]]
  inline def ParseFromSnippetAsync(snippetId: String, scene: typings.babylonjs.sceneMod.Scene, gpu: Boolean): js.Promise[IParticleSystem] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromSnippetAsync")(snippetId.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], gpu.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IParticleSystem]]
  inline def ParseFromSnippetAsync(snippetId: String, scene: typings.babylonjs.sceneMod.Scene, gpu: Boolean, rootUrl: String): js.Promise[IParticleSystem] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromSnippetAsync")(snippetId.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], gpu.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IParticleSystem]]
  inline def ParseFromSnippetAsync(
    snippetId: String,
    scene: typings.babylonjs.sceneMod.Scene,
    gpu: Boolean,
    rootUrl: String,
    capacity: Double
  ): js.Promise[IParticleSystem] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromSnippetAsync")(snippetId.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], gpu.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IParticleSystem]]
  inline def ParseFromSnippetAsync(
    snippetId: String,
    scene: typings.babylonjs.sceneMod.Scene,
    gpu: Boolean,
    rootUrl: Unit,
    capacity: Double
  ): js.Promise[IParticleSystem] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromSnippetAsync")(snippetId.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], gpu.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IParticleSystem]]
  inline def ParseFromSnippetAsync(snippetId: String, scene: typings.babylonjs.sceneMod.Scene, gpu: Unit, rootUrl: String): js.Promise[IParticleSystem] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromSnippetAsync")(snippetId.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], gpu.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IParticleSystem]]
  inline def ParseFromSnippetAsync(
    snippetId: String,
    scene: typings.babylonjs.sceneMod.Scene,
    gpu: Unit,
    rootUrl: String,
    capacity: Double
  ): js.Promise[IParticleSystem] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromSnippetAsync")(snippetId.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], gpu.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IParticleSystem]]
  inline def ParseFromSnippetAsync(
    snippetId: String,
    scene: typings.babylonjs.sceneMod.Scene,
    gpu: Unit,
    rootUrl: Unit,
    capacity: Double
  ): js.Promise[IParticleSystem] = (^.asInstanceOf[js.Dynamic].applyDynamic("ParseFromSnippetAsync")(snippetId.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], gpu.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IParticleSystem]]
  
  /** Define the Url to load snippets */
  @JSImport("babylonjs/Legacy/legacy", "ParticleHelper.SnippetUrl")
  @js.native
  def SnippetUrl: String = js.native
  inline def SnippetUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SnippetUrl")(x.asInstanceOf[js.Any])
}
