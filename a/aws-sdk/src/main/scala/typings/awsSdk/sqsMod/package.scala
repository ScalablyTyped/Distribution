package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object sqsMod {
  type AWSAccountIdList = js.Array[typings.awsSdk.sqsMod.String]
  type ActionNameList = js.Array[typings.awsSdk.sqsMod.String]
  type AttributeNameList = js.Array[typings.awsSdk.sqsMod.QueueAttributeName]
  type BatchResultErrorEntryList = js.Array[typings.awsSdk.sqsMod.BatchResultErrorEntry]
  type Binary = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.sqsMod.Blob | java.lang.String
  type BinaryList = js.Array[typings.awsSdk.sqsMod.Binary]
  type Boolean = scala.Boolean
  type BoxedInteger = scala.Double
  type ChangeMessageVisibilityBatchRequestEntryList = js.Array[typings.awsSdk.sqsMod.ChangeMessageVisibilityBatchRequestEntry]
  type ChangeMessageVisibilityBatchResultEntryList = js.Array[typings.awsSdk.sqsMod.ChangeMessageVisibilityBatchResultEntry]
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.sqsMod.ClientApiVersions
  type DeleteMessageBatchRequestEntryList = js.Array[typings.awsSdk.sqsMod.DeleteMessageBatchRequestEntry]
  type DeleteMessageBatchResultEntryList = js.Array[typings.awsSdk.sqsMod.DeleteMessageBatchResultEntry]
  type Integer = scala.Double
  type MessageAttributeName = java.lang.String
  type MessageAttributeNameList = js.Array[typings.awsSdk.sqsMod.MessageAttributeName]
  type MessageBodyAttributeMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.sqsMod.MessageAttributeValue]
  type MessageBodySystemAttributeMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.sqsMod.MessageSystemAttributeValue]
  type MessageList = js.Array[typings.awsSdk.sqsMod.Message]
  type MessageSystemAttributeMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.sqsMod.String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SenderId
    - typings.awsSdk.awsSdkStrings.SentTimestamp
    - typings.awsSdk.awsSdkStrings.ApproximateReceiveCount
    - typings.awsSdk.awsSdkStrings.ApproximateFirstReceiveTimestamp
    - typings.awsSdk.awsSdkStrings.SequenceNumber
    - typings.awsSdk.awsSdkStrings.MessageDeduplicationId
    - typings.awsSdk.awsSdkStrings.MessageGroupId
    - typings.awsSdk.awsSdkStrings.AWSTraceHeader
    - java.lang.String
  */
  type MessageSystemAttributeName = typings.awsSdk.sqsMod._MessageSystemAttributeName | java.lang.String
  type MessageSystemAttributeNameForSends = typings.awsSdk.awsSdkStrings.AWSTraceHeader | java.lang.String
  type QueueAttributeMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.sqsMod.String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.All_
    - typings.awsSdk.awsSdkStrings.Policy_
    - typings.awsSdk.awsSdkStrings.VisibilityTimeout
    - typings.awsSdk.awsSdkStrings.MaximumMessageSize
    - typings.awsSdk.awsSdkStrings.MessageRetentionPeriod
    - typings.awsSdk.awsSdkStrings.ApproximateNumberOfMessages
    - typings.awsSdk.awsSdkStrings.ApproximateNumberOfMessagesNotVisible
    - typings.awsSdk.awsSdkStrings.CreatedTimestamp
    - typings.awsSdk.awsSdkStrings.LastModifiedTimestamp
    - typings.awsSdk.awsSdkStrings.QueueArn
    - typings.awsSdk.awsSdkStrings.ApproximateNumberOfMessagesDelayed
    - typings.awsSdk.awsSdkStrings.DelaySeconds
    - typings.awsSdk.awsSdkStrings.ReceiveMessageWaitTimeSeconds
    - typings.awsSdk.awsSdkStrings.RedrivePolicy
    - typings.awsSdk.awsSdkStrings.FifoQueue
    - typings.awsSdk.awsSdkStrings.ContentBasedDeduplication
    - typings.awsSdk.awsSdkStrings.KmsMasterKeyId
    - typings.awsSdk.awsSdkStrings.KmsDataKeyReusePeriodSeconds
    - java.lang.String
  */
  type QueueAttributeName = typings.awsSdk.sqsMod._QueueAttributeName | java.lang.String
  type QueueUrlList = js.Array[typings.awsSdk.sqsMod.String]
  type SendMessageBatchRequestEntryList = js.Array[typings.awsSdk.sqsMod.SendMessageBatchRequestEntry]
  type SendMessageBatchResultEntryList = js.Array[typings.awsSdk.sqsMod.SendMessageBatchResultEntry]
  type String = java.lang.String
  type StringList = js.Array[typings.awsSdk.sqsMod.String]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typings.awsSdk.sqsMod.TagKey]
  type TagMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.sqsMod.TagValue]
  type TagValue = java.lang.String
  type Token = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2012-11-05`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.sqsMod._apiVersion | java.lang.String
}
