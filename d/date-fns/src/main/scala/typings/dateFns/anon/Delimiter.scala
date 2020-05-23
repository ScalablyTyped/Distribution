package typings.dateFns.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delimiter extends js.Object {
  var delimiter: js.UndefOr[String] = js.undefined
  var format: js.UndefOr[js.Array[String]] = js.undefined
  var zero: js.UndefOr[Boolean] = js.undefined
}

object Delimiter {
  @scala.inline
  def apply(
    delimiter: String = null,
    format: js.Array[String] = null,
    zero: js.UndefOr[Boolean] = js.undefined
  ): Delimiter = {
    val __obj = js.Dynamic.literal()
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(zero)) __obj.updateDynamic("zero")(zero.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delimiter]
  }
}

