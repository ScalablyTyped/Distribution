package typings.classValidator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTarget extends js.Object {
  /**
    * Indicates if target should be exposed in ValidationError.
    */
  var target: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates if validated value should be exposed in ValidationError.
    */
  var value: js.UndefOr[Boolean] = js.undefined
}

object AnonTarget {
  @scala.inline
  def apply(target: js.UndefOr[Boolean] = js.undefined, value: js.UndefOr[Boolean] = js.undefined): AnonTarget = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(target)) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTarget]
  }
}

