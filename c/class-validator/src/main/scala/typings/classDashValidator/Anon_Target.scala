package typings.classDashValidator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Target extends js.Object {
  /**
    * Indicates if target should be exposed in ValidationError.
    */
  var target: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates if validated value should be exposed in ValidationError.
    */
  var value: js.UndefOr[Boolean] = js.undefined
}

object Anon_Target {
  @scala.inline
  def apply(target: js.UndefOr[Boolean] = js.undefined, value: js.UndefOr[Boolean] = js.undefined): Anon_Target = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(target)) __obj.updateDynamic("target")(target)
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Anon_Target]
  }
}

