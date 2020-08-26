package typings.basiclightbox.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BasicLightBoxOptions extends js.Object {
  /*
    * One or more space separated classes to be added to the basicLightbox element.
    */
  var className: js.UndefOr[String] = js.native
  /*
    * Prevents the lightbox from closing when clicking its background.
    */
  var closable: js.UndefOr[Boolean] = js.native
  /*
    * Function that gets executed before the lightbox closes.
    * Returning false will prevent the lightbox from closing.
    */
  var onClose: js.UndefOr[js.Function1[/* instance */ BasicLightBox, Boolean]] = js.native
  /*
    * Function that gets executed before the lightbox will be shown.
    * Returning false will prevent the lightbox from showing.
    */
  var onShow: js.UndefOr[js.Function1[/* instance */ BasicLightBox, Boolean]] = js.native
}

object BasicLightBoxOptions {
  @scala.inline
  def apply(): BasicLightBoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicLightBoxOptions]
  }
  @scala.inline
  implicit class BasicLightBoxOptionsOps[Self <: BasicLightBoxOptions] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setClosable(value: Boolean): Self = this.set("closable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClosable: Self = this.set("closable", js.undefined)
    @scala.inline
    def setOnClose(value: /* instance */ BasicLightBox => Boolean): Self = this.set("onClose", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    @scala.inline
    def setOnShow(value: /* instance */ BasicLightBox => Boolean): Self = this.set("onShow", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
  }
  
}

