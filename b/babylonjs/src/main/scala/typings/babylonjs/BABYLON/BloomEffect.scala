package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BloomEffect extends PostProcessRenderEffect {
  
  var _blurX: js.Any = js.native
  
  var _blurY: js.Any = js.native
  
  /**
    * @hidden Internal
    */
  var _downscale: ExtractHighlightsPostProcess = js.native
  
  /**
    * @hidden Internal
    */
  var _effects: js.Array[PostProcess] = js.native
  
  /**
    * Internal
    * @returns if all the contained post processes are ready.
    * @hidden
    */
  def _isReady(): Boolean = js.native
  
  var _merge: js.Any = js.native
  
  /**
    * @hidden Internal
    */
  def _updateEffects(): Unit = js.native
  
  var bloomScale: js.Any = js.native
  
  /**
    * Disposes each of the internal effects for a given camera.
    * @param camera The camera to dispose the effect on.
    */
  def disposeEffects(camera: Camera): Unit = js.native
  
  /**
    * Specifies the size of the bloom blur kernel, relative to the final output size
    */
  def kernel: Double = js.native
  def kernel_=(value: Double): Unit = js.native
  
  /**
    * The luminance threshold to find bright areas of the image to bloom.
    */
  def threshold: Double = js.native
  def threshold_=(value: Double): Unit = js.native
  
  /**
    * The strength of the bloom.
    */
  def weight: Double = js.native
  def weight_=(value: Double): Unit = js.native
}
