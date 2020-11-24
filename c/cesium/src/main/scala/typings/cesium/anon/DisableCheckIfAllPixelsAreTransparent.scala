package typings.cesium.anon

import typings.cesium.mod.Cartesian2
import typings.cesium.mod.Resource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisableCheckIfAllPixelsAreTransparent extends js.Object {
  
  var disableCheckIfAllPixelsAreTransparent: js.UndefOr[Boolean] = js.native
  
  var missingImageUrl: Resource | String = js.native
  
  var pixelsToCheck: js.Array[Cartesian2] = js.native
}
object DisableCheckIfAllPixelsAreTransparent {
  
  @scala.inline
  def apply(missingImageUrl: Resource | String, pixelsToCheck: js.Array[Cartesian2]): DisableCheckIfAllPixelsAreTransparent = {
    val __obj = js.Dynamic.literal(missingImageUrl = missingImageUrl.asInstanceOf[js.Any], pixelsToCheck = pixelsToCheck.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableCheckIfAllPixelsAreTransparent]
  }
  
  @scala.inline
  implicit class DisableCheckIfAllPixelsAreTransparentOps[Self <: DisableCheckIfAllPixelsAreTransparent] (val x: Self) extends AnyVal {
    
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
    def setMissingImageUrl(value: Resource | String): Self = this.set("missingImageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelsToCheckVarargs(value: Cartesian2*): Self = this.set("pixelsToCheck", js.Array(value :_*))
    
    @scala.inline
    def setPixelsToCheck(value: js.Array[Cartesian2]): Self = this.set("pixelsToCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableCheckIfAllPixelsAreTransparent(value: Boolean): Self = this.set("disableCheckIfAllPixelsAreTransparent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableCheckIfAllPixelsAreTransparent: Self = this.set("disableCheckIfAllPixelsAreTransparent", js.undefined)
  }
}
