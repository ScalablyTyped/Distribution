package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CSVOutput extends js.Object {
  /**
    * The value used to separate individual fields in a record. You can specify an arbitrary delimiter.
    */
  var FieldDelimiter: js.UndefOr[typings.awsSdk.s3Mod.FieldDelimiter] = js.native
  /**
    * A single character used for escaping when the field delimiter is part of the value. For example, if the value is a, b, Amazon S3 wraps this field value in quotation marks, as follows: " a , b ".
    */
  var QuoteCharacter: js.UndefOr[typings.awsSdk.s3Mod.QuoteCharacter] = js.native
  /**
    * The single character used for escaping the quote character inside an already escaped value.
    */
  var QuoteEscapeCharacter: js.UndefOr[typings.awsSdk.s3Mod.QuoteEscapeCharacter] = js.native
  /**
    * Indicates whether to use quotation marks around output fields.     ALWAYS: Always use quotation marks for output fields.    ASNEEDED: Use quotation marks for output fields when needed.  
    */
  var QuoteFields: js.UndefOr[typings.awsSdk.s3Mod.QuoteFields] = js.native
  /**
    * A single character used to separate individual records in the output. Instead of the default value, you can specify an arbitrary delimiter.
    */
  var RecordDelimiter: js.UndefOr[typings.awsSdk.s3Mod.RecordDelimiter] = js.native
}

object CSVOutput {
  @scala.inline
  def apply(): CSVOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSVOutput]
  }
  @scala.inline
  implicit class CSVOutputOps[Self <: CSVOutput] (val x: Self) extends AnyVal {
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
    def setFieldDelimiter(value: FieldDelimiter): Self = this.set("FieldDelimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldDelimiter: Self = this.set("FieldDelimiter", js.undefined)
    @scala.inline
    def setQuoteCharacter(value: QuoteCharacter): Self = this.set("QuoteCharacter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuoteCharacter: Self = this.set("QuoteCharacter", js.undefined)
    @scala.inline
    def setQuoteEscapeCharacter(value: QuoteEscapeCharacter): Self = this.set("QuoteEscapeCharacter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuoteEscapeCharacter: Self = this.set("QuoteEscapeCharacter", js.undefined)
    @scala.inline
    def setQuoteFields(value: QuoteFields): Self = this.set("QuoteFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuoteFields: Self = this.set("QuoteFields", js.undefined)
    @scala.inline
    def setRecordDelimiter(value: RecordDelimiter): Self = this.set("RecordDelimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecordDelimiter: Self = this.set("RecordDelimiter", js.undefined)
  }
  
}

