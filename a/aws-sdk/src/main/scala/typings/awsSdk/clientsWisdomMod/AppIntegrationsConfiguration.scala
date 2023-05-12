package typings.awsSdk.clientsWisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppIntegrationsConfiguration extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the AppIntegrations DataIntegration to use for ingesting content.    For  Salesforce, your AppIntegrations DataIntegration must have an ObjectConfiguration if objectFields is not provided, including at least Id, ArticleNumber, VersionNumber, Title, PublishStatus, and IsDeleted as source fields.     For  ServiceNow, your AppIntegrations DataIntegration must have an ObjectConfiguration if objectFields is not provided, including at least number, short_description, sys_mod_count, workflow_state, and active as source fields.     For  Zendesk, your AppIntegrations DataIntegration must have an ObjectConfiguration if objectFields is not provided, including at least id, title, updated_at, and draft as source fields.     For  SharePoint, your AppIntegrations DataIntegration must have a FileConfiguration, including only file extensions that are among docx, pdf, html, htm, and txt.   
    */
  var appIntegrationArn: GenericArn
  
  /**
    * The fields from the source that are made available to your agents in Wisdom. Optional if ObjectConfiguration is included in the provided DataIntegration.     For  Salesforce, you must include at least Id, ArticleNumber, VersionNumber, Title, PublishStatus, and IsDeleted.    For  ServiceNow, you must include at least number, short_description, sys_mod_count, workflow_state, and active.    For  Zendesk, you must include at least id, title, updated_at, and draft.    Make sure to include additional fields. These fields are indexed and used to source recommendations. 
    */
  var objectFields: js.UndefOr[ObjectFieldsList] = js.undefined
}
object AppIntegrationsConfiguration {
  
  inline def apply(appIntegrationArn: GenericArn): AppIntegrationsConfiguration = {
    val __obj = js.Dynamic.literal(appIntegrationArn = appIntegrationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppIntegrationsConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppIntegrationsConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAppIntegrationArn(value: GenericArn): Self = StObject.set(x, "appIntegrationArn", value.asInstanceOf[js.Any])
    
    inline def setObjectFields(value: ObjectFieldsList): Self = StObject.set(x, "objectFields", value.asInstanceOf[js.Any])
    
    inline def setObjectFieldsUndefined: Self = StObject.set(x, "objectFields", js.undefined)
    
    inline def setObjectFieldsVarargs(value: NonEmptyString*): Self = StObject.set(x, "objectFields", js.Array(value*))
  }
}
