package typings
package baseuiLib.cardMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CardProps extends js.Object {
  val action: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  val children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  val hasThumbnail: js.UndefOr[js.Function1[/* props */ baseuiLib.Anon_Thumbnail, scala.Boolean]] = js.undefined
  val headerImage: js.UndefOr[java.lang.String] = js.undefined
  val overrides: js.UndefOr[CardOverrides] = js.undefined
  val thumbnail: js.UndefOr[java.lang.String] = js.undefined
  val title: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
}

object CardProps {
  @scala.inline
  def apply(
    action: reactLib.reactMod.ReactNode = null,
    children: reactLib.reactMod.ReactNode = null,
    hasThumbnail: /* props */ baseuiLib.Anon_Thumbnail => scala.Boolean = null,
    headerImage: java.lang.String = null,
    overrides: CardOverrides = null,
    thumbnail: java.lang.String = null,
    title: reactLib.reactMod.ReactNode = null
  ): CardProps = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (hasThumbnail != null) __obj.updateDynamic("hasThumbnail")(js.Any.fromFunction1(hasThumbnail))
    if (headerImage != null) __obj.updateDynamic("headerImage")(headerImage)
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    if (thumbnail != null) __obj.updateDynamic("thumbnail")(thumbnail)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardProps]
  }
}

