package typings.azureArmResource

import typings.azureArmResource.subscriptionOperationsMod.Operations
import typings.azureArmResource.subscriptionOperationsMod.Subscriptions
import typings.azureArmResource.subscriptionOperationsMod.Tenants
import typings.msRest.mod.ServiceClientCredentials
import typings.msRestAzure.mod.AzureServiceClient
import typings.msRestAzure.mod.AzureServiceClientOptions
import typings.msRestAzure.mod.CloudErrorParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subscriptionClientMod {
  
  @JSImport("azure-arm-resource/lib/subscription/subscriptionClient", JSImport.Default)
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
    def this(credentials: ServiceClientCredentials, baseUri: Unit, options: AzureServiceClientOptions) = this()
  }
  
  @JSImport("azure-arm-resource/lib/subscription/subscriptionClient", "SubscriptionClient")
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
    def this(credentials: ServiceClientCredentials, baseUri: Unit, options: AzureServiceClientOptions) = this()
    
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
  
  object SubscriptionModels {
    
    @JSImport("azure-arm-resource/lib/subscription/subscriptionClient", "SubscriptionModels.BaseResource")
    @js.native
    class BaseResource ()
      extends typings.azureArmResource.subscriptionModelsMod.BaseResource
    
    @JSImport("azure-arm-resource/lib/subscription/subscriptionClient", "SubscriptionModels.CloudError")
    @js.native
    class CloudError protected ()
      extends typings.azureArmResource.subscriptionModelsMod.CloudError {
      def this(parameters: CloudErrorParameters) = this()
    }
  }
}
