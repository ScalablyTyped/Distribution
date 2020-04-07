package typings.babylonjs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.std.WebGLFramebuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XRWebGLLayer extends js.Object {
  var framebuffer: WebGLFramebuffer
  var framebufferHeight: Double
  var framebufferWidth: Double
  var getViewport: js.Function
}

@JSGlobal("XRWebGLLayer")
@js.native
object XRWebGLLayer
  extends Instantiable1[/* session */ XRSession, XRWebGLLayer]
     with Instantiable2[/* session */ XRSession, /* context */ WebGLRenderingContext, XRWebGLLayer]
     with Instantiable3[
      /* session */ XRSession, 
      js.UndefOr[/* context */ WebGLRenderingContext], 
      /* options */ XRWebGLLayerOptions, 
      XRWebGLLayer
    ]

