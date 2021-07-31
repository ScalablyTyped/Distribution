package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputDestinationRequest extends StObject {
  
  /**
    * A unique name for the location the RTMP stream is being pushed
  to.
    */
  var StreamName: js.UndefOr[string] = js.undefined
}
object InputDestinationRequest {
  
  @scala.inline
  def apply(): InputDestinationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputDestinationRequest]
  }
  
  @scala.inline
  implicit class InputDestinationRequestMutableBuilder[Self <: InputDestinationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStreamName(value: string): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamNameUndefined: Self = StObject.set(x, "StreamName", js.undefined)
  }
}
