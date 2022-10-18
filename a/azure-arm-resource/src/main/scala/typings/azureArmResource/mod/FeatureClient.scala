package typings.azureArmResource.mod

import typings.msRest.mod.ServiceClientCredentials
import typings.msRestAzure.mod.AzureServiceClientOptions
import typings.msRestAzure.mod.CloudErrorParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object FeatureClient {
  
  @JSImport("azure-arm-resource", "FeatureClient.default")
  @js.native
  open class default protected ()
    extends typings.azureArmResource.libFeatureFeatureClientMod.default {
    /**
      * Initializes a new instance of the FeatureClient class.
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
    def this(
      credentials: ServiceClientCredentials,
      subscriptionId: String,
      baseUri: Unit,
      options: AzureServiceClientOptions
    ) = this()
  }
  
  @JSImport("azure-arm-resource", "FeatureClient.FeatureClient")
  @js.native
  open class FeatureClient protected ()
    extends typings.azureArmResource.libFeatureFeatureClientMod.FeatureClient {
    /**
      * Initializes a new instance of the FeatureClient class.
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
    def this(
      credentials: ServiceClientCredentials,
      subscriptionId: String,
      baseUri: Unit,
      options: AzureServiceClientOptions
    ) = this()
  }
  
  object FeatureModels {
    
    @JSImport("azure-arm-resource", "FeatureClient.FeatureModels.BaseResource")
    @js.native
    open class BaseResource ()
      extends typings.azureArmResource.libFeatureFeatureClientMod.FeatureModels.BaseResource
    
    @JSImport("azure-arm-resource", "FeatureClient.FeatureModels.CloudError")
    @js.native
    open class CloudError protected ()
      extends typings.azureArmResource.libFeatureFeatureClientMod.FeatureModels.CloudError {
      def this(parameters: CloudErrorParameters) = this()
    }
  }
}
