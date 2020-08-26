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
  def apply(): AwsElasticsearchDomainDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElasticsearchDomainDetails]
  }
  @scala.inline
  implicit class AwsElasticsearchDomainDetailsOps[Self <: AwsElasticsearchDomainDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccessPolicies(value: NonEmptyString): Self = this.set("AccessPolicies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessPolicies: Self = this.set("AccessPolicies", js.undefined)
    @scala.inline
    def setDomainEndpointOptions(value: AwsElasticsearchDomainDomainEndpointOptions): Self = this.set("DomainEndpointOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainEndpointOptions: Self = this.set("DomainEndpointOptions", js.undefined)
    @scala.inline
    def setDomainId(value: NonEmptyString): Self = this.set("DomainId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainId: Self = this.set("DomainId", js.undefined)
    @scala.inline
    def setDomainName(value: NonEmptyString): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainName: Self = this.set("DomainName", js.undefined)
    @scala.inline
    def setElasticsearchVersion(value: NonEmptyString): Self = this.set("ElasticsearchVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElasticsearchVersion: Self = this.set("ElasticsearchVersion", js.undefined)
    @scala.inline
    def setEncryptionAtRestOptions(value: AwsElasticsearchDomainEncryptionAtRestOptions): Self = this.set("EncryptionAtRestOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptionAtRestOptions: Self = this.set("EncryptionAtRestOptions", js.undefined)
    @scala.inline
    def setEndpoint(value: NonEmptyString): Self = this.set("Endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoint: Self = this.set("Endpoint", js.undefined)
    @scala.inline
    def setEndpoints(value: FieldMap): Self = this.set("Endpoints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoints: Self = this.set("Endpoints", js.undefined)
    @scala.inline
    def setNodeToNodeEncryptionOptions(value: AwsElasticsearchDomainNodeToNodeEncryptionOptions): Self = this.set("NodeToNodeEncryptionOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeToNodeEncryptionOptions: Self = this.set("NodeToNodeEncryptionOptions", js.undefined)
    @scala.inline
    def setVPCOptions(value: AwsElasticsearchDomainVPCOptions): Self = this.set("VPCOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVPCOptions: Self = this.set("VPCOptions", js.undefined)
  }
  
}

