package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsElasticsearchDomainDetails extends js.Object {
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
  def apply(
    AccessPolicies: NonEmptyString = null,
    DomainEndpointOptions: AwsElasticsearchDomainDomainEndpointOptions = null,
    DomainId: NonEmptyString = null,
    DomainName: NonEmptyString = null,
    ElasticsearchVersion: NonEmptyString = null,
    EncryptionAtRestOptions: AwsElasticsearchDomainEncryptionAtRestOptions = null,
    Endpoint: NonEmptyString = null,
    Endpoints: FieldMap = null,
    NodeToNodeEncryptionOptions: AwsElasticsearchDomainNodeToNodeEncryptionOptions = null,
    VPCOptions: AwsElasticsearchDomainVPCOptions = null
  ): AwsElasticsearchDomainDetails = {
    val __obj = js.Dynamic.literal()
    if (AccessPolicies != null) __obj.updateDynamic("AccessPolicies")(AccessPolicies.asInstanceOf[js.Any])
    if (DomainEndpointOptions != null) __obj.updateDynamic("DomainEndpointOptions")(DomainEndpointOptions.asInstanceOf[js.Any])
    if (DomainId != null) __obj.updateDynamic("DomainId")(DomainId.asInstanceOf[js.Any])
    if (DomainName != null) __obj.updateDynamic("DomainName")(DomainName.asInstanceOf[js.Any])
    if (ElasticsearchVersion != null) __obj.updateDynamic("ElasticsearchVersion")(ElasticsearchVersion.asInstanceOf[js.Any])
    if (EncryptionAtRestOptions != null) __obj.updateDynamic("EncryptionAtRestOptions")(EncryptionAtRestOptions.asInstanceOf[js.Any])
    if (Endpoint != null) __obj.updateDynamic("Endpoint")(Endpoint.asInstanceOf[js.Any])
    if (Endpoints != null) __obj.updateDynamic("Endpoints")(Endpoints.asInstanceOf[js.Any])
    if (NodeToNodeEncryptionOptions != null) __obj.updateDynamic("NodeToNodeEncryptionOptions")(NodeToNodeEncryptionOptions.asInstanceOf[js.Any])
    if (VPCOptions != null) __obj.updateDynamic("VPCOptions")(VPCOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsElasticsearchDomainDetails]
  }
}

