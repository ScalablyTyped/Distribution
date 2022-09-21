package typings.awsSdk.gamesparksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportSnapshotResult extends StObject {
  
  /**
    * The presigned URL for the snapshot data.  This URL will be available for 10 minutes, and can be used to download the snapshot content. If the URL expires, a new one can be requested using the same operation. 
    */
  var S3Url: js.UndefOr[S3PresignedUrl] = js.undefined
}
object ExportSnapshotResult {
  
  inline def apply(): ExportSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportSnapshotResult]
  }
  
  extension [Self <: ExportSnapshotResult](x: Self) {
    
    inline def setS3Url(value: S3PresignedUrl): Self = StObject.set(x, "S3Url", value.asInstanceOf[js.Any])
    
    inline def setS3UrlUndefined: Self = StObject.set(x, "S3Url", js.undefined)
  }
}
