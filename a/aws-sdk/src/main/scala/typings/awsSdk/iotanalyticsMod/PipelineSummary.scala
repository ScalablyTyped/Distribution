package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PipelineSummary extends StObject {
  
  /**
    * When the pipeline was created.
    */
  var creationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * When the pipeline was last updated.
    */
  var lastUpdateTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The name of the pipeline.
    */
  var pipelineName: js.UndefOr[PipelineName] = js.native
  
  /**
    * A summary of information about the pipeline reprocessing.
    */
  var reprocessingSummaries: js.UndefOr[ReprocessingSummaries] = js.native
}
object PipelineSummary {
  
  @scala.inline
  def apply(): PipelineSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipelineSummary]
  }
  
  @scala.inline
  implicit class PipelineSummaryMutableBuilder[Self <: PipelineSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    @scala.inline
    def setLastUpdateTime(value: Timestamp): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
    
    @scala.inline
    def setPipelineName(value: PipelineName): Self = StObject.set(x, "pipelineName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineNameUndefined: Self = StObject.set(x, "pipelineName", js.undefined)
    
    @scala.inline
    def setReprocessingSummaries(value: ReprocessingSummaries): Self = StObject.set(x, "reprocessingSummaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReprocessingSummariesUndefined: Self = StObject.set(x, "reprocessingSummaries", js.undefined)
    
    @scala.inline
    def setReprocessingSummariesVarargs(value: ReprocessingSummary*): Self = StObject.set(x, "reprocessingSummaries", js.Array(value :_*))
  }
}
