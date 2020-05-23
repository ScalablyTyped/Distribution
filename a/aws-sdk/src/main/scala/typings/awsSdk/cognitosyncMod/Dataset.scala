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
  def apply(
    CreationDate: Date = null,
    DataStorage: js.UndefOr[Long] = js.undefined,
    DatasetName: DatasetName = null,
    IdentityId: IdentityId = null,
    LastModifiedBy: String = null,
    LastModifiedDate: Date = null,
    NumRecords: js.UndefOr[Long] = js.undefined
  ): Dataset = {
    val __obj = js.Dynamic.literal()
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    if (!js.isUndefined(DataStorage)) __obj.updateDynamic("DataStorage")(DataStorage.get.asInstanceOf[js.Any])
    if (DatasetName != null) __obj.updateDynamic("DatasetName")(DatasetName.asInstanceOf[js.Any])
    if (IdentityId != null) __obj.updateDynamic("IdentityId")(IdentityId.asInstanceOf[js.Any])
    if (LastModifiedBy != null) __obj.updateDynamic("LastModifiedBy")(LastModifiedBy.asInstanceOf[js.Any])
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate.asInstanceOf[js.Any])
    if (!js.isUndefined(NumRecords)) __obj.updateDynamic("NumRecords")(NumRecords.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dataset]
  }
}

