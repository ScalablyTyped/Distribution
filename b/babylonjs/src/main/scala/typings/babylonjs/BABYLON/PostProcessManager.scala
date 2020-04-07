package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.PostProcessManager")
@js.native
class PostProcessManager protected () extends js.Object {
  /**
    * Creates a new instance PostProcess
    * @param scene The scene that the post process is associated with.
    */
  def this(scene: Scene) = this()
  var _buildIndexBuffer: js.Any = js.native
  var _indexBuffer: js.Any = js.native
  var _prepareBuffers: js.Any = js.native
  var _scene: js.Any = js.native
  var _vertexBuffers: js.Any = js.native
  /**
    * Finalize the result of the output of the postprocesses.
    * @param doNotPresent If true the result will not be displayed to the screen.
    * @param targetTexture The target texture to render to.
    * @param faceIndex The index of the face to bind the target texture to.
    * @param postProcesses The array of post processes to render.
    * @param forceFullscreenViewport force gl.viewport to be full screen eg. 0,0,textureWidth,textureHeight (default: false)
    * @hidden
    */
  def _finalizeFrame(): Unit = js.native
  def _finalizeFrame(doNotPresent: Boolean): Unit = js.native
  def _finalizeFrame(doNotPresent: Boolean, targetTexture: InternalTexture): Unit = js.native
  def _finalizeFrame(doNotPresent: Boolean, targetTexture: InternalTexture, faceIndex: Double): Unit = js.native
  def _finalizeFrame(
    doNotPresent: Boolean,
    targetTexture: InternalTexture,
    faceIndex: Double,
    postProcesses: js.Array[PostProcess]
  ): Unit = js.native
  def _finalizeFrame(
    doNotPresent: Boolean,
    targetTexture: InternalTexture,
    faceIndex: Double,
    postProcesses: js.Array[PostProcess],
    forceFullscreenViewport: Boolean
  ): Unit = js.native
  /**
    * Prepares a frame to be run through a post process.
    * @param sourceTexture The input texture to the post procesess. (default: null)
    * @param postProcesses An array of post processes to be run. (default: null)
    * @returns True if the post processes were able to be run.
    * @hidden
    */
  def _prepareFrame(): Boolean = js.native
  def _prepareFrame(sourceTexture: Nullable[InternalTexture]): Boolean = js.native
  def _prepareFrame(sourceTexture: Nullable[InternalTexture], postProcesses: Nullable[js.Array[PostProcess]]): Boolean = js.native
  /**
    * Rebuilds the vertex buffers of the manager.
    * @hidden
    */
  def _rebuild(): Unit = js.native
  /**
    * Manually render a set of post processes to a texture.
    * @param postProcesses An array of post processes to be run.
    * @param targetTexture The target texture to render to.
    * @param forceFullscreenViewport force gl.viewport to be full screen eg. 0,0,textureWidth,textureHeight
    * @param faceIndex defines the face to render to if a cubemap is defined as the target
    * @param lodLevel defines which lod of the texture to render to
    */
  def directRender(postProcesses: js.Array[PostProcess]): Unit = js.native
  def directRender(postProcesses: js.Array[PostProcess], targetTexture: Nullable[InternalTexture]): Unit = js.native
  def directRender(
    postProcesses: js.Array[PostProcess],
    targetTexture: Nullable[InternalTexture],
    forceFullscreenViewport: Boolean
  ): Unit = js.native
  def directRender(
    postProcesses: js.Array[PostProcess],
    targetTexture: Nullable[InternalTexture],
    forceFullscreenViewport: Boolean,
    faceIndex: Double
  ): Unit = js.native
  def directRender(
    postProcesses: js.Array[PostProcess],
    targetTexture: Nullable[InternalTexture],
    forceFullscreenViewport: Boolean,
    faceIndex: Double,
    lodLevel: Double
  ): Unit = js.native
  /**
    * Disposes of the post process manager.
    */
  def dispose(): Unit = js.native
}

