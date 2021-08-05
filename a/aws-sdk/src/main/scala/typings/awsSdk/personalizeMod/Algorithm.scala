package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Algorithm extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the algorithm.
    */
  var algorithmArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The URI of the Docker container for the algorithm image.
    */
  var algorithmImage: js.UndefOr[AlgorithmImage] = js.undefined
  
  /**
    * The date and time (in Unix time) that the algorithm was created.
    */
  var creationDateTime: js.UndefOr[Date] = js.undefined
  
  /**
    * Specifies the default hyperparameters, their ranges, and whether they are tunable. A tunable hyperparameter can have its value determined during hyperparameter optimization (HPO).
    */
  var defaultHyperParameterRanges: js.UndefOr[DefaultHyperParameterRanges] = js.undefined
  
  /**
    * Specifies the default hyperparameters.
    */
  var defaultHyperParameters: js.UndefOr[HyperParameters] = js.undefined
  
  /**
    * Specifies the default maximum number of training jobs and parallel training jobs.
    */
  var defaultResourceConfig: js.UndefOr[ResourceConfig] = js.undefined
  
  /**
    * The date and time (in Unix time) that the algorithm was last updated.
    */
  var lastUpdatedDateTime: js.UndefOr[Date] = js.undefined
  
  /**
    * The name of the algorithm.
    */
  var name: js.UndefOr[Name] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the role.
    */
  var roleArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The training input mode.
    */
  var trainingInputMode: js.UndefOr[TrainingInputMode] = js.undefined
}
object Algorithm {
  
  inline def apply(): Algorithm = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Algorithm]
  }
  
  extension [Self <: Algorithm](x: Self) {
    
    inline def setAlgorithmArn(value: Arn): Self = StObject.set(x, "algorithmArn", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmArnUndefined: Self = StObject.set(x, "algorithmArn", js.undefined)
    
    inline def setAlgorithmImage(value: AlgorithmImage): Self = StObject.set(x, "algorithmImage", value.asInstanceOf[js.Any])
    
    inline def setAlgorithmImageUndefined: Self = StObject.set(x, "algorithmImage", js.undefined)
    
    inline def setCreationDateTime(value: Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTimeUndefined: Self = StObject.set(x, "creationDateTime", js.undefined)
    
    inline def setDefaultHyperParameterRanges(value: DefaultHyperParameterRanges): Self = StObject.set(x, "defaultHyperParameterRanges", value.asInstanceOf[js.Any])
    
    inline def setDefaultHyperParameterRangesUndefined: Self = StObject.set(x, "defaultHyperParameterRanges", js.undefined)
    
    inline def setDefaultHyperParameters(value: HyperParameters): Self = StObject.set(x, "defaultHyperParameters", value.asInstanceOf[js.Any])
    
    inline def setDefaultHyperParametersUndefined: Self = StObject.set(x, "defaultHyperParameters", js.undefined)
    
    inline def setDefaultResourceConfig(value: ResourceConfig): Self = StObject.set(x, "defaultResourceConfig", value.asInstanceOf[js.Any])
    
    inline def setDefaultResourceConfigUndefined: Self = StObject.set(x, "defaultResourceConfig", js.undefined)
    
    inline def setLastUpdatedDateTime(value: Date): Self = StObject.set(x, "lastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "lastUpdatedDateTime", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRoleArn(value: Arn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "roleArn", js.undefined)
    
    inline def setTrainingInputMode(value: TrainingInputMode): Self = StObject.set(x, "trainingInputMode", value.asInstanceOf[js.Any])
    
    inline def setTrainingInputModeUndefined: Self = StObject.set(x, "trainingInputMode", js.undefined)
  }
}
