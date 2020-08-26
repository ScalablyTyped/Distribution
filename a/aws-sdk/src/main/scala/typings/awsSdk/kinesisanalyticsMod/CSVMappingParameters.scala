package typings.awsSdk.kinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CSVMappingParameters extends js.Object {
  /**
    * Column delimiter. For example, in a CSV format, a comma (",") is the typical column delimiter.
    */
  var RecordColumnDelimiter: typings.awsSdk.kinesisanalyticsMod.RecordColumnDelimiter = js.native
  /**
    * Row delimiter. For example, in a CSV format, '\n' is the typical row delimiter.
    */
  var RecordRowDelimiter: typings.awsSdk.kinesisanalyticsMod.RecordRowDelimiter = js.native
}

object CSVMappingParameters {
  @scala.inline
  def apply(RecordColumnDelimiter: RecordColumnDelimiter, RecordRowDelimiter: RecordRowDelimiter): CSVMappingParameters = {
    val __obj = js.Dynamic.literal(RecordColumnDelimiter = RecordColumnDelimiter.asInstanceOf[js.Any], RecordRowDelimiter = RecordRowDelimiter.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSVMappingParameters]
  }
  @scala.inline
  implicit class CSVMappingParametersOps[Self <: CSVMappingParameters] (val x: Self) extends AnyVal {
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
    def setRecordColumnDelimiter(value: RecordColumnDelimiter): Self = this.set("RecordColumnDelimiter", value.asInstanceOf[js.Any])
    @scala.inline
    def setRecordRowDelimiter(value: RecordRowDelimiter): Self = this.set("RecordRowDelimiter", value.asInstanceOf[js.Any])
  }
  
}

