package typings.awsSdk.kinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3Configuration extends StObject {
  
  /**
    * The ARN of the S3 bucket that contains the data.
    */
  var BucketARN: typings.awsSdk.kinesisanalyticsv2Mod.BucketARN
  
  /**
    * The name of the object that contains the data.
    */
  var FileKey: typings.awsSdk.kinesisanalyticsv2Mod.FileKey
}
object S3Configuration {
  
  @scala.inline
  def apply(BucketARN: BucketARN, FileKey: FileKey): S3Configuration = {
    val __obj = js.Dynamic.literal(BucketARN = BucketARN.asInstanceOf[js.Any], FileKey = FileKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3Configuration]
  }
  
  @scala.inline
  implicit class S3ConfigurationMutableBuilder[Self <: S3Configuration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketARN(value: BucketARN): Self = StObject.set(x, "BucketARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileKey(value: FileKey): Self = StObject.set(x, "FileKey", value.asInstanceOf[js.Any])
  }
}
