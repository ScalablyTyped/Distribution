package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopRunResult extends StObject {
  
  /**
    * The run that was stopped.
    */
  var run: js.UndefOr[Run] = js.undefined
}
object StopRunResult {
  
  @scala.inline
  def apply(): StopRunResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopRunResult]
  }
  
  @scala.inline
  implicit class StopRunResultMutableBuilder[Self <: StopRunResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRun(value: Run): Self = StObject.set(x, "run", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunUndefined: Self = StObject.set(x, "run", js.undefined)
  }
}
