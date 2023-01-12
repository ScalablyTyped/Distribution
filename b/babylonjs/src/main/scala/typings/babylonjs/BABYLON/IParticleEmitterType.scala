package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IParticleEmitterType extends StObject {
  
  /**
    * Called by the GPUParticleSystem to setup the update shader
    * @param uboOrEffect defines the update shader
    */
  def applyToShader(uboOrEffect: UniformBufferEffectCommonAccessor): Unit
  
  /**
    * Creates the structure of the ubo for this particle emitter
    * @param ubo ubo to create the structure for
    */
  def buildUniformLayout(ubo: UniformBuffer): Unit
  
  /**
    * Returns a string representing the class name
    * @returns a string containing the class name
    */
  def getClassName(): String
  
  /**
    * Returns a string to use to update the GPU particles update shader
    * @returns the effect defines string
    */
  def getEffectDefines(): String
  
  /**
    * Parse properties from a JSON object
    * @param serializationObject defines the JSON object
    * @param scene defines the hosting scene
    */
  def parse(serializationObject: Any, scene: Nullable[Scene]): Unit
  
  /**
    * Serializes the particle system to a JSON object.
    * @returns the JSON object
    */
  def serialize(): Any
  
  /**
    * Called by the particle System when the direction is computed for the created particle.
    * @param worldMatrix is the world matrix of the particle system
    * @param directionToUpdate is the direction vector to update with the result
    * @param particle is the particle we are computed the direction for
    * @param isLocal defines if the direction should be set in local space
    * @param inverseWorldMatrix defines the inverted world matrix to use if isLocal is false
    */
  def startDirectionFunction(
    worldMatrix: Matrix,
    directionToUpdate: Vector3,
    particle: Particle,
    isLocal: Boolean,
    inverseWorldMatrix: Matrix
  ): Unit
  
  /**
    * Called by the particle System when the position is computed for the created particle.
    * @param worldMatrix is the world matrix of the particle system
    * @param positionToUpdate is the position vector to update with the result
    * @param particle is the particle we are computed the position for
    * @param isLocal defines if the position should be set in local space
    */
  def startPositionFunction(worldMatrix: Matrix, positionToUpdate: Vector3, particle: Particle, isLocal: Boolean): Unit
}
object IParticleEmitterType {
  
  inline def apply(
    applyToShader: UniformBufferEffectCommonAccessor => Unit,
    buildUniformLayout: UniformBuffer => Unit,
    getClassName: () => String,
    getEffectDefines: () => String,
    parse: (Any, Nullable[Scene]) => Unit,
    serialize: () => Any,
    startDirectionFunction: (Matrix, Vector3, Particle, Boolean, Matrix) => Unit,
    startPositionFunction: (Matrix, Vector3, Particle, Boolean) => Unit
  ): IParticleEmitterType = {
    val __obj = js.Dynamic.literal(applyToShader = js.Any.fromFunction1(applyToShader), buildUniformLayout = js.Any.fromFunction1(buildUniformLayout), getClassName = js.Any.fromFunction0(getClassName), getEffectDefines = js.Any.fromFunction0(getEffectDefines), parse = js.Any.fromFunction2(parse), serialize = js.Any.fromFunction0(serialize), startDirectionFunction = js.Any.fromFunction5(startDirectionFunction), startPositionFunction = js.Any.fromFunction4(startPositionFunction))
    __obj.asInstanceOf[IParticleEmitterType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IParticleEmitterType] (val x: Self) extends AnyVal {
    
    inline def setApplyToShader(value: UniformBufferEffectCommonAccessor => Unit): Self = StObject.set(x, "applyToShader", js.Any.fromFunction1(value))
    
    inline def setBuildUniformLayout(value: UniformBuffer => Unit): Self = StObject.set(x, "buildUniformLayout", js.Any.fromFunction1(value))
    
    inline def setGetClassName(value: () => String): Self = StObject.set(x, "getClassName", js.Any.fromFunction0(value))
    
    inline def setGetEffectDefines(value: () => String): Self = StObject.set(x, "getEffectDefines", js.Any.fromFunction0(value))
    
    inline def setParse(value: (Any, Nullable[Scene]) => Unit): Self = StObject.set(x, "parse", js.Any.fromFunction2(value))
    
    inline def setSerialize(value: () => Any): Self = StObject.set(x, "serialize", js.Any.fromFunction0(value))
    
    inline def setStartDirectionFunction(value: (Matrix, Vector3, Particle, Boolean, Matrix) => Unit): Self = StObject.set(x, "startDirectionFunction", js.Any.fromFunction5(value))
    
    inline def setStartPositionFunction(value: (Matrix, Vector3, Particle, Boolean) => Unit): Self = StObject.set(x, "startPositionFunction", js.Any.fromFunction4(value))
  }
}
