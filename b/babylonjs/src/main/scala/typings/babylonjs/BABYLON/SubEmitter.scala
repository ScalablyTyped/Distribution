package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    * @param serializeTexture defines if the texture must be serialized as well
    * @returns the serialized object
    */
  def serialize(): Any = js.native
  def serialize(serializeTexture: Boolean): Any = js.native
  
  /**
    * Type of the submitter (Default: END)
    */
  var `type`: SubEmitterType = js.native
}
