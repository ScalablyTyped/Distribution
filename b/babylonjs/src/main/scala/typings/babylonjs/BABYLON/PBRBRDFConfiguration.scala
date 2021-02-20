package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PBRBRDFConfiguration extends StObject {
  
  /** @hidden */
  var _internalMarkAllSubMeshesAsMiscDirty: js.Any = js.native
  
  /** @hidden */
  def _markAllSubMeshesAsMiscDirty(): Unit = js.native
  
  var _useEnergyConservation: js.Any = js.native
  
  var _useSmithVisibilityHeightCorrelated: js.Any = js.native
  
  var _useSpecularGlossinessInputEnergyConservation: js.Any = js.native
  
  var _useSphericalHarmonics: js.Any = js.native
  
  /**
    * Makes a duplicate of the current configuration into another one.
    * @param brdfConfiguration define the config where to copy the info
    */
  def copyTo(brdfConfiguration: PBRBRDFConfiguration): Unit = js.native
  
  /**
    * Get the current class name of the texture useful for serialization or dynamic coding.
    * @returns "PBRClearCoatConfiguration"
    */
  def getClassName(): String = js.native
  
  /**
    * Parses a anisotropy Configuration from a serialized object.
    * @param source - Serialized object.
    * @param scene Defines the scene we are parsing for
    * @param rootUrl Defines the rootUrl to load from
    */
  def parse(source: js.Any, scene: Scene, rootUrl: String): Unit = js.native
  
  /**
    * Checks to see if a texture is used in the material.
    * @param defines the list of "defines" to update.
    */
  def prepareDefines(defines: IMaterialBRDFDefines): Unit = js.native
  
  /**
    * Serializes this BRDF configuration.
    * @returns - An object with the serialized config.
    */
  def serialize(): js.Any = js.native
  
  /**
    * Defines if the material uses energy conservation.
    */
  var useEnergyConservation: Boolean = js.native
  
  /**
    * LEGACY Mode set to false
    * Defines if the material uses height smith correlated visibility term.
    * If you intent to not use our default BRDF, you need to load a separate BRDF Texture for the PBR
    * You can either load https://assets.babylonjs.com/environments/uncorrelatedBRDF.png
    * or https://assets.babylonjs.com/environments/uncorrelatedBRDF.dds to have more precision
    * Not relying on height correlated will also disable energy conservation.
    */
  var useSmithVisibilityHeightCorrelated: Boolean = js.native
  
  /**
    * Defines if the material uses energy conservation, when the specular workflow is active.
    * If activated, the albedo color is multiplied with (1. - maxChannel(specular color)).
    * If deactivated, a material is only physically plausible, when (albedo color + specular color) < 1.
    * In the deactivated case, the material author has to ensure energy conservation, for a physically plausible rendering.
    */
  var useSpecularGlossinessInputEnergyConservation: Boolean = js.native
  
  /**
    * LEGACY Mode set to false
    * Defines if the material uses spherical harmonics vs spherical polynomials for the
    * diffuse part of the IBL.
    * The harmonics despite a tiny bigger cost has been proven to provide closer results
    * to the ground truth.
    */
  var useSphericalHarmonics: Boolean = js.native
}
object PBRBRDFConfiguration {
  
  @scala.inline
  def apply(
    _internalMarkAllSubMeshesAsMiscDirty: js.Any,
    _markAllSubMeshesAsMiscDirty: () => Unit,
    _useEnergyConservation: js.Any,
    _useSmithVisibilityHeightCorrelated: js.Any,
    _useSpecularGlossinessInputEnergyConservation: js.Any,
    _useSphericalHarmonics: js.Any,
    copyTo: PBRBRDFConfiguration => Unit,
    getClassName: () => String,
    parse: (js.Any, Scene, String) => Unit,
    prepareDefines: IMaterialBRDFDefines => Unit,
    serialize: () => js.Any,
    useEnergyConservation: Boolean,
    useSmithVisibilityHeightCorrelated: Boolean,
    useSpecularGlossinessInputEnergyConservation: Boolean,
    useSphericalHarmonics: Boolean
  ): PBRBRDFConfiguration = {
    val __obj = js.Dynamic.literal(_internalMarkAllSubMeshesAsMiscDirty = _internalMarkAllSubMeshesAsMiscDirty.asInstanceOf[js.Any], _markAllSubMeshesAsMiscDirty = js.Any.fromFunction0(_markAllSubMeshesAsMiscDirty), _useEnergyConservation = _useEnergyConservation.asInstanceOf[js.Any], _useSmithVisibilityHeightCorrelated = _useSmithVisibilityHeightCorrelated.asInstanceOf[js.Any], _useSpecularGlossinessInputEnergyConservation = _useSpecularGlossinessInputEnergyConservation.asInstanceOf[js.Any], _useSphericalHarmonics = _useSphericalHarmonics.asInstanceOf[js.Any], copyTo = js.Any.fromFunction1(copyTo), getClassName = js.Any.fromFunction0(getClassName), parse = js.Any.fromFunction3(parse), prepareDefines = js.Any.fromFunction1(prepareDefines), serialize = js.Any.fromFunction0(serialize), useEnergyConservation = useEnergyConservation.asInstanceOf[js.Any], useSmithVisibilityHeightCorrelated = useSmithVisibilityHeightCorrelated.asInstanceOf[js.Any], useSpecularGlossinessInputEnergyConservation = useSpecularGlossinessInputEnergyConservation.asInstanceOf[js.Any], useSphericalHarmonics = useSphericalHarmonics.asInstanceOf[js.Any])
    __obj.asInstanceOf[PBRBRDFConfiguration]
  }
  
  @scala.inline
  implicit class PBRBRDFConfigurationMutableBuilder[Self <: PBRBRDFConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCopyTo(value: PBRBRDFConfiguration => Unit): Self = StObject.set(x, "copyTo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetClassName(value: () => String): Self = StObject.set(x, "getClassName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setParse(value: (js.Any, Scene, String) => Unit): Self = StObject.set(x, "parse", js.Any.fromFunction3(value))
    
    @scala.inline
    def setPrepareDefines(value: IMaterialBRDFDefines => Unit): Self = StObject.set(x, "prepareDefines", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSerialize(value: () => js.Any): Self = StObject.set(x, "serialize", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUseEnergyConservation(value: Boolean): Self = StObject.set(x, "useEnergyConservation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseSmithVisibilityHeightCorrelated(value: Boolean): Self = StObject.set(x, "useSmithVisibilityHeightCorrelated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseSpecularGlossinessInputEnergyConservation(value: Boolean): Self = StObject.set(x, "useSpecularGlossinessInputEnergyConservation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseSphericalHarmonics(value: Boolean): Self = StObject.set(x, "useSphericalHarmonics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_internalMarkAllSubMeshesAsMiscDirty(value: js.Any): Self = StObject.set(x, "_internalMarkAllSubMeshesAsMiscDirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_markAllSubMeshesAsMiscDirty(value: () => Unit): Self = StObject.set(x, "_markAllSubMeshesAsMiscDirty", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_useEnergyConservation(value: js.Any): Self = StObject.set(x, "_useEnergyConservation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_useSmithVisibilityHeightCorrelated(value: js.Any): Self = StObject.set(x, "_useSmithVisibilityHeightCorrelated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_useSpecularGlossinessInputEnergyConservation(value: js.Any): Self = StObject.set(x, "_useSpecularGlossinessInputEnergyConservation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_useSphericalHarmonics(value: js.Any): Self = StObject.set(x, "_useSphericalHarmonics", value.asInstanceOf[js.Any])
  }
}
