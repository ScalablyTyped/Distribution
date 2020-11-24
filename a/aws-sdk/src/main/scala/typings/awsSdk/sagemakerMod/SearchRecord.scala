package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchRecord extends js.Object {
  
  /**
    * The properties of an experiment.
    */
  var Experiment: js.UndefOr[typings.awsSdk.sagemakerMod.Experiment] = js.native
  
  /**
    * The properties of a training job.
    */
  var TrainingJob: js.UndefOr[typings.awsSdk.sagemakerMod.TrainingJob] = js.native
  
  /**
    * The properties of a trial.
    */
  var Trial: js.UndefOr[typings.awsSdk.sagemakerMod.Trial] = js.native
  
  /**
    * The properties of a trial component.
    */
  var TrialComponent: js.UndefOr[typings.awsSdk.sagemakerMod.TrialComponent] = js.native
}
object SearchRecord {
  
  @scala.inline
  def apply(): SearchRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchRecord]
  }
  
  @scala.inline
  implicit class SearchRecordOps[Self <: SearchRecord] (val x: Self) extends AnyVal {
    
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
    def setExperiment(value: Experiment): Self = this.set("Experiment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExperiment: Self = this.set("Experiment", js.undefined)
    
    @scala.inline
    def setTrainingJob(value: TrainingJob): Self = this.set("TrainingJob", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrainingJob: Self = this.set("TrainingJob", js.undefined)
    
    @scala.inline
    def setTrial(value: Trial): Self = this.set("Trial", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrial: Self = this.set("Trial", js.undefined)
    
    @scala.inline
    def setTrialComponent(value: TrialComponent): Self = this.set("TrialComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrialComponent: Self = this.set("TrialComponent", js.undefined)
  }
}
