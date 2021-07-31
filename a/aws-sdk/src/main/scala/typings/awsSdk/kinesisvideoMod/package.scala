package typings.awsSdk.kinesisvideoMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PUT_MEDIA
  - typings.awsSdk.awsSdkStrings.GET_MEDIA
  - typings.awsSdk.awsSdkStrings.LIST_FRAGMENTS
  - typings.awsSdk.awsSdkStrings.GET_MEDIA_FOR_FRAGMENT_LIST
  - typings.awsSdk.awsSdkStrings.GET_HLS_STREAMING_SESSION_URL
  - typings.awsSdk.awsSdkStrings.GET_DASH_STREAMING_SESSION_URL
  - typings.awsSdk.awsSdkStrings.GET_CLIP
  - java.lang.String
*/
type APIName = typings.awsSdk.kinesisvideoMod._APIName | java.lang.String

type ChannelInfoList = js.Array[typings.awsSdk.kinesisvideoMod.ChannelInfo]

type ChannelName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.WSS
  - typings.awsSdk.awsSdkStrings.HTTPS
  - java.lang.String
*/
type ChannelProtocol = typings.awsSdk.kinesisvideoMod._ChannelProtocol | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MASTER
  - typings.awsSdk.awsSdkStrings.VIEWER
  - java.lang.String
*/
type ChannelRole = typings.awsSdk.kinesisvideoMod._ChannelRole | java.lang.String

type ChannelType = typings.awsSdk.awsSdkStrings.SINGLE_MASTER | java.lang.String

type ComparisonOperator = typings.awsSdk.awsSdkStrings.BEGINS_WITH | java.lang.String

type DataEndpoint = java.lang.String

type DataRetentionChangeInHours = scala.Double

type DataRetentionInHours = scala.Double

type DeviceName = java.lang.String

type KmsKeyId = java.lang.String

type ListOfProtocols = js.Array[typings.awsSdk.kinesisvideoMod.ChannelProtocol]

type ListStreamsInputLimit = scala.Double

type MediaType = java.lang.String

type MessageTtlSeconds = scala.Double

type NextToken = java.lang.String

type ResourceARN = java.lang.String

type ResourceEndpoint = java.lang.String

type ResourceEndpointList = js.Array[typings.awsSdk.kinesisvideoMod.ResourceEndpointListItem]

type ResourceTags = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.kinesisvideoMod.TagValue]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.DELETING
  - java.lang.String
*/
type Status = typings.awsSdk.kinesisvideoMod._Status | java.lang.String

type StreamInfoList = js.Array[typings.awsSdk.kinesisvideoMod.StreamInfo]

type StreamName = java.lang.String

type TagKey = java.lang.String

type TagKeyList = js.Array[typings.awsSdk.kinesisvideoMod.TagKey]

type TagList = js.Array[typings.awsSdk.kinesisvideoMod.Tag]

type TagOnCreateList = js.Array[typings.awsSdk.kinesisvideoMod.Tag]

type TagValue = java.lang.String

type Timestamp = typings.std.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.INCREASE_DATA_RETENTION
  - typings.awsSdk.awsSdkStrings.DECREASE_DATA_RETENTION
  - java.lang.String
*/
type UpdateDataRetentionOperation = typings.awsSdk.kinesisvideoMod._UpdateDataRetentionOperation | java.lang.String

type Version = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2017-09-30`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = typings.awsSdk.kinesisvideoMod._apiVersion | java.lang.String
