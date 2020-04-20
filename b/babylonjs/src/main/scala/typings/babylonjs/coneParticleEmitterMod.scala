package typings.babylonjs

import typings.babylonjs.effectMod.Effect
import typings.babylonjs.iparticleemittertypeMod.IParticleEmitterType
import typings.babylonjs.mathVectorMod.Matrix
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.particleMod.Particle
import typings.babylonjs.sceneMod.Scene
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Particles/EmitterTypes/coneParticleEmitter", JSImport.Namespace)
@js.native
object coneParticleEmitterMod extends js.Object {
  @js.native
  /**
    * Creates a new instance ConeParticleEmitter
    * @param radius the radius of the emission cone (1 by default)
    * @param angle the cone base angle (PI by default)
    * @param directionRandomizer defines how much to randomize the particle direction [0-1] (default is 0)
    */
  class ConeParticleEmitter () extends IParticleEmitterType {
    def this(radius: Double) = this()
    def this(radius: Double, angle: Double) = this()
    def this(
      radius: Double,
      angle: Double,
      /** defines how much to randomize the particle direction [0-1] (default is 0) */
    directionRandomizer: Double
    ) = this()
    var _angle: js.Any = js.native
    var _buildHeight: js.Any = js.native
    var _height: js.Any = js.native
    var _radius: js.Any = js.native
    /** defines how much to randomize the particle direction [0-1] (default is 0) */
    var directionRandomizer: Double = js.native
    /**
      * Gets or sets a value indicating if all the particles should be emitted from the spawn point only (the base of the cone)
      */
    var emitFromSpawnPointOnly: Boolean = js.native
    /**
      * Gets or sets a value indicating where on the height the start position should be picked (1 = everywhere, 0 = only surface)
      */
    var heightRange: Double = js.native
    /**
      * Gets or sets a value indicating where on the radius the start position should be picked (1 = everywhere, 0 = only surface)
      */
    var radiusRange: Double = js.native
    /**
      * Gets or sets the angle of the emission cone
      */
    def angle: Double = js.native
    def angle(value: Double): js.Any = js.native
    /**
      * Called by the GPUParticleSystem to setup the update shader
      * @param effect defines the update shader
      */
    /* CompleteClass */
    override def applyToShader(effect: Effect): Unit = js.native
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
    def parse(serializationObject: js.Any): Unit = js.native
    /**
      * Parse properties from a JSON object
      * @param serializationObject defines the JSON object
      * @param scene defines the hosting scene
      */
    /* CompleteClass */
    override def parse(serializationObject: js.Any, scene: Scene): Unit = js.native
    /**
      * Gets or sets the radius of the emission cone
      */
    def radius: Double = js.native
    def radius(value: Double): js.Any = js.native
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
      * @param isLocal defines if the direction should be set in local space
      */
    /* CompleteClass */
    override def startDirectionFunction(worldMatrix: Matrix, directionToUpdate: Vector3, particle: Particle, isLocal: Boolean): Unit = js.native
    /**
      * Called by the particle System when the position is computed for the created particle.
      * @param worldMatrix is the world matrix of the particle system
      * @param positionToUpdate is the position vector to update with the result
      * @param particle is the particle we are computed the position for
      * @param isLocal defines if the position should be set in local space
      */
    /* CompleteClass */
    override def startPositionFunction(worldMatrix: Matrix, positionToUpdate: Vector3, particle: Particle, isLocal: Boolean): Unit = js.native
  }
  
}

