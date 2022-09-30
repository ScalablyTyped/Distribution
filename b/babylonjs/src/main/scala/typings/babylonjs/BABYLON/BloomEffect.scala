package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BloomEffect
  extends StObject
     with PostProcessRenderEffect {
  
  /* private */ var _bloomScale: Any = js.native
  
  /* private */ var _blurX: Any = js.native
  
  /* private */ var _blurY: Any = js.native
  
  /**
    * @internal Internal
    */
  var _downscale: ExtractHighlightsPostProcess = js.native
  
  /**
    * @internal Internal
    */
  var _effects: js.Array[PostProcess] = js.native
  
  /**
    * Internal
    * @returns if all the contained post processes are ready.
    * @internal
    */
  def _isReady(): Boolean = js.native
  
  /* private */ var _merge: Any = js.native
  
  /**
    * @internal Internal
    */
  def _updateEffects(): Unit = js.native
  
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
