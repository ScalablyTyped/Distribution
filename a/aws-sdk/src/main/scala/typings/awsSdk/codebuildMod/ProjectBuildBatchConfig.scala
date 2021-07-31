package typings.awsSdk.codebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectBuildBatchConfig extends StObject {
  
  /**
    * Specifies if the build artifacts for the batch build should be combined into a single artifact location.
    */
  var combineArtifacts: js.UndefOr[WrapperBoolean] = js.undefined
  
  /**
    * A BatchRestrictions object that specifies the restrictions for the batch build.
    */
  var restrictions: js.UndefOr[BatchRestrictions] = js.undefined
  
  /**
    * Specifies the service role ARN for the batch build project.
    */
  var serviceRole: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Specifies the maximum amount of time, in minutes, that the batch build must be completed in.
    */
  var timeoutInMins: js.UndefOr[WrapperInt] = js.undefined
}
object ProjectBuildBatchConfig {
  
  @scala.inline
  def apply(): ProjectBuildBatchConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectBuildBatchConfig]
  }
  
  @scala.inline
  implicit class ProjectBuildBatchConfigMutableBuilder[Self <: ProjectBuildBatchConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCombineArtifacts(value: WrapperBoolean): Self = StObject.set(x, "combineArtifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCombineArtifactsUndefined: Self = StObject.set(x, "combineArtifacts", js.undefined)
    
    @scala.inline
    def setRestrictions(value: BatchRestrictions): Self = StObject.set(x, "restrictions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestrictionsUndefined: Self = StObject.set(x, "restrictions", js.undefined)
    
    @scala.inline
    def setServiceRole(value: NonEmptyString): Self = StObject.set(x, "serviceRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceRoleUndefined: Self = StObject.set(x, "serviceRole", js.undefined)
    
    @scala.inline
    def setTimeoutInMins(value: WrapperInt): Self = StObject.set(x, "timeoutInMins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutInMinsUndefined: Self = StObject.set(x, "timeoutInMins", js.undefined)
  }
}
