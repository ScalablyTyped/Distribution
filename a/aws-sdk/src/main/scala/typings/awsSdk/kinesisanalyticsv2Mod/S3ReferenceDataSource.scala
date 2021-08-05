package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3ReferenceDataSource extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the S3 bucket.
    */
  var BucketARN: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.BucketARN] = js.undefined
  
  /**
    * The object key name containing the reference data.
    */
  var FileKey: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.FileKey] = js.undefined
}
object S3ReferenceDataSource {
  
  inline def apply(): S3ReferenceDataSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3ReferenceDataSource]
  }
  
  extension [Self <: S3ReferenceDataSource](x: Self) {
    
    inline def setBucketARN(value: BucketARN): Self = StObject.set(x, "BucketARN", value.asInstanceOf[js.Any])
    
    inline def setBucketARNUndefined: Self = StObject.set(x, "BucketARN", js.undefined)
    
    inline def setFileKey(value: FileKey): Self = StObject.set(x, "FileKey", value.asInstanceOf[js.Any])
    
    inline def setFileKeyUndefined: Self = StObject.set(x, "FileKey", js.undefined)
  }
}
