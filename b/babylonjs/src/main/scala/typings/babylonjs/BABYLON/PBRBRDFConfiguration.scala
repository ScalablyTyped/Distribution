package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.PBRBRDFConfiguration")
@js.native
class PBRBRDFConfiguration protected () extends js.Object {
  /**
    * Instantiate a new istance of clear coat configuration.
    * @param markAllSubMeshesAsMiscDirty Callback to flag the material to dirty
    */
  def this(markAllSubMeshesAsMiscDirty: js.Function0[Unit]) = this()
  /** @hidden */
  var _internalMarkAllSubMeshesAsMiscDirty: js.Any = js.native
  var _useEnergyConservation: js.Any = js.native
  var _useSmithVisibilityHeightCorrelated: js.Any = js.native
  var _useSpecularGlossinessInputEnergyConservation: js.Any = js.native
  var _useSphericalHarmonics: js.Any = js.native
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
  /** @hidden */
  def _markAllSubMeshesAsMiscDirty(): Unit = js.native
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
}

/* static members */
@JSGlobal("BABYLON.PBRBRDFConfiguration")
@js.native
object PBRBRDFConfiguration extends js.Object {
  /**
    * Default value used for the energy conservation.
    * This should only be changed to adapt to the type of texture in scene.environmentBRDFTexture.
    */
  var DEFAULT_USE_ENERGY_CONSERVATION: Boolean = js.native
  /**
    * Default value used for the Smith Visibility Height Correlated mode.
    * This should only be changed to adapt to the type of texture in scene.environmentBRDFTexture.
    */
  var DEFAULT_USE_SMITH_VISIBILITY_HEIGHT_CORRELATED: Boolean = js.native
  /**
    * Default value used for activating energy conservation for the specular workflow.
    * If activated, the albedo color is multiplied with (1. - maxChannel(specular color)).
    * If deactivated, a material is only physically plausible, when (albedo color + specular color) < 1.
    */
  var DEFAULT_USE_SPECULAR_GLOSSINESS_INPUT_ENERGY_CONSERVATION: Boolean = js.native
  /**
    * Default value used for the IBL diffuse part.
    * This can help switching back to the polynomials mode globally which is a tiny bit
    * less GPU intensive at the drawback of a lower quality.
    */
  var DEFAULT_USE_SPHERICAL_HARMONICS: Boolean = js.native
}

