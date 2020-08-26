package typings.babyparse.BabyParse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseMeta extends js.Object {
       // Line break sequence used
  var aborted: Boolean = js.native
  var delimiter: String = js.native
        // Whether process was aborted
  var fields: js.Array[String] = js.native
       // Delimiter used
  var linebreak: String = js.native
   // Array of field names
  var truncated: Boolean = js.native
}

object ParseMeta {
  @scala.inline
  def apply(
    aborted: Boolean,
    delimiter: String,
    fields: js.Array[String],
    linebreak: String,
    truncated: Boolean
  ): ParseMeta = {
    val __obj = js.Dynamic.literal(aborted = aborted.asInstanceOf[js.Any], delimiter = delimiter.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], linebreak = linebreak.asInstanceOf[js.Any], truncated = truncated.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseMeta]
  }
  @scala.inline
  implicit class ParseMetaOps[Self <: ParseMeta] (val x: Self) extends AnyVal {
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
    def setAborted(value: Boolean): Self = this.set("aborted", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def setFieldsVarargs(value: String*): Self = this.set("fields", js.Array(value :_*))
    @scala.inline
    def setFields(value: js.Array[String]): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinebreak(value: String): Self = this.set("linebreak", value.asInstanceOf[js.Any])
    @scala.inline
    def setTruncated(value: Boolean): Self = this.set("truncated", value.asInstanceOf[js.Any])
  }
  
}

