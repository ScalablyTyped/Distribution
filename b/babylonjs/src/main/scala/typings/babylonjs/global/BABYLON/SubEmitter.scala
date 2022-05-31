package typings.babylonjs.global.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.SubEmitter")
@js.native
class SubEmitter protected ()
  extends StObject
     with typings.babylonjs.BABYLON.SubEmitter {
  /**
    * Creates a sub emitter
    * @param particleSystem the particle system to be used by the sub emitter
    */
  def this(/**
    * the particle system to be used by the sub emitter
    */
  particleSystem: typings.babylonjs.BABYLON.ParticleSystem) = this()
  
  /** Release associated resources */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /**
    * If the particle should inherit the direction from the particle it's attached to. (+Y will face the direction the particle is moving) (Default: false)
    * Note: This only is supported when using an emitter of type Mesh
    */
  /* CompleteClass */
  var inheritDirection: Boolean = js.native
  
  /**
    * How much of the attached particles speed should be added to the sub emitted particle (default: 0)
    */
  /* CompleteClass */
  var inheritedVelocityAmount: Double = js.native
  
  /**
    * the particle system to be used by the sub emitter
    */
  /* CompleteClass */
  var particleSystem: typings.babylonjs.BABYLON.ParticleSystem = js.native
  
  /**
    * Serialize current object to a JSON object
    * @returns the serialized object
    */
  /* CompleteClass */
  override def serialize(): js.Any = js.native
  
  /**
    * Type of the submitter (Default: END)
    */
  /* CompleteClass */
  var `type`: typings.babylonjs.BABYLON.SubEmitterType = js.native
}
/* static members */
object SubEmitter {
  
  @JSGlobal("BABYLON.SubEmitter")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new SubEmitter from a serialized JSON version
    * @param serializationObject defines the JSON object to read from
    * @param sceneOrEngine defines the hosting scene or the hosting engine
    * @param rootUrl defines the rootUrl for data loading
    * @returns a new SubEmitter
    */
  inline def Parse(serializationObject: js.Any, sceneOrEngine: typings.babylonjs.BABYLON.Scene, rootUrl: String): typings.babylonjs.BABYLON.SubEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(serializationObject.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.SubEmitter]
  inline def Parse(serializationObject: js.Any, sceneOrEngine: typings.babylonjs.BABYLON.ThinEngine, rootUrl: String): typings.babylonjs.BABYLON.SubEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(serializationObject.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.SubEmitter]
  
  /** @hidden */
  inline def _ParseParticleSystem(system: js.Any, sceneOrEngine: typings.babylonjs.BABYLON.Scene, rootUrl: String): typings.babylonjs.BABYLON.ParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("_ParseParticleSystem")(system.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.ParticleSystem]
  inline def _ParseParticleSystem(system: js.Any, sceneOrEngine: typings.babylonjs.BABYLON.ThinEngine, rootUrl: String): typings.babylonjs.BABYLON.ParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("_ParseParticleSystem")(system.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.ParticleSystem]
}
