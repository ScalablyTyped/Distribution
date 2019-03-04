package typings
package chaynsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// chayns.share()
trait ShareConfig extends js.Object {
  var imageUrl: js.UndefOr[java.lang.String] = js.undefined
  var sharingAndroidApp: js.UndefOr[java.lang.String] = js.undefined
  var sharingApp: scala.Double
  var text: java.lang.String
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object ShareConfig {
  @scala.inline
  def apply(
    sharingApp: scala.Double,
    text: java.lang.String,
    imageUrl: java.lang.String = null,
    sharingAndroidApp: java.lang.String = null,
    title: java.lang.String = null
  ): ShareConfig = {
    val __obj = js.Dynamic.literal(sharingApp = sharingApp, text = text)
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl)
    if (sharingAndroidApp != null) __obj.updateDynamic("sharingAndroidApp")(sharingAndroidApp)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[ShareConfig]
  }
}

