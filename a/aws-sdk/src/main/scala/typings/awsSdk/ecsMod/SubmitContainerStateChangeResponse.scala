package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubmitContainerStateChangeResponse extends StObject {
  
  /**
    * Acknowledgement of the state change.
    */
  var acknowledgment: js.UndefOr[String] = js.native
}
object SubmitContainerStateChangeResponse {
  
  @scala.inline
  def apply(): SubmitContainerStateChangeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubmitContainerStateChangeResponse]
  }
  
  @scala.inline
  implicit class SubmitContainerStateChangeResponseMutableBuilder[Self <: SubmitContainerStateChangeResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcknowledgment(value: String): Self = StObject.set(x, "acknowledgment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcknowledgmentUndefined: Self = StObject.set(x, "acknowledgment", js.undefined)
  }
}
