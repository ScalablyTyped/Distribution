package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteJobResponse extends StObject {
  
  /**
    * The name of the job definition that was deleted.
    */
  var JobName: js.UndefOr[NameString] = js.native
}
object DeleteJobResponse {
  
  @scala.inline
  def apply(): DeleteJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteJobResponse]
  }
  
  @scala.inline
  implicit class DeleteJobResponseMutableBuilder[Self <: DeleteJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobName(value: NameString): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
  }
}
