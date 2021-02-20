package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdatePipelineOutput extends StObject {
  
  /**
    * The structure of the updated pipeline.
    */
  var pipeline: js.UndefOr[PipelineDeclaration] = js.native
}
object UpdatePipelineOutput {
  
  @scala.inline
  def apply(): UpdatePipelineOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdatePipelineOutput]
  }
  
  @scala.inline
  implicit class UpdatePipelineOutputMutableBuilder[Self <: UpdatePipelineOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPipeline(value: PipelineDeclaration): Self = StObject.set(x, "pipeline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineUndefined: Self = StObject.set(x, "pipeline", js.undefined)
  }
}
