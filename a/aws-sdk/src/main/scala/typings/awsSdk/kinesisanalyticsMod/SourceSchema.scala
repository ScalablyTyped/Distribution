package typings.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceSchema extends js.Object {
  /**
    * A list of RecordColumn objects.
    */
  var RecordColumns: typings.awsSdk.kinesisanalyticsMod.RecordColumns = js.native
  /**
    * Specifies the encoding of the records in the streaming source. For example, UTF-8.
    */
  var RecordEncoding: js.UndefOr[typings.awsSdk.kinesisanalyticsMod.RecordEncoding] = js.native
  /**
    * Specifies the format of the records on the streaming source.
    */
  var RecordFormat: typings.awsSdk.kinesisanalyticsMod.RecordFormat = js.native
}

object SourceSchema {
  @scala.inline
  def apply(RecordColumns: RecordColumns, RecordFormat: RecordFormat): SourceSchema = {
    val __obj = js.Dynamic.literal(RecordColumns = RecordColumns.asInstanceOf[js.Any], RecordFormat = RecordFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceSchema]
  }
  @scala.inline
  implicit class SourceSchemaOps[Self <: SourceSchema] (val x: Self) extends AnyVal {
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
    def setRecordColumnsVarargs(value: RecordColumn*): Self = this.set("RecordColumns", js.Array(value :_*))
    @scala.inline
    def setRecordColumns(value: RecordColumns): Self = this.set("RecordColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecordFormat(value: RecordFormat): Self = this.set("RecordFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecordEncoding(value: RecordEncoding): Self = this.set("RecordEncoding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecordEncoding: Self = this.set("RecordEncoding", js.undefined)
  }
  
}

