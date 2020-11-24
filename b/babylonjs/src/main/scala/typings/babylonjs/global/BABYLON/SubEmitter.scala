package typings.babylonjs.global.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.SubEmitter")
@js.native
class SubEmitter protected ()
  extends typings.babylonjs.BABYLON.SubEmitter {
  /**
    * Creates a sub emitter
    * @param particleSystem the particle system to be used by the sub emitter
    */
  def this(/**
    * the particle system to be used by the sub emitter
    */
  particleSystem: typings.babylonjs.BABYLON.ParticleSystem) = this()
}
/* static members */
@JSGlobal("BABYLON.SubEmitter")
@js.native
object SubEmitter extends js.Object {
  
  /**
    * Creates a new SubEmitter from a serialized JSON version
    * @param serializationObject defines the JSON object to read from
    * @param sceneOrEngine defines the hosting scene or the hosting engine
    * @param rootUrl defines the rootUrl for data loading
    * @returns a new SubEmitter
    */
  def Parse(serializationObject: js.Any, sceneOrEngine: typings.babylonjs.BABYLON.Scene, rootUrl: String): typings.babylonjs.BABYLON.SubEmitter = js.native
  def Parse(serializationObject: js.Any, sceneOrEngine: typings.babylonjs.BABYLON.ThinEngine, rootUrl: String): typings.babylonjs.BABYLON.SubEmitter = js.native
  
  /** @hidden */
  def _ParseParticleSystem(system: js.Any, sceneOrEngine: typings.babylonjs.BABYLON.Scene, rootUrl: String): typings.babylonjs.BABYLON.ParticleSystem = js.native
  def _ParseParticleSystem(system: js.Any, sceneOrEngine: typings.babylonjs.BABYLON.ThinEngine, rootUrl: String): typings.babylonjs.BABYLON.ParticleSystem = js.native
}
