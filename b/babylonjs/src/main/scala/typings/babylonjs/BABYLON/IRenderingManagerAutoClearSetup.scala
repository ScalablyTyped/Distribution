package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRenderingManagerAutoClearSetup extends js.Object {
  
  /**
    * Defines whether or not autoclear is enable.
    */
  var autoClear: Boolean = js.native
  
  /**
    * Defines whether or not to autoclear the depth buffer.
    */
  var depth: Boolean = js.native
  
  /**
    * Defines whether or not to autoclear the stencil buffer.
    */
  var stencil: Boolean = js.native
}
object IRenderingManagerAutoClearSetup {
  
  @scala.inline
  def apply(autoClear: Boolean, depth: Boolean, stencil: Boolean): IRenderingManagerAutoClearSetup = {
    val __obj = js.Dynamic.literal(autoClear = autoClear.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], stencil = stencil.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRenderingManagerAutoClearSetup]
  }
  
  @scala.inline
  implicit class IRenderingManagerAutoClearSetupOps[Self <: IRenderingManagerAutoClearSetup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoClear(value: Boolean): Self = this.set("autoClear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepth(value: Boolean): Self = this.set("depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStencil(value: Boolean): Self = this.set("stencil", value.asInstanceOf[js.Any])
  }
}
