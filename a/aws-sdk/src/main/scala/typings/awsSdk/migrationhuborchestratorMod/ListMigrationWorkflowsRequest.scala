package typings.awsSdk.migrationhuborchestratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListMigrationWorkflowsRequest extends StObject {
  
  /**
    * The name of the application configured in Application Discovery Service.
    */
  var adsApplicationConfigurationName: js.UndefOr[ApplicationConfigurationName] = js.undefined
  
  /**
    * The maximum number of results that can be returned.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * The name of the migration workflow.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The pagination token.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The status of the migration workflow.
    */
  var status: js.UndefOr[MigrationWorkflowStatusEnum] = js.undefined
  
  /**
    * The ID of the template.
    */
  var templateId: js.UndefOr[TemplateId] = js.undefined
}
object ListMigrationWorkflowsRequest {
  
  inline def apply(): ListMigrationWorkflowsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListMigrationWorkflowsRequest]
  }
  
  extension [Self <: ListMigrationWorkflowsRequest](x: Self) {
    
    inline def setAdsApplicationConfigurationName(value: ApplicationConfigurationName): Self = StObject.set(x, "adsApplicationConfigurationName", value.asInstanceOf[js.Any])
    
    inline def setAdsApplicationConfigurationNameUndefined: Self = StObject.set(x, "adsApplicationConfigurationName", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setStatus(value: MigrationWorkflowStatusEnum): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTemplateId(value: TemplateId): Self = StObject.set(x, "templateId", value.asInstanceOf[js.Any])
    
    inline def setTemplateIdUndefined: Self = StObject.set(x, "templateId", js.undefined)
  }
}
