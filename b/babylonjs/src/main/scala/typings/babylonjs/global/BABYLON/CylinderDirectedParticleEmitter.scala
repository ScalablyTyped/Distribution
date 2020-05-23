package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.CylinderDirectedParticleEmitter")
@js.native
/**
  * Creates a new instance CylinderDirectedParticleEmitter
  * @param radius the radius of the emission cylinder (1 by default)
  * @param height the height of the emission cylinder (1 by default)
  * @param radiusRange the range of the emission cylinder [0-1] 0 Surface only, 1 Entire Radius (1 by default)
  * @param direction1 the min limit of the emission direction (up vector by default)
  * @param direction2 the max limit of the emission direction (up vector by default)
  */
class CylinderDirectedParticleEmitter ()
  extends typings.babylonjs.BABYLON.CylinderDirectedParticleEmitter {
  def this(radius: Double) = this()
  def this(radius: Double, height: Double) = this()
  def this(radius: Double, height: Double, radiusRange: Double) = this()
  def this(
    radius: Double,
    height: Double,
    radiusRange: Double,
    /**
    * The min limit of the emission direction.
    */
  direction1: typings.babylonjs.BABYLON.Vector3
  ) = this()
  def this(
    radius: Double,
    height: Double,
    radiusRange: Double,
    /**
    * The min limit of the emission direction.
    */
  direction1: typings.babylonjs.BABYLON.Vector3,
    /**
    * The max limit of the emission direction.
    */
  direction2: typings.babylonjs.BABYLON.Vector3
  ) = this()
  /**
    * The min limit of the emission direction.
    */
  /* CompleteClass */
  override var direction1: typings.babylonjs.BABYLON.Vector3 = js.native
  /**
    * The max limit of the emission direction.
    */
  /* CompleteClass */
  override var direction2: typings.babylonjs.BABYLON.Vector3 = js.native
  /**
    * How much to randomize the particle direction [0-1].
    */
  /* CompleteClass */
  override var directionRandomizer: Double = js.native
  /**
    * The height of the emission cylinder.
    */
  /* CompleteClass */
  override var height: Double = js.native
  /**
    * The radius of the emission cylinder.
    */
  /* CompleteClass */
  override var radius: Double = js.native
  /**
    * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
    */
  /* CompleteClass */
  override var radiusRange: Double = js.native
  /**
    * Called by the GPUParticleSystem to setup the update shader
    * @param effect defines the update shader
    */
  /* CompleteClass */
  override def applyToShader(effect: typings.babylonjs.BABYLON.Effect): Unit = js.native
  /**
    * Returns a string representing the class name
    * @returns a string containing the class name
    */
  /* CompleteClass */
  override def getClassName(): String = js.native
  /**
    * Returns a string to use to update the GPU particles update shader
    * @returns the effect defines string
    */
  /* CompleteClass */
  override def getEffectDefines(): String = js.native
  /**
    * Parse properties from a JSON object
    * @param serializationObject defines the JSON object
    */
  /* CompleteClass */
  override def parse(serializationObject: js.Any): Unit = js.native
  /**
    * Parse properties from a JSON object
    * @param serializationObject defines the JSON object
    * @param scene defines the hosting scene
    */
  /* CompleteClass */
  override def parse(serializationObject: js.Any, scene: typings.babylonjs.BABYLON.Scene): Unit = js.native
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
  override def startDirectionFunction(
    worldMatrix: typings.babylonjs.BABYLON.Matrix,
    directionToUpdate: typings.babylonjs.BABYLON.Vector3,
    particle: typings.babylonjs.BABYLON.Particle
  ): Unit = js.native
  /**
    * Called by the particle System when the direction is computed for the created particle.
    * @param worldMatrix is the world matrix of the particle system
    * @param directionToUpdate is the direction vector to update with the result
    * @param particle is the particle we are computed the direction for
    * @param isLocal defines if the direction should be set in local space
    */
  /* CompleteClass */
  override def startDirectionFunction(
    worldMatrix: typings.babylonjs.BABYLON.Matrix,
    directionToUpdate: typings.babylonjs.BABYLON.Vector3,
    particle: typings.babylonjs.BABYLON.Particle,
    isLocal: Boolean
  ): Unit = js.native
  /**
    * Called by the particle System when the position is computed for the created particle.
    * @param worldMatrix is the world matrix of the particle system
    * @param positionToUpdate is the position vector to update with the result
    * @param particle is the particle we are computed the position for
    * @param isLocal defines if the position should be set in local space
    */
  /* CompleteClass */
  override def startPositionFunction(
    worldMatrix: typings.babylonjs.BABYLON.Matrix,
    positionToUpdate: typings.babylonjs.BABYLON.Vector3,
    particle: typings.babylonjs.BABYLON.Particle,
    isLocal: Boolean
  ): Unit = js.native
}

