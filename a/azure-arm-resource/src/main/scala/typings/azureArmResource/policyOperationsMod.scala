package typings.azureArmResource

import typings.azureArmResource.anon.CustomHeaders
import typings.azureArmResource.anon.Filter
import typings.azureArmResource.policyModelsMod.PolicyAssignment
import typings.azureArmResource.policyModelsMod.PolicyAssignmentListResult
import typings.azureArmResource.policyModelsMod.PolicyDefinition
import typings.azureArmResource.policyModelsMod.PolicyDefinitionListResult
import typings.azureArmResource.policyModelsMod.PolicySetDefinition
import typings.azureArmResource.policyModelsMod.PolicySetDefinitionListResult
import typings.msRest.mod.HttpOperationResponse
import typings.msRest.mod.ServiceCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object policyOperationsMod {
  
  @js.native
  trait PolicyAssignments extends StObject {
    
    /**
      * @summary Creates or updates a policy assignment.
      *
      * This operation creates or updates a policy assignment with the given scope
      * and name. Policy assignments apply to all resources contained within their
      * scope. For example, when you assign a policy at resource group scope, that
      * policy applies to all resources in the group.
      *
      * @param {string} scope The scope of the policy assignment. Valid scopes are:
      * management group (format:
      * '/providers/Microsoft.Management/managementGroups/{managementGroup}'),
      * subscription (format: '/subscriptions/{subscriptionId}'), resource group
      * (format:
      * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}', or
      * resource (format:
      * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/[{parentResourcePath}/]{resourceType}/{resourceName}'
      *
      * @param {string} policyAssignmentName The name of the policy assignment.
      *
      * @param {object} parameters Parameters for the policy assignment.
      *
      * @param {string} [parameters.displayName] The display name of the policy
      * assignment.
      *
      * @param {string} [parameters.policyDefinitionId] The ID of the policy
      * definition or policy set definition being assigned.
      *
      * @param {string} [parameters.scope] The scope for the policy assignment.
      *
      * @param {array} [parameters.notScopes] The policy's excluded scopes.
      *
      * @param {object} [parameters.parameters] Required if a parameter is used in
      * policy rule.
      *
      * @param {string} [parameters.description] This message will be part of
      * response in case of policy violation.
      *
      * @param {object} [parameters.metadata] The policy assignment metadata.
      *
      * @param {object} [parameters.sku] The policy sku. This property is optional,
      * obsolete, and will be ignored.
      *
      * @param {string} parameters.sku.name The name of the policy sku. Possible
      * values are A0 and A1.
      *
      * @param {string} [parameters.sku.tier] The policy sku tier. Possible values
      * are Free and Standard.
      *
      * @param {string} [parameters.location] The location of the policy assignment.
      * Only required when utilizing managed identity.
      *
      * @param {object} [parameters.identity] The managed identity associated with
      * the policy assignment.
      *
      * @param {string} [parameters.identity.type] The identity type. Possible
      * values include: 'SystemAssigned', 'None'
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
      *                      @resolve {PolicyAssignment} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {PolicyAssignment} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link PolicyAssignment} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def create(scope: String, policyAssignmentName: String, parameters: PolicyAssignment): js.Promise[PolicyAssignment] = js.native
    def create(
      scope: String,
      policyAssignmentName: String,
      parameters: PolicyAssignment,
      callback: ServiceCallback[PolicyAssignment]
    ): Unit = js.native
    def create(scope: String, policyAssignmentName: String, parameters: PolicyAssignment, options: CustomHeaders): js.Promise[PolicyAssignment] = js.native
    def create(
      scope: String,
      policyAssignmentName: String,
      parameters: PolicyAssignment,
      options: CustomHeaders,
      callback: ServiceCallback[PolicyAssignment]
    ): Unit = js.native
    
    /**
      * @summary Creates or updates a policy assignment.
      *
      * This operation creates or updates the policy assignment with the given ID.
      * Policy assignments made on a scope apply to all resources contained in that
      * scope. For example, when you assign a policy to a resource group that policy
      * applies to all resources in the group. Policy assignment IDs have this
      * format:
      * '{scope}/providers/Microsoft.Authorization/policyAssignments/{policyAssignmentName}'.
      * Valid scopes are: management group (format:
      * '/providers/Microsoft.Management/managementGroups/{managementGroup}'),
      * subscription (format: '/subscriptions/{subscriptionId}'), resource group
      * (format:
      * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}', or
      * resource (format:
      * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/[{parentResourcePath}/]{resourceType}/{resourceName}'.
      *
      * @param {string} policyAssignmentId The ID of the policy assignment to
      * create. Use the format
      * '{scope}/providers/Microsoft.Authorization/policyAssignments/{policyAssignmentName}'.
      *
      * @param {object} parameters Parameters for policy assignment.
      *
      * @param {string} [parameters.displayName] The display name of the policy
      * assignment.
      *
      * @param {string} [parameters.policyDefinitionId] The ID of the policy
      * definition or policy set definition being assigned.
      *
      * @param {string} [parameters.scope] The scope for the policy assignment.
      *
      * @param {array} [parameters.notScopes] The policy's excluded scopes.
      *
      * @param {object} [parameters.parameters] Required if a parameter is used in
      * policy rule.
      *
      * @param {string} [parameters.description] This message will be part of
      * response in case of policy violation.
      *
      * @param {object} [parameters.metadata] The policy assignment metadata.
      *
      * @param {object} [parameters.sku] The policy sku. This property is optional,
      * obsolete, and will be ignored.
      *
      * @param {string} parameters.sku.name The name of the policy sku. Possible
      * values are A0 and A1.
      *
      * @param {string} [parameters.sku.tier] The policy sku tier. Possible values
      * are Free and Standard.
      *
      * @param {string} [parameters.location] The location of the policy assignment.
      * Only required when utilizing managed identity.
      *
      * @param {object} [parameters.identity] The managed identity associated with
      * the policy assignment.
      *
      * @param {string} [parameters.identity.type] The identity type. Possible
      * values include: 'SystemAssigned', 'None'
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
      *                      @resolve {PolicyAssignment} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {PolicyAssignment} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link PolicyAssignment} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def createById(policyAssignmentId: String, parameters: PolicyAssignment): js.Promise[PolicyAssignment] = js.native
    def createById(
      policyAssignmentId: String,
      parameters: PolicyAssignment,
      callback: ServiceCallback[PolicyAssignment]
    ): Unit = js.native
    def createById(policyAssignmentId: String, parameters: PolicyAssignment, options: CustomHeaders): js.Promise[PolicyAssignment] = js.native
    def createById(
      policyAssignmentId: String,
      parameters: PolicyAssignment,
      options: CustomHeaders,
      callback: ServiceCallback[PolicyAssignment]
    ): Unit = js.native
    
    /**
      * @summary Creates or updates a policy assignment.
      *
      * This operation creates or updates the policy assignment with the given ID.
      * Policy assignments made on a scope apply to all resources contained in that
      * scope. For example, when you assign a policy to a resource group that policy
      * applies to all resources in the group. Policy assignment IDs have this
      * format:
      * '{scope}/providers/Microsoft.Authorization/policyAssignments/{policyAssignmentName}'.
      * Valid scopes are: management group (format:
      * '/providers/Microsoft.Management/managementGroups/{managementGroup}'),
      * subscription (format: '/subscriptions/{subscriptionId}'), resource group
      * (format:
      * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}', or
      * resource (format:
      * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/[{parentResourcePath}/]{resourceType}/{resourceName}'.
      *
      * @param {string} policyAssignmentId The ID of the policy assignment to
      * create. Use the format
      * '{scope}/providers/Microsoft.Authorization/policyAssignments/{policyAssignmentName}'.
      *
      * @param {object} parameters Parameters for policy assignment.
      *
      * @param {string} [parameters.displayName] The display name of the policy
      * assignment.
      *
      * @param {string} [parameters.policyDefinitionId] The ID of the policy
      * definition or policy set definition being assigned.
      *
      * @param {string} [parameters.scope] The scope for the policy assignment.
      *
      * @param {array} [parameters.notScopes] The policy's excluded scopes.
      *
      * @param {object} [parameters.parameters] Required if a parameter is used in
      * policy rule.
      *
      * @param {string} [parameters.description] This message will be part of
      * response in case of policy violation.
      *
      * @param {object} [parameters.metadata] The policy assignment metadata.
      *
      * @param {object} [parameters.sku] The policy sku. This property is optional,
      * obsolete, and will be ignored.
      *
      * @param {string} parameters.sku.name The name of the policy sku. Possible
      * values are A0 and A1.
      *
      * @param {string} [parameters.sku.tier] The policy sku tier. Possible values
      * are Free and Standard.
      *
      * @param {string} [parameters.location] The location of the policy assignment.
      * Only required when utilizing managed identity.
      *
      * @param {object} [parameters.identity] The managed identity associated with
      * the policy assignment.
      *
      * @param {string} [parameters.identity.type] The identity type. Possible
      * values include: 'SystemAssigned', 'None'
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<PolicyAssignment>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def createByIdWithHttpOperationResponse(policyAssignmentId: String, parameters: PolicyAssignment): js.Promise[HttpOperationResponse[PolicyAssignment]] = js.native
    def createByIdWithHttpOperationResponse(policyAssignmentId: String, parameters: PolicyAssignment, options: CustomHeaders): js.Promise[HttpOperationResponse[PolicyAssignment]] = js.native
    
    /**
      * @summary Creates or updates a policy assignment.
      *
      * This operation creates or updates a policy assignment with the given scope
      * and name. Policy assignments apply to all resources contained within their
      * scope. For example, when you assign a policy at resource group scope, that
      * policy applies to all resources in the group.
      *
      * @param {string} scope The scope of the policy assignment. Valid scopes are:
      * management group (format:
      * '/providers/Microsoft.Management/managementGroups/{managementGroup}'),
      * subscription (format: '/subscriptions/{subscriptionId}'), resource group
      * (format:
      * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}', or
      * resource (format:
      * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/[{parentResourcePath}/]{resourceType}/{resourceName}'
      *
      * @param {string} policyAssignmentName The name of the policy assignment.
      *
      * @param {object} parameters Parameters for the policy assignment.
      *
      * @param {string} [parameters.displayName] The display name of the policy
      * assignment.
      *
      * @param {string} [parameters.policyDefinitionId] The ID of the policy
      * definition or policy set definition being assigned.
      *
      * @param {string} [parameters.scope] The scope for the policy assignment.
      *
      * @param {array} [parameters.notScopes] The policy's excluded scopes.
      *
      * @param {object} [parameters.parameters] Required if a parameter is used in
      * policy rule.
      *
      * @param {string} [parameters.description] This message will be part of
      * response in case of policy violation.
      *
      * @param {object} [parameters.metadata] The policy assignment metadata.
      *
      * @param {object} [parameters.sku] The policy sku. This property is optional,
      * obsolete, and will be ignored.
      *
      * @param {string} parameters.sku.name The name of the policy sku. Possible
      * values are A0 and A1.
      *
      * @param {string} [parameters.sku.tier] The policy sku tier. Possible values
      * are Free and Standard.
      *
      * @param {string} [parameters.location] The location of the policy assignment.
      * Only required when utilizing managed identity.
      *
      * @param {object} [parameters.identity] The managed identity associated with
      * the policy assignment.
      *
      * @param {string} [parameters.identity.type] The identity type. Possible
      * values include: 'SystemAssigned', 'None'
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<PolicyAssignment>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def createWithHttpOperationResponse(scope: String, policyAssignmentName: String, parameters: PolicyAssignment): js.Promise[HttpOperationResponse[PolicyAssignment]] = js.native
    def createWithHttpOperationResponse(scope: String, policyAssignmentName: String, parameters: PolicyAssignment, options: CustomHeaders): js.Promise[HttpOperationResponse[PolicyAssignment]] = js.native
    
    /**
      * @summary Deletes a policy assignment.
      *
      * This operation deletes the policy with the given ID. Policy assignment IDs
      * have this format:
      * '{scope}/providers/Microsoft.Authorization/policyAssignments/{policyAssignmentName}'.
      * Valid formats for {scope} are:
      * '/providers/Microsoft.Management/managementGroups/{managementGroup}'
      * (management group), '/subscriptions/{subscriptionId}' (subscription),
      * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}'
      * (resource group), or
      * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/[{parentResourcePath}/]{resourceType}/{resourceName}'
      * (resource).
      *
      * @param {string} policyAssignmentId The ID of the policy assignment to
      * delete. Use the format
      * '{scope}/providers/Microsoft.Authorization/policyAssignments/{policyAssignmentName}'.
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
      *                      @resolve {PolicyAssignment} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {PolicyAssignment} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link PolicyAssignment} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def deleteById(policyAssignmentId: String): js.Promise[PolicyAssignment] = js.native
    def deleteById(policyAssignmentId: String, callback: ServiceCallback[PolicyAssignment]): Unit = js.native
    def deleteById(policyAssignmentId: String, options: CustomHeaders): js.Promise[PolicyAssignment] = js.native
    def deleteById(policyAssignmentId: String, options: CustomHeaders, callback: ServiceCallback[PolicyAssignment]): Unit = js.native
    
    /**
      * @summary Deletes a policy assignment.
      *
      * This operation deletes the policy with the given ID. Policy assignment IDs
      * have this format:
      * '{scope}/providers/Microsoft.Authorization/policyAssignments/{policyAssignmentName}'.
      * Valid formats for {scope} are:
      * '/providers/Microsoft.Management/managementGroups/{managementGroup}'
      * (management group), '/subscriptions/{subscriptionId}' (subscription),
      * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}'
      * (resource group), or
      * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/[{parentResourcePath}/]{resourceType}/{resourceName}'
      * (resource).
      *
      * @param {string} policyAssignmentId The ID of the policy assignment to
      * delete. Use the format
      * '{scope}/providers/Microsoft.Authorization/policyAssignments/{policyAssignmentName}'.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<PolicyAssignment>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def deleteByIdWithHttpOperationResponse(policyAssignmentId: String): js.Promise[HttpOperationResponse[PolicyAssignment]] = js.native
    def deleteByIdWithHttpOperationResponse(policyAssignmentId: String, options: CustomHeaders): js.Promise[HttpOperationResponse[PolicyAssignment]] = js.native
    
    /**
      * @summary Deletes a policy assignment.
      *
      * This operation deletes a policy assignment, given its name and the scope it
      * was created in. The scope of a policy assignment is the part of its ID
      * preceding
      * '/providers/Microsoft.Authorization/policyAssignments/{policyAssignmentName}'.
      *
      * @param {string} scope The scope of the policy assignment. Valid scopes are:
      * management group (format:
      * '/providers/Microsoft.Management/managementGroups/{managementGroup}'),
      * subscription (format: '/subscriptions/{subscriptionId}'), resource group
      * (format:
      * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}', or
      * resource (format:
      * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/[{parentResourcePath}/]{resourceType}/{resourceName}'
      *
      * @param {string} policyAssignmentName The name of the policy assignment to
      * delete.
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
      *                      @resolve {PolicyAssignment} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {PolicyAssignment} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link PolicyAssignment} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def deleteMethod(scope: String, policyAssignmentName: String): js.Promise[PolicyAssignment] = js.native
    def deleteMethod(scope: String, policyAssignmentName: String, callback: ServiceCallback[PolicyAssignment]): Unit = js.native
    def deleteMethod(scope: String, policyAssignmentName: String, options: CustomHeaders): js.Promise[PolicyAssignment] = js.native
    def deleteMethod(
      scope: String,
      policyAssignmentName: String,
      options: CustomHeaders,
      callback: ServiceCallback[PolicyAssignment]
    ): Unit = js.native
    
    /**
      * @summary Deletes a policy assignment.
      *
      * This operation deletes a policy assignment, given its name and the scope it
      * was created in. The scope of a policy assignment is the part of its ID
      * preceding
      * '/providers/Microsoft.Authorization/policyAssignments/{policyAssignmentName}'.
      *
      * @param {string} scope The scope of the policy assignment. Valid scopes are:
      * management group (format:
      * '/providers/Microsoft.Management/managementGroups/{managementGroup}'),
      * subscription (format: '/subscriptions/{subscriptionId}'), resource group
      * (format:
      * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}', or
      * resource (format:
      * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/[{parentResourcePath}/]{resourceType}/{resourceName}'
      *
      * @param {string} policyAssignmentName The name of the policy assignment to
      * delete.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<PolicyAssignment>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def deleteMethodWithHttpOperationResponse(scope: String, policyAssignmentName: String): js.Promise[HttpOperationResponse[PolicyAssignment]] = js.native
    def deleteMethodWithHttpOperationResponse(scope: String, policyAssignmentName: String, options: CustomHeaders): js.Promise[HttpOperationResponse[PolicyAssignment]] = js.native
    
    /**
      * @summary Retrieves a policy assignment.
      *
      * This operation retrieves a single policy assignment, given its name and the
      * scope it was created at.
      *
      * @param {string} scope The scope of the policy assignment. Valid scopes are:
      * management group (format:
      * '/providers/Microsoft.Management/managementGroups/{managementGroup}'),
      * subscription (format: '/subscriptions/{subscriptionId}'), resource group
      * (format:
      * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}', or
      * resource (format:
      * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/[{parentResourcePath}/]{resourceType}/{resourceName}'
      *
      * @param {string} policyAssignmentName The name of the policy assignment to
      * get.
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
      *                      @resolve {PolicyAssignment} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {PolicyAssignment} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link PolicyAssignment} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def get(scope: String, policyAssignmentName: String): js.Promise[PolicyAssignment] = js.native
    def get(scope: String, policyAssignmentName: String, callback: ServiceCallback[PolicyAssignment]): Unit = js.native
    def get(scope: String, policyAssignmentName: String, options: CustomHeaders): js.Promise[PolicyAssignment] = js.native
    def get(
      scope: String,
      policyAssignmentName: String,
      options: CustomHeaders,
      callback: ServiceCallback[PolicyAssignment]
    ): Unit = js.native
    
    /**
      * @summary Retrieves the policy assignment with the given ID.
      *
      * The operation retrieves the policy assignment with the given ID. Policy
      * assignment IDs have this format:
      * '{scope}/providers/Microsoft.Authorization/policyAssignments/{policyAssignmentName}'.
      * Valid scopes are: management group (format:
      * '/providers/Microsoft.Management/managementGroups/{managementGroup}'),
      * subscription (format: '/subscriptions/{subscriptionId}'), resource group
      * (format:
      * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}', or
      * resource (format:
      * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/[{parentResourcePath}/]{resourceType}/{resourceName}'.
      *
      * @param {string} policyAssignmentId The ID of the policy assignment to get.
      * Use the format
      * '{scope}/providers/Microsoft.Authorization/policyAssignments/{policyAssignmentName}'.
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
      *                      @resolve {PolicyAssignment} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {PolicyAssignment} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link PolicyAssignment} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def getById(policyAssignmentId: String): js.Promise[PolicyAssignment] = js.native
    def getById(policyAssignmentId: String, callback: ServiceCallback[PolicyAssignment]): Unit = js.native
    def getById(policyAssignmentId: String, options: CustomHeaders): js.Promise[PolicyAssignment] = js.native
    def getById(policyAssignmentId: String, options: CustomHeaders, callback: ServiceCallback[PolicyAssignment]): Unit = js.native
    
    /**
      * @summary Retrieves the policy assignment with the given ID.
      *
      * The operation retrieves the policy assignment with the given ID. Policy
      * assignment IDs have this format:
      * '{scope}/providers/Microsoft.Authorization/policyAssignments/{policyAssignmentName}'.
      * Valid scopes are: management group (format:
      * '/providers/Microsoft.Management/managementGroups/{managementGroup}'),
      * subscription (format: '/subscriptions/{subscriptionId}'), resource group
      * (format:
      * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}', or
      * resource (format:
      * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/[{parentResourcePath}/]{resourceType}/{resourceName}'.
      *
      * @param {string} policyAssignmentId The ID of the policy assignment to get.
      * Use the format
      * '{scope}/providers/Microsoft.Authorization/policyAssignments/{policyAssignmentName}'.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<PolicyAssignment>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def getByIdWithHttpOperationResponse(policyAssignmentId: String): js.Promise[HttpOperationResponse[PolicyAssignment]] = js.native
    def getByIdWithHttpOperationResponse(policyAssignmentId: String, options: CustomHeaders): js.Promise[HttpOperationResponse[PolicyAssignment]] = js.native
    
    /**
      * @summary Retrieves a policy assignment.
      *
      * This operation retrieves a single policy assignment, given its name and the
      * scope it was created at.
      *
      * @param {string} scope The scope of the policy assignment. Valid scopes are:
      * management group (format:
      * '/providers/Microsoft.Management/managementGroups/{managementGroup}'),
      * subscription (format: '/subscriptions/{subscriptionId}'), resource group
      * (format:
      * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}', or
      * resource (format:
      * '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/[{parentResourcePath}/]{resourceType}/{resourceName}'
      *
      * @param {string} policyAssignmentName The name of the policy assignment to
      * get.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<PolicyAssignment>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def getWithHttpOperationResponse(scope: String, policyAssignmentName: String): js.Promise[HttpOperationResponse[PolicyAssignment]] = js.native
    def getWithHttpOperationResponse(scope: String, policyAssignmentName: String, options: CustomHeaders): js.Promise[HttpOperationResponse[PolicyAssignment]] = js.native
    
    /**
      * @summary Retrieves all policy assignments that apply to a subscription.
      *
      * This operation retrieves the list of all policy assignments associated with
      * the given subscription that match the optional given $filter. Valid values
      * for $filter are: 'atScope()' or 'policyDefinitionId eq '{value}''. If
      * $filter is not provided, the unfiltered list includes all policy assignments
      * associated with the subscription, including those that apply directly or
      * from management groups that contain the given subscription, as well as any
      * applied to objects contained within the subscription. If $filter=atScope()
      * is provided, the returned list includes all policy assignments that apply to
      * the subscription, which is everything in the unfiltered list except those
      * applied to objects contained within the subscription. If
      * $filter=policyDefinitionId eq '{value}' is provided, the returned list
      * includes only policy assignments that apply to the subscription and assign
      * the policy definition whose id is {value}.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {string} [options.filter] The filter to apply on the operation. Valid
      * values for $filter are: 'atScope()' or 'policyDefinitionId eq '{value}''. If
      * $filter is not provided, no filtering is performed.
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
      *                      @resolve {PolicyAssignmentListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {PolicyAssignmentListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link PolicyAssignmentListResult} for more
      *                      information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def list(): js.Promise[PolicyAssignmentListResult] = js.native
    def list(callback: ServiceCallback[PolicyAssignmentListResult]): Unit = js.native
    def list(options: Filter): js.Promise[PolicyAssignmentListResult] = js.native
    def list(options: Filter, callback: ServiceCallback[PolicyAssignmentListResult]): Unit = js.native
    
    /**
      * @summary Retrieves all policy assignments that apply to a resource.
      *
      * This operation retrieves the list of all policy assignments associated with
      * the specified resource in the given resource group and subscription that
      * match the optional given $filter. Valid values for $filter are: 'atScope()'
      * or 'policyDefinitionId eq '{value}''. If $filter is not provided, the
      * unfiltered list includes all policy assignments associated with the
      * resource, including those that apply directly or from all containing scopes,
      * as well as any applied to resources contained within the resource. If
      * $filter=atScope() is provided, the returned list includes all policy
      * assignments that apply to the resource, which is everything in the
      * unfiltered list except those applied to resources contained within the
      * resource. If $filter=policyDefinitionId eq '{value}' is provided, the
      * returned list includes only policy assignments that apply to the resource
      * and assign the policy definition whose id is {value}. Three parameters plus
      * the resource name are used to identify a specific resource. If the resource
      * is not part of a parent resource (the more common case), the parent resource
      * path should not be provided (or provided as ''). For example a web app could
      * be specified as ({resourceProviderNamespace} == 'Microsoft.Web',
      * {parentResourcePath} == '', {resourceType} == 'sites', {resourceName} ==
      * 'MyWebApp'). If the resource is part of a parent resource, then all
      * parameters should be provided. For example a virtual machine DNS name could
      * be specified as ({resourceProviderNamespace} == 'Microsoft.Compute',
      * {parentResourcePath} == 'virtualMachines/MyVirtualMachine', {resourceType}
      * == 'domainNames', {resourceName} == 'MyComputerName'). A convenient
      * alternative to providing the namespace and type name separately is to
      * provide both in the {resourceType} parameter, format:
      * ({resourceProviderNamespace} == '', {parentResourcePath} == '',
      * {resourceType} == 'Microsoft.Web/sites', {resourceName} == 'MyWebApp').
      *
      * @param {string} resourceGroupName The name of the resource group containing
      * the resource.
      *
      * @param {string} resourceProviderNamespace The namespace of the resource
      * provider. For example, the namespace of a virtual machine is
      * Microsoft.Compute (from Microsoft.Compute/virtualMachines)
      *
      * @param {string} parentResourcePath The parent resource path. Use empty
      * string if there is none.
      *
      * @param {string} resourceType The resource type name. For example the type
      * name of a web app is 'sites' (from Microsoft.Web/sites).
      *
      * @param {string} resourceName The name of the resource.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {string} [options.filter] The filter to apply on the operation. Valid
      * values for $filter are: 'atScope()' or 'policyDefinitionId eq '{value}''. If
      * $filter is not provided, no filtering is performed.
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
      *                      @resolve {PolicyAssignmentListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {PolicyAssignmentListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link PolicyAssignmentListResult} for more
      *                      information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def listForResource(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String
    ): js.Promise[PolicyAssignmentListResult] = js.native
    def listForResource(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      callback: ServiceCallback[PolicyAssignmentListResult]
    ): Unit = js.native
    def listForResource(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      options: Filter
    ): js.Promise[PolicyAssignmentListResult] = js.native
    def listForResource(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      options: Filter,
      callback: ServiceCallback[PolicyAssignmentListResult]
    ): Unit = js.native
    
    /**
      * @summary Retrieves all policy assignments that apply to a resource group.
      *
      * This operation retrieves the list of all policy assignments associated with
      * the given resource group in the given subscription that match the optional
      * given $filter. Valid values for $filter are: 'atScope()' or
      * 'policyDefinitionId eq '{value}''. If $filter is not provided, the
      * unfiltered list includes all policy assignments associated with the resource
      * group, including those that apply directly or apply from containing scopes,
      * as well as any applied to resources contained within the resource group. If
      * $filter=atScope() is provided, the returned list includes all policy
      * assignments that apply to the resource group, which is everything in the
      * unfiltered list except those applied to resources contained within the
      * resource group. If $filter=policyDefinitionId eq '{value}' is provided, the
      * returned list includes only policy assignments that apply to the resource
      * group and assign the policy definition whose id is {value}.
      *
      * @param {string} resourceGroupName The name of the resource group that
      * contains policy assignments.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {string} [options.filter] The filter to apply on the operation. Valid
      * values for $filter are: 'atScope()' or 'policyDefinitionId eq '{value}''. If
      * $filter is not provided, no filtering is performed.
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
      *                      @resolve {PolicyAssignmentListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {PolicyAssignmentListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link PolicyAssignmentListResult} for more
      *                      information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def listForResourceGroup(resourceGroupName: String): js.Promise[PolicyAssignmentListResult] = js.native
    def listForResourceGroup(resourceGroupName: String, callback: ServiceCallback[PolicyAssignmentListResult]): Unit = js.native
    def listForResourceGroup(resourceGroupName: String, options: Filter): js.Promise[PolicyAssignmentListResult] = js.native
    def listForResourceGroup(resourceGroupName: String, options: Filter, callback: ServiceCallback[PolicyAssignmentListResult]): Unit = js.native
    
    /**
      * @summary Retrieves all policy assignments that apply to a resource group.
      *
      * This operation retrieves the list of all policy assignments associated with
      * the given resource group in the given subscription that match the optional
      * given $filter. Valid values for $filter are: 'atScope()' or
      * 'policyDefinitionId eq '{value}''. If $filter is not provided, the
      * unfiltered list includes all policy assignments associated with the resource
      * group, including those that apply directly or apply from containing scopes,
      * as well as any applied to resources contained within the resource group. If
      * $filter=atScope() is provided, the returned list includes all policy
      * assignments that apply to the resource group, which is everything in the
      * unfiltered list except those applied to resources contained within the
      * resource group. If $filter=policyDefinitionId eq '{value}' is provided, the
      * returned list includes only policy assignments that apply to the resource
      * group and assign the policy definition whose id is {value}.
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
      *                      @resolve {PolicyAssignmentListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {PolicyAssignmentListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link PolicyAssignmentListResult} for more
      *                      information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def listForResourceGroupNext(nextPageLink: String): js.Promise[PolicyAssignmentListResult] = js.native
    def listForResourceGroupNext(nextPageLink: String, callback: ServiceCallback[PolicyAssignmentListResult]): Unit = js.native
    def listForResourceGroupNext(nextPageLink: String, options: CustomHeaders): js.Promise[PolicyAssignmentListResult] = js.native
    def listForResourceGroupNext(
      nextPageLink: String,
      options: CustomHeaders,
      callback: ServiceCallback[PolicyAssignmentListResult]
    ): Unit = js.native
    
    /**
      * @summary Retrieves all policy assignments that apply to a resource group.
      *
      * This operation retrieves the list of all policy assignments associated with
      * the given resource group in the given subscription that match the optional
      * given $filter. Valid values for $filter are: 'atScope()' or
      * 'policyDefinitionId eq '{value}''. If $filter is not provided, the
      * unfiltered list includes all policy assignments associated with the resource
      * group, including those that apply directly or apply from containing scopes,
      * as well as any applied to resources contained within the resource group. If
      * $filter=atScope() is provided, the returned list includes all policy
      * assignments that apply to the resource group, which is everything in the
      * unfiltered list except those applied to resources contained within the
      * resource group. If $filter=policyDefinitionId eq '{value}' is provided, the
      * returned list includes only policy assignments that apply to the resource
      * group and assign the policy definition whose id is {value}.
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
      * @resolve {HttpOperationResponse<PolicyAssignmentListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listForResourceGroupNextWithHttpOperationResponse(nextPageLink: String): js.Promise[HttpOperationResponse[PolicyAssignmentListResult]] = js.native
    def listForResourceGroupNextWithHttpOperationResponse(nextPageLink: String, options: CustomHeaders): js.Promise[HttpOperationResponse[PolicyAssignmentListResult]] = js.native
    
    /**
      * @summary Retrieves all policy assignments that apply to a resource group.
      *
      * This operation retrieves the list of all policy assignments associated with
      * the given resource group in the given subscription that match the optional
      * given $filter. Valid values for $filter are: 'atScope()' or
      * 'policyDefinitionId eq '{value}''. If $filter is not provided, the
      * unfiltered list includes all policy assignments associated with the resource
      * group, including those that apply directly or apply from containing scopes,
      * as well as any applied to resources contained within the resource group. If
      * $filter=atScope() is provided, the returned list includes all policy
      * assignments that apply to the resource group, which is everything in the
      * unfiltered list except those applied to resources contained within the
      * resource group. If $filter=policyDefinitionId eq '{value}' is provided, the
      * returned list includes only policy assignments that apply to the resource
      * group and assign the policy definition whose id is {value}.
      *
      * @param {string} resourceGroupName The name of the resource group that
      * contains policy assignments.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {string} [options.filter] The filter to apply on the operation. Valid
      * values for $filter are: 'atScope()' or 'policyDefinitionId eq '{value}''. If
      * $filter is not provided, no filtering is performed.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<PolicyAssignmentListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listForResourceGroupWithHttpOperationResponse(resourceGroupName: String): js.Promise[HttpOperationResponse[PolicyAssignmentListResult]] = js.native
    def listForResourceGroupWithHttpOperationResponse(resourceGroupName: String, options: Filter): js.Promise[HttpOperationResponse[PolicyAssignmentListResult]] = js.native
    
    /**
      * @summary Retrieves all policy assignments that apply to a resource.
      *
      * This operation retrieves the list of all policy assignments associated with
      * the specified resource in the given resource group and subscription that
      * match the optional given $filter. Valid values for $filter are: 'atScope()'
      * or 'policyDefinitionId eq '{value}''. If $filter is not provided, the
      * unfiltered list includes all policy assignments associated with the
      * resource, including those that apply directly or from all containing scopes,
      * as well as any applied to resources contained within the resource. If
      * $filter=atScope() is provided, the returned list includes all policy
      * assignments that apply to the resource, which is everything in the
      * unfiltered list except those applied to resources contained within the
      * resource. If $filter=policyDefinitionId eq '{value}' is provided, the
      * returned list includes only policy assignments that apply to the resource
      * and assign the policy definition whose id is {value}. Three parameters plus
      * the resource name are used to identify a specific resource. If the resource
      * is not part of a parent resource (the more common case), the parent resource
      * path should not be provided (or provided as ''). For example a web app could
      * be specified as ({resourceProviderNamespace} == 'Microsoft.Web',
      * {parentResourcePath} == '', {resourceType} == 'sites', {resourceName} ==
      * 'MyWebApp'). If the resource is part of a parent resource, then all
      * parameters should be provided. For example a virtual machine DNS name could
      * be specified as ({resourceProviderNamespace} == 'Microsoft.Compute',
      * {parentResourcePath} == 'virtualMachines/MyVirtualMachine', {resourceType}
      * == 'domainNames', {resourceName} == 'MyComputerName'). A convenient
      * alternative to providing the namespace and type name separately is to
      * provide both in the {resourceType} parameter, format:
      * ({resourceProviderNamespace} == '', {parentResourcePath} == '',
      * {resourceType} == 'Microsoft.Web/sites', {resourceName} == 'MyWebApp').
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
      *                      @resolve {PolicyAssignmentListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {PolicyAssignmentListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link PolicyAssignmentListResult} for more
      *                      information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def listForResourceNext(nextPageLink: String): js.Promise[PolicyAssignmentListResult] = js.native
    def listForResourceNext(nextPageLink: String, callback: ServiceCallback[PolicyAssignmentListResult]): Unit = js.native
    def listForResourceNext(nextPageLink: String, options: CustomHeaders): js.Promise[PolicyAssignmentListResult] = js.native
    def listForResourceNext(
      nextPageLink: String,
      options: CustomHeaders,
      callback: ServiceCallback[PolicyAssignmentListResult]
    ): Unit = js.native
    
    /**
      * @summary Retrieves all policy assignments that apply to a resource.
      *
      * This operation retrieves the list of all policy assignments associated with
      * the specified resource in the given resource group and subscription that
      * match the optional given $filter. Valid values for $filter are: 'atScope()'
      * or 'policyDefinitionId eq '{value}''. If $filter is not provided, the
      * unfiltered list includes all policy assignments associated with the
      * resource, including those that apply directly or from all containing scopes,
      * as well as any applied to resources contained within the resource. If
      * $filter=atScope() is provided, the returned list includes all policy
      * assignments that apply to the resource, which is everything in the
      * unfiltered list except those applied to resources contained within the
      * resource. If $filter=policyDefinitionId eq '{value}' is provided, the
      * returned list includes only policy assignments that apply to the resource
      * and assign the policy definition whose id is {value}. Three parameters plus
      * the resource name are used to identify a specific resource. If the resource
      * is not part of a parent resource (the more common case), the parent resource
      * path should not be provided (or provided as ''). For example a web app could
      * be specified as ({resourceProviderNamespace} == 'Microsoft.Web',
      * {parentResourcePath} == '', {resourceType} == 'sites', {resourceName} ==
      * 'MyWebApp'). If the resource is part of a parent resource, then all
      * parameters should be provided. For example a virtual machine DNS name could
      * be specified as ({resourceProviderNamespace} == 'Microsoft.Compute',
      * {parentResourcePath} == 'virtualMachines/MyVirtualMachine', {resourceType}
      * == 'domainNames', {resourceName} == 'MyComputerName'). A convenient
      * alternative to providing the namespace and type name separately is to
      * provide both in the {resourceType} parameter, format:
      * ({resourceProviderNamespace} == '', {parentResourcePath} == '',
      * {resourceType} == 'Microsoft.Web/sites', {resourceName} == 'MyWebApp').
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
      * @resolve {HttpOperationResponse<PolicyAssignmentListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listForResourceNextWithHttpOperationResponse(nextPageLink: String): js.Promise[HttpOperationResponse[PolicyAssignmentListResult]] = js.native
    def listForResourceNextWithHttpOperationResponse(nextPageLink: String, options: CustomHeaders): js.Promise[HttpOperationResponse[PolicyAssignmentListResult]] = js.native
    
    /**
      * @summary Retrieves all policy assignments that apply to a resource.
      *
      * This operation retrieves the list of all policy assignments associated with
      * the specified resource in the given resource group and subscription that
      * match the optional given $filter. Valid values for $filter are: 'atScope()'
      * or 'policyDefinitionId eq '{value}''. If $filter is not provided, the
      * unfiltered list includes all policy assignments associated with the
      * resource, including those that apply directly or from all containing scopes,
      * as well as any applied to resources contained within the resource. If
      * $filter=atScope() is provided, the returned list includes all policy
      * assignments that apply to the resource, which is everything in the
      * unfiltered list except those applied to resources contained within the
      * resource. If $filter=policyDefinitionId eq '{value}' is provided, the
      * returned list includes only policy assignments that apply to the resource
      * and assign the policy definition whose id is {value}. Three parameters plus
      * the resource name are used to identify a specific resource. If the resource
      * is not part of a parent resource (the more common case), the parent resource
      * path should not be provided (or provided as ''). For example a web app could
      * be specified as ({resourceProviderNamespace} == 'Microsoft.Web',
      * {parentResourcePath} == '', {resourceType} == 'sites', {resourceName} ==
      * 'MyWebApp'). If the resource is part of a parent resource, then all
      * parameters should be provided. For example a virtual machine DNS name could
      * be specified as ({resourceProviderNamespace} == 'Microsoft.Compute',
      * {parentResourcePath} == 'virtualMachines/MyVirtualMachine', {resourceType}
      * == 'domainNames', {resourceName} == 'MyComputerName'). A convenient
      * alternative to providing the namespace and type name separately is to
      * provide both in the {resourceType} parameter, format:
      * ({resourceProviderNamespace} == '', {parentResourcePath} == '',
      * {resourceType} == 'Microsoft.Web/sites', {resourceName} == 'MyWebApp').
      *
      * @param {string} resourceGroupName The name of the resource group containing
      * the resource.
      *
      * @param {string} resourceProviderNamespace The namespace of the resource
      * provider. For example, the namespace of a virtual machine is
      * Microsoft.Compute (from Microsoft.Compute/virtualMachines)
      *
      * @param {string} parentResourcePath The parent resource path. Use empty
      * string if there is none.
      *
      * @param {string} resourceType The resource type name. For example the type
      * name of a web app is 'sites' (from Microsoft.Web/sites).
      *
      * @param {string} resourceName The name of the resource.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {string} [options.filter] The filter to apply on the operation. Valid
      * values for $filter are: 'atScope()' or 'policyDefinitionId eq '{value}''. If
      * $filter is not provided, no filtering is performed.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<PolicyAssignmentListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listForResourceWithHttpOperationResponse(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String
    ): js.Promise[HttpOperationResponse[PolicyAssignmentListResult]] = js.native
    def listForResourceWithHttpOperationResponse(
      resourceGroupName: String,
      resourceProviderNamespace: String,
      parentResourcePath: String,
      resourceType: String,
      resourceName: String,
      options: Filter
    ): js.Promise[HttpOperationResponse[PolicyAssignmentListResult]] = js.native
    
    /**
      * @summary Retrieves all policy assignments that apply to a subscription.
      *
      * This operation retrieves the list of all policy assignments associated with
      * the given subscription that match the optional given $filter. Valid values
      * for $filter are: 'atScope()' or 'policyDefinitionId eq '{value}''. If
      * $filter is not provided, the unfiltered list includes all policy assignments
      * associated with the subscription, including those that apply directly or
      * from management groups that contain the given subscription, as well as any
      * applied to objects contained within the subscription. If $filter=atScope()
      * is provided, the returned list includes all policy assignments that apply to
      * the subscription, which is everything in the unfiltered list except those
      * applied to objects contained within the subscription. If
      * $filter=policyDefinitionId eq '{value}' is provided, the returned list
      * includes only policy assignments that apply to the subscription and assign
      * the policy definition whose id is {value}.
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
      *                      @resolve {PolicyAssignmentListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {PolicyAssignmentListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link PolicyAssignmentListResult} for more
      *                      information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def listNext(nextPageLink: String): js.Promise[PolicyAssignmentListResult] = js.native
    def listNext(nextPageLink: String, callback: ServiceCallback[PolicyAssignmentListResult]): Unit = js.native
    def listNext(nextPageLink: String, options: CustomHeaders): js.Promise[PolicyAssignmentListResult] = js.native
    def listNext(
      nextPageLink: String,
      options: CustomHeaders,
      callback: ServiceCallback[PolicyAssignmentListResult]
    ): Unit = js.native
    
    /**
      * @summary Retrieves all policy assignments that apply to a subscription.
      *
      * This operation retrieves the list of all policy assignments associated with
      * the given subscription that match the optional given $filter. Valid values
      * for $filter are: 'atScope()' or 'policyDefinitionId eq '{value}''. If
      * $filter is not provided, the unfiltered list includes all policy assignments
      * associated with the subscription, including those that apply directly or
      * from management groups that contain the given subscription, as well as any
      * applied to objects contained within the subscription. If $filter=atScope()
      * is provided, the returned list includes all policy assignments that apply to
      * the subscription, which is everything in the unfiltered list except those
      * applied to objects contained within the subscription. If
      * $filter=policyDefinitionId eq '{value}' is provided, the returned list
      * includes only policy assignments that apply to the subscription and assign
      * the policy definition whose id is {value}.
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
      * @resolve {HttpOperationResponse<PolicyAssignmentListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listNextWithHttpOperationResponse(nextPageLink: String): js.Promise[HttpOperationResponse[PolicyAssignmentListResult]] = js.native
    def listNextWithHttpOperationResponse(nextPageLink: String, options: CustomHeaders): js.Promise[HttpOperationResponse[PolicyAssignmentListResult]] = js.native
    
    /**
      * @summary Retrieves all policy assignments that apply to a subscription.
      *
      * This operation retrieves the list of all policy assignments associated with
      * the given subscription that match the optional given $filter. Valid values
      * for $filter are: 'atScope()' or 'policyDefinitionId eq '{value}''. If
      * $filter is not provided, the unfiltered list includes all policy assignments
      * associated with the subscription, including those that apply directly or
      * from management groups that contain the given subscription, as well as any
      * applied to objects contained within the subscription. If $filter=atScope()
      * is provided, the returned list includes all policy assignments that apply to
      * the subscription, which is everything in the unfiltered list except those
      * applied to objects contained within the subscription. If
      * $filter=policyDefinitionId eq '{value}' is provided, the returned list
      * includes only policy assignments that apply to the subscription and assign
      * the policy definition whose id is {value}.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {string} [options.filter] The filter to apply on the operation. Valid
      * values for $filter are: 'atScope()' or 'policyDefinitionId eq '{value}''. If
      * $filter is not provided, no filtering is performed.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<PolicyAssignmentListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listWithHttpOperationResponse(): js.Promise[HttpOperationResponse[PolicyAssignmentListResult]] = js.native
    def listWithHttpOperationResponse(options: Filter): js.Promise[HttpOperationResponse[PolicyAssignmentListResult]] = js.native
  }
  
  @js.native
  trait PolicyDefinitions extends StObject {
    
    /**
      * @summary Creates or updates a policy definition in a subscription.
      *
      * This operation creates or updates a policy definition in the given
      * subscription with the given name.
      *
      * @param {string} policyDefinitionName The name of the policy definition to
      * create.
      *
      * @param {object} parameters The policy definition properties.
      *
      * @param {string} [parameters.policyType] The type of policy definition.
      * Possible values are NotSpecified, BuiltIn, and Custom. Possible values
      * include: 'NotSpecified', 'BuiltIn', 'Custom'
      *
      * @param {string} [parameters.mode] The policy definition mode. Possible
      * values are NotSpecified, Indexed, and All. Possible values include:
      * 'NotSpecified', 'Indexed', 'All'
      *
      * @param {string} [parameters.displayName] The display name of the policy
      * definition.
      *
      * @param {string} [parameters.description] The policy definition description.
      *
      * @param {object} [parameters.policyRule] The policy rule.
      *
      * @param {object} [parameters.metadata] The policy definition metadata.
      *
      * @param {object} [parameters.parameters] Required if a parameter is used in
      * policy rule.
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
      *                      @resolve {PolicyDefinition} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {PolicyDefinition} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link PolicyDefinition} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def createOrUpdate(policyDefinitionName: String, parameters: PolicyDefinition): js.Promise[PolicyDefinition] = js.native
    def createOrUpdate(
      policyDefinitionName: String,
      parameters: PolicyDefinition,
      callback: ServiceCallback[PolicyDefinition]
    ): Unit = js.native
    def createOrUpdate(policyDefinitionName: String, parameters: PolicyDefinition, options: CustomHeaders): js.Promise[PolicyDefinition] = js.native
    def createOrUpdate(
      policyDefinitionName: String,
      parameters: PolicyDefinition,
      options: CustomHeaders,
      callback: ServiceCallback[PolicyDefinition]
    ): Unit = js.native
    
    /**
      * @summary Creates or updates a policy definition in a management group.
      *
      * This operation creates or updates a policy definition in the given
      * management group with the given name.
      *
      * @param {string} policyDefinitionName The name of the policy definition to
      * create.
      *
      * @param {object} parameters The policy definition properties.
      *
      * @param {string} [parameters.policyType] The type of policy definition.
      * Possible values are NotSpecified, BuiltIn, and Custom. Possible values
      * include: 'NotSpecified', 'BuiltIn', 'Custom'
      *
      * @param {string} [parameters.mode] The policy definition mode. Possible
      * values are NotSpecified, Indexed, and All. Possible values include:
      * 'NotSpecified', 'Indexed', 'All'
      *
      * @param {string} [parameters.displayName] The display name of the policy
      * definition.
      *
      * @param {string} [parameters.description] The policy definition description.
      *
      * @param {object} [parameters.policyRule] The policy rule.
      *
      * @param {object} [parameters.metadata] The policy definition metadata.
      *
      * @param {object} [parameters.parameters] Required if a parameter is used in
      * policy rule.
      *
      * @param {string} managementGroupId The ID of the management group.
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
      *                      @resolve {PolicyDefinition} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {PolicyDefinition} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link PolicyDefinition} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def createOrUpdateAtManagementGroup(policyDefinitionName: String, parameters: PolicyDefinition, managementGroupId: String): js.Promise[PolicyDefinition] = js.native
    def createOrUpdateAtManagementGroup(
      policyDefinitionName: String,
      parameters: PolicyDefinition,
      managementGroupId: String,
      callback: ServiceCallback[PolicyDefinition]
    ): Unit = js.native
    def createOrUpdateAtManagementGroup(
      policyDefinitionName: String,
      parameters: PolicyDefinition,
      managementGroupId: String,
      options: CustomHeaders
    ): js.Promise[PolicyDefinition] = js.native
    def createOrUpdateAtManagementGroup(
      policyDefinitionName: String,
      parameters: PolicyDefinition,
      managementGroupId: String,
      options: CustomHeaders,
      callback: ServiceCallback[PolicyDefinition]
    ): Unit = js.native
    
    /**
      * @summary Creates or updates a policy definition in a management group.
      *
      * This operation creates or updates a policy definition in the given
      * management group with the given name.
      *
      * @param {string} policyDefinitionName The name of the policy definition to
      * create.
      *
      * @param {object} parameters The policy definition properties.
      *
      * @param {string} [parameters.policyType] The type of policy definition.
      * Possible values are NotSpecified, BuiltIn, and Custom. Possible values
      * include: 'NotSpecified', 'BuiltIn', 'Custom'
      *
      * @param {string} [parameters.mode] The policy definition mode. Possible
      * values are NotSpecified, Indexed, and All. Possible values include:
      * 'NotSpecified', 'Indexed', 'All'
      *
      * @param {string} [parameters.displayName] The display name of the policy
      * definition.
      *
      * @param {string} [parameters.description] The policy definition description.
      *
      * @param {object} [parameters.policyRule] The policy rule.
      *
      * @param {object} [parameters.metadata] The policy definition metadata.
      *
      * @param {object} [parameters.parameters] Required if a parameter is used in
      * policy rule.
      *
      * @param {string} managementGroupId The ID of the management group.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<PolicyDefinition>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def createOrUpdateAtManagementGroupWithHttpOperationResponse(policyDefinitionName: String, parameters: PolicyDefinition, managementGroupId: String): js.Promise[HttpOperationResponse[PolicyDefinition]] = js.native
    def createOrUpdateAtManagementGroupWithHttpOperationResponse(
      policyDefinitionName: String,
      parameters: PolicyDefinition,
      managementGroupId: String,
      options: CustomHeaders
    ): js.Promise[HttpOperationResponse[PolicyDefinition]] = js.native
    
    /**
      * @summary Creates or updates a policy definition in a subscription.
      *
      * This operation creates or updates a policy definition in the given
      * subscription with the given name.
      *
      * @param {string} policyDefinitionName The name of the policy definition to
      * create.
      *
      * @param {object} parameters The policy definition properties.
      *
      * @param {string} [parameters.policyType] The type of policy definition.
      * Possible values are NotSpecified, BuiltIn, and Custom. Possible values
      * include: 'NotSpecified', 'BuiltIn', 'Custom'
      *
      * @param {string} [parameters.mode] The policy definition mode. Possible
      * values are NotSpecified, Indexed, and All. Possible values include:
      * 'NotSpecified', 'Indexed', 'All'
      *
      * @param {string} [parameters.displayName] The display name of the policy
      * definition.
      *
      * @param {string} [parameters.description] The policy definition description.
      *
      * @param {object} [parameters.policyRule] The policy rule.
      *
      * @param {object} [parameters.metadata] The policy definition metadata.
      *
      * @param {object} [parameters.parameters] Required if a parameter is used in
      * policy rule.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<PolicyDefinition>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def createOrUpdateWithHttpOperationResponse(policyDefinitionName: String, parameters: PolicyDefinition): js.Promise[HttpOperationResponse[PolicyDefinition]] = js.native
    def createOrUpdateWithHttpOperationResponse(policyDefinitionName: String, parameters: PolicyDefinition, options: CustomHeaders): js.Promise[HttpOperationResponse[PolicyDefinition]] = js.native
    
    /**
      * @summary Deletes a policy definition in a management group.
      *
      * This operation deletes the policy definition in the given management group
      * with the given name.
      *
      * @param {string} policyDefinitionName The name of the policy definition to
      * delete.
      *
      * @param {string} managementGroupId The ID of the management group.
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
    def deleteAtManagementGroup(policyDefinitionName: String, managementGroupId: String): js.Promise[Unit] = js.native
    def deleteAtManagementGroup(policyDefinitionName: String, managementGroupId: String, callback: ServiceCallback[Unit]): Unit = js.native
    def deleteAtManagementGroup(policyDefinitionName: String, managementGroupId: String, options: CustomHeaders): js.Promise[Unit] = js.native
    def deleteAtManagementGroup(
      policyDefinitionName: String,
      managementGroupId: String,
      options: CustomHeaders,
      callback: ServiceCallback[Unit]
    ): Unit = js.native
    
    /**
      * @summary Deletes a policy definition in a management group.
      *
      * This operation deletes the policy definition in the given management group
      * with the given name.
      *
      * @param {string} policyDefinitionName The name of the policy definition to
      * delete.
      *
      * @param {string} managementGroupId The ID of the management group.
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
    def deleteAtManagementGroupWithHttpOperationResponse(policyDefinitionName: String, managementGroupId: String): js.Promise[HttpOperationResponse[Unit]] = js.native
    def deleteAtManagementGroupWithHttpOperationResponse(policyDefinitionName: String, managementGroupId: String, options: CustomHeaders): js.Promise[HttpOperationResponse[Unit]] = js.native
    
    /**
      * @summary Deletes a policy definition in a subscription.
      *
      * This operation deletes the policy definition in the given subscription with
      * the given name.
      *
      * @param {string} policyDefinitionName The name of the policy definition to
      * delete.
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
    def deleteMethod(policyDefinitionName: String): js.Promise[Unit] = js.native
    def deleteMethod(policyDefinitionName: String, callback: ServiceCallback[Unit]): Unit = js.native
    def deleteMethod(policyDefinitionName: String, options: CustomHeaders): js.Promise[Unit] = js.native
    def deleteMethod(policyDefinitionName: String, options: CustomHeaders, callback: ServiceCallback[Unit]): Unit = js.native
    
    /**
      * @summary Deletes a policy definition in a subscription.
      *
      * This operation deletes the policy definition in the given subscription with
      * the given name.
      *
      * @param {string} policyDefinitionName The name of the policy definition to
      * delete.
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
    def deleteMethodWithHttpOperationResponse(policyDefinitionName: String): js.Promise[HttpOperationResponse[Unit]] = js.native
    def deleteMethodWithHttpOperationResponse(policyDefinitionName: String, options: CustomHeaders): js.Promise[HttpOperationResponse[Unit]] = js.native
    
    /**
      * @summary Retrieves a policy definition in a subscription.
      *
      * This operation retrieves the policy definition in the given subscription
      * with the given name.
      *
      * @param {string} policyDefinitionName The name of the policy definition to
      * get.
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
      *                      @resolve {PolicyDefinition} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {PolicyDefinition} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link PolicyDefinition} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def get(policyDefinitionName: String): js.Promise[PolicyDefinition] = js.native
    def get(policyDefinitionName: String, callback: ServiceCallback[PolicyDefinition]): Unit = js.native
    def get(policyDefinitionName: String, options: CustomHeaders): js.Promise[PolicyDefinition] = js.native
    def get(policyDefinitionName: String, options: CustomHeaders, callback: ServiceCallback[PolicyDefinition]): Unit = js.native
    
    /**
      * @summary Retrieve a policy definition in a management group.
      *
      * This operation retrieves the policy definition in the given management group
      * with the given name.
      *
      * @param {string} policyDefinitionName The name of the policy definition to
      * get.
      *
      * @param {string} managementGroupId The ID of the management group.
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
      *                      @resolve {PolicyDefinition} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {PolicyDefinition} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link PolicyDefinition} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def getAtManagementGroup(policyDefinitionName: String, managementGroupId: String): js.Promise[PolicyDefinition] = js.native
    def getAtManagementGroup(
      policyDefinitionName: String,
      managementGroupId: String,
      callback: ServiceCallback[PolicyDefinition]
    ): Unit = js.native
    def getAtManagementGroup(policyDefinitionName: String, managementGroupId: String, options: CustomHeaders): js.Promise[PolicyDefinition] = js.native
    def getAtManagementGroup(
      policyDefinitionName: String,
      managementGroupId: String,
      options: CustomHeaders,
      callback: ServiceCallback[PolicyDefinition]
    ): Unit = js.native
    
    /**
      * @summary Retrieve a policy definition in a management group.
      *
      * This operation retrieves the policy definition in the given management group
      * with the given name.
      *
      * @param {string} policyDefinitionName The name of the policy definition to
      * get.
      *
      * @param {string} managementGroupId The ID of the management group.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<PolicyDefinition>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def getAtManagementGroupWithHttpOperationResponse(policyDefinitionName: String, managementGroupId: String): js.Promise[HttpOperationResponse[PolicyDefinition]] = js.native
    def getAtManagementGroupWithHttpOperationResponse(policyDefinitionName: String, managementGroupId: String, options: CustomHeaders): js.Promise[HttpOperationResponse[PolicyDefinition]] = js.native
    
    /**
      * @summary Retrieves a built-in policy definition.
      *
      * This operation retrieves the built-in policy definition with the given name.
      *
      * @param {string} policyDefinitionName The name of the built-in policy
      * definition to get.
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
      *                      @resolve {PolicyDefinition} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {PolicyDefinition} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link PolicyDefinition} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def getBuiltIn(policyDefinitionName: String): js.Promise[PolicyDefinition] = js.native
    def getBuiltIn(policyDefinitionName: String, callback: ServiceCallback[PolicyDefinition]): Unit = js.native
    def getBuiltIn(policyDefinitionName: String, options: CustomHeaders): js.Promise[PolicyDefinition] = js.native
    def getBuiltIn(policyDefinitionName: String, options: CustomHeaders, callback: ServiceCallback[PolicyDefinition]): Unit = js.native
    
    /**
      * @summary Retrieves a built-in policy definition.
      *
      * This operation retrieves the built-in policy definition with the given name.
      *
      * @param {string} policyDefinitionName The name of the built-in policy
      * definition to get.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<PolicyDefinition>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def getBuiltInWithHttpOperationResponse(policyDefinitionName: String): js.Promise[HttpOperationResponse[PolicyDefinition]] = js.native
    def getBuiltInWithHttpOperationResponse(policyDefinitionName: String, options: CustomHeaders): js.Promise[HttpOperationResponse[PolicyDefinition]] = js.native
    
    /**
      * @summary Retrieves a policy definition in a subscription.
      *
      * This operation retrieves the policy definition in the given subscription
      * with the given name.
      *
      * @param {string} policyDefinitionName The name of the policy definition to
      * get.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<PolicyDefinition>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def getWithHttpOperationResponse(policyDefinitionName: String): js.Promise[HttpOperationResponse[PolicyDefinition]] = js.native
    def getWithHttpOperationResponse(policyDefinitionName: String, options: CustomHeaders): js.Promise[HttpOperationResponse[PolicyDefinition]] = js.native
    
    /**
      * @summary Retrieves policy definitions in a subscription
      *
      * This operation retrieves a list of all the policy definitions in a given
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
      *                      @resolve {PolicyDefinitionListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {PolicyDefinitionListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link PolicyDefinitionListResult} for more
      *                      information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def list(): js.Promise[PolicyDefinitionListResult] = js.native
    def list(callback: ServiceCallback[PolicyDefinitionListResult]): Unit = js.native
    def list(options: CustomHeaders): js.Promise[PolicyDefinitionListResult] = js.native
    def list(options: CustomHeaders, callback: ServiceCallback[PolicyDefinitionListResult]): Unit = js.native
    
    /**
      * @summary Retrieve built-in policy definitions
      *
      * This operation retrieves a list of all the built-in policy definitions.
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
      *                      @resolve {PolicyDefinitionListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {PolicyDefinitionListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link PolicyDefinitionListResult} for more
      *                      information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def listBuiltIn(): js.Promise[PolicyDefinitionListResult] = js.native
    def listBuiltIn(callback: ServiceCallback[PolicyDefinitionListResult]): Unit = js.native
    def listBuiltIn(options: CustomHeaders): js.Promise[PolicyDefinitionListResult] = js.native
    def listBuiltIn(options: CustomHeaders, callback: ServiceCallback[PolicyDefinitionListResult]): Unit = js.native
    
    /**
      * @summary Retrieve built-in policy definitions
      *
      * This operation retrieves a list of all the built-in policy definitions.
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
      *                      @resolve {PolicyDefinitionListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {PolicyDefinitionListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link PolicyDefinitionListResult} for more
      *                      information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def listBuiltInNext(nextPageLink: String): js.Promise[PolicyDefinitionListResult] = js.native
    def listBuiltInNext(nextPageLink: String, callback: ServiceCallback[PolicyDefinitionListResult]): Unit = js.native
    def listBuiltInNext(nextPageLink: String, options: CustomHeaders): js.Promise[PolicyDefinitionListResult] = js.native
    def listBuiltInNext(
      nextPageLink: String,
      options: CustomHeaders,
      callback: ServiceCallback[PolicyDefinitionListResult]
    ): Unit = js.native
    
    /**
      * @summary Retrieve built-in policy definitions
      *
      * This operation retrieves a list of all the built-in policy definitions.
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
      * @resolve {HttpOperationResponse<PolicyDefinitionListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listBuiltInNextWithHttpOperationResponse(nextPageLink: String): js.Promise[HttpOperationResponse[PolicyDefinitionListResult]] = js.native
    def listBuiltInNextWithHttpOperationResponse(nextPageLink: String, options: CustomHeaders): js.Promise[HttpOperationResponse[PolicyDefinitionListResult]] = js.native
    
    /**
      * @summary Retrieve built-in policy definitions
      *
      * This operation retrieves a list of all the built-in policy definitions.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<PolicyDefinitionListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listBuiltInWithHttpOperationResponse(): js.Promise[HttpOperationResponse[PolicyDefinitionListResult]] = js.native
    def listBuiltInWithHttpOperationResponse(options: CustomHeaders): js.Promise[HttpOperationResponse[PolicyDefinitionListResult]] = js.native
    
    /**
      * @summary Retrieve policy definitions in a management group
      *
      * This operation retrieves a list of all the policy definitions in a given
      * management group.
      *
      * @param {string} managementGroupId The ID of the management group.
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
      *                      @resolve {PolicyDefinitionListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {PolicyDefinitionListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link PolicyDefinitionListResult} for more
      *                      information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def listByManagementGroup(managementGroupId: String): js.Promise[PolicyDefinitionListResult] = js.native
    def listByManagementGroup(managementGroupId: String, callback: ServiceCallback[PolicyDefinitionListResult]): Unit = js.native
    def listByManagementGroup(managementGroupId: String, options: CustomHeaders): js.Promise[PolicyDefinitionListResult] = js.native
    def listByManagementGroup(
      managementGroupId: String,
      options: CustomHeaders,
      callback: ServiceCallback[PolicyDefinitionListResult]
    ): Unit = js.native
    
    /**
      * @summary Retrieve policy definitions in a management group
      *
      * This operation retrieves a list of all the policy definitions in a given
      * management group.
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
      *                      @resolve {PolicyDefinitionListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {PolicyDefinitionListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link PolicyDefinitionListResult} for more
      *                      information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def listByManagementGroupNext(nextPageLink: String): js.Promise[PolicyDefinitionListResult] = js.native
    def listByManagementGroupNext(nextPageLink: String, callback: ServiceCallback[PolicyDefinitionListResult]): Unit = js.native
    def listByManagementGroupNext(nextPageLink: String, options: CustomHeaders): js.Promise[PolicyDefinitionListResult] = js.native
    def listByManagementGroupNext(
      nextPageLink: String,
      options: CustomHeaders,
      callback: ServiceCallback[PolicyDefinitionListResult]
    ): Unit = js.native
    
    /**
      * @summary Retrieve policy definitions in a management group
      *
      * This operation retrieves a list of all the policy definitions in a given
      * management group.
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
      * @resolve {HttpOperationResponse<PolicyDefinitionListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listByManagementGroupNextWithHttpOperationResponse(nextPageLink: String): js.Promise[HttpOperationResponse[PolicyDefinitionListResult]] = js.native
    def listByManagementGroupNextWithHttpOperationResponse(nextPageLink: String, options: CustomHeaders): js.Promise[HttpOperationResponse[PolicyDefinitionListResult]] = js.native
    
    /**
      * @summary Retrieve policy definitions in a management group
      *
      * This operation retrieves a list of all the policy definitions in a given
      * management group.
      *
      * @param {string} managementGroupId The ID of the management group.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<PolicyDefinitionListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listByManagementGroupWithHttpOperationResponse(managementGroupId: String): js.Promise[HttpOperationResponse[PolicyDefinitionListResult]] = js.native
    def listByManagementGroupWithHttpOperationResponse(managementGroupId: String, options: CustomHeaders): js.Promise[HttpOperationResponse[PolicyDefinitionListResult]] = js.native
    
    /**
      * @summary Retrieves policy definitions in a subscription
      *
      * This operation retrieves a list of all the policy definitions in a given
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
      *                      @resolve {PolicyDefinitionListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {PolicyDefinitionListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link PolicyDefinitionListResult} for more
      *                      information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def listNext(nextPageLink: String): js.Promise[PolicyDefinitionListResult] = js.native
    def listNext(nextPageLink: String, callback: ServiceCallback[PolicyDefinitionListResult]): Unit = js.native
    def listNext(nextPageLink: String, options: CustomHeaders): js.Promise[PolicyDefinitionListResult] = js.native
    def listNext(
      nextPageLink: String,
      options: CustomHeaders,
      callback: ServiceCallback[PolicyDefinitionListResult]
    ): Unit = js.native
    
    /**
      * @summary Retrieves policy definitions in a subscription
      *
      * This operation retrieves a list of all the policy definitions in a given
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
      * @resolve {HttpOperationResponse<PolicyDefinitionListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listNextWithHttpOperationResponse(nextPageLink: String): js.Promise[HttpOperationResponse[PolicyDefinitionListResult]] = js.native
    def listNextWithHttpOperationResponse(nextPageLink: String, options: CustomHeaders): js.Promise[HttpOperationResponse[PolicyDefinitionListResult]] = js.native
    
    /**
      * @summary Retrieves policy definitions in a subscription
      *
      * This operation retrieves a list of all the policy definitions in a given
      * subscription.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<PolicyDefinitionListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listWithHttpOperationResponse(): js.Promise[HttpOperationResponse[PolicyDefinitionListResult]] = js.native
    def listWithHttpOperationResponse(options: CustomHeaders): js.Promise[HttpOperationResponse[PolicyDefinitionListResult]] = js.native
  }
  
  @js.native
  trait PolicySetDefinitions extends StObject {
    
    /**
      * @summary Creates or updates a policy set definition.
      *
      * This operation creates or updates a policy set definition in the given
      * subscription with the given name.
      *
      * @param {string} policySetDefinitionName The name of the policy set
      * definition to create.
      *
      * @param {object} parameters The policy set definition properties.
      *
      * @param {string} [parameters.policyType] The type of policy definition.
      * Possible values are NotSpecified, BuiltIn, and Custom. Possible values
      * include: 'NotSpecified', 'BuiltIn', 'Custom'
      *
      * @param {string} [parameters.displayName] The display name of the policy set
      * definition.
      *
      * @param {string} [parameters.description] The policy set definition
      * description.
      *
      * @param {object} [parameters.metadata] The policy set definition metadata.
      *
      * @param {object} [parameters.parameters] The policy set definition parameters
      * that can be used in policy definition references.
      *
      * @param {array} parameters.policyDefinitions An array of policy definition
      * references.
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
      *                      @resolve {PolicySetDefinition} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {PolicySetDefinition} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link PolicySetDefinition} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def createOrUpdate(policySetDefinitionName: String, parameters: PolicySetDefinition): js.Promise[PolicySetDefinition] = js.native
    def createOrUpdate(
      policySetDefinitionName: String,
      parameters: PolicySetDefinition,
      callback: ServiceCallback[PolicySetDefinition]
    ): Unit = js.native
    def createOrUpdate(policySetDefinitionName: String, parameters: PolicySetDefinition, options: CustomHeaders): js.Promise[PolicySetDefinition] = js.native
    def createOrUpdate(
      policySetDefinitionName: String,
      parameters: PolicySetDefinition,
      options: CustomHeaders,
      callback: ServiceCallback[PolicySetDefinition]
    ): Unit = js.native
    
    /**
      * @summary Creates or updates a policy set definition.
      *
      * This operation creates or updates a policy set definition in the given
      * management group with the given name.
      *
      * @param {string} policySetDefinitionName The name of the policy set
      * definition to create.
      *
      * @param {object} parameters The policy set definition properties.
      *
      * @param {string} [parameters.policyType] The type of policy definition.
      * Possible values are NotSpecified, BuiltIn, and Custom. Possible values
      * include: 'NotSpecified', 'BuiltIn', 'Custom'
      *
      * @param {string} [parameters.displayName] The display name of the policy set
      * definition.
      *
      * @param {string} [parameters.description] The policy set definition
      * description.
      *
      * @param {object} [parameters.metadata] The policy set definition metadata.
      *
      * @param {object} [parameters.parameters] The policy set definition parameters
      * that can be used in policy definition references.
      *
      * @param {array} parameters.policyDefinitions An array of policy definition
      * references.
      *
      * @param {string} managementGroupId The ID of the management group.
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
      *                      @resolve {PolicySetDefinition} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {PolicySetDefinition} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link PolicySetDefinition} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def createOrUpdateAtManagementGroup(policySetDefinitionName: String, parameters: PolicySetDefinition, managementGroupId: String): js.Promise[PolicySetDefinition] = js.native
    def createOrUpdateAtManagementGroup(
      policySetDefinitionName: String,
      parameters: PolicySetDefinition,
      managementGroupId: String,
      callback: ServiceCallback[PolicySetDefinition]
    ): Unit = js.native
    def createOrUpdateAtManagementGroup(
      policySetDefinitionName: String,
      parameters: PolicySetDefinition,
      managementGroupId: String,
      options: CustomHeaders
    ): js.Promise[PolicySetDefinition] = js.native
    def createOrUpdateAtManagementGroup(
      policySetDefinitionName: String,
      parameters: PolicySetDefinition,
      managementGroupId: String,
      options: CustomHeaders,
      callback: ServiceCallback[PolicySetDefinition]
    ): Unit = js.native
    
    /**
      * @summary Creates or updates a policy set definition.
      *
      * This operation creates or updates a policy set definition in the given
      * management group with the given name.
      *
      * @param {string} policySetDefinitionName The name of the policy set
      * definition to create.
      *
      * @param {object} parameters The policy set definition properties.
      *
      * @param {string} [parameters.policyType] The type of policy definition.
      * Possible values are NotSpecified, BuiltIn, and Custom. Possible values
      * include: 'NotSpecified', 'BuiltIn', 'Custom'
      *
      * @param {string} [parameters.displayName] The display name of the policy set
      * definition.
      *
      * @param {string} [parameters.description] The policy set definition
      * description.
      *
      * @param {object} [parameters.metadata] The policy set definition metadata.
      *
      * @param {object} [parameters.parameters] The policy set definition parameters
      * that can be used in policy definition references.
      *
      * @param {array} parameters.policyDefinitions An array of policy definition
      * references.
      *
      * @param {string} managementGroupId The ID of the management group.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<PolicySetDefinition>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def createOrUpdateAtManagementGroupWithHttpOperationResponse(policySetDefinitionName: String, parameters: PolicySetDefinition, managementGroupId: String): js.Promise[HttpOperationResponse[PolicySetDefinition]] = js.native
    def createOrUpdateAtManagementGroupWithHttpOperationResponse(
      policySetDefinitionName: String,
      parameters: PolicySetDefinition,
      managementGroupId: String,
      options: CustomHeaders
    ): js.Promise[HttpOperationResponse[PolicySetDefinition]] = js.native
    
    /**
      * @summary Creates or updates a policy set definition.
      *
      * This operation creates or updates a policy set definition in the given
      * subscription with the given name.
      *
      * @param {string} policySetDefinitionName The name of the policy set
      * definition to create.
      *
      * @param {object} parameters The policy set definition properties.
      *
      * @param {string} [parameters.policyType] The type of policy definition.
      * Possible values are NotSpecified, BuiltIn, and Custom. Possible values
      * include: 'NotSpecified', 'BuiltIn', 'Custom'
      *
      * @param {string} [parameters.displayName] The display name of the policy set
      * definition.
      *
      * @param {string} [parameters.description] The policy set definition
      * description.
      *
      * @param {object} [parameters.metadata] The policy set definition metadata.
      *
      * @param {object} [parameters.parameters] The policy set definition parameters
      * that can be used in policy definition references.
      *
      * @param {array} parameters.policyDefinitions An array of policy definition
      * references.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<PolicySetDefinition>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def createOrUpdateWithHttpOperationResponse(policySetDefinitionName: String, parameters: PolicySetDefinition): js.Promise[HttpOperationResponse[PolicySetDefinition]] = js.native
    def createOrUpdateWithHttpOperationResponse(policySetDefinitionName: String, parameters: PolicySetDefinition, options: CustomHeaders): js.Promise[HttpOperationResponse[PolicySetDefinition]] = js.native
    
    /**
      * @summary Deletes a policy set definition.
      *
      * This operation deletes the policy set definition in the given management
      * group with the given name.
      *
      * @param {string} policySetDefinitionName The name of the policy set
      * definition to delete.
      *
      * @param {string} managementGroupId The ID of the management group.
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
    def deleteAtManagementGroup(policySetDefinitionName: String, managementGroupId: String): js.Promise[Unit] = js.native
    def deleteAtManagementGroup(policySetDefinitionName: String, managementGroupId: String, callback: ServiceCallback[Unit]): Unit = js.native
    def deleteAtManagementGroup(policySetDefinitionName: String, managementGroupId: String, options: CustomHeaders): js.Promise[Unit] = js.native
    def deleteAtManagementGroup(
      policySetDefinitionName: String,
      managementGroupId: String,
      options: CustomHeaders,
      callback: ServiceCallback[Unit]
    ): Unit = js.native
    
    /**
      * @summary Deletes a policy set definition.
      *
      * This operation deletes the policy set definition in the given management
      * group with the given name.
      *
      * @param {string} policySetDefinitionName The name of the policy set
      * definition to delete.
      *
      * @param {string} managementGroupId The ID of the management group.
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
    def deleteAtManagementGroupWithHttpOperationResponse(policySetDefinitionName: String, managementGroupId: String): js.Promise[HttpOperationResponse[Unit]] = js.native
    def deleteAtManagementGroupWithHttpOperationResponse(policySetDefinitionName: String, managementGroupId: String, options: CustomHeaders): js.Promise[HttpOperationResponse[Unit]] = js.native
    
    /**
      * @summary Deletes a policy set definition.
      *
      * This operation deletes the policy set definition in the given subscription
      * with the given name.
      *
      * @param {string} policySetDefinitionName The name of the policy set
      * definition to delete.
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
    def deleteMethod(policySetDefinitionName: String): js.Promise[Unit] = js.native
    def deleteMethod(policySetDefinitionName: String, callback: ServiceCallback[Unit]): Unit = js.native
    def deleteMethod(policySetDefinitionName: String, options: CustomHeaders): js.Promise[Unit] = js.native
    def deleteMethod(policySetDefinitionName: String, options: CustomHeaders, callback: ServiceCallback[Unit]): Unit = js.native
    
    /**
      * @summary Deletes a policy set definition.
      *
      * This operation deletes the policy set definition in the given subscription
      * with the given name.
      *
      * @param {string} policySetDefinitionName The name of the policy set
      * definition to delete.
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
    def deleteMethodWithHttpOperationResponse(policySetDefinitionName: String): js.Promise[HttpOperationResponse[Unit]] = js.native
    def deleteMethodWithHttpOperationResponse(policySetDefinitionName: String, options: CustomHeaders): js.Promise[HttpOperationResponse[Unit]] = js.native
    
    /**
      * @summary Retrieves a policy set definition.
      *
      * This operation retrieves the policy set definition in the given subscription
      * with the given name.
      *
      * @param {string} policySetDefinitionName The name of the policy set
      * definition to get.
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
      *                      @resolve {PolicySetDefinition} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {PolicySetDefinition} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link PolicySetDefinition} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def get(policySetDefinitionName: String): js.Promise[PolicySetDefinition] = js.native
    def get(policySetDefinitionName: String, callback: ServiceCallback[PolicySetDefinition]): Unit = js.native
    def get(policySetDefinitionName: String, options: CustomHeaders): js.Promise[PolicySetDefinition] = js.native
    def get(
      policySetDefinitionName: String,
      options: CustomHeaders,
      callback: ServiceCallback[PolicySetDefinition]
    ): Unit = js.native
    
    /**
      * @summary Retrieves a policy set definition.
      *
      * This operation retrieves the policy set definition in the given management
      * group with the given name.
      *
      * @param {string} policySetDefinitionName The name of the policy set
      * definition to get.
      *
      * @param {string} managementGroupId The ID of the management group.
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
      *                      @resolve {PolicySetDefinition} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {PolicySetDefinition} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link PolicySetDefinition} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def getAtManagementGroup(policySetDefinitionName: String, managementGroupId: String): js.Promise[PolicySetDefinition] = js.native
    def getAtManagementGroup(
      policySetDefinitionName: String,
      managementGroupId: String,
      callback: ServiceCallback[PolicySetDefinition]
    ): Unit = js.native
    def getAtManagementGroup(policySetDefinitionName: String, managementGroupId: String, options: CustomHeaders): js.Promise[PolicySetDefinition] = js.native
    def getAtManagementGroup(
      policySetDefinitionName: String,
      managementGroupId: String,
      options: CustomHeaders,
      callback: ServiceCallback[PolicySetDefinition]
    ): Unit = js.native
    
    /**
      * @summary Retrieves a policy set definition.
      *
      * This operation retrieves the policy set definition in the given management
      * group with the given name.
      *
      * @param {string} policySetDefinitionName The name of the policy set
      * definition to get.
      *
      * @param {string} managementGroupId The ID of the management group.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<PolicySetDefinition>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def getAtManagementGroupWithHttpOperationResponse(policySetDefinitionName: String, managementGroupId: String): js.Promise[HttpOperationResponse[PolicySetDefinition]] = js.native
    def getAtManagementGroupWithHttpOperationResponse(policySetDefinitionName: String, managementGroupId: String, options: CustomHeaders): js.Promise[HttpOperationResponse[PolicySetDefinition]] = js.native
    
    /**
      * @summary Retrieves a built in policy set definition.
      *
      * This operation retrieves the built-in policy set definition with the given
      * name.
      *
      * @param {string} policySetDefinitionName The name of the policy set
      * definition to get.
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
      *                      @resolve {PolicySetDefinition} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {PolicySetDefinition} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link PolicySetDefinition} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def getBuiltIn(policySetDefinitionName: String): js.Promise[PolicySetDefinition] = js.native
    def getBuiltIn(policySetDefinitionName: String, callback: ServiceCallback[PolicySetDefinition]): Unit = js.native
    def getBuiltIn(policySetDefinitionName: String, options: CustomHeaders): js.Promise[PolicySetDefinition] = js.native
    def getBuiltIn(
      policySetDefinitionName: String,
      options: CustomHeaders,
      callback: ServiceCallback[PolicySetDefinition]
    ): Unit = js.native
    
    /**
      * @summary Retrieves a built in policy set definition.
      *
      * This operation retrieves the built-in policy set definition with the given
      * name.
      *
      * @param {string} policySetDefinitionName The name of the policy set
      * definition to get.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<PolicySetDefinition>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def getBuiltInWithHttpOperationResponse(policySetDefinitionName: String): js.Promise[HttpOperationResponse[PolicySetDefinition]] = js.native
    def getBuiltInWithHttpOperationResponse(policySetDefinitionName: String, options: CustomHeaders): js.Promise[HttpOperationResponse[PolicySetDefinition]] = js.native
    
    /**
      * @summary Retrieves a policy set definition.
      *
      * This operation retrieves the policy set definition in the given subscription
      * with the given name.
      *
      * @param {string} policySetDefinitionName The name of the policy set
      * definition to get.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<PolicySetDefinition>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def getWithHttpOperationResponse(policySetDefinitionName: String): js.Promise[HttpOperationResponse[PolicySetDefinition]] = js.native
    def getWithHttpOperationResponse(policySetDefinitionName: String, options: CustomHeaders): js.Promise[HttpOperationResponse[PolicySetDefinition]] = js.native
    
    /**
      * @summary Retrieves the policy set definitions for a subscription.
      *
      * This operation retrieves a list of all the policy set definitions in the
      * given subscription.
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
      *                      @resolve {PolicySetDefinitionListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {PolicySetDefinitionListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link PolicySetDefinitionListResult} for more
      *                      information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def list(): js.Promise[PolicySetDefinitionListResult] = js.native
    def list(callback: ServiceCallback[PolicySetDefinitionListResult]): Unit = js.native
    def list(options: CustomHeaders): js.Promise[PolicySetDefinitionListResult] = js.native
    def list(options: CustomHeaders, callback: ServiceCallback[PolicySetDefinitionListResult]): Unit = js.native
    
    /**
      * @summary Retrieves built-in policy set definitions.
      *
      * This operation retrieves a list of all the built-in policy set definitions.
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
      *                      @resolve {PolicySetDefinitionListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {PolicySetDefinitionListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link PolicySetDefinitionListResult} for more
      *                      information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def listBuiltIn(): js.Promise[PolicySetDefinitionListResult] = js.native
    def listBuiltIn(callback: ServiceCallback[PolicySetDefinitionListResult]): Unit = js.native
    def listBuiltIn(options: CustomHeaders): js.Promise[PolicySetDefinitionListResult] = js.native
    def listBuiltIn(options: CustomHeaders, callback: ServiceCallback[PolicySetDefinitionListResult]): Unit = js.native
    
    /**
      * @summary Retrieves built-in policy set definitions.
      *
      * This operation retrieves a list of all the built-in policy set definitions.
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
      *                      @resolve {PolicySetDefinitionListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {PolicySetDefinitionListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link PolicySetDefinitionListResult} for more
      *                      information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def listBuiltInNext(nextPageLink: String): js.Promise[PolicySetDefinitionListResult] = js.native
    def listBuiltInNext(nextPageLink: String, callback: ServiceCallback[PolicySetDefinitionListResult]): Unit = js.native
    def listBuiltInNext(nextPageLink: String, options: CustomHeaders): js.Promise[PolicySetDefinitionListResult] = js.native
    def listBuiltInNext(
      nextPageLink: String,
      options: CustomHeaders,
      callback: ServiceCallback[PolicySetDefinitionListResult]
    ): Unit = js.native
    
    /**
      * @summary Retrieves built-in policy set definitions.
      *
      * This operation retrieves a list of all the built-in policy set definitions.
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
      * @resolve {HttpOperationResponse<PolicySetDefinitionListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listBuiltInNextWithHttpOperationResponse(nextPageLink: String): js.Promise[HttpOperationResponse[PolicySetDefinitionListResult]] = js.native
    def listBuiltInNextWithHttpOperationResponse(nextPageLink: String, options: CustomHeaders): js.Promise[HttpOperationResponse[PolicySetDefinitionListResult]] = js.native
    
    /**
      * @summary Retrieves built-in policy set definitions.
      *
      * This operation retrieves a list of all the built-in policy set definitions.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<PolicySetDefinitionListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listBuiltInWithHttpOperationResponse(): js.Promise[HttpOperationResponse[PolicySetDefinitionListResult]] = js.native
    def listBuiltInWithHttpOperationResponse(options: CustomHeaders): js.Promise[HttpOperationResponse[PolicySetDefinitionListResult]] = js.native
    
    /**
      * @summary Retrieves all policy set definitions in management group.
      *
      * This operation retrieves a list of all the a policy set definition in the
      * given management group.
      *
      * @param {string} managementGroupId The ID of the management group.
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
      *                      @resolve {PolicySetDefinitionListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {PolicySetDefinitionListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link PolicySetDefinitionListResult} for more
      *                      information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def listByManagementGroup(managementGroupId: String): js.Promise[PolicySetDefinitionListResult] = js.native
    def listByManagementGroup(managementGroupId: String, callback: ServiceCallback[PolicySetDefinitionListResult]): Unit = js.native
    def listByManagementGroup(managementGroupId: String, options: CustomHeaders): js.Promise[PolicySetDefinitionListResult] = js.native
    def listByManagementGroup(
      managementGroupId: String,
      options: CustomHeaders,
      callback: ServiceCallback[PolicySetDefinitionListResult]
    ): Unit = js.native
    
    /**
      * @summary Retrieves all policy set definitions in management group.
      *
      * This operation retrieves a list of all the a policy set definition in the
      * given management group.
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
      *                      @resolve {PolicySetDefinitionListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {PolicySetDefinitionListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link PolicySetDefinitionListResult} for more
      *                      information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def listByManagementGroupNext(nextPageLink: String): js.Promise[PolicySetDefinitionListResult] = js.native
    def listByManagementGroupNext(nextPageLink: String, callback: ServiceCallback[PolicySetDefinitionListResult]): Unit = js.native
    def listByManagementGroupNext(nextPageLink: String, options: CustomHeaders): js.Promise[PolicySetDefinitionListResult] = js.native
    def listByManagementGroupNext(
      nextPageLink: String,
      options: CustomHeaders,
      callback: ServiceCallback[PolicySetDefinitionListResult]
    ): Unit = js.native
    
    /**
      * @summary Retrieves all policy set definitions in management group.
      *
      * This operation retrieves a list of all the a policy set definition in the
      * given management group.
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
      * @resolve {HttpOperationResponse<PolicySetDefinitionListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listByManagementGroupNextWithHttpOperationResponse(nextPageLink: String): js.Promise[HttpOperationResponse[PolicySetDefinitionListResult]] = js.native
    def listByManagementGroupNextWithHttpOperationResponse(nextPageLink: String, options: CustomHeaders): js.Promise[HttpOperationResponse[PolicySetDefinitionListResult]] = js.native
    
    /**
      * @summary Retrieves all policy set definitions in management group.
      *
      * This operation retrieves a list of all the a policy set definition in the
      * given management group.
      *
      * @param {string} managementGroupId The ID of the management group.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<PolicySetDefinitionListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listByManagementGroupWithHttpOperationResponse(managementGroupId: String): js.Promise[HttpOperationResponse[PolicySetDefinitionListResult]] = js.native
    def listByManagementGroupWithHttpOperationResponse(managementGroupId: String, options: CustomHeaders): js.Promise[HttpOperationResponse[PolicySetDefinitionListResult]] = js.native
    
    /**
      * @summary Retrieves the policy set definitions for a subscription.
      *
      * This operation retrieves a list of all the policy set definitions in the
      * given subscription.
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
      *                      @resolve {PolicySetDefinitionListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {PolicySetDefinitionListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link PolicySetDefinitionListResult} for more
      *                      information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def listNext(nextPageLink: String): js.Promise[PolicySetDefinitionListResult] = js.native
    def listNext(nextPageLink: String, callback: ServiceCallback[PolicySetDefinitionListResult]): Unit = js.native
    def listNext(nextPageLink: String, options: CustomHeaders): js.Promise[PolicySetDefinitionListResult] = js.native
    def listNext(
      nextPageLink: String,
      options: CustomHeaders,
      callback: ServiceCallback[PolicySetDefinitionListResult]
    ): Unit = js.native
    
    /**
      * @summary Retrieves the policy set definitions for a subscription.
      *
      * This operation retrieves a list of all the policy set definitions in the
      * given subscription.
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
      * @resolve {HttpOperationResponse<PolicySetDefinitionListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listNextWithHttpOperationResponse(nextPageLink: String): js.Promise[HttpOperationResponse[PolicySetDefinitionListResult]] = js.native
    def listNextWithHttpOperationResponse(nextPageLink: String, options: CustomHeaders): js.Promise[HttpOperationResponse[PolicySetDefinitionListResult]] = js.native
    
    /**
      * @summary Retrieves the policy set definitions for a subscription.
      *
      * This operation retrieves a list of all the policy set definitions in the
      * given subscription.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<PolicySetDefinitionListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listWithHttpOperationResponse(): js.Promise[HttpOperationResponse[PolicySetDefinitionListResult]] = js.native
    def listWithHttpOperationResponse(options: CustomHeaders): js.Promise[HttpOperationResponse[PolicySetDefinitionListResult]] = js.native
  }
}
