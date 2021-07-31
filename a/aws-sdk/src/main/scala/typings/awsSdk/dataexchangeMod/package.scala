package typings.awsSdk.dataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type Arn = java.lang.String

type AssetName = java.lang.String

type AssetType = typings.awsSdk.awsSdkStrings.S3_SNAPSHOT | java.lang.String

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
type Code = typings.awsSdk.dataexchangeMod._Code | java.lang.String

type Description = java.lang.String

type Id = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`Assets per revision`
  - typings.awsSdk.awsSdkStrings.`Asset size in GB`
  - java.lang.String
*/
type JobErrorLimitName = typings.awsSdk.dataexchangeMod._JobErrorLimitName | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.REVISION
  - typings.awsSdk.awsSdkStrings.ASSET
  - java.lang.String
*/
type JobErrorResourceTypes = typings.awsSdk.dataexchangeMod._JobErrorResourceTypes | java.lang.String

type ListOfAssetDestinationEntry = js.Array[typings.awsSdk.dataexchangeMod.AssetDestinationEntry]

type ListOfAssetEntry = js.Array[typings.awsSdk.dataexchangeMod.AssetEntry]

type ListOfAssetSourceEntry = js.Array[typings.awsSdk.dataexchangeMod.AssetSourceEntry]

type ListOfDataSetEntry = js.Array[typings.awsSdk.dataexchangeMod.DataSetEntry]

type ListOfJobEntry = js.Array[typings.awsSdk.dataexchangeMod.JobEntry]

type ListOfJobError = js.Array[typings.awsSdk.dataexchangeMod.JobError]

type ListOfRevisionEntry = js.Array[typings.awsSdk.dataexchangeMod.RevisionEntry]

type ListOfString = js.Array[typings.awsSdk.dataexchangeMod.string]

type MapOfString = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.dataexchangeMod.string]

type MaxResults = scala.Double

type Name = java.lang.String

type NextToken = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.OWNED
  - typings.awsSdk.awsSdkStrings.ENTITLED
  - java.lang.String
*/
type Origin = typings.awsSdk.dataexchangeMod._Origin | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.awsColonkms
  - typings.awsSdk.awsSdkStrings.AES256
  - java.lang.String
*/
type ServerSideEncryptionTypes = typings.awsSdk.dataexchangeMod._ServerSideEncryptionTypes | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.WAITING
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.ERROR
  - typings.awsSdk.awsSdkStrings.COMPLETED
  - typings.awsSdk.awsSdkStrings.CANCELLED
  - typings.awsSdk.awsSdkStrings.TIMED_OUT
  - java.lang.String
*/
type State = typings.awsSdk.dataexchangeMod._State | java.lang.String

type Timestamp = typings.std.Date

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IMPORT_ASSETS_FROM_S3
  - typings.awsSdk.awsSdkStrings.IMPORT_ASSET_FROM_SIGNED_URL
  - typings.awsSdk.awsSdkStrings.EXPORT_ASSETS_TO_S3
  - typings.awsSdk.awsSdkStrings.EXPORT_ASSET_TO_SIGNED_URL
  - java.lang.String
*/
type Type = typings.awsSdk.dataexchangeMod._Type | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2017-07-25`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = typings.awsSdk.dataexchangeMod._apiVersion | java.lang.String

type boolean = scala.Boolean

type double = scala.Double

type doubleMin0 = scala.Double

type string = java.lang.String

type stringMin0Max16384 = java.lang.String

type stringMin24Max24PatternAZaZ094AZaZ092AZaZ093 = java.lang.String
