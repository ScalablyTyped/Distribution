package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreCSVInputMod

import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.IGNORE
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.NONE
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.USE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _CSVInput extends js.Object {
  /**
    * <p>Specifies that CSV field values may contain quoted record delimiters and such records should be allowed. Default value is FALSE. Setting this value to TRUE may lower performance.</p>
    */
  var AllowQuotedRecordDelimiter: js.UndefOr[Boolean] = js.undefined
  /**
    * <p>Single character used to indicate a row should be ignored when present at the start of a row.</p>
    */
  var Comments: js.UndefOr[String] = js.undefined
  /**
    * <p>Value used to separate individual fields in a record.</p>
    */
  var FieldDelimiter: js.UndefOr[String] = js.undefined
  /**
    * <p>Describes the first line of input. Valid values: None, Ignore, Use.</p>
    */
  var FileHeaderInfo: js.UndefOr[USE | IGNORE | NONE | String] = js.undefined
  /**
    * <p>Value used for escaping where the field delimiter is part of the value.</p>
    */
  var QuoteCharacter: js.UndefOr[String] = js.undefined
  /**
    * <p>Single character used for escaping the quote character inside an already escaped value.</p>
    */
  var QuoteEscapeCharacter: js.UndefOr[String] = js.undefined
  /**
    * <p>Value used to separate individual records.</p>
    */
  var RecordDelimiter: js.UndefOr[String] = js.undefined
}

object _CSVInput {
  @scala.inline
  def apply(
    AllowQuotedRecordDelimiter: js.UndefOr[Boolean] = js.undefined,
    Comments: String = null,
    FieldDelimiter: String = null,
    FileHeaderInfo: USE | IGNORE | NONE | String = null,
    QuoteCharacter: String = null,
    QuoteEscapeCharacter: String = null,
    RecordDelimiter: String = null
  ): _CSVInput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AllowQuotedRecordDelimiter)) __obj.updateDynamic("AllowQuotedRecordDelimiter")(AllowQuotedRecordDelimiter)
    if (Comments != null) __obj.updateDynamic("Comments")(Comments)
    if (FieldDelimiter != null) __obj.updateDynamic("FieldDelimiter")(FieldDelimiter)
    if (FileHeaderInfo != null) __obj.updateDynamic("FileHeaderInfo")(FileHeaderInfo.asInstanceOf[js.Any])
    if (QuoteCharacter != null) __obj.updateDynamic("QuoteCharacter")(QuoteCharacter)
    if (QuoteEscapeCharacter != null) __obj.updateDynamic("QuoteEscapeCharacter")(QuoteEscapeCharacter)
    if (RecordDelimiter != null) __obj.updateDynamic("RecordDelimiter")(RecordDelimiter)
    __obj.asInstanceOf[_CSVInput]
  }
}

