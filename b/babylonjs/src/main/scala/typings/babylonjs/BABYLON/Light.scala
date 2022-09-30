package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Light
  extends StObject
     with Node
     with ISortableLight {
  
  /**
    * Binds the lights information from the scene to the effect for the given mesh.
    * @param lightIndex Light index
    * @param scene The scene where the light belongs to
    * @param effect The effect we are binding the data to
    * @param useSpecular Defines if specular is supported
    * @param receiveShadows Defines if the effect (mesh) we bind the light for receives shadows
    */
  def _bindLight(lightIndex: Double, scene: Scene, effect: Effect, useSpecular: Boolean): Unit = js.native
  def _bindLight(lightIndex: Double, scene: Scene, effect: Effect, useSpecular: Boolean, receiveShadows: Boolean): Unit = js.native
  
  /* protected */ def _buildUniformLayout(): Unit = js.native
  
  /**
    * Recomputes the cached photometric scale if needed.
    */
  /* private */ var _computePhotometricScale: Any = js.native
  
  /* private */ var _excludeWithLayerMask: Any = js.native
  
  /* private */ var _excludedMeshes: Any = js.native
  
  /**
    * @internal Internal use only.
    */
  var _excludedMeshesIds: js.Array[String] = js.native
  
  /**
    * Returns the Photometric Scale according to the light type and intensity mode.
    */
  /* private */ var _getPhotometricScale: Any = js.native
  
  /* private */ var _hookArrayForExcluded: Any = js.native
  
  /* private */ var _hookArrayForIncludedOnly: Any = js.native
  
  /* private */ var _includeOnlyWithLayerMask: Any = js.native
  
  /* private */ var _includedOnlyMeshes: Any = js.native
  
  /**
    * @internal Internal use only.
    */
  var _includedOnlyMeshesIds: js.Array[String] = js.native
  
  /* private */ var _intensityMode: Any = js.native
  
  /* protected */ var _inverseSquaredRange: Double = js.native
  
  /** @internal */
  val _isLight: /* true */ Boolean = js.native
  
  /* private */ var _lastUseSpecular: Any = js.native
  
  /* private */ var _lightmapMode: Any = js.native
  
  /**
    * Forces the meshes to update their light related information in their rendering used effects
    * @internal Internal Use Only
    */
  def _markMeshesAsLightDirty(): Unit = js.native
  
  /**
    * Cached photometric scale default to 1.0 as the automatic intensity mode defaults to 1.0 for every type
    * of light.
    */
  /* private */ var _photometricScale: Any = js.native
  
  /* private */ var _radius: Any = js.native
  
  /* private */ var _range: Any = js.native
  
  /** @internal */
  var _renderId: Double = js.native
  
  /* private */ var _renderPriority: Any = js.native
  
  /**
    * Reorder the light in the scene according to their defined priority.
    * @internal Internal Use Only
    */
  def _reorderLightsInScene(): Unit = js.native
  
  /* private */ var _resyncMeshes: Any = js.native
  
  /* private */ var _shadowEnabled: Any = js.native
  
  /**
    * Shadow generator associated to the light.
    * @internal Internal use only.
    */
  var _shadowGenerator: Nullable[IShadowGenerator] = js.native
  
  /**
    * The current light uniform buffer.
    * @internal Internal use only.
    */
  var _uniformBuffer: UniformBuffer = js.native
  
  /**
    * Specifies if the light will affect the passed mesh.
    * @param mesh The mesh to test against the light
    * @returns true the mesh is affected otherwise, false.
    */
  def canAffectMesh(mesh: AbstractMesh): Boolean = js.native
  
  /**
    * Returns a new Light object, named "name", from the current one.
    * @param name The name of the cloned light
    * @param newParent The parent of this light, if it has one
    * @returns the new created light
    */
  def clone(name: String): Nullable[Light] = js.native
  def clone(name: String, newParent: Nullable[Node]): Nullable[Light] = js.native
  
  /**
    * Diffuse gives the basic color to an object.
    */
  var diffuse: Color3 = js.native
  
  /**
    * Gets the layer id use to find what meshes are not impacted by the light.
    * Inactive if 0
    */
  def excludeWithLayerMask: Double = js.native
  /**
    * Sets the layer id use to find what meshes are not impacted by the light.
    * Inactive if 0
    */
  def excludeWithLayerMask_=(value: Double): Unit = js.native
  
  /**
    * Gets the meshes not impacted by this light.
    */
  def excludedMeshes: js.Array[AbstractMesh] = js.native
  /**
    * Sets the meshes not impacted by this light.
    */
  def excludedMeshes_=(value: js.Array[AbstractMesh]): Unit = js.native
  
  /**
    * Defines the falloff type for this light. This lets overriding how punctual light are
    * falling off base on range or angle.
    * This can be set to any values in Light.FALLOFF_x.
    *
    * Note: This is only useful for PBR Materials at the moment. This could be extended if required to
    * other types of materials.
    */
  var falloffType: Double = js.native
  
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
    * @returns the associated shadow generator.
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
  def includeOnlyWithLayerMask: Double = js.native
  /**
    * Sets the layer id use to find what meshes are impacted by the light.
    * Inactive if 0
    */
  def includeOnlyWithLayerMask_=(value: Double): Unit = js.native
  
  /**
    * Gets the only meshes impacted by this light.
    */
  def includedOnlyMeshes: js.Array[AbstractMesh] = js.native
  /**
    * Sets the only meshes impacted by this light.
    */
  def includedOnlyMeshes_=(value: js.Array[AbstractMesh]): Unit = js.native
  
  /**
    * Strength of the light.
    * Note: By default it is define in the framework own unit.
    * Note: In PBR materials the intensityMode can be use to chose what unit the intensity is defined in.
    */
  var intensity: Double = js.native
  
  /**
    * Gets the photometric scale used to interpret the intensity.
    * This is only relevant with PBR Materials where the light intensity can be defined in a physical way.
    */
  def intensityMode: Double = js.native
  /**
    * Sets the photometric scale used to interpret the intensity.
    * This is only relevant with PBR Materials where the light intensity can be defined in a physical way.
    */
  def intensityMode_=(value: Double): Unit = js.native
  
  /**
    * Gets the lightmap mode of this light (should be one of the constants defined by Light.LIGHTMAP_x)
    */
  def lightmapMode: Double = js.native
  /**
    * Sets the lightmap mode of this light (should be one of the constants defined by Light.LIGHTMAP_x)
    */
  def lightmapMode_=(value: Double): Unit = js.native
  
  /**
    * Prepares the list of defines specific to the light type.
    * @param defines the list of defines
    * @param lightIndex defines the index of the light for the effect
    */
  def prepareLightSpecificDefines(defines: Any, lightIndex: Double): Unit = js.native
  
  /**
    * Gets the light radius used by PBR Materials to simulate soft area lights.
    */
  def radius: Double = js.native
  /**
    * sets the light radius used by PBR Materials to simulate soft area lights.
    */
  def radius_=(value: Double): Unit = js.native
  
  /**
    * Defines how far from the source the light is impacting in scene units.
    * Note: Unused in PBR material as the distance light falloff is defined following the inverse squared falloff.
    */
  def range: Double = js.native
  /**
    * Defines how far from the source the light is impacting in scene units.
    * Note: Unused in PBR material as the distance light falloff is defined following the inverse squared falloff.
    */
  def range_=(value: Double): Unit = js.native
  
  /**
    * Serializes the current light into a Serialization object.
    * @returns the serialized object.
    */
  def serialize(): Any = js.native
  
  /**
    * Gets whether or not the shadows are enabled for this light. This can help turning off/on shadow without detaching
    * the current shadow generator.
    */
  @JSName("shadowEnabled")
  def shadowEnabled_MLight: Boolean = js.native
  
  /**
    * Specular produces a highlight color on an object.
    * Note: This is not affecting PBR materials.
    */
  var specular: Color3 = js.native
  
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
