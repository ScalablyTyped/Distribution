package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportTaskS3LocationRequest extends StObject {
  
  /**
    * The destination Amazon S3 bucket.
    */
  var S3Bucket: String = js.native
  
  /**
    * The prefix (logical hierarchy) in the bucket.
    */
  var S3Prefix: js.UndefOr[String] = js.native
}
object ExportTaskS3LocationRequest {
  
  @scala.inline
  def apply(S3Bucket: String): ExportTaskS3LocationRequest = {
    val __obj = js.Dynamic.literal(S3Bucket = S3Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportTaskS3LocationRequest]
  }
  
  @scala.inline
  implicit class ExportTaskS3LocationRequestMutableBuilder[Self <: ExportTaskS3LocationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setS3Bucket(value: String): Self = StObject.set(x, "S3Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Prefix(value: String): Self = StObject.set(x, "S3Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3PrefixUndefined: Self = StObject.set(x, "S3Prefix", js.undefined)
  }
}
