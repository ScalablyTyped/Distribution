package typings.classValidator.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Target extends js.Object {
  /**
    * Indicates if target should be exposed in ValidationError.
    */
  var target: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates if validated value should be exposed in ValidationError.
    */
  var value: js.UndefOr[Boolean] = js.undefined
}

object Target {
  @scala.inline
  def apply(target: js.UndefOr[Boolean] = js.undefined, value: js.UndefOr[Boolean] = js.undefined): Target = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(target)) __obj.updateDynamic("target")(target.get.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
}

