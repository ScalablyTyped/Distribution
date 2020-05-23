package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OneDriveConfiguration extends js.Object {
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
  def apply(
    OneDriveUsers: OneDriveUsers,
    SecretArn: SecretArn,
    TenantDomain: TenantDomain,
    ExclusionPatterns: DataSourceInclusionsExclusionsStrings = null,
    FieldMappings: DataSourceToIndexFieldMappingList = null,
    InclusionPatterns: DataSourceInclusionsExclusionsStrings = null
  ): OneDriveConfiguration = {
    val __obj = js.Dynamic.literal(OneDriveUsers = OneDriveUsers.asInstanceOf[js.Any], SecretArn = SecretArn.asInstanceOf[js.Any], TenantDomain = TenantDomain.asInstanceOf[js.Any])
    if (ExclusionPatterns != null) __obj.updateDynamic("ExclusionPatterns")(ExclusionPatterns.asInstanceOf[js.Any])
    if (FieldMappings != null) __obj.updateDynamic("FieldMappings")(FieldMappings.asInstanceOf[js.Any])
    if (InclusionPatterns != null) __obj.updateDynamic("InclusionPatterns")(InclusionPatterns.asInstanceOf[js.Any])
    __obj.asInstanceOf[OneDriveConfiguration]
  }
}

