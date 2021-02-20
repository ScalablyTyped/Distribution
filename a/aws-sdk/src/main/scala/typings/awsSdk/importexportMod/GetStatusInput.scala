package typings.awsSdk.importexportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetStatusInput extends StObject {
  
  var APIVersion: js.UndefOr[APIVersion_] = js.native
  
  var JobId: typings.awsSdk.importexportMod.JobId = js.native
}
object GetStatusInput {
  
  @scala.inline
  def apply(JobId: JobId): GetStatusInput = {
    val __obj = js.Dynamic.literal(JobId = JobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStatusInput]
  }
  
  @scala.inline
  implicit class GetStatusInputMutableBuilder[Self <: GetStatusInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAPIVersion(value: APIVersion_): Self = StObject.set(x, "APIVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAPIVersionUndefined: Self = StObject.set(x, "APIVersion", js.undefined)
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
  }
}
