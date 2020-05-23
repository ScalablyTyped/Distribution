package typings.babelPluginReactHtmlAttrs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoHTMLAttributes[T] extends MediaHTMLAttributes[T] {
  var disablePictureInPicture: js.UndefOr[Boolean] = js.undefined
  var disablepictureinpicture: js.UndefOr[Boolean | String] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var poster: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
}

object VideoHTMLAttributes {
  @scala.inline
  def apply[T](
    MediaHTMLAttributes: MediaHTMLAttributes[T] = null,
    disablePictureInPicture: js.UndefOr[Boolean] = js.undefined,
    disablepictureinpicture: Boolean | String = null,
    height: Double | String = null,
    poster: String = null,
    width: Double | String = null
  ): VideoHTMLAttributes[T] = {
    val __obj = js.Dynamic.literal()
    if (MediaHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, MediaHTMLAttributes)
    if (!js.isUndefined(disablePictureInPicture)) __obj.updateDynamic("disablePictureInPicture")(disablePictureInPicture.get.asInstanceOf[js.Any])
    if (disablepictureinpicture != null) __obj.updateDynamic("disablepictureinpicture")(disablepictureinpicture.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (poster != null) __obj.updateDynamic("poster")(poster.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoHTMLAttributes[T]]
  }
}

