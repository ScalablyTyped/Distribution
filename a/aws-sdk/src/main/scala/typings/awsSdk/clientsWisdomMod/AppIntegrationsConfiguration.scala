package typings.awsSdk.clientsWisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppIntegrationsConfiguration extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the AppIntegrations DataIntegration to use for ingesting content.
    */
  var appIntegrationArn: GenericArn
  
  /**
    * The fields from the source that are made available to your agents in Wisdom.     For  Salesforce, you must include at least Id, ArticleNumber, VersionNumber, Title, PublishStatus, and IsDeleted.    For  ServiceNow, you must include at least number, short_description, sys_mod_count, workflow_state, and active.    Make sure to include additional fields. These fields are indexed and used to source recommendations. 
    */
  var objectFields: ObjectFieldsList
}
object AppIntegrationsConfiguration {
  
  inline def apply(appIntegrationArn: GenericArn, objectFields: ObjectFieldsList): AppIntegrationsConfiguration = {
    val __obj = js.Dynamic.literal(appIntegrationArn = appIntegrationArn.asInstanceOf[js.Any], objectFields = objectFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppIntegrationsConfiguration]
  }
  
  extension [Self <: AppIntegrationsConfiguration](x: Self) {
    
    inline def setAppIntegrationArn(value: GenericArn): Self = StObject.set(x, "appIntegrationArn", value.asInstanceOf[js.Any])
    
    inline def setObjectFields(value: ObjectFieldsList): Self = StObject.set(x, "objectFields", value.asInstanceOf[js.Any])
    
    inline def setObjectFieldsVarargs(value: NonEmptyString*): Self = StObject.set(x, "objectFields", js.Array(value*))
  }
}
