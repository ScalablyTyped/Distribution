package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3Storage extends StObject {
  
  /**
    * The access key ID of the owner of the bucket. Before you specify a value for your access key ID, review and follow the guidance in Best Practices for Managing AWS Access Keys.
    */
  var AWSAccessKeyId: js.UndefOr[String] = js.native
  
  /**
    * The bucket in which to store the AMI. You can specify a bucket that you already own or a new bucket that Amazon EC2 creates on your behalf. If you specify a bucket that belongs to someone else, Amazon EC2 returns an error.
    */
  var Bucket: js.UndefOr[String] = js.native
  
  /**
    * The beginning of the file name of the AMI.
    */
  var Prefix: js.UndefOr[String] = js.native
  
  /**
    * An Amazon S3 upload policy that gives Amazon EC2 permission to upload items into Amazon S3 on your behalf.
    */
  var UploadPolicy: js.UndefOr[_Blob] = js.native
  
  /**
    * The signature of the JSON document.
    */
  var UploadPolicySignature: js.UndefOr[String] = js.native
}
object S3Storage {
  
  @scala.inline
  def apply(): S3Storage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3Storage]
  }
  
  @scala.inline
  implicit class S3StorageMutableBuilder[Self <: S3Storage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAWSAccessKeyId(value: String): Self = StObject.set(x, "AWSAccessKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAWSAccessKeyIdUndefined: Self = StObject.set(x, "AWSAccessKeyId", js.undefined)
    
    @scala.inline
    def setBucket(value: String): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketUndefined: Self = StObject.set(x, "Bucket", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "Prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "Prefix", js.undefined)
    
    @scala.inline
    def setUploadPolicy(value: _Blob): Self = StObject.set(x, "UploadPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadPolicySignature(value: String): Self = StObject.set(x, "UploadPolicySignature", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadPolicySignatureUndefined: Self = StObject.set(x, "UploadPolicySignature", js.undefined)
    
    @scala.inline
    def setUploadPolicyUndefined: Self = StObject.set(x, "UploadPolicy", js.undefined)
  }
}
