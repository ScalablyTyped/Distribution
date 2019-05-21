package typings
package csvDashParseLib.csvDashParseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Info extends js.Object {
  /**
    * Count the number of lines being fully commented.
    */
  val comment_lines: scala.Double
  /**
    * Count the number of processed empty lines.
    */
  val empty_lines: scala.Double
  /**
    * Number of non uniform records when `relax_column_count` is true.
    */
  val invalid_field_length: scala.Double
  /**
    * The number of lines encountered in the source dataset, start at 1 for the first line.
    */
  val lines: scala.Double
  /**
    * Count the number of processed records.
    */
  val records: scala.Double
}

object Info {
  @scala.inline
  def apply(
    comment_lines: scala.Double,
    empty_lines: scala.Double,
    invalid_field_length: scala.Double,
    lines: scala.Double,
    records: scala.Double
  ): Info = {
    val __obj = js.Dynamic.literal(comment_lines = comment_lines, empty_lines = empty_lines, invalid_field_length = invalid_field_length, lines = lines, records = records)
  
    __obj.asInstanceOf[Info]
  }
}

