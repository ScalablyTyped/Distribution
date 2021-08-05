package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PipelineSummary extends StObject {
  
  /**
    * When the pipeline was created.
    */
  var creationTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * When the pipeline was last updated.
    */
  var lastUpdateTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The name of the pipeline.
    */
  var pipelineName: js.UndefOr[PipelineName] = js.undefined
  
  /**
    * A summary of information about the pipeline reprocessing.
    */
  var reprocessingSummaries: js.UndefOr[ReprocessingSummaries] = js.undefined
}
object PipelineSummary {
  
  inline def apply(): PipelineSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipelineSummary]
  }
  
  extension [Self <: PipelineSummary](x: Self) {
    
    inline def setCreationTime(value: Timestamp): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setLastUpdateTime(value: Timestamp): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
    
    inline def setPipelineName(value: PipelineName): Self = StObject.set(x, "pipelineName", value.asInstanceOf[js.Any])
    
    inline def setPipelineNameUndefined: Self = StObject.set(x, "pipelineName", js.undefined)
    
    inline def setReprocessingSummaries(value: ReprocessingSummaries): Self = StObject.set(x, "reprocessingSummaries", value.asInstanceOf[js.Any])
    
    inline def setReprocessingSummariesUndefined: Self = StObject.set(x, "reprocessingSummaries", js.undefined)
    
    inline def setReprocessingSummariesVarargs(value: ReprocessingSummary*): Self = StObject.set(x, "reprocessingSummaries", js.Array(value :_*))
  }
}
