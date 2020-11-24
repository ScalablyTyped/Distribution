package typings.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportAssetFromSignedUrlResponseDetails extends js.Object {
  
  /**
    * The name for the asset associated with this import response.
    */
  var AssetName: typings.awsSdk.dataexchangeMod.AssetName = js.native
  
  /**
    * The unique identifier for the data set associated with this import job.
    */
  var DataSetId: Id = js.native
  
  /**
    * The Base64-encoded Md5 hash for the asset, used to ensure the integrity of the file at that location.
    */
  var Md5Hash: js.UndefOr[stringMin24Max24PatternAZaZ094AZaZ092AZaZ093] = js.native
  
  /**
    * The unique identifier for the revision associated with this import response.
    */
  var RevisionId: Id = js.native
  
  /**
    * The signed URL.
    */
  var SignedUrl: js.UndefOr[string] = js.native
  
  /**
    * The time and date at which the signed URL expires, in ISO 8601 format.
    */
  var SignedUrlExpiresAt: js.UndefOr[Timestamp] = js.native
}
object ImportAssetFromSignedUrlResponseDetails {
  
  @scala.inline
  def apply(AssetName: AssetName, DataSetId: Id, RevisionId: Id): ImportAssetFromSignedUrlResponseDetails = {
    val __obj = js.Dynamic.literal(AssetName = AssetName.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportAssetFromSignedUrlResponseDetails]
  }
  
  @scala.inline
  implicit class ImportAssetFromSignedUrlResponseDetailsOps[Self <: ImportAssetFromSignedUrlResponseDetails] (val x: Self) extends AnyVal {
    
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
    def setAssetName(value: AssetName): Self = this.set("AssetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSetId(value: Id): Self = this.set("DataSetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionId(value: Id): Self = this.set("RevisionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMd5Hash(value: stringMin24Max24PatternAZaZ094AZaZ092AZaZ093): Self = this.set("Md5Hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMd5Hash: Self = this.set("Md5Hash", js.undefined)
    
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
