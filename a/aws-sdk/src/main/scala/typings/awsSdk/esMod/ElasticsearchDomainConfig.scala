package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElasticsearchDomainConfig extends js.Object {
  /**
    * IAM access policy as a JSON-formatted string.
    */
  var AccessPolicies: js.UndefOr[AccessPoliciesStatus] = js.native
  /**
    * Specifies the AdvancedOptions for the domain. See Configuring Advanced Options for more information.
    */
  var AdvancedOptions: js.UndefOr[AdvancedOptionsStatus] = js.native
  /**
    * Specifies AdvancedSecurityOptions for the domain. 
    */
  var AdvancedSecurityOptions: js.UndefOr[AdvancedSecurityOptionsStatus] = js.native
  /**
    * The CognitoOptions for the specified domain. For more information, see Amazon Cognito Authentication for Kibana.
    */
  var CognitoOptions: js.UndefOr[CognitoOptionsStatus] = js.native
  /**
    * Specifies the DomainEndpointOptions for the Elasticsearch domain.
    */
  var DomainEndpointOptions: js.UndefOr[DomainEndpointOptionsStatus] = js.native
  /**
    * Specifies the EBSOptions for the Elasticsearch domain.
    */
  var EBSOptions: js.UndefOr[EBSOptionsStatus] = js.native
  /**
    * Specifies the ElasticsearchClusterConfig for the Elasticsearch domain.
    */
  var ElasticsearchClusterConfig: js.UndefOr[ElasticsearchClusterConfigStatus] = js.native
  /**
    * String of format X.Y to specify version for the Elasticsearch domain.
    */
  var ElasticsearchVersion: js.UndefOr[ElasticsearchVersionStatus] = js.native
  /**
    * Specifies the EncryptionAtRestOptions for the Elasticsearch domain.
    */
  var EncryptionAtRestOptions: js.UndefOr[EncryptionAtRestOptionsStatus] = js.native
  /**
    * Log publishing options for the given domain.
    */
  var LogPublishingOptions: js.UndefOr[LogPublishingOptionsStatus] = js.native
  /**
    * Specifies the NodeToNodeEncryptionOptions for the Elasticsearch domain.
    */
  var NodeToNodeEncryptionOptions: js.UndefOr[NodeToNodeEncryptionOptionsStatus] = js.native
  /**
    * Specifies the SnapshotOptions for the Elasticsearch domain.
    */
  var SnapshotOptions: js.UndefOr[SnapshotOptionsStatus] = js.native
  /**
    * The VPCOptions for the specified domain. For more information, see VPC Endpoints for Amazon Elasticsearch Service Domains.
    */
  var VPCOptions: js.UndefOr[VPCDerivedInfoStatus] = js.native
}

object ElasticsearchDomainConfig {
  @scala.inline
  def apply(
    AccessPolicies: AccessPoliciesStatus = null,
    AdvancedOptions: AdvancedOptionsStatus = null,
    AdvancedSecurityOptions: AdvancedSecurityOptionsStatus = null,
    CognitoOptions: CognitoOptionsStatus = null,
    DomainEndpointOptions: DomainEndpointOptionsStatus = null,
    EBSOptions: EBSOptionsStatus = null,
    ElasticsearchClusterConfig: ElasticsearchClusterConfigStatus = null,
    ElasticsearchVersion: ElasticsearchVersionStatus = null,
    EncryptionAtRestOptions: EncryptionAtRestOptionsStatus = null,
    LogPublishingOptions: LogPublishingOptionsStatus = null,
    NodeToNodeEncryptionOptions: NodeToNodeEncryptionOptionsStatus = null,
    SnapshotOptions: SnapshotOptionsStatus = null,
    VPCOptions: VPCDerivedInfoStatus = null
  ): ElasticsearchDomainConfig = {
    val __obj = js.Dynamic.literal()
    if (AccessPolicies != null) __obj.updateDynamic("AccessPolicies")(AccessPolicies.asInstanceOf[js.Any])
    if (AdvancedOptions != null) __obj.updateDynamic("AdvancedOptions")(AdvancedOptions.asInstanceOf[js.Any])
    if (AdvancedSecurityOptions != null) __obj.updateDynamic("AdvancedSecurityOptions")(AdvancedSecurityOptions.asInstanceOf[js.Any])
    if (CognitoOptions != null) __obj.updateDynamic("CognitoOptions")(CognitoOptions.asInstanceOf[js.Any])
    if (DomainEndpointOptions != null) __obj.updateDynamic("DomainEndpointOptions")(DomainEndpointOptions.asInstanceOf[js.Any])
    if (EBSOptions != null) __obj.updateDynamic("EBSOptions")(EBSOptions.asInstanceOf[js.Any])
    if (ElasticsearchClusterConfig != null) __obj.updateDynamic("ElasticsearchClusterConfig")(ElasticsearchClusterConfig.asInstanceOf[js.Any])
    if (ElasticsearchVersion != null) __obj.updateDynamic("ElasticsearchVersion")(ElasticsearchVersion.asInstanceOf[js.Any])
    if (EncryptionAtRestOptions != null) __obj.updateDynamic("EncryptionAtRestOptions")(EncryptionAtRestOptions.asInstanceOf[js.Any])
    if (LogPublishingOptions != null) __obj.updateDynamic("LogPublishingOptions")(LogPublishingOptions.asInstanceOf[js.Any])
    if (NodeToNodeEncryptionOptions != null) __obj.updateDynamic("NodeToNodeEncryptionOptions")(NodeToNodeEncryptionOptions.asInstanceOf[js.Any])
    if (SnapshotOptions != null) __obj.updateDynamic("SnapshotOptions")(SnapshotOptions.asInstanceOf[js.Any])
    if (VPCOptions != null) __obj.updateDynamic("VPCOptions")(VPCOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElasticsearchDomainConfig]
  }
}

