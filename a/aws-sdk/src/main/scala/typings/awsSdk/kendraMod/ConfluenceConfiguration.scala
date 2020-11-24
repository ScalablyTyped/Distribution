package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfluenceConfiguration extends js.Object {
  
  /**
    * Specifies configuration information for indexing attachments to Confluence blogs and pages.
    */
  var AttachmentConfiguration: js.UndefOr[ConfluenceAttachmentConfiguration] = js.native
  
  /**
    *  Specifies configuration information for indexing Confluence blogs.
    */
  var BlogConfiguration: js.UndefOr[ConfluenceBlogConfiguration] = js.native
  
  /**
    * A list of regular expression patterns that apply to a URL on the Confluence server. An exclusion pattern can apply to a blog post, a page, a space, or an attachment. Items that match the pattern are excluded from the index. Items that don't match the pattern are included in the index. If a item matches both an exclusion pattern and an inclusion pattern, the item isn't included in the index.
    */
  var ExclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.native
  
  /**
    * A list of regular expression patterns that apply to a URL on the Confluence server. An inclusion pattern can apply to a blog post, a page, a space, or an attachment. Items that match the patterns are included in the index. Items that don't match the pattern are excluded from the index. If an item matches both an inclusion pattern and an exclusion pattern, the item isn't included in the index.
    */
  var InclusionPatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.native
  
  /**
    * Specifies configuration information for indexing Confluence pages.
    */
  var PageConfiguration: js.UndefOr[ConfluencePageConfiguration] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of an AWS Secrets Manager secret that contains the key/value pairs required to connect to your Confluence server. The secret must contain a JSON structure with the following keys:   username - The user name or email address of a user with administrative privileges for the Confluence server.   password - The password associated with the user logging in to the Confluence server.  
    */
  var SecretArn: typings.awsSdk.kendraMod.SecretArn = js.native
  
  /**
    * The URL of your Confluence instance. Use the full URL of the server. For example, https://server.example.com:port/. You can also use an IP address, for example, https://192.168.1.113/.
    */
  var ServerUrl: Url = js.native
  
  /**
    * Specifies configuration information for indexing Confluence spaces.
    */
  var SpaceConfiguration: js.UndefOr[ConfluenceSpaceConfiguration] = js.native
  
  /**
    * Specifies the version of the Confluence installation that you are connecting to.
    */
  var Version: ConfluenceVersion = js.native
  
  /**
    * Specifies the information for connecting to an Amazon VPC.
    */
  var VpcConfiguration: js.UndefOr[DataSourceVpcConfiguration] = js.native
}
object ConfluenceConfiguration {
  
  @scala.inline
  def apply(SecretArn: SecretArn, ServerUrl: Url, Version: ConfluenceVersion): ConfluenceConfiguration = {
    val __obj = js.Dynamic.literal(SecretArn = SecretArn.asInstanceOf[js.Any], ServerUrl = ServerUrl.asInstanceOf[js.Any], Version = Version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfluenceConfiguration]
  }
  
  @scala.inline
  implicit class ConfluenceConfigurationOps[Self <: ConfluenceConfiguration] (val x: Self) extends AnyVal {
    
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
    def setServerUrl(value: Url): Self = this.set("ServerUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: ConfluenceVersion): Self = this.set("Version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentConfiguration(value: ConfluenceAttachmentConfiguration): Self = this.set("AttachmentConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachmentConfiguration: Self = this.set("AttachmentConfiguration", js.undefined)
    
    @scala.inline
    def setBlogConfiguration(value: ConfluenceBlogConfiguration): Self = this.set("BlogConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlogConfiguration: Self = this.set("BlogConfiguration", js.undefined)
    
    @scala.inline
    def setExclusionPatternsVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = this.set("ExclusionPatterns", js.Array(value :_*))
    
    @scala.inline
    def setExclusionPatterns(value: DataSourceInclusionsExclusionsStrings): Self = this.set("ExclusionPatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclusionPatterns: Self = this.set("ExclusionPatterns", js.undefined)
    
    @scala.inline
    def setInclusionPatternsVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = this.set("InclusionPatterns", js.Array(value :_*))
    
    @scala.inline
    def setInclusionPatterns(value: DataSourceInclusionsExclusionsStrings): Self = this.set("InclusionPatterns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclusionPatterns: Self = this.set("InclusionPatterns", js.undefined)
    
    @scala.inline
    def setPageConfiguration(value: ConfluencePageConfiguration): Self = this.set("PageConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageConfiguration: Self = this.set("PageConfiguration", js.undefined)
    
    @scala.inline
    def setSpaceConfiguration(value: ConfluenceSpaceConfiguration): Self = this.set("SpaceConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpaceConfiguration: Self = this.set("SpaceConfiguration", js.undefined)
    
    @scala.inline
    def setVpcConfiguration(value: DataSourceVpcConfiguration): Self = this.set("VpcConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcConfiguration: Self = this.set("VpcConfiguration", js.undefined)
  }
}
