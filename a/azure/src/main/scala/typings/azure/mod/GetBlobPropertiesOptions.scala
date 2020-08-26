package typings.azure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBlobPropertiesOptions extends LeaseAccessConditionsOptions {
  var snapshotId: js.UndefOr[String] = js.native
}

object GetBlobPropertiesOptions {
  @scala.inline
  def apply(): GetBlobPropertiesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBlobPropertiesOptions]
  }
  @scala.inline
  implicit class GetBlobPropertiesOptionsOps[Self <: GetBlobPropertiesOptions] (val x: Self) extends AnyVal {
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
    def setSnapshotId(value: String): Self = this.set("snapshotId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotId: Self = this.set("snapshotId", js.undefined)
  }
  
}

