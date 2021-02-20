package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OneDriveConfiguration extends StObject {
  
  /**
    * A Boolean value that specifies whether local groups are disabled (True) or enabled (False). 
    */
  var DisableLocalGroups: js.UndefOr[Boolean] = js.native
  
  /**
    * List of regular expressions applied to documents. Items that match the exclusion pattern are not indexed. If you provide both an inclusion pattern and an exclusion pattern, any item that matches the exclusion pattern isn't indexed.  The exclusion pattern is applied to the file name.
    */
  var ExclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.native
  
  /**
    * A list of DataSourceToIndexFieldMapping objects that map Microsoft OneDrive fields to custom fields in the Amazon Kendra index. You must first create the index fields before you map OneDrive fields.
    */
  var FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.native
  
  /**
    * A list of regular expression patterns. Documents that match the pattern are included in the index. Documents that don't match the pattern are excluded from the index. If a document matches both an inclusion pattern and an exclusion pattern, the document is not included in the index.  The exclusion pattern is applied to the file name.
    */
  var InclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.native
  
  /**
    * A list of user accounts whose documents should be indexed.
    */
  var OneDriveUsers: typings.awsSdk.kendraMod.OneDriveUsers = js.native
  
  /**
    * The Amazon Resource Name (ARN) of an AWS Secrets Manager secret that contains the user name and password to connect to OneDrive. The user namd should be the application ID for the OneDrive application, and the password is the application key for the OneDrive application.
    */
  var SecretArn: typings.awsSdk.kendraMod.SecretArn = js.native
  
  /**
    * Tha Azure Active Directory domain of the organization. 
    */
  var TenantDomain: typings.awsSdk.kendraMod.TenantDomain = js.native
}
object OneDriveConfiguration {
  
  @scala.inline
  def apply(OneDriveUsers: OneDriveUsers, SecretArn: SecretArn, TenantDomain: TenantDomain): OneDriveConfiguration = {
    val __obj = js.Dynamic.literal(OneDriveUsers = OneDriveUsers.asInstanceOf[js.Any], SecretArn = SecretArn.asInstanceOf[js.Any], TenantDomain = TenantDomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[OneDriveConfiguration]
  }
  
  @scala.inline
  implicit class OneDriveConfigurationMutableBuilder[Self <: OneDriveConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisableLocalGroups(value: Boolean): Self = StObject.set(x, "DisableLocalGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableLocalGroupsUndefined: Self = StObject.set(x, "DisableLocalGroups", js.undefined)
    
    @scala.inline
    def setExclusionPatterns(value: DataSourceInclusionsExclusionsStrings): Self = StObject.set(x, "ExclusionPatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusionPatternsUndefined: Self = StObject.set(x, "ExclusionPatterns", js.undefined)
    
    @scala.inline
    def setExclusionPatternsVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = StObject.set(x, "ExclusionPatterns", js.Array(value :_*))
    
    @scala.inline
    def setFieldMappings(value: DataSourceToIndexFieldMappingList): Self = StObject.set(x, "FieldMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldMappingsUndefined: Self = StObject.set(x, "FieldMappings", js.undefined)
    
    @scala.inline
    def setFieldMappingsVarargs(value: DataSourceToIndexFieldMapping*): Self = StObject.set(x, "FieldMappings", js.Array(value :_*))
    
    @scala.inline
    def setInclusionPatterns(value: DataSourceInclusionsExclusionsStrings): Self = StObject.set(x, "InclusionPatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclusionPatternsUndefined: Self = StObject.set(x, "InclusionPatterns", js.undefined)
    
    @scala.inline
    def setInclusionPatternsVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = StObject.set(x, "InclusionPatterns", js.Array(value :_*))
    
    @scala.inline
    def setOneDriveUsers(value: OneDriveUsers): Self = StObject.set(x, "OneDriveUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretArn(value: SecretArn): Self = StObject.set(x, "SecretArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenantDomain(value: TenantDomain): Self = StObject.set(x, "TenantDomain", value.asInstanceOf[js.Any])
  }
}
