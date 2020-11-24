package typings.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportAssetsToS3ResponseDetails extends js.Object {
  
  /**
    * The destination in Amazon S3 where the asset is exported.
    */
  var AssetDestinations: ListOfAssetDestinationEntry = js.native
  
  /**
    * The unique identifier for the data set associated with this export job.
    */
  var DataSetId: Id = js.native
  
  /**
    * Encryption configuration of the export job.
    */
  var Encryption: js.UndefOr[ExportServerSideEncryption] = js.native
  
  /**
    * The unique identifier for the revision associated with this export response.
    */
  var RevisionId: Id = js.native
}
object ExportAssetsToS3ResponseDetails {
  
  @scala.inline
  def apply(AssetDestinations: ListOfAssetDestinationEntry, DataSetId: Id, RevisionId: Id): ExportAssetsToS3ResponseDetails = {
    val __obj = js.Dynamic.literal(AssetDestinations = AssetDestinations.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportAssetsToS3ResponseDetails]
  }
  
  @scala.inline
  implicit class ExportAssetsToS3ResponseDetailsOps[Self <: ExportAssetsToS3ResponseDetails] (val x: Self) extends AnyVal {
    
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
