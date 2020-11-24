package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectBuildBatchConfig extends js.Object {
  
  /**
    * Specifies if the build artifacts for the batch build should be combined into a single artifact location.
    */
  var combineArtifacts: js.UndefOr[WrapperBoolean] = js.native
  
  /**
    * A BatchRestrictions object that specifies the restrictions for the batch build.
    */
  var restrictions: js.UndefOr[BatchRestrictions] = js.native
  
  /**
    * Specifies the service role ARN for the batch build project.
    */
  var serviceRole: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * Specifies the maximum amount of time, in minutes, that the batch build must be completed in.
    */
  var timeoutInMins: js.UndefOr[WrapperInt] = js.native
}
object ProjectBuildBatchConfig {
  
  @scala.inline
  def apply(): ProjectBuildBatchConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectBuildBatchConfig]
  }
  
  @scala.inline
  implicit class ProjectBuildBatchConfigOps[Self <: ProjectBuildBatchConfig] (val x: Self) extends AnyVal {
    
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
    def setCombineArtifacts(value: WrapperBoolean): Self = this.set("combineArtifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCombineArtifacts: Self = this.set("combineArtifacts", js.undefined)
    
    @scala.inline
    def setRestrictions(value: BatchRestrictions): Self = this.set("restrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRestrictions: Self = this.set("restrictions", js.undefined)
    
    @scala.inline
    def setServiceRole(value: NonEmptyString): Self = this.set("serviceRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceRole: Self = this.set("serviceRole", js.undefined)
    
    @scala.inline
    def setTimeoutInMins(value: WrapperInt): Self = this.set("timeoutInMins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeoutInMins: Self = this.set("timeoutInMins", js.undefined)
  }
}
