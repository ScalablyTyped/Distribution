package typings.awsSdk.dataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseDetails extends StObject {
  
  /**
    * Details for the export to signed URL response.
    */
  var ExportAssetToSignedUrl: js.UndefOr[ExportAssetToSignedUrlResponseDetails] = js.undefined
  
  /**
    * Details for the export to Amazon S3 response.
    */
  var ExportAssetsToS3: js.UndefOr[ExportAssetsToS3ResponseDetails] = js.undefined
  
  /**
    * Details for the import from signed URL response.
    */
  var ImportAssetFromSignedUrl: js.UndefOr[ImportAssetFromSignedUrlResponseDetails] = js.undefined
  
  /**
    * Details for the import from Amazon S3 response.
    */
  var ImportAssetsFromS3: js.UndefOr[ImportAssetsFromS3ResponseDetails] = js.undefined
}
object ResponseDetails {
  
  @scala.inline
  def apply(): ResponseDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseDetails]
  }
  
  @scala.inline
  implicit class ResponseDetailsMutableBuilder[Self <: ResponseDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportAssetToSignedUrl(value: ExportAssetToSignedUrlResponseDetails): Self = StObject.set(x, "ExportAssetToSignedUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportAssetToSignedUrlUndefined: Self = StObject.set(x, "ExportAssetToSignedUrl", js.undefined)
    
    @scala.inline
    def setExportAssetsToS3(value: ExportAssetsToS3ResponseDetails): Self = StObject.set(x, "ExportAssetsToS3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportAssetsToS3Undefined: Self = StObject.set(x, "ExportAssetsToS3", js.undefined)
    
    @scala.inline
    def setImportAssetFromSignedUrl(value: ImportAssetFromSignedUrlResponseDetails): Self = StObject.set(x, "ImportAssetFromSignedUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportAssetFromSignedUrlUndefined: Self = StObject.set(x, "ImportAssetFromSignedUrl", js.undefined)
    
    @scala.inline
    def setImportAssetsFromS3(value: ImportAssetsFromS3ResponseDetails): Self = StObject.set(x, "ImportAssetsFromS3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportAssetsFromS3Undefined: Self = StObject.set(x, "ImportAssetsFromS3", js.undefined)
  }
}
