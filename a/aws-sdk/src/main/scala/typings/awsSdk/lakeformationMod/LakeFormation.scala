package typings.awsSdk.lakeformationMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LakeFormation extends Service {
  
  /**
    * Batch operation to grant permissions to the principal.
    */
  def batchGrantPermissions(): Request[BatchGrantPermissionsResponse, AWSError] = js.native
  def batchGrantPermissions(callback: js.Function2[/* err */ AWSError, /* data */ BatchGrantPermissionsResponse, Unit]): Request[BatchGrantPermissionsResponse, AWSError] = js.native
  /**
    * Batch operation to grant permissions to the principal.
    */
  def batchGrantPermissions(params: BatchGrantPermissionsRequest): Request[BatchGrantPermissionsResponse, AWSError] = js.native
  def batchGrantPermissions(
    params: BatchGrantPermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchGrantPermissionsResponse, Unit]
  ): Request[BatchGrantPermissionsResponse, AWSError] = js.native
  
  /**
    * Batch operation to revoke permissions from the principal.
    */
  def batchRevokePermissions(): Request[BatchRevokePermissionsResponse, AWSError] = js.native
  def batchRevokePermissions(callback: js.Function2[/* err */ AWSError, /* data */ BatchRevokePermissionsResponse, Unit]): Request[BatchRevokePermissionsResponse, AWSError] = js.native
  /**
    * Batch operation to revoke permissions from the principal.
    */
  def batchRevokePermissions(params: BatchRevokePermissionsRequest): Request[BatchRevokePermissionsResponse, AWSError] = js.native
  def batchRevokePermissions(
    params: BatchRevokePermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchRevokePermissionsResponse, Unit]
  ): Request[BatchRevokePermissionsResponse, AWSError] = js.native
  
  @JSName("config")
  var config_LakeFormation: ConfigBase with ClientConfiguration = js.native
  
  /**
    * Deregisters the resource as managed by the Data Catalog. When you deregister a path, Lake Formation removes the path from the inline policy attached to your service-linked role.
    */
  def deregisterResource(): Request[DeregisterResourceResponse, AWSError] = js.native
  def deregisterResource(callback: js.Function2[/* err */ AWSError, /* data */ DeregisterResourceResponse, Unit]): Request[DeregisterResourceResponse, AWSError] = js.native
  /**
    * Deregisters the resource as managed by the Data Catalog. When you deregister a path, Lake Formation removes the path from the inline policy attached to your service-linked role.
    */
  def deregisterResource(params: DeregisterResourceRequest): Request[DeregisterResourceResponse, AWSError] = js.native
  def deregisterResource(
    params: DeregisterResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeregisterResourceResponse, Unit]
  ): Request[DeregisterResourceResponse, AWSError] = js.native
  
  /**
    * Retrieves the current data access role for the given resource registered in AWS Lake Formation.
    */
  def describeResource(): Request[DescribeResourceResponse, AWSError] = js.native
  def describeResource(callback: js.Function2[/* err */ AWSError, /* data */ DescribeResourceResponse, Unit]): Request[DescribeResourceResponse, AWSError] = js.native
  /**
    * Retrieves the current data access role for the given resource registered in AWS Lake Formation.
    */
  def describeResource(params: DescribeResourceRequest): Request[DescribeResourceResponse, AWSError] = js.native
  def describeResource(
    params: DescribeResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeResourceResponse, Unit]
  ): Request[DescribeResourceResponse, AWSError] = js.native
  
  /**
    * Retrieves the list of the data lake administrators of a Lake Formation-managed data lake. 
    */
  def getDataLakeSettings(): Request[GetDataLakeSettingsResponse, AWSError] = js.native
  def getDataLakeSettings(callback: js.Function2[/* err */ AWSError, /* data */ GetDataLakeSettingsResponse, Unit]): Request[GetDataLakeSettingsResponse, AWSError] = js.native
  /**
    * Retrieves the list of the data lake administrators of a Lake Formation-managed data lake. 
    */
  def getDataLakeSettings(params: GetDataLakeSettingsRequest): Request[GetDataLakeSettingsResponse, AWSError] = js.native
  def getDataLakeSettings(
    params: GetDataLakeSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDataLakeSettingsResponse, Unit]
  ): Request[GetDataLakeSettingsResponse, AWSError] = js.native
  
  /**
    * Returns the Lake Formation permissions for a specified table or database resource located at a path in Amazon S3. GetEffectivePermissionsForPath will not return databases and tables if the catalog is encrypted.
    */
  def getEffectivePermissionsForPath(): Request[GetEffectivePermissionsForPathResponse, AWSError] = js.native
  def getEffectivePermissionsForPath(
    callback: js.Function2[/* err */ AWSError, /* data */ GetEffectivePermissionsForPathResponse, Unit]
  ): Request[GetEffectivePermissionsForPathResponse, AWSError] = js.native
  /**
    * Returns the Lake Formation permissions for a specified table or database resource located at a path in Amazon S3. GetEffectivePermissionsForPath will not return databases and tables if the catalog is encrypted.
    */
  def getEffectivePermissionsForPath(params: GetEffectivePermissionsForPathRequest): Request[GetEffectivePermissionsForPathResponse, AWSError] = js.native
  def getEffectivePermissionsForPath(
    params: GetEffectivePermissionsForPathRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEffectivePermissionsForPathResponse, Unit]
  ): Request[GetEffectivePermissionsForPathResponse, AWSError] = js.native
  
  /**
    * Grants permissions to the principal to access metadata in the Data Catalog and data organized in underlying data storage such as Amazon S3. For information about permissions, see Security and Access Control to Metadata and Data.
    */
  def grantPermissions(): Request[GrantPermissionsResponse, AWSError] = js.native
  def grantPermissions(callback: js.Function2[/* err */ AWSError, /* data */ GrantPermissionsResponse, Unit]): Request[GrantPermissionsResponse, AWSError] = js.native
  /**
    * Grants permissions to the principal to access metadata in the Data Catalog and data organized in underlying data storage such as Amazon S3. For information about permissions, see Security and Access Control to Metadata and Data.
    */
  def grantPermissions(params: GrantPermissionsRequest): Request[GrantPermissionsResponse, AWSError] = js.native
  def grantPermissions(
    params: GrantPermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GrantPermissionsResponse, Unit]
  ): Request[GrantPermissionsResponse, AWSError] = js.native
  
  /**
    * Returns a list of the principal permissions on the resource, filtered by the permissions of the caller. For example, if you are granted an ALTER permission, you are able to see only the principal permissions for ALTER. This operation returns only those permissions that have been explicitly granted. For information about permissions, see Security and Access Control to Metadata and Data.
    */
  def listPermissions(): Request[ListPermissionsResponse, AWSError] = js.native
  def listPermissions(callback: js.Function2[/* err */ AWSError, /* data */ ListPermissionsResponse, Unit]): Request[ListPermissionsResponse, AWSError] = js.native
  /**
    * Returns a list of the principal permissions on the resource, filtered by the permissions of the caller. For example, if you are granted an ALTER permission, you are able to see only the principal permissions for ALTER. This operation returns only those permissions that have been explicitly granted. For information about permissions, see Security and Access Control to Metadata and Data.
    */
  def listPermissions(params: ListPermissionsRequest): Request[ListPermissionsResponse, AWSError] = js.native
  def listPermissions(
    params: ListPermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPermissionsResponse, Unit]
  ): Request[ListPermissionsResponse, AWSError] = js.native
  
  /**
    * Lists the resources registered to be managed by the Data Catalog.
    */
  def listResources(): Request[ListResourcesResponse, AWSError] = js.native
  def listResources(callback: js.Function2[/* err */ AWSError, /* data */ ListResourcesResponse, Unit]): Request[ListResourcesResponse, AWSError] = js.native
  /**
    * Lists the resources registered to be managed by the Data Catalog.
    */
  def listResources(params: ListResourcesRequest): Request[ListResourcesResponse, AWSError] = js.native
  def listResources(
    params: ListResourcesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListResourcesResponse, Unit]
  ): Request[ListResourcesResponse, AWSError] = js.native
  
  /**
    * Sets the list of data lake administrators who have admin privileges on all resources managed by Lake Formation. For more information on admin privileges, see Granting Lake Formation Permissions. This API replaces the current list of data lake admins with the new list being passed. To add an admin, fetch the current list and add the new admin to that list and pass that list in this API.
    */
  def putDataLakeSettings(): Request[PutDataLakeSettingsResponse, AWSError] = js.native
  def putDataLakeSettings(callback: js.Function2[/* err */ AWSError, /* data */ PutDataLakeSettingsResponse, Unit]): Request[PutDataLakeSettingsResponse, AWSError] = js.native
  /**
    * Sets the list of data lake administrators who have admin privileges on all resources managed by Lake Formation. For more information on admin privileges, see Granting Lake Formation Permissions. This API replaces the current list of data lake admins with the new list being passed. To add an admin, fetch the current list and add the new admin to that list and pass that list in this API.
    */
  def putDataLakeSettings(params: PutDataLakeSettingsRequest): Request[PutDataLakeSettingsResponse, AWSError] = js.native
  def putDataLakeSettings(
    params: PutDataLakeSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutDataLakeSettingsResponse, Unit]
  ): Request[PutDataLakeSettingsResponse, AWSError] = js.native
  
  /**
    * Registers the resource as managed by the Data Catalog. To add or update data, Lake Formation needs read/write access to the chosen Amazon S3 path. Choose a role that you know has permission to do this, or choose the AWSServiceRoleForLakeFormationDataAccess service-linked role. When you register the first Amazon S3 path, the service-linked role and a new inline policy are created on your behalf. Lake Formation adds the first path to the inline policy and attaches it to the service-linked role. When you register subsequent paths, Lake Formation adds the path to the existing policy. The following request registers a new location and gives AWS Lake Formation permission to use the service-linked role to access that location.  ResourceArn = arn:aws:s3:::my-bucket UseServiceLinkedRole = true  If UseServiceLinkedRole is not set to true, you must provide or set the RoleArn:  arn:aws:iam::12345:role/my-data-access-role 
    */
  def registerResource(): Request[RegisterResourceResponse, AWSError] = js.native
  def registerResource(callback: js.Function2[/* err */ AWSError, /* data */ RegisterResourceResponse, Unit]): Request[RegisterResourceResponse, AWSError] = js.native
  /**
    * Registers the resource as managed by the Data Catalog. To add or update data, Lake Formation needs read/write access to the chosen Amazon S3 path. Choose a role that you know has permission to do this, or choose the AWSServiceRoleForLakeFormationDataAccess service-linked role. When you register the first Amazon S3 path, the service-linked role and a new inline policy are created on your behalf. Lake Formation adds the first path to the inline policy and attaches it to the service-linked role. When you register subsequent paths, Lake Formation adds the path to the existing policy. The following request registers a new location and gives AWS Lake Formation permission to use the service-linked role to access that location.  ResourceArn = arn:aws:s3:::my-bucket UseServiceLinkedRole = true  If UseServiceLinkedRole is not set to true, you must provide or set the RoleArn:  arn:aws:iam::12345:role/my-data-access-role 
    */
  def registerResource(params: RegisterResourceRequest): Request[RegisterResourceResponse, AWSError] = js.native
  def registerResource(
    params: RegisterResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterResourceResponse, Unit]
  ): Request[RegisterResourceResponse, AWSError] = js.native
  
  /**
    * Revokes permissions to the principal to access metadata in the Data Catalog and data organized in underlying data storage such as Amazon S3.
    */
  def revokePermissions(): Request[RevokePermissionsResponse, AWSError] = js.native
  def revokePermissions(callback: js.Function2[/* err */ AWSError, /* data */ RevokePermissionsResponse, Unit]): Request[RevokePermissionsResponse, AWSError] = js.native
  /**
    * Revokes permissions to the principal to access metadata in the Data Catalog and data organized in underlying data storage such as Amazon S3.
    */
  def revokePermissions(params: RevokePermissionsRequest): Request[RevokePermissionsResponse, AWSError] = js.native
  def revokePermissions(
    params: RevokePermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RevokePermissionsResponse, Unit]
  ): Request[RevokePermissionsResponse, AWSError] = js.native
  
  /**
    * Updates the data access role used for vending access to the given (registered) resource in AWS Lake Formation. 
    */
  def updateResource(): Request[UpdateResourceResponse, AWSError] = js.native
  def updateResource(callback: js.Function2[/* err */ AWSError, /* data */ UpdateResourceResponse, Unit]): Request[UpdateResourceResponse, AWSError] = js.native
  /**
    * Updates the data access role used for vending access to the given (registered) resource in AWS Lake Formation. 
    */
  def updateResource(params: UpdateResourceRequest): Request[UpdateResourceResponse, AWSError] = js.native
  def updateResource(
    params: UpdateResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateResourceResponse, Unit]
  ): Request[UpdateResourceResponse, AWSError] = js.native
}
