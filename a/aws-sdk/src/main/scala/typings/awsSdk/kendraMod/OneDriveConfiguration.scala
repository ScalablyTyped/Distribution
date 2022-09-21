package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OneDriveConfiguration extends StObject {
  
  /**
    *  TRUE to disable local groups information.
    */
  var DisableLocalGroups: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A list of regular expression patterns to exclude certain documents in your OneDrive. Documents that match the patterns are excluded from the index. Documents that don't match the patterns are included in the index. If a document matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the document isn't included in the index. The pattern is applied to the file name.
    */
  var ExclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined
  
  /**
    * A list of DataSourceToIndexFieldMapping objects that map OneDrive data source attributes or field names to Amazon Kendra index field names. To create custom fields, use the UpdateIndex API before you map to OneDrive fields. For more information, see Mapping data source fields. The OneDrive data source field names must exist in your OneDrive custom metadata.
    */
  var FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.undefined
  
  /**
    * A list of regular expression patterns to include certain documents in your OneDrive. Documents that match the patterns are included in the index. Documents that don't match the patterns are excluded from the index. If a document matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the document isn't included in the index. The pattern is applied to the file name.
    */
  var InclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined
  
  /**
    * A list of user accounts whose documents should be indexed.
    */
  var OneDriveUsers: typings.awsSdk.kendraMod.OneDriveUsers
  
  /**
    * The Amazon Resource Name (ARN) of an Secrets Managersecret that contains the user name and password to connect to OneDrive. The user namd should be the application ID for the OneDrive application, and the password is the application key for the OneDrive application.
    */
  var SecretArn: typings.awsSdk.kendraMod.SecretArn
  
  /**
    * The Azure Active Directory domain of the organization. 
    */
  var TenantDomain: typings.awsSdk.kendraMod.TenantDomain
}
object OneDriveConfiguration {
  
  inline def apply(OneDriveUsers: OneDriveUsers, SecretArn: SecretArn, TenantDomain: TenantDomain): OneDriveConfiguration = {
    val __obj = js.Dynamic.literal(OneDriveUsers = OneDriveUsers.asInstanceOf[js.Any], SecretArn = SecretArn.asInstanceOf[js.Any], TenantDomain = TenantDomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[OneDriveConfiguration]
  }
  
  extension [Self <: OneDriveConfiguration](x: Self) {
    
    inline def setDisableLocalGroups(value: Boolean): Self = StObject.set(x, "DisableLocalGroups", value.asInstanceOf[js.Any])
    
    inline def setDisableLocalGroupsUndefined: Self = StObject.set(x, "DisableLocalGroups", js.undefined)
    
    inline def setExclusionPatterns(value: DataSourceInclusionsExclusionsStrings): Self = StObject.set(x, "ExclusionPatterns", value.asInstanceOf[js.Any])
    
    inline def setExclusionPatternsUndefined: Self = StObject.set(x, "ExclusionPatterns", js.undefined)
    
    inline def setExclusionPatternsVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = StObject.set(x, "ExclusionPatterns", js.Array(value*))
    
    inline def setFieldMappings(value: DataSourceToIndexFieldMappingList): Self = StObject.set(x, "FieldMappings", value.asInstanceOf[js.Any])
    
    inline def setFieldMappingsUndefined: Self = StObject.set(x, "FieldMappings", js.undefined)
    
    inline def setFieldMappingsVarargs(value: DataSourceToIndexFieldMapping*): Self = StObject.set(x, "FieldMappings", js.Array(value*))
    
    inline def setInclusionPatterns(value: DataSourceInclusionsExclusionsStrings): Self = StObject.set(x, "InclusionPatterns", value.asInstanceOf[js.Any])
    
    inline def setInclusionPatternsUndefined: Self = StObject.set(x, "InclusionPatterns", js.undefined)
    
    inline def setInclusionPatternsVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = StObject.set(x, "InclusionPatterns", js.Array(value*))
    
    inline def setOneDriveUsers(value: OneDriveUsers): Self = StObject.set(x, "OneDriveUsers", value.asInstanceOf[js.Any])
    
    inline def setSecretArn(value: SecretArn): Self = StObject.set(x, "SecretArn", value.asInstanceOf[js.Any])
    
    inline def setTenantDomain(value: TenantDomain): Self = StObject.set(x, "TenantDomain", value.asInstanceOf[js.Any])
  }
}
