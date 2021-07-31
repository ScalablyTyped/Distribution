package typings.cucumber.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScenarioResult extends StObject {
  
  var duration: Double
  
  var exception: js.UndefOr[Error] = js.undefined
  
  var status: Status
}
object ScenarioResult {
  
  @scala.inline
  def apply(duration: Double, status: Status): ScenarioResult = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScenarioResult]
  }
  
  @scala.inline
  implicit class ScenarioResultMutableBuilder[Self <: ScenarioResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setException(value: Error): Self = StObject.set(x, "exception", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExceptionUndefined: Self = StObject.set(x, "exception", js.undefined)
    
    @scala.inline
    def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
