package typings.cssFontLoadingModule.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontFaceDescriptors extends js.Object {
  var featureSettings: js.UndefOr[String] = js.native
  var stretch: js.UndefOr[String] = js.native
  var style: js.UndefOr[String] = js.native
  var unicodeRange: js.UndefOr[String] = js.native
  var variant: js.UndefOr[String] = js.native
  var weight: js.UndefOr[String] = js.native
}

object FontFaceDescriptors {
  @scala.inline
  def apply(): FontFaceDescriptors = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontFaceDescriptors]
  }
  @scala.inline
  implicit class FontFaceDescriptorsOps[Self <: FontFaceDescriptors] (val x: Self) extends AnyVal {
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
    def setFeatureSettings(value: String): Self = this.set("featureSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFeatureSettings: Self = this.set("featureSettings", js.undefined)
    @scala.inline
    def setStretch(value: String): Self = this.set("stretch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStretch: Self = this.set("stretch", js.undefined)
    @scala.inline
    def setStyle(value: String): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setUnicodeRange(value: String): Self = this.set("unicodeRange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnicodeRange: Self = this.set("unicodeRange", js.undefined)
    @scala.inline
    def setVariant(value: String): Self = this.set("variant", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVariant: Self = this.set("variant", js.undefined)
    @scala.inline
    def setWeight(value: String): Self = this.set("weight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeight: Self = this.set("weight", js.undefined)
  }
  
}

