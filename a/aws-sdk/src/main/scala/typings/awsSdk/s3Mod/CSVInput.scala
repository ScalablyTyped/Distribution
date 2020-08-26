package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CSVInput extends js.Object {
  /**
    * Specifies that CSV field values may contain quoted record delimiters and such records should be allowed. Default value is FALSE. Setting this value to TRUE may lower performance.
    */
  var AllowQuotedRecordDelimiter: js.UndefOr[typings.awsSdk.s3Mod.AllowQuotedRecordDelimiter] = js.native
  /**
    * A single character used to indicate that a row should be ignored when the character is present at the start of that row. You can specify any character to indicate a comment line.
    */
  var Comments: js.UndefOr[typings.awsSdk.s3Mod.Comments] = js.native
  /**
    * A single character used to separate individual fields in a record. You can specify an arbitrary delimiter.
    */
  var FieldDelimiter: js.UndefOr[typings.awsSdk.s3Mod.FieldDelimiter] = js.native
  /**
    * Describes the first line of input. Valid values are:    NONE: First line is not a header.    IGNORE: First line is a header, but you can't use the header values to indicate the column in an expression. You can use column position (such as _1, _2, …) to indicate the column (SELECT s._1 FROM OBJECT s).    Use: First line is a header, and you can use the header value to identify a column in an expression (SELECT "name" FROM OBJECT).   
    */
  var FileHeaderInfo: js.UndefOr[typings.awsSdk.s3Mod.FileHeaderInfo] = js.native
  /**
    * A single character used for escaping when the field delimiter is part of the value. For example, if the value is a, b, Amazon S3 wraps this field value in quotation marks, as follows: " a , b ". Type: String Default: "  Ancestors: CSV 
    */
  var QuoteCharacter: js.UndefOr[typings.awsSdk.s3Mod.QuoteCharacter] = js.native
  /**
    * A single character used for escaping the quotation mark character inside an already escaped value. For example, the value """ a , b """ is parsed as " a , b ".
    */
  var QuoteEscapeCharacter: js.UndefOr[typings.awsSdk.s3Mod.QuoteEscapeCharacter] = js.native
  /**
    * A single character used to separate individual records in the input. Instead of the default value, you can specify an arbitrary delimiter.
    */
  var RecordDelimiter: js.UndefOr[typings.awsSdk.s3Mod.RecordDelimiter] = js.native
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
    def setAllowQuotedRecordDelimiter(value: AllowQuotedRecordDelimiter): Self = this.set("AllowQuotedRecordDelimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowQuotedRecordDelimiter: Self = this.set("AllowQuotedRecordDelimiter", js.undefined)
    @scala.inline
    def setComments(value: Comments): Self = this.set("Comments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComments: Self = this.set("Comments", js.undefined)
    @scala.inline
    def setFieldDelimiter(value: FieldDelimiter): Self = this.set("FieldDelimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldDelimiter: Self = this.set("FieldDelimiter", js.undefined)
    @scala.inline
    def setFileHeaderInfo(value: FileHeaderInfo): Self = this.set("FileHeaderInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileHeaderInfo: Self = this.set("FileHeaderInfo", js.undefined)
    @scala.inline
    def setQuoteCharacter(value: QuoteCharacter): Self = this.set("QuoteCharacter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuoteCharacter: Self = this.set("QuoteCharacter", js.undefined)
    @scala.inline
    def setQuoteEscapeCharacter(value: QuoteEscapeCharacter): Self = this.set("QuoteEscapeCharacter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuoteEscapeCharacter: Self = this.set("QuoteEscapeCharacter", js.undefined)
    @scala.inline
    def setRecordDelimiter(value: RecordDelimiter): Self = this.set("RecordDelimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecordDelimiter: Self = this.set("RecordDelimiter", js.undefined)
  }
  
}

