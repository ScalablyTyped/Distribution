package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a set of particle systems working together to create a specific effect
  */
@JSGlobal("BABYLON.ParticleSystemSet")
@js.native
class ParticleSystemSet () extends IDisposable {
  var _emitterCreationOptions: js.Any = js.native
  var _emitterNode: js.Any = js.native
  /**
    * Gets the emitter node used with this set
    */
  val emitterNode: Nullable[TransformNode] = js.native
  /**
    * Gets the particle system list
    */
  var systems: js.Array[IParticleSystem] = js.native
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): scala.Unit = js.native
  /**
    * Serialize the set into a JSON compatible object
    * @returns a JSON compatible representation of the set
    */
  def serialize(): js.Any = js.native
  /**
    * Creates a new emitter mesh as a sphere
    * @param options defines the options used to create the sphere
    * @param renderingGroupId defines the renderingGroupId to use for the sphere
    * @param scene defines the hosting scene
    */
  def setEmitterAsSphere(options: babylonjsLib.Anon_ColorDiameter, renderingGroupId: scala.Double, scene: Scene): scala.Unit = js.native
  /**
    * Starts all particle systems of the set
    * @param emitter defines an optional mesh to use as emitter for the particle systems
    */
  def start(): scala.Unit = js.native
  def start(emitter: AbstractMesh): scala.Unit = js.native
}

/* static members */
@JSGlobal("BABYLON.ParticleSystemSet")
@js.native
object ParticleSystemSet extends js.Object {
  /**
    * Parse a new ParticleSystemSet from a serialized source
    * @param data defines a JSON compatible representation of the set
    * @param scene defines the hosting scene
    * @param gpu defines if we want GPU particles or CPU particles
    * @returns a new ParticleSystemSet
    */
  def Parse(data: js.Any, scene: babylonjsLib.BABYLONNs.Scene): babylonjsLib.BABYLONNs.ParticleSystemSet = js.native
  def Parse(data: js.Any, scene: babylonjsLib.BABYLONNs.Scene, gpu: scala.Boolean): babylonjsLib.BABYLONNs.ParticleSystemSet = js.native
}

