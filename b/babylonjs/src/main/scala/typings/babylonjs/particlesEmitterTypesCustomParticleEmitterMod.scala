package typings.babylonjs

import typings.babylonjs.materialsUniformBufferEffectCommonAccessorMod.UniformBufferEffectCommonAccessor
import typings.babylonjs.materialsUniformBufferMod.UniformBuffer
import typings.babylonjs.mathsMathDotvectorMod.Matrix
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.particlesEmitterTypesIparticleemittertypeMod.IParticleEmitterType
import typings.babylonjs.particlesParticleMod.Particle
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object particlesEmitterTypesCustomParticleEmitterMod {
  
  @JSImport("babylonjs/Particles/EmitterTypes/customParticleEmitter", "CustomParticleEmitter")
  @js.native
  /**
    * Creates a new instance CustomParticleEmitter
    */
  open class CustomParticleEmitter ()
    extends StObject
       with IParticleEmitterType {
    
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
    def parse(serializationObject: Any): Unit = js.native
    /**
      * Parse properties from a JSON object
      * @param serializationObject defines the JSON object
      * @param scene defines the hosting scene
      */
    /* CompleteClass */
    override def parse(serializationObject: Any, scene: Nullable[Scene]): Unit = js.native
    
    /**
      * Gets or sets the destination generator that will create the final destination of each particle.
      *  * Index will be provided when used with GPU particle. Particle will be provided when used with CPU particles
      */
    def particleDestinationGenerator(index: Double, particle: Nullable[Particle], outDestination: Vector3): Unit = js.native
    
    /**
      * Gets or sets the position generator that will create the initial position of each particle.
      * Index will be provided when used with GPU particle. Particle will be provided when used with CPU particles
      */
    def particlePositionGenerator(index: Double, particle: Nullable[Particle], outPosition: Vector3): Unit = js.native
    
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
