package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.IParticleSystem
import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.ParticleSystem")
@js.native
open class ParticleSystem protected ()
  extends StObject
     with typings.babylonjs.BABYLON.ParticleSystem {
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
  def this(name: String, capacity: Double, sceneOrEngine: typings.babylonjs.BABYLON.Scene) = this()
  def this(name: String, capacity: Double, sceneOrEngine: typings.babylonjs.BABYLON.ThinEngine) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: typings.babylonjs.BABYLON.Scene,
    customEffect: Nullable[typings.babylonjs.BABYLON.Effect]
  ) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: typings.babylonjs.BABYLON.ThinEngine,
    customEffect: Nullable[typings.babylonjs.BABYLON.Effect]
  ) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: typings.babylonjs.BABYLON.Scene,
    customEffect: Unit,
    isAnimationSheetEnabled: Boolean
  ) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: typings.babylonjs.BABYLON.Scene,
    customEffect: Nullable[typings.babylonjs.BABYLON.Effect],
    isAnimationSheetEnabled: Boolean
  ) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: typings.babylonjs.BABYLON.ThinEngine,
    customEffect: Unit,
    isAnimationSheetEnabled: Boolean
  ) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: typings.babylonjs.BABYLON.ThinEngine,
    customEffect: Nullable[typings.babylonjs.BABYLON.Effect],
    isAnimationSheetEnabled: Boolean
  ) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: typings.babylonjs.BABYLON.Scene,
    customEffect: Unit,
    isAnimationSheetEnabled: Boolean,
    epsilon: Double
  ) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: typings.babylonjs.BABYLON.Scene,
    customEffect: Unit,
    isAnimationSheetEnabled: Unit,
    epsilon: Double
  ) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: typings.babylonjs.BABYLON.Scene,
    customEffect: Nullable[typings.babylonjs.BABYLON.Effect],
    isAnimationSheetEnabled: Boolean,
    epsilon: Double
  ) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: typings.babylonjs.BABYLON.Scene,
    customEffect: Nullable[typings.babylonjs.BABYLON.Effect],
    isAnimationSheetEnabled: Unit,
    epsilon: Double
  ) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: typings.babylonjs.BABYLON.ThinEngine,
    customEffect: Unit,
    isAnimationSheetEnabled: Boolean,
    epsilon: Double
  ) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: typings.babylonjs.BABYLON.ThinEngine,
    customEffect: Unit,
    isAnimationSheetEnabled: Unit,
    epsilon: Double
  ) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: typings.babylonjs.BABYLON.ThinEngine,
    customEffect: Nullable[typings.babylonjs.BABYLON.Effect],
    isAnimationSheetEnabled: Boolean,
    epsilon: Double
  ) = this()
  def this(
    name: String,
    capacity: Double,
    sceneOrEngine: typings.babylonjs.BABYLON.ThinEngine,
    customEffect: Nullable[typings.babylonjs.BABYLON.Effect],
    isAnimationSheetEnabled: Unit,
    epsilon: Double
  ) = this()
  
  /**
    * Releases all held resources
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
}
/* static members */
object ParticleSystem {
  
  @JSGlobal("BABYLON.ParticleSystem")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Billboard mode will apply to all axes
    */
  @JSGlobal("BABYLON.ParticleSystem.BILLBOARDMODE_ALL")
  @js.native
  val BILLBOARDMODE_ALL: /* 7 */ Double = js.native
  
  /**
    * Special billboard mode where the particle will be biilboard to the camera but rotated to align with direction
    */
  @JSGlobal("BABYLON.ParticleSystem.BILLBOARDMODE_STRETCHED")
  @js.native
  val BILLBOARDMODE_STRETCHED: /* 8 */ Double = js.native
  
  /**
    * Special billboard mode where the particle will be billboard to the camera but only around the axis of the direction of particle emission
    */
  @JSGlobal("BABYLON.ParticleSystem.BILLBOARDMODE_STRETCHED_LOCAL")
  @js.native
  val BILLBOARDMODE_STRETCHED_LOCAL: /* 9 */ Double = js.native
  
  /**
    * Billboard mode will only apply to Y axis
    */
  @JSGlobal("BABYLON.ParticleSystem.BILLBOARDMODE_Y")
  @js.native
  val BILLBOARDMODE_Y: /* 2 */ Double = js.native
  
  /**
    * Parses a JSON object to create a particle system.
    * @param parsedParticleSystem The JSON object to parse
    * @param sceneOrEngine The scene or the engine to create the particle system in
    * @param rootUrl The root url to use to load external dependencies like texture
    * @param doNotStart Ignore the preventAutoStart attribute and does not start
    * @param capacity defines the system capacity (if null or undefined the sotred capacity will be used)
    * @returns the Parsed particle system
    */
  inline def Parse(parsedParticleSystem: Any, sceneOrEngine: typings.babylonjs.BABYLON.Scene, rootUrl: String): typings.babylonjs.BABYLON.ParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedParticleSystem.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.ParticleSystem]
  inline def Parse(
    parsedParticleSystem: Any,
    sceneOrEngine: typings.babylonjs.BABYLON.Scene,
    rootUrl: String,
    doNotStart: Boolean
  ): typings.babylonjs.BABYLON.ParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedParticleSystem.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], doNotStart.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.ParticleSystem]
  inline def Parse(
    parsedParticleSystem: Any,
    sceneOrEngine: typings.babylonjs.BABYLON.Scene,
    rootUrl: String,
    doNotStart: Boolean,
    capacity: Double
  ): typings.babylonjs.BABYLON.ParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedParticleSystem.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], doNotStart.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.ParticleSystem]
  inline def Parse(
    parsedParticleSystem: Any,
    sceneOrEngine: typings.babylonjs.BABYLON.Scene,
    rootUrl: String,
    doNotStart: Unit,
    capacity: Double
  ): typings.babylonjs.BABYLON.ParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedParticleSystem.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], doNotStart.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.ParticleSystem]
  inline def Parse(parsedParticleSystem: Any, sceneOrEngine: typings.babylonjs.BABYLON.ThinEngine, rootUrl: String): typings.babylonjs.BABYLON.ParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedParticleSystem.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.ParticleSystem]
  inline def Parse(
    parsedParticleSystem: Any,
    sceneOrEngine: typings.babylonjs.BABYLON.ThinEngine,
    rootUrl: String,
    doNotStart: Boolean
  ): typings.babylonjs.BABYLON.ParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedParticleSystem.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], doNotStart.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.ParticleSystem]
  inline def Parse(
    parsedParticleSystem: Any,
    sceneOrEngine: typings.babylonjs.BABYLON.ThinEngine,
    rootUrl: String,
    doNotStart: Boolean,
    capacity: Double
  ): typings.babylonjs.BABYLON.ParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedParticleSystem.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], doNotStart.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.ParticleSystem]
  inline def Parse(
    parsedParticleSystem: Any,
    sceneOrEngine: typings.babylonjs.BABYLON.ThinEngine,
    rootUrl: String,
    doNotStart: Unit,
    capacity: Double
  ): typings.babylonjs.BABYLON.ParticleSystem = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedParticleSystem.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any], doNotStart.asInstanceOf[js.Any], capacity.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.BABYLON.ParticleSystem]
  
  /**
    * @internal
    */
  inline def _GetAttributeNamesOrOptions(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")().asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(isAnimationSheetEnabled: Boolean): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(isAnimationSheetEnabled.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(isAnimationSheetEnabled: Boolean, isBillboardBased: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(isAnimationSheetEnabled.asInstanceOf[js.Any], isBillboardBased.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(isAnimationSheetEnabled: Boolean, isBillboardBased: Boolean, useRampGradients: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(isAnimationSheetEnabled.asInstanceOf[js.Any], isBillboardBased.asInstanceOf[js.Any], useRampGradients.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(isAnimationSheetEnabled: Boolean, isBillboardBased: Unit, useRampGradients: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(isAnimationSheetEnabled.asInstanceOf[js.Any], isBillboardBased.asInstanceOf[js.Any], useRampGradients.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(isAnimationSheetEnabled: Unit, isBillboardBased: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(isAnimationSheetEnabled.asInstanceOf[js.Any], isBillboardBased.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(isAnimationSheetEnabled: Unit, isBillboardBased: Boolean, useRampGradients: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(isAnimationSheetEnabled.asInstanceOf[js.Any], isBillboardBased.asInstanceOf[js.Any], useRampGradients.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def _GetAttributeNamesOrOptions(isAnimationSheetEnabled: Unit, isBillboardBased: Unit, useRampGradients: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetAttributeNamesOrOptions")(isAnimationSheetEnabled.asInstanceOf[js.Any], isBillboardBased.asInstanceOf[js.Any], useRampGradients.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  /**
    * @internal
    */
  inline def _GetEffectCreationOptions(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("_GetEffectCreationOptions")().asInstanceOf[js.Array[String]]
  inline def _GetEffectCreationOptions(isAnimationSheetEnabled: Boolean): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("_GetEffectCreationOptions")(isAnimationSheetEnabled.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def _GetEffectCreationOptions(isAnimationSheetEnabled: Boolean, useLogarithmicDepth: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetEffectCreationOptions")(isAnimationSheetEnabled.asInstanceOf[js.Any], useLogarithmicDepth.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def _GetEffectCreationOptions(isAnimationSheetEnabled: Unit, useLogarithmicDepth: Boolean): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("_GetEffectCreationOptions")(isAnimationSheetEnabled.asInstanceOf[js.Any], useLogarithmicDepth.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  /**
    * @internal
    */
  inline def _Parse(
    parsedParticleSystem: Any,
    particleSystem: IParticleSystem,
    sceneOrEngine: typings.babylonjs.BABYLON.Scene,
    rootUrl: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_Parse")(parsedParticleSystem.asInstanceOf[js.Any], particleSystem.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def _Parse(
    parsedParticleSystem: Any,
    particleSystem: IParticleSystem,
    sceneOrEngine: typings.babylonjs.BABYLON.ThinEngine,
    rootUrl: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_Parse")(parsedParticleSystem.asInstanceOf[js.Any], particleSystem.asInstanceOf[js.Any], sceneOrEngine.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * @internal
    */
  inline def _Serialize(serializationObject: Any, particleSystem: IParticleSystem, serializeTexture: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_Serialize")(serializationObject.asInstanceOf[js.Any], particleSystem.asInstanceOf[js.Any], serializeTexture.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
