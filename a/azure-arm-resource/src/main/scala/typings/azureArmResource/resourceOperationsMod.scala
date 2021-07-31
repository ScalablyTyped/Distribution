package typings.azureArmResource

import typings.azureArmResource.anon.CustomHeaders
import typings.azureArmResource.anon.CustomHeadersExpand
import typings.azureArmResource.anon.CustomHeadersTop
import typings.azureArmResource.anon.ExpandFilter
import typings.azureArmResource.anon.Top
import typings.azureArmResource.anon.`0`
import typings.azureArmResource.resourceModelsMod.Deployment
import typings.azureArmResource.resourceModelsMod.DeploymentExportResult
import typings.azureArmResource.resourceModelsMod.DeploymentExtended
import typings.azureArmResource.resourceModelsMod.DeploymentListResult
import typings.azureArmResource.resourceModelsMod.DeploymentOperation
import typings.azureArmResource.resourceModelsMod.DeploymentOperationsListResult
import typings.azureArmResource.resourceModelsMod.DeploymentValidateResult
import typings.azureArmResource.resourceModelsMod.ExportTemplateRequest
import typings.azureArmResource.resourceModelsMod.GenericResource
import typings.azureArmResource.resourceModelsMod.OperationListResult
import typings.azureArmResource.resourceModelsMod.Provider
import typings.azureArmResource.resourceModelsMod.ProviderListResult
import typings.azureArmResource.resourceModelsMod.ResourceGroup
import typings.azureArmResource.resourceModelsMod.ResourceGroupExportResult
import typings.azureArmResource.resourceModelsMod.ResourceGroupListResult
import typings.azureArmResource.resourceModelsMod.ResourceGroupPatchable
import typings.azureArmResource.resourceModelsMod.ResourceListResult
import typings.azureArmResource.resourceModelsMod.ResourcesMoveInfo
import typings.azureArmResource.resourceModelsMod.TagDetails
import typings.azureArmResource.resourceModelsMod.TagValue
import typings.azureArmResource.resourceModelsMod.TagsListResult
import typings.msRest.mod.HttpOperationResponse
import typings.msRest.mod.ServiceCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resourceOperationsMod {
  
  @js.native
  trait DeploymentOperations extends StObject {
    
    /**
      * Gets a deployments operation.
      *
      * @param {string} resourceGroupName The name of the resource group. The name
      * is case insensitive.
      *
      * @param {string} deploymentName The name of the deployment.
      *
      * @param {string} operationId The ID of the operation to get.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {DeploymentOperation} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {DeploymentOperation} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link DeploymentOperation} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def get(resourceGroupName: String, deploymentName: String, operationId: String): js.Promise[DeploymentOperation] = js.native
    def get(
      resourceGroupName: String,
      deploymentName: String,
      operationId: String,
      callback: ServiceCallback[DeploymentOperation]
    ): Unit = js.native
    def get(resourceGroupName: String, deploymentName: String, operationId: String, options: CustomHeaders): js.Promise[DeploymentOperation] = js.native
    def get(
      resourceGroupName: String,
      deploymentName: String,
      operationId: String,
      options: CustomHeaders,
      callback: ServiceCallback[DeploymentOperation]
    ): Unit = js.native
    
    /**
      * Gets a deployments operation.
      *
      * @param {string} deploymentName The name of the deployment.
      *
      * @param {string} operationId The ID of the operation to get.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {DeploymentOperation} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {DeploymentOperation} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link DeploymentOperation} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def getAtSubscriptionScope(deploymentName: String, operationId: String): js.Promise[DeploymentOperation] = js.native
    def getAtSubscriptionScope(deploymentName: String, operationId: String, callback: ServiceCallback[DeploymentOperation]): Unit = js.native
    def getAtSubscriptionScope(deploymentName: String, operationId: String, options: CustomHeaders): js.Promise[DeploymentOperation] = js.native
    def getAtSubscriptionScope(
      deploymentName: String,
      operationId: String,
      options: CustomHeaders,
      callback: ServiceCallback[DeploymentOperation]
    ): Unit = js.native
    
    /**
      * Gets a deployments operation.
      *
      * @param {string} deploymentName The name of the deployment.
      *
      * @param {string} operationId The ID of the operation to get.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<DeploymentOperation>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def getAtSubscriptionScopeWithHttpOperationResponse(deploymentName: String, operationId: String): js.Promise[HttpOperationResponse[DeploymentOperation]] = js.native
    def getAtSubscriptionScopeWithHttpOperationResponse(deploymentName: String, operationId: String, options: CustomHeaders): js.Promise[HttpOperationResponse[DeploymentOperation]] = js.native
    
    /**
      * Gets a deployments operation.
      *
      * @param {string} resourceGroupName The name of the resource group. The name
      * is case insensitive.
      *
      * @param {string} deploymentName The name of the deployment.
      *
      * @param {string} operationId The ID of the operation to get.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<DeploymentOperation>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def getWithHttpOperationResponse(resourceGroupName: String, deploymentName: String, operationId: String): js.Promise[HttpOperationResponse[DeploymentOperation]] = js.native
    def getWithHttpOperationResponse(resourceGroupName: String, deploymentName: String, operationId: String, options: CustomHeaders): js.Promise[HttpOperationResponse[DeploymentOperation]] = js.native
    
    /**
      * Gets all deployments operations for a deployment.
      *
      * @param {string} resourceGroupName The name of the resource group. The name
      * is case insensitive.
      *
      * @param {string} deploymentName The name of the deployment with the operation
      * to get.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {number} [options.top] The number of results to return.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {DeploymentOperationsListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {DeploymentOperationsListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link DeploymentOperationsListResult} for more
      *                      information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def list(resourceGroupName: String, deploymentName: String): js.Promise[DeploymentOperationsListResult] = js.native
    def list(
      resourceGroupName: String,
      deploymentName: String,
      callback: ServiceCallback[DeploymentOperationsListResult]
    ): Unit = js.native
    def list(resourceGroupName: String, deploymentName: String, options: CustomHeadersTop): js.Promise[DeploymentOperationsListResult] = js.native
    def list(
      resourceGroupName: String,
      deploymentName: String,
      options: CustomHeadersTop,
      callback: ServiceCallback[DeploymentOperationsListResult]
    ): Unit = js.native
    
    /**
      * Gets all deployments operations for a deployment.
      *
      * @param {string} deploymentName The name of the deployment with the operation
      * to get.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {number} [options.top] The number of results to return.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {DeploymentOperationsListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {DeploymentOperationsListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link DeploymentOperationsListResult} for more
      *                      information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def listAtSubscriptionScope(deploymentName: String): js.Promise[DeploymentOperationsListResult] = js.native
    def listAtSubscriptionScope(deploymentName: String, callback: ServiceCallback[DeploymentOperationsListResult]): Unit = js.native
    def listAtSubscriptionScope(deploymentName: String, options: CustomHeadersTop): js.Promise[DeploymentOperationsListResult] = js.native
    def listAtSubscriptionScope(
      deploymentName: String,
      options: CustomHeadersTop,
      callback: ServiceCallback[DeploymentOperationsListResult]
    ): Unit = js.native
    
    /**
      * Gets all deployments operations for a deployment.
      *
      * @param {string} nextPageLink The NextLink from the previous successful call
      * to List operation.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {DeploymentOperationsListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {DeploymentOperationsListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link DeploymentOperationsListResult} for more
      *                      information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def listAtSubscriptionScopeNext(nextPageLink: String): js.Promise[DeploymentOperationsListResult] = js.native
    def listAtSubscriptionScopeNext(nextPageLink: String, callback: ServiceCallback[DeploymentOperationsListResult]): Unit = js.native
    def listAtSubscriptionScopeNext(nextPageLink: String, options: CustomHeaders): js.Promise[DeploymentOperationsListResult] = js.native
    def listAtSubscriptionScopeNext(
      nextPageLink: String,
      options: CustomHeaders,
      callback: ServiceCallback[DeploymentOperationsListResult]
    ): Unit = js.native
    
    /**
      * Gets all deployments operations for a deployment.
      *
      * @param {string} nextPageLink The NextLink from the previous successful call
      * to List operation.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<DeploymentOperationsListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listAtSubscriptionScopeNextWithHttpOperationResponse(nextPageLink: String): js.Promise[HttpOperationResponse[DeploymentOperationsListResult]] = js.native
    def listAtSubscriptionScopeNextWithHttpOperationResponse(nextPageLink: String, options: CustomHeaders): js.Promise[HttpOperationResponse[DeploymentOperationsListResult]] = js.native
    
    /**
      * Gets all deployments operations for a deployment.
      *
      * @param {string} deploymentName The name of the deployment with the operation
      * to get.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {number} [options.top] The number of results to return.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<DeploymentOperationsListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listAtSubscriptionScopeWithHttpOperationResponse(deploymentName: String): js.Promise[HttpOperationResponse[DeploymentOperationsListResult]] = js.native
    def listAtSubscriptionScopeWithHttpOperationResponse(deploymentName: String, options: CustomHeadersTop): js.Promise[HttpOperationResponse[DeploymentOperationsListResult]] = js.native
    
    /**
      * Gets all deployments operations for a deployment.
      *
      * @param {string} nextPageLink The NextLink from the previous successful call
      * to List operation.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {DeploymentOperationsListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {DeploymentOperationsListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link DeploymentOperationsListResult} for more
      *                      information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def listNext(nextPageLink: String): js.Promise[DeploymentOperationsListResult] = js.native
    def listNext(nextPageLink: String, callback: ServiceCallback[DeploymentOperationsListResult]): Unit = js.native
    def listNext(nextPageLink: String, options: CustomHeaders): js.Promise[DeploymentOperationsListResult] = js.native
    def listNext(
      nextPageLink: String,
      options: CustomHeaders,
      callback: ServiceCallback[DeploymentOperationsListResult]
    ): Unit = js.native
    
    /**
      * Gets all deployments operations for a deployment.
      *
      * @param {string} nextPageLink The NextLink from the previous successful call
      * to List operation.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<DeploymentOperationsListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listNextWithHttpOperationResponse(nextPageLink: String): js.Promise[HttpOperationResponse[DeploymentOperationsListResult]] = js.native
    def listNextWithHttpOperationResponse(nextPageLink: String, options: CustomHeaders): js.Promise[HttpOperationResponse[DeploymentOperationsListResult]] = js.native
    
    /**
      * Gets all deployments operations for a deployment.
      *
      * @param {string} resourceGroupName The name of the resource group. The name
      * is case insensitive.
      *
      * @param {string} deploymentName The name of the deployment with the operation
      * to get.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {number} [options.top] The number of results to return.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<DeploymentOperationsListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listWithHttpOperationResponse(resourceGroupName: String, deploymentName: String): js.Promise[HttpOperationResponse[DeploymentOperationsListResult]] = js.native
    def listWithHttpOperationResponse(resourceGroupName: String, deploymentName: String, options: CustomHeadersTop): js.Promise[HttpOperationResponse[DeploymentOperationsListResult]] = js.native
  }
  
  @js.native
  trait Deployments extends StObject {
    
    /**
      * @summary Deploys resources to a resource group.
      *
      * You can provide the template and parameters directly in the request or link
      * to JSON files.
      *
      * @param {string} resourceGroupName The name of the resource group to deploy
      * the resources to. The name is case insensitive. The resource group must
      * already exist.
      *
      * @param {string} deploymentName The name of the deployment.
      *
      * @param {object} parameters Additional parameters supplied to the operation.
      *
      * @param {string} [parameters.location] The location to store the deployment
      * data.
      *
      * @param {object} parameters.properties The deployment properties.
      *
      * @param {object} [parameters.properties.template] The template content. You
      * use this element when you want to pass the template syntax directly in the
      * request rather than link to an existing template. It can be a JObject or
      * well-formed JSON string. Use either the templateLink property or the
      * template property, but not both.
      *
      * @param {object} [parameters.properties.templateLink] The URI of the
      * template. Use either the templateLink property or the template property, but
      * not both.
      *
      * @param {string} parameters.properties.templateLink.uri The URI of the
      * template to deploy.
      *
      * @param {string} [parameters.properties.templateLink.contentVersion] If
      * included, must match the ContentVersion in the template.
      *
      * @param {object} [parameters.properties.parameters] Name and value pairs that
      * define the deployment parameters for the template. You use this element when
      * you want to provide the parameter values directly in the request rather than
      * link to an existing parameter file. Use either the parametersLink property
      * or the parameters property, but not both. It can be a JObject or a well
      * formed JSON string.
      *
      * @param {object} [parameters.properties.parametersLink] The URI of parameters
      * file. You use this element to link to an existing parameters file. Use
      * either the parametersLink property or the parameters property, but not both.
      *
      * @param {string} parameters.properties.parametersLink.uri The URI of the
      * parameters file.
      *
      * @param {string} [parameters.properties.parametersLink.contentVersion] If
      * included, must match the ContentVersion in the template.
      *
      * @param {string} parameters.properties.mode The mode that is used to deploy
      * resources. This value can be either Incremental or Complete. In Incremental
      * mode, resources are deployed without deleting existing resources that are
      * not included in the template. In Complete mode, resources are deployed and
      * existing resources in the resource group that are not included in the
      * template are deleted. Be careful when using Complete mode as you may
      * unintentionally delete resources. Possible values include: 'Incremental',
      * 'Complete'
      *
      * @param {object} [parameters.properties.debugSetting] The debug setting of
      * the deployment.
      *
      * @param {string} [parameters.properties.debugSetting.detailLevel] Specifies
      * the type of information to log for debugging. The permitted values are none,
      * requestContent, responseContent, or both requestContent and responseContent
      * separated by a comma. The default is none. When setting this value,
      * carefully consider the type of information you are passing in during
      * deployment. By logging information about the request or response, you could
      * potentially expose sensitive data that is retrieved through the deployment
      * operations.
      *
      * @param {object} [parameters.properties.onErrorDeployment] The deployment on
      * error behavior.
      *
      * @param {string} [parameters.properties.onErrorDeployment.type] The
      * deployment on error behavior type. Possible values are LastSuccessful and
      * SpecificDeployment. Possible values include: 'LastSuccessful',
      * 'SpecificDeployment'
      *
      * @param {string} [parameters.properties.onErrorDeployment.deploymentName] The
      * deployment to be used on error case.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {DeploymentExtended} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {DeploymentExtended} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link DeploymentExtended} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def beginCreateOrUpdate(resourceGroupName: String, deploymentName: String, parameters: Deployment): js.Promise[DeploymentExtended] = js.native
    def beginCreateOrUpdate(
      resourceGroupName: String,
      deploymentName: String,
      parameters: Deployment,
      callback: ServiceCallback[DeploymentExtended]
    ): Unit = js.native
    def beginCreateOrUpdate(resourceGroupName: String, deploymentName: String, parameters: Deployment, options: CustomHeaders): js.Promise[DeploymentExtended] = js.native
    def beginCreateOrUpdate(
      resourceGroupName: String,
      deploymentName: String,
      parameters: Deployment,
      options: CustomHeaders,
      callback: ServiceCallback[DeploymentExtended]
    ): Unit = js.native
    
    /**
      * @summary Deploys resources at subscription scope.
      *
      * You can provide the template and parameters directly in the request or link
      * to JSON files.
      *
      * @param {string} deploymentName The name of the deployment.
      *
      * @param {object} parameters Additional parameters supplied to the operation.
      *
      * @param {string} [parameters.location] The location to store the deployment
      * data.
      *
      * @param {object} parameters.properties The deployment properties.
      *
      * @param {object} [parameters.properties.template] The template content. You
      * use this element when you want to pass the template syntax directly in the
      * request rather than link to an existing template. It can be a JObject or
      * well-formed JSON string. Use either the templateLink property or the
      * template property, but not both.
      *
      * @param {object} [parameters.properties.templateLink] The URI of the
      * template. Use either the templateLink property or the template property, but
      * not both.
      *
      * @param {string} parameters.properties.templateLink.uri The URI of the
      * template to deploy.
      *
      * @param {string} [parameters.properties.templateLink.contentVersion] If
      * included, must match the ContentVersion in the template.
      *
      * @param {object} [parameters.properties.parameters] Name and value pairs that
      * define the deployment parameters for the template. You use this element when
      * you want to provide the parameter values directly in the request rather than
      * link to an existing parameter file. Use either the parametersLink property
      * or the parameters property, but not both. It can be a JObject or a well
      * formed JSON string.
      *
      * @param {object} [parameters.properties.parametersLink] The URI of parameters
      * file. You use this element to link to an existing parameters file. Use
      * either the parametersLink property or the parameters property, but not both.
      *
      * @param {string} parameters.properties.parametersLink.uri The URI of the
      * parameters file.
      *
      * @param {string} [parameters.properties.parametersLink.contentVersion] If
      * included, must match the ContentVersion in the template.
      *
      * @param {string} parameters.properties.mode The mode that is used to deploy
      * resources. This value can be either Incremental or Complete. In Incremental
      * mode, resources are deployed without deleting existing resources that are
      * not included in the template. In Complete mode, resources are deployed and
      * existing resources in the resource group that are not included in the
      * template are deleted. Be careful when using Complete mode as you may
      * unintentionally delete resources. Possible values include: 'Incremental',
      * 'Complete'
      *
      * @param {object} [parameters.properties.debugSetting] The debug setting of
      * the deployment.
      *
      * @param {string} [parameters.properties.debugSetting.detailLevel] Specifies
      * the type of information to log for debugging. The permitted values are none,
      * requestContent, responseContent, or both requestContent and responseContent
      * separated by a comma. The default is none. When setting this value,
      * carefully consider the type of information you are passing in during
      * deployment. By logging information about the request or response, you could
      * potentially expose sensitive data that is retrieved through the deployment
      * operations.
      *
      * @param {object} [parameters.properties.onErrorDeployment] The deployment on
      * error behavior.
      *
      * @param {string} [parameters.properties.onErrorDeployment.type] The
      * deployment on error behavior type. Possible values are LastSuccessful and
      * SpecificDeployment. Possible values include: 'LastSuccessful',
      * 'SpecificDeployment'
      *
      * @param {string} [parameters.properties.onErrorDeployment.deploymentName] The
      * deployment to be used on error case.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {DeploymentExtended} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {DeploymentExtended} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link DeploymentExtended} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def beginCreateOrUpdateAtSubscriptionScope(deploymentName: String, parameters: Deployment): js.Promise[DeploymentExtended] = js.native
    def beginCreateOrUpdateAtSubscriptionScope(deploymentName: String, parameters: Deployment, callback: ServiceCallback[DeploymentExtended]): Unit = js.native
    def beginCreateOrUpdateAtSubscriptionScope(deploymentName: String, parameters: Deployment, options: CustomHeaders): js.Promise[DeploymentExtended] = js.native
    def beginCreateOrUpdateAtSubscriptionScope(
      deploymentName: String,
      parameters: Deployment,
      options: CustomHeaders,
      callback: ServiceCallback[DeploymentExtended]
    ): Unit = js.native
    
    /**
      * @summary Deploys resources at subscription scope.
      *
      * You can provide the template and parameters directly in the request or link
      * to JSON files.
      *
      * @param {string} deploymentName The name of the deployment.
      *
      * @param {object} parameters Additional parameters supplied to the operation.
      *
      * @param {string} [parameters.location] The location to store the deployment
      * data.
      *
      * @param {object} parameters.properties The deployment properties.
      *
      * @param {object} [parameters.properties.template] The template content. You
      * use this element when you want to pass the template syntax directly in the
      * request rather than link to an existing template. It can be a JObject or
      * well-formed JSON string. Use either the templateLink property or the
      * template property, but not both.
      *
      * @param {object} [parameters.properties.templateLink] The URI of the
      * template. Use either the templateLink property or the template property, but
      * not both.
      *
      * @param {string} parameters.properties.templateLink.uri The URI of the
      * template to deploy.
      *
      * @param {string} [parameters.properties.templateLink.contentVersion] If
      * included, must match the ContentVersion in the template.
      *
      * @param {object} [parameters.properties.parameters] Name and value pairs that
      * define the deployment parameters for the template. You use this element when
      * you want to provide the parameter values directly in the request rather than
      * link to an existing parameter file. Use either the parametersLink property
      * or the parameters property, but not both. It can be a JObject or a well
      * formed JSON string.
      *
      * @param {object} [parameters.properties.parametersLink] The URI of parameters
      * file. You use this element to link to an existing parameters file. Use
      * either the parametersLink property or the parameters property, but not both.
      *
      * @param {string} parameters.properties.parametersLink.uri The URI of the
      * parameters file.
      *
      * @param {string} [parameters.properties.parametersLink.contentVersion] If
      * included, must match the ContentVersion in the template.
      *
      * @param {string} parameters.properties.mode The mode that is used to deploy
      * resources. This value can be either Incremental or Complete. In Incremental
      * mode, resources are deployed without deleting existing resources that are
      * not included in the template. In Complete mode, resources are deployed and
      * existing resources in the resource group that are not included in the
      * template are deleted. Be careful when using Complete mode as you may
      * unintentionally delete resources. Possible values include: 'Incremental',
      * 'Complete'
      *
      * @param {object} [parameters.properties.debugSetting] The debug setting of
      * the deployment.
      *
      * @param {string} [parameters.properties.debugSetting.detailLevel] Specifies
      * the type of information to log for debugging. The permitted values are none,
      * requestContent, responseContent, or both requestContent and responseContent
      * separated by a comma. The default is none. When setting this value,
      * carefully consider the type of information you are passing in during
      * deployment. By logging information about the request or response, you could
      * potentially expose sensitive data that is retrieved through the deployment
      * operations.
      *
      * @param {object} [parameters.properties.onErrorDeployment] The deployment on
      * error behavior.
      *
      * @param {string} [parameters.properties.onErrorDeployment.type] The
      * deployment on error behavior type. Possible values are LastSuccessful and
      * SpecificDeployment. Possible values include: 'LastSuccessful',
      * 'SpecificDeployment'
      *
      * @param {string} [parameters.properties.onErrorDeployment.deploymentName] The
      * deployment to be used on error case.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<DeploymentExtended>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def beginCreateOrUpdateAtSubscriptionScopeWithHttpOperationResponse(deploymentName: String, parameters: Deployment): js.Promise[HttpOperationResponse[DeploymentExtended]] = js.native
    def beginCreateOrUpdateAtSubscriptionScopeWithHttpOperationResponse(deploymentName: String, parameters: Deployment, options: CustomHeaders): js.Promise[HttpOperationResponse[DeploymentExtended]] = js.native
    
    /**
      * @summary Deploys resources to a resource group.
      *
      * You can provide the template and parameters directly in the request or link
      * to JSON files.
      *
      * @param {string} resourceGroupName The name of the resource group to deploy
      * the resources to. The name is case insensitive. The resource group must
      * already exist.
      *
      * @param {string} deploymentName The name of the deployment.
      *
      * @param {object} parameters Additional parameters supplied to the operation.
      *
      * @param {string} [parameters.location] The location to store the deployment
      * data.
      *
      * @param {object} parameters.properties The deployment properties.
      *
      * @param {object} [parameters.properties.template] The template content. You
      * use this element when you want to pass the template syntax directly in the
      * request rather than link to an existing template. It can be a JObject or
      * well-formed JSON string. Use either the templateLink property or the
      * template property, but not both.
      *
      * @param {object} [parameters.properties.templateLink] The URI of the
      * template. Use either the templateLink property or the template property, but
      * not both.
      *
      * @param {string} parameters.properties.templateLink.uri The URI of the
      * template to deploy.
      *
      * @param {string} [parameters.properties.templateLink.contentVersion] If
      * included, must match the ContentVersion in the template.
      *
      * @param {object} [parameters.properties.parameters] Name and value pairs that
      * define the deployment parameters for the template. You use this element when
      * you want to provide the parameter values directly in the request rather than
      * link to an existing parameter file. Use either the parametersLink property
      * or the parameters property, but not both. It can be a JObject or a well
      * formed JSON string.
      *
      * @param {object} [parameters.properties.parametersLink] The URI of parameters
      * file. You use this element to link to an existing parameters file. Use
      * either the parametersLink property or the parameters property, but not both.
      *
      * @param {string} parameters.properties.parametersLink.uri The URI of the
      * parameters file.
      *
      * @param {string} [parameters.properties.parametersLink.contentVersion] If
      * included, must match the ContentVersion in the template.
      *
      * @param {string} parameters.properties.mode The mode that is used to deploy
      * resources. This value can be either Incremental or Complete. In Incremental
      * mode, resources are deployed without deleting existing resources that are
      * not included in the template. In Complete mode, resources are deployed and
      * existing resources in the resource group that are not included in the
      * template are deleted. Be careful when using Complete mode as you may
      * unintentionally delete resources. Possible values include: 'Incremental',
      * 'Complete'
      *
      * @param {object} [parameters.properties.debugSetting] The debug setting of
      * the deployment.
      *
      * @param {string} [parameters.properties.debugSetting.detailLevel] Specifies
      * the type of information to log for debugging. The permitted values are none,
      * requestContent, responseContent, or both requestContent and responseContent
      * separated by a comma. The default is none. When setting this value,
      * carefully consider the type of information you are passing in during
      * deployment. By logging information about the request or response, you could
      * potentially expose sensitive data that is retrieved through the deployment
      * operations.
      *
      * @param {object} [parameters.properties.onErrorDeployment] The deployment on
      * error behavior.
      *
      * @param {string} [parameters.properties.onErrorDeployment.type] The
      * deployment on error behavior type. Possible values are LastSuccessful and
      * SpecificDeployment. Possible values include: 'LastSuccessful',
      * 'SpecificDeployment'
      *
      * @param {string} [parameters.properties.onErrorDeployment.deploymentName] The
      * deployment to be used on error case.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<DeploymentExtended>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def beginCreateOrUpdateWithHttpOperationResponse(resourceGroupName: String, deploymentName: String, parameters: Deployment): js.Promise[HttpOperationResponse[DeploymentExtended]] = js.native
    def beginCreateOrUpdateWithHttpOperationResponse(resourceGroupName: String, deploymentName: String, parameters: Deployment, options: CustomHeaders): js.Promise[HttpOperationResponse[DeploymentExtended]] = js.native
    
    /**
      * @summary Deletes a deployment from the deployment history.
      *
      * A template deployment that is currently running cannot be deleted. Deleting
      * a template deployment removes the associated deployment operations. This is
      * an asynchronous operation that returns a status of 202 until the template
      * deployment is successfully deleted. The Location response header contains
      * the URI that is used to obtain the status of the process. While the process
      * is running, a call to the URI in the Location header returns a status of
      * 202. When the process finishes, the URI in the Location header returns a
      * status of 204 on success. If the asynchronous request failed, the URI in the
      * Location header returns an error-level status code.
      *
      * @param {string} deploymentName The name of the deployment to delete.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {null} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {null} [result]   - The deserialized result object if an error did not occur.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def beginDeleteAtSubscriptionScope(deploymentName: String): js.Promise[Unit] = js.native
    def beginDeleteAtSubscriptionScope(deploymentName: String, callback: ServiceCallback[Unit]): Unit = js.native
    def beginDeleteAtSubscriptionScope(deploymentName: String, options: CustomHeaders): js.Promise[Unit] = js.native
    def beginDeleteAtSubscriptionScope(deploymentName: String, options: CustomHeaders, callback: ServiceCallback[Unit]): Unit = js.native
    
    /**
      * @summary Deletes a deployment from the deployment history.
      *
      * A template deployment that is currently running cannot be deleted. Deleting
      * a template deployment removes the associated deployment operations. This is
      * an asynchronous operation that returns a status of 202 until the template
      * deployment is successfully deleted. The Location response header contains
      * the URI that is used to obtain the status of the process. While the process
      * is running, a call to the URI in the Location header returns a status of
      * 202. When the process finishes, the URI in the Location header returns a
      * status of 204 on success. If the asynchronous request failed, the URI in the
      * Location header returns an error-level status code.
      *
      * @param {string} deploymentName The name of the deployment to delete.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<null>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def beginDeleteAtSubscriptionScopeWithHttpOperationResponse(deploymentName: String): js.Promise[HttpOperationResponse[Unit]] = js.native
    def beginDeleteAtSubscriptionScopeWithHttpOperationResponse(deploymentName: String, options: CustomHeaders): js.Promise[HttpOperationResponse[Unit]] = js.native
    
    /**
      * @summary Deletes a deployment from the deployment history.
      *
      * A template deployment that is currently running cannot be deleted. Deleting
      * a template deployment removes the associated deployment operations. Deleting
      * a template deployment does not affect the state of the resource group. This
      * is an asynchronous operation that returns a status of 202 until the template
      * deployment is successfully deleted. The Location response header contains
      * the URI that is used to obtain the status of the process. While the process
      * is running, a call to the URI in the Location header returns a status of
      * 202. When the process finishes, the URI in the Location header returns a
      * status of 204 on success. If the asynchronous request failed, the URI in the
      * Location header returns an error-level status code.
      *
      * @param {string} resourceGroupName The name of the resource group with the
      * deployment to delete. The name is case insensitive.
      *
      * @param {string} deploymentName The name of the deployment to delete.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {null} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {null} [result]   - The deserialized result object if an error did not occur.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def beginDeleteMethod(resourceGroupName: String, deploymentName: String): js.Promise[Unit] = js.native
    def beginDeleteMethod(resourceGroupName: String, deploymentName: String, callback: ServiceCallback[Unit]): Unit = js.native
    def beginDeleteMethod(resourceGroupName: String, deploymentName: String, options: CustomHeaders): js.Promise[Unit] = js.native
    def beginDeleteMethod(
      resourceGroupName: String,
      deploymentName: String,
      options: CustomHeaders,
      callback: ServiceCallback[Unit]
    ): Unit = js.native
    
    /**
      * @summary Deletes a deployment from the deployment history.
      *
      * A template deployment that is currently running cannot be deleted. Deleting
      * a template deployment removes the associated deployment operations. Deleting
      * a template deployment does not affect the state of the resource group. This
      * is an asynchronous operation that returns a status of 202 until the template
      * deployment is successfully deleted. The Location response header contains
      * the URI that is used to obtain the status of the process. While the process
      * is running, a call to the URI in the Location header returns a status of
      * 202. When the process finishes, the URI in the Location header returns a
      * status of 204 on success. If the asynchronous request failed, the URI in the
      * Location header returns an error-level status code.
      *
      * @param {string} resourceGroupName The name of the resource group with the
      * deployment to delete. The name is case insensitive.
      *
      * @param {string} deploymentName The name of the deployment to delete.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<null>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def beginDeleteMethodWithHttpOperationResponse(resourceGroupName: String, deploymentName: String): js.Promise[HttpOperationResponse[Unit]] = js.native
    def beginDeleteMethodWithHttpOperationResponse(resourceGroupName: String, deploymentName: String, options: CustomHeaders): js.Promise[HttpOperationResponse[Unit]] = js.native
    
    /**
      * @summary Cancels a currently running template deployment.
      *
      * You can cancel a deployment only if the provisioningState is Accepted or
      * Running. After the deployment is canceled, the provisioningState is set to
      * Canceled. Canceling a template deployment stops the currently running
      * template deployment and leaves the resource group partially deployed.
      *
      * @param {string} resourceGroupName The name of the resource group. The name
      * is case insensitive.
      *
      * @param {string} deploymentName The name of the deployment to cancel.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {null} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {null} [result]   - The deserialized result object if an error did not occur.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def cancel(resourceGroupName: String, deploymentName: String): js.Promise[Unit] = js.native
    def cancel(resourceGroupName: String, deploymentName: String, callback: ServiceCallback[Unit]): Unit = js.native
    def cancel(resourceGroupName: String, deploymentName: String, options: CustomHeaders): js.Promise[Unit] = js.native
    def cancel(
      resourceGroupName: String,
      deploymentName: String,
      options: CustomHeaders,
      callback: ServiceCallback[Unit]
    ): Unit = js.native
    
    /**
      * @summary Cancels a currently running template deployment.
      *
      * You can cancel a deployment only if the provisioningState is Accepted or
      * Running. After the deployment is canceled, the provisioningState is set to
      * Canceled. Canceling a template deployment stops the currently running
      * template deployment and leaves the resources partially deployed.
      *
      * @param {string} deploymentName The name of the deployment to cancel.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {null} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {null} [result]   - The deserialized result object if an error did not occur.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def cancelAtSubscriptionScope(deploymentName: String): js.Promise[Unit] = js.native
    def cancelAtSubscriptionScope(deploymentName: String, callback: ServiceCallback[Unit]): Unit = js.native
    def cancelAtSubscriptionScope(deploymentName: String, options: CustomHeaders): js.Promise[Unit] = js.native
    def cancelAtSubscriptionScope(deploymentName: String, options: CustomHeaders, callback: ServiceCallback[Unit]): Unit = js.native
    
    /**
      * @summary Cancels a currently running template deployment.
      *
      * You can cancel a deployment only if the provisioningState is Accepted or
      * Running. After the deployment is canceled, the provisioningState is set to
      * Canceled. Canceling a template deployment stops the currently running
      * template deployment and leaves the resources partially deployed.
      *
      * @param {string} deploymentName The name of the deployment to cancel.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<null>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def cancelAtSubscriptionScopeWithHttpOperationResponse(deploymentName: String): js.Promise[HttpOperationResponse[Unit]] = js.native
    def cancelAtSubscriptionScopeWithHttpOperationResponse(deploymentName: String, options: CustomHeaders): js.Promise[HttpOperationResponse[Unit]] = js.native
    
    /**
      * @summary Cancels a currently running template deployment.
      *
      * You can cancel a deployment only if the provisioningState is Accepted or
      * Running. After the deployment is canceled, the provisioningState is set to
      * Canceled. Canceling a template deployment stops the currently running
      * template deployment and leaves the resource group partially deployed.
      *
      * @param {string} resourceGroupName The name of the resource group. The name
      * is case insensitive.
      *
      * @param {string} deploymentName The name of the deployment to cancel.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<null>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def cancelWithHttpOperationResponse(resourceGroupName: String, deploymentName: String): js.Promise[HttpOperationResponse[Unit]] = js.native
    def cancelWithHttpOperationResponse(resourceGroupName: String, deploymentName: String, options: CustomHeaders): js.Promise[HttpOperationResponse[Unit]] = js.native
    
    /**
      * Checks whether the deployment exists.
      *
      * @param {string} resourceGroupName The name of the resource group with the
      * deployment to check. The name is case insensitive.
      *
      * @param {string} deploymentName The name of the deployment to check.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {Boolean} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {Boolean} [result]   - The deserialized result object if an error did not occur.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def checkExistence(resourceGroupName: String, deploymentName: String): js.Promise[Boolean] = js.native
    def checkExistence(resourceGroupName: String, deploymentName: String, callback: ServiceCallback[Boolean]): Unit = js.native
    def checkExistence(resourceGroupName: String, deploymentName: String, options: CustomHeaders): js.Promise[Boolean] = js.native
    def checkExistence(
      resourceGroupName: String,
      deploymentName: String,
      options: CustomHeaders,
      callback: ServiceCallback[Boolean]
    ): Unit = js.native
    
    /**
      * Checks whether the deployment exists.
      *
      * @param {string} deploymentName The name of the deployment to check.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {Boolean} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {Boolean} [result]   - The deserialized result object if an error did not occur.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def checkExistenceAtSubscriptionScope(deploymentName: String): js.Promise[Boolean] = js.native
    def checkExistenceAtSubscriptionScope(deploymentName: String, callback: ServiceCallback[Boolean]): Unit = js.native
    def checkExistenceAtSubscriptionScope(deploymentName: String, options: CustomHeaders): js.Promise[Boolean] = js.native
    def checkExistenceAtSubscriptionScope(deploymentName: String, options: CustomHeaders, callback: ServiceCallback[Boolean]): Unit = js.native
    
    /**
      * Checks whether the deployment exists.
      *
      * @param {string} deploymentName The name of the deployment to check.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<Boolean>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def checkExistenceAtSubscriptionScopeWithHttpOperationResponse(deploymentName: String): js.Promise[HttpOperationResponse[Boolean]] = js.native
    def checkExistenceAtSubscriptionScopeWithHttpOperationResponse(deploymentName: String, options: CustomHeaders): js.Promise[HttpOperationResponse[Boolean]] = js.native
    
    /**
      * Checks whether the deployment exists.
      *
      * @param {string} resourceGroupName The name of the resource group with the
      * deployment to check. The name is case insensitive.
      *
      * @param {string} deploymentName The name of the deployment to check.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<Boolean>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def checkExistenceWithHttpOperationResponse(resourceGroupName: String, deploymentName: String): js.Promise[HttpOperationResponse[Boolean]] = js.native
    def checkExistenceWithHttpOperationResponse(resourceGroupName: String, deploymentName: String, options: CustomHeaders): js.Promise[HttpOperationResponse[Boolean]] = js.native
    
    /**
      * @summary Deploys resources to a resource group.
      *
      * You can provide the template and parameters directly in the request or link
      * to JSON files.
      *
      * @param {string} resourceGroupName The name of the resource group to deploy
      * the resources to. The name is case insensitive. The resource group must
      * already exist.
      *
      * @param {string} deploymentName The name of the deployment.
      *
      * @param {object} parameters Additional parameters supplied to the operation.
      *
      * @param {string} [parameters.location] The location to store the deployment
      * data.
      *
      * @param {object} parameters.properties The deployment properties.
      *
      * @param {object} [parameters.properties.template] The template content. You
      * use this element when you want to pass the template syntax directly in the
      * request rather than link to an existing template. It can be a JObject or
      * well-formed JSON string. Use either the templateLink property or the
      * template property, but not both.
      *
      * @param {object} [parameters.properties.templateLink] The URI of the
      * template. Use either the templateLink property or the template property, but
      * not both.
      *
      * @param {string} parameters.properties.templateLink.uri The URI of the
      * template to deploy.
      *
      * @param {string} [parameters.properties.templateLink.contentVersion] If
      * included, must match the ContentVersion in the template.
      *
      * @param {object} [parameters.properties.parameters] Name and value pairs that
      * define the deployment parameters for the template. You use this element when
      * you want to provide the parameter values directly in the request rather than
      * link to an existing parameter file. Use either the parametersLink property
      * or the parameters property, but not both. It can be a JObject or a well
      * formed JSON string.
      *
      * @param {object} [parameters.properties.parametersLink] The URI of parameters
      * file. You use this element to link to an existing parameters file. Use
      * either the parametersLink property or the parameters property, but not both.
      *
      * @param {string} parameters.properties.parametersLink.uri The URI of the
      * parameters file.
      *
      * @param {string} [parameters.properties.parametersLink.contentVersion] If
      * included, must match the ContentVersion in the template.
      *
      * @param {string} parameters.properties.mode The mode that is used to deploy
      * resources. This value can be either Incremental or Complete. In Incremental
      * mode, resources are deployed without deleting existing resources that are
      * not included in the template. In Complete mode, resources are deployed and
      * existing resources in the resource group that are not included in the
      * template are deleted. Be careful when using Complete mode as you may
      * unintentionally delete resources. Possible values include: 'Incremental',
      * 'Complete'
      *
      * @param {object} [parameters.properties.debugSetting] The debug setting of
      * the deployment.
      *
      * @param {string} [parameters.properties.debugSetting.detailLevel] Specifies
      * the type of information to log for debugging. The permitted values are none,
      * requestContent, responseContent, or both requestContent and responseContent
      * separated by a comma. The default is none. When setting this value,
      * carefully consider the type of information you are passing in during
      * deployment. By logging information about the request or response, you could
      * potentially expose sensitive data that is retrieved through the deployment
      * operations.
      *
      * @param {object} [parameters.properties.onErrorDeployment] The deployment on
      * error behavior.
      *
      * @param {string} [parameters.properties.onErrorDeployment.type] The
      * deployment on error behavior type. Possible values are LastSuccessful and
      * SpecificDeployment. Possible values include: 'LastSuccessful',
      * 'SpecificDeployment'
      *
      * @param {string} [parameters.properties.onErrorDeployment.deploymentName] The
      * deployment to be used on error case.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {DeploymentExtended} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {DeploymentExtended} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link DeploymentExtended} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def createOrUpdate(resourceGroupName: String, deploymentName: String, parameters: Deployment): js.Promise[DeploymentExtended] = js.native
    def createOrUpdate(
      resourceGroupName: String,
      deploymentName: String,
      parameters: Deployment,
      callback: ServiceCallback[DeploymentExtended]
    ): Unit = js.native
    def createOrUpdate(resourceGroupName: String, deploymentName: String, parameters: Deployment, options: CustomHeaders): js.Promise[DeploymentExtended] = js.native
    def createOrUpdate(
      resourceGroupName: String,
      deploymentName: String,
      parameters: Deployment,
      options: CustomHeaders,
      callback: ServiceCallback[DeploymentExtended]
    ): Unit = js.native
    
    /**
      * @summary Deploys resources at subscription scope.
      *
      * You can provide the template and parameters directly in the request or link
      * to JSON files.
      *
      * @param {string} deploymentName The name of the deployment.
      *
      * @param {object} parameters Additional parameters supplied to the operation.
      *
      * @param {string} [parameters.location] The location to store the deployment
      * data.
      *
      * @param {object} parameters.properties The deployment properties.
      *
      * @param {object} [parameters.properties.template] The template content. You
      * use this element when you want to pass the template syntax directly in the
      * request rather than link to an existing template. It can be a JObject or
      * well-formed JSON string. Use either the templateLink property or the
      * template property, but not both.
      *
      * @param {object} [parameters.properties.templateLink] The URI of the
      * template. Use either the templateLink property or the template property, but
      * not both.
      *
      * @param {string} parameters.properties.templateLink.uri The URI of the
      * template to deploy.
      *
      * @param {string} [parameters.properties.templateLink.contentVersion] If
      * included, must match the ContentVersion in the template.
      *
      * @param {object} [parameters.properties.parameters] Name and value pairs that
      * define the deployment parameters for the template. You use this element when
      * you want to provide the parameter values directly in the request rather than
      * link to an existing parameter file. Use either the parametersLink property
      * or the parameters property, but not both. It can be a JObject or a well
      * formed JSON string.
      *
      * @param {object} [parameters.properties.parametersLink] The URI of parameters
      * file. You use this element to link to an existing parameters file. Use
      * either the parametersLink property or the parameters property, but not both.
      *
      * @param {string} parameters.properties.parametersLink.uri The URI of the
      * parameters file.
      *
      * @param {string} [parameters.properties.parametersLink.contentVersion] If
      * included, must match the ContentVersion in the template.
      *
      * @param {string} parameters.properties.mode The mode that is used to deploy
      * resources. This value can be either Incremental or Complete. In Incremental
      * mode, resources are deployed without deleting existing resources that are
      * not included in the template. In Complete mode, resources are deployed and
      * existing resources in the resource group that are not included in the
      * template are deleted. Be careful when using Complete mode as you may
      * unintentionally delete resources. Possible values include: 'Incremental',
      * 'Complete'
      *
      * @param {object} [parameters.properties.debugSetting] The debug setting of
      * the deployment.
      *
      * @param {string} [parameters.properties.debugSetting.detailLevel] Specifies
      * the type of information to log for debugging. The permitted values are none,
      * requestContent, responseContent, or both requestContent and responseContent
      * separated by a comma. The default is none. When setting this value,
      * carefully consider the type of information you are passing in during
      * deployment. By logging information about the request or response, you could
      * potentially expose sensitive data that is retrieved through the deployment
      * operations.
      *
      * @param {object} [parameters.properties.onErrorDeployment] The deployment on
      * error behavior.
      *
      * @param {string} [parameters.properties.onErrorDeployment.type] The
      * deployment on error behavior type. Possible values are LastSuccessful and
      * SpecificDeployment. Possible values include: 'LastSuccessful',
      * 'SpecificDeployment'
      *
      * @param {string} [parameters.properties.onErrorDeployment.deploymentName] The
      * deployment to be used on error case.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {DeploymentExtended} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {DeploymentExtended} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link DeploymentExtended} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def createOrUpdateAtSubscriptionScope(deploymentName: String, parameters: Deployment): js.Promise[DeploymentExtended] = js.native
    def createOrUpdateAtSubscriptionScope(deploymentName: String, parameters: Deployment, callback: ServiceCallback[DeploymentExtended]): Unit = js.native
    def createOrUpdateAtSubscriptionScope(deploymentName: String, parameters: Deployment, options: CustomHeaders): js.Promise[DeploymentExtended] = js.native
    def createOrUpdateAtSubscriptionScope(
      deploymentName: String,
      parameters: Deployment,
      options: CustomHeaders,
      callback: ServiceCallback[DeploymentExtended]
    ): Unit = js.native
    
    /**
      * @summary Deploys resources at subscription scope.
      *
      * You can provide the template and parameters directly in the request or link
      * to JSON files.
      *
      * @param {string} deploymentName The name of the deployment.
      *
      * @param {object} parameters Additional parameters supplied to the operation.
      *
      * @param {string} [parameters.location] The location to store the deployment
      * data.
      *
      * @param {object} parameters.properties The deployment properties.
      *
      * @param {object} [parameters.properties.template] The template content. You
      * use this element when you want to pass the template syntax directly in the
      * request rather than link to an existing template. It can be a JObject or
      * well-formed JSON string. Use either the templateLink property or the
      * template property, but not both.
      *
      * @param {object} [parameters.properties.templateLink] The URI of the
      * template. Use either the templateLink property or the template property, but
      * not both.
      *
      * @param {string} parameters.properties.templateLink.uri The URI of the
      * template to deploy.
      *
      * @param {string} [parameters.properties.templateLink.contentVersion] If
      * included, must match the ContentVersion in the template.
      *
      * @param {object} [parameters.properties.parameters] Name and value pairs that
      * define the deployment parameters for the template. You use this element when
      * you want to provide the parameter values directly in the request rather than
      * link to an existing parameter file. Use either the parametersLink property
      * or the parameters property, but not both. It can be a JObject or a well
      * formed JSON string.
      *
      * @param {object} [parameters.properties.parametersLink] The URI of parameters
      * file. You use this element to link to an existing parameters file. Use
      * either the parametersLink property or the parameters property, but not both.
      *
      * @param {string} parameters.properties.parametersLink.uri The URI of the
      * parameters file.
      *
      * @param {string} [parameters.properties.parametersLink.contentVersion] If
      * included, must match the ContentVersion in the template.
      *
      * @param {string} parameters.properties.mode The mode that is used to deploy
      * resources. This value can be either Incremental or Complete. In Incremental
      * mode, resources are deployed without deleting existing resources that are
      * not included in the template. In Complete mode, resources are deployed and
      * existing resources in the resource group that are not included in the
      * template are deleted. Be careful when using Complete mode as you may
      * unintentionally delete resources. Possible values include: 'Incremental',
      * 'Complete'
      *
      * @param {object} [parameters.properties.debugSetting] The debug setting of
      * the deployment.
      *
      * @param {string} [parameters.properties.debugSetting.detailLevel] Specifies
      * the type of information to log for debugging. The permitted values are none,
      * requestContent, responseContent, or both requestContent and responseContent
      * separated by a comma. The default is none. When setting this value,
      * carefully consider the type of information you are passing in during
      * deployment. By logging information about the request or response, you could
      * potentially expose sensitive data that is retrieved through the deployment
      * operations.
      *
      * @param {object} [parameters.properties.onErrorDeployment] The deployment on
      * error behavior.
      *
      * @param {string} [parameters.properties.onErrorDeployment.type] The
      * deployment on error behavior type. Possible values are LastSuccessful and
      * SpecificDeployment. Possible values include: 'LastSuccessful',
      * 'SpecificDeployment'
      *
      * @param {string} [parameters.properties.onErrorDeployment.deploymentName] The
      * deployment to be used on error case.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<DeploymentExtended>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def createOrUpdateAtSubscriptionScopeWithHttpOperationResponse(deploymentName: String, parameters: Deployment): js.Promise[HttpOperationResponse[DeploymentExtended]] = js.native
    def createOrUpdateAtSubscriptionScopeWithHttpOperationResponse(deploymentName: String, parameters: Deployment, options: CustomHeaders): js.Promise[HttpOperationResponse[DeploymentExtended]] = js.native
    
    /**
      * @summary Deploys resources to a resource group.
      *
      * You can provide the template and parameters directly in the request or link
      * to JSON files.
      *
      * @param {string} resourceGroupName The name of the resource group to deploy
      * the resources to. The name is case insensitive. The resource group must
      * already exist.
      *
      * @param {string} deploymentName The name of the deployment.
      *
      * @param {object} parameters Additional parameters supplied to the operation.
      *
      * @param {string} [parameters.location] The location to store the deployment
      * data.
      *
      * @param {object} parameters.properties The deployment properties.
      *
      * @param {object} [parameters.properties.template] The template content. You
      * use this element when you want to pass the template syntax directly in the
      * request rather than link to an existing template. It can be a JObject or
      * well-formed JSON string. Use either the templateLink property or the
      * template property, but not both.
      *
      * @param {object} [parameters.properties.templateLink] The URI of the
      * template. Use either the templateLink property or the template property, but
      * not both.
      *
      * @param {string} parameters.properties.templateLink.uri The URI of the
      * template to deploy.
      *
      * @param {string} [parameters.properties.templateLink.contentVersion] If
      * included, must match the ContentVersion in the template.
      *
      * @param {object} [parameters.properties.parameters] Name and value pairs that
      * define the deployment parameters for the template. You use this element when
      * you want to provide the parameter values directly in the request rather than
      * link to an existing parameter file. Use either the parametersLink property
      * or the parameters property, but not both. It can be a JObject or a well
      * formed JSON string.
      *
      * @param {object} [parameters.properties.parametersLink] The URI of parameters
      * file. You use this element to link to an existing parameters file. Use
      * either the parametersLink property or the parameters property, but not both.
      *
      * @param {string} parameters.properties.parametersLink.uri The URI of the
      * parameters file.
      *
      * @param {string} [parameters.properties.parametersLink.contentVersion] If
      * included, must match the ContentVersion in the template.
      *
      * @param {string} parameters.properties.mode The mode that is used to deploy
      * resources. This value can be either Incremental or Complete. In Incremental
      * mode, resources are deployed without deleting existing resources that are
      * not included in the template. In Complete mode, resources are deployed and
      * existing resources in the resource group that are not included in the
      * template are deleted. Be careful when using Complete mode as you may
      * unintentionally delete resources. Possible values include: 'Incremental',
      * 'Complete'
      *
      * @param {object} [parameters.properties.debugSetting] The debug setting of
      * the deployment.
      *
      * @param {string} [parameters.properties.debugSetting.detailLevel] Specifies
      * the type of information to log for debugging. The permitted values are none,
      * requestContent, responseContent, or both requestContent and responseContent
      * separated by a comma. The default is none. When setting this value,
      * carefully consider the type of information you are passing in during
      * deployment. By logging information about the request or response, you could
      * potentially expose sensitive data that is retrieved through the deployment
      * operations.
      *
      * @param {object} [parameters.properties.onErrorDeployment] The deployment on
      * error behavior.
      *
      * @param {string} [parameters.properties.onErrorDeployment.type] The
      * deployment on error behavior type. Possible values are LastSuccessful and
      * SpecificDeployment. Possible values include: 'LastSuccessful',
      * 'SpecificDeployment'
      *
      * @param {string} [parameters.properties.onErrorDeployment.deploymentName] The
      * deployment to be used on error case.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<DeploymentExtended>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def createOrUpdateWithHttpOperationResponse(resourceGroupName: String, deploymentName: String, parameters: Deployment): js.Promise[HttpOperationResponse[DeploymentExtended]] = js.native
    def createOrUpdateWithHttpOperationResponse(resourceGroupName: String, deploymentName: String, parameters: Deployment, options: CustomHeaders): js.Promise[HttpOperationResponse[DeploymentExtended]] = js.native
    
    /**
      * @summary Deletes a deployment from the deployment history.
      *
      * A template deployment that is currently running cannot be deleted. Deleting
      * a template deployment removes the associated deployment operations. This is
      * an asynchronous operation that returns a status of 202 until the template
      * deployment is successfully deleted. The Location response header contains
      * the URI that is used to obtain the status of the process. While the process
      * is running, a call to the URI in the Location header returns a status of
      * 202. When the process finishes, the URI in the Location header returns a
      * status of 204 on success. If the asynchronous request failed, the URI in the
      * Location header returns an error-level status code.
      *
      * @param {string} deploymentName The name of the deployment to delete.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {null} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {null} [result]   - The deserialized result object if an error did not occur.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def deleteAtSubscriptionScope(deploymentName: String): js.Promise[Unit] = js.native
    def deleteAtSubscriptionScope(deploymentName: String, callback: ServiceCallback[Unit]): Unit = js.native
    def deleteAtSubscriptionScope(deploymentName: String, options: CustomHeaders): js.Promise[Unit] = js.native
    def deleteAtSubscriptionScope(deploymentName: String, options: CustomHeaders, callback: ServiceCallback[Unit]): Unit = js.native
    
    /**
      * @summary Deletes a deployment from the deployment history.
      *
      * A template deployment that is currently running cannot be deleted. Deleting
      * a template deployment removes the associated deployment operations. This is
      * an asynchronous operation that returns a status of 202 until the template
      * deployment is successfully deleted. The Location response header contains
      * the URI that is used to obtain the status of the process. While the process
      * is running, a call to the URI in the Location header returns a status of
      * 202. When the process finishes, the URI in the Location header returns a
      * status of 204 on success. If the asynchronous request failed, the URI in the
      * Location header returns an error-level status code.
      *
      * @param {string} deploymentName The name of the deployment to delete.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<null>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def deleteAtSubscriptionScopeWithHttpOperationResponse(deploymentName: String): js.Promise[HttpOperationResponse[Unit]] = js.native
    def deleteAtSubscriptionScopeWithHttpOperationResponse(deploymentName: String, options: CustomHeaders): js.Promise[HttpOperationResponse[Unit]] = js.native
    
    /**
      * @summary Deletes a deployment from the deployment history.
      *
      * A template deployment that is currently running cannot be deleted. Deleting
      * a template deployment removes the associated deployment operations. Deleting
      * a template deployment does not affect the state of the resource group. This
      * is an asynchronous operation that returns a status of 202 until the template
      * deployment is successfully deleted. The Location response header contains
      * the URI that is used to obtain the status of the process. While the process
      * is running, a call to the URI in the Location header returns a status of
      * 202. When the process finishes, the URI in the Location header returns a
      * status of 204 on success. If the asynchronous request failed, the URI in the
      * Location header returns an error-level status code.
      *
      * @param {string} resourceGroupName The name of the resource group with the
      * deployment to delete. The name is case insensitive.
      *
      * @param {string} deploymentName The name of the deployment to delete.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {null} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {null} [result]   - The deserialized result object if an error did not occur.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def deleteMethod(resourceGroupName: String, deploymentName: String): js.Promise[Unit] = js.native
    def deleteMethod(resourceGroupName: String, deploymentName: String, callback: ServiceCallback[Unit]): Unit = js.native
    def deleteMethod(resourceGroupName: String, deploymentName: String, options: CustomHeaders): js.Promise[Unit] = js.native
    def deleteMethod(
      resourceGroupName: String,
      deploymentName: String,
      options: CustomHeaders,
      callback: ServiceCallback[Unit]
    ): Unit = js.native
    
    /**
      * @summary Deletes a deployment from the deployment history.
      *
      * A template deployment that is currently running cannot be deleted. Deleting
      * a template deployment removes the associated deployment operations. Deleting
      * a template deployment does not affect the state of the resource group. This
      * is an asynchronous operation that returns a status of 202 until the template
      * deployment is successfully deleted. The Location response header contains
      * the URI that is used to obtain the status of the process. While the process
      * is running, a call to the URI in the Location header returns a status of
      * 202. When the process finishes, the URI in the Location header returns a
      * status of 204 on success. If the asynchronous request failed, the URI in the
      * Location header returns an error-level status code.
      *
      * @param {string} resourceGroupName The name of the resource group with the
      * deployment to delete. The name is case insensitive.
      *
      * @param {string} deploymentName The name of the deployment to delete.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<null>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def deleteMethodWithHttpOperationResponse(resourceGroupName: String, deploymentName: String): js.Promise[HttpOperationResponse[Unit]] = js.native
    def deleteMethodWithHttpOperationResponse(resourceGroupName: String, deploymentName: String, options: CustomHeaders): js.Promise[HttpOperationResponse[Unit]] = js.native
    
    /**
      * Exports the template used for specified deployment.
      *
      * @param {string} resourceGroupName The name of the resource group. The name
      * is case insensitive.
      *
      * @param {string} deploymentName The name of the deployment from which to get
      * the template.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {DeploymentExportResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {DeploymentExportResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link DeploymentExportResult} for more
      *                      information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def exportTemplate(resourceGroupName: String, deploymentName: String): js.Promise[DeploymentExportResult] = js.native
    def exportTemplate(
      resourceGroupName: String,
      deploymentName: String,
      callback: ServiceCallback[DeploymentExportResult]
    ): Unit = js.native
    def exportTemplate(resourceGroupName: String, deploymentName: String, options: CustomHeaders): js.Promise[DeploymentExportResult] = js.native
    def exportTemplate(
      resourceGroupName: String,
      deploymentName: String,
      options: CustomHeaders,
      callback: ServiceCallback[DeploymentExportResult]
    ): Unit = js.native
    
    /**
      * Exports the template used for specified deployment.
      *
      * @param {string} deploymentName The name of the deployment from which to get
      * the template.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {DeploymentExportResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {DeploymentExportResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link DeploymentExportResult} for more
      *                      information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def exportTemplateAtSubscriptionScope(deploymentName: String): js.Promise[DeploymentExportResult] = js.native
    def exportTemplateAtSubscriptionScope(deploymentName: String, callback: ServiceCallback[DeploymentExportResult]): Unit = js.native
    def exportTemplateAtSubscriptionScope(deploymentName: String, options: CustomHeaders): js.Promise[DeploymentExportResult] = js.native
    def exportTemplateAtSubscriptionScope(deploymentName: String, options: CustomHeaders, callback: ServiceCallback[DeploymentExportResult]): Unit = js.native
    
    /**
      * Exports the template used for specified deployment.
      *
      * @param {string} deploymentName The name of the deployment from which to get
      * the template.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<DeploymentExportResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def exportTemplateAtSubscriptionScopeWithHttpOperationResponse(deploymentName: String): js.Promise[HttpOperationResponse[DeploymentExportResult]] = js.native
    def exportTemplateAtSubscriptionScopeWithHttpOperationResponse(deploymentName: String, options: CustomHeaders): js.Promise[HttpOperationResponse[DeploymentExportResult]] = js.native
    
    /**
      * Exports the template used for specified deployment.
      *
      * @param {string} resourceGroupName The name of the resource group. The name
      * is case insensitive.
      *
      * @param {string} deploymentName The name of the deployment from which to get
      * the template.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<DeploymentExportResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def exportTemplateWithHttpOperationResponse(resourceGroupName: String, deploymentName: String): js.Promise[HttpOperationResponse[DeploymentExportResult]] = js.native
    def exportTemplateWithHttpOperationResponse(resourceGroupName: String, deploymentName: String, options: CustomHeaders): js.Promise[HttpOperationResponse[DeploymentExportResult]] = js.native
    
    /**
      * Gets a deployment.
      *
      * @param {string} resourceGroupName The name of the resource group. The name
      * is case insensitive.
      *
      * @param {string} deploymentName The name of the deployment to get.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {DeploymentExtended} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {DeploymentExtended} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link DeploymentExtended} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def get(resourceGroupName: String, deploymentName: String): js.Promise[DeploymentExtended] = js.native
    def get(resourceGroupName: String, deploymentName: String, callback: ServiceCallback[DeploymentExtended]): Unit = js.native
    def get(resourceGroupName: String, deploymentName: String, options: CustomHeaders): js.Promise[DeploymentExtended] = js.native
    def get(
      resourceGroupName: String,
      deploymentName: String,
      options: CustomHeaders,
      callback: ServiceCallback[DeploymentExtended]
    ): Unit = js.native
    
    /**
      * Gets a deployment.
      *
      * @param {string} deploymentName The name of the deployment to get.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {DeploymentExtended} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {DeploymentExtended} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link DeploymentExtended} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def getAtSubscriptionScope(deploymentName: String): js.Promise[DeploymentExtended] = js.native
    def getAtSubscriptionScope(deploymentName: String, callback: ServiceCallback[DeploymentExtended]): Unit = js.native
    def getAtSubscriptionScope(deploymentName: String, options: CustomHeaders): js.Promise[DeploymentExtended] = js.native
    def getAtSubscriptionScope(deploymentName: String, options: CustomHeaders, callback: ServiceCallback[DeploymentExtended]): Unit = js.native
    
    /**
      * Gets a deployment.
      *
      * @param {string} deploymentName The name of the deployment to get.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<DeploymentExtended>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def getAtSubscriptionScopeWithHttpOperationResponse(deploymentName: String): js.Promise[HttpOperationResponse[DeploymentExtended]] = js.native
    def getAtSubscriptionScopeWithHttpOperationResponse(deploymentName: String, options: CustomHeaders): js.Promise[HttpOperationResponse[DeploymentExtended]] = js.native
    
    /**
      * Gets a deployment.
      *
      * @param {string} resourceGroupName The name of the resource group. The name
      * is case insensitive.
      *
      * @param {string} deploymentName The name of the deployment to get.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<DeploymentExtended>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def getWithHttpOperationResponse(resourceGroupName: String, deploymentName: String): js.Promise[HttpOperationResponse[DeploymentExtended]] = js.native
    def getWithHttpOperationResponse(resourceGroupName: String, deploymentName: String, options: CustomHeaders): js.Promise[HttpOperationResponse[DeploymentExtended]] = js.native
    
    /**
      * Get all the deployments for a subscription.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {string} [options.filter] The filter to apply on the operation. For
      * example, you can use $filter=provisioningState eq '{state}'.
      *
      * @param {number} [options.top] The number of results to get. If null is
      * passed, returns all deployments.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {DeploymentListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {DeploymentListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link DeploymentListResult} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def listAtSubscriptionScope(): js.Promise[DeploymentListResult] = js.native
    def listAtSubscriptionScope(callback: ServiceCallback[DeploymentListResult]): Unit = js.native
    def listAtSubscriptionScope(options: Top): js.Promise[DeploymentListResult] = js.native
    def listAtSubscriptionScope(options: Top, callback: ServiceCallback[DeploymentListResult]): Unit = js.native
    
    /**
      * Get all the deployments for a subscription.
      *
      * @param {string} nextPageLink The NextLink from the previous successful call
      * to List operation.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {DeploymentListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {DeploymentListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link DeploymentListResult} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def listAtSubscriptionScopeNext(nextPageLink: String): js.Promise[DeploymentListResult] = js.native
    def listAtSubscriptionScopeNext(nextPageLink: String, callback: ServiceCallback[DeploymentListResult]): Unit = js.native
    def listAtSubscriptionScopeNext(nextPageLink: String, options: CustomHeaders): js.Promise[DeploymentListResult] = js.native
    def listAtSubscriptionScopeNext(nextPageLink: String, options: CustomHeaders, callback: ServiceCallback[DeploymentListResult]): Unit = js.native
    
    /**
      * Get all the deployments for a subscription.
      *
      * @param {string} nextPageLink The NextLink from the previous successful call
      * to List operation.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<DeploymentListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listAtSubscriptionScopeNextWithHttpOperationResponse(nextPageLink: String): js.Promise[HttpOperationResponse[DeploymentListResult]] = js.native
    def listAtSubscriptionScopeNextWithHttpOperationResponse(nextPageLink: String, options: CustomHeaders): js.Promise[HttpOperationResponse[DeploymentListResult]] = js.native
    
    /**
      * Get all the deployments for a subscription.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {string} [options.filter] The filter to apply on the operation. For
      * example, you can use $filter=provisioningState eq '{state}'.
      *
      * @param {number} [options.top] The number of results to get. If null is
      * passed, returns all deployments.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<DeploymentListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listAtSubscriptionScopeWithHttpOperationResponse(): js.Promise[HttpOperationResponse[DeploymentListResult]] = js.native
    def listAtSubscriptionScopeWithHttpOperationResponse(options: Top): js.Promise[HttpOperationResponse[DeploymentListResult]] = js.native
    
    /**
      * Get all the deployments for a resource group.
      *
      * @param {string} resourceGroupName The name of the resource group with the
      * deployments to get. The name is case insensitive.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {string} [options.filter] The filter to apply on the operation. For
      * example, you can use $filter=provisioningState eq '{state}'.
      *
      * @param {number} [options.top] The number of results to get. If null is
      * passed, returns all deployments.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {DeploymentListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {DeploymentListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link DeploymentListResult} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def listByResourceGroup(resourceGroupName: String): js.Promise[DeploymentListResult] = js.native
    def listByResourceGroup(resourceGroupName: String, callback: ServiceCallback[DeploymentListResult]): Unit = js.native
    def listByResourceGroup(resourceGroupName: String, options: Top): js.Promise[DeploymentListResult] = js.native
    def listByResourceGroup(resourceGroupName: String, options: Top, callback: ServiceCallback[DeploymentListResult]): Unit = js.native
    
    /**
      * Get all the deployments for a resource group.
      *
      * @param {string} nextPageLink The NextLink from the previous successful call
      * to List operation.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {DeploymentListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {DeploymentListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link DeploymentListResult} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def listByResourceGroupNext(nextPageLink: String): js.Promise[DeploymentListResult] = js.native
    def listByResourceGroupNext(nextPageLink: String, callback: ServiceCallback[DeploymentListResult]): Unit = js.native
    def listByResourceGroupNext(nextPageLink: String, options: CustomHeaders): js.Promise[DeploymentListResult] = js.native
    def listByResourceGroupNext(nextPageLink: String, options: CustomHeaders, callback: ServiceCallback[DeploymentListResult]): Unit = js.native
    
    /**
      * Get all the deployments for a resource group.
      *
      * @param {string} nextPageLink The NextLink from the previous successful call
      * to List operation.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<DeploymentListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listByResourceGroupNextWithHttpOperationResponse(nextPageLink: String): js.Promise[HttpOperationResponse[DeploymentListResult]] = js.native
    def listByResourceGroupNextWithHttpOperationResponse(nextPageLink: String, options: CustomHeaders): js.Promise[HttpOperationResponse[DeploymentListResult]] = js.native
    
    /**
      * Get all the deployments for a resource group.
      *
      * @param {string} resourceGroupName The name of the resource group with the
      * deployments to get. The name is case insensitive.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {string} [options.filter] The filter to apply on the operation. For
      * example, you can use $filter=provisioningState eq '{state}'.
      *
      * @param {number} [options.top] The number of results to get. If null is
      * passed, returns all deployments.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<DeploymentListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listByResourceGroupWithHttpOperationResponse(resourceGroupName: String): js.Promise[HttpOperationResponse[DeploymentListResult]] = js.native
    def listByResourceGroupWithHttpOperationResponse(resourceGroupName: String, options: Top): js.Promise[HttpOperationResponse[DeploymentListResult]] = js.native
    
    /**
      * Validates whether the specified template is syntactically correct and will
      * be accepted by Azure Resource Manager..
      *
      * @param {string} resourceGroupName The name of the resource group the
      * template will be deployed to. The name is case insensitive.
      *
      * @param {string} deploymentName The name of the deployment.
      *
      * @param {object} parameters Parameters to validate.
      *
      * @param {string} [parameters.location] The location to store the deployment
      * data.
      *
      * @param {object} parameters.properties The deployment properties.
      *
      * @param {object} [parameters.properties.template] The template content. You
      * use this element when you want to pass the template syntax directly in the
      * request rather than link to an existing template. It can be a JObject or
      * well-formed JSON string. Use either the templateLink property or the
      * template property, but not both.
      *
      * @param {object} [parameters.properties.templateLink] The URI of the
      * template. Use either the templateLink property or the template property, but
      * not both.
      *
      * @param {string} parameters.properties.templateLink.uri The URI of the
      * template to deploy.
      *
      * @param {string} [parameters.properties.templateLink.contentVersion] If
      * included, must match the ContentVersion in the template.
      *
      * @param {object} [parameters.properties.parameters] Name and value pairs that
      * define the deployment parameters for the template. You use this element when
      * you want to provide the parameter values directly in the request rather than
      * link to an existing parameter file. Use either the parametersLink property
      * or the parameters property, but not both. It can be a JObject or a well
      * formed JSON string.
      *
      * @param {object} [parameters.properties.parametersLink] The URI of parameters
      * file. You use this element to link to an existing parameters file. Use
      * either the parametersLink property or the parameters property, but not both.
      *
      * @param {string} parameters.properties.parametersLink.uri The URI of the
      * parameters file.
      *
      * @param {string} [parameters.properties.parametersLink.contentVersion] If
      * included, must match the ContentVersion in the template.
      *
      * @param {string} parameters.properties.mode The mode that is used to deploy
      * resources. This value can be either Incremental or Complete. In Incremental
      * mode, resources are deployed without deleting existing resources that are
      * not included in the template. In Complete mode, resources are deployed and
      * existing resources in the resource group that are not included in the
      * template are deleted. Be careful when using Complete mode as you may
      * unintentionally delete resources. Possible values include: 'Incremental',
      * 'Complete'
      *
      * @param {object} [parameters.properties.debugSetting] The debug setting of
      * the deployment.
      *
      * @param {string} [parameters.properties.debugSetting.detailLevel] Specifies
      * the type of information to log for debugging. The permitted values are none,
      * requestContent, responseContent, or both requestContent and responseContent
      * separated by a comma. The default is none. When setting this value,
      * carefully consider the type of information you are passing in during
      * deployment. By logging information about the request or response, you could
      * potentially expose sensitive data that is retrieved through the deployment
      * operations.
      *
      * @param {object} [parameters.properties.onErrorDeployment] The deployment on
      * error behavior.
      *
      * @param {string} [parameters.properties.onErrorDeployment.type] The
      * deployment on error behavior type. Possible values are LastSuccessful and
      * SpecificDeployment. Possible values include: 'LastSuccessful',
      * 'SpecificDeployment'
      *
      * @param {string} [parameters.properties.onErrorDeployment.deploymentName] The
      * deployment to be used on error case.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {DeploymentValidateResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {DeploymentValidateResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link DeploymentValidateResult} for more
      *                      information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def validate(resourceGroupName: String, deploymentName: String, parameters: Deployment): js.Promise[DeploymentValidateResult] = js.native
    def validate(
      resourceGroupName: String,
      deploymentName: String,
      parameters: Deployment,
      callback: ServiceCallback[DeploymentValidateResult]
    ): Unit = js.native
    def validate(resourceGroupName: String, deploymentName: String, parameters: Deployment, options: CustomHeaders): js.Promise[DeploymentValidateResult] = js.native
    def validate(
      resourceGroupName: String,
      deploymentName: String,
      parameters: Deployment,
      options: CustomHeaders,
      callback: ServiceCallback[DeploymentValidateResult]
    ): Unit = js.native
    
    /**
      * Validates whether the specified template is syntactically correct and will
      * be accepted by Azure Resource Manager..
      *
      * @param {string} deploymentName The name of the deployment.
      *
      * @param {object} parameters Parameters to validate.
      *
      * @param {string} [parameters.location] The location to store the deployment
      * data.
      *
      * @param {object} parameters.properties The deployment properties.
      *
      * @param {object} [parameters.properties.template] The template content. You
      * use this element when you want to pass the template syntax directly in the
      * request rather than link to an existing template. It can be a JObject or
      * well-formed JSON string. Use either the templateLink property or the
      * template property, but not both.
      *
      * @param {object} [parameters.properties.templateLink] The URI of the
      * template. Use either the templateLink property or the template property, but
      * not both.
      *
      * @param {string} parameters.properties.templateLink.uri The URI of the
      * template to deploy.
      *
      * @param {string} [parameters.properties.templateLink.contentVersion] If
      * included, must match the ContentVersion in the template.
      *
      * @param {object} [parameters.properties.parameters] Name and value pairs that
      * define the deployment parameters for the template. You use this element when
      * you want to provide the parameter values directly in the request rather than
      * link to an existing parameter file. Use either the parametersLink property
      * or the parameters property, but not both. It can be a JObject or a well
      * formed JSON string.
      *
      * @param {object} [parameters.properties.parametersLink] The URI of parameters
      * file. You use this element to link to an existing parameters file. Use
      * either the parametersLink property or the parameters property, but not both.
      *
      * @param {string} parameters.properties.parametersLink.uri The URI of the
      * parameters file.
      *
      * @param {string} [parameters.properties.parametersLink.contentVersion] If
      * included, must match the ContentVersion in the template.
      *
      * @param {string} parameters.properties.mode The mode that is used to deploy
      * resources. This value can be either Incremental or Complete. In Incremental
      * mode, resources are deployed without deleting existing resources that are
      * not included in the template. In Complete mode, resources are deployed and
      * existing resources in the resource group that are not included in the
      * template are deleted. Be careful when using Complete mode as you may
      * unintentionally delete resources. Possible values include: 'Incremental',
      * 'Complete'
      *
      * @param {object} [parameters.properties.debugSetting] The debug setting of
      * the deployment.
      *
      * @param {string} [parameters.properties.debugSetting.detailLevel] Specifies
      * the type of information to log for debugging. The permitted values are none,
      * requestContent, responseContent, or both requestContent and responseContent
      * separated by a comma. The default is none. When setting this value,
      * carefully consider the type of information you are passing in during
      * deployment. By logging information about the request or response, you could
      * potentially expose sensitive data that is retrieved through the deployment
      * operations.
      *
      * @param {object} [parameters.properties.onErrorDeployment] The deployment on
      * error behavior.
      *
      * @param {string} [parameters.properties.onErrorDeployment.type] The
      * deployment on error behavior type. Possible values are LastSuccessful and
      * SpecificDeployment. Possible values include: 'LastSuccessful',
      * 'SpecificDeployment'
      *
      * @param {string} [parameters.properties.onErrorDeployment.deploymentName] The
      * deployment to be used on error case.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {DeploymentValidateResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {DeploymentValidateResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link DeploymentValidateResult} for more
      *                      information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def validateAtSubscriptionScope(deploymentName: String, parameters: Deployment): js.Promise[DeploymentValidateResult] = js.native
    def validateAtSubscriptionScope(
      deploymentName: String,
      parameters: Deployment,
      callback: ServiceCallback[DeploymentValidateResult]
    ): Unit = js.native
    def validateAtSubscriptionScope(deploymentName: String, parameters: Deployment, options: CustomHeaders): js.Promise[DeploymentValidateResult] = js.native
    def validateAtSubscriptionScope(
      deploymentName: String,
      parameters: Deployment,
      options: CustomHeaders,
      callback: ServiceCallback[DeploymentValidateResult]
    ): Unit = js.native
    
    /**
      * Validates whether the specified template is syntactically correct and will
      * be accepted by Azure Resource Manager..
      *
      * @param {string} deploymentName The name of the deployment.
      *
      * @param {object} parameters Parameters to validate.
      *
      * @param {string} [parameters.location] The location to store the deployment
      * data.
      *
      * @param {object} parameters.properties The deployment properties.
      *
      * @param {object} [parameters.properties.template] The template content. You
      * use this element when you want to pass the template syntax directly in the
      * request rather than link to an existing template. It can be a JObject or
      * well-formed JSON string. Use either the templateLink property or the
      * template property, but not both.
      *
      * @param {object} [parameters.properties.templateLink] The URI of the
      * template. Use either the templateLink property or the template property, but
      * not both.
      *
      * @param {string} parameters.properties.templateLink.uri The URI of the
      * template to deploy.
      *
      * @param {string} [parameters.properties.templateLink.contentVersion] If
      * included, must match the ContentVersion in the template.
      *
      * @param {object} [parameters.properties.parameters] Name and value pairs that
      * define the deployment parameters for the template. You use this element when
      * you want to provide the parameter values directly in the request rather than
      * link to an existing parameter file. Use either the parametersLink property
      * or the parameters property, but not both. It can be a JObject or a well
      * formed JSON string.
      *
      * @param {object} [parameters.properties.parametersLink] The URI of parameters
      * file. You use this element to link to an existing parameters file. Use
      * either the parametersLink property or the parameters property, but not both.
      *
      * @param {string} parameters.properties.parametersLink.uri The URI of the
      * parameters file.
      *
      * @param {string} [parameters.properties.parametersLink.contentVersion] If
      * included, must match the ContentVersion in the template.
      *
      * @param {string} parameters.properties.mode The mode that is used to deploy
      * resources. This value can be either Incremental or Complete. In Incremental
      * mode, resources are deployed without deleting existing resources that are
      * not included in the template. In Complete mode, resources are deployed and
      * existing resources in the resource group that are not included in the
      * template are deleted. Be careful when using Complete mode as you may
      * unintentionally delete resources. Possible values include: 'Incremental',
      * 'Complete'
      *
      * @param {object} [parameters.properties.debugSetting] The debug setting of
      * the deployment.
      *
      * @param {string} [parameters.properties.debugSetting.detailLevel] Specifies
      * the type of information to log for debugging. The permitted values are none,
      * requestContent, responseContent, or both requestContent and responseContent
      * separated by a comma. The default is none. When setting this value,
      * carefully consider the type of information you are passing in during
      * deployment. By logging information about the request or response, you could
      * potentially expose sensitive data that is retrieved through the deployment
      * operations.
      *
      * @param {object} [parameters.properties.onErrorDeployment] The deployment on
      * error behavior.
      *
      * @param {string} [parameters.properties.onErrorDeployment.type] The
      * deployment on error behavior type. Possible values are LastSuccessful and
      * SpecificDeployment. Possible values include: 'LastSuccessful',
      * 'SpecificDeployment'
      *
      * @param {string} [parameters.properties.onErrorDeployment.deploymentName] The
      * deployment to be used on error case.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<DeploymentValidateResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def validateAtSubscriptionScopeWithHttpOperationResponse(deploymentName: String, parameters: Deployment): js.Promise[HttpOperationResponse[DeploymentValidateResult]] = js.native
    def validateAtSubscriptionScopeWithHttpOperationResponse(deploymentName: String, parameters: Deployment, options: CustomHeaders): js.Promise[HttpOperationResponse[DeploymentValidateResult]] = js.native
    
    /**
      * Validates whether the specified template is syntactically correct and will
      * be accepted by Azure Resource Manager..
      *
      * @param {string} resourceGroupName The name of the resource group the
      * template will be deployed to. The name is case insensitive.
      *
      * @param {string} deploymentName The name of the deployment.
      *
      * @param {object} parameters Parameters to validate.
      *
      * @param {string} [parameters.location] The location to store the deployment
      * data.
      *
      * @param {object} parameters.properties The deployment properties.
      *
      * @param {object} [parameters.properties.template] The template content. You
      * use this element when you want to pass the template syntax directly in the
      * request rather than link to an existing template. It can be a JObject or
      * well-formed JSON string. Use either the templateLink property or the
      * template property, but not both.
      *
      * @param {object} [parameters.properties.templateLink] The URI of the
      * template. Use either the templateLink property or the template property, but
      * not both.
      *
      * @param {string} parameters.properties.templateLink.uri The URI of the
      * template to deploy.
      *
      * @param {string} [parameters.properties.templateLink.contentVersion] If
      * included, must match the ContentVersion in the template.
      *
      * @param {object} [parameters.properties.parameters] Name and value pairs that
      * define the deployment parameters for the template. You use this element when
      * you want to provide the parameter values directly in the request rather than
      * link to an existing parameter file. Use either the parametersLink property
      * or the parameters property, but not both. It can be a JObject or a well
      * formed JSON string.
      *
      * @param {object} [parameters.properties.parametersLink] The URI of parameters
      * file. You use this element to link to an existing parameters file. Use
      * either the parametersLink property or the parameters property, but not both.
      *
      * @param {string} parameters.properties.parametersLink.uri The URI of the
      * parameters file.
      *
      * @param {string} [parameters.properties.parametersLink.contentVersion] If
      * included, must match the ContentVersion in the template.
      *
      * @param {string} parameters.properties.mode The mode that is used to deploy
      * resources. This value can be either Incremental or Complete. In Incremental
      * mode, resources are deployed without deleting existing resources that are
      * not included in the template. In Complete mode, resources are deployed and
      * existing resources in the resource group that are not included in the
      * template are deleted. Be careful when using Complete mode as you may
      * unintentionally delete resources. Possible values include: 'Incremental',
      * 'Complete'
      *
      * @param {object} [parameters.properties.debugSetting] The debug setting of
      * the deployment.
      *
      * @param {string} [parameters.properties.debugSetting.detailLevel] Specifies
      * the type of information to log for debugging. The permitted values are none,
      * requestContent, responseContent, or both requestContent and responseContent
      * separated by a comma. The default is none. When setting this value,
      * carefully consider the type of information you are passing in during
      * deployment. By logging information about the request or response, you could
      * potentially expose sensitive data that is retrieved through the deployment
      * operations.
      *
      * @param {object} [parameters.properties.onErrorDeployment] The deployment on
      * error behavior.
      *
      * @param {string} [parameters.properties.onErrorDeployment.type] The
      * deployment on error behavior type. Possible values are LastSuccessful and
      * SpecificDeployment. Possible values include: 'LastSuccessful',
      * 'SpecificDeployment'
      *
      * @param {string} [parameters.properties.onErrorDeployment.deploymentName] The
      * deployment to be used on error case.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<DeploymentValidateResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def validateWithHttpOperationResponse(resourceGroupName: String, deploymentName: String, parameters: Deployment): js.Promise[HttpOperationResponse[DeploymentValidateResult]] = js.native
    def validateWithHttpOperationResponse(resourceGroupName: String, deploymentName: String, parameters: Deployment, options: CustomHeaders): js.Promise[HttpOperationResponse[DeploymentValidateResult]] = js.native
  }
  
  @js.native
  trait Operations extends StObject {
    
    /**
      * Lists all of the available Microsoft.Resources REST API operations.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {OperationListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {OperationListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link OperationListResult} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def list(): js.Promise[OperationListResult] = js.native
    def list(callback: ServiceCallback[OperationListResult]): Unit = js.native
    def list(options: CustomHeaders): js.Promise[OperationListResult] = js.native
    def list(options: CustomHeaders, callback: ServiceCallback[OperationListResult]): Unit = js.native
    
    /**
      * Lists all of the available Microsoft.Resources REST API operations.
      *
      * @param {string} nextPageLink The NextLink from the previous successful call
      * to List operation.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {OperationListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {OperationListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link OperationListResult} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def listNext(nextPageLink: String): js.Promise[OperationListResult] = js.native
    def listNext(nextPageLink: String, callback: ServiceCallback[OperationListResult]): Unit = js.native
    def listNext(nextPageLink: String, options: CustomHeaders): js.Promise[OperationListResult] = js.native
    def listNext(nextPageLink: String, options: CustomHeaders, callback: ServiceCallback[OperationListResult]): Unit = js.native
    
    /**
      * Lists all of the available Microsoft.Resources REST API operations.
      *
      * @param {string} nextPageLink The NextLink from the previous successful call
      * to List operation.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<OperationListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listNextWithHttpOperationResponse(nextPageLink: String): js.Promise[HttpOperationResponse[OperationListResult]] = js.native
    def listNextWithHttpOperationResponse(nextPageLink: String, options: CustomHeaders): js.Promise[HttpOperationResponse[OperationListResult]] = js.native
    
    /**
      * Lists all of the available Microsoft.Resources REST API operations.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<OperationListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listWithHttpOperationResponse(): js.Promise[HttpOperationResponse[OperationListResult]] = js.native
    def listWithHttpOperationResponse(options: CustomHeaders): js.Promise[HttpOperationResponse[OperationListResult]] = js.native
  }
  
  @js.native
  trait Providers extends StObject {
    
    /**
      * Gets the specified resource provider.
      *
      * @param {string} resourceProviderNamespace The namespace of the resource
      * provider.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {string} [options.expand] The $expand query parameter. For example,
      * to include property aliases in response, use $expand=resourceTypes/aliases.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {Provider} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {Provider} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link Provider} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def get(resourceProviderNamespace: String): js.Promise[Provider] = js.native
    def get(resourceProviderNamespace: String, callback: ServiceCallback[Provider]): Unit = js.native
    def get(resourceProviderNamespace: String, options: `0`): js.Promise[Provider] = js.native
    def get(resourceProviderNamespace: String, options: `0`, callback: ServiceCallback[Provider]): Unit = js.native
    
    /**
      * Gets the specified resource provider.
      *
      * @param {string} resourceProviderNamespace The namespace of the resource
      * provider.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {string} [options.expand] The $expand query parameter. For example,
      * to include property aliases in response, use $expand=resourceTypes/aliases.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<Provider>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def getWithHttpOperationResponse(resourceProviderNamespace: String): js.Promise[HttpOperationResponse[Provider]] = js.native
    def getWithHttpOperationResponse(resourceProviderNamespace: String, options: `0`): js.Promise[HttpOperationResponse[Provider]] = js.native
    
    /**
      * Gets all resource providers for a subscription.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {number} [options.top] The number of results to return. If null is
      * passed returns all deployments.
      *
      * @param {string} [options.expand] The properties to include in the results.
      * For example, use &$expand=metadata in the query string to retrieve resource
      * provider metadata. To include property aliases in response, use
      * $expand=resourceTypes/aliases.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {ProviderListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {ProviderListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link ProviderListResult} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def list(): js.Promise[ProviderListResult] = js.native
    def list(callback: ServiceCallback[ProviderListResult]): Unit = js.native
    def list(options: CustomHeadersExpand): js.Promise[ProviderListResult] = js.native
    def list(options: CustomHeadersExpand, callback: ServiceCallback[ProviderListResult]): Unit = js.native
    
    /**
      * Gets all resource providers for a subscription.
      *
      * @param {string} nextPageLink The NextLink from the previous successful call
      * to List operation.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {ProviderListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {ProviderListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link ProviderListResult} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def listNext(nextPageLink: String): js.Promise[ProviderListResult] = js.native
    def listNext(nextPageLink: String, callback: ServiceCallback[ProviderListResult]): Unit = js.native
    def listNext(nextPageLink: String, options: CustomHeaders): js.Promise[ProviderListResult] = js.native
    def listNext(nextPageLink: String, options: CustomHeaders, callback: ServiceCallback[ProviderListResult]): Unit = js.native
    
    /**
      * Gets all resource providers for a subscription.
      *
      * @param {string} nextPageLink The NextLink from the previous successful call
      * to List operation.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<ProviderListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listNextWithHttpOperationResponse(nextPageLink: String): js.Promise[HttpOperationResponse[ProviderListResult]] = js.native
    def listNextWithHttpOperationResponse(nextPageLink: String, options: CustomHeaders): js.Promise[HttpOperationResponse[ProviderListResult]] = js.native
    
    /**
      * Gets all resource providers for a subscription.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {number} [options.top] The number of results to return. If null is
      * passed returns all deployments.
      *
      * @param {string} [options.expand] The properties to include in the results.
      * For example, use &$expand=metadata in the query string to retrieve resource
      * provider metadata. To include property aliases in response, use
      * $expand=resourceTypes/aliases.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<ProviderListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listWithHttpOperationResponse(): js.Promise[HttpOperationResponse[ProviderListResult]] = js.native
    def listWithHttpOperationResponse(options: CustomHeadersExpand): js.Promise[HttpOperationResponse[ProviderListResult]] = js.native
    
    /**
      * Registers a subscription with a resource provider.
      *
      * @param {string} resourceProviderNamespace The namespace of the resource
      * provider to register.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {Provider} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {Provider} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link Provider} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def register(resourceProviderNamespace: String): js.Promise[Provider] = js.native
    def register(resourceProviderNamespace: String, callback: ServiceCallback[Provider]): Unit = js.native
    def register(resourceProviderNamespace: String, options: CustomHeaders): js.Promise[Provider] = js.native
    def register(resourceProviderNamespace: String, options: CustomHeaders, callback: ServiceCallback[Provider]): Unit = js.native
    
    /**
      * Registers a subscription with a resource provider.
      *
      * @param {string} resourceProviderNamespace The namespace of the resource
      * provider to register.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<Provider>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def registerWithHttpOperationResponse(resourceProviderNamespace: String): js.Promise[HttpOperationResponse[Provider]] = js.native
    def registerWithHttpOperationResponse(resourceProviderNamespace: String, options: CustomHeaders): js.Promise[HttpOperationResponse[Provider]] = js.native
    
    /**
      * Unregisters a subscription from a resource provider.
      *
      * @param {string} resourceProviderNamespace The namespace of the resource
      * provider to unregister.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {Provider} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {Provider} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link Provider} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def unregister(resourceProviderNamespace: String): js.Promise[Provider] = js.native
    def unregister(resourceProviderNamespace: String, callback: ServiceCallback[Provider]): Unit = js.native
    def unregister(resourceProviderNamespace: String, options: CustomHeaders): js.Promise[Provider] = js.native
    def unregister(resourceProviderNamespace: String, options: CustomHeaders, callback: ServiceCallback[Provider]): Unit = js.native
    
    /**
      * Unregisters a subscription from a resource provider.
      *
      * @param {string} resourceProviderNamespace The namespace of the resource
      * provider to unregister.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<Provider>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def unregisterWithHttpOperationResponse(resourceProviderNamespace: String): js.Promise[HttpOperationResponse[Provider]] = js.native
    def unregisterWithHttpOperationResponse(resourceProviderNamespace: String, options: CustomHeaders): js.Promise[HttpOperationResponse[Provider]] = js.native
  }
  
  @js.native
  trait ResourceGroups extends StObject {
    
    /**
      * @summary Deletes a resource group.
      *
      * When you delete a resource group, all of its resources are also deleted.
      * Deleting a resource group deletes all of its template deployments and
      * currently stored operations.
      *
      * @param {string} resourceGroupName The name of the resource group to delete.
      * The name is case insensitive.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {null} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {null} [result]   - The deserialized result object if an error did not occur.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def beginDeleteMethod(resourceGroupName: String): js.Promise[Unit] = js.native
    def beginDeleteMethod(resourceGroupName: String, callback: ServiceCallback[Unit]): Unit = js.native
    def beginDeleteMethod(resourceGroupName: String, options: CustomHeaders): js.Promise[Unit] = js.native
    def beginDeleteMethod(resourceGroupName: String, options: CustomHeaders, callback: ServiceCallback[Unit]): Unit = js.native
    
    /**
      * @summary Deletes a resource group.
      *
      * When you delete a resource group, all of its resources are also deleted.
      * Deleting a resource group deletes all of its template deployments and
      * currently stored operations.
      *
      * @param {string} resourceGroupName The name of the resource group to delete.
      * The name is case insensitive.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<null>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def beginDeleteMethodWithHttpOperationResponse(resourceGroupName: String): js.Promise[HttpOperationResponse[Unit]] = js.native
    def beginDeleteMethodWithHttpOperationResponse(resourceGroupName: String, options: CustomHeaders): js.Promise[HttpOperationResponse[Unit]] = js.native
    
    /**
      * Checks whether a resource group exists.
      *
      * @param {string} resourceGroupName The name of the resource group to check.
      * The name is case insensitive.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {Boolean} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {Boolean} [result]   - The deserialized result object if an error did not occur.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def checkExistence(resourceGroupName: String): js.Promise[Boolean] = js.native
    def checkExistence(resourceGroupName: String, callback: ServiceCallback[Boolean]): Unit = js.native
    def checkExistence(resourceGroupName: String, options: CustomHeaders): js.Promise[Boolean] = js.native
    def checkExistence(resourceGroupName: String, options: CustomHeaders, callback: ServiceCallback[Boolean]): Unit = js.native
    
    /**
      * Checks whether a resource group exists.
      *
      * @param {string} resourceGroupName The name of the resource group to check.
      * The name is case insensitive.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<Boolean>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def checkExistenceWithHttpOperationResponse(resourceGroupName: String): js.Promise[HttpOperationResponse[Boolean]] = js.native
    def checkExistenceWithHttpOperationResponse(resourceGroupName: String, options: CustomHeaders): js.Promise[HttpOperationResponse[Boolean]] = js.native
    
    /**
      * Creates or updates a resource group.
      *
      * @param {string} resourceGroupName The name of the resource group to create
      * or update. Can include alphanumeric, underscore, parentheses, hyphen, period
      * (except at end), and Unicode characters that match the allowed characters.
      *
      * @param {object} parameters Parameters supplied to the create or update a
      * resource group.
      *
      * @param {object} [parameters.properties]
      *
      * @param {string} parameters.location The location of the resource group. It
      * cannot be changed after the resource group has been created. It must be one
      * of the supported Azure locations.
      *
      * @param {string} [parameters.managedBy] The ID of the resource that manages
      * this resource group.
      *
      * @param {object} [parameters.tags] The tags attached to the resource group.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {ResourceGroup} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {ResourceGroup} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link ResourceGroup} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def createOrUpdate(resourceGroupName: String, parameters: ResourceGroup): js.Promise[ResourceGroup] = js.native
    def createOrUpdate(resourceGroupName: String, parameters: ResourceGroup, callback: ServiceCallback[ResourceGroup]): Unit = js.native
    def createOrUpdate(resourceGroupName: String, parameters: ResourceGroup, options: CustomHeaders): js.Promise[ResourceGroup] = js.native
    def createOrUpdate(
      resourceGroupName: String,
      parameters: ResourceGroup,
      options: CustomHeaders,
      callback: ServiceCallback[ResourceGroup]
    ): Unit = js.native
    
    /**
      * Creates or updates a resource group.
      *
      * @param {string} resourceGroupName The name of the resource group to create
      * or update. Can include alphanumeric, underscore, parentheses, hyphen, period
      * (except at end), and Unicode characters that match the allowed characters.
      *
      * @param {object} parameters Parameters supplied to the create or update a
      * resource group.
      *
      * @param {object} [parameters.properties]
      *
      * @param {string} parameters.location The location of the resource group. It
      * cannot be changed after the resource group has been created. It must be one
      * of the supported Azure locations.
      *
      * @param {string} [parameters.managedBy] The ID of the resource that manages
      * this resource group.
      *
      * @param {object} [parameters.tags] The tags attached to the resource group.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<ResourceGroup>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def createOrUpdateWithHttpOperationResponse(resourceGroupName: String, parameters: ResourceGroup): js.Promise[HttpOperationResponse[ResourceGroup]] = js.native
    def createOrUpdateWithHttpOperationResponse(resourceGroupName: String, parameters: ResourceGroup, options: CustomHeaders): js.Promise[HttpOperationResponse[ResourceGroup]] = js.native
    
    /**
      * @summary Deletes a resource group.
      *
      * When you delete a resource group, all of its resources are also deleted.
      * Deleting a resource group deletes all of its template deployments and
      * currently stored operations.
      *
      * @param {string} resourceGroupName The name of the resource group to delete.
      * The name is case insensitive.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {null} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {null} [result]   - The deserialized result object if an error did not occur.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def deleteMethod(resourceGroupName: String): js.Promise[Unit] = js.native
    def deleteMethod(resourceGroupName: String, callback: ServiceCallback[Unit]): Unit = js.native
    def deleteMethod(resourceGroupName: String, options: CustomHeaders): js.Promise[Unit] = js.native
    def deleteMethod(resourceGroupName: String, options: CustomHeaders, callback: ServiceCallback[Unit]): Unit = js.native
    
    /**
      * @summary Deletes a resource group.
      *
      * When you delete a resource group, all of its resources are also deleted.
      * Deleting a resource group deletes all of its template deployments and
      * currently stored operations.
      *
      * @param {string} resourceGroupName The name of the resource group to delete.
      * The name is case insensitive.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<null>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def deleteMethodWithHttpOperationResponse(resourceGroupName: String): js.Promise[HttpOperationResponse[Unit]] = js.native
    def deleteMethodWithHttpOperationResponse(resourceGroupName: String, options: CustomHeaders): js.Promise[HttpOperationResponse[Unit]] = js.native
    
    /**
      * Captures the specified resource group as a template.
      *
      * @param {string} resourceGroupName The name of the resource group to export
      * as a template.
      *
      * @param {object} parameters Parameters for exporting the template.
      *
      * @param {array} [parameters.resources] The IDs of the resources. The only
      * supported string currently is '*' (all resources). Future updates will
      * support exporting specific resources.
      *
      * @param {string} [parameters.options] The export template options. Supported
      * values include 'IncludeParameterDefaultValue', 'IncludeComments' or
      * 'IncludeParameterDefaultValue, IncludeComments
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {ResourceGroupExportResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {ResourceGroupExportResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link ResourceGroupExportResult} for more
      *                      information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def exportTemplate(resourceGroupName: String, parameters: ExportTemplateRequest): js.Promise[ResourceGroupExportResult] = js.native
    def exportTemplate(
      resourceGroupName: String,
      parameters: ExportTemplateRequest,
      callback: ServiceCallback[ResourceGroupExportResult]
    ): Unit = js.native
    def exportTemplate(resourceGroupName: String, parameters: ExportTemplateRequest, options: CustomHeaders): js.Promise[ResourceGroupExportResult] = js.native
    def exportTemplate(
      resourceGroupName: String,
      parameters: ExportTemplateRequest,
      options: CustomHeaders,
      callback: ServiceCallback[ResourceGroupExportResult]
    ): Unit = js.native
    
    /**
      * Captures the specified resource group as a template.
      *
      * @param {string} resourceGroupName The name of the resource group to export
      * as a template.
      *
      * @param {object} parameters Parameters for exporting the template.
      *
      * @param {array} [parameters.resources] The IDs of the resources. The only
      * supported string currently is '*' (all resources). Future updates will
      * support exporting specific resources.
      *
      * @param {string} [parameters.options] The export template options. Supported
      * values include 'IncludeParameterDefaultValue', 'IncludeComments' or
      * 'IncludeParameterDefaultValue, IncludeComments
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<ResourceGroupExportResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def exportTemplateWithHttpOperationResponse(resourceGroupName: String, parameters: ExportTemplateRequest): js.Promise[HttpOperationResponse[ResourceGroupExportResult]] = js.native
    def exportTemplateWithHttpOperationResponse(resourceGroupName: String, parameters: ExportTemplateRequest, options: CustomHeaders): js.Promise[HttpOperationResponse[ResourceGroupExportResult]] = js.native
    
    /**
      * Gets a resource group.
      *
      * @param {string} resourceGroupName The name of the resource group to get. The
      * name is case insensitive.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {ResourceGroup} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {ResourceGroup} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link ResourceGroup} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def get(resourceGroupName: String): js.Promise[ResourceGroup] = js.native
    def get(resourceGroupName: String, callback: ServiceCallback[ResourceGroup]): Unit = js.native
    def get(resourceGroupName: String, options: CustomHeaders): js.Promise[ResourceGroup] = js.native
    def get(resourceGroupName: String, options: CustomHeaders, callback: ServiceCallback[ResourceGroup]): Unit = js.native
    
    /**
      * Gets a resource group.
      *
      * @param {string} resourceGroupName The name of the resource group to get. The
      * name is case insensitive.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<ResourceGroup>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def getWithHttpOperationResponse(resourceGroupName: String): js.Promise[HttpOperationResponse[ResourceGroup]] = js.native
    def getWithHttpOperationResponse(resourceGroupName: String, options: CustomHeaders): js.Promise[HttpOperationResponse[ResourceGroup]] = js.native
    
    /**
      * Gets all the resource groups for a subscription.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {string} [options.filter] The filter to apply on the
      * operation.<br><br>You can filter by tag names and values. For example, to
      * filter for a tag name and value, use $filter=tagName eq 'tag1' and tagValue
      * eq 'Value1'
      *
      * @param {number} [options.top] The number of results to return. If null is
      * passed, returns all resource groups.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {ResourceGroupListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {ResourceGroupListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link ResourceGroupListResult} for more
      *                      information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def list(): js.Promise[ResourceGroupListResult] = js.native
    def list(callback: ServiceCallback[ResourceGroupListResult]): Unit = js.native
    def list(options: Top): js.Promise[ResourceGroupListResult] = js.native
    def list(options: Top, callback: ServiceCallback[ResourceGroupListResult]): Unit = js.native
    
    /**
      * Gets all the resource groups for a subscription.
      *
      * @param {string} nextPageLink The NextLink from the previous successful call
      * to List operation.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {ResourceGroupListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {ResourceGroupListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link ResourceGroupListResult} for more
      *                      information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def listNext(nextPageLink: String): js.Promise[ResourceGroupListResult] = js.native
    def listNext(nextPageLink: String, callback: ServiceCallback[ResourceGroupListResult]): Unit = js.native
    def listNext(nextPageLink: String, options: CustomHeaders): js.Promise[ResourceGroupListResult] = js.native
    def listNext(nextPageLink: String, options: CustomHeaders, callback: ServiceCallback[ResourceGroupListResult]): Unit = js.native
    
    /**
      * Gets all the resource groups for a subscription.
      *
      * @param {string} nextPageLink The NextLink from the previous successful call
      * to List operation.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<ResourceGroupListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listNextWithHttpOperationResponse(nextPageLink: String): js.Promise[HttpOperationResponse[ResourceGroupListResult]] = js.native
    def listNextWithHttpOperationResponse(nextPageLink: String, options: CustomHeaders): js.Promise[HttpOperationResponse[ResourceGroupListResult]] = js.native
    
    /**
      * Gets all the resource groups for a subscription.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {string} [options.filter] The filter to apply on the
      * operation.<br><br>You can filter by tag names and values. For example, to
      * filter for a tag name and value, use $filter=tagName eq 'tag1' and tagValue
      * eq 'Value1'
      *
      * @param {number} [options.top] The number of results to return. If null is
      * passed, returns all resource groups.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<ResourceGroupListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listWithHttpOperationResponse(): js.Promise[HttpOperationResponse[ResourceGroupListResult]] = js.native
    def listWithHttpOperationResponse(options: Top): js.Promise[HttpOperationResponse[ResourceGroupListResult]] = js.native
    
    /**
      * @summary Updates a resource group.
      *
      * Resource groups can be updated through a simple PATCH operation to a group
      * address. The format of the request is the same as that for creating a
      * resource group. If a field is unspecified, the current value is retained.
      *
      * @param {string} resourceGroupName The name of the resource group to update.
      * The name is case insensitive.
      *
      * @param {object} parameters Parameters supplied to update a resource group.
      *
      * @param {string} [parameters.name] The name of the resource group.
      *
      * @param {object} [parameters.properties]
      *
      * @param {string} [parameters.managedBy] The ID of the resource that manages
      * this resource group.
      *
      * @param {object} [parameters.tags] The tags attached to the resource group.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {ResourceGroup} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {ResourceGroup} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link ResourceGroup} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def update(resourceGroupName: String, parameters: ResourceGroupPatchable): js.Promise[ResourceGroup] = js.native
    def update(
      resourceGroupName: String,
      parameters: ResourceGroupPatchable,
      callback: ServiceCallback[ResourceGroup]
    ): Unit = js.native
    def update(resourceGroupName: String, parameters: ResourceGroupPatchable, options: CustomHeaders): js.Promise[ResourceGroup] = js.native
    def update(
      resourceGroupName: String,
      parameters: ResourceGroupPatchable,
      options: CustomHeaders,
      callback: ServiceCallback[ResourceGroup]
    ): Unit = js.native
    
    /**
      * @summary Updates a resource group.
      *
      * Resource groups can be updated through a simple PATCH operation to a group
      * address. The format of the request is the same as that for creating a
      * resource group. If a field is unspecified, the current value is retained.
      *
      * @param {string} resourceGroupName The name of the resource group to update.
      * The name is case insensitive.
      *
      * @param {object} parameters Parameters supplied to update a resource group.
      *
      * @param {string} [parameters.name] The name of the resource group.
      *
      * @param {object} [parameters.properties]
      *
      * @param {string} [parameters.managedBy] The ID of the resource that manages
      * this resource group.
      *
      * @param {object} [parameters.tags] The tags attached to the resource group.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<ResourceGroup>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def updateWithHttpOperationResponse(resourceGroupName: String, parameters: ResourceGroupPatchable): js.Promise[HttpOperationResponse[ResourceGroup]] = js.native
    def updateWithHttpOperationResponse(resourceGroupName: String, parameters: ResourceGroupPatchable, options: CustomHeaders): js.Promise[HttpOperationResponse[ResourceGroup]] = js.native
  }
  
  @js.native
  trait Resources extends StObject {
    
    /**
      * Creates a resource.
      *
      * @param {string} resourceGroupName The name of the resource group for the
      * resource. The name is case insensitive.
      *
      * @param {string} resourceProviderNamespace The namespace of the resource
      * provider.
      *
      * @param {string} parentResourcePath The parent resource identity.
      *
      * @param {string} resourceType The resource type of the resource to create.
      *
      * @param {string} resourceName The name of the resource to create.
      *
      * @param {string} apiVersion The API version to use for the operation.
      *
      * @param {object} parameters Parameters for creating or updating the resource.
      *
      * @param {object} [parameters.plan] The plan of the resource.
      *
      * @param {string} [parameters.plan.name] The plan ID.
      *
      * @param {string} [parameters.plan.publisher] The publisher ID.
      *
      * @param {string} [parameters.plan.product] The offer ID.
      *
      * @param {string} [parameters.plan.promotionCode] The promotion code.
      *
      * @param {string} [parameters.plan.version] The plan's version.
      *
      * @param {object} [parameters.properties] The resource properties.
      *
      * @param {string} [parameters.kind] The kind of the resource.
      *
      * @param {string} [parameters.managedBy] ID of the resource that manages this
      * resource.
      *
      * @param {object} [parameters.sku] The SKU of the resource.
      *
      * @param {string} [parameters.sku.name] The SKU name.
      *
      * @param {string} [parameters.sku.tier] The SKU tier.
      *
      * @param {string} [parameters.sku.size] The SKU size.
      *
      * @param {string} [parameters.sku.family] The SKU family.
      *
      * @param {string} [parameters.sku.model] The SKU model.
      *
      * @param {number} [parameters.sku.capacity] The SKU capacity.
      *
      * @param {object} [parameters.identity] The identity of the resource.
      *
      * @param {string} [parameters.identity.type] The identity type. Possible
      * values include: 'SystemAssigned', 'UserAssigned', 'SystemAssigned,
      * UserAssigned', 'None'
      *
      * @param {object} [parameters.identity.userAssignedIdentities] The list of
      * user identities associated with the resource. The user identity dictionary
      * key references will be ARM resource ids in the form:
      * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
      *
      * @param {string} [parameters.location] Resource location
      *
      * @param {object} [parameters.tags] Resource tags
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {GenericResource} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {GenericResource} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link GenericResource} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def beginCreateOrUpdate(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      apiVersion: String,
      parameters: GenericResource
    ): js.Promise[GenericResource] = js.native
    def beginCreateOrUpdate(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      apiVersion: String,
      parameters: GenericResource,
      callback: ServiceCallback[GenericResource]
    ): Unit = js.native
    def beginCreateOrUpdate(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      apiVersion: String,
      parameters: GenericResource,
      options: CustomHeaders
    ): js.Promise[GenericResource] = js.native
    def beginCreateOrUpdate(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      apiVersion: String,
      parameters: GenericResource,
      options: CustomHeaders,
      callback: ServiceCallback[GenericResource]
    ): Unit = js.native
    
    /**
      * Create a resource by ID.
      *
      * @param {string} resourceId The fully qualified ID of the resource, including
      * the resource name and resource type. Use the format,
      * /subscriptions/{guid}/resourceGroups/{resource-group-name}/{resource-provider-namespace}/{resource-type}/{resource-name}
      *
      * @param {string} apiVersion The API version to use for the operation.
      *
      * @param {object} parameters Create or update resource parameters.
      *
      * @param {object} [parameters.plan] The plan of the resource.
      *
      * @param {string} [parameters.plan.name] The plan ID.
      *
      * @param {string} [parameters.plan.publisher] The publisher ID.
      *
      * @param {string} [parameters.plan.product] The offer ID.
      *
      * @param {string} [parameters.plan.promotionCode] The promotion code.
      *
      * @param {string} [parameters.plan.version] The plan's version.
      *
      * @param {object} [parameters.properties] The resource properties.
      *
      * @param {string} [parameters.kind] The kind of the resource.
      *
      * @param {string} [parameters.managedBy] ID of the resource that manages this
      * resource.
      *
      * @param {object} [parameters.sku] The SKU of the resource.
      *
      * @param {string} [parameters.sku.name] The SKU name.
      *
      * @param {string} [parameters.sku.tier] The SKU tier.
      *
      * @param {string} [parameters.sku.size] The SKU size.
      *
      * @param {string} [parameters.sku.family] The SKU family.
      *
      * @param {string} [parameters.sku.model] The SKU model.
      *
      * @param {number} [parameters.sku.capacity] The SKU capacity.
      *
      * @param {object} [parameters.identity] The identity of the resource.
      *
      * @param {string} [parameters.identity.type] The identity type. Possible
      * values include: 'SystemAssigned', 'UserAssigned', 'SystemAssigned,
      * UserAssigned', 'None'
      *
      * @param {object} [parameters.identity.userAssignedIdentities] The list of
      * user identities associated with the resource. The user identity dictionary
      * key references will be ARM resource ids in the form:
      * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
      *
      * @param {string} [parameters.location] Resource location
      *
      * @param {object} [parameters.tags] Resource tags
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {GenericResource} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {GenericResource} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link GenericResource} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def beginCreateOrUpdateById(resourceId: String, apiVersion: String, parameters: GenericResource): js.Promise[GenericResource] = js.native
    def beginCreateOrUpdateById(
      resourceId: String,
      apiVersion: String,
      parameters: GenericResource,
      callback: ServiceCallback[GenericResource]
    ): Unit = js.native
    def beginCreateOrUpdateById(resourceId: String, apiVersion: String, parameters: GenericResource, options: CustomHeaders): js.Promise[GenericResource] = js.native
    def beginCreateOrUpdateById(
      resourceId: String,
      apiVersion: String,
      parameters: GenericResource,
      options: CustomHeaders,
      callback: ServiceCallback[GenericResource]
    ): Unit = js.native
    
    /**
      * Create a resource by ID.
      *
      * @param {string} resourceId The fully qualified ID of the resource, including
      * the resource name and resource type. Use the format,
      * /subscriptions/{guid}/resourceGroups/{resource-group-name}/{resource-provider-namespace}/{resource-type}/{resource-name}
      *
      * @param {string} apiVersion The API version to use for the operation.
      *
      * @param {object} parameters Create or update resource parameters.
      *
      * @param {object} [parameters.plan] The plan of the resource.
      *
      * @param {string} [parameters.plan.name] The plan ID.
      *
      * @param {string} [parameters.plan.publisher] The publisher ID.
      *
      * @param {string} [parameters.plan.product] The offer ID.
      *
      * @param {string} [parameters.plan.promotionCode] The promotion code.
      *
      * @param {string} [parameters.plan.version] The plan's version.
      *
      * @param {object} [parameters.properties] The resource properties.
      *
      * @param {string} [parameters.kind] The kind of the resource.
      *
      * @param {string} [parameters.managedBy] ID of the resource that manages this
      * resource.
      *
      * @param {object} [parameters.sku] The SKU of the resource.
      *
      * @param {string} [parameters.sku.name] The SKU name.
      *
      * @param {string} [parameters.sku.tier] The SKU tier.
      *
      * @param {string} [parameters.sku.size] The SKU size.
      *
      * @param {string} [parameters.sku.family] The SKU family.
      *
      * @param {string} [parameters.sku.model] The SKU model.
      *
      * @param {number} [parameters.sku.capacity] The SKU capacity.
      *
      * @param {object} [parameters.identity] The identity of the resource.
      *
      * @param {string} [parameters.identity.type] The identity type. Possible
      * values include: 'SystemAssigned', 'UserAssigned', 'SystemAssigned,
      * UserAssigned', 'None'
      *
      * @param {object} [parameters.identity.userAssignedIdentities] The list of
      * user identities associated with the resource. The user identity dictionary
      * key references will be ARM resource ids in the form:
      * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
      *
      * @param {string} [parameters.location] Resource location
      *
      * @param {object} [parameters.tags] Resource tags
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<GenericResource>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def beginCreateOrUpdateByIdWithHttpOperationResponse(resourceId: String, apiVersion: String, parameters: GenericResource): js.Promise[HttpOperationResponse[GenericResource]] = js.native
    def beginCreateOrUpdateByIdWithHttpOperationResponse(resourceId: String, apiVersion: String, parameters: GenericResource, options: CustomHeaders): js.Promise[HttpOperationResponse[GenericResource]] = js.native
    
    /**
      * Creates a resource.
      *
      * @param {string} resourceGroupName The name of the resource group for the
      * resource. The name is case insensitive.
      *
      * @param {string} resourceProviderNamespace The namespace of the resource
      * provider.
      *
      * @param {string} parentResourcePath The parent resource identity.
      *
      * @param {string} resourceType The resource type of the resource to create.
      *
      * @param {string} resourceName The name of the resource to create.
      *
      * @param {string} apiVersion The API version to use for the operation.
      *
      * @param {object} parameters Parameters for creating or updating the resource.
      *
      * @param {object} [parameters.plan] The plan of the resource.
      *
      * @param {string} [parameters.plan.name] The plan ID.
      *
      * @param {string} [parameters.plan.publisher] The publisher ID.
      *
      * @param {string} [parameters.plan.product] The offer ID.
      *
      * @param {string} [parameters.plan.promotionCode] The promotion code.
      *
      * @param {string} [parameters.plan.version] The plan's version.
      *
      * @param {object} [parameters.properties] The resource properties.
      *
      * @param {string} [parameters.kind] The kind of the resource.
      *
      * @param {string} [parameters.managedBy] ID of the resource that manages this
      * resource.
      *
      * @param {object} [parameters.sku] The SKU of the resource.
      *
      * @param {string} [parameters.sku.name] The SKU name.
      *
      * @param {string} [parameters.sku.tier] The SKU tier.
      *
      * @param {string} [parameters.sku.size] The SKU size.
      *
      * @param {string} [parameters.sku.family] The SKU family.
      *
      * @param {string} [parameters.sku.model] The SKU model.
      *
      * @param {number} [parameters.sku.capacity] The SKU capacity.
      *
      * @param {object} [parameters.identity] The identity of the resource.
      *
      * @param {string} [parameters.identity.type] The identity type. Possible
      * values include: 'SystemAssigned', 'UserAssigned', 'SystemAssigned,
      * UserAssigned', 'None'
      *
      * @param {object} [parameters.identity.userAssignedIdentities] The list of
      * user identities associated with the resource. The user identity dictionary
      * key references will be ARM resource ids in the form:
      * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
      *
      * @param {string} [parameters.location] Resource location
      *
      * @param {object} [parameters.tags] Resource tags
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<GenericResource>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def beginCreateOrUpdateWithHttpOperationResponse(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      apiVersion: String,
      parameters: GenericResource
    ): js.Promise[HttpOperationResponse[GenericResource]] = js.native
    def beginCreateOrUpdateWithHttpOperationResponse(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      apiVersion: String,
      parameters: GenericResource,
      options: CustomHeaders
    ): js.Promise[HttpOperationResponse[GenericResource]] = js.native
    
    /**
      * Deletes a resource by ID.
      *
      * @param {string} resourceId The fully qualified ID of the resource, including
      * the resource name and resource type. Use the format,
      * /subscriptions/{guid}/resourceGroups/{resource-group-name}/{resource-provider-namespace}/{resource-type}/{resource-name}
      *
      * @param {string} apiVersion The API version to use for the operation.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {null} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {null} [result]   - The deserialized result object if an error did not occur.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def beginDeleteById(resourceId: String, apiVersion: String): js.Promise[Unit] = js.native
    def beginDeleteById(resourceId: String, apiVersion: String, callback: ServiceCallback[Unit]): Unit = js.native
    def beginDeleteById(resourceId: String, apiVersion: String, options: CustomHeaders): js.Promise[Unit] = js.native
    def beginDeleteById(resourceId: String, apiVersion: String, options: CustomHeaders, callback: ServiceCallback[Unit]): Unit = js.native
    
    /**
      * Deletes a resource by ID.
      *
      * @param {string} resourceId The fully qualified ID of the resource, including
      * the resource name and resource type. Use the format,
      * /subscriptions/{guid}/resourceGroups/{resource-group-name}/{resource-provider-namespace}/{resource-type}/{resource-name}
      *
      * @param {string} apiVersion The API version to use for the operation.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<null>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def beginDeleteByIdWithHttpOperationResponse(resourceId: String, apiVersion: String): js.Promise[HttpOperationResponse[Unit]] = js.native
    def beginDeleteByIdWithHttpOperationResponse(resourceId: String, apiVersion: String, options: CustomHeaders): js.Promise[HttpOperationResponse[Unit]] = js.native
    
    /**
      * Deletes a resource.
      *
      * @param {string} resourceGroupName The name of the resource group that
      * contains the resource to delete. The name is case insensitive.
      *
      * @param {string} resourceProviderNamespace The namespace of the resource
      * provider.
      *
      * @param {string} parentResourcePath The parent resource identity.
      *
      * @param {string} resourceType The resource type.
      *
      * @param {string} resourceName The name of the resource to delete.
      *
      * @param {string} apiVersion The API version to use for the operation.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {null} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {null} [result]   - The deserialized result object if an error did not occur.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def beginDeleteMethod(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      apiVersion: String
    ): js.Promise[Unit] = js.native
    def beginDeleteMethod(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      apiVersion: String,
      callback: ServiceCallback[Unit]
    ): Unit = js.native
    def beginDeleteMethod(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      apiVersion: String,
      options: CustomHeaders
    ): js.Promise[Unit] = js.native
    def beginDeleteMethod(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      apiVersion: String,
      options: CustomHeaders,
      callback: ServiceCallback[Unit]
    ): Unit = js.native
    
    /**
      * Deletes a resource.
      *
      * @param {string} resourceGroupName The name of the resource group that
      * contains the resource to delete. The name is case insensitive.
      *
      * @param {string} resourceProviderNamespace The namespace of the resource
      * provider.
      *
      * @param {string} parentResourcePath The parent resource identity.
      *
      * @param {string} resourceType The resource type.
      *
      * @param {string} resourceName The name of the resource to delete.
      *
      * @param {string} apiVersion The API version to use for the operation.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<null>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def beginDeleteMethodWithHttpOperationResponse(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      apiVersion: String
    ): js.Promise[HttpOperationResponse[Unit]] = js.native
    def beginDeleteMethodWithHttpOperationResponse(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      apiVersion: String,
      options: CustomHeaders
    ): js.Promise[HttpOperationResponse[Unit]] = js.native
    
    /**
      * @summary Moves resources from one resource group to another resource group.
      *
      * The resources to move must be in the same source resource group. The target
      * resource group may be in a different subscription. When moving resources,
      * both the source group and the target group are locked for the duration of
      * the operation. Write and delete operations are blocked on the groups until
      * the move completes.
      *
      * @param {string} sourceResourceGroupName The name of the resource group
      * containing the resources to move.
      *
      * @param {object} parameters Parameters for moving resources.
      *
      * @param {array} [parameters.resources] The IDs of the resources.
      *
      * @param {string} [parameters.targetResourceGroup] The target resource group.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {null} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {null} [result]   - The deserialized result object if an error did not occur.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def beginMoveResources(sourceResourceGroupName: String, parameters: ResourcesMoveInfo): js.Promise[Unit] = js.native
    def beginMoveResources(sourceResourceGroupName: String, parameters: ResourcesMoveInfo, callback: ServiceCallback[Unit]): Unit = js.native
    def beginMoveResources(sourceResourceGroupName: String, parameters: ResourcesMoveInfo, options: CustomHeaders): js.Promise[Unit] = js.native
    def beginMoveResources(
      sourceResourceGroupName: String,
      parameters: ResourcesMoveInfo,
      options: CustomHeaders,
      callback: ServiceCallback[Unit]
    ): Unit = js.native
    
    /**
      * @summary Moves resources from one resource group to another resource group.
      *
      * The resources to move must be in the same source resource group. The target
      * resource group may be in a different subscription. When moving resources,
      * both the source group and the target group are locked for the duration of
      * the operation. Write and delete operations are blocked on the groups until
      * the move completes.
      *
      * @param {string} sourceResourceGroupName The name of the resource group
      * containing the resources to move.
      *
      * @param {object} parameters Parameters for moving resources.
      *
      * @param {array} [parameters.resources] The IDs of the resources.
      *
      * @param {string} [parameters.targetResourceGroup] The target resource group.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<null>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def beginMoveResourcesWithHttpOperationResponse(sourceResourceGroupName: String, parameters: ResourcesMoveInfo): js.Promise[HttpOperationResponse[Unit]] = js.native
    def beginMoveResourcesWithHttpOperationResponse(sourceResourceGroupName: String, parameters: ResourcesMoveInfo, options: CustomHeaders): js.Promise[HttpOperationResponse[Unit]] = js.native
    
    /**
      * Updates a resource.
      *
      * @param {string} resourceGroupName The name of the resource group for the
      * resource. The name is case insensitive.
      *
      * @param {string} resourceProviderNamespace The namespace of the resource
      * provider.
      *
      * @param {string} parentResourcePath The parent resource identity.
      *
      * @param {string} resourceType The resource type of the resource to update.
      *
      * @param {string} resourceName The name of the resource to update.
      *
      * @param {string} apiVersion The API version to use for the operation.
      *
      * @param {object} parameters Parameters for updating the resource.
      *
      * @param {object} [parameters.plan] The plan of the resource.
      *
      * @param {string} [parameters.plan.name] The plan ID.
      *
      * @param {string} [parameters.plan.publisher] The publisher ID.
      *
      * @param {string} [parameters.plan.product] The offer ID.
      *
      * @param {string} [parameters.plan.promotionCode] The promotion code.
      *
      * @param {string} [parameters.plan.version] The plan's version.
      *
      * @param {object} [parameters.properties] The resource properties.
      *
      * @param {string} [parameters.kind] The kind of the resource.
      *
      * @param {string} [parameters.managedBy] ID of the resource that manages this
      * resource.
      *
      * @param {object} [parameters.sku] The SKU of the resource.
      *
      * @param {string} [parameters.sku.name] The SKU name.
      *
      * @param {string} [parameters.sku.tier] The SKU tier.
      *
      * @param {string} [parameters.sku.size] The SKU size.
      *
      * @param {string} [parameters.sku.family] The SKU family.
      *
      * @param {string} [parameters.sku.model] The SKU model.
      *
      * @param {number} [parameters.sku.capacity] The SKU capacity.
      *
      * @param {object} [parameters.identity] The identity of the resource.
      *
      * @param {string} [parameters.identity.type] The identity type. Possible
      * values include: 'SystemAssigned', 'UserAssigned', 'SystemAssigned,
      * UserAssigned', 'None'
      *
      * @param {object} [parameters.identity.userAssignedIdentities] The list of
      * user identities associated with the resource. The user identity dictionary
      * key references will be ARM resource ids in the form:
      * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
      *
      * @param {string} [parameters.location] Resource location
      *
      * @param {object} [parameters.tags] Resource tags
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {GenericResource} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {GenericResource} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link GenericResource} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def beginUpdate(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      apiVersion: String,
      parameters: GenericResource
    ): js.Promise[GenericResource] = js.native
    def beginUpdate(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      apiVersion: String,
      parameters: GenericResource,
      callback: ServiceCallback[GenericResource]
    ): Unit = js.native
    def beginUpdate(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      apiVersion: String,
      parameters: GenericResource,
      options: CustomHeaders
    ): js.Promise[GenericResource] = js.native
    def beginUpdate(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      apiVersion: String,
      parameters: GenericResource,
      options: CustomHeaders,
      callback: ServiceCallback[GenericResource]
    ): Unit = js.native
    
    /**
      * Updates a resource by ID.
      *
      * @param {string} resourceId The fully qualified ID of the resource, including
      * the resource name and resource type. Use the format,
      * /subscriptions/{guid}/resourceGroups/{resource-group-name}/{resource-provider-namespace}/{resource-type}/{resource-name}
      *
      * @param {string} apiVersion The API version to use for the operation.
      *
      * @param {object} parameters Update resource parameters.
      *
      * @param {object} [parameters.plan] The plan of the resource.
      *
      * @param {string} [parameters.plan.name] The plan ID.
      *
      * @param {string} [parameters.plan.publisher] The publisher ID.
      *
      * @param {string} [parameters.plan.product] The offer ID.
      *
      * @param {string} [parameters.plan.promotionCode] The promotion code.
      *
      * @param {string} [parameters.plan.version] The plan's version.
      *
      * @param {object} [parameters.properties] The resource properties.
      *
      * @param {string} [parameters.kind] The kind of the resource.
      *
      * @param {string} [parameters.managedBy] ID of the resource that manages this
      * resource.
      *
      * @param {object} [parameters.sku] The SKU of the resource.
      *
      * @param {string} [parameters.sku.name] The SKU name.
      *
      * @param {string} [parameters.sku.tier] The SKU tier.
      *
      * @param {string} [parameters.sku.size] The SKU size.
      *
      * @param {string} [parameters.sku.family] The SKU family.
      *
      * @param {string} [parameters.sku.model] The SKU model.
      *
      * @param {number} [parameters.sku.capacity] The SKU capacity.
      *
      * @param {object} [parameters.identity] The identity of the resource.
      *
      * @param {string} [parameters.identity.type] The identity type. Possible
      * values include: 'SystemAssigned', 'UserAssigned', 'SystemAssigned,
      * UserAssigned', 'None'
      *
      * @param {object} [parameters.identity.userAssignedIdentities] The list of
      * user identities associated with the resource. The user identity dictionary
      * key references will be ARM resource ids in the form:
      * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
      *
      * @param {string} [parameters.location] Resource location
      *
      * @param {object} [parameters.tags] Resource tags
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {GenericResource} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {GenericResource} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link GenericResource} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def beginUpdateById(resourceId: String, apiVersion: String, parameters: GenericResource): js.Promise[GenericResource] = js.native
    def beginUpdateById(
      resourceId: String,
      apiVersion: String,
      parameters: GenericResource,
      callback: ServiceCallback[GenericResource]
    ): Unit = js.native
    def beginUpdateById(resourceId: String, apiVersion: String, parameters: GenericResource, options: CustomHeaders): js.Promise[GenericResource] = js.native
    def beginUpdateById(
      resourceId: String,
      apiVersion: String,
      parameters: GenericResource,
      options: CustomHeaders,
      callback: ServiceCallback[GenericResource]
    ): Unit = js.native
    
    /**
      * Updates a resource by ID.
      *
      * @param {string} resourceId The fully qualified ID of the resource, including
      * the resource name and resource type. Use the format,
      * /subscriptions/{guid}/resourceGroups/{resource-group-name}/{resource-provider-namespace}/{resource-type}/{resource-name}
      *
      * @param {string} apiVersion The API version to use for the operation.
      *
      * @param {object} parameters Update resource parameters.
      *
      * @param {object} [parameters.plan] The plan of the resource.
      *
      * @param {string} [parameters.plan.name] The plan ID.
      *
      * @param {string} [parameters.plan.publisher] The publisher ID.
      *
      * @param {string} [parameters.plan.product] The offer ID.
      *
      * @param {string} [parameters.plan.promotionCode] The promotion code.
      *
      * @param {string} [parameters.plan.version] The plan's version.
      *
      * @param {object} [parameters.properties] The resource properties.
      *
      * @param {string} [parameters.kind] The kind of the resource.
      *
      * @param {string} [parameters.managedBy] ID of the resource that manages this
      * resource.
      *
      * @param {object} [parameters.sku] The SKU of the resource.
      *
      * @param {string} [parameters.sku.name] The SKU name.
      *
      * @param {string} [parameters.sku.tier] The SKU tier.
      *
      * @param {string} [parameters.sku.size] The SKU size.
      *
      * @param {string} [parameters.sku.family] The SKU family.
      *
      * @param {string} [parameters.sku.model] The SKU model.
      *
      * @param {number} [parameters.sku.capacity] The SKU capacity.
      *
      * @param {object} [parameters.identity] The identity of the resource.
      *
      * @param {string} [parameters.identity.type] The identity type. Possible
      * values include: 'SystemAssigned', 'UserAssigned', 'SystemAssigned,
      * UserAssigned', 'None'
      *
      * @param {object} [parameters.identity.userAssignedIdentities] The list of
      * user identities associated with the resource. The user identity dictionary
      * key references will be ARM resource ids in the form:
      * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
      *
      * @param {string} [parameters.location] Resource location
      *
      * @param {object} [parameters.tags] Resource tags
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<GenericResource>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def beginUpdateByIdWithHttpOperationResponse(resourceId: String, apiVersion: String, parameters: GenericResource): js.Promise[HttpOperationResponse[GenericResource]] = js.native
    def beginUpdateByIdWithHttpOperationResponse(resourceId: String, apiVersion: String, parameters: GenericResource, options: CustomHeaders): js.Promise[HttpOperationResponse[GenericResource]] = js.native
    
    /**
      * Updates a resource.
      *
      * @param {string} resourceGroupName The name of the resource group for the
      * resource. The name is case insensitive.
      *
      * @param {string} resourceProviderNamespace The namespace of the resource
      * provider.
      *
      * @param {string} parentResourcePath The parent resource identity.
      *
      * @param {string} resourceType The resource type of the resource to update.
      *
      * @param {string} resourceName The name of the resource to update.
      *
      * @param {string} apiVersion The API version to use for the operation.
      *
      * @param {object} parameters Parameters for updating the resource.
      *
      * @param {object} [parameters.plan] The plan of the resource.
      *
      * @param {string} [parameters.plan.name] The plan ID.
      *
      * @param {string} [parameters.plan.publisher] The publisher ID.
      *
      * @param {string} [parameters.plan.product] The offer ID.
      *
      * @param {string} [parameters.plan.promotionCode] The promotion code.
      *
      * @param {string} [parameters.plan.version] The plan's version.
      *
      * @param {object} [parameters.properties] The resource properties.
      *
      * @param {string} [parameters.kind] The kind of the resource.
      *
      * @param {string} [parameters.managedBy] ID of the resource that manages this
      * resource.
      *
      * @param {object} [parameters.sku] The SKU of the resource.
      *
      * @param {string} [parameters.sku.name] The SKU name.
      *
      * @param {string} [parameters.sku.tier] The SKU tier.
      *
      * @param {string} [parameters.sku.size] The SKU size.
      *
      * @param {string} [parameters.sku.family] The SKU family.
      *
      * @param {string} [parameters.sku.model] The SKU model.
      *
      * @param {number} [parameters.sku.capacity] The SKU capacity.
      *
      * @param {object} [parameters.identity] The identity of the resource.
      *
      * @param {string} [parameters.identity.type] The identity type. Possible
      * values include: 'SystemAssigned', 'UserAssigned', 'SystemAssigned,
      * UserAssigned', 'None'
      *
      * @param {object} [parameters.identity.userAssignedIdentities] The list of
      * user identities associated with the resource. The user identity dictionary
      * key references will be ARM resource ids in the form:
      * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
      *
      * @param {string} [parameters.location] Resource location
      *
      * @param {object} [parameters.tags] Resource tags
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<GenericResource>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def beginUpdateWithHttpOperationResponse(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      apiVersion: String,
      parameters: GenericResource
    ): js.Promise[HttpOperationResponse[GenericResource]] = js.native
    def beginUpdateWithHttpOperationResponse(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      apiVersion: String,
      parameters: GenericResource,
      options: CustomHeaders
    ): js.Promise[HttpOperationResponse[GenericResource]] = js.native
    
    /**
      * @summary Validates whether resources can be moved from one resource group to
      * another resource group.
      *
      * This operation checks whether the specified resources can be moved to the
      * target. The resources to move must be in the same source resource group. The
      * target resource group may be in a different subscription. If validation
      * succeeds, it returns HTTP response code 204 (no content). If validation
      * fails, it returns HTTP response code 409 (Conflict) with an error message.
      * Retrieve the URL in the Location header value to check the result of the
      * long-running operation.
      *
      * @param {string} sourceResourceGroupName The name of the resource group
      * containing the resources to validate for move.
      *
      * @param {object} parameters Parameters for moving resources.
      *
      * @param {array} [parameters.resources] The IDs of the resources.
      *
      * @param {string} [parameters.targetResourceGroup] The target resource group.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {null} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {null} [result]   - The deserialized result object if an error did not occur.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def beginValidateMoveResources(sourceResourceGroupName: String, parameters: ResourcesMoveInfo): js.Promise[Unit] = js.native
    def beginValidateMoveResources(sourceResourceGroupName: String, parameters: ResourcesMoveInfo, callback: ServiceCallback[Unit]): Unit = js.native
    def beginValidateMoveResources(sourceResourceGroupName: String, parameters: ResourcesMoveInfo, options: CustomHeaders): js.Promise[Unit] = js.native
    def beginValidateMoveResources(
      sourceResourceGroupName: String,
      parameters: ResourcesMoveInfo,
      options: CustomHeaders,
      callback: ServiceCallback[Unit]
    ): Unit = js.native
    
    /**
      * @summary Validates whether resources can be moved from one resource group to
      * another resource group.
      *
      * This operation checks whether the specified resources can be moved to the
      * target. The resources to move must be in the same source resource group. The
      * target resource group may be in a different subscription. If validation
      * succeeds, it returns HTTP response code 204 (no content). If validation
      * fails, it returns HTTP response code 409 (Conflict) with an error message.
      * Retrieve the URL in the Location header value to check the result of the
      * long-running operation.
      *
      * @param {string} sourceResourceGroupName The name of the resource group
      * containing the resources to validate for move.
      *
      * @param {object} parameters Parameters for moving resources.
      *
      * @param {array} [parameters.resources] The IDs of the resources.
      *
      * @param {string} [parameters.targetResourceGroup] The target resource group.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<null>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def beginValidateMoveResourcesWithHttpOperationResponse(sourceResourceGroupName: String, parameters: ResourcesMoveInfo): js.Promise[HttpOperationResponse[Unit]] = js.native
    def beginValidateMoveResourcesWithHttpOperationResponse(sourceResourceGroupName: String, parameters: ResourcesMoveInfo, options: CustomHeaders): js.Promise[HttpOperationResponse[Unit]] = js.native
    
    /**
      * Checks whether a resource exists.
      *
      * @param {string} resourceGroupName The name of the resource group containing
      * the resource to check. The name is case insensitive.
      *
      * @param {string} resourceProviderNamespace The resource provider of the
      * resource to check.
      *
      * @param {string} parentResourcePath The parent resource identity.
      *
      * @param {string} resourceType The resource type.
      *
      * @param {string} resourceName The name of the resource to check whether it
      * exists.
      *
      * @param {string} apiVersion The API version to use for the operation.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {Boolean} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {Boolean} [result]   - The deserialized result object if an error did not occur.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def checkExistence(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      apiVersion: String
    ): js.Promise[Boolean] = js.native
    def checkExistence(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      apiVersion: String,
      callback: ServiceCallback[Boolean]
    ): Unit = js.native
    def checkExistence(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      apiVersion: String,
      options: CustomHeaders
    ): js.Promise[Boolean] = js.native
    def checkExistence(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      apiVersion: String,
      options: CustomHeaders,
      callback: ServiceCallback[Boolean]
    ): Unit = js.native
    
    /**
      * Checks by ID whether a resource exists.
      *
      * @param {string} resourceId The fully qualified ID of the resource, including
      * the resource name and resource type. Use the format,
      * /subscriptions/{guid}/resourceGroups/{resource-group-name}/{resource-provider-namespace}/{resource-type}/{resource-name}
      *
      * @param {string} apiVersion The API version to use for the operation.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {Boolean} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {Boolean} [result]   - The deserialized result object if an error did not occur.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def checkExistenceById(resourceId: String, apiVersion: String): js.Promise[Boolean] = js.native
    def checkExistenceById(resourceId: String, apiVersion: String, callback: ServiceCallback[Boolean]): Unit = js.native
    def checkExistenceById(resourceId: String, apiVersion: String, options: CustomHeaders): js.Promise[Boolean] = js.native
    def checkExistenceById(resourceId: String, apiVersion: String, options: CustomHeaders, callback: ServiceCallback[Boolean]): Unit = js.native
    
    /**
      * Checks by ID whether a resource exists.
      *
      * @param {string} resourceId The fully qualified ID of the resource, including
      * the resource name and resource type. Use the format,
      * /subscriptions/{guid}/resourceGroups/{resource-group-name}/{resource-provider-namespace}/{resource-type}/{resource-name}
      *
      * @param {string} apiVersion The API version to use for the operation.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<Boolean>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def checkExistenceByIdWithHttpOperationResponse(resourceId: String, apiVersion: String): js.Promise[HttpOperationResponse[Boolean]] = js.native
    def checkExistenceByIdWithHttpOperationResponse(resourceId: String, apiVersion: String, options: CustomHeaders): js.Promise[HttpOperationResponse[Boolean]] = js.native
    
    /**
      * Checks whether a resource exists.
      *
      * @param {string} resourceGroupName The name of the resource group containing
      * the resource to check. The name is case insensitive.
      *
      * @param {string} resourceProviderNamespace The resource provider of the
      * resource to check.
      *
      * @param {string} parentResourcePath The parent resource identity.
      *
      * @param {string} resourceType The resource type.
      *
      * @param {string} resourceName The name of the resource to check whether it
      * exists.
      *
      * @param {string} apiVersion The API version to use for the operation.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<Boolean>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def checkExistenceWithHttpOperationResponse(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      apiVersion: String
    ): js.Promise[HttpOperationResponse[Boolean]] = js.native
    def checkExistenceWithHttpOperationResponse(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      apiVersion: String,
      options: CustomHeaders
    ): js.Promise[HttpOperationResponse[Boolean]] = js.native
    
    /**
      * Creates a resource.
      *
      * @param {string} resourceGroupName The name of the resource group for the
      * resource. The name is case insensitive.
      *
      * @param {string} resourceProviderNamespace The namespace of the resource
      * provider.
      *
      * @param {string} parentResourcePath The parent resource identity.
      *
      * @param {string} resourceType The resource type of the resource to create.
      *
      * @param {string} resourceName The name of the resource to create.
      *
      * @param {string} apiVersion The API version to use for the operation.
      *
      * @param {object} parameters Parameters for creating or updating the resource.
      *
      * @param {object} [parameters.plan] The plan of the resource.
      *
      * @param {string} [parameters.plan.name] The plan ID.
      *
      * @param {string} [parameters.plan.publisher] The publisher ID.
      *
      * @param {string} [parameters.plan.product] The offer ID.
      *
      * @param {string} [parameters.plan.promotionCode] The promotion code.
      *
      * @param {string} [parameters.plan.version] The plan's version.
      *
      * @param {object} [parameters.properties] The resource properties.
      *
      * @param {string} [parameters.kind] The kind of the resource.
      *
      * @param {string} [parameters.managedBy] ID of the resource that manages this
      * resource.
      *
      * @param {object} [parameters.sku] The SKU of the resource.
      *
      * @param {string} [parameters.sku.name] The SKU name.
      *
      * @param {string} [parameters.sku.tier] The SKU tier.
      *
      * @param {string} [parameters.sku.size] The SKU size.
      *
      * @param {string} [parameters.sku.family] The SKU family.
      *
      * @param {string} [parameters.sku.model] The SKU model.
      *
      * @param {number} [parameters.sku.capacity] The SKU capacity.
      *
      * @param {object} [parameters.identity] The identity of the resource.
      *
      * @param {string} [parameters.identity.type] The identity type. Possible
      * values include: 'SystemAssigned', 'UserAssigned', 'SystemAssigned,
      * UserAssigned', 'None'
      *
      * @param {object} [parameters.identity.userAssignedIdentities] The list of
      * user identities associated with the resource. The user identity dictionary
      * key references will be ARM resource ids in the form:
      * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
      *
      * @param {string} [parameters.location] Resource location
      *
      * @param {object} [parameters.tags] Resource tags
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {GenericResource} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {GenericResource} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link GenericResource} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def createOrUpdate(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      apiVersion: String,
      parameters: GenericResource
    ): js.Promise[GenericResource] = js.native
    def createOrUpdate(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      apiVersion: String,
      parameters: GenericResource,
      callback: ServiceCallback[GenericResource]
    ): Unit = js.native
    def createOrUpdate(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      apiVersion: String,
      parameters: GenericResource,
      options: CustomHeaders
    ): js.Promise[GenericResource] = js.native
    def createOrUpdate(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      apiVersion: String,
      parameters: GenericResource,
      options: CustomHeaders,
      callback: ServiceCallback[GenericResource]
    ): Unit = js.native
    
    /**
      * Create a resource by ID.
      *
      * @param {string} resourceId The fully qualified ID of the resource, including
      * the resource name and resource type. Use the format,
      * /subscriptions/{guid}/resourceGroups/{resource-group-name}/{resource-provider-namespace}/{resource-type}/{resource-name}
      *
      * @param {string} apiVersion The API version to use for the operation.
      *
      * @param {object} parameters Create or update resource parameters.
      *
      * @param {object} [parameters.plan] The plan of the resource.
      *
      * @param {string} [parameters.plan.name] The plan ID.
      *
      * @param {string} [parameters.plan.publisher] The publisher ID.
      *
      * @param {string} [parameters.plan.product] The offer ID.
      *
      * @param {string} [parameters.plan.promotionCode] The promotion code.
      *
      * @param {string} [parameters.plan.version] The plan's version.
      *
      * @param {object} [parameters.properties] The resource properties.
      *
      * @param {string} [parameters.kind] The kind of the resource.
      *
      * @param {string} [parameters.managedBy] ID of the resource that manages this
      * resource.
      *
      * @param {object} [parameters.sku] The SKU of the resource.
      *
      * @param {string} [parameters.sku.name] The SKU name.
      *
      * @param {string} [parameters.sku.tier] The SKU tier.
      *
      * @param {string} [parameters.sku.size] The SKU size.
      *
      * @param {string} [parameters.sku.family] The SKU family.
      *
      * @param {string} [parameters.sku.model] The SKU model.
      *
      * @param {number} [parameters.sku.capacity] The SKU capacity.
      *
      * @param {object} [parameters.identity] The identity of the resource.
      *
      * @param {string} [parameters.identity.type] The identity type. Possible
      * values include: 'SystemAssigned', 'UserAssigned', 'SystemAssigned,
      * UserAssigned', 'None'
      *
      * @param {object} [parameters.identity.userAssignedIdentities] The list of
      * user identities associated with the resource. The user identity dictionary
      * key references will be ARM resource ids in the form:
      * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
      *
      * @param {string} [parameters.location] Resource location
      *
      * @param {object} [parameters.tags] Resource tags
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {GenericResource} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {GenericResource} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link GenericResource} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def createOrUpdateById(resourceId: String, apiVersion: String, parameters: GenericResource): js.Promise[GenericResource] = js.native
    def createOrUpdateById(
      resourceId: String,
      apiVersion: String,
      parameters: GenericResource,
      callback: ServiceCallback[GenericResource]
    ): Unit = js.native
    def createOrUpdateById(resourceId: String, apiVersion: String, parameters: GenericResource, options: CustomHeaders): js.Promise[GenericResource] = js.native
    def createOrUpdateById(
      resourceId: String,
      apiVersion: String,
      parameters: GenericResource,
      options: CustomHeaders,
      callback: ServiceCallback[GenericResource]
    ): Unit = js.native
    
    /**
      * Create a resource by ID.
      *
      * @param {string} resourceId The fully qualified ID of the resource, including
      * the resource name and resource type. Use the format,
      * /subscriptions/{guid}/resourceGroups/{resource-group-name}/{resource-provider-namespace}/{resource-type}/{resource-name}
      *
      * @param {string} apiVersion The API version to use for the operation.
      *
      * @param {object} parameters Create or update resource parameters.
      *
      * @param {object} [parameters.plan] The plan of the resource.
      *
      * @param {string} [parameters.plan.name] The plan ID.
      *
      * @param {string} [parameters.plan.publisher] The publisher ID.
      *
      * @param {string} [parameters.plan.product] The offer ID.
      *
      * @param {string} [parameters.plan.promotionCode] The promotion code.
      *
      * @param {string} [parameters.plan.version] The plan's version.
      *
      * @param {object} [parameters.properties] The resource properties.
      *
      * @param {string} [parameters.kind] The kind of the resource.
      *
      * @param {string} [parameters.managedBy] ID of the resource that manages this
      * resource.
      *
      * @param {object} [parameters.sku] The SKU of the resource.
      *
      * @param {string} [parameters.sku.name] The SKU name.
      *
      * @param {string} [parameters.sku.tier] The SKU tier.
      *
      * @param {string} [parameters.sku.size] The SKU size.
      *
      * @param {string} [parameters.sku.family] The SKU family.
      *
      * @param {string} [parameters.sku.model] The SKU model.
      *
      * @param {number} [parameters.sku.capacity] The SKU capacity.
      *
      * @param {object} [parameters.identity] The identity of the resource.
      *
      * @param {string} [parameters.identity.type] The identity type. Possible
      * values include: 'SystemAssigned', 'UserAssigned', 'SystemAssigned,
      * UserAssigned', 'None'
      *
      * @param {object} [parameters.identity.userAssignedIdentities] The list of
      * user identities associated with the resource. The user identity dictionary
      * key references will be ARM resource ids in the form:
      * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
      *
      * @param {string} [parameters.location] Resource location
      *
      * @param {object} [parameters.tags] Resource tags
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<GenericResource>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def createOrUpdateByIdWithHttpOperationResponse(resourceId: String, apiVersion: String, parameters: GenericResource): js.Promise[HttpOperationResponse[GenericResource]] = js.native
    def createOrUpdateByIdWithHttpOperationResponse(resourceId: String, apiVersion: String, parameters: GenericResource, options: CustomHeaders): js.Promise[HttpOperationResponse[GenericResource]] = js.native
    
    /**
      * Creates a resource.
      *
      * @param {string} resourceGroupName The name of the resource group for the
      * resource. The name is case insensitive.
      *
      * @param {string} resourceProviderNamespace The namespace of the resource
      * provider.
      *
      * @param {string} parentResourcePath The parent resource identity.
      *
      * @param {string} resourceType The resource type of the resource to create.
      *
      * @param {string} resourceName The name of the resource to create.
      *
      * @param {string} apiVersion The API version to use for the operation.
      *
      * @param {object} parameters Parameters for creating or updating the resource.
      *
      * @param {object} [parameters.plan] The plan of the resource.
      *
      * @param {string} [parameters.plan.name] The plan ID.
      *
      * @param {string} [parameters.plan.publisher] The publisher ID.
      *
      * @param {string} [parameters.plan.product] The offer ID.
      *
      * @param {string} [parameters.plan.promotionCode] The promotion code.
      *
      * @param {string} [parameters.plan.version] The plan's version.
      *
      * @param {object} [parameters.properties] The resource properties.
      *
      * @param {string} [parameters.kind] The kind of the resource.
      *
      * @param {string} [parameters.managedBy] ID of the resource that manages this
      * resource.
      *
      * @param {object} [parameters.sku] The SKU of the resource.
      *
      * @param {string} [parameters.sku.name] The SKU name.
      *
      * @param {string} [parameters.sku.tier] The SKU tier.
      *
      * @param {string} [parameters.sku.size] The SKU size.
      *
      * @param {string} [parameters.sku.family] The SKU family.
      *
      * @param {string} [parameters.sku.model] The SKU model.
      *
      * @param {number} [parameters.sku.capacity] The SKU capacity.
      *
      * @param {object} [parameters.identity] The identity of the resource.
      *
      * @param {string} [parameters.identity.type] The identity type. Possible
      * values include: 'SystemAssigned', 'UserAssigned', 'SystemAssigned,
      * UserAssigned', 'None'
      *
      * @param {object} [parameters.identity.userAssignedIdentities] The list of
      * user identities associated with the resource. The user identity dictionary
      * key references will be ARM resource ids in the form:
      * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
      *
      * @param {string} [parameters.location] Resource location
      *
      * @param {object} [parameters.tags] Resource tags
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<GenericResource>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def createOrUpdateWithHttpOperationResponse(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      apiVersion: String,
      parameters: GenericResource
    ): js.Promise[HttpOperationResponse[GenericResource]] = js.native
    def createOrUpdateWithHttpOperationResponse(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      apiVersion: String,
      parameters: GenericResource,
      options: CustomHeaders
    ): js.Promise[HttpOperationResponse[GenericResource]] = js.native
    
    /**
      * Deletes a resource by ID.
      *
      * @param {string} resourceId The fully qualified ID of the resource, including
      * the resource name and resource type. Use the format,
      * /subscriptions/{guid}/resourceGroups/{resource-group-name}/{resource-provider-namespace}/{resource-type}/{resource-name}
      *
      * @param {string} apiVersion The API version to use for the operation.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {null} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {null} [result]   - The deserialized result object if an error did not occur.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def deleteById(resourceId: String, apiVersion: String): js.Promise[Unit] = js.native
    def deleteById(resourceId: String, apiVersion: String, callback: ServiceCallback[Unit]): Unit = js.native
    def deleteById(resourceId: String, apiVersion: String, options: CustomHeaders): js.Promise[Unit] = js.native
    def deleteById(resourceId: String, apiVersion: String, options: CustomHeaders, callback: ServiceCallback[Unit]): Unit = js.native
    
    /**
      * Deletes a resource by ID.
      *
      * @param {string} resourceId The fully qualified ID of the resource, including
      * the resource name and resource type. Use the format,
      * /subscriptions/{guid}/resourceGroups/{resource-group-name}/{resource-provider-namespace}/{resource-type}/{resource-name}
      *
      * @param {string} apiVersion The API version to use for the operation.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<null>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def deleteByIdWithHttpOperationResponse(resourceId: String, apiVersion: String): js.Promise[HttpOperationResponse[Unit]] = js.native
    def deleteByIdWithHttpOperationResponse(resourceId: String, apiVersion: String, options: CustomHeaders): js.Promise[HttpOperationResponse[Unit]] = js.native
    
    /**
      * Deletes a resource.
      *
      * @param {string} resourceGroupName The name of the resource group that
      * contains the resource to delete. The name is case insensitive.
      *
      * @param {string} resourceProviderNamespace The namespace of the resource
      * provider.
      *
      * @param {string} parentResourcePath The parent resource identity.
      *
      * @param {string} resourceType The resource type.
      *
      * @param {string} resourceName The name of the resource to delete.
      *
      * @param {string} apiVersion The API version to use for the operation.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {null} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {null} [result]   - The deserialized result object if an error did not occur.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def deleteMethod(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      apiVersion: String
    ): js.Promise[Unit] = js.native
    def deleteMethod(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      apiVersion: String,
      callback: ServiceCallback[Unit]
    ): Unit = js.native
    def deleteMethod(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      apiVersion: String,
      options: CustomHeaders
    ): js.Promise[Unit] = js.native
    def deleteMethod(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      apiVersion: String,
      options: CustomHeaders,
      callback: ServiceCallback[Unit]
    ): Unit = js.native
    
    /**
      * Deletes a resource.
      *
      * @param {string} resourceGroupName The name of the resource group that
      * contains the resource to delete. The name is case insensitive.
      *
      * @param {string} resourceProviderNamespace The namespace of the resource
      * provider.
      *
      * @param {string} parentResourcePath The parent resource identity.
      *
      * @param {string} resourceType The resource type.
      *
      * @param {string} resourceName The name of the resource to delete.
      *
      * @param {string} apiVersion The API version to use for the operation.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<null>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def deleteMethodWithHttpOperationResponse(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      apiVersion: String
    ): js.Promise[HttpOperationResponse[Unit]] = js.native
    def deleteMethodWithHttpOperationResponse(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      apiVersion: String,
      options: CustomHeaders
    ): js.Promise[HttpOperationResponse[Unit]] = js.native
    
    /**
      * Gets a resource.
      *
      * @param {string} resourceGroupName The name of the resource group containing
      * the resource to get. The name is case insensitive.
      *
      * @param {string} resourceProviderNamespace The namespace of the resource
      * provider.
      *
      * @param {string} parentResourcePath The parent resource identity.
      *
      * @param {string} resourceType The resource type of the resource.
      *
      * @param {string} resourceName The name of the resource to get.
      *
      * @param {string} apiVersion The API version to use for the operation.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {GenericResource} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {GenericResource} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link GenericResource} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def get(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      apiVersion: String
    ): js.Promise[GenericResource] = js.native
    def get(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      apiVersion: String,
      callback: ServiceCallback[GenericResource]
    ): Unit = js.native
    def get(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      apiVersion: String,
      options: CustomHeaders
    ): js.Promise[GenericResource] = js.native
    def get(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      apiVersion: String,
      options: CustomHeaders,
      callback: ServiceCallback[GenericResource]
    ): Unit = js.native
    
    /**
      * Gets a resource by ID.
      *
      * @param {string} resourceId The fully qualified ID of the resource, including
      * the resource name and resource type. Use the format,
      * /subscriptions/{guid}/resourceGroups/{resource-group-name}/{resource-provider-namespace}/{resource-type}/{resource-name}
      *
      * @param {string} apiVersion The API version to use for the operation.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {GenericResource} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {GenericResource} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link GenericResource} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def getById(resourceId: String, apiVersion: String): js.Promise[GenericResource] = js.native
    def getById(resourceId: String, apiVersion: String, callback: ServiceCallback[GenericResource]): Unit = js.native
    def getById(resourceId: String, apiVersion: String, options: CustomHeaders): js.Promise[GenericResource] = js.native
    def getById(
      resourceId: String,
      apiVersion: String,
      options: CustomHeaders,
      callback: ServiceCallback[GenericResource]
    ): Unit = js.native
    
    /**
      * Gets a resource by ID.
      *
      * @param {string} resourceId The fully qualified ID of the resource, including
      * the resource name and resource type. Use the format,
      * /subscriptions/{guid}/resourceGroups/{resource-group-name}/{resource-provider-namespace}/{resource-type}/{resource-name}
      *
      * @param {string} apiVersion The API version to use for the operation.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<GenericResource>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def getByIdWithHttpOperationResponse(resourceId: String, apiVersion: String): js.Promise[HttpOperationResponse[GenericResource]] = js.native
    def getByIdWithHttpOperationResponse(resourceId: String, apiVersion: String, options: CustomHeaders): js.Promise[HttpOperationResponse[GenericResource]] = js.native
    
    /**
      * Gets a resource.
      *
      * @param {string} resourceGroupName The name of the resource group containing
      * the resource to get. The name is case insensitive.
      *
      * @param {string} resourceProviderNamespace The namespace of the resource
      * provider.
      *
      * @param {string} parentResourcePath The parent resource identity.
      *
      * @param {string} resourceType The resource type of the resource.
      *
      * @param {string} resourceName The name of the resource to get.
      *
      * @param {string} apiVersion The API version to use for the operation.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<GenericResource>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def getWithHttpOperationResponse(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      apiVersion: String
    ): js.Promise[HttpOperationResponse[GenericResource]] = js.native
    def getWithHttpOperationResponse(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      apiVersion: String,
      options: CustomHeaders
    ): js.Promise[HttpOperationResponse[GenericResource]] = js.native
    
    /**
      * Get all the resources in a subscription.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {string} [options.filter] The filter to apply on the
      * operation.<br><br>The properties you can use for eq (equals) or ne (not
      * equals) are: location, resourceType, name, resourceGroup, identity,
      * identity/principalId, plan, plan/publisher, plan/product, plan/name,
      * plan/version, and plan/promotionCode.<br><br>For example, to filter by a
      * resource type, use: $filter=resourceType eq
      * 'Microsoft.Network/virtualNetworks'<br><br>You can use substringof(value,
      * property) in the filter. The properties you can use for substring are: name
      * and resourceGroup.<br><br>For example, to get all resources with 'demo'
      * anywhere in the name, use: $filter=substringof('demo', name)<br><br>You can
      * link more than one substringof together by adding and/or
      * operators.<br><br>You can filter by tag names and values. For example, to
      * filter for a tag name and value, use $filter=tagName eq 'tag1' and tagValue
      * eq 'Value1'<br><br>You can use some properties together when filtering. The
      * combinations you can use are: substringof and/or resourceType, plan and
      * plan/publisher and plan/name, identity and identity/principalId.
      *
      * @param {string} [options.expand] The $expand query parameter. You can expand
      * createdTime and changedTime. For example, to expand both properties, use
      * $expand=changedTime,createdTime
      *
      * @param {number} [options.top] The number of results to return. If null is
      * passed, returns all resource groups.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {ResourceListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {ResourceListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link ResourceListResult} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def list(): js.Promise[ResourceListResult] = js.native
    def list(callback: ServiceCallback[ResourceListResult]): Unit = js.native
    def list(options: ExpandFilter): js.Promise[ResourceListResult] = js.native
    def list(options: ExpandFilter, callback: ServiceCallback[ResourceListResult]): Unit = js.native
    
    /**
      * Get all the resources for a resource group.
      *
      * @param {string} resourceGroupName The resource group with the resources to
      * get.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {string} [options.filter] The filter to apply on the
      * operation.<br><br>The properties you can use for eq (equals) or ne (not
      * equals) are: location, resourceType, name, resourceGroup, identity,
      * identity/principalId, plan, plan/publisher, plan/product, plan/name,
      * plan/version, and plan/promotionCode.<br><br>For example, to filter by a
      * resource type, use: $filter=resourceType eq
      * 'Microsoft.Network/virtualNetworks'<br><br>You can use substringof(value,
      * property) in the filter. The properties you can use for substring are: name
      * and resourceGroup.<br><br>For example, to get all resources with 'demo'
      * anywhere in the name, use: $filter=substringof('demo', name)<br><br>You can
      * link more than one substringof together by adding and/or
      * operators.<br><br>You can filter by tag names and values. For example, to
      * filter for a tag name and value, use $filter=tagName eq 'tag1' and tagValue
      * eq 'Value1'<br><br>You can use some properties together when filtering. The
      * combinations you can use are: substringof and/or resourceType, plan and
      * plan/publisher and plan/name, identity and identity/principalId.
      *
      * @param {string} [options.expand] The $expand query parameter. You can expand
      * createdTime and changedTime. For example, to expand both properties, use
      * $expand=changedTime,createdTime
      *
      * @param {number} [options.top] The number of results to return. If null is
      * passed, returns all resources.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {ResourceListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {ResourceListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link ResourceListResult} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def listByResourceGroup(resourceGroupName: String): js.Promise[ResourceListResult] = js.native
    def listByResourceGroup(resourceGroupName: String, callback: ServiceCallback[ResourceListResult]): Unit = js.native
    def listByResourceGroup(resourceGroupName: String, options: ExpandFilter): js.Promise[ResourceListResult] = js.native
    def listByResourceGroup(resourceGroupName: String, options: ExpandFilter, callback: ServiceCallback[ResourceListResult]): Unit = js.native
    
    /**
      * Get all the resources for a resource group.
      *
      * @param {string} nextPageLink The NextLink from the previous successful call
      * to List operation.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {ResourceListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {ResourceListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link ResourceListResult} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def listByResourceGroupNext(nextPageLink: String): js.Promise[ResourceListResult] = js.native
    def listByResourceGroupNext(nextPageLink: String, callback: ServiceCallback[ResourceListResult]): Unit = js.native
    def listByResourceGroupNext(nextPageLink: String, options: CustomHeaders): js.Promise[ResourceListResult] = js.native
    def listByResourceGroupNext(nextPageLink: String, options: CustomHeaders, callback: ServiceCallback[ResourceListResult]): Unit = js.native
    
    /**
      * Get all the resources for a resource group.
      *
      * @param {string} nextPageLink The NextLink from the previous successful call
      * to List operation.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<ResourceListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listByResourceGroupNextWithHttpOperationResponse(nextPageLink: String): js.Promise[HttpOperationResponse[ResourceListResult]] = js.native
    def listByResourceGroupNextWithHttpOperationResponse(nextPageLink: String, options: CustomHeaders): js.Promise[HttpOperationResponse[ResourceListResult]] = js.native
    
    /**
      * Get all the resources for a resource group.
      *
      * @param {string} resourceGroupName The resource group with the resources to
      * get.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {string} [options.filter] The filter to apply on the
      * operation.<br><br>The properties you can use for eq (equals) or ne (not
      * equals) are: location, resourceType, name, resourceGroup, identity,
      * identity/principalId, plan, plan/publisher, plan/product, plan/name,
      * plan/version, and plan/promotionCode.<br><br>For example, to filter by a
      * resource type, use: $filter=resourceType eq
      * 'Microsoft.Network/virtualNetworks'<br><br>You can use substringof(value,
      * property) in the filter. The properties you can use for substring are: name
      * and resourceGroup.<br><br>For example, to get all resources with 'demo'
      * anywhere in the name, use: $filter=substringof('demo', name)<br><br>You can
      * link more than one substringof together by adding and/or
      * operators.<br><br>You can filter by tag names and values. For example, to
      * filter for a tag name and value, use $filter=tagName eq 'tag1' and tagValue
      * eq 'Value1'<br><br>You can use some properties together when filtering. The
      * combinations you can use are: substringof and/or resourceType, plan and
      * plan/publisher and plan/name, identity and identity/principalId.
      *
      * @param {string} [options.expand] The $expand query parameter. You can expand
      * createdTime and changedTime. For example, to expand both properties, use
      * $expand=changedTime,createdTime
      *
      * @param {number} [options.top] The number of results to return. If null is
      * passed, returns all resources.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<ResourceListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listByResourceGroupWithHttpOperationResponse(resourceGroupName: String): js.Promise[HttpOperationResponse[ResourceListResult]] = js.native
    def listByResourceGroupWithHttpOperationResponse(resourceGroupName: String, options: ExpandFilter): js.Promise[HttpOperationResponse[ResourceListResult]] = js.native
    
    /**
      * Get all the resources in a subscription.
      *
      * @param {string} nextPageLink The NextLink from the previous successful call
      * to List operation.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {ResourceListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {ResourceListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link ResourceListResult} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def listNext(nextPageLink: String): js.Promise[ResourceListResult] = js.native
    def listNext(nextPageLink: String, callback: ServiceCallback[ResourceListResult]): Unit = js.native
    def listNext(nextPageLink: String, options: CustomHeaders): js.Promise[ResourceListResult] = js.native
    def listNext(nextPageLink: String, options: CustomHeaders, callback: ServiceCallback[ResourceListResult]): Unit = js.native
    
    /**
      * Get all the resources in a subscription.
      *
      * @param {string} nextPageLink The NextLink from the previous successful call
      * to List operation.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<ResourceListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listNextWithHttpOperationResponse(nextPageLink: String): js.Promise[HttpOperationResponse[ResourceListResult]] = js.native
    def listNextWithHttpOperationResponse(nextPageLink: String, options: CustomHeaders): js.Promise[HttpOperationResponse[ResourceListResult]] = js.native
    
    /**
      * Get all the resources in a subscription.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {string} [options.filter] The filter to apply on the
      * operation.<br><br>The properties you can use for eq (equals) or ne (not
      * equals) are: location, resourceType, name, resourceGroup, identity,
      * identity/principalId, plan, plan/publisher, plan/product, plan/name,
      * plan/version, and plan/promotionCode.<br><br>For example, to filter by a
      * resource type, use: $filter=resourceType eq
      * 'Microsoft.Network/virtualNetworks'<br><br>You can use substringof(value,
      * property) in the filter. The properties you can use for substring are: name
      * and resourceGroup.<br><br>For example, to get all resources with 'demo'
      * anywhere in the name, use: $filter=substringof('demo', name)<br><br>You can
      * link more than one substringof together by adding and/or
      * operators.<br><br>You can filter by tag names and values. For example, to
      * filter for a tag name and value, use $filter=tagName eq 'tag1' and tagValue
      * eq 'Value1'<br><br>You can use some properties together when filtering. The
      * combinations you can use are: substringof and/or resourceType, plan and
      * plan/publisher and plan/name, identity and identity/principalId.
      *
      * @param {string} [options.expand] The $expand query parameter. You can expand
      * createdTime and changedTime. For example, to expand both properties, use
      * $expand=changedTime,createdTime
      *
      * @param {number} [options.top] The number of results to return. If null is
      * passed, returns all resource groups.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<ResourceListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listWithHttpOperationResponse(): js.Promise[HttpOperationResponse[ResourceListResult]] = js.native
    def listWithHttpOperationResponse(options: ExpandFilter): js.Promise[HttpOperationResponse[ResourceListResult]] = js.native
    
    /**
      * @summary Moves resources from one resource group to another resource group.
      *
      * The resources to move must be in the same source resource group. The target
      * resource group may be in a different subscription. When moving resources,
      * both the source group and the target group are locked for the duration of
      * the operation. Write and delete operations are blocked on the groups until
      * the move completes.
      *
      * @param {string} sourceResourceGroupName The name of the resource group
      * containing the resources to move.
      *
      * @param {object} parameters Parameters for moving resources.
      *
      * @param {array} [parameters.resources] The IDs of the resources.
      *
      * @param {string} [parameters.targetResourceGroup] The target resource group.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {null} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {null} [result]   - The deserialized result object if an error did not occur.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def moveResources(sourceResourceGroupName: String, parameters: ResourcesMoveInfo): js.Promise[Unit] = js.native
    def moveResources(sourceResourceGroupName: String, parameters: ResourcesMoveInfo, callback: ServiceCallback[Unit]): Unit = js.native
    def moveResources(sourceResourceGroupName: String, parameters: ResourcesMoveInfo, options: CustomHeaders): js.Promise[Unit] = js.native
    def moveResources(
      sourceResourceGroupName: String,
      parameters: ResourcesMoveInfo,
      options: CustomHeaders,
      callback: ServiceCallback[Unit]
    ): Unit = js.native
    
    /**
      * @summary Moves resources from one resource group to another resource group.
      *
      * The resources to move must be in the same source resource group. The target
      * resource group may be in a different subscription. When moving resources,
      * both the source group and the target group are locked for the duration of
      * the operation. Write and delete operations are blocked on the groups until
      * the move completes.
      *
      * @param {string} sourceResourceGroupName The name of the resource group
      * containing the resources to move.
      *
      * @param {object} parameters Parameters for moving resources.
      *
      * @param {array} [parameters.resources] The IDs of the resources.
      *
      * @param {string} [parameters.targetResourceGroup] The target resource group.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<null>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def moveResourcesWithHttpOperationResponse(sourceResourceGroupName: String, parameters: ResourcesMoveInfo): js.Promise[HttpOperationResponse[Unit]] = js.native
    def moveResourcesWithHttpOperationResponse(sourceResourceGroupName: String, parameters: ResourcesMoveInfo, options: CustomHeaders): js.Promise[HttpOperationResponse[Unit]] = js.native
    
    /**
      * Updates a resource.
      *
      * @param {string} resourceGroupName The name of the resource group for the
      * resource. The name is case insensitive.
      *
      * @param {string} resourceProviderNamespace The namespace of the resource
      * provider.
      *
      * @param {string} parentResourcePath The parent resource identity.
      *
      * @param {string} resourceType The resource type of the resource to update.
      *
      * @param {string} resourceName The name of the resource to update.
      *
      * @param {string} apiVersion The API version to use for the operation.
      *
      * @param {object} parameters Parameters for updating the resource.
      *
      * @param {object} [parameters.plan] The plan of the resource.
      *
      * @param {string} [parameters.plan.name] The plan ID.
      *
      * @param {string} [parameters.plan.publisher] The publisher ID.
      *
      * @param {string} [parameters.plan.product] The offer ID.
      *
      * @param {string} [parameters.plan.promotionCode] The promotion code.
      *
      * @param {string} [parameters.plan.version] The plan's version.
      *
      * @param {object} [parameters.properties] The resource properties.
      *
      * @param {string} [parameters.kind] The kind of the resource.
      *
      * @param {string} [parameters.managedBy] ID of the resource that manages this
      * resource.
      *
      * @param {object} [parameters.sku] The SKU of the resource.
      *
      * @param {string} [parameters.sku.name] The SKU name.
      *
      * @param {string} [parameters.sku.tier] The SKU tier.
      *
      * @param {string} [parameters.sku.size] The SKU size.
      *
      * @param {string} [parameters.sku.family] The SKU family.
      *
      * @param {string} [parameters.sku.model] The SKU model.
      *
      * @param {number} [parameters.sku.capacity] The SKU capacity.
      *
      * @param {object} [parameters.identity] The identity of the resource.
      *
      * @param {string} [parameters.identity.type] The identity type. Possible
      * values include: 'SystemAssigned', 'UserAssigned', 'SystemAssigned,
      * UserAssigned', 'None'
      *
      * @param {object} [parameters.identity.userAssignedIdentities] The list of
      * user identities associated with the resource. The user identity dictionary
      * key references will be ARM resource ids in the form:
      * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
      *
      * @param {string} [parameters.location] Resource location
      *
      * @param {object} [parameters.tags] Resource tags
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {GenericResource} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {GenericResource} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link GenericResource} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def update(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      apiVersion: String,
      parameters: GenericResource
    ): js.Promise[GenericResource] = js.native
    def update(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      apiVersion: String,
      parameters: GenericResource,
      callback: ServiceCallback[GenericResource]
    ): Unit = js.native
    def update(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      apiVersion: String,
      parameters: GenericResource,
      options: CustomHeaders
    ): js.Promise[GenericResource] = js.native
    def update(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      apiVersion: String,
      parameters: GenericResource,
      options: CustomHeaders,
      callback: ServiceCallback[GenericResource]
    ): Unit = js.native
    
    /**
      * Updates a resource by ID.
      *
      * @param {string} resourceId The fully qualified ID of the resource, including
      * the resource name and resource type. Use the format,
      * /subscriptions/{guid}/resourceGroups/{resource-group-name}/{resource-provider-namespace}/{resource-type}/{resource-name}
      *
      * @param {string} apiVersion The API version to use for the operation.
      *
      * @param {object} parameters Update resource parameters.
      *
      * @param {object} [parameters.plan] The plan of the resource.
      *
      * @param {string} [parameters.plan.name] The plan ID.
      *
      * @param {string} [parameters.plan.publisher] The publisher ID.
      *
      * @param {string} [parameters.plan.product] The offer ID.
      *
      * @param {string} [parameters.plan.promotionCode] The promotion code.
      *
      * @param {string} [parameters.plan.version] The plan's version.
      *
      * @param {object} [parameters.properties] The resource properties.
      *
      * @param {string} [parameters.kind] The kind of the resource.
      *
      * @param {string} [parameters.managedBy] ID of the resource that manages this
      * resource.
      *
      * @param {object} [parameters.sku] The SKU of the resource.
      *
      * @param {string} [parameters.sku.name] The SKU name.
      *
      * @param {string} [parameters.sku.tier] The SKU tier.
      *
      * @param {string} [parameters.sku.size] The SKU size.
      *
      * @param {string} [parameters.sku.family] The SKU family.
      *
      * @param {string} [parameters.sku.model] The SKU model.
      *
      * @param {number} [parameters.sku.capacity] The SKU capacity.
      *
      * @param {object} [parameters.identity] The identity of the resource.
      *
      * @param {string} [parameters.identity.type] The identity type. Possible
      * values include: 'SystemAssigned', 'UserAssigned', 'SystemAssigned,
      * UserAssigned', 'None'
      *
      * @param {object} [parameters.identity.userAssignedIdentities] The list of
      * user identities associated with the resource. The user identity dictionary
      * key references will be ARM resource ids in the form:
      * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
      *
      * @param {string} [parameters.location] Resource location
      *
      * @param {object} [parameters.tags] Resource tags
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {GenericResource} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {GenericResource} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link GenericResource} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def updateById(resourceId: String, apiVersion: String, parameters: GenericResource): js.Promise[GenericResource] = js.native
    def updateById(
      resourceId: String,
      apiVersion: String,
      parameters: GenericResource,
      callback: ServiceCallback[GenericResource]
    ): Unit = js.native
    def updateById(resourceId: String, apiVersion: String, parameters: GenericResource, options: CustomHeaders): js.Promise[GenericResource] = js.native
    def updateById(
      resourceId: String,
      apiVersion: String,
      parameters: GenericResource,
      options: CustomHeaders,
      callback: ServiceCallback[GenericResource]
    ): Unit = js.native
    
    /**
      * Updates a resource by ID.
      *
      * @param {string} resourceId The fully qualified ID of the resource, including
      * the resource name and resource type. Use the format,
      * /subscriptions/{guid}/resourceGroups/{resource-group-name}/{resource-provider-namespace}/{resource-type}/{resource-name}
      *
      * @param {string} apiVersion The API version to use for the operation.
      *
      * @param {object} parameters Update resource parameters.
      *
      * @param {object} [parameters.plan] The plan of the resource.
      *
      * @param {string} [parameters.plan.name] The plan ID.
      *
      * @param {string} [parameters.plan.publisher] The publisher ID.
      *
      * @param {string} [parameters.plan.product] The offer ID.
      *
      * @param {string} [parameters.plan.promotionCode] The promotion code.
      *
      * @param {string} [parameters.plan.version] The plan's version.
      *
      * @param {object} [parameters.properties] The resource properties.
      *
      * @param {string} [parameters.kind] The kind of the resource.
      *
      * @param {string} [parameters.managedBy] ID of the resource that manages this
      * resource.
      *
      * @param {object} [parameters.sku] The SKU of the resource.
      *
      * @param {string} [parameters.sku.name] The SKU name.
      *
      * @param {string} [parameters.sku.tier] The SKU tier.
      *
      * @param {string} [parameters.sku.size] The SKU size.
      *
      * @param {string} [parameters.sku.family] The SKU family.
      *
      * @param {string} [parameters.sku.model] The SKU model.
      *
      * @param {number} [parameters.sku.capacity] The SKU capacity.
      *
      * @param {object} [parameters.identity] The identity of the resource.
      *
      * @param {string} [parameters.identity.type] The identity type. Possible
      * values include: 'SystemAssigned', 'UserAssigned', 'SystemAssigned,
      * UserAssigned', 'None'
      *
      * @param {object} [parameters.identity.userAssignedIdentities] The list of
      * user identities associated with the resource. The user identity dictionary
      * key references will be ARM resource ids in the form:
      * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
      *
      * @param {string} [parameters.location] Resource location
      *
      * @param {object} [parameters.tags] Resource tags
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<GenericResource>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def updateByIdWithHttpOperationResponse(resourceId: String, apiVersion: String, parameters: GenericResource): js.Promise[HttpOperationResponse[GenericResource]] = js.native
    def updateByIdWithHttpOperationResponse(resourceId: String, apiVersion: String, parameters: GenericResource, options: CustomHeaders): js.Promise[HttpOperationResponse[GenericResource]] = js.native
    
    /**
      * Updates a resource.
      *
      * @param {string} resourceGroupName The name of the resource group for the
      * resource. The name is case insensitive.
      *
      * @param {string} resourceProviderNamespace The namespace of the resource
      * provider.
      *
      * @param {string} parentResourcePath The parent resource identity.
      *
      * @param {string} resourceType The resource type of the resource to update.
      *
      * @param {string} resourceName The name of the resource to update.
      *
      * @param {string} apiVersion The API version to use for the operation.
      *
      * @param {object} parameters Parameters for updating the resource.
      *
      * @param {object} [parameters.plan] The plan of the resource.
      *
      * @param {string} [parameters.plan.name] The plan ID.
      *
      * @param {string} [parameters.plan.publisher] The publisher ID.
      *
      * @param {string} [parameters.plan.product] The offer ID.
      *
      * @param {string} [parameters.plan.promotionCode] The promotion code.
      *
      * @param {string} [parameters.plan.version] The plan's version.
      *
      * @param {object} [parameters.properties] The resource properties.
      *
      * @param {string} [parameters.kind] The kind of the resource.
      *
      * @param {string} [parameters.managedBy] ID of the resource that manages this
      * resource.
      *
      * @param {object} [parameters.sku] The SKU of the resource.
      *
      * @param {string} [parameters.sku.name] The SKU name.
      *
      * @param {string} [parameters.sku.tier] The SKU tier.
      *
      * @param {string} [parameters.sku.size] The SKU size.
      *
      * @param {string} [parameters.sku.family] The SKU family.
      *
      * @param {string} [parameters.sku.model] The SKU model.
      *
      * @param {number} [parameters.sku.capacity] The SKU capacity.
      *
      * @param {object} [parameters.identity] The identity of the resource.
      *
      * @param {string} [parameters.identity.type] The identity type. Possible
      * values include: 'SystemAssigned', 'UserAssigned', 'SystemAssigned,
      * UserAssigned', 'None'
      *
      * @param {object} [parameters.identity.userAssignedIdentities] The list of
      * user identities associated with the resource. The user identity dictionary
      * key references will be ARM resource ids in the form:
      * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
      *
      * @param {string} [parameters.location] Resource location
      *
      * @param {object} [parameters.tags] Resource tags
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<GenericResource>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def updateWithHttpOperationResponse(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      apiVersion: String,
      parameters: GenericResource
    ): js.Promise[HttpOperationResponse[GenericResource]] = js.native
    def updateWithHttpOperationResponse(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      apiVersion: String,
      parameters: GenericResource,
      options: CustomHeaders
    ): js.Promise[HttpOperationResponse[GenericResource]] = js.native
    
    /**
      * @summary Validates whether resources can be moved from one resource group to
      * another resource group.
      *
      * This operation checks whether the specified resources can be moved to the
      * target. The resources to move must be in the same source resource group. The
      * target resource group may be in a different subscription. If validation
      * succeeds, it returns HTTP response code 204 (no content). If validation
      * fails, it returns HTTP response code 409 (Conflict) with an error message.
      * Retrieve the URL in the Location header value to check the result of the
      * long-running operation.
      *
      * @param {string} sourceResourceGroupName The name of the resource group
      * containing the resources to validate for move.
      *
      * @param {object} parameters Parameters for moving resources.
      *
      * @param {array} [parameters.resources] The IDs of the resources.
      *
      * @param {string} [parameters.targetResourceGroup] The target resource group.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {null} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {null} [result]   - The deserialized result object if an error did not occur.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def validateMoveResources(sourceResourceGroupName: String, parameters: ResourcesMoveInfo): js.Promise[Unit] = js.native
    def validateMoveResources(sourceResourceGroupName: String, parameters: ResourcesMoveInfo, callback: ServiceCallback[Unit]): Unit = js.native
    def validateMoveResources(sourceResourceGroupName: String, parameters: ResourcesMoveInfo, options: CustomHeaders): js.Promise[Unit] = js.native
    def validateMoveResources(
      sourceResourceGroupName: String,
      parameters: ResourcesMoveInfo,
      options: CustomHeaders,
      callback: ServiceCallback[Unit]
    ): Unit = js.native
    
    /**
      * @summary Validates whether resources can be moved from one resource group to
      * another resource group.
      *
      * This operation checks whether the specified resources can be moved to the
      * target. The resources to move must be in the same source resource group. The
      * target resource group may be in a different subscription. If validation
      * succeeds, it returns HTTP response code 204 (no content). If validation
      * fails, it returns HTTP response code 409 (Conflict) with an error message.
      * Retrieve the URL in the Location header value to check the result of the
      * long-running operation.
      *
      * @param {string} sourceResourceGroupName The name of the resource group
      * containing the resources to validate for move.
      *
      * @param {object} parameters Parameters for moving resources.
      *
      * @param {array} [parameters.resources] The IDs of the resources.
      *
      * @param {string} [parameters.targetResourceGroup] The target resource group.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<null>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def validateMoveResourcesWithHttpOperationResponse(sourceResourceGroupName: String, parameters: ResourcesMoveInfo): js.Promise[HttpOperationResponse[Unit]] = js.native
    def validateMoveResourcesWithHttpOperationResponse(sourceResourceGroupName: String, parameters: ResourcesMoveInfo, options: CustomHeaders): js.Promise[HttpOperationResponse[Unit]] = js.native
  }
  
  @js.native
  trait Tags extends StObject {
    
    /**
      * @summary Creates a tag in the subscription.
      *
      * The tag name can have a maximum of 512 characters and is case insensitive.
      * Tag names created by Azure have prefixes of microsoft, azure, or windows.
      * You cannot create tags with one of these prefixes.
      *
      * @param {string} tagName The name of the tag to create.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {TagDetails} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {TagDetails} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link TagDetails} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def createOrUpdate(tagName: String): js.Promise[TagDetails] = js.native
    def createOrUpdate(tagName: String, callback: ServiceCallback[TagDetails]): Unit = js.native
    def createOrUpdate(tagName: String, options: CustomHeaders): js.Promise[TagDetails] = js.native
    def createOrUpdate(tagName: String, options: CustomHeaders, callback: ServiceCallback[TagDetails]): Unit = js.native
    
    /**
      * Creates a tag value. The name of the tag must already exist.
      *
      * @param {string} tagName The name of the tag.
      *
      * @param {string} tagValue The value of the tag to create.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {TagValue} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {TagValue} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link TagValue} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def createOrUpdateValue(tagName: String, tagValue: String): js.Promise[TagValue] = js.native
    def createOrUpdateValue(tagName: String, tagValue: String, callback: ServiceCallback[TagValue]): Unit = js.native
    def createOrUpdateValue(tagName: String, tagValue: String, options: CustomHeaders): js.Promise[TagValue] = js.native
    def createOrUpdateValue(tagName: String, tagValue: String, options: CustomHeaders, callback: ServiceCallback[TagValue]): Unit = js.native
    
    /**
      * Creates a tag value. The name of the tag must already exist.
      *
      * @param {string} tagName The name of the tag.
      *
      * @param {string} tagValue The value of the tag to create.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<TagValue>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def createOrUpdateValueWithHttpOperationResponse(tagName: String, tagValue: String): js.Promise[HttpOperationResponse[TagValue]] = js.native
    def createOrUpdateValueWithHttpOperationResponse(tagName: String, tagValue: String, options: CustomHeaders): js.Promise[HttpOperationResponse[TagValue]] = js.native
    
    /**
      * @summary Creates a tag in the subscription.
      *
      * The tag name can have a maximum of 512 characters and is case insensitive.
      * Tag names created by Azure have prefixes of microsoft, azure, or windows.
      * You cannot create tags with one of these prefixes.
      *
      * @param {string} tagName The name of the tag to create.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<TagDetails>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def createOrUpdateWithHttpOperationResponse(tagName: String): js.Promise[HttpOperationResponse[TagDetails]] = js.native
    def createOrUpdateWithHttpOperationResponse(tagName: String, options: CustomHeaders): js.Promise[HttpOperationResponse[TagDetails]] = js.native
    
    /**
      * @summary Deletes a tag from the subscription.
      *
      * You must remove all values from a resource tag before you can delete it.
      *
      * @param {string} tagName The name of the tag.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {null} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {null} [result]   - The deserialized result object if an error did not occur.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def deleteMethod(tagName: String): js.Promise[Unit] = js.native
    def deleteMethod(tagName: String, callback: ServiceCallback[Unit]): Unit = js.native
    def deleteMethod(tagName: String, options: CustomHeaders): js.Promise[Unit] = js.native
    def deleteMethod(tagName: String, options: CustomHeaders, callback: ServiceCallback[Unit]): Unit = js.native
    
    /**
      * @summary Deletes a tag from the subscription.
      *
      * You must remove all values from a resource tag before you can delete it.
      *
      * @param {string} tagName The name of the tag.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<null>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def deleteMethodWithHttpOperationResponse(tagName: String): js.Promise[HttpOperationResponse[Unit]] = js.native
    def deleteMethodWithHttpOperationResponse(tagName: String, options: CustomHeaders): js.Promise[HttpOperationResponse[Unit]] = js.native
    
    /**
      * Deletes a tag value.
      *
      * @param {string} tagName The name of the tag.
      *
      * @param {string} tagValue The value of the tag to delete.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {null} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {null} [result]   - The deserialized result object if an error did not occur.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def deleteValue(tagName: String, tagValue: String): js.Promise[Unit] = js.native
    def deleteValue(tagName: String, tagValue: String, callback: ServiceCallback[Unit]): Unit = js.native
    def deleteValue(tagName: String, tagValue: String, options: CustomHeaders): js.Promise[Unit] = js.native
    def deleteValue(tagName: String, tagValue: String, options: CustomHeaders, callback: ServiceCallback[Unit]): Unit = js.native
    
    /**
      * Deletes a tag value.
      *
      * @param {string} tagName The name of the tag.
      *
      * @param {string} tagValue The value of the tag to delete.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<null>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def deleteValueWithHttpOperationResponse(tagName: String, tagValue: String): js.Promise[HttpOperationResponse[Unit]] = js.native
    def deleteValueWithHttpOperationResponse(tagName: String, tagValue: String, options: CustomHeaders): js.Promise[HttpOperationResponse[Unit]] = js.native
    
    /**
      * Gets the names and values of all resource tags that are defined in a
      * subscription.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {TagsListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {TagsListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link TagsListResult} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def list(): js.Promise[TagsListResult] = js.native
    def list(callback: ServiceCallback[TagsListResult]): Unit = js.native
    def list(options: CustomHeaders): js.Promise[TagsListResult] = js.native
    def list(options: CustomHeaders, callback: ServiceCallback[TagsListResult]): Unit = js.native
    
    /**
      * Gets the names and values of all resource tags that are defined in a
      * subscription.
      *
      * @param {string} nextPageLink The NextLink from the previous successful call
      * to List operation.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @param {ServiceCallback} [optionalCallback] - The optional callback.
      *
      * @returns {ServiceCallback|Promise} If a callback was passed as the last
      * parameter then it returns the callback else returns a Promise.
      *
      * {Promise} A promise is returned.
      *
      *                      @resolve {TagsListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {TagsListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link TagsListResult} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def listNext(nextPageLink: String): js.Promise[TagsListResult] = js.native
    def listNext(nextPageLink: String, callback: ServiceCallback[TagsListResult]): Unit = js.native
    def listNext(nextPageLink: String, options: CustomHeaders): js.Promise[TagsListResult] = js.native
    def listNext(nextPageLink: String, options: CustomHeaders, callback: ServiceCallback[TagsListResult]): Unit = js.native
    
    /**
      * Gets the names and values of all resource tags that are defined in a
      * subscription.
      *
      * @param {string} nextPageLink The NextLink from the previous successful call
      * to List operation.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<TagsListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listNextWithHttpOperationResponse(nextPageLink: String): js.Promise[HttpOperationResponse[TagsListResult]] = js.native
    def listNextWithHttpOperationResponse(nextPageLink: String, options: CustomHeaders): js.Promise[HttpOperationResponse[TagsListResult]] = js.native
    
    /**
      * Gets the names and values of all resource tags that are defined in a
      * subscription.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<TagsListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listWithHttpOperationResponse(): js.Promise[HttpOperationResponse[TagsListResult]] = js.native
    def listWithHttpOperationResponse(options: CustomHeaders): js.Promise[HttpOperationResponse[TagsListResult]] = js.native
  }
}
