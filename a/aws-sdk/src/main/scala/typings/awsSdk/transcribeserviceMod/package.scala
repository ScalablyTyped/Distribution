package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object transcribeserviceMod {
  type Boolean = scala.Boolean
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.transcribeserviceMod.ClientApiVersions
  type DataAccessRoleArn = java.lang.String
  type DateTime = typings.std.Date
  type FailureReason = java.lang.String
  type KMSKeyId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`en-US`
    - typings.awsSdk.awsSdkStrings.`es-US`
    - typings.awsSdk.awsSdkStrings.`en-AU`
    - typings.awsSdk.awsSdkStrings.`fr-CA`
    - typings.awsSdk.awsSdkStrings.`en-GB`
    - typings.awsSdk.awsSdkStrings.`de-DE`
    - typings.awsSdk.awsSdkStrings.`pt-BR`
    - typings.awsSdk.awsSdkStrings.`fr-FR`
    - typings.awsSdk.awsSdkStrings.`it-IT`
    - typings.awsSdk.awsSdkStrings.`ko-KR`
    - typings.awsSdk.awsSdkStrings.`es-ES`
    - typings.awsSdk.awsSdkStrings.`en-IN`
    - typings.awsSdk.awsSdkStrings.`hi-IN`
    - typings.awsSdk.awsSdkStrings.`ar-SA`
    - typings.awsSdk.awsSdkStrings.`ru-RU`
    - typings.awsSdk.awsSdkStrings.`zh-CN`
    - typings.awsSdk.awsSdkStrings.`nl-NL`
    - typings.awsSdk.awsSdkStrings.`id-ID`
    - typings.awsSdk.awsSdkStrings.`ta-IN`
    - typings.awsSdk.awsSdkStrings.`fa-IR`
    - typings.awsSdk.awsSdkStrings.`en-IE`
    - typings.awsSdk.awsSdkStrings.`en-AB`
    - typings.awsSdk.awsSdkStrings.`en-WL`
    - typings.awsSdk.awsSdkStrings.`pt-PT`
    - typings.awsSdk.awsSdkStrings.`te-IN`
    - typings.awsSdk.awsSdkStrings.`tr-TR`
    - typings.awsSdk.awsSdkStrings.`de-CH`
    - typings.awsSdk.awsSdkStrings.`he-IL`
    - typings.awsSdk.awsSdkStrings.`ms-MY`
    - typings.awsSdk.awsSdkStrings.`ja-JP`
    - typings.awsSdk.awsSdkStrings.`ar-AE`
    - java.lang.String
  */
  type LanguageCode = typings.awsSdk.transcribeserviceMod._LanguageCode | java.lang.String
  type MaxAlternatives = scala.Double
  type MaxResults = scala.Double
  type MaxSpeakers = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.mp3_
    - typings.awsSdk.awsSdkStrings.mp4_
    - typings.awsSdk.awsSdkStrings.wav_
    - typings.awsSdk.awsSdkStrings.flac
    - java.lang.String
  */
  type MediaFormat = typings.awsSdk.transcribeserviceMod._MediaFormat | java.lang.String
  type MediaSampleRateHertz = scala.Double
  type NextToken = java.lang.String
  type OutputBucketName = java.lang.String
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
  type Uri = java.lang.String
  type Vocabularies = js.Array[typings.awsSdk.transcribeserviceMod.VocabularyInfo]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.remove__
    - typings.awsSdk.awsSdkStrings.mask
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
}
