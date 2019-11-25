package typings.babyparse.BabyParse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseMeta extends js.Object {
       // Line break sequence used
  var aborted: Boolean
  var delimiter: String
        // Whether process was aborted
  var fields: js.Array[String]
       // Delimiter used
  var linebreak: String
   // Array of field names
  var truncated: Boolean
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
}

