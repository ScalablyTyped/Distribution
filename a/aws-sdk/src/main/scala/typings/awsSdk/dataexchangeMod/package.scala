package typings.awsSdk.dataexchangeMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.awsSdkStrings.REST
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type ApiDescription = String

type Arn = String

type AssetName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.S3_SNAPSHOT
  - typings.awsSdk.awsSdkStrings.REDSHIFT_DATA_SHARE
  - typings.awsSdk.awsSdkStrings.API_GATEWAY_API
  - java.lang.String
*/
type AssetType = _AssetType | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACCESS_DENIED_EXCEPTION
  - typings.awsSdk.awsSdkStrings.INTERNAL_SERVER_EXCEPTION
  - typings.awsSdk.awsSdkStrings.MALWARE_DETECTED
  - typings.awsSdk.awsSdkStrings.RESOURCE_NOT_FOUND_EXCEPTION
  - typings.awsSdk.awsSdkStrings.SERVICE_QUOTA_EXCEEDED_EXCEPTION
  - typings.awsSdk.awsSdkStrings.VALIDATION_EXCEPTION
  - typings.awsSdk.awsSdkStrings.MALWARE_SCAN_ENCRYPTED_FILE
  - java.lang.String
*/
type Code = _Code | String

type Description = String

type Id = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`Assets per revision`
  - typings.awsSdk.awsSdkStrings.`Asset size in GB`
  - typings.awsSdk.awsSdkStrings.`Amazon Redshift datashare assets per revision`
  - java.lang.String
*/
type JobErrorLimitName = _JobErrorLimitName | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.REVISION
  - typings.awsSdk.awsSdkStrings.ASSET
  - typings.awsSdk.awsSdkStrings.DATA_SET
  - java.lang.String
*/
type JobErrorResourceTypes = _JobErrorResourceTypes | String

type ListOfAssetDestinationEntry = js.Array[AssetDestinationEntry]

type ListOfAssetEntry = js.Array[AssetEntry]

type ListOfAssetSourceEntry = js.Array[AssetSourceEntry]

type ListOfDataSetEntry = js.Array[DataSetEntry]

type ListOfEventActionEntry = js.Array[EventActionEntry]

type ListOfJobEntry = js.Array[JobEntry]

type ListOfJobError = js.Array[JobError]

type ListOfRedshiftDataShareAssetSourceEntry = js.Array[RedshiftDataShareAssetSourceEntry]

type ListOfRevisionDestinationEntry = js.Array[RevisionDestinationEntry]

type ListOfRevisionEntry = js.Array[RevisionEntry]

type ListOfString = js.Array[string]

type MapOfString = StringDictionary[string]

type MaxResults = Double

type Name = String

type NextToken = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.OWNED
  - typings.awsSdk.awsSdkStrings.ENTITLED
  - java.lang.String
*/
type Origin = _Origin | String

type ProtocolType = REST | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.awsColonkms
  - typings.awsSdk.awsSdkStrings.AES256
  - java.lang.String
*/
type ServerSideEncryptionTypes = _ServerSideEncryptionTypes | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.WAITING
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.ERROR
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.CANCELLED
  - typings.awsSdk.awsSdkStrings.TIMED_OUT
  - java.lang.String
*/
type State = _State | String

type Timestamp = js.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IMPORT_ASSETS_FROM_S3
  - typings.awsSdk.awsSdkStrings.IMPORT_ASSET_FROM_SIGNED_URL
  - typings.awsSdk.awsSdkStrings.EXPORT_ASSETS_TO_S3
  - typings.awsSdk.awsSdkStrings.EXPORT_ASSET_TO_SIGNED_URL
  - typings.awsSdk.awsSdkStrings.EXPORT_REVISIONS_TO_S3
  - typings.awsSdk.awsSdkStrings.IMPORT_ASSETS_FROM_REDSHIFT_DATA_SHARES
  - typings.awsSdk.awsSdkStrings.IMPORT_ASSET_FROM_API_GATEWAY_API
  - java.lang.String
*/
type Type = _Type | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2017-07-25`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String

type boolean = Boolean

type double = Double

type doubleMin0 = Double

type string = String

type stringMin0Max16384 = String

type stringMin10Max512 = String

type stringMin24Max24PatternAZaZ094AZaZ092AZaZ093 = String
