package typings.awsSdk.emrserverlessMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ApplicationArn = String

type ApplicationId = String

type ApplicationList = js.Array[ApplicationSummary]

type ApplicationName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.CREATED
  - typings.awsSdk.awsSdkStrings.STARTING
  - typings.awsSdk.awsSdkStrings.STARTED
  - typings.awsSdk.awsSdkStrings.STOPPING
  - typings.awsSdk.awsSdkStrings.STOPPED
  - typings.awsSdk.awsSdkStrings.TERMINATED
  - java.lang.String
*/
type ApplicationState = _ApplicationState | String

type ApplicationStateSet = js.Array[ApplicationState]

type AutoStopConfigIdleTimeoutMinutesInteger = scala.Double

type Boolean = scala.Boolean

type ClientToken = String

type ConfigurationList = js.Array[Configuration]

type CpuSize = String

type Date = js.Date

type DiskSize = String

type Double = scala.Double

type Duration = scala.Double

type EncryptionKeyArn = String

type EngineType = String

type EntryPointArgument = String

type EntryPointArguments = js.Array[EntryPointArgument]

type EntryPointPath = String

type HiveCliParameters = String

type IAMRoleArn = String

type InitScriptPath = String

type InitialCapacityConfigMap = StringDictionary[InitialCapacityConfig]

type Integer = scala.Double

type JobArn = String

type JobRunId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SUBMITTED
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.SCHEDULED
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.SUCCESS
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.CANCELLING
  - typings.awsSdk.awsSdkStrings.CANCELLED
  - java.lang.String
*/
type JobRunState = _JobRunState | String

type JobRunStateSet = js.Array[JobRunState]

type JobRunType = String

type JobRuns = js.Array[JobRunSummary]

type ListApplicationsRequestMaxResultsInteger = scala.Double

type ListJobRunsRequestMaxResultsInteger = scala.Double

type MemorySize = String

type NextToken = String

type Query = String

type ReleaseLabel = String

type RequestIdentityUserArn = String

type ResourceArn = String

type SecurityGroupIds = js.Array[SecurityGroupString]

type SecurityGroupString = String

type SensitivePropertiesMap = StringDictionary[String1024]

type SparkSubmitParameters = String

type String1024 = String

type String256 = String

type SubnetIds = js.Array[SubnetString]

type SubnetString = String

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = String

type UriString = String

type WorkerCounts = scala.Double

type WorkerTypeString = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2021-07-13`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
