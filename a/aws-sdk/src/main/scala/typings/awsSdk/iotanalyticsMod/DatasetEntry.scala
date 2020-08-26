package typings.awsSdk.iotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatasetEntry extends js.Object {
  /**
    * The pre-signed URI of the data set item.
    */
  var dataURI: js.UndefOr[PresignedURI] = js.native
  /**
    * The name of the data set item.
    */
  var entryName: js.UndefOr[EntryName] = js.native
}

object DatasetEntry {
  @scala.inline
  def apply(): DatasetEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatasetEntry]
  }
  @scala.inline
  implicit class DatasetEntryOps[Self <: DatasetEntry] (val x: Self) extends AnyVal {
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
    def setDataURI(value: PresignedURI): Self = this.set("dataURI", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataURI: Self = this.set("dataURI", js.undefined)
    @scala.inline
    def setEntryName(value: EntryName): Self = this.set("entryName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntryName: Self = this.set("entryName", js.undefined)
  }
  
}

