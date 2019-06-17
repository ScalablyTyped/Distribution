package typings
package baseuiLib.cardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardOverrides extends js.Object {
  var Action: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var Body: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var Contents: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var HeaderImage: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var Root: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var Thumbnail: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var Title: js.UndefOr[baseuiLib.Override[_]] = js.undefined
}

object CardOverrides {
  @scala.inline
  def apply(
    Action: baseuiLib.Override[_] = null,
    Body: baseuiLib.Override[_] = null,
    Contents: baseuiLib.Override[_] = null,
    HeaderImage: baseuiLib.Override[_] = null,
    Root: baseuiLib.Override[_] = null,
    Thumbnail: baseuiLib.Override[_] = null,
    Title: baseuiLib.Override[_] = null
  ): CardOverrides = {
    val __obj = js.Dynamic.literal()
    if (Action != null) __obj.updateDynamic("Action")(Action.asInstanceOf[js.Any])
    if (Body != null) __obj.updateDynamic("Body")(Body.asInstanceOf[js.Any])
    if (Contents != null) __obj.updateDynamic("Contents")(Contents.asInstanceOf[js.Any])
    if (HeaderImage != null) __obj.updateDynamic("HeaderImage")(HeaderImage.asInstanceOf[js.Any])
    if (Root != null) __obj.updateDynamic("Root")(Root.asInstanceOf[js.Any])
    if (Thumbnail != null) __obj.updateDynamic("Thumbnail")(Thumbnail.asInstanceOf[js.Any])
    if (Title != null) __obj.updateDynamic("Title")(Title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardOverrides]
  }
}

