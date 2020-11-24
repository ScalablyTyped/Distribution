package typings.cucumber.mod

import typings.cucumber.mod.pickle.Pickle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HookScenarioResult extends js.Object {
  
  var pickle: Pickle = js.native
  
  var result: ScenarioResult = js.native
  
  var sourceLocation: SourceLocation = js.native
}
object HookScenarioResult {
  
  @scala.inline
  def apply(pickle: Pickle, result: ScenarioResult, sourceLocation: SourceLocation): HookScenarioResult = {
    val __obj = js.Dynamic.literal(pickle = pickle.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], sourceLocation = sourceLocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[HookScenarioResult]
  }
  
  @scala.inline
  implicit class HookScenarioResultOps[Self <: HookScenarioResult] (val x: Self) extends AnyVal {
    
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
    def setPickle(value: Pickle): Self = this.set("pickle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: ScenarioResult): Self = this.set("result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceLocation(value: SourceLocation): Self = this.set("sourceLocation", value.asInstanceOf[js.Any])
  }
}
