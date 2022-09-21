package typings.babylonjs

import typings.std.EventTarget
import typings.std.WebGLFramebuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRWebGLLayer
  extends StObject
     with EventTarget {
  
  // Methods for EventTarget required through XRLayer
  def addEventListener(): Unit = js.native
  
  val antialias: Boolean = js.native
  
  def dispatchEvent(): Boolean = js.native
  
  var fixedFoveation: js.UndefOr[Double | Null] = js.native
  
  val framebuffer: WebGLFramebuffer = js.native
  
  val framebufferHeight: Double = js.native
  
  val framebufferWidth: Double = js.native
  
  def getViewport(view: XRView): XRViewport = js.native
  
  val ignoreDepthValues: Boolean = js.native
  
  def removeEventListener(): Unit = js.native
}
