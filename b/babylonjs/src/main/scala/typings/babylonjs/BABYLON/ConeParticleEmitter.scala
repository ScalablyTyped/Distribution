package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConeParticleEmitter
  extends StObject
     with IParticleEmitterType {
  
  /* private */ var _angle: Any = js.native
  
  /* private */ var _buildHeight: Any = js.native
  
  /* private */ var _height: Any = js.native
  
  /* private */ var _radius: Any = js.native
  
  /**
    * Gets or sets the angle of the emission cone
    */
  def angle: Double = js.native
  def angle_=(value: Double): Unit = js.native
  
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
    * Parse properties from a JSON object
    * @param serializationObject defines the JSON object
    */
  def parse(serializationObject: Any): Unit = js.native
  
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
    * Called by the particle System when the direction is computed for the created particle.
    * @param worldMatrix is the world matrix of the particle system
    * @param directionToUpdate is the direction vector to update with the result
    * @param particle is the particle we are computed the direction for
    * @param isLocal defines if the direction should be set in local space
    */
  def startDirectionFunction(worldMatrix: Matrix, directionToUpdate: Vector3, particle: Particle, isLocal: Boolean): Unit = js.native
}
