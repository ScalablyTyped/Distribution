package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharePointConfiguration extends StObject {
  
  /**
    *  TRUE to include attachments to documents stored in your Microsoft SharePoint site in the index; otherwise, FALSE.
    */
  var CrawlAttachments: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A Boolean value that specifies whether local groups are disabled (True) or enabled (False). 
    */
  var DisableLocalGroups: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The Microsoft SharePoint attribute field that contains the title of the document.
    */
  var DocumentTitleFieldName: js.UndefOr[DataSourceFieldName] = js.undefined
  
  /**
    * A list of regular expression patterns. Documents that match the patterns are excluded from the index. Documents that don't match the patterns are included in the index. If a document matches both an exclusion pattern and an inclusion pattern, the document is not included in the index. The regex is applied to the display URL of the SharePoint document.
    */
  var ExclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined
  
  /**
    * A list of DataSourceToIndexFieldMapping objects that map Microsoft SharePoint attributes to custom fields in the Amazon Kendra index. You must first create the index fields using the operation before you map SharePoint attributes. For more information, see Mapping Data Source Fields.
    */
  var FieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.undefined
  
  /**
    * A list of regular expression patterns. Documents that match the patterns are included in the index. Documents that don't match the patterns are excluded from the index. If a document matches both an inclusion pattern and an exclusion pattern, the document is not included in the index. The regex is applied to the display URL of the SharePoint document.
    */
  var InclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of credentials stored in AWS Secrets Manager. The credentials should be a user/password pair. For more information, see Using a Microsoft SharePoint Data Source. For more information about AWS Secrets Manager, see  What Is AWS Secrets Manager  in the AWS Secrets Manager user guide.
    */
  var SecretArn: typings.awsSdk.kendraMod.SecretArn
  
  /**
    * The version of Microsoft SharePoint that you are using as a data source.
    */
  var SharePointVersion: typings.awsSdk.kendraMod.SharePointVersion
  
  /**
    * The URLs of the Microsoft SharePoint site that contains the documents that should be indexed.
    */
  var Urls: SharePointUrlList
  
  /**
    * Set to TRUE to use the Microsoft SharePoint change log to determine the documents that need to be updated in the index. Depending on the size of the SharePoint change log, it may take longer for Amazon Kendra to use the change log than it takes it to determine the changed documents using the Amazon Kendra document crawler.
    */
  var UseChangeLog: js.UndefOr[Boolean] = js.undefined
  
  var VpcConfiguration: js.UndefOr[DataSourceVpcConfiguration] = js.undefined
}
object SharePointConfiguration {
  
  inline def apply(SecretArn: SecretArn, SharePointVersion: SharePointVersion, Urls: SharePointUrlList): SharePointConfiguration = {
    val __obj = js.Dynamic.literal(SecretArn = SecretArn.asInstanceOf[js.Any], SharePointVersion = SharePointVersion.asInstanceOf[js.Any], Urls = Urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharePointConfiguration]
  }
  
  extension [Self <: SharePointConfiguration](x: Self) {
    
    inline def setCrawlAttachments(value: Boolean): Self = StObject.set(x, "CrawlAttachments", value.asInstanceOf[js.Any])
    
    inline def setCrawlAttachmentsUndefined: Self = StObject.set(x, "CrawlAttachments", js.undefined)
    
    inline def setDisableLocalGroups(value: Boolean): Self = StObject.set(x, "DisableLocalGroups", value.asInstanceOf[js.Any])
    
    inline def setDisableLocalGroupsUndefined: Self = StObject.set(x, "DisableLocalGroups", js.undefined)
    
    inline def setDocumentTitleFieldName(value: DataSourceFieldName): Self = StObject.set(x, "DocumentTitleFieldName", value.asInstanceOf[js.Any])
    
    inline def setDocumentTitleFieldNameUndefined: Self = StObject.set(x, "DocumentTitleFieldName", js.undefined)
    
    inline def setExclusionPatterns(value: DataSourceInclusionsExclusionsStrings): Self = StObject.set(x, "ExclusionPatterns", value.asInstanceOf[js.Any])
    
    inline def setExclusionPatternsUndefined: Self = StObject.set(x, "ExclusionPatterns", js.undefined)
    
    inline def setExclusionPatternsVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = StObject.set(x, "ExclusionPatterns", js.Array(value :_*))
    
    inline def setFieldMappings(value: DataSourceToIndexFieldMappingList): Self = StObject.set(x, "FieldMappings", value.asInstanceOf[js.Any])
    
    inline def setFieldMappingsUndefined: Self = StObject.set(x, "FieldMappings", js.undefined)
    
    inline def setFieldMappingsVarargs(value: DataSourceToIndexFieldMapping*): Self = StObject.set(x, "FieldMappings", js.Array(value :_*))
    
    inline def setInclusionPatterns(value: DataSourceInclusionsExclusionsStrings): Self = StObject.set(x, "InclusionPatterns", value.asInstanceOf[js.Any])
    
    inline def setInclusionPatternsUndefined: Self = StObject.set(x, "InclusionPatterns", js.undefined)
    
    inline def setInclusionPatternsVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = StObject.set(x, "InclusionPatterns", js.Array(value :_*))
    
    inline def setSecretArn(value: SecretArn): Self = StObject.set(x, "SecretArn", value.asInstanceOf[js.Any])
    
    inline def setSharePointVersion(value: SharePointVersion): Self = StObject.set(x, "SharePointVersion", value.asInstanceOf[js.Any])
    
    inline def setUrls(value: SharePointUrlList): Self = StObject.set(x, "Urls", value.asInstanceOf[js.Any])
    
    inline def setUrlsVarargs(value: Url*): Self = StObject.set(x, "Urls", js.Array(value :_*))
    
    inline def setUseChangeLog(value: Boolean): Self = StObject.set(x, "UseChangeLog", value.asInstanceOf[js.Any])
    
    inline def setUseChangeLogUndefined: Self = StObject.set(x, "UseChangeLog", js.undefined)
    
    inline def setVpcConfiguration(value: DataSourceVpcConfiguration): Self = StObject.set(x, "VpcConfiguration", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigurationUndefined: Self = StObject.set(x, "VpcConfiguration", js.undefined)
  }
}
