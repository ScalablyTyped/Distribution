package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SharePointConfiguration extends js.Object {
  
  /**
    *  TRUE to include attachments to documents stored in your Microsoft SharePoint site in the index; otherwise, FALSE.
    */
  var CrawlAttachments: js.UndefOr[Boolean] = js.native
  
  /**
    * A Boolean value that specifies whether local groups are disabled (True) or enabled (False). 
    */
  var DisableLocalGroups: js.UndefOr[Boolean] = js.native
  
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
  def apply(SecretArn: SecretArn, SharePointVersion: SharePointVersion, Urls: SharePointUrlList): SharePointConfiguration = {
    val __obj = js.Dynamic.literal(SecretArn = SecretArn.asInstanceOf[js.Any], SharePointVersion = SharePointVersion.asInstanceOf[js.Any], Urls = Urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharePointConfiguration]
  }
  
  @scala.inline
  implicit class SharePointConfigurationOps[Self <: SharePointConfiguration] (val x: Self) extends AnyVal {
    
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
    def setSecretArn(value: SecretArn): Self = this.set("SecretArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSharePointVersion(value: SharePointVersion): Self = this.set("SharePointVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlsVarargs(value: Url*): Self = this.set("Urls", js.Array(value :_*))
    
    @scala.inline
    def setUrls(value: SharePointUrlList): Self = this.set("Urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrawlAttachments(value: Boolean): Self = this.set("CrawlAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrawlAttachments: Self = this.set("CrawlAttachments", js.undefined)
    
    @scala.inline
    def setDisableLocalGroups(value: Boolean): Self = this.set("DisableLocalGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableLocalGroups: Self = this.set("DisableLocalGroups", js.undefined)
    
    @scala.inline
    def setDocumentTitleFieldName(value: DataSourceFieldName): Self = this.set("DocumentTitleFieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentTitleFieldName: Self = this.set("DocumentTitleFieldName", js.undefined)
    
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
    
    @scala.inline
    def setUseChangeLog(value: Boolean): Self = this.set("UseChangeLog", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseChangeLog: Self = this.set("UseChangeLog", js.undefined)
    
    @scala.inline
    def setVpcConfiguration(value: DataSourceVpcConfiguration): Self = this.set("VpcConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcConfiguration: Self = this.set("VpcConfiguration", js.undefined)
  }
}
