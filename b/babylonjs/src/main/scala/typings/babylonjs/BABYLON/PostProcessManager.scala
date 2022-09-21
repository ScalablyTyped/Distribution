package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostProcessManager extends StObject {
  
  /* private */ var _buildIndexBuffer: Any = js.native
  
  /**
    * Finalize the result of the output of the postprocesses.
    * @param doNotPresent If true the result will not be displayed to the screen.
    * @param targetTexture The render target wrapper to render to.
    * @param faceIndex The index of the face to bind the target texture to.
    * @param postProcesses The array of post processes to render.
    * @param forceFullscreenViewport force gl.viewport to be full screen eg. 0,0,textureWidth,textureHeight (default: false)
    * @hidden
    */
  def _finalizeFrame(): Unit = js.native
  def _finalizeFrame(doNotPresent: Boolean): Unit = js.native
  def _finalizeFrame(doNotPresent: Boolean, targetTexture: Unit, faceIndex: Double): Unit = js.native
  def _finalizeFrame(
    doNotPresent: Boolean,
    targetTexture: Unit,
    faceIndex: Double,
    postProcesses: js.Array[PostProcess]
  ): Unit = js.native
  def _finalizeFrame(
    doNotPresent: Boolean,
    targetTexture: Unit,
    faceIndex: Double,
    postProcesses: js.Array[PostProcess],
    forceFullscreenViewport: Boolean
  ): Unit = js.native
  def _finalizeFrame(
    doNotPresent: Boolean,
    targetTexture: Unit,
    faceIndex: Double,
    postProcesses: Unit,
    forceFullscreenViewport: Boolean
  ): Unit = js.native
  def _finalizeFrame(doNotPresent: Boolean, targetTexture: Unit, faceIndex: Unit, postProcesses: js.Array[PostProcess]): Unit = js.native
  def _finalizeFrame(
    doNotPresent: Boolean,
    targetTexture: Unit,
    faceIndex: Unit,
    postProcesses: js.Array[PostProcess],
    forceFullscreenViewport: Boolean
  ): Unit = js.native
  def _finalizeFrame(
    doNotPresent: Boolean,
    targetTexture: Unit,
    faceIndex: Unit,
    postProcesses: Unit,
    forceFullscreenViewport: Boolean
  ): Unit = js.native
  def _finalizeFrame(doNotPresent: Boolean, targetTexture: RenderTargetWrapper): Unit = js.native
  def _finalizeFrame(doNotPresent: Boolean, targetTexture: RenderTargetWrapper, faceIndex: Double): Unit = js.native
  def _finalizeFrame(
    doNotPresent: Boolean,
    targetTexture: RenderTargetWrapper,
    faceIndex: Double,
    postProcesses: js.Array[PostProcess]
  ): Unit = js.native
  def _finalizeFrame(
    doNotPresent: Boolean,
    targetTexture: RenderTargetWrapper,
    faceIndex: Double,
    postProcesses: js.Array[PostProcess],
    forceFullscreenViewport: Boolean
  ): Unit = js.native
  def _finalizeFrame(
    doNotPresent: Boolean,
    targetTexture: RenderTargetWrapper,
    faceIndex: Double,
    postProcesses: Unit,
    forceFullscreenViewport: Boolean
  ): Unit = js.native
  def _finalizeFrame(
    doNotPresent: Boolean,
    targetTexture: RenderTargetWrapper,
    faceIndex: Unit,
    postProcesses: js.Array[PostProcess]
  ): Unit = js.native
  def _finalizeFrame(
    doNotPresent: Boolean,
    targetTexture: RenderTargetWrapper,
    faceIndex: Unit,
    postProcesses: js.Array[PostProcess],
    forceFullscreenViewport: Boolean
  ): Unit = js.native
  def _finalizeFrame(
    doNotPresent: Boolean,
    targetTexture: RenderTargetWrapper,
    faceIndex: Unit,
    postProcesses: Unit,
    forceFullscreenViewport: Boolean
  ): Unit = js.native
  def _finalizeFrame(doNotPresent: Unit, targetTexture: Unit, faceIndex: Double): Unit = js.native
  def _finalizeFrame(doNotPresent: Unit, targetTexture: Unit, faceIndex: Double, postProcesses: js.Array[PostProcess]): Unit = js.native
  def _finalizeFrame(
    doNotPresent: Unit,
    targetTexture: Unit,
    faceIndex: Double,
    postProcesses: js.Array[PostProcess],
    forceFullscreenViewport: Boolean
  ): Unit = js.native
  def _finalizeFrame(
    doNotPresent: Unit,
    targetTexture: Unit,
    faceIndex: Double,
    postProcesses: Unit,
    forceFullscreenViewport: Boolean
  ): Unit = js.native
  def _finalizeFrame(doNotPresent: Unit, targetTexture: Unit, faceIndex: Unit, postProcesses: js.Array[PostProcess]): Unit = js.native
  def _finalizeFrame(
    doNotPresent: Unit,
    targetTexture: Unit,
    faceIndex: Unit,
    postProcesses: js.Array[PostProcess],
    forceFullscreenViewport: Boolean
  ): Unit = js.native
  def _finalizeFrame(
    doNotPresent: Unit,
    targetTexture: Unit,
    faceIndex: Unit,
    postProcesses: Unit,
    forceFullscreenViewport: Boolean
  ): Unit = js.native
  def _finalizeFrame(doNotPresent: Unit, targetTexture: RenderTargetWrapper): Unit = js.native
  def _finalizeFrame(doNotPresent: Unit, targetTexture: RenderTargetWrapper, faceIndex: Double): Unit = js.native
  def _finalizeFrame(
    doNotPresent: Unit,
    targetTexture: RenderTargetWrapper,
    faceIndex: Double,
    postProcesses: js.Array[PostProcess]
  ): Unit = js.native
  def _finalizeFrame(
    doNotPresent: Unit,
    targetTexture: RenderTargetWrapper,
    faceIndex: Double,
    postProcesses: js.Array[PostProcess],
    forceFullscreenViewport: Boolean
  ): Unit = js.native
  def _finalizeFrame(
    doNotPresent: Unit,
    targetTexture: RenderTargetWrapper,
    faceIndex: Double,
    postProcesses: Unit,
    forceFullscreenViewport: Boolean
  ): Unit = js.native
  def _finalizeFrame(
    doNotPresent: Unit,
    targetTexture: RenderTargetWrapper,
    faceIndex: Unit,
    postProcesses: js.Array[PostProcess]
  ): Unit = js.native
  def _finalizeFrame(
    doNotPresent: Unit,
    targetTexture: RenderTargetWrapper,
    faceIndex: Unit,
    postProcesses: js.Array[PostProcess],
    forceFullscreenViewport: Boolean
  ): Unit = js.native
  def _finalizeFrame(
    doNotPresent: Unit,
    targetTexture: RenderTargetWrapper,
    faceIndex: Unit,
    postProcesses: Unit,
    forceFullscreenViewport: Boolean
  ): Unit = js.native
  
  /* private */ var _indexBuffer: Any = js.native
  
  /* private */ var _prepareBuffers: Any = js.native
  
  /**
    * Prepares a frame to be run through a post process.
    * @param sourceTexture The input texture to the post processes. (default: null)
    * @param postProcesses An array of post processes to be run. (default: null)
    * @returns True if the post processes were able to be run.
    * @hidden
    */
  def _prepareFrame(): Boolean = js.native
  def _prepareFrame(sourceTexture: Unit, postProcesses: Nullable[js.Array[PostProcess]]): Boolean = js.native
  def _prepareFrame(sourceTexture: Nullable[InternalTexture]): Boolean = js.native
  def _prepareFrame(sourceTexture: Nullable[InternalTexture], postProcesses: Nullable[js.Array[PostProcess]]): Boolean = js.native
  
  /**
    * Rebuilds the vertex buffers of the manager.
    * @hidden
    */
  def _rebuild(): Unit = js.native
  
  /* private */ var _scene: Any = js.native
  
  /* private */ var _vertexBuffers: Any = js.native
  
  /**
    * Manually render a set of post processes to a texture.
    * Please note, the frame buffer won't be unbound after the call in case you have more render to do.
    * @param postProcesses An array of post processes to be run.
    * @param targetTexture The render target wrapper to render to.
    * @param forceFullscreenViewport force gl.viewport to be full screen eg. 0,0,textureWidth,textureHeight
    * @param faceIndex defines the face to render to if a cubemap is defined as the target
    * @param lodLevel defines which lod of the texture to render to
    * @param doNotBindFrambuffer If set to true, assumes that the framebuffer has been bound previously
    */
  def directRender(postProcesses: js.Array[PostProcess]): Unit = js.native
  def directRender(postProcesses: js.Array[PostProcess], targetTexture: Unit, forceFullscreenViewport: Boolean): Unit = js.native
  def directRender(
    postProcesses: js.Array[PostProcess],
    targetTexture: Unit,
    forceFullscreenViewport: Boolean,
    faceIndex: Double
  ): Unit = js.native
  def directRender(
    postProcesses: js.Array[PostProcess],
    targetTexture: Unit,
    forceFullscreenViewport: Boolean,
    faceIndex: Double,
    lodLevel: Double
  ): Unit = js.native
  def directRender(
    postProcesses: js.Array[PostProcess],
    targetTexture: Unit,
    forceFullscreenViewport: Boolean,
    faceIndex: Double,
    lodLevel: Double,
    doNotBindFrambuffer: Boolean
  ): Unit = js.native
  def directRender(
    postProcesses: js.Array[PostProcess],
    targetTexture: Unit,
    forceFullscreenViewport: Boolean,
    faceIndex: Double,
    lodLevel: Unit,
    doNotBindFrambuffer: Boolean
  ): Unit = js.native
  def directRender(
    postProcesses: js.Array[PostProcess],
    targetTexture: Unit,
    forceFullscreenViewport: Boolean,
    faceIndex: Unit,
    lodLevel: Double
  ): Unit = js.native
  def directRender(
    postProcesses: js.Array[PostProcess],
    targetTexture: Unit,
    forceFullscreenViewport: Boolean,
    faceIndex: Unit,
    lodLevel: Double,
    doNotBindFrambuffer: Boolean
  ): Unit = js.native
  def directRender(
    postProcesses: js.Array[PostProcess],
    targetTexture: Unit,
    forceFullscreenViewport: Boolean,
    faceIndex: Unit,
    lodLevel: Unit,
    doNotBindFrambuffer: Boolean
  ): Unit = js.native
  def directRender(
    postProcesses: js.Array[PostProcess],
    targetTexture: Unit,
    forceFullscreenViewport: Unit,
    faceIndex: Double
  ): Unit = js.native
  def directRender(
    postProcesses: js.Array[PostProcess],
    targetTexture: Unit,
    forceFullscreenViewport: Unit,
    faceIndex: Double,
    lodLevel: Double
  ): Unit = js.native
  def directRender(
    postProcesses: js.Array[PostProcess],
    targetTexture: Unit,
    forceFullscreenViewport: Unit,
    faceIndex: Double,
    lodLevel: Double,
    doNotBindFrambuffer: Boolean
  ): Unit = js.native
  def directRender(
    postProcesses: js.Array[PostProcess],
    targetTexture: Unit,
    forceFullscreenViewport: Unit,
    faceIndex: Double,
    lodLevel: Unit,
    doNotBindFrambuffer: Boolean
  ): Unit = js.native
  def directRender(
    postProcesses: js.Array[PostProcess],
    targetTexture: Unit,
    forceFullscreenViewport: Unit,
    faceIndex: Unit,
    lodLevel: Double
  ): Unit = js.native
  def directRender(
    postProcesses: js.Array[PostProcess],
    targetTexture: Unit,
    forceFullscreenViewport: Unit,
    faceIndex: Unit,
    lodLevel: Double,
    doNotBindFrambuffer: Boolean
  ): Unit = js.native
  def directRender(
    postProcesses: js.Array[PostProcess],
    targetTexture: Unit,
    forceFullscreenViewport: Unit,
    faceIndex: Unit,
    lodLevel: Unit,
    doNotBindFrambuffer: Boolean
  ): Unit = js.native
  def directRender(postProcesses: js.Array[PostProcess], targetTexture: Nullable[RenderTargetWrapper]): Unit = js.native
  def directRender(
    postProcesses: js.Array[PostProcess],
    targetTexture: Nullable[RenderTargetWrapper],
    forceFullscreenViewport: Boolean
  ): Unit = js.native
  def directRender(
    postProcesses: js.Array[PostProcess],
    targetTexture: Nullable[RenderTargetWrapper],
    forceFullscreenViewport: Boolean,
    faceIndex: Double
  ): Unit = js.native
  def directRender(
    postProcesses: js.Array[PostProcess],
    targetTexture: Nullable[RenderTargetWrapper],
    forceFullscreenViewport: Boolean,
    faceIndex: Double,
    lodLevel: Double
  ): Unit = js.native
  def directRender(
    postProcesses: js.Array[PostProcess],
    targetTexture: Nullable[RenderTargetWrapper],
    forceFullscreenViewport: Boolean,
    faceIndex: Double,
    lodLevel: Double,
    doNotBindFrambuffer: Boolean
  ): Unit = js.native
  def directRender(
    postProcesses: js.Array[PostProcess],
    targetTexture: Nullable[RenderTargetWrapper],
    forceFullscreenViewport: Boolean,
    faceIndex: Double,
    lodLevel: Unit,
    doNotBindFrambuffer: Boolean
  ): Unit = js.native
  def directRender(
    postProcesses: js.Array[PostProcess],
    targetTexture: Nullable[RenderTargetWrapper],
    forceFullscreenViewport: Boolean,
    faceIndex: Unit,
    lodLevel: Double
  ): Unit = js.native
  def directRender(
    postProcesses: js.Array[PostProcess],
    targetTexture: Nullable[RenderTargetWrapper],
    forceFullscreenViewport: Boolean,
    faceIndex: Unit,
    lodLevel: Double,
    doNotBindFrambuffer: Boolean
  ): Unit = js.native
  def directRender(
    postProcesses: js.Array[PostProcess],
    targetTexture: Nullable[RenderTargetWrapper],
    forceFullscreenViewport: Boolean,
    faceIndex: Unit,
    lodLevel: Unit,
    doNotBindFrambuffer: Boolean
  ): Unit = js.native
  def directRender(
    postProcesses: js.Array[PostProcess],
    targetTexture: Nullable[RenderTargetWrapper],
    forceFullscreenViewport: Unit,
    faceIndex: Double
  ): Unit = js.native
  def directRender(
    postProcesses: js.Array[PostProcess],
    targetTexture: Nullable[RenderTargetWrapper],
    forceFullscreenViewport: Unit,
    faceIndex: Double,
    lodLevel: Double
  ): Unit = js.native
  def directRender(
    postProcesses: js.Array[PostProcess],
    targetTexture: Nullable[RenderTargetWrapper],
    forceFullscreenViewport: Unit,
    faceIndex: Double,
    lodLevel: Double,
    doNotBindFrambuffer: Boolean
  ): Unit = js.native
  def directRender(
    postProcesses: js.Array[PostProcess],
    targetTexture: Nullable[RenderTargetWrapper],
    forceFullscreenViewport: Unit,
    faceIndex: Double,
    lodLevel: Unit,
    doNotBindFrambuffer: Boolean
  ): Unit = js.native
  def directRender(
    postProcesses: js.Array[PostProcess],
    targetTexture: Nullable[RenderTargetWrapper],
    forceFullscreenViewport: Unit,
    faceIndex: Unit,
    lodLevel: Double
  ): Unit = js.native
  def directRender(
    postProcesses: js.Array[PostProcess],
    targetTexture: Nullable[RenderTargetWrapper],
    forceFullscreenViewport: Unit,
    faceIndex: Unit,
    lodLevel: Double,
    doNotBindFrambuffer: Boolean
  ): Unit = js.native
  def directRender(
    postProcesses: js.Array[PostProcess],
    targetTexture: Nullable[RenderTargetWrapper],
    forceFullscreenViewport: Unit,
    faceIndex: Unit,
    lodLevel: Unit,
    doNotBindFrambuffer: Boolean
  ): Unit = js.native
  
  /**
    * Disposes of the post process manager.
    */
  def dispose(): Unit = js.native
}
