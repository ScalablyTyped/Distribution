package typings.awsSdk.lexruntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Accept = java.lang.String

type ActiveContextName = java.lang.String

type ActiveContextParametersMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.lexruntimeMod.Text]

type ActiveContextTimeToLiveInSeconds = scala.Double

type ActiveContextTurnsToLive = scala.Double

type ActiveContextsList = js.Array[typings.awsSdk.lexruntimeMod.ActiveContext]

type ActiveContextsString = java.lang.String

type AttributesString = java.lang.String

type BlobStream = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.lexruntimeMod.Blob | java.lang.String | typings.node.streamMod.Readable

type BotAlias = java.lang.String

type BotName = java.lang.String

type BotVersion = java.lang.String

type ButtonTextStringWithLength = java.lang.String

type ButtonValueStringWithLength = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.None_
  - typings.awsSdk.awsSdkStrings.Confirmed_
  - typings.awsSdk.awsSdkStrings.Denied_
  - java.lang.String
*/
type ConfirmationStatus = typings.awsSdk.lexruntimeMod._ConfirmationStatus | java.lang.String

type ContentType = typings.awsSdk.awsSdkStrings.applicationSlashvndDotamazonawsDotcardDotgeneric | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ElicitIntent
  - typings.awsSdk.awsSdkStrings.ConfirmIntent
  - typings.awsSdk.awsSdkStrings.ElicitSlot
  - typings.awsSdk.awsSdkStrings.Close
  - typings.awsSdk.awsSdkStrings.Delegate
  - java.lang.String
*/
type DialogActionType = typings.awsSdk.lexruntimeMod._DialogActionType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ElicitIntent
  - typings.awsSdk.awsSdkStrings.ConfirmIntent
  - typings.awsSdk.awsSdkStrings.ElicitSlot
  - typings.awsSdk.awsSdkStrings.Fulfilled_
  - typings.awsSdk.awsSdkStrings.ReadyForFulfillment
  - typings.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
type DialogState = typings.awsSdk.lexruntimeMod._DialogState | java.lang.String

type Double = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Fulfilled_
  - typings.awsSdk.awsSdkStrings.Failed_
  - typings.awsSdk.awsSdkStrings.ReadyForFulfillment
  - java.lang.String
*/
type FulfillmentState = typings.awsSdk.lexruntimeMod._FulfillmentState | java.lang.String

type HttpContentType = java.lang.String

type IntentList = js.Array[typings.awsSdk.lexruntimeMod.PredictedIntent]

type IntentName = java.lang.String

type IntentSummaryCheckpointLabel = java.lang.String

type IntentSummaryList = js.Array[typings.awsSdk.lexruntimeMod.IntentSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PlainText_
  - typings.awsSdk.awsSdkStrings.CustomPayload
  - typings.awsSdk.awsSdkStrings.SSML
  - typings.awsSdk.awsSdkStrings.Composite
  - java.lang.String
*/
type MessageFormatType = typings.awsSdk.lexruntimeMod._MessageFormatType | java.lang.String

type ParameterName = java.lang.String

type SentimentLabel = java.lang.String

type SentimentScore = java.lang.String

type String = java.lang.String

type StringMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.lexruntimeMod.String]

type StringUrlWithLength = java.lang.String

type StringWithLength = java.lang.String

type Text = java.lang.String

type UserId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2016-11-28`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = typings.awsSdk.lexruntimeMod._apiVersion | java.lang.String

type genericAttachmentList = js.Array[typings.awsSdk.lexruntimeMod.GenericAttachment]

type listOfButtons = js.Array[typings.awsSdk.lexruntimeMod.Button]
