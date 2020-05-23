package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostProcessRenderPipeline extends js.Object {
  /**
    * @hidden
    */
  var _cameras: js.Array[Camera] = js.native
  /** @hidden */
  var _name: String = js.native
  var _renderEffects: js.Any = js.native
  var _renderEffectsForIsolatedPass: js.Any = js.native
  var engine: js.Any = js.native
  /**
    * List of inspectable custom properties (used by the Inspector)
    * @see https://doc.babylonjs.com/how_to/debug_layer#extensibility
    */
  var inspectableCustomProperties: js.Array[IInspectable] = js.native
  /** @hidden */
  def _attachCameras(cameras: js.Array[Camera], unique: Boolean): Unit = js.native
  /** @hidden */
  def _attachCameras(cameras: Camera, unique: Boolean): Unit = js.native
  /** @hidden */
  def _detachCameras(cameras: Camera): Unit = js.native
  /** @hidden */
  def _detachCameras(cameras: Nullable[js.Array[Camera]]): Unit = js.native
  /** @hidden */
  def _disableEffect(renderEffectName: String, cameras: Nullable[js.Array[Camera]]): Unit = js.native
  /** @hidden */
  def _enableEffect(renderEffectName: String, cameras: js.Array[Camera]): Unit = js.native
  /** @hidden */
  def _enableEffect(renderEffectName: String, cameras: Camera): Unit = js.native
  /* protected */ def _enableMSAAOnFirstPostProcess(sampleCount: Double): Boolean = js.native
  /** @hidden */
  def _rebuild(): Unit = js.native
  /** @hidden */
  def _reset(): Unit = js.native
  /** @hidden */
  def _update(): Unit = js.native
  /**
    * Adds an effect to the pipeline
    * @param renderEffect the effect to add
    */
  def addEffect(renderEffect: PostProcessRenderEffect): Unit = js.native
  /** Gets the list of attached cameras */
  def cameras: js.Array[Camera] = js.native
  /**
    * Disposes of the pipeline
    */
  def dispose(): Unit = js.native
  /**
    * Gets the class name
    * @returns "PostProcessRenderPipeline"
    */
  def getClassName(): String = js.native
  /**
    * If all the render effects in the pipeline are supported
    */
  def isSupported: Boolean = js.native
  /**
    * Gets pipeline name
    */
  def name: String = js.native
}

