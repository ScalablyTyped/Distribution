package typings.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object dynamodbstreamsMod {
  
  type AttributeMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.dynamodbstreamsMod.AttributeValue]
  
  type AttributeName = java.lang.String
  
  type BinaryAttributeValue = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.dynamodbstreamsMod.Blob | java.lang.String
  
  type BinarySetAttributeValue = js.Array[typings.awsSdk.dynamodbstreamsMod.BinaryAttributeValue]
  
  type BooleanAttributeValue = scala.Boolean
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.dynamodbstreamsMod.ClientApiVersions
  
  type Date = typings.std.Date
  
  type KeySchema = js.Array[typings.awsSdk.dynamodbstreamsMod.KeySchemaElement]
  
  type KeySchemaAttributeName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.HASH
    - typings.awsSdk.awsSdkStrings.RANGE
    - java.lang.String
  */
  type KeyType = typings.awsSdk.dynamodbstreamsMod._KeyType | java.lang.String
  
  type ListAttributeValue = js.Array[typings.awsSdk.dynamodbstreamsMod.AttributeValue]
  
  type MapAttributeValue = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.dynamodbstreamsMod.AttributeValue]
  
  type NullAttributeValue = scala.Boolean
  
  type NumberAttributeValue = java.lang.String
  
  type NumberSetAttributeValue = js.Array[typings.awsSdk.dynamodbstreamsMod.NumberAttributeValue]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.INSERT
    - typings.awsSdk.awsSdkStrings.MODIFY
    - typings.awsSdk.awsSdkStrings.REMOVE
    - java.lang.String
  */
  type OperationType = typings.awsSdk.dynamodbstreamsMod._OperationType | java.lang.String
  
  type PositiveIntegerObject = scala.Double
  
  type PositiveLongObject = scala.Double
  
  type RecordList = js.Array[typings.awsSdk.dynamodbstreamsMod.Record]
  
  type SequenceNumber = java.lang.String
  
  type ShardDescriptionList = js.Array[typings.awsSdk.dynamodbstreamsMod.Shard]
  
  type ShardId = java.lang.String
  
  type ShardIterator = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.TRIM_HORIZON
    - typings.awsSdk.awsSdkStrings.LATEST
    - typings.awsSdk.awsSdkStrings.AT_SEQUENCE_NUMBER
    - typings.awsSdk.awsSdkStrings.AFTER_SEQUENCE_NUMBER
    - java.lang.String
  */
  type ShardIteratorType = typings.awsSdk.dynamodbstreamsMod._ShardIteratorType | java.lang.String
  
  type StreamArn = java.lang.String
  
  type StreamList = js.Array[typings.awsSdk.dynamodbstreamsMod.Stream]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ENABLING
    - typings.awsSdk.awsSdkStrings.ENABLED
    - typings.awsSdk.awsSdkStrings.DISABLING
    - typings.awsSdk.awsSdkStrings.DISABLED
    - java.lang.String
  */
  type StreamStatus = typings.awsSdk.dynamodbstreamsMod._StreamStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NEW_IMAGE
    - typings.awsSdk.awsSdkStrings.OLD_IMAGE
    - typings.awsSdk.awsSdkStrings.NEW_AND_OLD_IMAGES
    - typings.awsSdk.awsSdkStrings.KEYS_ONLY
    - java.lang.String
  */
  type StreamViewType = typings.awsSdk.dynamodbstreamsMod._StreamViewType | java.lang.String
  
  type String = java.lang.String
  
  type StringAttributeValue = java.lang.String
  
  type StringSetAttributeValue = js.Array[typings.awsSdk.dynamodbstreamsMod.StringAttributeValue]
  
  type TableName = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2012-08-10`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.dynamodbstreamsMod._apiVersion | java.lang.String
}
