package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubEmitter extends StObject {
  
  /** Release associated resources */
  def dispose(): Unit = js.native
  
  /**
    * If the particle should inherit the direction from the particle it's attached to. (+Y will face the direction the particle is moving) (Default: false)
    * Note: This only is supported when using an emitter of type Mesh
    */
  var inheritDirection: Boolean = js.native
  
  /**
    * How much of the attached particles speed should be added to the sub emitted particle (default: 0)
    */
  var inheritedVelocityAmount: Double = js.native
  
  /**
    * the particle system to be used by the sub emitter
    */
  var particleSystem: ParticleSystem = js.native
  
  /**
    * Serialize current object to a JSON object
    * @returns the serialized object
    */
  def serialize(): js.Any = js.native
  
  /**
    * Type of the submitter (Default: END)
    */
  var `type`: SubEmitterType = js.native
}
object SubEmitter {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class SubEmitterMutableBuilder[Self <: SubEmitter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInheritDirection(value: Boolean): Self = StObject.set(x, "inheritDirection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInheritedVelocityAmount(value: Double): Self = StObject.set(x, "inheritedVelocityAmount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticleSystem(value: ParticleSystem): Self = StObject.set(x, "particleSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerialize(value: () => js.Any): Self = StObject.set(x, "serialize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setType(value: SubEmitterType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
