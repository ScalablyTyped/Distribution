package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PipelinePauseStateSettings extends StObject {
  
  /**
    * Pipeline ID to pause ("PIPELINE_0" or "PIPELINE_1").
    */
  var PipelineId: typings.awsSdk.medialiveMod.PipelineId = js.native
}
object PipelinePauseStateSettings {
  
  @scala.inline
  def apply(PipelineId: PipelineId): PipelinePauseStateSettings = {
    val __obj = js.Dynamic.literal(PipelineId = PipelineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PipelinePauseStateSettings]
  }
  
  @scala.inline
  implicit class PipelinePauseStateSettingsMutableBuilder[Self <: PipelinePauseStateSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPipelineId(value: PipelineId): Self = StObject.set(x, "PipelineId", value.asInstanceOf[js.Any])
  }
}
