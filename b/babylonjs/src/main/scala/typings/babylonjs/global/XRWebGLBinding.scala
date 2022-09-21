package typings.babylonjs.global

import typings.babylonjs.WebGL2RenderingContext
import typings.babylonjs.XRSession
import typings.std.WebGLRenderingContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// https://www.w3.org/TR/webxrlayers-1/#XRWebGLBindingtype
@JSGlobal("XRWebGLBinding")
@js.native
open class XRWebGLBinding protected ()
  extends StObject
     with typings.babylonjs.XRWebGLBinding {
  def this(xrSession: XRSession, context: WebGL2RenderingContext) = this()
  def this(xrSession: XRSession, context: WebGLRenderingContext) = this()
}
