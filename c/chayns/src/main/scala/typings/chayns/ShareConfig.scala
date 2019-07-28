package typings.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// chayns.share()
trait ShareConfig extends js.Object {
  var imageUrl: js.UndefOr[String] = js.undefined
  var sharingAndroidApp: js.UndefOr[String] = js.undefined
  var sharingApp: Double
  var text: String
  var title: js.UndefOr[String] = js.undefined
}

object ShareConfig {
  @scala.inline
  def apply(
    sharingApp: Double,
    text: String,
    imageUrl: String = null,
    sharingAndroidApp: String = null,
    title: String = null
  ): ShareConfig = {
    val __obj = js.Dynamic.literal(sharingApp = sharingApp, text = text)
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl)
    if (sharingAndroidApp != null) __obj.updateDynamic("sharingAndroidApp")(sharingAndroidApp)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ShareConfig]
  }
}

