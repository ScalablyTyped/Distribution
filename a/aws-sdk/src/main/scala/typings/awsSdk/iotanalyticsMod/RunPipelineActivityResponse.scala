package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunPipelineActivityResponse extends StObject {
  
  /**
    * In case the pipeline activity fails, the log message that is generated.
    */
  var logResult: js.UndefOr[LogResult] = js.undefined
  
  /**
    * The enriched or transformed sample message payloads as base64-encoded strings. (The results of running the pipeline activity on each input sample message payload, encoded in base64.)
    */
  var payloads: js.UndefOr[MessagePayloads] = js.undefined
}
object RunPipelineActivityResponse {
  
  @scala.inline
  def apply(): RunPipelineActivityResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunPipelineActivityResponse]
  }
  
  @scala.inline
  implicit class RunPipelineActivityResponseMutableBuilder[Self <: RunPipelineActivityResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogResult(value: LogResult): Self = StObject.set(x, "logResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogResultUndefined: Self = StObject.set(x, "logResult", js.undefined)
    
    @scala.inline
    def setPayloads(value: MessagePayloads): Self = StObject.set(x, "payloads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayloadsUndefined: Self = StObject.set(x, "payloads", js.undefined)
    
    @scala.inline
    def setPayloadsVarargs(value: MessagePayload*): Self = StObject.set(x, "payloads", js.Array(value :_*))
  }
}
