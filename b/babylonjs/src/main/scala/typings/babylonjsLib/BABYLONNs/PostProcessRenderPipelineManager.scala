package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * PostProcessRenderPipelineManager class
     * @see https://doc.babylonjs.com/how_to/how_to_use_postprocessrenderpipeline
     */
@JSGlobal("BABYLON.PostProcessRenderPipelineManager")
@js.native
class PostProcessRenderPipelineManager () extends js.Object {
  var _renderPipelines: js.Any = js.native
  /** @hidden */
  def _rebuild(): scala.Unit = js.native
  /**
           * Adds a pipeline to the manager
           * @param renderPipeline The pipeline to add
           */
  def addPipeline(renderPipeline: PostProcessRenderPipeline): scala.Unit = js.native
  /**
           * Attaches a camera to the pipeline
           * @param renderPipelineName The name of the pipeline to attach to
           * @param cameras the camera to attach
           * @param unique if the camera can be attached multiple times to the pipeline
           */
  def attachCamerasToRenderPipeline(renderPipelineName: java.lang.String, cameras: Camera): scala.Unit = js.native
  /**
           * Attaches a camera to the pipeline
           * @param renderPipelineName The name of the pipeline to attach to
           * @param cameras the camera to attach
           * @param unique if the camera can be attached multiple times to the pipeline
           */
  def attachCamerasToRenderPipeline(renderPipelineName: java.lang.String, cameras: Camera, unique: scala.Boolean): scala.Unit = js.native
  /**
           * Attaches a camera to the pipeline
           * @param renderPipelineName The name of the pipeline to attach to
           * @param cameras the camera to attach
           * @param unique if the camera can be attached multiple times to the pipeline
           */
  def attachCamerasToRenderPipeline(renderPipelineName: java.lang.String, cameras: js.Any): scala.Unit = js.native
  /**
           * Attaches a camera to the pipeline
           * @param renderPipelineName The name of the pipeline to attach to
           * @param cameras the camera to attach
           * @param unique if the camera can be attached multiple times to the pipeline
           */
  def attachCamerasToRenderPipeline(renderPipelineName: java.lang.String, cameras: js.Any, unique: scala.Boolean): scala.Unit = js.native
  /**
           * Attaches a camera to the pipeline
           * @param renderPipelineName The name of the pipeline to attach to
           * @param cameras the camera to attach
           * @param unique if the camera can be attached multiple times to the pipeline
           */
  def attachCamerasToRenderPipeline(renderPipelineName: java.lang.String, cameras: js.Array[Camera]): scala.Unit = js.native
  /**
           * Attaches a camera to the pipeline
           * @param renderPipelineName The name of the pipeline to attach to
           * @param cameras the camera to attach
           * @param unique if the camera can be attached multiple times to the pipeline
           */
  def attachCamerasToRenderPipeline(renderPipelineName: java.lang.String, cameras: js.Array[Camera], unique: scala.Boolean): scala.Unit = js.native
  /**
           * Detaches a camera from the pipeline
           * @param renderPipelineName The name of the pipeline to detach from
           * @param cameras the camera to detach
           */
  def detachCamerasFromRenderPipeline(renderPipelineName: java.lang.String, cameras: Camera): scala.Unit = js.native
  /**
           * Detaches a camera from the pipeline
           * @param renderPipelineName The name of the pipeline to detach from
           * @param cameras the camera to detach
           */
  def detachCamerasFromRenderPipeline(renderPipelineName: java.lang.String, cameras: js.Any): scala.Unit = js.native
  /**
           * Detaches a camera from the pipeline
           * @param renderPipelineName The name of the pipeline to detach from
           * @param cameras the camera to detach
           */
  def detachCamerasFromRenderPipeline(renderPipelineName: java.lang.String, cameras: js.Array[Camera]): scala.Unit = js.native
  /**
           * Disables an effect by name on a pipeline
           * @param renderPipelineName the name of the pipeline to disable the effect in
           * @param renderEffectName the name of the effect to disable
           * @param cameras the cameras that the effect should be disabled on
           */
  def disableEffectInPipeline(renderPipelineName: java.lang.String, renderEffectName: java.lang.String, cameras: Camera): scala.Unit = js.native
  /**
           * Disables an effect by name on a pipeline
           * @param renderPipelineName the name of the pipeline to disable the effect in
           * @param renderEffectName the name of the effect to disable
           * @param cameras the cameras that the effect should be disabled on
           */
  def disableEffectInPipeline(renderPipelineName: java.lang.String, renderEffectName: java.lang.String, cameras: js.Any): scala.Unit = js.native
  /**
           * Disables an effect by name on a pipeline
           * @param renderPipelineName the name of the pipeline to disable the effect in
           * @param renderEffectName the name of the effect to disable
           * @param cameras the cameras that the effect should be disabled on
           */
  def disableEffectInPipeline(
    renderPipelineName: java.lang.String,
    renderEffectName: java.lang.String,
    cameras: js.Array[Camera]
  ): scala.Unit = js.native
  /**
           * Disposes of the manager and pipelines
           */
  def dispose(): scala.Unit = js.native
  /**
           * Enables an effect by name on a pipeline
           * @param renderPipelineName the name of the pipeline to enable the effect in
           * @param renderEffectName the name of the effect to enable
           * @param cameras the cameras that the effect should be enabled on
           */
  def enableEffectInPipeline(renderPipelineName: java.lang.String, renderEffectName: java.lang.String, cameras: Camera): scala.Unit = js.native
  /**
           * Enables an effect by name on a pipeline
           * @param renderPipelineName the name of the pipeline to enable the effect in
           * @param renderEffectName the name of the effect to enable
           * @param cameras the cameras that the effect should be enabled on
           */
  def enableEffectInPipeline(renderPipelineName: java.lang.String, renderEffectName: java.lang.String, cameras: js.Any): scala.Unit = js.native
  /**
           * Enables an effect by name on a pipeline
           * @param renderPipelineName the name of the pipeline to enable the effect in
           * @param renderEffectName the name of the effect to enable
           * @param cameras the cameras that the effect should be enabled on
           */
  def enableEffectInPipeline(
    renderPipelineName: java.lang.String,
    renderEffectName: java.lang.String,
    cameras: js.Array[Camera]
  ): scala.Unit = js.native
  /**
           * Updates the state of all contained render pipelines and disposes of any non supported pipelines
           */
  def update(): scala.Unit = js.native
}

