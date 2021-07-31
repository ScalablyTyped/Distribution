package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateJobResponse extends StObject {
  
  /**
    * Returns the name of the updated job definition.
    */
  var JobName: js.UndefOr[NameString] = js.undefined
}
object UpdateJobResponse {
  
  @scala.inline
  def apply(): UpdateJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateJobResponse]
  }
  
  @scala.inline
  implicit class UpdateJobResponseMutableBuilder[Self <: UpdateJobResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJobName(value: NameString): Self = StObject.set(x, "JobName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobNameUndefined: Self = StObject.set(x, "JobName", js.undefined)
  }
}
