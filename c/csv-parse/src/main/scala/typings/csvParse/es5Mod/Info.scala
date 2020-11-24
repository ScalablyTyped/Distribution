package typings.csvParse.es5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Info extends js.Object {
  
  /**
    * Count the number of lines being fully commented.
    */
  val comment_lines: Double = js.native
  
  /**
    * Count the number of processed empty lines.
    */
  val empty_lines: Double = js.native
  
  /**
    * Number of non uniform records when `relax_column_count` is true.
    */
  val invalid_field_length: Double = js.native
  
  /**
    * The number of lines encountered in the source dataset, start at 1 for the first line.
    */
  val lines: Double = js.native
  
  /**
    * Count the number of processed records.
    */
  val records: Double = js.native
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
  
  @scala.inline
  implicit class InfoOps[Self <: Info] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setComment_lines(value: Double): Self = this.set("comment_lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmpty_lines(value: Double): Self = this.set("empty_lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalid_field_length(value: Double): Self = this.set("invalid_field_length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLines(value: Double): Self = this.set("lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecords(value: Double): Self = this.set("records", value.asInstanceOf[js.Any])
  }
}
