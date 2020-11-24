package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object lexmodelbuildingserviceMod {
  
  type AliasName = java.lang.String
  
  type AliasNameOrListAll = java.lang.String
  
  type AmazonResourceName = java.lang.String
  
  type Boolean = scala.Boolean
  
  type BotAliasMetadataList = js.Array[typings.awsSdk.lexmodelbuildingserviceMod.BotAliasMetadata]
  
  type BotChannelAssociationList = js.Array[typings.awsSdk.lexmodelbuildingserviceMod.BotChannelAssociation]
  
  type BotChannelName = java.lang.String
  
  type BotMetadataList = js.Array[typings.awsSdk.lexmodelbuildingserviceMod.BotMetadata]
  
  type BotName = java.lang.String
  
  type BotVersions = js.Array[typings.awsSdk.lexmodelbuildingserviceMod.Version]
  
  type BuiltinIntentMetadataList = js.Array[typings.awsSdk.lexmodelbuildingserviceMod.BuiltinIntentMetadata]
  
  type BuiltinIntentSignature = java.lang.String
  
  type BuiltinIntentSlotList = js.Array[typings.awsSdk.lexmodelbuildingserviceMod.BuiltinIntentSlot]
  
  type BuiltinSlotTypeMetadataList = js.Array[typings.awsSdk.lexmodelbuildingserviceMod.BuiltinSlotTypeMetadata]
  
  type BuiltinSlotTypeSignature = java.lang.String
  
  type ChannelConfigurationMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.lexmodelbuildingserviceMod.String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.CREATED
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type ChannelStatus = typings.awsSdk.lexmodelbuildingserviceMod._ChannelStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Facebook
    - typings.awsSdk.awsSdkStrings.Slack
    - typings.awsSdk.awsSdkStrings.`Twilio-Sms`
    - typings.awsSdk.awsSdkStrings.Kik_
    - java.lang.String
  */
  type ChannelType = typings.awsSdk.lexmodelbuildingserviceMod._ChannelType | java.lang.String
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.lexmodelbuildingserviceMod.ClientApiVersions
  
  type ConfidenceThreshold = scala.Double
  
  type ContentString = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PlainText_
    - typings.awsSdk.awsSdkStrings.SSML
    - typings.awsSdk.awsSdkStrings.CustomPayload
    - java.lang.String
  */
  type ContentType = typings.awsSdk.lexmodelbuildingserviceMod._ContentType | java.lang.String
  
  type ContextTimeToLiveInSeconds = scala.Double
  
  type ContextTurnsToLive = scala.Double
  
  type Count = scala.Double
  
  type CustomOrBuiltinSlotTypeName = java.lang.String
  
  type Description = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CLOUDWATCH_LOGS
    - typings.awsSdk.awsSdkStrings.S3
    - java.lang.String
  */
  type Destination = typings.awsSdk.lexmodelbuildingserviceMod._Destination | java.lang.String
  
  type EnumerationValues = js.Array[typings.awsSdk.lexmodelbuildingserviceMod.EnumerationValue]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.READY
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type ExportStatus = typings.awsSdk.lexmodelbuildingserviceMod._ExportStatus | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ALEXA_SKILLS_KIT
    - typings.awsSdk.awsSdkStrings.LEX
    - java.lang.String
  */
  type ExportType = typings.awsSdk.lexmodelbuildingserviceMod._ExportType | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ReturnIntent
    - typings.awsSdk.awsSdkStrings.CodeHook
    - java.lang.String
  */
  type FulfillmentActivityType = typings.awsSdk.lexmodelbuildingserviceMod._FulfillmentActivityType | java.lang.String
  
  type GroupNumber = scala.Double
  
  type IamRoleArn = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.COMPLETE
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type ImportStatus = typings.awsSdk.lexmodelbuildingserviceMod._ImportStatus | java.lang.String
  
  type InputContextList = js.Array[typings.awsSdk.lexmodelbuildingserviceMod.InputContext]
  
  type InputContextName = java.lang.String
  
  type IntentList = js.Array[typings.awsSdk.lexmodelbuildingserviceMod.Intent]
  
  type IntentMetadataList = js.Array[typings.awsSdk.lexmodelbuildingserviceMod.IntentMetadata]
  
  type IntentName = java.lang.String
  
  type IntentUtteranceList = js.Array[typings.awsSdk.lexmodelbuildingserviceMod.Utterance]
  
  type KendraIndexArn = java.lang.String
  
  type KmsKeyArn = java.lang.String
  
  type LambdaARN = java.lang.String
  
  type ListOfUtterance = js.Array[typings.awsSdk.lexmodelbuildingserviceMod.UtteranceData]
  
  type ListsOfUtterances = js.Array[typings.awsSdk.lexmodelbuildingserviceMod.UtteranceList]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`de-DE`
    - typings.awsSdk.awsSdkStrings.`en-AU`
    - typings.awsSdk.awsSdkStrings.`en-GB`
    - typings.awsSdk.awsSdkStrings.`en-US`
    - typings.awsSdk.awsSdkStrings.`es-ES`
    - typings.awsSdk.awsSdkStrings.`es-US`
    - typings.awsSdk.awsSdkStrings.`fr-FR`
    - typings.awsSdk.awsSdkStrings.`fr-CA`
    - typings.awsSdk.awsSdkStrings.`it-IT`
    - java.lang.String
  */
  type Locale = typings.awsSdk.lexmodelbuildingserviceMod._Locale | java.lang.String
  
  type LocaleList = js.Array[typings.awsSdk.lexmodelbuildingserviceMod.Locale]
  
  type LogSettingsRequestList = js.Array[typings.awsSdk.lexmodelbuildingserviceMod.LogSettingsRequest]
  
  type LogSettingsResponseList = js.Array[typings.awsSdk.lexmodelbuildingserviceMod.LogSettingsResponse]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AUDIO
    - typings.awsSdk.awsSdkStrings.TEXT
    - java.lang.String
  */
  type LogType = typings.awsSdk.lexmodelbuildingserviceMod._LogType | java.lang.String
  
  type MaxResults = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.OVERWRITE_LATEST
    - typings.awsSdk.awsSdkStrings.FAIL_ON_CONFLICT
    - java.lang.String
  */
  type MergeStrategy = typings.awsSdk.lexmodelbuildingserviceMod._MergeStrategy | java.lang.String
  
  type MessageList = js.Array[typings.awsSdk.lexmodelbuildingserviceMod.Message]
  
  type MessageVersion = java.lang.String
  
  type Name = java.lang.String
  
  type NextToken = java.lang.String
  
  type NumericalVersion = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NONE
    - typings.awsSdk.awsSdkStrings.DEFAULT_OBFUSCATION
    - java.lang.String
  */
  type ObfuscationSetting = typings.awsSdk.lexmodelbuildingserviceMod._ObfuscationSetting | java.lang.String
  
  type OutputContextList = js.Array[typings.awsSdk.lexmodelbuildingserviceMod.OutputContext]
  
  type OutputContextName = java.lang.String
  
  type Priority = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.SAVE
    - typings.awsSdk.awsSdkStrings.BUILD
    - java.lang.String
  */
  type ProcessBehavior = typings.awsSdk.lexmodelbuildingserviceMod._ProcessBehavior | java.lang.String
  
  type PromptMaxAttempts = scala.Double
  
  type QueryFilterString = java.lang.String
  
  type RegexPattern = java.lang.String
  
  type ResourceArn = java.lang.String
  
  type ResourcePrefix = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.BOT
    - typings.awsSdk.awsSdkStrings.INTENT
    - typings.awsSdk.awsSdkStrings.SLOT_TYPE
    - java.lang.String
  */
  type ResourceType = typings.awsSdk.lexmodelbuildingserviceMod._ResourceType | java.lang.String
  
  type ResponseCard = java.lang.String
  
  type SessionTTL = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Required_
    - typings.awsSdk.awsSdkStrings.Optional_
    - java.lang.String
  */
  type SlotConstraint = typings.awsSdk.lexmodelbuildingserviceMod._SlotConstraint | java.lang.String
  
  type SlotDefaultValueList = js.Array[typings.awsSdk.lexmodelbuildingserviceMod.SlotDefaultValue]
  
  type SlotDefaultValueString = java.lang.String
  
  type SlotList = js.Array[typings.awsSdk.lexmodelbuildingserviceMod.Slot]
  
  type SlotName = java.lang.String
  
  type SlotTypeConfigurations = js.Array[typings.awsSdk.lexmodelbuildingserviceMod.SlotTypeConfiguration]
  
  type SlotTypeMetadataList = js.Array[typings.awsSdk.lexmodelbuildingserviceMod.SlotTypeMetadata]
  
  type SlotTypeName = java.lang.String
  
  type SlotUtteranceList = js.Array[typings.awsSdk.lexmodelbuildingserviceMod.Utterance]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ORIGINAL_VALUE
    - typings.awsSdk.awsSdkStrings.TOP_RESOLUTION
    - java.lang.String
  */
  type SlotValueSelectionStrategy = typings.awsSdk.lexmodelbuildingserviceMod._SlotValueSelectionStrategy | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.BUILDING
    - typings.awsSdk.awsSdkStrings.READY
    - typings.awsSdk.awsSdkStrings.READY_BASIC_TESTING
    - typings.awsSdk.awsSdkStrings.FAILED
    - typings.awsSdk.awsSdkStrings.NOT_BUILT
    - java.lang.String
  */
  type Status = typings.awsSdk.lexmodelbuildingserviceMod._Status | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Detected
    - typings.awsSdk.awsSdkStrings.Missed_
    - java.lang.String
  */
  type StatusType = typings.awsSdk.lexmodelbuildingserviceMod._StatusType | java.lang.String
  
  type String = java.lang.String
  
  type StringList = js.Array[typings.awsSdk.lexmodelbuildingserviceMod.String]
  
  type SynonymList = js.Array[typings.awsSdk.lexmodelbuildingserviceMod.Value]
  
  type TagKey = java.lang.String
  
  type TagKeyList = js.Array[typings.awsSdk.lexmodelbuildingserviceMod.TagKey]
  
  type TagList = js.Array[typings.awsSdk.lexmodelbuildingserviceMod.Tag]
  
  type TagValue = java.lang.String
  
  type Timestamp = typings.std.Date
  
  type UserId = java.lang.String
  
  type Utterance = java.lang.String
  
  type UtteranceString = java.lang.String
  
  type Value = java.lang.String
  
  type Version = java.lang.String
  
  type _Blob = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.lexmodelbuildingserviceMod.Blob | java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2017-04-19`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.lexmodelbuildingserviceMod._apiVersion | java.lang.String
  
  type roleArn = java.lang.String
}
