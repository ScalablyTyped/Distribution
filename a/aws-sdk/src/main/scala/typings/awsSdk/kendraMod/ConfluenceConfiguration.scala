package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfluenceConfiguration extends StObject {
  
  /**
    * Specifies configuration information for indexing attachments to Confluence blogs and pages.
    */
  var AttachmentConfiguration: js.UndefOr[ConfluenceAttachmentConfiguration] = js.undefined
  
  /**
    *  Specifies configuration information for indexing Confluence blogs.
    */
  var BlogConfiguration: js.UndefOr[ConfluenceBlogConfiguration] = js.undefined
  
  /**
    * A list of regular expression patterns that apply to a URL on the Confluence server. An exclusion pattern can apply to a blog post, a page, a space, or an attachment. Items that match the pattern are excluded from the index. Items that don't match the pattern are included in the index. If a item matches both an exclusion pattern and an inclusion pattern, the item isn't included in the index.
    */
  var ExclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined
  
  /**
    * A list of regular expression patterns that apply to a URL on the Confluence server. An inclusion pattern can apply to a blog post, a page, a space, or an attachment. Items that match the patterns are included in the index. Items that don't match the pattern are excluded from the index. If an item matches both an inclusion pattern and an exclusion pattern, the item isn't included in the index.
    */
  var InclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined
  
  /**
    * Specifies configuration information for indexing Confluence pages.
    */
  var PageConfiguration: js.UndefOr[ConfluencePageConfiguration] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an AWS Secrets Manager secret that contains the key/value pairs required to connect to your Confluence server. The secret must contain a JSON structure with the following keys:   username - The user name or email address of a user with administrative privileges for the Confluence server.   password - The password associated with the user logging in to the Confluence server.  
    */
  var SecretArn: typings.awsSdk.kendraMod.SecretArn
  
  /**
    * The URL of your Confluence instance. Use the full URL of the server. For example, https://server.example.com:port/. You can also use an IP address, for example, https://192.168.1.113/.
    */
  var ServerUrl: Url
  
  /**
    * Specifies configuration information for indexing Confluence spaces.
    */
  var SpaceConfiguration: js.UndefOr[ConfluenceSpaceConfiguration] = js.undefined
  
  /**
    * Specifies the version of the Confluence installation that you are connecting to.
    */
  var Version: ConfluenceVersion
  
  /**
    * Specifies the information for connecting to an Amazon VPC.
    */
  var VpcConfiguration: js.UndefOr[DataSourceVpcConfiguration] = js.undefined
}
object ConfluenceConfiguration {
  
  @scala.inline
  def apply(SecretArn: SecretArn, ServerUrl: Url, Version: ConfluenceVersion): ConfluenceConfiguration = {
    val __obj = js.Dynamic.literal(SecretArn = SecretArn.asInstanceOf[js.Any], ServerUrl = ServerUrl.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfluenceConfiguration]
  }
  
  @scala.inline
  implicit class ConfluenceConfigurationMutableBuilder[Self <: ConfluenceConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachmentConfiguration(value: ConfluenceAttachmentConfiguration): Self = StObject.set(x, "AttachmentConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentConfigurationUndefined: Self = StObject.set(x, "AttachmentConfiguration", js.undefined)
    
    @scala.inline
    def setBlogConfiguration(value: ConfluenceBlogConfiguration): Self = StObject.set(x, "BlogConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlogConfigurationUndefined: Self = StObject.set(x, "BlogConfiguration", js.undefined)
    
    @scala.inline
    def setExclusionPatterns(value: DataSourceInclusionsExclusionsStrings): Self = StObject.set(x, "ExclusionPatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusionPatternsUndefined: Self = StObject.set(x, "ExclusionPatterns", js.undefined)
    
    @scala.inline
    def setExclusionPatternsVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = StObject.set(x, "ExclusionPatterns", js.Array(value :_*))
    
    @scala.inline
    def setInclusionPatterns(value: DataSourceInclusionsExclusionsStrings): Self = StObject.set(x, "InclusionPatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclusionPatternsUndefined: Self = StObject.set(x, "InclusionPatterns", js.undefined)
    
    @scala.inline
    def setInclusionPatternsVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = StObject.set(x, "InclusionPatterns", js.Array(value :_*))
    
    @scala.inline
    def setPageConfiguration(value: ConfluencePageConfiguration): Self = StObject.set(x, "PageConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageConfigurationUndefined: Self = StObject.set(x, "PageConfiguration", js.undefined)
    
    @scala.inline
    def setSecretArn(value: SecretArn): Self = StObject.set(x, "SecretArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerUrl(value: Url): Self = StObject.set(x, "ServerUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceConfiguration(value: ConfluenceSpaceConfiguration): Self = StObject.set(x, "SpaceConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpaceConfigurationUndefined: Self = StObject.set(x, "SpaceConfiguration", js.undefined)
    
    @scala.inline
    def setVersion(value: ConfluenceVersion): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcConfiguration(value: DataSourceVpcConfiguration): Self = StObject.set(x, "VpcConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcConfigurationUndefined: Self = StObject.set(x, "VpcConfiguration", js.undefined)
  }
}
