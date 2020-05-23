package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElasticsearchDomainStatus extends js.Object {
  /**
    * The Amazon resource name (ARN) of an Elasticsearch domain. See Identifiers for IAM Entities in Using AWS Identity and Access Management for more information.
    */
  var ARN: typings.awsSdk.esMod.ARN = js.native
  /**
    *  IAM access policy as a JSON-formatted string.
    */
  var AccessPolicies: js.UndefOr[PolicyDocument] = js.native
  /**
    * Specifies the status of the AdvancedOptions
    */
  var AdvancedOptions: js.UndefOr[typings.awsSdk.esMod.AdvancedOptions] = js.native
  /**
    * The current status of the Elasticsearch domain's advanced security options.
    */
  var AdvancedSecurityOptions: js.UndefOr[typings.awsSdk.esMod.AdvancedSecurityOptions] = js.native
  /**
    * The CognitoOptions for the specified domain. For more information, see Amazon Cognito Authentication for Kibana.
    */
  var CognitoOptions: js.UndefOr[typings.awsSdk.esMod.CognitoOptions] = js.native
  /**
    * The domain creation status. True if the creation of an Elasticsearch domain is complete. False if domain creation is still in progress.
    */
  var Created: js.UndefOr[Boolean] = js.native
  /**
    * The domain deletion status. True if a delete request has been received for the domain but resource cleanup is still in progress. False if the domain has not been deleted. Once domain deletion is complete, the status of the domain is no longer returned.
    */
  var Deleted: js.UndefOr[Boolean] = js.native
  /**
    * The current status of the Elasticsearch domain's endpoint options.
    */
  var DomainEndpointOptions: js.UndefOr[typings.awsSdk.esMod.DomainEndpointOptions] = js.native
  /**
    * The unique identifier for the specified Elasticsearch domain.
    */
  var DomainId: typings.awsSdk.esMod.DomainId = js.native
  /**
    * The name of an Elasticsearch domain. Domain names are unique across the domains owned by an account within an AWS region. Domain names start with a letter or number and can contain the following characters: a-z (lowercase), 0-9, and - (hyphen).
    */
  var DomainName: typings.awsSdk.esMod.DomainName = js.native
  /**
    * The EBSOptions for the specified domain. See Configuring EBS-based Storage for more information.
    */
  var EBSOptions: js.UndefOr[typings.awsSdk.esMod.EBSOptions] = js.native
  /**
    * The type and number of instances in the domain cluster.
    */
  var ElasticsearchClusterConfig: typings.awsSdk.esMod.ElasticsearchClusterConfig = js.native
  var ElasticsearchVersion: js.UndefOr[ElasticsearchVersionString] = js.native
  /**
    *  Specifies the status of the EncryptionAtRestOptions.
    */
  var EncryptionAtRestOptions: js.UndefOr[typings.awsSdk.esMod.EncryptionAtRestOptions] = js.native
  /**
    * The Elasticsearch domain endpoint that you use to submit index and search requests.
    */
  var Endpoint: js.UndefOr[ServiceUrl] = js.native
  /**
    * Map containing the Elasticsearch domain endpoints used to submit index and search requests. Example key, value: 'vpc','vpc-endpoint-h2dsd34efgyghrtguk5gt6j2foh4.us-east-1.es.amazonaws.com'.
    */
  var Endpoints: js.UndefOr[EndpointsMap] = js.native
  /**
    * Log publishing options for the given domain.
    */
  var LogPublishingOptions: js.UndefOr[typings.awsSdk.esMod.LogPublishingOptions] = js.native
  /**
    * Specifies the status of the NodeToNodeEncryptionOptions.
    */
  var NodeToNodeEncryptionOptions: js.UndefOr[typings.awsSdk.esMod.NodeToNodeEncryptionOptions] = js.native
  /**
    * The status of the Elasticsearch domain configuration. True if Amazon Elasticsearch Service is processing configuration changes. False if the configuration is active.
    */
  var Processing: js.UndefOr[Boolean] = js.native
  /**
    * The current status of the Elasticsearch domain's service software.
    */
  var ServiceSoftwareOptions: js.UndefOr[typings.awsSdk.esMod.ServiceSoftwareOptions] = js.native
  /**
    * Specifies the status of the SnapshotOptions
    */
  var SnapshotOptions: js.UndefOr[typings.awsSdk.esMod.SnapshotOptions] = js.native
  /**
    * The status of an Elasticsearch domain version upgrade. True if Amazon Elasticsearch Service is undergoing a version upgrade. False if the configuration is active.
    */
  var UpgradeProcessing: js.UndefOr[Boolean] = js.native
  /**
    * The VPCOptions for the specified domain. For more information, see VPC Endpoints for Amazon Elasticsearch Service Domains.
    */
  var VPCOptions: js.UndefOr[VPCDerivedInfo] = js.native
}

object ElasticsearchDomainStatus {
  @scala.inline
  def apply(
    ARN: ARN,
    DomainId: DomainId,
    DomainName: DomainName,
    ElasticsearchClusterConfig: ElasticsearchClusterConfig,
    AccessPolicies: PolicyDocument = null,
    AdvancedOptions: AdvancedOptions = null,
    AdvancedSecurityOptions: AdvancedSecurityOptions = null,
    CognitoOptions: CognitoOptions = null,
    Created: js.UndefOr[Boolean] = js.undefined,
    Deleted: js.UndefOr[Boolean] = js.undefined,
    DomainEndpointOptions: DomainEndpointOptions = null,
    EBSOptions: EBSOptions = null,
    ElasticsearchVersion: ElasticsearchVersionString = null,
    EncryptionAtRestOptions: EncryptionAtRestOptions = null,
    Endpoint: ServiceUrl = null,
    Endpoints: EndpointsMap = null,
    LogPublishingOptions: LogPublishingOptions = null,
    NodeToNodeEncryptionOptions: NodeToNodeEncryptionOptions = null,
    Processing: js.UndefOr[Boolean] = js.undefined,
    ServiceSoftwareOptions: ServiceSoftwareOptions = null,
    SnapshotOptions: SnapshotOptions = null,
    UpgradeProcessing: js.UndefOr[Boolean] = js.undefined,
    VPCOptions: VPCDerivedInfo = null
  ): ElasticsearchDomainStatus = {
    val __obj = js.Dynamic.literal(ARN = ARN.asInstanceOf[js.Any], DomainId = DomainId.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], ElasticsearchClusterConfig = ElasticsearchClusterConfig.asInstanceOf[js.Any])
    if (AccessPolicies != null) __obj.updateDynamic("AccessPolicies")(AccessPolicies.asInstanceOf[js.Any])
    if (AdvancedOptions != null) __obj.updateDynamic("AdvancedOptions")(AdvancedOptions.asInstanceOf[js.Any])
    if (AdvancedSecurityOptions != null) __obj.updateDynamic("AdvancedSecurityOptions")(AdvancedSecurityOptions.asInstanceOf[js.Any])
    if (CognitoOptions != null) __obj.updateDynamic("CognitoOptions")(CognitoOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(Created)) __obj.updateDynamic("Created")(Created.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Deleted)) __obj.updateDynamic("Deleted")(Deleted.get.asInstanceOf[js.Any])
    if (DomainEndpointOptions != null) __obj.updateDynamic("DomainEndpointOptions")(DomainEndpointOptions.asInstanceOf[js.Any])
    if (EBSOptions != null) __obj.updateDynamic("EBSOptions")(EBSOptions.asInstanceOf[js.Any])
    if (ElasticsearchVersion != null) __obj.updateDynamic("ElasticsearchVersion")(ElasticsearchVersion.asInstanceOf[js.Any])
    if (EncryptionAtRestOptions != null) __obj.updateDynamic("EncryptionAtRestOptions")(EncryptionAtRestOptions.asInstanceOf[js.Any])
    if (Endpoint != null) __obj.updateDynamic("Endpoint")(Endpoint.asInstanceOf[js.Any])
    if (Endpoints != null) __obj.updateDynamic("Endpoints")(Endpoints.asInstanceOf[js.Any])
    if (LogPublishingOptions != null) __obj.updateDynamic("LogPublishingOptions")(LogPublishingOptions.asInstanceOf[js.Any])
    if (NodeToNodeEncryptionOptions != null) __obj.updateDynamic("NodeToNodeEncryptionOptions")(NodeToNodeEncryptionOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(Processing)) __obj.updateDynamic("Processing")(Processing.get.asInstanceOf[js.Any])
    if (ServiceSoftwareOptions != null) __obj.updateDynamic("ServiceSoftwareOptions")(ServiceSoftwareOptions.asInstanceOf[js.Any])
    if (SnapshotOptions != null) __obj.updateDynamic("SnapshotOptions")(SnapshotOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(UpgradeProcessing)) __obj.updateDynamic("UpgradeProcessing")(UpgradeProcessing.get.asInstanceOf[js.Any])
    if (VPCOptions != null) __obj.updateDynamic("VPCOptions")(VPCOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElasticsearchDomainStatus]
  }
}

