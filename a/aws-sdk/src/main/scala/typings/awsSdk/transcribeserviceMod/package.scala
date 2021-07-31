package typings.awsSdk.transcribeserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NarrowBand
  - typings.awsSdk.awsSdkStrings.WideBand
  - java.lang.String
*/
type BaseModelName = typings.awsSdk.transcribeserviceMod._BaseModelName | java.lang.String

type Boolean = scala.Boolean

type CLMLanguageCode = typings.awsSdk.awsSdkStrings.`en-US` | java.lang.String

type DataAccessRoleArn = java.lang.String

type DateTime = typings.std.Date

type FailureReason = java.lang.String

type IdentifiedLanguageScore = scala.Double

type KMSKeyId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`af-ZA`
  - typings.awsSdk.awsSdkStrings.`ar-AE`
  - typings.awsSdk.awsSdkStrings.`ar-SA`
  - typings.awsSdk.awsSdkStrings.`cy-GB`
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
  - typings.awsSdk.awsSdkStrings.`ga-IE`
  - typings.awsSdk.awsSdkStrings.`gd-GB`
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
  - java.lang.String
*/
type LanguageCode = typings.awsSdk.transcribeserviceMod._LanguageCode | java.lang.String

type LanguageOptions = js.Array[typings.awsSdk.transcribeserviceMod.LanguageCode]

type MaxAlternatives = scala.Double

type MaxResults = scala.Double

type MaxSpeakers = scala.Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.mp3_
  - typings.awsSdk.awsSdkStrings.mp4_
  - typings.awsSdk.awsSdkStrings.wav_
  - typings.awsSdk.awsSdkStrings.flac
  - typings.awsSdk.awsSdkStrings.ogg
  - typings.awsSdk.awsSdkStrings.amr
  - typings.awsSdk.awsSdkStrings.webm_
  - java.lang.String
*/
type MediaFormat = typings.awsSdk.transcribeserviceMod._MediaFormat | java.lang.String

type MediaSampleRateHertz = scala.Double

type MedicalTranscriptionJobSummaries = js.Array[typings.awsSdk.transcribeserviceMod.MedicalTranscriptionJobSummary]

type ModelName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - java.lang.String
*/
type ModelStatus = typings.awsSdk.transcribeserviceMod._ModelStatus | java.lang.String

type Models = js.Array[typings.awsSdk.transcribeserviceMod.LanguageModel]

type NextToken = java.lang.String

type OutputBucketName = java.lang.String

type OutputKey = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CUSTOMER_BUCKET
  - typings.awsSdk.awsSdkStrings.SERVICE_BUCKET
  - java.lang.String
*/
type OutputLocationType = typings.awsSdk.transcribeserviceMod._OutputLocationType | java.lang.String

type Phrase = java.lang.String

type Phrases = js.Array[typings.awsSdk.transcribeserviceMod.Phrase]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.redacted
  - typings.awsSdk.awsSdkStrings.redacted_and_unredacted
  - java.lang.String
*/
type RedactionOutput = typings.awsSdk.transcribeserviceMod._RedactionOutput | java.lang.String

type RedactionType = typings.awsSdk.awsSdkStrings.PII | java.lang.String

type Specialty = typings.awsSdk.awsSdkStrings.PRIMARYCARE | java.lang.String

type TranscriptionJobName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.QUEUED
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - java.lang.String
*/
type TranscriptionJobStatus = typings.awsSdk.transcribeserviceMod._TranscriptionJobStatus | java.lang.String

type TranscriptionJobSummaries = js.Array[typings.awsSdk.transcribeserviceMod.TranscriptionJobSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CONVERSATION
  - typings.awsSdk.awsSdkStrings.DICTATION
  - java.lang.String
*/
type Type = typings.awsSdk.transcribeserviceMod._Type | java.lang.String

type Uri = java.lang.String

type Vocabularies = js.Array[typings.awsSdk.transcribeserviceMod.VocabularyInfo]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.remove__
  - typings.awsSdk.awsSdkStrings.mask__
  - java.lang.String
*/
type VocabularyFilterMethod = typings.awsSdk.transcribeserviceMod._VocabularyFilterMethod | java.lang.String

type VocabularyFilterName = java.lang.String

type VocabularyFilters = js.Array[typings.awsSdk.transcribeserviceMod.VocabularyFilterInfo]

type VocabularyName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.READY
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type VocabularyState = typings.awsSdk.transcribeserviceMod._VocabularyState | java.lang.String

type Word = java.lang.String

type Words = js.Array[typings.awsSdk.transcribeserviceMod.Word]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2017-10-26`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = typings.awsSdk.transcribeserviceMod._apiVersion | java.lang.String
