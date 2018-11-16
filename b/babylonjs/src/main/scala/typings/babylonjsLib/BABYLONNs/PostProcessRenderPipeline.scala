package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * PostProcessRenderPipeline
     * @see https://doc.babylonjs.com/how_to/how_to_use_postprocessrenderpipeline
     */
@JSGlobal("BABYLON.PostProcessRenderPipeline")
@js.native
class PostProcessRenderPipeline protected () extends js.Object {
  /**
           * Initializes a PostProcessRenderPipeline
           * @param engine engine to add the pipeline to
           * @param name name of the pipeline
           */
  def this(engine: Engine, name: java.lang.String) = this()
  /**
           * @hidden
           */
  var _cameras: js.Array[Camera] = js.native
  /** @hidden */
  var _name: java.lang.String = js.native
  var _renderEffects: js.Any = js.native
  var _renderEffectsForIsolatedPass: js.Any = js.native
  var engine: js.Any = js.native
  /**
           * If all the render effects in the pipeline are support
           */
  val isSupported: scala.Boolean = js.native
  /** @hidden */
  def _attachCameras(cameras: Camera, unique: scala.Boolean): scala.Unit = js.native
  /** @hidden */
  def _attachCameras(cameras: js.Array[Camera], unique: scala.Boolean): scala.Unit = js.native
  /** @hidden */
  def _detachCameras(cameras: Camera): scala.Unit = js.native
  /** @hidden */
  def _detachCameras(cameras: Nullable[js.Array[Camera]]): scala.Unit = js.native
  /** @hidden */
  def _disableEffect(renderEffectName: java.lang.String, cameras: Nullable[js.Array[Camera]]): scala.Unit = js.native
  /** @hidden */
  def _enableEffect(renderEffectName: java.lang.String, cameras: Camera): scala.Unit = js.native
  /** @hidden */
  def _enableEffect(renderEffectName: java.lang.String, cameras: js.Array[Camera]): scala.Unit = js.native
  /* protected */ def _enableMSAAOnFirstPostProcess(sampleCount: scala.Double): scala.Boolean = js.native
  /** @hidden */
  def _rebuild(): scala.Unit = js.native
  /** @hidden */
  def _reset(): scala.Unit = js.native
  /** @hidden */
  def _update(): scala.Unit = js.native
  /**
           * Adds an effect to the pipeline
           * @param renderEffect the effect to add
           */
  def addEffect(renderEffect: PostProcessRenderEffect): scala.Unit = js.native
  /**
           * Disposes of the pipeline
           */
  def dispose(): scala.Unit = js.native
  /**
           * "PostProcessRenderPipeline"
           * @returns "PostProcessRenderPipeline"
           */
  def getClassName(): java.lang.String = js.native
}

