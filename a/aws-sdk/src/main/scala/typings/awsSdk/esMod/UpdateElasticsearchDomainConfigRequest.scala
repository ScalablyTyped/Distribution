package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateElasticsearchDomainConfigRequest extends js.Object {
  /**
    * IAM access policy as a JSON-formatted string.
    */
  var AccessPolicies: js.UndefOr[PolicyDocument] = js.native
  /**
    * Modifies the advanced option to allow references to indices in an HTTP request body. Must be false when configuring access to individual sub-resources. By default, the value is true. See Configuration Advanced Options for more information.
    */
  var AdvancedOptions: js.UndefOr[typings.awsSdk.esMod.AdvancedOptions] = js.native
  /**
    * Options to specify the Cognito user and identity pools for Kibana authentication. For more information, see Amazon Cognito Authentication for Kibana.
    */
  var CognitoOptions: js.UndefOr[typings.awsSdk.esMod.CognitoOptions] = js.native
  /**
    * Options to specify configuration that will be applied to the domain endpoint.
    */
  var DomainEndpointOptions: js.UndefOr[typings.awsSdk.esMod.DomainEndpointOptions] = js.native
  /**
    * The name of the Elasticsearch domain that you are updating. 
    */
  var DomainName: typings.awsSdk.esMod.DomainName = js.native
  /**
    * Specify the type and size of the EBS volume that you want to use. 
    */
  var EBSOptions: js.UndefOr[typings.awsSdk.esMod.EBSOptions] = js.native
  /**
    * The type and number of instances to instantiate for the domain cluster.
    */
  var ElasticsearchClusterConfig: js.UndefOr[typings.awsSdk.esMod.ElasticsearchClusterConfig] = js.native
  /**
    * Map of LogType and LogPublishingOption, each containing options to publish a given type of Elasticsearch log.
    */
  var LogPublishingOptions: js.UndefOr[typings.awsSdk.esMod.LogPublishingOptions] = js.native
  /**
    * Option to set the time, in UTC format, for the daily automated snapshot. Default value is 0 hours. 
    */
  var SnapshotOptions: js.UndefOr[typings.awsSdk.esMod.SnapshotOptions] = js.native
  /**
    * Options to specify the subnets and security groups for VPC endpoint. For more information, see Creating a VPC in VPC Endpoints for Amazon Elasticsearch Service Domains
    */
  var VPCOptions: js.UndefOr[typings.awsSdk.esMod.VPCOptions] = js.native
}

object UpdateElasticsearchDomainConfigRequest {
  @scala.inline
  def apply(
    DomainName: DomainName,
    AccessPolicies: PolicyDocument = null,
    AdvancedOptions: AdvancedOptions = null,
    CognitoOptions: CognitoOptions = null,
    DomainEndpointOptions: DomainEndpointOptions = null,
    EBSOptions: EBSOptions = null,
    ElasticsearchClusterConfig: ElasticsearchClusterConfig = null,
    LogPublishingOptions: LogPublishingOptions = null,
    SnapshotOptions: SnapshotOptions = null,
    VPCOptions: VPCOptions = null
  ): UpdateElasticsearchDomainConfigRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    if (AccessPolicies != null) __obj.updateDynamic("AccessPolicies")(AccessPolicies.asInstanceOf[js.Any])
    if (AdvancedOptions != null) __obj.updateDynamic("AdvancedOptions")(AdvancedOptions.asInstanceOf[js.Any])
    if (CognitoOptions != null) __obj.updateDynamic("CognitoOptions")(CognitoOptions.asInstanceOf[js.Any])
    if (DomainEndpointOptions != null) __obj.updateDynamic("DomainEndpointOptions")(DomainEndpointOptions.asInstanceOf[js.Any])
    if (EBSOptions != null) __obj.updateDynamic("EBSOptions")(EBSOptions.asInstanceOf[js.Any])
    if (ElasticsearchClusterConfig != null) __obj.updateDynamic("ElasticsearchClusterConfig")(ElasticsearchClusterConfig.asInstanceOf[js.Any])
    if (LogPublishingOptions != null) __obj.updateDynamic("LogPublishingOptions")(LogPublishingOptions.asInstanceOf[js.Any])
    if (SnapshotOptions != null) __obj.updateDynamic("SnapshotOptions")(SnapshotOptions.asInstanceOf[js.Any])
    if (VPCOptions != null) __obj.updateDynamic("VPCOptions")(VPCOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateElasticsearchDomainConfigRequest]
  }
}

