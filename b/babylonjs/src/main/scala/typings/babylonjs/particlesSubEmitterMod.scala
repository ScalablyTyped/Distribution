package typings.babylonjs

import typings.babylonjs.enginesThinEngineMod.ThinEngine
import typings.babylonjs.particlesParticleSystemMod.ParticleSystem
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object particlesSubEmitterMod {
  
  @JSImport("babylonjs/Particles/subEmitter", "SubEmitter")
  @js.native
  open class SubEmitter protected () extends StObject {
    /**
      * Creates a sub emitter
      * @param particleSystem the particle system to be used by the sub emitter
      */
    def this(/**
      * the particle system to be used by the sub emitter
      */
    particleSystem: ParticleSystem) = this()
    
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
  /* static members */
  object SubEmitter {
    
    @JSImport("babylonjs/Particles/subEmitter", "SubEmitter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def Parse(serializationObject: Any, sceneOrEngine: ThinEngine, rootUrl: String): SubEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(serializationObject.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[SubEmitter]
    /**
      * Creates a new SubEmitter from a serialized JSON version
      * @param serializationObject defines the JSON object to read from
      * @param sceneOrEngine defines the hosting scene or the hosting engine
      * @param rootUrl defines the rootUrl for data loading
      * @returns a new SubEmitter
      */
    inline def Parse(serializationObject: Any, sceneOrEngine: Scene, rootUrl: String): SubEmitter = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(serializationObject.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[SubEmitter]
    
    inline def _ParseParticleSystem(system: Any, sceneOrEngine: ThinEngine, rootUrl: String): ParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("_ParseParticleSystem")(system.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[ParticleSystem]
    inline def _ParseParticleSystem(system: Any, sceneOrEngine: ThinEngine, rootUrl: String, doNotStart: Boolean): ParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("_ParseParticleSystem")(system.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], doNotStart.asInstanceOf[js.Any])).asInstanceOf[ParticleSystem]
    /**
      * @internal
      */
    inline def _ParseParticleSystem(system: Any, sceneOrEngine: Scene, rootUrl: String): ParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("_ParseParticleSystem")(system.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[ParticleSystem]
    inline def _ParseParticleSystem(system: Any, sceneOrEngine: Scene, rootUrl: String, doNotStart: Boolean): ParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("_ParseParticleSystem")(system.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], doNotStart.asInstanceOf[js.Any])).asInstanceOf[ParticleSystem]
  }
  
  @js.native
  sealed trait SubEmitterType extends StObject
  @JSImport("babylonjs/Particles/subEmitter", "SubEmitterType")
  @js.native
  object SubEmitterType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SubEmitterType & Double] = js.native
    
    /**
      * Attached to the particle over it's lifetime
      */
    @js.native
    sealed trait ATTACHED
      extends StObject
         with SubEmitterType
    /* 0 */ val ATTACHED: typings.babylonjs.particlesSubEmitterMod.SubEmitterType.ATTACHED & Double = js.native
    
    /**
      * Created when the particle dies
      */
    @js.native
    sealed trait END
      extends StObject
         with SubEmitterType
    /* 1 */ val END: typings.babylonjs.particlesSubEmitterMod.SubEmitterType.END & Double = js.native
  }
}
