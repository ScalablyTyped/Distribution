package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Resource extends StObject {
  
  /**
    * The IAM access key details (IAM user information) of a user that engaged in the activity that prompted GuardDuty to generate a finding.
    */
  var AccessKeyDetails: js.UndefOr[typings.awsSdk.guarddutyMod.AccessKeyDetails] = js.native
  
  /**
    * The information about the EC2 instance associated with the activity that prompted GuardDuty to generate a finding.
    */
  var InstanceDetails: js.UndefOr[typings.awsSdk.guarddutyMod.InstanceDetails] = js.native
  
  /**
    * The type of AWS resource.
    */
  var ResourceType: js.UndefOr[String] = js.native
  
  /**
    * Contains information on the S3 bucket.
    */
  var S3BucketDetails: js.UndefOr[typings.awsSdk.guarddutyMod.S3BucketDetails] = js.native
}
object Resource {
  
  @scala.inline
  def apply(): Resource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Resource]
  }
  
  @scala.inline
  implicit class ResourceMutableBuilder[Self <: Resource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessKeyDetails(value: AccessKeyDetails): Self = StObject.set(x, "AccessKeyDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessKeyDetailsUndefined: Self = StObject.set(x, "AccessKeyDetails", js.undefined)
    
    @scala.inline
    def setInstanceDetails(value: InstanceDetails): Self = StObject.set(x, "InstanceDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceDetailsUndefined: Self = StObject.set(x, "InstanceDetails", js.undefined)
    
    @scala.inline
    def setResourceType(value: String): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    @scala.inline
    def setS3BucketDetails(value: S3BucketDetails): Self = StObject.set(x, "S3BucketDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BucketDetailsUndefined: Self = StObject.set(x, "S3BucketDetails", js.undefined)
    
    @scala.inline
    def setS3BucketDetailsVarargs(value: S3BucketDetail*): Self = StObject.set(x, "S3BucketDetails", js.Array(value :_*))
  }
}
