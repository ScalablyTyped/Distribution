package typings.atAwsDashSdkClientDashGlacierDashNode.typesUnderscoreCSVInputMod

import typings.atAwsDashSdkClientDashGlacierDashNode.atAwsDashSdkClientDashGlacierDashNodeStrings.IGNORE
import typings.atAwsDashSdkClientDashGlacierDashNode.atAwsDashSdkClientDashGlacierDashNodeStrings.NONE
import typings.atAwsDashSdkClientDashGlacierDashNode.atAwsDashSdkClientDashGlacierDashNodeStrings.USE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _CSVInput extends js.Object {
  /**
    * <p>A single character used to indicate that a row should be ignored when the character is present at the start of that row.</p>
    */
  var Comments: js.UndefOr[String] = js.undefined
  /**
    * <p>A value used to separate individual fields from each other within a record.</p>
    */
  var FieldDelimiter: js.UndefOr[String] = js.undefined
  /**
    * <p>Describes the first line of input. Valid values are <code>None</code>, <code>Ignore</code>, and <code>Use</code>.</p>
    */
  var FileHeaderInfo: js.UndefOr[USE | IGNORE | NONE | String] = js.undefined
  /**
    * <p>A value used as an escape character where the field delimiter is part of the value.</p>
    */
  var QuoteCharacter: js.UndefOr[String] = js.undefined
  /**
    * <p>A single character used for escaping the quotation-mark character inside an already escaped value.</p>
    */
  var QuoteEscapeCharacter: js.UndefOr[String] = js.undefined
  /**
    * <p>A value used to separate individual records from each other.</p>
    */
  var RecordDelimiter: js.UndefOr[String] = js.undefined
}

object _CSVInput {
  @scala.inline
  def apply(
    Comments: String = null,
    FieldDelimiter: String = null,
    FileHeaderInfo: USE | IGNORE | NONE | String = null,
    QuoteCharacter: String = null,
    QuoteEscapeCharacter: String = null,
    RecordDelimiter: String = null
  ): _CSVInput = {
    val __obj = js.Dynamic.literal()
    if (Comments != null) __obj.updateDynamic("Comments")(Comments.asInstanceOf[js.Any])
    if (FieldDelimiter != null) __obj.updateDynamic("FieldDelimiter")(FieldDelimiter.asInstanceOf[js.Any])
    if (FileHeaderInfo != null) __obj.updateDynamic("FileHeaderInfo")(FileHeaderInfo.asInstanceOf[js.Any])
    if (QuoteCharacter != null) __obj.updateDynamic("QuoteCharacter")(QuoteCharacter.asInstanceOf[js.Any])
    if (QuoteEscapeCharacter != null) __obj.updateDynamic("QuoteEscapeCharacter")(QuoteEscapeCharacter.asInstanceOf[js.Any])
    if (RecordDelimiter != null) __obj.updateDynamic("RecordDelimiter")(RecordDelimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[_CSVInput]
  }
}

