package typings.baseui.listMod

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLLIElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuAdapterPropsT extends PropsT {
  @JSName("$disabled")
  var $disabled: Boolean
  @JSName("$isHighlighted")
  var $isHighlighted: Boolean
  @JSName("$size")
  var $size: String
  // eslint-disable-next-line flowtype/no-weak-types
  var item: js.Any
  def onClick(event: MouseEvent[HTMLLIElement, NativeMouseEvent]): js.Any
  def onMouseEnter(event: MouseEvent[HTMLLIElement, NativeMouseEvent]): js.Any
}

object MenuAdapterPropsT {
  @scala.inline
  def apply(
    $disabled: Boolean,
    $isHighlighted: Boolean,
    $size: String,
    item: js.Any,
    onClick: MouseEvent[HTMLLIElement, NativeMouseEvent] => js.Any,
    onMouseEnter: MouseEvent[HTMLLIElement, NativeMouseEvent] => js.Any,
    artwork: ReactNode = null,
    artworkSize: ArtworkSizesT | Double = null,
    children: ReactNode = null,
    endEnhancer: ReactNode = null,
    overrides: OverridesT = null,
    sublist: js.UndefOr[Boolean] = js.undefined
  ): MenuAdapterPropsT = {
    val __obj = js.Dynamic.literal($disabled = $disabled.asInstanceOf[js.Any], $isHighlighted = $isHighlighted.asInstanceOf[js.Any], $size = $size.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], onClick = js.Any.fromFunction1(onClick), onMouseEnter = js.Any.fromFunction1(onMouseEnter))
    if (artwork != null) __obj.updateDynamic("artwork")(artwork.asInstanceOf[js.Any])
    if (artworkSize != null) __obj.updateDynamic("artworkSize")(artworkSize.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (endEnhancer != null) __obj.updateDynamic("endEnhancer")(endEnhancer.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (!js.isUndefined(sublist)) __obj.updateDynamic("sublist")(sublist.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuAdapterPropsT]
  }
}

