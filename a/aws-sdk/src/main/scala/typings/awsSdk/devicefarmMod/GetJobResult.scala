package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetJobResult extends StObject {
  
  /**
    * An object that contains information about the requested job.
    */
  var job: js.UndefOr[Job] = js.native
}
object GetJobResult {
  
  @scala.inline
  def apply(): GetJobResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetJobResult]
  }
  
  @scala.inline
  implicit class GetJobResultMutableBuilder[Self <: GetJobResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJob(value: Job): Self = StObject.set(x, "job", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobUndefined: Self = StObject.set(x, "job", js.undefined)
  }
}
