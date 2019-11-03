package typings.azureDashArmDashResource.azureDashArmDashResourceMod

import typings.msDashRest.msDashRestMod.ServiceClientCredentials
import typings.msDashRestDashAzure.msDashRestDashAzureMod.AzureServiceClientOptions
import typings.msDashRestDashAzure.msDashRestDashAzureMod.CloudErrorParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure-arm-resource", "ManagementLinkClient")
@js.native
object ManagementLinkClient extends js.Object {
  @js.native
  class ManagementLinkClient protected ()
    extends typings.azureDashArmDashResource.libLinkManagementLinkClientMod.ManagementLinkClient {
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
  class default protected ()
    extends typings.azureDashArmDashResource.libLinkManagementLinkClientMod.default {
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
      extends typings.msDashRestDashAzure.msDashRestDashAzureMod.BaseResource
    
    @js.native
    class CloudError protected ()
      extends typings.azureDashArmDashResource.libLinkManagementLinkClientMod.ManagementLinkModels.CloudError {
      def this(parameters: CloudErrorParameters) = this()
    }
    
  }
  
}

