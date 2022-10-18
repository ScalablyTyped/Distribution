package typings.babylonjs.BABYLON

import typings.babylonjs.anon.ColorDiameter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParticleSystemSet
  extends StObject
     with IDisposable {
  
  /* private */ var _emitterCreationOptions: Any = js.native
  
  /* private */ var _emitterNode: Any = js.native
  
  /* private */ var _emitterNodeIsOwned: Any = js.native
  
  /**
    * Gets or sets the emitter node used with this set
    */
  def emitterNode: Nullable[AbstractMesh | Vector3] = js.native
  def emitterNode_=(value: Nullable[AbstractMesh | Vector3]): Unit = js.native
  
  /**
    * Serialize the set into a JSON compatible object
    * @param serializeTexture defines if the texture must be serialized as well
    * @returns a JSON compatible representation of the set
    */
  def serialize(): Any = js.native
  def serialize(serializeTexture: Boolean): Any = js.native
  
  /**
    * Creates a new emitter mesh as a sphere
    * @param options defines the options used to create the sphere
    * @param options.diameter
    * @param options.segments
    * @param options.color
    * @param renderingGroupId defines the renderingGroupId to use for the sphere
    * @param scene defines the hosting scene
    */
  def setEmitterAsSphere(options: ColorDiameter, renderingGroupId: Double, scene: Scene): Unit = js.native
  
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
