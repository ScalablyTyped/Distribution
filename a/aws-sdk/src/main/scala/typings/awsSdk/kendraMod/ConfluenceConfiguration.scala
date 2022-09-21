package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfluenceConfiguration extends StObject {
  
  /**
    * Configuration information for indexing attachments to Confluence blogs and pages.
    */
  var AttachmentConfiguration: js.UndefOr[ConfluenceAttachmentConfiguration] = js.undefined
  
  /**
    * Whether you want to connect to Confluence using basic authentication of user name and password, or a personal access token. You can use a personal access token for Confluence Server.
    */
  var AuthenticationType: js.UndefOr[ConfluenceAuthenticationType] = js.undefined
  
  /**
    * Configuration information for indexing Confluence blogs.
    */
  var BlogConfiguration: js.UndefOr[ConfluenceBlogConfiguration] = js.undefined
  
  /**
    * A list of regular expression patterns to exclude certain blog posts, pages, spaces, or attachments in your Confluence. Content that matches the patterns are excluded from the index. Content that doesn't match the patterns is included in the index. If content matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the content isn't included in the index.
    */
  var ExclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined
  
  /**
    * A list of regular expression patterns to include certain blog posts, pages, spaces, or attachments in your Confluence. Content that matches the patterns are included in the index. Content that doesn't match the patterns is excluded from the index. If content matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the content isn't included in the index.
    */
  var InclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.undefined
  
  /**
    * Configuration information for indexing Confluence pages.
    */
  var PageConfiguration: js.UndefOr[ConfluencePageConfiguration] = js.undefined
  
  /**
    * Configuration information to connect to your Confluence URL instance via a web proxy. You can use this option for Confluence Server. You must provide the website host name and port number. For example, the host name of https://a.example.com/page1.html is "a.example.com" and the port is 443, the standard port for HTTPS. Web proxy credentials are optional and you can use them to connect to a web proxy server that requires basic authentication of user name and password. To store web proxy credentials, you use a secret in Secrets Manager. It is recommended that you follow best security practices when configuring your web proxy. This includes setting up throttling, setting up logging and monitoring, and applying security patches on a regular basis. If you use your web proxy with multiple data sources, sync jobs that occur at the same time could strain the load on your proxy. It is recommended you prepare your proxy beforehand for any security and load requirements.
    */
  var ProxyConfiguration: js.UndefOr[typings.awsSdk.kendraMod.ProxyConfiguration] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of an Secrets Manager secret that contains the user name and password required to connect to the Confluence instance. If you use Confluence Cloud, you use a generated API token as the password. For more information, see Using a Confluence data source. You can also provide authentication credentials in the form of a personal access token. For more information, see Authentication for a Confluence data source.
    */
  var SecretArn: typings.awsSdk.kendraMod.SecretArn
  
  /**
    * The URL of your Confluence instance. Use the full URL of the server. For example, https://server.example.com:port/. You can also use an IP address, for example, https://192.168.1.113/.
    */
  var ServerUrl: Url
  
  /**
    * Configuration information for indexing Confluence spaces.
    */
  var SpaceConfiguration: js.UndefOr[ConfluenceSpaceConfiguration] = js.undefined
  
  /**
    * The version or the type of Confluence installation to connect to.
    */
  var Version: ConfluenceVersion
  
  /**
    * Configuration information for an Amazon Virtual Private Cloud to connect to your Confluence. For more information, see Configuring a VPC.
    */
  var VpcConfiguration: js.UndefOr[DataSourceVpcConfiguration] = js.undefined
}
object ConfluenceConfiguration {
  
  inline def apply(SecretArn: SecretArn, ServerUrl: Url, Version: ConfluenceVersion): ConfluenceConfiguration = {
    val __obj = js.Dynamic.literal(SecretArn = SecretArn.asInstanceOf[js.Any], ServerUrl = ServerUrl.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfluenceConfiguration]
  }
  
  extension [Self <: ConfluenceConfiguration](x: Self) {
    
    inline def setAttachmentConfiguration(value: ConfluenceAttachmentConfiguration): Self = StObject.set(x, "AttachmentConfiguration", value.asInstanceOf[js.Any])
    
    inline def setAttachmentConfigurationUndefined: Self = StObject.set(x, "AttachmentConfiguration", js.undefined)
    
    inline def setAuthenticationType(value: ConfluenceAuthenticationType): Self = StObject.set(x, "AuthenticationType", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationTypeUndefined: Self = StObject.set(x, "AuthenticationType", js.undefined)
    
    inline def setBlogConfiguration(value: ConfluenceBlogConfiguration): Self = StObject.set(x, "BlogConfiguration", value.asInstanceOf[js.Any])
    
    inline def setBlogConfigurationUndefined: Self = StObject.set(x, "BlogConfiguration", js.undefined)
    
    inline def setExclusionPatterns(value: DataSourceInclusionsExclusionsStrings): Self = StObject.set(x, "ExclusionPatterns", value.asInstanceOf[js.Any])
    
    inline def setExclusionPatternsUndefined: Self = StObject.set(x, "ExclusionPatterns", js.undefined)
    
    inline def setExclusionPatternsVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = StObject.set(x, "ExclusionPatterns", js.Array(value*))
    
    inline def setInclusionPatterns(value: DataSourceInclusionsExclusionsStrings): Self = StObject.set(x, "InclusionPatterns", value.asInstanceOf[js.Any])
    
    inline def setInclusionPatternsUndefined: Self = StObject.set(x, "InclusionPatterns", js.undefined)
    
    inline def setInclusionPatternsVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = StObject.set(x, "InclusionPatterns", js.Array(value*))
    
    inline def setPageConfiguration(value: ConfluencePageConfiguration): Self = StObject.set(x, "PageConfiguration", value.asInstanceOf[js.Any])
    
    inline def setPageConfigurationUndefined: Self = StObject.set(x, "PageConfiguration", js.undefined)
    
    inline def setProxyConfiguration(value: ProxyConfiguration): Self = StObject.set(x, "ProxyConfiguration", value.asInstanceOf[js.Any])
    
    inline def setProxyConfigurationUndefined: Self = StObject.set(x, "ProxyConfiguration", js.undefined)
    
    inline def setSecretArn(value: SecretArn): Self = StObject.set(x, "SecretArn", value.asInstanceOf[js.Any])
    
    inline def setServerUrl(value: Url): Self = StObject.set(x, "ServerUrl", value.asInstanceOf[js.Any])
    
    inline def setSpaceConfiguration(value: ConfluenceSpaceConfiguration): Self = StObject.set(x, "SpaceConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSpaceConfigurationUndefined: Self = StObject.set(x, "SpaceConfiguration", js.undefined)
    
    inline def setVersion(value: ConfluenceVersion): Self = StObject.set(x, "Version", value.asInstanceOf[js.Any])
    
    inline def setVpcConfiguration(value: DataSourceVpcConfiguration): Self = StObject.set(x, "VpcConfiguration", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigurationUndefined: Self = StObject.set(x, "VpcConfiguration", js.undefined)
  }
}
