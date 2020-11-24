package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Far extends js.Object {
  
  var aspectRatio: Double = js.native
  
  var far: js.UndefOr[Double] = js.native
  
  var fov: Double = js.native
  
  var near: js.UndefOr[Double] = js.native
  
  var xOffset: js.UndefOr[Double] = js.native
  
  var yOffset: js.UndefOr[Double] = js.native
}
object Far {
  
  @scala.inline
  def apply(aspectRatio: Double, fov: Double): Far = {
    val __obj = js.Dynamic.literal(aspectRatio = aspectRatio.asInstanceOf[js.Any], fov = fov.asInstanceOf[js.Any])
    __obj.asInstanceOf[Far]
  }
  
  @scala.inline
  implicit class FarOps[Self <: Far] (val x: Self) extends AnyVal {
    
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
    def setAspectRatio(value: Double): Self = this.set("aspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFov(value: Double): Self = this.set("fov", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFar(value: Double): Self = this.set("far", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFar: Self = this.set("far", js.undefined)
    
    @scala.inline
    def setNear(value: Double): Self = this.set("near", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNear: Self = this.set("near", js.undefined)
    
    @scala.inline
    def setXOffset(value: Double): Self = this.set("xOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXOffset: Self = this.set("xOffset", js.undefined)
    
    @scala.inline
    def setYOffset(value: Double): Self = this.set("yOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteYOffset: Self = this.set("yOffset", js.undefined)
  }
}
