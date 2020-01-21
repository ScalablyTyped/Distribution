package typings.awsSdkClientGlacierNode.typesCsvoutputMod

import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.ALWAYS
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.ASNEEDED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CSVOutput extends js.Object {
  /**
    * <p>A value used to separate individual fields from each other within a record.</p>
    */
  var FieldDelimiter: js.UndefOr[String] = js.undefined
  /**
    * <p>A value used as an escape character where the field delimiter is part of the value.</p>
    */
  var QuoteCharacter: js.UndefOr[String] = js.undefined
  /**
    * <p>A single character used for escaping the quotation-mark character inside an already escaped value.</p>
    */
  var QuoteEscapeCharacter: js.UndefOr[String] = js.undefined
  /**
    * <p>A value that indicates whether all output fields should be contained within quotation marks.</p>
    */
  var QuoteFields: js.UndefOr[ALWAYS | ASNEEDED | String] = js.undefined
  /**
    * <p>A value used to separate individual records from each other.</p>
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

