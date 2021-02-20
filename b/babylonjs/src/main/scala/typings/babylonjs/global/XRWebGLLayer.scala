package typings.babylonjs.global

import typings.babylonjs.WebGLRenderingContext
import typings.babylonjs.XRSession
import typings.babylonjs.XRWebGLLayerInit
import typings.std.WebGL2RenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("XRWebGLLayer")
@js.native
class XRWebGLLayer protected ()
  extends typings.babylonjs.XRWebGLLayer {
  def this(session: XRSession, context: WebGLRenderingContext) = this()
  def this(session: XRSession, context: WebGL2RenderingContext) = this()
  def this(session: XRSession, context: WebGLRenderingContext, layerInit: XRWebGLLayerInit) = this()
  def this(session: XRSession, context: WebGL2RenderingContext, layerInit: XRWebGLLayerInit) = this()
}
object XRWebGLLayer {
  
  /* static member */
  @JSGlobal("XRWebGLLayer.getNativeFramebufferScaleFactor")
  @js.native
  def getNativeFramebufferScaleFactor(session: XRSession): Double = js.native
}
