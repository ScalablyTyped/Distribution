package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.anon.BSphereRadiusFactor
import typings.babylonjs.anon.Partialcapacitynumberrand
import typings.babylonjs.anon.`0`
import typings.babylonjs.boundingInfoMod.BoundingInfo
import typings.babylonjs.effectFallbacksMod.EffectFallbacks
import typings.babylonjs.effectMod.Effect
import typings.babylonjs.iparticlesystemMod.IParticleSystem
import typings.babylonjs.materialMod.Material
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.thinEngineMod.ThinEngine
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object particlesIndexMod {
  
  @JSImport("babylonjs/Particles/index", "BaseParticleSystem")
  @js.native
  class BaseParticleSystem protected ()
    extends typings.babylonjs.baseParticleSystemMod.BaseParticleSystem {
    /**
      * Instantiates a particle system.
      * Particles are often small sprites used to simulate hard-to-reproduce phenomena like fire, smoke, water, or abstract visual effects like magic glitter and faery dust.
      * @param name The name of the particle system
      */
    def this(name: String) = this()
  }
  /* static members */
  object BaseParticleSystem {
    
    @JSImport("babylonjs/Particles/index", "BaseParticleSystem")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Add current color and particle color multiplied by particle’s alpha
      */
    @JSImport("babylonjs/Particles/index", "BaseParticleSystem.BLENDMODE_ADD")
    @js.native
    def BLENDMODE_ADD: Double = js.native
    @scala.inline
    def BLENDMODE_ADD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BLENDMODE_ADD")(x.asInstanceOf[js.Any])
    
    /**
      * Multiply current color with particle color
      */
    @JSImport("babylonjs/Particles/index", "BaseParticleSystem.BLENDMODE_MULTIPLY")
    @js.native
    def BLENDMODE_MULTIPLY: Double = js.native
    
    /**
      * Multiply current color with particle color then add current color and particle color multiplied by particle’s alpha
      */
    @JSImport("babylonjs/Particles/index", "BaseParticleSystem.BLENDMODE_MULTIPLYADD")
    @js.native
    def BLENDMODE_MULTIPLYADD: Double = js.native
    @scala.inline
    def BLENDMODE_MULTIPLYADD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BLENDMODE_MULTIPLYADD")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def BLENDMODE_MULTIPLY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BLENDMODE_MULTIPLY")(x.asInstanceOf[js.Any])
    
    /**
      * Source color is added to the destination color without alpha affecting the result
      */
    @JSImport("babylonjs/Particles/index", "BaseParticleSystem.BLENDMODE_ONEONE")
    @js.native
    def BLENDMODE_ONEONE: Double = js.native
    @scala.inline
    def BLENDMODE_ONEONE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BLENDMODE_ONEONE")(x.asInstanceOf[js.Any])
    
    /**
      * Blend current color and particle color using particle’s alpha
      */
    @JSImport("babylonjs/Particles/index", "BaseParticleSystem.BLENDMODE_STANDARD")
    @js.native
    def BLENDMODE_STANDARD: Double = js.native
    @scala.inline
    def BLENDMODE_STANDARD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BLENDMODE_STANDARD")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Particles/index", "BoxParticleEmitter")
  @js.native
  /**
    * Creates a new instance BoxParticleEmitter
    */
  class BoxParticleEmitter ()
    extends typings.babylonjs.emitterTypesIndexMod.BoxParticleEmitter
  
  @JSImport("babylonjs/Particles/index", "CloudPoint")
  @js.native
  class CloudPoint protected ()
    extends typings.babylonjs.cloudPointMod.CloudPoint {
    /**
      * Creates a Point Cloud object.
      * Don't create particles manually, use instead the PCS internal tools like _addParticle()
      * @param particleIndex (integer) is the particle index in the PCS pool. It's also the particle identifier.
      * @param group (PointsGroup) is the group the particle belongs to
      * @param groupId (integer) is the group identifier in the PCS.
      * @param idxInGroup (integer) is the index of the particle in the current point group (ex: the 10th point of addPoints(30))
      * @param pcs defines the PCS it is associated to
      */
    def this(
      particleIndex: Double,
      group: typings.babylonjs.cloudPointMod.PointsGroup,
      groupId: Double,
      idxInGroup: Double,
      pcs: typings.babylonjs.pointsCloudSystemMod.PointsCloudSystem
    ) = this()
  }
  
  @JSImport("babylonjs/Particles/index", "ConeParticleEmitter")
  @js.native
  /**
    * Creates a new instance ConeParticleEmitter
    * @param radius the radius of the emission cone (1 by default)
    * @param angle the cone base angle (PI by default)
    * @param directionRandomizer defines how much to randomize the particle direction [0-1] (default is 0)
    */
  class ConeParticleEmitter ()
    extends typings.babylonjs.emitterTypesIndexMod.ConeParticleEmitter {
    def this(radius: Double) = this()
    def this(radius: js.UndefOr[scala.Nothing], angle: Double) = this()
    def this(radius: Double, angle: Double) = this()
    def this(
      radius: js.UndefOr[scala.Nothing],
      angle: js.UndefOr[scala.Nothing],
      /** defines how much to randomize the particle direction [0-1] (default is 0) */
    directionRandomizer: Double
    ) = this()
    def this(
      radius: js.UndefOr[scala.Nothing],
      angle: Double,
      /** defines how much to randomize the particle direction [0-1] (default is 0) */
    directionRandomizer: Double
    ) = this()
    def this(
      radius: Double,
      angle: js.UndefOr[scala.Nothing],
      /** defines how much to randomize the particle direction [0-1] (default is 0) */
    directionRandomizer: Double
    ) = this()
    def this(
      radius: Double,
      angle: Double,
      /** defines how much to randomize the particle direction [0-1] (default is 0) */
    directionRandomizer: Double
    ) = this()
  }
  
  @JSImport("babylonjs/Particles/index", "CustomParticleEmitter")
  @js.native
  /**
    * Creates a new instance CustomParticleEmitter
    */
  class CustomParticleEmitter ()
    extends typings.babylonjs.emitterTypesIndexMod.CustomParticleEmitter
  
  @JSImport("babylonjs/Particles/index", "CylinderDirectedParticleEmitter")
  @js.native
  /**
    * Creates a new instance CylinderDirectedParticleEmitter
    * @param radius the radius of the emission cylinder (1 by default)
    * @param height the height of the emission cylinder (1 by default)
    * @param radiusRange the range of the emission cylinder [0-1] 0 Surface only, 1 Entire Radius (1 by default)
    * @param direction1 the min limit of the emission direction (up vector by default)
    * @param direction2 the max limit of the emission direction (up vector by default)
    */
  class CylinderDirectedParticleEmitter ()
    extends typings.babylonjs.emitterTypesIndexMod.CylinderDirectedParticleEmitter {
    def this(radius: Double) = this()
    def this(radius: js.UndefOr[scala.Nothing], height: Double) = this()
    def this(radius: Double, height: Double) = this()
    def this(radius: js.UndefOr[scala.Nothing], height: js.UndefOr[scala.Nothing], radiusRange: Double) = this()
    def this(radius: js.UndefOr[scala.Nothing], height: Double, radiusRange: Double) = this()
    def this(radius: Double, height: js.UndefOr[scala.Nothing], radiusRange: Double) = this()
    def this(radius: Double, height: Double, radiusRange: Double) = this()
    def this(
      radius: js.UndefOr[scala.Nothing],
      height: js.UndefOr[scala.Nothing],
      radiusRange: js.UndefOr[scala.Nothing],
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3
    ) = this()
    def this(
      radius: js.UndefOr[scala.Nothing],
      height: js.UndefOr[scala.Nothing],
      radiusRange: Double,
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3
    ) = this()
    def this(
      radius: js.UndefOr[scala.Nothing],
      height: Double,
      radiusRange: js.UndefOr[scala.Nothing],
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3
    ) = this()
    def this(
      radius: js.UndefOr[scala.Nothing],
      height: Double,
      radiusRange: Double,
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3
    ) = this()
    def this(
      radius: Double,
      height: js.UndefOr[scala.Nothing],
      radiusRange: js.UndefOr[scala.Nothing],
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3
    ) = this()
    def this(
      radius: Double,
      height: js.UndefOr[scala.Nothing],
      radiusRange: Double,
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3
    ) = this()
    def this(
      radius: Double,
      height: Double,
      radiusRange: js.UndefOr[scala.Nothing],
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3
    ) = this()
    def this(
      radius: Double,
      height: Double,
      radiusRange: Double,
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3
    ) = this()
    def this(
      radius: js.UndefOr[scala.Nothing],
      height: js.UndefOr[scala.Nothing],
      radiusRange: js.UndefOr[scala.Nothing],
      /**
      * The min limit of the emission direction.
      */
    direction1: js.UndefOr[scala.Nothing],
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: js.UndefOr[scala.Nothing],
      height: js.UndefOr[scala.Nothing],
      radiusRange: js.UndefOr[scala.Nothing],
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3,
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: js.UndefOr[scala.Nothing],
      height: js.UndefOr[scala.Nothing],
      radiusRange: Double,
      /**
      * The min limit of the emission direction.
      */
    direction1: js.UndefOr[scala.Nothing],
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: js.UndefOr[scala.Nothing],
      height: js.UndefOr[scala.Nothing],
      radiusRange: Double,
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3,
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: js.UndefOr[scala.Nothing],
      height: Double,
      radiusRange: js.UndefOr[scala.Nothing],
      /**
      * The min limit of the emission direction.
      */
    direction1: js.UndefOr[scala.Nothing],
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: js.UndefOr[scala.Nothing],
      height: Double,
      radiusRange: js.UndefOr[scala.Nothing],
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3,
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: js.UndefOr[scala.Nothing],
      height: Double,
      radiusRange: Double,
      /**
      * The min limit of the emission direction.
      */
    direction1: js.UndefOr[scala.Nothing],
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: js.UndefOr[scala.Nothing],
      height: Double,
      radiusRange: Double,
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3,
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: Double,
      height: js.UndefOr[scala.Nothing],
      radiusRange: js.UndefOr[scala.Nothing],
      /**
      * The min limit of the emission direction.
      */
    direction1: js.UndefOr[scala.Nothing],
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: Double,
      height: js.UndefOr[scala.Nothing],
      radiusRange: js.UndefOr[scala.Nothing],
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3,
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: Double,
      height: js.UndefOr[scala.Nothing],
      radiusRange: Double,
      /**
      * The min limit of the emission direction.
      */
    direction1: js.UndefOr[scala.Nothing],
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: Double,
      height: js.UndefOr[scala.Nothing],
      radiusRange: Double,
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3,
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: Double,
      height: Double,
      radiusRange: js.UndefOr[scala.Nothing],
      /**
      * The min limit of the emission direction.
      */
    direction1: js.UndefOr[scala.Nothing],
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: Double,
      height: Double,
      radiusRange: js.UndefOr[scala.Nothing],
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3,
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: Double,
      height: Double,
      radiusRange: Double,
      /**
      * The min limit of the emission direction.
      */
    direction1: js.UndefOr[scala.Nothing],
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: Double,
      height: Double,
      radiusRange: Double,
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3,
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
  }
  
  @JSImport("babylonjs/Particles/index", "CylinderParticleEmitter")
  @js.native
  /**
    * Creates a new instance CylinderParticleEmitter
    * @param radius the radius of the emission cylinder (1 by default)
    * @param height the height of the emission cylinder (1 by default)
    * @param radiusRange the range of the emission cylinder [0-1] 0 Surface only, 1 Entire Radius (1 by default)
    * @param directionRandomizer defines how much to randomize the particle direction [0-1]
    */
  class CylinderParticleEmitter ()
    extends typings.babylonjs.emitterTypesIndexMod.CylinderParticleEmitter {
    def this(/**
      * The radius of the emission cylinder.
      */
    radius: Double) = this()
    def this(
      /**
      * The radius of the emission cylinder.
      */
    radius: js.UndefOr[scala.Nothing],
      /**
      * The height of the emission cylinder.
      */
    height: Double
    ) = this()
    def this(
      /**
      * The radius of the emission cylinder.
      */
    radius: Double,
      /**
      * The height of the emission cylinder.
      */
    height: Double
    ) = this()
    def this(
      /**
      * The radius of the emission cylinder.
      */
    radius: js.UndefOr[scala.Nothing],
      /**
      * The height of the emission cylinder.
      */
    height: js.UndefOr[scala.Nothing],
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Double
    ) = this()
    def this(
      /**
      * The radius of the emission cylinder.
      */
    radius: js.UndefOr[scala.Nothing],
      /**
      * The height of the emission cylinder.
      */
    height: Double,
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Double
    ) = this()
    def this(
      /**
      * The radius of the emission cylinder.
      */
    radius: Double,
      /**
      * The height of the emission cylinder.
      */
    height: js.UndefOr[scala.Nothing],
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Double
    ) = this()
    def this(
      /**
      * The radius of the emission cylinder.
      */
    radius: Double,
      /**
      * The height of the emission cylinder.
      */
    height: Double,
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Double
    ) = this()
    def this(
      /**
      * The radius of the emission cylinder.
      */
    radius: js.UndefOr[scala.Nothing],
      /**
      * The height of the emission cylinder.
      */
    height: js.UndefOr[scala.Nothing],
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: js.UndefOr[scala.Nothing],
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
    def this(
      /**
      * The radius of the emission cylinder.
      */
    radius: js.UndefOr[scala.Nothing],
      /**
      * The height of the emission cylinder.
      */
    height: js.UndefOr[scala.Nothing],
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Double,
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
    def this(
      /**
      * The radius of the emission cylinder.
      */
    radius: js.UndefOr[scala.Nothing],
      /**
      * The height of the emission cylinder.
      */
    height: Double,
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: js.UndefOr[scala.Nothing],
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
    def this(
      /**
      * The radius of the emission cylinder.
      */
    radius: js.UndefOr[scala.Nothing],
      /**
      * The height of the emission cylinder.
      */
    height: Double,
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Double,
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
    def this(
      /**
      * The radius of the emission cylinder.
      */
    radius: Double,
      /**
      * The height of the emission cylinder.
      */
    height: js.UndefOr[scala.Nothing],
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: js.UndefOr[scala.Nothing],
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
    def this(
      /**
      * The radius of the emission cylinder.
      */
    radius: Double,
      /**
      * The height of the emission cylinder.
      */
    height: js.UndefOr[scala.Nothing],
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Double,
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
    def this(
      /**
      * The radius of the emission cylinder.
      */
    radius: Double,
      /**
      * The height of the emission cylinder.
      */
    height: Double,
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: js.UndefOr[scala.Nothing],
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
    def this(
      /**
      * The radius of the emission cylinder.
      */
    radius: Double,
      /**
      * The height of the emission cylinder.
      */
    height: Double,
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Double,
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
  }
  
  @JSImport("babylonjs/Particles/index", "DepthSortedParticle")
  @js.native
  class DepthSortedParticle protected ()
    extends typings.babylonjs.solidParticleMod.DepthSortedParticle {
    /**
      * Creates a new sorted particle
      * @param materialIndex
      */
    def this(idx: Double, ind: Double, indLength: Double, materialIndex: Double) = this()
  }
  
  @JSImport("babylonjs/Particles/index", "GPUParticleSystem")
  @js.native
  class GPUParticleSystem protected ()
    extends typings.babylonjs.gpuParticleSystemMod.GPUParticleSystem {
    /**
      * Instantiates a GPU particle system.
      * Particles are often small sprites used to simulate hard-to-reproduce phenomena like fire, smoke, water, or abstract visual effects like magic glitter and faery dust.
      * @param name The name of the particle system
      * @param options The options used to create the system
      * @param sceneOrEngine The scene the particle system belongs to or the engine to use if no scene
      * @param isAnimationSheetEnabled Must be true if using a spritesheet to animate the particles texture
      * @param customEffect a custom effect used to change the way particles are rendered by default
      */
    def this(name: String, options: Partialcapacitynumberrand, sceneOrEngine: Scene) = this()
    def this(name: String, options: Partialcapacitynumberrand, sceneOrEngine: ThinEngine) = this()
    def this(
      name: String,
      options: Partialcapacitynumberrand,
      sceneOrEngine: Scene,
      isAnimationSheetEnabled: Boolean
    ) = this()
    def this(
      name: String,
      options: Partialcapacitynumberrand,
      sceneOrEngine: ThinEngine,
      isAnimationSheetEnabled: Boolean
    ) = this()
    def this(
      name: String,
      options: Partialcapacitynumberrand,
      sceneOrEngine: Scene,
      isAnimationSheetEnabled: js.UndefOr[scala.Nothing],
      customEffect: Nullable[Effect]
    ) = this()
    def this(
      name: String,
      options: Partialcapacitynumberrand,
      sceneOrEngine: Scene,
      isAnimationSheetEnabled: Boolean,
      customEffect: Nullable[Effect]
    ) = this()
    def this(
      name: String,
      options: Partialcapacitynumberrand,
      sceneOrEngine: ThinEngine,
      isAnimationSheetEnabled: js.UndefOr[scala.Nothing],
      customEffect: Nullable[Effect]
    ) = this()
    def this(
      name: String,
      options: Partialcapacitynumberrand,
      sceneOrEngine: ThinEngine,
      isAnimationSheetEnabled: Boolean,
      customEffect: Nullable[Effect]
    ) = this()
  }
  /* static members */
  object GPUParticleSystem {
    
    /**
      * Parses a JSON object to create a GPU particle system.
      * @param parsedParticleSystem The JSON object to parse
      * @param sceneOrEngine The scene or the engine to create the particle system in
      * @param rootUrl The root url to use to load external dependencies like texture
      * @param doNotStart Ignore the preventAutoStart attribute and does not start
      * @returns the parsed GPU particle system
      */
    @JSImport("babylonjs/Particles/index", "GPUParticleSystem.Parse")
    @js.native
    def Parse(parsedParticleSystem: js.Any, sceneOrEngine: Scene, rootUrl: String): typings.babylonjs.gpuParticleSystemMod.GPUParticleSystem = js.native
    @JSImport("babylonjs/Particles/index", "GPUParticleSystem.Parse")
    @js.native
    def Parse(parsedParticleSystem: js.Any, sceneOrEngine: Scene, rootUrl: String, doNotStart: Boolean): typings.babylonjs.gpuParticleSystemMod.GPUParticleSystem = js.native
    @JSImport("babylonjs/Particles/index", "GPUParticleSystem.Parse")
    @js.native
    def Parse(parsedParticleSystem: js.Any, sceneOrEngine: ThinEngine, rootUrl: String): typings.babylonjs.gpuParticleSystemMod.GPUParticleSystem = js.native
    @JSImport("babylonjs/Particles/index", "GPUParticleSystem.Parse")
    @js.native
    def Parse(parsedParticleSystem: js.Any, sceneOrEngine: ThinEngine, rootUrl: String, doNotStart: Boolean): typings.babylonjs.gpuParticleSystemMod.GPUParticleSystem = js.native
  }
  
  @JSImport("babylonjs/Particles/index", "HemisphericParticleEmitter")
  @js.native
  /**
    * Creates a new instance HemisphericParticleEmitter
    * @param radius the radius of the emission hemisphere (1 by default)
    * @param radiusRange the range of the emission hemisphere [0-1] 0 Surface only, 1 Entire Radius (1 by default)
    * @param directionRandomizer defines how much to randomize the particle direction [0-1]
    */
  class HemisphericParticleEmitter ()
    extends typings.babylonjs.emitterTypesIndexMod.HemisphericParticleEmitter {
    def this(/**
      * The radius of the emission hemisphere.
      */
    radius: Double) = this()
    def this(
      /**
      * The radius of the emission hemisphere.
      */
    radius: js.UndefOr[scala.Nothing],
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Double
    ) = this()
    def this(
      /**
      * The radius of the emission hemisphere.
      */
    radius: Double,
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Double
    ) = this()
    def this(
      /**
      * The radius of the emission hemisphere.
      */
    radius: js.UndefOr[scala.Nothing],
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: js.UndefOr[scala.Nothing],
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
    def this(
      /**
      * The radius of the emission hemisphere.
      */
    radius: js.UndefOr[scala.Nothing],
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Double,
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
    def this(
      /**
      * The radius of the emission hemisphere.
      */
    radius: Double,
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: js.UndefOr[scala.Nothing],
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
    def this(
      /**
      * The radius of the emission hemisphere.
      */
    radius: Double,
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Double,
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
  }
  
  @JSImport("babylonjs/Particles/index", "MeshParticleEmitter")
  @js.native
  /**
    * Creates a new instance MeshParticleEmitter
    * @param mesh defines the mesh to use as source
    */
  class MeshParticleEmitter ()
    extends typings.babylonjs.emitterTypesIndexMod.MeshParticleEmitter {
    def this(mesh: Nullable[AbstractMesh]) = this()
  }
  
  @JSImport("babylonjs/Particles/index", "ModelShape")
  @js.native
  class ModelShape protected ()
    extends typings.babylonjs.solidParticleMod.ModelShape {
    /**
      * Creates a ModelShape object. This is an internal simplified reference to a mesh used as for a model to replicate particles from by the SPS.
      * SPS internal tool, don't use it manually.
      * @hidden
      */
    def this(
      id: Double,
      shape: js.Array[Vector3],
      indices: js.Array[Double],
      normals: js.Array[Double],
      colors: js.Array[Double],
      shapeUV: js.Array[Double],
      posFunction: Nullable[
            js.Function3[
              /* particle */ typings.babylonjs.solidParticleMod.SolidParticle, 
              /* i */ Double, 
              /* s */ Double, 
              Unit
            ]
          ],
      vtxFunction: Nullable[
            js.Function3[
              /* particle */ typings.babylonjs.solidParticleMod.SolidParticle, 
              /* vertex */ Vector3, 
              /* i */ Double, 
              Unit
            ]
          ],
      material: Nullable[Material]
    ) = this()
  }
  
  @JSImport("babylonjs/Particles/index", "Particle")
  @js.native
  class Particle protected ()
    extends typings.babylonjs.particleMod.Particle {
    /**
      * Creates a new instance Particle
      * @param particleSystem the particle system the particle belongs to
      */
    def this(/**
      * The particle system the particle belongs to.
      */
    particleSystem: typings.babylonjs.particleSystemMod.ParticleSystem) = this()
  }
  /* static members */
  object Particle {
    
    @JSImport("babylonjs/Particles/index", "Particle")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Particles/index", "Particle._Count")
    @js.native
    def _Count: js.Any = js.native
    @scala.inline
    def _Count_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Count")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Particles/index", "ParticleHelper")
  @js.native
  class ParticleHelper ()
    extends typings.babylonjs.particleHelperMod.ParticleHelper
  /* static members */
  object ParticleHelper {
    
    @JSImport("babylonjs/Particles/index", "ParticleHelper")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets or sets base Assets URL
      */
    @JSImport("babylonjs/Particles/index", "ParticleHelper.BaseAssetsUrl")
    @js.native
    def BaseAssetsUrl: String = js.native
    @scala.inline
    def BaseAssetsUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BaseAssetsUrl")(x.asInstanceOf[js.Any])
    
    /**
      * This is the main static method (one-liner) of this helper to create different particle systems
      * @param type This string represents the type to the particle system to create
      * @param scene The scene where the particle system should live
      * @param gpu If the system will use gpu
      * @returns the ParticleSystemSet created
      */
    @JSImport("babylonjs/Particles/index", "ParticleHelper.CreateAsync")
    @js.native
    def CreateAsync(`type`: String, scene: Nullable[Scene]): js.Promise[typings.babylonjs.particleSystemSetMod.ParticleSystemSet] = js.native
    @JSImport("babylonjs/Particles/index", "ParticleHelper.CreateAsync")
    @js.native
    def CreateAsync(`type`: String, scene: Nullable[Scene], gpu: Boolean): js.Promise[typings.babylonjs.particleSystemSetMod.ParticleSystemSet] = js.native
    
    /**
      * Create a default particle system that you can tweak
      * @param emitter defines the emitter to use
      * @param capacity defines the system capacity (default is 500 particles)
      * @param scene defines the hosting scene
      * @param useGPU defines if a GPUParticleSystem must be created (default is false)
      * @returns the new Particle system
      */
    @JSImport("babylonjs/Particles/index", "ParticleHelper.CreateDefault")
    @js.native
    def CreateDefault(emitter: Nullable[AbstractMesh | Vector3]): IParticleSystem = js.native
    @JSImport("babylonjs/Particles/index", "ParticleHelper.CreateDefault")
    @js.native
    def CreateDefault(
      emitter: Nullable[AbstractMesh | Vector3],
      capacity: js.UndefOr[scala.Nothing],
      scene: js.UndefOr[scala.Nothing],
      useGPU: Boolean
    ): IParticleSystem = js.native
    @JSImport("babylonjs/Particles/index", "ParticleHelper.CreateDefault")
    @js.native
    def CreateDefault(emitter: Nullable[AbstractMesh | Vector3], capacity: js.UndefOr[scala.Nothing], scene: Scene): IParticleSystem = js.native
    @JSImport("babylonjs/Particles/index", "ParticleHelper.CreateDefault")
    @js.native
    def CreateDefault(
      emitter: Nullable[AbstractMesh | Vector3],
      capacity: js.UndefOr[scala.Nothing],
      scene: Scene,
      useGPU: Boolean
    ): IParticleSystem = js.native
    @JSImport("babylonjs/Particles/index", "ParticleHelper.CreateDefault")
    @js.native
    def CreateDefault(emitter: Nullable[AbstractMesh | Vector3], capacity: Double): IParticleSystem = js.native
    @JSImport("babylonjs/Particles/index", "ParticleHelper.CreateDefault")
    @js.native
    def CreateDefault(
      emitter: Nullable[AbstractMesh | Vector3],
      capacity: Double,
      scene: js.UndefOr[scala.Nothing],
      useGPU: Boolean
    ): IParticleSystem = js.native
    @JSImport("babylonjs/Particles/index", "ParticleHelper.CreateDefault")
    @js.native
    def CreateDefault(emitter: Nullable[AbstractMesh | Vector3], capacity: Double, scene: Scene): IParticleSystem = js.native
    @JSImport("babylonjs/Particles/index", "ParticleHelper.CreateDefault")
    @js.native
    def CreateDefault(emitter: Nullable[AbstractMesh | Vector3], capacity: Double, scene: Scene, useGPU: Boolean): IParticleSystem = js.native
    
    /**
      * Creates a particle system from a snippet saved by the particle system editor
      * @param snippetId defines the snippet to load (can be set to _BLANK to create a default one)
      * @param scene defines the hosting scene
      * @param gpu If the system will use gpu
      * @param rootUrl defines the root URL to use to load textures and relative dependencies
      * @returns a promise that will resolve to the new particle system
      */
    @JSImport("babylonjs/Particles/index", "ParticleHelper.CreateFromSnippetAsync")
    @js.native
    def CreateFromSnippetAsync(snippetId: String, scene: Scene): js.Promise[IParticleSystem] = js.native
    @JSImport("babylonjs/Particles/index", "ParticleHelper.CreateFromSnippetAsync")
    @js.native
    def CreateFromSnippetAsync(snippetId: String, scene: Scene, gpu: js.UndefOr[scala.Nothing], rootUrl: String): js.Promise[IParticleSystem] = js.native
    @JSImport("babylonjs/Particles/index", "ParticleHelper.CreateFromSnippetAsync")
    @js.native
    def CreateFromSnippetAsync(snippetId: String, scene: Scene, gpu: Boolean): js.Promise[IParticleSystem] = js.native
    @JSImport("babylonjs/Particles/index", "ParticleHelper.CreateFromSnippetAsync")
    @js.native
    def CreateFromSnippetAsync(snippetId: String, scene: Scene, gpu: Boolean, rootUrl: String): js.Promise[IParticleSystem] = js.native
    
    /**
      * Static function used to export a particle system to a ParticleSystemSet variable.
      * Please note that the emitter shape is not exported
      * @param systems defines the particle systems to export
      * @returns the created particle system set
      */
    @JSImport("babylonjs/Particles/index", "ParticleHelper.ExportSet")
    @js.native
    def ExportSet(systems: js.Array[IParticleSystem]): typings.babylonjs.particleSystemSetMod.ParticleSystemSet = js.native
    
    /**
      * Creates a particle system from a snippet saved in a remote file
      * @param name defines the name of the particle system to create (can be null or empty to use the one from the json data)
      * @param url defines the url to load from
      * @param scene defines the hosting scene
      * @param gpu If the system will use gpu
      * @param rootUrl defines the root URL to use to load textures and relative dependencies
      * @returns a promise that will resolve to the new particle system
      */
    @JSImport("babylonjs/Particles/index", "ParticleHelper.ParseFromFileAsync")
    @js.native
    def ParseFromFileAsync(name: Nullable[String], url: String, scene: Scene): js.Promise[IParticleSystem] = js.native
    @JSImport("babylonjs/Particles/index", "ParticleHelper.ParseFromFileAsync")
    @js.native
    def ParseFromFileAsync(name: Nullable[String], url: String, scene: Scene, gpu: js.UndefOr[scala.Nothing], rootUrl: String): js.Promise[IParticleSystem] = js.native
    @JSImport("babylonjs/Particles/index", "ParticleHelper.ParseFromFileAsync")
    @js.native
    def ParseFromFileAsync(name: Nullable[String], url: String, scene: Scene, gpu: Boolean): js.Promise[IParticleSystem] = js.native
    @JSImport("babylonjs/Particles/index", "ParticleHelper.ParseFromFileAsync")
    @js.native
    def ParseFromFileAsync(name: Nullable[String], url: String, scene: Scene, gpu: Boolean, rootUrl: String): js.Promise[IParticleSystem] = js.native
    
    /** Define the Url to load snippets */
    @JSImport("babylonjs/Particles/index", "ParticleHelper.SnippetUrl")
    @js.native
    def SnippetUrl: String = js.native
    @scala.inline
    def SnippetUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SnippetUrl")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("babylonjs/Particles/index", "ParticleSystem")
  @js.native
  class ParticleSystem protected ()
    extends typings.babylonjs.particleSystemMod.ParticleSystem {
    /**
      * Instantiates a particle system.
      * Particles are often small sprites used to simulate hard-to-reproduce phenomena like fire, smoke, water, or abstract visual effects like magic glitter and faery dust.
      * @param name The name of the particle system
      * @param capacity The max number of particles alive at the same time
      * @param sceneOrEngine The scene the particle system belongs to or the engine to use if no scene
      * @param customEffect a custom effect used to change the way particles are rendered by default
      * @param isAnimationSheetEnabled Must be true if using a spritesheet to animate the particles texture
      * @param epsilon Offset used to render the particles
      */
    def this(name: String, capacity: Double, sceneOrEngine: Scene) = this()
    def this(name: String, capacity: Double, sceneOrEngine: ThinEngine) = this()
    def this(name: String, capacity: Double, sceneOrEngine: Scene, customEffect: Nullable[Effect]) = this()
    def this(name: String, capacity: Double, sceneOrEngine: ThinEngine, customEffect: Nullable[Effect]) = this()
    def this(
      name: String,
      capacity: Double,
      sceneOrEngine: Scene,
      customEffect: js.UndefOr[Nullable[Effect]],
      isAnimationSheetEnabled: Boolean
    ) = this()
    def this(
      name: String,
      capacity: Double,
      sceneOrEngine: ThinEngine,
      customEffect: js.UndefOr[Nullable[Effect]],
      isAnimationSheetEnabled: Boolean
    ) = this()
    def this(
      name: String,
      capacity: Double,
      sceneOrEngine: Scene,
      customEffect: js.UndefOr[Nullable[Effect]],
      isAnimationSheetEnabled: js.UndefOr[scala.Nothing],
      epsilon: Double
    ) = this()
    def this(
      name: String,
      capacity: Double,
      sceneOrEngine: Scene,
      customEffect: js.UndefOr[Nullable[Effect]],
      isAnimationSheetEnabled: Boolean,
      epsilon: Double
    ) = this()
    def this(
      name: String,
      capacity: Double,
      sceneOrEngine: ThinEngine,
      customEffect: js.UndefOr[Nullable[Effect]],
      isAnimationSheetEnabled: js.UndefOr[scala.Nothing],
      epsilon: Double
    ) = this()
    def this(
      name: String,
      capacity: Double,
      sceneOrEngine: ThinEngine,
      customEffect: js.UndefOr[Nullable[Effect]],
      isAnimationSheetEnabled: Boolean,
      epsilon: Double
    ) = this()
  }
  /* static members */
  object ParticleSystem {
    
    /**
      * Billboard mode will apply to all axes
      */
    @JSImport("babylonjs/Particles/index", "ParticleSystem.BILLBOARDMODE_ALL")
    @js.native
    val BILLBOARDMODE_ALL: Double = js.native
    
    /**
      * Special billboard mode where the particle will be biilboard to the camera but rotated to align with direction
      */
    @JSImport("babylonjs/Particles/index", "ParticleSystem.BILLBOARDMODE_STRETCHED")
    @js.native
    val BILLBOARDMODE_STRETCHED: Double = js.native
    
    /**
      * Billboard mode will only apply to Y axis
      */
    @JSImport("babylonjs/Particles/index", "ParticleSystem.BILLBOARDMODE_Y")
    @js.native
    val BILLBOARDMODE_Y: Double = js.native
    
    /**
      * Parses a JSON object to create a particle system.
      * @param parsedParticleSystem The JSON object to parse
      * @param sceneOrEngine The scene or the engine to create the particle system in
      * @param rootUrl The root url to use to load external dependencies like texture
      * @param doNotStart Ignore the preventAutoStart attribute and does not start
      * @returns the Parsed particle system
      */
    @JSImport("babylonjs/Particles/index", "ParticleSystem.Parse")
    @js.native
    def Parse(parsedParticleSystem: js.Any, sceneOrEngine: Scene, rootUrl: String): typings.babylonjs.particleSystemMod.ParticleSystem = js.native
    @JSImport("babylonjs/Particles/index", "ParticleSystem.Parse")
    @js.native
    def Parse(parsedParticleSystem: js.Any, sceneOrEngine: Scene, rootUrl: String, doNotStart: Boolean): typings.babylonjs.particleSystemMod.ParticleSystem = js.native
    @JSImport("babylonjs/Particles/index", "ParticleSystem.Parse")
    @js.native
    def Parse(parsedParticleSystem: js.Any, sceneOrEngine: ThinEngine, rootUrl: String): typings.babylonjs.particleSystemMod.ParticleSystem = js.native
    @JSImport("babylonjs/Particles/index", "ParticleSystem.Parse")
    @js.native
    def Parse(parsedParticleSystem: js.Any, sceneOrEngine: ThinEngine, rootUrl: String, doNotStart: Boolean): typings.babylonjs.particleSystemMod.ParticleSystem = js.native
    
    /** @hidden */
    @JSImport("babylonjs/Particles/index", "ParticleSystem._GetAttributeNamesOrOptions")
    @js.native
    def _GetAttributeNamesOrOptions(): js.Array[String] = js.native
    @JSImport("babylonjs/Particles/index", "ParticleSystem._GetAttributeNamesOrOptions")
    @js.native
    def _GetAttributeNamesOrOptions(
      isAnimationSheetEnabled: js.UndefOr[scala.Nothing],
      isBillboardBased: js.UndefOr[scala.Nothing],
      useRampGradients: Boolean
    ): js.Array[String] = js.native
    @JSImport("babylonjs/Particles/index", "ParticleSystem._GetAttributeNamesOrOptions")
    @js.native
    def _GetAttributeNamesOrOptions(isAnimationSheetEnabled: js.UndefOr[scala.Nothing], isBillboardBased: Boolean): js.Array[String] = js.native
    @JSImport("babylonjs/Particles/index", "ParticleSystem._GetAttributeNamesOrOptions")
    @js.native
    def _GetAttributeNamesOrOptions(
      isAnimationSheetEnabled: js.UndefOr[scala.Nothing],
      isBillboardBased: Boolean,
      useRampGradients: Boolean
    ): js.Array[String] = js.native
    @JSImport("babylonjs/Particles/index", "ParticleSystem._GetAttributeNamesOrOptions")
    @js.native
    def _GetAttributeNamesOrOptions(isAnimationSheetEnabled: Boolean): js.Array[String] = js.native
    @JSImport("babylonjs/Particles/index", "ParticleSystem._GetAttributeNamesOrOptions")
    @js.native
    def _GetAttributeNamesOrOptions(
      isAnimationSheetEnabled: Boolean,
      isBillboardBased: js.UndefOr[scala.Nothing],
      useRampGradients: Boolean
    ): js.Array[String] = js.native
    @JSImport("babylonjs/Particles/index", "ParticleSystem._GetAttributeNamesOrOptions")
    @js.native
    def _GetAttributeNamesOrOptions(isAnimationSheetEnabled: Boolean, isBillboardBased: Boolean): js.Array[String] = js.native
    @JSImport("babylonjs/Particles/index", "ParticleSystem._GetAttributeNamesOrOptions")
    @js.native
    def _GetAttributeNamesOrOptions(isAnimationSheetEnabled: Boolean, isBillboardBased: Boolean, useRampGradients: Boolean): js.Array[String] = js.native
    
    /** @hidden */
    @JSImport("babylonjs/Particles/index", "ParticleSystem._GetEffectCreationOptions")
    @js.native
    def _GetEffectCreationOptions(): js.Array[String] = js.native
    @JSImport("babylonjs/Particles/index", "ParticleSystem._GetEffectCreationOptions")
    @js.native
    def _GetEffectCreationOptions(isAnimationSheetEnabled: Boolean): js.Array[String] = js.native
    
    /** @hidden */
    @JSImport("babylonjs/Particles/index", "ParticleSystem._Parse")
    @js.native
    def _Parse(
      parsedParticleSystem: js.Any,
      particleSystem: IParticleSystem,
      sceneOrEngine: Scene,
      rootUrl: String
    ): Unit = js.native
    @JSImport("babylonjs/Particles/index", "ParticleSystem._Parse")
    @js.native
    def _Parse(
      parsedParticleSystem: js.Any,
      particleSystem: IParticleSystem,
      sceneOrEngine: ThinEngine,
      rootUrl: String
    ): Unit = js.native
    
    /** @hidden */
    @JSImport("babylonjs/Particles/index", "ParticleSystem._Serialize")
    @js.native
    def _Serialize(serializationObject: js.Any, particleSystem: IParticleSystem, serializeTexture: Boolean): Unit = js.native
  }
  
  @JSImport("babylonjs/Particles/index", "ParticleSystemSet")
  @js.native
  class ParticleSystemSet ()
    extends typings.babylonjs.particleSystemSetMod.ParticleSystemSet
  /* static members */
  object ParticleSystemSet {
    
    @JSImport("babylonjs/Particles/index", "ParticleSystemSet")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Gets or sets base Assets URL
      */
    @JSImport("babylonjs/Particles/index", "ParticleSystemSet.BaseAssetsUrl")
    @js.native
    def BaseAssetsUrl: String = js.native
    @scala.inline
    def BaseAssetsUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BaseAssetsUrl")(x.asInstanceOf[js.Any])
    
    /**
      * Parse a new ParticleSystemSet from a serialized source
      * @param data defines a JSON compatible representation of the set
      * @param scene defines the hosting scene
      * @param gpu defines if we want GPU particles or CPU particles
      * @returns a new ParticleSystemSet
      */
    @JSImport("babylonjs/Particles/index", "ParticleSystemSet.Parse")
    @js.native
    def Parse(data: js.Any, scene: Scene): typings.babylonjs.particleSystemSetMod.ParticleSystemSet = js.native
    @JSImport("babylonjs/Particles/index", "ParticleSystemSet.Parse")
    @js.native
    def Parse(data: js.Any, scene: Scene, gpu: Boolean): typings.babylonjs.particleSystemSetMod.ParticleSystemSet = js.native
  }
  
  @JSImport("babylonjs/Particles/index", "PointColor")
  @js.native
  object PointColor extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.babylonjs.pointsCloudSystemMod.PointColor with Double] = js.native
    
    /* 2 */ val Color: typings.babylonjs.pointsCloudSystemMod.PointColor.Color with Double = js.native
    
    /* 0 */ val Random: typings.babylonjs.pointsCloudSystemMod.PointColor.Random with Double = js.native
    
    /* 3 */ val Stated: typings.babylonjs.pointsCloudSystemMod.PointColor.Stated with Double = js.native
    
    /* 1 */ val UV: typings.babylonjs.pointsCloudSystemMod.PointColor.UV with Double = js.native
  }
  
  @JSImport("babylonjs/Particles/index", "PointParticleEmitter")
  @js.native
  /**
    * Creates a new instance PointParticleEmitter
    */
  class PointParticleEmitter ()
    extends typings.babylonjs.emitterTypesIndexMod.PointParticleEmitter
  
  @JSImport("babylonjs/Particles/index", "PointsCloudSystem")
  @js.native
  class PointsCloudSystem protected ()
    extends typings.babylonjs.pointsCloudSystemMod.PointsCloudSystem {
    /**
      * Creates a PCS (Points Cloud System) object
      * @param name (String) is the PCS name, this will be the underlying mesh name
      * @param pointSize (number) is the size for each point
      * @param scene (Scene) is the scene in which the PCS is added
      * @param options defines the options of the PCS e.g.
      * * updatable (optional boolean, default true) : if the PCS must be updatable or immutable
      */
    def this(name: String, pointSize: Double, scene: Scene) = this()
    def this(name: String, pointSize: Double, scene: Scene, options: `0`) = this()
  }
  
  @JSImport("babylonjs/Particles/index", "PointsGroup")
  @js.native
  class PointsGroup protected ()
    extends typings.babylonjs.cloudPointMod.PointsGroup {
    /**
      * Creates a points group object. This is an internal reference to produce particles for the PCS.
      * PCS internal tool, don't use it manually.
      * @hidden
      */
    def this(
      id: Double,
      posFunction: Nullable[
            js.Function3[
              /* particle */ typings.babylonjs.cloudPointMod.CloudPoint, 
              /* i */ js.UndefOr[Double], 
              /* s */ js.UndefOr[Double], 
              Unit
            ]
          ]
    ) = this()
  }
  
  @JSImport("babylonjs/Particles/index", "SolidParticle")
  @js.native
  class SolidParticle protected ()
    extends typings.babylonjs.solidParticleMod.SolidParticle {
    /**
      * Creates a Solid Particle object.
      * Don't create particles manually, use instead the Solid Particle System internal tools like _addParticle()
      * @param particleIndex (integer) is the particle index in the Solid Particle System pool.
      * @param particleId (integer) is the particle identifier. Unless some particles are removed from the SPS, it's the same value than the particle idx.
      * @param positionIndex (integer) is the starting index of the particle vertices in the SPS "positions" array.
      * @param indiceIndex (integer) is the starting index of the particle indices in the SPS "indices" array.
      * @param model (ModelShape) is a reference to the model shape on what the particle is designed.
      * @param shapeId (integer) is the model shape identifier in the SPS.
      * @param idxInShape (integer) is the index of the particle in the current model (ex: the 10th box of addShape(box, 30))
      * @param sps defines the sps it is associated to
      * @param modelBoundingInfo is the reference to the model BoundingInfo used for intersection computations.
      * @param materialIndex is the particle material identifier (integer) when the MultiMaterials are enabled in the SPS.
      */
    def this(
      particleIndex: Double,
      particleId: Double,
      positionIndex: Double,
      indiceIndex: Double,
      model: Nullable[typings.babylonjs.solidParticleMod.ModelShape],
      shapeId: Double,
      idxInShape: Double,
      sps: typings.babylonjs.solidParticleSystemMod.SolidParticleSystem
    ) = this()
    def this(
      particleIndex: Double,
      particleId: Double,
      positionIndex: Double,
      indiceIndex: Double,
      model: Nullable[typings.babylonjs.solidParticleMod.ModelShape],
      shapeId: Double,
      idxInShape: Double,
      sps: typings.babylonjs.solidParticleSystemMod.SolidParticleSystem,
      modelBoundingInfo: Nullable[BoundingInfo]
    ) = this()
    def this(
      particleIndex: Double,
      particleId: Double,
      positionIndex: Double,
      indiceIndex: Double,
      model: Nullable[typings.babylonjs.solidParticleMod.ModelShape],
      shapeId: Double,
      idxInShape: Double,
      sps: typings.babylonjs.solidParticleSystemMod.SolidParticleSystem,
      modelBoundingInfo: js.UndefOr[Nullable[BoundingInfo]],
      materialIndex: Nullable[Double]
    ) = this()
  }
  
  @JSImport("babylonjs/Particles/index", "SolidParticleSystem")
  @js.native
  class SolidParticleSystem protected ()
    extends typings.babylonjs.solidParticleSystemMod.SolidParticleSystem {
    /**
      * Creates a SPS (Solid Particle System) object.
      * @param name (String) is the SPS name, this will be the underlying mesh name.
      * @param scene (Scene) is the scene in which the SPS is added.
      * @param options defines the options of the sps e.g.
      * * updatable (optional boolean, default true) : if the SPS must be updatable or immutable.
      * * isPickable (optional boolean, default false) : if the solid particles must be pickable.
      * * enableDepthSort (optional boolean, default false) : if the solid particles must be sorted in the geometry according to their distance to the camera.
      * * useModelMaterial (optional boolean, defaut false) : if the model materials must be used to create the SPS multimaterial. This enables the multimaterial supports of the SPS.
      * * enableMultiMaterial (optional boolean, default false) : if the solid particles can be given different materials.
      * * expandable (optional boolean, default false) : if particles can still be added after the initial SPS mesh creation.
      * * particleIntersection (optional boolean, default false) : if the solid particle intersections must be computed.
      * * boundingSphereOnly (optional boolean, default false) : if the particle intersection must be computed only with the bounding sphere (no bounding box computation, so faster).
      * * bSphereRadiusFactor (optional float, default 1.0) : a number to multiply the boundind sphere radius by in order to reduce it for instance.
      * @example bSphereRadiusFactor = 1.0 / Math.sqrt(3.0) => the bounding sphere exactly matches a spherical mesh.
      */
    def this(name: String, scene: Scene) = this()
    def this(name: String, scene: Scene, options: BSphereRadiusFactor) = this()
  }
  
  @JSImport("babylonjs/Particles/index", "SolidParticleVertex")
  @js.native
  /**
    * Creates a new solid particle vertex
    */
  class SolidParticleVertex ()
    extends typings.babylonjs.solidParticleMod.SolidParticleVertex
  
  @JSImport("babylonjs/Particles/index", "SphereDirectedParticleEmitter")
  @js.native
  /**
    * Creates a new instance SphereDirectedParticleEmitter
    * @param radius the radius of the emission sphere (1 by default)
    * @param direction1 the min limit of the emission direction (up vector by default)
    * @param direction2 the max limit of the emission direction (up vector by default)
    */
  class SphereDirectedParticleEmitter ()
    extends typings.babylonjs.emitterTypesIndexMod.SphereDirectedParticleEmitter {
    def this(radius: Double) = this()
    def this(
      radius: js.UndefOr[scala.Nothing],
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3
    ) = this()
    def this(radius: Double, /**
      * The min limit of the emission direction.
      */
    direction1: Vector3) = this()
    def this(
      radius: js.UndefOr[scala.Nothing],
      /**
      * The min limit of the emission direction.
      */
    direction1: js.UndefOr[scala.Nothing],
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: js.UndefOr[scala.Nothing],
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3,
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: Double,
      /**
      * The min limit of the emission direction.
      */
    direction1: js.UndefOr[scala.Nothing],
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: Double,
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3,
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
  }
  
  @JSImport("babylonjs/Particles/index", "SphereParticleEmitter")
  @js.native
  /**
    * Creates a new instance SphereParticleEmitter
    * @param radius the radius of the emission sphere (1 by default)
    * @param radiusRange the range of the emission sphere [0-1] 0 Surface only, 1 Entire Radius (1 by default)
    * @param directionRandomizer defines how much to randomize the particle direction [0-1]
    */
  class SphereParticleEmitter ()
    extends typings.babylonjs.emitterTypesIndexMod.SphereParticleEmitter {
    def this(/**
      * The radius of the emission sphere.
      */
    radius: Double) = this()
    def this(
      /**
      * The radius of the emission sphere.
      */
    radius: js.UndefOr[scala.Nothing],
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Double
    ) = this()
    def this(
      /**
      * The radius of the emission sphere.
      */
    radius: Double,
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Double
    ) = this()
    def this(
      /**
      * The radius of the emission sphere.
      */
    radius: js.UndefOr[scala.Nothing],
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: js.UndefOr[scala.Nothing],
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
    def this(
      /**
      * The radius of the emission sphere.
      */
    radius: js.UndefOr[scala.Nothing],
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Double,
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
    def this(
      /**
      * The radius of the emission sphere.
      */
    radius: Double,
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: js.UndefOr[scala.Nothing],
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
    def this(
      /**
      * The radius of the emission sphere.
      */
    radius: Double,
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Double,
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
  }
  
  @JSImport("babylonjs/Particles/index", "SubEmitter")
  @js.native
  class SubEmitter protected ()
    extends typings.babylonjs.subEmitterMod.SubEmitter {
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
    
    /**
      * Creates a new SubEmitter from a serialized JSON version
      * @param serializationObject defines the JSON object to read from
      * @param sceneOrEngine defines the hosting scene or the hosting engine
      * @param rootUrl defines the rootUrl for data loading
      * @returns a new SubEmitter
      */
    @JSImport("babylonjs/Particles/index", "SubEmitter.Parse")
    @js.native
    def Parse(serializationObject: js.Any, sceneOrEngine: Scene, rootUrl: String): typings.babylonjs.subEmitterMod.SubEmitter = js.native
    @JSImport("babylonjs/Particles/index", "SubEmitter.Parse")
    @js.native
    def Parse(serializationObject: js.Any, sceneOrEngine: ThinEngine, rootUrl: String): typings.babylonjs.subEmitterMod.SubEmitter = js.native
    
    /** @hidden */
    @JSImport("babylonjs/Particles/index", "SubEmitter._ParseParticleSystem")
    @js.native
    def _ParseParticleSystem(system: js.Any, sceneOrEngine: Scene, rootUrl: String): typings.babylonjs.particleSystemMod.ParticleSystem = js.native
    @JSImport("babylonjs/Particles/index", "SubEmitter._ParseParticleSystem")
    @js.native
    def _ParseParticleSystem(system: js.Any, sceneOrEngine: ThinEngine, rootUrl: String): typings.babylonjs.particleSystemMod.ParticleSystem = js.native
  }
  
  @JSImport("babylonjs/Particles/index", "SubEmitterType")
  @js.native
  object SubEmitterType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.babylonjs.subEmitterMod.SubEmitterType with Double] = js.native
    
    /* 0 */ val ATTACHED: typings.babylonjs.subEmitterMod.SubEmitterType.ATTACHED with Double = js.native
    
    /* 1 */ val END: typings.babylonjs.subEmitterMod.SubEmitterType.END with Double = js.native
  }
  
  /* augmented module */
  object babylonjsEnginesEngineAugmentingMod {
    
    @js.native
    trait Engine extends StObject {
      
      /**
        * Create an effect to use with particle systems.
        * Please note that some parameters like animation sheets or not being billboard are not supported in this configuration, except if you pass
        * the particle system for which you want to create a custom effect in the last parameter
        * @param fragmentName defines the base name of the effect (The name of file without .fragment.fx)
        * @param uniformsNames defines a list of attribute names
        * @param samplers defines an array of string used to represent textures
        * @param defines defines the string containing the defines to use to compile the shaders
        * @param fallbacks defines the list of potential fallbacks to use if shader conmpilation fails
        * @param onCompiled defines a function to call when the effect creation is successful
        * @param onError defines a function to call when the effect creation has failed
        * @param particleSystem the particle system you want to create the effect for
        * @returns the new Effect
        */
      def createEffectForParticles(fragmentName: String, uniformsNames: js.Array[String], samplers: js.Array[String], defines: String): Effect = js.native
      def createEffectForParticles(
        fragmentName: String,
        uniformsNames: js.Array[String],
        samplers: js.Array[String],
        defines: String,
        fallbacks: js.UndefOr[scala.Nothing],
        onCompiled: js.UndefOr[scala.Nothing],
        onError: js.UndefOr[scala.Nothing],
        particleSystem: IParticleSystem
      ): Effect = js.native
      def createEffectForParticles(
        fragmentName: String,
        uniformsNames: js.Array[String],
        samplers: js.Array[String],
        defines: String,
        fallbacks: js.UndefOr[scala.Nothing],
        onCompiled: js.UndefOr[scala.Nothing],
        onError: js.Function2[/* effect */ Effect, /* errors */ String, Unit]
      ): Effect = js.native
      def createEffectForParticles(
        fragmentName: String,
        uniformsNames: js.Array[String],
        samplers: js.Array[String],
        defines: String,
        fallbacks: js.UndefOr[scala.Nothing],
        onCompiled: js.UndefOr[scala.Nothing],
        onError: js.Function2[/* effect */ Effect, /* errors */ String, Unit],
        particleSystem: IParticleSystem
      ): Effect = js.native
      def createEffectForParticles(
        fragmentName: String,
        uniformsNames: js.Array[String],
        samplers: js.Array[String],
        defines: String,
        fallbacks: js.UndefOr[scala.Nothing],
        onCompiled: js.Function1[/* effect */ Effect, Unit]
      ): Effect = js.native
      def createEffectForParticles(
        fragmentName: String,
        uniformsNames: js.Array[String],
        samplers: js.Array[String],
        defines: String,
        fallbacks: js.UndefOr[scala.Nothing],
        onCompiled: js.Function1[/* effect */ Effect, Unit],
        onError: js.UndefOr[scala.Nothing],
        particleSystem: IParticleSystem
      ): Effect = js.native
      def createEffectForParticles(
        fragmentName: String,
        uniformsNames: js.Array[String],
        samplers: js.Array[String],
        defines: String,
        fallbacks: js.UndefOr[scala.Nothing],
        onCompiled: js.Function1[/* effect */ Effect, Unit],
        onError: js.Function2[/* effect */ Effect, /* errors */ String, Unit]
      ): Effect = js.native
      def createEffectForParticles(
        fragmentName: String,
        uniformsNames: js.Array[String],
        samplers: js.Array[String],
        defines: String,
        fallbacks: js.UndefOr[scala.Nothing],
        onCompiled: js.Function1[/* effect */ Effect, Unit],
        onError: js.Function2[/* effect */ Effect, /* errors */ String, Unit],
        particleSystem: IParticleSystem
      ): Effect = js.native
      def createEffectForParticles(
        fragmentName: String,
        uniformsNames: js.Array[String],
        samplers: js.Array[String],
        defines: String,
        fallbacks: EffectFallbacks
      ): Effect = js.native
      def createEffectForParticles(
        fragmentName: String,
        uniformsNames: js.Array[String],
        samplers: js.Array[String],
        defines: String,
        fallbacks: EffectFallbacks,
        onCompiled: js.UndefOr[scala.Nothing],
        onError: js.UndefOr[scala.Nothing],
        particleSystem: IParticleSystem
      ): Effect = js.native
      def createEffectForParticles(
        fragmentName: String,
        uniformsNames: js.Array[String],
        samplers: js.Array[String],
        defines: String,
        fallbacks: EffectFallbacks,
        onCompiled: js.UndefOr[scala.Nothing],
        onError: js.Function2[/* effect */ Effect, /* errors */ String, Unit]
      ): Effect = js.native
      def createEffectForParticles(
        fragmentName: String,
        uniformsNames: js.Array[String],
        samplers: js.Array[String],
        defines: String,
        fallbacks: EffectFallbacks,
        onCompiled: js.UndefOr[scala.Nothing],
        onError: js.Function2[/* effect */ Effect, /* errors */ String, Unit],
        particleSystem: IParticleSystem
      ): Effect = js.native
      def createEffectForParticles(
        fragmentName: String,
        uniformsNames: js.Array[String],
        samplers: js.Array[String],
        defines: String,
        fallbacks: EffectFallbacks,
        onCompiled: js.Function1[/* effect */ Effect, Unit]
      ): Effect = js.native
      def createEffectForParticles(
        fragmentName: String,
        uniformsNames: js.Array[String],
        samplers: js.Array[String],
        defines: String,
        fallbacks: EffectFallbacks,
        onCompiled: js.Function1[/* effect */ Effect, Unit],
        onError: js.UndefOr[scala.Nothing],
        particleSystem: IParticleSystem
      ): Effect = js.native
      def createEffectForParticles(
        fragmentName: String,
        uniformsNames: js.Array[String],
        samplers: js.Array[String],
        defines: String,
        fallbacks: EffectFallbacks,
        onCompiled: js.Function1[/* effect */ Effect, Unit],
        onError: js.Function2[/* effect */ Effect, /* errors */ String, Unit]
      ): Effect = js.native
      def createEffectForParticles(
        fragmentName: String,
        uniformsNames: js.Array[String],
        samplers: js.Array[String],
        defines: String,
        fallbacks: EffectFallbacks,
        onCompiled: js.Function1[/* effect */ Effect, Unit],
        onError: js.Function2[/* effect */ Effect, /* errors */ String, Unit],
        particleSystem: IParticleSystem
      ): Effect = js.native
    }
  }
  
  /* augmented module */
  object babylonjsMeshesMeshAugmentingMod {
    
    @js.native
    trait Mesh extends StObject {
      
      /**
        * Returns an array populated with IParticleSystem objects whose the mesh is the emitter
        * @returns an array of IParticleSystem
        */
      def getEmittedParticleSystems(): js.Array[IParticleSystem] = js.native
      
      /**
        * Returns an array populated with IParticleSystem objects whose the mesh or its children are the emitter
        * @returns an array of IParticleSystem
        */
      def getHierarchyEmittedParticleSystems(): js.Array[IParticleSystem] = js.native
    }
    object Mesh {
      
      @scala.inline
      def apply(
        getEmittedParticleSystems: () => js.Array[IParticleSystem],
        getHierarchyEmittedParticleSystems: () => js.Array[IParticleSystem]
      ): Mesh = {
        val __obj = js.Dynamic.literal(getEmittedParticleSystems = js.Any.fromFunction0(getEmittedParticleSystems), getHierarchyEmittedParticleSystems = js.Any.fromFunction0(getHierarchyEmittedParticleSystems))
        __obj.asInstanceOf[Mesh]
      }
      
      @scala.inline
      implicit class MeshMutableBuilder[Self <: Mesh] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGetEmittedParticleSystems(value: () => js.Array[IParticleSystem]): Self = StObject.set(x, "getEmittedParticleSystems", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetHierarchyEmittedParticleSystems(value: () => js.Array[IParticleSystem]): Self = StObject.set(x, "getHierarchyEmittedParticleSystems", js.Any.fromFunction0(value))
      }
    }
  }
}
