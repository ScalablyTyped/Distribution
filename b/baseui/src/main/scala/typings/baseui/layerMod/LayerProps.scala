package typings.baseui.layerMod

import typings.react.reactMod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerProps extends js.Object {
  var children: ReactNode
  var host: js.UndefOr[HTMLElement] = js.undefined
  var index: js.UndefOr[Double] = js.undefined
  var mountNode: js.UndefOr[HTMLElement] = js.undefined
  var onMount: js.UndefOr[js.Function0[_]] = js.undefined
  var onUnmount: js.UndefOr[js.Function0[_]] = js.undefined
}

object LayerProps {
  @scala.inline
  def apply(
    children: ReactNode = null,
    host: HTMLElement = null,
    index: Int | Double = null,
    mountNode: HTMLElement = null,
    onMount: () => _ = null,
    onUnmount: () => _ = null
  ): LayerProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (mountNode != null) __obj.updateDynamic("mountNode")(mountNode.asInstanceOf[js.Any])
    if (onMount != null) __obj.updateDynamic("onMount")(js.Any.fromFunction0(onMount))
    if (onUnmount != null) __obj.updateDynamic("onUnmount")(js.Any.fromFunction0(onUnmount))
    __obj.asInstanceOf[LayerProps]
  }
}

