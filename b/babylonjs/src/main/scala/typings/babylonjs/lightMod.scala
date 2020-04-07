package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.effectMod.Effect
import typings.babylonjs.mathColorMod.Color3
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.nodeMod.Node
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.shadowGeneratorMod.IShadowGenerator
import typings.babylonjs.typesMod.Nullable
import typings.babylonjs.uniformBufferMod.UniformBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("babylonjs/Lights/light", JSImport.Namespace)
@js.native
object lightMod extends js.Object {
  @js.native
  abstract class Light protected () extends Node {
    /**
      * Creates a Light object in the scene.
      * Documentation : https://doc.babylonjs.com/babylon101/lights
      * @param name The firendly name of the light
      * @param scene The scene the light belongs too
      */
    def this(name: String, scene: Scene) = this()
    /**
      * Recomputes the cached photometric scale if needed.
      */
    var _computePhotometricScale: js.Any = js.native
    var _excludeWithLayerMask: js.Any = js.native
    var _excludedMeshes: js.Any = js.native
    /**
      * @hidden Internal use only.
      */
    var _excludedMeshesIds: js.Array[String] = js.native
    /**
      * Returns the Photometric Scale according to the light type and intensity mode.
      */
    var _getPhotometricScale: js.Any = js.native
    var _hookArrayForExcluded: js.Any = js.native
    var _hookArrayForIncludedOnly: js.Any = js.native
    var _includeOnlyWithLayerMask: js.Any = js.native
    var _includedOnlyMeshes: js.Any = js.native
    /**
      * @hidden Internal use only.
      */
    var _includedOnlyMeshesIds: js.Array[String] = js.native
    var _intensityMode: js.Any = js.native
    var _inverseSquaredRange: Double = js.native
    /** @hidden */
    val _isLight: Boolean = js.native
    var _lightmapMode: js.Any = js.native
    /**
      * Cached photometric scale default to 1.0 as the automatic intensity mode defaults to 1.0 for every type
      * of light.
      */
    var _photometricScale: js.Any = js.native
    var _radius: js.Any = js.native
    var _range: js.Any = js.native
    /** @hidden */
    var _renderId: Double = js.native
    var _renderPriority: js.Any = js.native
    var _resyncMeshes: js.Any = js.native
    var _shadowEnabled: js.Any = js.native
    /**
      * Shadow generator associted to the light.
      * @hidden Internal use only.
      */
    var _shadowGenerator: Nullable[IShadowGenerator] = js.native
    /**
      * The current light unifom buffer.
      * @hidden Internal use only.
      */
    var _uniformBuffer: UniformBuffer = js.native
    /**
      * Diffuse gives the basic color to an object.
      */
    var diffuse: Color3 = js.native
    /**
      * Defines the falloff type for this light. This lets overrriding how punctual light are
      * falling off base on range or angle.
      * This can be set to any values in Light.FALLOFF_x.
      *
      * Note: This is only useful for PBR Materials at the moment. This could be extended if required to
      * other types of materials.
      */
    var falloffType: Double = js.native
    /**
      * Strength of the light.
      * Note: By default it is define in the framework own unit.
      * Note: In PBR materials the intensityMode can be use to chose what unit the intensity is defined in.
      */
    var intensity: Double = js.native
    /**
      * Defines the rendering priority of the lights. It can help in case of fallback or number of lights
      * exceeding the number allowed of the materials.
      */
    var renderPriority: Double = js.native
    /**
      * Specular produces a highlight color on an object.
      * Note: This is note affecting PBR materials.
      */
    var specular: Color3 = js.native
    /**
      * Binds the lights information from the scene to the effect for the given mesh.
      * @param lightIndex Light index
      * @param scene The scene where the light belongs to
      * @param effect The effect we are binding the data to
      * @param useSpecular Defines if specular is supported
      * @param rebuildInParallel Specifies whether the shader is rebuilding in parallel
      */
    def _bindLight(lightIndex: Double, scene: Scene, effect: Effect, useSpecular: Boolean): Unit = js.native
    def _bindLight(lightIndex: Double, scene: Scene, effect: Effect, useSpecular: Boolean, rebuildInParallel: Boolean): Unit = js.native
    /* protected */ def _buildUniformLayout(): Unit = js.native
    /**
      * Forces the meshes to update their light related information in their rendering used effects
      * @hidden Internal Use Only
      */
    def _markMeshesAsLightDirty(): Unit = js.native
    /**
      * Reorder the light in the scene according to their defined priority.
      * @hidden Internal Use Only
      */
    def _reorderLightsInScene(): Unit = js.native
    /**
      * Specifies if the light will affect the passed mesh.
      * @param mesh The mesh to test against the light
      * @return true the mesh is affected otherwise, false.
      */
    def canAffectMesh(mesh: AbstractMesh): Boolean = js.native
    /**
      * Returns a new Light object, named "name", from the current one.
      * @param name The name of the cloned light
      * @returns the new created light
      */
    def clone(name: String): Nullable[Light] = js.native
    /**
      * Gets the layer id use to find what meshes are not impacted by the light.
      * Inactive if 0
      */
    def excludeWithLayerMask(): Double = js.native
    /**
      * Sets the layer id use to find what meshes are not impacted by the light.
      * Inactive if 0
      */
    def excludeWithLayerMask(value: Double): js.Any = js.native
    /**
      * Gets the meshes not impacted by this light.
      */
    def excludedMeshes(): js.Array[AbstractMesh] = js.native
    /**
      * Sets the meshes not impacted by this light.
      */
    def excludedMeshes(value: js.Array[AbstractMesh]): js.Any = js.native
    /**
      * Returns a Vector3, the absolute light position in the World.
      * @returns the world space position of the light
      */
    def getAbsolutePosition(): Vector3 = js.native
    /**
      * Returns the intensity scaled by the Photometric Scale according to the light type and intensity mode.
      * @returns the scaled intensity in intensity mode unit
      */
    def getScaledIntensity(): Double = js.native
    /**
      * Returns the Light associated shadow generator if any.
      * @return the associated shadow generator.
      */
    def getShadowGenerator(): Nullable[IShadowGenerator] = js.native
    /**
      * Returns the light type ID (integer).
      * @returns The light Type id as a constant defines in Light.LIGHTTYPEID_x
      */
    def getTypeID(): Double = js.native
    /**
      * Gets the layer id use to find what meshes are impacted by the light.
      * Inactive if 0
      */
    def includeOnlyWithLayerMask(): Double = js.native
    /**
      * Sets the layer id use to find what meshes are impacted by the light.
      * Inactive if 0
      */
    def includeOnlyWithLayerMask(value: Double): js.Any = js.native
    /**
      * Gets the only meshes impacted by this light.
      */
    def includedOnlyMeshes(): js.Array[AbstractMesh] = js.native
    /**
      * Sets the only meshes impacted by this light.
      */
    def includedOnlyMeshes(value: js.Array[AbstractMesh]): js.Any = js.native
    /**
      * Gets the photometric scale used to interpret the intensity.
      * This is only relevant with PBR Materials where the light intensity can be defined in a physical way.
      */
    def intensityMode(): Double = js.native
    /**
      * Sets the photometric scale used to interpret the intensity.
      * This is only relevant with PBR Materials where the light intensity can be defined in a physical way.
      */
    def intensityMode(value: Double): js.Any = js.native
    /**
      * Gets the lightmap mode of this light (should be one of the constants defined by Light.LIGHTMAP_x)
      */
    def lightmapMode(): Double = js.native
    /**
      * Sets the lightmap mode of this light (should be one of the constants defined by Light.LIGHTMAP_x)
      */
    def lightmapMode(value: Double): js.Any = js.native
    /**
      * Prepares the list of defines specific to the light type.
      * @param defines the list of defines
      * @param lightIndex defines the index of the light for the effect
      */
    def prepareLightSpecificDefines(defines: js.Any, lightIndex: Double): Unit = js.native
    /**
      * Gets the light radius used by PBR Materials to simulate soft area lights.
      */
    def radius(): Double = js.native
    /**
      * sets the light radius used by PBR Materials to simulate soft area lights.
      */
    def radius(value: Double): js.Any = js.native
    /**
      * Defines how far from the source the light is impacting in scene units.
      * Note: Unused in PBR material as the distance light falloff is defined following the inverse squared falloff.
      */
    def range(): Double = js.native
    /**
      * Defines how far from the source the light is impacting in scene units.
      * Note: Unused in PBR material as the distance light falloff is defined following the inverse squared falloff.
      */
    def range(value: Double): js.Any = js.native
    /**
      * Serializes the current light into a Serialization object.
      * @returns the serialized object.
      */
    def serialize(): js.Any = js.native
    /**
      * Gets wether or not the shadows are enabled for this light. This can help turning off/on shadow without detaching
      * the current shadow generator.
      */
    def shadowEnabled(): Boolean = js.native
    /**
      * Sets wether or not the shadows are enabled for this light. This can help turning off/on shadow without detaching
      * the current shadow generator.
      */
    def shadowEnabled(value: Boolean): js.Any = js.native
    def toString(fullDetails: Boolean): String = js.native
    /**
      * Sets the passed Effect "effect" with the Light textures.
      * @param effect The effect to update
      * @param lightIndex The index of the light in the effect to update
      * @returns The light
      */
    def transferTexturesToEffect(effect: Effect, lightIndex: String): Light = js.native
    /**
      * Sets the passed Effect "effect" with the Light information.
      * @param effect The effect to update
      * @param lightIndex The index of the light in the effect to update
      * @returns The light
      */
    def transferToEffect(effect: Effect, lightIndex: String): Light = js.native
    /**
      * Sets the passed Effect "effect" with the Light information.
      * @param effect The effect to update
      * @param lightDataUniformName The uniform used to store light data (position or direction)
      * @returns The light
      */
    def transferToNodeMaterialEffect(effect: Effect, lightDataUniformName: String): Light = js.native
  }
  
  /* static members */
  @js.native
  object Light extends js.Object {
    /**
      * Falloff Default: light is falling off following the material specification:
      * standard material is using standard falloff whereas pbr material can request special falloff per materials.
      */
    val FALLOFF_DEFAULT: Double = js.native
    /**
      * Falloff gltf: light is falling off as described in the gltf moving to PBR document
      * to enhance interoperability with other engines.
      */
    val FALLOFF_GLTF: Double = js.native
    /**
      * Falloff Physical: light is falling off following the inverse squared distance law.
      */
    val FALLOFF_PHYSICAL: Double = js.native
    /**
      * Falloff Standard: light is falling off like in the standard material
      * to enhance interoperability with other materials.
      */
    val FALLOFF_STANDARD: Double = js.native
    /**
      * Each light type uses the default quantity according to its type:
      *      point/spot lights use luminous intensity
      *      directional lights use illuminance
      */
    val INTENSITYMODE_AUTOMATIC: Double = js.native
    /**
      * lux (lm/m^2)
      */
    val INTENSITYMODE_ILLUMINANCE: Double = js.native
    /**
      * nit (cd/m^2)
      */
    val INTENSITYMODE_LUMINANCE: Double = js.native
    /**
      * candela (lm/sr)
      */
    val INTENSITYMODE_LUMINOUSINTENSITY: Double = js.native
    /**
      * lumen (lm)
      */
    val INTENSITYMODE_LUMINOUSPOWER: Double = js.native
    /**
      * If every light affecting the material is in this lightmapMode,
      * material.lightmapTexture adds or multiplies
      * (depends on material.useLightmapAsShadowmap)
      * after every other light calculations.
      */
    val LIGHTMAP_DEFAULT: Double = js.native
    /**
      * material.lightmapTexture as only lighting
      * no light calculation from this light
      * only adds dynamic shadows from this light
      */
    val LIGHTMAP_SHADOWSONLY: Double = js.native
    /**
      * material.lightmapTexture as only diffuse lighting from this light
      * adds only specular lighting from this light
      * adds dynamic shadows
      */
    val LIGHTMAP_SPECULAR: Double = js.native
    /**
      * Light type const id of the directional light.
      */
    val LIGHTTYPEID_DIRECTIONALLIGHT: Double = js.native
    /**
      * Light type const id of the hemispheric light.
      */
    val LIGHTTYPEID_HEMISPHERICLIGHT: Double = js.native
    /**
      * Light type const id of the point light.
      */
    val LIGHTTYPEID_POINTLIGHT: Double = js.native
    /**
      * Light type const id of the spot light.
      */
    val LIGHTTYPEID_SPOTLIGHT: Double = js.native
    /**
      * Sort function to order lights for rendering.
      * @param a First Light object to compare to second.
      * @param b Second Light object to compare first.
      * @return -1 to reduce's a's index relative to be, 0 for no change, 1 to increase a's index relative to b.
      */
    def CompareLightsPriority(a: Light, b: Light): Double = js.native
    /**
      * Creates a new typed light from the passed type (integer) : point light = 0, directional light = 1, spot light = 2, hemispheric light = 3.
      * This new light is named "name" and added to the passed scene.
      * @param type Type according to the types available in Light.LIGHTTYPEID_x
      * @param name The friendly name of the light
      * @param scene The scene the new light will belong to
      * @returns the constructor function
      */
    def GetConstructorFromName(`type`: Double, name: String, scene: Scene): Nullable[js.Function0[this.type]] = js.native
    /**
      * Parses the passed "parsedLight" and returns a new instanced Light from this parsing.
      * @param parsedLight The JSON representation of the light
      * @param scene The scene to create the parsed light in
      * @returns the created light after parsing
      */
    def Parse(parsedLight: js.Any, scene: Scene): Nullable[Light] = js.native
  }
  
}

