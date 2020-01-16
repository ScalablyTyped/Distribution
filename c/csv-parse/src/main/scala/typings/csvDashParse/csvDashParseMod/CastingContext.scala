package typings.csvDashParse.csvDashParseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CastingContext extends js.Object {
  val column: Double | String
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
    column: Double | String,
    empty_lines: Double,
    header: Boolean,
    index: Double,
    invalid_field_length: Double,
    lines: Double,
    quoting: Boolean,
    records: Double
  ): CastingContext = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], empty_lines = empty_lines.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], invalid_field_length = invalid_field_length.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], quoting = quoting.asInstanceOf[js.Any], records = records.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CastingContext]
  }
}

