package typings.azureDashArmDashResource.libManagementManagementGroupsClientMod

import typings.azureDashArmDashResource.libManagementOperationsMod.ManagementGroups
import typings.azureDashArmDashResource.libManagementOperationsMod.Operations
import typings.msDashRest.msDashRestMod.ServiceClientCredentials
import typings.msDashRestDashAzure.msDashRestDashAzureMod.AzureServiceClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

