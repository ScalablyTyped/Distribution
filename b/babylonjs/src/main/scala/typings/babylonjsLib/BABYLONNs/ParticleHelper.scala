package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This class is made for on one-liner static method to help creating particle system set.
  */
@JSGlobal("BABYLON.ParticleHelper")
@js.native
class ParticleHelper () extends js.Object

/**
  * This class is made for on one-liner static method to help creating particle system set.
  */
@JSGlobal("BABYLON.ParticleHelper")
@js.native
object ParticleHelper extends js.Object {
  /**
    * Gets or sets base Assets URL
    */
  var BaseAssetsUrl: java.lang.String = js.native
  /**
    * This is the main static method (one-liner) of this helper to create different particle systems
    * @param type This string represents the type to the particle system to create
    * @param scene The scene where the particle system should live
    * @param gpu If the system will use gpu
    * @returns the ParticleSystemSet created
    */
  def CreateAsync(`type`: java.lang.String, scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene]): js.Promise[babylonjsLib.BABYLONNs.ParticleSystemSet] = js.native
  def CreateAsync(
    `type`: java.lang.String,
    scene: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Scene],
    gpu: scala.Boolean
  ): js.Promise[babylonjsLib.BABYLONNs.ParticleSystemSet] = js.native
  /**
    * Create a default particle system that you can tweak
    * @param emitter defines the emitter to use
    * @param capacity defines the system capacity (default is 500 particles)
    * @param scene defines the hosting scene
    * @param useGPU defines if a GPUParticleSystem must be created (default is false)
    * @returns the new Particle system
    */
  def CreateDefault(
    emitter: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.AbstractMesh | babylonjsLib.BABYLONNs.Vector3]
  ): babylonjsLib.BABYLONNs.IParticleSystem = js.native
  def CreateDefault(
    emitter: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.AbstractMesh | babylonjsLib.BABYLONNs.Vector3],
    capacity: scala.Double
  ): babylonjsLib.BABYLONNs.IParticleSystem = js.native
  def CreateDefault(
    emitter: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.AbstractMesh | babylonjsLib.BABYLONNs.Vector3],
    capacity: scala.Double,
    scene: babylonjsLib.BABYLONNs.Scene
  ): babylonjsLib.BABYLONNs.IParticleSystem = js.native
  def CreateDefault(
    emitter: babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.AbstractMesh | babylonjsLib.BABYLONNs.Vector3],
    capacity: scala.Double,
    scene: babylonjsLib.BABYLONNs.Scene,
    useGPU: scala.Boolean
  ): babylonjsLib.BABYLONNs.IParticleSystem = js.native
  /**
    * Static function used to export a particle system to a ParticleSystemSet variable.
    * Please note that the emitter shape is not exported
    * @param systems defines the particle systems to export
    * @returns the created particle system set
    */
  def ExportSet(systems: js.Array[babylonjsLib.BABYLONNs.IParticleSystem]): babylonjsLib.BABYLONNs.ParticleSystemSet = js.native
}

