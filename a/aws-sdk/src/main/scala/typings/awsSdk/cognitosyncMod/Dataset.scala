package typings.awsSdk.cognitosyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dataset extends js.Object {
  /**
    * Date on which the dataset was created.
    */
  var CreationDate: js.UndefOr[Date] = js.native
  /**
    * Total size in bytes of the records in this dataset.
    */
  var DataStorage: js.UndefOr[Long] = js.native
  /**
    * A string of up to 128 characters. Allowed characters are a-z, A-Z, 0-9, '_' (underscore), '-' (dash), and '.' (dot).
    */
  var DatasetName: js.UndefOr[typings.awsSdk.cognitosyncMod.DatasetName] = js.native
  /**
    * A name-spaced GUID (for example, us-east-1:23EC4050-6AEA-7089-A2DD-08002EXAMPLE) created by Amazon Cognito. GUID generation is unique within a region.
    */
  var IdentityId: js.UndefOr[typings.awsSdk.cognitosyncMod.IdentityId] = js.native
  /**
    * The device that made the last change to this dataset.
    */
  var LastModifiedBy: js.UndefOr[String] = js.native
  /**
    * Date when the dataset was last modified.
    */
  var LastModifiedDate: js.UndefOr[Date] = js.native
  /**
    * Number of records in this dataset.
    */
  var NumRecords: js.UndefOr[Long] = js.native
}

object Dataset {
  @scala.inline
  def apply(): Dataset = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dataset]
  }
  @scala.inline
  implicit class DatasetOps[Self <: Dataset] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCreationDate(value: Date): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
    @scala.inline
    def setDataStorage(value: Long): Self = this.set("DataStorage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataStorage: Self = this.set("DataStorage", js.undefined)
    @scala.inline
    def setDatasetName(value: DatasetName): Self = this.set("DatasetName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDatasetName: Self = this.set("DatasetName", js.undefined)
    @scala.inline
    def setIdentityId(value: IdentityId): Self = this.set("IdentityId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentityId: Self = this.set("IdentityId", js.undefined)
    @scala.inline
    def setLastModifiedBy(value: String): Self = this.set("LastModifiedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedBy: Self = this.set("LastModifiedBy", js.undefined)
    @scala.inline
    def setLastModifiedDate(value: Date): Self = this.set("LastModifiedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedDate: Self = this.set("LastModifiedDate", js.undefined)
    @scala.inline
    def setNumRecords(value: Long): Self = this.set("NumRecords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumRecords: Self = this.set("NumRecords", js.undefined)
  }
  
}

