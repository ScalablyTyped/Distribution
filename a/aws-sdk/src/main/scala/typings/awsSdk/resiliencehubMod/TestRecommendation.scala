package typings.awsSdk.resiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestRecommendation extends StObject {
  
  /**
    * The name of the application component.
    */
  var appComponentName: js.UndefOr[EntityId] = js.undefined
  
  /**
    *  A list of recommended alarms that are used in the test and must be exported before or with the test. 
    */
  var dependsOnAlarms: js.UndefOr[AlarmReferenceIdList] = js.undefined
  
  /**
    * The description for the test recommendation.
    */
  var description: js.UndefOr[String500] = js.undefined
  
  /**
    * The intent of the test recommendation.
    */
  var intent: js.UndefOr[EntityDescription] = js.undefined
  
  /**
    * The test recommendation items.
    */
  var items: js.UndefOr[RecommendationItemList] = js.undefined
  
  /**
    * The name of the test recommendation.
    */
  var name: js.UndefOr[DocumentName] = js.undefined
  
  /**
    * The prerequisite of the test recommendation.
    */
  var prerequisite: js.UndefOr[String500] = js.undefined
  
  /**
    * Identifier for the test recommendation.
    */
  var recommendationId: js.UndefOr[Uuid] = js.undefined
  
  /**
    * The reference identifier for the test recommendation.
    */
  var referenceId: SpecReferenceId
  
  /**
    * The level of risk for this test recommendation.
    */
  var risk: js.UndefOr[TestRisk] = js.undefined
  
  /**
    * The type of test recommendation.
    */
  var `type`: js.UndefOr[TestType] = js.undefined
}
object TestRecommendation {
  
  inline def apply(referenceId: SpecReferenceId): TestRecommendation = {
    val __obj = js.Dynamic.literal(referenceId = referenceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestRecommendation]
  }
  
  extension [Self <: TestRecommendation](x: Self) {
    
    inline def setAppComponentName(value: EntityId): Self = StObject.set(x, "appComponentName", value.asInstanceOf[js.Any])
    
    inline def setAppComponentNameUndefined: Self = StObject.set(x, "appComponentName", js.undefined)
    
    inline def setDependsOnAlarms(value: AlarmReferenceIdList): Self = StObject.set(x, "dependsOnAlarms", value.asInstanceOf[js.Any])
    
    inline def setDependsOnAlarmsUndefined: Self = StObject.set(x, "dependsOnAlarms", js.undefined)
    
    inline def setDependsOnAlarmsVarargs(value: String500*): Self = StObject.set(x, "dependsOnAlarms", js.Array(value*))
    
    inline def setDescription(value: String500): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setIntent(value: EntityDescription): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
    
    inline def setItems(value: RecommendationItemList): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: RecommendationItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setName(value: DocumentName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPrerequisite(value: String500): Self = StObject.set(x, "prerequisite", value.asInstanceOf[js.Any])
    
    inline def setPrerequisiteUndefined: Self = StObject.set(x, "prerequisite", js.undefined)
    
    inline def setRecommendationId(value: Uuid): Self = StObject.set(x, "recommendationId", value.asInstanceOf[js.Any])
    
    inline def setRecommendationIdUndefined: Self = StObject.set(x, "recommendationId", js.undefined)
    
    inline def setReferenceId(value: SpecReferenceId): Self = StObject.set(x, "referenceId", value.asInstanceOf[js.Any])
    
    inline def setRisk(value: TestRisk): Self = StObject.set(x, "risk", value.asInstanceOf[js.Any])
    
    inline def setRiskUndefined: Self = StObject.set(x, "risk", js.undefined)
    
    inline def setType(value: TestType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
