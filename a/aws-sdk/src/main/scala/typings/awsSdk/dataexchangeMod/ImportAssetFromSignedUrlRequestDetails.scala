package typings.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportAssetFromSignedUrlRequestDetails extends js.Object {
  
  /**
    * The name of the asset. When importing from Amazon S3, the S3 object key is used as the asset name.
    */
  var AssetName: typings.awsSdk.dataexchangeMod.AssetName = js.native
  
  /**
    * The unique identifier for the data set associated with this import job.
    */
  var DataSetId: Id = js.native
  
  /**
    * The Base64-encoded Md5 hash for the asset, used to ensure the integrity of the file at that location.
    */
  var Md5Hash: stringMin24Max24PatternAZaZ094AZaZ092AZaZ093 = js.native
  
  /**
    * The unique identifier for the revision associated with this import request.
    */
  var RevisionId: Id = js.native
}
object ImportAssetFromSignedUrlRequestDetails {
  
  @scala.inline
  def apply(
    AssetName: AssetName,
    DataSetId: Id,
    Md5Hash: stringMin24Max24PatternAZaZ094AZaZ092AZaZ093,
    RevisionId: Id
  ): ImportAssetFromSignedUrlRequestDetails = {
    val __obj = js.Dynamic.literal(AssetName = AssetName.asInstanceOf[js.Any], DataSetId = DataSetId.asInstanceOf[js.Any], Md5Hash = Md5Hash.asInstanceOf[js.Any], RevisionId = RevisionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportAssetFromSignedUrlRequestDetails]
  }
  
  @scala.inline
  implicit class ImportAssetFromSignedUrlRequestDetailsOps[Self <: ImportAssetFromSignedUrlRequestDetails] (val x: Self) extends AnyVal {
    
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
    def setMd5Hash(value: stringMin24Max24PatternAZaZ094AZaZ092AZaZ093): Self = this.set("Md5Hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevisionId(value: Id): Self = this.set("RevisionId", value.asInstanceOf[js.Any])
  }
}
