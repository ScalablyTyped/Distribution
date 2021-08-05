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
  
  inline def apply(): ResponseDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseDetails]
  }
  
  extension [Self <: ResponseDetails](x: Self) {
    
    inline def setExportAssetToSignedUrl(value: ExportAssetToSignedUrlResponseDetails): Self = StObject.set(x, "ExportAssetToSignedUrl", value.asInstanceOf[js.Any])
    
    inline def setExportAssetToSignedUrlUndefined: Self = StObject.set(x, "ExportAssetToSignedUrl", js.undefined)
    
    inline def setExportAssetsToS3(value: ExportAssetsToS3ResponseDetails): Self = StObject.set(x, "ExportAssetsToS3", value.asInstanceOf[js.Any])
    
    inline def setExportAssetsToS3Undefined: Self = StObject.set(x, "ExportAssetsToS3", js.undefined)
    
    inline def setImportAssetFromSignedUrl(value: ImportAssetFromSignedUrlResponseDetails): Self = StObject.set(x, "ImportAssetFromSignedUrl", value.asInstanceOf[js.Any])
    
    inline def setImportAssetFromSignedUrlUndefined: Self = StObject.set(x, "ImportAssetFromSignedUrl", js.undefined)
    
    inline def setImportAssetsFromS3(value: ImportAssetsFromS3ResponseDetails): Self = StObject.set(x, "ImportAssetsFromS3", value.asInstanceOf[js.Any])
    
    inline def setImportAssetsFromS3Undefined: Self = StObject.set(x, "ImportAssetsFromS3", js.undefined)
  }
}
