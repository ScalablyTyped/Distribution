package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Particle emitter emitting particles from the inside of a cone.
     * It emits the particles alongside the cone volume from the base to the particle.
     * The emission direction might be randomized.
     */
@JSGlobal("BABYLON.ConeParticleEmitter")
@js.native
class ConeParticleEmitter () extends IParticleEmitterType {
  /**
           * Creates a new instance ConeParticleEmitter
           * @param radius the radius of the emission cone (1 by default)
           * @param angles the cone base angle (PI by default)
           * @param directionRandomizer defines how much to randomize the particle direction [0-1] (default is 0)
           */
  def this(radius: scala.Double) = this()
  /**
           * Creates a new instance ConeParticleEmitter
           * @param radius the radius of the emission cone (1 by default)
           * @param angles the cone base angle (PI by default)
           * @param directionRandomizer defines how much to randomize the particle direction [0-1] (default is 0)
           */
  def this(radius: scala.Double, angle: scala.Double) = this()
  /**
           * Creates a new instance ConeParticleEmitter
           * @param radius the radius of the emission cone (1 by default)
           * @param angles the cone base angle (PI by default)
           * @param directionRandomizer defines how much to randomize the particle direction [0-1] (default is 0)
           */
  def this(radius: scala.Double, angle: scala.Double, /** defines how much to randomize the particle direction [0-1] (default is 0) */
  directionRandomizer: scala.Double) = this()
  var _angle: js.Any = js.native
  var _buildHeight: js.Any = js.native
  var _height: js.Any = js.native
  var _radius: js.Any = js.native
  /**
           * Gets or sets the angle of the emission cone
           */
  var angle: scala.Double = js.native
  /** defines how much to randomize the particle direction [0-1] (default is 0) */
  var directionRandomizer: scala.Double = js.native
  /**
           * Gets or sets a value indicating if all the particles should be emitted from the spawn point only (the base of the cone)
           */
  var emitFromSpawnPointOnly: scala.Boolean = js.native
  /**
           * Gets or sets a value indicating where on the height the start position should be picked (1 = everywhere, 0 = only surface)
           */
  var heightRange: scala.Double = js.native
  /**
           * Gets or sets the radius of the emission cone
           */
  var radius: scala.Double = js.native
  /**
           * Gets or sets a value indicating where on the radius the start position should be picked (1 = everywhere, 0 = only surface)
           */
  var radiusRange: scala.Double = js.native
  /**
           * Called by the GPUParticleSystem to setup the update shader
           * @param effect defines the update shader
           */
  /* CompleteClass */
  override def applyToShader(effect: Effect): scala.Unit = js.native
  /**
           * Returns a string representing the class name
           * @returns a string containing the class name
           */
  /* CompleteClass */
  override def getClassName(): java.lang.String = js.native
  /**
           * Returns a string to use to update the GPU particles update shader
           * @returns the effect defines string
           */
  /* CompleteClass */
  override def getEffectDefines(): java.lang.String = js.native
  /**
           * Parse properties from a JSON object
           * @param serializationObject defines the JSON object
           */
  /* CompleteClass */
  override def parse(serializationObject: js.Any): scala.Unit = js.native
  /**
           * Serializes the particle system to a JSON object.
           * @returns the JSON object
           */
  /* CompleteClass */
  override def serialize(): js.Any = js.native
  /**
           * Called by the particle System when the direction is computed for the created particle.
           * @param worldMatrix is the world matrix of the particle system
           * @param directionToUpdate is the direction vector to update with the result
           * @param particle is the particle we are computed the direction for
           */
  /* CompleteClass */
  override def startDirectionFunction(worldMatrix: Matrix, directionToUpdate: Vector3, particle: Particle): scala.Unit = js.native
  /**
           * Called by the particle System when the position is computed for the created particle.
           * @param worldMatrix is the world matrix of the particle system
           * @param positionToUpdate is the position vector to update with the result
           * @param particle is the particle we are computed the position for
           */
  /* CompleteClass */
  override def startPositionFunction(worldMatrix: Matrix, positionToUpdate: Vector3, particle: Particle): scala.Unit = js.native
}

