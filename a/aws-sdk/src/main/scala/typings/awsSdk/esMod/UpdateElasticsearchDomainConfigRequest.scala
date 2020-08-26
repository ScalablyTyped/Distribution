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
  def apply(DomainName: DomainName): UpdateElasticsearchDomainConfigRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateElasticsearchDomainConfigRequest]
  }
  @scala.inline
  implicit class UpdateElasticsearchDomainConfigRequestOps[Self <: UpdateElasticsearchDomainConfigRequest] (val x: Self) extends AnyVal {
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
    def setLogPublishingOptions(value: LogPublishingOptions): Self = this.set("LogPublishingOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogPublishingOptions: Self = this.set("LogPublishingOptions", js.undefined)
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

