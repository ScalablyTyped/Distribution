package typings.chromeDashApps.chrome.runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManifestAction extends js.Object {
  var default_icon: js.UndefOr[ManifestIcons] = js.undefined
  var default_popup: js.UndefOr[String] = js.undefined
  var default_title: js.UndefOr[String] = js.undefined
}

object ManifestAction {
  @scala.inline
  def apply(default_icon: ManifestIcons = null, default_popup: String = null, default_title: String = null): ManifestAction = {
    val __obj = js.Dynamic.literal()
    if (default_icon != null) __obj.updateDynamic("default_icon")(default_icon.asInstanceOf[js.Any])
    if (default_popup != null) __obj.updateDynamic("default_popup")(default_popup.asInstanceOf[js.Any])
    if (default_title != null) __obj.updateDynamic("default_title")(default_title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestAction]
  }
}

