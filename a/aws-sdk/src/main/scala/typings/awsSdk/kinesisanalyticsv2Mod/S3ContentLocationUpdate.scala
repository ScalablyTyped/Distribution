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
  
  @scala.inline
  def apply(): S3ContentLocationUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3ContentLocationUpdate]
  }
  
  @scala.inline
  implicit class S3ContentLocationUpdateMutableBuilder[Self <: S3ContentLocationUpdate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketARNUpdate(value: BucketARN): Self = StObject.set(x, "BucketARNUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketARNUpdateUndefined: Self = StObject.set(x, "BucketARNUpdate", js.undefined)
    
    @scala.inline
    def setFileKeyUpdate(value: FileKey): Self = StObject.set(x, "FileKeyUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileKeyUpdateUndefined: Self = StObject.set(x, "FileKeyUpdate", js.undefined)
    
    @scala.inline
    def setObjectVersionUpdate(value: ObjectVersion): Self = StObject.set(x, "ObjectVersionUpdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectVersionUpdateUndefined: Self = StObject.set(x, "ObjectVersionUpdate", js.undefined)
  }
}
