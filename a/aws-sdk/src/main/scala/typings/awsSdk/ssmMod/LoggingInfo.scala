package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoggingInfo extends StObject {
  
  /**
    * The name of an S3 bucket where execution logs are stored .
    */
  var S3BucketName: typings.awsSdk.ssmMod.S3BucketName = js.native
  
  /**
    * (Optional) The S3 bucket subfolder. 
    */
  var S3KeyPrefix: js.UndefOr[typings.awsSdk.ssmMod.S3KeyPrefix] = js.native
  
  /**
    * The Region where the S3 bucket is located.
    */
  var S3Region: typings.awsSdk.ssmMod.S3Region = js.native
}
object LoggingInfo {
  
  @scala.inline
  def apply(S3BucketName: S3BucketName, S3Region: S3Region): LoggingInfo = {
    val __obj = js.Dynamic.literal(S3BucketName = S3BucketName.asInstanceOf[js.Any], S3Region = S3Region.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoggingInfo]
  }
  
  @scala.inline
  implicit class LoggingInfoMutableBuilder[Self <: LoggingInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3BucketName(value: S3BucketName): Self = StObject.set(x, "S3BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3KeyPrefix(value: S3KeyPrefix): Self = StObject.set(x, "S3KeyPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3KeyPrefixUndefined: Self = StObject.set(x, "S3KeyPrefix", js.undefined)
    
    @scala.inline
    def setS3Region(value: S3Region): Self = StObject.set(x, "S3Region", value.asInstanceOf[js.Any])
  }
}
