package typings.awsSdk.dataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestDetails extends js.Object {
  
  /**
    * Details about the export to signed URL request.
    */
  var ExportAssetToSignedUrl: js.UndefOr[ExportAssetToSignedUrlRequestDetails] = js.native
  
  /**
    * Details about the export to Amazon S3 request.
    */
  var ExportAssetsToS3: js.UndefOr[ExportAssetsToS3RequestDetails] = js.native
  
  /**
    * Details about the import from signed URL request.
    */
  var ImportAssetFromSignedUrl: js.UndefOr[ImportAssetFromSignedUrlRequestDetails] = js.native
  
  /**
    * Details about the import from Amazon S3 request.
    */
  var ImportAssetsFromS3: js.UndefOr[ImportAssetsFromS3RequestDetails] = js.native
}
object RequestDetails {
  
  @scala.inline
  def apply(): RequestDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestDetails]
  }
  
  @scala.inline
  implicit class RequestDetailsOps[Self <: RequestDetails] (val x: Self) extends AnyVal {
    
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
    def setExportAssetToSignedUrl(value: ExportAssetToSignedUrlRequestDetails): Self = this.set("ExportAssetToSignedUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportAssetToSignedUrl: Self = this.set("ExportAssetToSignedUrl", js.undefined)
    
    @scala.inline
    def setExportAssetsToS3(value: ExportAssetsToS3RequestDetails): Self = this.set("ExportAssetsToS3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportAssetsToS3: Self = this.set("ExportAssetsToS3", js.undefined)
    
    @scala.inline
    def setImportAssetFromSignedUrl(value: ImportAssetFromSignedUrlRequestDetails): Self = this.set("ImportAssetFromSignedUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportAssetFromSignedUrl: Self = this.set("ImportAssetFromSignedUrl", js.undefined)
    
    @scala.inline
    def setImportAssetsFromS3(value: ImportAssetsFromS3RequestDetails): Self = this.set("ImportAssetsFromS3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportAssetsFromS3: Self = this.set("ImportAssetsFromS3", js.undefined)
  }
}
