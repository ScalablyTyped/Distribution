package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPipelinesOutput extends StObject {
  
  /**
    * If the amount of returned information is significantly large, an identifier is also returned. It can be used in a subsequent list pipelines call to return the next set of pipelines in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The list of pipelines.
    */
  var pipelines: js.UndefOr[PipelineList] = js.undefined
}
object ListPipelinesOutput {
  
  inline def apply(): ListPipelinesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPipelinesOutput]
  }
  
  extension [Self <: ListPipelinesOutput](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setPipelines(value: PipelineList): Self = StObject.set(x, "pipelines", value.asInstanceOf[js.Any])
    
    inline def setPipelinesUndefined: Self = StObject.set(x, "pipelines", js.undefined)
    
    inline def setPipelinesVarargs(value: PipelineSummary*): Self = StObject.set(x, "pipelines", js.Array(value*))
  }
}
