package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object cognitosyncMod {
  type ApplicationArn = java.lang.String
  type ApplicationArnList = js.Array[typings.awsSdk.cognitosyncMod.ApplicationArn]
  type AssumeRoleArn = java.lang.String
  type Boolean = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NOT_STARTED
    - typings.awsSdk.awsSdkStrings.IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.SUCCEEDED
    - java.lang.String
  */
  type BulkPublishStatus = typings.awsSdk.cognitosyncMod._BulkPublishStatus | java.lang.String
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.cognitosyncMod.ClientApiVersions
  type ClientContext = java.lang.String
  type CognitoEventType = java.lang.String
  type DatasetList = js.Array[typings.awsSdk.cognitosyncMod.Dataset]
  type DatasetName = java.lang.String
  type Date = typings.std.Date
  type DeviceId = java.lang.String
  type Events = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.cognitosyncMod.LambdaFunctionArn]
  type IdentityId = java.lang.String
  type IdentityPoolId = java.lang.String
  type IdentityPoolUsageList = js.Array[typings.awsSdk.cognitosyncMod.IdentityPoolUsage]
  type Integer = scala.Double
  type IntegerString = scala.Double
  type LambdaFunctionArn = java.lang.String
  type Long = scala.Double
  type MergedDatasetNameList = js.Array[typings.awsSdk.cognitosyncMod.String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.replace_
    - typings.awsSdk.awsSdkStrings.remove__
    - java.lang.String
  */
  type Operation = typings.awsSdk.cognitosyncMod._Operation | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.APNS
    - typings.awsSdk.awsSdkStrings.APNS_SANDBOX
    - typings.awsSdk.awsSdkStrings.GCM
    - typings.awsSdk.awsSdkStrings.ADM
    - java.lang.String
  */
  type Platform = typings.awsSdk.cognitosyncMod._Platform | java.lang.String
  type PushToken = java.lang.String
  type RecordKey = java.lang.String
  type RecordList = js.Array[typings.awsSdk.cognitosyncMod.Record]
  type RecordPatchList = js.Array[typings.awsSdk.cognitosyncMod.RecordPatch]
  type RecordValue = java.lang.String
  type StreamName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLED
    - typings.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type StreamingStatus = typings.awsSdk.cognitosyncMod._StreamingStatus | java.lang.String
  type String = java.lang.String
  type SyncSessionToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2014-06-30`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.cognitosyncMod._apiVersion | java.lang.String
}
