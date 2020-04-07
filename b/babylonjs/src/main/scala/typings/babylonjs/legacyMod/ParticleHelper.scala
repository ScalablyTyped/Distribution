package typings.babylonjs.legacyMod

import typings.babylonjs.iparticlesystemMod.IParticleSystem
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Legacy/legacy", "ParticleHelper")
@js.native
class ParticleHelper ()
  extends typings.babylonjs.indexMod.ParticleHelper

/* static members */
@JSImport("babylonjs/Legacy/legacy", "ParticleHelper")
@js.native
object ParticleHelper extends js.Object {
  /**
    * Gets or sets base Assets URL
    */
  var BaseAssetsUrl: String = js.native
  /**
    * This is the main static method (one-liner) of this helper to create different particle systems
    * @param type This string represents the type to the particle system to create
    * @param scene The scene where the particle system should live
    * @param gpu If the system will use gpu
    * @returns the ParticleSystemSet created
    */
  def CreateAsync(`type`: String, scene: Nullable[typings.babylonjs.sceneMod.Scene]): js.Promise[typings.babylonjs.particleSystemSetMod.ParticleSystemSet] = js.native
  def CreateAsync(`type`: String, scene: Nullable[typings.babylonjs.sceneMod.Scene], gpu: Boolean): js.Promise[typings.babylonjs.particleSystemSetMod.ParticleSystemSet] = js.native
  /**
    * Create a default particle system that you can tweak
    * @param emitter defines the emitter to use
    * @param capacity defines the system capacity (default is 500 particles)
    * @param scene defines the hosting scene
    * @param useGPU defines if a GPUParticleSystem must be created (default is false)
    * @returns the new Particle system
    */
  def CreateDefault(
    emitter: Nullable[
      typings.babylonjs.abstractMeshMod.AbstractMesh | typings.babylonjs.mathVectorMod.Vector3
    ]
  ): IParticleSystem = js.native
  def CreateDefault(
    emitter: Nullable[
      typings.babylonjs.abstractMeshMod.AbstractMesh | typings.babylonjs.mathVectorMod.Vector3
    ],
    capacity: Double
  ): IParticleSystem = js.native
  def CreateDefault(
    emitter: Nullable[
      typings.babylonjs.abstractMeshMod.AbstractMesh | typings.babylonjs.mathVectorMod.Vector3
    ],
    capacity: Double,
    scene: typings.babylonjs.sceneMod.Scene
  ): IParticleSystem = js.native
  def CreateDefault(
    emitter: Nullable[
      typings.babylonjs.abstractMeshMod.AbstractMesh | typings.babylonjs.mathVectorMod.Vector3
    ],
    capacity: Double,
    scene: typings.babylonjs.sceneMod.Scene,
    useGPU: Boolean
  ): IParticleSystem = js.native
  /**
    * Static function used to export a particle system to a ParticleSystemSet variable.
    * Please note that the emitter shape is not exported
    * @param systems defines the particle systems to export
    * @returns the created particle system set
    */
  def ExportSet(systems: js.Array[IParticleSystem]): typings.babylonjs.particleSystemSetMod.ParticleSystemSet = js.native
}

