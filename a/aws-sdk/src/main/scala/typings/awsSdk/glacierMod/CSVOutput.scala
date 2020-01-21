package typings.awsSdk.glacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CSVOutput extends js.Object {
  /**
    * A value used to separate individual fields from each other within a record.
    */
  var FieldDelimiter: js.UndefOr[String] = js.native
  /**
    * A value used as an escape character where the field delimiter is part of the value.
    */
  var QuoteCharacter: js.UndefOr[String] = js.native
  /**
    * A single character used for escaping the quotation-mark character inside an already escaped value.
    */
  var QuoteEscapeCharacter: js.UndefOr[String] = js.native
  /**
    * A value that indicates whether all output fields should be contained within quotation marks.
    */
  var QuoteFields: js.UndefOr[typings.awsSdk.glacierMod.QuoteFields] = js.native
  /**
    * A value used to separate individual records from each other.
    */
  var RecordDelimiter: js.UndefOr[String] = js.native
}

object CSVOutput {
  @scala.inline
  def apply(
    FieldDelimiter: String = null,
    QuoteCharacter: String = null,
    QuoteEscapeCharacter: String = null,
    QuoteFields: QuoteFields = null,
    RecordDelimiter: String = null
  ): CSVOutput = {
    val __obj = js.Dynamic.literal()
    if (FieldDelimiter != null) __obj.updateDynamic("FieldDelimiter")(FieldDelimiter.asInstanceOf[js.Any])
    if (QuoteCharacter != null) __obj.updateDynamic("QuoteCharacter")(QuoteCharacter.asInstanceOf[js.Any])
    if (QuoteEscapeCharacter != null) __obj.updateDynamic("QuoteEscapeCharacter")(QuoteEscapeCharacter.asInstanceOf[js.Any])
    if (QuoteFields != null) __obj.updateDynamic("QuoteFields")(QuoteFields.asInstanceOf[js.Any])
    if (RecordDelimiter != null) __obj.updateDynamic("RecordDelimiter")(RecordDelimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSVOutput]
  }
}

