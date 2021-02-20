package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElasticsearchDomainConfig extends StObject {
  
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
  implicit class ElasticsearchDomainConfigMutableBuilder[Self <: ElasticsearchDomainConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessPolicies(value: AccessPoliciesStatus): Self = StObject.set(x, "AccessPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessPoliciesUndefined: Self = StObject.set(x, "AccessPolicies", js.undefined)
    
    @scala.inline
    def setAdvancedOptions(value: AdvancedOptionsStatus): Self = StObject.set(x, "AdvancedOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvancedOptionsUndefined: Self = StObject.set(x, "AdvancedOptions", js.undefined)
    
    @scala.inline
    def setAdvancedSecurityOptions(value: AdvancedSecurityOptionsStatus): Self = StObject.set(x, "AdvancedSecurityOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvancedSecurityOptionsUndefined: Self = StObject.set(x, "AdvancedSecurityOptions", js.undefined)
    
    @scala.inline
    def setCognitoOptions(value: CognitoOptionsStatus): Self = StObject.set(x, "CognitoOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCognitoOptionsUndefined: Self = StObject.set(x, "CognitoOptions", js.undefined)
    
    @scala.inline
    def setDomainEndpointOptions(value: DomainEndpointOptionsStatus): Self = StObject.set(x, "DomainEndpointOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainEndpointOptionsUndefined: Self = StObject.set(x, "DomainEndpointOptions", js.undefined)
    
    @scala.inline
    def setEBSOptions(value: EBSOptionsStatus): Self = StObject.set(x, "EBSOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEBSOptionsUndefined: Self = StObject.set(x, "EBSOptions", js.undefined)
    
    @scala.inline
    def setElasticsearchClusterConfig(value: ElasticsearchClusterConfigStatus): Self = StObject.set(x, "ElasticsearchClusterConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElasticsearchClusterConfigUndefined: Self = StObject.set(x, "ElasticsearchClusterConfig", js.undefined)
    
    @scala.inline
    def setElasticsearchVersion(value: ElasticsearchVersionStatus): Self = StObject.set(x, "ElasticsearchVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElasticsearchVersionUndefined: Self = StObject.set(x, "ElasticsearchVersion", js.undefined)
    
    @scala.inline
    def setEncryptionAtRestOptions(value: EncryptionAtRestOptionsStatus): Self = StObject.set(x, "EncryptionAtRestOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionAtRestOptionsUndefined: Self = StObject.set(x, "EncryptionAtRestOptions", js.undefined)
    
    @scala.inline
    def setLogPublishingOptions(value: LogPublishingOptionsStatus): Self = StObject.set(x, "LogPublishingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogPublishingOptionsUndefined: Self = StObject.set(x, "LogPublishingOptions", js.undefined)
    
    @scala.inline
    def setNodeToNodeEncryptionOptions(value: NodeToNodeEncryptionOptionsStatus): Self = StObject.set(x, "NodeToNodeEncryptionOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeToNodeEncryptionOptionsUndefined: Self = StObject.set(x, "NodeToNodeEncryptionOptions", js.undefined)
    
    @scala.inline
    def setSnapshotOptions(value: SnapshotOptionsStatus): Self = StObject.set(x, "SnapshotOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotOptionsUndefined: Self = StObject.set(x, "SnapshotOptions", js.undefined)
    
    @scala.inline
    def setVPCOptions(value: VPCDerivedInfoStatus): Self = StObject.set(x, "VPCOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVPCOptionsUndefined: Self = StObject.set(x, "VPCOptions", js.undefined)
  }
}
