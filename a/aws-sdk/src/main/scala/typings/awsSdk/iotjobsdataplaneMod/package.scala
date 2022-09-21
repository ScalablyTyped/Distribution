package typings.awsSdk.iotjobsdataplaneMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ApproximateSecondsBeforeTimedOut = Double

type DescribeJobExecutionJobId = String

type DetailsKey = String

type DetailsMap = StringDictionary[DetailsValue]

type DetailsValue = String

type ExecutionNumber = Double

type ExpectedVersion = Double

type IncludeExecutionState = Boolean

type IncludeJobDocument = Boolean

type JobDocument = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.QUEUED
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.TIMED_OUT
  - typings.awsSdk.awsSdkStrings.REJECTED
  - typings.awsSdk.awsSdkStrings.REMOVED
  - typings.awsSdk.awsSdkStrings.CANCELED
  - java.lang.String
*/
type JobExecutionStatus = _JobExecutionStatus | String

type JobExecutionSummaryList = js.Array[JobExecutionSummary]

type JobId = String

type LastUpdatedAt = Double

type QueuedAt = Double

type StartedAt = Double

type StepTimeoutInMinutes = Double

type ThingName = String

type VersionNumber = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2017-09-29`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
