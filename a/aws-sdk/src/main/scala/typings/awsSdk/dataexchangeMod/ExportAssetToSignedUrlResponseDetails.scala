package typings.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportAssetToSignedUrlResponseDetails extends js.Object {
  
  /**
    * The unique identifier for the asset associated with this export job.
    */
  var AssetId: Id = js.native
  
  /**
    * The unique identifier for the data set associated with this export job.
    */
  var DataSetId: Id = js.native
  
  /**
    * The unique identifier for the revision associated with this export response.
    */
  var RevisionId: Id = js.native
  
  /**
    * The signed URL for the export request.
    */
  var SignedUrl: js.UndefOr[string] = js.native
  
  /**
    * The date and time that the signed URL expires, in ISO 8601 format.
    */
  var SignedUrlExpiresAt: js.UndefOr[Timestamp] = js.native
}
object ExportAssetToSignedUrlResponseDetails {
  
  @scala.inline
  def apply(AssetId: Id, DataSetId: Id, RevisionId: Id): ExportAssetToSignedUrlResponseDetails = {
    val __obj = js.Dynamic.literal(AssetId = AssetId.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportAssetToSignedUrlResponseDetails]
  }
  
  @scala.inline
  implicit class ExportAssetToSignedUrlResponseDetailsOps[Self <: ExportAssetToSignedUrlResponseDetails] (val x: Self) extends AnyVal {
    
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
    def setAssetId(value: Id): Self = this.set("AssetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSetId(value: Id): Self = this.set("DataSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionId(value: Id): Self = this.set("RevisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignedUrl(value: string): Self = this.set("SignedUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignedUrl: Self = this.set("SignedUrl", js.undefined)
    
    @scala.inline
    def setSignedUrlExpiresAt(value: Timestamp): Self = this.set("SignedUrlExpiresAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignedUrlExpiresAt: Self = this.set("SignedUrlExpiresAt", js.undefined)
  }
}
