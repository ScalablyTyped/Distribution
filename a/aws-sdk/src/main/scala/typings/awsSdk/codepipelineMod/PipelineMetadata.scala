package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PipelineMetadata extends StObject {
  
  /**
    * The date and time the pipeline was created, in timestamp format.
    */
  var created: js.UndefOr[Timestamp] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the pipeline.
    */
  var pipelineArn: js.UndefOr[PipelineArn] = js.native
  
  /**
    * The date and time the pipeline was last updated, in timestamp format.
    */
  var updated: js.UndefOr[Timestamp] = js.native
}
object PipelineMetadata {
  
  @scala.inline
  def apply(): PipelineMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PipelineMetadata]
  }
  
  @scala.inline
  implicit class PipelineMetadataMutableBuilder[Self <: PipelineMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated(value: Timestamp): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedUndefined: Self = StObject.set(x, "created", js.undefined)
    
    @scala.inline
    def setPipelineArn(value: PipelineArn): Self = StObject.set(x, "pipelineArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineArnUndefined: Self = StObject.set(x, "pipelineArn", js.undefined)
    
    @scala.inline
    def setUpdated(value: Timestamp): Self = StObject.set(x, "updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedUndefined: Self = StObject.set(x, "updated", js.undefined)
  }
}
