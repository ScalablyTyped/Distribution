package typings.c3.mod

import typings.c3.Anon1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineOptions extends js.Object {
  /**
    * Set if null data point will be connected or not.
    * If `true` set, the region of null data will be connected without any data point.
    * If `false` set, the region of null data will not be connected and get empty.
    */
  var connectNull: js.UndefOr[Boolean] = js.undefined
  var step: js.UndefOr[Anon1] = js.undefined
}

object LineOptions {
  @scala.inline
  def apply(connectNull: js.UndefOr[Boolean] = js.undefined, step: Anon1 = null): LineOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(connectNull)) __obj.updateDynamic("connectNull")(connectNull.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineOptions]
  }
}

