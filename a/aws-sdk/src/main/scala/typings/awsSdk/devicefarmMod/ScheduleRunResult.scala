package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScheduleRunResult extends StObject {
  
  /**
    * Information about the scheduled run.
    */
  var run: js.UndefOr[Run] = js.native
}
object ScheduleRunResult {
  
  @scala.inline
  def apply(): ScheduleRunResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleRunResult]
  }
  
  @scala.inline
  implicit class ScheduleRunResultMutableBuilder[Self <: ScheduleRunResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRun(value: Run): Self = StObject.set(x, "run", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunUndefined: Self = StObject.set(x, "run", js.undefined)
  }
}
