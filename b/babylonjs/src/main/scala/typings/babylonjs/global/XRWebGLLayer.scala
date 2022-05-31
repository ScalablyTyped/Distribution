package typings.babylonjs.global

import typings.babylonjs.WebGLRenderingContext
import typings.babylonjs.XRSession
import typings.babylonjs.XRView
import typings.babylonjs.XRViewport
import typings.babylonjs.XRWebGLLayerInit
import typings.std.WebGL2RenderingContext
import typings.std.WebGLFramebuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("XRWebGLLayer")
@js.native
class XRWebGLLayer protected ()
  extends StObject
     with typings.babylonjs.XRWebGLLayer {
  def this(session: XRSession, context: WebGLRenderingContext) = this()
  def this(session: XRSession, context: WebGL2RenderingContext) = this()
  def this(session: XRSession, context: WebGLRenderingContext, layerInit: XRWebGLLayerInit) = this()
  def this(session: XRSession, context: WebGL2RenderingContext, layerInit: XRWebGLLayerInit) = this()
  
  /* CompleteClass */
  override val antialias: Boolean = js.native
  
  /* CompleteClass */
  override val framebuffer: WebGLFramebuffer = js.native
  
  /* CompleteClass */
  override val framebufferHeight: Double = js.native
  
  /* CompleteClass */
  override val framebufferWidth: Double = js.native
  
  /* CompleteClass */
  override def getViewport(view: XRView): XRViewport = js.native
  
  /* CompleteClass */
  override val ignoreDepthValues: Boolean = js.native
}
object XRWebGLLayer {
  
  @JSGlobal("XRWebGLLayer")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getNativeFramebufferScaleFactor(session: XRSession): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getNativeFramebufferScaleFactor")(session.asInstanceOf[js.Any]).asInstanceOf[Double]
}
