package typings.babylonjs

import typings.babylonjs.anon.Segments
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typings.babylonjs.particlesIparticlesystemMod.IParticleSystem
import typings.babylonjs.sceneMod.IDisposable
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object particlesParticleSystemSetMod {
  
  @JSImport("babylonjs/Particles/particleSystemSet", "ParticleSystemSet")
  @js.native
  open class ParticleSystemSet ()
    extends StObject
       with IDisposable {
    
    /* private */ var _emitterCreationOptions: Any = js.native
    
    /* private */ var _emitterNode: Any = js.native
    
    /* private */ var _emitterNodeIsOwned: Any = js.native
    
    /**
      * Releases all held resources
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
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
    def setEmitterAsSphere(options: Segments, renderingGroupId: Double, scene: Scene): Unit = js.native
    
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
  /* static members */
  object ParticleSystemSet {
    
    @JSImport("babylonjs/Particles/particleSystemSet", "ParticleSystemSet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets or sets base Assets URL
      */
    @JSImport("babylonjs/Particles/particleSystemSet", "ParticleSystemSet.BaseAssetsUrl")
    @js.native
    def BaseAssetsUrl: String = js.native
    inline def BaseAssetsUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BaseAssetsUrl")(x.asInstanceOf[js.Any])
    
    /**
      * Parse a new ParticleSystemSet from a serialized source
      * @param data defines a JSON compatible representation of the set
      * @param scene defines the hosting scene
      * @param gpu defines if we want GPU particles or CPU particles
      * @param capacity defines the system capacity (if null or undefined the sotred capacity will be used)
      * @returns a new ParticleSystemSet
      */
    inline def Parse(data: Any, scene: Scene): ParticleSystemSet = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(data.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[ParticleSystemSet]
    inline def Parse(data: Any, scene: Scene, gpu: Boolean): ParticleSystemSet = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(data.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], gpu.asInstanceOf[js.Any])).asInstanceOf[ParticleSystemSet]
    inline def Parse(data: Any, scene: Scene, gpu: Boolean, capacity: Double): ParticleSystemSet = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(data.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], gpu.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[ParticleSystemSet]
    inline def Parse(data: Any, scene: Scene, gpu: Unit, capacity: Double): ParticleSystemSet = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(data.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], gpu.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[ParticleSystemSet]
  }
}
