package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostProcessRenderPipelineManager extends js.Object {
  var _renderPipelines: js.Any = js.native
  /** @hidden */
  def _rebuild(): Unit = js.native
  /**
    * Adds a pipeline to the manager
    * @param renderPipeline The pipeline to add
    */
  def addPipeline(renderPipeline: PostProcessRenderPipeline): Unit = js.native
  /**
    * Attaches a camera to the pipeline
    * @param renderPipelineName The name of the pipeline to attach to
    * @param cameras the camera to attach
    * @param unique if the camera can be attached multiple times to the pipeline
    */
  def attachCamerasToRenderPipeline(renderPipelineName: String, cameras: js.Any): Unit = js.native
  def attachCamerasToRenderPipeline(renderPipelineName: String, cameras: js.Any, unique: Boolean): Unit = js.native
  def attachCamerasToRenderPipeline(renderPipelineName: String, cameras: js.Array[Camera]): Unit = js.native
  def attachCamerasToRenderPipeline(renderPipelineName: String, cameras: js.Array[Camera], unique: Boolean): Unit = js.native
  def attachCamerasToRenderPipeline(renderPipelineName: String, cameras: Camera): Unit = js.native
  def attachCamerasToRenderPipeline(renderPipelineName: String, cameras: Camera, unique: Boolean): Unit = js.native
  /**
    * Detaches a camera from the pipeline
    * @param renderPipelineName The name of the pipeline to detach from
    * @param cameras the camera to detach
    */
  def detachCamerasFromRenderPipeline(renderPipelineName: String, cameras: js.Any): Unit = js.native
  def detachCamerasFromRenderPipeline(renderPipelineName: String, cameras: js.Array[Camera]): Unit = js.native
  def detachCamerasFromRenderPipeline(renderPipelineName: String, cameras: Camera): Unit = js.native
  /**
    * Disables an effect by name on a pipeline
    * @param renderPipelineName the name of the pipeline to disable the effect in
    * @param renderEffectName the name of the effect to disable
    * @param cameras the cameras that the effect should be disabled on
    */
  def disableEffectInPipeline(renderPipelineName: String, renderEffectName: String, cameras: js.Any): Unit = js.native
  def disableEffectInPipeline(renderPipelineName: String, renderEffectName: String, cameras: js.Array[Camera]): Unit = js.native
  def disableEffectInPipeline(renderPipelineName: String, renderEffectName: String, cameras: Camera): Unit = js.native
  /**
    * Disposes of the manager and pipelines
    */
  def dispose(): Unit = js.native
  /**
    * Enables an effect by name on a pipeline
    * @param renderPipelineName the name of the pipeline to enable the effect in
    * @param renderEffectName the name of the effect to enable
    * @param cameras the cameras that the effect should be enabled on
    */
  def enableEffectInPipeline(renderPipelineName: String, renderEffectName: String, cameras: js.Any): Unit = js.native
  def enableEffectInPipeline(renderPipelineName: String, renderEffectName: String, cameras: js.Array[Camera]): Unit = js.native
  def enableEffectInPipeline(renderPipelineName: String, renderEffectName: String, cameras: Camera): Unit = js.native
  /**
    * Gets the list of supported render pipelines
    */
  def supportedPipelines: js.Array[PostProcessRenderPipeline] = js.native
  /**
    * Updates the state of all contained render pipelines and disposes of any non supported pipelines
    */
  def update(): Unit = js.native
}

