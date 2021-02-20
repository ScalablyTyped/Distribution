package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopJobResult extends StObject {
  
  /**
    * The job that was stopped.
    */
  var job: js.UndefOr[Job] = js.native
}
object StopJobResult {
  
  @scala.inline
  def apply(): StopJobResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopJobResult]
  }
  
  @scala.inline
  implicit class StopJobResultMutableBuilder[Self <: StopJobResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJob(value: Job): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobUndefined: Self = StObject.set(x, "job", js.undefined)
  }
}
