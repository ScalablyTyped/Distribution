package typings
package bootstrapLib.bootstrapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipInstance[T /* <: TooltipOption */] extends js.Object {
  var config: T
  var element: stdLib.Element
  var tip: stdLib.HTMLElement
}

object TooltipInstance {
  @scala.inline
  def apply[T /* <: TooltipOption */](config: T, element: stdLib.Element, tip: stdLib.HTMLElement): TooltipInstance[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    __obj.updateDynamic("element")(element)
    __obj.updateDynamic("tip")(tip)
    __obj.asInstanceOf[TooltipInstance[T]]
  }
}

