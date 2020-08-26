package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateElasticsearchDomainRequest extends js.Object {
  /**
    *  IAM access policy as a JSON-formatted string.
    */
  var AccessPolicies: js.UndefOr[PolicyDocument] = js.native
  /**
    *  Option to allow references to indices in an HTTP request body. Must be false when configuring access to individual sub-resources. By default, the value is true. See Configuration Advanced Options for more information.
    */
  var AdvancedOptions: js.UndefOr[typings.awsSdk.esMod.AdvancedOptions] = js.native
  /**
    * Specifies advanced security options.
    */
  var AdvancedSecurityOptions: js.UndefOr[AdvancedSecurityOptionsInput] = js.native
  /**
    * Options to specify the Cognito user and identity pools for Kibana authentication. For more information, see Amazon Cognito Authentication for Kibana.
    */
  var CognitoOptions: js.UndefOr[typings.awsSdk.esMod.CognitoOptions] = js.native
  /**
    * Options to specify configuration that will be applied to the domain endpoint.
    */
  var DomainEndpointOptions: js.UndefOr[typings.awsSdk.esMod.DomainEndpointOptions] = js.native
  /**
    * The name of the Elasticsearch domain that you are creating. Domain names are unique across the domains owned by an account within an AWS region. Domain names must start with a lowercase letter and can contain the following characters: a-z (lowercase), 0-9, and - (hyphen).
    */
  var DomainName: typings.awsSdk.esMod.DomainName = js.native
  /**
    * Options to enable, disable and specify the type and size of EBS storage volumes. 
    */
  var EBSOptions: js.UndefOr[typings.awsSdk.esMod.EBSOptions] = js.native
  /**
    * Configuration options for an Elasticsearch domain. Specifies the instance type and number of instances in the domain cluster. 
    */
  var ElasticsearchClusterConfig: js.UndefOr[typings.awsSdk.esMod.ElasticsearchClusterConfig] = js.native
  /**
    * String of format X.Y to specify version for the Elasticsearch domain eg. "1.5" or "2.3". For more information, see Creating Elasticsearch Domains in the Amazon Elasticsearch Service Developer Guide.
    */
  var ElasticsearchVersion: js.UndefOr[ElasticsearchVersionString] = js.native
  /**
    * Specifies the Encryption At Rest Options.
    */
  var EncryptionAtRestOptions: js.UndefOr[typings.awsSdk.esMod.EncryptionAtRestOptions] = js.native
  /**
    * Map of LogType and LogPublishingOption, each containing options to publish a given type of Elasticsearch log.
    */
  var LogPublishingOptions: js.UndefOr[typings.awsSdk.esMod.LogPublishingOptions] = js.native
  /**
    * Specifies the NodeToNodeEncryptionOptions.
    */
  var NodeToNodeEncryptionOptions: js.UndefOr[typings.awsSdk.esMod.NodeToNodeEncryptionOptions] = js.native
  /**
    * Option to set time, in UTC format, of the daily automated snapshot. Default value is 0 hours. 
    */
  var SnapshotOptions: js.UndefOr[typings.awsSdk.esMod.SnapshotOptions] = js.native
  /**
    * Options to specify the subnets and security groups for VPC endpoint. For more information, see Creating a VPC in VPC Endpoints for Amazon Elasticsearch Service Domains
    */
  var VPCOptions: js.UndefOr[typings.awsSdk.esMod.VPCOptions] = js.native
}

object CreateElasticsearchDomainRequest {
  @scala.inline
  def apply(DomainName: DomainName): CreateElasticsearchDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateElasticsearchDomainRequest]
  }
  @scala.inline
  implicit class CreateElasticsearchDomainRequestOps[Self <: CreateElasticsearchDomainRequest] (val x: Self) extends AnyVal {
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
    def setDomainName(value: DomainName): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessPolicies(value: PolicyDocument): Self = this.set("AccessPolicies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessPolicies: Self = this.set("AccessPolicies", js.undefined)
    @scala.inline
    def setAdvancedOptions(value: AdvancedOptions): Self = this.set("AdvancedOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvancedOptions: Self = this.set("AdvancedOptions", js.undefined)
    @scala.inline
    def setAdvancedSecurityOptions(value: AdvancedSecurityOptionsInput): Self = this.set("AdvancedSecurityOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvancedSecurityOptions: Self = this.set("AdvancedSecurityOptions", js.undefined)
    @scala.inline
    def setCognitoOptions(value: CognitoOptions): Self = this.set("CognitoOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCognitoOptions: Self = this.set("CognitoOptions", js.undefined)
    @scala.inline
    def setDomainEndpointOptions(value: DomainEndpointOptions): Self = this.set("DomainEndpointOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainEndpointOptions: Self = this.set("DomainEndpointOptions", js.undefined)
    @scala.inline
    def setEBSOptions(value: EBSOptions): Self = this.set("EBSOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEBSOptions: Self = this.set("EBSOptions", js.undefined)
    @scala.inline
    def setElasticsearchClusterConfig(value: ElasticsearchClusterConfig): Self = this.set("ElasticsearchClusterConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElasticsearchClusterConfig: Self = this.set("ElasticsearchClusterConfig", js.undefined)
    @scala.inline
    def setElasticsearchVersion(value: ElasticsearchVersionString): Self = this.set("ElasticsearchVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElasticsearchVersion: Self = this.set("ElasticsearchVersion", js.undefined)
    @scala.inline
    def setEncryptionAtRestOptions(value: EncryptionAtRestOptions): Self = this.set("EncryptionAtRestOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptionAtRestOptions: Self = this.set("EncryptionAtRestOptions", js.undefined)
    @scala.inline
    def setLogPublishingOptions(value: LogPublishingOptions): Self = this.set("LogPublishingOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogPublishingOptions: Self = this.set("LogPublishingOptions", js.undefined)
    @scala.inline
    def setNodeToNodeEncryptionOptions(value: NodeToNodeEncryptionOptions): Self = this.set("NodeToNodeEncryptionOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeToNodeEncryptionOptions: Self = this.set("NodeToNodeEncryptionOptions", js.undefined)
    @scala.inline
    def setSnapshotOptions(value: SnapshotOptions): Self = this.set("SnapshotOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotOptions: Self = this.set("SnapshotOptions", js.undefined)
    @scala.inline
    def setVPCOptions(value: VPCOptions): Self = this.set("VPCOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVPCOptions: Self = this.set("VPCOptions", js.undefined)
  }
  
}

