package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParentHyperParameterTuningJob extends js.Object {
  
  /**
    * The name of the hyperparameter tuning job to be used as a starting point for a new hyperparameter tuning job.
    */
  var HyperParameterTuningJobName: js.UndefOr[typings.awsSdk.sagemakerMod.HyperParameterTuningJobName] = js.native
}
object ParentHyperParameterTuningJob {
  
  @scala.inline
  def apply(): ParentHyperParameterTuningJob = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParentHyperParameterTuningJob]
  }
  
  @scala.inline
  implicit class ParentHyperParameterTuningJobOps[Self <: ParentHyperParameterTuningJob] (val x: Self) extends AnyVal {
    
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
    def setHyperParameterTuningJobName(value: HyperParameterTuningJobName): Self = this.set("HyperParameterTuningJobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHyperParameterTuningJobName: Self = this.set("HyperParameterTuningJobName", js.undefined)
  }
}
