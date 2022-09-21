package typings.awsSdk.eventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SageMakerPipelineParameters extends StObject {
  
  /**
    * List of Parameter names and values for SageMaker Model Building Pipeline execution.
    */
  var PipelineParameterList: js.UndefOr[SageMakerPipelineParameterList] = js.undefined
}
object SageMakerPipelineParameters {
  
  inline def apply(): SageMakerPipelineParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SageMakerPipelineParameters]
  }
  
  extension [Self <: SageMakerPipelineParameters](x: Self) {
    
    inline def setPipelineParameterList(value: SageMakerPipelineParameterList): Self = StObject.set(x, "PipelineParameterList", value.asInstanceOf[js.Any])
    
    inline def setPipelineParameterListUndefined: Self = StObject.set(x, "PipelineParameterList", js.undefined)
    
    inline def setPipelineParameterListVarargs(value: SageMakerPipelineParameter*): Self = StObject.set(x, "PipelineParameterList", js.Array(value*))
  }
}
