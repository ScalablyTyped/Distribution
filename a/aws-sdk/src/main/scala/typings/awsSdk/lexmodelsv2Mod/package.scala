package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.BotLocaleName
import typings.awsSdk.awsSdkStrings.BotName
import typings.awsSdk.awsSdkStrings.ExportResourceType
import typings.awsSdk.awsSdkStrings.IntentName
import typings.awsSdk.awsSdkStrings.LastUpdatedDateTime
import typings.awsSdk.awsSdkStrings.Lex_
import typings.awsSdk.awsSdkStrings.SlotName
import typings.awsSdk.awsSdkStrings.UseSlotValuesAsCustomVocabulary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AggregatedUtterancesFilterName = typings.awsSdk.awsSdkStrings.Utterance | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CO
  - typings.awsSdk.awsSdkStrings.EQ
  - java.lang.String
*/
type AggregatedUtterancesFilterOperator = _AggregatedUtterancesFilterOperator | java.lang.String

type AggregatedUtterancesFilters = js.Array[AggregatedUtterancesFilter]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.HitCount
  - typings.awsSdk.awsSdkStrings.MissedCount
  - java.lang.String
*/
type AggregatedUtterancesSortAttribute = _AggregatedUtterancesSortAttribute | java.lang.String

type AggregatedUtterancesSummaryList = js.Array[AggregatedUtterancesSummary]

type AmazonResourceName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IntentId
  - typings.awsSdk.awsSdkStrings.SlotTypeId
  - java.lang.String
*/
type AssociatedTranscriptFilterName = _AssociatedTranscriptFilterName | java.lang.String

type AssociatedTranscriptFilters = js.Array[AssociatedTranscriptFilter]

type AssociatedTranscriptList = js.Array[AssociatedTranscript]

type AttachmentTitle = java.lang.String

type AttachmentUrl = java.lang.String

type AudioLogSettingsList = js.Array[AudioLogSetting]

type AudioRecognitionStrategy = UseSlotValuesAsCustomVocabulary | java.lang.String

type Boolean = scala.Boolean

type BotAliasHistoryEventsList = js.Array[BotAliasHistoryEvent]

type BotAliasId = java.lang.String

type BotAliasLocaleSettingsMap = StringDictionary[BotAliasLocaleSettings]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Creating_
  - typings.awsSdk.awsSdkStrings.Available_
  - typings.awsSdk.awsSdkStrings.Deleting_
  - typings.awsSdk.awsSdkStrings.Failed_
  - java.lang.String
*/
type BotAliasStatus = _BotAliasStatus | java.lang.String

type BotAliasSummaryList = js.Array[BotAliasSummary]

type BotFilterName = BotName | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CO
  - typings.awsSdk.awsSdkStrings.EQ
  - java.lang.String
*/
type BotFilterOperator = _BotFilterOperator | java.lang.String

type BotFilters = js.Array[BotFilter]

type BotLocaleFilterName = BotLocaleName | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CO
  - typings.awsSdk.awsSdkStrings.EQ
  - java.lang.String
*/
type BotLocaleFilterOperator = _BotLocaleFilterOperator | java.lang.String

type BotLocaleFilters = js.Array[BotLocaleFilter]

type BotLocaleHistoryEventDescription = java.lang.String

type BotLocaleHistoryEventsList = js.Array[BotLocaleHistoryEvent]

type BotLocaleSortAttribute = BotLocaleName | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Creating_
  - typings.awsSdk.awsSdkStrings.Building_
  - typings.awsSdk.awsSdkStrings.Built
  - typings.awsSdk.awsSdkStrings.ReadyExpressTesting
  - typings.awsSdk.awsSdkStrings.Failed_
  - typings.awsSdk.awsSdkStrings.Deleting_
  - typings.awsSdk.awsSdkStrings.NotBuilt
  - typings.awsSdk.awsSdkStrings.Importing_
  - typings.awsSdk.awsSdkStrings.Processing_
  - java.lang.String
*/
type BotLocaleStatus = _BotLocaleStatus | java.lang.String

type BotLocaleSummaryList = js.Array[BotLocaleSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Processing_
  - typings.awsSdk.awsSdkStrings.Deleting_
  - typings.awsSdk.awsSdkStrings.Deleted_
  - typings.awsSdk.awsSdkStrings.Downloading_
  - typings.awsSdk.awsSdkStrings.Updating_
  - typings.awsSdk.awsSdkStrings.Available_
  - typings.awsSdk.awsSdkStrings.Failed_
  - typings.awsSdk.awsSdkStrings.Stopping_
  - typings.awsSdk.awsSdkStrings.Stopped_
  - java.lang.String
*/
type BotRecommendationStatus = _BotRecommendationStatus | java.lang.String

type BotRecommendationSummaryList = js.Array[BotRecommendationSummary]

type BotSortAttribute = BotName | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Creating_
  - typings.awsSdk.awsSdkStrings.Available_
  - typings.awsSdk.awsSdkStrings.Inactive_
  - typings.awsSdk.awsSdkStrings.Deleting_
  - typings.awsSdk.awsSdkStrings.Failed_
  - typings.awsSdk.awsSdkStrings.Versioning
  - typings.awsSdk.awsSdkStrings.Importing_
  - java.lang.String
*/
type BotStatus = _BotStatus | java.lang.String

type BotSummaryList = js.Array[BotSummary]

type BotVersion = java.lang.String

type BotVersionLocaleSpecification = StringDictionary[BotVersionLocaleDetails]

type BotVersionSortAttribute = typings.awsSdk.awsSdkStrings.BotVersion | java.lang.String

type BotVersionSummaryList = js.Array[BotVersionSummary]

type BoxedBoolean = scala.Boolean

type BuiltInIntentSortAttribute = typings.awsSdk.awsSdkStrings.IntentSignature | java.lang.String

type BuiltInIntentSummaryList = js.Array[BuiltInIntentSummary]

type BuiltInOrCustomSlotTypeId = java.lang.String

type BuiltInSlotTypeSortAttribute = typings.awsSdk.awsSdkStrings.SlotTypeSignature | java.lang.String

type BuiltInSlotTypeSummaryList = js.Array[BuiltInSlotTypeSummary]

type BuiltInsMaxResults = Double

type ButtonText = java.lang.String

type ButtonValue = java.lang.String

type ButtonsList = js.Array[Button]

type ChildDirected = scala.Boolean

type CloudWatchLogGroupArn = java.lang.String

type CodeHookInterfaceVersion = java.lang.String

type ConditionExpression = java.lang.String

type ConditionKey = java.lang.String

type ConditionKeyValueMap = StringDictionary[ConditionValue]

type ConditionMap = StringDictionary[ConditionKeyValueMap]

type ConditionOperator = java.lang.String

type ConditionValue = java.lang.String

type ConditionalBranches = js.Array[ConditionalBranch]

type ConfidenceThreshold = Double

type ContextTimeToLiveInSeconds = Double

type ContextTurnsToLive = Double

type Count = Double

type CustomPayloadValue = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Ready_
  - typings.awsSdk.awsSdkStrings.Deleting_
  - typings.awsSdk.awsSdkStrings.Exporting
  - typings.awsSdk.awsSdkStrings.Importing_
  - typings.awsSdk.awsSdkStrings.Creating_
  - java.lang.String
*/
type CustomVocabularyStatus = _CustomVocabularyStatus | java.lang.String

type DTMFCharacter = java.lang.String

type Description = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ElicitIntent
  - typings.awsSdk.awsSdkStrings.StartIntent
  - typings.awsSdk.awsSdkStrings.ElicitSlot
  - typings.awsSdk.awsSdkStrings.EvaluateConditional
  - typings.awsSdk.awsSdkStrings.InvokeDialogCodeHook
  - typings.awsSdk.awsSdkStrings.ConfirmIntent
  - typings.awsSdk.awsSdkStrings.FulfillIntent
  - typings.awsSdk.awsSdkStrings.CloseIntent
  - typings.awsSdk.awsSdkStrings.EndConversation
  - java.lang.String
*/
type DialogActionType = _DialogActionType | java.lang.String

type DraftBotVersion = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Allow_
  - typings.awsSdk.awsSdkStrings.Deny_
  - java.lang.String
*/
type Effect = _Effect | java.lang.String

type ExportFilterName = ExportResourceType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CO
  - typings.awsSdk.awsSdkStrings.EQ
  - java.lang.String
*/
type ExportFilterOperator = _ExportFilterOperator | java.lang.String

type ExportFilters = js.Array[ExportFilter]

type ExportSortAttribute = LastUpdatedDateTime | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.InProgress_
  - typings.awsSdk.awsSdkStrings.Completed_
  - typings.awsSdk.awsSdkStrings.Failed_
  - typings.awsSdk.awsSdkStrings.Deleting_
  - java.lang.String
*/
type ExportStatus = _ExportStatus | java.lang.String

type ExportSummaryList = js.Array[ExportSummary]

type FailureReason = java.lang.String

type FailureReasons = js.Array[FailureReason]

type FilePassword = java.lang.String

type FilterValue = java.lang.String

type FilterValues = js.Array[FilterValue]

type FulfillmentStartResponseDelay = Double

type FulfillmentTimeout = Double

type FulfillmentUpdateResponseFrequency = Double

type HitCount = Double

type Id = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LexJson
  - typings.awsSdk.awsSdkStrings.TSV
  - java.lang.String
*/
type ImportExportFileFormat = _ImportExportFileFormat | java.lang.String

type ImportExportFilePassword = java.lang.String

type ImportFilterName = typings.awsSdk.awsSdkStrings.ImportResourceType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CO
  - typings.awsSdk.awsSdkStrings.EQ
  - java.lang.String
*/
type ImportFilterOperator = _ImportFilterOperator | java.lang.String

type ImportFilters = js.Array[ImportFilter]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Bot_
  - typings.awsSdk.awsSdkStrings.BotLocale
  - typings.awsSdk.awsSdkStrings.CustomVocabulary
  - java.lang.String
*/
type ImportResourceType = _ImportResourceType | java.lang.String

type ImportSortAttribute = LastUpdatedDateTime | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.InProgress_
  - typings.awsSdk.awsSdkStrings.Completed_
  - typings.awsSdk.awsSdkStrings.Failed_
  - typings.awsSdk.awsSdkStrings.Deleting_
  - java.lang.String
*/
type ImportStatus = _ImportStatus | java.lang.String

type ImportSummaryList = js.Array[ImportSummary]

type ImportedResourceId = java.lang.String

type InputContextsList = js.Array[InputContext]

type IntentFilterName = IntentName | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CO
  - typings.awsSdk.awsSdkStrings.EQ
  - java.lang.String
*/
type IntentFilterOperator = _IntentFilterOperator | java.lang.String

type IntentFilters = js.Array[IntentFilter]

type IntentSignature = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IntentName
  - typings.awsSdk.awsSdkStrings.LastUpdatedDateTime
  - java.lang.String
*/
type IntentSortAttribute = _IntentSortAttribute | java.lang.String

type IntentSummaryList = js.Array[IntentSummary]

type KendraIndexArn = java.lang.String

type KmsKeyArn = java.lang.String

type LambdaARN = java.lang.String

type LocaleId = java.lang.String

type LocaleName = java.lang.String

type LogPrefix = java.lang.String

type MaxResults = Double

type MaxUtteranceDigits = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Overwrite_
  - typings.awsSdk.awsSdkStrings.FailOnConflict
  - typings.awsSdk.awsSdkStrings.Append_
  - java.lang.String
*/
type MergeStrategy = _MergeStrategy | java.lang.String

type MessageGroupsList = js.Array[MessageGroup]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Random_
  - typings.awsSdk.awsSdkStrings.Ordered
  - java.lang.String
*/
type MessageSelectionStrategy = _MessageSelectionStrategy | java.lang.String

type MessageVariationsList = js.Array[Message]

type MissedCount = Double

type Name = java.lang.String

type NextIndex = Double

type NextToken = java.lang.String

type NonEmptyString = java.lang.String

type NumericalBotVersion = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.None_
  - typings.awsSdk.awsSdkStrings.DefaultObfuscation
  - java.lang.String
*/
type ObfuscationSettingType = _ObfuscationSettingType | java.lang.String

type ObjectPrefix = java.lang.String

type ObjectPrefixes = js.Array[ObjectPrefix]

type Operation = java.lang.String

type OperationList = js.Array[Operation]

type OutputContextsList = js.Array[OutputContext]

type PlainTextMessageValue = java.lang.String

type Policy = java.lang.String

type PresignedS3Url = java.lang.String

type PrincipalArn = java.lang.String

type PrincipalList = js.Array[Principal]

type PriorityValue = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Initial_
  - typings.awsSdk.awsSdkStrings.Retry1
  - typings.awsSdk.awsSdkStrings.Retry2
  - typings.awsSdk.awsSdkStrings.Retry3
  - typings.awsSdk.awsSdkStrings.Retry4
  - typings.awsSdk.awsSdkStrings.Retry5
  - java.lang.String
*/
type PromptAttempt = _PromptAttempt | java.lang.String

type PromptAttemptsSpecificationMap = StringDictionary[PromptAttemptSpecification]

type PromptMaxRetries = Double

type QueryFilterString = java.lang.String

type RecommendedAction = java.lang.String

type RecommendedActions = js.Array[RecommendedAction]

type RecommendedIntentSummaryList = js.Array[RecommendedIntentSummary]

type RegexPattern = java.lang.String

type ResourceCount = Double

type RevisionId = java.lang.String

type RoleArn = java.lang.String

type S3BucketArn = java.lang.String

type S3BucketName = java.lang.String

type S3ObjectPath = java.lang.String

type SSMLMessageValue = java.lang.String

type SampleUtterancesCount = Double

type SampleUtterancesList = js.Array[SampleUtterance]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Ascending_
  - typings.awsSdk.awsSdkStrings.Descending_
  - java.lang.String
*/
type SearchOrder = _SearchOrder | java.lang.String

type ServicePrincipal = java.lang.String

type SessionId = java.lang.String

type SessionTTL = Double

type SkipResourceInUseCheck = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Required_
  - typings.awsSdk.awsSdkStrings.Optional_
  - java.lang.String
*/
type SlotConstraint = _SlotConstraint | java.lang.String

type SlotDefaultValueList = js.Array[SlotDefaultValue]

type SlotDefaultValueString = java.lang.String

type SlotFilterName = SlotName | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CO
  - typings.awsSdk.awsSdkStrings.EQ
  - java.lang.String
*/
type SlotFilterOperator = _SlotFilterOperator | java.lang.String

type SlotFilters = js.Array[SlotFilter]

type SlotPrioritiesList = js.Array[SlotPriority]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Scalar
  - typings.awsSdk.awsSdkStrings.List_
  - java.lang.String
*/
type SlotShape = _SlotShape | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SlotName
  - typings.awsSdk.awsSdkStrings.LastUpdatedDateTime
  - java.lang.String
*/
type SlotSortAttribute = _SlotSortAttribute | java.lang.String

type SlotSummaryList = js.Array[SlotSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Custom_
  - typings.awsSdk.awsSdkStrings.Extended_
  - typings.awsSdk.awsSdkStrings.ExternalGrammar
  - typings.awsSdk.awsSdkStrings.Composite
  - java.lang.String
*/
type SlotTypeCategory = _SlotTypeCategory | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SlotTypeName
  - typings.awsSdk.awsSdkStrings.ExternalSourceType
  - java.lang.String
*/
type SlotTypeFilterName = _SlotTypeFilterName | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CO
  - typings.awsSdk.awsSdkStrings.EQ
  - java.lang.String
*/
type SlotTypeFilterOperator = _SlotTypeFilterOperator | java.lang.String

type SlotTypeFilters = js.Array[SlotTypeFilter]

type SlotTypeSignature = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SlotTypeName
  - typings.awsSdk.awsSdkStrings.LastUpdatedDateTime
  - java.lang.String
*/
type SlotTypeSortAttribute = _SlotTypeSortAttribute | java.lang.String

type SlotTypeSummaryList = js.Array[SlotTypeSummary]

type SlotTypeValues = js.Array[SlotTypeValue]

type SlotValueOverrideMap = StringDictionary[SlotValueOverride]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.OriginalValue
  - typings.awsSdk.awsSdkStrings.TopResolution
  - typings.awsSdk.awsSdkStrings.Concatenation
  - java.lang.String
*/
type SlotValueResolutionStrategy = _SlotValueResolutionStrategy | java.lang.String

type SlotValues = js.Array[SlotValueOverride]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Ascending_
  - typings.awsSdk.awsSdkStrings.Descending_
  - java.lang.String
*/
type SortOrder = _SortOrder | java.lang.String

type StillWaitingResponseFrequency = Double

type StillWaitingResponseTimeout = Double

type String = java.lang.String

type StringMap = StringDictionary[String]

type SubSlotExpression = java.lang.String

type SubSlotSpecificationMap = StringDictionary[Specifications]

type SubSlotTypeList = js.Array[SubSlotTypeComposition]

type SynonymList = js.Array[SampleValue]

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagMap = StringDictionary[TagValue]

type TagValue = java.lang.String

type TextLogSettingsList = js.Array[TextLogSetting]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Hours_
  - typings.awsSdk.awsSdkStrings.Days_
  - typings.awsSdk.awsSdkStrings.Weeks_
  - java.lang.String
*/
type TimeDimension = _TimeDimension | java.lang.String

type TimeInMilliSeconds = Double

type TimeValue = Double

type Timestamp = js.Date

type Transcript = java.lang.String

type TranscriptFormat = Lex_ | java.lang.String

type Utterance = java.lang.String

type Value = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.standard__
  - typings.awsSdk.awsSdkStrings.neural
  - java.lang.String
*/
type VoiceEngine = _VoiceEngine | java.lang.String

type VoiceId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2020-08-07`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
