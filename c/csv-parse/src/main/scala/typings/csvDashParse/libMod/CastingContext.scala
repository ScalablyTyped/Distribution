package typings.csvDashParse.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CastingContext extends js.Object {
  val column: js.UndefOr[Double | String] = js.undefined
  val empty_lines: Double
  val header: Boolean
  val index: Double
  val invalid_field_length: Double
  val lines: Double
  val quoting: Boolean
  val records: Double
}

object CastingContext {
  @scala.inline
  def apply(
    empty_lines: Double,
    header: Boolean,
    index: Double,
    invalid_field_length: Double,
    lines: Double,
    quoting: Boolean,
    records: Double,
    column: Double | String = null
  ): CastingContext = {
    val __obj = js.Dynamic.literal(empty_lines = empty_lines, header = header, index = index, invalid_field_length = invalid_field_length, lines = lines, quoting = quoting, records = records)
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    __obj.asInstanceOf[CastingContext]
  }
}

