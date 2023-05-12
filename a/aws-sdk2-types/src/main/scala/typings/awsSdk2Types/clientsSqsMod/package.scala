package typings.awsSdk2Types.clientsSqsMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk2Types.awsSdk2TypesStrings.AWSTraceHeader
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AWSAccountIdList = js.Array[String]

type ActionNameList = js.Array[String]

type AttributeNameList = js.Array[QueueAttributeName]

type BatchResultErrorEntryList = js.Array[BatchResultErrorEntry]

type Binary = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String

type BinaryList = js.Array[Binary]

type Boolean = scala.Boolean

type BoxedInteger = Double

type ChangeMessageVisibilityBatchRequestEntryList = js.Array[ChangeMessageVisibilityBatchRequestEntry]

type ChangeMessageVisibilityBatchResultEntryList = js.Array[ChangeMessageVisibilityBatchResultEntry]

type DeleteMessageBatchRequestEntryList = js.Array[DeleteMessageBatchRequestEntry]

type DeleteMessageBatchResultEntryList = js.Array[DeleteMessageBatchResultEntry]

type Integer = Double

type MessageAttributeName = java.lang.String

type MessageAttributeNameList = js.Array[MessageAttributeName]

type MessageBodyAttributeMap = StringDictionary[MessageAttributeValue]

type MessageBodySystemAttributeMap = StringDictionary[MessageSystemAttributeValue]

type MessageList = js.Array[Message]

type MessageSystemAttributeMap = StringDictionary[String]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.SenderId
  - typings.awsSdk2Types.awsSdk2TypesStrings.SentTimestamp
  - typings.awsSdk2Types.awsSdk2TypesStrings.ApproximateReceiveCount
  - typings.awsSdk2Types.awsSdk2TypesStrings.ApproximateFirstReceiveTimestamp
  - typings.awsSdk2Types.awsSdk2TypesStrings.SequenceNumber
  - typings.awsSdk2Types.awsSdk2TypesStrings.MessageDeduplicationId
  - typings.awsSdk2Types.awsSdk2TypesStrings.MessageGroupId
  - typings.awsSdk2Types.awsSdk2TypesStrings.AWSTraceHeader
  - java.lang.String
*/
type MessageSystemAttributeName = _MessageSystemAttributeName | java.lang.String

type MessageSystemAttributeNameForSends = AWSTraceHeader | java.lang.String

type QueueAttributeMap = StringDictionary[String]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.All_
  - typings.awsSdk2Types.awsSdk2TypesStrings.Policy
  - typings.awsSdk2Types.awsSdk2TypesStrings.VisibilityTimeout
  - typings.awsSdk2Types.awsSdk2TypesStrings.MaximumMessageSize
  - typings.awsSdk2Types.awsSdk2TypesStrings.MessageRetentionPeriod
  - typings.awsSdk2Types.awsSdk2TypesStrings.ApproximateNumberOfMessages
  - typings.awsSdk2Types.awsSdk2TypesStrings.ApproximateNumberOfMessagesNotVisible
  - typings.awsSdk2Types.awsSdk2TypesStrings.CreatedTimestamp
  - typings.awsSdk2Types.awsSdk2TypesStrings.LastModifiedTimestamp
  - typings.awsSdk2Types.awsSdk2TypesStrings.QueueArn
  - typings.awsSdk2Types.awsSdk2TypesStrings.ApproximateNumberOfMessagesDelayed
  - typings.awsSdk2Types.awsSdk2TypesStrings.DelaySeconds
  - typings.awsSdk2Types.awsSdk2TypesStrings.ReceiveMessageWaitTimeSeconds
  - typings.awsSdk2Types.awsSdk2TypesStrings.RedrivePolicy
  - typings.awsSdk2Types.awsSdk2TypesStrings.FifoQueue
  - typings.awsSdk2Types.awsSdk2TypesStrings.ContentBasedDeduplication
  - typings.awsSdk2Types.awsSdk2TypesStrings.KmsMasterKeyId
  - typings.awsSdk2Types.awsSdk2TypesStrings.KmsDataKeyReusePeriodSeconds
  - typings.awsSdk2Types.awsSdk2TypesStrings.DeduplicationScope
  - typings.awsSdk2Types.awsSdk2TypesStrings.FifoThroughputLimit
  - typings.awsSdk2Types.awsSdk2TypesStrings.RedriveAllowPolicy
  - typings.awsSdk2Types.awsSdk2TypesStrings.SqsManagedSseEnabled
  - java.lang.String
*/
type QueueAttributeName = _QueueAttributeName | java.lang.String

type QueueUrlList = js.Array[String]

type SendMessageBatchRequestEntryList = js.Array[SendMessageBatchRequestEntry]

type SendMessageBatchResultEntryList = js.Array[SendMessageBatchResultEntry]

type String = java.lang.String

type StringList = js.Array[String]

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = java.lang.String

type Token = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk2Types.awsSdk2TypesStrings.`2012-11-05`
  - typings.awsSdk2Types.awsSdk2TypesStrings.latest
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
