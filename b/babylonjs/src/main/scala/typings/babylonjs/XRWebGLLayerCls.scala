package typings.babylonjs

import typings.std.WebGLFramebuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("XRWebGLLayer")
@js.native
class XRWebGLLayerCls protected () extends XRWebGLLayer {
  def this(session: XRSession) = this()
  def this(session: XRSession, context: WebGLRenderingContext) = this()
  def this(session: XRSession, context: js.UndefOr[scala.Nothing], options: XRWebGLLayerOptions) = this()
  def this(session: XRSession, context: WebGLRenderingContext, options: XRWebGLLayerOptions) = this()
  /* CompleteClass */
  override var framebuffer: WebGLFramebuffer = js.native
  /* CompleteClass */
  override var framebufferHeight: Double = js.native
  /* CompleteClass */
  override var framebufferWidth: Double = js.native
  /* CompleteClass */
  override var getViewport: js.Function = js.native
}

