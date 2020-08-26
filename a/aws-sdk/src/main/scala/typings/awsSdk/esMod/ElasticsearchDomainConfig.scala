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
  def apply(): ElasticsearchDomainConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElasticsearchDomainConfig]
  }
  @scala.inline
  implicit class ElasticsearchDomainConfigOps[Self <: ElasticsearchDomainConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccessPolicies(value: AccessPoliciesStatus): Self = this.set("AccessPolicies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessPolicies: Self = this.set("AccessPolicies", js.undefined)
    @scala.inline
    def setAdvancedOptions(value: AdvancedOptionsStatus): Self = this.set("AdvancedOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvancedOptions: Self = this.set("AdvancedOptions", js.undefined)
    @scala.inline
    def setAdvancedSecurityOptions(value: AdvancedSecurityOptionsStatus): Self = this.set("AdvancedSecurityOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvancedSecurityOptions: Self = this.set("AdvancedSecurityOptions", js.undefined)
    @scala.inline
    def setCognitoOptions(value: CognitoOptionsStatus): Self = this.set("CognitoOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCognitoOptions: Self = this.set("CognitoOptions", js.undefined)
    @scala.inline
    def setDomainEndpointOptions(value: DomainEndpointOptionsStatus): Self = this.set("DomainEndpointOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainEndpointOptions: Self = this.set("DomainEndpointOptions", js.undefined)
    @scala.inline
    def setEBSOptions(value: EBSOptionsStatus): Self = this.set("EBSOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEBSOptions: Self = this.set("EBSOptions", js.undefined)
    @scala.inline
    def setElasticsearchClusterConfig(value: ElasticsearchClusterConfigStatus): Self = this.set("ElasticsearchClusterConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElasticsearchClusterConfig: Self = this.set("ElasticsearchClusterConfig", js.undefined)
    @scala.inline
    def setElasticsearchVersion(value: ElasticsearchVersionStatus): Self = this.set("ElasticsearchVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElasticsearchVersion: Self = this.set("ElasticsearchVersion", js.undefined)
    @scala.inline
    def setEncryptionAtRestOptions(value: EncryptionAtRestOptionsStatus): Self = this.set("EncryptionAtRestOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptionAtRestOptions: Self = this.set("EncryptionAtRestOptions", js.undefined)
    @scala.inline
    def setLogPublishingOptions(value: LogPublishingOptionsStatus): Self = this.set("LogPublishingOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogPublishingOptions: Self = this.set("LogPublishingOptions", js.undefined)
    @scala.inline
    def setNodeToNodeEncryptionOptions(value: NodeToNodeEncryptionOptionsStatus): Self = this.set("NodeToNodeEncryptionOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeToNodeEncryptionOptions: Self = this.set("NodeToNodeEncryptionOptions", js.undefined)
    @scala.inline
    def setSnapshotOptions(value: SnapshotOptionsStatus): Self = this.set("SnapshotOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotOptions: Self = this.set("SnapshotOptions", js.undefined)
    @scala.inline
    def setVPCOptions(value: VPCDerivedInfoStatus): Self = this.set("VPCOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVPCOptions: Self = this.set("VPCOptions", js.undefined)
  }
  
}

