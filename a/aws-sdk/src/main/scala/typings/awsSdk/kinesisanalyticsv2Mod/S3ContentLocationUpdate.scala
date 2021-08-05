package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3ContentLocationUpdate extends StObject {
  
  /**
    * The new Amazon Resource Name (ARN) for the S3 bucket containing the application code.
    */
  var BucketARNUpdate: js.UndefOr[BucketARN] = js.undefined
  
  /**
    * The new file key for the object containing the application code.
    */
  var FileKeyUpdate: js.UndefOr[FileKey] = js.undefined
  
  /**
    * The new version of the object containing the application code.
    */
  var ObjectVersionUpdate: js.UndefOr[ObjectVersion] = js.undefined
}
object S3ContentLocationUpdate {
  
  inline def apply(): S3ContentLocationUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3ContentLocationUpdate]
  }
  
  extension [Self <: S3ContentLocationUpdate](x: Self) {
    
    inline def setBucketARNUpdate(value: BucketARN): Self = StObject.set(x, "BucketARNUpdate", value.asInstanceOf[js.Any])
    
    inline def setBucketARNUpdateUndefined: Self = StObject.set(x, "BucketARNUpdate", js.undefined)
    
    inline def setFileKeyUpdate(value: FileKey): Self = StObject.set(x, "FileKeyUpdate", value.asInstanceOf[js.Any])
    
    inline def setFileKeyUpdateUndefined: Self = StObject.set(x, "FileKeyUpdate", js.undefined)
    
    inline def setObjectVersionUpdate(value: ObjectVersion): Self = StObject.set(x, "ObjectVersionUpdate", value.asInstanceOf[js.Any])
    
    inline def setObjectVersionUpdateUndefined: Self = StObject.set(x, "ObjectVersionUpdate", js.undefined)
  }
}
