package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CacheHitResult extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the pipeline execution.
    */
  var SourcePipelineExecutionArn: js.UndefOr[PipelineExecutionArn] = js.undefined
}
object CacheHitResult {
  
  inline def apply(): CacheHitResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CacheHitResult]
  }
  
  extension [Self <: CacheHitResult](x: Self) {
    
    inline def setSourcePipelineExecutionArn(value: PipelineExecutionArn): Self = StObject.set(x, "SourcePipelineExecutionArn", value.asInstanceOf[js.Any])
    
    inline def setSourcePipelineExecutionArnUndefined: Self = StObject.set(x, "SourcePipelineExecutionArn", js.undefined)
  }
}
