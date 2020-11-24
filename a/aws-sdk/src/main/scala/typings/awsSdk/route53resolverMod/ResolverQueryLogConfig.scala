package typings.awsSdk.route53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResolverQueryLogConfig extends js.Object {
  
  /**
    * The ARN for the query logging configuration.
    */
  var Arn: js.UndefOr[typings.awsSdk.route53resolverMod.Arn] = js.native
  
  /**
    * The number of VPCs that are associated with the query logging configuration.
    */
  var AssociationCount: js.UndefOr[Count] = js.native
  
  /**
    * The date and time that the query logging configuration was created, in Unix time format and Coordinated Universal Time (UTC).
    */
  var CreationTime: js.UndefOr[Rfc3339TimeString] = js.native
  
  /**
    * A unique string that identifies the request that created the query logging configuration. The CreatorRequestId allows failed requests to be retried without the risk of executing the operation twice.
    */
  var CreatorRequestId: js.UndefOr[typings.awsSdk.route53resolverMod.CreatorRequestId] = js.native
  
  /**
    * The ARN of the resource that you want Resolver to send query logs: an Amazon S3 bucket, a CloudWatch Logs log group, or a Kinesis Data Firehose delivery stream.
    */
  var DestinationArn: js.UndefOr[typings.awsSdk.route53resolverMod.DestinationArn] = js.native
  
  /**
    * The ID for the query logging configuration.
    */
  var Id: js.UndefOr[ResourceId] = js.native
  
  /**
    * The name of the query logging configuration. 
    */
  var Name: js.UndefOr[ResolverQueryLogConfigName] = js.native
  
  /**
    * The AWS account ID for the account that created the query logging configuration. 
    */
  var OwnerId: js.UndefOr[AccountId] = js.native
  
  /**
    * An indication of whether the query logging configuration is shared with other AWS accounts, or was shared with the current account by another AWS account. Sharing is configured through AWS Resource Access Manager (AWS RAM).
    */
  var ShareStatus: js.UndefOr[typings.awsSdk.route53resolverMod.ShareStatus] = js.native
  
  /**
    * The status of the specified query logging configuration. Valid values include the following:    CREATING: Resolver is creating the query logging configuration.    CREATED: The query logging configuration was successfully created. Resolver is logging queries that originate in the specified VPC.    DELETING: Resolver is deleting this query logging configuration.    FAILED: Resolver can't deliver logs to the location that is specified in the query logging configuration. Here are two common causes:   The specified destination (for example, an Amazon S3 bucket) was deleted.   Permissions don't allow sending logs to the destination.    
    */
  var Status: js.UndefOr[ResolverQueryLogConfigStatus] = js.native
}
object ResolverQueryLogConfig {
  
  @scala.inline
  def apply(): ResolverQueryLogConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolverQueryLogConfig]
  }
  
  @scala.inline
  implicit class ResolverQueryLogConfigOps[Self <: ResolverQueryLogConfig] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Arn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    
    @scala.inline
    def setAssociationCount(value: Count): Self = this.set("AssociationCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociationCount: Self = this.set("AssociationCount", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Rfc3339TimeString): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    
    @scala.inline
    def setCreatorRequestId(value: CreatorRequestId): Self = this.set("CreatorRequestId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatorRequestId: Self = this.set("CreatorRequestId", js.undefined)
    
    @scala.inline
    def setDestinationArn(value: DestinationArn): Self = this.set("DestinationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationArn: Self = this.set("DestinationArn", js.undefined)
    
    @scala.inline
    def setId(value: ResourceId): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setName(value: ResolverQueryLogConfigName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    
    @scala.inline
    def setOwnerId(value: AccountId): Self = this.set("OwnerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwnerId: Self = this.set("OwnerId", js.undefined)
    
    @scala.inline
    def setShareStatus(value: ShareStatus): Self = this.set("ShareStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShareStatus: Self = this.set("ShareStatus", js.undefined)
    
    @scala.inline
    def setStatus(value: ResolverQueryLogConfigStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
  }
}
