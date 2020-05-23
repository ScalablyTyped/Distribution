package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.anon.ColorDiameter
import typings.babylonjs.iparticlesystemMod.IParticleSystem
import typings.babylonjs.sceneMod.IDisposable
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.transformNodeMod.TransformNode
import typings.babylonjs.typesMod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Particles/particleSystemSet", JSImport.Namespace)
@js.native
object particleSystemSetMod extends js.Object {
  @js.native
  class ParticleSystemSet () extends IDisposable {
    var _emitterCreationOptions: js.Any = js.native
    var _emitterNode: js.Any = js.native
    /**
      * Gets the particle system list
      */
    var systems: js.Array[IParticleSystem] = js.native
    /**
      * Releases all held resources
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    /**
      * Gets the emitter node used with this set
      */
    def emitterNode: Nullable[TransformNode] = js.native
    /**
      * Serialize the set into a JSON compatible object
      * @returns a JSON compatible representation of the set
      */
    def serialize(): js.Any = js.native
    /**
      * Creates a new emitter mesh as a sphere
      * @param options defines the options used to create the sphere
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
  }
  
  /* static members */
  @js.native
  object ParticleSystemSet extends js.Object {
    /**
      * Gets or sets base Assets URL
      */
    var BaseAssetsUrl: String = js.native
    /**
      * Parse a new ParticleSystemSet from a serialized source
      * @param data defines a JSON compatible representation of the set
      * @param scene defines the hosting scene
      * @param gpu defines if we want GPU particles or CPU particles
      * @returns a new ParticleSystemSet
      */
    def Parse(data: js.Any, scene: Scene): ParticleSystemSet = js.native
    def Parse(data: js.Any, scene: Scene, gpu: Boolean): ParticleSystemSet = js.native
  }
  
}

