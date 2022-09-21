package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTemporaryGlueTableCredentialsRequest extends StObject {
  
  /**
    * A structure representing context to access a resource (column names, query ID, etc).
    */
  var AuditContext: js.UndefOr[typings.awsSdk.lakeformationMod.AuditContext] = js.undefined
  
  /**
    * The time period, between 900 and 21,600 seconds, for the timeout of the temporary credentials.
    */
  var DurationSeconds: js.UndefOr[CredentialTimeoutDurationSecondInteger] = js.undefined
  
  /**
    * Filters the request based on the user having been granted a list of specified permissions on the requested resource(s).
    */
  var Permissions: js.UndefOr[PermissionList] = js.undefined
  
  /**
    * A list of supported permission types for the table. Valid values are COLUMN_PERMISSION and CELL_FILTER_PERMISSION.
    */
  var SupportedPermissionTypes: PermissionTypeList
  
  /**
    * The ARN identifying a table in the Data Catalog for the temporary credentials request.
    */
  var TableArn: ResourceArnString
}
object GetTemporaryGlueTableCredentialsRequest {
  
  inline def apply(SupportedPermissionTypes: PermissionTypeList, TableArn: ResourceArnString): GetTemporaryGlueTableCredentialsRequest = {
    val __obj = js.Dynamic.literal(SupportedPermissionTypes = SupportedPermissionTypes.asInstanceOf[js.Any], TableArn = TableArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTemporaryGlueTableCredentialsRequest]
  }
  
  extension [Self <: GetTemporaryGlueTableCredentialsRequest](x: Self) {
    
    inline def setAuditContext(value: AuditContext): Self = StObject.set(x, "AuditContext", value.asInstanceOf[js.Any])
    
    inline def setAuditContextUndefined: Self = StObject.set(x, "AuditContext", js.undefined)
    
    inline def setDurationSeconds(value: CredentialTimeoutDurationSecondInteger): Self = StObject.set(x, "DurationSeconds", value.asInstanceOf[js.Any])
    
    inline def setDurationSecondsUndefined: Self = StObject.set(x, "DurationSeconds", js.undefined)
    
    inline def setPermissions(value: PermissionList): Self = StObject.set(x, "Permissions", value.asInstanceOf[js.Any])
    
    inline def setPermissionsUndefined: Self = StObject.set(x, "Permissions", js.undefined)
    
    inline def setPermissionsVarargs(value: Permission*): Self = StObject.set(x, "Permissions", js.Array(value*))
    
    inline def setSupportedPermissionTypes(value: PermissionTypeList): Self = StObject.set(x, "SupportedPermissionTypes", value.asInstanceOf[js.Any])
    
    inline def setSupportedPermissionTypesVarargs(value: PermissionType*): Self = StObject.set(x, "SupportedPermissionTypes", js.Array(value*))
    
    inline def setTableArn(value: ResourceArnString): Self = StObject.set(x, "TableArn", value.asInstanceOf[js.Any])
  }
}
