package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.BoxParticleEmitter")
@js.native
/**
  * Creates a new instance BoxParticleEmitter
  */
open class BoxParticleEmitter ()
  extends StObject
     with typings.babylonjs.BABYLON.BoxParticleEmitter {
  
  /**
    * Called by the GPUParticleSystem to setup the update shader
    * @param uboOrEffect defines the update shader
    */
  /* CompleteClass */
  override def applyToShader(uboOrEffect: typings.babylonjs.BABYLON.UniformBufferEffectCommonAccessor): Unit = js.native
  
  /**
    * Creates the structure of the ubo for this particle emitter
    * @param ubo ubo to create the structure for
    */
  /* CompleteClass */
  override def buildUniformLayout(ubo: typings.babylonjs.BABYLON.UniformBuffer): Unit = js.native
  
  /**
    * Random direction of each particle after it has been emitted, between direction1 and direction2 vectors.
    */
  /* CompleteClass */
  var direction1: typings.babylonjs.BABYLON.Vector3 = js.native
  
  /**
    * Random direction of each particle after it has been emitted, between direction1 and direction2 vectors.
    */
  /* CompleteClass */
  var direction2: typings.babylonjs.BABYLON.Vector3 = js.native
  
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
    * Maximum box point around our emitter. Our emitter is the center of particles source, but if you want your particles to emit from more than one point, then you can tell it to do so.
    */
  /* CompleteClass */
  var maxEmitBox: typings.babylonjs.BABYLON.Vector3 = js.native
  
  /**
    * Minimum box point around our emitter. Our emitter is the center of particles source, but if you want your particles to emit from more than one point, then you can tell it to do so.
    */
  /* CompleteClass */
  var minEmitBox: typings.babylonjs.BABYLON.Vector3 = js.native
  
  /**
    * Parse properties from a JSON object
    * @param serializationObject defines the JSON object
    */
  /* CompleteClass */
  override def parse(serializationObject: Any): Unit = js.native
  /**
    * Parse properties from a JSON object
    * @param serializationObject defines the JSON object
    * @param scene defines the hosting scene
    */
  /* CompleteClass */
  override def parse(serializationObject: Any, scene: Nullable[typings.babylonjs.BABYLON.Scene]): Unit = js.native
  
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
  /* CompleteClass */
  override def startDirectionFunction(
    worldMatrix: typings.babylonjs.BABYLON.Matrix,
    directionToUpdate: typings.babylonjs.BABYLON.Vector3,
    particle: typings.babylonjs.BABYLON.Particle,
    isLocal: Boolean
  ): Unit = js.native
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
    worldMatrix: typings.babylonjs.BABYLON.Matrix,
    directionToUpdate: typings.babylonjs.BABYLON.Vector3,
    particle: typings.babylonjs.BABYLON.Particle,
    isLocal: Boolean,
    inverseWorldMatrix: typings.babylonjs.BABYLON.Matrix
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
