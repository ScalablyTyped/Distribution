package typings.awsSdk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object lakeformationMod {
  
  type BatchPermissionsFailureList = js.Array[typings.awsSdk.lakeformationMod.BatchPermissionsFailureEntry]
  
  type BatchPermissionsRequestEntryList = js.Array[typings.awsSdk.lakeformationMod.BatchPermissionsRequestEntry]
  
  type CatalogIdString = java.lang.String
  
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.lakeformationMod.ClientApiVersions
  
  type ColumnNames = js.Array[typings.awsSdk.lakeformationMod.NameString]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.EQ
    - typings.awsSdk.awsSdkStrings.NE
    - typings.awsSdk.awsSdkStrings.LE
    - typings.awsSdk.awsSdkStrings.LT
    - typings.awsSdk.awsSdkStrings.GE
    - typings.awsSdk.awsSdkStrings.GT
    - typings.awsSdk.awsSdkStrings.CONTAINS
    - typings.awsSdk.awsSdkStrings.NOT_CONTAINS
    - typings.awsSdk.awsSdkStrings.BEGINS_WITH
    - typings.awsSdk.awsSdkStrings.IN
    - typings.awsSdk.awsSdkStrings.BETWEEN
    - java.lang.String
  */
  type ComparisonOperator = typings.awsSdk.lakeformationMod._ComparisonOperator | java.lang.String
  
  type DataLakePrincipalList = js.Array[typings.awsSdk.lakeformationMod.DataLakePrincipal]
  
  type DataLakePrincipalString = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.CATALOG
    - typings.awsSdk.awsSdkStrings.DATABASE
    - typings.awsSdk.awsSdkStrings.TABLE
    - typings.awsSdk.awsSdkStrings.DATA_LOCATION
    - java.lang.String
  */
  type DataLakeResourceType = typings.awsSdk.lakeformationMod._DataLakeResourceType | java.lang.String
  
  type DescriptionString = java.lang.String
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.RESOURCE_ARN
    - typings.awsSdk.awsSdkStrings.ROLE_ARN
    - typings.awsSdk.awsSdkStrings.LAST_MODIFIED
    - java.lang.String
  */
  type FieldNameString = typings.awsSdk.lakeformationMod._FieldNameString | java.lang.String
  
  type FilterConditionList = js.Array[typings.awsSdk.lakeformationMod.FilterCondition]
  
  type IAMRoleArn = java.lang.String
  
  type Identifier = java.lang.String
  
  type LastModifiedTimestamp = typings.std.Date
  
  type NameString = java.lang.String
  
  type NullableBoolean = scala.Boolean
  
  type PageSize = scala.Double
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.ALL
    - typings.awsSdk.awsSdkStrings.SELECT
    - typings.awsSdk.awsSdkStrings.ALTER
    - typings.awsSdk.awsSdkStrings.DROP
    - typings.awsSdk.awsSdkStrings.DELETE
    - typings.awsSdk.awsSdkStrings.INSERT
    - typings.awsSdk.awsSdkStrings.DESCRIBE
    - typings.awsSdk.awsSdkStrings.CREATE_DATABASE
    - typings.awsSdk.awsSdkStrings.CREATE_TABLE
    - typings.awsSdk.awsSdkStrings.DATA_LOCATION_ACCESS
    - java.lang.String
  */
  type Permission = typings.awsSdk.lakeformationMod._Permission | java.lang.String
  
  type PermissionList = js.Array[typings.awsSdk.lakeformationMod.Permission]
  
  type PrincipalPermissionsList = js.Array[typings.awsSdk.lakeformationMod.PrincipalPermissions]
  
  type PrincipalResourcePermissionsList = js.Array[typings.awsSdk.lakeformationMod.PrincipalResourcePermissions]
  
  type RAMResourceShareArn = java.lang.String
  
  type ResourceArnString = java.lang.String
  
  type ResourceInfoList = js.Array[typings.awsSdk.lakeformationMod.ResourceInfo]
  
  type ResourceShareList = js.Array[typings.awsSdk.lakeformationMod.RAMResourceShareArn]
  
  type StringValue = java.lang.String
  
  type StringValueList = js.Array[typings.awsSdk.lakeformationMod.StringValue]
  
  type Token = java.lang.String
  
  type TrustedResourceOwners = js.Array[typings.awsSdk.lakeformationMod.CatalogIdString]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2017-03-31`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.lakeformationMod._apiVersion | java.lang.String
}
