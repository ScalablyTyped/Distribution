package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchRecord extends StObject {
  
  var Endpoint: js.UndefOr[typings.awsSdk.sagemakerMod.Endpoint] = js.undefined
  
  /**
    * The properties of an experiment.
    */
  var Experiment: js.UndefOr[typings.awsSdk.sagemakerMod.Experiment] = js.undefined
  
  var FeatureGroup: js.UndefOr[typings.awsSdk.sagemakerMod.FeatureGroup] = js.undefined
  
  /**
    * The feature metadata used to search through the features.
    */
  var FeatureMetadata: js.UndefOr[typings.awsSdk.sagemakerMod.FeatureMetadata] = js.undefined
  
  /**
    * The properties of a hyperparameter tuning job.
    */
  var HyperParameterTuningJob: js.UndefOr[HyperParameterTuningJobSearchEntity] = js.undefined
  
  var ModelPackage: js.UndefOr[typings.awsSdk.sagemakerMod.ModelPackage] = js.undefined
  
  var ModelPackageGroup: js.UndefOr[typings.awsSdk.sagemakerMod.ModelPackageGroup] = js.undefined
  
  var Pipeline: js.UndefOr[typings.awsSdk.sagemakerMod.Pipeline] = js.undefined
  
  var PipelineExecution: js.UndefOr[typings.awsSdk.sagemakerMod.PipelineExecution] = js.undefined
  
  /**
    * The properties of a project.
    */
  var Project: js.UndefOr[typings.awsSdk.sagemakerMod.Project] = js.undefined
  
  /**
    * The properties of a training job.
    */
  var TrainingJob: js.UndefOr[typings.awsSdk.sagemakerMod.TrainingJob] = js.undefined
  
  /**
    * The properties of a trial.
    */
  var Trial: js.UndefOr[typings.awsSdk.sagemakerMod.Trial] = js.undefined
  
  /**
    * The properties of a trial component.
    */
  var TrialComponent: js.UndefOr[typings.awsSdk.sagemakerMod.TrialComponent] = js.undefined
}
object SearchRecord {
  
  inline def apply(): SearchRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchRecord]
  }
  
  extension [Self <: SearchRecord](x: Self) {
    
    inline def setEndpoint(value: Endpoint): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
    
    inline def setEndpointUndefined: Self = StObject.set(x, "Endpoint", js.undefined)
    
    inline def setExperiment(value: Experiment): Self = StObject.set(x, "Experiment", value.asInstanceOf[js.Any])
    
    inline def setExperimentUndefined: Self = StObject.set(x, "Experiment", js.undefined)
    
    inline def setFeatureGroup(value: FeatureGroup): Self = StObject.set(x, "FeatureGroup", value.asInstanceOf[js.Any])
    
    inline def setFeatureGroupUndefined: Self = StObject.set(x, "FeatureGroup", js.undefined)
    
    inline def setFeatureMetadata(value: FeatureMetadata): Self = StObject.set(x, "FeatureMetadata", value.asInstanceOf[js.Any])
    
    inline def setFeatureMetadataUndefined: Self = StObject.set(x, "FeatureMetadata", js.undefined)
    
    inline def setHyperParameterTuningJob(value: HyperParameterTuningJobSearchEntity): Self = StObject.set(x, "HyperParameterTuningJob", value.asInstanceOf[js.Any])
    
    inline def setHyperParameterTuningJobUndefined: Self = StObject.set(x, "HyperParameterTuningJob", js.undefined)
    
    inline def setModelPackage(value: ModelPackage): Self = StObject.set(x, "ModelPackage", value.asInstanceOf[js.Any])
    
    inline def setModelPackageGroup(value: ModelPackageGroup): Self = StObject.set(x, "ModelPackageGroup", value.asInstanceOf[js.Any])
    
    inline def setModelPackageGroupUndefined: Self = StObject.set(x, "ModelPackageGroup", js.undefined)
    
    inline def setModelPackageUndefined: Self = StObject.set(x, "ModelPackage", js.undefined)
    
    inline def setPipeline(value: Pipeline): Self = StObject.set(x, "Pipeline", value.asInstanceOf[js.Any])
    
    inline def setPipelineExecution(value: PipelineExecution): Self = StObject.set(x, "PipelineExecution", value.asInstanceOf[js.Any])
    
    inline def setPipelineExecutionUndefined: Self = StObject.set(x, "PipelineExecution", js.undefined)
    
    inline def setPipelineUndefined: Self = StObject.set(x, "Pipeline", js.undefined)
    
    inline def setProject(value: Project): Self = StObject.set(x, "Project", value.asInstanceOf[js.Any])
    
    inline def setProjectUndefined: Self = StObject.set(x, "Project", js.undefined)
    
    inline def setTrainingJob(value: TrainingJob): Self = StObject.set(x, "TrainingJob", value.asInstanceOf[js.Any])
    
    inline def setTrainingJobUndefined: Self = StObject.set(x, "TrainingJob", js.undefined)
    
    inline def setTrial(value: Trial): Self = StObject.set(x, "Trial", value.asInstanceOf[js.Any])
    
    inline def setTrialComponent(value: TrialComponent): Self = StObject.set(x, "TrialComponent", value.asInstanceOf[js.Any])
    
    inline def setTrialComponentUndefined: Self = StObject.set(x, "TrialComponent", js.undefined)
    
    inline def setTrialUndefined: Self = StObject.set(x, "Trial", js.undefined)
  }
}
