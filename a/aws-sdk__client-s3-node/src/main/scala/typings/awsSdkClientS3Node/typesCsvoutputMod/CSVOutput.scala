package typings.awsSdkClientS3Node.typesCsvoutputMod

import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.ALWAYS
import typings.awsSdkClientS3Node.awsSdkClientS3NodeStrings.ASNEEDED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSVOutput extends js.Object {
  /**
    * <p>Value used to separate individual fields in a record.</p>
    */
  var FieldDelimiter: js.UndefOr[String] = js.undefined
  /**
    * <p>Value used for escaping where the field delimiter is part of the value.</p>
    */
  var QuoteCharacter: js.UndefOr[String] = js.undefined
  /**
    * <p>Single character used for escaping the quote character inside an already escaped value.</p>
    */
  var QuoteEscapeCharacter: js.UndefOr[String] = js.undefined
  /**
    * <p>Indicates whether or not all output fields should be quoted.</p>
    */
  var QuoteFields: js.UndefOr[ALWAYS | ASNEEDED | String] = js.undefined
  /**
    * <p>Value used to separate individual records.</p>
    */
  var RecordDelimiter: js.UndefOr[String] = js.undefined
}

object CSVOutput {
  @scala.inline
  def apply(
    FieldDelimiter: String = null,
    QuoteCharacter: String = null,
    QuoteEscapeCharacter: String = null,
    QuoteFields: ALWAYS | ASNEEDED | String = null,
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

