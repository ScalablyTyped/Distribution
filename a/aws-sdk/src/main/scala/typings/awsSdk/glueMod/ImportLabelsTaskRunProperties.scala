package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportLabelsTaskRunProperties extends js.Object {
  /**
    * The Amazon Simple Storage Service (Amazon S3) path from where you will import the labels.
    */
  var InputS3Path: js.UndefOr[UriString] = js.native
  /**
    * Indicates whether to overwrite your existing labels.
    */
  var Replace: js.UndefOr[ReplaceBoolean] = js.native
}

object ImportLabelsTaskRunProperties {
  @scala.inline
  def apply(): ImportLabelsTaskRunProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportLabelsTaskRunProperties]
  }
  @scala.inline
  implicit class ImportLabelsTaskRunPropertiesOps[Self <: ImportLabelsTaskRunProperties] (val x: Self) extends AnyVal {
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
    def setInputS3Path(value: UriString): Self = this.set("InputS3Path", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputS3Path: Self = this.set("InputS3Path", js.undefined)
    @scala.inline
    def setReplace(value: ReplaceBoolean): Self = this.set("Replace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplace: Self = this.set("Replace", js.undefined)
  }
  
}

