package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object codeartifactMod {
  type AccountId = java.lang.String
  type Arn = java.lang.String
  type Asset = typings.node.Buffer | typings.std.Uint8Array | typings.awsSdk.codeartifactMod.Blob | java.lang.String | typings.node.streamMod.Readable
  type AssetHashes = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.codeartifactMod.HashValue]
  type AssetName = java.lang.String
  type AssetSummaryList = js.Array[typings.awsSdk.codeartifactMod.AssetSummary]
  type AuthorizationTokenDurationSeconds = scala.Double
  type BooleanOptional = scala.Boolean
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.codeartifactMod.ClientApiVersions
  type Description = java.lang.String
  type DomainName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Active_
    - typings.awsSdk.awsSdkStrings.Deleted_
    - java.lang.String
  */
  type DomainStatus = typings.awsSdk.codeartifactMod._DomainStatus | java.lang.String
  type DomainSummaryList = js.Array[typings.awsSdk.codeartifactMod.DomainSummary]
  type ErrorMessage = java.lang.String
  type ExternalConnectionName = java.lang.String
  type ExternalConnectionStatus = typings.awsSdk.awsSdkStrings.Available_ | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.MD5
    - typings.awsSdk.awsSdkStrings.`SHA-1`
    - typings.awsSdk.awsSdkStrings.`SHA-256`
    - typings.awsSdk.awsSdkStrings.`SHA-512`
    - java.lang.String
  */
  type HashAlgorithm = typings.awsSdk.codeartifactMod._HashAlgorithm | java.lang.String
  type HashValue = java.lang.String
  type Integer = scala.Double
  type LicenseInfoList = js.Array[typings.awsSdk.codeartifactMod.LicenseInfo]
  type ListDomainsMaxResults = scala.Double
  type ListPackageVersionAssetsMaxResults = scala.Double
  type ListPackageVersionsMaxResults = scala.Double
  type ListPackagesMaxResults = scala.Double
  type ListRepositoriesInDomainMaxResults = scala.Double
  type ListRepositoriesMaxResults = scala.Double
  type Long = scala.Double
  type LongOptional = scala.Double
  type PackageDependencyList = js.Array[typings.awsSdk.codeartifactMod.PackageDependency]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.npm
    - typings.awsSdk.awsSdkStrings.pypi
    - typings.awsSdk.awsSdkStrings.maven
    - java.lang.String
  */
  type PackageFormat = typings.awsSdk.codeartifactMod._PackageFormat | java.lang.String
  type PackageName = java.lang.String
  type PackageNamespace = java.lang.String
  type PackageSummaryList = js.Array[typings.awsSdk.codeartifactMod.PackageSummary]
  type PackageVersion = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ALREADY_EXISTS
    - typings.awsSdk.awsSdkStrings.MISMATCHED_REVISION
    - typings.awsSdk.awsSdkStrings.MISMATCHED_STATUS
    - typings.awsSdk.awsSdkStrings.NOT_ALLOWED
    - typings.awsSdk.awsSdkStrings.NOT_FOUND
    - typings.awsSdk.awsSdkStrings.SKIPPED
    - java.lang.String
  */
  type PackageVersionErrorCode = typings.awsSdk.codeartifactMod._PackageVersionErrorCode | java.lang.String
  type PackageVersionErrorMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.codeartifactMod.PackageVersionError]
  type PackageVersionList = js.Array[typings.awsSdk.codeartifactMod.PackageVersion]
  type PackageVersionRevision = java.lang.String
  type PackageVersionRevisionMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.codeartifactMod.PackageVersionRevision]
  type PackageVersionSortType = typings.awsSdk.awsSdkStrings.PUBLISHED_TIME | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Published_
    - typings.awsSdk.awsSdkStrings.Unfinished
    - typings.awsSdk.awsSdkStrings.Unlisted
    - typings.awsSdk.awsSdkStrings.Archived_
    - typings.awsSdk.awsSdkStrings.Disposed
    - typings.awsSdk.awsSdkStrings.Deleted_
    - java.lang.String
  */
  type PackageVersionStatus = typings.awsSdk.codeartifactMod._PackageVersionStatus | java.lang.String
  type PackageVersionSummaryList = js.Array[typings.awsSdk.codeartifactMod.PackageVersionSummary]
  type PaginationToken = java.lang.String
  type PolicyDocument = java.lang.String
  type PolicyRevision = java.lang.String
  type RepositoryExternalConnectionInfoList = js.Array[typings.awsSdk.codeartifactMod.RepositoryExternalConnectionInfo]
  type RepositoryName = java.lang.String
  type RepositorySummaryList = js.Array[typings.awsSdk.codeartifactMod.RepositorySummary]
  type String = java.lang.String
  type String255 = java.lang.String
  type SuccessfulPackageVersionInfoMap = org.scalablytyped.runtime.StringDictionary[typings.awsSdk.codeartifactMod.SuccessfulPackageVersionInfo]
  type Timestamp = typings.std.Date
  type UpstreamRepositoryInfoList = js.Array[typings.awsSdk.codeartifactMod.UpstreamRepositoryInfo]
  type UpstreamRepositoryList = js.Array[typings.awsSdk.codeartifactMod.UpstreamRepository]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2018-09-22`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.codeartifactMod._apiVersion | java.lang.String
}
