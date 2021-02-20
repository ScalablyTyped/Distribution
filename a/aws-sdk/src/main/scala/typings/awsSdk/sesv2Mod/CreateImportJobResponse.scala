package typings.awsSdk.sesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateImportJobResponse extends StObject {
  
  /**
    * A string that represents the import job ID.
    */
  var JobId: js.UndefOr[typings.awsSdk.sesv2Mod.JobId] = js.native
}
object CreateImportJobResponse {
  
  @scala.inline
  def apply(): CreateImportJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateImportJobResponse]
  }
  
  @scala.inline
  implicit class CreateImportJobResponseMutableBuilder[Self <: CreateImportJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
  }
}
