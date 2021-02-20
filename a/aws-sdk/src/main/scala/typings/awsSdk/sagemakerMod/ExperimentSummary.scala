package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExperimentSummary extends StObject {
  
  /**
    * When the experiment was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The name of the experiment as displayed. If DisplayName isn't specified, ExperimentName is displayed.
    */
  var DisplayName: js.UndefOr[ExperimentEntityName] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the experiment.
    */
  var ExperimentArn: js.UndefOr[typings.awsSdk.sagemakerMod.ExperimentArn] = js.native
  
  /**
    * The name of the experiment.
    */
  var ExperimentName: js.UndefOr[ExperimentEntityName] = js.native
  
  var ExperimentSource: js.UndefOr[typings.awsSdk.sagemakerMod.ExperimentSource] = js.native
  
  /**
    * When the experiment was last modified.
    */
  var LastModifiedTime: js.UndefOr[Timestamp] = js.native
}
object ExperimentSummary {
  
  @scala.inline
  def apply(): ExperimentSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExperimentSummary]
  }
  
  @scala.inline
  implicit class ExperimentSummaryMutableBuilder[Self <: ExperimentSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setDisplayName(value: ExperimentEntityName): Self = StObject.set(x, "DisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayNameUndefined: Self = StObject.set(x, "DisplayName", js.undefined)
    
    @scala.inline
    def setExperimentArn(value: ExperimentArn): Self = StObject.set(x, "ExperimentArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperimentArnUndefined: Self = StObject.set(x, "ExperimentArn", js.undefined)
    
    @scala.inline
    def setExperimentName(value: ExperimentEntityName): Self = StObject.set(x, "ExperimentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperimentNameUndefined: Self = StObject.set(x, "ExperimentName", js.undefined)
    
    @scala.inline
    def setExperimentSource(value: ExperimentSource): Self = StObject.set(x, "ExperimentSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperimentSourceUndefined: Self = StObject.set(x, "ExperimentSource", js.undefined)
    
    @scala.inline
    def setLastModifiedTime(value: Timestamp): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
  }
}
