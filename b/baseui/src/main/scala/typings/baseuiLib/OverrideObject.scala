package typings
package baseuiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverrideObject[T] extends js.Object {
  var component: js.UndefOr[reactLib.reactMod.ComponentType[T]] = js.undefined
  var props: js.UndefOr[js.Object] = js.undefined
  var style: js.UndefOr[StyleOverride] = js.undefined
}

object OverrideObject {
  @scala.inline
  def apply[T](
    component: reactLib.reactMod.ComponentType[T] = null,
    props: js.Object = null,
    style: StyleOverride = null
  ): OverrideObject[T] = {
    val __obj = js.Dynamic.literal()
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(props)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverrideObject[T]]
  }
}

