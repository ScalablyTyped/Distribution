package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharePointConfiguration extends js.Object {
  /**
    *  TRUE to include attachments to documents stored in your Microsoft SharePoint site in the index; otherwise, FALSE.
    */
  var CrawlAttachments: js.UndefOr[Boolean] = js.native
  /**
    * The Microsoft SharePoint attribute field that contains the title of the document.
    */
  var DocumentTitleFieldName: js.UndefOr[DataSourceFieldName] = js.native
  /**
    * A list of regular expression patterns. Documents that match the patterns are excluded from the index. Documents that don't match the patterns are included in the index. If a document matches both an exclusion pattern and an inclusion pattern, the document is not included in the index. The regex is applied to the display URL of the SharePoint document.
    */
  var ExclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.native
  /**
    * A list of DataSourceToIndexFieldMapping objects that map Microsoft SharePoint attributes to custom fields in the Amazon Kendra index. You must first create the index fields using the operation before you map SharePoint attributes. For more information, see Mapping Data Source Fields.
    */
  var FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.native
  /**
    * A list of regular expression patterns. Documents that match the patterns are included in the index. Documents that don't match the patterns are excluded from the index. If a document matches both an inclusion pattern and an exclusion pattern, the document is not included in the index. The regex is applied to the display URL of the SharePoint document.
    */
  var InclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.native
  /**
    * The Amazon Resource Name (ARN) of credentials stored in AWS Secrets Manager. The credentials should be a user/password pair. For more information, see Using a Microsoft SharePoint Data Source. For more information about AWS Secrets Manager, see  What Is AWS Secrets Manager  in the AWS Secrets Manager user guide.
    */
  var SecretArn: typings.awsSdk.kendraMod.SecretArn = js.native
  /**
    * The version of Microsoft SharePoint that you are using as a data source.
    */
  var SharePointVersion: typings.awsSdk.kendraMod.SharePointVersion = js.native
  /**
    * The URLs of the Microsoft SharePoint site that contains the documents that should be indexed.
    */
  var Urls: SharePointUrlList = js.native
  /**
    * Set to TRUE to use the Microsoft SharePoint change log to determine the documents that need to be updated in the index. Depending on the size of the SharePoint change log, it may take longer for Amazon Kendra to use the change log than it takes it to determine the changed documents using the Amazon Kendra document crawler.
    */
  var UseChangeLog: js.UndefOr[Boolean] = js.native
  var VpcConfiguration: js.UndefOr[DataSourceVpcConfiguration] = js.native
}

object SharePointConfiguration {
  @scala.inline
  def apply(
    SecretArn: SecretArn,
    SharePointVersion: SharePointVersion,
    Urls: SharePointUrlList,
    CrawlAttachments: js.UndefOr[scala.Boolean] = js.undefined,
    DocumentTitleFieldName: DataSourceFieldName = null,
    ExclusionPatterns: DataSourceInclusionsExclusionsStrings = null,
    FieldMappings: DataSourceToIndexFieldMappingList = null,
    InclusionPatterns: DataSourceInclusionsExclusionsStrings = null,
    UseChangeLog: js.UndefOr[scala.Boolean] = js.undefined,
    VpcConfiguration: DataSourceVpcConfiguration = null
  ): SharePointConfiguration = {
    val __obj = js.Dynamic.literal(SecretArn = SecretArn.asInstanceOf[js.Any], SharePointVersion = SharePointVersion.asInstanceOf[js.Any], Urls = Urls.asInstanceOf[js.Any])
    if (!js.isUndefined(CrawlAttachments)) __obj.updateDynamic("CrawlAttachments")(CrawlAttachments.asInstanceOf[js.Any])
    if (DocumentTitleFieldName != null) __obj.updateDynamic("DocumentTitleFieldName")(DocumentTitleFieldName.asInstanceOf[js.Any])
    if (ExclusionPatterns != null) __obj.updateDynamic("ExclusionPatterns")(ExclusionPatterns.asInstanceOf[js.Any])
    if (FieldMappings != null) __obj.updateDynamic("FieldMappings")(FieldMappings.asInstanceOf[js.Any])
    if (InclusionPatterns != null) __obj.updateDynamic("InclusionPatterns")(InclusionPatterns.asInstanceOf[js.Any])
    if (!js.isUndefined(UseChangeLog)) __obj.updateDynamic("UseChangeLog")(UseChangeLog.asInstanceOf[js.Any])
    if (VpcConfiguration != null) __obj.updateDynamic("VpcConfiguration")(VpcConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharePointConfiguration]
  }
}

