package typings.c3.mod

import typings.c3.AnonAnchor
import typings.c3.AnonOnclick
import typings.c3.c3Strings.bottom
import typings.c3.c3Strings.inset
import typings.c3.c3Strings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendOptions extends js.Object {
  /**
    * Defaults to `false`.
    */
  var equally: js.UndefOr[Boolean] = js.undefined
  /**
    * Hide legend
    * If true given, all legend will be hidden. If string or array given, only the legend that has the id will be hidden.
    * Defaults to `false`.
    */
  var hide: js.UndefOr[Boolean | ArrayOrString] = js.undefined
  /**
    * Change inset legend attributes. Ignored unless `legend.position` is `"inset"`.
    */
  var inset: js.UndefOr[AnonAnchor] = js.undefined
  var item: js.UndefOr[AnonOnclick] = js.undefined
  /**
    * Padding between legend elements.
    * Defaults to `0`.
    */
  var padding: js.UndefOr[Double] = js.undefined
  /**
    * Change the position of legend.
    */
  var position: js.UndefOr[bottom | right | inset] = js.undefined
  /**
    * Show or hide legend.
    * Defaults to `true`.
    */
  var show: js.UndefOr[Boolean] = js.undefined
}

object LegendOptions {
  @scala.inline
  def apply(
    equally: js.UndefOr[Boolean] = js.undefined,
    hide: Boolean | ArrayOrString = null,
    inset: AnonAnchor = null,
    item: AnonOnclick = null,
    padding: Int | Double = null,
    position: bottom | right | inset = null,
    show: js.UndefOr[Boolean] = js.undefined
  ): LegendOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(equally)) __obj.updateDynamic("equally")(equally.asInstanceOf[js.Any])
    if (hide != null) __obj.updateDynamic("hide")(hide.asInstanceOf[js.Any])
    if (inset != null) __obj.updateDynamic("inset")(inset.asInstanceOf[js.Any])
    if (item != null) __obj.updateDynamic("item")(item.asInstanceOf[js.Any])
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendOptions]
  }
}

