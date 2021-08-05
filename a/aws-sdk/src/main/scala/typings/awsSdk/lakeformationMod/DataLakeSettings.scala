package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataLakeSettings extends StObject {
  
  /**
    * A structure representing a list of up to three principal permissions entries for default create database permissions.
    */
  var CreateDatabaseDefaultPermissions: js.UndefOr[PrincipalPermissionsList] = js.undefined
  
  /**
    * A structure representing a list of up to three principal permissions entries for default create table permissions.
    */
  var CreateTableDefaultPermissions: js.UndefOr[PrincipalPermissionsList] = js.undefined
  
  /**
    * A list of AWS Lake Formation principals. Supported principals are IAM users or IAM roles.
    */
  var DataLakeAdmins: js.UndefOr[DataLakePrincipalList] = js.undefined
  
  /**
    * A list of the resource-owning account IDs that the caller's account can use to share their user access details (user ARNs). The user ARNs can be logged in the resource owner's AWS CloudTrail log. You may want to specify this property when you are in a high-trust boundary, such as the same team or company. 
    */
  var TrustedResourceOwners: js.UndefOr[typings.awsSdk.lakeformationMod.TrustedResourceOwners] = js.undefined
}
object DataLakeSettings {
  
  inline def apply(): DataLakeSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataLakeSettings]
  }
  
  extension [Self <: DataLakeSettings](x: Self) {
    
    inline def setCreateDatabaseDefaultPermissions(value: PrincipalPermissionsList): Self = StObject.set(x, "CreateDatabaseDefaultPermissions", value.asInstanceOf[js.Any])
    
    inline def setCreateDatabaseDefaultPermissionsUndefined: Self = StObject.set(x, "CreateDatabaseDefaultPermissions", js.undefined)
    
    inline def setCreateDatabaseDefaultPermissionsVarargs(value: PrincipalPermissions*): Self = StObject.set(x, "CreateDatabaseDefaultPermissions", js.Array(value :_*))
    
    inline def setCreateTableDefaultPermissions(value: PrincipalPermissionsList): Self = StObject.set(x, "CreateTableDefaultPermissions", value.asInstanceOf[js.Any])
    
    inline def setCreateTableDefaultPermissionsUndefined: Self = StObject.set(x, "CreateTableDefaultPermissions", js.undefined)
    
    inline def setCreateTableDefaultPermissionsVarargs(value: PrincipalPermissions*): Self = StObject.set(x, "CreateTableDefaultPermissions", js.Array(value :_*))
    
    inline def setDataLakeAdmins(value: DataLakePrincipalList): Self = StObject.set(x, "DataLakeAdmins", value.asInstanceOf[js.Any])
    
    inline def setDataLakeAdminsUndefined: Self = StObject.set(x, "DataLakeAdmins", js.undefined)
    
    inline def setDataLakeAdminsVarargs(value: DataLakePrincipal*): Self = StObject.set(x, "DataLakeAdmins", js.Array(value :_*))
    
    inline def setTrustedResourceOwners(value: TrustedResourceOwners): Self = StObject.set(x, "TrustedResourceOwners", value.asInstanceOf[js.Any])
    
    inline def setTrustedResourceOwnersUndefined: Self = StObject.set(x, "TrustedResourceOwners", js.undefined)
    
    inline def setTrustedResourceOwnersVarargs(value: CatalogIdString*): Self = StObject.set(x, "TrustedResourceOwners", js.Array(value :_*))
  }
}
