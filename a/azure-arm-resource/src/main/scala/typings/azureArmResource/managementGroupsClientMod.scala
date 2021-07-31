package typings.azureArmResource

import typings.azureArmResource.managementOperationsMod.ManagementGroups
import typings.azureArmResource.managementOperationsMod.Operations
import typings.msRest.mod.ServiceClientCredentials
import typings.msRestAzure.mod.AzureServiceClient
import typings.msRestAzure.mod.AzureServiceClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object managementGroupsClientMod {
  
  @JSImport("azure-arm-resource/lib/management/managementGroupsClient", JSImport.Namespace)
  @js.native
  class ^ protected () extends ManagementGroupsClient {
    /**
      * Initializes a new instance of the ManagementGroupsClient class.
      * @constructor
      *
      * @class
      * @param {credentials} credentials - Credentials needed for the client to connect to Azure.
      *
      * @param {uuid} groupId - Management Group ID.
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
      * @param {string} [options.acceptLanguage] - Gets or sets the preferred language for the response.
      *
      * @param {number} [options.longRunningOperationRetryTimeout] - Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
      *
      * @param {boolean} [options.generateClientRequestId] - When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
      *
      */
    def this(credentials: ServiceClientCredentials, groupId: String) = this()
    def this(credentials: ServiceClientCredentials, groupId: String, baseUri: String) = this()
    def this(
      credentials: ServiceClientCredentials,
      groupId: String,
      baseUri: String,
      options: AzureServiceClientOptions
    ) = this()
    def this(
      credentials: ServiceClientCredentials,
      groupId: String,
      baseUri: Unit,
      options: AzureServiceClientOptions
    ) = this()
  }
  
  @js.native
  trait ManagementGroupsClient extends AzureServiceClient {
    
    var acceptLanguage: String = js.native
    
    var apiVersion: String = js.native
    
    var credentials: ServiceClientCredentials = js.native
    
    var generateClientRequestId: Boolean = js.native
    
    var groupId: String = js.native
    
    var longRunningOperationRetryTimeout: Double = js.native
    
    // Operation groups
    var managementGroups: ManagementGroups = js.native
    
    var operations: Operations = js.native
  }
}
