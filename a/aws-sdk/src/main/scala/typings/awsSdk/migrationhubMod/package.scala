package typings.awsSdk.migrationhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ApplicationId = String

type ApplicationIds = js.Array[ApplicationId]

type ApplicationStateList = js.Array[ApplicationState]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NOT_STARTED
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - java.lang.String
*/
type ApplicationStatus = _ApplicationStatus | String

type ConfigurationId = String

type CreatedArtifactDescription = String

type CreatedArtifactList = js.Array[CreatedArtifact]

type CreatedArtifactName = String

type DiscoveredResourceDescription = String

type DiscoveredResourceList = js.Array[DiscoveredResource]

type DryRun = Boolean

type LatestResourceAttributeList = js.Array[ResourceAttribute]

type MaxResults = Double

type MaxResultsCreatedArtifacts = Double

type MaxResultsResources = Double

type MigrationTaskName = String

type MigrationTaskSummaryList = js.Array[MigrationTaskSummary]

type NextUpdateSeconds = Double

type ProgressPercent = Double

type ProgressUpdateStream = String

type ProgressUpdateStreamSummaryList = js.Array[ProgressUpdateStreamSummary]

type ResourceAttributeList = js.Array[ResourceAttribute]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IPV4_ADDRESS
  - typings.awsSdk.awsSdkStrings.IPV6_ADDRESS
  - typings.awsSdk.awsSdkStrings.MAC_ADDRESS
  - typings.awsSdk.awsSdkStrings.FQDN
  - typings.awsSdk.awsSdkStrings.VM_MANAGER_ID
  - typings.awsSdk.awsSdkStrings.VM_MANAGED_OBJECT_REFERENCE
  - typings.awsSdk.awsSdkStrings.VM_NAME
  - typings.awsSdk.awsSdkStrings.VM_PATH
  - typings.awsSdk.awsSdkStrings.BIOS_ID
  - typings.awsSdk.awsSdkStrings.MOTHERBOARD_SERIAL_NUMBER
  - java.lang.String
*/
type ResourceAttributeType = _ResourceAttributeType | String

type ResourceAttributeValue = String

type ResourceName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NOT_STARTED
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - java.lang.String
*/
type Status = _Status | String

type StatusDetail = String

type Token = String

type UpdateDateTime = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2017-05-31`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
