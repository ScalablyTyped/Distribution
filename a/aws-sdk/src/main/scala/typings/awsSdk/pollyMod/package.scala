package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pollyMod {
  type Alphabet = java.lang.String
  type AudioStream = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.pollyMod.Blob | java.lang.String | typings.node.streamMod.Readable
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.pollyMod.ClientApiVersions
  type ContentType = java.lang.String
  type DateTime = typings.std.Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.standard__
    - typings.awsSdk.awsSdkStrings.neural
    - java.lang.String
  */
  type Engine = typings.awsSdk.pollyMod._Engine | java.lang.String
  type EngineList = js.Array[typings.awsSdk.pollyMod.Engine]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Female
    - typings.awsSdk.awsSdkStrings.Male
    - java.lang.String
  */
  type Gender = typings.awsSdk.pollyMod._Gender | java.lang.String
  type IncludeAdditionalLanguageCodes = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.arb
    - typings.awsSdk.awsSdkStrings.`cmn-CN`
    - typings.awsSdk.awsSdkStrings.`cy-GB`
    - typings.awsSdk.awsSdkStrings.`da-DK`
    - typings.awsSdk.awsSdkStrings.`de-DE`
    - typings.awsSdk.awsSdkStrings.`en-AU`
    - typings.awsSdk.awsSdkStrings.`en-GB`
    - typings.awsSdk.awsSdkStrings.`en-GB-WLS`
    - typings.awsSdk.awsSdkStrings.`en-IN`
    - typings.awsSdk.awsSdkStrings.`en-US`
    - typings.awsSdk.awsSdkStrings.`es-ES`
    - typings.awsSdk.awsSdkStrings.`es-MX`
    - typings.awsSdk.awsSdkStrings.`es-US`
    - typings.awsSdk.awsSdkStrings.`fr-CA`
    - typings.awsSdk.awsSdkStrings.`fr-FR`
    - typings.awsSdk.awsSdkStrings.`is-IS`
    - typings.awsSdk.awsSdkStrings.`it-IT`
    - typings.awsSdk.awsSdkStrings.`ja-JP`
    - typings.awsSdk.awsSdkStrings.`hi-IN`
    - typings.awsSdk.awsSdkStrings.`ko-KR`
    - typings.awsSdk.awsSdkStrings.`nb-NO`
    - typings.awsSdk.awsSdkStrings.`nl-NL`
    - typings.awsSdk.awsSdkStrings.`pl-PL`
    - typings.awsSdk.awsSdkStrings.`pt-BR`
    - typings.awsSdk.awsSdkStrings.`pt-PT`
    - typings.awsSdk.awsSdkStrings.`ro-RO`
    - typings.awsSdk.awsSdkStrings.`ru-RU`
    - typings.awsSdk.awsSdkStrings.`sv-SE`
    - typings.awsSdk.awsSdkStrings.`tr-TR`
    - java.lang.String
  */
  type LanguageCode = typings.awsSdk.pollyMod._LanguageCode | java.lang.String
  type LanguageCodeList = js.Array[typings.awsSdk.pollyMod.LanguageCode]
  type LanguageName = java.lang.String
  type LastModified = typings.std.Date
  type LexemesCount = scala.Double
  type LexiconArn = java.lang.String
  type LexiconContent = java.lang.String
  type LexiconDescriptionList = js.Array[typings.awsSdk.pollyMod.LexiconDescription]
  type LexiconName = java.lang.String
  type LexiconNameList = js.Array[typings.awsSdk.pollyMod.LexiconName]
  type MaxResults = scala.Double
  type NextToken = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.json_
    - typings.awsSdk.awsSdkStrings.mp3_
    - typings.awsSdk.awsSdkStrings.ogg_vorbis
    - typings.awsSdk.awsSdkStrings.pcm
    - java.lang.String
  */
  type OutputFormat = typings.awsSdk.pollyMod._OutputFormat | java.lang.String
  type OutputS3BucketName = java.lang.String
  type OutputS3KeyPrefix = java.lang.String
  type OutputUri = java.lang.String
  type RequestCharacters = scala.Double
  type SampleRate = java.lang.String
  type Size = scala.Double
  type SnsTopicArn = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.sentence
    - typings.awsSdk.awsSdkStrings.ssml_
    - typings.awsSdk.awsSdkStrings.viseme
    - typings.awsSdk.awsSdkStrings.word_
    - java.lang.String
  */
  type SpeechMarkType = typings.awsSdk.pollyMod._SpeechMarkType | java.lang.String
  type SpeechMarkTypeList = js.Array[typings.awsSdk.pollyMod.SpeechMarkType]
  type SynthesisTasks = js.Array[typings.awsSdk.pollyMod.SynthesisTask]
  type TaskId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.scheduled__
    - typings.awsSdk.awsSdkStrings.inProgress__
    - typings.awsSdk.awsSdkStrings.completed__
    - typings.awsSdk.awsSdkStrings.failed__
    - java.lang.String
  */
  type TaskStatus = typings.awsSdk.pollyMod._TaskStatus | java.lang.String
  type TaskStatusReason = java.lang.String
  type Text = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ssml_
    - typings.awsSdk.awsSdkStrings.text_
    - java.lang.String
  */
  type TextType = typings.awsSdk.pollyMod._TextType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Aditi
    - typings.awsSdk.awsSdkStrings.Amy
    - typings.awsSdk.awsSdkStrings.Astrid
    - typings.awsSdk.awsSdkStrings.Bianca
    - typings.awsSdk.awsSdkStrings.Brian
    - typings.awsSdk.awsSdkStrings.Camila
    - typings.awsSdk.awsSdkStrings.Carla
    - typings.awsSdk.awsSdkStrings.Carmen
    - typings.awsSdk.awsSdkStrings.Celine
    - typings.awsSdk.awsSdkStrings.Chantal
    - typings.awsSdk.awsSdkStrings.Conchita
    - typings.awsSdk.awsSdkStrings.Cristiano
    - typings.awsSdk.awsSdkStrings.Dora
    - typings.awsSdk.awsSdkStrings.Emma
    - typings.awsSdk.awsSdkStrings.Enrique
    - typings.awsSdk.awsSdkStrings.Ewa
    - typings.awsSdk.awsSdkStrings.Filiz
    - typings.awsSdk.awsSdkStrings.Geraint
    - typings.awsSdk.awsSdkStrings.Giorgio
    - typings.awsSdk.awsSdkStrings.Gwyneth
    - typings.awsSdk.awsSdkStrings.Hans_
    - typings.awsSdk.awsSdkStrings.Ines
    - typings.awsSdk.awsSdkStrings.Ivy
    - typings.awsSdk.awsSdkStrings.Jacek
    - typings.awsSdk.awsSdkStrings.Jan
    - typings.awsSdk.awsSdkStrings.Joanna
    - typings.awsSdk.awsSdkStrings.Joey
    - typings.awsSdk.awsSdkStrings.Justin
    - typings.awsSdk.awsSdkStrings.Karl
    - typings.awsSdk.awsSdkStrings.Kendra
    - typings.awsSdk.awsSdkStrings.Kimberly
    - typings.awsSdk.awsSdkStrings.Lea
    - typings.awsSdk.awsSdkStrings.Liv
    - typings.awsSdk.awsSdkStrings.Lotte
    - typings.awsSdk.awsSdkStrings.Lucia
    - typings.awsSdk.awsSdkStrings.Lupe
    - typings.awsSdk.awsSdkStrings.Mads
    - typings.awsSdk.awsSdkStrings.Maja
    - typings.awsSdk.awsSdkStrings.Marlene
    - typings.awsSdk.awsSdkStrings.Mathieu
    - typings.awsSdk.awsSdkStrings.Matthew
    - typings.awsSdk.awsSdkStrings.Maxim
    - typings.awsSdk.awsSdkStrings.Mia
    - typings.awsSdk.awsSdkStrings.Miguel
    - typings.awsSdk.awsSdkStrings.Mizuki
    - typings.awsSdk.awsSdkStrings.Naja
    - typings.awsSdk.awsSdkStrings.Nicole
    - typings.awsSdk.awsSdkStrings.Penelope
    - typings.awsSdk.awsSdkStrings.Raveena
    - typings.awsSdk.awsSdkStrings.Ricardo
    - typings.awsSdk.awsSdkStrings.Ruben
    - typings.awsSdk.awsSdkStrings.Russell
    - typings.awsSdk.awsSdkStrings.Salli
    - typings.awsSdk.awsSdkStrings.Seoyeon
    - typings.awsSdk.awsSdkStrings.Takumi
    - typings.awsSdk.awsSdkStrings.Tatyana
    - typings.awsSdk.awsSdkStrings.Vicki
    - typings.awsSdk.awsSdkStrings.Vitoria
    - typings.awsSdk.awsSdkStrings.Zeina
    - typings.awsSdk.awsSdkStrings.Zhiyu
    - java.lang.String
  */
  type VoiceId = typings.awsSdk.pollyMod._VoiceId | java.lang.String
  type VoiceList = js.Array[typings.awsSdk.pollyMod.Voice]
  type VoiceName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2016-06-10`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.pollyMod._apiVersion | java.lang.String
}
