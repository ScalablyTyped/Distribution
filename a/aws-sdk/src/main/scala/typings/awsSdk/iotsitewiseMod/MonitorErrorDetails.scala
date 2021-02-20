package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MonitorErrorDetails extends StObject {
  
  /**
    * The error code.
    */
  var code: js.UndefOr[MonitorErrorCode] = js.native
  
  /**
    * The error message.
    */
  var message: js.UndefOr[MonitorErrorMessage] = js.native
}
object MonitorErrorDetails {
  
  @scala.inline
  def apply(): MonitorErrorDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonitorErrorDetails]
  }
  
  @scala.inline
  implicit class MonitorErrorDetailsMutableBuilder[Self <: MonitorErrorDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: MonitorErrorCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    @scala.inline
    def setMessage(value: MonitorErrorMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
