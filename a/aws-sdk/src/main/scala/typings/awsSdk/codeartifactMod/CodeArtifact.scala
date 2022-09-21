package typings.awsSdk.codeartifactMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CodeArtifact extends Service {
  
  /**
    * Adds an existing external connection to a repository. One external connection is allowed per repository.  A repository can have one or more upstream repositories, or an external connection. 
    */
  def associateExternalConnection(): Request[AssociateExternalConnectionResult, AWSError] = js.native
  def associateExternalConnection(callback: js.Function2[/* err */ AWSError, /* data */ AssociateExternalConnectionResult, Unit]): Request[AssociateExternalConnectionResult, AWSError] = js.native
  /**
    * Adds an existing external connection to a repository. One external connection is allowed per repository.  A repository can have one or more upstream repositories, or an external connection. 
    */
  def associateExternalConnection(params: AssociateExternalConnectionRequest): Request[AssociateExternalConnectionResult, AWSError] = js.native
  def associateExternalConnection(
    params: AssociateExternalConnectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateExternalConnectionResult, Unit]
  ): Request[AssociateExternalConnectionResult, AWSError] = js.native
  
  @JSName("config")
  var config_CodeArtifact: ConfigBase & ClientConfiguration = js.native
  
  /**
    *  Copies package versions from one repository to another repository in the same domain.    You must specify versions or versionRevisions. You cannot specify both.  
    */
  def copyPackageVersions(): Request[CopyPackageVersionsResult, AWSError] = js.native
  def copyPackageVersions(callback: js.Function2[/* err */ AWSError, /* data */ CopyPackageVersionsResult, Unit]): Request[CopyPackageVersionsResult, AWSError] = js.native
  /**
    *  Copies package versions from one repository to another repository in the same domain.    You must specify versions or versionRevisions. You cannot specify both.  
    */
  def copyPackageVersions(params: CopyPackageVersionsRequest): Request[CopyPackageVersionsResult, AWSError] = js.native
  def copyPackageVersions(
    params: CopyPackageVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CopyPackageVersionsResult, Unit]
  ): Request[CopyPackageVersionsResult, AWSError] = js.native
  
  /**
    *  Creates a domain. CodeArtifact domains make it easier to manage multiple repositories across an organization. You can use a domain to apply permissions across many repositories owned by different Amazon Web Services accounts. An asset is stored only once in a domain, even if it's in multiple repositories.  Although you can have multiple domains, we recommend a single production domain that contains all published artifacts so that your development teams can find and share packages. You can use a second pre-production domain to test changes to the production domain configuration. 
    */
  def createDomain(): Request[CreateDomainResult, AWSError] = js.native
  def createDomain(callback: js.Function2[/* err */ AWSError, /* data */ CreateDomainResult, Unit]): Request[CreateDomainResult, AWSError] = js.native
  /**
    *  Creates a domain. CodeArtifact domains make it easier to manage multiple repositories across an organization. You can use a domain to apply permissions across many repositories owned by different Amazon Web Services accounts. An asset is stored only once in a domain, even if it's in multiple repositories.  Although you can have multiple domains, we recommend a single production domain that contains all published artifacts so that your development teams can find and share packages. You can use a second pre-production domain to test changes to the production domain configuration. 
    */
  def createDomain(params: CreateDomainRequest): Request[CreateDomainResult, AWSError] = js.native
  def createDomain(
    params: CreateDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDomainResult, Unit]
  ): Request[CreateDomainResult, AWSError] = js.native
  
  /**
    *  Creates a repository. 
    */
  def createRepository(): Request[CreateRepositoryResult, AWSError] = js.native
  def createRepository(callback: js.Function2[/* err */ AWSError, /* data */ CreateRepositoryResult, Unit]): Request[CreateRepositoryResult, AWSError] = js.native
  /**
    *  Creates a repository. 
    */
  def createRepository(params: CreateRepositoryRequest): Request[CreateRepositoryResult, AWSError] = js.native
  def createRepository(
    params: CreateRepositoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRepositoryResult, Unit]
  ): Request[CreateRepositoryResult, AWSError] = js.native
  
  /**
    *  Deletes a domain. You cannot delete a domain that contains repositories. If you want to delete a domain with repositories, first delete its repositories. 
    */
  def deleteDomain(): Request[DeleteDomainResult, AWSError] = js.native
  def deleteDomain(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDomainResult, Unit]): Request[DeleteDomainResult, AWSError] = js.native
  /**
    *  Deletes a domain. You cannot delete a domain that contains repositories. If you want to delete a domain with repositories, first delete its repositories. 
    */
  def deleteDomain(params: DeleteDomainRequest): Request[DeleteDomainResult, AWSError] = js.native
  def deleteDomain(
    params: DeleteDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDomainResult, Unit]
  ): Request[DeleteDomainResult, AWSError] = js.native
  
  /**
    *  Deletes the resource policy set on a domain. 
    */
  def deleteDomainPermissionsPolicy(): Request[DeleteDomainPermissionsPolicyResult, AWSError] = js.native
  def deleteDomainPermissionsPolicy(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDomainPermissionsPolicyResult, Unit]): Request[DeleteDomainPermissionsPolicyResult, AWSError] = js.native
  /**
    *  Deletes the resource policy set on a domain. 
    */
  def deleteDomainPermissionsPolicy(params: DeleteDomainPermissionsPolicyRequest): Request[DeleteDomainPermissionsPolicyResult, AWSError] = js.native
  def deleteDomainPermissionsPolicy(
    params: DeleteDomainPermissionsPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDomainPermissionsPolicyResult, Unit]
  ): Request[DeleteDomainPermissionsPolicyResult, AWSError] = js.native
  
  /**
    *  Deletes one or more versions of a package. A deleted package version cannot be restored in your repository. If you want to remove a package version from your repository and be able to restore it later, set its status to Archived. Archived packages cannot be downloaded from a repository and don't show up with list package APIs (for example, ListackageVersions), but you can restore them using UpdatePackageVersionsStatus. 
    */
  def deletePackageVersions(): Request[DeletePackageVersionsResult, AWSError] = js.native
  def deletePackageVersions(callback: js.Function2[/* err */ AWSError, /* data */ DeletePackageVersionsResult, Unit]): Request[DeletePackageVersionsResult, AWSError] = js.native
  /**
    *  Deletes one or more versions of a package. A deleted package version cannot be restored in your repository. If you want to remove a package version from your repository and be able to restore it later, set its status to Archived. Archived packages cannot be downloaded from a repository and don't show up with list package APIs (for example, ListackageVersions), but you can restore them using UpdatePackageVersionsStatus. 
    */
  def deletePackageVersions(params: DeletePackageVersionsRequest): Request[DeletePackageVersionsResult, AWSError] = js.native
  def deletePackageVersions(
    params: DeletePackageVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeletePackageVersionsResult, Unit]
  ): Request[DeletePackageVersionsResult, AWSError] = js.native
  
  /**
    *  Deletes a repository. 
    */
  def deleteRepository(): Request[DeleteRepositoryResult, AWSError] = js.native
  def deleteRepository(callback: js.Function2[/* err */ AWSError, /* data */ DeleteRepositoryResult, Unit]): Request[DeleteRepositoryResult, AWSError] = js.native
  /**
    *  Deletes a repository. 
    */
  def deleteRepository(params: DeleteRepositoryRequest): Request[DeleteRepositoryResult, AWSError] = js.native
  def deleteRepository(
    params: DeleteRepositoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRepositoryResult, Unit]
  ): Request[DeleteRepositoryResult, AWSError] = js.native
  
  /**
    *  Deletes the resource policy that is set on a repository. After a resource policy is deleted, the permissions allowed and denied by the deleted policy are removed. The effect of deleting a resource policy might not be immediate.    Use DeleteRepositoryPermissionsPolicy with caution. After a policy is deleted, Amazon Web Services users, roles, and accounts lose permissions to perform the repository actions granted by the deleted policy.  
    */
  def deleteRepositoryPermissionsPolicy(): Request[DeleteRepositoryPermissionsPolicyResult, AWSError] = js.native
  def deleteRepositoryPermissionsPolicy(
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRepositoryPermissionsPolicyResult, Unit]
  ): Request[DeleteRepositoryPermissionsPolicyResult, AWSError] = js.native
  /**
    *  Deletes the resource policy that is set on a repository. After a resource policy is deleted, the permissions allowed and denied by the deleted policy are removed. The effect of deleting a resource policy might not be immediate.    Use DeleteRepositoryPermissionsPolicy with caution. After a policy is deleted, Amazon Web Services users, roles, and accounts lose permissions to perform the repository actions granted by the deleted policy.  
    */
  def deleteRepositoryPermissionsPolicy(params: DeleteRepositoryPermissionsPolicyRequest): Request[DeleteRepositoryPermissionsPolicyResult, AWSError] = js.native
  def deleteRepositoryPermissionsPolicy(
    params: DeleteRepositoryPermissionsPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRepositoryPermissionsPolicyResult, Unit]
  ): Request[DeleteRepositoryPermissionsPolicyResult, AWSError] = js.native
  
  /**
    *  Returns a DomainDescription object that contains information about the requested domain. 
    */
  def describeDomain(): Request[DescribeDomainResult, AWSError] = js.native
  def describeDomain(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDomainResult, Unit]): Request[DescribeDomainResult, AWSError] = js.native
  /**
    *  Returns a DomainDescription object that contains information about the requested domain. 
    */
  def describeDomain(params: DescribeDomainRequest): Request[DescribeDomainResult, AWSError] = js.native
  def describeDomain(
    params: DescribeDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDomainResult, Unit]
  ): Request[DescribeDomainResult, AWSError] = js.native
  
  /**
    *  Returns a PackageDescription object that contains information about the requested package.
    */
  def describePackage(): Request[DescribePackageResult, AWSError] = js.native
  def describePackage(callback: js.Function2[/* err */ AWSError, /* data */ DescribePackageResult, Unit]): Request[DescribePackageResult, AWSError] = js.native
  /**
    *  Returns a PackageDescription object that contains information about the requested package.
    */
  def describePackage(params: DescribePackageRequest): Request[DescribePackageResult, AWSError] = js.native
  def describePackage(
    params: DescribePackageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePackageResult, Unit]
  ): Request[DescribePackageResult, AWSError] = js.native
  
  /**
    *  Returns a PackageVersionDescription object that contains information about the requested package version. 
    */
  def describePackageVersion(): Request[DescribePackageVersionResult, AWSError] = js.native
  def describePackageVersion(callback: js.Function2[/* err */ AWSError, /* data */ DescribePackageVersionResult, Unit]): Request[DescribePackageVersionResult, AWSError] = js.native
  /**
    *  Returns a PackageVersionDescription object that contains information about the requested package version. 
    */
  def describePackageVersion(params: DescribePackageVersionRequest): Request[DescribePackageVersionResult, AWSError] = js.native
  def describePackageVersion(
    params: DescribePackageVersionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePackageVersionResult, Unit]
  ): Request[DescribePackageVersionResult, AWSError] = js.native
  
  /**
    *  Returns a RepositoryDescription object that contains detailed information about the requested repository. 
    */
  def describeRepository(): Request[DescribeRepositoryResult, AWSError] = js.native
  def describeRepository(callback: js.Function2[/* err */ AWSError, /* data */ DescribeRepositoryResult, Unit]): Request[DescribeRepositoryResult, AWSError] = js.native
  /**
    *  Returns a RepositoryDescription object that contains detailed information about the requested repository. 
    */
  def describeRepository(params: DescribeRepositoryRequest): Request[DescribeRepositoryResult, AWSError] = js.native
  def describeRepository(
    params: DescribeRepositoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRepositoryResult, Unit]
  ): Request[DescribeRepositoryResult, AWSError] = js.native
  
  /**
    *  Removes an existing external connection from a repository. 
    */
  def disassociateExternalConnection(): Request[DisassociateExternalConnectionResult, AWSError] = js.native
  def disassociateExternalConnection(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateExternalConnectionResult, Unit]): Request[DisassociateExternalConnectionResult, AWSError] = js.native
  /**
    *  Removes an existing external connection from a repository. 
    */
  def disassociateExternalConnection(params: DisassociateExternalConnectionRequest): Request[DisassociateExternalConnectionResult, AWSError] = js.native
  def disassociateExternalConnection(
    params: DisassociateExternalConnectionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateExternalConnectionResult, Unit]
  ): Request[DisassociateExternalConnectionResult, AWSError] = js.native
  
  /**
    *  Deletes the assets in package versions and sets the package versions' status to Disposed. A disposed package version cannot be restored in your repository because its assets are deleted.   To view all disposed package versions in a repository, use ListPackageVersions and set the status parameter to Disposed.   To view information about a disposed package version, use DescribePackageVersion. 
    */
  def disposePackageVersions(): Request[DisposePackageVersionsResult, AWSError] = js.native
  def disposePackageVersions(callback: js.Function2[/* err */ AWSError, /* data */ DisposePackageVersionsResult, Unit]): Request[DisposePackageVersionsResult, AWSError] = js.native
  /**
    *  Deletes the assets in package versions and sets the package versions' status to Disposed. A disposed package version cannot be restored in your repository because its assets are deleted.   To view all disposed package versions in a repository, use ListPackageVersions and set the status parameter to Disposed.   To view information about a disposed package version, use DescribePackageVersion. 
    */
  def disposePackageVersions(params: DisposePackageVersionsRequest): Request[DisposePackageVersionsResult, AWSError] = js.native
  def disposePackageVersions(
    params: DisposePackageVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisposePackageVersionsResult, Unit]
  ): Request[DisposePackageVersionsResult, AWSError] = js.native
  
  /**
    *  Generates a temporary authorization token for accessing repositories in the domain. This API requires the codeartifact:GetAuthorizationToken and sts:GetServiceBearerToken permissions. For more information about authorization tokens, see CodeArtifact authentication and tokens.   CodeArtifact authorization tokens are valid for a period of 12 hours when created with the login command. You can call login periodically to refresh the token. When you create an authorization token with the GetAuthorizationToken API, you can set a custom authorization period, up to a maximum of 12 hours, with the durationSeconds parameter. The authorization period begins after login or GetAuthorizationToken is called. If login or GetAuthorizationToken is called while assuming a role, the token lifetime is independent of the maximum session duration of the role. For example, if you call sts assume-role and specify a session duration of 15 minutes, then generate a CodeArtifact authorization token, the token will be valid for the full authorization period even though this is longer than the 15-minute session duration. See Using IAM Roles for more information on controlling session duration.  
    */
  def getAuthorizationToken(): Request[GetAuthorizationTokenResult, AWSError] = js.native
  def getAuthorizationToken(callback: js.Function2[/* err */ AWSError, /* data */ GetAuthorizationTokenResult, Unit]): Request[GetAuthorizationTokenResult, AWSError] = js.native
  /**
    *  Generates a temporary authorization token for accessing repositories in the domain. This API requires the codeartifact:GetAuthorizationToken and sts:GetServiceBearerToken permissions. For more information about authorization tokens, see CodeArtifact authentication and tokens.   CodeArtifact authorization tokens are valid for a period of 12 hours when created with the login command. You can call login periodically to refresh the token. When you create an authorization token with the GetAuthorizationToken API, you can set a custom authorization period, up to a maximum of 12 hours, with the durationSeconds parameter. The authorization period begins after login or GetAuthorizationToken is called. If login or GetAuthorizationToken is called while assuming a role, the token lifetime is independent of the maximum session duration of the role. For example, if you call sts assume-role and specify a session duration of 15 minutes, then generate a CodeArtifact authorization token, the token will be valid for the full authorization period even though this is longer than the 15-minute session duration. See Using IAM Roles for more information on controlling session duration.  
    */
  def getAuthorizationToken(params: GetAuthorizationTokenRequest): Request[GetAuthorizationTokenResult, AWSError] = js.native
  def getAuthorizationToken(
    params: GetAuthorizationTokenRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAuthorizationTokenResult, Unit]
  ): Request[GetAuthorizationTokenResult, AWSError] = js.native
  
  /**
    *  Returns the resource policy attached to the specified domain.    The policy is a resource-based policy, not an identity-based policy. For more information, see Identity-based policies and resource-based policies  in the IAM User Guide.  
    */
  def getDomainPermissionsPolicy(): Request[GetDomainPermissionsPolicyResult, AWSError] = js.native
  def getDomainPermissionsPolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetDomainPermissionsPolicyResult, Unit]): Request[GetDomainPermissionsPolicyResult, AWSError] = js.native
  /**
    *  Returns the resource policy attached to the specified domain.    The policy is a resource-based policy, not an identity-based policy. For more information, see Identity-based policies and resource-based policies  in the IAM User Guide.  
    */
  def getDomainPermissionsPolicy(params: GetDomainPermissionsPolicyRequest): Request[GetDomainPermissionsPolicyResult, AWSError] = js.native
  def getDomainPermissionsPolicy(
    params: GetDomainPermissionsPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDomainPermissionsPolicyResult, Unit]
  ): Request[GetDomainPermissionsPolicyResult, AWSError] = js.native
  
  /**
    *  Returns an asset (or file) that is in a package. For example, for a Maven package version, use GetPackageVersionAsset to download a JAR file, a POM file, or any other assets in the package version. 
    */
  def getPackageVersionAsset(): Request[GetPackageVersionAssetResult, AWSError] = js.native
  def getPackageVersionAsset(callback: js.Function2[/* err */ AWSError, /* data */ GetPackageVersionAssetResult, Unit]): Request[GetPackageVersionAssetResult, AWSError] = js.native
  /**
    *  Returns an asset (or file) that is in a package. For example, for a Maven package version, use GetPackageVersionAsset to download a JAR file, a POM file, or any other assets in the package version. 
    */
  def getPackageVersionAsset(params: GetPackageVersionAssetRequest): Request[GetPackageVersionAssetResult, AWSError] = js.native
  def getPackageVersionAsset(
    params: GetPackageVersionAssetRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPackageVersionAssetResult, Unit]
  ): Request[GetPackageVersionAssetResult, AWSError] = js.native
  
  /**
    *  Gets the readme file or descriptive text for a package version. For packages that do not contain a readme file, CodeArtifact extracts a description from a metadata file. For example, from the &lt;description&gt; element in the pom.xml file of a Maven package.   The returned text might contain formatting. For example, it might contain formatting for Markdown or reStructuredText. 
    */
  def getPackageVersionReadme(): Request[GetPackageVersionReadmeResult, AWSError] = js.native
  def getPackageVersionReadme(callback: js.Function2[/* err */ AWSError, /* data */ GetPackageVersionReadmeResult, Unit]): Request[GetPackageVersionReadmeResult, AWSError] = js.native
  /**
    *  Gets the readme file or descriptive text for a package version. For packages that do not contain a readme file, CodeArtifact extracts a description from a metadata file. For example, from the &lt;description&gt; element in the pom.xml file of a Maven package.   The returned text might contain formatting. For example, it might contain formatting for Markdown or reStructuredText. 
    */
  def getPackageVersionReadme(params: GetPackageVersionReadmeRequest): Request[GetPackageVersionReadmeResult, AWSError] = js.native
  def getPackageVersionReadme(
    params: GetPackageVersionReadmeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPackageVersionReadmeResult, Unit]
  ): Request[GetPackageVersionReadmeResult, AWSError] = js.native
  
  /**
    *  Returns the endpoint of a repository for a specific package format. A repository has one endpoint for each package format:     maven     npm     nuget     pypi   
    */
  def getRepositoryEndpoint(): Request[GetRepositoryEndpointResult, AWSError] = js.native
  def getRepositoryEndpoint(callback: js.Function2[/* err */ AWSError, /* data */ GetRepositoryEndpointResult, Unit]): Request[GetRepositoryEndpointResult, AWSError] = js.native
  /**
    *  Returns the endpoint of a repository for a specific package format. A repository has one endpoint for each package format:     maven     npm     nuget     pypi   
    */
  def getRepositoryEndpoint(params: GetRepositoryEndpointRequest): Request[GetRepositoryEndpointResult, AWSError] = js.native
  def getRepositoryEndpoint(
    params: GetRepositoryEndpointRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRepositoryEndpointResult, Unit]
  ): Request[GetRepositoryEndpointResult, AWSError] = js.native
  
  /**
    *  Returns the resource policy that is set on a repository. 
    */
  def getRepositoryPermissionsPolicy(): Request[GetRepositoryPermissionsPolicyResult, AWSError] = js.native
  def getRepositoryPermissionsPolicy(callback: js.Function2[/* err */ AWSError, /* data */ GetRepositoryPermissionsPolicyResult, Unit]): Request[GetRepositoryPermissionsPolicyResult, AWSError] = js.native
  /**
    *  Returns the resource policy that is set on a repository. 
    */
  def getRepositoryPermissionsPolicy(params: GetRepositoryPermissionsPolicyRequest): Request[GetRepositoryPermissionsPolicyResult, AWSError] = js.native
  def getRepositoryPermissionsPolicy(
    params: GetRepositoryPermissionsPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRepositoryPermissionsPolicyResult, Unit]
  ): Request[GetRepositoryPermissionsPolicyResult, AWSError] = js.native
  
  /**
    *  Returns a list of DomainSummary objects for all domains owned by the Amazon Web Services account that makes this call. Each returned DomainSummary object contains information about a domain. 
    */
  def listDomains(): Request[ListDomainsResult, AWSError] = js.native
  def listDomains(callback: js.Function2[/* err */ AWSError, /* data */ ListDomainsResult, Unit]): Request[ListDomainsResult, AWSError] = js.native
  /**
    *  Returns a list of DomainSummary objects for all domains owned by the Amazon Web Services account that makes this call. Each returned DomainSummary object contains information about a domain. 
    */
  def listDomains(params: ListDomainsRequest): Request[ListDomainsResult, AWSError] = js.native
  def listDomains(
    params: ListDomainsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDomainsResult, Unit]
  ): Request[ListDomainsResult, AWSError] = js.native
  
  /**
    *  Returns a list of AssetSummary objects for assets in a package version. 
    */
  def listPackageVersionAssets(): Request[ListPackageVersionAssetsResult, AWSError] = js.native
  def listPackageVersionAssets(callback: js.Function2[/* err */ AWSError, /* data */ ListPackageVersionAssetsResult, Unit]): Request[ListPackageVersionAssetsResult, AWSError] = js.native
  /**
    *  Returns a list of AssetSummary objects for assets in a package version. 
    */
  def listPackageVersionAssets(params: ListPackageVersionAssetsRequest): Request[ListPackageVersionAssetsResult, AWSError] = js.native
  def listPackageVersionAssets(
    params: ListPackageVersionAssetsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPackageVersionAssetsResult, Unit]
  ): Request[ListPackageVersionAssetsResult, AWSError] = js.native
  
  /**
    *  Returns the direct dependencies for a package version. The dependencies are returned as PackageDependency objects. CodeArtifact extracts the dependencies for a package version from the metadata file for the package format (for example, the package.json file for npm packages and the pom.xml file for Maven). Any package version dependencies that are not listed in the configuration file are not returned. 
    */
  def listPackageVersionDependencies(): Request[ListPackageVersionDependenciesResult, AWSError] = js.native
  def listPackageVersionDependencies(callback: js.Function2[/* err */ AWSError, /* data */ ListPackageVersionDependenciesResult, Unit]): Request[ListPackageVersionDependenciesResult, AWSError] = js.native
  /**
    *  Returns the direct dependencies for a package version. The dependencies are returned as PackageDependency objects. CodeArtifact extracts the dependencies for a package version from the metadata file for the package format (for example, the package.json file for npm packages and the pom.xml file for Maven). Any package version dependencies that are not listed in the configuration file are not returned. 
    */
  def listPackageVersionDependencies(params: ListPackageVersionDependenciesRequest): Request[ListPackageVersionDependenciesResult, AWSError] = js.native
  def listPackageVersionDependencies(
    params: ListPackageVersionDependenciesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPackageVersionDependenciesResult, Unit]
  ): Request[ListPackageVersionDependenciesResult, AWSError] = js.native
  
  /**
    *  Returns a list of PackageVersionSummary objects for package versions in a repository that match the request parameters. 
    */
  def listPackageVersions(): Request[ListPackageVersionsResult, AWSError] = js.native
  def listPackageVersions(callback: js.Function2[/* err */ AWSError, /* data */ ListPackageVersionsResult, Unit]): Request[ListPackageVersionsResult, AWSError] = js.native
  /**
    *  Returns a list of PackageVersionSummary objects for package versions in a repository that match the request parameters. 
    */
  def listPackageVersions(params: ListPackageVersionsRequest): Request[ListPackageVersionsResult, AWSError] = js.native
  def listPackageVersions(
    params: ListPackageVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPackageVersionsResult, Unit]
  ): Request[ListPackageVersionsResult, AWSError] = js.native
  
  /**
    *  Returns a list of PackageSummary objects for packages in a repository that match the request parameters. 
    */
  def listPackages(): Request[ListPackagesResult, AWSError] = js.native
  def listPackages(callback: js.Function2[/* err */ AWSError, /* data */ ListPackagesResult, Unit]): Request[ListPackagesResult, AWSError] = js.native
  /**
    *  Returns a list of PackageSummary objects for packages in a repository that match the request parameters. 
    */
  def listPackages(params: ListPackagesRequest): Request[ListPackagesResult, AWSError] = js.native
  def listPackages(
    params: ListPackagesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPackagesResult, Unit]
  ): Request[ListPackagesResult, AWSError] = js.native
  
  /**
    *  Returns a list of RepositorySummary objects. Each RepositorySummary contains information about a repository in the specified Amazon Web Services account and that matches the input parameters. 
    */
  def listRepositories(): Request[ListRepositoriesResult, AWSError] = js.native
  def listRepositories(callback: js.Function2[/* err */ AWSError, /* data */ ListRepositoriesResult, Unit]): Request[ListRepositoriesResult, AWSError] = js.native
  /**
    *  Returns a list of RepositorySummary objects. Each RepositorySummary contains information about a repository in the specified Amazon Web Services account and that matches the input parameters. 
    */
  def listRepositories(params: ListRepositoriesRequest): Request[ListRepositoriesResult, AWSError] = js.native
  def listRepositories(
    params: ListRepositoriesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRepositoriesResult, Unit]
  ): Request[ListRepositoriesResult, AWSError] = js.native
  
  /**
    *  Returns a list of RepositorySummary objects. Each RepositorySummary contains information about a repository in the specified domain and that matches the input parameters. 
    */
  def listRepositoriesInDomain(): Request[ListRepositoriesInDomainResult, AWSError] = js.native
  def listRepositoriesInDomain(callback: js.Function2[/* err */ AWSError, /* data */ ListRepositoriesInDomainResult, Unit]): Request[ListRepositoriesInDomainResult, AWSError] = js.native
  /**
    *  Returns a list of RepositorySummary objects. Each RepositorySummary contains information about a repository in the specified domain and that matches the input parameters. 
    */
  def listRepositoriesInDomain(params: ListRepositoriesInDomainRequest): Request[ListRepositoriesInDomainResult, AWSError] = js.native
  def listRepositoriesInDomain(
    params: ListRepositoriesInDomainRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRepositoriesInDomainResult, Unit]
  ): Request[ListRepositoriesInDomainResult, AWSError] = js.native
  
  /**
    * Gets information about Amazon Web Services tags for a specified Amazon Resource Name (ARN) in CodeArtifact.
    */
  def listTagsForResource(): Request[ListTagsForResourceResult, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResult, Unit]): Request[ListTagsForResourceResult, AWSError] = js.native
  /**
    * Gets information about Amazon Web Services tags for a specified Amazon Resource Name (ARN) in CodeArtifact.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResult, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResult, Unit]
  ): Request[ListTagsForResourceResult, AWSError] = js.native
  
  /**
    *  Sets a resource policy on a domain that specifies permissions to access it.   When you call PutDomainPermissionsPolicy, the resource policy on the domain is ignored when evaluting permissions. This ensures that the owner of a domain cannot lock themselves out of the domain, which would prevent them from being able to update the resource policy. 
    */
  def putDomainPermissionsPolicy(): Request[PutDomainPermissionsPolicyResult, AWSError] = js.native
  def putDomainPermissionsPolicy(callback: js.Function2[/* err */ AWSError, /* data */ PutDomainPermissionsPolicyResult, Unit]): Request[PutDomainPermissionsPolicyResult, AWSError] = js.native
  /**
    *  Sets a resource policy on a domain that specifies permissions to access it.   When you call PutDomainPermissionsPolicy, the resource policy on the domain is ignored when evaluting permissions. This ensures that the owner of a domain cannot lock themselves out of the domain, which would prevent them from being able to update the resource policy. 
    */
  def putDomainPermissionsPolicy(params: PutDomainPermissionsPolicyRequest): Request[PutDomainPermissionsPolicyResult, AWSError] = js.native
  def putDomainPermissionsPolicy(
    params: PutDomainPermissionsPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutDomainPermissionsPolicyResult, Unit]
  ): Request[PutDomainPermissionsPolicyResult, AWSError] = js.native
  
  /**
    * Sets the package origin configuration for a package. The package origin configuration determines how new versions of a package can be added to a repository. You can allow or block direct publishing of new package versions, or ingestion and retaining of new package versions from an external connection or upstream source. For more information about package origin controls and configuration, see Editing package origin controls in the CodeArtifact User Guide.  PutPackageOriginConfiguration can be called on a package that doesn't yet exist in the repository. When called on a package that does not exist, a package is created in the repository with no versions and the requested restrictions are set on the package. This can be used to preemptively block ingesting or retaining any versions from external connections or upstream repositories, or to block publishing any versions of the package into the repository before connecting any package managers or publishers to the repository.
    */
  def putPackageOriginConfiguration(): Request[PutPackageOriginConfigurationResult, AWSError] = js.native
  def putPackageOriginConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ PutPackageOriginConfigurationResult, Unit]): Request[PutPackageOriginConfigurationResult, AWSError] = js.native
  /**
    * Sets the package origin configuration for a package. The package origin configuration determines how new versions of a package can be added to a repository. You can allow or block direct publishing of new package versions, or ingestion and retaining of new package versions from an external connection or upstream source. For more information about package origin controls and configuration, see Editing package origin controls in the CodeArtifact User Guide.  PutPackageOriginConfiguration can be called on a package that doesn't yet exist in the repository. When called on a package that does not exist, a package is created in the repository with no versions and the requested restrictions are set on the package. This can be used to preemptively block ingesting or retaining any versions from external connections or upstream repositories, or to block publishing any versions of the package into the repository before connecting any package managers or publishers to the repository.
    */
  def putPackageOriginConfiguration(params: PutPackageOriginConfigurationRequest): Request[PutPackageOriginConfigurationResult, AWSError] = js.native
  def putPackageOriginConfiguration(
    params: PutPackageOriginConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutPackageOriginConfigurationResult, Unit]
  ): Request[PutPackageOriginConfigurationResult, AWSError] = js.native
  
  /**
    *  Sets the resource policy on a repository that specifies permissions to access it.   When you call PutRepositoryPermissionsPolicy, the resource policy on the repository is ignored when evaluting permissions. This ensures that the owner of a repository cannot lock themselves out of the repository, which would prevent them from being able to update the resource policy. 
    */
  def putRepositoryPermissionsPolicy(): Request[PutRepositoryPermissionsPolicyResult, AWSError] = js.native
  def putRepositoryPermissionsPolicy(callback: js.Function2[/* err */ AWSError, /* data */ PutRepositoryPermissionsPolicyResult, Unit]): Request[PutRepositoryPermissionsPolicyResult, AWSError] = js.native
  /**
    *  Sets the resource policy on a repository that specifies permissions to access it.   When you call PutRepositoryPermissionsPolicy, the resource policy on the repository is ignored when evaluting permissions. This ensures that the owner of a repository cannot lock themselves out of the repository, which would prevent them from being able to update the resource policy. 
    */
  def putRepositoryPermissionsPolicy(params: PutRepositoryPermissionsPolicyRequest): Request[PutRepositoryPermissionsPolicyResult, AWSError] = js.native
  def putRepositoryPermissionsPolicy(
    params: PutRepositoryPermissionsPolicyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutRepositoryPermissionsPolicyResult, Unit]
  ): Request[PutRepositoryPermissionsPolicyResult, AWSError] = js.native
  
  /**
    * Adds or updates tags for a resource in CodeArtifact.
    */
  def tagResource(): Request[TagResourceResult, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResult, Unit]): Request[TagResourceResult, AWSError] = js.native
  /**
    * Adds or updates tags for a resource in CodeArtifact.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResult, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResult, Unit]
  ): Request[TagResourceResult, AWSError] = js.native
  
  /**
    * Removes tags from a resource in CodeArtifact.
    */
  def untagResource(): Request[UntagResourceResult, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResult, Unit]): Request[UntagResourceResult, AWSError] = js.native
  /**
    * Removes tags from a resource in CodeArtifact.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResult, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResult, Unit]
  ): Request[UntagResourceResult, AWSError] = js.native
  
  /**
    *  Updates the status of one or more versions of a package. Using UpdatePackageVersionsStatus, you can update the status of package versions to Archived, Published, or Unlisted. To set the status of a package version to Disposed, use DisposePackageVersions. 
    */
  def updatePackageVersionsStatus(): Request[UpdatePackageVersionsStatusResult, AWSError] = js.native
  def updatePackageVersionsStatus(callback: js.Function2[/* err */ AWSError, /* data */ UpdatePackageVersionsStatusResult, Unit]): Request[UpdatePackageVersionsStatusResult, AWSError] = js.native
  /**
    *  Updates the status of one or more versions of a package. Using UpdatePackageVersionsStatus, you can update the status of package versions to Archived, Published, or Unlisted. To set the status of a package version to Disposed, use DisposePackageVersions. 
    */
  def updatePackageVersionsStatus(params: UpdatePackageVersionsStatusRequest): Request[UpdatePackageVersionsStatusResult, AWSError] = js.native
  def updatePackageVersionsStatus(
    params: UpdatePackageVersionsStatusRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdatePackageVersionsStatusResult, Unit]
  ): Request[UpdatePackageVersionsStatusResult, AWSError] = js.native
  
  /**
    *  Update the properties of a repository. 
    */
  def updateRepository(): Request[UpdateRepositoryResult, AWSError] = js.native
  def updateRepository(callback: js.Function2[/* err */ AWSError, /* data */ UpdateRepositoryResult, Unit]): Request[UpdateRepositoryResult, AWSError] = js.native
  /**
    *  Update the properties of a repository. 
    */
  def updateRepository(params: UpdateRepositoryRequest): Request[UpdateRepositoryResult, AWSError] = js.native
  def updateRepository(
    params: UpdateRepositoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRepositoryResult, Unit]
  ): Request[UpdateRepositoryResult, AWSError] = js.native
}
