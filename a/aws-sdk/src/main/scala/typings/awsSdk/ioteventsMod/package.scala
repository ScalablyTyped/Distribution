package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ioteventsMod {
  type Actions = js.Array[typings.awsSdk.ioteventsMod.Action]
  type AmazonResourceName = java.lang.String
  type AssetId = java.lang.String
  type AssetPropertyAlias = java.lang.String
  type AssetPropertyBooleanValue = java.lang.String
  type AssetPropertyDoubleValue = java.lang.String
  type AssetPropertyEntryId = java.lang.String
  type AssetPropertyId = java.lang.String
  type AssetPropertyIntegerValue = java.lang.String
  type AssetPropertyOffsetInNanos = java.lang.String
  type AssetPropertyQuality = java.lang.String
  type AssetPropertyStringValue = java.lang.String
  type AssetPropertyTimeInSeconds = java.lang.String
  type AttributeJsonPath = java.lang.String
  type Attributes = js.Array[typings.awsSdk.ioteventsMod.Attribute]
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.ioteventsMod.ClientApiVersions
  type Condition = java.lang.String
  type ContentExpression = java.lang.String
  type DeliveryStreamName = java.lang.String
  type DetectorDebugOptions = js.Array[typings.awsSdk.ioteventsMod.DetectorDebugOption]
  type DetectorModelArn = java.lang.String
  type DetectorModelDescription = java.lang.String
  type DetectorModelName = java.lang.String
  type DetectorModelSummaries = js.Array[typings.awsSdk.ioteventsMod.DetectorModelSummary]
  type DetectorModelVersion = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.ACTIVATING
    - typings.awsSdk.awsSdkStrings.INACTIVE
    - typings.awsSdk.awsSdkStrings.DEPRECATED
    - typings.awsSdk.awsSdkStrings.DRAFT
    - typings.awsSdk.awsSdkStrings.PAUSED
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type DetectorModelVersionStatus = typings.awsSdk.ioteventsMod._DetectorModelVersionStatus | java.lang.String
  type DetectorModelVersionSummaries = js.Array[typings.awsSdk.ioteventsMod.DetectorModelVersionSummary]
  type DynamoKeyField = java.lang.String
  type DynamoKeyType = java.lang.String
  type DynamoKeyValue = java.lang.String
  type DynamoOperation = java.lang.String
  type DynamoTableName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.BATCH
    - typings.awsSdk.awsSdkStrings.SERIAL
    - java.lang.String
  */
  type EvaluationMethod = typings.awsSdk.ioteventsMod._EvaluationMethod | java.lang.String
  type EventName = java.lang.String
  type Events = js.Array[typings.awsSdk.ioteventsMod.Event]
  type FirehoseSeparator = java.lang.String
  type InputArn = java.lang.String
  type InputDescription = java.lang.String
  type InputName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.UPDATING
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.DELETING
    - java.lang.String
  */
  type InputStatus = typings.awsSdk.ioteventsMod._InputStatus | java.lang.String
  type InputSummaries = js.Array[typings.awsSdk.ioteventsMod.InputSummary]
  type KeyValue = java.lang.String
  type LoggingEnabled = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ERROR
    - typings.awsSdk.awsSdkStrings.INFO
    - typings.awsSdk.awsSdkStrings.DEBUG
    - java.lang.String
  */
  type LoggingLevel = typings.awsSdk.ioteventsMod._LoggingLevel | java.lang.String
  type MQTTTopic = java.lang.String
  type MaxResults = scala.Double
  type NextToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.STRING
    - typings.awsSdk.awsSdkStrings.JSON
    - java.lang.String
  */
  type PayloadType = typings.awsSdk.ioteventsMod._PayloadType | java.lang.String
  type QueueUrl = java.lang.String
  type Seconds = scala.Double
  type StateName = java.lang.String
  type States = js.Array[typings.awsSdk.ioteventsMod.State]
  type TagKey = java.lang.String
  type TagKeys = js.Array[typings.awsSdk.ioteventsMod.TagKey]
  type TagValue = java.lang.String
  type Tags = js.Array[typings.awsSdk.ioteventsMod.Tag]
  type TimerName = java.lang.String
  type Timestamp = typings.std.Date
  type TransitionEvents = js.Array[typings.awsSdk.ioteventsMod.TransitionEvent]
  type UseBase64 = scala.Boolean
  type VariableName = java.lang.String
  type VariableValue = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2018-07-27`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.ioteventsMod._apiVersion | java.lang.String
}
