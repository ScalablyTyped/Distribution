package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filter extends StObject {
  
  /**
    * The name of the parameter that you want to use to filter objects. The valid values for Name depend on the action that you're including the filter in, ListResolverEndpoints, ListResolverRules, ListResolverRuleAssociations, ListResolverQueryLogConfigs, or ListResolverQueryLogConfigAssociations.  In early versions of Resolver, values for Name were listed as uppercase, with underscore (_) delimiters. For example, CreatorRequestId was originally listed as CREATOR_REQUEST_ID. Uppercase values for Name are still supported.   ListResolverEndpoints  Valid values for Name include the following:    CreatorRequestId: The value that you specified when you created the Resolver endpoint.    Direction: Whether you want to return inbound or outbound Resolver endpoints. If you specify DIRECTION for Name, specify INBOUND or OUTBOUND for Values.    HostVPCId: The ID of the VPC that inbound DNS queries pass through on the way from your network to your VPCs in a region, or the VPC that outbound queries pass through on the way from your VPCs to your network. In a CreateResolverEndpoint request, SubnetId indirectly identifies the VPC. In a GetResolverEndpoint request, the VPC ID for a Resolver endpoint is returned in the HostVPCId element.     IpAddressCount: The number of IP addresses that you have associated with the Resolver endpoint.    Name: The name of the Resolver endpoint.    SecurityGroupIds: The IDs of the VPC security groups that you specified when you created the Resolver endpoint.    Status: The status of the Resolver endpoint. If you specify Status for Name, specify one of the following status codes for Values: CREATING, OPERATIONAL, UPDATING, AUTO_RECOVERING, ACTION_NEEDED, or DELETING. For more information, see Status in ResolverEndpoint.    ListResolverRules  Valid values for Name include the following:    CreatorRequestId: The value that you specified when you created the Resolver rule.    DomainName: The domain name for which Resolver is forwarding DNS queries to your network. In the value that you specify for Values, include a trailing dot (.) after the domain name. For example, if the domain name is example.com, specify the following value. Note the "." after com:  example.com.     Name: The name of the Resolver rule.    ResolverEndpointId: The ID of the Resolver endpoint that the Resolver rule is associated with.  You can filter on the Resolver endpoint only for rules that have a value of FORWARD for RuleType.     Status: The status of the Resolver rule. If you specify Status for Name, specify one of the following status codes for Values: COMPLETE, DELETING, UPDATING, or FAILED.    Type: The type of the Resolver rule. If you specify TYPE for Name, specify FORWARD or SYSTEM for Values.    ListResolverRuleAssociations  Valid values for Name include the following:    Name: The name of the Resolver rule association.    ResolverRuleId: The ID of the Resolver rule that is associated with one or more VPCs.    Status: The status of the Resolver rule association. If you specify Status for Name, specify one of the following status codes for Values: CREATING, COMPLETE, DELETING, or FAILED.    VPCId: The ID of the VPC that the Resolver rule is associated with.    ListResolverQueryLogConfigs  Valid values for Name include the following:    Arn: The ARN for the query logging configuration.    AssociationCount: The number of VPCs that are associated with the query logging configuration.    CreationTime: The date and time that the query logging configuration was created, in Unix time format and Coordinated Universal Time (UTC).     CreatorRequestId: A unique string that identifies the request that created the query logging configuration.    Destination: The Amazon Web Services service that you want to forward query logs to. Valid values include the following:    S3     CloudWatchLogs     KinesisFirehose       DestinationArn: The ARN of the location that Resolver is sending query logs to. This value can be the ARN for an S3 bucket, a CloudWatch Logs log group, or a Kinesis Data Firehose delivery stream.    Id: The ID of the query logging configuration    Name: The name of the query logging configuration    OwnerId: The Amazon Web Services account ID for the account that created the query logging configuration.    ShareStatus: An indication of whether the query logging configuration is shared with other Amazon Web Services accounts, or was shared with the current account by another Amazon Web Services account. Valid values include: NOT_SHARED, SHARED_WITH_ME, or SHARED_BY_ME.    Status: The status of the query logging configuration. If you specify Status for Name, specify the applicable status code for Values: CREATING, CREATED, DELETING, or FAILED. For more information, see Status.     ListResolverQueryLogConfigAssociations  Valid values for Name include the following:    CreationTime: The date and time that the VPC was associated with the query logging configuration, in Unix time format and Coordinated Universal Time (UTC).    Error: If the value of Status is FAILED, specify the cause: DESTINATION_NOT_FOUND or ACCESS_DENIED.    Id: The ID of the query logging association.    ResolverQueryLogConfigId: The ID of the query logging configuration that a VPC is associated with.    ResourceId: The ID of the Amazon VPC that is associated with the query logging configuration.    Status: The status of the query logging association. If you specify Status for Name, specify the applicable status code for Values: CREATING, CREATED, DELETING, or FAILED. For more information, see Status.   
    */
  var Name: js.UndefOr[FilterName] = js.undefined
  
  /**
    * When you're using a List operation and you want the operation to return a subset of objects, such as Resolver endpoints or Resolver rules, the value of the parameter that you want to use to filter objects. For example, to list only inbound Resolver endpoints, specify Direction for Name and specify INBOUND for Values.
    */
  var Values: js.UndefOr[FilterValues] = js.undefined
}
object Filter {
  
  inline def apply(): Filter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filter]
  }
  
  extension [Self <: Filter](x: Self) {
    
    inline def setName(value: FilterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setValues(value: FilterValues): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    inline def setValuesVarargs(value: FilterValue*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
