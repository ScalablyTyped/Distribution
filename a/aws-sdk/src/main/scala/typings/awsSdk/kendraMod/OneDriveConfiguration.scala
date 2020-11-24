package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OneDriveConfiguration extends js.Object {
  
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
  implicit class OneDriveConfigurationOps[Self <: OneDriveConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOneDriveUsers(value: OneDriveUsers): Self = this.set("OneDriveUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretArn(value: SecretArn): Self = this.set("SecretArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTenantDomain(value: TenantDomain): Self = this.set("TenantDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableLocalGroups(value: Boolean): Self = this.set("DisableLocalGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableLocalGroups: Self = this.set("DisableLocalGroups", js.undefined)
    
    @scala.inline
    def setExclusionPatternsVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = this.set("ExclusionPatterns", js.Array(value :_*))
    
    @scala.inline
    def setExclusionPatterns(value: DataSourceInclusionsExclusionsStrings): Self = this.set("ExclusionPatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclusionPatterns: Self = this.set("ExclusionPatterns", js.undefined)
    
    @scala.inline
    def setFieldMappingsVarargs(value: DataSourceToIndexFieldMapping*): Self = this.set("FieldMappings", js.Array(value :_*))
    
    @scala.inline
    def setFieldMappings(value: DataSourceToIndexFieldMappingList): Self = this.set("FieldMappings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldMappings: Self = this.set("FieldMappings", js.undefined)
    
    @scala.inline
    def setInclusionPatternsVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = this.set("InclusionPatterns", js.Array(value :_*))
    
    @scala.inline
    def setInclusionPatterns(value: DataSourceInclusionsExclusionsStrings): Self = this.set("InclusionPatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclusionPatterns: Self = this.set("InclusionPatterns", js.undefined)
  }
}
