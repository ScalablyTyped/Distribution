package typings.awsSdk.ivschatMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ChatToken = java.lang.String

type ChatTokenAttributes = StringDictionary[String]

type ChatTokenCapabilities = js.Array[ChatTokenCapability]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SEND_MESSAGE
  - typings.awsSdk.awsSdkStrings.DISCONNECT_USER
  - typings.awsSdk.awsSdkStrings.DELETE_MESSAGE
  - java.lang.String
*/
type ChatTokenCapability = _ChatTokenCapability | java.lang.String

type EventAttributes = StringDictionary[String]

type EventName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ALLOW
  - typings.awsSdk.awsSdkStrings.DENY
  - java.lang.String
*/
type FallbackResult = _FallbackResult | java.lang.String

type ID = java.lang.String

type LambdaArn = java.lang.String

type MaxRoomResults = Double

type MessageID = java.lang.String

type PaginationToken = java.lang.String

type Reason = java.lang.String

type ResourceArn = java.lang.String

type RoomArn = java.lang.String

type RoomID = java.lang.String

type RoomIdentifier = java.lang.String

type RoomList = js.Array[RoomSummary]

type RoomMaxMessageLength = Double

type RoomMaxMessageRatePerSecond = Double

type RoomName = java.lang.String

type SessionDurationInMinutes = Double

type String = java.lang.String

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagValue = java.lang.String

type Tags = StringDictionary[TagValue]

type Time = js.Date

type UserID = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2020-07-14`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
