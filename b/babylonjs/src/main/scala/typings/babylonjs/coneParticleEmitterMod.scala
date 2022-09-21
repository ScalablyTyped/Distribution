package typings.babylonjs

import typings.babylonjs.iparticleemittertypeMod.IParticleEmitterType
import typings.babylonjs.mathVectorMod.Matrix
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.particleMod.Particle
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.uniformBufferEffectCommonAccessorMod.UniformBufferEffectCommonAccessor
import typings.babylonjs.uniformBufferMod.UniformBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coneParticleEmitterMod {
  
  @JSImport("babylonjs/Particles/EmitterTypes/coneParticleEmitter", "ConeParticleEmitter")
  @js.native
  /**
    * Creates a new instance ConeParticleEmitter
    * @param radius the radius of the emission cone (1 by default)
    * @param angle the cone base angle (PI by default)
    * @param directionRandomizer defines how much to randomize the particle direction [0-1] (default is 0)
    */
  open class ConeParticleEmitter ()
    extends StObject
       with IParticleEmitterType {
    def this(radius: Double) = this()
    def this(radius: Double, angle: Double) = this()
    def this(radius: Unit, angle: Double) = this()
    def this(
      radius: Double,
      angle: Double,
      /** defines how much to randomize the particle direction [0-1] (default is 0) */
    directionRandomizer: Double
    ) = this()
    def this(
      radius: Double,
      angle: Unit,
      /** defines how much to randomize the particle direction [0-1] (default is 0) */
    directionRandomizer: Double
    ) = this()
    def this(
      radius: Unit,
      angle: Double,
      /** defines how much to randomize the particle direction [0-1] (default is 0) */
    directionRandomizer: Double
    ) = this()
    def this(
      radius: Unit,
      angle: Unit,
      /** defines how much to randomize the particle direction [0-1] (default is 0) */
    directionRandomizer: Double
    ) = this()
    
    /* private */ var _angle: Any = js.native
    
    /* private */ var _buildHeight: Any = js.native
    
    /* private */ var _height: Any = js.native
    
    /* private */ var _radius: Any = js.native
    
    /**
      * Gets or sets the angle of the emission cone
      */
    def angle: Double = js.native
    def angle_=(value: Double): Unit = js.native
    
    /**
      * Called by the GPUParticleSystem to setup the update shader
      * @param uboOrEffect defines the update shader
      */
    /* CompleteClass */
    override def applyToShader(uboOrEffect: UniformBufferEffectCommonAccessor): Unit = js.native
    
    /**
      * Creates the structure of the ubo for this particle emitter
      * @param ubo ubo to create the structure for
      */
    /* CompleteClass */
    override def buildUniformLayout(ubo: UniformBuffer): Unit = js.native
    
    /** defines how much to randomize the particle direction [0-1] (default is 0) */
    var directionRandomizer: Double = js.native
    
    /**
      * Gets or sets a value indicating if all the particles should be emitted from the spawn point only (the base of the cone)
      */
    var emitFromSpawnPointOnly: Boolean = js.native
    
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
      * Gets or sets a value indicating where on the height the start position should be picked (1 = everywhere, 0 = only surface)
      */
    var heightRange: Double = js.native
    
    /**
      * Parse properties from a JSON object
      * @param serializationObject defines the JSON object
      */
    def parse(serializationObject: Any): Unit = js.native
    /**
      * Parse properties from a JSON object
      * @param serializationObject defines the JSON object
      * @param scene defines the hosting scene
      */
    /* CompleteClass */
    override def parse(serializationObject: Any, scene: Nullable[Scene]): Unit = js.native
    
    /**
      * Gets or sets the radius of the emission cone
      */
    def radius: Double = js.native
    
    /**
      * Gets or sets a value indicating where on the radius the start position should be picked (1 = everywhere, 0 = only surface)
      */
    var radiusRange: Double = js.native
    
    def radius_=(value: Double): Unit = js.native
    
    /**
      * Serializes the particle system to a JSON object.
      * @returns the JSON object
      */
    /* CompleteClass */
    override def serialize(): Any = js.native
    
    /**
      * Called by the particle System when the direction is computed for the created particle.
      * @param worldMatrix is the world matrix of the particle system
      * @param directionToUpdate is the direction vector to update with the result
      * @param particle is the particle we are computed the direction for
      * @param isLocal defines if the direction should be set in local space
      */
    def startDirectionFunction(worldMatrix: Matrix, directionToUpdate: Vector3, particle: Particle, isLocal: Boolean): Unit = js.native
    /**
      * Called by the particle System when the direction is computed for the created particle.
      * @param worldMatrix is the world matrix of the particle system
      * @param directionToUpdate is the direction vector to update with the result
      * @param particle is the particle we are computed the direction for
      * @param isLocal defines if the direction should be set in local space
      * @param inverseWorldMatrix defines the inverted world matrix to use if isLocal is false
      */
    /* CompleteClass */
    override def startDirectionFunction(
      worldMatrix: Matrix,
      directionToUpdate: Vector3,
      particle: Particle,
      isLocal: Boolean,
      inverseWorldMatrix: Matrix
    ): Unit = js.native
    
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
