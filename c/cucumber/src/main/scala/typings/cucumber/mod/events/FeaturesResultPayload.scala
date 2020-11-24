package typings.cucumber.mod.events

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FeaturesResultPayload extends EventPayload {
  
  var duration: Double = js.native
  
  var scenarioResults: js.Array[_] = js.native
  
  var stepsResults: js.Array[_] = js.native
  
  var strict: Boolean = js.native
  
  var success: Boolean = js.native
}
object FeaturesResultPayload {
  
  @scala.inline
  def apply(
    duration: Double,
    scenarioResults: js.Array[_],
    stepsResults: js.Array[_],
    strict: Boolean,
    success: Boolean
  ): FeaturesResultPayload = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], scenarioResults = scenarioResults.asInstanceOf[js.Any], stepsResults = stepsResults.asInstanceOf[js.Any], strict = strict.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeaturesResultPayload]
  }
  
  @scala.inline
  implicit class FeaturesResultPayloadOps[Self <: FeaturesResultPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScenarioResultsVarargs(value: js.Any*): Self = this.set("scenarioResults", js.Array(value :_*))
    
    @scala.inline
    def setScenarioResults(value: js.Array[_]): Self = this.set("scenarioResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepsResultsVarargs(value: js.Any*): Self = this.set("stepsResults", js.Array(value :_*))
    
    @scala.inline
    def setStepsResults(value: js.Array[_]): Self = this.set("stepsResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: Boolean): Self = this.set("success", value.asInstanceOf[js.Any])
  }
}
