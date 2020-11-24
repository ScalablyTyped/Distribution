package typings.babylonjs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoPlay extends js.Object {
  
  var autoPlay: js.UndefOr[Boolean] = js.native
  
  var clickToPlay: js.UndefOr[Boolean] = js.native
  
  var crossEyeMode: js.UndefOr[Boolean] = js.native
  
  var faceForward: js.UndefOr[Boolean] = js.native
  
  var generateMipMaps: js.UndefOr[Boolean] = js.native
  
  var halfDomeMode: js.UndefOr[Boolean] = js.native
  
  var loop: js.UndefOr[Boolean] = js.native
  
  var poster: js.UndefOr[String] = js.native
  
  var resolution: js.UndefOr[Double] = js.native
  
  var size: js.UndefOr[Double] = js.native
  
  var useDirectMapping: js.UndefOr[Boolean] = js.native
}
object AutoPlay {
  
  @scala.inline
  def apply(): AutoPlay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoPlay]
  }
  
  @scala.inline
  implicit class AutoPlayOps[Self <: AutoPlay] (val x: Self) extends AnyVal {
    
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
    def setAutoPlay(value: Boolean): Self = this.set("autoPlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoPlay: Self = this.set("autoPlay", js.undefined)
    
    @scala.inline
    def setClickToPlay(value: Boolean): Self = this.set("clickToPlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClickToPlay: Self = this.set("clickToPlay", js.undefined)
    
    @scala.inline
    def setCrossEyeMode(value: Boolean): Self = this.set("crossEyeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossEyeMode: Self = this.set("crossEyeMode", js.undefined)
    
    @scala.inline
    def setFaceForward(value: Boolean): Self = this.set("faceForward", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFaceForward: Self = this.set("faceForward", js.undefined)
    
    @scala.inline
    def setGenerateMipMaps(value: Boolean): Self = this.set("generateMipMaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGenerateMipMaps: Self = this.set("generateMipMaps", js.undefined)
    
    @scala.inline
    def setHalfDomeMode(value: Boolean): Self = this.set("halfDomeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHalfDomeMode: Self = this.set("halfDomeMode", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoop: Self = this.set("loop", js.undefined)
    
    @scala.inline
    def setPoster(value: String): Self = this.set("poster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePoster: Self = this.set("poster", js.undefined)
    
    @scala.inline
    def setResolution(value: Double): Self = this.set("resolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolution: Self = this.set("resolution", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setUseDirectMapping(value: Boolean): Self = this.set("useDirectMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseDirectMapping: Self = this.set("useDirectMapping", js.undefined)
  }
}
