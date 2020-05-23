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
  def apply(
    SecretArn: SecretArn,
    ServerUrl: Url,
    ChatterFeedConfiguration: SalesforceChatterFeedConfiguration = null,
    CrawlAttachments: js.UndefOr[Boolean] = js.undefined,
    ExcludeAttachmentFilePatterns: DataSourceInclusionsExclusionsStrings = null,
    IncludeAttachmentFilePatterns: DataSourceInclusionsExclusionsStrings = null,
    KnowledgeArticleConfiguration: SalesforceKnowledgeArticleConfiguration = null,
    StandardObjectAttachmentConfiguration: SalesforceStandardObjectAttachmentConfiguration = null,
    StandardObjectConfigurations: SalesforceStandardObjectConfigurationList = null
  ): SalesforceConfiguration = {
    val __obj = js.Dynamic.literal(SecretArn = SecretArn.asInstanceOf[js.Any], ServerUrl = ServerUrl.asInstanceOf[js.Any])
    if (ChatterFeedConfiguration != null) __obj.updateDynamic("ChatterFeedConfiguration")(ChatterFeedConfiguration.asInstanceOf[js.Any])
    if (!js.isUndefined(CrawlAttachments)) __obj.updateDynamic("CrawlAttachments")(CrawlAttachments.get.asInstanceOf[js.Any])
    if (ExcludeAttachmentFilePatterns != null) __obj.updateDynamic("ExcludeAttachmentFilePatterns")(ExcludeAttachmentFilePatterns.asInstanceOf[js.Any])
    if (IncludeAttachmentFilePatterns != null) __obj.updateDynamic("IncludeAttachmentFilePatterns")(IncludeAttachmentFilePatterns.asInstanceOf[js.Any])
    if (KnowledgeArticleConfiguration != null) __obj.updateDynamic("KnowledgeArticleConfiguration")(KnowledgeArticleConfiguration.asInstanceOf[js.Any])
    if (StandardObjectAttachmentConfiguration != null) __obj.updateDynamic("StandardObjectAttachmentConfiguration")(StandardObjectAttachmentConfiguration.asInstanceOf[js.Any])
    if (StandardObjectConfigurations != null) __obj.updateDynamic("StandardObjectConfigurations")(StandardObjectConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[SalesforceConfiguration]
  }
}

