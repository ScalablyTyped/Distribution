package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataLakeSettings extends StObject {
  
  /**
    * Whether to allow Amazon EMR clusters to access data managed by Lake Formation.  If true, you allow Amazon EMR clusters to access data in Amazon S3 locations that are registered with Lake Formation. If false or null, no Amazon EMR clusters will be able to access data in Amazon S3 locations that are registered with Lake Formation. For more information, see (Optional) Allow Data Filtering on Amazon EMR.
    */
  var AllowExternalDataFiltering: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * Lake Formation relies on a privileged process secured by Amazon EMR or the third party integrator to tag the user's role while assuming it. Lake Formation will publish the acceptable key-value pair, for example key = "LakeFormationTrustedCaller" and value = "TRUE" and the third party integrator must properly tag the temporary security credentials that will be used to call Lake Formation's administrative APIs.
    */
  var AuthorizedSessionTagValueList: js.UndefOr[typings.awsSdk.lakeformationMod.AuthorizedSessionTagValueList] = js.undefined
  
  /**
    * Specifies whether access control on newly created database is managed by Lake Formation permissions or exclusively by IAM permissions. You can override this default setting when you create a database. A null value indicates access control by Lake Formation permissions. A value that assigns ALL to IAM_ALLOWED_PRINCIPALS indicates access control by IAM permissions. This is referred to as the setting "Use only IAM access control," and is for backward compatibility with the Glue permission model implemented by IAM permissions. The only permitted values are an empty array or an array that contains a single JSON object that grants ALL to IAM_ALLOWED_PRINCIPALS. For more information, see Changing the Default Security Settings for Your Data Lake.
    */
  var CreateDatabaseDefaultPermissions: js.UndefOr[PrincipalPermissionsList] = js.undefined
  
  /**
    * Specifies whether access control on newly created table is managed by Lake Formation permissions or exclusively by IAM permissions. A null value indicates access control by Lake Formation permissions. A value that assigns ALL to IAM_ALLOWED_PRINCIPALS indicates access control by IAM permissions. This is referred to as the setting "Use only IAM access control," and is for backward compatibility with the Glue permission model implemented by IAM permissions. The only permitted values are an empty array or an array that contains a single JSON object that grants ALL to IAM_ALLOWED_PRINCIPALS. For more information, see Changing the Default Security Settings for Your Data Lake.
    */
  var CreateTableDefaultPermissions: js.UndefOr[PrincipalPermissionsList] = js.undefined
  
  /**
    * A list of Lake Formation principals. Supported principals are IAM users or IAM roles.
    */
  var DataLakeAdmins: js.UndefOr[DataLakePrincipalList] = js.undefined
  
  /**
    * A list of the account IDs of Amazon Web Services accounts with Amazon EMR clusters that are to perform data filtering.&gt;
    */
  var ExternalDataFilteringAllowList: js.UndefOr[DataLakePrincipalList] = js.undefined
  
  /**
    * A list of the resource-owning account IDs that the caller's account can use to share their user access details (user ARNs). The user ARNs can be logged in the resource owner's CloudTrail log. You may want to specify this property when you are in a high-trust boundary, such as the same team or company. 
    */
  var TrustedResourceOwners: js.UndefOr[typings.awsSdk.lakeformationMod.TrustedResourceOwners] = js.undefined
}
object DataLakeSettings {
  
  inline def apply(): DataLakeSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataLakeSettings]
  }
  
  extension [Self <: DataLakeSettings](x: Self) {
    
    inline def setAllowExternalDataFiltering(value: NullableBoolean): Self = StObject.set(x, "AllowExternalDataFiltering", value.asInstanceOf[js.Any])
    
    inline def setAllowExternalDataFilteringUndefined: Self = StObject.set(x, "AllowExternalDataFiltering", js.undefined)
    
    inline def setAuthorizedSessionTagValueList(value: AuthorizedSessionTagValueList): Self = StObject.set(x, "AuthorizedSessionTagValueList", value.asInstanceOf[js.Any])
    
    inline def setAuthorizedSessionTagValueListUndefined: Self = StObject.set(x, "AuthorizedSessionTagValueList", js.undefined)
    
    inline def setAuthorizedSessionTagValueListVarargs(value: NameString*): Self = StObject.set(x, "AuthorizedSessionTagValueList", js.Array(value*))
    
    inline def setCreateDatabaseDefaultPermissions(value: PrincipalPermissionsList): Self = StObject.set(x, "CreateDatabaseDefaultPermissions", value.asInstanceOf[js.Any])
    
    inline def setCreateDatabaseDefaultPermissionsUndefined: Self = StObject.set(x, "CreateDatabaseDefaultPermissions", js.undefined)
    
    inline def setCreateDatabaseDefaultPermissionsVarargs(value: PrincipalPermissions*): Self = StObject.set(x, "CreateDatabaseDefaultPermissions", js.Array(value*))
    
    inline def setCreateTableDefaultPermissions(value: PrincipalPermissionsList): Self = StObject.set(x, "CreateTableDefaultPermissions", value.asInstanceOf[js.Any])
    
    inline def setCreateTableDefaultPermissionsUndefined: Self = StObject.set(x, "CreateTableDefaultPermissions", js.undefined)
    
    inline def setCreateTableDefaultPermissionsVarargs(value: PrincipalPermissions*): Self = StObject.set(x, "CreateTableDefaultPermissions", js.Array(value*))
    
    inline def setDataLakeAdmins(value: DataLakePrincipalList): Self = StObject.set(x, "DataLakeAdmins", value.asInstanceOf[js.Any])
    
    inline def setDataLakeAdminsUndefined: Self = StObject.set(x, "DataLakeAdmins", js.undefined)
    
    inline def setDataLakeAdminsVarargs(value: DataLakePrincipal*): Self = StObject.set(x, "DataLakeAdmins", js.Array(value*))
    
    inline def setExternalDataFilteringAllowList(value: DataLakePrincipalList): Self = StObject.set(x, "ExternalDataFilteringAllowList", value.asInstanceOf[js.Any])
    
    inline def setExternalDataFilteringAllowListUndefined: Self = StObject.set(x, "ExternalDataFilteringAllowList", js.undefined)
    
    inline def setExternalDataFilteringAllowListVarargs(value: DataLakePrincipal*): Self = StObject.set(x, "ExternalDataFilteringAllowList", js.Array(value*))
    
    inline def setTrustedResourceOwners(value: TrustedResourceOwners): Self = StObject.set(x, "TrustedResourceOwners", value.asInstanceOf[js.Any])
    
    inline def setTrustedResourceOwnersUndefined: Self = StObject.set(x, "TrustedResourceOwners", js.undefined)
    
    inline def setTrustedResourceOwnersVarargs(value: CatalogIdString*): Self = StObject.set(x, "TrustedResourceOwners", js.Array(value*))
  }
}
