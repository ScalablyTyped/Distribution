package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportTaskS3LocationRequest extends js.Object {
  
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
  implicit class ExportTaskS3LocationRequestOps[Self <: ExportTaskS3LocationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setS3Bucket(value: String): Self = this.set("S3Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Prefix(value: String): Self = this.set("S3Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Prefix: Self = this.set("S3Prefix", js.undefined)
  }
}
