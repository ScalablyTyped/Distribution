package typings.awsSdk.opensearchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainConfig extends StObject {
  
  /**
    * IAM access policy as a JSON-formatted string.
    */
  var AccessPolicies: js.UndefOr[AccessPoliciesStatus] = js.undefined
  
  /**
    * The AdvancedOptions for the domain. See Advanced options  for more information. 
    */
  var AdvancedOptions: js.UndefOr[AdvancedOptionsStatus] = js.undefined
  
  /**
    * Specifies AdvancedSecurityOptions for the domain. 
    */
  var AdvancedSecurityOptions: js.UndefOr[AdvancedSecurityOptionsStatus] = js.undefined
  
  /**
    * Specifies AutoTuneOptions for the domain. 
    */
  var AutoTuneOptions: js.UndefOr[AutoTuneOptionsStatus] = js.undefined
  
  /**
    * Specifies change details of the domain configuration change.
    */
  var ChangeProgressDetails: js.UndefOr[typings.awsSdk.opensearchMod.ChangeProgressDetails] = js.undefined
  
  /**
    * The ClusterConfig for the domain. 
    */
  var ClusterConfig: js.UndefOr[ClusterConfigStatus] = js.undefined
  
  /**
    * The CognitoOptions for the specified domain. For more information, see Configuring Amazon Cognito authentication for OpenSearch Dashboards. 
    */
  var CognitoOptions: js.UndefOr[CognitoOptionsStatus] = js.undefined
  
  /**
    * The DomainEndpointOptions for the domain. 
    */
  var DomainEndpointOptions: js.UndefOr[DomainEndpointOptionsStatus] = js.undefined
  
  /**
    * The EBSOptions for the domain. 
    */
  var EBSOptions: js.UndefOr[EBSOptionsStatus] = js.undefined
  
  /**
    * The EncryptionAtRestOptions for the domain. 
    */
  var EncryptionAtRestOptions: js.UndefOr[EncryptionAtRestOptionsStatus] = js.undefined
  
  /**
    * String of format Elasticsearch_X.Y or OpenSearch_X.Y to specify the engine version for the OpenSearch or Elasticsearch domain.
    */
  var EngineVersion: js.UndefOr[VersionStatus] = js.undefined
  
  /**
    * Log publishing options for the given domain.
    */
  var LogPublishingOptions: js.UndefOr[LogPublishingOptionsStatus] = js.undefined
  
  /**
    * The NodeToNodeEncryptionOptions for the domain. 
    */
  var NodeToNodeEncryptionOptions: js.UndefOr[NodeToNodeEncryptionOptionsStatus] = js.undefined
  
  /**
    * The SnapshotOptions for the domain. 
    */
  var SnapshotOptions: js.UndefOr[SnapshotOptionsStatus] = js.undefined
  
  /**
    * The VPCOptions for the specified domain. For more information, see  Launching your Amazon OpenSearch Service domains using a VPC. 
    */
  var VPCOptions: js.UndefOr[VPCDerivedInfoStatus] = js.undefined
}
object DomainConfig {
  
  inline def apply(): DomainConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainConfig]
  }
  
  extension [Self <: DomainConfig](x: Self) {
    
    inline def setAccessPolicies(value: AccessPoliciesStatus): Self = StObject.set(x, "AccessPolicies", value.asInstanceOf[js.Any])
    
    inline def setAccessPoliciesUndefined: Self = StObject.set(x, "AccessPolicies", js.undefined)
    
    inline def setAdvancedOptions(value: AdvancedOptionsStatus): Self = StObject.set(x, "AdvancedOptions", value.asInstanceOf[js.Any])
    
    inline def setAdvancedOptionsUndefined: Self = StObject.set(x, "AdvancedOptions", js.undefined)
    
    inline def setAdvancedSecurityOptions(value: AdvancedSecurityOptionsStatus): Self = StObject.set(x, "AdvancedSecurityOptions", value.asInstanceOf[js.Any])
    
    inline def setAdvancedSecurityOptionsUndefined: Self = StObject.set(x, "AdvancedSecurityOptions", js.undefined)
    
    inline def setAutoTuneOptions(value: AutoTuneOptionsStatus): Self = StObject.set(x, "AutoTuneOptions", value.asInstanceOf[js.Any])
    
    inline def setAutoTuneOptionsUndefined: Self = StObject.set(x, "AutoTuneOptions", js.undefined)
    
    inline def setChangeProgressDetails(value: ChangeProgressDetails): Self = StObject.set(x, "ChangeProgressDetails", value.asInstanceOf[js.Any])
    
    inline def setChangeProgressDetailsUndefined: Self = StObject.set(x, "ChangeProgressDetails", js.undefined)
    
    inline def setClusterConfig(value: ClusterConfigStatus): Self = StObject.set(x, "ClusterConfig", value.asInstanceOf[js.Any])
    
    inline def setClusterConfigUndefined: Self = StObject.set(x, "ClusterConfig", js.undefined)
    
    inline def setCognitoOptions(value: CognitoOptionsStatus): Self = StObject.set(x, "CognitoOptions", value.asInstanceOf[js.Any])
    
    inline def setCognitoOptionsUndefined: Self = StObject.set(x, "CognitoOptions", js.undefined)
    
    inline def setDomainEndpointOptions(value: DomainEndpointOptionsStatus): Self = StObject.set(x, "DomainEndpointOptions", value.asInstanceOf[js.Any])
    
    inline def setDomainEndpointOptionsUndefined: Self = StObject.set(x, "DomainEndpointOptions", js.undefined)
    
    inline def setEBSOptions(value: EBSOptionsStatus): Self = StObject.set(x, "EBSOptions", value.asInstanceOf[js.Any])
    
    inline def setEBSOptionsUndefined: Self = StObject.set(x, "EBSOptions", js.undefined)
    
    inline def setEncryptionAtRestOptions(value: EncryptionAtRestOptionsStatus): Self = StObject.set(x, "EncryptionAtRestOptions", value.asInstanceOf[js.Any])
    
    inline def setEncryptionAtRestOptionsUndefined: Self = StObject.set(x, "EncryptionAtRestOptions", js.undefined)
    
    inline def setEngineVersion(value: VersionStatus): Self = StObject.set(x, "EngineVersion", value.asInstanceOf[js.Any])
    
    inline def setEngineVersionUndefined: Self = StObject.set(x, "EngineVersion", js.undefined)
    
    inline def setLogPublishingOptions(value: LogPublishingOptionsStatus): Self = StObject.set(x, "LogPublishingOptions", value.asInstanceOf[js.Any])
    
    inline def setLogPublishingOptionsUndefined: Self = StObject.set(x, "LogPublishingOptions", js.undefined)
    
    inline def setNodeToNodeEncryptionOptions(value: NodeToNodeEncryptionOptionsStatus): Self = StObject.set(x, "NodeToNodeEncryptionOptions", value.asInstanceOf[js.Any])
    
    inline def setNodeToNodeEncryptionOptionsUndefined: Self = StObject.set(x, "NodeToNodeEncryptionOptions", js.undefined)
    
    inline def setSnapshotOptions(value: SnapshotOptionsStatus): Self = StObject.set(x, "SnapshotOptions", value.asInstanceOf[js.Any])
    
    inline def setSnapshotOptionsUndefined: Self = StObject.set(x, "SnapshotOptions", js.undefined)
    
    inline def setVPCOptions(value: VPCDerivedInfoStatus): Self = StObject.set(x, "VPCOptions", value.asInstanceOf[js.Any])
    
    inline def setVPCOptionsUndefined: Self = StObject.set(x, "VPCOptions", js.undefined)
  }
}
