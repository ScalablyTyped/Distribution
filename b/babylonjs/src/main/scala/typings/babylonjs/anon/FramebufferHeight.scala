package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FramebufferHeight extends StObject {
  
  var framebufferHeight: Double = js.native
  
  var framebufferWidth: Double = js.native
}
object FramebufferHeight {
  
  @scala.inline
  def apply(framebufferHeight: Double, framebufferWidth: Double): FramebufferHeight = {
    val __obj = js.Dynamic.literal(framebufferHeight = framebufferHeight.asInstanceOf[js.Any], framebufferWidth = framebufferWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[FramebufferHeight]
  }
  
  @scala.inline
  implicit class FramebufferHeightMutableBuilder[Self <: FramebufferHeight] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFramebufferHeight(value: Double): Self = StObject.set(x, "framebufferHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFramebufferWidth(value: Double): Self = StObject.set(x, "framebufferWidth", value.asInstanceOf[js.Any])
  }
}
