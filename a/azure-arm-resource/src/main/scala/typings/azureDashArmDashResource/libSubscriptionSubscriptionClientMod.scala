package typings.azureDashArmDashResource

import typings.azureDashArmDashResource.libSubscriptionOperationsMod.Operations
import typings.azureDashArmDashResource.libSubscriptionOperationsMod.Subscriptions
import typings.azureDashArmDashResource.libSubscriptionOperationsMod.Tenants
import typings.msDashRest.msDashRestMod.ServiceClientCredentials
import typings.msDashRestDashAzure.msDashRestDashAzureMod.AzureServiceClient
import typings.msDashRestDashAzure.msDashRestDashAzureMod.AzureServiceClientOptions
import typings.msDashRestDashAzure.msDashRestDashAzureMod.CloudErrorParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure-arm-resource/lib/subscription/subscriptionClient", JSImport.Namespace)
@js.native
object libSubscriptionSubscriptionClientMod extends js.Object {
  @js.native
  class SubscriptionClient protected () extends AzureServiceClient {
    /**
      * Initializes a new instance of the SubscriptionClient class.
      * @constructor
      *
      * @class
      * @param {credentials} credentials - Credentials needed for the client to connect to Azure.
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
    def this(credentials: ServiceClientCredentials) = this()
    def this(credentials: ServiceClientCredentials, baseUri: String) = this()
    def this(credentials: ServiceClientCredentials, baseUri: String, options: AzureServiceClientOptions) = this()
    var acceptLanguage: String = js.native
    var apiVersion: String = js.native
    var credentials: ServiceClientCredentials = js.native
    var generateClientRequestId: Boolean = js.native
    var longRunningOperationRetryTimeout: Double = js.native
    // Operation groups
    var operations: Operations = js.native
    var subscriptions: Subscriptions = js.native
    var tenants: Tenants = js.native
  }
  
  @js.native
  class default protected () extends SubscriptionClient {
    /**
      * Initializes a new instance of the SubscriptionClient class.
      * @constructor
      *
      * @class
      * @param {credentials} credentials - Credentials needed for the client to connect to Azure.
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
    def this(credentials: ServiceClientCredentials) = this()
    def this(credentials: ServiceClientCredentials, baseUri: String) = this()
    def this(credentials: ServiceClientCredentials, baseUri: String, options: AzureServiceClientOptions) = this()
  }
  
  @js.native
  object SubscriptionModels extends js.Object {
    @js.native
    class BaseResource ()
      extends typings.msDashRestDashAzure.msDashRestDashAzureMod.BaseResource
    
    @js.native
    class CloudError protected ()
      extends typings.azureDashArmDashResource.libSubscriptionModelsMod.CloudError {
      def this(parameters: CloudErrorParameters) = this()
    }
    
  }
  
}

