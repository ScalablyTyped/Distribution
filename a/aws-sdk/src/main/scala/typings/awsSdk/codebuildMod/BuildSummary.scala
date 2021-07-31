package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildSummary extends StObject {
  
  /**
    * The batch build ARN.
    */
  var arn: js.UndefOr[String] = js.undefined
  
  /**
    * The status of the build group.  FAILED  The build group failed.  FAULT  The build group faulted.  IN_PROGRESS  The build group is still in progress.  STOPPED  The build group stopped.  SUCCEEDED  The build group succeeded.  TIMED_OUT  The build group timed out.  
    */
  var buildStatus: js.UndefOr[StatusType] = js.undefined
  
  /**
    * A ResolvedArtifact object that represents the primary build artifacts for the build group.
    */
  var primaryArtifact: js.UndefOr[ResolvedArtifact] = js.undefined
  
  /**
    * When the build was started, expressed in Unix time format.
    */
  var requestedOn: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * An array of ResolvedArtifact objects that represents the secondary build artifacts for the build group.
    */
  var secondaryArtifacts: js.UndefOr[ResolvedSecondaryArtifacts] = js.undefined
}
object BuildSummary {
  
  @scala.inline
  def apply(): BuildSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildSummary]
  }
  
  @scala.inline
  implicit class BuildSummaryMutableBuilder[Self <: BuildSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    @scala.inline
    def setBuildStatus(value: StatusType): Self = StObject.set(x, "buildStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBuildStatusUndefined: Self = StObject.set(x, "buildStatus", js.undefined)
    
    @scala.inline
    def setPrimaryArtifact(value: ResolvedArtifact): Self = StObject.set(x, "primaryArtifact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimaryArtifactUndefined: Self = StObject.set(x, "primaryArtifact", js.undefined)
    
    @scala.inline
    def setRequestedOn(value: Timestamp): Self = StObject.set(x, "requestedOn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedOnUndefined: Self = StObject.set(x, "requestedOn", js.undefined)
    
    @scala.inline
    def setSecondaryArtifacts(value: ResolvedSecondaryArtifacts): Self = StObject.set(x, "secondaryArtifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryArtifactsUndefined: Self = StObject.set(x, "secondaryArtifacts", js.undefined)
    
    @scala.inline
    def setSecondaryArtifactsVarargs(value: ResolvedArtifact*): Self = StObject.set(x, "secondaryArtifacts", js.Array(value :_*))
  }
}
