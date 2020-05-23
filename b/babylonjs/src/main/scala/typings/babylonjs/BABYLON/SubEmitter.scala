package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubEmitter extends js.Object {
  /**
    * If the particle should inherit the direction from the particle it's attached to. (+Y will face the direction the particle is moving) (Default: false)
    * Note: This only is supported when using an emitter of type Mesh
    */
  var inheritDirection: Boolean
  /**
    * How much of the attached particles speed should be added to the sub emitted particle (default: 0)
    */
  var inheritedVelocityAmount: Double
  /**
    * the particle system to be used by the sub emitter
    */
  var particleSystem: ParticleSystem
  /**
    * Type of the submitter (Default: END)
    */
  var `type`: SubEmitterType
  /** Release associated resources */
  def dispose(): Unit
  /**
    * Serialize current object to a JSON object
    * @returns the serialized object
    */
  def serialize(): js.Any
}

object SubEmitter {
  @scala.inline
  def apply(
    dispose: () => Unit,
    inheritDirection: Boolean,
    inheritedVelocityAmount: Double,
    particleSystem: ParticleSystem,
    serialize: () => js.Any,
    `type`: SubEmitterType
  ): SubEmitter = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose), inheritDirection = inheritDirection.asInstanceOf[js.Any], inheritedVelocityAmount = inheritedVelocityAmount.asInstanceOf[js.Any], particleSystem = particleSystem.asInstanceOf[js.Any], serialize = js.Any.fromFunction0(serialize))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubEmitter]
  }
}

