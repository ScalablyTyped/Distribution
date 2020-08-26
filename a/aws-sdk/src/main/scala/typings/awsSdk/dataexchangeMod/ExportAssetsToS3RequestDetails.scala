package typings.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportAssetsToS3RequestDetails extends js.Object {
  /**
    * The destination for the asset.
    */
  var AssetDestinations: ListOfAssetDestinationEntry = js.native
  /**
    * The unique identifier for the data set associated with this export job.
    */
  var DataSetId: Id = js.native
  /**
    * Encryption configuration for the export job.
    */
  var Encryption: js.UndefOr[ExportServerSideEncryption] = js.native
  /**
    * The unique identifier for the revision associated with this export request.
    */
  var RevisionId: Id = js.native
}

object ExportAssetsToS3RequestDetails {
  @scala.inline
  def apply(AssetDestinations: ListOfAssetDestinationEntry, DataSetId: Id, RevisionId: Id): ExportAssetsToS3RequestDetails = {
    val __obj = js.Dynamic.literal(AssetDestinations = AssetDestinations.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportAssetsToS3RequestDetails]
  }
  @scala.inline
  implicit class ExportAssetsToS3RequestDetailsOps[Self <: ExportAssetsToS3RequestDetails] (val x: Self) extends AnyVal {
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
    def setAssetDestinationsVarargs(value: AssetDestinationEntry*): Self = this.set("AssetDestinations", js.Array(value :_*))
    @scala.inline
    def setAssetDestinations(value: ListOfAssetDestinationEntry): Self = this.set("AssetDestinations", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataSetId(value: Id): Self = this.set("DataSetId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRevisionId(value: Id): Self = this.set("RevisionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncryption(value: ExportServerSideEncryption): Self = this.set("Encryption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryption: Self = this.set("Encryption", js.undefined)
  }
  
}

