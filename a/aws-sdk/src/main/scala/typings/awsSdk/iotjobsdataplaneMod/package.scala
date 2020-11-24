package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object iotjobsdataplaneMod {
  
  type ApproximateSecondsBeforeTimedOut = scala.Double
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.iotjobsdataplaneMod.ClientApiVersions
  
  type DescribeJobExecutionJobId = java.lang.String
  
  type DetailsKey = java.lang.String
  
  type DetailsMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.iotjobsdataplaneMod.DetailsValue]
  
  type DetailsValue = java.lang.String
  
  type ExecutionNumber = scala.Double
  
  type ExpectedVersion = scala.Double
  
  type IncludeExecutionState = scala.Boolean
  
  type IncludeJobDocument = scala.Boolean
  
  type JobDocument = java.lang.String
  
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
  type JobExecutionStatus = typings.awsSdk.iotjobsdataplaneMod._JobExecutionStatus | java.lang.String
  
  type JobExecutionSummaryList = js.Array[typings.awsSdk.iotjobsdataplaneMod.JobExecutionSummary]
  
  type JobId = java.lang.String
  
  type LastUpdatedAt = scala.Double
  
  type QueuedAt = scala.Double
  
  type StartedAt = scala.Double
  
  type StepTimeoutInMinutes = scala.Double
  
  type ThingName = java.lang.String
  
  type VersionNumber = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2017-09-29`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.iotjobsdataplaneMod._apiVersion | java.lang.String
}
