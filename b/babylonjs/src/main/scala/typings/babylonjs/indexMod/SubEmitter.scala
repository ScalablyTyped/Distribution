package typings.babylonjs.indexMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "SubEmitter")
@js.native
class SubEmitter protected ()
  extends typings.babylonjs.particlesIndexMod.SubEmitter {
  /**
    * Creates a sub emitter
    * @param particleSystem the particle system to be used by the sub emitter
    */
  def this(/**
    * the particle system to be used by the sub emitter
    */
  particleSystem: typings.babylonjs.particleSystemMod.ParticleSystem) = this()
}
/* static members */
@JSImport("babylonjs/index", "SubEmitter")
@js.native
object SubEmitter extends js.Object {
  
  /**
    * Creates a new SubEmitter from a serialized JSON version
    * @param serializationObject defines the JSON object to read from
    * @param sceneOrEngine defines the hosting scene or the hosting engine
    * @param rootUrl defines the rootUrl for data loading
    * @returns a new SubEmitter
    */
  def Parse(serializationObject: js.Any, sceneOrEngine: typings.babylonjs.sceneMod.Scene, rootUrl: String): typings.babylonjs.subEmitterMod.SubEmitter = js.native
  def Parse(
    serializationObject: js.Any,
    sceneOrEngine: typings.babylonjs.thinEngineMod.ThinEngine,
    rootUrl: String
  ): typings.babylonjs.subEmitterMod.SubEmitter = js.native
  
  /** @hidden */
  def _ParseParticleSystem(system: js.Any, sceneOrEngine: typings.babylonjs.sceneMod.Scene, rootUrl: String): typings.babylonjs.particleSystemMod.ParticleSystem = js.native
  def _ParseParticleSystem(system: js.Any, sceneOrEngine: typings.babylonjs.thinEngineMod.ThinEngine, rootUrl: String): typings.babylonjs.particleSystemMod.ParticleSystem = js.native
}
