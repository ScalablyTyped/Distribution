package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportTaskS3Location extends StObject {
  
  /**
    * The destination Amazon S3 bucket.
    */
  var S3Bucket: js.UndefOr[String] = js.native
  
  /**
    * The prefix (logical hierarchy) in the bucket.
    */
  var S3Prefix: js.UndefOr[String] = js.native
}
object ExportTaskS3Location {
  
  @scala.inline
  def apply(): ExportTaskS3Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportTaskS3Location]
  }
  
  @scala.inline
  implicit class ExportTaskS3LocationMutableBuilder[Self <: ExportTaskS3Location] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3Bucket(value: String): Self = StObject.set(x, "S3Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BucketUndefined: Self = StObject.set(x, "S3Bucket", js.undefined)
    
    @scala.inline
    def setS3Prefix(value: String): Self = StObject.set(x, "S3Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3PrefixUndefined: Self = StObject.set(x, "S3Prefix", js.undefined)
  }
}
