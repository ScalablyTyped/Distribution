package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchRecord extends StObject {
  
  /**
    * The properties of an experiment.
    */
  var Experiment: js.UndefOr[typings.awsSdk.sagemakerMod.Experiment] = js.undefined
  
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
    
    inline def setExperiment(value: Experiment): Self = StObject.set(x, "Experiment", value.asInstanceOf[js.Any])
    
    inline def setExperimentUndefined: Self = StObject.set(x, "Experiment", js.undefined)
    
    inline def setTrainingJob(value: TrainingJob): Self = StObject.set(x, "TrainingJob", value.asInstanceOf[js.Any])
    
    inline def setTrainingJobUndefined: Self = StObject.set(x, "TrainingJob", js.undefined)
    
    inline def setTrial(value: Trial): Self = StObject.set(x, "Trial", value.asInstanceOf[js.Any])
    
    inline def setTrialComponent(value: TrialComponent): Self = StObject.set(x, "TrialComponent", value.asInstanceOf[js.Any])
    
    inline def setTrialComponentUndefined: Self = StObject.set(x, "TrialComponent", js.undefined)
    
    inline def setTrialUndefined: Self = StObject.set(x, "Trial", js.undefined)
  }
}
