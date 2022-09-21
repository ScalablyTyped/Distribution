package typings.awsSdk.lookoutvisionMod

import typings.awsSdk.awsSdkStrings.LINUX
import typings.awsSdk.awsSdkStrings.NVIDIA
import typings.awsSdk.awsSdkStrings.jetson_xavier
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AnomalyClassFilter = String

type AnomalyList = js.Array[Anomaly]

type AnomalyMask = Buffer | js.typedarray.Uint8Array | Blob | String

type AnomalyName = String

type Boolean = scala.Boolean

type ClientToken = String

type Color = String

type CompilerOptions = String

type ComponentDescription = String

type ComponentName = String

type ComponentVersion = String

type ComponentVersionArn = String

type ContentType = String

type DatasetChanges = Buffer | js.typedarray.Uint8Array | Blob | String

type DatasetEntry = String

type DatasetEntryList = js.Array[DatasetEntry]

type DatasetMetadataList = js.Array[DatasetMetadata]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.CREATE_COMPLETE
  - typings.awsSdk.awsSdkStrings.CREATE_FAILED
  - typings.awsSdk.awsSdkStrings.UPDATE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.UPDATE_COMPLETE
  - typings.awsSdk.awsSdkStrings.UPDATE_FAILED_ROLLBACK_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.UPDATE_FAILED_ROLLBACK_COMPLETE
  - typings.awsSdk.awsSdkStrings.DELETE_IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.DELETE_COMPLETE
  - typings.awsSdk.awsSdkStrings.DELETE_FAILED
  - java.lang.String
*/
type DatasetStatus = _DatasetStatus | String

type DatasetStatusMessage = String

type DatasetType = String

type DateTime = js.Date

type Float = Double

type ImageSourceType = String

type InferenceUnits = Double

type Integer = Double

type IsLabeled = scala.Boolean

type KmsKeyId = String

type ModelArn = String

type ModelDescriptionMessage = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.STARTING_HOSTING
  - typings.awsSdk.awsSdkStrings.HOSTED
  - typings.awsSdk.awsSdkStrings.HOSTING_FAILED
  - typings.awsSdk.awsSdkStrings.STOPPING_HOSTING
  - typings.awsSdk.awsSdkStrings.SYSTEM_UPDATING
  - java.lang.String
*/
type ModelHostingStatus = _ModelHostingStatus | String

type ModelMetadataList = js.Array[ModelMetadata]

type ModelPackagingJobDescription = String

type ModelPackagingJobName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.CREATED
  - typings.awsSdk.awsSdkStrings.RUNNING
  - typings.awsSdk.awsSdkStrings.SUCCEEDED
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type ModelPackagingJobStatus = _ModelPackagingJobStatus | String

type ModelPackagingJobsList = js.Array[ModelPackagingJobMetadata]

type ModelPackagingMethod = String

type ModelPackagingStatusMessage = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TRAINING
  - typings.awsSdk.awsSdkStrings.TRAINED
  - typings.awsSdk.awsSdkStrings.TRAINING_FAILED
  - typings.awsSdk.awsSdkStrings.STARTING_HOSTING
  - typings.awsSdk.awsSdkStrings.HOSTED
  - typings.awsSdk.awsSdkStrings.HOSTING_FAILED
  - typings.awsSdk.awsSdkStrings.STOPPING_HOSTING
  - typings.awsSdk.awsSdkStrings.SYSTEM_UPDATING
  - typings.awsSdk.awsSdkStrings.DELETING
  - java.lang.String
*/
type ModelStatus = _ModelStatus | String

type ModelStatusMessage = String

type ModelVersion = String

type ModelVersionNoLatest = String

type PageSize = Double

type PaginationToken = String

type ProjectArn = String

type ProjectMetadataList = js.Array[ProjectMetadata]

type ProjectName = String

type QueryString = String

type S3BucketName = String

type S3KeyPrefix = String

type S3ObjectKey = String

type S3ObjectVersion = String

type Stream = Buffer | js.typedarray.Uint8Array | Blob | String | Readable

type TagArn = String

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = String

type TargetDevice = jetson_xavier | String

type TargetPlatformAccelerator = NVIDIA | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ARM64
  - typings.awsSdk.awsSdkStrings.X86_64
  - java.lang.String
*/
type TargetPlatformArch = _TargetPlatformArch | String

type TargetPlatformOs = LINUX | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2020-11-20`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
