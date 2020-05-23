package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PBRBRDFConfiguration extends js.Object {
  /** @hidden */
  var _internalMarkAllSubMeshesAsMiscDirty: js.Any
  var _useEnergyConservation: js.Any
  var _useSmithVisibilityHeightCorrelated: js.Any
  var _useSpecularGlossinessInputEnergyConservation: js.Any
  var _useSphericalHarmonics: js.Any
  /**
    * Defines if the material uses energy conservation.
    */
  var useEnergyConservation: Boolean
  /**
    * LEGACY Mode set to false
    * Defines if the material uses height smith correlated visibility term.
    * If you intent to not use our default BRDF, you need to load a separate BRDF Texture for the PBR
    * You can either load https://assets.babylonjs.com/environments/uncorrelatedBRDF.png
    * or https://assets.babylonjs.com/environments/uncorrelatedBRDF.dds to have more precision
    * Not relying on height correlated will also disable energy conservation.
    */
  var useSmithVisibilityHeightCorrelated: Boolean
  /**
    * Defines if the material uses energy conservation, when the specular workflow is active.
    * If activated, the albedo color is multiplied with (1. - maxChannel(specular color)).
    * If deactivated, a material is only physically plausible, when (albedo color + specular color) < 1.
    * In the deactivated case, the material author has to ensure energy conservation, for a physically plausible rendering.
    */
  var useSpecularGlossinessInputEnergyConservation: Boolean
  /**
    * LEGACY Mode set to false
    * Defines if the material uses spherical harmonics vs spherical polynomials for the
    * diffuse part of the IBL.
    * The harmonics despite a tiny bigger cost has been proven to provide closer results
    * to the ground truth.
    */
  var useSphericalHarmonics: Boolean
  /** @hidden */
  def _markAllSubMeshesAsMiscDirty(): Unit
  /**
    * Makes a duplicate of the current configuration into another one.
    * @param brdfConfiguration define the config where to copy the info
    */
  def copyTo(brdfConfiguration: PBRBRDFConfiguration): Unit
  /**
    * Get the current class name of the texture useful for serialization or dynamic coding.
    * @returns "PBRClearCoatConfiguration"
    */
  def getClassName(): String
  /**
    * Parses a anisotropy Configuration from a serialized object.
    * @param source - Serialized object.
    * @param scene Defines the scene we are parsing for
    * @param rootUrl Defines the rootUrl to load from
    */
  def parse(source: js.Any, scene: Scene, rootUrl: String): Unit
  /**
    * Checks to see if a texture is used in the material.
    * @param defines the list of "defines" to update.
    */
  def prepareDefines(defines: IMaterialBRDFDefines): Unit
  /**
    * Serializes this BRDF configuration.
    * @returns - An object with the serialized config.
    */
  def serialize(): js.Any
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
}

