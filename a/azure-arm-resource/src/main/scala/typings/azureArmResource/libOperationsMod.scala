package typings.azureArmResource

import typings.azureArmResource.anon.CustomHeaders
import typings.azureArmResource.anon.Parameters
import typings.azureArmResource.libModelsMod.Appliance
import typings.azureArmResource.libModelsMod.ApplianceDefinition
import typings.azureArmResource.libModelsMod.ApplianceDefinitionListResult
import typings.azureArmResource.libModelsMod.ApplianceListResult
import typings.msRest.mod.HttpOperationResponse
import typings.msRest.mod.ServiceCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure-arm-resource/lib/operations", JSImport.Namespace)
@js.native
object libOperationsMod extends js.Object {
  @js.native
  trait ApplianceDefinitions extends js.Object {
    /**
      * Creates a new appliance definition.
      *
      * @param {string} resourceGroupName The name of the resource group. The name
      * is case insensitive.
      *
      * @param {string} applianceDefinitionName The name of the appliance
      * definition.
      *
      * @param {object} parameters Parameters supplied to the create or update an
      * appliance definition.
      *
      * @param {string} parameters.lockLevel The appliance lock level. Possible
      * values include: 'CanNotDelete', 'ReadOnly', 'None'
      *
      * @param {string} [parameters.displayName] The appliance definition display
      * name.
      *
      * @param {array} parameters.authorizations The appliance provider
      * authorizations.
      *
      * @param {array} [parameters.artifacts] The collection of appliance artifacts.
      * The portal will use the files specified as artifacts to construct the user
      * experience of creating an appliance from an appliance definition.
      *
      * @param {string} [parameters.description] The appliance definition
      * description.
      *
      * @param {string} parameters.packageFileUri The appliance definition package
      * file Uri.
      *
      * @param {string} [parameters.managedBy] ID of the resource that manages this
      * resource.
      *
      * @param {object} [parameters.sku] The SKU of the resource.
      *
      * @param {string} parameters.sku.name The SKU name.
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
      * values include: 'SystemAssigned'
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
      *                      @resolve {ApplianceDefinition} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {ApplianceDefinition} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link ApplianceDefinition} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def beginCreateOrUpdate(resourceGroupName: String, applianceDefinitionName: String, parameters: ApplianceDefinition): js.Promise[ApplianceDefinition] = js.native
    def beginCreateOrUpdate(
      resourceGroupName: String,
      applianceDefinitionName: String,
      parameters: ApplianceDefinition,
      callback: ServiceCallback[ApplianceDefinition]
    ): Unit = js.native
    def beginCreateOrUpdate(
      resourceGroupName: String,
      applianceDefinitionName: String,
      parameters: ApplianceDefinition,
      options: CustomHeaders
    ): js.Promise[ApplianceDefinition] = js.native
    def beginCreateOrUpdate(
      resourceGroupName: String,
      applianceDefinitionName: String,
      parameters: ApplianceDefinition,
      options: CustomHeaders,
      callback: ServiceCallback[ApplianceDefinition]
    ): Unit = js.native
    /**
      * Creates a new appliance definition.
      *
      * @param {string} applianceDefinitionId The fully qualified ID of the
      * appliance definition, including the appliance name and the appliance
      * definition resource type. Use the format,
      * /subscriptions/{guid}/resourceGroups/{resource-group-name}/Microsoft.Solutions/applianceDefinitions/{applianceDefinition-name}
      *
      * @param {object} parameters Parameters supplied to the create or update an
      * appliance definition.
      *
      * @param {string} parameters.lockLevel The appliance lock level. Possible
      * values include: 'CanNotDelete', 'ReadOnly', 'None'
      *
      * @param {string} [parameters.displayName] The appliance definition display
      * name.
      *
      * @param {array} parameters.authorizations The appliance provider
      * authorizations.
      *
      * @param {array} [parameters.artifacts] The collection of appliance artifacts.
      * The portal will use the files specified as artifacts to construct the user
      * experience of creating an appliance from an appliance definition.
      *
      * @param {string} [parameters.description] The appliance definition
      * description.
      *
      * @param {string} parameters.packageFileUri The appliance definition package
      * file Uri.
      *
      * @param {string} [parameters.managedBy] ID of the resource that manages this
      * resource.
      *
      * @param {object} [parameters.sku] The SKU of the resource.
      *
      * @param {string} parameters.sku.name The SKU name.
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
      * values include: 'SystemAssigned'
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
      *                      @resolve {ApplianceDefinition} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {ApplianceDefinition} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link ApplianceDefinition} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def beginCreateOrUpdateById(applianceDefinitionId: String, parameters: ApplianceDefinition): js.Promise[ApplianceDefinition] = js.native
    def beginCreateOrUpdateById(
      applianceDefinitionId: String,
      parameters: ApplianceDefinition,
      callback: ServiceCallback[ApplianceDefinition]
    ): Unit = js.native
    def beginCreateOrUpdateById(applianceDefinitionId: String, parameters: ApplianceDefinition, options: CustomHeaders): js.Promise[ApplianceDefinition] = js.native
    def beginCreateOrUpdateById(
      applianceDefinitionId: String,
      parameters: ApplianceDefinition,
      options: CustomHeaders,
      callback: ServiceCallback[ApplianceDefinition]
    ): Unit = js.native
    /**
      * Creates a new appliance definition.
      *
      * @param {string} applianceDefinitionId The fully qualified ID of the
      * appliance definition, including the appliance name and the appliance
      * definition resource type. Use the format,
      * /subscriptions/{guid}/resourceGroups/{resource-group-name}/Microsoft.Solutions/applianceDefinitions/{applianceDefinition-name}
      *
      * @param {object} parameters Parameters supplied to the create or update an
      * appliance definition.
      *
      * @param {string} parameters.lockLevel The appliance lock level. Possible
      * values include: 'CanNotDelete', 'ReadOnly', 'None'
      *
      * @param {string} [parameters.displayName] The appliance definition display
      * name.
      *
      * @param {array} parameters.authorizations The appliance provider
      * authorizations.
      *
      * @param {array} [parameters.artifacts] The collection of appliance artifacts.
      * The portal will use the files specified as artifacts to construct the user
      * experience of creating an appliance from an appliance definition.
      *
      * @param {string} [parameters.description] The appliance definition
      * description.
      *
      * @param {string} parameters.packageFileUri The appliance definition package
      * file Uri.
      *
      * @param {string} [parameters.managedBy] ID of the resource that manages this
      * resource.
      *
      * @param {object} [parameters.sku] The SKU of the resource.
      *
      * @param {string} parameters.sku.name The SKU name.
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
      * values include: 'SystemAssigned'
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<ApplianceDefinition>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def beginCreateOrUpdateByIdWithHttpOperationResponse(applianceDefinitionId: String, parameters: ApplianceDefinition): js.Promise[HttpOperationResponse[ApplianceDefinition]] = js.native
    def beginCreateOrUpdateByIdWithHttpOperationResponse(applianceDefinitionId: String, parameters: ApplianceDefinition, options: CustomHeaders): js.Promise[HttpOperationResponse[ApplianceDefinition]] = js.native
    /**
      * Creates a new appliance definition.
      *
      * @param {string} resourceGroupName The name of the resource group. The name
      * is case insensitive.
      *
      * @param {string} applianceDefinitionName The name of the appliance
      * definition.
      *
      * @param {object} parameters Parameters supplied to the create or update an
      * appliance definition.
      *
      * @param {string} parameters.lockLevel The appliance lock level. Possible
      * values include: 'CanNotDelete', 'ReadOnly', 'None'
      *
      * @param {string} [parameters.displayName] The appliance definition display
      * name.
      *
      * @param {array} parameters.authorizations The appliance provider
      * authorizations.
      *
      * @param {array} [parameters.artifacts] The collection of appliance artifacts.
      * The portal will use the files specified as artifacts to construct the user
      * experience of creating an appliance from an appliance definition.
      *
      * @param {string} [parameters.description] The appliance definition
      * description.
      *
      * @param {string} parameters.packageFileUri The appliance definition package
      * file Uri.
      *
      * @param {string} [parameters.managedBy] ID of the resource that manages this
      * resource.
      *
      * @param {object} [parameters.sku] The SKU of the resource.
      *
      * @param {string} parameters.sku.name The SKU name.
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
      * values include: 'SystemAssigned'
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<ApplianceDefinition>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def beginCreateOrUpdateWithHttpOperationResponse(resourceGroupName: String, applianceDefinitionName: String, parameters: ApplianceDefinition): js.Promise[HttpOperationResponse[ApplianceDefinition]] = js.native
    def beginCreateOrUpdateWithHttpOperationResponse(
      resourceGroupName: String,
      applianceDefinitionName: String,
      parameters: ApplianceDefinition,
      options: CustomHeaders
    ): js.Promise[HttpOperationResponse[ApplianceDefinition]] = js.native
    /**
      * Deletes the appliance definition.
      *
      * @param {string} applianceDefinitionId The fully qualified ID of the
      * appliance definition, including the appliance name and the appliance
      * definition resource type. Use the format,
      * /subscriptions/{guid}/resourceGroups/{resource-group-name}/Microsoft.Solutions/applianceDefinitions/{applianceDefinition-name}
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
    def beginDeleteById(applianceDefinitionId: String): js.Promise[Unit] = js.native
    def beginDeleteById(applianceDefinitionId: String, callback: ServiceCallback[Unit]): Unit = js.native
    def beginDeleteById(applianceDefinitionId: String, options: CustomHeaders): js.Promise[Unit] = js.native
    def beginDeleteById(applianceDefinitionId: String, options: CustomHeaders, callback: ServiceCallback[Unit]): Unit = js.native
    /**
      * Deletes the appliance definition.
      *
      * @param {string} applianceDefinitionId The fully qualified ID of the
      * appliance definition, including the appliance name and the appliance
      * definition resource type. Use the format,
      * /subscriptions/{guid}/resourceGroups/{resource-group-name}/Microsoft.Solutions/applianceDefinitions/{applianceDefinition-name}
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
    def beginDeleteByIdWithHttpOperationResponse(applianceDefinitionId: String): js.Promise[HttpOperationResponse[Unit]] = js.native
    def beginDeleteByIdWithHttpOperationResponse(applianceDefinitionId: String, options: CustomHeaders): js.Promise[HttpOperationResponse[Unit]] = js.native
    /**
      * Deletes the appliance definition.
      *
      * @param {string} resourceGroupName The name of the resource group. The name
      * is case insensitive.
      *
      * @param {string} applianceDefinitionName The name of the appliance definition
      * to delete.
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
    def beginDeleteMethod(resourceGroupName: String, applianceDefinitionName: String): js.Promise[Unit] = js.native
    def beginDeleteMethod(resourceGroupName: String, applianceDefinitionName: String, callback: ServiceCallback[Unit]): Unit = js.native
    def beginDeleteMethod(resourceGroupName: String, applianceDefinitionName: String, options: CustomHeaders): js.Promise[Unit] = js.native
    def beginDeleteMethod(
      resourceGroupName: String,
      applianceDefinitionName: String,
      options: CustomHeaders,
      callback: ServiceCallback[Unit]
    ): Unit = js.native
    /**
      * Deletes the appliance definition.
      *
      * @param {string} resourceGroupName The name of the resource group. The name
      * is case insensitive.
      *
      * @param {string} applianceDefinitionName The name of the appliance definition
      * to delete.
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
    def beginDeleteMethodWithHttpOperationResponse(resourceGroupName: String, applianceDefinitionName: String): js.Promise[HttpOperationResponse[Unit]] = js.native
    def beginDeleteMethodWithHttpOperationResponse(resourceGroupName: String, applianceDefinitionName: String, options: CustomHeaders): js.Promise[HttpOperationResponse[Unit]] = js.native
    /**
      * Creates a new appliance definition.
      *
      * @param {string} resourceGroupName The name of the resource group. The name
      * is case insensitive.
      *
      * @param {string} applianceDefinitionName The name of the appliance
      * definition.
      *
      * @param {object} parameters Parameters supplied to the create or update an
      * appliance definition.
      *
      * @param {string} parameters.lockLevel The appliance lock level. Possible
      * values include: 'CanNotDelete', 'ReadOnly', 'None'
      *
      * @param {string} [parameters.displayName] The appliance definition display
      * name.
      *
      * @param {array} parameters.authorizations The appliance provider
      * authorizations.
      *
      * @param {array} [parameters.artifacts] The collection of appliance artifacts.
      * The portal will use the files specified as artifacts to construct the user
      * experience of creating an appliance from an appliance definition.
      *
      * @param {string} [parameters.description] The appliance definition
      * description.
      *
      * @param {string} parameters.packageFileUri The appliance definition package
      * file Uri.
      *
      * @param {string} [parameters.managedBy] ID of the resource that manages this
      * resource.
      *
      * @param {object} [parameters.sku] The SKU of the resource.
      *
      * @param {string} parameters.sku.name The SKU name.
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
      * values include: 'SystemAssigned'
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
      *                      @resolve {ApplianceDefinition} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {ApplianceDefinition} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link ApplianceDefinition} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def createOrUpdate(resourceGroupName: String, applianceDefinitionName: String, parameters: ApplianceDefinition): js.Promise[ApplianceDefinition] = js.native
    def createOrUpdate(
      resourceGroupName: String,
      applianceDefinitionName: String,
      parameters: ApplianceDefinition,
      callback: ServiceCallback[ApplianceDefinition]
    ): Unit = js.native
    def createOrUpdate(
      resourceGroupName: String,
      applianceDefinitionName: String,
      parameters: ApplianceDefinition,
      options: CustomHeaders
    ): js.Promise[ApplianceDefinition] = js.native
    def createOrUpdate(
      resourceGroupName: String,
      applianceDefinitionName: String,
      parameters: ApplianceDefinition,
      options: CustomHeaders,
      callback: ServiceCallback[ApplianceDefinition]
    ): Unit = js.native
    /**
      * Creates a new appliance definition.
      *
      * @param {string} applianceDefinitionId The fully qualified ID of the
      * appliance definition, including the appliance name and the appliance
      * definition resource type. Use the format,
      * /subscriptions/{guid}/resourceGroups/{resource-group-name}/Microsoft.Solutions/applianceDefinitions/{applianceDefinition-name}
      *
      * @param {object} parameters Parameters supplied to the create or update an
      * appliance definition.
      *
      * @param {string} parameters.lockLevel The appliance lock level. Possible
      * values include: 'CanNotDelete', 'ReadOnly', 'None'
      *
      * @param {string} [parameters.displayName] The appliance definition display
      * name.
      *
      * @param {array} parameters.authorizations The appliance provider
      * authorizations.
      *
      * @param {array} [parameters.artifacts] The collection of appliance artifacts.
      * The portal will use the files specified as artifacts to construct the user
      * experience of creating an appliance from an appliance definition.
      *
      * @param {string} [parameters.description] The appliance definition
      * description.
      *
      * @param {string} parameters.packageFileUri The appliance definition package
      * file Uri.
      *
      * @param {string} [parameters.managedBy] ID of the resource that manages this
      * resource.
      *
      * @param {object} [parameters.sku] The SKU of the resource.
      *
      * @param {string} parameters.sku.name The SKU name.
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
      * values include: 'SystemAssigned'
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
      *                      @resolve {ApplianceDefinition} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {ApplianceDefinition} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link ApplianceDefinition} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def createOrUpdateById(applianceDefinitionId: String, parameters: ApplianceDefinition): js.Promise[ApplianceDefinition] = js.native
    def createOrUpdateById(
      applianceDefinitionId: String,
      parameters: ApplianceDefinition,
      callback: ServiceCallback[ApplianceDefinition]
    ): Unit = js.native
    def createOrUpdateById(applianceDefinitionId: String, parameters: ApplianceDefinition, options: CustomHeaders): js.Promise[ApplianceDefinition] = js.native
    def createOrUpdateById(
      applianceDefinitionId: String,
      parameters: ApplianceDefinition,
      options: CustomHeaders,
      callback: ServiceCallback[ApplianceDefinition]
    ): Unit = js.native
    /**
      * Creates a new appliance definition.
      *
      * @param {string} applianceDefinitionId The fully qualified ID of the
      * appliance definition, including the appliance name and the appliance
      * definition resource type. Use the format,
      * /subscriptions/{guid}/resourceGroups/{resource-group-name}/Microsoft.Solutions/applianceDefinitions/{applianceDefinition-name}
      *
      * @param {object} parameters Parameters supplied to the create or update an
      * appliance definition.
      *
      * @param {string} parameters.lockLevel The appliance lock level. Possible
      * values include: 'CanNotDelete', 'ReadOnly', 'None'
      *
      * @param {string} [parameters.displayName] The appliance definition display
      * name.
      *
      * @param {array} parameters.authorizations The appliance provider
      * authorizations.
      *
      * @param {array} [parameters.artifacts] The collection of appliance artifacts.
      * The portal will use the files specified as artifacts to construct the user
      * experience of creating an appliance from an appliance definition.
      *
      * @param {string} [parameters.description] The appliance definition
      * description.
      *
      * @param {string} parameters.packageFileUri The appliance definition package
      * file Uri.
      *
      * @param {string} [parameters.managedBy] ID of the resource that manages this
      * resource.
      *
      * @param {object} [parameters.sku] The SKU of the resource.
      *
      * @param {string} parameters.sku.name The SKU name.
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
      * values include: 'SystemAssigned'
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<ApplianceDefinition>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def createOrUpdateByIdWithHttpOperationResponse(applianceDefinitionId: String, parameters: ApplianceDefinition): js.Promise[HttpOperationResponse[ApplianceDefinition]] = js.native
    def createOrUpdateByIdWithHttpOperationResponse(applianceDefinitionId: String, parameters: ApplianceDefinition, options: CustomHeaders): js.Promise[HttpOperationResponse[ApplianceDefinition]] = js.native
    /**
      * Creates a new appliance definition.
      *
      * @param {string} resourceGroupName The name of the resource group. The name
      * is case insensitive.
      *
      * @param {string} applianceDefinitionName The name of the appliance
      * definition.
      *
      * @param {object} parameters Parameters supplied to the create or update an
      * appliance definition.
      *
      * @param {string} parameters.lockLevel The appliance lock level. Possible
      * values include: 'CanNotDelete', 'ReadOnly', 'None'
      *
      * @param {string} [parameters.displayName] The appliance definition display
      * name.
      *
      * @param {array} parameters.authorizations The appliance provider
      * authorizations.
      *
      * @param {array} [parameters.artifacts] The collection of appliance artifacts.
      * The portal will use the files specified as artifacts to construct the user
      * experience of creating an appliance from an appliance definition.
      *
      * @param {string} [parameters.description] The appliance definition
      * description.
      *
      * @param {string} parameters.packageFileUri The appliance definition package
      * file Uri.
      *
      * @param {string} [parameters.managedBy] ID of the resource that manages this
      * resource.
      *
      * @param {object} [parameters.sku] The SKU of the resource.
      *
      * @param {string} parameters.sku.name The SKU name.
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
      * values include: 'SystemAssigned'
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<ApplianceDefinition>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def createOrUpdateWithHttpOperationResponse(resourceGroupName: String, applianceDefinitionName: String, parameters: ApplianceDefinition): js.Promise[HttpOperationResponse[ApplianceDefinition]] = js.native
    def createOrUpdateWithHttpOperationResponse(
      resourceGroupName: String,
      applianceDefinitionName: String,
      parameters: ApplianceDefinition,
      options: CustomHeaders
    ): js.Promise[HttpOperationResponse[ApplianceDefinition]] = js.native
    /**
      * Deletes the appliance definition.
      *
      * @param {string} applianceDefinitionId The fully qualified ID of the
      * appliance definition, including the appliance name and the appliance
      * definition resource type. Use the format,
      * /subscriptions/{guid}/resourceGroups/{resource-group-name}/Microsoft.Solutions/applianceDefinitions/{applianceDefinition-name}
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
    def deleteById(applianceDefinitionId: String): js.Promise[Unit] = js.native
    def deleteById(applianceDefinitionId: String, callback: ServiceCallback[Unit]): Unit = js.native
    def deleteById(applianceDefinitionId: String, options: CustomHeaders): js.Promise[Unit] = js.native
    def deleteById(applianceDefinitionId: String, options: CustomHeaders, callback: ServiceCallback[Unit]): Unit = js.native
    /**
      * Deletes the appliance definition.
      *
      * @param {string} applianceDefinitionId The fully qualified ID of the
      * appliance definition, including the appliance name and the appliance
      * definition resource type. Use the format,
      * /subscriptions/{guid}/resourceGroups/{resource-group-name}/Microsoft.Solutions/applianceDefinitions/{applianceDefinition-name}
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
    def deleteByIdWithHttpOperationResponse(applianceDefinitionId: String): js.Promise[HttpOperationResponse[Unit]] = js.native
    def deleteByIdWithHttpOperationResponse(applianceDefinitionId: String, options: CustomHeaders): js.Promise[HttpOperationResponse[Unit]] = js.native
    /**
      * Deletes the appliance definition.
      *
      * @param {string} resourceGroupName The name of the resource group. The name
      * is case insensitive.
      *
      * @param {string} applianceDefinitionName The name of the appliance definition
      * to delete.
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
    def deleteMethod(resourceGroupName: String, applianceDefinitionName: String): js.Promise[Unit] = js.native
    def deleteMethod(resourceGroupName: String, applianceDefinitionName: String, callback: ServiceCallback[Unit]): Unit = js.native
    def deleteMethod(resourceGroupName: String, applianceDefinitionName: String, options: CustomHeaders): js.Promise[Unit] = js.native
    def deleteMethod(
      resourceGroupName: String,
      applianceDefinitionName: String,
      options: CustomHeaders,
      callback: ServiceCallback[Unit]
    ): Unit = js.native
    /**
      * Deletes the appliance definition.
      *
      * @param {string} resourceGroupName The name of the resource group. The name
      * is case insensitive.
      *
      * @param {string} applianceDefinitionName The name of the appliance definition
      * to delete.
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
    def deleteMethodWithHttpOperationResponse(resourceGroupName: String, applianceDefinitionName: String): js.Promise[HttpOperationResponse[Unit]] = js.native
    def deleteMethodWithHttpOperationResponse(resourceGroupName: String, applianceDefinitionName: String, options: CustomHeaders): js.Promise[HttpOperationResponse[Unit]] = js.native
    /**
      * Gets the appliance definition.
      *
      * @param {string} resourceGroupName The name of the resource group. The name
      * is case insensitive.
      *
      * @param {string} applianceDefinitionName The name of the appliance
      * definition.
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
      *                      @resolve {ApplianceDefinition} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {ApplianceDefinition} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link ApplianceDefinition} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def get(resourceGroupName: String, applianceDefinitionName: String): js.Promise[ApplianceDefinition] = js.native
    def get(
      resourceGroupName: String,
      applianceDefinitionName: String,
      callback: ServiceCallback[ApplianceDefinition]
    ): Unit = js.native
    def get(resourceGroupName: String, applianceDefinitionName: String, options: CustomHeaders): js.Promise[ApplianceDefinition] = js.native
    def get(
      resourceGroupName: String,
      applianceDefinitionName: String,
      options: CustomHeaders,
      callback: ServiceCallback[ApplianceDefinition]
    ): Unit = js.native
    /**
      * Gets the appliance definition.
      *
      * @param {string} applianceDefinitionId The fully qualified ID of the
      * appliance definition, including the appliance name and the appliance
      * definition resource type. Use the format,
      * /subscriptions/{guid}/resourceGroups/{resource-group-name}/Microsoft.Solutions/applianceDefinitions/{applianceDefinition-name}
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
      *                      @resolve {ApplianceDefinition} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {ApplianceDefinition} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link ApplianceDefinition} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def getById(applianceDefinitionId: String): js.Promise[ApplianceDefinition] = js.native
    def getById(applianceDefinitionId: String, callback: ServiceCallback[ApplianceDefinition]): Unit = js.native
    def getById(applianceDefinitionId: String, options: CustomHeaders): js.Promise[ApplianceDefinition] = js.native
    def getById(
      applianceDefinitionId: String,
      options: CustomHeaders,
      callback: ServiceCallback[ApplianceDefinition]
    ): Unit = js.native
    /**
      * Gets the appliance definition.
      *
      * @param {string} applianceDefinitionId The fully qualified ID of the
      * appliance definition, including the appliance name and the appliance
      * definition resource type. Use the format,
      * /subscriptions/{guid}/resourceGroups/{resource-group-name}/Microsoft.Solutions/applianceDefinitions/{applianceDefinition-name}
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<ApplianceDefinition>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def getByIdWithHttpOperationResponse(applianceDefinitionId: String): js.Promise[HttpOperationResponse[ApplianceDefinition]] = js.native
    def getByIdWithHttpOperationResponse(applianceDefinitionId: String, options: CustomHeaders): js.Promise[HttpOperationResponse[ApplianceDefinition]] = js.native
    /**
      * Gets the appliance definition.
      *
      * @param {string} resourceGroupName The name of the resource group. The name
      * is case insensitive.
      *
      * @param {string} applianceDefinitionName The name of the appliance
      * definition.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<ApplianceDefinition>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def getWithHttpOperationResponse(resourceGroupName: String, applianceDefinitionName: String): js.Promise[HttpOperationResponse[ApplianceDefinition]] = js.native
    def getWithHttpOperationResponse(resourceGroupName: String, applianceDefinitionName: String, options: CustomHeaders): js.Promise[HttpOperationResponse[ApplianceDefinition]] = js.native
    /**
      * Lists the appliance definitions in a resource group.
      *
      * @param {string} resourceGroupName The name of the resource group. The name
      * is case insensitive.
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
      *                      @resolve {ApplianceDefinitionListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {ApplianceDefinitionListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link ApplianceDefinitionListResult} for more
      *                      information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def listByResourceGroup(resourceGroupName: String): js.Promise[ApplianceDefinitionListResult] = js.native
    def listByResourceGroup(resourceGroupName: String, callback: ServiceCallback[ApplianceDefinitionListResult]): Unit = js.native
    def listByResourceGroup(resourceGroupName: String, options: CustomHeaders): js.Promise[ApplianceDefinitionListResult] = js.native
    def listByResourceGroup(
      resourceGroupName: String,
      options: CustomHeaders,
      callback: ServiceCallback[ApplianceDefinitionListResult]
    ): Unit = js.native
    /**
      * Lists the appliance definitions in a resource group.
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
      *                      @resolve {ApplianceDefinitionListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {ApplianceDefinitionListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link ApplianceDefinitionListResult} for more
      *                      information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def listByResourceGroupNext(nextPageLink: String): js.Promise[ApplianceDefinitionListResult] = js.native
    def listByResourceGroupNext(nextPageLink: String, callback: ServiceCallback[ApplianceDefinitionListResult]): Unit = js.native
    def listByResourceGroupNext(nextPageLink: String, options: CustomHeaders): js.Promise[ApplianceDefinitionListResult] = js.native
    def listByResourceGroupNext(
      nextPageLink: String,
      options: CustomHeaders,
      callback: ServiceCallback[ApplianceDefinitionListResult]
    ): Unit = js.native
    /**
      * Lists the appliance definitions in a resource group.
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
      * @resolve {HttpOperationResponse<ApplianceDefinitionListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listByResourceGroupNextWithHttpOperationResponse(nextPageLink: String): js.Promise[HttpOperationResponse[ApplianceDefinitionListResult]] = js.native
    def listByResourceGroupNextWithHttpOperationResponse(nextPageLink: String, options: CustomHeaders): js.Promise[HttpOperationResponse[ApplianceDefinitionListResult]] = js.native
    /**
      * Lists the appliance definitions in a resource group.
      *
      * @param {string} resourceGroupName The name of the resource group. The name
      * is case insensitive.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<ApplianceDefinitionListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listByResourceGroupWithHttpOperationResponse(resourceGroupName: String): js.Promise[HttpOperationResponse[ApplianceDefinitionListResult]] = js.native
    def listByResourceGroupWithHttpOperationResponse(resourceGroupName: String, options: CustomHeaders): js.Promise[HttpOperationResponse[ApplianceDefinitionListResult]] = js.native
  }
  
  @js.native
  trait Appliances extends js.Object {
    /**
      * Creates a new appliance.
      *
      * @param {string} resourceGroupName The name of the resource group. The name
      * is case insensitive.
      *
      * @param {string} applianceName The name of the appliance.
      *
      * @param {object} parameters Parameters supplied to the create or update an
      * appliance.
      *
      * @param {string} parameters.managedResourceGroupId The managed resource group
      * Id.
      *
      * @param {string} [parameters.applianceDefinitionId] The fully qualified path
      * of appliance definition Id.
      *
      * @param {object} [parameters.parameters] Name and value pairs that define the
      * appliance parameters. It can be a JObject or a well formed JSON string.
      *
      * @param {string} [parameters.uiDefinitionUri] The blob URI where the UI
      * definition file is located.
      *
      * @param {object} [parameters.plan] The plan information.
      *
      * @param {string} parameters.plan.name The plan name.
      *
      * @param {string} parameters.plan.publisher The publisher ID.
      *
      * @param {string} parameters.plan.product The product code.
      *
      * @param {string} [parameters.plan.promotionCode] The promotion code.
      *
      * @param {string} parameters.plan.version The plan's version.
      *
      * @param {string} [parameters.kind] The kind of the appliance. Allowed values
      * are MarketPlace and ServiceCatalog.
      *
      * @param {string} [parameters.managedBy] ID of the resource that manages this
      * resource.
      *
      * @param {object} [parameters.sku] The SKU of the resource.
      *
      * @param {string} parameters.sku.name The SKU name.
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
      * values include: 'SystemAssigned'
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
      *                      @resolve {Appliance} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {Appliance} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link Appliance} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def beginCreateOrUpdate(resourceGroupName: String, applianceName: String, parameters: Appliance): js.Promise[Appliance] = js.native
    def beginCreateOrUpdate(
      resourceGroupName: String,
      applianceName: String,
      parameters: Appliance,
      callback: ServiceCallback[Appliance]
    ): Unit = js.native
    def beginCreateOrUpdate(resourceGroupName: String, applianceName: String, parameters: Appliance, options: CustomHeaders): js.Promise[Appliance] = js.native
    def beginCreateOrUpdate(
      resourceGroupName: String,
      applianceName: String,
      parameters: Appliance,
      options: CustomHeaders,
      callback: ServiceCallback[Appliance]
    ): Unit = js.native
    /**
      * Creates a new appliance.
      *
      * @param {string} applianceId The fully qualified ID of the appliance,
      * including the appliance name and the appliance resource type. Use the
      * format,
      * /subscriptions/{guid}/resourceGroups/{resource-group-name}/Microsoft.Solutions/appliances/{appliance-name}
      *
      * @param {object} parameters Parameters supplied to the create or update an
      * appliance.
      *
      * @param {string} parameters.managedResourceGroupId The managed resource group
      * Id.
      *
      * @param {string} [parameters.applianceDefinitionId] The fully qualified path
      * of appliance definition Id.
      *
      * @param {object} [parameters.parameters] Name and value pairs that define the
      * appliance parameters. It can be a JObject or a well formed JSON string.
      *
      * @param {string} [parameters.uiDefinitionUri] The blob URI where the UI
      * definition file is located.
      *
      * @param {object} [parameters.plan] The plan information.
      *
      * @param {string} parameters.plan.name The plan name.
      *
      * @param {string} parameters.plan.publisher The publisher ID.
      *
      * @param {string} parameters.plan.product The product code.
      *
      * @param {string} [parameters.plan.promotionCode] The promotion code.
      *
      * @param {string} parameters.plan.version The plan's version.
      *
      * @param {string} [parameters.kind] The kind of the appliance. Allowed values
      * are MarketPlace and ServiceCatalog.
      *
      * @param {string} [parameters.managedBy] ID of the resource that manages this
      * resource.
      *
      * @param {object} [parameters.sku] The SKU of the resource.
      *
      * @param {string} parameters.sku.name The SKU name.
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
      * values include: 'SystemAssigned'
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
      *                      @resolve {Appliance} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {Appliance} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link Appliance} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def beginCreateOrUpdateById(applianceId: String, parameters: Appliance): js.Promise[Appliance] = js.native
    def beginCreateOrUpdateById(applianceId: String, parameters: Appliance, callback: ServiceCallback[Appliance]): Unit = js.native
    def beginCreateOrUpdateById(applianceId: String, parameters: Appliance, options: CustomHeaders): js.Promise[Appliance] = js.native
    def beginCreateOrUpdateById(
      applianceId: String,
      parameters: Appliance,
      options: CustomHeaders,
      callback: ServiceCallback[Appliance]
    ): Unit = js.native
    /**
      * Creates a new appliance.
      *
      * @param {string} applianceId The fully qualified ID of the appliance,
      * including the appliance name and the appliance resource type. Use the
      * format,
      * /subscriptions/{guid}/resourceGroups/{resource-group-name}/Microsoft.Solutions/appliances/{appliance-name}
      *
      * @param {object} parameters Parameters supplied to the create or update an
      * appliance.
      *
      * @param {string} parameters.managedResourceGroupId The managed resource group
      * Id.
      *
      * @param {string} [parameters.applianceDefinitionId] The fully qualified path
      * of appliance definition Id.
      *
      * @param {object} [parameters.parameters] Name and value pairs that define the
      * appliance parameters. It can be a JObject or a well formed JSON string.
      *
      * @param {string} [parameters.uiDefinitionUri] The blob URI where the UI
      * definition file is located.
      *
      * @param {object} [parameters.plan] The plan information.
      *
      * @param {string} parameters.plan.name The plan name.
      *
      * @param {string} parameters.plan.publisher The publisher ID.
      *
      * @param {string} parameters.plan.product The product code.
      *
      * @param {string} [parameters.plan.promotionCode] The promotion code.
      *
      * @param {string} parameters.plan.version The plan's version.
      *
      * @param {string} [parameters.kind] The kind of the appliance. Allowed values
      * are MarketPlace and ServiceCatalog.
      *
      * @param {string} [parameters.managedBy] ID of the resource that manages this
      * resource.
      *
      * @param {object} [parameters.sku] The SKU of the resource.
      *
      * @param {string} parameters.sku.name The SKU name.
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
      * values include: 'SystemAssigned'
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<Appliance>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def beginCreateOrUpdateByIdWithHttpOperationResponse(applianceId: String, parameters: Appliance): js.Promise[HttpOperationResponse[Appliance]] = js.native
    def beginCreateOrUpdateByIdWithHttpOperationResponse(applianceId: String, parameters: Appliance, options: CustomHeaders): js.Promise[HttpOperationResponse[Appliance]] = js.native
    /**
      * Creates a new appliance.
      *
      * @param {string} resourceGroupName The name of the resource group. The name
      * is case insensitive.
      *
      * @param {string} applianceName The name of the appliance.
      *
      * @param {object} parameters Parameters supplied to the create or update an
      * appliance.
      *
      * @param {string} parameters.managedResourceGroupId The managed resource group
      * Id.
      *
      * @param {string} [parameters.applianceDefinitionId] The fully qualified path
      * of appliance definition Id.
      *
      * @param {object} [parameters.parameters] Name and value pairs that define the
      * appliance parameters. It can be a JObject or a well formed JSON string.
      *
      * @param {string} [parameters.uiDefinitionUri] The blob URI where the UI
      * definition file is located.
      *
      * @param {object} [parameters.plan] The plan information.
      *
      * @param {string} parameters.plan.name The plan name.
      *
      * @param {string} parameters.plan.publisher The publisher ID.
      *
      * @param {string} parameters.plan.product The product code.
      *
      * @param {string} [parameters.plan.promotionCode] The promotion code.
      *
      * @param {string} parameters.plan.version The plan's version.
      *
      * @param {string} [parameters.kind] The kind of the appliance. Allowed values
      * are MarketPlace and ServiceCatalog.
      *
      * @param {string} [parameters.managedBy] ID of the resource that manages this
      * resource.
      *
      * @param {object} [parameters.sku] The SKU of the resource.
      *
      * @param {string} parameters.sku.name The SKU name.
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
      * values include: 'SystemAssigned'
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<Appliance>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def beginCreateOrUpdateWithHttpOperationResponse(resourceGroupName: String, applianceName: String, parameters: Appliance): js.Promise[HttpOperationResponse[Appliance]] = js.native
    def beginCreateOrUpdateWithHttpOperationResponse(resourceGroupName: String, applianceName: String, parameters: Appliance, options: CustomHeaders): js.Promise[HttpOperationResponse[Appliance]] = js.native
    /**
      * Deletes the appliance.
      *
      * @param {string} applianceId The fully qualified ID of the appliance,
      * including the appliance name and the appliance resource type. Use the
      * format,
      * /subscriptions/{guid}/resourceGroups/{resource-group-name}/Microsoft.Solutions/appliances/{appliance-name}
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
    def beginDeleteById(applianceId: String): js.Promise[Unit] = js.native
    def beginDeleteById(applianceId: String, callback: ServiceCallback[Unit]): Unit = js.native
    def beginDeleteById(applianceId: String, options: CustomHeaders): js.Promise[Unit] = js.native
    def beginDeleteById(applianceId: String, options: CustomHeaders, callback: ServiceCallback[Unit]): Unit = js.native
    /**
      * Deletes the appliance.
      *
      * @param {string} applianceId The fully qualified ID of the appliance,
      * including the appliance name and the appliance resource type. Use the
      * format,
      * /subscriptions/{guid}/resourceGroups/{resource-group-name}/Microsoft.Solutions/appliances/{appliance-name}
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
    def beginDeleteByIdWithHttpOperationResponse(applianceId: String): js.Promise[HttpOperationResponse[Unit]] = js.native
    def beginDeleteByIdWithHttpOperationResponse(applianceId: String, options: CustomHeaders): js.Promise[HttpOperationResponse[Unit]] = js.native
    /**
      * Deletes the appliance.
      *
      * @param {string} resourceGroupName The name of the resource group. The name
      * is case insensitive.
      *
      * @param {string} applianceName The name of the appliance.
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
    def beginDeleteMethod(resourceGroupName: String, applianceName: String): js.Promise[Unit] = js.native
    def beginDeleteMethod(resourceGroupName: String, applianceName: String, callback: ServiceCallback[Unit]): Unit = js.native
    def beginDeleteMethod(resourceGroupName: String, applianceName: String, options: CustomHeaders): js.Promise[Unit] = js.native
    def beginDeleteMethod(
      resourceGroupName: String,
      applianceName: String,
      options: CustomHeaders,
      callback: ServiceCallback[Unit]
    ): Unit = js.native
    /**
      * Deletes the appliance.
      *
      * @param {string} resourceGroupName The name of the resource group. The name
      * is case insensitive.
      *
      * @param {string} applianceName The name of the appliance.
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
    def beginDeleteMethodWithHttpOperationResponse(resourceGroupName: String, applianceName: String): js.Promise[HttpOperationResponse[Unit]] = js.native
    def beginDeleteMethodWithHttpOperationResponse(resourceGroupName: String, applianceName: String, options: CustomHeaders): js.Promise[HttpOperationResponse[Unit]] = js.native
    /**
      * Creates a new appliance.
      *
      * @param {string} resourceGroupName The name of the resource group. The name
      * is case insensitive.
      *
      * @param {string} applianceName The name of the appliance.
      *
      * @param {object} parameters Parameters supplied to the create or update an
      * appliance.
      *
      * @param {string} parameters.managedResourceGroupId The managed resource group
      * Id.
      *
      * @param {string} [parameters.applianceDefinitionId] The fully qualified path
      * of appliance definition Id.
      *
      * @param {object} [parameters.parameters] Name and value pairs that define the
      * appliance parameters. It can be a JObject or a well formed JSON string.
      *
      * @param {string} [parameters.uiDefinitionUri] The blob URI where the UI
      * definition file is located.
      *
      * @param {object} [parameters.plan] The plan information.
      *
      * @param {string} parameters.plan.name The plan name.
      *
      * @param {string} parameters.plan.publisher The publisher ID.
      *
      * @param {string} parameters.plan.product The product code.
      *
      * @param {string} [parameters.plan.promotionCode] The promotion code.
      *
      * @param {string} parameters.plan.version The plan's version.
      *
      * @param {string} [parameters.kind] The kind of the appliance. Allowed values
      * are MarketPlace and ServiceCatalog.
      *
      * @param {string} [parameters.managedBy] ID of the resource that manages this
      * resource.
      *
      * @param {object} [parameters.sku] The SKU of the resource.
      *
      * @param {string} parameters.sku.name The SKU name.
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
      * values include: 'SystemAssigned'
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
      *                      @resolve {Appliance} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {Appliance} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link Appliance} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def createOrUpdate(resourceGroupName: String, applianceName: String, parameters: Appliance): js.Promise[Appliance] = js.native
    def createOrUpdate(
      resourceGroupName: String,
      applianceName: String,
      parameters: Appliance,
      callback: ServiceCallback[Appliance]
    ): Unit = js.native
    def createOrUpdate(resourceGroupName: String, applianceName: String, parameters: Appliance, options: CustomHeaders): js.Promise[Appliance] = js.native
    def createOrUpdate(
      resourceGroupName: String,
      applianceName: String,
      parameters: Appliance,
      options: CustomHeaders,
      callback: ServiceCallback[Appliance]
    ): Unit = js.native
    /**
      * Creates a new appliance.
      *
      * @param {string} applianceId The fully qualified ID of the appliance,
      * including the appliance name and the appliance resource type. Use the
      * format,
      * /subscriptions/{guid}/resourceGroups/{resource-group-name}/Microsoft.Solutions/appliances/{appliance-name}
      *
      * @param {object} parameters Parameters supplied to the create or update an
      * appliance.
      *
      * @param {string} parameters.managedResourceGroupId The managed resource group
      * Id.
      *
      * @param {string} [parameters.applianceDefinitionId] The fully qualified path
      * of appliance definition Id.
      *
      * @param {object} [parameters.parameters] Name and value pairs that define the
      * appliance parameters. It can be a JObject or a well formed JSON string.
      *
      * @param {string} [parameters.uiDefinitionUri] The blob URI where the UI
      * definition file is located.
      *
      * @param {object} [parameters.plan] The plan information.
      *
      * @param {string} parameters.plan.name The plan name.
      *
      * @param {string} parameters.plan.publisher The publisher ID.
      *
      * @param {string} parameters.plan.product The product code.
      *
      * @param {string} [parameters.plan.promotionCode] The promotion code.
      *
      * @param {string} parameters.plan.version The plan's version.
      *
      * @param {string} [parameters.kind] The kind of the appliance. Allowed values
      * are MarketPlace and ServiceCatalog.
      *
      * @param {string} [parameters.managedBy] ID of the resource that manages this
      * resource.
      *
      * @param {object} [parameters.sku] The SKU of the resource.
      *
      * @param {string} parameters.sku.name The SKU name.
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
      * values include: 'SystemAssigned'
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
      *                      @resolve {Appliance} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {Appliance} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link Appliance} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def createOrUpdateById(applianceId: String, parameters: Appliance): js.Promise[Appliance] = js.native
    def createOrUpdateById(applianceId: String, parameters: Appliance, callback: ServiceCallback[Appliance]): Unit = js.native
    def createOrUpdateById(applianceId: String, parameters: Appliance, options: CustomHeaders): js.Promise[Appliance] = js.native
    def createOrUpdateById(
      applianceId: String,
      parameters: Appliance,
      options: CustomHeaders,
      callback: ServiceCallback[Appliance]
    ): Unit = js.native
    /**
      * Creates a new appliance.
      *
      * @param {string} applianceId The fully qualified ID of the appliance,
      * including the appliance name and the appliance resource type. Use the
      * format,
      * /subscriptions/{guid}/resourceGroups/{resource-group-name}/Microsoft.Solutions/appliances/{appliance-name}
      *
      * @param {object} parameters Parameters supplied to the create or update an
      * appliance.
      *
      * @param {string} parameters.managedResourceGroupId The managed resource group
      * Id.
      *
      * @param {string} [parameters.applianceDefinitionId] The fully qualified path
      * of appliance definition Id.
      *
      * @param {object} [parameters.parameters] Name and value pairs that define the
      * appliance parameters. It can be a JObject or a well formed JSON string.
      *
      * @param {string} [parameters.uiDefinitionUri] The blob URI where the UI
      * definition file is located.
      *
      * @param {object} [parameters.plan] The plan information.
      *
      * @param {string} parameters.plan.name The plan name.
      *
      * @param {string} parameters.plan.publisher The publisher ID.
      *
      * @param {string} parameters.plan.product The product code.
      *
      * @param {string} [parameters.plan.promotionCode] The promotion code.
      *
      * @param {string} parameters.plan.version The plan's version.
      *
      * @param {string} [parameters.kind] The kind of the appliance. Allowed values
      * are MarketPlace and ServiceCatalog.
      *
      * @param {string} [parameters.managedBy] ID of the resource that manages this
      * resource.
      *
      * @param {object} [parameters.sku] The SKU of the resource.
      *
      * @param {string} parameters.sku.name The SKU name.
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
      * values include: 'SystemAssigned'
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<Appliance>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def createOrUpdateByIdWithHttpOperationResponse(applianceId: String, parameters: Appliance): js.Promise[HttpOperationResponse[Appliance]] = js.native
    def createOrUpdateByIdWithHttpOperationResponse(applianceId: String, parameters: Appliance, options: CustomHeaders): js.Promise[HttpOperationResponse[Appliance]] = js.native
    /**
      * Creates a new appliance.
      *
      * @param {string} resourceGroupName The name of the resource group. The name
      * is case insensitive.
      *
      * @param {string} applianceName The name of the appliance.
      *
      * @param {object} parameters Parameters supplied to the create or update an
      * appliance.
      *
      * @param {string} parameters.managedResourceGroupId The managed resource group
      * Id.
      *
      * @param {string} [parameters.applianceDefinitionId] The fully qualified path
      * of appliance definition Id.
      *
      * @param {object} [parameters.parameters] Name and value pairs that define the
      * appliance parameters. It can be a JObject or a well formed JSON string.
      *
      * @param {string} [parameters.uiDefinitionUri] The blob URI where the UI
      * definition file is located.
      *
      * @param {object} [parameters.plan] The plan information.
      *
      * @param {string} parameters.plan.name The plan name.
      *
      * @param {string} parameters.plan.publisher The publisher ID.
      *
      * @param {string} parameters.plan.product The product code.
      *
      * @param {string} [parameters.plan.promotionCode] The promotion code.
      *
      * @param {string} parameters.plan.version The plan's version.
      *
      * @param {string} [parameters.kind] The kind of the appliance. Allowed values
      * are MarketPlace and ServiceCatalog.
      *
      * @param {string} [parameters.managedBy] ID of the resource that manages this
      * resource.
      *
      * @param {object} [parameters.sku] The SKU of the resource.
      *
      * @param {string} parameters.sku.name The SKU name.
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
      * values include: 'SystemAssigned'
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<Appliance>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def createOrUpdateWithHttpOperationResponse(resourceGroupName: String, applianceName: String, parameters: Appliance): js.Promise[HttpOperationResponse[Appliance]] = js.native
    def createOrUpdateWithHttpOperationResponse(resourceGroupName: String, applianceName: String, parameters: Appliance, options: CustomHeaders): js.Promise[HttpOperationResponse[Appliance]] = js.native
    /**
      * Deletes the appliance.
      *
      * @param {string} applianceId The fully qualified ID of the appliance,
      * including the appliance name and the appliance resource type. Use the
      * format,
      * /subscriptions/{guid}/resourceGroups/{resource-group-name}/Microsoft.Solutions/appliances/{appliance-name}
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
    def deleteById(applianceId: String): js.Promise[Unit] = js.native
    def deleteById(applianceId: String, callback: ServiceCallback[Unit]): Unit = js.native
    def deleteById(applianceId: String, options: CustomHeaders): js.Promise[Unit] = js.native
    def deleteById(applianceId: String, options: CustomHeaders, callback: ServiceCallback[Unit]): Unit = js.native
    /**
      * Deletes the appliance.
      *
      * @param {string} applianceId The fully qualified ID of the appliance,
      * including the appliance name and the appliance resource type. Use the
      * format,
      * /subscriptions/{guid}/resourceGroups/{resource-group-name}/Microsoft.Solutions/appliances/{appliance-name}
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
    def deleteByIdWithHttpOperationResponse(applianceId: String): js.Promise[HttpOperationResponse[Unit]] = js.native
    def deleteByIdWithHttpOperationResponse(applianceId: String, options: CustomHeaders): js.Promise[HttpOperationResponse[Unit]] = js.native
    /**
      * Deletes the appliance.
      *
      * @param {string} resourceGroupName The name of the resource group. The name
      * is case insensitive.
      *
      * @param {string} applianceName The name of the appliance.
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
    def deleteMethod(resourceGroupName: String, applianceName: String): js.Promise[Unit] = js.native
    def deleteMethod(resourceGroupName: String, applianceName: String, callback: ServiceCallback[Unit]): Unit = js.native
    def deleteMethod(resourceGroupName: String, applianceName: String, options: CustomHeaders): js.Promise[Unit] = js.native
    def deleteMethod(
      resourceGroupName: String,
      applianceName: String,
      options: CustomHeaders,
      callback: ServiceCallback[Unit]
    ): Unit = js.native
    /**
      * Deletes the appliance.
      *
      * @param {string} resourceGroupName The name of the resource group. The name
      * is case insensitive.
      *
      * @param {string} applianceName The name of the appliance.
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
    def deleteMethodWithHttpOperationResponse(resourceGroupName: String, applianceName: String): js.Promise[HttpOperationResponse[Unit]] = js.native
    def deleteMethodWithHttpOperationResponse(resourceGroupName: String, applianceName: String, options: CustomHeaders): js.Promise[HttpOperationResponse[Unit]] = js.native
    /**
      * Gets the appliance.
      *
      * @param {string} resourceGroupName The name of the resource group. The name
      * is case insensitive.
      *
      * @param {string} applianceName The name of the appliance.
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
      *                      @resolve {Appliance} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {Appliance} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link Appliance} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def get(resourceGroupName: String, applianceName: String): js.Promise[Appliance] = js.native
    def get(resourceGroupName: String, applianceName: String, callback: ServiceCallback[Appliance]): Unit = js.native
    def get(resourceGroupName: String, applianceName: String, options: CustomHeaders): js.Promise[Appliance] = js.native
    def get(
      resourceGroupName: String,
      applianceName: String,
      options: CustomHeaders,
      callback: ServiceCallback[Appliance]
    ): Unit = js.native
    /**
      * Gets the appliance.
      *
      * @param {string} applianceId The fully qualified ID of the appliance,
      * including the appliance name and the appliance resource type. Use the
      * format,
      * /subscriptions/{guid}/resourceGroups/{resource-group-name}/Microsoft.Solutions/appliances/{appliance-name}
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
      *                      @resolve {Appliance} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {Appliance} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link Appliance} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def getById(applianceId: String): js.Promise[Appliance] = js.native
    def getById(applianceId: String, callback: ServiceCallback[Appliance]): Unit = js.native
    def getById(applianceId: String, options: CustomHeaders): js.Promise[Appliance] = js.native
    def getById(applianceId: String, options: CustomHeaders, callback: ServiceCallback[Appliance]): Unit = js.native
    /**
      * Gets the appliance.
      *
      * @param {string} applianceId The fully qualified ID of the appliance,
      * including the appliance name and the appliance resource type. Use the
      * format,
      * /subscriptions/{guid}/resourceGroups/{resource-group-name}/Microsoft.Solutions/appliances/{appliance-name}
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<Appliance>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def getByIdWithHttpOperationResponse(applianceId: String): js.Promise[HttpOperationResponse[Appliance]] = js.native
    def getByIdWithHttpOperationResponse(applianceId: String, options: CustomHeaders): js.Promise[HttpOperationResponse[Appliance]] = js.native
    /**
      * Gets the appliance.
      *
      * @param {string} resourceGroupName The name of the resource group. The name
      * is case insensitive.
      *
      * @param {string} applianceName The name of the appliance.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<Appliance>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def getWithHttpOperationResponse(resourceGroupName: String, applianceName: String): js.Promise[HttpOperationResponse[Appliance]] = js.native
    def getWithHttpOperationResponse(resourceGroupName: String, applianceName: String, options: CustomHeaders): js.Promise[HttpOperationResponse[Appliance]] = js.native
    /**
      * Gets all the appliances within a resource group.
      *
      * @param {string} resourceGroupName The name of the resource group. The name
      * is case insensitive.
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
      *                      @resolve {ApplianceListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {ApplianceListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link ApplianceListResult} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def listByResourceGroup(resourceGroupName: String): js.Promise[ApplianceListResult] = js.native
    def listByResourceGroup(resourceGroupName: String, callback: ServiceCallback[ApplianceListResult]): Unit = js.native
    def listByResourceGroup(resourceGroupName: String, options: CustomHeaders): js.Promise[ApplianceListResult] = js.native
    def listByResourceGroup(resourceGroupName: String, options: CustomHeaders, callback: ServiceCallback[ApplianceListResult]): Unit = js.native
    /**
      * Gets all the appliances within a resource group.
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
      *                      @resolve {ApplianceListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {ApplianceListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link ApplianceListResult} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def listByResourceGroupNext(nextPageLink: String): js.Promise[ApplianceListResult] = js.native
    def listByResourceGroupNext(nextPageLink: String, callback: ServiceCallback[ApplianceListResult]): Unit = js.native
    def listByResourceGroupNext(nextPageLink: String, options: CustomHeaders): js.Promise[ApplianceListResult] = js.native
    def listByResourceGroupNext(nextPageLink: String, options: CustomHeaders, callback: ServiceCallback[ApplianceListResult]): Unit = js.native
    /**
      * Gets all the appliances within a resource group.
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
      * @resolve {HttpOperationResponse<ApplianceListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listByResourceGroupNextWithHttpOperationResponse(nextPageLink: String): js.Promise[HttpOperationResponse[ApplianceListResult]] = js.native
    def listByResourceGroupNextWithHttpOperationResponse(nextPageLink: String, options: CustomHeaders): js.Promise[HttpOperationResponse[ApplianceListResult]] = js.native
    /**
      * Gets all the appliances within a resource group.
      *
      * @param {string} resourceGroupName The name of the resource group. The name
      * is case insensitive.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<ApplianceListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listByResourceGroupWithHttpOperationResponse(resourceGroupName: String): js.Promise[HttpOperationResponse[ApplianceListResult]] = js.native
    def listByResourceGroupWithHttpOperationResponse(resourceGroupName: String, options: CustomHeaders): js.Promise[HttpOperationResponse[ApplianceListResult]] = js.native
    /**
      * Gets all the appliances within a subscription.
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
      *                      @resolve {ApplianceListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {ApplianceListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link ApplianceListResult} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def listBySubscription(): js.Promise[ApplianceListResult] = js.native
    def listBySubscription(callback: ServiceCallback[ApplianceListResult]): Unit = js.native
    def listBySubscription(options: CustomHeaders): js.Promise[ApplianceListResult] = js.native
    def listBySubscription(options: CustomHeaders, callback: ServiceCallback[ApplianceListResult]): Unit = js.native
    /**
      * Gets all the appliances within a subscription.
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
      *                      @resolve {ApplianceListResult} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {ApplianceListResult} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link ApplianceListResult} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def listBySubscriptionNext(nextPageLink: String): js.Promise[ApplianceListResult] = js.native
    def listBySubscriptionNext(nextPageLink: String, callback: ServiceCallback[ApplianceListResult]): Unit = js.native
    def listBySubscriptionNext(nextPageLink: String, options: CustomHeaders): js.Promise[ApplianceListResult] = js.native
    def listBySubscriptionNext(nextPageLink: String, options: CustomHeaders, callback: ServiceCallback[ApplianceListResult]): Unit = js.native
    /**
      * Gets all the appliances within a subscription.
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
      * @resolve {HttpOperationResponse<ApplianceListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listBySubscriptionNextWithHttpOperationResponse(nextPageLink: String): js.Promise[HttpOperationResponse[ApplianceListResult]] = js.native
    def listBySubscriptionNextWithHttpOperationResponse(nextPageLink: String, options: CustomHeaders): js.Promise[HttpOperationResponse[ApplianceListResult]] = js.native
    /**
      * Gets all the appliances within a subscription.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<ApplianceListResult>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def listBySubscriptionWithHttpOperationResponse(): js.Promise[HttpOperationResponse[ApplianceListResult]] = js.native
    def listBySubscriptionWithHttpOperationResponse(options: CustomHeaders): js.Promise[HttpOperationResponse[ApplianceListResult]] = js.native
    /**
      * Updates an existing appliance. The only value that can be updated via PATCH
      * currently is the tags.
      *
      * @param {string} resourceGroupName The name of the resource group. The name
      * is case insensitive.
      *
      * @param {string} applianceName The name of the appliance.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.parameters] Parameters supplied to update an
      * existing appliance.
      *
      * @param {string} options.parameters.managedResourceGroupId The managed
      * resource group Id.
      *
      * @param {string} [options.parameters.applianceDefinitionId] The fully
      * qualified path of appliance definition Id.
      *
      * @param {object} [options.parameters.parameters] Name and value pairs that
      * define the appliance parameters. It can be a JObject or a well formed JSON
      * string.
      *
      * @param {string} [options.parameters.uiDefinitionUri] The blob URI where the
      * UI definition file is located.
      *
      * @param {object} [options.parameters.plan] The plan information.
      *
      * @param {string} options.parameters.plan.name The plan name.
      *
      * @param {string} options.parameters.plan.publisher The publisher ID.
      *
      * @param {string} options.parameters.plan.product The product code.
      *
      * @param {string} [options.parameters.plan.promotionCode] The promotion code.
      *
      * @param {string} options.parameters.plan.version The plan's version.
      *
      * @param {string} [options.parameters.kind] The kind of the appliance. Allowed
      * values are MarketPlace and ServiceCatalog.
      *
      * @param {string} [options.parameters.managedBy] ID of the resource that
      * manages this resource.
      *
      * @param {object} [options.parameters.sku] The SKU of the resource.
      *
      * @param {string} options.parameters.sku.name The SKU name.
      *
      * @param {string} [options.parameters.sku.tier] The SKU tier.
      *
      * @param {string} [options.parameters.sku.size] The SKU size.
      *
      * @param {string} [options.parameters.sku.family] The SKU family.
      *
      * @param {string} [options.parameters.sku.model] The SKU model.
      *
      * @param {number} [options.parameters.sku.capacity] The SKU capacity.
      *
      * @param {object} [options.parameters.identity] The identity of the resource.
      *
      * @param {string} [options.parameters.identity.type] The identity type.
      * Possible values include: 'SystemAssigned'
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
      *                      @resolve {Appliance} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {Appliance} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link Appliance} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def update(resourceGroupName: String, applianceName: String): js.Promise[Appliance] = js.native
    def update(resourceGroupName: String, applianceName: String, callback: ServiceCallback[Appliance]): Unit = js.native
    def update(resourceGroupName: String, applianceName: String, options: Parameters): js.Promise[Appliance] = js.native
    def update(
      resourceGroupName: String,
      applianceName: String,
      options: Parameters,
      callback: ServiceCallback[Appliance]
    ): Unit = js.native
    /**
      * Updates an existing appliance. The only value that can be updated via PATCH
      * currently is the tags.
      *
      * @param {string} applianceId The fully qualified ID of the appliance,
      * including the appliance name and the appliance resource type. Use the
      * format,
      * /subscriptions/{guid}/resourceGroups/{resource-group-name}/Microsoft.Solutions/appliances/{appliance-name}
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.parameters] Parameters supplied to update an
      * existing appliance.
      *
      * @param {string} options.parameters.managedResourceGroupId The managed
      * resource group Id.
      *
      * @param {string} [options.parameters.applianceDefinitionId] The fully
      * qualified path of appliance definition Id.
      *
      * @param {object} [options.parameters.parameters] Name and value pairs that
      * define the appliance parameters. It can be a JObject or a well formed JSON
      * string.
      *
      * @param {string} [options.parameters.uiDefinitionUri] The blob URI where the
      * UI definition file is located.
      *
      * @param {object} [options.parameters.plan] The plan information.
      *
      * @param {string} options.parameters.plan.name The plan name.
      *
      * @param {string} options.parameters.plan.publisher The publisher ID.
      *
      * @param {string} options.parameters.plan.product The product code.
      *
      * @param {string} [options.parameters.plan.promotionCode] The promotion code.
      *
      * @param {string} options.parameters.plan.version The plan's version.
      *
      * @param {string} [options.parameters.kind] The kind of the appliance. Allowed
      * values are MarketPlace and ServiceCatalog.
      *
      * @param {string} [options.parameters.managedBy] ID of the resource that
      * manages this resource.
      *
      * @param {object} [options.parameters.sku] The SKU of the resource.
      *
      * @param {string} options.parameters.sku.name The SKU name.
      *
      * @param {string} [options.parameters.sku.tier] The SKU tier.
      *
      * @param {string} [options.parameters.sku.size] The SKU size.
      *
      * @param {string} [options.parameters.sku.family] The SKU family.
      *
      * @param {string} [options.parameters.sku.model] The SKU model.
      *
      * @param {number} [options.parameters.sku.capacity] The SKU capacity.
      *
      * @param {object} [options.parameters.identity] The identity of the resource.
      *
      * @param {string} [options.parameters.identity.type] The identity type.
      * Possible values include: 'SystemAssigned'
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
      *                      @resolve {Appliance} - The deserialized result object.
      *
      *                      @reject {Error|ServiceError} - The error object.
      *
      * {ServiceCallback} optionalCallback(err, result, request, response)
      *
      *                      {Error|ServiceError}  err        - The Error object if an error occurred, null otherwise.
      *
      *                      {Appliance} [result]   - The deserialized result object if an error did not occur.
      *                      See {@link Appliance} for more information.
      *
      *                      {WebResource} [request]  - The HTTP Request object if an error did not occur.
      *
      *                      {http.IncomingMessage} [response] - The HTTP Response stream if an error did not occur.
      */
    def updateById(applianceId: String): js.Promise[Appliance] = js.native
    def updateById(applianceId: String, callback: ServiceCallback[Appliance]): Unit = js.native
    def updateById(applianceId: String, options: Parameters): js.Promise[Appliance] = js.native
    def updateById(applianceId: String, options: Parameters, callback: ServiceCallback[Appliance]): Unit = js.native
    /**
      * Updates an existing appliance. The only value that can be updated via PATCH
      * currently is the tags.
      *
      * @param {string} applianceId The fully qualified ID of the appliance,
      * including the appliance name and the appliance resource type. Use the
      * format,
      * /subscriptions/{guid}/resourceGroups/{resource-group-name}/Microsoft.Solutions/appliances/{appliance-name}
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.parameters] Parameters supplied to update an
      * existing appliance.
      *
      * @param {string} options.parameters.managedResourceGroupId The managed
      * resource group Id.
      *
      * @param {string} [options.parameters.applianceDefinitionId] The fully
      * qualified path of appliance definition Id.
      *
      * @param {object} [options.parameters.parameters] Name and value pairs that
      * define the appliance parameters. It can be a JObject or a well formed JSON
      * string.
      *
      * @param {string} [options.parameters.uiDefinitionUri] The blob URI where the
      * UI definition file is located.
      *
      * @param {object} [options.parameters.plan] The plan information.
      *
      * @param {string} options.parameters.plan.name The plan name.
      *
      * @param {string} options.parameters.plan.publisher The publisher ID.
      *
      * @param {string} options.parameters.plan.product The product code.
      *
      * @param {string} [options.parameters.plan.promotionCode] The promotion code.
      *
      * @param {string} options.parameters.plan.version The plan's version.
      *
      * @param {string} [options.parameters.kind] The kind of the appliance. Allowed
      * values are MarketPlace and ServiceCatalog.
      *
      * @param {string} [options.parameters.managedBy] ID of the resource that
      * manages this resource.
      *
      * @param {object} [options.parameters.sku] The SKU of the resource.
      *
      * @param {string} options.parameters.sku.name The SKU name.
      *
      * @param {string} [options.parameters.sku.tier] The SKU tier.
      *
      * @param {string} [options.parameters.sku.size] The SKU size.
      *
      * @param {string} [options.parameters.sku.family] The SKU family.
      *
      * @param {string} [options.parameters.sku.model] The SKU model.
      *
      * @param {number} [options.parameters.sku.capacity] The SKU capacity.
      *
      * @param {object} [options.parameters.identity] The identity of the resource.
      *
      * @param {string} [options.parameters.identity.type] The identity type.
      * Possible values include: 'SystemAssigned'
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<Appliance>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def updateByIdWithHttpOperationResponse(applianceId: String): js.Promise[HttpOperationResponse[Appliance]] = js.native
    def updateByIdWithHttpOperationResponse(applianceId: String, options: Parameters): js.Promise[HttpOperationResponse[Appliance]] = js.native
    /**
      * Updates an existing appliance. The only value that can be updated via PATCH
      * currently is the tags.
      *
      * @param {string} resourceGroupName The name of the resource group. The name
      * is case insensitive.
      *
      * @param {string} applianceName The name of the appliance.
      *
      * @param {object} [options] Optional Parameters.
      *
      * @param {object} [options.parameters] Parameters supplied to update an
      * existing appliance.
      *
      * @param {string} options.parameters.managedResourceGroupId The managed
      * resource group Id.
      *
      * @param {string} [options.parameters.applianceDefinitionId] The fully
      * qualified path of appliance definition Id.
      *
      * @param {object} [options.parameters.parameters] Name and value pairs that
      * define the appliance parameters. It can be a JObject or a well formed JSON
      * string.
      *
      * @param {string} [options.parameters.uiDefinitionUri] The blob URI where the
      * UI definition file is located.
      *
      * @param {object} [options.parameters.plan] The plan information.
      *
      * @param {string} options.parameters.plan.name The plan name.
      *
      * @param {string} options.parameters.plan.publisher The publisher ID.
      *
      * @param {string} options.parameters.plan.product The product code.
      *
      * @param {string} [options.parameters.plan.promotionCode] The promotion code.
      *
      * @param {string} options.parameters.plan.version The plan's version.
      *
      * @param {string} [options.parameters.kind] The kind of the appliance. Allowed
      * values are MarketPlace and ServiceCatalog.
      *
      * @param {string} [options.parameters.managedBy] ID of the resource that
      * manages this resource.
      *
      * @param {object} [options.parameters.sku] The SKU of the resource.
      *
      * @param {string} options.parameters.sku.name The SKU name.
      *
      * @param {string} [options.parameters.sku.tier] The SKU tier.
      *
      * @param {string} [options.parameters.sku.size] The SKU size.
      *
      * @param {string} [options.parameters.sku.family] The SKU family.
      *
      * @param {string} [options.parameters.sku.model] The SKU model.
      *
      * @param {number} [options.parameters.sku.capacity] The SKU capacity.
      *
      * @param {object} [options.parameters.identity] The identity of the resource.
      *
      * @param {string} [options.parameters.identity.type] The identity type.
      * Possible values include: 'SystemAssigned'
      *
      * @param {object} [options.customHeaders] Headers that will be added to the
      * request
      *
      * @returns {Promise} A promise is returned
      *
      * @resolve {HttpOperationResponse<Appliance>} - The deserialized result object.
      *
      * @reject {Error|ServiceError} - The error object.
      */
    def updateWithHttpOperationResponse(resourceGroupName: String, applianceName: String): js.Promise[HttpOperationResponse[Appliance]] = js.native
    def updateWithHttpOperationResponse(resourceGroupName: String, applianceName: String, options: Parameters): js.Promise[HttpOperationResponse[Appliance]] = js.native
  }
  
}

