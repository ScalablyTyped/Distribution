package typings.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResponseDetails extends js.Object {
  
  /**
    * Details for the export to signed URL response.
    */
  var ExportAssetToSignedUrl: js.UndefOr[ExportAssetToSignedUrlResponseDetails] = js.native
  
  /**
    * Details for the export to Amazon S3 response.
    */
  var ExportAssetsToS3: js.UndefOr[ExportAssetsToS3ResponseDetails] = js.native
  
  /**
    * Details for the import from signed URL response.
    */
  var ImportAssetFromSignedUrl: js.UndefOr[ImportAssetFromSignedUrlResponseDetails] = js.native
  
  /**
    * Details for the import from Amazon S3 response.
    */
  var ImportAssetsFromS3: js.UndefOr[ImportAssetsFromS3ResponseDetails] = js.native
}
object ResponseDetails {
  
  @scala.inline
  def apply(): ResponseDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseDetails]
  }
  
  @scala.inline
  implicit class ResponseDetailsOps[Self <: ResponseDetails] (val x: Self) extends AnyVal {
    
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
    def setExportAssetToSignedUrl(value: ExportAssetToSignedUrlResponseDetails): Self = this.set("ExportAssetToSignedUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportAssetToSignedUrl: Self = this.set("ExportAssetToSignedUrl", js.undefined)
    
    @scala.inline
    def setExportAssetsToS3(value: ExportAssetsToS3ResponseDetails): Self = this.set("ExportAssetsToS3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportAssetsToS3: Self = this.set("ExportAssetsToS3", js.undefined)
    
    @scala.inline
    def setImportAssetFromSignedUrl(value: ImportAssetFromSignedUrlResponseDetails): Self = this.set("ImportAssetFromSignedUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportAssetFromSignedUrl: Self = this.set("ImportAssetFromSignedUrl", js.undefined)
    
    @scala.inline
    def setImportAssetsFromS3(value: ImportAssetsFromS3ResponseDetails): Self = this.set("ImportAssetsFromS3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportAssetsFromS3: Self = this.set("ImportAssetsFromS3", js.undefined)
  }
}
