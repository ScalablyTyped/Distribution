package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.ParticleHelper")
@js.native
class ParticleHelper () extends js.Object

/* static members */
@JSGlobal("BABYLON.ParticleHelper")
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
  def CreateAsync(`type`: String, scene: Nullable[Scene]): js.Promise[ParticleSystemSet] = js.native
  def CreateAsync(`type`: String, scene: Nullable[Scene], gpu: Boolean): js.Promise[ParticleSystemSet] = js.native
  /**
    * Create a default particle system that you can tweak
    * @param emitter defines the emitter to use
    * @param capacity defines the system capacity (default is 500 particles)
    * @param scene defines the hosting scene
    * @param useGPU defines if a GPUParticleSystem must be created (default is false)
    * @returns the new Particle system
    */
  def CreateDefault(emitter: Nullable[AbstractMesh | Vector3]): IParticleSystem = js.native
  def CreateDefault(emitter: Nullable[AbstractMesh | Vector3], capacity: Double): IParticleSystem = js.native
  def CreateDefault(emitter: Nullable[AbstractMesh | Vector3], capacity: Double, scene: Scene): IParticleSystem = js.native
  def CreateDefault(emitter: Nullable[AbstractMesh | Vector3], capacity: Double, scene: Scene, useGPU: Boolean): IParticleSystem = js.native
  /**
    * Static function used to export a particle system to a ParticleSystemSet variable.
    * Please note that the emitter shape is not exported
    * @param systems defines the particle systems to export
    * @returns the created particle system set
    */
  def ExportSet(systems: js.Array[IParticleSystem]): ParticleSystemSet = js.native
}

