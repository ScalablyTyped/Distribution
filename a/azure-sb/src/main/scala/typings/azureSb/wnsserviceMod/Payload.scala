package typings.azureSb.wnsserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<{  text1 :string,   text2 :string,   text3 :string,   text4 :string,   image1src :string,   image1alt :string,   image2src :string,   image2alt :string,   image3src :string,   image3alt :string,   image4src :string,   image4alt :string,   lang :string,   type :string}> */
@js.native
trait Payload extends js.Object {
  var image1alt: js.UndefOr[String] = js.native
  var image1src: js.UndefOr[String] = js.native
  var image2alt: js.UndefOr[String] = js.native
  var image2src: js.UndefOr[String] = js.native
  var image3alt: js.UndefOr[String] = js.native
  var image3src: js.UndefOr[String] = js.native
  var image4alt: js.UndefOr[String] = js.native
  var image4src: js.UndefOr[String] = js.native
  var lang: js.UndefOr[String] = js.native
  var text1: js.UndefOr[String] = js.native
  var text2: js.UndefOr[String] = js.native
  var text3: js.UndefOr[String] = js.native
  var text4: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object Payload {
  @scala.inline
  def apply(): Payload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Payload]
  }
  @scala.inline
  implicit class PayloadOps[Self <: Payload] (val x: Self) extends AnyVal {
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
    def setImage1alt(value: String): Self = this.set("image1alt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage1alt: Self = this.set("image1alt", js.undefined)
    @scala.inline
    def setImage1src(value: String): Self = this.set("image1src", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage1src: Self = this.set("image1src", js.undefined)
    @scala.inline
    def setImage2alt(value: String): Self = this.set("image2alt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage2alt: Self = this.set("image2alt", js.undefined)
    @scala.inline
    def setImage2src(value: String): Self = this.set("image2src", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage2src: Self = this.set("image2src", js.undefined)
    @scala.inline
    def setImage3alt(value: String): Self = this.set("image3alt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage3alt: Self = this.set("image3alt", js.undefined)
    @scala.inline
    def setImage3src(value: String): Self = this.set("image3src", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage3src: Self = this.set("image3src", js.undefined)
    @scala.inline
    def setImage4alt(value: String): Self = this.set("image4alt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage4alt: Self = this.set("image4alt", js.undefined)
    @scala.inline
    def setImage4src(value: String): Self = this.set("image4src", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage4src: Self = this.set("image4src", js.undefined)
    @scala.inline
    def setLang(value: String): Self = this.set("lang", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    @scala.inline
    def setText1(value: String): Self = this.set("text1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText1: Self = this.set("text1", js.undefined)
    @scala.inline
    def setText2(value: String): Self = this.set("text2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText2: Self = this.set("text2", js.undefined)
    @scala.inline
    def setText3(value: String): Self = this.set("text3", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText3: Self = this.set("text3", js.undefined)
    @scala.inline
    def setText4(value: String): Self = this.set("text4", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText4: Self = this.set("text4", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

