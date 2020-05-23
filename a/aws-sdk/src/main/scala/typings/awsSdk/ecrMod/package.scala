package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ecrMod {
  type Arn = java.lang.String
  type AttributeKey = java.lang.String
  type AttributeList = js.Array[typings.awsSdk.ecrMod.Attribute]
  type AttributeValue = java.lang.String
  type AuthorizationDataList = js.Array[typings.awsSdk.ecrMod.AuthorizationData]
  type Base64 = java.lang.String
  type BatchedOperationLayerDigest = java.lang.String
  type BatchedOperationLayerDigestList = js.Array[typings.awsSdk.ecrMod.BatchedOperationLayerDigest]
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.ecrMod.ClientApiVersions
  type CreationTimestamp = typings.std.Date
  type EvaluationTimestamp = typings.std.Date
  type ExpirationTimestamp = typings.std.Date
  type FindingDescription = java.lang.String
  type FindingName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.INFORMATIONAL
    - typings.awsSdk.awsSdkStrings.LOW
    - typings.awsSdk.awsSdkStrings.MEDIUM
    - typings.awsSdk.awsSdkStrings.HIGH
    - typings.awsSdk.awsSdkStrings.CRITICAL
    - typings.awsSdk.awsSdkStrings.UNDEFINED
    - java.lang.String
  */
  type FindingSeverity = typings.awsSdk.ecrMod._FindingSeverity | java.lang.String
  type FindingSeverityCounts = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.ecrMod.SeverityCount]
  type ForceFlag = scala.Boolean
  type GetAuthorizationTokenRegistryIdList = js.Array[typings.awsSdk.ecrMod.RegistryId]
  type ImageActionType = typings.awsSdk.awsSdkStrings.EXPIRE | java.lang.String
  type ImageCount = scala.Double
  type ImageDetailList = js.Array[typings.awsSdk.ecrMod.ImageDetail]
  type ImageDigest = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.InvalidImageDigest
    - typings.awsSdk.awsSdkStrings.InvalidImageTag
    - typings.awsSdk.awsSdkStrings.ImageTagDoesNotMatchDigest
    - typings.awsSdk.awsSdkStrings.ImageNotFound
    - typings.awsSdk.awsSdkStrings.MissingDigestAndTag
    - typings.awsSdk.awsSdkStrings.ImageReferencedByManifestList
    - java.lang.String
  */
  type ImageFailureCode = typings.awsSdk.ecrMod._ImageFailureCode | java.lang.String
  type ImageFailureList = js.Array[typings.awsSdk.ecrMod.ImageFailure]
  type ImageFailureReason = java.lang.String
  type ImageIdentifierList = js.Array[typings.awsSdk.ecrMod.ImageIdentifier]
  type ImageList = js.Array[typings.awsSdk.ecrMod.Image]
  type ImageManifest = java.lang.String
  type ImageScanFindingList = js.Array[typings.awsSdk.ecrMod.ImageScanFinding]
  type ImageSizeInBytes = scala.Double
  type ImageTag = java.lang.String
  type ImageTagList = js.Array[typings.awsSdk.ecrMod.ImageTag]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.MUTABLE
    - typings.awsSdk.awsSdkStrings.IMMUTABLE
    - java.lang.String
  */
  type ImageTagMutability = typings.awsSdk.ecrMod._ImageTagMutability | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AVAILABLE
    - typings.awsSdk.awsSdkStrings.UNAVAILABLE
    - java.lang.String
  */
  type LayerAvailability = typings.awsSdk.ecrMod._LayerAvailability | java.lang.String
  type LayerDigest = java.lang.String
  type LayerDigestList = js.Array[typings.awsSdk.ecrMod.LayerDigest]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.InvalidLayerDigest
    - typings.awsSdk.awsSdkStrings.MissingLayerDigest
    - java.lang.String
  */
  type LayerFailureCode = typings.awsSdk.ecrMod._LayerFailureCode | java.lang.String
  type LayerFailureList = js.Array[typings.awsSdk.ecrMod.LayerFailure]
  type LayerFailureReason = java.lang.String
  type LayerList = js.Array[typings.awsSdk.ecrMod.Layer]
  type LayerPartBlob = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.ecrMod.Blob | java.lang.String
  type LayerSizeInBytes = scala.Double
  type LifecyclePolicyPreviewResultList = js.Array[typings.awsSdk.ecrMod.LifecyclePolicyPreviewResult]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.COMPLETE
    - typings.awsSdk.awsSdkStrings.EXPIRED
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type LifecyclePolicyPreviewStatus = typings.awsSdk.ecrMod._LifecyclePolicyPreviewStatus | java.lang.String
  type LifecyclePolicyRulePriority = scala.Double
  type LifecyclePolicyText = java.lang.String
  type LifecyclePreviewMaxResults = scala.Double
  type MaxResults = scala.Double
  type MediaType = java.lang.String
  type MediaTypeList = js.Array[typings.awsSdk.ecrMod.MediaType]
  type NextToken = java.lang.String
  type PartSize = scala.Double
  type ProxyEndpoint = java.lang.String
  type PushTimestamp = typings.std.Date
  type RegistryId = java.lang.String
  type RepositoryList = js.Array[typings.awsSdk.ecrMod.Repository]
  type RepositoryName = java.lang.String
  type RepositoryNameList = js.Array[typings.awsSdk.ecrMod.RepositoryName]
  type RepositoryPolicyText = java.lang.String
  type ScanOnPushFlag = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.IN_PROGRESS
    - typings.awsSdk.awsSdkStrings.COMPLETE
    - typings.awsSdk.awsSdkStrings.FAILED
    - java.lang.String
  */
  type ScanStatus = typings.awsSdk.ecrMod._ScanStatus | java.lang.String
  type ScanStatusDescription = java.lang.String
  type ScanTimestamp = typings.std.Date
  type SeverityCount = scala.Double
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typings.awsSdk.ecrMod.TagKey]
  type TagList = js.Array[typings.awsSdk.ecrMod.Tag]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.TAGGED
    - typings.awsSdk.awsSdkStrings.UNTAGGED
    - typings.awsSdk.awsSdkStrings.ANY
    - java.lang.String
  */
  type TagStatus = typings.awsSdk.ecrMod._TagStatus | java.lang.String
  type TagValue = java.lang.String
  type UploadId = java.lang.String
  type Url = java.lang.String
  type VulnerabilitySourceUpdateTimestamp = typings.std.Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2015-09-21`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.ecrMod._apiVersion | java.lang.String
}
