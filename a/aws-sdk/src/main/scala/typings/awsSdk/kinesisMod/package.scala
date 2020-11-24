package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object kinesisMod {
  
  type BooleanObject = scala.Boolean
  
  type ChildShardList = js.Array[typings.awsSdk.kinesisMod.ChildShard]
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.kinesisMod.ClientApiVersions
  
  type ConsumerARN = java.lang.String
  
  type ConsumerCountObject = scala.Double
  
  type ConsumerList = js.Array[typings.awsSdk.kinesisMod.Consumer]
  
  type ConsumerName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.DELETING
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - java.lang.String
  */
  type ConsumerStatus = typings.awsSdk.kinesisMod._ConsumerStatus | java.lang.String
  
  type Data = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.kinesisMod.Blob | java.lang.String
  
  type DescribeStreamInputLimit = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NONE
    - typings.awsSdk.awsSdkStrings.KMS
    - java.lang.String
  */
  type EncryptionType = typings.awsSdk.kinesisMod._EncryptionType | java.lang.String
  
  type EnhancedMonitoringList = js.Array[typings.awsSdk.kinesisMod.EnhancedMetrics]
  
  type ErrorCode = java.lang.String
  
  type ErrorMessage = java.lang.String
  
  type GetRecordsInputLimit = scala.Double
  
  type HashKey = java.lang.String
  
  type KeyId = java.lang.String
  
  type ListShardsInputLimit = scala.Double
  
  type ListStreamConsumersInputLimit = scala.Double
  
  type ListStreamsInputLimit = scala.Double
  
  type ListTagsForStreamInputLimit = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.IncomingBytes
    - typings.awsSdk.awsSdkStrings.IncomingRecords
    - typings.awsSdk.awsSdkStrings.OutgoingBytes
    - typings.awsSdk.awsSdkStrings.OutgoingRecords
    - typings.awsSdk.awsSdkStrings.WriteProvisionedThroughputExceeded
    - typings.awsSdk.awsSdkStrings.ReadProvisionedThroughputExceeded
    - typings.awsSdk.awsSdkStrings.IteratorAgeMilliseconds
    - typings.awsSdk.awsSdkStrings.ALL
    - java.lang.String
  */
  type MetricsName = typings.awsSdk.kinesisMod._MetricsName | java.lang.String
  
  type MetricsNameList = js.Array[typings.awsSdk.kinesisMod.MetricsName]
  
  type MillisBehindLatest = scala.Double
  
  type NextToken = java.lang.String
  
  type PartitionKey = java.lang.String
  
  type PositiveIntegerObject = scala.Double
  
  type PutRecordsRequestEntryList = js.Array[typings.awsSdk.kinesisMod.PutRecordsRequestEntry]
  
  type PutRecordsResultEntryList = js.Array[typings.awsSdk.kinesisMod.PutRecordsResultEntry]
  
  type RecordList = js.Array[typings.awsSdk.kinesisMod.Record]
  
  type RetentionPeriodHours = scala.Double
  
  type ScalingType = typings.awsSdk.awsSdkStrings.UNIFORM_SCALING | java.lang.String
  
  type SequenceNumber = java.lang.String
  
  type ShardCountObject = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AFTER_SHARD_ID
    - typings.awsSdk.awsSdkStrings.AT_TRIM_HORIZON
    - typings.awsSdk.awsSdkStrings.FROM_TRIM_HORIZON
    - typings.awsSdk.awsSdkStrings.AT_LATEST
    - typings.awsSdk.awsSdkStrings.AT_TIMESTAMP
    - typings.awsSdk.awsSdkStrings.FROM_TIMESTAMP
    - java.lang.String
  */
  type ShardFilterType = typings.awsSdk.kinesisMod._ShardFilterType | java.lang.String
  
  type ShardId = java.lang.String
  
  type ShardIdList = js.Array[typings.awsSdk.kinesisMod.ShardId]
  
  type ShardIterator = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AT_SEQUENCE_NUMBER
    - typings.awsSdk.awsSdkStrings.AFTER_SEQUENCE_NUMBER
    - typings.awsSdk.awsSdkStrings.TRIM_HORIZON
    - typings.awsSdk.awsSdkStrings.LATEST
    - typings.awsSdk.awsSdkStrings.AT_TIMESTAMP
    - java.lang.String
  */
  type ShardIteratorType = typings.awsSdk.kinesisMod._ShardIteratorType | java.lang.String
  
  type ShardList = js.Array[typings.awsSdk.kinesisMod.Shard]
  
  type StreamARN = java.lang.String
  
  type StreamName = java.lang.String
  
  type StreamNameList = js.Array[typings.awsSdk.kinesisMod.StreamName]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CREATING
    - typings.awsSdk.awsSdkStrings.DELETING
    - typings.awsSdk.awsSdkStrings.ACTIVE
    - typings.awsSdk.awsSdkStrings.UPDATING
    - java.lang.String
  */
  type StreamStatus = typings.awsSdk.kinesisMod._StreamStatus | java.lang.String
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typings.awsSdk.kinesisMod.TagKey]
  
  type TagList = js.Array[typings.awsSdk.kinesisMod.Tag]
  
  type TagMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.kinesisMod.TagValue]
  
  type TagValue = java.lang.String
  
  type Timestamp = typings.std.Date
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2013-12-02`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.kinesisMod._apiVersion | java.lang.String
}
