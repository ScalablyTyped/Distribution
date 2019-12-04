package typings.baseui.cardMod

import typings.baseui.Anon_Thumbnail
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardProps extends js.Object {
  val action: js.UndefOr[ReactNode] = js.undefined
  val children: js.UndefOr[ReactNode] = js.undefined
  val hasThumbnail: js.UndefOr[js.Function1[/* props */ Anon_Thumbnail, Boolean]] = js.undefined
  val headerImage: js.UndefOr[String] = js.undefined
  val overrides: js.UndefOr[CardOverrides] = js.undefined
  val thumbnail: js.UndefOr[String] = js.undefined
  val title: js.UndefOr[ReactNode] = js.undefined
}

object CardProps {
  @scala.inline
  def apply(
    action: ReactNode = null,
    children: ReactNode = null,
    hasThumbnail: /* props */ Anon_Thumbnail => Boolean = null,
    headerImage: String = null,
    overrides: CardOverrides = null,
    thumbnail: String = null,
    title: ReactNode = null
  ): CardProps = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (hasThumbnail != null) __obj.updateDynamic("hasThumbnail")(js.Any.fromFunction1(hasThumbnail))
    if (headerImage != null) __obj.updateDynamic("headerImage")(headerImage.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (thumbnail != null) __obj.updateDynamic("thumbnail")(thumbnail.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardProps]
  }
}

