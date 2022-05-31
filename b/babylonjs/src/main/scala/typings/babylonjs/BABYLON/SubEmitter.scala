package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubEmitter extends StObject {
  
  /** Release associated resources */
  def dispose(): Unit
  
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
    * Serialize current object to a JSON object
    * @returns the serialized object
    */
  def serialize(): js.Any
  
  /**
    * Type of the submitter (Default: END)
    */
  var `type`: SubEmitterType
}
object SubEmitter {
  
  inline def apply(
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
  
  extension [Self <: SubEmitter](x: Self) {
    
    inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    inline def setInheritDirection(value: Boolean): Self = StObject.set(x, "inheritDirection", value.asInstanceOf[js.Any])
    
    inline def setInheritedVelocityAmount(value: Double): Self = StObject.set(x, "inheritedVelocityAmount", value.asInstanceOf[js.Any])
    
    inline def setParticleSystem(value: ParticleSystem): Self = StObject.set(x, "particleSystem", value.asInstanceOf[js.Any])
    
    inline def setSerialize(value: () => js.Any): Self = StObject.set(x, "serialize", js.Any.fromFunction0(value))
    
    inline def setType(value: SubEmitterType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
