package typings.babylonjs.indexMod

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/index", "CascadedShadowGenerator")
@js.native
open class CascadedShadowGenerator protected ()
  extends typings.babylonjs.lightsIndexMod.CascadedShadowGenerator {
  /**
    * Creates a Cascaded Shadow Generator object.
    * A ShadowGenerator is the required tool to use the shadows.
    * Each directional light casting shadows needs to use its own ShadowGenerator.
    * Documentation : https://doc.babylonjs.com/babylon101/cascadedShadows
    * @param mapSize The size of the texture what stores the shadows. Example : 1024.
    * @param light The directional light object generating the shadows.
    * @param usefulFloatFirst By default the generator will try to use half float textures but if you need precision (for self shadowing for instance), you can use this option to enforce full float texture.
    * @param camera Camera associated with this shadow generator (default: null). If null, takes the scene active camera at the time we need to access it
    */
  def this(mapSize: Double, light: typings.babylonjs.lightsDirectionalLightMod.DirectionalLight) = this()
  def this(
    mapSize: Double,
    light: typings.babylonjs.lightsDirectionalLightMod.DirectionalLight,
    usefulFloatFirst: Boolean
  ) = this()
  def this(
    mapSize: Double,
    light: typings.babylonjs.lightsDirectionalLightMod.DirectionalLight,
    usefulFloatFirst: Boolean,
    camera: Nullable[typings.babylonjs.camerasCameraMod.Camera]
  ) = this()
  def this(
    mapSize: Double,
    light: typings.babylonjs.lightsDirectionalLightMod.DirectionalLight,
    usefulFloatFirst: Unit,
    camera: Nullable[typings.babylonjs.camerasCameraMod.Camera]
  ) = this()
}
/* static members */
object CascadedShadowGenerator {
  
  @JSImport("babylonjs/index", "CascadedShadowGenerator")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Name of the CSM class
    */
  @JSImport("babylonjs/index", "CascadedShadowGenerator.CLASSNAME")
  @js.native
  def CLASSNAME: String = js.native
  inline def CLASSNAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASSNAME")(x.asInstanceOf[js.Any])
  
  /**
    * Defines the default number of cascades used by the CSM.
    */
  @JSImport("babylonjs/index", "CascadedShadowGenerator.DEFAULT_CASCADES_COUNT")
  @js.native
  val DEFAULT_CASCADES_COUNT: Double = js.native
  
  /**
    * Defines the maximum number of cascades used by the CSM.
    */
  @JSImport("babylonjs/index", "CascadedShadowGenerator.MAX_CASCADES_COUNT")
  @js.native
  def MAX_CASCADES_COUNT: Double = js.native
  inline def MAX_CASCADES_COUNT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_CASCADES_COUNT")(x.asInstanceOf[js.Any])
  
  /**
    * Defines the minimum number of cascades used by the CSM.
    */
  @JSImport("babylonjs/index", "CascadedShadowGenerator.MIN_CASCADES_COUNT")
  @js.native
  def MIN_CASCADES_COUNT: Double = js.native
  inline def MIN_CASCADES_COUNT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MIN_CASCADES_COUNT")(x.asInstanceOf[js.Any])
  
  /**
    * Parses a serialized ShadowGenerator and returns a new ShadowGenerator.
    * @param parsedShadowGenerator The JSON object to parse
    * @param scene The scene to create the shadow map for
    * @returns The parsed shadow generator
    */
  inline def Parse(parsedShadowGenerator: Any, scene: typings.babylonjs.sceneMod.Scene): typings.babylonjs.lightsShadowsShadowGeneratorMod.ShadowGenerator = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedShadowGenerator.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[typings.babylonjs.lightsShadowsShadowGeneratorMod.ShadowGenerator]
  
  @JSImport("babylonjs/index", "CascadedShadowGenerator._FrustumCornersNDCSpace")
  @js.native
  val _FrustumCornersNDCSpace: Any = js.native
  
  /**
    * @internal
    */
  inline def _SceneComponentInitialization(scene: typings.babylonjs.sceneMod.Scene): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_SceneComponentInitialization")(scene.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
