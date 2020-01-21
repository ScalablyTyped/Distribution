package typings.azureArmResource

import typings.azureArmResource.linkModelsMod.OperationListResult
import typings.azureArmResource.linkModelsMod.ResourceLink
import typings.azureArmResource.linkModelsMod.ResourceLinkResult
import typings.msRest.mod.HttpOperationResponse
import typings.msRest.mod.ServiceCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure-arm-resource/lib/link/operations", JSImport.Namespace)
@js.native
object linkOperationsMod extends js.Object {
  @js.native
  trait Operations extends js.Object {
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
    def list(options: AnonCustomHeaders): js.Promise[OperationListResult] = js.native
    def list(options: AnonCustomHeaders, callback: ServiceCallback[OperationListResult]): Unit = js.native
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
    def listNext(nextPageLink: String, options: AnonCustomHeaders): js.Promise[OperationListResult] = js.native
    def listNext(nextPageLink: String, options: AnonCustomHeaders, callback: ServiceCallback[OperationListResult]): Unit = js.native
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
    def listNextWithHttpOperationResponse(nextPageLink: String, options: AnonCustomHeaders): js.Promise[HttpOperationResponse[OperationListResult]] = js.native
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
    def listWithHttpOperationResponse(options: AnonCustomHeaders): js.Promise[HttpOperationResponse[OperationListResult]] = js.native
  }
  
  @js.native
  trait ResourceLinks extends js.Object {
    /**
      * Creates or updates a resource link between the specified resources.
      *
      * @param {string} linkId The fully qualified ID of the resource link. Use the
      * format,
      * /subscriptions/{subscription-id}/resourceGroups/{resource-group-name}/{provider-namespace}/{resource-type}/{resource-name}/Microsoft.Resources/links/{link-name}.
      * For example,
      * /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myGroup/Microsoft.Web/sites/mySite/Microsoft.Resources/links/myLink
      *
      * @param {object} parameters Parameters for creating or updating a resource
      * link.
      *
      * @param {object} [parameters.properties] Properties for resource link.
      *
      * @param {string} parameters.properties.targetId The fully qualified ID of the
      * target resource in the link.
      *
      * @param {string} [parameters.properties.notes] Notes about the resource link.
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
      *                      @resolve {ResourceLink} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {ResourceLink} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link ResourceLink} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def createOrUpdate(linkId: String, parameters: ResourceLink): js.Promise[ResourceLink] = js.native
    def createOrUpdate(linkId: String, parameters: ResourceLink, callback: ServiceCallback[ResourceLink]): Unit = js.native
    def createOrUpdate(linkId: String, parameters: ResourceLink, options: AnonCustomHeaders): js.Promise[ResourceLink] = js.native
    def createOrUpdate(
      linkId: String,
      parameters: ResourceLink,
      options: AnonCustomHeaders,
      callback: ServiceCallback[ResourceLink]
    ): Unit = js.native
    /**
      * Creates or updates a resource link between the specified resources.
      *
      * @param {string} linkId The fully qualified ID of the resource link. Use the
      * format,
      * /subscriptions/{subscription-id}/resourceGroups/{resource-group-name}/{provider-namespace}/{resource-type}/{resource-name}/Microsoft.Resources/links/{link-name}.
      * For example,
      * /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myGroup/Microsoft.Web/sites/mySite/Microsoft.Resources/links/myLink
      *
      * @param {object} parameters Parameters for creating or updating a resource
      * link.
      *
      * @param {object} [parameters.properties] Properties for resource link.
      *
      * @param {string} parameters.properties.targetId The fully qualified ID of the
      * target resource in the link.
      *
      * @param {string} [parameters.properties.notes] Notes about the resource link.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<ResourceLink>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def createOrUpdateWithHttpOperationResponse(linkId: String, parameters: ResourceLink): js.Promise[HttpOperationResponse[ResourceLink]] = js.native
    def createOrUpdateWithHttpOperationResponse(linkId: String, parameters: ResourceLink, options: AnonCustomHeaders): js.Promise[HttpOperationResponse[ResourceLink]] = js.native
    /**
      * Deletes a resource link with the specified ID.
      *
      * @param {string} linkId The fully qualified ID of the resource link. Use the
      * format,
      * /subscriptions/{subscription-id}/resourceGroups/{resource-group-name}/{provider-namespace}/{resource-type}/{resource-name}/Microsoft.Resources/links/{link-name}.
      * For example,
      * /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myGroup/Microsoft.Web/sites/mySite/Microsoft.Resources/links/myLink
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
    def deleteMethod(linkId: String): js.Promise[Unit] = js.native
    def deleteMethod(linkId: String, callback: ServiceCallback[Unit]): Unit = js.native
    def deleteMethod(linkId: String, options: AnonCustomHeaders): js.Promise[Unit] = js.native
    def deleteMethod(linkId: String, options: AnonCustomHeaders, callback: ServiceCallback[Unit]): Unit = js.native
    /**
      * Deletes a resource link with the specified ID.
      *
      * @param {string} linkId The fully qualified ID of the resource link. Use the
      * format,
      * /subscriptions/{subscription-id}/resourceGroups/{resource-group-name}/{provider-namespace}/{resource-type}/{resource-name}/Microsoft.Resources/links/{link-name}.
      * For example,
      * /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myGroup/Microsoft.Web/sites/mySite/Microsoft.Resources/links/myLink
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
    def deleteMethodWithHttpOperationResponse(linkId: String): js.Promise[HttpOperationResponse[Unit]] = js.native
    def deleteMethodWithHttpOperationResponse(linkId: String, options: AnonCustomHeaders): js.Promise[HttpOperationResponse[Unit]] = js.native
    /**
      * Gets a resource link with the specified ID.
      *
      * @param {string} linkId The fully qualified Id of the resource link. For
      * example,
      * /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myGroup/Microsoft.Web/sites/mySite/Microsoft.Resources/links/myLink
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
      *                      @resolve {ResourceLink} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {ResourceLink} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link ResourceLink} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def get(linkId: String): js.Promise[ResourceLink] = js.native
    def get(linkId: String, callback: ServiceCallback[ResourceLink]): Unit = js.native
    def get(linkId: String, options: AnonCustomHeaders): js.Promise[ResourceLink] = js.native
    def get(linkId: String, options: AnonCustomHeaders, callback: ServiceCallback[ResourceLink]): Unit = js.native
    /**
      * Gets a resource link with the specified ID.
      *
      * @param {string} linkId The fully qualified Id of the resource link. For
      * example,
      * /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myGroup/Microsoft.Web/sites/mySite/Microsoft.Resources/links/myLink
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<ResourceLink>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def getWithHttpOperationResponse(linkId: String): js.Promise[HttpOperationResponse[ResourceLink]] = js.native
    def getWithHttpOperationResponse(linkId: String, options: AnonCustomHeaders): js.Promise[HttpOperationResponse[ResourceLink]] = js.native
    /**
      * Gets a list of resource links at and below the specified source scope.
      *
      * @param {string} scope The fully qualified ID of the scope for getting the
      * resource links. For example, to list resource links at and under a resource
      * group, set the scope to
      * /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myGroup.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {string} [options.filter] The filter to apply when getting resource
      * links. To get links only at the specified scope (not below the scope), use
      * Filter.atScope(). Possible values include: 'atScope()'
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
      *                      @resolve {ResourceLinkResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {ResourceLinkResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link ResourceLinkResult} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def listAtSourceScope(scope: String): js.Promise[ResourceLinkResult] = js.native
    def listAtSourceScope(scope: String, callback: ServiceCallback[ResourceLinkResult]): Unit = js.native
    def listAtSourceScope(scope: String, options: AnonCustomHeadersFilter): js.Promise[ResourceLinkResult] = js.native
    def listAtSourceScope(scope: String, options: AnonCustomHeadersFilter, callback: ServiceCallback[ResourceLinkResult]): Unit = js.native
    /**
      * Gets a list of resource links at and below the specified source scope.
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
      *                      @resolve {ResourceLinkResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {ResourceLinkResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link ResourceLinkResult} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def listAtSourceScopeNext(nextPageLink: String): js.Promise[ResourceLinkResult] = js.native
    def listAtSourceScopeNext(nextPageLink: String, callback: ServiceCallback[ResourceLinkResult]): Unit = js.native
    def listAtSourceScopeNext(nextPageLink: String, options: AnonCustomHeaders): js.Promise[ResourceLinkResult] = js.native
    def listAtSourceScopeNext(nextPageLink: String, options: AnonCustomHeaders, callback: ServiceCallback[ResourceLinkResult]): Unit = js.native
    /**
      * Gets a list of resource links at and below the specified source scope.
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
      * @resolve {HttpOperationResponse<ResourceLinkResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listAtSourceScopeNextWithHttpOperationResponse(nextPageLink: String): js.Promise[HttpOperationResponse[ResourceLinkResult]] = js.native
    def listAtSourceScopeNextWithHttpOperationResponse(nextPageLink: String, options: AnonCustomHeaders): js.Promise[HttpOperationResponse[ResourceLinkResult]] = js.native
    /**
      * Gets a list of resource links at and below the specified source scope.
      *
      * @param {string} scope The fully qualified ID of the scope for getting the
      * resource links. For example, to list resource links at and under a resource
      * group, set the scope to
      * /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myGroup.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {string} [options.filter] The filter to apply when getting resource
      * links. To get links only at the specified scope (not below the scope), use
      * Filter.atScope(). Possible values include: 'atScope()'
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<ResourceLinkResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listAtSourceScopeWithHttpOperationResponse(scope: String): js.Promise[HttpOperationResponse[ResourceLinkResult]] = js.native
    def listAtSourceScopeWithHttpOperationResponse(scope: String, options: AnonCustomHeadersFilter): js.Promise[HttpOperationResponse[ResourceLinkResult]] = js.native
    /**
      * Gets all the linked resources for the subscription.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {string} [options.filter] The filter to apply on the list resource
      * links operation. The supported filter for list resource links is targetId.
      * For example, $filter=targetId eq {value}
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
      *                      @resolve {ResourceLinkResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {ResourceLinkResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link ResourceLinkResult} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def listAtSubscription(): js.Promise[ResourceLinkResult] = js.native
    def listAtSubscription(callback: ServiceCallback[ResourceLinkResult]): Unit = js.native
    def listAtSubscription(options: AnonCustomHeadersFilter): js.Promise[ResourceLinkResult] = js.native
    def listAtSubscription(options: AnonCustomHeadersFilter, callback: ServiceCallback[ResourceLinkResult]): Unit = js.native
    /**
      * Gets all the linked resources for the subscription.
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
      *                      @resolve {ResourceLinkResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {ResourceLinkResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link ResourceLinkResult} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def listAtSubscriptionNext(nextPageLink: String): js.Promise[ResourceLinkResult] = js.native
    def listAtSubscriptionNext(nextPageLink: String, callback: ServiceCallback[ResourceLinkResult]): Unit = js.native
    def listAtSubscriptionNext(nextPageLink: String, options: AnonCustomHeaders): js.Promise[ResourceLinkResult] = js.native
    def listAtSubscriptionNext(nextPageLink: String, options: AnonCustomHeaders, callback: ServiceCallback[ResourceLinkResult]): Unit = js.native
    /**
      * Gets all the linked resources for the subscription.
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
      * @resolve {HttpOperationResponse<ResourceLinkResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listAtSubscriptionNextWithHttpOperationResponse(nextPageLink: String): js.Promise[HttpOperationResponse[ResourceLinkResult]] = js.native
    def listAtSubscriptionNextWithHttpOperationResponse(nextPageLink: String, options: AnonCustomHeaders): js.Promise[HttpOperationResponse[ResourceLinkResult]] = js.native
    /**
      * Gets all the linked resources for the subscription.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {string} [options.filter] The filter to apply on the list resource
      * links operation. The supported filter for list resource links is targetId.
      * For example, $filter=targetId eq {value}
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<ResourceLinkResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listAtSubscriptionWithHttpOperationResponse(): js.Promise[HttpOperationResponse[ResourceLinkResult]] = js.native
    def listAtSubscriptionWithHttpOperationResponse(options: AnonCustomHeadersFilter): js.Promise[HttpOperationResponse[ResourceLinkResult]] = js.native
  }
  
}

