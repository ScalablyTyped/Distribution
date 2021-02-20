package typings.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object syntheticsMod {
  
  type Canaries = js.Array[typings.awsSdk.syntheticsMod.Canary]
  
  type CanariesLastRun = js.Array[typings.awsSdk.syntheticsMod.CanaryLastRun]
  
  type CanaryArn = java.lang.String
  
  type CanaryName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.RUNNING
    - typings.awsSdk.awsSdkStrings.PASSED
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type CanaryRunState = typings.awsSdk.syntheticsMod._CanaryRunState | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CANARY_FAILURE
    - typings.awsSdk.awsSdkStrings.EXECUTION_FAILURE
    - java.lang.String
  */
  type CanaryRunStateReasonCode = typings.awsSdk.syntheticsMod._CanaryRunStateReasonCode | java.lang.String
  
  type CanaryRuns = js.Array[typings.awsSdk.syntheticsMod.CanaryRun]
  
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
  type CanaryState = typings.awsSdk.syntheticsMod._CanaryState | java.lang.String
  
  type CanaryStateReasonCode = typings.awsSdk.awsSdkStrings.INVALID_PERMISSIONS | java.lang.String
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.syntheticsMod.ClientApiVersions
  
  type EnvironmentVariableName = java.lang.String
  
  type EnvironmentVariableValue = java.lang.String
  
  type EnvironmentVariablesMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.syntheticsMod.EnvironmentVariableValue]
  
  type FunctionArn = java.lang.String
  
  type MaxCanaryResults = scala.Double
  
  type MaxFifteenMinutesInSeconds = scala.Double
  
  type MaxOneYearInSeconds = scala.Double
  
  type MaxSize100 = scala.Double
  
  type MaxSize1024 = scala.Double
  
  type MaxSize3008 = scala.Double
  
  type NullableBoolean = scala.Boolean
  
  type RoleArn = java.lang.String
  
  type RuntimeVersionList = js.Array[typings.awsSdk.syntheticsMod.RuntimeVersion]
  
  type SecurityGroupId = java.lang.String
  
  type SecurityGroupIds = js.Array[typings.awsSdk.syntheticsMod.SecurityGroupId]
  
  type String = java.lang.String
  
  type SubnetId = java.lang.String
  
  type SubnetIds = js.Array[typings.awsSdk.syntheticsMod.SubnetId]
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typings.awsSdk.syntheticsMod.TagKey]
  
  type TagMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.syntheticsMod.TagValue]
  
  type TagValue = java.lang.String
  
  type Timestamp = typings.std.Date
  
  type Token = java.lang.String
  
  type UUID = java.lang.String
  
  type VpcId = java.lang.String
  
  type _Blob = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.syntheticsMod.Blob | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2017-10-11`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.syntheticsMod._apiVersion | java.lang.String
}
