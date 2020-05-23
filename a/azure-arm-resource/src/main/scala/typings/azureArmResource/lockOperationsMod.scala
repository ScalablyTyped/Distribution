package typings.azureArmResource

import typings.azureArmResource.anon.CustomHeaders
import typings.azureArmResource.anon.Filter
import typings.azureArmResource.lockModelsMod.ManagementLockListResult
import typings.azureArmResource.lockModelsMod.ManagementLockObject
import typings.azureArmResource.lockModelsMod.OperationListResult
import typings.msRest.mod.HttpOperationResponse
import typings.msRest.mod.ServiceCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure-arm-resource/lib/lock/operations", JSImport.Namespace)
@js.native
object lockOperationsMod extends js.Object {
  @js.native
  trait AuthorizationOperations extends js.Object {
    /**
      * Lists all of the available Microsoft.Authorization REST API operations.
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
      * Lists all of the available Microsoft.Authorization REST API operations.
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
      * Lists all of the available Microsoft.Authorization REST API operations.
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
      * Lists all of the available Microsoft.Authorization REST API operations.
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
  trait ManagementLocks extends js.Object {
    /**
      * @summary Creates or updates a management lock at the resource group level.
      *
      * When you apply a lock at a parent scope, all child resources inherit the
      * same lock. To create management locks, you must have access to
      * Microsoft.Authorization/ * or Microsoft.Authorization/locks/ * actions. Of the
      * built-in roles, only Owner and User Access Administrator are granted those
      * actions.
      *
      * @param {string} resourceGroupName The name of the resource group to lock.
      *
      * @param {string} lockName The lock name. The lock name can be a maximum of
      * 260 characters. It cannot contain <, > %, &, :, \, ?, /, or any control
      * characters.
      *
      * @param {object} parameters The management lock parameters.
      *
      * @param {string} parameters.level The level of the lock. Possible values are:
      * NotSpecified, CanNotDelete, ReadOnly. CanNotDelete means authorized users
      * are able to read and modify the resources, but not delete. ReadOnly means
      * authorized users can only read from a resource, but they can't modify or
      * delete it. Possible values include: 'NotSpecified', 'CanNotDelete',
      * 'ReadOnly'
      *
      * @param {string} [parameters.notes] Notes about the lock. Maximum of 512
      * characters.
      *
      * @param {array} [parameters.owners] The owners of the lock.
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
      *                      @resolve {ManagementLockObject} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {ManagementLockObject} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link ManagementLockObject} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def createOrUpdateAtResourceGroupLevel(resourceGroupName: String, lockName: String, parameters: ManagementLockObject): js.Promise[ManagementLockObject] = js.native
    def createOrUpdateAtResourceGroupLevel(
      resourceGroupName: String,
      lockName: String,
      parameters: ManagementLockObject,
      callback: ServiceCallback[ManagementLockObject]
    ): Unit = js.native
    def createOrUpdateAtResourceGroupLevel(
      resourceGroupName: String,
      lockName: String,
      parameters: ManagementLockObject,
      options: CustomHeaders
    ): js.Promise[ManagementLockObject] = js.native
    def createOrUpdateAtResourceGroupLevel(
      resourceGroupName: String,
      lockName: String,
      parameters: ManagementLockObject,
      options: CustomHeaders,
      callback: ServiceCallback[ManagementLockObject]
    ): Unit = js.native
    /**
      * @summary Creates or updates a management lock at the resource group level.
      *
      * When you apply a lock at a parent scope, all child resources inherit the
      * same lock. To create management locks, you must have access to
      * Microsoft.Authorization/ * or Microsoft.Authorization/locks/ * actions. Of the
      * built-in roles, only Owner and User Access Administrator are granted those
      * actions.
      *
      * @param {string} resourceGroupName The name of the resource group to lock.
      *
      * @param {string} lockName The lock name. The lock name can be a maximum of
      * 260 characters. It cannot contain <, > %, &, :, \, ?, /, or any control
      * characters.
      *
      * @param {object} parameters The management lock parameters.
      *
      * @param {string} parameters.level The level of the lock. Possible values are:
      * NotSpecified, CanNotDelete, ReadOnly. CanNotDelete means authorized users
      * are able to read and modify the resources, but not delete. ReadOnly means
      * authorized users can only read from a resource, but they can't modify or
      * delete it. Possible values include: 'NotSpecified', 'CanNotDelete',
      * 'ReadOnly'
      *
      * @param {string} [parameters.notes] Notes about the lock. Maximum of 512
      * characters.
      *
      * @param {array} [parameters.owners] The owners of the lock.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<ManagementLockObject>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def createOrUpdateAtResourceGroupLevelWithHttpOperationResponse(resourceGroupName: String, lockName: String, parameters: ManagementLockObject): js.Promise[HttpOperationResponse[ManagementLockObject]] = js.native
    def createOrUpdateAtResourceGroupLevelWithHttpOperationResponse(
      resourceGroupName: String,
      lockName: String,
      parameters: ManagementLockObject,
      options: CustomHeaders
    ): js.Promise[HttpOperationResponse[ManagementLockObject]] = js.native
    /**
      * @summary Creates or updates a management lock at the resource level or any
      * level below the resource.
      *
      * When you apply a lock at a parent scope, all child resources inherit the
      * same lock. To create management locks, you must have access to
      * Microsoft.Authorization/ * or Microsoft.Authorization/locks/ * actions. Of the
      * built-in roles, only Owner and User Access Administrator are granted those
      * actions.
      *
      * @param {string} resourceGroupName The name of the resource group containing
      * the resource to lock.
      *
      * @param {string} resourceProviderNamespace The resource provider namespace of
      * the resource to lock.
      *
      * @param {string} parentResourcePath The parent resource identity.
      *
      * @param {string} resourceType The resource type of the resource to lock.
      *
      * @param {string} resourceName The name of the resource to lock.
      *
      * @param {string} lockName The name of lock. The lock name can be a maximum of
      * 260 characters. It cannot contain <, > %, &, :, \, ?, /, or any control
      * characters.
      *
      * @param {object} parameters Parameters for creating or updating a  management
      * lock.
      *
      * @param {string} parameters.level The level of the lock. Possible values are:
      * NotSpecified, CanNotDelete, ReadOnly. CanNotDelete means authorized users
      * are able to read and modify the resources, but not delete. ReadOnly means
      * authorized users can only read from a resource, but they can't modify or
      * delete it. Possible values include: 'NotSpecified', 'CanNotDelete',
      * 'ReadOnly'
      *
      * @param {string} [parameters.notes] Notes about the lock. Maximum of 512
      * characters.
      *
      * @param {array} [parameters.owners] The owners of the lock.
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
      *                      @resolve {ManagementLockObject} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {ManagementLockObject} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link ManagementLockObject} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def createOrUpdateAtResourceLevel(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      lockName: String,
      parameters: ManagementLockObject
    ): js.Promise[ManagementLockObject] = js.native
    def createOrUpdateAtResourceLevel(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      lockName: String,
      parameters: ManagementLockObject,
      callback: ServiceCallback[ManagementLockObject]
    ): Unit = js.native
    def createOrUpdateAtResourceLevel(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      lockName: String,
      parameters: ManagementLockObject,
      options: CustomHeaders
    ): js.Promise[ManagementLockObject] = js.native
    def createOrUpdateAtResourceLevel(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      lockName: String,
      parameters: ManagementLockObject,
      options: CustomHeaders,
      callback: ServiceCallback[ManagementLockObject]
    ): Unit = js.native
    /**
      * @summary Creates or updates a management lock at the resource level or any
      * level below the resource.
      *
      * When you apply a lock at a parent scope, all child resources inherit the
      * same lock. To create management locks, you must have access to
      * Microsoft.Authorization/ * or Microsoft.Authorization/locks/ * actions. Of the
      * built-in roles, only Owner and User Access Administrator are granted those
      * actions.
      *
      * @param {string} resourceGroupName The name of the resource group containing
      * the resource to lock.
      *
      * @param {string} resourceProviderNamespace The resource provider namespace of
      * the resource to lock.
      *
      * @param {string} parentResourcePath The parent resource identity.
      *
      * @param {string} resourceType The resource type of the resource to lock.
      *
      * @param {string} resourceName The name of the resource to lock.
      *
      * @param {string} lockName The name of lock. The lock name can be a maximum of
      * 260 characters. It cannot contain <, > %, &, :, \, ?, /, or any control
      * characters.
      *
      * @param {object} parameters Parameters for creating or updating a  management
      * lock.
      *
      * @param {string} parameters.level The level of the lock. Possible values are:
      * NotSpecified, CanNotDelete, ReadOnly. CanNotDelete means authorized users
      * are able to read and modify the resources, but not delete. ReadOnly means
      * authorized users can only read from a resource, but they can't modify or
      * delete it. Possible values include: 'NotSpecified', 'CanNotDelete',
      * 'ReadOnly'
      *
      * @param {string} [parameters.notes] Notes about the lock. Maximum of 512
      * characters.
      *
      * @param {array} [parameters.owners] The owners of the lock.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<ManagementLockObject>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def createOrUpdateAtResourceLevelWithHttpOperationResponse(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      lockName: String,
      parameters: ManagementLockObject
    ): js.Promise[HttpOperationResponse[ManagementLockObject]] = js.native
    def createOrUpdateAtResourceLevelWithHttpOperationResponse(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      lockName: String,
      parameters: ManagementLockObject,
      options: CustomHeaders
    ): js.Promise[HttpOperationResponse[ManagementLockObject]] = js.native
    /**
      * @summary Creates or updates a management lock at the subscription level.
      *
      * When you apply a lock at a parent scope, all child resources inherit the
      * same lock. To create management locks, you must have access to
      * Microsoft.Authorization/ * or Microsoft.Authorization/locks/ * actions. Of the
      * built-in roles, only Owner and User Access Administrator are granted those
      * actions.
      *
      * @param {string} lockName The name of lock. The lock name can be a maximum of
      * 260 characters. It cannot contain <, > %, &, :, \, ?, /, or any control
      * characters.
      *
      * @param {object} parameters The management lock parameters.
      *
      * @param {string} parameters.level The level of the lock. Possible values are:
      * NotSpecified, CanNotDelete, ReadOnly. CanNotDelete means authorized users
      * are able to read and modify the resources, but not delete. ReadOnly means
      * authorized users can only read from a resource, but they can't modify or
      * delete it. Possible values include: 'NotSpecified', 'CanNotDelete',
      * 'ReadOnly'
      *
      * @param {string} [parameters.notes] Notes about the lock. Maximum of 512
      * characters.
      *
      * @param {array} [parameters.owners] The owners of the lock.
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
      *                      @resolve {ManagementLockObject} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {ManagementLockObject} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link ManagementLockObject} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def createOrUpdateAtSubscriptionLevel(lockName: String, parameters: ManagementLockObject): js.Promise[ManagementLockObject] = js.native
    def createOrUpdateAtSubscriptionLevel(
      lockName: String,
      parameters: ManagementLockObject,
      callback: ServiceCallback[ManagementLockObject]
    ): Unit = js.native
    def createOrUpdateAtSubscriptionLevel(lockName: String, parameters: ManagementLockObject, options: CustomHeaders): js.Promise[ManagementLockObject] = js.native
    def createOrUpdateAtSubscriptionLevel(
      lockName: String,
      parameters: ManagementLockObject,
      options: CustomHeaders,
      callback: ServiceCallback[ManagementLockObject]
    ): Unit = js.native
    /**
      * @summary Creates or updates a management lock at the subscription level.
      *
      * When you apply a lock at a parent scope, all child resources inherit the
      * same lock. To create management locks, you must have access to
      * Microsoft.Authorization/ * or Microsoft.Authorization/locks/ * actions. Of the
      * built-in roles, only Owner and User Access Administrator are granted those
      * actions.
      *
      * @param {string} lockName The name of lock. The lock name can be a maximum of
      * 260 characters. It cannot contain <, > %, &, :, \, ?, /, or any control
      * characters.
      *
      * @param {object} parameters The management lock parameters.
      *
      * @param {string} parameters.level The level of the lock. Possible values are:
      * NotSpecified, CanNotDelete, ReadOnly. CanNotDelete means authorized users
      * are able to read and modify the resources, but not delete. ReadOnly means
      * authorized users can only read from a resource, but they can't modify or
      * delete it. Possible values include: 'NotSpecified', 'CanNotDelete',
      * 'ReadOnly'
      *
      * @param {string} [parameters.notes] Notes about the lock. Maximum of 512
      * characters.
      *
      * @param {array} [parameters.owners] The owners of the lock.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<ManagementLockObject>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def createOrUpdateAtSubscriptionLevelWithHttpOperationResponse(lockName: String, parameters: ManagementLockObject): js.Promise[HttpOperationResponse[ManagementLockObject]] = js.native
    def createOrUpdateAtSubscriptionLevelWithHttpOperationResponse(lockName: String, parameters: ManagementLockObject, options: CustomHeaders): js.Promise[HttpOperationResponse[ManagementLockObject]] = js.native
    /**
      * Create or update a management lock by scope.
      *
      * @param {string} scope The scope for the lock. When providing a scope for the
      * assignment, use '/subscriptions/{subscriptionId}' for subscriptions,
      * '/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}' for
      * resource groups, and
      * '/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{parentResourcePathIfPresent}/{resourceType}/{resourceName}'
      * for resources.
      *
      * @param {string} lockName The name of lock.
      *
      * @param {object} parameters Create or update management lock parameters.
      *
      * @param {string} parameters.level The level of the lock. Possible values are:
      * NotSpecified, CanNotDelete, ReadOnly. CanNotDelete means authorized users
      * are able to read and modify the resources, but not delete. ReadOnly means
      * authorized users can only read from a resource, but they can't modify or
      * delete it. Possible values include: 'NotSpecified', 'CanNotDelete',
      * 'ReadOnly'
      *
      * @param {string} [parameters.notes] Notes about the lock. Maximum of 512
      * characters.
      *
      * @param {array} [parameters.owners] The owners of the lock.
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
      *                      @resolve {ManagementLockObject} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {ManagementLockObject} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link ManagementLockObject} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def createOrUpdateByScope(scope: String, lockName: String, parameters: ManagementLockObject): js.Promise[ManagementLockObject] = js.native
    def createOrUpdateByScope(
      scope: String,
      lockName: String,
      parameters: ManagementLockObject,
      callback: ServiceCallback[ManagementLockObject]
    ): Unit = js.native
    def createOrUpdateByScope(scope: String, lockName: String, parameters: ManagementLockObject, options: CustomHeaders): js.Promise[ManagementLockObject] = js.native
    def createOrUpdateByScope(
      scope: String,
      lockName: String,
      parameters: ManagementLockObject,
      options: CustomHeaders,
      callback: ServiceCallback[ManagementLockObject]
    ): Unit = js.native
    /**
      * Create or update a management lock by scope.
      *
      * @param {string} scope The scope for the lock. When providing a scope for the
      * assignment, use '/subscriptions/{subscriptionId}' for subscriptions,
      * '/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}' for
      * resource groups, and
      * '/subscriptions/{subscriptionId}/resourcegroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{parentResourcePathIfPresent}/{resourceType}/{resourceName}'
      * for resources.
      *
      * @param {string} lockName The name of lock.
      *
      * @param {object} parameters Create or update management lock parameters.
      *
      * @param {string} parameters.level The level of the lock. Possible values are:
      * NotSpecified, CanNotDelete, ReadOnly. CanNotDelete means authorized users
      * are able to read and modify the resources, but not delete. ReadOnly means
      * authorized users can only read from a resource, but they can't modify or
      * delete it. Possible values include: 'NotSpecified', 'CanNotDelete',
      * 'ReadOnly'
      *
      * @param {string} [parameters.notes] Notes about the lock. Maximum of 512
      * characters.
      *
      * @param {array} [parameters.owners] The owners of the lock.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<ManagementLockObject>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def createOrUpdateByScopeWithHttpOperationResponse(scope: String, lockName: String, parameters: ManagementLockObject): js.Promise[HttpOperationResponse[ManagementLockObject]] = js.native
    def createOrUpdateByScopeWithHttpOperationResponse(scope: String, lockName: String, parameters: ManagementLockObject, options: CustomHeaders): js.Promise[HttpOperationResponse[ManagementLockObject]] = js.native
    /**
      * @summary Deletes a management lock at the resource group level.
      *
      * To delete management locks, you must have access to
      * Microsoft.Authorization/ * or Microsoft.Authorization/locks/ * actions. Of the
      * built-in roles, only Owner and User Access Administrator are granted those
      * actions.
      *
      * @param {string} resourceGroupName The name of the resource group containing
      * the lock.
      *
      * @param {string} lockName The name of lock to delete.
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
    def deleteAtResourceGroupLevel(resourceGroupName: String, lockName: String): js.Promise[Unit] = js.native
    def deleteAtResourceGroupLevel(resourceGroupName: String, lockName: String, callback: ServiceCallback[Unit]): Unit = js.native
    def deleteAtResourceGroupLevel(resourceGroupName: String, lockName: String, options: CustomHeaders): js.Promise[Unit] = js.native
    def deleteAtResourceGroupLevel(
      resourceGroupName: String,
      lockName: String,
      options: CustomHeaders,
      callback: ServiceCallback[Unit]
    ): Unit = js.native
    /**
      * @summary Deletes a management lock at the resource group level.
      *
      * To delete management locks, you must have access to
      * Microsoft.Authorization/ * or Microsoft.Authorization/locks/ * actions. Of the
      * built-in roles, only Owner and User Access Administrator are granted those
      * actions.
      *
      * @param {string} resourceGroupName The name of the resource group containing
      * the lock.
      *
      * @param {string} lockName The name of lock to delete.
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
    def deleteAtResourceGroupLevelWithHttpOperationResponse(resourceGroupName: String, lockName: String): js.Promise[HttpOperationResponse[Unit]] = js.native
    def deleteAtResourceGroupLevelWithHttpOperationResponse(resourceGroupName: String, lockName: String, options: CustomHeaders): js.Promise[HttpOperationResponse[Unit]] = js.native
    /**
      * @summary Deletes the management lock of a resource or any level below the
      * resource.
      *
      * To delete management locks, you must have access to
      * Microsoft.Authorization/ * or Microsoft.Authorization/locks/ * actions. Of the
      * built-in roles, only Owner and User Access Administrator are granted those
      * actions.
      *
      * @param {string} resourceGroupName The name of the resource group containing
      * the resource with the lock to delete.
      *
      * @param {string} resourceProviderNamespace The resource provider namespace of
      * the resource with the lock to delete.
      *
      * @param {string} parentResourcePath The parent resource identity.
      *
      * @param {string} resourceType The resource type of the resource with the lock
      * to delete.
      *
      * @param {string} resourceName The name of the resource with the lock to
      * delete.
      *
      * @param {string} lockName The name of the lock to delete.
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
    def deleteAtResourceLevel(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      lockName: String
    ): js.Promise[Unit] = js.native
    def deleteAtResourceLevel(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      lockName: String,
      callback: ServiceCallback[Unit]
    ): Unit = js.native
    def deleteAtResourceLevel(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      lockName: String,
      options: CustomHeaders
    ): js.Promise[Unit] = js.native
    def deleteAtResourceLevel(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      lockName: String,
      options: CustomHeaders,
      callback: ServiceCallback[Unit]
    ): Unit = js.native
    /**
      * @summary Deletes the management lock of a resource or any level below the
      * resource.
      *
      * To delete management locks, you must have access to
      * Microsoft.Authorization/ * or Microsoft.Authorization/locks/ * actions. Of the
      * built-in roles, only Owner and User Access Administrator are granted those
      * actions.
      *
      * @param {string} resourceGroupName The name of the resource group containing
      * the resource with the lock to delete.
      *
      * @param {string} resourceProviderNamespace The resource provider namespace of
      * the resource with the lock to delete.
      *
      * @param {string} parentResourcePath The parent resource identity.
      *
      * @param {string} resourceType The resource type of the resource with the lock
      * to delete.
      *
      * @param {string} resourceName The name of the resource with the lock to
      * delete.
      *
      * @param {string} lockName The name of the lock to delete.
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
    def deleteAtResourceLevelWithHttpOperationResponse(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      lockName: String
    ): js.Promise[HttpOperationResponse[Unit]] = js.native
    def deleteAtResourceLevelWithHttpOperationResponse(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      lockName: String,
      options: CustomHeaders
    ): js.Promise[HttpOperationResponse[Unit]] = js.native
    /**
      * @summary Deletes the management lock at the subscription level.
      *
      * To delete management locks, you must have access to
      * Microsoft.Authorization/ * or Microsoft.Authorization/locks/ * actions. Of the
      * built-in roles, only Owner and User Access Administrator are granted those
      * actions.
      *
      * @param {string} lockName The name of lock to delete.
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
    def deleteAtSubscriptionLevel(lockName: String): js.Promise[Unit] = js.native
    def deleteAtSubscriptionLevel(lockName: String, callback: ServiceCallback[Unit]): Unit = js.native
    def deleteAtSubscriptionLevel(lockName: String, options: CustomHeaders): js.Promise[Unit] = js.native
    def deleteAtSubscriptionLevel(lockName: String, options: CustomHeaders, callback: ServiceCallback[Unit]): Unit = js.native
    /**
      * @summary Deletes the management lock at the subscription level.
      *
      * To delete management locks, you must have access to
      * Microsoft.Authorization/ * or Microsoft.Authorization/locks/ * actions. Of the
      * built-in roles, only Owner and User Access Administrator are granted those
      * actions.
      *
      * @param {string} lockName The name of lock to delete.
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
    def deleteAtSubscriptionLevelWithHttpOperationResponse(lockName: String): js.Promise[HttpOperationResponse[Unit]] = js.native
    def deleteAtSubscriptionLevelWithHttpOperationResponse(lockName: String, options: CustomHeaders): js.Promise[HttpOperationResponse[Unit]] = js.native
    /**
      * Delete a management lock by scope.
      *
      * @param {string} scope The scope for the lock.
      *
      * @param {string} lockName The name of lock.
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
    def deleteByScope(scope: String, lockName: String): js.Promise[Unit] = js.native
    def deleteByScope(scope: String, lockName: String, callback: ServiceCallback[Unit]): Unit = js.native
    def deleteByScope(scope: String, lockName: String, options: CustomHeaders): js.Promise[Unit] = js.native
    def deleteByScope(scope: String, lockName: String, options: CustomHeaders, callback: ServiceCallback[Unit]): Unit = js.native
    /**
      * Delete a management lock by scope.
      *
      * @param {string} scope The scope for the lock.
      *
      * @param {string} lockName The name of lock.
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
    def deleteByScopeWithHttpOperationResponse(scope: String, lockName: String): js.Promise[HttpOperationResponse[Unit]] = js.native
    def deleteByScopeWithHttpOperationResponse(scope: String, lockName: String, options: CustomHeaders): js.Promise[HttpOperationResponse[Unit]] = js.native
    /**
      * Gets a management lock at the resource group level.
      *
      * @param {string} resourceGroupName The name of the locked resource group.
      *
      * @param {string} lockName The name of the lock to get.
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
      *                      @resolve {ManagementLockObject} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {ManagementLockObject} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link ManagementLockObject} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def getAtResourceGroupLevel(resourceGroupName: String, lockName: String): js.Promise[ManagementLockObject] = js.native
    def getAtResourceGroupLevel(resourceGroupName: String, lockName: String, callback: ServiceCallback[ManagementLockObject]): Unit = js.native
    def getAtResourceGroupLevel(resourceGroupName: String, lockName: String, options: CustomHeaders): js.Promise[ManagementLockObject] = js.native
    def getAtResourceGroupLevel(
      resourceGroupName: String,
      lockName: String,
      options: CustomHeaders,
      callback: ServiceCallback[ManagementLockObject]
    ): Unit = js.native
    /**
      * Gets a management lock at the resource group level.
      *
      * @param {string} resourceGroupName The name of the locked resource group.
      *
      * @param {string} lockName The name of the lock to get.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<ManagementLockObject>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def getAtResourceGroupLevelWithHttpOperationResponse(resourceGroupName: String, lockName: String): js.Promise[HttpOperationResponse[ManagementLockObject]] = js.native
    def getAtResourceGroupLevelWithHttpOperationResponse(resourceGroupName: String, lockName: String, options: CustomHeaders): js.Promise[HttpOperationResponse[ManagementLockObject]] = js.native
    /**
      * Get the management lock of a resource or any level below resource.
      *
      * @param {string} resourceGroupName The name of the resource group.
      *
      * @param {string} resourceProviderNamespace The namespace of the resource
      * provider.
      *
      * @param {string} parentResourcePath An extra path parameter needed in some
      * services, like SQL Databases.
      *
      * @param {string} resourceType The type of the resource.
      *
      * @param {string} resourceName The name of the resource.
      *
      * @param {string} lockName The name of lock.
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
      *                      @resolve {ManagementLockObject} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {ManagementLockObject} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link ManagementLockObject} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def getAtResourceLevel(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      lockName: String
    ): js.Promise[ManagementLockObject] = js.native
    def getAtResourceLevel(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      lockName: String,
      callback: ServiceCallback[ManagementLockObject]
    ): Unit = js.native
    def getAtResourceLevel(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      lockName: String,
      options: CustomHeaders
    ): js.Promise[ManagementLockObject] = js.native
    def getAtResourceLevel(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      lockName: String,
      options: CustomHeaders,
      callback: ServiceCallback[ManagementLockObject]
    ): Unit = js.native
    /**
      * Get the management lock of a resource or any level below resource.
      *
      * @param {string} resourceGroupName The name of the resource group.
      *
      * @param {string} resourceProviderNamespace The namespace of the resource
      * provider.
      *
      * @param {string} parentResourcePath An extra path parameter needed in some
      * services, like SQL Databases.
      *
      * @param {string} resourceType The type of the resource.
      *
      * @param {string} resourceName The name of the resource.
      *
      * @param {string} lockName The name of lock.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<ManagementLockObject>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def getAtResourceLevelWithHttpOperationResponse(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      lockName: String
    ): js.Promise[HttpOperationResponse[ManagementLockObject]] = js.native
    def getAtResourceLevelWithHttpOperationResponse(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      lockName: String,
      options: CustomHeaders
    ): js.Promise[HttpOperationResponse[ManagementLockObject]] = js.native
    /**
      * Gets a management lock at the subscription level.
      *
      * @param {string} lockName The name of the lock to get.
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
      *                      @resolve {ManagementLockObject} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {ManagementLockObject} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link ManagementLockObject} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def getAtSubscriptionLevel(lockName: String): js.Promise[ManagementLockObject] = js.native
    def getAtSubscriptionLevel(lockName: String, callback: ServiceCallback[ManagementLockObject]): Unit = js.native
    def getAtSubscriptionLevel(lockName: String, options: CustomHeaders): js.Promise[ManagementLockObject] = js.native
    def getAtSubscriptionLevel(lockName: String, options: CustomHeaders, callback: ServiceCallback[ManagementLockObject]): Unit = js.native
    /**
      * Gets a management lock at the subscription level.
      *
      * @param {string} lockName The name of the lock to get.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<ManagementLockObject>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def getAtSubscriptionLevelWithHttpOperationResponse(lockName: String): js.Promise[HttpOperationResponse[ManagementLockObject]] = js.native
    def getAtSubscriptionLevelWithHttpOperationResponse(lockName: String, options: CustomHeaders): js.Promise[HttpOperationResponse[ManagementLockObject]] = js.native
    /**
      * Get a management lock by scope.
      *
      * @param {string} scope The scope for the lock.
      *
      * @param {string} lockName The name of lock.
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
      *                      @resolve {ManagementLockObject} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {ManagementLockObject} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link ManagementLockObject} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def getByScope(scope: String, lockName: String): js.Promise[ManagementLockObject] = js.native
    def getByScope(scope: String, lockName: String, callback: ServiceCallback[ManagementLockObject]): Unit = js.native
    def getByScope(scope: String, lockName: String, options: CustomHeaders): js.Promise[ManagementLockObject] = js.native
    def getByScope(
      scope: String,
      lockName: String,
      options: CustomHeaders,
      callback: ServiceCallback[ManagementLockObject]
    ): Unit = js.native
    /**
      * Get a management lock by scope.
      *
      * @param {string} scope The scope for the lock.
      *
      * @param {string} lockName The name of lock.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<ManagementLockObject>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def getByScopeWithHttpOperationResponse(scope: String, lockName: String): js.Promise[HttpOperationResponse[ManagementLockObject]] = js.native
    def getByScopeWithHttpOperationResponse(scope: String, lockName: String, options: CustomHeaders): js.Promise[HttpOperationResponse[ManagementLockObject]] = js.native
    /**
      * Gets all the management locks for a resource group.
      *
      * @param {string} resourceGroupName The name of the resource group containing
      * the locks to get.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {string} [options.filter] The filter to apply on the operation.
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
      *                      @resolve {ManagementLockListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {ManagementLockListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link ManagementLockListResult} for more
      *                      information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def listAtResourceGroupLevel(resourceGroupName: String): js.Promise[ManagementLockListResult] = js.native
    def listAtResourceGroupLevel(resourceGroupName: String, callback: ServiceCallback[ManagementLockListResult]): Unit = js.native
    def listAtResourceGroupLevel(resourceGroupName: String, options: Filter): js.Promise[ManagementLockListResult] = js.native
    def listAtResourceGroupLevel(resourceGroupName: String, options: Filter, callback: ServiceCallback[ManagementLockListResult]): Unit = js.native
    /**
      * Gets all the management locks for a resource group.
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
      *                      @resolve {ManagementLockListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {ManagementLockListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link ManagementLockListResult} for more
      *                      information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def listAtResourceGroupLevelNext(nextPageLink: String): js.Promise[ManagementLockListResult] = js.native
    def listAtResourceGroupLevelNext(nextPageLink: String, callback: ServiceCallback[ManagementLockListResult]): Unit = js.native
    def listAtResourceGroupLevelNext(nextPageLink: String, options: CustomHeaders): js.Promise[ManagementLockListResult] = js.native
    def listAtResourceGroupLevelNext(nextPageLink: String, options: CustomHeaders, callback: ServiceCallback[ManagementLockListResult]): Unit = js.native
    /**
      * Gets all the management locks for a resource group.
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
      * @resolve {HttpOperationResponse<ManagementLockListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listAtResourceGroupLevelNextWithHttpOperationResponse(nextPageLink: String): js.Promise[HttpOperationResponse[ManagementLockListResult]] = js.native
    def listAtResourceGroupLevelNextWithHttpOperationResponse(nextPageLink: String, options: CustomHeaders): js.Promise[HttpOperationResponse[ManagementLockListResult]] = js.native
    /**
      * Gets all the management locks for a resource group.
      *
      * @param {string} resourceGroupName The name of the resource group containing
      * the locks to get.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {string} [options.filter] The filter to apply on the operation.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<ManagementLockListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listAtResourceGroupLevelWithHttpOperationResponse(resourceGroupName: String): js.Promise[HttpOperationResponse[ManagementLockListResult]] = js.native
    def listAtResourceGroupLevelWithHttpOperationResponse(resourceGroupName: String, options: Filter): js.Promise[HttpOperationResponse[ManagementLockListResult]] = js.native
    /**
      * Gets all the management locks for a resource or any level below resource.
      *
      * @param {string} resourceGroupName The name of the resource group containing
      * the locked resource. The name is case insensitive.
      *
      * @param {string} resourceProviderNamespace The namespace of the resource
      * provider.
      *
      * @param {string} parentResourcePath The parent resource identity.
      *
      * @param {string} resourceType The resource type of the locked resource.
      *
      * @param {string} resourceName The name of the locked resource.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {string} [options.filter] The filter to apply on the operation.
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
      *                      @resolve {ManagementLockListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {ManagementLockListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link ManagementLockListResult} for more
      *                      information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def listAtResourceLevel(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String
    ): js.Promise[ManagementLockListResult] = js.native
    def listAtResourceLevel(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      callback: ServiceCallback[ManagementLockListResult]
    ): Unit = js.native
    def listAtResourceLevel(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      options: Filter
    ): js.Promise[ManagementLockListResult] = js.native
    def listAtResourceLevel(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      options: Filter,
      callback: ServiceCallback[ManagementLockListResult]
    ): Unit = js.native
    /**
      * Gets all the management locks for a resource or any level below resource.
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
      *                      @resolve {ManagementLockListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {ManagementLockListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link ManagementLockListResult} for more
      *                      information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def listAtResourceLevelNext(nextPageLink: String): js.Promise[ManagementLockListResult] = js.native
    def listAtResourceLevelNext(nextPageLink: String, callback: ServiceCallback[ManagementLockListResult]): Unit = js.native
    def listAtResourceLevelNext(nextPageLink: String, options: CustomHeaders): js.Promise[ManagementLockListResult] = js.native
    def listAtResourceLevelNext(nextPageLink: String, options: CustomHeaders, callback: ServiceCallback[ManagementLockListResult]): Unit = js.native
    /**
      * Gets all the management locks for a resource or any level below resource.
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
      * @resolve {HttpOperationResponse<ManagementLockListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listAtResourceLevelNextWithHttpOperationResponse(nextPageLink: String): js.Promise[HttpOperationResponse[ManagementLockListResult]] = js.native
    def listAtResourceLevelNextWithHttpOperationResponse(nextPageLink: String, options: CustomHeaders): js.Promise[HttpOperationResponse[ManagementLockListResult]] = js.native
    /**
      * Gets all the management locks for a resource or any level below resource.
      *
      * @param {string} resourceGroupName The name of the resource group containing
      * the locked resource. The name is case insensitive.
      *
      * @param {string} resourceProviderNamespace The namespace of the resource
      * provider.
      *
      * @param {string} parentResourcePath The parent resource identity.
      *
      * @param {string} resourceType The resource type of the locked resource.
      *
      * @param {string} resourceName The name of the locked resource.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {string} [options.filter] The filter to apply on the operation.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<ManagementLockListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listAtResourceLevelWithHttpOperationResponse(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String
    ): js.Promise[HttpOperationResponse[ManagementLockListResult]] = js.native
    def listAtResourceLevelWithHttpOperationResponse(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      options: Filter
    ): js.Promise[HttpOperationResponse[ManagementLockListResult]] = js.native
    /**
      * Gets all the management locks for a subscription.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {string} [options.filter] The filter to apply on the operation.
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
      *                      @resolve {ManagementLockListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {ManagementLockListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link ManagementLockListResult} for more
      *                      information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def listAtSubscriptionLevel(): js.Promise[ManagementLockListResult] = js.native
    def listAtSubscriptionLevel(callback: ServiceCallback[ManagementLockListResult]): Unit = js.native
    def listAtSubscriptionLevel(options: Filter): js.Promise[ManagementLockListResult] = js.native
    def listAtSubscriptionLevel(options: Filter, callback: ServiceCallback[ManagementLockListResult]): Unit = js.native
    /**
      * Gets all the management locks for a subscription.
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
      *                      @resolve {ManagementLockListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {ManagementLockListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link ManagementLockListResult} for more
      *                      information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def listAtSubscriptionLevelNext(nextPageLink: String): js.Promise[ManagementLockListResult] = js.native
    def listAtSubscriptionLevelNext(nextPageLink: String, callback: ServiceCallback[ManagementLockListResult]): Unit = js.native
    def listAtSubscriptionLevelNext(nextPageLink: String, options: CustomHeaders): js.Promise[ManagementLockListResult] = js.native
    def listAtSubscriptionLevelNext(nextPageLink: String, options: CustomHeaders, callback: ServiceCallback[ManagementLockListResult]): Unit = js.native
    /**
      * Gets all the management locks for a subscription.
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
      * @resolve {HttpOperationResponse<ManagementLockListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listAtSubscriptionLevelNextWithHttpOperationResponse(nextPageLink: String): js.Promise[HttpOperationResponse[ManagementLockListResult]] = js.native
    def listAtSubscriptionLevelNextWithHttpOperationResponse(nextPageLink: String, options: CustomHeaders): js.Promise[HttpOperationResponse[ManagementLockListResult]] = js.native
    /**
      * Gets all the management locks for a subscription.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {string} [options.filter] The filter to apply on the operation.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<ManagementLockListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listAtSubscriptionLevelWithHttpOperationResponse(): js.Promise[HttpOperationResponse[ManagementLockListResult]] = js.native
    def listAtSubscriptionLevelWithHttpOperationResponse(options: Filter): js.Promise[HttpOperationResponse[ManagementLockListResult]] = js.native
  }
  
}

