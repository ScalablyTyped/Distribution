package typings.awsSdk.dataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestDetails extends StObject {
  
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
  implicit class RequestDetailsMutableBuilder[Self <: RequestDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportAssetToSignedUrl(value: ExportAssetToSignedUrlRequestDetails): Self = StObject.set(x, "ExportAssetToSignedUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportAssetToSignedUrlUndefined: Self = StObject.set(x, "ExportAssetToSignedUrl", js.undefined)
    
    @scala.inline
    def setExportAssetsToS3(value: ExportAssetsToS3RequestDetails): Self = StObject.set(x, "ExportAssetsToS3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportAssetsToS3Undefined: Self = StObject.set(x, "ExportAssetsToS3", js.undefined)
    
    @scala.inline
    def setImportAssetFromSignedUrl(value: ImportAssetFromSignedUrlRequestDetails): Self = StObject.set(x, "ImportAssetFromSignedUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportAssetFromSignedUrlUndefined: Self = StObject.set(x, "ImportAssetFromSignedUrl", js.undefined)
    
    @scala.inline
    def setImportAssetsFromS3(value: ImportAssetsFromS3RequestDetails): Self = StObject.set(x, "ImportAssetsFromS3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportAssetsFromS3Undefined: Self = StObject.set(x, "ImportAssetsFromS3", js.undefined)
  }
}
