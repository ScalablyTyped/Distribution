package typings.awsSdk.s3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RegionalBucket extends js.Object {
  
  /**
    * 
    */
  var Bucket: BucketName = js.native
  
  /**
    * The Amazon Resource Name (ARN) for the regional bucket.
    */
  var BucketArn: js.UndefOr[S3RegionalBucketArn] = js.native
  
  /**
    * The creation date of the regional bucket
    */
  var CreationDate: typings.awsSdk.s3controlMod.CreationDate = js.native
  
  /**
    * The AWS Outposts ID of the regional bucket.
    */
  var OutpostId: js.UndefOr[NonEmptyMaxLength64String] = js.native
  
  /**
    * 
    */
  var PublicAccessBlockEnabled: typings.awsSdk.s3controlMod.PublicAccessBlockEnabled = js.native
}
object RegionalBucket {
  
  @scala.inline
  def apply(Bucket: BucketName, CreationDate: CreationDate, PublicAccessBlockEnabled: PublicAccessBlockEnabled): RegionalBucket = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], PublicAccessBlockEnabled = PublicAccessBlockEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegionalBucket]
  }
  
  @scala.inline
  implicit class RegionalBucketOps[Self <: RegionalBucket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBucket(value: BucketName): Self = this.set("Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDate(value: CreationDate): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicAccessBlockEnabled(value: PublicAccessBlockEnabled): Self = this.set("PublicAccessBlockEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketArn(value: S3RegionalBucketArn): Self = this.set("BucketArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucketArn: Self = this.set("BucketArn", js.undefined)
    
    @scala.inline
    def setOutpostId(value: NonEmptyMaxLength64String): Self = this.set("OutpostId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutpostId: Self = this.set("OutpostId", js.undefined)
  }
}
