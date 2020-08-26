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
  def apply(IncludedStates: SalesforceKnowledgeArticleStateList): SalesforceKnowledgeArticleConfiguration = {
    val __obj = js.Dynamic.literal(IncludedStates = IncludedStates.asInstanceOf[js.Any])
    __obj.asInstanceOf[SalesforceKnowledgeArticleConfiguration]
  }
  @scala.inline
  implicit class SalesforceKnowledgeArticleConfigurationOps[Self <: SalesforceKnowledgeArticleConfiguration] (val x: Self) extends AnyVal {
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
    def setIncludedStatesVarargs(value: SalesforceKnowledgeArticleState*): Self = this.set("IncludedStates", js.Array(value :_*))
    @scala.inline
    def setIncludedStates(value: SalesforceKnowledgeArticleStateList): Self = this.set("IncludedStates", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomKnowledgeArticleTypeConfigurationsVarargs(value: SalesforceCustomKnowledgeArticleTypeConfiguration*): Self = this.set("CustomKnowledgeArticleTypeConfigurations", js.Array(value :_*))
    @scala.inline
    def setCustomKnowledgeArticleTypeConfigurations(value: SalesforceCustomKnowledgeArticleTypeConfigurationList): Self = this.set("CustomKnowledgeArticleTypeConfigurations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomKnowledgeArticleTypeConfigurations: Self = this.set("CustomKnowledgeArticleTypeConfigurations", js.undefined)
    @scala.inline
    def setStandardKnowledgeArticleTypeConfiguration(value: SalesforceStandardKnowledgeArticleTypeConfiguration): Self = this.set("StandardKnowledgeArticleTypeConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStandardKnowledgeArticleTypeConfiguration: Self = this.set("StandardKnowledgeArticleTypeConfiguration", js.undefined)
  }
  
}

