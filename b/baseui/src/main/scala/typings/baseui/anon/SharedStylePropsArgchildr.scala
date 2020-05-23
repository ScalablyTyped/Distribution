package typings.baseui.anon

import typings.baseui.baseuiStrings.auto
import typings.baseui.baseuiStrings.bottom
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.full
import typings.baseui.baseuiStrings.left
import typings.baseui.baseuiStrings.right
import typings.baseui.baseuiStrings.top
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined baseui.baseui/drawer.SharedStylePropsArg & {  children  :react.react.ReactNode} */
trait SharedStylePropsArgchildr extends js.Object {
  @JSName("$anchor")
  var $anchor: js.UndefOr[left | right | top | bottom] = js.undefined
  @JSName("$animating")
  var $animating: js.UndefOr[Boolean] = js.undefined
  @JSName("$closeable")
  var $closeable: js.UndefOr[Boolean] = js.undefined
  @JSName("$isOpen")
  var $isOpen: js.UndefOr[Boolean] = js.undefined
  @JSName("$isVisible")
  var $isVisible: js.UndefOr[Boolean] = js.undefined
  @JSName("$size")
  var $size: js.UndefOr[default_ | full | auto] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
}

object SharedStylePropsArgchildr {
  @scala.inline
  def apply(
    $anchor: left | right | top | bottom = null,
    $animating: js.UndefOr[Boolean] = js.undefined,
    $closeable: js.UndefOr[Boolean] = js.undefined,
    $isOpen: js.UndefOr[Boolean] = js.undefined,
    $isVisible: js.UndefOr[Boolean] = js.undefined,
    $size: default_ | full | auto = null,
    children: ReactNode = null
  ): SharedStylePropsArgchildr = {
    val __obj = js.Dynamic.literal()
    if ($anchor != null) __obj.updateDynamic("$anchor")($anchor.asInstanceOf[js.Any])
    if (!js.isUndefined($animating)) __obj.updateDynamic("$animating")($animating.get.asInstanceOf[js.Any])
    if (!js.isUndefined($closeable)) __obj.updateDynamic("$closeable")($closeable.get.asInstanceOf[js.Any])
    if (!js.isUndefined($isOpen)) __obj.updateDynamic("$isOpen")($isOpen.get.asInstanceOf[js.Any])
    if (!js.isUndefined($isVisible)) __obj.updateDynamic("$isVisible")($isVisible.get.asInstanceOf[js.Any])
    if ($size != null) __obj.updateDynamic("$size")($size.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedStylePropsArgchildr]
  }
}

