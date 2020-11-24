package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
    ElasticsearchClusterConfig: ElasticsearchClusterConfig
  ): ElasticsearchDomainStatus = {
    val __obj = js.Dynamic.literal(ARN = ARN.asInstanceOf[js.Any], DomainId = DomainId.asInstanceOf[js.Any], DomainName = DomainName.asInstanceOf[js.Any], ElasticsearchClusterConfig = ElasticsearchClusterConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElasticsearchDomainStatus]
  }
  
  @scala.inline
  implicit class ElasticsearchDomainStatusOps[Self <: ElasticsearchDomainStatus] (val x: Self) extends AnyVal {
    
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
    def setARN(value: ARN): Self = this.set("ARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainId(value: DomainId): Self = this.set("DomainId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainName(value: DomainName): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElasticsearchClusterConfig(value: ElasticsearchClusterConfig): Self = this.set("ElasticsearchClusterConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessPolicies(value: PolicyDocument): Self = this.set("AccessPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessPolicies: Self = this.set("AccessPolicies", js.undefined)
    
    @scala.inline
    def setAdvancedOptions(value: AdvancedOptions): Self = this.set("AdvancedOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvancedOptions: Self = this.set("AdvancedOptions", js.undefined)
    
    @scala.inline
    def setAdvancedSecurityOptions(value: AdvancedSecurityOptions): Self = this.set("AdvancedSecurityOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdvancedSecurityOptions: Self = this.set("AdvancedSecurityOptions", js.undefined)
    
    @scala.inline
    def setCognitoOptions(value: CognitoOptions): Self = this.set("CognitoOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCognitoOptions: Self = this.set("CognitoOptions", js.undefined)
    
    @scala.inline
    def setCreated(value: Boolean): Self = this.set("Created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreated: Self = this.set("Created", js.undefined)
    
    @scala.inline
    def setDeleted(value: Boolean): Self = this.set("Deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleted: Self = this.set("Deleted", js.undefined)
    
    @scala.inline
    def setDomainEndpointOptions(value: DomainEndpointOptions): Self = this.set("DomainEndpointOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainEndpointOptions: Self = this.set("DomainEndpointOptions", js.undefined)
    
    @scala.inline
    def setEBSOptions(value: EBSOptions): Self = this.set("EBSOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEBSOptions: Self = this.set("EBSOptions", js.undefined)
    
    @scala.inline
    def setElasticsearchVersion(value: ElasticsearchVersionString): Self = this.set("ElasticsearchVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElasticsearchVersion: Self = this.set("ElasticsearchVersion", js.undefined)
    
    @scala.inline
    def setEncryptionAtRestOptions(value: EncryptionAtRestOptions): Self = this.set("EncryptionAtRestOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncryptionAtRestOptions: Self = this.set("EncryptionAtRestOptions", js.undefined)
    
    @scala.inline
    def setEndpoint(value: ServiceUrl): Self = this.set("Endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoint: Self = this.set("Endpoint", js.undefined)
    
    @scala.inline
    def setEndpoints(value: EndpointsMap): Self = this.set("Endpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoints: Self = this.set("Endpoints", js.undefined)
    
    @scala.inline
    def setLogPublishingOptions(value: LogPublishingOptions): Self = this.set("LogPublishingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogPublishingOptions: Self = this.set("LogPublishingOptions", js.undefined)
    
    @scala.inline
    def setNodeToNodeEncryptionOptions(value: NodeToNodeEncryptionOptions): Self = this.set("NodeToNodeEncryptionOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeToNodeEncryptionOptions: Self = this.set("NodeToNodeEncryptionOptions", js.undefined)
    
    @scala.inline
    def setProcessing(value: Boolean): Self = this.set("Processing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessing: Self = this.set("Processing", js.undefined)
    
    @scala.inline
    def setServiceSoftwareOptions(value: ServiceSoftwareOptions): Self = this.set("ServiceSoftwareOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceSoftwareOptions: Self = this.set("ServiceSoftwareOptions", js.undefined)
    
    @scala.inline
    def setSnapshotOptions(value: SnapshotOptions): Self = this.set("SnapshotOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSnapshotOptions: Self = this.set("SnapshotOptions", js.undefined)
    
    @scala.inline
    def setUpgradeProcessing(value: Boolean): Self = this.set("UpgradeProcessing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpgradeProcessing: Self = this.set("UpgradeProcessing", js.undefined)
    
    @scala.inline
    def setVPCOptions(value: VPCDerivedInfo): Self = this.set("VPCOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVPCOptions: Self = this.set("VPCOptions", js.undefined)
  }
}
