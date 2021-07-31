package typings.awsSdk.s3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAccessPointRequest extends StObject {
  
  /**
    * The AWS account ID for the owner of the bucket for which you want to create an access point.
    */
  var AccountId: typings.awsSdk.s3controlMod.AccountId
  
  /**
    * The name of the bucket that you want to associate this access point with. For using this parameter with Amazon S3 on Outposts with the REST API, you must specify the name and the x-amz-outpost-id as well. For using this parameter with S3 on Outposts with the AWS SDK and CLI, you must specify the ARN of the bucket accessed in the format arn:aws:s3-outposts:&lt;Region&gt;:&lt;account-id&gt;:outpost/&lt;outpost-id&gt;/bucket/&lt;my-bucket-name&gt;. For example, to access the bucket reports through outpost my-outpost owned by account 123456789012 in Region us-west-2, use the URL encoding of arn:aws:s3-outposts:us-west-2:123456789012:outpost/my-outpost/bucket/reports. The value must be URL encoded. 
    */
  var Bucket: BucketName
  
  /**
    * The name you want to assign to this access point.
    */
  var Name: AccessPointName
  
  var PublicAccessBlockConfiguration: js.UndefOr[typings.awsSdk.s3controlMod.PublicAccessBlockConfiguration] = js.undefined
  
  /**
    * If you include this field, Amazon S3 restricts access to this access point to requests from the specified virtual private cloud (VPC).  This is required for creating an access point for Amazon S3 on Outposts buckets. 
    */
  var VpcConfiguration: js.UndefOr[typings.awsSdk.s3controlMod.VpcConfiguration] = js.undefined
}
object CreateAccessPointRequest {
  
  @scala.inline
  def apply(AccountId: AccountId, Bucket: BucketName, Name: AccessPointName): CreateAccessPointRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Bucket = Bucket.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccessPointRequest]
  }
  
  @scala.inline
  implicit class CreateAccessPointRequestMutableBuilder[Self <: CreateAccessPointRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: AccessPointName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicAccessBlockConfiguration(value: PublicAccessBlockConfiguration): Self = StObject.set(x, "PublicAccessBlockConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublicAccessBlockConfigurationUndefined: Self = StObject.set(x, "PublicAccessBlockConfiguration", js.undefined)
    
    @scala.inline
    def setVpcConfiguration(value: VpcConfiguration): Self = StObject.set(x, "VpcConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcConfigurationUndefined: Self = StObject.set(x, "VpcConfiguration", js.undefined)
  }
}
