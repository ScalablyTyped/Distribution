package typings.blueimpLoadImage.mod

import typings.blueimpLoadImage.blueimpLoadImageBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Setting 'aspectRatio' automatically enables 'crop', so setting 'crop' to
// 'false' in that case is not valid
@js.native
trait CropTrueOptions extends CropOptions {
  
  var aspectRatio: js.UndefOr[AspectRatio] = js.native
  
  var crop: js.UndefOr[`true`] = js.native
}
object CropTrueOptions {
  
  @scala.inline
  def apply(): CropTrueOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CropTrueOptions]
  }
  
  @scala.inline
  implicit class CropTrueOptionsOps[Self <: CropTrueOptions] (val x: Self) extends AnyVal {
    
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
    def setAspectRatio(value: AspectRatio): Self = this.set("aspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAspectRatio: Self = this.set("aspectRatio", js.undefined)
    
    @scala.inline
    def setCrop(value: `true`): Self = this.set("crop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrop: Self = this.set("crop", js.undefined)
  }
}
