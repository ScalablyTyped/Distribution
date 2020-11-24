package typings.cordovaPluginCamera.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait JPEG extends js.Object {
  
  var JPEG: Double = js.native
  
  var PNG: Double = js.native
}
object JPEG {
  
  @scala.inline
  def apply(JPEG: Double, PNG: Double): JPEG = {
    val __obj = js.Dynamic.literal(JPEG = JPEG.asInstanceOf[js.Any], PNG = PNG.asInstanceOf[js.Any])
    __obj.asInstanceOf[JPEG]
  }
  
  @scala.inline
  implicit class JPEGOps[Self <: JPEG] (val x: Self) extends AnyVal {
    
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
    def setJPEG(value: Double): Self = this.set("JPEG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPNG(value: Double): Self = this.set("PNG", value.asInstanceOf[js.Any])
  }
}
