package typings.awsSdk.schemasMod

import typings.awsSdk.AnonWaiter
import typings.awsSdk.awsSdkStrings.codeBindingExists
import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schemas extends Service {
  @JSName("config")
  var config_Schemas: ConfigBase with ClientConfiguration = js.native
  /**
    * Creates a discoverer.
    */
  def createDiscoverer(): Request[CreateDiscovererResponse, AWSError] = js.native
  def createDiscoverer(callback: js.Function2[/* err */ AWSError, /* data */ CreateDiscovererResponse, Unit]): Request[CreateDiscovererResponse, AWSError] = js.native
  /**
    * Creates a discoverer.
    */
  def createDiscoverer(params: CreateDiscovererRequest): Request[CreateDiscovererResponse, AWSError] = js.native
  def createDiscoverer(
    params: CreateDiscovererRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDiscovererResponse, Unit]
  ): Request[CreateDiscovererResponse, AWSError] = js.native
  /**
    * Creates a registry.
    */
  def createRegistry(): Request[CreateRegistryResponse, AWSError] = js.native
  def createRegistry(callback: js.Function2[/* err */ AWSError, /* data */ CreateRegistryResponse, Unit]): Request[CreateRegistryResponse, AWSError] = js.native
  /**
    * Creates a registry.
    */
  def createRegistry(params: CreateRegistryRequest): Request[CreateRegistryResponse, AWSError] = js.native
  def createRegistry(
    params: CreateRegistryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRegistryResponse, Unit]
  ): Request[CreateRegistryResponse, AWSError] = js.native
  /**
    * Creates a schema definition.
    */
  def createSchema(): Request[CreateSchemaResponse, AWSError] = js.native
  def createSchema(callback: js.Function2[/* err */ AWSError, /* data */ CreateSchemaResponse, Unit]): Request[CreateSchemaResponse, AWSError] = js.native
  /**
    * Creates a schema definition.
    */
  def createSchema(params: CreateSchemaRequest): Request[CreateSchemaResponse, AWSError] = js.native
  def createSchema(
    params: CreateSchemaRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSchemaResponse, Unit]
  ): Request[CreateSchemaResponse, AWSError] = js.native
  /**
    * Deletes a discoverer.
    */
  def deleteDiscoverer(): Request[js.Object, AWSError] = js.native
  def deleteDiscoverer(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a discoverer.
    */
  def deleteDiscoverer(params: DeleteDiscovererRequest): Request[js.Object, AWSError] = js.native
  def deleteDiscoverer(
    params: DeleteDiscovererRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a Registry.
    */
  def deleteRegistry(): Request[js.Object, AWSError] = js.native
  def deleteRegistry(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a Registry.
    */
  def deleteRegistry(params: DeleteRegistryRequest): Request[js.Object, AWSError] = js.native
  def deleteRegistry(
    params: DeleteRegistryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Delete a schema definition.
    */
  def deleteSchema(): Request[js.Object, AWSError] = js.native
  def deleteSchema(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Delete a schema definition.
    */
  def deleteSchema(params: DeleteSchemaRequest): Request[js.Object, AWSError] = js.native
  def deleteSchema(
    params: DeleteSchemaRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Delete the schema version definition
    */
  def deleteSchemaVersion(): Request[js.Object, AWSError] = js.native
  def deleteSchemaVersion(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Delete the schema version definition
    */
  def deleteSchemaVersion(params: DeleteSchemaVersionRequest): Request[js.Object, AWSError] = js.native
  def deleteSchemaVersion(
    params: DeleteSchemaVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Describe the code binding URI.
    */
  def describeCodeBinding(): Request[DescribeCodeBindingResponse, AWSError] = js.native
  def describeCodeBinding(callback: js.Function2[/* err */ AWSError, /* data */ DescribeCodeBindingResponse, Unit]): Request[DescribeCodeBindingResponse, AWSError] = js.native
  /**
    * Describe the code binding URI.
    */
  def describeCodeBinding(params: DescribeCodeBindingRequest): Request[DescribeCodeBindingResponse, AWSError] = js.native
  def describeCodeBinding(
    params: DescribeCodeBindingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeCodeBindingResponse, Unit]
  ): Request[DescribeCodeBindingResponse, AWSError] = js.native
  /**
    * Describes the discoverer.
    */
  def describeDiscoverer(): Request[DescribeDiscovererResponse, AWSError] = js.native
  def describeDiscoverer(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDiscovererResponse, Unit]): Request[DescribeDiscovererResponse, AWSError] = js.native
  /**
    * Describes the discoverer.
    */
  def describeDiscoverer(params: DescribeDiscovererRequest): Request[DescribeDiscovererResponse, AWSError] = js.native
  def describeDiscoverer(
    params: DescribeDiscovererRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDiscovererResponse, Unit]
  ): Request[DescribeDiscovererResponse, AWSError] = js.native
  /**
    * Describes the registry.
    */
  def describeRegistry(): Request[DescribeRegistryResponse, AWSError] = js.native
  def describeRegistry(callback: js.Function2[/* err */ AWSError, /* data */ DescribeRegistryResponse, Unit]): Request[DescribeRegistryResponse, AWSError] = js.native
  /**
    * Describes the registry.
    */
  def describeRegistry(params: DescribeRegistryRequest): Request[DescribeRegistryResponse, AWSError] = js.native
  def describeRegistry(
    params: DescribeRegistryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRegistryResponse, Unit]
  ): Request[DescribeRegistryResponse, AWSError] = js.native
  /**
    * Retrieve the schema definition.
    */
  def describeSchema(): Request[DescribeSchemaResponse, AWSError] = js.native
  def describeSchema(callback: js.Function2[/* err */ AWSError, /* data */ DescribeSchemaResponse, Unit]): Request[DescribeSchemaResponse, AWSError] = js.native
  /**
    * Retrieve the schema definition.
    */
  def describeSchema(params: DescribeSchemaRequest): Request[DescribeSchemaResponse, AWSError] = js.native
  def describeSchema(
    params: DescribeSchemaRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeSchemaResponse, Unit]
  ): Request[DescribeSchemaResponse, AWSError] = js.native
  /**
    * Get the code binding source URI.
    */
  def getCodeBindingSource(): Request[GetCodeBindingSourceResponse, AWSError] = js.native
  def getCodeBindingSource(callback: js.Function2[/* err */ AWSError, /* data */ GetCodeBindingSourceResponse, Unit]): Request[GetCodeBindingSourceResponse, AWSError] = js.native
  /**
    * Get the code binding source URI.
    */
  def getCodeBindingSource(params: GetCodeBindingSourceRequest): Request[GetCodeBindingSourceResponse, AWSError] = js.native
  def getCodeBindingSource(
    params: GetCodeBindingSourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCodeBindingSourceResponse, Unit]
  ): Request[GetCodeBindingSourceResponse, AWSError] = js.native
  /**
    * Get the discovered schema that was generated based on sampled events.
    */
  def getDiscoveredSchema(): Request[GetDiscoveredSchemaResponse, AWSError] = js.native
  def getDiscoveredSchema(callback: js.Function2[/* err */ AWSError, /* data */ GetDiscoveredSchemaResponse, Unit]): Request[GetDiscoveredSchemaResponse, AWSError] = js.native
  /**
    * Get the discovered schema that was generated based on sampled events.
    */
  def getDiscoveredSchema(params: GetDiscoveredSchemaRequest): Request[GetDiscoveredSchemaResponse, AWSError] = js.native
  def getDiscoveredSchema(
    params: GetDiscoveredSchemaRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDiscoveredSchemaResponse, Unit]
  ): Request[GetDiscoveredSchemaResponse, AWSError] = js.native
  /**
    * List the discoverers.
    */
  def listDiscoverers(): Request[ListDiscoverersResponse, AWSError] = js.native
  def listDiscoverers(callback: js.Function2[/* err */ AWSError, /* data */ ListDiscoverersResponse, Unit]): Request[ListDiscoverersResponse, AWSError] = js.native
  /**
    * List the discoverers.
    */
  def listDiscoverers(params: ListDiscoverersRequest): Request[ListDiscoverersResponse, AWSError] = js.native
  def listDiscoverers(
    params: ListDiscoverersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDiscoverersResponse, Unit]
  ): Request[ListDiscoverersResponse, AWSError] = js.native
  /**
    * List the registries.
    */
  def listRegistries(): Request[ListRegistriesResponse, AWSError] = js.native
  def listRegistries(callback: js.Function2[/* err */ AWSError, /* data */ ListRegistriesResponse, Unit]): Request[ListRegistriesResponse, AWSError] = js.native
  /**
    * List the registries.
    */
  def listRegistries(params: ListRegistriesRequest): Request[ListRegistriesResponse, AWSError] = js.native
  def listRegistries(
    params: ListRegistriesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRegistriesResponse, Unit]
  ): Request[ListRegistriesResponse, AWSError] = js.native
  /**
    * Provides a list of the schema versions and related information.
    */
  def listSchemaVersions(): Request[ListSchemaVersionsResponse, AWSError] = js.native
  def listSchemaVersions(callback: js.Function2[/* err */ AWSError, /* data */ ListSchemaVersionsResponse, Unit]): Request[ListSchemaVersionsResponse, AWSError] = js.native
  /**
    * Provides a list of the schema versions and related information.
    */
  def listSchemaVersions(params: ListSchemaVersionsRequest): Request[ListSchemaVersionsResponse, AWSError] = js.native
  def listSchemaVersions(
    params: ListSchemaVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSchemaVersionsResponse, Unit]
  ): Request[ListSchemaVersionsResponse, AWSError] = js.native
  /**
    * List the schemas.
    */
  def listSchemas(): Request[ListSchemasResponse, AWSError] = js.native
  def listSchemas(callback: js.Function2[/* err */ AWSError, /* data */ ListSchemasResponse, Unit]): Request[ListSchemasResponse, AWSError] = js.native
  /**
    * List the schemas.
    */
  def listSchemas(params: ListSchemasRequest): Request[ListSchemasResponse, AWSError] = js.native
  def listSchemas(
    params: ListSchemasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSchemasResponse, Unit]
  ): Request[ListSchemasResponse, AWSError] = js.native
  /**
    * Get tags for resource.
    */
  def listTagsForResource(): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * Get tags for resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResponse, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResponse, Unit]
  ): Request[ListTagsForResourceResponse, AWSError] = js.native
  /**
    * 
    */
  def lockServiceLinkedRole(): Request[LockServiceLinkedRoleResponse, AWSError] = js.native
  def lockServiceLinkedRole(callback: js.Function2[/* err */ AWSError, /* data */ LockServiceLinkedRoleResponse, Unit]): Request[LockServiceLinkedRoleResponse, AWSError] = js.native
  /**
    * 
    */
  def lockServiceLinkedRole(params: LockServiceLinkedRoleRequest): Request[LockServiceLinkedRoleResponse, AWSError] = js.native
  def lockServiceLinkedRole(
    params: LockServiceLinkedRoleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ LockServiceLinkedRoleResponse, Unit]
  ): Request[LockServiceLinkedRoleResponse, AWSError] = js.native
  /**
    * Put code binding URI
    */
  def putCodeBinding(): Request[PutCodeBindingResponse, AWSError] = js.native
  def putCodeBinding(callback: js.Function2[/* err */ AWSError, /* data */ PutCodeBindingResponse, Unit]): Request[PutCodeBindingResponse, AWSError] = js.native
  /**
    * Put code binding URI
    */
  def putCodeBinding(params: PutCodeBindingRequest): Request[PutCodeBindingResponse, AWSError] = js.native
  def putCodeBinding(
    params: PutCodeBindingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutCodeBindingResponse, Unit]
  ): Request[PutCodeBindingResponse, AWSError] = js.native
  /**
    * Search the schemas
    */
  def searchSchemas(): Request[SearchSchemasResponse, AWSError] = js.native
  def searchSchemas(callback: js.Function2[/* err */ AWSError, /* data */ SearchSchemasResponse, Unit]): Request[SearchSchemasResponse, AWSError] = js.native
  /**
    * Search the schemas
    */
  def searchSchemas(params: SearchSchemasRequest): Request[SearchSchemasResponse, AWSError] = js.native
  def searchSchemas(
    params: SearchSchemasRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchSchemasResponse, Unit]
  ): Request[SearchSchemasResponse, AWSError] = js.native
  /**
    * Starts the discoverer
    */
  def startDiscoverer(): Request[StartDiscovererResponse, AWSError] = js.native
  def startDiscoverer(callback: js.Function2[/* err */ AWSError, /* data */ StartDiscovererResponse, Unit]): Request[StartDiscovererResponse, AWSError] = js.native
  /**
    * Starts the discoverer
    */
  def startDiscoverer(params: StartDiscovererRequest): Request[StartDiscovererResponse, AWSError] = js.native
  def startDiscoverer(
    params: StartDiscovererRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartDiscovererResponse, Unit]
  ): Request[StartDiscovererResponse, AWSError] = js.native
  /**
    * Stops the discoverer
    */
  def stopDiscoverer(): Request[StopDiscovererResponse, AWSError] = js.native
  def stopDiscoverer(callback: js.Function2[/* err */ AWSError, /* data */ StopDiscovererResponse, Unit]): Request[StopDiscovererResponse, AWSError] = js.native
  /**
    * Stops the discoverer
    */
  def stopDiscoverer(params: StopDiscovererRequest): Request[StopDiscovererResponse, AWSError] = js.native
  def stopDiscoverer(
    params: StopDiscovererRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StopDiscovererResponse, Unit]
  ): Request[StopDiscovererResponse, AWSError] = js.native
  /**
    * Add tags to a resource.
    */
  def tagResource(): Request[js.Object, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Add tags to a resource.
    */
  def tagResource(params: TagResourceRequest): Request[js.Object, AWSError] = js.native
  def tagResource(params: TagResourceRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * 
    */
  def unlockServiceLinkedRole(): Request[UnlockServiceLinkedRoleResponse, AWSError] = js.native
  def unlockServiceLinkedRole(callback: js.Function2[/* err */ AWSError, /* data */ UnlockServiceLinkedRoleResponse, Unit]): Request[UnlockServiceLinkedRoleResponse, AWSError] = js.native
  /**
    * 
    */
  def unlockServiceLinkedRole(params: UnlockServiceLinkedRoleRequest): Request[UnlockServiceLinkedRoleResponse, AWSError] = js.native
  def unlockServiceLinkedRole(
    params: UnlockServiceLinkedRoleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UnlockServiceLinkedRoleResponse, Unit]
  ): Request[UnlockServiceLinkedRoleResponse, AWSError] = js.native
  /**
    * Removes tags from a resource.
    */
  def untagResource(): Request[js.Object, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes tags from a resource.
    */
  def untagResource(params: UntagResourceRequest): Request[js.Object, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Updates the discoverer
    */
  def updateDiscoverer(): Request[UpdateDiscovererResponse, AWSError] = js.native
  def updateDiscoverer(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDiscovererResponse, Unit]): Request[UpdateDiscovererResponse, AWSError] = js.native
  /**
    * Updates the discoverer
    */
  def updateDiscoverer(params: UpdateDiscovererRequest): Request[UpdateDiscovererResponse, AWSError] = js.native
  def updateDiscoverer(
    params: UpdateDiscovererRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDiscovererResponse, Unit]
  ): Request[UpdateDiscovererResponse, AWSError] = js.native
  /**
    * Updates a registry.
    */
  def updateRegistry(): Request[UpdateRegistryResponse, AWSError] = js.native
  def updateRegistry(callback: js.Function2[/* err */ AWSError, /* data */ UpdateRegistryResponse, Unit]): Request[UpdateRegistryResponse, AWSError] = js.native
  /**
    * Updates a registry.
    */
  def updateRegistry(params: UpdateRegistryRequest): Request[UpdateRegistryResponse, AWSError] = js.native
  def updateRegistry(
    params: UpdateRegistryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRegistryResponse, Unit]
  ): Request[UpdateRegistryResponse, AWSError] = js.native
  /**
    * Updates the schema definition
    */
  def updateSchema(): Request[UpdateSchemaResponse, AWSError] = js.native
  def updateSchema(callback: js.Function2[/* err */ AWSError, /* data */ UpdateSchemaResponse, Unit]): Request[UpdateSchemaResponse, AWSError] = js.native
  /**
    * Updates the schema definition
    */
  def updateSchema(params: UpdateSchemaRequest): Request[UpdateSchemaResponse, AWSError] = js.native
  def updateSchema(
    params: UpdateSchemaRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSchemaResponse, Unit]
  ): Request[UpdateSchemaResponse, AWSError] = js.native
  /**
    * Waits for the codeBindingExists state by periodically calling the underlying Schemas.describeCodeBindingoperation every 2 seconds (at most 30 times). Wait until code binding is generated
    */
  @JSName("waitFor")
  def waitFor_codeBindingExists(state: codeBindingExists): Request[DescribeCodeBindingResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_codeBindingExists(
    state: codeBindingExists,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeCodeBindingResponse, Unit]
  ): Request[DescribeCodeBindingResponse, AWSError] = js.native
  /**
    * Waits for the codeBindingExists state by periodically calling the underlying Schemas.describeCodeBindingoperation every 2 seconds (at most 30 times). Wait until code binding is generated
    */
  @JSName("waitFor")
  def waitFor_codeBindingExists(state: codeBindingExists, params: DescribeCodeBindingRequest with AnonWaiter): Request[DescribeCodeBindingResponse, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_codeBindingExists(
    state: codeBindingExists,
    params: DescribeCodeBindingRequest with AnonWaiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeCodeBindingResponse, Unit]
  ): Request[DescribeCodeBindingResponse, AWSError] = js.native
}

