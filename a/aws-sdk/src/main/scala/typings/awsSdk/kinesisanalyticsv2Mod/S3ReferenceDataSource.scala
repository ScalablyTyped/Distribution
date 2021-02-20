package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3ReferenceDataSource extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the S3 bucket.
    */
  var BucketARN: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.BucketARN] = js.native
  
  /**
    * The object key name containing the reference data.
    */
  var FileKey: js.UndefOr[typings.awsSdk.kinesisanalyticsv2Mod.FileKey] = js.native
}
object S3ReferenceDataSource {
  
  @scala.inline
  def apply(): S3ReferenceDataSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3ReferenceDataSource]
  }
  
  @scala.inline
  implicit class S3ReferenceDataSourceMutableBuilder[Self <: S3ReferenceDataSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketARN(value: BucketARN): Self = StObject.set(x, "BucketARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketARNUndefined: Self = StObject.set(x, "BucketARN", js.undefined)
    
    @scala.inline
    def setFileKey(value: FileKey): Self = StObject.set(x, "FileKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileKeyUndefined: Self = StObject.set(x, "FileKey", js.undefined)
  }
}
