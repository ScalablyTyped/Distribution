package typings.awsSdk.clientsTranscribeserviceMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.EXACT
import typings.awsSdk.awsSdkStrings.PHI
import typings.awsSdk.awsSdkStrings.PII
import typings.awsSdk.awsSdkStrings.PRIMARYCARE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NarrowBand
  - typings.awsSdk.awsSdkStrings.WideBand
  - java.lang.String
*/
type BaseModelName = _BaseModelName | String

type Boolean = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`en-US`
  - typings.awsSdk.awsSdkStrings.`hi-IN`
  - typings.awsSdk.awsSdkStrings.`es-US`
  - typings.awsSdk.awsSdkStrings.`en-GB`
  - typings.awsSdk.awsSdkStrings.`en-AU`
  - typings.awsSdk.awsSdkStrings.`de-DE`
  - typings.awsSdk.awsSdkStrings.`ja-JP`
  - java.lang.String
*/
type CLMLanguageCode = _CLMLanguageCode | String

type CallAnalyticsJobName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.QUEUED
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - java.lang.String
*/
type CallAnalyticsJobStatus = _CallAnalyticsJobStatus | String

type CallAnalyticsJobSummaries = js.Array[CallAnalyticsJobSummary]

type CategoryName = String

type CategoryPropertiesList = js.Array[CategoryProperties]

type ChannelDefinitions = js.Array[ChannelDefinition]

type ChannelId = Double

type DataAccessRoleArn = String

type DateTime = js.Date

type DurationInSeconds = Double

type FailureReason = String

type IdentifiedLanguageScore = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.REAL_TIME
  - typings.awsSdk.awsSdkStrings.POST_CALL
  - java.lang.String
*/
type InputType = _InputType | String

type KMSEncryptionContextMap = StringDictionary[NonEmptyString]

type KMSKeyId = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`af-ZA`
  - typings.awsSdk.awsSdkStrings.`ar-AE`
  - typings.awsSdk.awsSdkStrings.`ar-SA`
  - typings.awsSdk.awsSdkStrings.`da-DK`
  - typings.awsSdk.awsSdkStrings.`de-CH`
  - typings.awsSdk.awsSdkStrings.`de-DE`
  - typings.awsSdk.awsSdkStrings.`en-AB`
  - typings.awsSdk.awsSdkStrings.`en-AU`
  - typings.awsSdk.awsSdkStrings.`en-GB`
  - typings.awsSdk.awsSdkStrings.`en-IE`
  - typings.awsSdk.awsSdkStrings.`en-IN`
  - typings.awsSdk.awsSdkStrings.`en-US`
  - typings.awsSdk.awsSdkStrings.`en-WL`
  - typings.awsSdk.awsSdkStrings.`es-ES`
  - typings.awsSdk.awsSdkStrings.`es-US`
  - typings.awsSdk.awsSdkStrings.`fa-IR`
  - typings.awsSdk.awsSdkStrings.`fr-CA`
  - typings.awsSdk.awsSdkStrings.`fr-FR`
  - typings.awsSdk.awsSdkStrings.`he-IL`
  - typings.awsSdk.awsSdkStrings.`hi-IN`
  - typings.awsSdk.awsSdkStrings.`id-ID`
  - typings.awsSdk.awsSdkStrings.`it-IT`
  - typings.awsSdk.awsSdkStrings.`ja-JP`
  - typings.awsSdk.awsSdkStrings.`ko-KR`
  - typings.awsSdk.awsSdkStrings.`ms-MY`
  - typings.awsSdk.awsSdkStrings.`nl-NL`
  - typings.awsSdk.awsSdkStrings.`pt-BR`
  - typings.awsSdk.awsSdkStrings.`pt-PT`
  - typings.awsSdk.awsSdkStrings.`ru-RU`
  - typings.awsSdk.awsSdkStrings.`ta-IN`
  - typings.awsSdk.awsSdkStrings.`te-IN`
  - typings.awsSdk.awsSdkStrings.`tr-TR`
  - typings.awsSdk.awsSdkStrings.`zh-CN`
  - typings.awsSdk.awsSdkStrings.`zh-TW`
  - typings.awsSdk.awsSdkStrings.`th-TH`
  - typings.awsSdk.awsSdkStrings.`en-ZA`
  - typings.awsSdk.awsSdkStrings.`en-NZ`
  - typings.awsSdk.awsSdkStrings.`vi-VN`
  - typings.awsSdk.awsSdkStrings.`sv-SE`
  - java.lang.String
*/
type LanguageCode = _LanguageCode | String

type LanguageCodeList = js.Array[LanguageCodeItem]

type LanguageIdSettingsMap = StringDictionary[LanguageIdSettings]

type LanguageOptions = js.Array[LanguageCode]

type MaxAlternatives = Double

type MaxResults = Double

type MaxSpeakers = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.mp3_
  - typings.awsSdk.awsSdkStrings.mp4_
  - typings.awsSdk.awsSdkStrings.wav__
  - typings.awsSdk.awsSdkStrings.flac
  - typings.awsSdk.awsSdkStrings.ogg
  - typings.awsSdk.awsSdkStrings.amr
  - typings.awsSdk.awsSdkStrings.webm_
  - java.lang.String
*/
type MediaFormat = _MediaFormat | String

type MediaSampleRateHertz = Double

type MedicalContentIdentificationType = PHI | String

type MedicalMediaSampleRateHertz = Double

type MedicalTranscriptionJobSummaries = js.Array[MedicalTranscriptionJobSummary]

type ModelName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - java.lang.String
*/
type ModelStatus = _ModelStatus | String

type Models = js.Array[LanguageModel]

type NextToken = String

type NonEmptyString = String

type OutputBucketName = String

type OutputKey = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CUSTOMER_BUCKET
  - typings.awsSdk.awsSdkStrings.SERVICE_BUCKET
  - java.lang.String
*/
type OutputLocationType = _OutputLocationType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AGENT
  - typings.awsSdk.awsSdkStrings.CUSTOMER
  - java.lang.String
*/
type ParticipantRole = _ParticipantRole | String

type Percentage = Double

type Phrase = String

type Phrases = js.Array[Phrase]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.BANK_ACCOUNT_NUMBER
  - typings.awsSdk.awsSdkStrings.BANK_ROUTING
  - typings.awsSdk.awsSdkStrings.CREDIT_DEBIT_NUMBER
  - typings.awsSdk.awsSdkStrings.CREDIT_DEBIT_CVV
  - typings.awsSdk.awsSdkStrings.CREDIT_DEBIT_EXPIRY
  - typings.awsSdk.awsSdkStrings.PIN
  - typings.awsSdk.awsSdkStrings.EMAIL
  - typings.awsSdk.awsSdkStrings.ADDRESS
  - typings.awsSdk.awsSdkStrings.NAME
  - typings.awsSdk.awsSdkStrings.PHONE
  - typings.awsSdk.awsSdkStrings.SSN
  - typings.awsSdk.awsSdkStrings.ALL
  - java.lang.String
*/
type PiiEntityType = _PiiEntityType | String

type PiiEntityTypes = js.Array[PiiEntityType]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.redacted
  - typings.awsSdk.awsSdkStrings.redacted_and_unredacted
  - java.lang.String
*/
type RedactionOutput = _RedactionOutput | String

type RedactionType = PII | String

type RuleList = js.Array[Rule]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.POSITIVE
  - typings.awsSdk.awsSdkStrings.NEGATIVE
  - typings.awsSdk.awsSdkStrings.NEUTRAL
  - typings.awsSdk.awsSdkStrings.MIXED
  - java.lang.String
*/
type SentimentValue = _SentimentValue | String

type SentimentValueList = js.Array[SentimentValue]

type Specialty = PRIMARYCARE | String

type StringTargetList = js.Array[NonEmptyString]

type SubtitleFileUris = js.Array[Uri]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.vtt
  - typings.awsSdk.awsSdkStrings.srt_
  - java.lang.String
*/
type SubtitleFormat = _SubtitleFormat | String

type SubtitleFormats = js.Array[SubtitleFormat]

type SubtitleOutputStartIndex = Double

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = String

type TimestampMilliseconds = Double

type TranscribeArn = String

type TranscriptFilterType = EXACT | String

type TranscriptionJobName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.QUEUED
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - java.lang.String
*/
type TranscriptionJobStatus = _TranscriptionJobStatus | String

type TranscriptionJobSummaries = js.Array[TranscriptionJobSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CONVERSATION
  - typings.awsSdk.awsSdkStrings.DICTATION
  - java.lang.String
*/
type Type = _Type | String

type Uri = String

type Vocabularies = js.Array[VocabularyInfo]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.remove__
  - typings.awsSdk.awsSdkStrings.mask__
  - typings.awsSdk.awsSdkStrings.tag_
  - java.lang.String
*/
type VocabularyFilterMethod = _VocabularyFilterMethod | String

type VocabularyFilterName = String

type VocabularyFilters = js.Array[VocabularyFilterInfo]

type VocabularyName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.READY
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type VocabularyState = _VocabularyState | String

type Word = String

type Words = js.Array[Word]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2017-10-26`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
