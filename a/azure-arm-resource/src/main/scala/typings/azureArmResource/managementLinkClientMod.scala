package typings.azureArmResource

import typings.azureArmResource.linkOperationsMod.Operations
import typings.azureArmResource.linkOperationsMod.ResourceLinks
import typings.msRest.mod.ServiceClientCredentials
import typings.msRestAzure.mod.AzureServiceClient
import typings.msRestAzure.mod.AzureServiceClientOptions
import typings.msRestAzure.mod.CloudErrorParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure-arm-resource/lib/link/managementLinkClient", JSImport.Namespace)
@js.native
object managementLinkClientMod extends js.Object {
  @js.native
  class ManagementLinkClient protected () extends AzureServiceClient {
    /**
      * Initializes a new instance of the ManagementLinkClient class.
      * @constructor
      *
      * @class
      * @param {credentials} credentials - Credentials needed for the client to connect to Azure.
      *
      * @param {string} subscriptionId - The ID of the target subscription.
      *
      * @param {string} [baseUri] - The base URI of the service.
      *
      * @param {object} [options] - The parameter options
      *
      * @param {Array} [options.filters] - Filters to be added to the request pipeline
      *
      * @param {object} [options.requestOptions] - Options for the underlying request object
      * {@link https://github.com/request/request#requestoptions-callback Options doc}
      *
      * @param {boolean} [options.noRetryPolicy] - If set to true, turn off default retry policy
      *
      * @param {string} [options.acceptLanguage] - The preferred language for the response.
      *
      * @param {number} [options.longRunningOperationRetryTimeout] - The retry timeout in seconds for Long Running Operations. Default value is 30.
      *
      * @param {boolean} [options.generateClientRequestId] - Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
      *
      */
    def this(credentials: ServiceClientCredentials, subscriptionId: String) = this()
    def this(credentials: ServiceClientCredentials, subscriptionId: String, baseUri: String) = this()
    def this(
      credentials: ServiceClientCredentials,
      subscriptionId: String,
      baseUri: String,
      options: AzureServiceClientOptions
    ) = this()
    var acceptLanguage: String = js.native
    var apiVersion: String = js.native
    var credentials: ServiceClientCredentials = js.native
    var generateClientRequestId: Boolean = js.native
    var longRunningOperationRetryTimeout: Double = js.native
    // Operation groups
    var operations: Operations = js.native
    var resourceLinks: ResourceLinks = js.native
    var subscriptionId: String = js.native
  }
  
  @js.native
  class default protected () extends ManagementLinkClient {
    /**
      * Initializes a new instance of the ManagementLinkClient class.
      * @constructor
      *
      * @class
      * @param {credentials} credentials - Credentials needed for the client to connect to Azure.
      *
      * @param {string} subscriptionId - The ID of the target subscription.
      *
      * @param {string} [baseUri] - The base URI of the service.
      *
      * @param {object} [options] - The parameter options
      *
      * @param {Array} [options.filters] - Filters to be added to the request pipeline
      *
      * @param {object} [options.requestOptions] - Options for the underlying request object
      * {@link https://github.com/request/request#requestoptions-callback Options doc}
      *
      * @param {boolean} [options.noRetryPolicy] - If set to true, turn off default retry policy
      *
      * @param {string} [options.acceptLanguage] - The preferred language for the response.
      *
      * @param {number} [options.longRunningOperationRetryTimeout] - The retry timeout in seconds for Long Running Operations. Default value is 30.
      *
      * @param {boolean} [options.generateClientRequestId] - Whether a unique x-ms-client-request-id should be generated. When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
      *
      */
    def this(credentials: ServiceClientCredentials, subscriptionId: String) = this()
    def this(credentials: ServiceClientCredentials, subscriptionId: String, baseUri: String) = this()
    def this(
      credentials: ServiceClientCredentials,
      subscriptionId: String,
      baseUri: String,
      options: AzureServiceClientOptions
    ) = this()
  }
  
  @js.native
  object ManagementLinkModels extends js.Object {
    @js.native
    class BaseResource ()
      extends typings.msRestAzure.mod.BaseResource
    
    @js.native
    class CloudError protected ()
      extends typings.azureArmResource.linkModelsMod.CloudError {
      def this(parameters: CloudErrorParameters) = this()
    }
    
  }
  
}

