package typings.awsSdk.kendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SalesforceKnowledgeArticleConfiguration extends js.Object {
  /**
    * Provides configuration information for custom Salesforce knowledge articles.
    */
  var CustomKnowledgeArticleTypeConfigurations: js.UndefOr[SalesforceCustomKnowledgeArticleTypeConfigurationList] = js.native
  /**
    * Specifies the document states that should be included when Amazon Kendra indexes knowledge articles. You must specify at least one state.
    */
  var IncludedStates: SalesforceKnowledgeArticleStateList = js.native
  /**
    * Provides configuration information for standard Salesforce knowledge articles.
    */
  var StandardKnowledgeArticleTypeConfiguration: js.UndefOr[SalesforceStandardKnowledgeArticleTypeConfiguration] = js.native
}

object SalesforceKnowledgeArticleConfiguration {
  @scala.inline
  def apply(
    IncludedStates: SalesforceKnowledgeArticleStateList,
    CustomKnowledgeArticleTypeConfigurations: SalesforceCustomKnowledgeArticleTypeConfigurationList = null,
    StandardKnowledgeArticleTypeConfiguration: SalesforceStandardKnowledgeArticleTypeConfiguration = null
  ): SalesforceKnowledgeArticleConfiguration = {
    val __obj = js.Dynamic.literal(IncludedStates = IncludedStates.asInstanceOf[js.Any])
    if (CustomKnowledgeArticleTypeConfigurations != null) __obj.updateDynamic("CustomKnowledgeArticleTypeConfigurations")(CustomKnowledgeArticleTypeConfigurations.asInstanceOf[js.Any])
    if (StandardKnowledgeArticleTypeConfiguration != null) __obj.updateDynamic("StandardKnowledgeArticleTypeConfiguration")(StandardKnowledgeArticleTypeConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[SalesforceKnowledgeArticleConfiguration]
  }
}

