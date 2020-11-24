package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IParticleEmitterType extends js.Object {
  
  /**
    * Called by the GPUParticleSystem to setup the update shader
    * @param effect defines the update shader
    */
  def applyToShader(effect: Effect): Unit = js.native
  
  /**
    * Returns a string representing the class name
    * @returns a string containing the class name
    */
  def getClassName(): String = js.native
  
  /**
    * Returns a string to use to update the GPU particles update shader
    * @returns the effect defines string
    */
  def getEffectDefines(): String = js.native
  
  /**
    * Parse properties from a JSON object
    * @param serializationObject defines the JSON object
    * @param scene defines the hosting scene
    */
  def parse(serializationObject: js.Any, scene: Nullable[Scene]): Unit = js.native
  
  /**
    * Serializes the particle system to a JSON object.
    * @returns the JSON object
    */
  def serialize(): js.Any = js.native
  
  /**
    * Called by the particle System when the direction is computed for the created particle.
    * @param worldMatrix is the world matrix of the particle system
    * @param directionToUpdate is the direction vector to update with the result
    * @param particle is the particle we are computed the direction for
    * @param isLocal defines if the direction should be set in local space
    */
  def startDirectionFunction(worldMatrix: Matrix, directionToUpdate: Vector3, particle: Particle, isLocal: Boolean): Unit = js.native
  
  /**
    * Called by the particle System when the position is computed for the created particle.
    * @param worldMatrix is the world matrix of the particle system
    * @param positionToUpdate is the position vector to update with the result
    * @param particle is the particle we are computed the position for
    * @param isLocal defines if the position should be set in local space
    */
  def startPositionFunction(worldMatrix: Matrix, positionToUpdate: Vector3, particle: Particle, isLocal: Boolean): Unit = js.native
}
object IParticleEmitterType {
  
  @scala.inline
  def apply(
    applyToShader: Effect => Unit,
    getClassName: () => String,
    getEffectDefines: () => String,
    parse: (js.Any, Nullable[Scene]) => Unit,
    serialize: () => js.Any,
    startDirectionFunction: (Matrix, Vector3, Particle, Boolean) => Unit,
    startPositionFunction: (Matrix, Vector3, Particle, Boolean) => Unit
  ): IParticleEmitterType = {
    val __obj = js.Dynamic.literal(applyToShader = js.Any.fromFunction1(applyToShader), getClassName = js.Any.fromFunction0(getClassName), getEffectDefines = js.Any.fromFunction0(getEffectDefines), parse = js.Any.fromFunction2(parse), serialize = js.Any.fromFunction0(serialize), startDirectionFunction = js.Any.fromFunction4(startDirectionFunction), startPositionFunction = js.Any.fromFunction4(startPositionFunction))
    __obj.asInstanceOf[IParticleEmitterType]
  }
  
  @scala.inline
  implicit class IParticleEmitterTypeOps[Self <: IParticleEmitterType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApplyToShader(value: Effect => Unit): Self = this.set("applyToShader", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetClassName(value: () => String): Self = this.set("getClassName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetEffectDefines(value: () => String): Self = this.set("getEffectDefines", js.Any.fromFunction0(value))
    
    @scala.inline
    def setParse(value: (js.Any, Nullable[Scene]) => Unit): Self = this.set("parse", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSerialize(value: () => js.Any): Self = this.set("serialize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStartDirectionFunction(value: (Matrix, Vector3, Particle, Boolean) => Unit): Self = this.set("startDirectionFunction", js.Any.fromFunction4(value))
    
    @scala.inline
    def setStartPositionFunction(value: (Matrix, Vector3, Particle, Boolean) => Unit): Self = this.set("startPositionFunction", js.Any.fromFunction4(value))
  }
}
