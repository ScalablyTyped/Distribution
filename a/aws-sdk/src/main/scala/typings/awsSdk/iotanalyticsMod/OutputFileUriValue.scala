package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputFileUriValue extends js.Object {
  /**
    * The URI of the location where data set contents are stored, usually the URI of a file in an S3 bucket.
    */
  var fileName: OutputFileName = js.native
}

object OutputFileUriValue {
  @scala.inline
  def apply(fileName: OutputFileName): OutputFileUriValue = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputFileUriValue]
  }
  @scala.inline
  implicit class OutputFileUriValueOps[Self <: OutputFileUriValue] (val x: Self) extends AnyVal {
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
    def setFileName(value: OutputFileName): Self = this.set("fileName", value.asInstanceOf[js.Any])
  }
  
}

