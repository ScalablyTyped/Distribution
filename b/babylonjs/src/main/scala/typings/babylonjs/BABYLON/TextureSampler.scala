package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextureSampler extends StObject {
  
  /** @internal */
  var _cachedAnisotropicFilteringLevel: Nullable[Double] = js.native
  
  /** @internal */
  var _cachedWrapR: Nullable[Double] = js.native
  
  /** @internal */
  var _cachedWrapU: Nullable[Double] = js.native
  
  /** @internal */
  var _cachedWrapV: Nullable[Double] = js.native
  
  /** @internal */
  var _comparisonFunction: Double = js.native
  
  /* private */ var _useMipMaps: Any = js.native
  
  /**
    * With compliant hardware and browser (supporting anisotropic filtering)
    * this defines the level of anisotropic filtering in the texture.
    * The higher the better but the slower.
    */
  def anisotropicFilteringLevel: Nullable[Double] = js.native
  def anisotropicFilteringLevel_=(value: Nullable[Double]): Unit = js.native
  
  /**
    * Compares this sampler with another one
    * @param other sampler to compare with
    * @returns true if the samplers have the same parametres, else false
    */
  def compareSampler(other: TextureSampler): Boolean = js.native
  
  /**
    * Gets or sets the comparison function (Constants.LESS, Constants.EQUAL, etc). Set 0 to not use a comparison function
    */
  def comparisonFunction: Double = js.native
  def comparisonFunction_=(value: Double): Unit = js.native
  
  /**
    * Gets the sampling mode of the texture
    */
  var samplingMode: Double = js.native
  
  /**
    * Sets all the parameters of the sampler
    * @param wrapU u address mode (default: TEXTURE_WRAP_ADDRESSMODE)
    * @param wrapV v address mode (default: TEXTURE_WRAP_ADDRESSMODE)
    * @param wrapR r address mode (default: TEXTURE_WRAP_ADDRESSMODE)
    * @param anisotropicFilteringLevel anisotropic level (default: 1)
    * @param samplingMode sampling mode (default: Constants.TEXTURE_BILINEAR_SAMPLINGMODE)
    * @param comparisonFunction comparison function (default: 0 - no comparison function)
    * @returns the current sampler instance
    */
  def setParameters(
    wrapU: js.UndefOr[Double],
    wrapV: js.UndefOr[Double],
    wrapR: js.UndefOr[Double],
    anisotropicFilteringLevel: js.UndefOr[Double],
    samplingMode: js.UndefOr[Double],
    comparisonFunction: js.UndefOr[Double]
  ): TextureSampler = js.native
  
  /**
    * Indicates to use the mip maps (if available on the texture).
    * Thanks to this flag, you can instruct the sampler to not sample the mipmaps even if they exist (and if the sampling mode is set to a value that normally samples the mipmaps!)
    */
  def useMipMaps: Boolean = js.native
  def useMipMaps_=(value: Boolean): Unit = js.native
  
  /**
    * | Value | Type               | Description |
    * | ----- | ------------------ | ----------- |
    * | 0     | CLAMP_ADDRESSMODE  |             |
    * | 1     | WRAP_ADDRESSMODE   |             |
    * | 2     | MIRROR_ADDRESSMODE |             |
    */
  def wrapR: Nullable[Double] = js.native
  def wrapR_=(value: Nullable[Double]): Unit = js.native
  
  /**
    * | Value | Type               | Description |
    * | ----- | ------------------ | ----------- |
    * | 0     | CLAMP_ADDRESSMODE  |             |
    * | 1     | WRAP_ADDRESSMODE   |             |
    * | 2     | MIRROR_ADDRESSMODE |             |
    */
  def wrapU: Nullable[Double] = js.native
  def wrapU_=(value: Nullable[Double]): Unit = js.native
  
  /**
    * | Value | Type               | Description |
    * | ----- | ------------------ | ----------- |
    * | 0     | CLAMP_ADDRESSMODE  |             |
    * | 1     | WRAP_ADDRESSMODE   |             |
    * | 2     | MIRROR_ADDRESSMODE |             |
    */
  def wrapV: Nullable[Double] = js.native
  def wrapV_=(value: Nullable[Double]): Unit = js.native
}
