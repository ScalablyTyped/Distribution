package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base class of all the lights in Babylon. It groups all the generic information about lights.
  * Lights are used, as you would expect, to affect how meshes are seen, in terms of both illumination and colour.
  * All meshes allow light to pass through them unless shadow generation is activated. The default number of lights allowed is four but this can be increased.
  */
@JSGlobal("BABYLON.Light")
@js.native
abstract class Light protected () extends Node {
  /**
    * Creates a Light object in the scene.
    * Documentation : http://doc.babylonjs.com/tutorials/lights
    * @param name The firendly name of the light
    * @param scene The scene the light belongs too
    */
  def this(name: java.lang.String, scene: Scene) = this()
  /**
    * Recomputes the cached photometric scale if needed.
    */
  var _computePhotometricScale: js.Any = js.native
  var _excludeWithLayerMask: js.Any = js.native
  var _excludedMeshes: js.Any = js.native
  /**
    * @hidden Internal use only.
    */
  var _excludedMeshesIds: js.Array[java.lang.String] = js.native
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
  var _includedOnlyMeshesIds: js.Array[java.lang.String] = js.native
  var _intensityMode: js.Any = js.native
  var _inverseSquaredRange: scala.Double = js.native
  var _lightmapMode: js.Any = js.native
  /**
    * Cached photometric scale default to 1.0 as the automatic intensity mode defaults to 1.0 for every type
    * of light.
    */
  var _photometricScale: js.Any = js.native
  var _radius: js.Any = js.native
  var _range: js.Any = js.native
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
    * Gets the layer id use to find what meshes are not impacted by the light.
    * Inactive if 0
    */
  /**
    * Sets the layer id use to find what meshes are not impacted by the light.
    * Inactive if 0
    */
  var excludeWithLayerMask: scala.Double = js.native
  /**
    * Gets the meshes not impacted by this light.
    */
  /**
    * Sets the meshes not impacted by this light.
    */
  var excludedMeshes: js.Array[AbstractMesh] = js.native
  /**
    * Defines the falloff type for this light. This lets overrriding how punctual light are
    * falling off base on range or angle.
    * This can be set to any values in Light.FALLOFF_x.
    *
    * Note: This is only usefull for PBR Materials at the moment. This could be extended if required to
    * other types of materials.
    */
  var falloffType: scala.Double = js.native
  /**
    * Gets the layer id use to find what meshes are impacted by the light.
    * Inactive if 0
    */
  /**
    * Sets the layer id use to find what meshes are impacted by the light.
    * Inactive if 0
    */
  var includeOnlyWithLayerMask: scala.Double = js.native
  /**
    * Gets the only meshes impacted by this light.
    */
  /**
    * Sets the only meshes impacted by this light.
    */
  var includedOnlyMeshes: js.Array[AbstractMesh] = js.native
  /**
    * Strength of the light.
    * Note: By default it is define in the framework own unit.
    * Note: In PBR materials the intensityMode can be use to chose what unit the intensity is defined in.
    */
  var intensity: scala.Double = js.native
  /**
    * Gets the photometric scale used to interpret the intensity.
    * This is only relevant with PBR Materials where the light intensity can be defined in a physical way.
    */
  /**
    * Sets the photometric scale used to interpret the intensity.
    * This is only relevant with PBR Materials where the light intensity can be defined in a physical way.
    */
  var intensityMode: scala.Double = js.native
  /**
    * Gets the lightmap mode of this light (should be one of the constants defined by Light.LIGHTMAP_x)
    */
  /**
    * Sets the lightmap mode of this light (should be one of the constants defined by Light.LIGHTMAP_x)
    */
  var lightmapMode: scala.Double = js.native
  /**
    * Gets the light radius used by PBR Materials to simulate soft area lights.
    */
  /**
    * sets the light radius used by PBR Materials to simulate soft area lights.
    */
  var radius: scala.Double = js.native
  /**
    * Defines how far from the source the light is impacting in scene units.
    * Note: Unused in PBR material as the distance light falloff is defined following the inverse squared falloff.
    */
  /**
    * Defines how far from the source the light is impacting in scene units.
    * Note: Unused in PBR material as the distance light falloff is defined following the inverse squared falloff.
    */
  var range: scala.Double = js.native
  /**
    * Defines the rendering priority of the lights. It can help in case of fallback or number of lights
    * exceeding the number allowed of the materials.
    */
  var renderPriority: scala.Double = js.native
  /**
    * Gets wether or not the shadows are enabled for this light. This can help turning off/on shadow without detaching
    * the current shadow generator.
    */
  /**
    * Sets wether or not the shadows are enabled for this light. This can help turning off/on shadow without detaching
    * the current shadow generator.
    */
  var shadowEnabled: scala.Boolean = js.native
  /**
    * Specular produces a highlight color on an object.
    * Note: This is note affecting PBR materials.
    */
  var specular: Color3 = js.native
  /* protected */ def _buildUniformLayout(): scala.Unit = js.native
  /**
    * Forces the meshes to update their light related information in their rendering used effects
    * @hidden Internal Use Only
    */
  def _markMeshesAsLightDirty(): scala.Unit = js.native
  /**
    * Reorder the light in the scene according to their defined priority.
    * @hidden Internal Use Only
    */
  def _reorderLightsInScene(): scala.Unit = js.native
  /**
    * Specifies if the light will affect the passed mesh.
    * @param mesh The mesh to test against the light
    * @return true the mesh is affected otherwise, false.
    */
  def canAffectMesh(mesh: AbstractMesh): scala.Boolean = js.native
  /**
    * Returns a new Light object, named "name", from the current one.
    * @param name The name of the cloned light
    * @returns the new created light
    */
  def clone(name: java.lang.String): Nullable[Light] = js.native
  /**
    * Returns a Vector3, the absolute light position in the World.
    * @returns the world space position of the light
    */
  def getAbsolutePosition(): Vector3 = js.native
  /**
    * Returns the intensity scaled by the Photometric Scale according to the light type and intensity mode.
    * @returns the scaled intensity in intensity mode unit
    */
  def getScaledIntensity(): scala.Double = js.native
  /**
    * Returns the Light associated shadow generator if any.
    * @return the associated shadow generator.
    */
  def getShadowGenerator(): Nullable[IShadowGenerator] = js.native
  /**
    * Returns the light type ID (integer).
    * @returns The light Type id as a constant defines in Light.LIGHTTYPEID_x
    */
  def getTypeID(): scala.Double = js.native
  /**
    * Prepares the list of defines specific to the light type.
    * @param defines the list of defines
    * @param lightIndex defines the index of the light for the effect
    */
  def prepareLightSpecificDefines(defines: js.Any, lightIndex: scala.Double): scala.Unit = js.native
  /**
    * Serializes the current light into a Serialization object.
    * @returns the serialized object.
    */
  def serialize(): js.Any = js.native
  def toString(fullDetails: scala.Boolean): java.lang.String = js.native
  /**
    * Sets the passed Effect "effect" with the Light information.
    * @param effect The effect to update
    * @param lightIndex The index of the light in the effect to update
    * @returns The light
    */
  def transferToEffect(effect: Effect, lightIndex: java.lang.String): Light = js.native
}

/* static members */
@JSGlobal("BABYLON.Light")
@js.native
object Light extends js.Object {
  /**
    * Falloff Default: light is falling off following the material specification:
    * standard material is using standard falloff whereas pbr material can request special falloff per materials.
    */
  val FALLOFF_DEFAULT: scala.Double = js.native
  /**
    * Falloff gltf: light is falling off as described in the gltf moving to PBR document
    * to enhance interoperability with other engines.
    */
  val FALLOFF_GLTF: scala.Double = js.native
  /**
    * Falloff Physical: light is falling off following the inverse squared distance law.
    */
  val FALLOFF_PHYSICAL: scala.Double = js.native
  /**
    * Falloff Standard: light is falling off like in the standard material
    * to enhance interoperability with other materials.
    */
  val FALLOFF_STANDARD: scala.Double = js.native
  /**
    * Each light type uses the default quantity according to its type:
    *      point/spot lights use luminous intensity
    *      directional lights use illuminance
    */
  val INTENSITYMODE_AUTOMATIC: scala.Double = js.native
  /**
    * lux (lm/m^2)
    */
  val INTENSITYMODE_ILLUMINANCE: scala.Double = js.native
  /**
    * nit (cd/m^2)
    */
  val INTENSITYMODE_LUMINANCE: scala.Double = js.native
  /**
    * candela (lm/sr)
    */
  val INTENSITYMODE_LUMINOUSINTENSITY: scala.Double = js.native
  /**
    * lumen (lm)
    */
  val INTENSITYMODE_LUMINOUSPOWER: scala.Double = js.native
  /**
    * If every light affecting the material is in this lightmapMode,
    * material.lightmapTexture adds or multiplies
    * (depends on material.useLightmapAsShadowmap)
    * after every other light calculations.
    */
  val LIGHTMAP_DEFAULT: scala.Double = js.native
  /**
    * material.lightmapTexture as only lighting
    * no light calculation from this light
    * only adds dynamic shadows from this light
    */
  val LIGHTMAP_SHADOWSONLY: scala.Double = js.native
  /**
    * material.lightmapTexture as only diffuse lighting from this light
    * adds only specular lighting from this light
    * adds dynamic shadows
    */
  val LIGHTMAP_SPECULAR: scala.Double = js.native
  /**
    * Light type const id of the directional light.
    */
  val LIGHTTYPEID_DIRECTIONALLIGHT: scala.Double = js.native
  /**
    * Light type const id of the hemispheric light.
    */
  val LIGHTTYPEID_HEMISPHERICLIGHT: scala.Double = js.native
  /**
    * Light type const id of the point light.
    */
  val LIGHTTYPEID_POINTLIGHT: scala.Double = js.native
  /**
    * Light type const id of the spot light.
    */
  val LIGHTTYPEID_SPOTLIGHT: scala.Double = js.native
  /**
    * Sort function to order lights for rendering.
    * @param a First Light object to compare to second.
    * @param b Second Light object to compare first.
    * @return -1 to reduce's a's index relative to be, 0 for no change, 1 to increase a's index relative to b.
    */
  def CompareLightsPriority(a: babylonjsLib.BABYLONNs.Light, b: babylonjsLib.BABYLONNs.Light): scala.Double = js.native
  /**
    * Creates a new typed light from the passed type (integer) : point light = 0, directional light = 1, spot light = 2, hemispheric light = 3.
    * This new light is named "name" and added to the passed scene.
    * @param type Type according to the types available in Light.LIGHTTYPEID_x
    * @param name The friendly name of the light
    * @param scene The scene the new light will belong to
    * @returns the constructor function
    */
  def GetConstructorFromName(`type`: scala.Double, name: java.lang.String, scene: babylonjsLib.BABYLONNs.Scene): babylonjsLib.BABYLONNs.Nullable[js.Function0[this.type]] = js.native
  /**
    * Parses the passed "parsedLight" and returns a new instanced Light from this parsing.
    * @param parsedLight The JSON representation of the light
    * @param scene The scene to create the parsed light in
    * @returns the created light after parsing
    */
  def Parse(parsedLight: js.Any, scene: babylonjsLib.BABYLONNs.Scene): babylonjsLib.BABYLONNs.Nullable[babylonjsLib.BABYLONNs.Light] = js.native
}

