package typings.awsSdk.kendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SalesforceKnowledgeArticleConfiguration extends StObject {
  
  /**
    * Provides configuration information for custom Salesforce knowledge articles.
    */
  var CustomKnowledgeArticleTypeConfigurations: js.UndefOr[SalesforceCustomKnowledgeArticleTypeConfigurationList] = js.undefined
  
  /**
    * Specifies the document states that should be included when Amazon Kendra indexes knowledge articles. You must specify at least one state.
    */
  var IncludedStates: SalesforceKnowledgeArticleStateList
  
  /**
    * Provides configuration information for standard Salesforce knowledge articles.
    */
  var StandardKnowledgeArticleTypeConfiguration: js.UndefOr[SalesforceStandardKnowledgeArticleTypeConfiguration] = js.undefined
}
object SalesforceKnowledgeArticleConfiguration {
  
  inline def apply(IncludedStates: SalesforceKnowledgeArticleStateList): SalesforceKnowledgeArticleConfiguration = {
    val __obj = js.Dynamic.literal(IncludedStates = IncludedStates.asInstanceOf[js.Any])
    __obj.asInstanceOf[SalesforceKnowledgeArticleConfiguration]
  }
  
  extension [Self <: SalesforceKnowledgeArticleConfiguration](x: Self) {
    
    inline def setCustomKnowledgeArticleTypeConfigurations(value: SalesforceCustomKnowledgeArticleTypeConfigurationList): Self = StObject.set(x, "CustomKnowledgeArticleTypeConfigurations", value.asInstanceOf[js.Any])
    
    inline def setCustomKnowledgeArticleTypeConfigurationsUndefined: Self = StObject.set(x, "CustomKnowledgeArticleTypeConfigurations", js.undefined)
    
    inline def setCustomKnowledgeArticleTypeConfigurationsVarargs(value: SalesforceCustomKnowledgeArticleTypeConfiguration*): Self = StObject.set(x, "CustomKnowledgeArticleTypeConfigurations", js.Array(value :_*))
    
    inline def setIncludedStates(value: SalesforceKnowledgeArticleStateList): Self = StObject.set(x, "IncludedStates", value.asInstanceOf[js.Any])
    
    inline def setIncludedStatesVarargs(value: SalesforceKnowledgeArticleState*): Self = StObject.set(x, "IncludedStates", js.Array(value :_*))
    
    inline def setStandardKnowledgeArticleTypeConfiguration(value: SalesforceStandardKnowledgeArticleTypeConfiguration): Self = StObject.set(x, "StandardKnowledgeArticleTypeConfiguration", value.asInstanceOf[js.Any])
    
    inline def setStandardKnowledgeArticleTypeConfigurationUndefined: Self = StObject.set(x, "StandardKnowledgeArticleTypeConfiguration", js.undefined)
  }
}
