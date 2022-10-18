package typings.awsSdk.clientsTranslateMod

import typings.awsSdk.awsSdkStrings.KMS
import typings.awsSdk.awsSdkStrings.MASK
import typings.awsSdk.awsSdkStrings.OVERWRITE
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AppliedTerminologyList = js.Array[AppliedTerminology]

type BoundedLengthString = java.lang.String

type ClientTokenString = java.lang.String

type ContentType = java.lang.String

type Description = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.UNI
  - typings.awsSdk.awsSdkStrings.MULTI
  - java.lang.String
*/
type Directionality = _Directionality | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.de_
  - typings.awsSdk.awsSdkStrings.en_
  - typings.awsSdk.awsSdkStrings.es_
  - typings.awsSdk.awsSdkStrings.fr_
  - typings.awsSdk.awsSdkStrings.it_
  - typings.awsSdk.awsSdkStrings.ja_
  - typings.awsSdk.awsSdkStrings.ko_
  - typings.awsSdk.awsSdkStrings.pt_
  - typings.awsSdk.awsSdkStrings.zh
  - typings.awsSdk.awsSdkStrings.`zh-TW`
  - java.lang.String
*/
type DisplayLanguageCode = _DisplayLanguageCode | java.lang.String

type EncryptionKeyID = java.lang.String

type EncryptionKeyType = KMS | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.FORMAL
  - typings.awsSdk.awsSdkStrings.INFORMAL
  - java.lang.String
*/
type Formality = _Formality | java.lang.String

type IamRoleArn = java.lang.String

type Integer = Double

type JobId = java.lang.String

type JobName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SUBMITTED
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.COMPLETED_WITH_ERROR
  - typings.awsSdk.awsSdkStrings.FAILED
  - typings.awsSdk.awsSdkStrings.STOP_REQUESTED
  - typings.awsSdk.awsSdkStrings.STOPPED
  - java.lang.String
*/
type JobStatus = _JobStatus | java.lang.String

type LanguageCodeString = java.lang.String

type LanguageCodeStringList = js.Array[LanguageCodeString]

type LanguagesList = js.Array[Language]

type LocalizedNameString = java.lang.String

type Long = Double

type MaxResultsInteger = Double

type MergeStrategy = OVERWRITE | java.lang.String

type NextToken = java.lang.String

type ParallelDataArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TSV
  - typings.awsSdk.awsSdkStrings.CSV
  - typings.awsSdk.awsSdkStrings.TMX
  - java.lang.String
*/
type ParallelDataFormat = _ParallelDataFormat | java.lang.String

type ParallelDataPropertiesList = js.Array[ParallelDataProperties]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.UPDATING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type ParallelDataStatus = _ParallelDataStatus | java.lang.String

type Profanity = MASK | java.lang.String

type ResourceArn = java.lang.String

type ResourceName = java.lang.String

type ResourceNameList = js.Array[ResourceName]

type S3Uri = java.lang.String

type String = java.lang.String

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = java.lang.String

type TargetLanguageCodeStringList = js.Array[LanguageCodeString]

type TermList = js.Array[Term]

type TerminologyArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CSV
  - typings.awsSdk.awsSdkStrings.TMX
  - typings.awsSdk.awsSdkStrings.TSV
  - java.lang.String
*/
type TerminologyDataFormat = _TerminologyDataFormat | java.lang.String

type TerminologyFile = Buffer | js.typedarray.Uint8Array | Blob | java.lang.String

type TerminologyPropertiesList = js.Array[TerminologyProperties]

type TextTranslationJobPropertiesList = js.Array[TextTranslationJobProperties]

type Timestamp = js.Date

type UnboundedLengthString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2017-07-01`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
