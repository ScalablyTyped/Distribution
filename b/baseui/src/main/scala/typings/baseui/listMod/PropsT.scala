package typings.baseui.listMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PropsT extends js.Object {
  var artwork: js.UndefOr[ReactNode] = js.undefined
  var artworkSize: js.UndefOr[ArtworkSizesT] = js.undefined
  var children: ReactNode
  var endEnhancer: js.UndefOr[ReactNode] = js.undefined
  var overrides: js.UndefOr[OverridesT] = js.undefined
  var sublist: js.UndefOr[Boolean] = js.undefined
}

object PropsT {
  @scala.inline
  def apply(
    artwork: ReactNode = null,
    artworkSize: ArtworkSizesT = null,
    children: ReactNode = null,
    endEnhancer: ReactNode = null,
    overrides: OverridesT = null,
    sublist: js.UndefOr[Boolean] = js.undefined
  ): PropsT = {
    val __obj = js.Dynamic.literal()
    if (artwork != null) __obj.updateDynamic("artwork")(artwork.asInstanceOf[js.Any])
    if (artworkSize != null) __obj.updateDynamic("artworkSize")(artworkSize.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (endEnhancer != null) __obj.updateDynamic("endEnhancer")(endEnhancer.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(sublist)) __obj.updateDynamic("sublist")(sublist.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropsT]
  }
}

