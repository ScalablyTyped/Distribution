package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Particle emitter emitting particles from the inside of a hemisphere.
     * It emits the particles alongside the hemisphere radius. The emission direction might be randomized.
     */
@JSGlobal("BABYLON.HemisphericParticleEmitter")
@js.native
class HemisphericParticleEmitter () extends IParticleEmitterType {
  /**
          * Creates a new instance HemisphericParticleEmitter
          * @param radius the radius of the emission hemisphere (1 by default)
          * @param radiusRange the range of the emission hemisphere [0-1] 0 Surface only, 1 Entire Radius (1 by default)
          * @param directionRandomizer defines how much to randomize the particle direction [0-1]
          */
  def this(/**
           * The radius of the emission hemisphere.
           */
  radius: scala.Double) = this()
  /**
          * Creates a new instance HemisphericParticleEmitter
          * @param radius the radius of the emission hemisphere (1 by default)
          * @param radiusRange the range of the emission hemisphere [0-1] 0 Surface only, 1 Entire Radius (1 by default)
          * @param directionRandomizer defines how much to randomize the particle direction [0-1]
          */
  def this(/**
           * The radius of the emission hemisphere.
           */
  radius: scala.Double, /**
           * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
           */
  radiusRange: scala.Double) = this()
  /**
          * Creates a new instance HemisphericParticleEmitter
          * @param radius the radius of the emission hemisphere (1 by default)
          * @param radiusRange the range of the emission hemisphere [0-1] 0 Surface only, 1 Entire Radius (1 by default)
          * @param directionRandomizer defines how much to randomize the particle direction [0-1]
          */
  def this(/**
           * The radius of the emission hemisphere.
           */
  radius: scala.Double, /**
           * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
           */
  radiusRange: scala.Double, /**
           * How much to randomize the particle direction [0-1].
           */
  directionRandomizer: scala.Double) = this()
  /**
           * How much to randomize the particle direction [0-1].
           */
  var directionRandomizer: scala.Double = js.native
  /**
           * The radius of the emission hemisphere.
           */
  var radius: scala.Double = js.native
  /**
           * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
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

