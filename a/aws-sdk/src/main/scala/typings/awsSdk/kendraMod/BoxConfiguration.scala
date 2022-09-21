package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BoxConfiguration extends StObject {
  
  /**
    * A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Box comments to Amazon Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Box fields. For more information, see Mapping data source fields. The Box field names must exist in your Box custom metadata.
    */
  var CommentFieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.undefined
  
  /**
    *  TRUE to index comments.
    */
  var CrawlComments: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  TRUE to index the contents of tasks.
    */
  var CrawlTasks: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  TRUE to index web links.
    */
  var CrawlWebLinks: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The identifier of the Box Enterprise platform. You can find the enterprise ID in the Box Developer Console settings or when you create an app in Box and download your authentication credentials. For example, 801234567.
    */
  var EnterpriseId: typings.awsSdk.kendraMod.EnterpriseId
  
  /**
    * A list of regular expression patterns to exclude certain files and folders from your Box platform. Files and folders that match the patterns are excluded from the index.Files and folders that don't match the patterns are included in the index. If a file or folder matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the file or folder isn't included in the index.
    */
  var ExclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined
  
  /**
    * A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Box files to Amazon Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Box fields. For more information, see Mapping data source fields. The Box field names must exist in your Box custom metadata.
    */
  var FileFieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.undefined
  
  /**
    * A list of regular expression patterns to include certain files and folders in your Box platform. Files and folders that match the patterns are included in the index. Files and folders that don't match the patterns are excluded from the index. If a file or folder matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the file or folder isn't included in the index.
    */
  var InclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the key-value pairs required to connect to your Box platform. The secret must contain a JSON structure with the following keys:   clientID—The identifier of the client OAuth 2.0 authentication application created in Box.   clientSecret—A set of characters known only to the OAuth 2.0 authentication application created in Box.   publicKeyId—The identifier of the public key contained within an identity certificate.   privateKey—A set of characters that make up an encryption key.   passphrase—A set of characters that act like a password.   You create an application in Box to generate the keys or credentials required for the secret. For more information, see Authentication for a Box data source.
    */
  var SecretArn: typings.awsSdk.kendraMod.SecretArn
  
  /**
    * A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Box tasks to Amazon Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Box fields. For more information, see Mapping data source fields. The Box field names must exist in your Box custom metadata.
    */
  var TaskFieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.undefined
  
  /**
    *  TRUE to use the Slack change log to determine which documents require updating in the index. Depending on the data source change log's size, it may take longer for Amazon Kendra to use the change log than to scan all of your documents.
    */
  var UseChangeLog: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Configuration information for an Amazon VPC to connect to your Box. For more information, see Configuring a VPC.
    */
  var VpcConfiguration: js.UndefOr[DataSourceVpcConfiguration] = js.undefined
  
  /**
    * A list of DataSourceToIndexFieldMapping objects that map attributes or field names of Box web links to Amazon Kendra index field names. To create custom fields, use the UpdateIndex API before you map to Box fields. For more information, see Mapping data source fields. The Box field names must exist in your Box custom metadata.
    */
  var WebLinkFieldMappings: js.UndefOr[DataSourceToIndexFieldMappingList] = js.undefined
}
object BoxConfiguration {
  
  inline def apply(EnterpriseId: EnterpriseId, SecretArn: SecretArn): BoxConfiguration = {
    val __obj = js.Dynamic.literal(EnterpriseId = EnterpriseId.asInstanceOf[js.Any], SecretArn = SecretArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoxConfiguration]
  }
  
  extension [Self <: BoxConfiguration](x: Self) {
    
    inline def setCommentFieldMappings(value: DataSourceToIndexFieldMappingList): Self = StObject.set(x, "CommentFieldMappings", value.asInstanceOf[js.Any])
    
    inline def setCommentFieldMappingsUndefined: Self = StObject.set(x, "CommentFieldMappings", js.undefined)
    
    inline def setCommentFieldMappingsVarargs(value: DataSourceToIndexFieldMapping*): Self = StObject.set(x, "CommentFieldMappings", js.Array(value*))
    
    inline def setCrawlComments(value: Boolean): Self = StObject.set(x, "CrawlComments", value.asInstanceOf[js.Any])
    
    inline def setCrawlCommentsUndefined: Self = StObject.set(x, "CrawlComments", js.undefined)
    
    inline def setCrawlTasks(value: Boolean): Self = StObject.set(x, "CrawlTasks", value.asInstanceOf[js.Any])
    
    inline def setCrawlTasksUndefined: Self = StObject.set(x, "CrawlTasks", js.undefined)
    
    inline def setCrawlWebLinks(value: Boolean): Self = StObject.set(x, "CrawlWebLinks", value.asInstanceOf[js.Any])
    
    inline def setCrawlWebLinksUndefined: Self = StObject.set(x, "CrawlWebLinks", js.undefined)
    
    inline def setEnterpriseId(value: EnterpriseId): Self = StObject.set(x, "EnterpriseId", value.asInstanceOf[js.Any])
    
    inline def setExclusionPatterns(value: DataSourceInclusionsExclusionsStrings): Self = StObject.set(x, "ExclusionPatterns", value.asInstanceOf[js.Any])
    
    inline def setExclusionPatternsUndefined: Self = StObject.set(x, "ExclusionPatterns", js.undefined)
    
    inline def setExclusionPatternsVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = StObject.set(x, "ExclusionPatterns", js.Array(value*))
    
    inline def setFileFieldMappings(value: DataSourceToIndexFieldMappingList): Self = StObject.set(x, "FileFieldMappings", value.asInstanceOf[js.Any])
    
    inline def setFileFieldMappingsUndefined: Self = StObject.set(x, "FileFieldMappings", js.undefined)
    
    inline def setFileFieldMappingsVarargs(value: DataSourceToIndexFieldMapping*): Self = StObject.set(x, "FileFieldMappings", js.Array(value*))
    
    inline def setInclusionPatterns(value: DataSourceInclusionsExclusionsStrings): Self = StObject.set(x, "InclusionPatterns", value.asInstanceOf[js.Any])
    
    inline def setInclusionPatternsUndefined: Self = StObject.set(x, "InclusionPatterns", js.undefined)
    
    inline def setInclusionPatternsVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = StObject.set(x, "InclusionPatterns", js.Array(value*))
    
    inline def setSecretArn(value: SecretArn): Self = StObject.set(x, "SecretArn", value.asInstanceOf[js.Any])
    
    inline def setTaskFieldMappings(value: DataSourceToIndexFieldMappingList): Self = StObject.set(x, "TaskFieldMappings", value.asInstanceOf[js.Any])
    
    inline def setTaskFieldMappingsUndefined: Self = StObject.set(x, "TaskFieldMappings", js.undefined)
    
    inline def setTaskFieldMappingsVarargs(value: DataSourceToIndexFieldMapping*): Self = StObject.set(x, "TaskFieldMappings", js.Array(value*))
    
    inline def setUseChangeLog(value: Boolean): Self = StObject.set(x, "UseChangeLog", value.asInstanceOf[js.Any])
    
    inline def setUseChangeLogUndefined: Self = StObject.set(x, "UseChangeLog", js.undefined)
    
    inline def setVpcConfiguration(value: DataSourceVpcConfiguration): Self = StObject.set(x, "VpcConfiguration", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigurationUndefined: Self = StObject.set(x, "VpcConfiguration", js.undefined)
    
    inline def setWebLinkFieldMappings(value: DataSourceToIndexFieldMappingList): Self = StObject.set(x, "WebLinkFieldMappings", value.asInstanceOf[js.Any])
    
    inline def setWebLinkFieldMappingsUndefined: Self = StObject.set(x, "WebLinkFieldMappings", js.undefined)
    
    inline def setWebLinkFieldMappingsVarargs(value: DataSourceToIndexFieldMapping*): Self = StObject.set(x, "WebLinkFieldMappings", js.Array(value*))
  }
}
