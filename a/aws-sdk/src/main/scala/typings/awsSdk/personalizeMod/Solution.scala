package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Solution extends StObject {
  
  /**
    * When performAutoML is true, specifies the best recipe found.
    */
  var autoMLResult: js.UndefOr[AutoMLResult] = js.undefined
  
  /**
    * The creation date and time (in Unix time) of the solution.
    */
  var creationDateTime: js.UndefOr[Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the dataset group that provides the training data.
    */
  var datasetGroupArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The event type (for example, 'click' or 'like') that is used for training the model.
    */
  var eventType: js.UndefOr[EventType] = js.undefined
  
  /**
    * The date and time (in Unix time) that the solution was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[Date] = js.undefined
  
  /**
    * Describes the latest version of the solution, including the status and the ARN.
    */
  var latestSolutionVersion: js.UndefOr[SolutionVersionSummary] = js.undefined
  
  /**
    * The name of the solution.
    */
  var name: js.UndefOr[Name] = js.undefined
  
  /**
    * When true, Amazon Personalize performs a search for the best USER_PERSONALIZATION recipe from the list specified in the solution configuration (recipeArn must not be specified). When false (the default), Amazon Personalize uses recipeArn for training.
    */
  var performAutoML: js.UndefOr[PerformAutoML] = js.undefined
  
  /**
    * Whether to perform hyperparameter optimization (HPO) on the chosen recipe. The default is false.
    */
  var performHPO: js.UndefOr[PerformHPO] = js.undefined
  
  /**
    * The ARN of the recipe used to create the solution.
    */
  var recipeArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The ARN of the solution.
    */
  var solutionArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * Describes the configuration properties for the solution.
    */
  var solutionConfig: js.UndefOr[SolutionConfig] = js.undefined
  
  /**
    * The status of the solution. A solution can be in one of the following states:   CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED   DELETE PENDING &gt; DELETE IN_PROGRESS  
    */
  var status: js.UndefOr[Status] = js.undefined
}
object Solution {
  
  inline def apply(): Solution = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Solution]
  }
  
  extension [Self <: Solution](x: Self) {
    
    inline def setAutoMLResult(value: AutoMLResult): Self = StObject.set(x, "autoMLResult", value.asInstanceOf[js.Any])
    
    inline def setAutoMLResultUndefined: Self = StObject.set(x, "autoMLResult", js.undefined)
    
    inline def setCreationDateTime(value: Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    inline def setDatasetGroupArn(value: Arn): Self = StObject.set(x, "datasetGroupArn", value.asInstanceOf[js.Any])
    
    inline def setDatasetGroupArnUndefined: Self = StObject.set(x, "datasetGroupArn", js.undefined)
    
    inline def setEventType(value: EventType): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    
    inline def setEventTypeUndefined: Self = StObject.set(x, "eventType", js.undefined)
    
    inline def setLastUpdatedDateTime(value: Date): Self = StObject.set(x, "lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "lastUpdatedDateTime", js.undefined)
    
    inline def setLatestSolutionVersion(value: SolutionVersionSummary): Self = StObject.set(x, "latestSolutionVersion", value.asInstanceOf[js.Any])
    
    inline def setLatestSolutionVersionUndefined: Self = StObject.set(x, "latestSolutionVersion", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPerformAutoML(value: PerformAutoML): Self = StObject.set(x, "performAutoML", value.asInstanceOf[js.Any])
    
    inline def setPerformAutoMLUndefined: Self = StObject.set(x, "performAutoML", js.undefined)
    
    inline def setPerformHPO(value: PerformHPO): Self = StObject.set(x, "performHPO", value.asInstanceOf[js.Any])
    
    inline def setPerformHPOUndefined: Self = StObject.set(x, "performHPO", js.undefined)
    
    inline def setRecipeArn(value: Arn): Self = StObject.set(x, "recipeArn", value.asInstanceOf[js.Any])
    
    inline def setRecipeArnUndefined: Self = StObject.set(x, "recipeArn", js.undefined)
    
    inline def setSolutionArn(value: Arn): Self = StObject.set(x, "solutionArn", value.asInstanceOf[js.Any])
    
    inline def setSolutionArnUndefined: Self = StObject.set(x, "solutionArn", js.undefined)
    
    inline def setSolutionConfig(value: SolutionConfig): Self = StObject.set(x, "solutionConfig", value.asInstanceOf[js.Any])
    
    inline def setSolutionConfigUndefined: Self = StObject.set(x, "solutionConfig", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
