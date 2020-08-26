package typings.awsSdkClientGlacierNode.typesCsvoutputMod

import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.ALWAYS
import typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.ASNEEDED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CSVOutput extends js.Object {
  /**
    * <p>A value used to separate individual fields from each other within a record.</p>
    */
  var FieldDelimiter: js.UndefOr[String] = js.native
  /**
    * <p>A value used as an escape character where the field delimiter is part of the value.</p>
    */
  var QuoteCharacter: js.UndefOr[String] = js.native
  /**
    * <p>A single character used for escaping the quotation-mark character inside an already escaped value.</p>
    */
  var QuoteEscapeCharacter: js.UndefOr[String] = js.native
  /**
    * <p>A value that indicates whether all output fields should be contained within quotation marks.</p>
    */
  var QuoteFields: js.UndefOr[ALWAYS | ASNEEDED | String] = js.native
  /**
    * <p>A value used to separate individual records from each other.</p>
    */
  var RecordDelimiter: js.UndefOr[String] = js.native
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
    def setFieldDelimiter(value: String): Self = this.set("FieldDelimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldDelimiter: Self = this.set("FieldDelimiter", js.undefined)
    @scala.inline
    def setQuoteCharacter(value: String): Self = this.set("QuoteCharacter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuoteCharacter: Self = this.set("QuoteCharacter", js.undefined)
    @scala.inline
    def setQuoteEscapeCharacter(value: String): Self = this.set("QuoteEscapeCharacter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuoteEscapeCharacter: Self = this.set("QuoteEscapeCharacter", js.undefined)
    @scala.inline
    def setQuoteFields(value: ALWAYS | ASNEEDED | String): Self = this.set("QuoteFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuoteFields: Self = this.set("QuoteFields", js.undefined)
    @scala.inline
    def setRecordDelimiter(value: String): Self = this.set("RecordDelimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecordDelimiter: Self = this.set("RecordDelimiter", js.undefined)
  }
  
}

