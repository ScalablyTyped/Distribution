package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AwsElasticsearchDomainDetails extends StObject {
  
  /**
    * IAM policy document specifying the access policies for the new Amazon ES domain.
    */
  var AccessPolicies: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Additional options for the domain endpoint.
    */
  var DomainEndpointOptions: js.UndefOr[AwsElasticsearchDomainDomainEndpointOptions] = js.native
  
  /**
    * Unique identifier for an Amazon ES domain.
    */
  var DomainId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Name of an Amazon ES domain. Domain names are unique across all domains owned by the same account within an AWS Region. Domain names must start with a lowercase letter and must be between 3 and 28 characters. Valid characters are a-z (lowercase only), 0-9, and – (hyphen). 
    */
  var DomainName: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Elasticsearch version.
    */
  var ElasticsearchVersion: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Details about the configuration for encryption at rest.
    */
  var EncryptionAtRestOptions: js.UndefOr[AwsElasticsearchDomainEncryptionAtRestOptions] = js.native
  
  /**
    * Domain-specific endpoint used to submit index, search, and data upload requests to an Amazon ES domain. The endpoint is a service URL. 
    */
  var Endpoint: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The key-value pair that exists if the Amazon ES domain uses VPC endpoints.
    */
  var Endpoints: js.UndefOr[FieldMap] = js.native
  
  /**
    * Details about the configuration for node-to-node encryption.
    */
  var NodeToNodeEncryptionOptions: js.UndefOr[AwsElasticsearchDomainNodeToNodeEncryptionOptions] = js.native
  
  /**
    * Information that Amazon ES derives based on VPCOptions for the domain.
    */
  var VPCOptions: js.UndefOr[AwsElasticsearchDomainVPCOptions] = js.native
}
object AwsElasticsearchDomainDetails {
  
  @scala.inline
  def apply(): AwsElasticsearchDomainDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElasticsearchDomainDetails]
  }
  
  @scala.inline
  implicit class AwsElasticsearchDomainDetailsMutableBuilder[Self <: AwsElasticsearchDomainDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessPolicies(value: NonEmptyString): Self = StObject.set(x, "AccessPolicies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessPoliciesUndefined: Self = StObject.set(x, "AccessPolicies", js.undefined)
    
    @scala.inline
    def setDomainEndpointOptions(value: AwsElasticsearchDomainDomainEndpointOptions): Self = StObject.set(x, "DomainEndpointOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainEndpointOptionsUndefined: Self = StObject.set(x, "DomainEndpointOptions", js.undefined)
    
    @scala.inline
    def setDomainId(value: NonEmptyString): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainIdUndefined: Self = StObject.set(x, "DomainId", js.undefined)
    
    @scala.inline
    def setDomainName(value: NonEmptyString): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNameUndefined: Self = StObject.set(x, "DomainName", js.undefined)
    
    @scala.inline
    def setElasticsearchVersion(value: NonEmptyString): Self = StObject.set(x, "ElasticsearchVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElasticsearchVersionUndefined: Self = StObject.set(x, "ElasticsearchVersion", js.undefined)
    
    @scala.inline
    def setEncryptionAtRestOptions(value: AwsElasticsearchDomainEncryptionAtRestOptions): Self = StObject.set(x, "EncryptionAtRestOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionAtRestOptionsUndefined: Self = StObject.set(x, "EncryptionAtRestOptions", js.undefined)
    
    @scala.inline
    def setEndpoint(value: NonEmptyString): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointUndefined: Self = StObject.set(x, "Endpoint", js.undefined)
    
    @scala.inline
    def setEndpoints(value: FieldMap): Self = StObject.set(x, "Endpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointsUndefined: Self = StObject.set(x, "Endpoints", js.undefined)
    
    @scala.inline
    def setNodeToNodeEncryptionOptions(value: AwsElasticsearchDomainNodeToNodeEncryptionOptions): Self = StObject.set(x, "NodeToNodeEncryptionOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeToNodeEncryptionOptionsUndefined: Self = StObject.set(x, "NodeToNodeEncryptionOptions", js.undefined)
    
    @scala.inline
    def setVPCOptions(value: AwsElasticsearchDomainVPCOptions): Self = StObject.set(x, "VPCOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVPCOptionsUndefined: Self = StObject.set(x, "VPCOptions", js.undefined)
  }
}
