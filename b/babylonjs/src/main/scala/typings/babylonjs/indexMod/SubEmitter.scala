package typings.babylonjs.indexMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
object SubEmitter {
  
  @JSImport("babylonjs/index", "SubEmitter")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates a new SubEmitter from a serialized JSON version
    * @param serializationObject defines the JSON object to read from
    * @param sceneOrEngine defines the hosting scene or the hosting engine
    * @param rootUrl defines the rootUrl for data loading
    * @returns a new SubEmitter
    */
  inline def Parse(serializationObject: js.Any, sceneOrEngine: typings.babylonjs.sceneMod.Scene, rootUrl: String): typings.babylonjs.subEmitterMod.SubEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(serializationObject.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.subEmitterMod.SubEmitter]
  inline def Parse(
    serializationObject: js.Any,
    sceneOrEngine: typings.babylonjs.thinEngineMod.ThinEngine,
    rootUrl: String
  ): typings.babylonjs.subEmitterMod.SubEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(serializationObject.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.subEmitterMod.SubEmitter]
  
  /** @hidden */
  inline def _ParseParticleSystem(system: js.Any, sceneOrEngine: typings.babylonjs.sceneMod.Scene, rootUrl: String): typings.babylonjs.particleSystemMod.ParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("_ParseParticleSystem")(system.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.particleSystemMod.ParticleSystem]
  inline def _ParseParticleSystem(system: js.Any, sceneOrEngine: typings.babylonjs.thinEngineMod.ThinEngine, rootUrl: String): typings.babylonjs.particleSystemMod.ParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("_ParseParticleSystem")(system.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.particleSystemMod.ParticleSystem]
}
