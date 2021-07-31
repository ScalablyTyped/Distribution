package typings.awsSdk.translateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AppliedTerminologyList = js.Array[typings.awsSdk.translateMod.AppliedTerminology]

type BoundedLengthString = java.lang.String

type ClientTokenString = java.lang.String

type ContentType = java.lang.String

type Description = java.lang.String

type EncryptionKeyID = java.lang.String

type EncryptionKeyType = typings.awsSdk.awsSdkStrings.KMS | java.lang.String

type IamRoleArn = java.lang.String

type Integer = scala.Double

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
type JobStatus = typings.awsSdk.translateMod._JobStatus | java.lang.String

type LanguageCodeString = java.lang.String

type LanguageCodeStringList = js.Array[typings.awsSdk.translateMod.LanguageCodeString]

type MaxResultsInteger = scala.Double

type MergeStrategy = typings.awsSdk.awsSdkStrings.OVERWRITE | java.lang.String

type NextToken = java.lang.String

type ResourceName = java.lang.String

type ResourceNameList = js.Array[typings.awsSdk.translateMod.ResourceName]

type S3Uri = java.lang.String

type String = java.lang.String

type TargetLanguageCodeStringList = js.Array[typings.awsSdk.translateMod.LanguageCodeString]

type TermList = js.Array[typings.awsSdk.translateMod.Term]

type TerminologyArn = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CSV
  - typings.awsSdk.awsSdkStrings.TMX
  - java.lang.String
*/
type TerminologyDataFormat = typings.awsSdk.translateMod._TerminologyDataFormat | java.lang.String

type TerminologyFile = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.translateMod.Blob | java.lang.String

type TerminologyPropertiesList = js.Array[typings.awsSdk.translateMod.TerminologyProperties]

type TextTranslationJobPropertiesList = js.Array[typings.awsSdk.translateMod.TextTranslationJobProperties]

type Timestamp = typings.std.Date

type UnboundedLengthString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2017-07-01`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = typings.awsSdk.translateMod._apiVersion | java.lang.String
