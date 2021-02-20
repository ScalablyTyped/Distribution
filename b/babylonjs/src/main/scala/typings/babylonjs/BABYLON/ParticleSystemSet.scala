package typings.babylonjs.BABYLON

import typings.babylonjs.anon.ColorDiameterSegments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParticleSystemSet extends IDisposable {
  
  var _emitterCreationOptions: js.Any = js.native
  
  var _emitterNode: js.Any = js.native
  
  /**
    * Gets the emitter node used with this set
    */
  def emitterNode: Nullable[TransformNode] = js.native
  
  /**
    * Serialize the set into a JSON compatible object
    * @param serializeTexture defines if the texture must be serialized as well
    * @returns a JSON compatible representation of the set
    */
  def serialize(): js.Any = js.native
  def serialize(serializeTexture: Boolean): js.Any = js.native
  
  /**
    * Creates a new emitter mesh as a sphere
    * @param options defines the options used to create the sphere
    * @param renderingGroupId defines the renderingGroupId to use for the sphere
    * @param scene defines the hosting scene
    */
  def setEmitterAsSphere(options: ColorDiameterSegments, renderingGroupId: Double, scene: Scene): Unit = js.native
  
  /**
    * Starts all particle systems of the set
    * @param emitter defines an optional mesh to use as emitter for the particle systems
    */
  def start(): Unit = js.native
  def start(emitter: AbstractMesh): Unit = js.native
  
  /**
    * Gets the particle system list
    */
  var systems: js.Array[IParticleSystem] = js.native
}
