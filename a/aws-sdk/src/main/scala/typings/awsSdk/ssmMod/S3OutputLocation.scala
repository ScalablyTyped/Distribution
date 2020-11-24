package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3OutputLocation extends js.Object {
  
  /**
    * The name of the S3 bucket.
    */
  var OutputS3BucketName: js.UndefOr[S3BucketName] = js.native
  
  /**
    * The S3 bucket subfolder.
    */
  var OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.native
  
  /**
    * (Deprecated) You can no longer specify this parameter. The system ignores it. Instead, Systems Manager automatically determines the Region of the S3 bucket.
    */
  var OutputS3Region: js.UndefOr[S3Region] = js.native
}
object S3OutputLocation {
  
  @scala.inline
  def apply(): S3OutputLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3OutputLocation]
  }
  
  @scala.inline
  implicit class S3OutputLocationOps[Self <: S3OutputLocation] (val x: Self) extends AnyVal {
    
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
    def setOutputS3BucketName(value: S3BucketName): Self = this.set("OutputS3BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputS3BucketName: Self = this.set("OutputS3BucketName", js.undefined)
    
    @scala.inline
    def setOutputS3KeyPrefix(value: S3KeyPrefix): Self = this.set("OutputS3KeyPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputS3KeyPrefix: Self = this.set("OutputS3KeyPrefix", js.undefined)
    
    @scala.inline
    def setOutputS3Region(value: S3Region): Self = this.set("OutputS3Region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputS3Region: Self = this.set("OutputS3Region", js.undefined)
  }
}
