package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUnfilteredTableMetadataRequest extends StObject {
  
  var AuditContext: js.UndefOr[typings.awsSdk.glueMod.AuditContext] = js.undefined
  
  var CatalogId: CatalogIdString
  
  var DatabaseName: NameString
  
  var Name: NameString
  
  var SupportedPermissionTypes: PermissionTypeList
}
object GetUnfilteredTableMetadataRequest {
  
  inline def apply(
    CatalogId: CatalogIdString,
    DatabaseName: NameString,
    Name: NameString,
    SupportedPermissionTypes: PermissionTypeList
  ): GetUnfilteredTableMetadataRequest = {
    val __obj = js.Dynamic.literal(CatalogId = CatalogId.asInstanceOf[js.Any], DatabaseName = DatabaseName.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], SupportedPermissionTypes = SupportedPermissionTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUnfilteredTableMetadataRequest]
  }
  
  extension [Self <: GetUnfilteredTableMetadataRequest](x: Self) {
    
    inline def setAuditContext(value: AuditContext): Self = StObject.set(x, "AuditContext", value.asInstanceOf[js.Any])
    
    inline def setAuditContextUndefined: Self = StObject.set(x, "AuditContext", js.undefined)
    
    inline def setCatalogId(value: CatalogIdString): Self = StObject.set(x, "CatalogId", value.asInstanceOf[js.Any])
    
    inline def setDatabaseName(value: NameString): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setName(value: NameString): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSupportedPermissionTypes(value: PermissionTypeList): Self = StObject.set(x, "SupportedPermissionTypes", value.asInstanceOf[js.Any])
    
    inline def setSupportedPermissionTypesVarargs(value: PermissionType*): Self = StObject.set(x, "SupportedPermissionTypes", js.Array(value*))
  }
}
