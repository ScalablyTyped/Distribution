package typings.awsSdk.s3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetadataEntry extends js.Object {
  /**
    * Name of the Object.
    */
  var Name: js.UndefOr[MetadataKey] = js.native
  /**
    * Value of the Object.
    */
  var Value: js.UndefOr[MetadataValue] = js.native
}

object MetadataEntry {
  @scala.inline
  def apply(): MetadataEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetadataEntry]
  }
  @scala.inline
  implicit class MetadataEntryOps[Self <: MetadataEntry] (val x: Self) extends AnyVal {
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
    def setName(value: MetadataKey): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setValue(value: MetadataValue): Self = this.set("Value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("Value", js.undefined)
  }
  
}

