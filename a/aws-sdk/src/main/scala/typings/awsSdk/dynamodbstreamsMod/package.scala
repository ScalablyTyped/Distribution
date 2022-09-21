package typings.awsSdk.dynamodbstreamsMod

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AttributeMap = StringDictionary[AttributeValue]

type AttributeName = java.lang.String

type BinaryAttributeValue = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String

type BinarySetAttributeValue = js.Array[BinaryAttributeValue]

type BooleanAttributeValue = Boolean

type Date = js.Date

type KeySchema = js.Array[KeySchemaElement]

type KeySchemaAttributeName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HASH
  - typings.awsSdk.awsSdkStrings.RANGE
  - java.lang.String
*/
type KeyType = _KeyType | java.lang.String

type ListAttributeValue = js.Array[AttributeValue]

type MapAttributeValue = StringDictionary[AttributeValue]

type NullAttributeValue = Boolean

type NumberAttributeValue = java.lang.String

type NumberSetAttributeValue = js.Array[NumberAttributeValue]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INSERT
  - typings.awsSdk.awsSdkStrings.MODIFY
  - typings.awsSdk.awsSdkStrings.REMOVE
  - java.lang.String
*/
type OperationType = _OperationType | java.lang.String

type PositiveIntegerObject = Double

type PositiveLongObject = Double

type RecordList = js.Array[Record]

type SequenceNumber = java.lang.String

type ShardDescriptionList = js.Array[Shard]

type ShardId = java.lang.String

type ShardIterator = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TRIM_HORIZON
  - typings.awsSdk.awsSdkStrings.LATEST
  - typings.awsSdk.awsSdkStrings.AT_SEQUENCE_NUMBER
  - typings.awsSdk.awsSdkStrings.AFTER_SEQUENCE_NUMBER
  - java.lang.String
*/
type ShardIteratorType = _ShardIteratorType | java.lang.String

type StreamArn = java.lang.String

type StreamList = js.Array[Stream]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ENABLING
  - typings.awsSdk.awsSdkStrings.ENABLED
  - typings.awsSdk.awsSdkStrings.DISABLING
  - typings.awsSdk.awsSdkStrings.DISABLED
  - java.lang.String
*/
type StreamStatus = _StreamStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NEW_IMAGE
  - typings.awsSdk.awsSdkStrings.OLD_IMAGE
  - typings.awsSdk.awsSdkStrings.NEW_AND_OLD_IMAGES
  - typings.awsSdk.awsSdkStrings.KEYS_ONLY
  - java.lang.String
*/
type StreamViewType = _StreamViewType | java.lang.String

type String = java.lang.String

type StringAttributeValue = java.lang.String

type StringSetAttributeValue = js.Array[StringAttributeValue]

type TableName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2012-08-10`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
