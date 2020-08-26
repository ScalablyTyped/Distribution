package typings.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadBlobOptions extends GetBlobPropertiesOptions {
  var disableContentMD5Validation: js.UndefOr[Boolean] = js.native
  var rangeEnd: js.UndefOr[String] = js.native
  var rangeStart: js.UndefOr[String] = js.native
  var useTransactionalMD5: js.UndefOr[Boolean] = js.native
}

object ReadBlobOptions {
  @scala.inline
  def apply(): ReadBlobOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadBlobOptions]
  }
  @scala.inline
  implicit class ReadBlobOptionsOps[Self <: ReadBlobOptions] (val x: Self) extends AnyVal {
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
    def setDisableContentMD5Validation(value: Boolean): Self = this.set("disableContentMD5Validation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableContentMD5Validation: Self = this.set("disableContentMD5Validation", js.undefined)
    @scala.inline
    def setRangeEnd(value: String): Self = this.set("rangeEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeEnd: Self = this.set("rangeEnd", js.undefined)
    @scala.inline
    def setRangeStart(value: String): Self = this.set("rangeStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRangeStart: Self = this.set("rangeStart", js.undefined)
    @scala.inline
    def setUseTransactionalMD5(value: Boolean): Self = this.set("useTransactionalMD5", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseTransactionalMD5: Self = this.set("useTransactionalMD5", js.undefined)
  }
  
}

