package typings.awsSdk.wafMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateWebACLMigrationStackRequest extends js.Object {
  
  /**
    * Indicates whether to exclude entities that can't be migrated or to stop the migration. Set this to true to ignore unsupported entities in the web ACL during the migration. Otherwise, if AWS WAF encounters unsupported entities, it stops the process and throws an exception. 
    */
  var IgnoreUnsupportedType: typings.awsSdk.wafMod.IgnoreUnsupportedType = js.native
  
  /**
    * The name of the Amazon S3 bucket to store the CloudFormation template in. The S3 bucket must be configured as follows for the migration:    The bucket name must start with aws-waf-migration-. For example, aws-waf-migration-my-web-acl.   The bucket must be in the Region where you are deploying the template. For example, for a web ACL in us-west-2, you must use an Amazon S3 bucket in us-west-2 and you must deploy the template stack to us-west-2.    The bucket policies must permit the migration process to write data. For listings of the bucket policies, see the Examples section.   
    */
  var S3BucketName: typings.awsSdk.wafMod.S3BucketName = js.native
  
  /**
    * The UUID of the WAF Classic web ACL that you want to migrate to WAF v2.
    */
  var WebACLId: ResourceId = js.native
}
object CreateWebACLMigrationStackRequest {
  
  @scala.inline
  def apply(IgnoreUnsupportedType: IgnoreUnsupportedType, S3BucketName: S3BucketName, WebACLId: ResourceId): CreateWebACLMigrationStackRequest = {
    val __obj = js.Dynamic.literal(IgnoreUnsupportedType = IgnoreUnsupportedType.asInstanceOf[js.Any], S3BucketName = S3BucketName.asInstanceOf[js.Any], WebACLId = WebACLId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateWebACLMigrationStackRequest]
  }
  
  @scala.inline
  implicit class CreateWebACLMigrationStackRequestOps[Self <: CreateWebACLMigrationStackRequest] (val x: Self) extends AnyVal {
    
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
    def setIgnoreUnsupportedType(value: IgnoreUnsupportedType): Self = this.set("IgnoreUnsupportedType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BucketName(value: S3BucketName): Self = this.set("S3BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWebACLId(value: ResourceId): Self = this.set("WebACLId", value.asInstanceOf[js.Any])
  }
}
