package typings.cathoQuantum.socialsMod

import typings.cathoQuantum.anon.Name
import typings.cathoQuantum.anon.SpacingObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocialsProps extends js.Object {
  var items: NonEmptyArray[Name]
  var size: js.UndefOr[String] = js.undefined
  var theme: js.UndefOr[SpacingObject] = js.undefined
  var withBox: js.UndefOr[Boolean] = js.undefined
}

object SocialsProps {
  @scala.inline
  def apply(
    items: NonEmptyArray[Name],
    size: String = null,
    theme: SpacingObject = null,
    withBox: js.UndefOr[Boolean] = js.undefined
  ): SocialsProps = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    if (!js.isUndefined(withBox)) __obj.updateDynamic("withBox")(withBox.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocialsProps]
  }
}

