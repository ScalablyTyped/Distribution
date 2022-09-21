package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SimulateCustomPolicyRequest extends StObject {
  
  /**
    * A list of names of API operations to evaluate in the simulation. Each operation is evaluated against each resource. Each operation must include the service identifier, such as iam:CreateUser. This operation does not support using wildcards (*) in an action name.
    */
  var ActionNames: ActionNameListType
  
  /**
    * The ARN of the IAM user that you want to use as the simulated caller of the API operations. CallerArn is required if you include a ResourcePolicy so that the policy's Principal element has a value to use in evaluating the policy. You can specify only the ARN of an IAM user. You cannot specify the ARN of an assumed role, federated user, or a service principal.
    */
  var CallerArn: js.UndefOr[ResourceNameType] = js.undefined
  
  /**
    * A list of context keys and corresponding values for the simulation to use. Whenever a context key is evaluated in one of the simulated IAM permissions policies, the corresponding value is supplied.
    */
  var ContextEntries: js.UndefOr[ContextEntryListType] = js.undefined
  
  /**
    * Use this parameter only when paginating results and only after you receive a response indicating that the results are truncated. Set it to the value of the Marker element in the response that you received to indicate where the next call should start.
    */
  var Marker: js.UndefOr[markerType] = js.undefined
  
  /**
    * Use this only when paginating results to indicate the maximum number of items you want in the response. If additional items exist beyond the maximum you specify, the IsTruncated response element is true. If you do not include this parameter, the number of items defaults to 100. Note that IAM might return fewer results, even when there are more results available. In that case, the IsTruncated response element returns true, and Marker contains a value to include in the subsequent call that tells the service where to continue from.
    */
  var MaxItems: js.UndefOr[maxItemsType] = js.undefined
  
  /**
    * The IAM permissions boundary policy to simulate. The permissions boundary sets the maximum permissions that an IAM entity can have. You can input only one permissions boundary when you pass a policy to this operation. For more information about permissions boundaries, see Permissions boundaries for IAM entities in the IAM User Guide. The policy input is specified as a string that contains the complete, valid JSON text of a permissions boundary policy. The maximum length of the policy document that you can pass in this operation, including whitespace, is listed below. To view the maximum character counts of a managed policy with no whitespaces, see IAM and STS character quotas. The regex pattern used to validate this parameter is a string of characters consisting of the following:   Any printable ASCII character ranging from the space character (\\u0020) through the end of the ASCII character range   The printable characters in the Basic Latin and Latin-1 Supplement character set (through \\u00FF)   The special characters tab (\\u0009), line feed (\\u000A), and carriage return (\\u000D)  
    */
  var PermissionsBoundaryPolicyInputList: js.UndefOr[SimulationPolicyListType] = js.undefined
  
  /**
    * A list of policy documents to include in the simulation. Each document is specified as a string containing the complete, valid JSON text of an IAM policy. Do not include any resource-based policies in this parameter. Any resource-based policy must be submitted with the ResourcePolicy parameter. The policies cannot be "scope-down" policies, such as you could include in a call to GetFederationToken or one of the AssumeRole API operations. In other words, do not use policies designed to restrict what a user can do while using the temporary credentials. The maximum length of the policy document that you can pass in this operation, including whitespace, is listed below. To view the maximum character counts of a managed policy with no whitespaces, see IAM and STS character quotas. The regex pattern used to validate this parameter is a string of characters consisting of the following:   Any printable ASCII character ranging from the space character (\\u0020) through the end of the ASCII character range   The printable characters in the Basic Latin and Latin-1 Supplement character set (through \\u00FF)   The special characters tab (\\u0009), line feed (\\u000A), and carriage return (\\u000D)  
    */
  var PolicyInputList: SimulationPolicyListType
  
  /**
    * A list of ARNs of Amazon Web Services resources to include in the simulation. If this parameter is not provided, then the value defaults to * (all resources). Each API in the ActionNames parameter is evaluated for each resource in this list. The simulation determines the access result (allowed or denied) of each combination and reports it in the response. You can simulate resources that don't exist in your account. The simulation does not automatically retrieve policies for the specified resources. If you want to include a resource policy in the simulation, then you must include the policy as a string in the ResourcePolicy parameter. If you include a ResourcePolicy, then it must be applicable to all of the resources included in the simulation or you receive an invalid input error. For more information about ARNs, see Amazon Resource Names (ARNs) in the Amazon Web Services General Reference.
    */
  var ResourceArns: js.UndefOr[ResourceNameListType] = js.undefined
  
  /**
    * Specifies the type of simulation to run. Different API operations that support resource-based policies require different combinations of resources. By specifying the type of simulation to run, you enable the policy simulator to enforce the presence of the required resources to ensure reliable simulation results. If your simulation does not match one of the following scenarios, then you can omit this parameter. The following list shows each of the supported scenario values and the resources that you must define to run the simulation. Each of the EC2 scenarios requires that you specify instance, image, and security group resources. If your scenario includes an EBS volume, then you must specify that volume as a resource. If the EC2 scenario includes VPC, then you must supply the network interface resource. If it includes an IP subnet, then you must specify the subnet resource. For more information on the EC2 scenario options, see Supported platforms in the Amazon EC2 User Guide.    EC2-VPC-InstanceStore  instance, image, security group, network interface    EC2-VPC-InstanceStore-Subnet  instance, image, security group, network interface, subnet    EC2-VPC-EBS  instance, image, security group, network interface, volume    EC2-VPC-EBS-Subnet  instance, image, security group, network interface, subnet, volume  
    */
  var ResourceHandlingOption: js.UndefOr[ResourceHandlingOptionType] = js.undefined
  
  /**
    * An ARN representing the Amazon Web Services account ID that specifies the owner of any simulated resource that does not identify its owner in the resource ARN. Examples of resource ARNs include an S3 bucket or object. If ResourceOwner is specified, it is also used as the account owner of any ResourcePolicy included in the simulation. If the ResourceOwner parameter is not specified, then the owner of the resources and the resource policy defaults to the account of the identity provided in CallerArn. This parameter is required only if you specify a resource-based policy and account that owns the resource is different from the account that owns the simulated calling user CallerArn. The ARN for an account uses the following syntax: arn:aws:iam::AWS-account-ID:root. For example, to represent the account with the 112233445566 ID, use the following ARN: arn:aws:iam::112233445566-ID:root. 
    */
  var ResourceOwner: js.UndefOr[ResourceNameType] = js.undefined
  
  /**
    * A resource-based policy to include in the simulation provided as a string. Each resource in the simulation is treated as if it had this policy attached. You can include only one resource-based policy in a simulation. The maximum length of the policy document that you can pass in this operation, including whitespace, is listed below. To view the maximum character counts of a managed policy with no whitespaces, see IAM and STS character quotas. The regex pattern used to validate this parameter is a string of characters consisting of the following:   Any printable ASCII character ranging from the space character (\\u0020) through the end of the ASCII character range   The printable characters in the Basic Latin and Latin-1 Supplement character set (through \\u00FF)   The special characters tab (\\u0009), line feed (\\u000A), and carriage return (\\u000D)  
    */
  var ResourcePolicy: js.UndefOr[policyDocumentType] = js.undefined
}
object SimulateCustomPolicyRequest {
  
  inline def apply(ActionNames: ActionNameListType, PolicyInputList: SimulationPolicyListType): SimulateCustomPolicyRequest = {
    val __obj = js.Dynamic.literal(ActionNames = ActionNames.asInstanceOf[js.Any], PolicyInputList = PolicyInputList.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimulateCustomPolicyRequest]
  }
  
  extension [Self <: SimulateCustomPolicyRequest](x: Self) {
    
    inline def setActionNames(value: ActionNameListType): Self = StObject.set(x, "ActionNames", value.asInstanceOf[js.Any])
    
    inline def setActionNamesVarargs(value: ActionNameType*): Self = StObject.set(x, "ActionNames", js.Array(value*))
    
    inline def setCallerArn(value: ResourceNameType): Self = StObject.set(x, "CallerArn", value.asInstanceOf[js.Any])
    
    inline def setCallerArnUndefined: Self = StObject.set(x, "CallerArn", js.undefined)
    
    inline def setContextEntries(value: ContextEntryListType): Self = StObject.set(x, "ContextEntries", value.asInstanceOf[js.Any])
    
    inline def setContextEntriesUndefined: Self = StObject.set(x, "ContextEntries", js.undefined)
    
    inline def setContextEntriesVarargs(value: ContextEntry*): Self = StObject.set(x, "ContextEntries", js.Array(value*))
    
    inline def setMarker(value: markerType): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxItems(value: maxItemsType): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    inline def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
    
    inline def setPermissionsBoundaryPolicyInputList(value: SimulationPolicyListType): Self = StObject.set(x, "PermissionsBoundaryPolicyInputList", value.asInstanceOf[js.Any])
    
    inline def setPermissionsBoundaryPolicyInputListUndefined: Self = StObject.set(x, "PermissionsBoundaryPolicyInputList", js.undefined)
    
    inline def setPermissionsBoundaryPolicyInputListVarargs(value: policyDocumentType*): Self = StObject.set(x, "PermissionsBoundaryPolicyInputList", js.Array(value*))
    
    inline def setPolicyInputList(value: SimulationPolicyListType): Self = StObject.set(x, "PolicyInputList", value.asInstanceOf[js.Any])
    
    inline def setPolicyInputListVarargs(value: policyDocumentType*): Self = StObject.set(x, "PolicyInputList", js.Array(value*))
    
    inline def setResourceArns(value: ResourceNameListType): Self = StObject.set(x, "ResourceArns", value.asInstanceOf[js.Any])
    
    inline def setResourceArnsUndefined: Self = StObject.set(x, "ResourceArns", js.undefined)
    
    inline def setResourceArnsVarargs(value: ResourceNameType*): Self = StObject.set(x, "ResourceArns", js.Array(value*))
    
    inline def setResourceHandlingOption(value: ResourceHandlingOptionType): Self = StObject.set(x, "ResourceHandlingOption", value.asInstanceOf[js.Any])
    
    inline def setResourceHandlingOptionUndefined: Self = StObject.set(x, "ResourceHandlingOption", js.undefined)
    
    inline def setResourceOwner(value: ResourceNameType): Self = StObject.set(x, "ResourceOwner", value.asInstanceOf[js.Any])
    
    inline def setResourceOwnerUndefined: Self = StObject.set(x, "ResourceOwner", js.undefined)
    
    inline def setResourcePolicy(value: policyDocumentType): Self = StObject.set(x, "ResourcePolicy", value.asInstanceOf[js.Any])
    
    inline def setResourcePolicyUndefined: Self = StObject.set(x, "ResourcePolicy", js.undefined)
  }
}
