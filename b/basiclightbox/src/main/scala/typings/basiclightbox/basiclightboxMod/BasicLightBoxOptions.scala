package typings.basiclightbox.basiclightboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicLightBoxOptions extends js.Object {
  /*
    * One or more space separated classes to be added to the basicLightbox element.
    */
  var className: js.UndefOr[String] = js.undefined
  /*
    * Prevents the lightbox from closing when clicking its background.
    */
  var closable: js.UndefOr[Boolean] = js.undefined
  /*
    * Function that gets executed before the lightbox closes.
    * Returning false will prevent the lightbox from closing.
    */
  var onClose: js.UndefOr[js.Function1[/* instance */ BasicLightBox, Boolean]] = js.undefined
  /*
    * Function that gets executed before the lightbox will be shown.
    * Returning false will prevent the lightbox from showing.
    */
  var onShow: js.UndefOr[js.Function1[/* instance */ BasicLightBox, Boolean]] = js.undefined
}

object BasicLightBoxOptions {
  @scala.inline
  def apply(
    className: String = null,
    closable: js.UndefOr[Boolean] = js.undefined,
    onClose: /* instance */ BasicLightBox => Boolean = null,
    onShow: /* instance */ BasicLightBox => Boolean = null
  ): BasicLightBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(closable)) __obj.updateDynamic("closable")(closable.asInstanceOf[js.Any])
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction1(onClose))
    if (onShow != null) __obj.updateDynamic("onShow")(js.Any.fromFunction1(onShow))
    __obj.asInstanceOf[BasicLightBoxOptions]
  }
}

