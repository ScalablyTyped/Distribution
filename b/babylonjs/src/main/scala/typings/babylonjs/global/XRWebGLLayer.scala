package typings.babylonjs.global

import typings.babylonjs.WebGL2RenderingContext
import typings.babylonjs.XRSession
import typings.babylonjs.XRWebGLLayerInit
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("XRWebGLLayer")
@js.native
open class XRWebGLLayer protected ()
  extends StObject
     with typings.babylonjs.XRWebGLLayer {
  def this(session: XRSession, context: WebGL2RenderingContext) = this()
  def this(session: XRSession, context: WebGLRenderingContext) = this()
  def this(session: XRSession, context: WebGL2RenderingContext, layerInit: XRWebGLLayerInit) = this()
  def this(session: XRSession, context: WebGLRenderingContext, layerInit: XRWebGLLayerInit) = this()
}
object XRWebGLLayer {
  
  @JSGlobal("XRWebGLLayer")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getNativeFramebufferScaleFactor(session: XRSession): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getNativeFramebufferScaleFactor")(session.asInstanceOf[js.Any]).asInstanceOf[Double]
}
