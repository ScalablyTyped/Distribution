package typings.c3.c3Mod

import typings.c3.Anon_Anchor
import typings.c3.Anon_Id
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendOptions extends js.Object {
  /**
    * Hide legend
    * If true given, all legend will be hidden. If string or array given, only the legend that has the id will be hidden.
    */
  var hide: js.UndefOr[Boolean | ArrayOrString] = js.undefined
  /**
    * Change inset legend attributes.
    * This option accepts object that has the keys anchor, x, y and step.
    * anchor decides the position of the legend. These anchors are available: top-left, top-right, bottom-left, bottom-right
    * x and y set the position of the legend based on the anchor.
    * step defines the max step the lagend has (e.g. If 2 set and legend has 3 legend item, the legend 2 columns).
    */
  var inset: js.UndefOr[Anon_Anchor] = js.undefined
  var item: js.UndefOr[Anon_Id] = js.undefined
  /**
    * Padding between legend elements.
    */
  var padding: js.UndefOr[Double] = js.undefined
  /**
    * Change the position of legend.
    * Currently bottom, right and inset are supported.
    */
  var position: js.UndefOr[String] = js.undefined
  /**
    * Show or hide legend.
    */
  var show: js.UndefOr[Boolean] = js.undefined
}

object LegendOptions {
  @scala.inline
  def apply(
    hide: Boolean | ArrayOrString = null,
    inset: Anon_Anchor = null,
    item: Anon_Id = null,
    padding: Int | Double = null,
    position: String = null,
    show: js.UndefOr[Boolean] = js.undefined
  ): LegendOptions = {
    val __obj = js.Dynamic.literal()
    if (hide != null) __obj.updateDynamic("hide")(hide.asInstanceOf[js.Any])
    if (inset != null) __obj.updateDynamic("inset")(inset)
    if (item != null) __obj.updateDynamic("item")(item)
    if (padding != null) __obj.updateDynamic("padding")(padding.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    if (!js.isUndefined(show)) __obj.updateDynamic("show")(show)
    __obj.asInstanceOf[LegendOptions]
  }
}

