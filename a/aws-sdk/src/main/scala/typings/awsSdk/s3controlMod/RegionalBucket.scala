package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegionalBucket extends StObject {
  
  /**
    * 
    */
  var Bucket: BucketName
  
  /**
    * The Amazon Resource Name (ARN) for the regional bucket.
    */
  var BucketArn: js.UndefOr[S3RegionalBucketArn] = js.undefined
  
  /**
    * The creation date of the regional bucket
    */
  var CreationDate: typings.awsSdk.s3controlMod.CreationDate
  
  /**
    * The AWS Outposts ID of the regional bucket.
    */
  var OutpostId: js.UndefOr[NonEmptyMaxLength64String] = js.undefined
  
  /**
    * 
    */
  var PublicAccessBlockEnabled: typings.awsSdk.s3controlMod.PublicAccessBlockEnabled
}
object RegionalBucket {
  
  @scala.inline
  def apply(Bucket: BucketName, CreationDate: CreationDate, PublicAccessBlockEnabled: PublicAccessBlockEnabled): RegionalBucket = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], CreationDate = CreationDate.asInstanceOf[js.Any], PublicAccessBlockEnabled = PublicAccessBlockEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegionalBucket]
  }
  
  @scala.inline
  implicit class RegionalBucketMutableBuilder[Self <: RegionalBucket] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketArn(value: S3RegionalBucketArn): Self = StObject.set(x, "BucketArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketArnUndefined: Self = StObject.set(x, "BucketArn", js.undefined)
    
    @scala.inline
    def setCreationDate(value: CreationDate): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutpostId(value: NonEmptyMaxLength64String): Self = StObject.set(x, "OutpostId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutpostIdUndefined: Self = StObject.set(x, "OutpostId", js.undefined)
    
    @scala.inline
    def setPublicAccessBlockEnabled(value: PublicAccessBlockEnabled): Self = StObject.set(x, "PublicAccessBlockEnabled", value.asInstanceOf[js.Any])
  }
}
