package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object migrationhubMod {
  
  type ApplicationId = java.lang.String
  
  type ApplicationIds = js.Array[typings.awsSdk.migrationhubMod.ApplicationId]
  
  type ApplicationStateList = js.Array[typings.awsSdk.migrationhubMod.ApplicationState]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NOT_STARTED
    - typings.awsSdk.awsSdkStrings.IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.COMPLETED
    - java.lang.String
  */
  type ApplicationStatus = typings.awsSdk.migrationhubMod._ApplicationStatus | java.lang.String
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.migrationhubMod.ClientApiVersions
  
  type ConfigurationId = java.lang.String
  
  type CreatedArtifactDescription = java.lang.String
  
  type CreatedArtifactList = js.Array[typings.awsSdk.migrationhubMod.CreatedArtifact]
  
  type CreatedArtifactName = java.lang.String
  
  type DiscoveredResourceDescription = java.lang.String
  
  type DiscoveredResourceList = js.Array[typings.awsSdk.migrationhubMod.DiscoveredResource]
  
  type DryRun = scala.Boolean
  
  type LatestResourceAttributeList = js.Array[typings.awsSdk.migrationhubMod.ResourceAttribute]
  
  type MaxResults = scala.Double
  
  type MaxResultsCreatedArtifacts = scala.Double
  
  type MaxResultsResources = scala.Double
  
  type MigrationTaskName = java.lang.String
  
  type MigrationTaskSummaryList = js.Array[typings.awsSdk.migrationhubMod.MigrationTaskSummary]
  
  type NextUpdateSeconds = scala.Double
  
  type ProgressPercent = scala.Double
  
  type ProgressUpdateStream = java.lang.String
  
  type ProgressUpdateStreamSummaryList = js.Array[typings.awsSdk.migrationhubMod.ProgressUpdateStreamSummary]
  
  type ResourceAttributeList = js.Array[typings.awsSdk.migrationhubMod.ResourceAttribute]
  
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
  type ResourceAttributeType = typings.awsSdk.migrationhubMod._ResourceAttributeType | java.lang.String
  
  type ResourceAttributeValue = java.lang.String
  
  type ResourceName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NOT_STARTED
    - typings.awsSdk.awsSdkStrings.IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.COMPLETED
    - java.lang.String
  */
  type Status = typings.awsSdk.migrationhubMod._Status | java.lang.String
  
  type StatusDetail = java.lang.String
  
  type Token = java.lang.String
  
  type UpdateDateTime = typings.std.Date
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2017-05-31`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.migrationhubMod._apiVersion | java.lang.String
}
