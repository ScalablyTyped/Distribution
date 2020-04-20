package typings.csvParse.es5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Info extends js.Object {
  /**
    * Count the number of lines being fully commented.
    */
  val comment_lines: Double
  /**
    * Count the number of processed empty lines.
    */
  val empty_lines: Double
  /**
    * Number of non uniform records when `relax_column_count` is true.
    */
  val invalid_field_length: Double
  /**
    * The number of lines encountered in the source dataset, start at 1 for the first line.
    */
  val lines: Double
  /**
    * Count the number of processed records.
    */
  val records: Double
}

object Info {
  @scala.inline
  def apply(
    comment_lines: Double,
    empty_lines: Double,
    invalid_field_length: Double,
    lines: Double,
    records: Double
  ): Info = {
    val __obj = js.Dynamic.literal(comment_lines = comment_lines.asInstanceOf[js.Any], empty_lines = empty_lines.asInstanceOf[js.Any], invalid_field_length = invalid_field_length.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], records = records.asInstanceOf[js.Any])
    __obj.asInstanceOf[Info]
  }
}

