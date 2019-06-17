package typings
package baseuiLib.accordionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccordionOverrides[T] extends js.Object {
  var Root: js.UndefOr[baseuiLib.Override[T]] = js.undefined
}

object AccordionOverrides {
  @scala.inline
  def apply[T](Root: baseuiLib.Override[T] = null): AccordionOverrides[T] = {
    val __obj = js.Dynamic.literal()
    if (Root != null) __obj.updateDynamic("Root")(Root.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccordionOverrides[T]]
  }
}

