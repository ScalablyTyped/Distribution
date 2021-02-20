package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StopProjectVersionResponse extends StObject {
  
  /**
    * The current status of the stop operation. 
    */
  var Status: js.UndefOr[ProjectVersionStatus] = js.native
}
object StopProjectVersionResponse {
  
  @scala.inline
  def apply(): StopProjectVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopProjectVersionResponse]
  }
  
  @scala.inline
  implicit class StopProjectVersionResponseMutableBuilder[Self <: StopProjectVersionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: ProjectVersionStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
