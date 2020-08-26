package typings.awsSdkClientGlacierNode.typesCsvinputMod

import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.IGNORE
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.NONE
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.USE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CSVInput extends js.Object {
  /**
    * <p>A single character used to indicate that a row should be ignored when the character is present at the start of that row.</p>
    */
  var Comments: js.UndefOr[String] = js.native
  /**
    * <p>A value used to separate individual fields from each other within a record.</p>
    */
  var FieldDelimiter: js.UndefOr[String] = js.native
  /**
    * <p>Describes the first line of input. Valid values are <code>None</code>, <code>Ignore</code>, and <code>Use</code>.</p>
    */
  var FileHeaderInfo: js.UndefOr[USE | IGNORE | NONE | String] = js.native
  /**
    * <p>A value used as an escape character where the field delimiter is part of the value.</p>
    */
  var QuoteCharacter: js.UndefOr[String] = js.native
  /**
    * <p>A single character used for escaping the quotation-mark character inside an already escaped value.</p>
    */
  var QuoteEscapeCharacter: js.UndefOr[String] = js.native
  /**
    * <p>A value used to separate individual records from each other.</p>
    */
  var RecordDelimiter: js.UndefOr[String] = js.native
}

object CSVInput {
  @scala.inline
  def apply(): CSVInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSVInput]
  }
  @scala.inline
  implicit class CSVInputOps[Self <: CSVInput] (val x: Self) extends AnyVal {
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
    def setComments(value: String): Self = this.set("Comments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComments: Self = this.set("Comments", js.undefined)
    @scala.inline
    def setFieldDelimiter(value: String): Self = this.set("FieldDelimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldDelimiter: Self = this.set("FieldDelimiter", js.undefined)
    @scala.inline
    def setFileHeaderInfo(value: USE | IGNORE | NONE | String): Self = this.set("FileHeaderInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileHeaderInfo: Self = this.set("FileHeaderInfo", js.undefined)
    @scala.inline
    def setQuoteCharacter(value: String): Self = this.set("QuoteCharacter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuoteCharacter: Self = this.set("QuoteCharacter", js.undefined)
    @scala.inline
    def setQuoteEscapeCharacter(value: String): Self = this.set("QuoteEscapeCharacter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuoteEscapeCharacter: Self = this.set("QuoteEscapeCharacter", js.undefined)
    @scala.inline
    def setRecordDelimiter(value: String): Self = this.set("RecordDelimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecordDelimiter: Self = this.set("RecordDelimiter", js.undefined)
  }
  
}

