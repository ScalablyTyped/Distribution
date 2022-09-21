package typings.awsSdk.syntheticsMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type BaseScreenshotConfigIgnoreCoordinate = java.lang.String

type BaseScreenshotIgnoreCoordinates = js.Array[BaseScreenshotConfigIgnoreCoordinate]

type BaseScreenshots = js.Array[BaseScreenshot]

type Canaries = js.Array[Canary]

type CanariesLastRun = js.Array[CanaryLastRun]

type CanaryArn = java.lang.String

type CanaryName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.PASSED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type CanaryRunState = _CanaryRunState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CANARY_FAILURE
  - typings.awsSdk.awsSdkStrings.EXECUTION_FAILURE
  - java.lang.String
*/
type CanaryRunStateReasonCode = _CanaryRunStateReasonCode | java.lang.String

type CanaryRuns = js.Array[CanaryRun]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.READY
  - typings.awsSdk.awsSdkStrings.STARTING
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.STOPPING
  - typings.awsSdk.awsSdkStrings.STOPPED
  - typings.awsSdk.awsSdkStrings.ERROR
  - typings.awsSdk.awsSdkStrings.DELETING
  - java.lang.String
*/
type CanaryState = _CanaryState | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INVALID_PERMISSIONS
  - typings.awsSdk.awsSdkStrings.CREATE_PENDING
  - typings.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.CREATE_FAILED
  - typings.awsSdk.awsSdkStrings.UPDATE_PENDING
  - typings.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.UPDATE_COMPLETE
  - typings.awsSdk.awsSdkStrings.ROLLBACK_COMPLETE
  - typings.awsSdk.awsSdkStrings.ROLLBACK_FAILED
  - typings.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.DELETE_FAILED
  - typings.awsSdk.awsSdkStrings.SYNC_DELETE_IN_PROGRESS
  - java.lang.String
*/
type CanaryStateReasonCode = _CanaryStateReasonCode | java.lang.String

type CodeHandler = java.lang.String

type DescribeCanariesLastRunNameFilter = js.Array[CanaryName]

type DescribeCanariesNameFilter = js.Array[CanaryName]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SSE_S3
  - typings.awsSdk.awsSdkStrings.SSE_KMS
  - java.lang.String
*/
type EncryptionMode = _EncryptionMode | java.lang.String

type EnvironmentVariableName = java.lang.String

type EnvironmentVariableValue = java.lang.String

type EnvironmentVariablesMap = StringDictionary[EnvironmentVariableValue]

type FunctionArn = java.lang.String

type GroupArn = java.lang.String

type GroupIdentifier = java.lang.String

type GroupName = java.lang.String

type GroupSummaryList = js.Array[GroupSummary]

type KmsKeyArn = java.lang.String

type MaxCanaryResults = Double

type MaxFifteenMinutesInSeconds = Double

type MaxGroupResults = Double

type MaxOneYearInSeconds = Double

type MaxSize100 = Double

type MaxSize1024 = Double

type MaxSize3008 = Double

type NullableBoolean = Boolean

type PaginationToken = java.lang.String

type ResourceArn = java.lang.String

type RoleArn = java.lang.String

type RuntimeVersionList = js.Array[RuntimeVersion]

type SecurityGroupId = java.lang.String

type SecurityGroupIds = js.Array[SecurityGroupId]

type String = java.lang.String

type StringList = js.Array[String]

type SubnetId = java.lang.String

type SubnetIds = js.Array[SubnetId]

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = java.lang.String

type Timestamp = js.Date

type Token = java.lang.String

type UUID = java.lang.String

type VpcId = java.lang.String

type _Blob = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2017-10-11`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
