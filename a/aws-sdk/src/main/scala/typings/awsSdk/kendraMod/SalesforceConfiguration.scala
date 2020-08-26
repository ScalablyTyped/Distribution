package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SalesforceConfiguration extends js.Object {
  /**
    * Specifies configuration information for Salesforce chatter feeds.
    */
  var ChatterFeedConfiguration: js.UndefOr[SalesforceChatterFeedConfiguration] = js.native
  /**
    * Indicates whether Amazon Kendra should index attachments to Salesforce objects.
    */
  var CrawlAttachments: js.UndefOr[Boolean] = js.native
  /**
    * A list of regular expression patterns. Documents that match the patterns are excluded from the index. Documents that don't match the patterns are included in the index. If a document matches both an exclusion pattern and an inclusion pattern, the document is not included in the index. The regex is applied to the name of the attached file.
    */
  var ExcludeAttachmentFilePatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.native
  /**
    * A list of regular expression patterns. Documents that match the patterns are included in the index. Documents that don't match the patterns are excluded from the index. If a document matches both an inclusion pattern and an exclusion pattern, the document is not included in the index. The regex is applied to the name of the attached file.
    */
  var IncludeAttachmentFilePatterns: js.UndefOr[DataSourceInclusionsExclusionsStrings] = js.native
  /**
    * Specifies configuration information for the knowlege article types that Amazon Kendra indexes. Amazon Kendra indexes standard knowledge articles and the standard fields of knowledge articles, or the custom fields of custom knowledge articles, but not both.
    */
  var KnowledgeArticleConfiguration: js.UndefOr[SalesforceKnowledgeArticleConfiguration] = js.native
  /**
    * The Amazon Resource Name (ARN) of an AWS Secrets Manager secret that contains the key/value pairs required to connect to your Salesforce instance. The secret must contain a JSON structure with the following keys:   authenticationUrl - The OAUTH endpoint that Amazon Kendra connects to get an OAUTH token.    consumerKey - The application public key generated when you created your Salesforce application.   consumerSecret - The application private key generated when you created your Salesforce application.   password - The password associated with the user logging in to the Salesforce instance.   securityToken - The token associated with the user account logging in to the Salesforce instance.   username - The user name of the user logging in to the Salesforce instance.  
    */
  var SecretArn: typings.awsSdk.kendraMod.SecretArn = js.native
  /**
    * The instance URL for the Salesforce site that you want to index.
    */
  var ServerUrl: Url = js.native
  /**
    * Provides configuration information for processing attachments to Salesforce standard objects. 
    */
  var StandardObjectAttachmentConfiguration: js.UndefOr[SalesforceStandardObjectAttachmentConfiguration] = js.native
  /**
    * Specifies the Salesforce standard objects that Amazon Kendra indexes.
    */
  var StandardObjectConfigurations: js.UndefOr[SalesforceStandardObjectConfigurationList] = js.native
}

object SalesforceConfiguration {
  @scala.inline
  def apply(SecretArn: SecretArn, ServerUrl: Url): SalesforceConfiguration = {
    val __obj = js.Dynamic.literal(SecretArn = SecretArn.asInstanceOf[js.Any], ServerUrl = ServerUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[SalesforceConfiguration]
  }
  @scala.inline
  implicit class SalesforceConfigurationOps[Self <: SalesforceConfiguration] (val x: Self) extends AnyVal {
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
    def setChatterFeedConfiguration(value: SalesforceChatterFeedConfiguration): Self = this.set("ChatterFeedConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChatterFeedConfiguration: Self = this.set("ChatterFeedConfiguration", js.undefined)
    @scala.inline
    def setCrawlAttachments(value: Boolean): Self = this.set("CrawlAttachments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCrawlAttachments: Self = this.set("CrawlAttachments", js.undefined)
    @scala.inline
    def setExcludeAttachmentFilePatternsVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = this.set("ExcludeAttachmentFilePatterns", js.Array(value :_*))
    @scala.inline
    def setExcludeAttachmentFilePatterns(value: DataSourceInclusionsExclusionsStrings): Self = this.set("ExcludeAttachmentFilePatterns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeAttachmentFilePatterns: Self = this.set("ExcludeAttachmentFilePatterns", js.undefined)
    @scala.inline
    def setIncludeAttachmentFilePatternsVarargs(value: DataSourceInclusionsExclusionsStringsMember*): Self = this.set("IncludeAttachmentFilePatterns", js.Array(value :_*))
    @scala.inline
    def setIncludeAttachmentFilePatterns(value: DataSourceInclusionsExclusionsStrings): Self = this.set("IncludeAttachmentFilePatterns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeAttachmentFilePatterns: Self = this.set("IncludeAttachmentFilePatterns", js.undefined)
    @scala.inline
    def setKnowledgeArticleConfiguration(value: SalesforceKnowledgeArticleConfiguration): Self = this.set("KnowledgeArticleConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKnowledgeArticleConfiguration: Self = this.set("KnowledgeArticleConfiguration", js.undefined)
    @scala.inline
    def setStandardObjectAttachmentConfiguration(value: SalesforceStandardObjectAttachmentConfiguration): Self = this.set("StandardObjectAttachmentConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStandardObjectAttachmentConfiguration: Self = this.set("StandardObjectAttachmentConfiguration", js.undefined)
    @scala.inline
    def setStandardObjectConfigurationsVarargs(value: SalesforceStandardObjectConfiguration*): Self = this.set("StandardObjectConfigurations", js.Array(value :_*))
    @scala.inline
    def setStandardObjectConfigurations(value: SalesforceStandardObjectConfigurationList): Self = this.set("StandardObjectConfigurations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStandardObjectConfigurations: Self = this.set("StandardObjectConfigurations", js.undefined)
  }
  
}

