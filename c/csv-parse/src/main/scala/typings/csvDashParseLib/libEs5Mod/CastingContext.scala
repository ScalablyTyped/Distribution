package typings
package csvDashParseLib.libEs5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CastingContext extends js.Object {
  val column: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  val empty_lines: scala.Double
  val header: scala.Boolean
  val index: scala.Double
  val invalid_field_length: scala.Double
  val lines: scala.Double
  val quoting: scala.Boolean
  val records: scala.Double
}

object CastingContext {
  @scala.inline
  def apply(
    empty_lines: scala.Double,
    header: scala.Boolean,
    index: scala.Double,
    invalid_field_length: scala.Double,
    lines: scala.Double,
    quoting: scala.Boolean,
    records: scala.Double,
    column: scala.Double | java.lang.String = null
  ): CastingContext = {
    val __obj = js.Dynamic.literal(empty_lines = empty_lines, header = header, index = index, invalid_field_length = invalid_field_length, lines = lines, quoting = quoting, records = records)
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    __obj.asInstanceOf[CastingContext]
  }
}

