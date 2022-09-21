package typings.awsSdk.route53recoveryreadinessMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Route53RecoveryReadiness extends Service {
  
  @JSName("config")
  var config_Route53RecoveryReadiness: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates a cell in an account.
    */
  def createCell(): Request[CreateCellResponse, AWSError] = js.native
  def createCell(callback: js.Function2[/* err */ AWSError, /* data */ CreateCellResponse, Unit]): Request[CreateCellResponse, AWSError] = js.native
  /**
    * Creates a cell in an account.
    */
  def createCell(params: CreateCellRequest): Request[CreateCellResponse, AWSError] = js.native
  def createCell(
    params: CreateCellRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCellResponse, Unit]
  ): Request[CreateCellResponse, AWSError] = js.native
  
  /**
    * Creates a cross-account readiness authorization. This lets you authorize another account to work with Route 53 Application Recovery Controller, for example, to check the readiness status of resources in a separate account.
    */
  def createCrossAccountAuthorization(): Request[CreateCrossAccountAuthorizationResponse, AWSError] = js.native
  def createCrossAccountAuthorization(
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCrossAccountAuthorizationResponse, Unit]
  ): Request[CreateCrossAccountAuthorizationResponse, AWSError] = js.native
  /**
    * Creates a cross-account readiness authorization. This lets you authorize another account to work with Route 53 Application Recovery Controller, for example, to check the readiness status of resources in a separate account.
    */
  def createCrossAccountAuthorization(params: CreateCrossAccountAuthorizationRequest): Request[CreateCrossAccountAuthorizationResponse, AWSError] = js.native
  def createCrossAccountAuthorization(
    params: CreateCrossAccountAuthorizationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateCrossAccountAuthorizationResponse, Unit]
  ): Request[CreateCrossAccountAuthorizationResponse, AWSError] = js.native
  
  /**
    * Creates a readiness check in an account. A readiness check monitors a resource set in your application, such as a set of Amazon Aurora instances, that Application Recovery Controller is auditing recovery readiness for. The audits run once every minute on every resource that's associated with a readiness check.
    */
  def createReadinessCheck(): Request[CreateReadinessCheckResponse, AWSError] = js.native
  def createReadinessCheck(callback: js.Function2[/* err */ AWSError, /* data */ CreateReadinessCheckResponse, Unit]): Request[CreateReadinessCheckResponse, AWSError] = js.native
  /**
    * Creates a readiness check in an account. A readiness check monitors a resource set in your application, such as a set of Amazon Aurora instances, that Application Recovery Controller is auditing recovery readiness for. The audits run once every minute on every resource that's associated with a readiness check.
    */
  def createReadinessCheck(params: CreateReadinessCheckRequest): Request[CreateReadinessCheckResponse, AWSError] = js.native
  def createReadinessCheck(
    params: CreateReadinessCheckRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateReadinessCheckResponse, Unit]
  ): Request[CreateReadinessCheckResponse, AWSError] = js.native
  
  /**
    * Creates a recovery group in an account. A recovery group corresponds to an application and includes a list of the cells that make up the application.
    */
  def createRecoveryGroup(): Request[CreateRecoveryGroupResponse, AWSError] = js.native
  def createRecoveryGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateRecoveryGroupResponse, Unit]): Request[CreateRecoveryGroupResponse, AWSError] = js.native
  /**
    * Creates a recovery group in an account. A recovery group corresponds to an application and includes a list of the cells that make up the application.
    */
  def createRecoveryGroup(params: CreateRecoveryGroupRequest): Request[CreateRecoveryGroupResponse, AWSError] = js.native
  def createRecoveryGroup(
    params: CreateRecoveryGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRecoveryGroupResponse, Unit]
  ): Request[CreateRecoveryGroupResponse, AWSError] = js.native
  
  /**
    * Creates a resource set. A resource set is a set of resources of one type that span multiple cells. You can associate a resource set with a readiness check to monitor the resources for failover readiness.
    */
  def createResourceSet(): Request[CreateResourceSetResponse, AWSError] = js.native
  def createResourceSet(callback: js.Function2[/* err */ AWSError, /* data */ CreateResourceSetResponse, Unit]): Request[CreateResourceSetResponse, AWSError] = js.native
  /**
    * Creates a resource set. A resource set is a set of resources of one type that span multiple cells. You can associate a resource set with a readiness check to monitor the resources for failover readiness.
    */
  def createResourceSet(params: CreateResourceSetRequest): Request[CreateResourceSetResponse, AWSError] = js.native
  def createResourceSet(
    params: CreateResourceSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateResourceSetResponse, Unit]
  ): Request[CreateResourceSetResponse, AWSError] = js.native
  
  /**
    * Delete a cell. When successful, the response code is 204, with no response body.
    */
  def deleteCell(): Request[js.Object, AWSError] = js.native
  def deleteCell(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Delete a cell. When successful, the response code is 204, with no response body.
    */
  def deleteCell(params: DeleteCellRequest): Request[js.Object, AWSError] = js.native
  def deleteCell(params: DeleteCellRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes cross account readiness authorization.
    */
  def deleteCrossAccountAuthorization(): Request[DeleteCrossAccountAuthorizationResponse, AWSError] = js.native
  def deleteCrossAccountAuthorization(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteCrossAccountAuthorizationResponse, Unit]
  ): Request[DeleteCrossAccountAuthorizationResponse, AWSError] = js.native
  /**
    * Deletes cross account readiness authorization.
    */
  def deleteCrossAccountAuthorization(params: DeleteCrossAccountAuthorizationRequest): Request[DeleteCrossAccountAuthorizationResponse, AWSError] = js.native
  def deleteCrossAccountAuthorization(
    params: DeleteCrossAccountAuthorizationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteCrossAccountAuthorizationResponse, Unit]
  ): Request[DeleteCrossAccountAuthorizationResponse, AWSError] = js.native
  
  /**
    * Deletes a readiness check.
    */
  def deleteReadinessCheck(): Request[js.Object, AWSError] = js.native
  def deleteReadinessCheck(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a readiness check.
    */
  def deleteReadinessCheck(params: DeleteReadinessCheckRequest): Request[js.Object, AWSError] = js.native
  def deleteReadinessCheck(
    params: DeleteReadinessCheckRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a recovery group.
    */
  def deleteRecoveryGroup(): Request[js.Object, AWSError] = js.native
  def deleteRecoveryGroup(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a recovery group.
    */
  def deleteRecoveryGroup(params: DeleteRecoveryGroupRequest): Request[js.Object, AWSError] = js.native
  def deleteRecoveryGroup(
    params: DeleteRecoveryGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a resource set.
    */
  def deleteResourceSet(): Request[js.Object, AWSError] = js.native
  def deleteResourceSet(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a resource set.
    */
  def deleteResourceSet(params: DeleteResourceSetRequest): Request[js.Object, AWSError] = js.native
  def deleteResourceSet(
    params: DeleteResourceSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Gets recommendations about architecture designs for improving resiliency for an application, based on a recovery group.
    */
  def getArchitectureRecommendations(): Request[GetArchitectureRecommendationsResponse, AWSError] = js.native
  def getArchitectureRecommendations(
    callback: js.Function2[/* err */ AWSError, /* data */ GetArchitectureRecommendationsResponse, Unit]
  ): Request[GetArchitectureRecommendationsResponse, AWSError] = js.native
  /**
    * Gets recommendations about architecture designs for improving resiliency for an application, based on a recovery group.
    */
  def getArchitectureRecommendations(params: GetArchitectureRecommendationsRequest): Request[GetArchitectureRecommendationsResponse, AWSError] = js.native
  def getArchitectureRecommendations(
    params: GetArchitectureRecommendationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetArchitectureRecommendationsResponse, Unit]
  ): Request[GetArchitectureRecommendationsResponse, AWSError] = js.native
  
  /**
    * Gets information about a cell including cell name, cell Amazon Resource Name (ARN), ARNs of nested cells for this cell, and a list of those cell ARNs with their associated recovery group ARNs.
    */
  def getCell(): Request[GetCellResponse, AWSError] = js.native
  def getCell(callback: js.Function2[/* err */ AWSError, /* data */ GetCellResponse, Unit]): Request[GetCellResponse, AWSError] = js.native
  /**
    * Gets information about a cell including cell name, cell Amazon Resource Name (ARN), ARNs of nested cells for this cell, and a list of those cell ARNs with their associated recovery group ARNs.
    */
  def getCell(params: GetCellRequest): Request[GetCellResponse, AWSError] = js.native
  def getCell(
    params: GetCellRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCellResponse, Unit]
  ): Request[GetCellResponse, AWSError] = js.native
  
  /**
    * Gets readiness for a cell. Aggregates the readiness of all the resources that are associated with the cell into a single value.
    */
  def getCellReadinessSummary(): Request[GetCellReadinessSummaryResponse, AWSError] = js.native
  def getCellReadinessSummary(callback: js.Function2[/* err */ AWSError, /* data */ GetCellReadinessSummaryResponse, Unit]): Request[GetCellReadinessSummaryResponse, AWSError] = js.native
  /**
    * Gets readiness for a cell. Aggregates the readiness of all the resources that are associated with the cell into a single value.
    */
  def getCellReadinessSummary(params: GetCellReadinessSummaryRequest): Request[GetCellReadinessSummaryResponse, AWSError] = js.native
  def getCellReadinessSummary(
    params: GetCellReadinessSummaryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetCellReadinessSummaryResponse, Unit]
  ): Request[GetCellReadinessSummaryResponse, AWSError] = js.native
  
  /**
    * Gets details about a readiness check.
    */
  def getReadinessCheck(): Request[GetReadinessCheckResponse, AWSError] = js.native
  def getReadinessCheck(callback: js.Function2[/* err */ AWSError, /* data */ GetReadinessCheckResponse, Unit]): Request[GetReadinessCheckResponse, AWSError] = js.native
  /**
    * Gets details about a readiness check.
    */
  def getReadinessCheck(params: GetReadinessCheckRequest): Request[GetReadinessCheckResponse, AWSError] = js.native
  def getReadinessCheck(
    params: GetReadinessCheckRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetReadinessCheckResponse, Unit]
  ): Request[GetReadinessCheckResponse, AWSError] = js.native
  
  /**
    * Gets individual readiness status for a readiness check. To see the overall readiness status for a recovery group, that considers the readiness status for all the readiness checks in the recovery group, use GetRecoveryGroupReadinessSummary.
    */
  def getReadinessCheckResourceStatus(): Request[GetReadinessCheckResourceStatusResponse, AWSError] = js.native
  def getReadinessCheckResourceStatus(
    callback: js.Function2[/* err */ AWSError, /* data */ GetReadinessCheckResourceStatusResponse, Unit]
  ): Request[GetReadinessCheckResourceStatusResponse, AWSError] = js.native
  /**
    * Gets individual readiness status for a readiness check. To see the overall readiness status for a recovery group, that considers the readiness status for all the readiness checks in the recovery group, use GetRecoveryGroupReadinessSummary.
    */
  def getReadinessCheckResourceStatus(params: GetReadinessCheckResourceStatusRequest): Request[GetReadinessCheckResourceStatusResponse, AWSError] = js.native
  def getReadinessCheckResourceStatus(
    params: GetReadinessCheckResourceStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetReadinessCheckResourceStatusResponse, Unit]
  ): Request[GetReadinessCheckResourceStatusResponse, AWSError] = js.native
  
  /**
    * Gets the readiness status for an individual readiness check. To see the overall readiness status for a recovery group, that considers the readiness status for all the readiness checks in a recovery group, use GetRecoveryGroupReadinessSummary.
    */
  def getReadinessCheckStatus(): Request[GetReadinessCheckStatusResponse, AWSError] = js.native
  def getReadinessCheckStatus(callback: js.Function2[/* err */ AWSError, /* data */ GetReadinessCheckStatusResponse, Unit]): Request[GetReadinessCheckStatusResponse, AWSError] = js.native
  /**
    * Gets the readiness status for an individual readiness check. To see the overall readiness status for a recovery group, that considers the readiness status for all the readiness checks in a recovery group, use GetRecoveryGroupReadinessSummary.
    */
  def getReadinessCheckStatus(params: GetReadinessCheckStatusRequest): Request[GetReadinessCheckStatusResponse, AWSError] = js.native
  def getReadinessCheckStatus(
    params: GetReadinessCheckStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetReadinessCheckStatusResponse, Unit]
  ): Request[GetReadinessCheckStatusResponse, AWSError] = js.native
  
  /**
    * Gets details about a recovery group, including a list of the cells that are included in it.
    */
  def getRecoveryGroup(): Request[GetRecoveryGroupResponse, AWSError] = js.native
  def getRecoveryGroup(callback: js.Function2[/* err */ AWSError, /* data */ GetRecoveryGroupResponse, Unit]): Request[GetRecoveryGroupResponse, AWSError] = js.native
  /**
    * Gets details about a recovery group, including a list of the cells that are included in it.
    */
  def getRecoveryGroup(params: GetRecoveryGroupRequest): Request[GetRecoveryGroupResponse, AWSError] = js.native
  def getRecoveryGroup(
    params: GetRecoveryGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRecoveryGroupResponse, Unit]
  ): Request[GetRecoveryGroupResponse, AWSError] = js.native
  
  /**
    * Displays a summary of information about a recovery group's readiness status. Includes the readiness checks for resources in the recovery group and the readiness status of each one.
    */
  def getRecoveryGroupReadinessSummary(): Request[GetRecoveryGroupReadinessSummaryResponse, AWSError] = js.native
  def getRecoveryGroupReadinessSummary(
    callback: js.Function2[/* err */ AWSError, /* data */ GetRecoveryGroupReadinessSummaryResponse, Unit]
  ): Request[GetRecoveryGroupReadinessSummaryResponse, AWSError] = js.native
  /**
    * Displays a summary of information about a recovery group's readiness status. Includes the readiness checks for resources in the recovery group and the readiness status of each one.
    */
  def getRecoveryGroupReadinessSummary(params: GetRecoveryGroupReadinessSummaryRequest): Request[GetRecoveryGroupReadinessSummaryResponse, AWSError] = js.native
  def getRecoveryGroupReadinessSummary(
    params: GetRecoveryGroupReadinessSummaryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRecoveryGroupReadinessSummaryResponse, Unit]
  ): Request[GetRecoveryGroupReadinessSummaryResponse, AWSError] = js.native
  
  /**
    * Displays the details about a resource set, including a list of the resources in the set.
    */
  def getResourceSet(): Request[GetResourceSetResponse, AWSError] = js.native
  def getResourceSet(callback: js.Function2[/* err */ AWSError, /* data */ GetResourceSetResponse, Unit]): Request[GetResourceSetResponse, AWSError] = js.native
  /**
    * Displays the details about a resource set, including a list of the resources in the set.
    */
  def getResourceSet(params: GetResourceSetRequest): Request[GetResourceSetResponse, AWSError] = js.native
  def getResourceSet(
    params: GetResourceSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetResourceSetResponse, Unit]
  ): Request[GetResourceSetResponse, AWSError] = js.native
  
  /**
    * Lists the cells for an account.
    */
  def listCells(): Request[ListCellsResponse, AWSError] = js.native
  def listCells(callback: js.Function2[/* err */ AWSError, /* data */ ListCellsResponse, Unit]): Request[ListCellsResponse, AWSError] = js.native
  /**
    * Lists the cells for an account.
    */
  def listCells(params: ListCellsRequest): Request[ListCellsResponse, AWSError] = js.native
  def listCells(
    params: ListCellsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCellsResponse, Unit]
  ): Request[ListCellsResponse, AWSError] = js.native
  
  /**
    * Lists the cross-account readiness authorizations that are in place for an account.
    */
  def listCrossAccountAuthorizations(): Request[ListCrossAccountAuthorizationsResponse, AWSError] = js.native
  def listCrossAccountAuthorizations(
    callback: js.Function2[/* err */ AWSError, /* data */ ListCrossAccountAuthorizationsResponse, Unit]
  ): Request[ListCrossAccountAuthorizationsResponse, AWSError] = js.native
  /**
    * Lists the cross-account readiness authorizations that are in place for an account.
    */
  def listCrossAccountAuthorizations(params: ListCrossAccountAuthorizationsRequest): Request[ListCrossAccountAuthorizationsResponse, AWSError] = js.native
  def listCrossAccountAuthorizations(
    params: ListCrossAccountAuthorizationsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListCrossAccountAuthorizationsResponse, Unit]
  ): Request[ListCrossAccountAuthorizationsResponse, AWSError] = js.native
  
  /**
    * Lists the readiness checks for an account.
    */
  def listReadinessChecks(): Request[ListReadinessChecksResponse, AWSError] = js.native
  def listReadinessChecks(callback: js.Function2[/* err */ AWSError, /* data */ ListReadinessChecksResponse, Unit]): Request[ListReadinessChecksResponse, AWSError] = js.native
  /**
    * Lists the readiness checks for an account.
    */
  def listReadinessChecks(params: ListReadinessChecksRequest): Request[ListReadinessChecksResponse, AWSError] = js.native
  def listReadinessChecks(
    params: ListReadinessChecksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListReadinessChecksResponse, Unit]
  ): Request[ListReadinessChecksResponse, AWSError] = js.native
  
  /**
    * Lists the recovery groups in an account.
    */
  def listRecoveryGroups(): Request[ListRecoveryGroupsResponse, AWSError] = js.native
  def listRecoveryGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListRecoveryGroupsResponse, Unit]): Request[ListRecoveryGroupsResponse, AWSError] = js.native
  /**
    * Lists the recovery groups in an account.
    */
  def listRecoveryGroups(params: ListRecoveryGroupsRequest): Request[ListRecoveryGroupsResponse, AWSError] = js.native
  def listRecoveryGroups(
    params: ListRecoveryGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRecoveryGroupsResponse, Unit]
  ): Request[ListRecoveryGroupsResponse, AWSError] = js.native
  
  /**
    * Lists the resource sets in an account.
    */
  def listResourceSets(): Request[ListResourceSetsResponse, AWSError] = js.native
  def listResourceSets(callback: js.Function2[/* err */ AWSError, /* data */ ListResourceSetsResponse, Unit]): Request[ListResourceSetsResponse, AWSError] = js.native
  /**
    * Lists the resource sets in an account.
    */
  def listResourceSets(params: ListResourceSetsRequest): Request[ListResourceSetsResponse, AWSError] = js.native
  def listResourceSets(
    params: ListResourceSetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListResourceSetsResponse, Unit]
  ): Request[ListResourceSetsResponse, AWSError] = js.native
  
  /**
    * Lists all readiness rules, or lists the readiness rules for a specific resource type.
    */
  def listRules(): Request[ListRulesResponse, AWSError] = js.native
  def listRules(callback: js.Function2[/* err */ AWSError, /* data */ ListRulesResponse, Unit]): Request[ListRulesResponse, AWSError] = js.native
  /**
    * Lists all readiness rules, or lists the readiness rules for a specific resource type.
    */
  def listRules(params: ListRulesRequest): Request[ListRulesResponse, AWSError] = js.native
  def listRules(
    params: ListRulesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRulesResponse, Unit]
  ): Request[ListRulesResponse, AWSError] = js.native
  
  /**
    * Lists the tags for a resource.
    */
  def listTagsForResources(): Request[ListTagsForResourcesResponse, AWSError] = js.native
  def listTagsForResources(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourcesResponse, Unit]): Request[ListTagsForResourcesResponse, AWSError] = js.native
  /**
    * Lists the tags for a resource.
    */
  def listTagsForResources(params: ListTagsForResourcesRequest): Request[ListTagsForResourcesResponse, AWSError] = js.native
  def listTagsForResources(
    params: ListTagsForResourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourcesResponse, Unit]
  ): Request[ListTagsForResourcesResponse, AWSError] = js.native
  
  /**
    * Adds a tag to a resource.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds a tag to a resource.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes a tag from a resource.
    */
  def untagResource(): Request[js.Object, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes a tag from a resource.
    */
  def untagResource(params: UntagResourceRequest): Request[js.Object, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates a cell to replace the list of nested cells with a new list of nested cells.
    */
  def updateCell(): Request[UpdateCellResponse, AWSError] = js.native
  def updateCell(callback: js.Function2[/* err */ AWSError, /* data */ UpdateCellResponse, Unit]): Request[UpdateCellResponse, AWSError] = js.native
  /**
    * Updates a cell to replace the list of nested cells with a new list of nested cells.
    */
  def updateCell(params: UpdateCellRequest): Request[UpdateCellResponse, AWSError] = js.native
  def updateCell(
    params: UpdateCellRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateCellResponse, Unit]
  ): Request[UpdateCellResponse, AWSError] = js.native
  
  /**
    * Updates a readiness check.
    */
  def updateReadinessCheck(): Request[UpdateReadinessCheckResponse, AWSError] = js.native
  def updateReadinessCheck(callback: js.Function2[/* err */ AWSError, /* data */ UpdateReadinessCheckResponse, Unit]): Request[UpdateReadinessCheckResponse, AWSError] = js.native
  /**
    * Updates a readiness check.
    */
  def updateReadinessCheck(params: UpdateReadinessCheckRequest): Request[UpdateReadinessCheckResponse, AWSError] = js.native
  def updateReadinessCheck(
    params: UpdateReadinessCheckRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateReadinessCheckResponse, Unit]
  ): Request[UpdateReadinessCheckResponse, AWSError] = js.native
  
  /**
    * Updates a recovery group.
    */
  def updateRecoveryGroup(): Request[UpdateRecoveryGroupResponse, AWSError] = js.native
  def updateRecoveryGroup(callback: js.Function2[/* err */ AWSError, /* data */ UpdateRecoveryGroupResponse, Unit]): Request[UpdateRecoveryGroupResponse, AWSError] = js.native
  /**
    * Updates a recovery group.
    */
  def updateRecoveryGroup(params: UpdateRecoveryGroupRequest): Request[UpdateRecoveryGroupResponse, AWSError] = js.native
  def updateRecoveryGroup(
    params: UpdateRecoveryGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRecoveryGroupResponse, Unit]
  ): Request[UpdateRecoveryGroupResponse, AWSError] = js.native
  
  /**
    * Updates a resource set.
    */
  def updateResourceSet(): Request[UpdateResourceSetResponse, AWSError] = js.native
  def updateResourceSet(callback: js.Function2[/* err */ AWSError, /* data */ UpdateResourceSetResponse, Unit]): Request[UpdateResourceSetResponse, AWSError] = js.native
  /**
    * Updates a resource set.
    */
  def updateResourceSet(params: UpdateResourceSetRequest): Request[UpdateResourceSetResponse, AWSError] = js.native
  def updateResourceSet(
    params: UpdateResourceSetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateResourceSetResponse, Unit]
  ): Request[UpdateResourceSetResponse, AWSError] = js.native
}
