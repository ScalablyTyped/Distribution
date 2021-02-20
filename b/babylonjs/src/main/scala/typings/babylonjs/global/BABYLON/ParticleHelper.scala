package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IParticleSystem
import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.ParticleHelper")
@js.native
class ParticleHelper ()
  extends typings.babylonjs.BABYLON.ParticleHelper
/* static members */
object ParticleHelper {
  
  @JSGlobal("BABYLON.ParticleHelper")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Gets or sets base Assets URL
    */
  @JSGlobal("BABYLON.ParticleHelper.BaseAssetsUrl")
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
  @JSGlobal("BABYLON.ParticleHelper.CreateAsync")
  @js.native
  def CreateAsync(`type`: String, scene: Nullable[typings.babylonjs.BABYLON.Scene]): js.Promise[typings.babylonjs.BABYLON.ParticleSystemSet] = js.native
  @JSGlobal("BABYLON.ParticleHelper.CreateAsync")
  @js.native
  def CreateAsync(`type`: String, scene: Nullable[typings.babylonjs.BABYLON.Scene], gpu: Boolean): js.Promise[typings.babylonjs.BABYLON.ParticleSystemSet] = js.native
  
  /**
    * Create a default particle system that you can tweak
    * @param emitter defines the emitter to use
    * @param capacity defines the system capacity (default is 500 particles)
    * @param scene defines the hosting scene
    * @param useGPU defines if a GPUParticleSystem must be created (default is false)
    * @returns the new Particle system
    */
  @JSGlobal("BABYLON.ParticleHelper.CreateDefault")
  @js.native
  def CreateDefault(emitter: Nullable[typings.babylonjs.BABYLON.AbstractMesh | typings.babylonjs.BABYLON.Vector3]): IParticleSystem = js.native
  @JSGlobal("BABYLON.ParticleHelper.CreateDefault")
  @js.native
  def CreateDefault(
    emitter: Nullable[typings.babylonjs.BABYLON.AbstractMesh | typings.babylonjs.BABYLON.Vector3],
    capacity: js.UndefOr[scala.Nothing],
    scene: js.UndefOr[scala.Nothing],
    useGPU: Boolean
  ): IParticleSystem = js.native
  @JSGlobal("BABYLON.ParticleHelper.CreateDefault")
  @js.native
  def CreateDefault(
    emitter: Nullable[typings.babylonjs.BABYLON.AbstractMesh | typings.babylonjs.BABYLON.Vector3],
    capacity: js.UndefOr[scala.Nothing],
    scene: typings.babylonjs.BABYLON.Scene
  ): IParticleSystem = js.native
  @JSGlobal("BABYLON.ParticleHelper.CreateDefault")
  @js.native
  def CreateDefault(
    emitter: Nullable[typings.babylonjs.BABYLON.AbstractMesh | typings.babylonjs.BABYLON.Vector3],
    capacity: js.UndefOr[scala.Nothing],
    scene: typings.babylonjs.BABYLON.Scene,
    useGPU: Boolean
  ): IParticleSystem = js.native
  @JSGlobal("BABYLON.ParticleHelper.CreateDefault")
  @js.native
  def CreateDefault(
    emitter: Nullable[typings.babylonjs.BABYLON.AbstractMesh | typings.babylonjs.BABYLON.Vector3],
    capacity: Double
  ): IParticleSystem = js.native
  @JSGlobal("BABYLON.ParticleHelper.CreateDefault")
  @js.native
  def CreateDefault(
    emitter: Nullable[typings.babylonjs.BABYLON.AbstractMesh | typings.babylonjs.BABYLON.Vector3],
    capacity: Double,
    scene: js.UndefOr[scala.Nothing],
    useGPU: Boolean
  ): IParticleSystem = js.native
  @JSGlobal("BABYLON.ParticleHelper.CreateDefault")
  @js.native
  def CreateDefault(
    emitter: Nullable[typings.babylonjs.BABYLON.AbstractMesh | typings.babylonjs.BABYLON.Vector3],
    capacity: Double,
    scene: typings.babylonjs.BABYLON.Scene
  ): IParticleSystem = js.native
  @JSGlobal("BABYLON.ParticleHelper.CreateDefault")
  @js.native
  def CreateDefault(
    emitter: Nullable[typings.babylonjs.BABYLON.AbstractMesh | typings.babylonjs.BABYLON.Vector3],
    capacity: Double,
    scene: typings.babylonjs.BABYLON.Scene,
    useGPU: Boolean
  ): IParticleSystem = js.native
  
  /**
    * Creates a particle system from a snippet saved by the particle system editor
    * @param snippetId defines the snippet to load (can be set to _BLANK to create a default one)
    * @param scene defines the hosting scene
    * @param gpu If the system will use gpu
    * @param rootUrl defines the root URL to use to load textures and relative dependencies
    * @returns a promise that will resolve to the new particle system
    */
  @JSGlobal("BABYLON.ParticleHelper.CreateFromSnippetAsync")
  @js.native
  def CreateFromSnippetAsync(snippetId: String, scene: typings.babylonjs.BABYLON.Scene): js.Promise[IParticleSystem] = js.native
  @JSGlobal("BABYLON.ParticleHelper.CreateFromSnippetAsync")
  @js.native
  def CreateFromSnippetAsync(
    snippetId: String,
    scene: typings.babylonjs.BABYLON.Scene,
    gpu: js.UndefOr[scala.Nothing],
    rootUrl: String
  ): js.Promise[IParticleSystem] = js.native
  @JSGlobal("BABYLON.ParticleHelper.CreateFromSnippetAsync")
  @js.native
  def CreateFromSnippetAsync(snippetId: String, scene: typings.babylonjs.BABYLON.Scene, gpu: Boolean): js.Promise[IParticleSystem] = js.native
  @JSGlobal("BABYLON.ParticleHelper.CreateFromSnippetAsync")
  @js.native
  def CreateFromSnippetAsync(snippetId: String, scene: typings.babylonjs.BABYLON.Scene, gpu: Boolean, rootUrl: String): js.Promise[IParticleSystem] = js.native
  
  /**
    * Static function used to export a particle system to a ParticleSystemSet variable.
    * Please note that the emitter shape is not exported
    * @param systems defines the particle systems to export
    * @returns the created particle system set
    */
  @JSGlobal("BABYLON.ParticleHelper.ExportSet")
  @js.native
  def ExportSet(systems: js.Array[IParticleSystem]): typings.babylonjs.BABYLON.ParticleSystemSet = js.native
  
  /**
    * Creates a particle system from a snippet saved in a remote file
    * @param name defines the name of the particle system to create (can be null or empty to use the one from the json data)
    * @param url defines the url to load from
    * @param scene defines the hosting scene
    * @param gpu If the system will use gpu
    * @param rootUrl defines the root URL to use to load textures and relative dependencies
    * @returns a promise that will resolve to the new particle system
    */
  @JSGlobal("BABYLON.ParticleHelper.ParseFromFileAsync")
  @js.native
  def ParseFromFileAsync(name: Nullable[String], url: String, scene: typings.babylonjs.BABYLON.Scene): js.Promise[IParticleSystem] = js.native
  @JSGlobal("BABYLON.ParticleHelper.ParseFromFileAsync")
  @js.native
  def ParseFromFileAsync(
    name: Nullable[String],
    url: String,
    scene: typings.babylonjs.BABYLON.Scene,
    gpu: js.UndefOr[scala.Nothing],
    rootUrl: String
  ): js.Promise[IParticleSystem] = js.native
  @JSGlobal("BABYLON.ParticleHelper.ParseFromFileAsync")
  @js.native
  def ParseFromFileAsync(name: Nullable[String], url: String, scene: typings.babylonjs.BABYLON.Scene, gpu: Boolean): js.Promise[IParticleSystem] = js.native
  @JSGlobal("BABYLON.ParticleHelper.ParseFromFileAsync")
  @js.native
  def ParseFromFileAsync(
    name: Nullable[String],
    url: String,
    scene: typings.babylonjs.BABYLON.Scene,
    gpu: Boolean,
    rootUrl: String
  ): js.Promise[IParticleSystem] = js.native
  
  /** Define the Url to load snippets */
  @JSGlobal("BABYLON.ParticleHelper.SnippetUrl")
  @js.native
  def SnippetUrl: String = js.native
  @scala.inline
  def SnippetUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SnippetUrl")(x.asInstanceOf[js.Any])
}
