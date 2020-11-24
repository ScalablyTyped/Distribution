package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScheduledActionType extends js.Object {
  
  /**
    * An action that runs a PauseCluster API operation. 
    */
  var PauseCluster: js.UndefOr[PauseClusterMessage] = js.native
  
  /**
    * An action that runs a ResizeCluster API operation. 
    */
  var ResizeCluster: js.UndefOr[ResizeClusterMessage] = js.native
  
  /**
    * An action that runs a ResumeCluster API operation. 
    */
  var ResumeCluster: js.UndefOr[ResumeClusterMessage] = js.native
}
object ScheduledActionType {
  
  @scala.inline
  def apply(): ScheduledActionType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduledActionType]
  }
  
  @scala.inline
  implicit class ScheduledActionTypeOps[Self <: ScheduledActionType] (val x: Self) extends AnyVal {
    
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
    def setPauseCluster(value: PauseClusterMessage): Self = this.set("PauseCluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePauseCluster: Self = this.set("PauseCluster", js.undefined)
    
    @scala.inline
    def setResizeCluster(value: ResizeClusterMessage): Self = this.set("ResizeCluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizeCluster: Self = this.set("ResizeCluster", js.undefined)
    
    @scala.inline
    def setResumeCluster(value: ResumeClusterMessage): Self = this.set("ResumeCluster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResumeCluster: Self = this.set("ResumeCluster", js.undefined)
  }
}
