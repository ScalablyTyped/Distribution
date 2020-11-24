package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrialSummary extends js.Object {
  
  /**
    * When the trial was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The name of the trial as displayed. If DisplayName isn't specified, TrialName is displayed.
    */
  var DisplayName: js.UndefOr[ExperimentEntityName] = js.native
  
  /**
    * When the trial was last modified.
    */
  var LastModifiedTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the trial.
    */
  var TrialArn: js.UndefOr[typings.awsSdk.sagemakerMod.TrialArn] = js.native
  
  /**
    * The name of the trial.
    */
  var TrialName: js.UndefOr[ExperimentEntityName] = js.native
  
  var TrialSource: js.UndefOr[typings.awsSdk.sagemakerMod.TrialSource] = js.native
}
object TrialSummary {
  
  @scala.inline
  def apply(): TrialSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrialSummary]
  }
  
  @scala.inline
  implicit class TrialSummaryOps[Self <: TrialSummary] (val x: Self) extends AnyVal {
    
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
    def setCreationTime(value: Timestamp): Self = this.set("CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreationTime: Self = this.set("CreationTime", js.undefined)
    
    @scala.inline
    def setDisplayName(value: ExperimentEntityName): Self = this.set("DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayName: Self = this.set("DisplayName", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: Timestamp): Self = this.set("LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastModifiedTime: Self = this.set("LastModifiedTime", js.undefined)
    
    @scala.inline
    def setTrialArn(value: TrialArn): Self = this.set("TrialArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrialArn: Self = this.set("TrialArn", js.undefined)
    
    @scala.inline
    def setTrialName(value: ExperimentEntityName): Self = this.set("TrialName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrialName: Self = this.set("TrialName", js.undefined)
    
    @scala.inline
    def setTrialSource(value: TrialSource): Self = this.set("TrialSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrialSource: Self = this.set("TrialSource", js.undefined)
  }
}
