package typings
package baseuiLib.layerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerProps extends js.Object {
  var children: reactLib.reactMod.ReactNode
  var host: js.UndefOr[stdLib.HTMLElement] = js.undefined
  var index: js.UndefOr[scala.Double] = js.undefined
  var mountNode: js.UndefOr[stdLib.HTMLElement] = js.undefined
  var onMount: js.UndefOr[js.Function0[_]] = js.undefined
  var onUnmount: js.UndefOr[js.Function0[_]] = js.undefined
}

object LayerProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode,
    host: stdLib.HTMLElement = null,
    index: scala.Int | scala.Double = null,
    mountNode: stdLib.HTMLElement = null,
    onMount: () => _ = null,
    onUnmount: () => _ = null
  ): LayerProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host)
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (mountNode != null) __obj.updateDynamic("mountNode")(mountNode)
    if (onMount != null) __obj.updateDynamic("onMount")(js.Any.fromFunction0(onMount))
    if (onUnmount != null) __obj.updateDynamic("onUnmount")(js.Any.fromFunction0(onUnmount))
    __obj.asInstanceOf[LayerProps]
  }
}

