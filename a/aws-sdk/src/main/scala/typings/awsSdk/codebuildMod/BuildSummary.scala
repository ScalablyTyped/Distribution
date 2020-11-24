package typings.awsSdk.codebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildSummary extends js.Object {
  
  /**
    * The batch build ARN.
    */
  var arn: js.UndefOr[String] = js.native
  
  /**
    * The status of the build group.  FAILED  The build group failed.  FAULT  The build group faulted.  IN_PROGRESS  The build group is still in progress.  STOPPED  The build group stopped.  SUCCEEDED  The build group succeeded.  TIMED_OUT  The build group timed out.  
    */
  var buildStatus: js.UndefOr[StatusType] = js.native
  
  /**
    * A ResolvedArtifact object that represents the primary build artifacts for the build group.
    */
  var primaryArtifact: js.UndefOr[ResolvedArtifact] = js.native
  
  /**
    * When the build was started, expressed in Unix time format.
    */
  var requestedOn: js.UndefOr[Timestamp] = js.native
  
  /**
    * An array of ResolvedArtifact objects that represents the secondary build artifacts for the build group.
    */
  var secondaryArtifacts: js.UndefOr[ResolvedSecondaryArtifacts] = js.native
}
object BuildSummary {
  
  @scala.inline
  def apply(): BuildSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildSummary]
  }
  
  @scala.inline
  implicit class BuildSummaryOps[Self <: BuildSummary] (val x: Self) extends AnyVal {
    
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
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setBuildStatus(value: StatusType): Self = this.set("buildStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildStatus: Self = this.set("buildStatus", js.undefined)
    
    @scala.inline
    def setPrimaryArtifact(value: ResolvedArtifact): Self = this.set("primaryArtifact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrimaryArtifact: Self = this.set("primaryArtifact", js.undefined)
    
    @scala.inline
    def setRequestedOn(value: Timestamp): Self = this.set("requestedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestedOn: Self = this.set("requestedOn", js.undefined)
    
    @scala.inline
    def setSecondaryArtifactsVarargs(value: ResolvedArtifact*): Self = this.set("secondaryArtifacts", js.Array(value :_*))
    
    @scala.inline
    def setSecondaryArtifacts(value: ResolvedSecondaryArtifacts): Self = this.set("secondaryArtifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondaryArtifacts: Self = this.set("secondaryArtifacts", js.undefined)
  }
}
