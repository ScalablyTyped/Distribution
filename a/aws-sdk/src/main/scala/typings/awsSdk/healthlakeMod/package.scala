package typings.awsSdk.healthlakeMod

import typings.awsSdk.awsSdkStrings.R4
import typings.awsSdk.awsSdkStrings.SYNTHEA
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AmazonResourceName = java.lang.String

type BoundedLengthString = java.lang.String

type ClientTokenString = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CUSTOMER_MANAGED_KMS_KEY
  - typings.awsSdk.awsSdkStrings.AWS_OWNED_KMS_KEY
  - java.lang.String
*/
type CmkType = _CmkType | java.lang.String

type DatastoreArn = java.lang.String

type DatastoreId = java.lang.String

type DatastoreName = java.lang.String

type DatastorePropertiesList = js.Array[DatastoreProperties]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATING
  - typings.awsSdk.awsSdkStrings.ACTIVE
  - typings.awsSdk.awsSdkStrings.DELETING
  - typings.awsSdk.awsSdkStrings.DELETED
  - java.lang.String
*/
type DatastoreStatus = _DatastoreStatus | java.lang.String

type EncryptionKeyID = java.lang.String

type ExportJobPropertiesList = js.Array[ExportJobProperties]

type FHIRVersion = R4 | java.lang.String

type IamRoleArn = java.lang.String

type ImportJobPropertiesList = js.Array[ImportJobProperties]

type JobId = java.lang.String

type JobName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SUBMITTED
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.COMPLETED_WITH_ERRORS
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type JobStatus = _JobStatus | java.lang.String

type MaxResultsInteger = Double

type Message = java.lang.String

type NextToken = java.lang.String

type PreloadDataType = SYNTHEA | java.lang.String

type S3Uri = java.lang.String

type String = java.lang.String

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = java.lang.String

type Timestamp = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2017-07-01`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
